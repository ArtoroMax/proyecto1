package co.unicauca.domain.model;

public class Departament {

	private String codDepartament;
	private String nameDepartament;
	private String codDepartamentBoss;
	private String codProgram;
	public Departament(String codDepartament, String nameDepartament, String codDepartamentBoss, String codProgram) {
		super();
		this.codDepartament = codDepartament;
		this.nameDepartament = nameDepartament;
		this.codDepartamentBoss = codDepartamentBoss;
		this.codProgram = codProgram;
	}
	public String getCodDepartament() {
		return codDepartament;
	}
	public void setCodDepartament(String codDepartament) {
		this.codDepartament = codDepartament;
	}
	public String getNameDepartament() {
		return nameDepartament;
	}
	public void setNameDepartament(String nameDepartament) {
		this.nameDepartament = nameDepartament;
	}
	public String getCodDepartamentBoss() {
		return codDepartamentBoss;
	}
	public void setCodDepartamentBoss(String codDepartamentBoss) {
		this.codDepartamentBoss = codDepartamentBoss;
	}
	public String getCodProgram() {
		return codProgram;
	}
	public void setCodProgram(String codProgram) {
		this.codProgram = codProgram;
	}
	
	
}
