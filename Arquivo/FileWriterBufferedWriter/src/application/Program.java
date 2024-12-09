package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        String[] lines = new String[] {"Good Morning", "Good Afternoon", "Good Night", " "};

        String path = "C:\\Windows\\Temp\\out.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            // Inserindo o "true" o arquivo será complementado, não será feito de novo.
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
