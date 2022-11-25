package co.unicauca.rest;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.unicauca.domain.format.Infraestructure;
import co.unicauca.domain.model.AcademicAmbient;
import co.unicauca.domain.model.Course;
import co.unicauca.domain.model.Group;
import co.unicauca.domain.model.Professor;
import co.unicauca.domain.model.Resource;
import co.unicauca.domain.service.IExtractDataService;
import co.unicauca.exception.BadRequestException;

@RestController
@RequestMapping("/api")
public class ResourceController {

	@Autowired
	private IExtractDataService extractData;

	@PostMapping("/upload/offer")
	public boolean uploadFileOffer(@RequestParam("file") MultipartFile file)
			throws IOException {

		return extractData.extractDataAcademicOffer(file);
	}

	@PostMapping("/upload/infra")
	public ResponseEntity<Object> uploadFileInfra(@RequestParam("file") MultipartFile file)
			throws IOException {

		if (extractData.extractDataInfraestructure(file) == -1) {
			throw new BadRequestException("Archivo vacío");
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@GetMapping("/groups")
	public ArrayList<Group> getGroup() {
		return extractData.getGroups();
	}

	@GetMapping("/courses")
	public ArrayList<Course> getCourse() {
		return extractData.getCourses();
	}

	@GetMapping("/professors")
	public ArrayList<Professor> getProfessor() {
		return extractData.getProffesor();
	}

	@GetMapping("/resources")
	public ArrayList<Resource> getResource() {
		return extractData.getResources();
	}

	@GetMapping("/ambients")
	public ArrayList<AcademicAmbient> getAmbients() {
		return extractData.getAcademicAmbients();
	}

	@GetMapping("/infraestructure")
	public ArrayList<Infraestructure> getInfraestructure() {
		return extractData.getInfraestructure();
	}

}
