
package com.mcb.service.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.2.6
 * Mon Apr 15 19:19:36 IST 2019
 * Generated source version: 3.2.6
 */

@XmlRootElement(name = "getDebitCreditCardInfoResponse", namespace = "http://service.mcb.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDebitCreditCardInfoResponse", namespace = "http://service.mcb.com/")

public class GetDebitCreditCardInfoResponse {

    @XmlElement(name = "return")
    private com.mcb.beans.GetDebitCreditCardResp _return;

    public com.mcb.beans.GetDebitCreditCardResp getReturn() {
        return this._return;
    }

    public void setReturn(com.mcb.beans.GetDebitCreditCardResp new_return)  {
        this._return = new_return;
    }

}

