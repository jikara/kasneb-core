/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.entity.CictRegistration;
import com.kasneb.entity.CpaRegistration;
import com.kasneb.entity.CsRegistration;
import com.kasneb.entity.Stream;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author jikara
 */
@Stateless
public class RegistrationFacade {

    @PersistenceContext(unitName = "com.kasneb.core_core_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public Object create(Object entity) {
        em.persist(entity);
        return entity;
    }

    public CpaRegistration findCpa(String regNo) {
        TypedQuery<CpaRegistration> query = em.createQuery("SELECT r FROM CpaRegistration r WHERE r.regNo =:regNo AND r.stream =:stream", CpaRegistration.class);
        query.setParameter("regNo", regNo);
        query.setParameter("stream", Stream.AC);
        query.setMaxResults(1);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public CsRegistration findCs(String regNo) {
        TypedQuery<CsRegistration> query = em.createQuery("SELECT r FROM CsRegistration r WHERE r.regNo =:regNo AND r.stream =:stream", CsRegistration.class);
        query.setParameter("regNo", regNo);
        query.setParameter("stream", Stream.SC);
        query.setMaxResults(1);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public CictRegistration findCict(String regNo) {
        TypedQuery<CictRegistration> query = em.createQuery("SELECT r FROM CictRegistration r WHERE r.regNo =:regNo", CictRegistration.class);
        query.setParameter("regNo", regNo);
        query.setMaxResults(1);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    public Object findCifa(String regno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object findCcp(String regno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object findAtd(String regno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object findDict(String regno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object findDcm(String regno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<CpaRegistration> findRange() {
        TypedQuery<CpaRegistration> query = em.createQuery("SELECT r FROM CpaRegistration r ORDER BY r.registered DESC", CpaRegistration.class);
        query.setMaxResults(20);
        return query.getResultList();
    }
}
