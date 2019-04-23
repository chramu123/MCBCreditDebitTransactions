package com.mcb.util;

import com.mcb.beans.GetCCAcctTranListResp;


/**
 * @author Administrator 
 * GetCreditDebitTransaction Dao class
 */
public interface CreditDebitTransactionDao {
	
	
	public GetCCAcctTranListResp getCCAcctTranList(String shadowAccntNum, String statementCycle, String tranStatus,
			String sortOrder);
	
	

}
