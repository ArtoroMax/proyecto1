package co.unicauca.domain.model;

public class Professor {
	
	private String codProfessor;
	private String nameProfessor;
	private String codDepartament;
	
	public Professor(String codProfessor, String nameProfessor, String codDepartament) {
		super();
		this.codProfessor = codProfessor;
		this.nameProfessor = nameProfessor;
		this.codDepartament = codDepartament;
	}

	public String getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(String codProfessor) {
		this.codProfessor = codProfessor;
	}

	public String getNameProfessor() {
		return nameProfessor;
	}

	public void setNameProfessor(String nameProfessor) {
		this.nameProfessor = nameProfessor;
	}

	public String getCodDepartament() {
		return codDepartament;
	}

	public void setCodDepartament(String codDepartament) {
		this.codDepartament = codDepartament;
	}
	
	
	

}
