package Exe4_2;

public class Apple extends Fruit {

	private int price;
	private int quantity;
    
    public Apple(){ 							
      super();
      price = 0; 							
      quantity = 0;
     }
    
    public Apple(String n, int p, int q){ 		
       super(n);  	
       price = p;
       quantity = q;														
       
       setData(n,p,q); 							
     }
    
    public void setData(String n, int p, int q){ 
        if (q >= 0)
             quantity = q;
       else 
             quantity = 0;
    }
     
     public int getPrice(){
  	    return price;
  	}
     
     public int getQuantity(){
   	    return quantity;
   	}
     
     public int total(){
    	    return price*quantity;
    	}

  	public String toString() { 
  	  return super.toString() +
  			  "\nPrice \t\t= RM" + price + 
  			  "\nQuantity \t= " + quantity + 
  			  "\nTotal \t\t= RM" + total();
  	}
}
