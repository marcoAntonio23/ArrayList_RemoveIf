
package arraylist_removeif;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ArrayList_RemoveIf {
    public static void main(String[] args) {
       List<Person> list = new ArrayList<>();    	
		list.add(new Person(1, "Pedro"));
		list.add(new Person(2, "Jose"));
		list.add(new Person(3, "Nicole"));  
		Consumer<Person> style = (Person p) -> System.out.println("id:"+p.getPid() +", Nombre:"+p.getName());		
		System.out.println("--ANTES DE BORRAR---");
		list.forEach(style);
		int pid = 2;
    	        Predicate<Person> personPredicate = p-> p.getPid() == pid;
	        list.removeIf(personPredicate);
		System.out.println("---DESPUES DE BORRAR---");	    
	        list.forEach(style);
    }
    
}
