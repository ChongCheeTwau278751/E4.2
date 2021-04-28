package Exe4_2;

public class Fruit {

	private String name;
    
    public Fruit(){ 	
    	name = "";
    }
    
    	public Fruit(String n){ 	
    	name = n;
    	
       setData(n); 
    }
    	
    	public void setData(String n){ 
    	      name = n;
    	   }
    	
    	public String getName(){
    	    return name;
    	}
    	
    	public String toString(){ 
    		return name + 
    			" constructor is invoked" + 
    			"\nFruit \t\t= " + getName();

    	}
}
