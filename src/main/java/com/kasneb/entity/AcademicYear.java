/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "CSYears")
public class AcademicYear implements Serializable {

    @Id
    @Column(name = "YearID")
    private Integer year;
    @Column(name = "MYear")
    private String description;
    @Column(name = "CurrentYear")
    private Boolean currentYear;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(Boolean currentYear) {
        this.currentYear = currentYear;
    }

}
