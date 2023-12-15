package com.xworkz.enumarations.boot;

import com.xworkz.enumarations.constant.CitizenWithLowerAgeLimit;
import com.xworkz.enumarations.constant.CitizenWithUpperAgeLimit;
import com.xworkz.enumarations.constant.MoviePrice;
import com.xworkz.enumarations.constant.MovieTicketGST;
import com.xworkz.enumarations.constant.ShoeSize;
import com.xworkz.enumarations.constant.ShoeType;
import com.xworkz.enumarations.constant.TrainBasePrice;
import com.xworkz.enumarations.constant.VenderSerialNO;
import com.xworkz.enumarations.constant.VendorGST;
import com.xworkz.enumarations.dto.CitizenWithAgesDTO;
import com.xworkz.enumarations.dto.MovieTicketDTO;
import com.xworkz.enumarations.dto.ShoeDTO;
import com.xworkz.enumarations.dto.TrainClassDTO;
import com.xworkz.enumarations.dto.VenderDTO;

public class ShoeMain {

	public static void main(String[] args) {
		ShoeDTO dto = new ShoeDTO(ShoeType.FARMALS);
		dto.setBrand("Puma");
		dto.setPrice(1000.0);
		dto.setSize(ShoeSize.S);

		System.out.println(dto);

		TrainClassDTO classDTO = new TrainClassDTO(TrainBasePrice.AC);
		System.out.println(classDTO);
		System.out.println(classDTO.getBasePrice() + " " + classDTO.getBasePrice().getI());

		MovieTicketDTO dto2 = new MovieTicketDTO(10.0, MovieTicketGST.GST, MoviePrice.BOLCANI);

		System.out.println(dto2);
		System.out.println(MovieTicketGST.GST + " " + MovieTicketGST.GST.getGst() + "%");

		VenderDTO dto3 = new VenderDTO("Santosh", VendorGST.AMAZON, VenderSerialNO.AJIO);
		System.out.println(dto3);
		System.out.println(VenderSerialNO.AJIO + " " + VenderSerialNO.AJIO.getSerialNo());

		CitizenWithAgesDTO agesDTO = new CitizenWithAgesDTO("Bengalore", CitizenWithLowerAgeLimit.KID,
				CitizenWithUpperAgeLimit.ADULTS);
		System.out.println(agesDTO);
		System.out.println(CitizenWithLowerAgeLimit.CHILD.getAges());
		System.out.println(CitizenWithUpperAgeLimit.ADULTS.getAges());
	}
}
