package co.unicauca.domain.model;

public class AcademicPlan {

	private String codAcademicPlan;
	private String codProgram;
	private String period;
	public AcademicPlan(String codAcademicPlan, String codProgram, String period) {
		super();
		this.codAcademicPlan = codAcademicPlan;
		this.codProgram = codProgram;
		this.period = period;
	}
	public String getCodAcademicPlan() {
		return codAcademicPlan;
	}
	public void setCodAcademicPlan(String codAcademicPlan) {
		this.codAcademicPlan = codAcademicPlan;
	}
	public String getCodProgram() {
		return codProgram;
	}
	public void setCodProgram(String codProgram) {
		this.codProgram = codProgram;
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	
	
}
