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
        }
        catch (IOException e){

        }
            
}
}
