package co.unicauca.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import co.unicauca.domain.format.AcademicOffer;
import co.unicauca.domain.format.Infraestructure;
import co.unicauca.domain.model.AcademicAmbient;
import co.unicauca.domain.model.AcademicPlan;
import co.unicauca.domain.model.Course;
import co.unicauca.domain.model.Departament;
import co.unicauca.domain.model.DepartamentBoss;
import co.unicauca.domain.model.Faculty;
import co.unicauca.domain.model.Group;
import co.unicauca.domain.model.Professor;
import co.unicauca.domain.model.Program;
import co.unicauca.domain.model.Resource;
import co.unicauca.domain.model.Scheduled;

@Repository
public class AcademicOfferDAO {

	private ArrayList<AcademicOffer> offerList = new ArrayList<>();
	private ArrayList<Infraestructure> infraList = new ArrayList<>();
	private Faculty faculty = new Faculty("123", "Facultad de ciencias humanas");
	private ArrayList<AcademicAmbient> academicAmbients = new ArrayList<>();
	private ArrayList<Resource> resources = new ArrayList<>();
	private ArrayList<Departament> departments = new ArrayList<>();
	private ArrayList<Program> programs = new ArrayList<>();
	private ArrayList<AcademicPlan> academicPlans = new ArrayList<>();
	private ArrayList<DepartamentBoss> departmentBosses = new ArrayList<>();
	private ArrayList<Professor> professors = new ArrayList<>();
	private ArrayList<Course> courses = new ArrayList<>();
	private ArrayList<Group> groups = new ArrayList<>();
	private ArrayList<Scheduled> scheduleds = new ArrayList<>();

	public void addOffer(AcademicOffer objAcademicOffer) {
		offerList.add(objAcademicOffer);
		courses.add(new Course(objAcademicOffer.getCodCourse(), objAcademicOffer.getNameCourse(),
				objAcademicOffer.getSemester(), objAcademicOffer.getHourlyIntensity(), objAcademicOffer.getJourny(),
				objAcademicOffer.getCodProgram()));
		professors.add(new Professor(objAcademicOffer.getCodProfessor(), objAcademicOffer.getNameProfessor(),
				objAcademicOffer.getCodDepartament()));
		groups.add(new Group(objAcademicOffer.getCodCourse(), objAcademicOffer.getCodProfessor(),
				objAcademicOffer.getGroup()));

	}

	public void addInfraestructure(Infraestructure objInfraestructure) {
		if (validationInfraestructure(objInfraestructure.getNumber())) {
			infraList.add(objInfraestructure);
			academicAmbients.add(new AcademicAmbient(objInfraestructure.getNumber(), objInfraestructure.getCodFaculty(),
					objInfraestructure.getNumber(),
					objInfraestructure.getUbication(), objInfraestructure.getMaxCapacity(),
					objInfraestructure.getType()));
			for (int i = 0; i < objInfraestructure.getSerial().size(); i++) {
				resources.add(new Resource(objInfraestructure.getSerial().get(i), objInfraestructure.getNumber(),
						objInfraestructure.getNameResource().get(i), objInfraestructure.getDescription()));
			}
		}
	}

	public ArrayList<AcademicOffer> getOffer() {
		return offerList;
	}

	public ArrayList<Professor> getProffesor() {
		return professors;
	}

	public ArrayList<AcademicAmbient> getAcademicAmbients() {
		return academicAmbients;
	}

	public ArrayList<Infraestructure> getInfraestructure() {
		return infraList;
	}

	public ArrayList<Resource> getResources() {
		return resources;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public ArrayList<Group> getGroups() {
		return groups;
	}

	public String getCodAcademicPlan(String cod) {
		for (Program program : programs) {
			if (program.getCodProgram() == cod)
				return program.getCodAcademicPlan();
		}
		return "";
	}

	private Boolean validationInfraestructure(String number) {
		for (Infraestructure infraestructure : infraList) {
			if (infraestructure.getNumber().equals(number))
				return false;
		}
		return true;
	}

}
