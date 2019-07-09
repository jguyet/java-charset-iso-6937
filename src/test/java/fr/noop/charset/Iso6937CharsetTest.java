package fr.noop.charset;

import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import org.junit.*;

import fr.noop.charset.IsoCharsets;

/**
 * Created by jguyet on 08/07/2019.
 * 
 * Class of unit test determine if ISO Provider is loaded
 */
public class Iso6937CharsetTest {
	
	@Test
    public void testRegistered() throws UnsupportedEncodingException {
		assertTrue(IsoCharsets.ISO_6937.isRegistered());
    }
	
}
