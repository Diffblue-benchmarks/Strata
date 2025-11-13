package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExceptionCurveExtrapolatorDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExceptionCurveExtrapolator#toString()}
   *   <li>{@link ExceptionCurveExtrapolator#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String ExceptionCurveExtrapolator.getName()",
    "String ExceptionCurveExtrapolator.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ExceptionCurveExtrapolator exceptionCurveExtrapolator = ExceptionCurveExtrapolator.INSTANCE;

    // Act
    String actualToStringResult = exceptionCurveExtrapolator.toString();

    // Assert
    assertEquals("Exception", exceptionCurveExtrapolator.getName());
    assertEquals("Exception", actualToStringResult);
  }

  /**
   * Test {@link ExceptionCurveExtrapolator#bind(DoubleArray, DoubleArray, BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link ExceptionCurveExtrapolator}.
   * </ul>
   *
   * <p>Method under test: {@link ExceptionCurveExtrapolator#bind(DoubleArray, DoubleArray,
   * BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test bind(DoubleArray, DoubleArray, BoundCurveInterpolator); when 'null'; then return ExceptionCurveExtrapolator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BoundCurveExtrapolator ExceptionCurveExtrapolator.bind(DoubleArray, DoubleArray, BoundCurveInterpolator)"
  })
  void testBind_whenNull_thenReturnExceptionCurveExtrapolator() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();

    // Act
    BoundCurveExtrapolator actualBindResult =
        ExceptionCurveExtrapolator.INSTANCE.bind(xValues, DoubleArray.of(), null);

    // Assert
    assertTrue(actualBindResult instanceof ExceptionCurveExtrapolator);
    assertEquals("Exception", ((ExceptionCurveExtrapolator) actualBindResult).getName());
    assertSame(((ExceptionCurveExtrapolator) actualBindResult).INSTANCE, actualBindResult);
  }

  /**
   * Test {@link ExceptionCurveExtrapolator#leftExtrapolate(double)}.
   *
   * <p>Method under test: {@link ExceptionCurveExtrapolator#leftExtrapolate(double)}
   */
  @Test
  @DisplayName("Test leftExtrapolate(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ExceptionCurveExtrapolator.leftExtrapolate(double)"})
  void testLeftExtrapolate() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ExceptionCurveExtrapolator.INSTANCE.leftExtrapolate(10.0d));
  }

  /**
   * Test {@link ExceptionCurveExtrapolator#leftExtrapolateFirstDerivative(double)}.
   *
   * <p>Method under test: {@link ExceptionCurveExtrapolator#leftExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test leftExtrapolateFirstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ExceptionCurveExtrapolator.leftExtrapolateFirstDerivative(double)"})
  void testLeftExtrapolateFirstDerivative() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ExceptionCurveExtrapolator.INSTANCE.leftExtrapolateFirstDerivative(10.0d));
  }

  /**
   * Test {@link ExceptionCurveExtrapolator#leftExtrapolateParameterSensitivity(double)}.
   *
   * <p>Method under test: {@link
   * ExceptionCurveExtrapolator#leftExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test leftExtrapolateParameterSensitivity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray ExceptionCurveExtrapolator.leftExtrapolateParameterSensitivity(double)"
  })
  void testLeftExtrapolateParameterSensitivity() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ExceptionCurveExtrapolator.INSTANCE.leftExtrapolateParameterSensitivity(10.0d));
  }

  /**
   * Test {@link ExceptionCurveExtrapolator#rightExtrapolate(double)}.
   *
   * <p>Method under test: {@link ExceptionCurveExtrapolator#rightExtrapolate(double)}
   */
  @Test
  @DisplayName("Test rightExtrapolate(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ExceptionCurveExtrapolator.rightExtrapolate(double)"})
  void testRightExtrapolate() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ExceptionCurveExtrapolator.INSTANCE.rightExtrapolate(10.0d));
  }

  /**
   * Test {@link ExceptionCurveExtrapolator#rightExtrapolateFirstDerivative(double)}.
   *
   * <p>Method under test: {@link
   * ExceptionCurveExtrapolator#rightExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test rightExtrapolateFirstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ExceptionCurveExtrapolator.rightExtrapolateFirstDerivative(double)"})
  void testRightExtrapolateFirstDerivative() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ExceptionCurveExtrapolator.INSTANCE.rightExtrapolateFirstDerivative(10.0d));
  }

  /**
   * Test {@link ExceptionCurveExtrapolator#rightExtrapolateParameterSensitivity(double)}.
   *
   * <p>Method under test: {@link
   * ExceptionCurveExtrapolator#rightExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test rightExtrapolateParameterSensitivity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray ExceptionCurveExtrapolator.rightExtrapolateParameterSensitivity(double)"
  })
  void testRightExtrapolateParameterSensitivity() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ExceptionCurveExtrapolator.INSTANCE.rightExtrapolateParameterSensitivity(10.0d));
  }
}
