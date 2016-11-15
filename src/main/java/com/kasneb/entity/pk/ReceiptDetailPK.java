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
public class ReceiptDetailPK implements Serializable {

    @Column(name = "ReceiptNo", insertable = false, updatable = false)
    private String receiptNumber;
    @Column(name = "Exam", insertable = false, updatable = false)
    private String courseCode;
    @Column(name = "Category", insertable = false, updatable = false)
    private String categoryCode;

    public ReceiptDetailPK() {
    }

    public ReceiptDetailPK(String receiptNumber, String courseCode, String categoryCode) {
        this.receiptNumber = receiptNumber;
        this.courseCode = courseCode;
        this.categoryCode = categoryCode;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
}
