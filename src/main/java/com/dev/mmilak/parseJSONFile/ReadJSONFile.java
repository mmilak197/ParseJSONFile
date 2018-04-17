package com.dev.mmilak.parseJSONFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSONFile {
	
	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\Comarch\\Desktop\\MateuszMilak\\parsed_data.json";
		List<Receipe> receipes = getRecipes(filePath);
		
		for(Receipe receipe : receipes) {
			//System.out.println(receipe.getPhoto());
		}
	}
	
	private static List<Receipe> getRecipes(String filePath) {
		List<Receipe> receipes = new ArrayList<Receipe>();
		
		JSONParser parser = new JSONParser();
		
		try {
			BufferedReader in = new BufferedReader(
					   new InputStreamReader(
			                      new FileInputStream(filePath), "UTF8"));
			Object obj = parser.parse(in);
			
			JSONObject jsonObject = (JSONObject) obj;
			
			JSONArray array = (JSONArray) jsonObject.get("receipes");
			
			for(int i = 0; i < array.size(); i++) {
				JSONObject jsonObject2 = (JSONObject) array.get(i);
				
				Receipe receipe = new Receipe();
				
				receipe.setTitle((String) jsonObject2.get("title"));
				receipe.setProducts((List<String>) jsonObject2.get("products"));
				receipe.setDescriptionReceipe((String) jsonObject2.get("descriptionReceipe"));
				receipe.setCategory((String) jsonObject2.get("category"));
				receipe.setPrice((String) jsonObject2.get("price"));
				receipe.setTime((String) jsonObject2.get("time"));
				receipe.setDifficulty((String) jsonObject2.get("difficulty"));
				
				if(!(jsonObject2.get("photo").equals(""))) {
					receipe.setPhotos((List<String>) jsonObject2.get("photo"));
				}
				
				receipes.add(receipe);	
			}
			
		}catch (Exception e) {
			System.out.println("" + e.getMessage());
		}
		
		return receipes;
	}

}
