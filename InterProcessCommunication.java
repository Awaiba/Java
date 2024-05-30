class Customer{
    int amount = 10000;
    synchronized void withdraw(int amount)
    {
        System.out.println("Going to withdraw...");
        if(this.amount<amount)
        {
            System.out.println("Less balance waiting for deposit...");
            try
            {
                wait();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        this.amount=this.amount-amount;
        System.out.println("Withdraw complete...");
    }
    synchronized void deposit(int amount)
    {
        System.out.println("Going to deposit..");
        this.amount=this.amount+amount;
        System.out.println("Deposit complete...");
        notify();
    }
}
public class InterProcessCommunication
{
    public static void main(String[] args) {
        final Customer c= new Customer();
        new Thread(() -> {
            c.withdraw(15000);
        }).start();
        new Thread(() -> {
            c.deposit(100000000);
        }).start();
    }
}
