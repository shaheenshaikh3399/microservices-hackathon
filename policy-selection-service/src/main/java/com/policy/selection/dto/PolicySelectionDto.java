package com.policy.selection.dto;

public class PolicySelectionDto {
	String customerId;
	String pid;
	String customerName;
	String policyBenefits;
	String selectedPolicyDuration;
	public PolicySelectionDto() {
		
	}
	public PolicySelectionDto(String customerId, String pid, String customerName, String policyBenefits,
			String selectedPolicyDuration) {
		super();
		this.customerId = customerId;
		this.pid = pid;
		this.customerName = customerName;
		this.policyBenefits = policyBenefits;
		this.selectedPolicyDuration = selectedPolicyDuration;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPolicyBenefits() {
		return policyBenefits;
	}
	public void setPolicyBenefits(String policyBenefits) {
		this.policyBenefits = policyBenefits;
	}
	public String getSelectedPolicyDuration() {
		return selectedPolicyDuration;
	}
	public void setSelectedPolicyDuration(String selectedPolicyDuration) {
		this.selectedPolicyDuration = selectedPolicyDuration;
	}
	
	
}
