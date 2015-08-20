package org.pure4j.checker.pure2;

import org.pure4j.annotations.pure.Pure;
import org.pure4j.checker.good.SomeValueObject;
import org.pure4j.immutable.StringHelp;

public class StringBuilding {

	@Pure
	public static String soSomeMorePureStuff(SomeValueObject a, String b) {
		return StringHelp.conc(a.toString(), b);
	}
	
}
