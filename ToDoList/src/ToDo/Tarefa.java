package ToDo;

import java.util.Date;

public abstract class Tarefa {
	
	private String nome;
	private Date dtLimite;
	private boolean status;
	
	public Tarefa(String n, Date d) {
		setNome(n);
		setData(d);
		setStatus(false);
	}

	public void marcar() {
		this.setStatus(true);
	}
	public void desmarcar() {
		this.setStatus(false);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return dtLimite;
	}
	public void setData(Date dtLimite) {
		this.dtLimite = dtLimite;
	}
	public boolean isStatus() {
		return status;
	}
	public boolean setStatus(boolean status) {
		this.status = status;
		return status;
	}
}
