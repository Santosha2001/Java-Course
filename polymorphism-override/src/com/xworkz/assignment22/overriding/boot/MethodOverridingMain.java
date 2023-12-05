package com.xworkz.assignment22.overriding.boot;

import com.xworkz.assignment22.overriding.app.ameoba.NoShapeAmeoba;
import com.xworkz.assignment22.overriding.app.bangle.GoldBangle;
import com.xworkz.assignment22.overriding.app.coal.BlackCoal;
import com.xworkz.assignment22.overriding.app.dinaosur.Dianosur;
import com.xworkz.assignment22.overriding.app.drum.EarDrum;
import com.xworkz.assignment22.overriding.app.flex.Banner;
import com.xworkz.assignment22.overriding.app.gate.SchoolGate;
import com.xworkz.assignment22.overriding.app.mic.MicDJ;
import com.xworkz.assignment22.overriding.app.theator.MallTheator;
import com.xworkz.assignment22.overriding.app.ticket.BlackTicket;

public class MethodOverridingMain {
	public static void main(String[] args) {
		BlackTicket blackTicket = new BlackTicket();
		blackTicket.ticket();
		blackTicket.ticketName();
		System.out.println("\n");

		MallTheator mallTheator = new MallTheator();
		mallTheator.watchMovie();
		mallTheator.theatorName();
		System.out.println("\n");

		MicDJ dj = new MicDJ();
		dj.micSize('M');
		dj.micSound();
		System.out.println("\n");

		SchoolGate gate = new SchoolGate();
		gate.gate();
		gate.mouseGate("House");
		System.out.println("\n");

		Banner banner = new Banner();
		banner.fles();
		banner.flexZise('L');
		System.out.println("\n");

		EarDrum drum = new EarDrum();
		drum.drum();
		System.out.println("\n");

		Dianosur dianosur = new Dianosur();
		dianosur.aniamal();
		dianosur.aniamal("dianosur");
		System.out.println("\n");

		BlackCoal blackCoal = new BlackCoal();
		blackCoal.burn();
		System.out.println("\n");

		GoldBangle bangle = new GoldBangle();
		bangle.sound();
		bangle.color("gold");
		System.out.println("\n");

		NoShapeAmeoba ameoba = new NoShapeAmeoba();
		ameoba.ameobaShape();

	}

}
