package guma.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import guma.AutoGuma;
import guma.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja vr;
	@Before
	public void setUp() throws Exception {
		vr=new VulkanizerskaRadnja();
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("BMW X6");
		ag.setPrecnik(16);
		ag.setSirina(220);
		ag.setVisina(50);
		vr.dodajGumu(ag);
		ag=new AutoGuma();
		ag.setMarkaModel("BMW X6");
		ag.setPrecnik(20);
		ag.setSirina(300);
		ag.setVisina(70);
		vr.dodajGumu(ag);
		ag=new AutoGuma();
		ag.setMarkaModel("BMW X5");
		ag.setPrecnik(20);
		ag.setSirina(300);
		ag.setVisina(70);
		vr.dodajGumu(ag);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDodajGumu() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("BMW X5");
		ag.setPrecnik(17);
		ag.setSirina(220);
		ag.setVisina(50);
		vr.dodajGumu(ag);
		assertEquals(ag, vr.pronadjiGumu("BMW X5").getFirst());
	}
	@Test(expected=java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		vr.dodajGumu(null);
		
	}
	@Test(expected=java.lang.RuntimeException.class)
	public void testDodajGumuPostojecu() {
		AutoGuma ag=new AutoGuma();
		ag.setMarkaModel("BMW X6");
		ag.setPrecnik(16);
		ag.setSirina(220);
		ag.setVisina(50);
		vr.dodajGumu(ag);
		
	}
	@Test
	public void testPronadjiGumu() {
		assertEquals(1, vr.pronadjiGumu("BMW X5").size());
	}
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, vr.pronadjiGumu(null));
	}
	@Test
	public void testPronadjiGumuNema() {
		assertEquals(0, vr.pronadjiGumu("BMW X7").size());
	}
	@Test
	public void testPronadjiGumuDve() {
		assertEquals(2, vr.pronadjiGumu("BMW X6").size());
	}

}
