package spring.SpringAIWithOllama.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;
@Component
public class ModelTools {
	
	 @Tool(description = "get interview answer by given question")
	    public String getanswerbyquestion(String question) {
	    	return "dfghujik";
	    }

}
