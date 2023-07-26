package ap.demo1.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyOperationsTest {

	@Test
		public void testAddpositiveValues() {
			assertEquals(8,new MyOperations().add(3,5));
	}
	@Test
	public void testAddNegativeValues1() {
		assertEquals(-27,new MyOperations().add(-23,-4));
}
	@Test
	public void testAddPositiveNegativeeValues() {
		assertEquals(-19,new MyOperations().add(-23,4));
		
}
	@Test
	public void testAddZeroValues() {
		assertEquals(0,new MyOperations().add(0,0));
		assertEquals(-3,new MyOperations().add(0,-3));
		assertEquals(5,new MyOperations().add(5,0));

}
	
	@Test
	public void testGetFullName() {
		assertEquals("Simrankaur",new MyOperations().getFullName("Simran","kaur"));
	}
}
	
