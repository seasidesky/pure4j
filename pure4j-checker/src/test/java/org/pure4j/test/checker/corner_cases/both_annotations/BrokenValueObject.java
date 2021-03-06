package org.pure4j.test.checker.corner_cases.both_annotations;

import java.io.InputStream;

import org.pure4j.annotations.immutable.ImmutableValue;
import org.pure4j.exception.ClassExpectingPureMethod;
import org.pure4j.exception.FieldNotFinalException;
import org.pure4j.exception.FieldTypeNotImmutableException;
import org.pure4j.exception.PureMethodCallsImpureException;
import org.pure4j.test.CausesError;
import org.pure4j.test.ShouldBePure;

@ImmutableValue
public interface BrokenValueObject {

}
