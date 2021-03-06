/**
 * Created by alexandru on 7/1/16.
 */
package jlg.jade.test.asterix.cat034;

import jlg.jade.asterix.cat034.Cat034Item110;
import jlg.jade.test.utils.MandatoryFixedLengthAsterixTests;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Cat034Item110Test extends MandatoryFixedLengthAsterixTests<Cat034Item110> {
    @Override
    protected int setExpectedItemSizeInBytes() {
        return 1;
    }

    @Override
    protected Cat034Item110 setFixedLengthAsterixDataInstance() {
        return new Cat034Item110();
    }

    @Test
    public void the_decode_method_should_correctly_decode_data(){
        // arrange
        byte[] input = {1};
        int offset = 0;
        Cat034Item110 item110 = new Cat034Item110();

        // act
        item110.decode(input, offset, input.length);

        // assert
        assertEquals("Item not decoded correctly", 1, item110.getDataFilter() );
    }
}
