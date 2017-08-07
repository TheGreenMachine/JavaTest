package org.greenmachine.javatest;

public class CurrentPos {
	private double x;  // in inches
	private double y;  // in inches
	private double theta;  // in radians

	public CurrentPos() {
	}

	public CurrentPos(double x, double y, double theta) {
		setX(x);
		setY(y);
		setTheta(theta);
	}

	/**
	 * Set the current X position in inches
	 */
	public void setX(double x) {
		this.x = x;
	}

	/**
	 * Set the current Y position in inches
	 */
	public void setY(double y) {
		this.y = y;
	}

	/**
	 * Set the current theta in radians
	 */
	public void setTheta(double theta) {
		this.theta = theta;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getTheta() {
		return theta;
	}

	@Override
	public String toString() {
		return String.format("CurrPos\t%.5f\t%.5f\t%.5f", x, y, theta);
	}
}

