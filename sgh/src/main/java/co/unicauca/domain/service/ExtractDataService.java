package co.unicauca.domain.service;


import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import co.unicauca.domain.format.AcademicOffer;
import co.unicauca.domain.format.Infraestructure;
import co.unicauca.domain.model.AcademicAmbient;
import co.unicauca.domain.model.Course;
import co.unicauca.domain.model.Group;
import co.unicauca.domain.model.Professor;
import co.unicauca.domain.model.Resource;
import co.unicauca.repository.AcademicOfferDAO;

@Component
public class ExtractDataService implements IExtractDataService{
	
	@Autowired
	private AcademicOfferDAO offerRespository;
	
	@Override
	public boolean extractDataAcademicOffer(MultipartFile mfile) throws IOException {
		
		ArrayList<Object> dataCells = new ArrayList<>();
		InputStream file = mfile.getInputStream();
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet page = book.getSheetAt(0);
		Iterator<Row> rows = page.iterator();
		Iterator<Cell> cells;
		Row row=rows.next();
		Cell cell;
		while(rows.hasNext()){
			row= rows.next();
			cells = row.iterator();
			
			while(cells.hasNext()) {
				cell = cells.next();
				switch(cell.getCellType()) {
				case NUMERIC: 
					 dataCells.add((int)cell.getNumericCellValue());
					break;
					
				case STRING: 
					 dataCells.add(cell.getStringCellValue());
					break;
				
				default:
					break;
				}
			}
			
			offerRespository.addOffer( new AcademicOffer(dataCells.get(0).toString(), dataCells.get(1).toString(), dataCells.get(2).toString(),
					dataCells.get(3).toString(), dataCells.get(4).toString(),  dataCells.get(5).toString(), Integer.parseInt(dataCells.get(6).toString()), dataCells.get(7).toString(), dataCells.get(8).toString(),
					dataCells.get(9).toString(),dataCells.get(10).toString(), dataCells.get(11).toString(), dataCells.get(12).toString(), dataCells.get(13).toString(), dataCells.get(14).toString()));
			dataCells= new ArrayList<>();
		}
		book.close();
		return true;
		
	}
	
	@Override
	public boolean extractDataInfraestructure(MultipartFile mfile) throws IOException {
		
		ArrayList<Object> dataCells = new ArrayList<>();
		InputStream file = mfile.getInputStream();
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet page = book.getSheetAt(0);
		Iterator<Row> rows = page.iterator();
		Iterator<Cell> cells;
		Row row=rows.next();
		Cell cell;
		while(rows.hasNext()){
			row= rows.next();
			cells = row.iterator();
			
			while(cells.hasNext()) {
				cell = cells.next();
				switch(cell.getCellType()) {
				case NUMERIC: 
					 dataCells.add((int)cell.getNumericCellValue());
					break;
					
				case STRING: 
					 dataCells.add(cell.getStringCellValue());
					break;
				
				default:
					break;
				}
			}
			
			offerRespository.addInfraestructure( new Infraestructure(dataCells.get(0).toString(), dataCells.get(1).toString(),
					dataCells.get(2).toString(), Integer.parseInt(dataCells.get(3).toString()), dataCells.get(4).toString(),
					dataCells.get(5).toString(), dataCells.get(6).toString(),dataCells.get(7).toString()));
			dataCells= new ArrayList<>();
	
		}
		book.close();
		return true;
		
	}
	@Override
	public ArrayList<Professor> getProffesor(){
		return offerRespository.getProffesor();
	}

	@Override
	public ArrayList<AcademicAmbient> getAcademicAmbients() {
		return offerRespository.getAcademicAmbients();
	}

	@Override
	public ArrayList<Resource> getResources() {
		return offerRespository.getResources();
	}
	@Override
	public ArrayList<Course> getCourses() {
		return offerRespository.getCourses();
	}

	@Override
	public ArrayList<Group> getGroups() {
		return offerRespository.getGroups();
	}
	
	@Override
	public ArrayList<AcademicOffer> getData(){
		return offerRespository.getOffer();
	}
	
}
