package com.mcb.model;

import java.io.Serializable;
import javax.persistence.*;

import org.eclipse.persistence.annotations.Direction;
import org.eclipse.persistence.annotations.NamedStoredProcedureQuery;
import org.eclipse.persistence.annotations.StoredProcedureParameter;

/**
 * The persistent class for the TRANSACTIONRECORDS database table.
 * 
 */
@NamedStoredProcedureQuery(name = "getTransactionRecords", procedureName = "getTransactionRecords", parameters = {
		@StoredProcedureParameter(queryParameter = "id", name = "id", direction = Direction.IN, type = Integer.class),
		@StoredProcedureParameter(queryParameter = "sname", name = "sname", direction = Direction.IN, type = String.class),
		@StoredProcedureParameter(queryParameter = "addr", name = "addr", direction = Direction.IN, jdbcTypeName = "ADDRESS_OB") })
@Entity
@Table(name = "TRANSACTIONRECORDS")
@NamedQuery(name = "Transactionrecord.findAll", query = "SELECT t FROM Transactionrecord t")
public class Transactionrecord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String transid;

	private String microfilmrefnum;

	private String processingdate;

	private String revarsalflag;

	private String statementdate;

	private String transactionamount;

	private String transactiondate;

	private String transactionsign;

	private String transactionwording;

	private String trasactioncode;

	private String trasactioncurrency;

	public Transactionrecord() {
	}

	public String getTransid() {
		return this.transid;
	}

	public void setTransid(String transid) {
		this.transid = transid;
	}

	public String getMicrofilmrefnum() {
		return this.microfilmrefnum;
	}

	public void setMicrofilmrefnum(String microfilmrefnum) {
		this.microfilmrefnum = microfilmrefnum;
	}

	public String getProcessingdate() {
		return this.processingdate;
	}

	public void setProcessingdate(String processingdate) {
		this.processingdate = processingdate;
	}

	public String getRevarsalflag() {
		return this.revarsalflag;
	}

	public void setRevarsalflag(String revarsalflag) {
		this.revarsalflag = revarsalflag;
	}

	public String getStatementdate() {
		return this.statementdate;
	}

	public void setStatementdate(String statementdate) {
		this.statementdate = statementdate;
	}

	public String getTransactionamount() {
		return this.transactionamount;
	}

	public void setTransactionamount(String transactionamount) {
		this.transactionamount = transactionamount;
	}

	public String getTransactiondate() {
		return this.transactiondate;
	}

	public void setTransactiondate(String transactiondate) {
		this.transactiondate = transactiondate;
	}

	public String getTransactionsign() {
		return this.transactionsign;
	}

	public void setTransactionsign(String transactionsign) {
		this.transactionsign = transactionsign;
	}

	public String getTransactionwording() {
		return this.transactionwording;
	}

	public void setTransactionwording(String transactionwording) {
		this.transactionwording = transactionwording;
	}

	public String getTrasactioncode() {
		return this.trasactioncode;
	}

	public void setTrasactioncode(String trasactioncode) {
		this.trasactioncode = trasactioncode;
	}

	public String getTrasactioncurrency() {
		return this.trasactioncurrency;
	}

	public void setTrasactioncurrency(String trasactioncurrency) {
		this.trasactioncurrency = trasactioncurrency;
	}

}