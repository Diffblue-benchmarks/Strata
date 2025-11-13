package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CubicRealRootFinderDiffblueTest {
  /**
   * Test {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -1.0E16} and zero.
   * </ul>
   *
   * <p>Method under test: {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-1.0E16' and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] CubicRealRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith10e16AndZero() {
    // Arrange
    CubicRealRootFinder cubicRealRootFinder = new CubicRealRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = cubicRealRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {-1.0E16d, 0.0d, 0.0d}, actualRoots);
  }

  /**
   * Test {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -1.1111111111111112E36}.
   * </ul>
   *
   * <p>Method under test: {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-1.1111111111111112E36'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] CubicRealRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith11111111111111112e36() {
    // Arrange
    CubicRealRootFinder cubicRealRootFinder = new CubicRealRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(1.3717421124828535E93d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = cubicRealRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {-1.1111111111111112E36d}, actualRoots);
  }

  /**
   * Test {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName("Test getRoots(RealPolynomialFunction1D); then return array of Double with NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] CubicRealRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWithNaN() {
    // Arrange
    CubicRealRootFinder cubicRealRootFinder = new CubicRealRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 1.3717421124828535E93d, 1.0E-15d);

    // Act
    Double[] actualRoots = cubicRealRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {Double.NaN}, actualRoots);
  }

  /**
   * Test {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CubicRealRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName("Test getRoots(RealPolynomialFunction1D); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] CubicRealRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenThrowIllegalArgumentException() {
    // Arrange
    CubicRealRootFinder cubicRealRootFinder = new CubicRealRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(3.0d, 9.0d, 3.0d, 9.0d, 3.0d, 9.0d, 3.0d, 9.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> cubicRealRootFinder.getRoots(function));
  }
}
