import java.io.*;

public class FileDetails17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("textfile.txt"));
        String line;
        int wordCount = 0, lineCount = 0, charCount = 0;

        while ((line = reader.readLine()) != null) {
            lineCount++;
            charCount += line.length();
            String[] words = line.split("\\s+");
            wordCount += words.length;
        }

        reader.close();
        System.out.println("Number of lines: " + lineCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}
