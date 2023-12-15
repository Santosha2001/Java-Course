package com.xworkz.enumarations.dto;

import com.xworkz.enumarations.constant.VenderSerialNO;
import com.xworkz.enumarations.constant.VendorGST;

public class VenderDTO {

	private String name;
	private VendorGST gst;
	private VenderSerialNO no;

	public VenderDTO(String name, VendorGST gst, VenderSerialNO no) {
		super();
		this.name = name;
		this.gst = gst;
		this.no = no;
	}

	@Override
	public String toString() {
		return "VenderDTO [name=" + name + ", gst=" + gst + ", no=" + no + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGst(VendorGST gst) {
		this.gst = gst;
	}

	public void setNo(VenderSerialNO no) {
		this.no = no;
	}

}
