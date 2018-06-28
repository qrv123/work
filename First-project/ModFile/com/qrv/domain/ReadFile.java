package com.qrv.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		while(true) {
			Path path = Paths.get("C:\\Users\\qrv\\Desktop\\resource");
			File file = new File ("C:\\Users\\qrv\\Desktop\\resource\\companies_big_data.csv");
			
			String line = "";
			
			List<String[]> list = new ArrayList<>();
			
			//try-with-resource Read File
			try (BufferedReader br = new BufferedReader(new FileReader(file))) {

	            while ((line = br.readLine()) != null) {
	            	
	                String[] row = line.split(",");
	                
	                list.add(row);

	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
			
			//Get name of the company whose country is "VN"
			for (String[]row_temp:list) {
				if(row_temp[4].equals("VN")) {
					System.out.println(row_temp[1]);
				}
			}
			
			//After read file, wait for any change with the file
			
			//Create Watch Service
			WatchService watchService = FileSystems.getDefault().newWatchService();
			
			//Register watchService with the types of events
			WatchKey key = path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE, 
			          StandardWatchEventKinds.ENTRY_DELETE,StandardWatchEventKinds.ENTRY_MODIFY);
			
			try {
				//Get a watch key
				key = watchService.take();
			}
			catch (InterruptedException e) { 
				System.out.println("InterruptionException " + e.getMessage());
			}
		}
	}
}
