package com.xworkz.assignment35.services.boot;

import com.xworkz.assignment35.app.repositary.juice.JuiceRepositary;
import com.xworkz.assignment35.app.repositary.juice.JuiceRepositaryImpl;
import com.xworkz.assignment35.app.services.juice.JuiceService;
import com.xworkz.assignment35.app.services.juice.JuiceServiceImpl;

public class JuiceMain {

	public static void main(String[] args) {
		JuiceRepositary juiceRepositary = new JuiceRepositaryImpl();

		JuiceService juiceService = new JuiceServiceImpl(juiceRepositary);

//		juiceService.saveAndStore("Apple juice");
//		juiceService.saveAndStore(null);
//		juiceService.saveAndStore("");
//		juiceService.saveAndStore("a");

		String[] itemArray = { "aple","maza", null, "", "a","maza" };

		for (int i = 0; i < itemArray.length; i++) {
			juiceService.saveAndStore(itemArray[i]);
		}
	}
}
