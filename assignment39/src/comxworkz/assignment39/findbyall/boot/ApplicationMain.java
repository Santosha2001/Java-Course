package comxworkz.assignment39.findbyall.boot;

import comxworkz.assignment39.findbyall.app.dto.ApplicationDTO;
import comxworkz.assignment39.findbyall.app.repository.ApplicationRepository;
import comxworkz.assignment39.findbyall.app.repository.ApplicationRepositoryImpl;
import comxworkz.assignment39.findbyall.app.service.ApplicationService;
import comxworkz.assignment39.findbyall.app.service.ApplicationServiceImpl;

public class ApplicationMain {

	public static void main(String[] args) {
		ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
		ApplicationService applicationService = new ApplicationServiceImpl(applicationRepository);

		ApplicationDTO applicationDTO = new ApplicationDTO(1, "Santosh", "Xworkz", "Rajajinagar", "1234");

		ApplicationDTO applicationDTO2 = new ApplicationDTO(3, "Bindhu", "Google", "Mumbai", "1234");

		ApplicationDTO applicationDTO3 = new ApplicationDTO(3, "Bindhu", "Microsoft", "Bengalore", "1234");

		ApplicationDTO applicationDTO4 = new ApplicationDTO(1, "Smith", "Xworkz", "JP Nagar", "1234");

		ApplicationDTO applicationDTO5 = new ApplicationDTO(1, "James", "Xworkz", "JP Nagar", "1234");

		applicationService.saveAndValidate(applicationDTO);

		applicationService.saveAndValidate(applicationDTO2);

		applicationService.saveAndValidate(applicationDTO3);

		applicationService.saveAndValidate(applicationDTO4);
		
		applicationService.saveAndValidate(applicationDTO5);


		applicationRepository.findByName("Bindhu");

		applicationRepository.findByNameAndDevelopedBy("Santosh", "Xworkz");

		applicationRepository.findAll(1, "Santosh", "Xworkz", "Rajajinagar", "1234");

		applicationRepository.findAllByDevelopedBy("Xworkz");

//		applicationRepository.findAllByDevelopedBy("Xworkz");

	}
}
