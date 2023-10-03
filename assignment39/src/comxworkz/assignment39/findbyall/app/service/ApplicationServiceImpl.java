package comxworkz.assignment39.findbyall.app.service;

import java.lang.invoke.VarHandle;

import comxworkz.assignment39.findbyall.app.dto.ApplicationDTO;
import comxworkz.assignment39.findbyall.app.repository.ApplicationRepository;

public class ApplicationServiceImpl implements ApplicationService {

	private ApplicationRepository repo;

	public ApplicationServiceImpl(ApplicationRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveAndValidate(ApplicationDTO applicationDTO) {

		if (applicationDTO != null) {
			int id = applicationDTO.getId();
			String name = applicationDTO.getName();
			String developedBy = applicationDTO.getDevelopedBy();
			String developAt = applicationDTO.getDevelopAt();
			String version = applicationDTO.getVersion();

			if (id > 0) {
				System.out.println("Id--> " + applicationDTO.getId() + " is valid");
			} else {
				System.err.println("Id is not valid");
				return false;
			}

			if (name != null && !name.isEmpty() && name.length() >= 3 && name.length() <= 20) {
				System.out.println("Name--> " + applicationDTO.getName() + " is valid");
			} else {
				System.err.println("Name is not valid");
				return false;
			}

			if (developedBy != null && !developedBy.isEmpty() && developedBy.length() >= 3
					&& developedBy.length() <= 20) {
				System.out.println("DevelopedBy--> " + applicationDTO.getDevelopedBy() + " is valid");
			} else {
				System.err.println("DevelopedBy is not valid");
				return false;
			}

			if (developAt != null && !developAt.isEmpty() && developAt.length() >= 3 && developAt.length() <= 20) {
				System.out.println("DevelopedAt--> " + applicationDTO.getDevelopAt() + " is valid");
			} else {
				System.err.println("DevelopedAt is not valid");
				return false;
			}

			if (version != null && !version.isEmpty() && version.length() >= 3 && version.length() <= 20) {
				System.out.println("Varsion--> " + applicationDTO.getVersion() + " is valid");
			} else {
				System.err.println("Varsion is not valid");
				return false;
			}

			if (!repo.isExist(applicationDTO)) {
				this.repo.save(applicationDTO);
				System.out.println("dto saved");
				System.out.println();
				return true;
			}

		}

		return false;
	}

}
