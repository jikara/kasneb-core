/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.dto.CourseType;
import com.kasneb.dto.Paper;
import com.kasneb.entity.Course;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jikara
 */
@Stateless
public class CourseFacade extends AbstractFacade<Course> {

    @PersistenceContext(unitName = "com.kasneb.core_core_war_1.0-SNAPSHOTPU")
    private EntityManager em;
    @EJB
    com.kasneb.session.PaperFacade paperFacade;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CourseFacade() {
        super(Course.class);
    }

    public List<Course> findByCode(Integer code) {
        List<Paper> papers;
        TypedQuery<Course> query = em.createQuery("SELECT c FROM Course c WHERE c.courseTypeCode =:type AND c.id !=:exclude", Course.class);
        query.setParameter("type", code);
        query.setParameter("exclude", "00");
        List<Course> courses = query.getResultList();
        for (Course course : courses) {
            switch (course.getId()) {
                case "01":
                    papers = paperFacade.getCpaPapers();
                    course.setPapers(papers);
                    break;
                case "02":
                    papers = paperFacade.getCsPapers();
                    course.setPapers(papers);
                    break;
                case "03":
                    papers = paperFacade.getKamePapers();
                    course.setPapers(papers);
                    break;
//                case "04":
//                    papers = paperFacade.getAtcPapers();
//                    course.setPapers(papers);
//                    break;
//                case "05":
//                    papers = paperFacade.getIcitPapers();
//                    course.setPapers(papers);
//                    break;
//                case "06":
//                    papers = paperFacade.getCictPapers();
//                    course.setPapers(papers);
//                    break;
//                case "07":
//                    papers = paperFacade.getCmtPapers();
//                    course.setPapers(papers);
//                    break;
//                case "08":
//                    papers = paperFacade.getCcpPapers();
//                    course.setPapers(papers);
//                    break;
//                case "09":
//                    papers = paperFacade.getIstPapers();
//                    course.setPapers(papers);
//                    break;
//                case "10":
//                    papers = paperFacade.getCifaPapers();
//                    course.setPapers(papers);
//                    break;
//                case "11":
//                    papers = paperFacade.getFaqPapers();
//                    course.setPapers(papers);
//                    break;
//                case "12":
//                    papers = paperFacade.getAtdPapers();
//                    course.setPapers(papers);
//                    break;
//                case "13":
//                    papers = paperFacade.getDictPapers();
//                    course.setPapers(papers);
//                    break;
//                case "14":
//                    papers = paperFacade.getDcmPapers();
//                    course.setPapers(papers);
//                    break;
            }
        }
        return courses;
    }

    public List<Course> findCourses() {
        List<Paper> papers;
        TypedQuery<Course> query = em.createQuery("SELECT c FROM Course c WHERE c.id !=:exclude", Course.class);
        query.setParameter("exclude", "00");
        List<Course> courses = query.getResultList();
        for (Course course : courses) {
            switch (course.getId()) {
                case "01":
                    papers = paperFacade.getCpaPapers();
                    course.setPapers(papers);
                    break;
                case "02":
                    papers = paperFacade.getCsPapers();
                    course.setPapers(papers);
                    break;
                case "03":
                    papers = paperFacade.getKamePapers();
                    course.setPapers(papers);
                    break;
                case "04":
                    papers = paperFacade.getAtcPapers();
                    course.setPapers(papers);
                    break;
                case "05":
                    papers = paperFacade.getIcitPapers();
                    course.setPapers(papers);
                    break;
                case "06":
                    papers = paperFacade.getCictPapers();
                    course.setPapers(papers);
                    break;
                case "07":
                    papers = paperFacade.getCmtPapers();
                    course.setPapers(papers);
                    break;
                case "08":
                    papers = paperFacade.getCcpPapers();
                    course.setPapers(papers);
                    break;
                case "09":
                    papers = paperFacade.getIstPapers();
                    course.setPapers(papers);
                    break;
                case "10":
                    papers = paperFacade.getCifaPapers();
                    course.setPapers(papers);
                    break;
                case "11":
                    papers = paperFacade.getFaqPapers();
                    course.setPapers(papers);
                    break;
                case "12":
                    papers = paperFacade.getAtdPapers();
                    course.setPapers(papers);
                    break;
                case "13":
                    papers = paperFacade.getDictPapers();
                    course.setPapers(papers);
                    break;
                case "14":
                    papers = paperFacade.getDcmPapers();
                    course.setPapers(papers);
                    break;
            }
        }
        return courses;
    }

    public List<CourseType> findCourseTypes() {
        TypedQuery<CourseType> query = em.createQuery("SELECT new com.kasneb.dto.CourseType(c.courseTypeCode,'testeet') FROM Course c WHERE c.courseTypeCode IS NOT NULL GROUP BY c.courseTypeCode", CourseType.class);
        return query.getResultList();
    }

}
