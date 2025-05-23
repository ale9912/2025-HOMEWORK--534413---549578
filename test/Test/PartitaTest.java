package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class PartitaTest {

	Partita p = new Partita();
	Stanza s = new Stanza("Stanza");

	@Test
	public void testSetStanzaCorrente() {
		p.getLabirinto().setStanzaCorrente(s);
		assertEquals(s, p.getLabirinto().getStanzaCorrente());
	}

	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", p.getLabirinto().getStanzaVincente().getNome());
	}



	@Test
	public void test_Partita_Finita() {

		assertFalse(p.isFinita());
	}
}
