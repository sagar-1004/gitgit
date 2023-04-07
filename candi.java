package com.nice.avishkar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.*;
import javafx.util.Pair;
import java.util.Pair;

public class candi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/candidateFile.csv"));
            ArrayList<String[]> lines = new ArrayList<String[]>();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] elements = line.split(",");
                lines.add(elements);
            }
            reader.close();
            
            String[][] csvArray = new String[lines.size()][];
            for (int i = 0; i < lines.size(); i++) {
                csvArray[i] = lines.get(i);
            }
            
//            Map<String, Map<String, Integer>>candy = new HashMap<String, Integer>;
            Map<String, Map<String, Integer>> consti = new HashMap<>();
            Pair<Integer, String> p = new Pair<>();
            Vector<p> vector= new Vector<>();
            // do something with csvArray
            for(int i=1;i<lines.size();i++)
            {
            	Map<String, Integer> candid = new HashMap<>();
            	candid.put(csvArray[i][1], 0);
            	consti.put(csvArray[i][0], candid);
            	
            }
            
            for (Map.Entry<String, Map<String, Integer>> c : consti.entrySet()) {
            	  Map<String, Integer> addMap = c.getValue();

            	  // Iterate InnerMap
            	  for (Map.Entry<String, Integer> addressSet : addMap.entrySet()) {
            	    System.out.println(addressSet.getKey() + " :: " + addressSet.getValue());
            	  }
            	}
            
            
        } catch (Exception e) {
            System.err.format("Exception occurred trying to read '%s'.", "path/to/csv/file.csv");
            e.printStackTrace();
        }

	}

}
