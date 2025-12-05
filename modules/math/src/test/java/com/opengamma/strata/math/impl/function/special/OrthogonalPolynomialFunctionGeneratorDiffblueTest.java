package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.DoubleFunction1D;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OrthogonalPolynomialFunctionGeneratorDiffblueTest {
  /**
   * Test {@link OrthogonalPolynomialFunctionGenerator#getZero()}.
   *
   * <p>Method under test: {@link OrthogonalPolynomialFunctionGenerator#getZero()}
   */
  @Test
  @DisplayName("Test getZero()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D OrthogonalPolynomialFunctionGenerator.getZero()"})
  void testGetZero() {
    // Arrange and Act
    DoubleFunction1D actualZero = new HermitePolynomialFunction().getZero();
    double actualApplyAsDoubleResult = actualZero.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualZero instanceof RealPolynomialFunction1D);
    assertEquals(0.0d, actualApplyAsDoubleResult);
    assertArrayEquals(
        new double[] {0.0d}, ((RealPolynomialFunction1D) actualZero).getCoefficients(), 0.0);
  }

  /**
   * Test {@link OrthogonalPolynomialFunctionGenerator#getOne()}.
   *
   * <p>Method under test: {@link OrthogonalPolynomialFunctionGenerator#getOne()}
   */
  @Test
  @DisplayName("Test getOne()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D OrthogonalPolynomialFunctionGenerator.getOne()"})
  void testGetOne() {
    // Arrange and Act
    DoubleFunction1D actualOne = new HermitePolynomialFunction().getOne();
    double actualApplyAsDoubleResult = actualOne.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualOne instanceof RealPolynomialFunction1D);
    assertEquals(1.0d, actualApplyAsDoubleResult);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) actualOne).getCoefficients(), 0.0);
  }

  /**
   * Test {@link OrthogonalPolynomialFunctionGenerator#getX()}.
   *
   * <p>Method under test: {@link OrthogonalPolynomialFunctionGenerator#getX()}
   */
  @Test
  @DisplayName("Test getX()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D OrthogonalPolynomialFunctionGenerator.getX()"})
  void testGetX() {
    // Arrange and Act
    DoubleFunction1D actualX = new HermitePolynomialFunction().getX();
    double actualApplyAsDoubleResult = actualX.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualX instanceof RealPolynomialFunction1D);
    assertEquals(10.0d, actualApplyAsDoubleResult);
    assertArrayEquals(
        new double[] {1.0d},
        ((RealPolynomialFunction1D) actualX.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.0d}, ((RealPolynomialFunction1D) actualX).getCoefficients(), 0.0);
  }
}
