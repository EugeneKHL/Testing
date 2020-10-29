package com.xmltest;

import com.xmltest.parsing.Parser;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File map = new File("C:/Users/Eugene/Downloads/small.xml");
        Parser.parse(map);
    }
}