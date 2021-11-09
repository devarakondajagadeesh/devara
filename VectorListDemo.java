import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
public class VectorListDemo {
public static void main(String[] args) {
		
		//List l = new List(); //cannot create object for interface class
		
		List<String> vectrList = new Vector<String>();
		vectrList.add("one");
		vectrList.add("two");
		vectrList.add("three");
		vectrList.add("four");
		vectrList.add("five");
		vectrList.add("six");
		/*
		System.out.println("size of arraylist = "+ vectrList.size());
		
		System.out.println(vectrList);
		
		vectrList.add(1,"updated value");
		System.out.println(arryList);
		
		arryList.remove(1);
		arryList.remove("six");
		
		System.out.println(arryList);
		
		System.out.println(arryList.get(2));
		
		System.out.println(arryList.contains("Seven"));
		*/
		/*
		System.out.println(arryList.get(0));
		System.out.println(arryList.get(1));
		System.out.println(arryList.get(2));
		System.out.println(arryList.get(3));
		System.out.println(arryList.get(4));
		System.out.println(arryList.get(5));*/
		/*
		/**** Iterating elements from arraylist using for loops*****/
	   /*
		System.out.println("Iterating elements from ArrayList using loop");
		for(int index=0; index<arryList.size(); index++) {
			System.out.println(arryList.get(index));
			*/
		/*
		/**** Iterating elements from ArrayList using Iterator ****/
	/*
		for(String str : arryList) {
			System.out.println(str);*/
		
			
			/**** Iterating elements from ArrayList using Iterator ****/
			System.out.println("Iterating elements from ArrayList using Iterator");
			Iterator itr = vectrList.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
				
				/*** Iterating elements from ArrayList using ListIterator***/
				System.out.println("Iterating elements from ArrayList using ListIterator");
				ListIterator litr = vectrList.listIterator();
				while(litr.hasNext()) {
					System.out.println(litr.next());	
				}
				
				System.out.println("Iterating elements from ArrayList using ListIterator backward");
				while(litr.hasPrevious()) {
					System.out.println(litr.previous());
					
					
				}
				
			
		}
		
		
		
		}
}
