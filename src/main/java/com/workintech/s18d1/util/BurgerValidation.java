package com.workintech.s18d1.util;

import com.workintech.s18d1.exceptions.BurgerException;
import org.springframework.http.HttpStatus;

public class BurgerValidation {

    public static void checkName(String name){
    if(name==null||name.isEmpty()){
        throw new BurgerException("Name is null or empty", HttpStatus.BAD_REQUEST );
    }
    }
//    public static void checkPrice(){
//
//    }
//    public static void checkVegan(){
//
//    }
//    public static void checkBread(){
//
//    }
//    public static void checkContent(String contents){
//        if(contents==null||contents.isEmpty()){
//
//            throw new BurgerException("Content is not founded", HttpStatus.NO_CONTENT);
//        }
//
//    }
}
