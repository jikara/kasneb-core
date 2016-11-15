/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.entity.CictExamFee;
import com.kasneb.entity.Currency;
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
public class CictExamFeeFacade extends AbstractFacade<CictExamFee> {

    @PersistenceContext(unitName = "com.kasneb.core_core_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CictExamFeeFacade() {
        super(CictExamFee.class);
    }

    public List<CictExamFee> findCurrent() {
        TypedQuery<CictExamFee> query = em.createQuery("SELECT f FROM CictExamFee f WHERE f.current =:isCurrent", CictExamFee.class);
        query.setParameter("isCurrent", true);
        return query.getResultList();
    }

    public CictExamFee findCurrent(Currency currency, Integer sectionId) {
        TypedQuery<CictExamFee> query = em.createQuery("SELECT f FROM CictExamFee f WHERE f.current =:isCurrent AND f.currency =:currency AND f.sectionId =:sectionId", CictExamFee.class);
        query.setParameter("isCurrent", true);
        query.setParameter("currency", currency);
        query.setParameter("sectionId", sectionId);
        query.setMaxResults(1);
        return query.getSingleResult();
    }

}
