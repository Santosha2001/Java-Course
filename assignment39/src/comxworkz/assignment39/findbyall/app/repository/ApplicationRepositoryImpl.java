package comxworkz.assignment39.findbyall.app.repository;

import comxworkz.assignment39.findbyall.app.dto.ApplicationDTO;

public class ApplicationRepositoryImpl implements ApplicationRepository {

	private int position;
	private ApplicationDTO[] dtos = new ApplicationDTO[SIZE];

	@Override
	public void save(ApplicationDTO applicationDTO) {

		if (this.position < SIZE) {
			this.dtos[position] = applicationDTO;
			System.out.println(applicationDTO + " is at index " + position);
			this.position++;
		} else {
			System.err.println("Index out range");
		}
	}

	@Override
	public boolean isExist(ApplicationDTO applicationDTO) {

		for (int index = 0; index <= this.position; index++) {
			ApplicationDTO dto = dtos[index];
			if (dto != null && dto.equals(applicationDTO)) {
				System.out.println("dto already exist");
				System.out.println();
				return true;
			}
		}

		return false;
	}

	@Override
	public ApplicationDTO findByName(String name) {

		for (int index = 0; index < this.position; index++) {
			ApplicationDTO dto = dtos[index];
			if (dto.getName().equals(name)) {
				System.out.println("Name is found by--> " + name);
				System.out.println();
				return dto;
			}
		}

		return null;
	}

	@Override
	public ApplicationDTO findByNameAndDevelopedBy(String name, String developedBy) {

		for (int index = 0; index < this.position; index++) {
			ApplicationDTO dto = dtos[index];
			if (dto.getName().equals(name) && dto.getDevelopedBy().equals(developedBy)) {
				System.out.println("Name is found by--> " + name);
				System.out.println("DevelopedBy is found by--> " + developedBy);
				System.out.println();
				return dto;
			}
		}

		return null;
	}

	@Override
	public ApplicationDTO findAll(int id, String name, String developedBy, String developedAt, String version) {
		for (int index = 0; index < this.position; index++) {
			ApplicationDTO dto = dtos[index];
			if (dto.getId() == id && dto.getName().equals(name) && dto.getDevelopedBy().equals(developedBy)
					&& dto.getDevelopAt().equals(developedAt) && dto.getVersion().equals(version)) {
				System.out.println("Id found by--> " + id);
				System.out.println("Name found by--> " + name);
				System.out.println("DevelopedBy found by--> " + developedBy);
				System.out.println("DevalopedAt found by--> " + developedAt);
				System.out.println("Version found by--> " + version);
				System.out.println();

				return dto;

			}
		}

		return null;
	}

	@Override
	public ApplicationDTO findAllByDevelopedBy(String developedBy) {

		for (int index = 0; index < this.position; index++) {
			ApplicationDTO dto = dtos[index];
			if (dto != null && dto.getDevelopedBy().equals(developedBy)) {
				System.out.println("dto found at index " + dto+"Position is  "+index);
			}
		}

		return null;
	}

}
