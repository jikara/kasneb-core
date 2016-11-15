/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.entity.RegistrationFee;
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
public class RegistrationFeeFacade extends AbstractFacade<RegistrationFee> {

    @PersistenceContext(unitName = "com.kasneb.core_core_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RegistrationFeeFacade() {
        super(RegistrationFee.class);
    }

    public List<RegistrationFee> findLatest(String currencyCode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public RegistrationFee findLatest(String courseCode, String currencyCode) {
        TypedQuery<RegistrationFee> query = em.createQuery("SELECT DISTINCT r from RegistrationFee r WHERE r.course.id =:courseCode AND  r.currency.code =:currencyCode ORDER BY r.lastEdited DESC", RegistrationFee.class);
        query.setParameter("courseCode", courseCode);
        query.setParameter("currencyCode", currencyCode);
        query.setMaxResults(1);
        return query.getSingleResult();
    }

}
