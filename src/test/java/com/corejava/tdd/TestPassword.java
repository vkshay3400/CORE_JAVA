package com.corejava.tdd;

import org.junit.Assert;
import org.junit.Test;

public class TestPassword {

    @Test
    public void givenTestPassword() {
        PasswordValidator pv = new PasswordValidator();
        Assert.assertEquals(false, pv.isValid("ABC"));
    }
}