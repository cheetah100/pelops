package org.wyki.cassandra.pelops.keys;

import org.wyki.cassandra.pelops.NumberHelper;

/**
 * Created by IntelliJ IDEA.
 * User: peter
 * Date: 15/07/2010
 * Time: 9:09:41 AM
 * To change this template use File | Settings | File Templates.
 */
public class IntegerKey implements Key {

    private final int integerKey;

    public IntegerKey( int value ) {
        this.integerKey = value;
    }

    @Override
    public byte[] getBytes() {
        return NumberHelper.toBytes(this.integerKey);
    }

    public String toString() {
        return Integer.toString( this.integerKey );
    }



}
