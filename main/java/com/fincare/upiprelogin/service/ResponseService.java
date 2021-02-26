package com.fincare.upiprelogin.service;



import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Service
public class ResponseService {
	
	
	public String getResponse(String response) {
		
		
		ObjectMapper om= new ObjectMapper();
		try {
		JsonNode jn=om.readValue(response,JsonNode.class);
		if(jn.isObject()) {
			ObjectNode on=om.convertValue(om,ObjectNode.class);
			if(on.has("serv")) {
				System.out.println(on.get("serv"));
			}
		}
			
		} catch (JsonMappingException e) {
			
			e.printStackTrace();
		} catch (JsonProcessingException e) {
		
			e.printStackTrace();
		}
		
		          
		return "";
	}
	
	

}
