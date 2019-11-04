package es1;

public class Test {

	public static void main(String[] args) {
		
		Studente s1 = new Studente();
		Studente s2 = new Studente();
		Studente s3 = new Studente();
		
		String matricola = "11";
		String nome = "Daniele";
		String cognome = "Ravasio";
		String universita = "unibg";
		int eta = 21;
		
		s1.setMatricola(matricola);
		s1.setNome(nome);
		s1.setCognome(cognome);
		s1.setUniversita(universita);
		s1.setEta(eta);
		
		s2.setMatricola(matricola);
		s2.setNome(nome);
		s2.setCognome(cognome);
		s2.setUniversita(universita);
		s2.setEta(eta);
		
		s3.setMatricola("12");
		s3.setNome("Lucio");
		s3.setCognome("ok");
		s3.setUniversita("unibg");
		s3.setEta(11);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
	}

}
