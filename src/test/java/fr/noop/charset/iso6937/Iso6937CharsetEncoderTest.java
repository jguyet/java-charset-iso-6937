/*
 *  This file is part of the noOp organization .
 *
 *  (c) Cyrille Lebeaupin <clebeaupin@noop.fr>
 *
 *  For the full copyright and license information, please view the LICENSE
 *  file that was distributed with this source code.
 *
 */

package fr.noop.charset.iso6937;

import java.io.UnsupportedEncodingException;
import javax.xml.bind.DatatypeConverter;
import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.*;

import fr.noop.charset.IsoCharsets;

/**
 * Created by clebeaupin on 29/09/15.
 */
@SuppressWarnings("restriction")
public class Iso6937CharsetEncoderTest {

    private String encode(String in) throws UnsupportedEncodingException {
        return new String(in.getBytes(IsoCharsets.ISO_6937), "US-ASCII");
    }
    
	private byte[] h(String s) {
    	return DatatypeConverter.parseHexBinary(s);
    }
    
    private byte[] e(String s) {
    	return s.getBytes(IsoCharsets.ISO_6937);
    }

    @Test
    public void testAscii() throws UnsupportedEncodingException {
        assertEquals("abcdefghijklmnopqrstuvwxyz", encode("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void testGraveAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c141"), e("À")));
        assertTrue(Arrays.equals(h("c145"), e("È")));
        assertTrue(Arrays.equals(h("c149"), e("Ì")));
        assertTrue(Arrays.equals(h("c14f"), e("Ò")));
        assertTrue(Arrays.equals(h("c155"), e("Ù")));
        assertTrue(Arrays.equals(h("c161"), e("à")));
        assertTrue(Arrays.equals(h("c165"), e("è")));
        assertTrue(Arrays.equals(h("c169"), e("ì")));
        assertTrue(Arrays.equals(h("c16f"), e("ò")));
        assertTrue(Arrays.equals(h("c175"), e("ù")));
    }

    @Test
    public void testAcuteAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c241"), e("Á")));
        assertTrue(Arrays.equals(h("c243"), e("Ć")));
        assertTrue(Arrays.equals(h("c245"), e("É")));
        assertTrue(Arrays.equals(h("c249"), e("Í")));
        assertTrue(Arrays.equals(h("c24c"), e("Ĺ")));
        assertTrue(Arrays.equals(h("c24e"), e("Ń")));
        assertTrue(Arrays.equals(h("c24f"), e("Ó")));
        assertTrue(Arrays.equals(h("c252"), e("Ŕ")));
        assertTrue(Arrays.equals(h("c253"), e("Ś")));
        assertTrue(Arrays.equals(h("c255"), e("Ú")));
        assertTrue(Arrays.equals(h("c259"), e("Ý")));
        assertTrue(Arrays.equals(h("c25a"), e("Ź")));
        assertTrue(Arrays.equals(h("c261"), e("á")));
        assertTrue(Arrays.equals(h("c263"), e("ć")));
        assertTrue(Arrays.equals(h("c265"), e("é")));
        assertTrue(Arrays.equals(h("c269"), e("í")));
        assertTrue(Arrays.equals(h("c26c"), e("ĺ")));
        assertTrue(Arrays.equals(h("c26e"), e("ń")));
        assertTrue(Arrays.equals(h("c26f"), e("ó")));
        assertTrue(Arrays.equals(h("c272"), e("ŕ")));
        assertTrue(Arrays.equals(h("c273"), e("ś")));
        assertTrue(Arrays.equals(h("c275"), e("ú")));
        assertTrue(Arrays.equals(h("c279"), e("ý")));
        assertTrue(Arrays.equals(h("c27a"), e("ź")));
    }

    @Test
    public void testCircumflexAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c341"), e("Â")));
        assertTrue(Arrays.equals(h("c343"), e("Ĉ")));
        assertTrue(Arrays.equals(h("c345"), e("Ê")));
        assertTrue(Arrays.equals(h("c347"), e("Ĝ")));
        assertTrue(Arrays.equals(h("c348"), e("Ĥ")));
        assertTrue(Arrays.equals(h("c349"), e("Î")));
        assertTrue(Arrays.equals(h("c34a"), e("Ĵ")));
        assertTrue(Arrays.equals(h("c34f"), e("Ô")));
        assertTrue(Arrays.equals(h("c353"), e("Ŝ")));
        assertTrue(Arrays.equals(h("c355"), e("Û")));
        assertTrue(Arrays.equals(h("c357"), e("Ŵ")));
        assertTrue(Arrays.equals(h("c359"), e("Ŷ")));
        assertTrue(Arrays.equals(h("c361"), e("â")));
        assertTrue(Arrays.equals(h("c363"), e("ĉ")));
        assertTrue(Arrays.equals(h("c365"), e("ê")));
        assertTrue(Arrays.equals(h("c367"), e("ĝ")));
        assertTrue(Arrays.equals(h("c368"), e("ĥ")));
        assertTrue(Arrays.equals(h("c369"), e("î")));
        assertTrue(Arrays.equals(h("c36a"), e("ĵ")));
        assertTrue(Arrays.equals(h("c36f"), e("ô")));
        assertTrue(Arrays.equals(h("c373"), e("ŝ")));
        assertTrue(Arrays.equals(h("c375"), e("û")));
        assertTrue(Arrays.equals(h("c377"), e("ŵ")));
        assertTrue(Arrays.equals(h("c379"), e("ŷ")));
    }

    @Test
    public void testTildeAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c441"), e("Ã")));
        assertTrue(Arrays.equals(h("c449"), e("Ĩ")));
        assertTrue(Arrays.equals(h("c44e"), e("Ñ")));
        assertTrue(Arrays.equals(h("c44f"), e("Õ")));
        assertTrue(Arrays.equals(h("c455"), e("Ũ")));
        assertTrue(Arrays.equals(h("c461"), e("ã")));
        assertTrue(Arrays.equals(h("c469"), e("ĩ")));
        assertTrue(Arrays.equals(h("c46e"), e("ñ")));
        assertTrue(Arrays.equals(h("c46f"), e("õ")));
        assertTrue(Arrays.equals(h("c475"), e("ũ")));
    }

    @Test
    public void testMacronAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c541"), e("Ā")));
        assertTrue(Arrays.equals(h("c545"), e("Ē")));
        assertTrue(Arrays.equals(h("c549"), e("Ī")));
        assertTrue(Arrays.equals(h("c54f"), e("Ō")));
        assertTrue(Arrays.equals(h("c555"), e("Ū")));
        assertTrue(Arrays.equals(h("c561"), e("ā")));
        assertTrue(Arrays.equals(h("c565"), e("ē")));
        assertTrue(Arrays.equals(h("c569"), e("ī")));
        assertTrue(Arrays.equals(h("c56f"), e("ō")));
        assertTrue(Arrays.equals(h("c575"), e("ū")));
    }

    @Test
    public void testBreveAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c641"), e("Ă")));
        assertTrue(Arrays.equals(h("c647"), e("Ğ")));
        assertTrue(Arrays.equals(h("c655"), e("Ŭ")));
        assertTrue(Arrays.equals(h("c661"), e("ă")));
        assertTrue(Arrays.equals(h("c667"), e("ğ")));
        assertTrue(Arrays.equals(h("c675"), e("ŭ")));
    }

    @Test
    public void testDotAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c743"), e("Ċ")));
        assertTrue(Arrays.equals(h("c745"), e("Ė")));
        assertTrue(Arrays.equals(h("c747"), e("Ġ")));
        assertTrue(Arrays.equals(h("c749"), e("İ")));
        assertTrue(Arrays.equals(h("c75a"), e("Ż")));
        assertTrue(Arrays.equals(h("c763"), e("ċ")));
        assertTrue(Arrays.equals(h("c765"), e("ė")));
        assertTrue(Arrays.equals(h("c767"), e("ġ")));
        assertTrue(Arrays.equals(h("c77a"), e("ż")));
    }

    @Test
    public void testUmlautAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("c841"), e("Ä")));
        assertTrue(Arrays.equals(h("c845"), e("Ë")));
        assertTrue(Arrays.equals(h("c849"), e("Ï")));
        assertTrue(Arrays.equals(h("c84f"), e("Ö")));
        assertTrue(Arrays.equals(h("c855"), e("Ü")));
        assertTrue(Arrays.equals(h("c859"), e("Ÿ")));
        assertTrue(Arrays.equals(h("c861"), e("ä")));
        assertTrue(Arrays.equals(h("c865"), e("ë")));
        assertTrue(Arrays.equals(h("c869"), e("ï")));
        assertTrue(Arrays.equals(h("c86f"), e("ö")));
        assertTrue(Arrays.equals(h("c875"), e("ü")));
        assertTrue(Arrays.equals(h("c879"), e("ÿ")));
    }

    @Test
    public void testRingAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("ca41"), e("Å")));
        assertTrue(Arrays.equals(h("ca55"), e("Ů")));
        assertTrue(Arrays.equals(h("ca61"), e("å")));
        assertTrue(Arrays.equals(h("ca75"), e("ů")));
    }

    @Test
    public void testCedillaAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("cb43"), e("Ç")));
        assertTrue(Arrays.equals(h("cb47"), e("Ģ")));
        assertTrue(Arrays.equals(h("cb4b"), e("Ķ")));
        assertTrue(Arrays.equals(h("cb4c"), e("Ļ")));
        assertTrue(Arrays.equals(h("cb4e"), e("Ņ")));
        assertTrue(Arrays.equals(h("cb52"), e("Ŗ")));
        assertTrue(Arrays.equals(h("cb53"), e("Ş")));
        assertTrue(Arrays.equals(h("cb54"), e("Ţ")));
        assertTrue(Arrays.equals(h("cb63"), e("ç")));
        assertTrue(Arrays.equals(h("cb67"), e("ģ")));
        assertTrue(Arrays.equals(h("cb6b"), e("ķ")));
        assertTrue(Arrays.equals(h("cb6c"), e("ļ")));
        assertTrue(Arrays.equals(h("cb6e"), e("ņ")));
        assertTrue(Arrays.equals(h("cb72"), e("ŗ")));
        assertTrue(Arrays.equals(h("cb73"), e("ş")));
        assertTrue(Arrays.equals(h("cb74"), e("ţ")));
    }

    @Test
    public void testDoubleAcuteAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("cd4f"), e("Ő")));
        assertTrue(Arrays.equals(h("cd55"), e("Ű")));
        assertTrue(Arrays.equals(h("cd6f"), e("ő")));
        assertTrue(Arrays.equals(h("cd75"), e("ű")));
    }

    @Test
    public void testOgonekAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("ce41"), e("Ą")));
        assertTrue(Arrays.equals(h("ce45"), e("Ę")));
        assertTrue(Arrays.equals(h("ce49"), e("Į")));
        assertTrue(Arrays.equals(h("ce55"), e("Ų")));
        assertTrue(Arrays.equals(h("ce61"), e("ą")));
        assertTrue(Arrays.equals(h("ce65"), e("ę")));
        assertTrue(Arrays.equals(h("ce69"), e("į")));
        assertTrue(Arrays.equals(h("ce75"), e("ų")));
    }

    @Test
    public void testCaronAccent() throws UnsupportedEncodingException {
        assertTrue(Arrays.equals(h("cf43"), e("Č")));
        assertTrue(Arrays.equals(h("cf44"), e("Ď")));
        assertTrue(Arrays.equals(h("cf45"), e("Ě")));
        assertTrue(Arrays.equals(h("cf4c"), e("Ľ")));
        assertTrue(Arrays.equals(h("cf4e"), e("Ň")));
        assertTrue(Arrays.equals(h("cf52"), e("Ř")));
        assertTrue(Arrays.equals(h("cf53"), e("Š")));
        assertTrue(Arrays.equals(h("cf54"), e("Ť")));
        assertTrue(Arrays.equals(h("cf5a"), e("Ž")));
        assertTrue(Arrays.equals(h("cf63"), e("č")));
        assertTrue(Arrays.equals(h("cf64"), e("ď")));
        assertTrue(Arrays.equals(h("cf65"), e("ě")));
        assertTrue(Arrays.equals(h("cf6c"), e("ľ")));
        assertTrue(Arrays.equals(h("cf6e"), e("ň")));
        assertTrue(Arrays.equals(h("cf72"), e("ř")));
        assertTrue(Arrays.equals(h("cf73"), e("š")));
        assertTrue(Arrays.equals(h("cf74"), e("ť")));
        assertTrue(Arrays.equals(h("cf7a"), e("ž")));
    }

    @Test
    public void testSpecialChars() throws UnsupportedEncodingException {
    	assertTrue(Arrays.equals(h("24"), "¤".getBytes(IsoCharsets.ISO_6937)));
        assertTrue(Arrays.equals(h("d2"), "®".getBytes(IsoCharsets.ISO_6937)));
        assertTrue(Arrays.equals(h("d3"), "©".getBytes(IsoCharsets.ISO_6937)));
        assertTrue(Arrays.equals(h("d6"), "¬".getBytes(IsoCharsets.ISO_6937)));
        assertTrue(Arrays.equals(h("d7"), "¦".getBytes(IsoCharsets.ISO_6937)));
        assertTrue(Arrays.equals(h("e3"), "ª".getBytes(IsoCharsets.ISO_6937)));
        assertTrue(Arrays.equals(h("ff"), "\u00ad".getBytes(IsoCharsets.ISO_6937)));
    }
}
