package ua.goit.java;

import java.io.*;

/**
 * Created by 7 on 11.04.2016.
 */
public class TextWritingAndReading {
    public static void toTextSaving(String enteredText, String FileName) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(FileName)));

        for (int i = 0; i < 1; i++){
            out.writeUTF(enteredText);
        }
        out.close();
    }

    public static void toReadingText (FileReader in, StringBuilder builder) {
        try {
            int c;
            while ((c = in.read()) != -1) {

                builder.append((char) c);
            }
        } catch (IOException ex) {

        }
    }
}
