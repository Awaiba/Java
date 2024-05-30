import java.io.*;
import java.util.Scanner;
public class WritingtoReadingFromFile {
    
    public static void main(String[] args) throws IOException{
        try{
            File f=new File("E:\\student.txt");
            FileOutputStream fos=new FileOutputStream(f);
            @SuppressWarnings("resource")
            DataOutputStream dos =new DataOutputStream(fos);
            int i,n,rollno;
            String name,address,cname;
            @SuppressWarnings("resource")
            Scanner sc=new Scanner(System.in);
            System.out.println("NO of students : ");
            n=sc.nextInt();
            for(i=0;i<n;i++){
                System.out.println("\n Rollno : ");
                rollno =sc.nextInt();
                System.out.println("NAME: ");
                name=sc.next();
                System.out.println("ADDRESS : ");
                address=sc.next();
                System.out.println("College name : ");
                cname=sc.next();
                dos.writeInt(rollno);
                dos.writeUTF(name);
                dos.writeUTF(address);
                dos.writeUTF(cname);
            }
            System.out.println("\nROLLNO\tNAME\tAddress\tCollege Name");
            FileInputStream fis =new FileInputStream(f);
            @SuppressWarnings("resource")
            DataInputStream dis=new DataInputStream(fis);
            for(i=0;i<n;i++){
                rollno=dis.readInt();
                name=dis.readUTF();
                address=dis.readUTF();
                cname=dis.readUTF();
                if(address.compareToIgnoreCase("JHAPA ")==0)
                System.out.println(rollno+"\t"+name+"\t"+address+"\t"+cname);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}