package com.udacity.gradle.jokes;

import java.util.Random;

public class TellAJoke {
    static String[] jokes = {"What's the difference between a violin and a viola?",
            "There is no difference. The violin just looks smaller because the violinist's head is so much bigger.",
            "What's the difference between a violin and a fiddle?",
            "A fiddle is fun to listen to."};
    static public String pickAJoke (){

        return jokes[new Random().nextInt(4)];

    }

}
