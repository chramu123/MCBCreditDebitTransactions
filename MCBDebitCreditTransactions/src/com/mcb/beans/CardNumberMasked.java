/**
 * 
 */
package com.mcb.beans;

/**
 * @author Administrator 
 * CardNumberMasked bean class for GetCreditCardTransactionList service
 */
public class CardNumberMasked {

	private String first_6 = "111111";
	private String last_4 = "2222";

	/**
	 * @return the first_6
	 */
	public String getFirst_6() {
		return first_6;
	}

	/**
	 * @param first_6
	 *            the first_6 to set
	 */
	public void setFirst_6(String first_6) {
		this.first_6 = first_6;
	}

	/**
	 * @return the last_4
	 */
	public String getLast_4() {
		return last_4;
	}

	/**
	 * @param last_4
	 *            the last_4 to set
	 */
	public void setLast_4(String last_4) {
		this.last_4 = last_4;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CardNumberMasked [first_6=" + first_6 + ", last_4=" + last_4 + "]";
	}

}
