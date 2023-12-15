package com.xworkz.enumarations.constant;

public enum MovieTicketGST {

	GST(4);

	private Integer gst;

	private MovieTicketGST(Integer gst) {
		this.gst = gst;
	}

	public Integer getGst() {
		return gst;
	}
}
