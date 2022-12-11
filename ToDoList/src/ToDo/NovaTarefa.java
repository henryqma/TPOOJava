package ToDo;

import java.util.Date;

public class NovaTarefa extends Tarefa {

	public NovaTarefa(String n, Date d) {
		super(n, d);
	}
	@Override
	public String toString() {
		return "Tarefas pendentes: " + super.getNome() + " (Prazo final: " + super.getData() 
		+ ")";	
		
	}
	
}

