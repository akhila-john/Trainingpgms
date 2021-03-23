package assignment;
import java.util.*;




	

	public class Person {
	  String name;
	    int id;
	     
	    Person(String name, int id)
	    {
	         
	        this.name = name;
	        this.id = id;
	    }
	   
	    @Override
	    public boolean equals(Object obj)
	    {
	         
	    if(this == obj)
	            return true;
	         
	 
	        if(obj == null || obj.getClass()!= this.getClass())
	            return false;
	         
	         
	        Person p = (Person) obj;
	         
	       
	        return (p.name.equals(this.name)  && p.id == this.id);
	    }
	     
	    @Override
	public int hashCode()
	    {  
	       
	        return this.id;
	    }
	     
	}
	 

