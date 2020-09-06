package com.company;
import java.io.File;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {


        int count = 0;
        String info;

        File file = new File(".idea/resources/File");

        Scanner myReader = new Scanner(file);
        while (myReader.hasNextLine()) {
            info = myReader.nextLine();
            System.out.println(info);
            count++;
        }
            System.out.println("Der er " + count + " linjer i filen");


            FileWriter fStream = new FileWriter(file, true);


            fStream.write("\nLinje " + (count+=1));
            fStream.close();


            Scanner myReader1 = new Scanner(file);
            int count1 = 0;

            while (myReader1.hasNextLine()) {
                info = myReader1.nextLine();
                System.out.println(info);
                count1++;
            }

            System.out.println("Der er nu " + count1 + " linjer i filen");












            /*
            try {
                FileWriter myWriter = new FileWriter(".idea/resources/File");
                myWriter.write("Ny linje er tilføjet");
                myWriter.close();

            } catch (IOException e) {
                System.out.println("File not found");
            }

            myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                info = myReader.nextLine();
                System.out.println(info);
                count++;

            }
            System.out.println("Der er NU " + count + " linjer i filen");*/

    }
}