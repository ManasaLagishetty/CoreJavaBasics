package com.evoke.generics;

import java.util.List;

public class TestWildCard {
	
    void detailsOfShape(List<? extends GenericsWildCard> lists) {
    	for(GenericsWildCard gw: lists) {
    		gw.shape();
    	
    }
	

	}
}


