package org.wyki.cassandra.pelops.keys;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: peter
 * Date: 15/07/2010
 * Time: 8:54:42 AM
 * To change this template use File | Settings | File Templates.
 */
public class ByteKey implements Key {

    private final byte[] bytes;

    public ByteKey( byte[] value){
        this.bytes = value;
    }

    @Override
    public byte[] getBytes() {
        return this.bytes;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.bytes);
    }
    
}
