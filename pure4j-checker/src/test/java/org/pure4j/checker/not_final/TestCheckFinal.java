package org.pure4j.checker.not_final;

import java.io.IOException;

import org.junit.Test;
import org.pure4j.checker.AbstractChecker;

public class TestCheckFinal extends AbstractChecker {

	@Test
	public void checkThisPackage() throws IOException {
		checkThisPackage(this.getClass(), 1);
	}
}
