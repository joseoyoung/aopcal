package kr.hs.emirim.joseoyoung.aopcal.cal;

public class ExeTimeCalculator implements Calculator {
	
	private Calculator delegate;//위임, 대리자, 대리인 //호출되기 전후 시간을 측정하기 위함.

	public ExeTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		System.out.printf("%s.factorial(%d) 실행 시간 = %d\n",
				delegate.getClass().getSimpleName(),
				num, (end - start));
		return result;
	}
	
	
}
