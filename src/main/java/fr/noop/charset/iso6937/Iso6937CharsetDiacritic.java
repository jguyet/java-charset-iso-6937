package fr.noop.charset.iso6937;

import java.util.HashMap;

/**
 * Updated by jguyet on 09/07/2019.
 */
public class Iso6937CharsetDiacritic {
	private static HashMap<Integer, Integer> encodingMapping = new HashMap<Integer, Integer>();
    private static HashMap<Integer, Integer> decodingMapping = new HashMap<Integer, Integer>();

    static {
		//Diacritics Two byte characters example : (é) = [Acute]+e
	 	add(0x300, 0xc1);// Grave      Second Chars : AEIOUaeiou                result: ÀÈÌÒÙàèìòù
        add(0x301, 0xc2);// Acute      Second Chars : ACEILNORSUYZacegilnorsuyz result: ÁĆÉÍĹŃÓŔŚÚÝŹáćéģíĺńóŕśúýź
        add(0x302, 0xc3);// Circumflex Second Chars : ACEILNORSUYZacegilnorsuyz result: ÂĈÊĜĤÎĴÔŜÛŴŶâĉêĝĥîĵôŝûŵŷ
        add(0x303, 0xc4);// Tilde      Second Chars : AEIOUaeiou                result: ĀĒĪŌŪāēīōū
        add(0x304, 0xc5);// Macron     Second Chars : AEIOUaeiou                result: ĀĒĪŌŪāēīōū
        add(0x306, 0xc6);// Breve      Second Chars : AGUagu                    result: ĂĞŬăğŭ
        add(0x307, 0xc7);// Dot        Second Chars : CEGIZcegz                 result: ĊĖĠİŻċėġż
        add(0x308, 0xc8);// Umlaut or diæresis ...s : AEIOUYaeiouy              result: ÄËÏÖÜŸäëïöüÿ
        add(0x30a, 0xca);// Ring       Second Chars : AUau                      result: ÅŮåů
        add(0x327, 0xcb);// Cedilla    Second Chars : CGKLNRSTcklnrst           result: ÇĢĶĻŅŖŞŢçķļņŗşţ
        add(0x30b, 0xcd);// DoubleAcute ...nd Chars : OUou                      result: ŐŰőű
        add(0x328, 0xce);// Ogonek     Second Chars : AEIUaeiu                  result: ĄĘĮŲąęįų
        add(0x30c, 0xcf);// Caron      Second Chars : CDELNRSTZcdelnrstz        result: ČĎĚĽŇŘŠŤŽčďěľňřšťž
    }

    public static void add(int x, int y) {
        encodingMapping.put(x, y);
        decodingMapping.put(y, x);
    }

    public static int encode(int x) {
        if (!encodingMapping.containsKey(x)) {
            // Do not encode this char
            return x;
        }
        return encodingMapping.get(x);
    }

    public static int decode(int y) {
        if (!decodingMapping.containsKey(y)) {
            // Do not decode this char
            return y;
        }
        return decodingMapping.get(y);
    }
}
