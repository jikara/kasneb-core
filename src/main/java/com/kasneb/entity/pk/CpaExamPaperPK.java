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
public class CpaExamPaperPK implements Serializable {

    @Column(name = "regno", insertable = false, updatable = false)
    private Integer cpaExamEntry;
    @Column(name = "subcode", insertable = false, updatable = false)
    private String paperCode;

    public Integer getCpaExamEntry() {
        return cpaExamEntry;
    }

    public void setCpaExamEntry(Integer cpaExamEntry) {
        this.cpaExamEntry = cpaExamEntry;
    }

    public String getPaperCode() {
        return paperCode;
    }

    public void setPaperCode(String paperCode) {
        this.paperCode = paperCode;
    }
}
