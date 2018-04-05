package com.p2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class UserTest {
    User user;



    @Before
    public void setUp() throws Exception {
         user = new User(29);
        System.out.println(user.getAge());
    }

    @After
    public void tearDown() throws Exception {
//         user = new User(0);
        System.out.println(user.getAge());
    }

    @Test
    public void whenGrowThenAgeIncrement() throws Exception {
        int result = user.grow();
        assertThat(30, is(result));
    }

    @Test
    public void whenGrowThenAgeIncrement2() throws Exception {
        int result = user.grow2();
        assertThat(31, is(result));
    }

    @Test
    public void whenStatusTrue() throws Exception {
        user.setStatus(true);
        assertTrue(user.isStatus());
    }

}