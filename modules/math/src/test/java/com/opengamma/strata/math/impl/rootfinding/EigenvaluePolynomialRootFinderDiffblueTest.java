package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EigenvaluePolynomialRootFinderDiffblueTest {
  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -5.0E15} and {@code -5.0E15}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-5.0E15' and '-5.0E15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith50e15And50e15() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {-5.0E15d, -5.0E15d, 0.0d}, actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -0.523953497764805} and {@code
   *       -0.523953497764805}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-0.523953497764805' and '-0.523953497764805'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith0523953497764805And0523953497764805() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(1.0d, 0.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {
          -0.523953497764805d,
          -0.523953497764805d,
          0.47342701012168703d,
          0.47342701012168703d,
          -0.46539985870071154d,
          0.23322641699347407d,
          0.23322641699347407d
        },
        actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -0.727099961064399} and {@code
   *       -0.727099961064399}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-0.727099961064399' and '-0.727099961064399'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith0727099961064399And0727099961064399() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(-0.5d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {
          -0.727099961064399d,
          -0.727099961064399d,
          0.6895882454904052d,
          0.6895882454904052d,
          -0.03730354527742277d,
          -0.03730354527742277d,
          0.0496305217028339d
        },
        actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code 5.690351856606182} and {@code
   *       -3.6895934748121753}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '5.690351856606182' and '-3.6895934748121753'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith5690351856606182And36895934748121753() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, -0.5d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {
          5.690351856606182d,
          -3.6895934748121753d,
          0.5116300150773865d,
          0.5116300150773865d,
          -0.4620091539990139d,
          -0.4620091539990139d,
          -0.10000010395075525d
        },
        actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -0.7071067811865471} and {@code
   *       -0.7071067811865471}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-0.7071067811865471' and '-0.7071067811865471'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith07071067811865471And07071067811865471() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {
          -0.7071067811865471d,
          -0.7071067811865471d,
          0.707106781186547d,
          0.707106781186547d,
          -5.551115123125783E-17d,
          -5.551115123125783E-17d,
          -0.10000000000000005d
        },
        actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -0.8660254037844389} and {@code
   *       -0.8660254037844389}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-0.8660254037844389' and '-0.8660254037844389'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith08660254037844389And08660254037844389() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(
            1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {
          -0.8660254037844389d,
          -0.8660254037844389d,
          -0.49999999999999983d,
          -0.49999999999999983d,
          -4.163336342344337E-17d,
          -4.163336342344337E-17d,
          0.8660254037844395d,
          0.8660254037844395d,
          0.4999999999999999d,
          0.4999999999999999d,
          -0.09999999999999996d
        },
        actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -9.999999999999899E14} and {@code
   *       -5.000000000000051}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-9.999999999999899E14' and '-5.000000000000051'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith9999999999999899e14And5000000000000051() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {
          -9.999999999999899E14d, -5.000000000000051d, -5.000000000000051d, 0.0d, 0.0d, 0.0d, 0.0d
        },
        actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -9.999999999999999E14} and {@code
   *       -1.0E-15}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-9.999999999999999E14' and '-1.0E-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith9999999999999999e14And10e15() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(0.0d, 1.0E-15d, 1.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {-9.999999999999999E14d, -1.0E-15d, -1.0000000000000004E-75d}, actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code -9.999999999999999E14} and {@code
   *       -5.0E-16}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '-9.999999999999999E14' and '-5.0E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith9999999999999999e14And50e16() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 1.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {-9.999999999999999E14d, -5.0E-16d, -5.0E-16d}, actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@code 4.9999999999999994E14} and {@code
   *       1.0E-15}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with '4.9999999999999994E14' and '1.0E-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWith49999999999999994e14And10e15() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, -0.5d, 1.0E-15d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {4.9999999999999994E14d, 1.0E-15d, 1.0E-15d}, actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with {@link Double#NEGATIVE_INFINITY} and {@link
   *       Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with NEGATIVE_INFINITY and NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWithNegative_infinityAndNegative_infinity() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function = new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 0.0d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(
        new Double[] {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, 0.0d}, actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>Then return array of {@link Double} with zero and zero.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); then return array of Double with zero and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_thenReturnArrayOfDoubleWithZeroAndZero() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 0.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {0.0d, 0.0d, 0.0d}, actualRoots);
  }

  /**
   * Test {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}.
   *
   * <ul>
   *   <li>When {@link RealPolynomialFunction1D#RealPolynomialFunction1D(double[])} with
   *       coefficients is ten and {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link EigenvaluePolynomialRootFinder#getRoots(RealPolynomialFunction1D)}
   */
  @Test
  @DisplayName(
      "Test getRoots(RealPolynomialFunction1D); when RealPolynomialFunction1D(double[]) with coefficients is ten and NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] EigenvaluePolynomialRootFinder.getRoots(RealPolynomialFunction1D)"})
  void testGetRoots_whenRealPolynomialFunction1DWithCoefficientsIsTenAndNaN() {
    // Arrange
    EigenvaluePolynomialRootFinder eigenvaluePolynomialRootFinder =
        new EigenvaluePolynomialRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(10.0d, Double.NaN, 10.0d, 1.0E-15d);

    // Act
    Double[] actualRoots = eigenvaluePolynomialRootFinder.getRoots(function);

    // Assert
    assertArrayEquals(new Double[] {-5.0E15d, -5.0E15d, 0.0d}, actualRoots);
  }
}
