package ToDo;

import java.util.Date;

public class Teste {
	public static void main(String args[]) {		
		Date x = new Date(2022, 12, 12);
		String n = "Prova";
		Lista l1 = new Lista("Faculdade");
		NovaTarefa t1 = new NovaTarefa("Fazer Trabalho", x);
		Listagem l2 = new Listagem();
		l2.addLista(l1);
		l1.addTarefa(t1);
		
		System.out.println(l1.toString());
	}
}	
