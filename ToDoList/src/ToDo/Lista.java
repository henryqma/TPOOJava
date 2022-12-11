package ToDo;

public class Lista {
	
	private String nome;
	private NovaTarefa tarefa;
	private int qtdTarefas;
	
	public Lista(String n) {
		setNome(n);
	}
	public void addTarefa(NovaTarefa t) {
		setTarefa(t);
	}
	public void delTarefa() {
		
	}
	public void editTarefa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public NovaTarefa getTarefa() {
		return tarefa;
	}
	public void setTarefa(NovaTarefa tarefa) {
		this.tarefa = tarefa;
	}
	
	@Override
	public String toString() {
		return "Lista: " + getNome() + " " + getTarefa();
			
	}
}
	