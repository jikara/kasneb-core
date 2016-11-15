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
@Table(name = "CICSUBS")
public class CictPaper implements Serializable {

    @Id
    @Column(name = "SUBJECTCODE")
    private String code;
    @Column(name = "MLEVEL")
    private Integer level;
    @Column(name = "MPART")
    private Integer part;
    @Column(name = "SUBJECTNAME")
    private String name;
    @Column(name = "PRACTICAL")
    private Boolean practical;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPart() {
        return part;
    }

    public void setPart(Integer part) {
        this.part = part;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPractical() {
        return practical;
    }

    public void setPractical(Boolean practical) {
        this.practical = practical;
    }

}
