package co.unicauca.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import co.unicauca.domain.model.AcademicOffer;

@Repository
public class AcademicOfferDAO {
	
	private ArrayList<AcademicOffer> offerList = new ArrayList<>();

	public void addOffer(AcademicOffer objAcademicOffer) {
		offerList.add(objAcademicOffer);
	}
	public ArrayList<AcademicOffer> getOffer(){
		return offerList;
	}
	
}
