package co.unicauca.domain.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.unicauca.domain.format.AcademicOffer;
import co.unicauca.domain.format.Infraestructure;
import co.unicauca.domain.model.AcademicAmbient;
import co.unicauca.domain.model.Course;
import co.unicauca.domain.model.Group;
import co.unicauca.domain.model.Professor;
import co.unicauca.domain.model.Resource;

@Service
public interface IExtractDataService {

	public boolean extractDataAcademicOffer(MultipartFile file) throws IOException;

	public Integer extractDataInfraestructure(MultipartFile mfile) throws IOException;

	public ArrayList<AcademicOffer> getData();

	public ArrayList<Professor> getProffesor();

	public ArrayList<AcademicAmbient> getAcademicAmbients();

	public ArrayList<Resource> getResources();

	public ArrayList<Course> getCourses();

	public ArrayList<Group> getGroups();

	public ArrayList<Infraestructure> getInfraestructure();
}
