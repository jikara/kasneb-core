/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity.pk;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jikara
 */
@Embeddable
public class CpaExamPK implements Serializable {

    @Column(name = "REGNO", insertable = false, updatable = false)
    private Integer registrationNo;
    @Column(name = "SUBJECTCODE", insertable = false, updatable = false)
    private String paperCode;

    public Integer getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(Integer registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(String paperCode) {
        this.paperCode = paperCode;
    }
}
