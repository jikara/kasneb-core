/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jikara
 */
@Path("studentcoursepaper")
public class StudentCoursePaperRest {

    @Context
    private UriInfo context;
    ObjectMapper mapper = new ObjectMapper();
    Object anyResponse = new Object();
    Response.Status httpStatus = Response.Status.INTERNAL_SERVER_ERROR;
    String json;
    @EJB
    com.kasneb.session.StudentCoursePaperFacade studentCoursePaperFacade;

    /**
     * Creates a new instance of StudentcoursePaperRest
     */
    public StudentCoursePaperRest() {
    }

    /**
     * Retrieves representation of an instance of
 com.kasneb.api.StudentCoursePaperRest
     *
     * @return an instance of javax.ws.rs.core.Response
     * @throws com.fasterxml.jackson.core.JsonProcessingException
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentCoursePapers() throws JsonProcessingException {
        try {
            anyResponse = studentCoursePaperFacade.findRange(new int[]{0, 10});
            json = mapper.writeValueAsString(anyResponse);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @GET
    @Path("id")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentCoursePapers(@PathParam("id") Integer regNo) throws JsonProcessingException {
        anyResponse = studentCoursePaperFacade.findByRegistrationNumber(regNo);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }
}
