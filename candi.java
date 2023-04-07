package com.nice.avishkar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class candi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String csvFile = "src/main/resources/candidateFile.csv";
        String line = "";
        String csvDelimiter = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvDelimiter);
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
