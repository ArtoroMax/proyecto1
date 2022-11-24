package co.unicauca.domain.model;

public class Program {

	private String codProgram;
	private String nameProgram;
	private String codDepartament;
	private String codAcademicPlan;
	
	public Program(String codProgram, String nameProgram, String codDepartament, String codAcademicPlan) {
		super();
		this.codProgram = codProgram;
		this.nameProgram = nameProgram;
		this.codDepartament = codDepartament;
		this.codAcademicPlan = codAcademicPlan;
	}

	public String getCodProgram() {
		return codProgram;
	}

	public void setCodProgram(String codProgram) {
		this.codProgram = codProgram;
	}

	public String getNameProgram() {
		return nameProgram;
	}

	public void setNameProgram(String nameProgram) {
		this.nameProgram = nameProgram;
	}

	public String getCodDepartament() {
		return codDepartament;
	}

	public void setCodDepartament(String codDepartament) {
		this.codDepartament = codDepartament;
	}

	public String getCodAcademicPlan() {
		return codAcademicPlan;
	}

	public void setCodAcademicPlan(String codAcademicPlan) {
		this.codAcademicPlan = codAcademicPlan;
	}
	
	
	
	
}
