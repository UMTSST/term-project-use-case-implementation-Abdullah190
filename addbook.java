import java.io.IOException;
import java.util.Scanner;
import java.lang.Object;
        import java.io.Writer;
        import java.io.BufferedWriter;
        import java.io.FileWriter;
public class addbook {

    public static void main(String []args) throws IOException{

        System.out.println("please enter bookname");
        Scanner scan=new Scanner(System.in);
        String Bname=scan.next();
        System.out.println("please enter authorname");
       String Aname=scan.next();
        System.out.println("please enter ISBN");
        String ISBN=scan.next();
String filename= "C:\\Users\\M.Abdullah\\Desktop\\Record.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
       // writer.append("|");
        writer.append(Bname);
        writer.append("|");
        writer.append(Aname);
        writer.append("|");
        writer.append(ISBN);
        writer.close();




    }


}

