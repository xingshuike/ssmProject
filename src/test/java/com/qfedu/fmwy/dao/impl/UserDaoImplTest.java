package com.qfedu.fmwy.dao.impl;

import org.junit.Test;

public class UserDaoImplTest {

    @Test
    public void insert() {
        int i = 0;
        boolean a = true ;
        while (a) {

            i++;
            if (i>10){
                a = false;
            }
            break;
        }
        System.out.println(i);
    }
}