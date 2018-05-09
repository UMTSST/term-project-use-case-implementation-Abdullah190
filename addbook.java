import java.io.IOException;
import java.util.Scanner;
import java.lang.Object;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class addbook {

    public static void main(String []args) throws IOException{
        int i=0;
        boolean flag=false;
       Book f=new Book();
       String Bname,Aname,ISBN,ch;
       Scanner scan = new Scanner(System.in);
        while (!flag) {
            System.out.println("Pls Write Kitaab Name ");
            Bname = scan.next();
            System.out.println(" Pls enter Author Name ");
            Aname = scan.next();
            System.out.println("Pls provide ISBN");
            ISBN = scan.next();


            String filename = "C:\\Users\\M.Abdullah\\Desktop\\Record.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
            // writer.append("|");
            writer.append(Bname);
            writer.append("|");
            writer.append(Aname);
            writer.append("|");
            writer.append(ISBN);

            writer.close();
            System.out.println(" do you want to add another Book");
            ch=scan.next();
            if(flag=true)
            {}

        }






    }


}
