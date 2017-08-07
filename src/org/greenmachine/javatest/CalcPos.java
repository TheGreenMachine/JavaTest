package org.greenmachine.javatest;

/**
 * This is a class to be used for testing position algorithms.
 * 
 * To test this:
 *  - Create a new branch for your code starting from the PositionTest branch
 *  - Checkout your new branch
 *  - Modify the calculateDeltaPos() method to return a valid DeltaPos object (change in inches).
 *  - Modify the calculatePosition() method to return the new position given the current position
 *    and the current change in position.
 *  - Run the ant build to compile and test the CalcPos class.
 *  - When you get something working commit the changes to your new branch and push to GitHub.
 */
public class CalcPos {

	public final static double WHEELBASE = 20.0;  // inches


	public final static double[][] TALON_POSITION_DATA = new double[][] {
			{ 0.000, 0.000 },
			{ 0.000, 0.698 },
			{ 0.000, 1.745 },
			{ 0.000, 3.491 },
			{ 0.000, 6.283 },
			{ 0.000, 10.472 },
			{ 0.000, 15.708 },
			{ 0.000, 20.944 },
			{ 0.000, 25.133 },
			{ 0.000, 27.925 },
			{ 0.000, 29.671 },
			{ 0.000, 30.718 },
			{ 0.000, 31.416 },
			{ 1.222, 31.940 },
			{ 3.054, 32.725 },
			{ 6.109, 34.034 },
			{ 10.996, 36.128 },
			{ 18.326, 39.270 },
			{ 27.489, 43.197 },
			{ 36.652, 47.124 },
			{ 43.982, 50.265 },
			{ 48.869, 52.360 },
			{ 51.924, 53.669 },
			{ 53.756, 54.454 },
			{ 54.978, 54.978 },
			{ 54.978, 54.978 }
	};

	public static void main(String args[]) {
		CalcPos calcPos = new CalcPos();
		calcPos.test();
	}

	public void test() {
		CurrentPos currentPos = new CurrentPos(10.0, 0.0, Math.PI / 2.0);

		for (int i = 1; i < TALON_POSITION_DATA.length; i++) {
			DeltaPos deltaPos = calculateDeltaPos(TALON_POSITION_DATA[i-1], TALON_POSITION_DATA[i]);

			CurrentPos newPos = calculatePosition(currentPos, deltaPos);
			System.out.println(deltaPos.toString() + '\t' + newPos.toString());

			currentPos = newPos;
		}
	}

	public DeltaPos calculateDeltaPos(double[] oldLeftRightInches, double[] newLeftRightInches) {
		// TODO: create DeltaPos
		return new DeltaPos(0.0, 0.0);
	}

	public CurrentPos calculatePosition(CurrentPos currentPos, DeltaPos deltaPos) {
		// TODO  calculate new position and return it
		return new CurrentPos(0.0, 0.0, 0.0);
	}
}
