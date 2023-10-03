package comxworkz.assignment39.findbyall.app.dto;

public class ApplicationDTO {

	private int id;
	private String name;
	private String developedBy;
	private String developAt;
	private String version;

	public ApplicationDTO() {
		// TODO Auto-generated constructor stub
	}

	public ApplicationDTO(int id, String name, String developedBy, String developAt, String version) {
		super();
		this.id = id;
		this.name = name;
		this.developedBy = developedBy;
		this.developAt = developAt;
		this.version = version;
	}

	@Override
	public String toString() {
		return "ApplicationDTO [id=" + id + ", name=" + name + ", developedBy=" + developedBy + ", developAt="
				+ developAt + ", version=" + version + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null) {
			if (obj instanceof ApplicationDTO) {
				ApplicationDTO dto = (ApplicationDTO) obj;
				if (dto.name.equals(name) && dto.developedBy.equals(developedBy) && dto.developAt.equals(developAt)
						&& dto.version.equals(version) && dto.id == id) {
					return true;
				}
			}
		}

		return super.equals(obj);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public String getDevelopAt() {
		return developAt;
	}

	public String getVersion() {
		return version;
	}

}
