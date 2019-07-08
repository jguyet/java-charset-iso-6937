package fr.noop.charset;

import java.nio.charset.Charset;

import fr.noop.charset.iso6937.Iso6937Charset;

public class IsoCharsets {

	static {
		new Iso6937Charset("ISO-6937", new String[] { "ISO-6937-2" });
	}
	
	public static Charset ISO_6937 = Charset.forName("ISO-6937");
}
