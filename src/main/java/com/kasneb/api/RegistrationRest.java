/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kasneb.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.kasneb.entity.CpaPaper;
import com.kasneb.entity.CpaRegistration;
import com.kasneb.entity.CpaStudentPaper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author jikara
 */
@Path("registration")
public class RegistrationRest {

    @Context
    private UriInfo context;
    ObjectMapper mapper = new ObjectMapper();
    Object anyResponse = new Object();
    Response.Status httpStatus = Response.Status.INTERNAL_SERVER_ERROR;
    String json = "{}";
    @EJB
    com.kasneb.session.RegistrationFacade registrationFacade;
    @EJB
    com.kasneb.session.CpaPaperFacade cpaPaperFacade;

    /**
     * Creates a new instance of RegistrationRest
     */
    public RegistrationRest() {
    }

    @GET
    @Path("testdata")
    @Produces(MediaType.APPLICATION_JSON)
    public Response testDate(@PathParam("courseCode") String courseCode, @PathParam("regno") String regno) throws JsonProcessingException {
        try {
            anyResponse = registrationFacade.findRange();
            json = mapper.writeValueAsString(anyResponse);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(RegistrationRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @GET
    @Path("{courseCode}/{regno}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findRegistration(@PathParam("courseCode") String courseCode, @PathParam("regno") String regno) throws JsonProcessingException {
        try {
            switch (courseCode) {
                case "01":
                    anyResponse = registrationFacade.findCpa(regno);
                    break;
                case "02":
                    anyResponse = registrationFacade.findCs(regno);
                    break;
                case "03":
                    anyResponse = registrationFacade.findCict(regno);
                    break;
            }
            json = mapper.writeValueAsString(anyResponse);
        } catch (JsonProcessingException ex) {
            Logger.getLogger(RegistrationRest.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @POST
    @Path("01")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response register(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @POST
    @Path("02")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerCs(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @POST
    @Path("03")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerCict(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @POST
    @Path("04")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerCifa(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @POST
    @Path("05")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerCcp(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    //DIPLOMA
    @POST
    @Path("06")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerAtd(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @POST
    @Path("07")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerDict(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }

    @POST
    @Path("08")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response registerDcm(String jentity) throws JsonProcessingException {
        Gson gson = new Gson();
        CpaRegistration entity = gson.fromJson(jentity, CpaRegistration.class);
        //Set eligible papers
        List<CpaStudentPaper> studentCoursePapers = new ArrayList<>();
        for (CpaPaper paper : cpaPaperFacade.findAll()) {
            studentCoursePapers.add(new CpaStudentPaper(paper, paper.getSection(), paper.getPart(), paper.getStream()));
        }
        entity.setEligiblePapers(studentCoursePapers);
        anyResponse = registrationFacade.create(entity);
        json = mapper.writeValueAsString(anyResponse);
        return Response
                .status(Response.Status.OK)
                .entity(json)
                .build();
    }
}
