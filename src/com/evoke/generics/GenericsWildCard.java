package com.evoke.generics;

import java.util.List;

abstract class GenericsWildCard {
	abstract void shape();
}

class Circle extends GenericsWildCard {
	void shape() {
		System.out.println("it is circle shape");
	}
}

class Square extends GenericsWildCard{
	void shape() {
		System.out.println("it is square shape");
	}
	}
