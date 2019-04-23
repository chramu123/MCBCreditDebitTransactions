/**
 * 
 */
package com.mcb.beans;

/**
 * @author Administrator
 * ShadowAcct bean class for GetCredicardAccountTransactionList Service
 */
public class ShadowAcct {

	/**
	 * 
	 */

	public ShadowAcct() {
		// TODO Auto-generated constructor stub
	}

	private String shadowAccountNum = "12345";
	private String priShadowAccountNum = "2222";
	private String billingCurrency = "rupee";

	/**
	 * @return the shadowAccountNum
	 */
	public String getShadowAccountNum() {
		return shadowAccountNum;
	}

	/**
	 * @param shadowAccountNum
	 *            the shadowAccountNum to set
	 */
	public void setShadowAccountNum(String shadowAccountNum) {
		this.shadowAccountNum = shadowAccountNum;
	}

	/**
	 * @return the priShadowAccountNum
	 */
	public String getPriShadowAccountNum() {
		return priShadowAccountNum;
	}

	/**
	 * @param priShadowAccountNum
	 *            the priShadowAccountNum to set
	 */
	public void setPriShadowAccountNum(String priShadowAccountNum) {
		this.priShadowAccountNum = priShadowAccountNum;
	}

	/**
	 * @return the billingCurrency
	 */
	public String getBillingCurrency() {
		return billingCurrency;
	}

	/**
	 * @param billingCurrency
	 *            the billingCurrency to set
	 */
	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ShadowAcct [shadowAccountNum=" + shadowAccountNum + ", priShadowAccountNum=" + priShadowAccountNum
				+ ", billingCurrency=" + billingCurrency + "]";
	}

}
