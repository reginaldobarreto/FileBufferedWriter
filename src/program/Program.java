package program;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String[] data = new String[]{"January","February","March","April","May","June"};
        String path = "C:\\Temp\\archive.txt";
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            for (String obj:data) {
                bufferedWriter.write(obj);
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
