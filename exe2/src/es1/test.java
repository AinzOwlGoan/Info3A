package es1;

import java.util.Stack;

public class test {

	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<Integer>();
		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		
		System.out.println("Ordine originale: "+pila.toString());
		
		Coda ct = new Coda();
		
		pila = ct.riordina(pila);
		
		System.out.println("Ordine inverso: "+pila.toString());
		
	}

}
