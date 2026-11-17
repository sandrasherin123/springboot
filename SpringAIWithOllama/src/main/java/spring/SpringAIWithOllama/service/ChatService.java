package spring.SpringAIWithOllama.service;

  

import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.chat.prompt.PromptTemplate;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

import spring.SpringAIWithOllama.entity.InterviewQuestion;

@Service
public class ChatService {

    private final ChatClient chatClient;
    public final ModelTools modelTools;

    public ChatService(ChatClient chatClient,ModelTools modelTools) {
        this.chatClient = chatClient;
        this.modelTools=modelTools;
    }

    public InterviewQuestion askAI(String topic) {
//    	String prompt="""
//    			keep the explanation of 
//    			 %s suitable for a student
//    			 """.formatted(topic);
    	
    	String pr="interview question,answer and its difficulty level of {topic}";
    	PromptTemplate template=new PromptTemplate(pr);
    	Prompt prompt = template.create(Map.of("topic",topic));
    	
        return chatClient
                .prompt(prompt)
                .call()
               .entity(InterviewQuestion.class);  
    }
    
    public String getanswer(String qn) {
//    	String prompt="""
//    			keep the explanation of 
//    			 %s suitable for a student
//    			 """.formatted(topic);
    	
    	String pr="get interview answer by given question";
    
        return chatClient
             .prompt(pr)
             .tools(modelTools)
            
             .call()
             .content();
    }
   
}
