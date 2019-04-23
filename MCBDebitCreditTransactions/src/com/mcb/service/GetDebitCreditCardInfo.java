package com.mcb.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.mcb.beans.GetDebitCreditCardResp;
import com.mcb.beans.OwnerOrHolder;

/**
 * @author Administrator 
 * GetDebitCreditCardInfo service 
 */
@WebService(name = "GetDebitCreditCardInfo", targetNamespace = "http://service.mcb.com/")
public interface GetDebitCreditCardInfo {

	@WebMethod(operationName = "getDebitCreditCardInfo", action = "urn:GetDebitCreditCardInfo")
	@RequestWrapper(className = "com.mcb.service.jaxws.GetDebitCreditCardInfo", localName = "getDebitCreditCardInfo", targetNamespace = "http://service.mcb.com/")
	@ResponseWrapper(className = "com.mcb.service.jaxws.GetDebitCreditCardInfoResponse", localName = "getDebitCreditCardInfoResponse", targetNamespace = "http://service.mcb.com/")
	@WebResult(name = "return")
	public GetDebitCreditCardResp getDebitCreditCardInfo(@WebParam(name = "arg0") OwnerOrHolder ownerOrHolder, @WebParam(name = "arg1") String CardNumber);

}
