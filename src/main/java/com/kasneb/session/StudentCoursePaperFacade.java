/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.entity.CpaStudentPaper;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jikara
 */
@Stateless
public class StudentCoursePaperFacade extends AbstractFacade<CpaStudentPaper> {

    @PersistenceContext(unitName = "com.kasneb.core_core_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentCoursePaperFacade() {
        super(CpaStudentPaper.class);
    }

    public List<CpaStudentPaper> findByRegistrationNumber(Integer regNo) {
        TypedQuery<CpaStudentPaper> query = em.createQuery("SELECT s FROM StudentCoursePaper s WHERE s.registration.regNo =:regNo", CpaStudentPaper.class);
        query.setParameter("regNo", regNo);
        return query.getResultList();
    }

}
