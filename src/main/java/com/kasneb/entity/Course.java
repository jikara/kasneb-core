/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.entity;

import com.kasneb.dto.Paper;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author jikara
 */
@Entity
@Table(name = "CSExams") //All courses
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ExamCode")
    private String id;
    @Column(name = "Examination")
    private String name;
    @Column(name = "type")
    private Integer courseTypeCode;
    @Transient
    private Collection<Paper> papers;

    public Course() {
    }

    public Course(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourseTypeCode() {
        return courseTypeCode;
    }

    public void setCourseTypeCode(Integer courseTypeCode) {
        this.courseTypeCode = courseTypeCode;
    }

    public Collection<Paper> getPapers() {
        return papers;
    }

    public void setPapers(Collection<Paper> papers) {
        this.papers = papers;
    }

    @Override
    public String toString() {
        return "Course{" + "id=" + id + '}';
    }

}
