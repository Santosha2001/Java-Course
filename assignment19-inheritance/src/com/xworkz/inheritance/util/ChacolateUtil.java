package com.xworkz.inheritance.util;

import com.xworkz.inheritance.app.chacolate.*;
//import com.xworkz.inheritance.app.chacolate.DarkChacolate;

public class ChacolateUtil extends Chacolate {
	public void chacolateUtilMethod(Chacolate chacolate) {
		Chacolate chacolate2 = new Chacolate();
		chacolate.chacolate();
		
		if(chacolate instanceof DarkChacolate) {
			Chacolate chacolate3 = new DarkChacolate();
			DarkChacolate darkChacolate = (DarkChacolate)chacolate3;
			darkChacolate.darkChacolteMethod();
		}
		
		if(chacolate instanceof CaramelChacolate) {
			Chacolate chacolate4  = new CaramelChacolate();
			CaramelChacolate caramelChacolate = (CaramelChacolate)chacolate4;
			caramelChacolate.caramelChacolateMethod();
		}
	}
}
