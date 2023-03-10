package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private ArrayList<City> cityList = new ArrayList<>();

    @Test
    public void testAddCity() {
        CustomList list = new CustomList(null, cityList);
        City city = new City("Edmonton","AB");
        list.addCity(city);
        assertEquals(1,list.getCount());

    }

    @Test
    public void testHasCity() {
        CustomList list = new CustomList(null, cityList);
        City city1 = new City("Regina", "Saskatchewan");
        City city2 = new City("Edmonton", "AB");
        list.add(city1);
        assertTrue(list.hasCity(city1));
        assertFalse(list.hasCity(city2));
    }

}
