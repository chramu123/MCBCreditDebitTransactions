/**
 * 
 */
package com.mcb.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.persistence.internal.sessions.ArrayRecord;
import org.eclipse.persistence.jpa.JpaEntityManager;
import org.eclipse.persistence.queries.DataReadQuery;
import org.eclipse.persistence.queries.StoredProcedureCall;

import com.mcb.beans.GetCCAcctTranListResp;
import com.mcb.beans.TranRecord;

/**
 * @author Administrator 
 * GetCreditDebitTransaction DaoImpl class
 */
public class CreditDebitTransactionDaoImpl implements CreditDebitTransactionDao {

	/**
	 * 
	 */
	public CreditDebitTransactionDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public GetCCAcctTranListResp getCCAcctTranList(String shadowAccntNum, String statementCycle, String tranStatus,
			String sortOrder) {
		List<TranRecord> transRecordList = new ArrayList<TranRecord>();
		TranRecord tranRecord = new TranRecord();
		GetCCAcctTranListResp getCCAcctTranListResp = new GetCCAcctTranListResp();
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MCBDebitCreditTransactions");
		EntityManager entitymanager = emfactory.createEntityManager();
		StoredProcedureCall call = new StoredProcedureCall();
		call.setProcedureName("getTransactionRecords");
		call.useNamedCursorOutputAsResultSet("data");
		DataReadQuery databaseQuery = new DataReadQuery();
		databaseQuery.setCall(call);
		Query query = ((JpaEntityManager) entitymanager.getDelegate()).createQuery(databaseQuery);
		List transactionRecords = query.getResultList();
		System.out.println("Transactionlist: " + transactionRecords);
		Iterator i = transactionRecords.iterator();
		System.out.println("Before while : " + i.hasNext());
		while (i.hasNext()) {
			ArrayRecord ar = (ArrayRecord) i.next();
			tranRecord.setStatementDate(ar.get("STATEMENTDATE").toString());
			tranRecord.setTransactionDate(ar.get("TRANSACTIONDATE").toString());
			tranRecord.setProcessingDate(ar.get("PROCESSINGDATE").toString());
			tranRecord.setMicrofilmRefNum(ar.get("MICROFILMREFNUM").toString());
			tranRecord.setTransactionCode(ar.get("TRASACTIONCODE").toString());
			tranRecord.setTransactionWording(ar.get("TRANSACTIONWORDING").toString());
			tranRecord.setRevarsalFlag(ar.get("REVARSALFLAG").toString());
			tranRecord.setTransactionCurrency(ar.get("TRASACTIONCURRENCY").toString());
			tranRecord.setTransactionAmount(ar.get("TRANSACTIONAMOUNT").toString());
			tranRecord.setTransactionSign(ar.get("TRANSACTIONSIGN").toString());
			transRecordList.add(tranRecord);

			System.out.println(ar.get("STATEMENTDATE"));

			System.out.println(ar.values());
		}

		getCCAcctTranListResp.setErrorMsg("No error");
		getCCAcctTranListResp.setReturnCode("200");
		getCCAcctTranListResp.setTranStatus("True");
		getCCAcctTranListResp.setTransRecordList(transRecordList);

		System.out.println("Response Object : " + getCCAcctTranListResp);
		return getCCAcctTranListResp;
	}

}
