package com.opengamma.strata.math.impl.regression;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NamedVariableLeastSquaresRegressionResultDiffblueTest {
  /**
   * Test {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}.
   *
   * <p>Method under test: {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new NamedVariableLeastSquaresRegressionResult(List, LeastSquaresRegressionResult)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NamedVariableLeastSquaresRegressionResult.<init>(List, LeastSquaresRegressionResult)"
  })
  void testNewNamedVariableLeastSquaresRegressionResult() {
    // Arrange
    ArrayList<String> independentVariableNames = new ArrayList<>();
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new NamedVariableLeastSquaresRegressionResult(independentVariableNames, result));
  }

  /**
   * Test {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}.
   *
   * <p>Method under test: {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new NamedVariableLeastSquaresRegressionResult(List, LeastSquaresRegressionResult)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NamedVariableLeastSquaresRegressionResult.<init>(List, LeastSquaresRegressionResult)"
  })
  void testNewNamedVariableLeastSquaresRegressionResult2() {
    // Arrange
    ArrayList<String> independentVariableNames = new ArrayList<>();
    independentVariableNames.add(
        "Length of variable name array did not match number of results in the regression");
    independentVariableNames.add("regression result");
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new NamedVariableLeastSquaresRegressionResult(independentVariableNames, result));
  }

  /**
   * Test {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}.
   *
   * <p>Method under test: {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new NamedVariableLeastSquaresRegressionResult(List, LeastSquaresRegressionResult)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NamedVariableLeastSquaresRegressionResult.<init>(List, LeastSquaresRegressionResult)"
  })
  void testNewNamedVariableLeastSquaresRegressionResult3() {
    // Arrange
    ArrayList<String> independentVariableNames = new ArrayList<>();
    independentVariableNames.add("foo");
    independentVariableNames.add(
        "Length of variable name array did not match number of results in the regression");
    independentVariableNames.add("regression result");
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act
    NamedVariableLeastSquaresRegressionResult actualNamedVariableLeastSquaresRegressionResult =
        new NamedVariableLeastSquaresRegressionResult(independentVariableNames, result);

    // Assert
    assertEquals(
        4, actualNamedVariableLeastSquaresRegressionResult.getIndependentVariableNames().size());
    assertTrue(actualNamedVariableLeastSquaresRegressionResult.hasIntercept());
    assertSame(result, actualNamedVariableLeastSquaresRegressionResult.getResult());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getPValues(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getResiduals(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getStandardErrorOfBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getTStatistics(),
        0.0);
  }

  /**
   * Test {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}.
   *
   * <p>Method under test: {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new NamedVariableLeastSquaresRegressionResult(List, LeastSquaresRegressionResult)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NamedVariableLeastSquaresRegressionResult.<init>(List, LeastSquaresRegressionResult)"
  })
  void testNewNamedVariableLeastSquaresRegressionResult4() {
    // Arrange
    ArrayList<String> independentVariableNames = new ArrayList<>();
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new NamedVariableLeastSquaresRegressionResult(independentVariableNames, result));
  }

  /**
   * Test {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}.
   *
   * <ul>
   *   <li>Given {@code regression result}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new NamedVariableLeastSquaresRegressionResult(List, LeastSquaresRegressionResult); given 'regression result'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NamedVariableLeastSquaresRegressionResult.<init>(List, LeastSquaresRegressionResult)"
  })
  void testNewNamedVariableLeastSquaresRegressionResult_givenRegressionResult() {
    // Arrange
    ArrayList<String> independentVariableNames = new ArrayList<>();
    independentVariableNames.add("regression result");
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new NamedVariableLeastSquaresRegressionResult(independentVariableNames, result));
  }

  /**
   * Test {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}.
   *
   * <ul>
   *   <li>Then return not hasIntercept.
   * </ul>
   *
   * <p>Method under test: {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new NamedVariableLeastSquaresRegressionResult(List, LeastSquaresRegressionResult); then return not hasIntercept")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NamedVariableLeastSquaresRegressionResult.<init>(List, LeastSquaresRegressionResult)"
  })
  void testNewNamedVariableLeastSquaresRegressionResult_thenReturnNotHasIntercept() {
    // Arrange
    ArrayList<String> independentVariableNames = new ArrayList<>();
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act
    NamedVariableLeastSquaresRegressionResult actualNamedVariableLeastSquaresRegressionResult =
        new NamedVariableLeastSquaresRegressionResult(independentVariableNames, result);

    // Assert
    assertFalse(actualNamedVariableLeastSquaresRegressionResult.hasIntercept());
    assertTrue(
        actualNamedVariableLeastSquaresRegressionResult.getIndependentVariableNames().isEmpty());
    assertSame(result, actualNamedVariableLeastSquaresRegressionResult.getResult());
    assertArrayEquals(
        new double[] {}, actualNamedVariableLeastSquaresRegressionResult.getBetas(), 0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getPValues(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getResiduals(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getStandardErrorOfBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualNamedVariableLeastSquaresRegressionResult.getTStatistics(),
        0.0);
  }

  /**
   * Test {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NamedVariableLeastSquaresRegressionResult#NamedVariableLeastSquaresRegressionResult(List,
   * LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new NamedVariableLeastSquaresRegressionResult(List, LeastSquaresRegressionResult); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NamedVariableLeastSquaresRegressionResult.<init>(List, LeastSquaresRegressionResult)"
  })
  void testNewNamedVariableLeastSquaresRegressionResult_whenNull() {
    // Arrange
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new NamedVariableLeastSquaresRegressionResult(null, result));
  }
}
