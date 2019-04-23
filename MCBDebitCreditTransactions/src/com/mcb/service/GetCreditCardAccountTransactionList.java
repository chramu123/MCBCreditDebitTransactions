/**
 * 
 */
package com.mcb.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.mcb.beans.GetCCAcctTranListResp;

/**
 * @author Administrator 
 * GetCreditCardAccountTransactionList service
 */
@WebService(name = "GetCreditCardAccountTransactionList", targetNamespace = "http://service.mcb.com/")
public interface GetCreditCardAccountTransactionList {

	@WebMethod(operationName = "getCCAcctTranList", action = "urn:GetCCAcctTranList")
	@RequestWrapper(className = "com.mcb.service.jaxws.GetCCAcctTranList", localName = "getCCAcctTranList", targetNamespace = "http://service.mcb.com/")
	@ResponseWrapper(className = "com.mcb.service.jaxws.GetCCAcctTranListResponse", localName = "getCCAcctTranListResponse", targetNamespace = "http://service.mcb.com/")
	@WebResult(name = "return")
	public GetCCAcctTranListResp getCCAcctTranList(@WebParam(name = "shadowAccntNum") String shadowAccntNum,
			@WebParam(name = "statementCycle") String statementCycle, @WebParam(name = "tranStatus") String Tran_Status,
			@WebParam(name = "sortOrder") String sortOrder);

}
