package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.Measure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractDerivedCalculationFunctionDiffblueTest {
  /**
   * Test {@link AbstractDerivedCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link AbstractDerivedCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class AbstractDerivedCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<TestTarget> actualTargetTypeResult = new DerivedFn().targetType();

    // Assert
    Class<TestTarget> expectedTargetTypeResult = TestTarget.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link AbstractDerivedCalculationFunction#measure()}.
   *
   * <p>Method under test: {@link AbstractDerivedCalculationFunction#measure()}
   */
  @Test
  @DisplayName("Test measure()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Measure AbstractDerivedCalculationFunction.measure()"})
  void testMeasure() {
    // Arrange and Act
    Measure actualMeasureResult = new DerivedFn().measure();

    // Assert
    assertTrue(actualMeasureResult instanceof ImmutableMeasure);
    assertEquals("BucketedPV01", actualMeasureResult.getName());
    assertTrue(actualMeasureResult.isCurrencyConvertible());
  }

  /**
   * Test {@link AbstractDerivedCalculationFunction#requiredMeasures()}.
   *
   * <p>Method under test: {@link AbstractDerivedCalculationFunction#requiredMeasures()}
   */
  @Test
  @DisplayName("Test requiredMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set AbstractDerivedCalculationFunction.requiredMeasures()"})
  void testRequiredMeasures() {
    // Arrange, Act and Assert
    assertEquals(2, new DerivedFn().requiredMeasures().size());
  }
}
