package com.epam.hometask8.controller;

import com.epam.hometask8.controller.InputUtil;
import com.epam.hometask8.view.ViewBooks;

import java.util.InputMismatchException;

public class Validator {

    private ViewBooks viewBooks = new ViewBooks();

    public void catchInputMismatchException(){

        try {
            if (!InputUtil.checkIsInt()) {
                throw new InputMismatchException();
            }
        }
        catch (InputMismatchException e) {
            viewBooks.print("It is not integer!");
        }
    }

    public void catchNegativeArraySizeException(){
        try{
            if (InputUtil.inputInt() < 0){
                throw new NegativeArraySizeException();
            }
        }
        catch (NegativeArraySizeException e){
            viewBooks.print("Size of library can`t be less than 0!");
        }
    }


}
