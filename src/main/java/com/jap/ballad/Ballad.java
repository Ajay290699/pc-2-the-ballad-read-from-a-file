package com.jap.ballad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ballad {

    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        String fileName = "src/main/resources/ballad.txt";
        System.out.println(ballad.readPoemFromAFile(fileName));
    }

    public String readPoemFromAFile(String fileName) {
        // Write the logic to read from a file
        String response = "";
        int data = 0;
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);
            while ((data = bufferedReader.read()) != -1) {
                char readData = (char) data;
                response = response + readData;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        response = response.replaceAll("\r", "");
        return response;
    }


}
