package com.gd.test.controller;

import com.gd.test.service.FishingPortService;

public class FishingPortController {

	public static void main(String[] args) {
		System.out.println("=================");
		System.out.println("     수족관 경영    ");
		System.out.println("=================");

		
		FishingPortService ses = new FishingPortService();

		ses.run();
	}

}
