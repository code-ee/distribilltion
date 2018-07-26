package cpatterson.projects.solo.distribilltion.app;

import org.json.JSONObject;

import cpatterson.projects.solo.distribilltion.process.BillProcessor;
import cpatterson.projects.solo.distribilltion.util.ArgValidator;
import cpatterson.projects.solo.distribilltion.util.JSONReader;

public class App 
{
	public static final int FILENAME = 0;
	 
    public static void main(String[] args)
    {
    	new ArgValidator().validateArgs(args);
    	JSONObject parameters = new JSONReader(args[FILENAME]).getJSONObject();
    	BillProcessor processor = new BillProcessor(parameters);
    	processor.run();
    }
    
    
}
