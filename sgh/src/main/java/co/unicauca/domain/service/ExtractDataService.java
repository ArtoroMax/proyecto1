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

import co.unicauca.domain.model.AcademicOffer;
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
					dataCells.get(3).toString(), dataCells.get(4).toString(), Integer.parseInt(dataCells.get(5).toString()), dataCells.get(6).toString(), dataCells.get(7).toString(),
					dataCells.get(8).toString(),dataCells.get(9).toString(), dataCells.get(0).toString(), dataCells.get(10).toString()));
	
		}
		return true;
		
	}
	
	@Override
	public ArrayList<AcademicOffer> getData(){
		return offerRespository.getOffer();
	}
	
}
