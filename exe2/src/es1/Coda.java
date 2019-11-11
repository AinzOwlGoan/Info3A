package es1;
import java.util.*;


public class Coda {
	
	public Coda() {
		
	}
	
	public Stack<Integer> riordina(Stack<Integer> pila){
		
		Stack<Integer> _ret = new Stack<>(); // LIFO 1,2,3,4
		Iterator<Integer> it = pila.iterator();
		Queue<Integer> cod = new LinkedList<>(); // FIFO 4,3,2,1
		
		while(it.hasNext()) {
			
			cod.offer(pila.pop());
			
		}
		
		for(Integer item : cod) {
			
			_ret.push(item);
		}
		
		return _ret;
	}

}
