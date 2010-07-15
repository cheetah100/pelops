package org.wyki.cassandra.pelops.keys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peter
 * Date: 15/07/2010
 * Time: 9:33:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class CompositeKey implements Key {

    private final List<Key> keys;

    public CompositeKey( List<Key> keys ){
        this.keys = keys;
    }

    @Override
    public byte[] getBytes() {

        int size = 0;
        List<byte[]> byteArrays = new ArrayList<byte[]>();
        for( Key key : keys ){
            byte[] byteArray = key.getBytes();
            size = size + byteArray.length;
            byteArrays.add(byteArray);
        }

        byte[] result = new byte[ size ];
        int position = 0;
        for( byte[] byteArray: byteArrays){
            System.arraycopy( byteArray, 0, result, position, byteArray.length);
            position = position + byteArray.length;
        }

        return result;
    }

    public List<Key> getKeyList() {
        return this.keys;
    }

    public String toString() {

        boolean first = true;
        StringBuilder result = new StringBuilder();
        for( Key key : this.keys) {
            if( !first ){
                result.append(", ");
            }
            result.append(key.toString());
            first = false;
        }
        return result.toString();
    }

}
