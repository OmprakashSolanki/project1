package com.ops.collection;

import java.util.Comparator;

public class StringBuilderComprator implements Comparator<StringBuilder> {

	@Override
	public int compare(StringBuilder sb1, StringBuilder sb2) {
		
		return sb1.toString().compareTo(sb2.toString());
	}

}
