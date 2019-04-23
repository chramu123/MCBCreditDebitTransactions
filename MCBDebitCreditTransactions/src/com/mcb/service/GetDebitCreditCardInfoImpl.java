package com.mcb.service;

import javax.jws.WebService;

import com.mcb.beans.GetDebitCreditCardResp;
import com.mcb.beans.OwnerOrHolder;

/**
 * @author Administrator 
 * GetDebitCreditCardInfo serviceImpl class
 */

@WebService(targetNamespace = "http://service.mcb.com/", endpointInterface = "com.mcb.service.GetDebitCreditCardInfo", portName = "GetDebitCreditCardInfoImplPort", serviceName = "GetDebitCreditCardInfoImplService")
public class GetDebitCreditCardInfoImpl implements GetDebitCreditCardInfo {

	public GetDebitCreditCardInfoImpl() {

	}

	@Override
	public GetDebitCreditCardResp getDebitCreditCardInfo(OwnerOrHolder ownerOrHolder, String CardNumber) {
		System.out.println("Started");
		GetDebitCreditCardResp getDebitCreditCardResp = null;

		return getDebitCreditCardResp;
	}

}
