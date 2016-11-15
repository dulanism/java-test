package org.dulani.wallace;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dulaniwallace on 11/9/16.
 */
public class Testapp {
    @Test
    public void testLengthOfTheUniqueKey() {
        app obj = new app();

        Assert.assertEquals(70, obj.generateUniqueKey().length());
    }
}
