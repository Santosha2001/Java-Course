package com.xworkz.enumarations.dto;

import com.xworkz.enumarations.constant.MoviePrice;
import com.xworkz.enumarations.constant.MovieTicketGST;

public class MovieTicketDTO {

	private Double discount;
	private MovieTicketGST gst;
	private MoviePrice moviePrice;

	public MovieTicketDTO(Double discount, MovieTicketGST gst, MoviePrice moviePrice) {
		super();
		this.discount = discount;
		this.gst = gst;
		this.moviePrice = moviePrice;
	}

	@Override
	public String toString() {
		return "MovieTicketDTO [discount=" + discount + ", gst=" + gst + ", moviePrice=" + moviePrice + "]";
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public void setGst(MovieTicketGST gst) {
		this.gst = gst;
	}

	public void setMoviePrice(MoviePrice moviePrice) {
		this.moviePrice = moviePrice;
	}

}
