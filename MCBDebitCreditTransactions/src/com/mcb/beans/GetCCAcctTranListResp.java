/**
 * 
 */
package com.mcb.beans;

import java.util.List;

/**
 * @author Administrator
 * Response Object for GetCCAcctTranList Service
 */
public class GetCCAcctTranListResp {

	/**
	 * 
	 */
	public GetCCAcctTranListResp() {
		// TODO Auto-generated constructor stub
	}
	
	private String returnCode="";
	private String errorMsg="";
	private ShadowAcct shadowAcct;
	private String tranStatus="";
	private List<TranRecord> transRecordList;
	/**
	 * @return the returnCode
	 */
	public String getReturnCode() {
		return returnCode;
	}
	/**
	 * @param returnCode the returnCode to set
	 */
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}
	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	/**
	 * @return the shadowAcct
	 */
	public ShadowAcct getShadowAcct() {
		return shadowAcct;
	}
	/**
	 * @param shadowAcct the shadowAcct to set
	 */
	public void setShadowAcct(ShadowAcct shadowAcct) {
		this.shadowAcct = shadowAcct;
	}
	/**
	 * @return the tranStatus
	 */
	public String getTranStatus() {
		return tranStatus;
	}
	/**
	 * @param tranStatus the tranStatus to set
	 */
	public void setTranStatus(String tranStatus) {
		this.tranStatus = tranStatus;
	}
	/**
	 * @return the transRecordList
	 */
	public List<TranRecord> getTransRecordList() {
		return transRecordList;
	}
	/**
	 * @param transRecordList the transRecordList to set
	 */
	public void setTransRecordList(List<TranRecord> transRecordList) {
		this.transRecordList = transRecordList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GetCCAcctTranListResp [returnCode=" + returnCode + ", errorMsg=" + errorMsg + ", shadowAcct="
				+ shadowAcct + ", tranStatus=" + tranStatus + ", transRecordList=" + transRecordList + "]";
	}
	

}
