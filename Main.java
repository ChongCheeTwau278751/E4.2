package Exe4_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a1 = new Apple("Apple", 10, 5);
		System.out.println(a1);
		System.out.println();
	
		Orange o1 = new Orange("Orange","Navel", 0.12);
		System.out.println(o1);
		System.out.println();
		
		Kiwi k1 = new Kiwi("Kiwi","Zespri", 0.10);
		System.out.println(k1);
		System.out.println();
		
		RedApple r1 = new RedApple("Red Apple", 11, 5, 6, 14.06, 0.24, "Fuji");
		System.out.println(r1);
		System.out.println();
		
		GreenApple g1 = new GreenApple("Green Apple", 10, 5, 58, 2.8, 0.15, "Pippin");
		System.out.println(g1);
		System.out.println();
	}

}
