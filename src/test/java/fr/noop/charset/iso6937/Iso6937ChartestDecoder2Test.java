package fr.noop.charset.iso6937;

import static org.junit.Assert.assertEquals;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import fr.noop.charset.IsoCharsets;

public class Iso6937ChartestDecoder2Test {

    public String decode(String in) throws UnsupportedEncodingException {
        return new String(in.getBytes(), IsoCharsets.ISO_6937);//decodeBytes(iso6937, in.getBytes());
    }

    @Test
    public void testAscii() throws UnsupportedEncodingException {
        assertEquals("abcdefghijklmnopqrstuvwxyz", decode("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void testGraveAccent() throws UnsupportedEncodingException {
    	
    	System.out.println(((char)0xc141) + "ISO-6937");
    	assertEquals("é", new String(new byte[] { (byte)-62, (byte)101 }, IsoCharsets.ISO_6937));
        assertEquals("À", new String(new byte[] { (byte)-63, (byte)65 }, IsoCharsets.ISO_6937));//0xc141
    }
}
