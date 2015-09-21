package org.pure4j.checker.lambda.reduce;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;
import org.pure4j.annotations.pure.Pure;
import org.pure4j.checker.AbstractChecker;
import org.pure4j.checker.basic.support.ShouldBePure;
import org.pure4j.collections.ArraySeq;

public class PureReduce extends AbstractChecker {

	@ShouldBePure
	@Pure
	public String consumeBlah(ArraySeq<String> in) {
		String done = in.stream().reduce("", (a, b) -> a+b);
		return done;
	}
	
	
	@Test
	public void usingAPure() {
		ArraySeq<String> someSeq = new ArraySeq<String>("john", "eats", "chips");
		Assert.assertEquals("johneatschips" , consumeBlah(someSeq));
	}
	
	
	@Test
	public void checkThisPackage() throws IOException {
		checkThisPackage(this.getClass(), 0);
	}
}