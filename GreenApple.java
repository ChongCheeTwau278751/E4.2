package Exe4_2;

public class GreenApple extends Apple {
	
	private int calorie;
	private double fiber;
	private double iron;
	private String type;
    
    public GreenApple(){ 							
      super(); 									
      calorie = 0;
      fiber = 0;
      iron = 0;
      type = "";
     }
    
    public GreenApple(String n, int p, int q, int c, double f, double i, String t){ 		
       super(n,p,q);  							
       calorie = c;
       fiber = f;
       iron = i;
       type = t;
       
       setData(n,p,q,c,f,i,t); 							
     }
    
    public void setData(String n, int p, int q, int c, double f, double i, String t){ 
        if (c > 0)
             calorie = c;
       else 
             calorie = 0;
    }
  	
  	public int calorie(){
    	  return  calorie;
    	}
  	public double fiber(){
    	  return  fiber;
    	}
  	public double iron(){
    	  return  iron;
    	}
  	public String type(){
    	  return  type;
    	}

  	public String toString() { 
  	  return super.toString() + 
  			  "\nCalorie \t= " + calorie + " kcal" +
  			  "\nFiber \t\t= " + fiber + " g" +
  			  "\nIron \t\t= " + iron + " mg" +
  			  "\nType \t\t= " + type;

  	}
}
