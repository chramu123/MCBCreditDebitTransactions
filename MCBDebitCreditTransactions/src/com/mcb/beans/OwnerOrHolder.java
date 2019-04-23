package com.mcb.beans;

/**
 * @author Administrator
 * OwnerOrHolder bean class for GetDebitCreditCardResp 
 */
public class OwnerOrHolder {

	private String cbCustNo;
	private String filterFor;

	/**
	 * @return the cbCustNo
	 */
	public String getCbCustNo() {
		return cbCustNo;
	}

	/**
	 * @param cbCustNo
	 *            the cbCustNo to set
	 */
	public void setCbCustNo(String cbCustNo) {
		this.cbCustNo = cbCustNo;
	}

	/**
	 * @return the filterFor
	 */
	public String getFilterFor() {
		return filterFor;
	}

	/**
	 * @param filterFor
	 *            the filterFor to set
	 */
	public void setFilterFor(String filterFor) {
		this.filterFor = filterFor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OwnerOrHolder [cbCustNo=" + cbCustNo + ", filterFor=" + filterFor + "]";
	}

}
