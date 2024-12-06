import java.io.*;

import org.junit.*;

public class test{
    private static final String testFile = "testFile.txt";

    @Test
    public void test_should_return_created_and_written_file() throws IOException{
        String content = "Chicken On Me!";
        file.fileCreation(testFile, content);
        File file = new File(testFile);
        Assert.assertTrue(file.exists());
    }
}