package comxworkz.assignment39.findbyall.app.repository;

import comxworkz.assignment39.findbyall.app.dto.ApplicationDTO;

public interface ApplicationRepository {

	int SIZE = 10;

	void save(ApplicationDTO applicationDTO);

	boolean isExist(ApplicationDTO applicationDTO);

	ApplicationDTO findByName(String name);

	ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy);

	ApplicationDTO findAll(int id, String name, String developedBy, String developedAt, String version);

	ApplicationDTO findAllByDevelopedBy(String developedBy);
	
}
