package co.unicauca.domain.model;

public class Faculty {

	private String codFaculty;
	private String nameFaculty;
	public Faculty(String codFaculty, String nameFaculty) {
		super();
		this.codFaculty = codFaculty;
		this.nameFaculty = nameFaculty;
	}
	public String getCodFaculty() {
		return codFaculty;
	}
	public void setCodFaculty(String codFaculty) {
		this.codFaculty = codFaculty;
	}
	public String getNameFaculty() {
		return nameFaculty;
	}
	public void setNameFaculty(String nameFaculty) {
		this.nameFaculty = nameFaculty;
	}
	
	
}
