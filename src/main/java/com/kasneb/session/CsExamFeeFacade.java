/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.entity.CsExamFee;
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
public class CsExamFeeFacade extends AbstractFacade<CsExamFee> {

    @PersistenceContext(unitName = "com.kasneb.core_core_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CsExamFeeFacade() {
        super(CsExamFee.class);
    }

    public List<CsExamFee> findCurrent() {
        TypedQuery<CsExamFee> query = em.createQuery("SELECT f FROM CsExamFee f WHERE f.current =:isCurrent", CsExamFee.class);
        query.setParameter("isCurrent", true);
        return query.getResultList();
    }

    public CsExamFee findCurrent(Currency currency, Integer sectionId) {
        TypedQuery<CsExamFee> query = em.createQuery("SELECT f FROM CsExamFee f WHERE f.current =:isCurrent AND f.currency =:currency AND f.sectionId =:sectionId", CsExamFee.class);
        query.setParameter("isCurrent", true);
        query.setParameter("currency", currency);
        query.setParameter("sectionId", sectionId);
        query.setMaxResults(1);
        return query.getSingleResult();
    }

}
