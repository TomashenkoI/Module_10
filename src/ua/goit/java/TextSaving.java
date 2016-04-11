package ua.goit.java;

import java.io.*;

/**
 * Created by 7 on 11.04.2016.
 */
public class TextSaving {
    public static String toTextSaving(String enteredText, String FileName) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(FileName)));

        for (int i = 0; i < 1; i++){
            out.writeUTF(enteredText);
        }
        out.close();
        return null;
    }
}
