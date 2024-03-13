package com.immutabletask;

public class Test {

	public static void main(String[] args) {
		ImmutableClass im = new ImmutableClass("DKPPP9869E");

		ImmutableClass im2 = im.getPancard("SUYYY8654Q");
		ImmutableClass im1 = im.getPancard("DKPPP9869E");

		System.out.println(im == im2);
		System.out.println(im1 == im);

	}

}
