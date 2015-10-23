package org.greenmachine.javatest;

public class Claw {
    private String name;

    public Claw(String name) {
    	this.name = name;
    }

    public void open() {
        System.out.println(name + ": claw opening");
    }
}
