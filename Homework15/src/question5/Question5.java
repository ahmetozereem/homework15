package question5;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Ali");
		list.add("Veli");
		list.add("Can");
		list.add("Ayse");
		
		System.out.println("Array elementleri: "+list);
		int arraySize= list.size();
				
		ListIterator<String> Ilist = list.listIterator();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Bir isim giriniz: ");
		String str =scan.nextLine();
		
		String a; 
		  
		while(Ilist.hasNext()) {
		  
		  a=Ilist.next();
		  
		if (a.contains(str)) {
		  
			Ilist.remove(); System.out.println("Bu isim LinkedList'te vardı ve silindi... ");
		  
		  	}
		  
		  }
		  
		if (list.size()==arraySize) {
			  System.out.println("Bu isim LinkedList'te yoktu bu yüzden silinemedi...");
		  }
		  
		  
		  /* 		****  ikinci yöntem *****
		   * 
			 * if (list.contains(str)) {
			 * 
			 * list.remove(str);
			 * System.out.println("Bu isim LinkedList'te vardı ve silindi..."); }
			 * 
			 * else {
			 * System.out.println("Bu isim LinkedList'te yoktu bu yüzden silinemedi..."); }
			 */
		 
		
		System.out.println("Array elementleri: "+list);
		
		scan.close();
		
				
	}
	
	
}
