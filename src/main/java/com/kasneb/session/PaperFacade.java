/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.dto.Level;
import com.kasneb.dto.Paper;
import com.kasneb.dto.Part;
import com.kasneb.dto.Section;
import com.kasneb.entity.Course;
import com.kasneb.entity.CpaPaper;
import com.kasneb.entity.CsPaper;
import com.kasneb.entity.KamePaper;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author jikara
 */
@Stateless
public class PaperFacade {

    @EJB
    com.kasneb.session.CpaPaperFacade cpaPaperFacade;
    @EJB
    com.kasneb.session.CsPaperFacade csPaperFacade;
    @EJB
    com.kasneb.session.KamePaperFacade kamePaperFacade;

    public List<Paper> getCpaPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers;
    }

    public List<Paper> getCsPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CsPaper csPaper : csPaperFacade.findAll()) {
            Course course = new Course("02");
            Part part = new Part(csPaper.getPart(), course);
            Section section = new Section(csPaper.getSection(), part);
            papers.add(new Paper(csPaper.getCode(), csPaper.getName(), null, part, section, course));
        }
        return papers;
    }

    public List<Paper> getDcmPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers;
    }

    public List<Paper> getDictPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers;
    }

    public List<Paper> getAtdPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getFaqPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getCifaPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getIstPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getCcpPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers;//To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getCmtPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getCictPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers; //To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getIcitPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers;//To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getAtcPapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (CpaPaper cpaPaper : cpaPaperFacade.findAll()) {
            Course course = new Course("01");
            Part part = new Part(cpaPaper.getPart(), course);
            Section section = new Section(cpaPaper.getSection(), part);
            papers.add(new Paper(cpaPaper.getCode(), cpaPaper.getName(), null, part, section, course));
        }
        return papers;//To change body of generated methods, choose Tools | Templates.
    }

    public List<Paper> getKamePapers() {
        List<Paper> papers = new ArrayList<>();
        //get cpa papers
        for (KamePaper kamePaper : kamePaperFacade.findAll()) {
            Course course = new Course("03");
            Level level = new Level(kamePaper.getLevel(), course);
            papers.add(new Paper(kamePaper.getCode(), kamePaper.getName(), level, null, null, course));
        }
        return papers; //To change body of generated methods, choose Tools | Templates.
    }
}
