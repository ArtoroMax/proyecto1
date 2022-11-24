package co.unicauca.domain.model;

public class Resource {

	private String serial;
	private String codAcademicAmbient;
	private String nameResource;
	private String description;
	
	public Resource(String serial, String codAcademicAmbient, String nameResource, String description) {
		super();
		this.serial = serial;
		this.codAcademicAmbient = codAcademicAmbient;
		this.nameResource = nameResource;
		this.description = description;
	}
	
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getNameResource() {
		return nameResource;
	}
	public void setNameResource(String nameResource) {
		this.nameResource = nameResource;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCodAcademicAmbient() {
		return codAcademicAmbient;
	}
	public void setCodAcademicAmbient(String codAcademicAmbient) {
		this.codAcademicAmbient = codAcademicAmbient;
	}
	
	
}
