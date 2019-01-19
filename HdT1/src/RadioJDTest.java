

import static org.junit.Assert.*;

import org.junit.Test;

public class RadioJDTest {
	
	RadioJD JD = new RadioJD();
	@Test
	public void testEncendidoRadio()
	{
        boolean res = JD.encendidoRadio();
        boolean esperado = true;
        assertEquals(esperado, res);
    }
	@Test
	public void testSubirFrecuencia()
	{ 
		double F = JD.subirFrecuencia();
		double e = 87.5;
		assertEquals(e, F,87.5);
		
    }
	@Test
	public void testBajarFrecuencia()
	{ 
		double F = JD.bajarFrecuencia();
		double e = 104;
		assertEquals(e, F,104);
		
    }
	
	@Test
	public void cambiarAmFm()
	{
		boolean res = JD.cambiarAmFm();
        boolean esperado = false;
        assertEquals(esperado, res);
    } 

}
