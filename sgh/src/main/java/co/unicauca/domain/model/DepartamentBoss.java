package co.unicauca.domain.model;

public class DepartamentBoss {

	private String codDepartamentBoss;
	private String nameDepartamentBoss;
	private String codDepartament;
	public DepartamentBoss(String codDepartamentBoss, String nameDepartamentBoss, String codDepartament) {
		super();
		this.codDepartamentBoss = codDepartamentBoss;
		this.nameDepartamentBoss = nameDepartamentBoss;
		this.codDepartament = codDepartament;
	}
	public String getCodDepartamentBoss() {
		return codDepartamentBoss;
	}
	public void setCodDepartamentBoss(String codDepartamentBoss) {
		this.codDepartamentBoss = codDepartamentBoss;
	}
	public String getNameDepartamentBoss() {
		return nameDepartamentBoss;
	}
	public void setNameDepartamentBoss(String nameDepartamentBoss) {
		this.nameDepartamentBoss = nameDepartamentBoss;
	}
	public String getCodDepartament() {
		return codDepartament;
	}
	public void setCodDepartament(String codDepartament) {
		this.codDepartament = codDepartament;
	}
	
	
}
