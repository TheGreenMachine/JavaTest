package org.greenmachine.javatest;

public class DeltaPos {
	private double leftDelta;
	private double rightDelta;

	public DeltaPos() {
	}

	public DeltaPos(double leftDelta, double rightDelta) {
		setLeftDelta(leftDelta);
		setRightDelta(rightDelta);
	}

	/**
	 * Set the change in left position in inches.
	 */
	public void setLeftDelta(double leftDelta) {
		this.leftDelta = leftDelta;
	}

	/**
	 * Set the change in right position in inches.
	 */
	public void setRightDelta(double rightDelta) {
		this.rightDelta = rightDelta;
	}

	public double getLeftDelta() {
		return leftDelta;
	}

	public double getRightDelta() {
		return rightDelta;
	}

	@Override
	public String toString() {
		return String.format("DeltaPos\t%.5f\t%.5f", leftDelta, rightDelta);
	}
}
