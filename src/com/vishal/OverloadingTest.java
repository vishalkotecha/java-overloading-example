package com.vishal;

public class OverloadingTest {

	public static void main(String[] args) {
		test(123);
	}

	/*
	 * static void test(int a) { System.out.println("int primitive " + a); }
	 */

	/*
	 * static void test(Integer a) { System.out.println("int wrapper " + a); }
	 */

	static void test(int... a) {
		for (int i : a) {
			System.out.println("int var args " + i);
		}
	}

	/*
	 * static void test(float a) { System.out.println("float primitive " + a); }
	 */

	static void test(Float a) {
		System.out.println("float wrapper " + a);
	}

	/*
	 * static void test(double a) { System.out.println("double primitive " + a); }
	 */

	static void test(Double a) {
		System.out.println("double wrapper " + a);
	}

	static void test(double... a) {
		System.out.println("double var args " + a);
	}

	static void test(String a) {
		System.out.println("a string " + a);
	}

	/*
	 * static void test(Object a) { System.out.println("An Object " + a); }
	 */
	/*
	 * static void test(long a) { System.out.println("long primitive " + a); }
	 */

	static void test(Long a) {
		System.out.println("long wrapper " + a);
	}

}
