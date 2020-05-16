package com.Kartik.Rest01;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alien")
public class AlienResource 
{
	
	AlienRepository repo=new AlienRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public List<Alien> getAliens()
	{
	
		List<Alien> list=repo.getAliens();
		return list;
	}
	
	
	@GET
	@Path("/onealien/{id}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien getAlien(@PathParam("id") int id)
	{
	
		Alien aa=repo.getAlien(id);
		return aa;
	}
	
	
	
	
	
	@POST
	@Path("/create")   // so the req in url will be like /alien/create
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) //Content Negotiation
	public Alien createAlien(Alien a)
	{
		repo.create(a);
		return a;
	}
}
