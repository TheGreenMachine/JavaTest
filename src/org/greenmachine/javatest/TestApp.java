package org.greenmachine.javatest;

public class TestApp {

    public static void main(String args[]) {
        Robot robot = new Robot();
        robot.say("HI");
        robot.openLeftClaw();
        robot.openRightClaw();
    }
}
