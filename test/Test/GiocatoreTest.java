package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

public class GiocatoreTest {
Giocatore giocatore = new Giocatore();
	
	@Test
	public void testGetCfu_Iniziali() {
		assertEquals(20, giocatore.getCfu());
	}
	
	@Test
	public void testSetCfu() {
		giocatore.setCfu(3);
		assertEquals(3, giocatore.getCfu());
	}

	@Test
	public void testGetBorsa() {
		assertNotNull(giocatore.getBorsa());
	}
}
