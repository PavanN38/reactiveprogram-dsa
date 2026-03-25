package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class Exercise9 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Print size of intNumbersFlux after the last item returns
        // TODO: Write code here
        ArrayList name = new ArrayList<String>();
        name.add("Pavan");
        name.add(new Date());
        String myName = (String) name.get(0);
        System.out.println(name.get(0));

        // Collect all items of intNumbersFlux into a single list and print it
        // TODO: Write code here


        // Transform to a sequence of sums of adjacent two numbers
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
