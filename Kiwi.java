package Exe4_2;

public class Kiwi extends Fruit {


	private String brand;
	private double mass;
    
    public Kiwi(){ 											
      super(); 												
      brand = "";
      mass = 0;
     }
    
    public Kiwi(String n, String b, double m){ 			
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
  	  return super.toString() + 
  			  "\nBrand \t\t= " + brand() + 
  			  "\nMass \t\t= " + mass() + " kg";

  	}
	
}
