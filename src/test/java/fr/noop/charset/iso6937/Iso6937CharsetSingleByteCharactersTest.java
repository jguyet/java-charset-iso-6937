package fr.noop.charset.iso6937;

import java.io.UnsupportedEncodingException;

import org.junit.*;
import static org.junit.Assert.*;

import fr.noop.charset.IsoCharsets;

/**
 *  Created by jguyet on 09/07/2019.
 * 
 *  Class of unit test encoding and decoding Single byte Characters
 */
public class Iso6937CharsetSingleByteCharactersTest {
	
	private byte[] e(String s) {
    	return s.getBytes(IsoCharsets.ISO_6937);
    }
	
	private String decodeBytes(byte[] bytes) throws UnsupportedEncodingException {
	        return new String(bytes, IsoCharsets.ISO_6937);
	}

    @Test
    public void testSingleByteCharacters() throws UnsupportedEncodingException {
    	assertEquals("!", decodeBytes(e("!")));
    	assertEquals("\"",decodeBytes(e("\"")));
    	assertEquals("#", decodeBytes(e("#")));
    	assertEquals("¤", decodeBytes(e("¤")));
    	assertEquals("%", decodeBytes(e("%")));
    	assertEquals("&", decodeBytes(e("&")));
    	assertEquals("'", decodeBytes(e("'")));
    	assertEquals("(", decodeBytes(e("(")));
    	assertEquals(")", decodeBytes(e(")")));
    	assertEquals("*", decodeBytes(e("*")));
    	assertEquals("+", decodeBytes(e("+")));
    	assertEquals(",", decodeBytes(e(",")));
    	assertEquals("-", decodeBytes(e("-")));
    	assertEquals(".", decodeBytes(e(".")));
    	assertEquals("/", decodeBytes(e("/")));
    	assertEquals("0", decodeBytes(e("0")));
    	assertEquals("1", decodeBytes(e("1")));
    	assertEquals("2", decodeBytes(e("2")));
    	assertEquals("3", decodeBytes(e("3")));
    	assertEquals("4", decodeBytes(e("4")));
    	assertEquals("5", decodeBytes(e("5")));
    	assertEquals("6", decodeBytes(e("6")));
    	assertEquals("7", decodeBytes(e("7")));
    	assertEquals("8", decodeBytes(e("8")));
    	assertEquals("9", decodeBytes(e("9")));
    	assertEquals(":", decodeBytes(e(":")));
    	assertEquals(";", decodeBytes(e(";")));
    	assertEquals("<", decodeBytes(e("<")));
    	assertEquals("=", decodeBytes(e("=")));
    	assertEquals(">", decodeBytes(e(">")));
    	assertEquals("?", decodeBytes(e("?")));
    	assertEquals("@", decodeBytes(e("@")));
    	assertEquals("A", decodeBytes(e("A")));
    	assertEquals("B", decodeBytes(e("B")));
    	assertEquals("C", decodeBytes(e("C")));
    	assertEquals("D", decodeBytes(e("D")));
    	assertEquals("E", decodeBytes(e("E")));
    	assertEquals("F", decodeBytes(e("F")));
    	assertEquals("G", decodeBytes(e("G")));
    	assertEquals("H", decodeBytes(e("H")));
    	assertEquals("I", decodeBytes(e("I")));
    	assertEquals("J", decodeBytes(e("J")));
    	assertEquals("K", decodeBytes(e("K")));
    	assertEquals("L", decodeBytes(e("L")));
    	assertEquals("M", decodeBytes(e("M")));
    	assertEquals("N", decodeBytes(e("N")));
    	assertEquals("O", decodeBytes(e("O")));
    	assertEquals("P", decodeBytes(e("P")));
    	assertEquals("Q", decodeBytes(e("Q")));
    	assertEquals("R", decodeBytes(e("R")));
    	assertEquals("S", decodeBytes(e("S")));
    	assertEquals("T", decodeBytes(e("T")));
    	assertEquals("U", decodeBytes(e("U")));
    	assertEquals("V", decodeBytes(e("V")));
    	assertEquals("W", decodeBytes(e("W")));
    	assertEquals("X", decodeBytes(e("X")));
    	assertEquals("Y", decodeBytes(e("Y")));
    	assertEquals("Z", decodeBytes(e("Z")));
    	assertEquals("[", decodeBytes(e("[")));
    	assertEquals("\\", decodeBytes(e("\\")));
    	assertEquals("]", decodeBytes(e("]")));
    	assertEquals("^", decodeBytes(e("^")));
    	assertEquals("_", decodeBytes(e("_")));
    	assertEquals("`", decodeBytes(e("`")));
    	assertEquals("a", decodeBytes(e("a")));
    	assertEquals("b", decodeBytes(e("b")));
    	assertEquals("c", decodeBytes(e("c")));
    	assertEquals("d", decodeBytes(e("d")));
    	assertEquals("e", decodeBytes(e("e")));
    	assertEquals("f", decodeBytes(e("f")));
    	assertEquals("g", decodeBytes(e("g")));
    	assertEquals("h", decodeBytes(e("h")));
    	assertEquals("i", decodeBytes(e("i")));
    	assertEquals("j", decodeBytes(e("j")));
    	assertEquals("k", decodeBytes(e("k")));
    	assertEquals("l", decodeBytes(e("l")));
    	assertEquals("m", decodeBytes(e("m")));
    	assertEquals("n", decodeBytes(e("n")));
    	assertEquals("o", decodeBytes(e("o")));
    	assertEquals("p", decodeBytes(e("p")));
    	assertEquals("q", decodeBytes(e("q")));
    	assertEquals("r", decodeBytes(e("r")));
    	assertEquals("s", decodeBytes(e("s")));
    	assertEquals("t", decodeBytes(e("t")));
    	assertEquals("u", decodeBytes(e("u")));
    	assertEquals("v", decodeBytes(e("v")));
    	assertEquals("w", decodeBytes(e("w")));
    	assertEquals("x", decodeBytes(e("x")));
    	assertEquals("y", decodeBytes(e("y")));
    	assertEquals("z", decodeBytes(e("z")));
    	assertEquals("{", decodeBytes(e("{")));
    	assertEquals("|", decodeBytes(e("|")));
    	assertEquals("}", decodeBytes(e("}")));
    }
}
