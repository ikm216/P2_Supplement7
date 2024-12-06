import java.io.*;


public class file {
    /**
     * Creates a file, writes content to it, and saves the file.
     * 
     * @param fileName Name of the file.
     * @param content Content to write to the file.
     * @throws IOException If an I/O error occurs.
     */
    public static void fileCreation(String fileName, String content) throws IOException{
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(content);
        }
    }
    
}
