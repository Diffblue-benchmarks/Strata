package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LaguerrePolynomialRealRootFinderDiffblueTest {
  /**
   * Test {@link LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -1.0E16}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-1.0E16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double[] LaguerrePolynomialRealRootFinder.getRoots(RealPolynomialFunction1D)"
  })
  void testGetRoots_thenReturnArrayOfDoubleWith10e16() {
    // Arrange
    LaguerrePolynomialRealRootFinder laguerrePolynomialRealRootFinder =
        new LaguerrePolynomialRealRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = laguerrePolynomialRealRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {-1.0E16d}, actualRoots);
  }

  /**
   * Test {@link LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName("Test getRoots(RealPolynomialFunction1D); then return array of Double with zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double[] LaguerrePolynomialRealRootFinder.getRoots(RealPolynomialFunction1D)"
  })
  void testGetRoots_thenReturnArrayOfDoubleWithZero() {
    // Arrange
    LaguerrePolynomialRealRootFinder laguerrePolynomialRealRootFinder =
        new LaguerrePolynomialRealRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(
            1.0E-16d, 10.0d, 1.0E-16d, 10.0d, 1.0E-16d, 10.0d, 1.0E-16d, 10.0d);

    // Act
    Double[] actualRoots = laguerrePolynomialRealRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {0.0d}, actualRoots);
  }

  /**
   * Test {@link LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName("Test getRoots(RealPolynomialFunction1D); then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double[] LaguerrePolynomialRealRootFinder.getRoots(RealPolynomialFunction1D)"
  })
  void testGetRoots_thenThrowMathException() {
    // Arrange
    LaguerrePolynomialRealRootFinder laguerrePolynomialRealRootFinder =
        new LaguerrePolynomialRealRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 0.0d, 1.0E-15d);

    // Act and Assert
    assertThrows(MathException.class, () -> laguerrePolynomialRealRootFinder.getRoots(function));
  }

  /**
   * Test {@link LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>When {@link RealPolynomialFunction1D#RealPolynomialFunction1D(double[])} with
   *       coefficients is ten and zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * LaguerrePolynomialRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); when RealPolynomialFunction1D(double[]) with coefficients is ten and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double[] LaguerrePolynomialRealRootFinder.getRoots(RealPolynomialFunction1D)"
  })
  void testGetRoots_whenRealPolynomialFunction1DWithCoefficientsIsTenAndZero() {
    // Arrange
    LaguerrePolynomialRealRootFinder laguerrePolynomialRealRootFinder =
        new LaguerrePolynomialRealRootFinder();
    RealPolynomialFunction1D function = new RealPolynomialFunction1D(10.0d, 0.0d, 10.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = laguerrePolynomialRealRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {-1.0E16d}, actualRoots);
  }
}
