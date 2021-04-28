package Exe4_2;

public class Orange extends Fruit {

	private String brand;
	private double mass;
	    
	    public Orange(){ 										
	      super(); 												
	      brand = "";
	      mass = 0;
	     }
	    
	    public Orange(String n, String b, double m){ 		
	       super(n);  										
	       brand = b;
	       mass = m;
	       
	       setData(n,b,m); 									
	     }
	    
	    public void setData(String n, String b, double m){ 
	        if (m > 0)
	             mass = m;
	       else 
	             mass = 0;
	    }
	  	
	  	public String brand(){
	      return brand;
	    }
	  	
	  	public double mass(){
		   return mass;
		}

	  	public String toString() {									
	  	  return super.toString() +"\nBrand \t\t= " + brand() + "\nMass \t\t= " + mass() + " kg";

	  	}
}
