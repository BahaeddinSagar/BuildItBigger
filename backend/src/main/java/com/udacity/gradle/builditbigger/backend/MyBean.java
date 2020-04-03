package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.jokes.TellAJoke;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        String  joke = TellAJoke.pickAJoke();
        myData = joke;
        return myData;
    }

    /*public void setData(String data) {
        myData = data;

    }*/
}