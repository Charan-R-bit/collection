package Collection_Map;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ContactMain {

	public static void main(String[] args) {
		
		Map<Long, Contact> contacts = new TreeMap<Long, Contact>(Collections.reverseOrder());
		
		contacts.put(8605880608L, new Contact(8605880608L, "subash",  "subash@mail.com",    Gender.MALE));
		contacts.put(9805880608L, new Contact(9805880608L, "hemanth", "hemanth@mail.com",   Gender.MALE));
		contacts.put(9595880608L, new Contact(9595880608L, "chethan", "chethan@mail.com",   Gender.MALE));
		contacts.put(7115880608L, new Contact(7115880608L, "chandhan", "chandhan@mail.com", Gender.MALE));

		
		//fetching keys
        Iterator<Long> itr = contacts.keySet().iterator(); 
        //printing all fetched keys
        while(itr.hasNext()) {         
            System.out.println("Key:" + itr.next());            
        }
        
        
        //fetching values
        Iterator<Contact> itr1 = contacts.values().iterator(); 
        //printing all fetched values
        while(itr1.hasNext()) 
        {         
            System.out.println("Value: " + itr1.next());            
        }
         
        
        
        //fetching & printing keys & values both
         for(Entry<Long, Contact> c:contacts.entrySet()) {
        	 System.out.println("Key: " + c.getKey() + "\nValue: " + c.getValue());
        	 
         }
        
	}
}
