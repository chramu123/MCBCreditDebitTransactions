package com.mcb.beans;

import java.util.List;

/**
 * Response Object for GetDebitCreditCard service
 * @author Administrator
 *
 */
public class GetDebitCreditCardResp {
	private String errorMsg;
	private String returnCode;
	private List<CardProdListItem> cardProdList;

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg
	 * the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the returnCode
	 */
	public String getReturnCode() {
		return returnCode;
	}

	/**
	 * @param returnCode
	 * the returnCode to set
	 */
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public List<CardProdListItem> getCardProdList() {
		return cardProdList;
	}

	public void setCardProdList(List<CardProdListItem> cardProdList) {
		this.cardProdList = cardProdList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetDebitCreditCardResp [errorMsg=" + errorMsg + ", returnCode=" + returnCode + ", cardProdList="
				+ cardProdList + "]";
	}

	/**
	 * @return the cardProdList
	 */
	

}