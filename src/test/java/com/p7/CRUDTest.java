package com.p7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CRUDTest {
    private CRUD crud;
    private Entity entity;

    @Before
    public void setUp() throws Exception {
        crud = new CRUD();
        entity = new Entity();
        entity.setId(1);
    }

    @Test
    public void testCreate() throws Exception {
        assertTrue(crud.create(entity));
    }

    @Test
    public void testRead() throws Exception {
        crud.create(entity);
        assertNotNull(crud.read(1));
    }

    @Test
    public void testUpdate() throws Exception {
        crud.create(entity);
        assertTrue(crud.update(entity));
    }

    @Test
    public void testDelete() throws Exception {
        crud.create(entity);
        assertTrue(crud.delete(1));
    }
}