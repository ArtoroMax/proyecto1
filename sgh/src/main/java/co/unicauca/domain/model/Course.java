package co.unicauca.domain.model;

public class Course {

	private String codCourse;
	private String nameCourse;
	private String semester;
	private String intensity;
	private String journey;
	private String codAcademicPlan;
	public Course(String codCourse, String nameCourse, String semester, String intensity, String journey,
			String codAcademicPlan) {
		super();
		this.codCourse = codCourse;
		this.nameCourse = nameCourse;
		this.semester = semester;
		this.intensity = intensity;
		this.journey = journey;
		this.codAcademicPlan = codAcademicPlan;
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
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getIntensity() {
		return intensity;
	}
	public void setIntensity(String intensity) {
		this.intensity = intensity;
	}
	public String getJourney() {
		return journey;
	}
	public void setJourney(String journey) {
		this.journey = journey;
	}
	public String getCodAcademicPlan() {
		return codAcademicPlan;
	}
	public void setCodAcademicPlan(String codAcademicPlan) {
		this.codAcademicPlan = codAcademicPlan;
	}
	
	
}
