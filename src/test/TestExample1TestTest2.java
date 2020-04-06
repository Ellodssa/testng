package test;


import fwk.Beopt;
import org.testng.annotations.Test;

public class TestExample1TestTest2 {


	@Test
	@Beopt("20160101")
	public void test() {
		System.out.println("20160101. Thread: " + Thread.currentThread().getId());
		
		
	}

}
