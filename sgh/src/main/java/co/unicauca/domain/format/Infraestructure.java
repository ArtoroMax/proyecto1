package co.unicauca.domain.format;

public class Infraestructure {

	private String codFaculty;
	private String number;
	private String ubication;
	private int maxCapacity;
	private String type;
	private String nameResource;
	private String serial;
	private String description;
	
	public Infraestructure(String codFaculty, String number, String ubication, int maxCapacity, String type, String nameResource,
			String serial, String description) {
		super();
		this.codFaculty= codFaculty;
		this.number = number;
		this.ubication = ubication;
		this.maxCapacity = maxCapacity;
		this.type = type;
		this.nameResource = nameResource;
		this.serial = serial;
		this.description = description;
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

	public String getNameResource() {
		return nameResource;
	}

	public void setNameResource(String nameResource) {
		this.nameResource = nameResource;
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
