package test03;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

public class ListTest03 {
	
	public static void main(String[]args) {
		ArrayList<String> strList = new ArrayList<String>();
		// 반복문을 사용해서 1~30까지의 랜덤 숫자를 총 10개를 strList에 추가 출력
		
		
		for(int i=1; i<=10; i++) {//1~10까지 반복
			String random=(int)(Math.random()*30)+1+""; //1~30까지의 랜덤숫자 뽑기
			random = StringUtils.leftPad(random, 2,'0');//2글자로 글자 제한 한뒤 한글자가 들어오면 앞에 0을붙임
			strList.add(random); // 1~30뽑은 숫자를 strList에 10번 추가
		}
		Collections.sort(strList);
		
		for(int i=0; i<10;i++) {
			System.out.println(strList.get(i));
		}
		
	}

}
