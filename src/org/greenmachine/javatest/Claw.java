package org.greenmachine.javatest;

public class Claw {
    private String name;
	private boolean isOpen;

    public Claw(String name) {
    	this.name = name;
    }

    public void open() {
		isOpen = true;
        System.out.println(name + ": claw opening");
    }
}
