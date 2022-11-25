package co.unicauca.domain.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

import javax.sound.midi.Soundbank;

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
public class ExtractDataService implements IExtractDataService {

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
		Row row = rows.next();
		Cell cell;
		while (rows.hasNext()) {
			row = rows.next();
			cells = row.iterator();

			while (cells.hasNext()) {
				cell = cells.next();
				switch (cell.getCellType()) {
					case NUMERIC:
						dataCells.add((int) cell.getNumericCellValue());
						break;

					case STRING:
						dataCells.add(cell.getStringCellValue());
						break;

					default:
						break;
				}
			}

			offerRespository.addOffer(new AcademicOffer(dataCells.get(0).toString(), dataCells.get(1).toString(),
					dataCells.get(2).toString(),
					dataCells.get(3).toString(), dataCells.get(4).toString(), dataCells.get(5).toString(),
					Integer.parseInt(dataCells.get(6).toString()), dataCells.get(7).toString(),
					dataCells.get(8).toString(),
					dataCells.get(9).toString(), dataCells.get(10).toString(), dataCells.get(11).toString(),
					dataCells.get(12).toString(), dataCells.get(13).toString(), dataCells.get(14).toString()));
			dataCells = new ArrayList<>();
		}
		book.close();
		return true;

	}

	@Override
	public Integer extractDataInfraestructure(MultipartFile mfile) throws IOException {

		ArrayList<Object> dataCells = new ArrayList<>();
		InputStream file = mfile.getInputStream();
		XSSFWorkbook book = new XSSFWorkbook(file);
		XSSFSheet page = book.getSheetAt(0);
		Iterator<Row> rows = page.iterator();
		Iterator<Cell> cells;
		Row row = rows.next();
		row = rows.next();
		Cell cell;
		ArrayList<String> resource = new ArrayList<>();
		ArrayList<String> serial = new ArrayList<>();
		Boolean band = true;
		while (rows.hasNext()) {
			row = rows.next();
			cells = row.iterator();
			if (band) {
				if (cells.next().toString().equals("")) {
					return -1;
				}
				band = false;
			}
			if (!row.getCell(0, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).toString().equals("") &&
					!row.getCell(1, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).toString().equals("") &&
					!row.getCell(2, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK).toString().equals("")) {
				for (int cn = 0; cn < 14; cn++) {
					cell = row.getCell(cn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
					switch (cell.getCellType()) {
						case NUMERIC:
							dataCells.add((int) cell.getNumericCellValue());
							break;

						case STRING:
							dataCells.add(cell.getStringCellValue());
							break;

						default:
							dataCells.add(cell.getStringCellValue());
							break;
					}
				}
				if (dataCells.size() >= 5) {
					for (int i = 5; i <= 8; i++) {
						if (dataCells.get(i).toString().equals("Sí")) {
							switch (i) {
								case 5:
									resource.add("Televisor");
									break;
								case 6:
									resource.add("Proyector");
									break;
								case 7:
									resource.add("Tablero inteligente");
									break;
								case 8:
									resource.add("Instrumentación");
									break;
							}
							serial.add(dataCells.get(i + 4).toString());
						}

					}
				}
				for (int i = 0; i < resource.size(); i++) {
					System.out.println("Recurso: " + resource.get(i));
					System.out.println("Serial: " + serial.get(i));
				}
				System.out.println("--------------");
				try {
					offerRespository
							.addInfraestructure(
									new Infraestructure(dataCells.get(0).toString(), dataCells.get(1).toString(),
											dataCells.get(2).toString(), Integer.parseInt(dataCells.get(3).toString()),
											dataCells.get(4).toString(), resource, serial,
											dataCells.get(13).toString()));
				} catch (Exception e) {
				}
			}

			dataCells = new ArrayList<>();
			serial = new ArrayList<>();
			resource = new ArrayList<>();

		}
		book.close();
		return 1;

	}

	@Override
	public ArrayList<Professor> getProffesor() {
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
	public ArrayList<AcademicOffer> getData() {
		return offerRespository.getOffer();
	}

	@Override
	public ArrayList<Infraestructure> getInfraestructure() {
		return offerRespository.getInfraestructure();
	}

}
