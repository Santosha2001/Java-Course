package com.xworkz.inheritance.main;

import com.xworkz.inheritance.app.zoo.*;
import com.xworkz.inheritance.util.ZooUtil;

public class ZooMain {
	public static void main(String[] args) {
		ZooUtil util = new ZooUtil();
		
		Zoo zoo = new Zoo();
		System.out.println(zoo.zooTiming);
		util.zooUtilMethod(zoo);
		
		StateZoo stateZoo = new StateZoo();
		System.out.println(stateZoo.zooState);
		util.zooUtilMethod(stateZoo);
		
		NationalZoo nationalZoo = new NationalZoo();
		System.out.println(nationalZoo.nationalLocation);
		util.zooUtilMethod(nationalZoo);
	}
}
