import java.io.*;


public class file {
    public static void fileCreation(String fileName, String content) throws IOException{
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(content);
        }
    }
}
