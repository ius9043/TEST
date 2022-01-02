package com.gd.test.service;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class FishingPortService {
	
	//성장과 성장완료 구분
	//판매가격 뺴기
	List<HashMap<String, String>> list
	= new ArrayList<HashMap<String, String>>();
	HashMap<String, String> data = new HashMap<String,String>();
	boolean day = true;
	boolean rFlag = true;
	int money = 300;
	int portSize = 4;
	Scanner sc = new Scanner(System.in);

	public void run() {
		while (rFlag) {
			System.out.println("메뉴를 선택하시오." + "보유금액" + money +"원");
			System.out.println("1.물고기구매 2.물고기판매 3.어항구매 4.상태보기 5.먹이주기(200)원 6.다음날 7.종료");

			switch (sc.nextLine()) {
			case "1":buy();
				break;
			case "2":sell();
				break;
			case "3":bPort();
				break;
			case "4":state();
				break;
			case "5":feeding();
				break;
			case "6":nextTime();
				break;
			case "7":
				System.out.println("종료합니다.");
				rFlag = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public void buy() {
		System.out.println("구입할 물고기를 선택하세요. (보유금액 :"+ money + "원)");
		System.out.println("1.금붕어(구매가 100원, 판매가 150원, 성장 3일");
		System.out.println("2.잉어(구매가 500원, 판매가 1000원, 성장 7일");
		System.out.println("3.구피(구매가 200원, 판매가 350원, 성장 5일");
		
		int num = Integer.parseInt(sc.nextLine());
		if(num==1){
			if(money>=100) {
				data.put("물고기명", "금붕어");
				data.put("구매가", Integer.toString(100) );
				data.put("판매가", Integer.toString(150));
				data.put("성장", Integer.toString(3));
				
				list.add(data);
				money -= 100;
			}
			else {
				System.out.println("금액이 부족합니다.");
			}
		}else if(num==2){
			if(money>=500) {
				data.put("물고기명", "잉어");
				data.put("구매가", Integer.toString(500) );
				data.put("판매가", Integer.toString(1000));
				data.put("성장", Integer.toString(7));
				
				money -= 500;
			}
			else {
				System.out.println("금액이 부족합니다.");
			}
		}else if(num==3){
			if(money>=200){
				data.put("물고기명", "구피");
				data.put("구매가", Integer.toString(200) );
				data.put("판매가", Integer.toString(350));
				data.put("성장", Integer.toString(5));

				money -= 200;
			}
			else {
				System.out.println("금액이 부족합니다.");
			}
		}
		else {
			System.out.println("잘못 누르셨습니다.");
		}
		}
		
	public void sell() {
		if (!data.isEmpty()) {
			System.out.println("----판매할 물고기를 선택하세요. (보유금액 :"+ money + "원");
			for(HashMap<String, String> data : list) {
				System.out.println(data.get("물고기명")+ ","
									+ data.get("판매가")+","
									+ data.get("성장"));}
			int num = Integer.parseInt(sc.nextLine());
			//money += Integer.parseInt(list.get(num));
			list.remove(num-1);
		}
		else {
			System.out.println("판매할 물고기가 없습니다.");
		}
	}
	public void bPort() {
		if(money>=1000) {
			money -= 1000;
			portSize += 1;
		}
		else {
			System.out.println("금액이 부족합니다.");
	}
	}
	
	public void state() {		
		System.out.println("----보유금액 :" + money + "원----");
		System.out.println("----보유어항 :" + list.size() + "개----"); //4개말고 보유 사이즈로!!!
		System.out.println("----어항상태 -------");
		for(HashMap<String, String> data : list) {
			System.out.println(data.get("물고기명")+ ","
								+ data.get("성장"));}
	}
	public void feeding() {
		while(true) {
		if(money>=200) {
			money -= 200;
			//성장완료된 물고기 제외 성장 하루 +=1; 
			day = false;
		}
		else {
			System.out.println("금액이 부족합니다.");
	}
		}
		
	}
	
	public void nextTime() {
		//성장 +1
		day = true;
	}
	
	
	
}
