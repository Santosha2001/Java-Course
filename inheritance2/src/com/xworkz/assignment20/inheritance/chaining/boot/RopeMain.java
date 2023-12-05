package com.xworkz.assignment20.inheritance.chaining.boot;

import com.xworkz.assignment20.inheritance.app.rope.WirwRope;

public class RopeMain {
	public static void main(String[] args) {
		WirwRope rope = new WirwRope();
		System.out.println("No arguments");
		System.out.println(rope.cost);
		System.out.println(rope.meters);
		System.out.println(rope.thicknes);
		System.out.println(rope.usedFor);
		
		WirwRope rope2 = new WirwRope(25,300,'M',"tying");
		System.out.println("Parameter arguments");
		System.out.println(rope2.cost);
		System.out.println(rope2.meters);
		System.out.println(rope2.thicknes);
		System.out.println(rope2.usedFor);
	}
}
