package com.opengamma.strata.math.impl.random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalRandomNumberGeneratorDiffblueTest {
  /**
   * Test {@link NormalRandomNumberGenerator#NormalRandomNumberGenerator(double, double,
   * RandomEngine)}.
   *
   * <p>Method under test: {@link NormalRandomNumberGenerator#NormalRandomNumberGenerator(double,
   * double, RandomEngine)}
   */
  @Test
  @DisplayName("Test new NormalRandomNumberGenerator(double, double, RandomEngine)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NormalRandomNumberGenerator.<init>(double, double, RandomEngine)"})
  void testNewNormalRandomNumberGenerator() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {19.57111811561545d, 14.76141937901437d, 28.647090993782285d},
        new NormalRandomNumberGenerator(10.0d, 10.0d, new MersenneTwister()).getVector(3),
        0.0);
  }

  /**
   * Test {@link NormalRandomNumberGenerator#NormalRandomNumberGenerator(double, double,
   * RandomEngine)}.
   *
   * <p>Method under test: {@link NormalRandomNumberGenerator#NormalRandomNumberGenerator(double,
   * double, RandomEngine)}
   */
  @Test
  @DisplayName("Test new NormalRandomNumberGenerator(double, double, RandomEngine)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NormalRandomNumberGenerator.<init>(double, double, RandomEngine)"})
  void testNewNormalRandomNumberGenerator2() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {9.571118115615452d, 4.76141937901437d, 18.647090993782285d},
        new NormalRandomNumberGenerator(0.0d, 10.0d, new MersenneTwister()).getVector(3),
        0.0);
  }

  /**
   * Test {@link NormalRandomNumberGenerator#getVector(int)}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@code 3.9142236231230907} and {@code
   *       2.952283875802874}.
   * </ul>
   *
   * <p>Method under test: {@link NormalRandomNumberGenerator#getVector(int)}
   */
  @Test
  @DisplayName(
      "Test getVector(int); then return array of double with '3.9142236231230907' and '2.952283875802874'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] NormalRandomNumberGenerator.getVector(int)"})
  void testGetVector_thenReturnArrayOfDoubleWith39142236231230907And2952283875802874() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {3.9142236231230907d, 2.952283875802874d, 5.729418198756457d},
        new NormalRandomNumberGenerator(2.0d, 2.0d, new MersenneTwister()).getVector(3),
        0.0);
  }

  /**
   * Test {@link NormalRandomNumberGenerator#getVector(int)}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@link Double#NaN} and {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link NormalRandomNumberGenerator#getVector(int)}
   */
  @Test
  @DisplayName("Test getVector(int); then return array of double with NaN and NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] NormalRandomNumberGenerator.getVector(int)"})
  void testGetVector_thenReturnArrayOfDoubleWithNaNAndNaN() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        new NormalRandomNumberGenerator(Double.NaN, 10.0d).getVector(3),
        0.0);
  }

  /**
   * Test {@link NormalRandomNumberGenerator#getVectors(int, int)}.
   *
   * <p>Method under test: {@link NormalRandomNumberGenerator#getVectors(int, int)}
   */
  @Test
  @DisplayName("Test getVectors(int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List NormalRandomNumberGenerator.getVectors(int, int)"})
  void testGetVectors() {
    // Arrange
    NormalRandomNumberGenerator normalRandomNumberGenerator =
        new NormalRandomNumberGenerator(2.0d, 2.0d, new MersenneTwister());

    // Act
    List<double[]> actualVectors = normalRandomNumberGenerator.getVectors(3, 3);

    // Assert
    assertEquals(3, actualVectors.size());
    assertArrayEquals(
        new double[] {0.2001915966686214d, 4.2197508412526386d, 0.5434223593333343d},
        normalRandomNumberGenerator.getVector(3),
        0.0);
    assertArrayEquals(
        new double[] {2.475470805964312d, 1.4925811052177775d, 1.9275249139549238d},
        actualVectors.get(2),
        0.0);
    assertArrayEquals(
        new double[] {3.9142236231230907d, 2.952283875802874d, 5.729418198756457d},
        actualVectors.get(0),
        0.0);
    assertArrayEquals(
        new double[] {4.041452503882573d, 5.273352450477814d, 0.015531802180222654d},
        actualVectors.get(1),
        0.0);
  }

  /**
   * Test {@link NormalRandomNumberGenerator#getVectors(int, int)}.
   *
   * <p>Method under test: {@link NormalRandomNumberGenerator#getVectors(int, int)}
   */
  @Test
  @DisplayName("Test getVectors(int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List NormalRandomNumberGenerator.getVectors(int, int)"})
  void testGetVectors2() {
    // Arrange
    NormalRandomNumberGenerator normalRandomNumberGenerator =
        new NormalRandomNumberGenerator(Double.NaN, 10.0d);

    // Act
    List<double[]> actualVectors = normalRandomNumberGenerator.getVectors(3, 3);

    // Assert
    assertEquals(3, actualVectors.size());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        normalRandomNumberGenerator.getVector(3),
        0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, actualVectors.get(0), 0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, actualVectors.get(1), 0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, actualVectors.get(2), 0.0);
  }

  /**
   * Test {@link NormalRandomNumberGenerator#getVectors(int, int)}.
   *
   * <ul>
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link NormalRandomNumberGenerator#getVectors(int, int)}
   */
  @Test
  @DisplayName("Test getVectors(int, int); then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List NormalRandomNumberGenerator.getVectors(int, int)"})
  void testGetVectors_thenReturnSizeIsThree() {
    // Arrange, Act and Assert
    assertEquals(3, new NormalRandomNumberGenerator(10.0d, 10.0d).getVectors(3, 3).size());
  }
}
