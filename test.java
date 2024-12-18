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
    @Test
    public void test_should_return_the_read_content_of_a_file() throws IOException{
        String content = "Chicken On Me";
        file.fileCreation(testFile, content);
        String contentFile = file.readFile(testFile);
        Assert.assertEquals(content, contentFile);
    }

    @Test
    public void test_should_append_to_fileName() throws IOException{
        String content1 = "Where the chicken";
        String content2 = "I ate it already";
        file.fileCreation(testFile, content1);
        file.appendFile(testFile, content2);
        String contentFile = file.readFile(testFile);
        Assert.assertEquals(content1 + content2, contentFile);
    }
}