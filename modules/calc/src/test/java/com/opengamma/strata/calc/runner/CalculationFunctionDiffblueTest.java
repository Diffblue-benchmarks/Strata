package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.calc.runner.CalculationTaskTest.TestFunction;
import com.opengamma.strata.calc.runner.CalculationTaskTest.TestTarget;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationFunctionDiffblueTest {
  /**
   * Test {@link CalculationFunction#identifier(CalculationTarget)}.
   *
   * <p>Method under test: {@link CalculationFunction#identifier(CalculationTarget)}
   */
  @Test
  @DisplayName("Test identifier(CalculationTarget)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional CalculationFunction.identifier(CalculationTarget)"})
  void testIdentifier() {
    // Arrange
    TestFunction testFunction = new TestFunction();

    // Act and Assert
    assertFalse(testFunction.identifier(new TestTarget()).isPresent());
  }
}
