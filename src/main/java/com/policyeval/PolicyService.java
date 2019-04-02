package com.policyeval;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PolicyService {
	
	PolicyParser policyParser = PolicyParser.getInstance();
	
	List<Policy> getAllPolicy()
	{
		List<Policy> policyList =  policyParser.parse("src/main/resources/static/policy.json");
		return policyList;
	}

}
