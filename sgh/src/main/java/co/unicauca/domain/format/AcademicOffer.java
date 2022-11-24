package co.unicauca.domain.format;

public class AcademicOffer {

	private String codFaculty;
	private String codProgram;
	private String period;
	private String semester;
	private String codCourse;
	private String nameCourse;
	private int vacanciesCourse;
	private String group;
	private String hourlyIntensity;
	private String journy;
	private String ambientType;
	private String resource;
	private String nameProfessor;
	private String codProfessor;
	private String codDepartament;
	
	
	public AcademicOffer() {

	}

	public AcademicOffer(String codFaculty, String codProgram, String period, String semester, String codCourse, String nameCourse,
			int vacanciesCourse, String group, String hourlyIntensity, String journy, String ambientType,
			String resource, String nameProfessor, String codProfessor, String codDepartament) {
	
		this.codFaculty = codFaculty;
		this.codProgram = codProgram;
		this.period = period;
		this.semester = semester;
		this.codCourse = codCourse;
		this.nameCourse = nameCourse;
		this.vacanciesCourse = vacanciesCourse;
		this.group = group;
		this.hourlyIntensity = hourlyIntensity;
		this.journy = journy;
		this.ambientType = ambientType;
		this.resource = resource;
		this.nameProfessor = nameProfessor;
		this.codProfessor= codProfessor;
		this.codDepartament= codDepartament;
	}

	public String getCodFaculty() {
		return codFaculty;
	}

	public void setCodFaculty(String codFaculty) {
		this.codFaculty = codFaculty;
	}

	public String getCodProgram() {
		return codProgram;
	}

	public void setCodProgram(String codProgram) {
		this.codProgram = codProgram;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getCodCourse() {
		return codCourse;
	}

	public void setCodCourse(String codCourse) {
		this.codCourse = codCourse;
	}

	public String getNameCourse() {
		return nameCourse;
	}

	public void setNameCourse(String nameCourse) {
		this.nameCourse = nameCourse;
	}

	public int getVacanciesCourse() {
		return vacanciesCourse;
	}

	public void setVacanciesCourse(int vacanciesCourse) {
		this.vacanciesCourse = vacanciesCourse;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getHourlyIntensity() {
		return hourlyIntensity;
	}

	public void setHourlyIntensity(String hourlyIntensity) {
		this.hourlyIntensity = hourlyIntensity;
	}

	public String getJourny() {
		return journy;
	}

	public void setJourny(String journy) {
		this.journy = journy;
	}

	public String getAmbientType() {
		return ambientType;
	}

	public void setAmbientType(String ambientType) {
		this.ambientType = ambientType;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getNameProfessor() {
		return nameProfessor;
	}

	public void setNameProfessor(String nameProfessor) {
		this.nameProfessor = nameProfessor;
	}

	public String getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(String codProfessor) {
		this.codProfessor = codProfessor;
	}

	public String getCodDepartament() {
		return codDepartament;
	}

	public void setCodDepartament(String codDepartament) {
		this.codDepartament = codDepartament;
	}
	

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	@Override
	public String toString() {
		return "AcademicOffer [codFaculty=" + codFaculty + ", codProgram=" + codProgram + ", period=" + period
				+ ", semester=" + semester + ", codCourse=" + codCourse + ", nameCourse=" + nameCourse
				+ ", vacanciesCourse=" + vacanciesCourse + ", group=" + group + ", hourlyIntensity=" + hourlyIntensity
				+ ", journy=" + journy + ", ambientType=" + ambientType + ", resource=" + resource + ", nameProfessor="
				+ nameProfessor + ", codProfessor=" + codProfessor + ", codDepartament=" + codDepartament + "]";
	}



	
	
	
	
	
}
