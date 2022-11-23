package co.unicauca.domain.service;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.unicauca.domain.model.AcademicOffer;

@Service
public interface IExtractDataService {

	public boolean extractDataAcademicOffer(MultipartFile file)throws IOException;
	public ArrayList<AcademicOffer> getData();
}
