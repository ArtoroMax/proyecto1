package co.unicauca.domain.model;

public class Group {
	

	private String codCourse;
	private String codProfessor;
	private String nameGroup;
	
	public Group( String codCourse, String codProfessor, String nameGroup) {
		super();
		this.codCourse = codCourse;
		this.codProfessor = codProfessor;
		this.nameGroup = nameGroup;
	}
	
	public String getCodCourse() {
		return codCourse;
	}
	public void setCodCourse(String codCourse) {
		this.codCourse = codCourse;
	}
	public String getNameGroup() {
		return nameGroup;
	}
	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}
	public String getCodProfessor() {
		return codProfessor;
	}
	public void setCodProfessor(String codProfessor) {
		this.codProfessor = codProfessor;
	}
	
	
	

}
