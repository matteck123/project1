package com.revature.repos;

import com.revature.beans.Approval;

public interface ApprovalRepo {
	void updateApproval(Integer approvalId);
	void addApproval(Integer approvalId);
	
	Approval getApprovalByStatus(Integer statusId);
	Approval getApproval(Integer approvalId);
}
