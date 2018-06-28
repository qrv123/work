package com.qrv.resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFiles {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:\\Users\\qrv\\Desktop\\Excel.csv");
	
		String line = "";
		
		List<String[]> list = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
			while ((line = br.readLine()) != null) {
            	String[] row = line.split(",");
                list.add(row);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
		
		for (String[]row_temp:list) {
			//get name of company which country is in "VN"
			if(row_temp[4].equals("VN")) {
				System.out.println(row_temp[1]);
			}
		}
	}
}

