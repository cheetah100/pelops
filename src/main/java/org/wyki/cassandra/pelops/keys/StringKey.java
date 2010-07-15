package org.wyki.cassandra.pelops.keys;

import org.wyki.cassandra.pelops.StringHelper;

/**
 * Created by IntelliJ IDEA.
 * User: peter
 * Date: 15/07/2010
 * Time: 8:52:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class StringKey implements Key {

    private final String stringKey;

    public StringKey( String value ){
        this.stringKey = value;
    }

    @Override
    public byte[] getBytes() {
        return StringHelper.toBytes(this.stringKey); 
    }

    @Override
    public String toString() {
        return this.stringKey;
    }
    
}
