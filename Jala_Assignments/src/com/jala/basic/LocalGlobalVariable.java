package com.jala.basic;

public class LocalGlobalVariable {

	// Global Variable
	public static int g = 10;

	// Instance Variable
	int i = 20;

	public static void main(String[] args) {
		LocalGlobalVariable obj = new LocalGlobalVariable();
		System.out.println("Global variable : " + g);

		System.out.println("Instance variable : " + obj.i);

		obj.localVariable();
	}

	void localVariable() {
		// Local Variable
		int l = 100;
		System.out.println("Local variable a : " + l);
	}

}
