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
    /**
     * Reads the content of a file and returns it as a string.
     * 
     * @param filename Name of the file to read.
     * @return The content of the file.
     * @throws IOException If an I/O error occurs.
     */
    public static String readFile(String fileName) throws IOException{
        StringBuilder content = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String read;
            while ((read = reader.readLine()) != null){
                content.append(read).append("\n");
            }
        }
        return content.toString().trim();
    }

    public static void appendFile(String fileName, String content) throws IOException{
        try(FileWriter writer = new FileWriter(fileName, true)){
            writer.write(content);
        }
    }

}
