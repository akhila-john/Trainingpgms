package com.services.web;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/student")
public class StudentService {

	 //StudentDao std = new StudentDaoImpl();
	 StudentDaoImpl stddao = new StudentDaoImpl();
	 
	 @GET
	//@Produces(MediaType.APPLICATION_JSON)
	public Response getAllStudents() {
	  // public List<Student> getAllStudents() {
		 List<Student> studentlist =stddao.getAllStudents();
			//return student;
		 return Response.ok("succesfully done").build();
		}
	 
	 @POST
	 @Path("/details")
	 @Consumes(MediaType.APPLICATION_JSON)
	// @Produces(MediaType.APPLICATION_XML)
	 public Response create(Student student) {
	 //public void addStudent(Student student) {
		 System.out.println(student);
	  stddao.addStudent(student);
	  return Response.ok("succesfully created").build();
	 }
	 
	 @PUT
		@Path("/{student_id}")
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
	 public Response updateStudent (@PathParam("student_id") int student_id ,Student student) {
		    student.setStudent_id((int)student_id);
			 stddao.updateStudent(student);
			 return Response.ok("succesfully updated").build();
			
		}
	 
	 @DELETE
		@Path("/{student_id}")
		//@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
	 public Response deleteStudent (@PathParam("student_id") int student_id) {
		     System.out.println("delete worked");
			 stddao.deleteStudent ((int)student_id);
			  return Response.ok("succesfully deleted").build();
		}
}

