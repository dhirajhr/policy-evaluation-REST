package com.policyeval;
import java.io.File;
import java.util.List;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;

//Singleton 
/*
 * Takes input JSON file and converts it to a list of Policy objects.
 * 
 */
public class PolicyParser {

	
	private PolicyParser()
	{
		
	}
	private static PolicyParser policyParser = null;
	List<Policy> policyList = null;
	public List<Policy> parse(String inputPath)
	{
		try {
		ObjectMapper mapper = new ObjectMapper();
		policyList = mapper.readValue(new File(inputPath), new TypeReference<List<Policy>>(){});
		return policyList;
		}
		catch(Exception e)
		{
			System.out.println("[Parsing Input]");
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static PolicyParser getInstance() 
	{ 
	        if (policyParser == null) 
	        	policyParser = new PolicyParser(); 
	  
	        return policyParser; 
	} 
	
}
