package org.pure4j.checker.basic.corners.mutable_enum;

import java.io.IOException;

import org.junit.Test;
import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.annotations.pure.Pure;
import org.pure4j.checker.AbstractChecker;
import org.pure4j.checker.basic.support.CausesError;
import org.pure4j.checker.basic.support.ShouldBePure;
import org.pure4j.exception.FieldTypeNotImmutableException;
import org.pure4j.exception.PureMethodParameterNotImmutableException;

/**
 * A really bad java edge-case where you can create a mutable enum.  
 * Perhaps we should make the assumption that all enums should be immutable, and go from there?
 * After all, this is atrocious coding style anyway.
 * 
 * @author robmoffat
 *
 */
public class MutableEnum extends AbstractChecker {

	@ImmutableValue
	static enum Blah { A(new int[] { 1, 2}), B(new int[] {6, 7}); 
		
		/**
		 * Not a problem, as it's a private constructor
		 */
		private Blah(int[] in) {
			this.someState = in;
		}
		
		@CausesError(FieldTypeNotImmutableException.class)
		final public int[] someState;
	}
	
	@Pure
	@ShouldBePure
	public void consumeBlah(Blah b) {
	}
	
	@Test
	public void checkThisPackage() throws IOException {
		checkThisPackage(this.getClass(), 1);
	}
}