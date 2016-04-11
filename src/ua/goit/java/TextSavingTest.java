package ua.goit.java;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;


/**
 * Created by 7 on 11.04.2016.
 */
public class TextSavingTest {

    @Test
    public void testToTextSaving() throws Exception {
        String enteredText = "Hello World!";
        StringBuilder builder1 = new StringBuilder(enteredText);

        final FileInputStream in = new FileInputStream("Module10_text.txt");
        StringBuilder builder2 = new StringBuilder(in.read());

        Assert.assertEquals(builder1, builder2);
    }
}