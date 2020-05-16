package com.Kartik.Rest01;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository
{
	List<Alien> list;
	public AlienRepository()
	{	
		list=new ArrayList<Alien>();
		Alien a1=new Alien();
		a1.setId(101);
		a1.setName("Kartik");
		
		Alien a2=new Alien();
		a2.setId(102);
		a2.setName("Stark");
		
		list.add(a1);
		list.add(a2);
	}
	
	public List<Alien> getAliens()
	{
		return list;
	}

	public Alien getAlien(int id) { //If we want to get a particular alien.btw i have not used in resource file
		for(Alien a:list)
		{
			if(a.getId()==id)
			{
				return a;
			}
		}
		return null;
	}

	public void create(Alien a) {
		System.out.println(a);
		list.add(a);
		
	}
}
