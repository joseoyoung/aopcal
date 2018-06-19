package kr.hs.emirim.joseoyoung.aopcal.main;

import kr.hs.emirim.joseoyoung.aopcal.cal.ExeTimeCalculator;
import kr.hs.emirim.joseoyoung.aopcal.cal.ImpCalculator;
import kr.hs.emirim.joseoyoung.aopcal.cal.RecCalculator;

public class MainProxy {//프록시 특징 : 핵심 기능을 구현하지 않고 부가적인 기능들, 공통적인 기능들을 구현
	
	public static void main(String[] args) {
		int num=20;
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpCalculator());
		System.out.println(ttCal1.factorial(num));
		
		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(num));
		
		
	}

}
