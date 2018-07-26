package cpatterson.projects.solo.distribilltion.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.json.JSONObject;

public class JSONReader {
	private JSONObject result;
	
	public JSONReader(String filename) {
		this.result = new JSONObject(readFile(filename));
	}
	
	private String readFile(String filename)
	{
	    final StringBuilder contentBuilder = new StringBuilder();
	    try (Stream<String> stream = Files.lines( Paths.get(filename), StandardCharsets.UTF_8)) {
	        stream.forEach(s -> contentBuilder.append(s).append("\n"));
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return contentBuilder.toString();
	}
	
	public JSONObject getJSONObject() {
		return result;
	}
}
