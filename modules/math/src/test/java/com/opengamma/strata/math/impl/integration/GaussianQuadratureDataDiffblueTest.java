package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GaussianQuadratureDataDiffblueTest {
  /**
   * Test {@link GaussianQuadratureData#GaussianQuadratureData(double[], double[])}.
   *
   * <ul>
   *   <li>Then return Abscissas is array of {@code double} with ten and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureData#GaussianQuadratureData(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test new GaussianQuadratureData(double[], double[]); then return Abscissas is array of double with ten and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussianQuadratureData.<init>(double[], double[])"})
  void testNewGaussianQuadratureData_thenReturnAbscissasIsArrayOfDoubleWithTenAnd05() {
    // Arrange and Act
    GaussianQuadratureData actualGaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualGaussianQuadratureData.getAbscissas(), 0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualGaussianQuadratureData.getWeights(), 0.0);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GaussianQuadratureData#getAbscissas()}
   *   <li>{@link GaussianQuadratureData#getWeights()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] GaussianQuadratureData.getAbscissas()",
    "double[] GaussianQuadratureData.getWeights()"
  })
  void testGettersAndSetters() {
    // Arrange
    GaussianQuadratureData gaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    double[] actualAbscissas = gaussianQuadratureData.getAbscissas();

    // Assert
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualAbscissas, 0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d}, gaussianQuadratureData.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussianQuadratureData#equals(Object)}, and {@link
   * GaussianQuadratureData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GaussianQuadratureData#equals(Object)}
   *   <li>{@link GaussianQuadratureData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureData.equals(Object)",
    "int GaussianQuadratureData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GaussianQuadratureData gaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    GaussianQuadratureData gaussianQuadratureData2 =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertEquals(gaussianQuadratureData, gaussianQuadratureData2);
    assertEquals(gaussianQuadratureData.hashCode(), gaussianQuadratureData2.hashCode());
  }

  /**
   * Test {@link GaussianQuadratureData#equals(Object)}, and {@link
   * GaussianQuadratureData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GaussianQuadratureData#equals(Object)}
   *   <li>{@link GaussianQuadratureData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureData.equals(Object)",
    "int GaussianQuadratureData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GaussianQuadratureData gaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertEquals(gaussianQuadratureData, gaussianQuadratureData);
    int expectedHashCodeResult = gaussianQuadratureData.hashCode();
    assertEquals(expectedHashCodeResult, gaussianQuadratureData.hashCode());
  }

  /**
   * Test {@link GaussianQuadratureData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureData.equals(Object)",
    "int GaussianQuadratureData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GaussianQuadratureData gaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertNotEquals(gaussianQuadratureData, 1);
  }

  /**
   * Test {@link GaussianQuadratureData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureData.equals(Object)",
    "int GaussianQuadratureData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GaussianQuadratureData gaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {0.5d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    GaussianQuadratureData gaussianQuadratureData2 =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertNotEquals(gaussianQuadratureData, gaussianQuadratureData2);
  }

  /**
   * Test {@link GaussianQuadratureData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureData.equals(Object)",
    "int GaussianQuadratureData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    GaussianQuadratureData gaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertNotEquals(gaussianQuadratureData, null);
  }

  /**
   * Test {@link GaussianQuadratureData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureData.equals(Object)",
    "int GaussianQuadratureData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    GaussianQuadratureData gaussianQuadratureData =
        new GaussianQuadratureData(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertNotEquals(gaussianQuadratureData, "Different type to GaussianQuadratureData");
  }
}
