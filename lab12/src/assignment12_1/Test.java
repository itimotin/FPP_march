package assignment12_1;

import assignment12_1.closedcurve.good.*;

public class Test {

	public static void main(String[] args) {

		try {
			ClosedCurve[] objects = new ClosedCurve[] { new Triangle(4, 5, 6), new Square(-1), new Rectangle(3, 7),
					new Circle(3) };

			// compute areas
			for (ClosedCurve cc : objects) {
				String nameOfCurve = getClassNameNoPackage(cc.getClass());

				System.out.println("The area of this " + nameOfCurve + " is " + cc.computeArea());

			}
		} catch (IllegalTriangleException e) {
			System.out.println(e);
		} catch (IllegalCurveException e) {
			System.out.println(e);
		}

	}

	public static String getClassNameNoPackage(Class aClass) {
		String fullClassName = aClass.getName();
		int index = fullClassName.lastIndexOf('.');
		String className = null;
		String packageName = null;

		// in this case, there is no package name
		if (index == -1) {
			return fullClassName;
		} else {
			// for other apps, may be useful to have this
			packageName = fullClassName.substring(0, index);

			className = fullClassName.substring(index + 1);
			return className;
		}

	}

}
