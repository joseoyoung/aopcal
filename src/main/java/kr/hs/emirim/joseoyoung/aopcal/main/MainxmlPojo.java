package kr.hs.emirim.joseoyoung.aopcal.main;
import org.springframework.context.support.GenericXmlApplicationContext;

import kr.hs.emirim.joseoyoung.aopcal.cal.Calculator;

public class MainxmlPojo {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:aopPojo.xml");
		
		Calculator impCal = ctx.getBean("impCal", Calculator.class);
		long finveFact1 = impCal.factorial(5);
		System.out.println("impCal.factorial(5) = "+finveFact1);

		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long finveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = "+finveFact2);
		
		
	}

}
