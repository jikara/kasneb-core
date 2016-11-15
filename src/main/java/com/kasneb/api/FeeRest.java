/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kasneb.entity.Currency;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jikara
 */
@Path("fee")
public class FeeRest {

    @Context
    private UriInfo context;
    ObjectMapper mapper = new ObjectMapper();
    Object anyResponse = new Object();
    Response.Status httpStatus = Response.Status.INTERNAL_SERVER_ERROR;
    String json;
    @EJB
    com.kasneb.session.CpaExamFeeFacade cpaExamFeeFacade;
    @EJB
    com.kasneb.session.CsExamFeeFacade csExamFeeFacade;
    @EJB
    com.kasneb.session.CictExamFeeFacade cictExamFeeFacade;
    @EJB
    com.kasneb.session.RegistrationFeeFacade registrationFeeFacade;

    /**
     * Creates a new instance of FeeRest
     */
    public FeeRest() {
    }

    @GET
    @Path("registration/{courseCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findFees(@PathParam("courseCode") String courseCode, @QueryParam("currency") String currencyCode) throws JsonProcessingException {
        anyResponse = registrationFeeFacade.findLatest(courseCode, currencyCode);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    /**
     * Retrieves representation of an instance of com.kasneb.api.FeeRest
     *
     * @param courseCode
     * @param currencyCode
     * @param sectionId
     * @return an instance of javax.ws.rs.core.Response
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    @GET
    @Path("exam/{courseCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCpaExamFee(@PathParam("courseCode") String courseCode, @QueryParam("currency") String currencyCode, @QueryParam("sectionId") Integer sectionId) throws JsonProcessingException {
        switch (courseCode) {
            case "01":
                anyResponse = cpaExamFeeFacade.findCurrent(new Currency(currencyCode), sectionId);
                break;
            case "02":
                anyResponse = csExamFeeFacade.findCurrent(new Currency(currencyCode), sectionId);
                break;
            case "03":
                anyResponse = cictExamFeeFacade.findCurrent(new Currency(currencyCode), sectionId);
                break;
        }
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    /**
     *
     * @param courseCode
     * @param currencyCode
     * @param sectionId
     * @return @throws JsonProcessingException
     */
    @GET
    @Path("exemption/{courseCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCpaExemptionFee(@PathParam("courseCode") String courseCode, @QueryParam("currency") String currencyCode, @QueryParam("sectionId") Integer sectionId) throws JsonProcessingException {
        switch (courseCode) {
            case "01":
                anyResponse = cpaExamFeeFacade.findCurrent(new Currency(currencyCode), sectionId);
                break;
            case "02":
                anyResponse = csExamFeeFacade.findCurrent(new Currency(currencyCode), sectionId);
                break;
            case "03":
                anyResponse = cictExamFeeFacade.findCurrent(new Currency(currencyCode), sectionId);
                break;
        }
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

}
