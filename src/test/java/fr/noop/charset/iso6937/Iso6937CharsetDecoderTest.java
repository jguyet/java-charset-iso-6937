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

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.*;
import org.junit.*;

import fr.noop.charset.IsoCharsets;

/**
 * Created by clebeaupin on 29/09/15.
 */
@SuppressWarnings("restriction")
public class Iso6937CharsetDecoderTest {

    private String decodeBytes(byte[] bytes) throws UnsupportedEncodingException {
            return new String(bytes, IsoCharsets.ISO_6937);
    }
    
	private byte[] h(String s) {
    	return DatatypeConverter.parseHexBinary(s);
    }

    private String decode(String in) throws UnsupportedEncodingException {
        return decodeBytes(in.getBytes());
    }

    @Test
    public void testAscii() throws UnsupportedEncodingException {
        assertEquals("abcdefghijklmnopqrstuvwxyz", decode("abcdefghijklmnopqrstuvwxyz"));
        assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZ", decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void testGraveAccent() throws UnsupportedEncodingException {
        assertEquals("À", decodeBytes(h("c141")));
        assertEquals("È", decodeBytes(h("c145")));
        assertEquals("Ì", decodeBytes(h("c149")));
        assertEquals("Ò", decodeBytes(h("c14f")));
        assertEquals("Ù", decodeBytes(h("c155")));
        assertEquals("à", decodeBytes(h("c161")));
        assertEquals("è", decodeBytes(h("c165")));
        assertEquals("ì", decodeBytes(h("c169")));
        assertEquals("ò", decodeBytes(h("c16f")));
        assertEquals("ù", decodeBytes(h("c175")));
    }

    @Test
    public void testAcuteAccent() throws UnsupportedEncodingException {
        assertEquals("Á", decodeBytes(h("c241")));
        assertEquals("Ć", decodeBytes(h("c243")));
        assertEquals("É", decodeBytes(h("c245")));
        assertEquals("Í", decodeBytes(h("c249")));
        assertEquals("Ĺ", decodeBytes(h("c24c")));
        assertEquals("Ń", decodeBytes(h("c24e")));
        assertEquals("Ó", decodeBytes(h("c24f")));
        assertEquals("Ŕ", decodeBytes(h("c252")));
        assertEquals("Ś", decodeBytes(h("c253")));
        assertEquals("Ú", decodeBytes(h("c255")));
        assertEquals("Ý", decodeBytes(h("c259")));
        assertEquals("Ź", decodeBytes(h("c25a")));
        assertEquals("á", decodeBytes(h("c261")));
        assertEquals("ć", decodeBytes(h("c263")));
        assertEquals("é", decodeBytes(h("c265")));
        assertEquals("í", decodeBytes(h("c269")));
        assertEquals("ĺ", decodeBytes(h("c26c")));
        assertEquals("ń", decodeBytes(h("c26e")));
        assertEquals("ó", decodeBytes(h("c26f")));
        assertEquals("ŕ", decodeBytes(h("c272")));
        assertEquals("ś", decodeBytes(h("c273")));
        assertEquals("ú", decodeBytes(h("c275")));
        assertEquals("ý", decodeBytes(h("c279")));
        assertEquals("ź", decodeBytes(h("c27a")));
    }

    @Test
    public void testCircumflexAccent() throws UnsupportedEncodingException {
        assertEquals("Â", decodeBytes(h("c341")));
        assertEquals("Ĉ", decodeBytes(h("c343")));
        assertEquals("Ê", decodeBytes(h("c345")));
        assertEquals("Ĝ", decodeBytes(h("c347")));
        assertEquals("Ĥ", decodeBytes(h("c348")));
        assertEquals("Î", decodeBytes(h("c349")));
        assertEquals("Ĵ", decodeBytes(h("c34a")));
        assertEquals("Ô", decodeBytes(h("c34f")));
        assertEquals("Ŝ", decodeBytes(h("c353")));
        assertEquals("Û", decodeBytes(h("c355")));
        assertEquals("Ŵ", decodeBytes(h("c357")));
        assertEquals("Ŷ", decodeBytes(h("c359")));
        assertEquals("â", decodeBytes(h("c361")));
        assertEquals("ĉ", decodeBytes(h("c363")));
        assertEquals("ê", decodeBytes(h("c365")));
        assertEquals("ĝ", decodeBytes(h("c367")));
        assertEquals("ĥ", decodeBytes(h("c368")));
        assertEquals("î", decodeBytes(h("c369")));
        assertEquals("ĵ", decodeBytes(h("c36a")));
        assertEquals("ô", decodeBytes(h("c36f")));
        assertEquals("ŝ", decodeBytes(h("c373")));
        assertEquals("û", decodeBytes(h("c375")));
        assertEquals("ŵ", decodeBytes(h("c377")));
        assertEquals("ŷ", decodeBytes(h("c379")));
    }

    @Test
    public void testTildeAccent() throws UnsupportedEncodingException {
        assertEquals("Ã", decodeBytes(h("c441")));
        assertEquals("Ĩ", decodeBytes(h("c449")));
        assertEquals("Ñ", decodeBytes(h("c44e")));
        assertEquals("Õ", decodeBytes(h("c44f")));
        assertEquals("Ũ", decodeBytes(h("c455")));
        assertEquals("ã", decodeBytes(h("c461")));
        assertEquals("ĩ", decodeBytes(h("c469")));
        assertEquals("ñ", decodeBytes(h("c46e")));
        assertEquals("õ", decodeBytes(h("c46f")));
        assertEquals("ũ", decodeBytes(h("c475")));
    }

    @Test
    public void testMacronAccent() throws UnsupportedEncodingException {
        assertEquals("Ā", decodeBytes(h("c541")));
        assertEquals("Ē", decodeBytes(h("c545")));
        assertEquals("Ī", decodeBytes(h("c549")));
        assertEquals("Ō", decodeBytes(h("c54f")));
        assertEquals("Ū", decodeBytes(h("c555")));
        assertEquals("ā", decodeBytes(h("c561")));
        assertEquals("ē", decodeBytes(h("c565")));
        assertEquals("ī", decodeBytes(h("c569")));
        assertEquals("ō", decodeBytes(h("c56f")));
        assertEquals("ū", decodeBytes(h("c575")));
    }

    @Test
    public void testBreveAccent() throws UnsupportedEncodingException {
        assertEquals("Ă", decodeBytes(h("c641")));
        assertEquals("Ğ", decodeBytes(h("c647")));
        assertEquals("Ŭ", decodeBytes(h("c655")));
        assertEquals("ă", decodeBytes(h("c661")));
        assertEquals("ğ", decodeBytes(h("c667")));
        assertEquals("ŭ", decodeBytes(h("c675")));
    }

    @Test
    public void testDotAccent() throws UnsupportedEncodingException {
        assertEquals("Ċ", decodeBytes(h("c743")));
        assertEquals("Ė", decodeBytes(h("c745")));
        assertEquals("Ġ", decodeBytes(h("c747")));
        assertEquals("İ", decodeBytes(h("c749")));
        assertEquals("Ż", decodeBytes(h("c75a")));
        assertEquals("ċ", decodeBytes(h("c763")));
        assertEquals("ė", decodeBytes(h("c765")));
        assertEquals("ġ", decodeBytes(h("c767")));
        assertEquals("ż", decodeBytes(h("c77a")));
    }

    @Test
    public void testUmlautAccent() throws UnsupportedEncodingException {
        assertEquals("Ä", decodeBytes(h("c841")));
        assertEquals("Ë", decodeBytes(h("c845")));
        assertEquals("Ï", decodeBytes(h("c849")));
        assertEquals("Ö", decodeBytes(h("c84f")));
        assertEquals("Ü", decodeBytes(h("c855")));
        assertEquals("Ÿ", decodeBytes(h("c859")));
        assertEquals("ä", decodeBytes(h("c861")));
        assertEquals("ë", decodeBytes(h("c865")));
        assertEquals("ï", decodeBytes(h("c869")));
        assertEquals("ö", decodeBytes(h("c86f")));
        assertEquals("ü", decodeBytes(h("c875")));
        assertEquals("ÿ", decodeBytes(h("c879")));
    }

    @Test
    public void testRingAccent() throws UnsupportedEncodingException {
        assertEquals("Å", decodeBytes(h("ca41")));
        assertEquals("Ů", decodeBytes(h("ca55")));
        assertEquals("å", decodeBytes(h("ca61")));
        assertEquals("ů", decodeBytes(h("ca75")));
    }

    @Test
    public void testCedillaAccent() throws UnsupportedEncodingException {
        assertEquals("Ç", decodeBytes(h("cb43")));
        assertEquals("Ģ", decodeBytes(h("cb47")));
        assertEquals("Ķ", decodeBytes(h("cb4b")));
        assertEquals("Ļ", decodeBytes(h("cb4c")));
        assertEquals("Ņ", decodeBytes(h("cb4e")));
        assertEquals("Ŗ", decodeBytes(h("cb52")));
        assertEquals("Ş", decodeBytes(h("cb53")));
        assertEquals("Ţ", decodeBytes(h("cb54")));
        assertEquals("ç", decodeBytes(h("cb63")));
        assertEquals("ģ", decodeBytes(h("cb67")));
        assertEquals("ķ", decodeBytes(h("cb6b")));
        assertEquals("ļ", decodeBytes(h("cb6c")));
        assertEquals("ņ", decodeBytes(h("cb6e")));
        assertEquals("ŗ", decodeBytes(h("cb72")));
        assertEquals("ş", decodeBytes(h("cb73")));
        assertEquals("ţ", decodeBytes(h("cb74")));
    }

    @Test
    public void testDoubleAcuteAccent() throws UnsupportedEncodingException {
        assertEquals("Ő", decodeBytes(h("cd4f")));
        assertEquals("Ű", decodeBytes(h("cd55")));
        assertEquals("ő", decodeBytes(h("cd6f")));
        assertEquals("ű", decodeBytes(h("cd75")));
    }

    @Test
    public void testOgonekAccent() throws UnsupportedEncodingException {
        assertEquals("Ą", decodeBytes(h("ce41")));
        assertEquals("Ę", decodeBytes(h("ce45")));
        assertEquals("Į", decodeBytes(h("ce49")));
        assertEquals("Ų", decodeBytes(h("ce55")));
        assertEquals("ą", decodeBytes(h("ce61")));
        assertEquals("ę", decodeBytes(h("ce65")));
        assertEquals("į", decodeBytes(h("ce69")));
        assertEquals("ų", decodeBytes(h("ce75")));
    }

    @Test
    public void testCaronAccent() throws UnsupportedEncodingException {
        assertEquals("Č", decodeBytes(h("cf43")));
        assertEquals("Ď", decodeBytes(h("cf44")));
        assertEquals("Ě", decodeBytes(h("cf45")));
        assertEquals("Ľ", decodeBytes(h("cf4c")));
        assertEquals("Ň", decodeBytes(h("cf4e")));
        assertEquals("Ř", decodeBytes(h("cf52")));
        assertEquals("Š", decodeBytes(h("cf53")));
        assertEquals("Ť", decodeBytes(h("cf54")));
        assertEquals("Ž", decodeBytes(h("cf5a")));
        assertEquals("č", decodeBytes(h("cf63")));
        assertEquals("ď", decodeBytes(h("cf64")));
        assertEquals("ě", decodeBytes(h("cf65")));
        assertEquals("ľ", decodeBytes(h("cf6c")));
        assertEquals("ň", decodeBytes(h("cf6e")));
        assertEquals("ř", decodeBytes(h("cf72")));
        assertEquals("š", decodeBytes(h("cf73")));
        assertEquals("ť", decodeBytes(h("cf74")));
        assertEquals("ž", decodeBytes(h("cf7a")));
    }

    @Test
    public void testSpecialChars() throws UnsupportedEncodingException {
    	assertEquals("¤", new String(h("24"), IsoCharsets.ISO_6937));
        assertEquals("®", decodeBytes(h("d2")));
        assertEquals("©", decodeBytes(h("d3")));
        assertEquals("¬", decodeBytes(h("d6")));
        assertEquals("¦", decodeBytes(h("d7")));
        assertEquals("ª", decodeBytes(h("e3")));
        assertEquals("\u00ad", decodeBytes(h("ff")));
    }
}
