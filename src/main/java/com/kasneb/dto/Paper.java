/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.dto;

import com.kasneb.entity.Course;

/**
 *
 * @author jikara
 */
public class Paper {

    private String code;
    private String name;
    private Level level;
    private Part part;
    private Section section;
    private Course course;

    public Paper(String code, String name, Level level, Part part, Section section, Course course) {
        this.code = code;
        this.name = name;
        this.level = level;
        this.part = part;
        this.section = section;
        this.course = course;
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

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
