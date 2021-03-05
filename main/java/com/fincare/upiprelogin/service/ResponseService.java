package com.fincare.upiprelogin.service;



import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.MapType;

@Service
public class ResponseService {
	
	
	public String getResponse(String response) {
//		
//		String resp="{\"serv\": \"Registration\",\"op\": [ {\"k\": \"Success\",\"v\": \"999\"},{\"k\": \"rDt\",\"v\": \"vb4dwevYMB28UQnE38oGI6nIFwXtdSssD5SRlJfxScsk2Au5dmNoQjDoArCeBDce\"}],\"error\": 0,\"errors\": []}";
//		
//		ObjectMapper mapper = new ObjectMapper();
//		JsonFactory f = new JsonFactory();
//		JsonParser jp = null;
//		try {
//			jp = f.createParser(resp);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		try {
//			while (jp.nextToken() != JsonToken.START_ARRAY) {
//			}
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		MapType mapType = mapper.getTypeFactory().constructMapType(Map.class, String.class, String.class);
//		try {
//			while (jp.nextToken() != JsonToken.END_ARRAY) {
//			    Map<String, String> map = mapper.readValue(jp, mapType);
//			    System.out.println(map);
//			    return map;
//			}
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		return null;
		          
		
	}
	
	

}
