package org.wyki.cassandra.pelops.keys;

import org.wyki.cassandra.pelops.NumberHelper;

/**
 * Created by IntelliJ IDEA.
 * User: peter
 * Date: 15/07/2010
 * Time: 8:53:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class LongKey implements Key {

    private final long longKey;

    public LongKey( long value ) {
        this.longKey = value;
    }

    @Override
    public byte[] getBytes() {
        return NumberHelper.toBytes(this.longKey);
    }

    public long getLong() {
        return this.longKey;
    }

    @Override
    public String toString() {
        return Long.toString(this.longKey);
    }

}
