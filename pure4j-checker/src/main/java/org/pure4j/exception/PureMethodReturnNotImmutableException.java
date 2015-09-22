package org.pure4j.exception;

import java.lang.reflect.Type;

import org.pure4j.processor.PureChecklistHandler.PureMethod;

public class PureMethodReturnNotImmutableException extends Pure4JException {

	public PureMethodReturnNotImmutableException(PureMethod pureMethod, Type t) {
		super("method can't return non-immutable type: "+t+"\n"+pureMethod);
	}

}
