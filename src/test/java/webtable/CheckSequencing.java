package webtable;

import org.testng.annotations.Test;

public class CheckSequencing {

	@Test
	public void alpha() {
		System.out.println("I am in alpha");
	}

	@Test(dependsOnMethods="alpha")
	public void beta() {
		System.out.println("I am in beta");
	}

	@Test
	public void cupCake() {
		System.out.println("I am in cup cake");
	}

	@Test
	public void donut() {
		System.out.println("I am in donut");
	}



}
