import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = "java.txt";
        
        try{
            System.out.print("Enter content to write to the file: ");
            String content = scan.nextLine();
            file.fileCreation(fileName, content);
            System.out.println("File has been created.\n");

            String fileContent = file.readFile(fileName);
            System.out.println("File Content: " + fileContent + "\n");

            System.out.print("Enter content to append to the file: ");
            String content2 = scan.nextLine();
            file.appendFile(fileName, content2);
        }
        catch (IOException e){

        }
        finally{
            scan.close();
        }
            
}
}
