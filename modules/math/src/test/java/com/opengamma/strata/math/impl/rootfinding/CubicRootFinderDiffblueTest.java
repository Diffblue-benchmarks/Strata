package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.ComplexNumber;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CubicRootFinderDiffblueTest {
  /**
   * Test {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return second element Imaginary is {@code -1.6792156551258574E-31}.
   * </ul>
   *
   * <p>Method under test: {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return second element Imaginary is '-1.6792156551258574E-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber[] CubicRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnSecondElementImaginaryIs16792156551258574e31() {
    // Arrange
    CubicRootFinder cubicRootFinder = new CubicRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.3717421124828535E93d);

    // Act
    ComplexNumber[] actualRoots = cubicRootFinder.getRoots(function);

    // Assert
    ComplexNumber complexNumber = actualRoots[1];
    assertEquals(-1.6792156551258574E-31d, complexNumber.getImaginary());
    assertEquals(-1.9389912210286953E-31d, actualRoots[0].getReal());
    ComplexNumber complexNumber2 = actualRoots[2];
    assertEquals(1.6792156551258574E-31d, complexNumber2.getImaginary());
    assertEquals(3, actualRoots.length);
    assertEquals(9.694956105143476E-32d, complexNumber.getReal());
    assertEquals(9.694956105143476E-32d, complexNumber2.getReal());
  }

  /**
   * Test {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return third element Imaginary is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return third element Imaginary is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber[] CubicRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnThirdElementImaginaryIs00() {
    // Arrange
    CubicRootFinder cubicRootFinder = new CubicRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    ComplexNumber[] actualRoots = cubicRootFinder.getRoots(function);

    // Assert
    ComplexNumber complexNumber = actualRoots[2];
    assertEquals(-0.0d, complexNumber.getImaginary());
    assertEquals(-1.0E16d, actualRoots[0].getReal());
    ComplexNumber complexNumber2 = actualRoots[1];
    assertEquals(0.0d, complexNumber2.getImaginary());
    assertEquals(0.0d, complexNumber2.getReal());
    assertEquals(0.0d, complexNumber.getReal());
    assertEquals(3, actualRoots.length);
  }

  /**
   * Test {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return third element is second element.
   * </ul>
   *
   * <p>Method under test: {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return third element is second element")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber[] CubicRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnThirdElementIsSecondElement() {
    // Arrange
    CubicRootFinder cubicRootFinder = new CubicRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 1.3717421124828535E93d, 1.0E-15d);

    // Act
    ComplexNumber[] actualRoots = cubicRootFinder.getRoots(function);

    // Assert
    assertEquals(3, actualRoots.length);
    ComplexNumber complexNumber = actualRoots[1];
    assertEquals(complexNumber, actualRoots[2]);
    assertEquals(Double.NaN, complexNumber.getImaginary());
    assertEquals(Double.NaN, actualRoots[0].getReal());
    assertEquals(Double.NaN, complexNumber.getReal());
  }

  /**
   * Test {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return third element Real is {@code -2.86772975E7}.
   * </ul>
   *
   * <p>Method under test: {@link CubicRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return third element Real is '-2.86772975E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber[] CubicRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnThirdElementRealIs286772975e7() {
    // Arrange
    CubicRootFinder cubicRootFinder = new CubicRootFinder();
    RealPolynomialFunction1D function = new RealPolynomialFunction1D(10.0d, 3.0d, 10.0d, 1.0E-15d);

    // Act
    ComplexNumber[] actualRoots = cubicRootFinder.getRoots(function);

    // Assert
    assertEquals(-1.0E16d, actualRoots[0].getReal());
    ComplexNumber complexNumber = actualRoots[2];
    assertEquals(-2.86772975E7d, complexNumber.getReal());
    ComplexNumber complexNumber2 = actualRoots[1];
    assertEquals(0.0d, complexNumber2.getImaginary());
    assertEquals(0.0d, complexNumber.getImaginary());
    assertEquals(2.86772975E7d, complexNumber2.getReal());
    assertEquals(3, actualRoots.length);
  }
}
