package com.policy.selection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.policy.selection.dto.PolicySelectionDto;
import com.policy.selection.service.PolicySelectionService;

@RestController
@RequestMapping("api/policies/select")
public class PolicySelectionController {
	@Autowired
	private PolicySelectionService policySelectionService;
	
	
	@PostMapping
	public ResponseEntity<PolicySelectionDto> saveSelectedPolicies(@RequestBody PolicySelectionDto policySelectionDto){
		return new ResponseEntity<PolicySelectionDto>(policySelectionService.saveSelectedPolicy(policySelectionDto), HttpStatus.ACCEPTED);
	}
	
	

}
