package Project.MavenSelenium;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestExample {

	@Test
	public void Test1(){
		System.out.println("Holaaaaaaa");
		assertTrue( true );
	}
	
	@Test
	public void Test2(){
		System.out.println("Holaaaaaaa test 2");
		assertTrue( false );
	}
	
	
}
