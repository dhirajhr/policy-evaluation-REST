package com.policyeval;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;

	@RequestMapping("/policy")
	public List<Policy> getAllPolicy()
	{
		return policyService.getAllPolicy();
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/policy")
	public String evalPolicy(@RequestBody HashMap<String,String> userInput)
	{
		PolicyEvaluator policyEvaluator = new PolicyEvaluator();
		return policyEvaluator.evaluatePolicy(userInput, getAllPolicy());
	}
	
}
