package guma;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {
	AutoGuma ag;
	@Before
	public void setUp() throws Exception {
		ag=new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetMarkaModel() {
		ag.setMarkaModel("BMW X6");
		assertEquals("BMW X6", ag.getMarkaModel());
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		ag.setMarkaModel(null);
		
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetMarkaModelKratko() {
		ag.setMarkaModel("X6");
		
	}
	@Test
	public void testSetPrecnik() {
		ag.setPrecnik(15);
		assertEquals(15, ag.getPrecnik());
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetPrecnikMali() {
		ag.setPrecnik(10);
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetPrecnikVeliki() {
		ag.setPrecnik(50);
	}

	@Test
	public void testSetSirina() {
		ag.setSirina(200);
		assertEquals(200, ag.getSirina());
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetSirinaMala() {
		ag.setSirina(20);
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetSirinaVelika() {
		ag.setSirina(500);
	}
	@Test
	public void testSetVisina() {
		ag.setVisina(50);
		assertEquals(50, ag.getVisina());
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetVisinaMala() {
		ag.setVisina(20);
		
	}
	@Test(expected= java.lang.RuntimeException.class)
	public void testSetVisinaVelika() {
		ag.setVisina(500);
		
	}
	@Test
	public void testToString() {
		ag.setMarkaModel("Renault Megane");
		ag.setPrecnik(16);
		ag.setVisina(35);
		ag.setSirina(220);
		assertEquals("AutoGuma [markaModel=" + "Renault Megane" + ", precnik=" + 16 +
	", sirina=" + 220 + ", visina=" + 35 + "]", ag.toString());
	}

	@Test
	public void testEqualsObject() {
		AutoGuma a=new AutoGuma();
		a.setMarkaModel("BMW X6");
		a.setPrecnik(16);
		a.setVisina(35);
		a.setSirina(220);
		ag.setMarkaModel("BMW X6");
		ag.setPrecnik(16);
		ag.setVisina(35);
		ag.setSirina(220);
		assertTrue(a.equals(ag));
		
	}
	public void testEqualsObjectRazliciti() {
		AutoGuma a=new AutoGuma();
		a.setMarkaModel("BMW X6");
		a.setPrecnik(16);
		a.setVisina(35);
		a.setSirina(220);
		ag.setMarkaModel("BMW X5");
		ag.setPrecnik(16);
		ag.setVisina(35);
		ag.setSirina(220);
		assertFalse(ag.equals(a));
	}

}
