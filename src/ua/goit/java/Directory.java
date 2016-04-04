package ua.goit.java;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by 7 on 24.03.2016.
 */
public class Directory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of shifting for encrypting, <= 26");

        try {
        String inputedShiftOfLetter = scanner.nextLine();
        int shiftOfLetter = Integer.parseInt(inputedShiftOfLetter);

        System.out.println("Enter the text, which should be encrypted/decrypted and be saved in a file:");
        String enteredText = scanner.nextLine();
        StringBuilder builder = new StringBuilder(enteredText);


            if (shiftOfLetter <= 26 && shiftOfLetter > 0) {
                System.out.println();
                System.out.println("Entered Text:\n " + enteredText);
                System.out.println();

                System.out.println();
                System.out.println("Encrypted text:");
                System.out.println();
                StringBuilder encryptedBuilder = Encrypting.encryptedBuilder(shiftOfLetter, builder);
                System.out.println(encryptedBuilder);

                System.out.println();
                System.out.println("Decrypted text:");
                System.out.println();
                StringBuilder decryptedBuilder = Decrypting.decryptedBuilder(shiftOfLetter, builder);
                System.out.println(decryptedBuilder);

                try {
                    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Module10_text.txt")));

                    for (int i = 0; i < 1; i++){
                        out.writeUTF(enteredText);
                    }
                    out.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else{
                System.out.println("Error: number should be less than 25 and more than 0!");
            }
        } catch (NumberFormatException e){
            System.out.println("Error: Number should be digital!");
        }
    }
}




