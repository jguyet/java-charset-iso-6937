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

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.List;

/**
 * Created by clebeaupin on 28/09/2015.
 * Updated by jguyet on 08/07/2019.
 */
public class Iso6937Charset extends Charset {
    private static final List<String> CONTAINED = Arrays.asList(new String[] { "US-ASCII" });
    
    /**
     * @param canonicalName The name as defined in java.nio.charset.Charset
     * @param aliases The aliases as defined in java.nio.charset.Charset
     */
    public Iso6937Charset(String canonicalName, String[] aliases) {
        super(canonicalName, aliases);
    }
    
    /**
     * @param canonicalName The name as defined in java.nio.charset.Charset
     */
    public Iso6937Charset(String canonicalName) {
        super(canonicalName, new String[] {});
    }

    /**
     * {@inheritDoc}
     */
    public boolean contains(final Charset cs) {
        return CONTAINED.contains(cs.name());
    }

    /**
     * {@inheritDoc}
     */
    public CharsetDecoder newDecoder() {
        return new Iso6937CharsetDecoder(this);
    }

    /**
     * {@inheritDoc}
     */
    public CharsetEncoder newEncoder() {
        return new Iso6937CharsetEncoder(this);
    }
}