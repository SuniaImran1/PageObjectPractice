package Java_Practice;
import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONObject;

public class WriteJson {

	public static void main(String[] args)throws Exception {

		// create a JSON object and put the elements

		JSONObject obj = new JSONObject();
		obj.put("name", "Sunia");
		obj.put("Surname", "Imran");

		// create an array list
		JSONArray list = new JSONArray();
		

		JSONObject info = new JSONObject();

		info.put("wheater", "cold");
		info.put("temp", "1 degree");
		obj.put("messages", list);
	
		
try {
	
	
	FileWriter file = new FileWriter("e:\\earth.json");
	file.write(obj.toString());
	file.flush();
	file.close();
	
	
} catch (Exception e) {
	
}System.out.println(obj );

	}
	
}
