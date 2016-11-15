/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.session;

import com.kasneb.entity.Centre;
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
public class CentreFacade extends AbstractFacade<Centre> {

    @PersistenceContext(unitName = "com.kasneb.core_core_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CentreFacade() {
        super(Centre.class);
    }

    public List<Centre> findCentres(String zoneCode) {
        TypedQuery<Centre> query
                = em.createQuery("SELECT c FROM Centre c WHERE c.zone.code =:zoneCode", Centre.class);
        query.setParameter("zoneCode", zoneCode);
        return query.getResultList();
    }

}
