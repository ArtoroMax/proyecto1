package co.unicauca.domain.model;

public class AcademicAmbient {

	
	private String codAcademicAmbient;
	private String codFaculty;
	private String number;
	private String ubication;
	private int maxCapacity;
	private String type;
	
	
	public AcademicAmbient(String codAcademicAmbient, String codFaculty, String number, String ubication,
			int maxCapacity, String type) {
		super();
		this.codAcademicAmbient = codAcademicAmbient;
		this.codFaculty = codFaculty;
		this.number = number;
		this.ubication = ubication;
		this.maxCapacity = maxCapacity;
		this.type = type;
	}
	public String getCodAcademicAmbient() {
		return codAcademicAmbient;
	}
	public void setCodAcademicAmbient(String codAcademicAmbient) {
		this.codAcademicAmbient = codAcademicAmbient;
	}
	
	public String getCodFaculty() {
		return codFaculty;
	}
	public void setCodFaculty(String codFaculty) {
		this.codFaculty = codFaculty;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getUbication() {
		return ubication;
	}
	public void setUbication(String ubication) {
		this.ubication = ubication;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	
}
