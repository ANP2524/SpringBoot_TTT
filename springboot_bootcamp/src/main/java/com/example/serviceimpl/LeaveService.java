package com.example.serviceimpl;

import org.springframework.stereotype.Service;
import com.example.entity.LeaveDetail;
import com.example.repository.LeaveRepository;

@Service
public class LeaveService {

	private LeaveRepository leaveRepository;
	
	 public LeaveDetail[] findByEmployeeId(String employeeId) {
	        LeaveDetail[] leaveList = leaveRepository.findByEmployeeId(employeeId);
	        if (leaveList != null) {
	           return leaveList;
	        }
	        return null;
	    }
}
