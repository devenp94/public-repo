package com.immutabletask;

public final class ImmutableClass {

	private String pancard;

	public ImmutableClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImmutableClass(String pancard) {
		super();
		this.pancard = pancard;
	}

	public ImmutableClass getPancard(String pancard) {
		if (this.pancard == pancard) {
			return this;
		} else {
			return new ImmutableClass();
		}

	}

	

}
