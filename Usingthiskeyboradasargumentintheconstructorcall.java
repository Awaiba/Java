public class Usingthiskeyboradasargumentintheconstructorcall {
       b obj;
       Usingthiskeyboradasargumentintheconstructorcall(b obj)
        
        {
            this.obj=obj;
            //calling display method of class b
            obj.display();
        }

    }
    class b
    {
        int x= 5;
        //default constructor that construct obj of A
        //with passing this is an argument in the construtor
        @SuppressWarnings("unused")
        b()
        {
            Usingthiskeyboradasargumentintheconstructorcall obj =new Usingthiskeyboradasargumentintheconstructorcall(this);
        }
        void display()
        {
            System.out.println("value of x in class b ="+x);
        }
        @SuppressWarnings("unused")
        public static void main(String[] args) {
            b obj = new b();
        }
    }
    
    


