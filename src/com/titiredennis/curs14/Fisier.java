package com.titiredennis.curs14;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fisier {
    public static void main(String[] args) {
        try {
            File fisierulMeu = new File("filename.txt");
            boolean isFileCreated = fisierulMeu.createNewFile();
            if (isFileCreated) {
                System.out.println("File created: " + fisierulMeu.getName());
            } else {
                System.out.println("File already exists.");
            }
/*

        Stream-uri

        Output Stream-ului
        "Files in Java might be tricky, but it is fun enough!" --> OutputStream --> se scrie undeva (in fisier)

        Input Stream
        se ia din fisier (sau de undeva) --> InputStream --> "Files in Java might be tricky, but it is fun enough!"

*/
            FileWriter fileWriter = new FileWriter("filename.txt");
            fileWriter.write("File in Java might be tricky, but is fun enough!\n");
            fileWriter.write("File in Java might be tricky, but is fun enough!\n");
            fileWriter.write("File in Java might be tricky, but is fun enough!");
            fileWriter.close();

            File acelasiFisier = new File("filename.txt");
            Scanner myReader = new Scanner(acelasiFisier);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }

        } catch (IOException e) {
            System.out.println("An error ocurred.");
            e.printStackTrace();
        }
    }
}
