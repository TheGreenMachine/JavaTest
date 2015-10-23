package org.greenmachine.javatest;

public class Robot {
    private String name;
    private Claw clawLeft;
    private Claw clawRight;

    public Robot() {
    	clawLeft = new Claw("left");
    	clawRight = new Claw("right");
    }

    public void say(String msg) {
    	System.out.println("Robot: " + name + " says '" + msg + "'");
    }

    public void openLeftClaw() {
    	clawLeft.open();
    }
    
    public void openRightClaw() {
    	clawRight.open();
    }
}
