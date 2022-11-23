package co.unicauca.rest;



import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.unicauca.domain.model.AcademicOffer;
import co.unicauca.domain.service.IExtractDataService;

@RestController
@RequestMapping("/api")
public class ResourceController {
	
	@Autowired
	private IExtractDataService extractData;
	

	@PostMapping("/upload")
	public boolean uploadFile(@RequestParam("file") MultipartFile file)
			throws IOException {

		return extractData.extractDataAcademicOffer(file);
	}
	
	@GetMapping("/groups")
	public ArrayList<AcademicOffer> getOffer(){
		return extractData.getData();
	}
	
	
}
