package ua.goit.java;

import org.junit.Assert;
import org.junit.Test;

import java.io.*;


/**
 * Created by 7 on 11.04.2016.
 */
public class TextSavingTest {

    @Test
    public void testToTextWritingAndReading() throws Exception {
        String enteredText = "Hello World!";
        StringBuilder builder2 = new StringBuilder();

        FileReader in = new FileReader("Module10_text.txt");

        TextWritingAndReading.toReadingText(in, builder2);

        System.out.println();
        Assert.assertEquals(enteredText ,builder2);
    }
}