package question3ve4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question3 {

	public static void main(String[] args) {

		List<Integer> sayilar = new ArrayList<>();
		
		sayilar.add(2);
		sayilar.add(13);
		sayilar.add(56);
		sayilar.add(23);
		sayilar.add(45);
		sayilar.add(14);
		sayilar.add(40);
		
		System.out.println(sayilar);
		
		Iterator<Integer> Ilist =sayilar.iterator();
		
				
		int a;
		
		  while(Ilist.hasNext()) {
		  
		  a=Ilist.next(); 
		  		  		  
		  if (a<=20 || a>=40) {
		  
		    Ilist.remove();
		  
		  }
		  
		  }
		 
		
		System.out.println("Array in Son hali: "+sayilar);
	}

}
