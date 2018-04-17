package com.dev.mmilak.parseJSONFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONFile {
	
	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		
		try {
			BufferedReader in = new BufferedReader(
					   new InputStreamReader(
			                      new FileInputStream("C:\\Users\\Comarch\\Desktop\\MateuszMilak\\parsed_data.json"), "UTF8"));
			Object obj = parser.parse(in);
			
			JSONObject jsonObject = (JSONObject) obj;
			
			JSONArray array = (JSONArray) jsonObject.get("receipes");
			
			for(int i = 0; i < array.size(); i++) {
				JSONObject jsonObject2 = (JSONObject) array.get(i);
				
				String title = (String) jsonObject2.get("title");
				System.out.println(title);
			}
			
			
			
		}catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
	}

}
