package org.wyki.cassandra.pelops.keys;

import org.wyki.cassandra.pelops.UuidHelper;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * User: peter
 * Date: 15/07/2010
 * Time: 8:54:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class UuidKey implements Key {

    private final UUID uuidKey;

    public UuidKey( UUID value ){
        this.uuidKey = value;
    }

    public UuidKey( String value ){
        this.uuidKey = UUID.fromString(value);
    }

    @Override
    public byte[] getBytes() {
        return UuidHelper.timeUuidToBytes(this.uuidKey);
    }

    public UUID getUuid(){
        return this.uuidKey;
    }

    @Override
    public String toString(){
        return this.uuidKey.toString();
    }

}
