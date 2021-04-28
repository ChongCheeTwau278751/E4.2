package Exe4_2;

public class RedApple extends Apple {

	private int calcium;
	private double carbohydrate;
	private double vitaminE;
	private String type;
    
    public RedApple(){ 							
      super(); 									
      calcium = 0;
      carbohydrate = 0;
      vitaminE = 0;
      type = "";
     }
    
    public RedApple(String n, int p, int q, int ca, double cb, double v, String t){ 		
       super(n,p,q);  							
       calcium = ca;
       carbohydrate = cb;
       vitaminE = v;
       type = t;
       
       setData(n,p,q,ca,cb,v,t); 							
     }
    
    public void setData(String n, int p, int q, int ca, double cb, double v, String t){ 
        if (ca > 0)
             calcium = ca;
       else 
             calcium = 0;
    	}
  	
  	public int calcium(){
    	  return  calcium;
    	}
  	public double carbohydrate(){
    	  return  carbohydrate;
    	}
  	public double vitaminE(){
    	  return  vitaminE;
    	}
  	public String type(){
    	  return  type;
    	}

  	public String toString() { 
  	  return super.toString() + 
  			  "\nCalcium \t= " + calcium + " mg" + 
  			  "\nCarbohydrate \t= " + carbohydrate + " g" +
  			  "\nVitamin E \t= " + vitaminE + " mg" +
  			  "\nType \t\t= " + type;

  	}
}
