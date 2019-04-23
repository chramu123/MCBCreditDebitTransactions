/**
 * 
 */
package com.mcb.service;

import javax.jws.WebService;

import com.mcb.beans.GetCCAcctTranListResp;
import com.mcb.util.CreditDebitTransactionDao;
import com.mcb.util.CreditDebitTransactionDaoImpl;

/**
 * @author Administrator 
 * GetCreditCardAccountTransactionList ServiceImpl class
 */
@WebService(targetNamespace = "http://service.mcb.com/", endpointInterface = "com.mcb.service.GetCreditCardAccountTransactionList", portName = "GetCreditCardAccountTransactionListImplPort", serviceName = "GetCreditCardAccountTransactionListImplService")
public class GetCreditCardAccountTransactionListImpl implements GetCreditCardAccountTransactionList {

	/**
	 * 
	 */
	public GetCreditCardAccountTransactionListImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GetCCAcctTranListResp getCCAcctTranList(String shadowAccntNum, String statementCycle, String tranStatus,
			String sortOrder) {

		GetCCAcctTranListResp getCCAcctTranListResp = null;
		CreditDebitTransactionDao creditDebitTransactionDao = new CreditDebitTransactionDaoImpl();
		getCCAcctTranListResp = creditDebitTransactionDao.getCCAcctTranList(shadowAccntNum, statementCycle, tranStatus,
				sortOrder);
		return getCCAcctTranListResp;

	}

}
