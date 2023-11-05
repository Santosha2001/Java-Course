package com.xworkz.collection.app.dto;

public class HotelDTO {

	private int id;
	private String name;
	private String ownerName;
	private String gst;
	private String location;

	public HotelDTO(int id, String name, String ownerName, String gst, String location) {
		super();
		this.id = id;
		this.name = name;
		this.ownerName = ownerName;
		this.gst = gst;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", name=" + name + ", ownerName=" + ownerName + ", gst=" + gst + ", location="
				+ location + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof HotelDTO)) {
			return false;
		}
		HotelDTO other = (HotelDTO) obj;
		if (gst == null) {
			if (other.gst != null) {
				return false;
			}
		} else if (!gst.equals(other.gst)) {
			return false;
		}
		if (id != other.id) {
			return false;
		}
		if (location == null) {
			if (other.location != null) {
				return false;
			}
		} else if (!location.equals(other.location)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (ownerName == null) {
			if (other.ownerName != null) {
				return false;
			}
		} else if (!ownerName.equals(other.ownerName)) {
			return false;
		}
		return true;
	}

}
