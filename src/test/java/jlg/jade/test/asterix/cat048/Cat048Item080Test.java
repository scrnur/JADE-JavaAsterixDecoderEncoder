/**
 * Created by alexandru on 7/11/16.
 */
package jlg.jade.test.asterix.cat048;

import jlg.jade.asterix.cat048.Cat048Item080;
import jlg.jade.test.utils.MandatoryFixedLengthAsterixTests;

public class Cat048Item080Test extends MandatoryFixedLengthAsterixTests<Cat048Item080> {
    @Override
    protected int setExpectedItemSizeInBytes() {
        return 2;
    }

    @Override
    protected Cat048Item080 setFixedLengthAsterixDataInstance() {
        return new Cat048Item080();
    }
}
