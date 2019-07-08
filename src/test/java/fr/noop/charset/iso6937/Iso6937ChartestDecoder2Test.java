package fr.noop.charset.iso6937;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import fr.noop.charset.IsoCharsets;

public class Iso6937ChartestDecoder2Test {

    @Test
    public void testGraveAccent() throws UnsupportedEncodingException {
    	assertEquals("é", new String(new byte[] { (byte)-62, (byte)101 }, IsoCharsets.ISO_6937));
        assertEquals("À", new String(new byte[] { (byte)-63, (byte)65 }, IsoCharsets.ISO_6937));//0xc141
    }
}
