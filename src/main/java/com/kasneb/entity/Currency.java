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
@Table(name="CSCurrency")
public class Currency implements Serializable {
    @Id
    @Column(name="CurrencyCode")
    private String code;
    @Column(name="CurrencyName")
    private String name;
    @Column(name="CurrencySymbol")
    private String symbol;
    @Column(name="DefaultCurrency")
    private Boolean defaultCurrency;

    public Currency() {
    }

    public Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Boolean getDefaultCurrency() {
        return defaultCurrency;
    }

    public void setDefaultCurrency(Boolean defaultCurrency) {
        this.defaultCurrency = defaultCurrency;
    }
    
}
