package Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;

public class LabirintoTest {

	Labirinto labirinto;
	Stanza biblioteca;
	Stanza N11;

	@Before
	public void setUp() {
		labirinto = new Labirinto();
		labirinto.creaStanze();
		biblioteca = new Stanza("Biblioteca");
		N11 = new Stanza("N11");
	}

	@Test
	public void testSetStanzaCorrente() {
		labirinto.setStanzaCorrente(N11);
		assertEquals(N11, labirinto.getStanzaCorrente());
	}

	@Test
	public void testGetStanzaCorrente() {
		assertEquals("Atrio", labirinto.getStanzaCorrente().getNome());
	}

	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", labirinto.getStanzaVincente().getNome());
	}

}




