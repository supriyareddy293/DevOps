package Nissan.numbertostring;

import static org.junit.Assert.*;

import org.junit.*;

public class NumberWordsTests {
	private NumberWordsApplication numberWordsApplication ;
	
	@Before

	@Test
	public void test()
	{
		
		NumberWordsApplication obj=new NumberWordsApplication();
		String output= obj.convert(1);
		assertEquals("One",output);
		}
	
	public void test1() {

		Assert.assertEquals( "Error", "Negative numbers", NumberWordsApplication.convert( -1 ) ) ;

	}
	public void test2() {

		Assert.assertEquals( "Error", "Number out of range", NumberWordsApplication.convert(10000000) ) ;

	}
	
	
	
}