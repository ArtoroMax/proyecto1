package co.unicauca.domain.model;


public class Scheduled {

	private String codGroup;
	private String academicAmbient;
	private String day;
	private String hour;
	private String period;

	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getCodGroup() {
		return codGroup;
	}
	public void setCodGroup(String codGroup) {
		this.codGroup = codGroup;
	}
	public String getAcademicAmbient() {
		return academicAmbient;
	}
	public void setAcademicAmbient(String academicAmbient) {
		this.academicAmbient = academicAmbient;
	}
	
	
}
