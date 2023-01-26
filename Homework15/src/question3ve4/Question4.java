package question3ve4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Question4 {

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
		
		ListIterator<Integer> Ilist =sayilar.listIterator();
		
		while(Ilist.hasNext()) {
			int i= sayilar.indexOf(Ilist.next())	;	
			
			//System.out.println(i);
			System.out.print(" "+sayilar.get((sayilar.size()-1)-i)+",");
		}
		

	}

}
