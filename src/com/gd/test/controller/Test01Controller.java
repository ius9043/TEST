package com.gd.test.controller;

import java.util.ArrayList;
import java.util.List;

//import : 주소록과 같음. 해당 파일이 어디 있는지를 가져옴. (객체는 x)
//import 에서의 * : 해당 패키지 아래 모든 파일
import com.gd.test.service.*;

public class Test01Controller {

	public static void main(String[] args) {
		
		Test01Service ts = new Test01Service();
		
		List list = new ArrayList();
		
		
		//add (값)
		list.add("가나다");
		//add(인덱스 번호, 값) : 인덱스 번호 위치에 값을 추가한다.
		//0번 이후의 내용들을 다 밀어낸다.
		list.add(0,"ABC");
		
		//값 가져오기
		//get(인덱스 번호) : 인덱스 번호에 해당하는 값을 가져온다.
		System.out.println(list.get(0));
		
		//indexOf(값) : 값의 위치를 찾는다.
		//lastIndexOf(값) : 값의 위치를 뒤에서부터 찾는다.
		System.out.println(list.indexOf("가나다"));
		System.out.println(list.lastIndexOf("가나다"));
		//contains(값) : 값의 존재여부 확인
		System.out.println(list.contains("ABC"));
		
		//remove(인덱스번호) : 인덱스 번호에 값을 제거하고 다음 값들을 당겨옴
		list.remove(0);
		System.out.println(list.get(0));
		//set(인덱스번호, 값) : 인덱스 번호의 내용을 주어진 값으로 변경
		//일부만 바꿀 수 는 없다.
		list.set(0, "라바마");
		System.out.println(list.get(0));
		
		
		//size() : 리스트의 크기를 가져옴
		System.out.println(list.size());
		//toString() : 문자열로 가져옴
		System.out.println(list.toString());
		
		//isEmpty() : 비어있는지 여부 확인
		System.out.println(list.isEmpty());
		
		//clear(): 모든 내용 제거
		list.clear();
		System.out.println(list.isEmpty());

		
		float num = 3.1415f;
		int b = -7;
		System.out.println(Math.ceil(num)); 		//Math.ceil(값) :값을 올림한다
		System.out.println(Math.ceil(num*100)/100); //소수점 두자리수까지 올림
		System.out.println(Math.floor(num));		//Math.floor(값) : 값을 버림 처리한다. 
		System.out.println(Math.round(num));		//Math.round(값) : 값을 반올림 한다.
		System.out.println(Math.round(num*100)/100f); //실수로 처리
		System.out.println(Math.abs(b));			//Math.abs(b) : 값의 절대값
	}

}
