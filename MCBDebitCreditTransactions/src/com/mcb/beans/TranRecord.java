/**
 * 
 */
package com.mcb.beans;

/**
 * @author Administrator 
 * TranRecord bean class for GetCredicardAccountTransactionList Service
 *         
 */
public class TranRecord {

	private String statementDate;
	private String transactionDate;
	private String processingDate;
	private String microfilmRefNum;
	private CardNumberMasked cardNumberMasked = new CardNumberMasked();
	private Merchant merchant = new Merchant();
	private String transactionCode;
	private String transactionWording;
	private String revarsalFlag;
	private String transactionCurrency;
	private String transactionAmount;
	private String transactionSign;

	/**
	 * @return the statementDate
	 */

	public String getStatementDate() {
		return statementDate;
	}

	/**
	 * @param statementDate
	 *            the statementDate to set
	 */
	public void setStatementDate(String statementDate) {
		this.statementDate = statementDate;
	}

	/**
	 * @return the transactionDate
	 */
	public String getTransactionDate() {
		return transactionDate;
	}

	/**
	 * @param transactionDate
	 *            the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	/**
	 * @return the processingDate
	 */
	public String getProcessingDate() {
		return processingDate;
	}

	/**
	 * @param processingDate
	 *            the processingDate to set
	 */
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}

	/**
	 * @return the microfilmRefNum
	 */
	public String getMicrofilmRefNum() {
		return microfilmRefNum;
	}

	/**
	 * @param microfilmRefNum
	 *            the microfilmRefNum to set
	 */
	public void setMicrofilmRefNum(String microfilmRefNum) {
		this.microfilmRefNum = microfilmRefNum;
	}

	/**
	 * @return the cardNumberMasked
	 */
	public CardNumberMasked getCardNumberMasked() {
		return cardNumberMasked;
	}

	/**
	 * @param cardNumberMasked
	 *            the cardNumberMasked to set
	 */
	public void setCardNumberMasked(CardNumberMasked cardNumberMasked) {
		this.cardNumberMasked = cardNumberMasked;
	}

	/**
	 * @return the merchant
	 */
	public Merchant getMerchant() {
		return merchant;
	}

	/**
	 * @param merchant
	 *            the merchant to set
	 */
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}

	/**
	 * @return the transactionCode
	 */
	public String getTransactionCode() {
		return transactionCode;
	}

	/**
	 * @param transactionCode
	 *            the transactionCode to set
	 */
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	/**
	 * @return the transactionWording
	 */
	public String getTransactionWording() {
		return transactionWording;
	}

	/**
	 * @param transactionWording
	 *            the transactionWording to set
	 */
	public void setTransactionWording(String transactionWording) {
		this.transactionWording = transactionWording;
	}

	/**
	 * @return the revarsalFlag
	 */
	public String getRevarsalFlag() {
		return revarsalFlag;
	}

	/**
	 * @param revarsalFlag
	 *            the revarsalFlag to set
	 */
	public void setRevarsalFlag(String revarsalFlag) {
		this.revarsalFlag = revarsalFlag;
	}

	/**
	 * @return the transactionCurrency
	 */
	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	/**
	 * @param transactionCurrency
	 *            the transactionCurrency to set
	 */
	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	/**
	 * @return the transactionAmount
	 */
	public String getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * @param transactionAmount
	 *            the transactionAmount to set
	 */
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	/**
	 * @return the transactionSign
	 */
	public String getTransactionSign() {
		return transactionSign;
	}

	/**
	 * @param transactionSign
	 *            the transactionSign to set
	 */
	public void setTransactionSign(String transactionSign) {
		this.transactionSign = transactionSign;
	}

	/**
	 * @return the billingAmount
	 */
	public String getBillingAmount() {
		return billingAmount;
	}

	/**
	 * @param billingAmount
	 *            the billingAmount to set
	 */
	public void setBillingAmount(String billingAmount) {
		this.billingAmount = billingAmount;
	}

	private String billingAmount;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TranRecord [statementDate=" + statementDate + ", transactionDate=" + transactionDate
				+ ", processingDate=" + processingDate + ", microfilmRefNum=" + microfilmRefNum + ", cardNumberMasked="
				+ cardNumberMasked + ", merchant=" + merchant + ", transactionCode=" + transactionCode
				+ ", transactionWording=" + transactionWording + ", revarsalFlag=" + revarsalFlag
				+ ", transactionCurrency=" + transactionCurrency + ", transactionAmount=" + transactionAmount
				+ ", transactionSign=" + transactionSign + ", billingAmount=" + billingAmount + "]";
	}

}
