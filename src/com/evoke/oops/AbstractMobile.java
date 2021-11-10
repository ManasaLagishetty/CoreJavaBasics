package com.evoke.oops;

public abstract class AbstractMobile {
	void call() {
		System.out.println("mobile used for calling");

	}

	abstract void message();

}

class MobileNew extends AbstractMobile {

	void call() {
		System.out.println("new mobile for calling-->in child");
	}

	void message() {
		System.out.println("mobile used for messaging..");
	}
}
