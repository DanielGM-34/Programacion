package Recuperacion;

import java.util.List;

public class Tutor {
	private String aula;
	private List<String> horarios;

	public Tutor(String aula, List<String> horarios) {
		super();
		this.aula = aula;
		this.horarios = horarios;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public List<String> getHorarios() {
		return horarios;
	}

	public void setHorarios(List<String> horarios) {
		this.horarios = horarios;
	}

	@Override
	public String toString() {
		return "Tutor [aula=" + aula + ", horarios=" + horarios + "]";
	}
	
	public void agregarDias(String dia) {
		this.getHorarios().add(dia);
	}

}
