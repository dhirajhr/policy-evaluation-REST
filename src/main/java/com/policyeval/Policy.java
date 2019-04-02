package com.policyeval;
import java.util.*;

/*
 * Policy is basically a POJO Class to encapsulate all policy details
 */
public class Policy {
	
	private String policyName;
	private String personName;
	private String worksFor;
	private String needsAccessTo;
	private Map<String,String> requestedTime;
	private String policyAction;
	private String stopProcessing;
	
	public Policy()
	{
		
	}
	
	public Policy(String policyName, String personName, String worksFor, String needsAccessTo,
			Map<String, String> requestedTime, String policyAction, String stopProcessing) {
		
		super();
		this.policyName = policyName;
		this.personName = personName;
		this.worksFor = worksFor;
		this.needsAccessTo = needsAccessTo;
		this.requestedTime = requestedTime;
		this.policyAction = policyAction;
		this.stopProcessing = stopProcessing;
	}



	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getWorksFor() {
		return worksFor;
	}

	public void setWorksFor(String worksFor) {
		this.worksFor = worksFor;
	}

	public String getNeedsAccessTo() {
		return needsAccessTo;
	}

	public void setNeedsAccessTo(String needsAccessTo) {
		this.needsAccessTo = needsAccessTo;
	}

	public Map<String, String> getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(Map<String, String> requestedTime) {
		this.requestedTime = requestedTime;
	}

	public String getPolicyAction() {
		return policyAction;
	}

	public void setPolicyAction(String policyAction) {
		this.policyAction = policyAction;
	}

	public String getStopProcessing() {
		return stopProcessing;
	}

	public void setStopProcessing(String stopProcessing) {
		this.stopProcessing = stopProcessing;
	}
	
	@Override
	public String toString() {
		return "Policy [policyName=" + policyName + ", personName=" + personName + ", worksFor=" + worksFor
				+ ", needsAccessTo=" + needsAccessTo + ", requestedTime=" + requestedTime + ", policyAction="
				+ policyAction + ", stopProcessing=" + stopProcessing + "]";
	}

}
