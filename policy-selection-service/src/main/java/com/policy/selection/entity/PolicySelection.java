package com.policy.selection.entity;

//import org.hibernate.annotations.DialectOverride.GeneratedColumn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SelectedPolicies")
public class PolicySelection {
	@Id
	String customerId;
	String pid;
	String customerName;
	String policyBenefits;
	String selectedPolicyDuration;
	public PolicySelection() {
		
	}
	public PolicySelection(String customerId, String pid, String customerName, String policyBenefits,
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
