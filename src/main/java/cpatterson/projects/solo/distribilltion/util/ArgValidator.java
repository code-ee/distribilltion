package cpatterson.projects.solo.distribilltion.util;

public class ArgValidator {
	public ArgValidator() {
	}
	
	public void validateArgs(String[] args) {
    	if (args.length < 1) {
    		System.err.println("You must provide a JSON filename as the first argument.");
    		System.err.println("For example: 'java -jar distribilltion.jar info.json'");
    		System.exit(0);
    	}
    	if (!args[0].endsWith(".json")) {
    		System.err.println("You must supply a json file");
    		System.exit(0);
    	}
    }
}
