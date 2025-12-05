package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoublesScheduleGeneratorDiffblueTest {
  /**
   * Test {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getIntegrationsPoints(double, double, DoubleArray, DoubleArray); then return DoubleArray with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.getIntegrationsPoints(double, double, DoubleArray, DoubleArray)"
  })
  void testGetIntegrationsPoints_thenReturnDoubleArrayWithValueIsTen() {
    // Arrange
    DoubleArray discountCurveNodes = DoubleArray.filled(3);
    DoubleArray creditCurveNodes = DoubleArray.of(10.0d);

    // Act
    DoubleArray actualIntegrationsPoints =
        DoublesScheduleGenerator.getIntegrationsPoints(
            10.0d, 10.0d, discountCurveNodes, creditCurveNodes);

    // Assert
    assertEquals(creditCurveNodes, actualIntegrationsPoints);
  }

  /**
   * Test {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return min is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getIntegrationsPoints(double, double, DoubleArray, DoubleArray); when '-0.5'; then return min is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.getIntegrationsPoints(double, double, DoubleArray, DoubleArray)"
  })
  void testGetIntegrationsPoints_when05_thenReturnMinIs05() {
    // Arrange
    DoubleArray discountCurveNodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualIntegrationsPoints =
        DoublesScheduleGenerator.getIntegrationsPoints(
            10.0d, -0.5d, discountCurveNodes, DoubleArray.filled(3));

    // Assert
    assertEquals(-0.5d, actualIntegrationsPoints.min());
    List<Double> toListResult = actualIntegrationsPoints.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-0.5d, toListResult.get(1).doubleValue());
    assertEquals(9.5d, actualIntegrationsPoints.sum());
    assertArrayEquals(new double[] {10.0d, -0.5d}, actualIntegrationsPoints.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getIntegrationsPoints(double, double, DoubleArray, DoubleArray); when '-0.5'; then return toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.getIntegrationsPoints(double, double, DoubleArray, DoubleArray)"
  })
  void testGetIntegrationsPoints_when05_thenReturnToListSizeIsThree() {
    // Arrange
    DoubleArray discountCurveNodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualIntegrationsPoints =
        DoublesScheduleGenerator.getIntegrationsPoints(
            -0.5d, 10.0d, discountCurveNodes, DoubleArray.filled(3));

    // Assert
    List<Double> toListResult = actualIntegrationsPoints.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-0.5d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualIntegrationsPoints.size());
    assertArrayEquals(
        new double[] {-0.5d, 0.0d, 10.0d}, actualIntegrationsPoints.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getIntegrationsPoints(double, double, DoubleArray, DoubleArray); when filled three; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.getIntegrationsPoints(double, double, DoubleArray, DoubleArray)"
  })
  void testGetIntegrationsPoints_whenFilledThree_thenReturnSizeIsOne() {
    // Arrange
    DoubleArray discountCurveNodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualIntegrationsPoints =
        DoublesScheduleGenerator.getIntegrationsPoints(
            10.0d, 10.0d, discountCurveNodes, DoubleArray.filled(3));

    // Assert
    assertEquals(1, actualIntegrationsPoints.size());
    assertEquals(1, actualIntegrationsPoints.toList().size());
    assertEquals(10.0d, actualIntegrationsPoints.min());
    assertArrayEquals(new double[] {10.0d}, actualIntegrationsPoints.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getIntegrationsPoints(double, double, DoubleArray, DoubleArray); when NaN; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.getIntegrationsPoints(double, double, DoubleArray, DoubleArray)"
  })
  void testGetIntegrationsPoints_whenNaN_thenReturnSizeIsOne() {
    // Arrange
    DoubleArray discountCurveNodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualIntegrationsPoints =
        DoublesScheduleGenerator.getIntegrationsPoints(
            Double.NaN, 10.0d, discountCurveNodes, DoubleArray.filled(3));

    // Assert
    assertEquals(1, actualIntegrationsPoints.size());
    assertEquals(1, actualIntegrationsPoints.toList().size());
    assertEquals(10.0d, actualIntegrationsPoints.min());
    assertArrayEquals(new double[] {10.0d}, actualIntegrationsPoints.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getIntegrationsPoints(double, double, DoubleArray, DoubleArray); when zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.getIntegrationsPoints(double, double, DoubleArray, DoubleArray)"
  })
  void testGetIntegrationsPoints_whenZero_thenReturnMinIsZero() {
    // Arrange
    DoubleArray discountCurveNodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualIntegrationsPoints =
        DoublesScheduleGenerator.getIntegrationsPoints(
            0.0d, 10.0d, discountCurveNodes, DoubleArray.filled(3));

    // Assert
    assertEquals(0.0d, actualIntegrationsPoints.min());
    List<Double> toListResult = actualIntegrationsPoints.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {0.0d, 10.0d}, actualIntegrationsPoints.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#getIntegrationsPoints(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getIntegrationsPoints(double, double, DoubleArray, DoubleArray); when zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.getIntegrationsPoints(double, double, DoubleArray, DoubleArray)"
  })
  void testGetIntegrationsPoints_whenZero_thenReturnMinIsZero2() {
    // Arrange
    DoubleArray discountCurveNodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualIntegrationsPoints =
        DoublesScheduleGenerator.getIntegrationsPoints(
            0.0d, 10.0d, discountCurveNodes, DoubleArray.of(10.0d));

    // Assert
    assertEquals(0.0d, actualIntegrationsPoints.min());
    List<Double> toListResult = actualIntegrationsPoints.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {0.0d, 10.0d}, actualIntegrationsPoints.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return min is {@code 0.0013698630136986301}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); then return min is '0.0013698630136986301'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_thenReturnMinIs00013698630136986301() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(
            0.0d, 0.0013698630136986301d, DoubleArray.filled(3));

    // Assert
    assertEquals(0.0013698630136986301d, actualTruncateSetInclusiveResult.min());
    assertEquals(0.0013698630136986301d, actualTruncateSetInclusiveResult.sum());
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0013698630136986301d, toListResult.get(0).doubleValue());
    assertEquals(1, actualTruncateSetInclusiveResult.size());
    assertArrayEquals(
        new double[] {0.0013698630136986301d},
        actualTruncateSetInclusiveResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return sum is {@code -0.4986301369863014}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); then return sum is '-0.4986301369863014'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_thenReturnSumIs04986301369863014() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(
            -0.5d, 0.0013698630136986301d, DoubleArray.filled(3));

    // Assert
    assertEquals(-0.4986301369863014d, actualTruncateSetInclusiveResult.sum());
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0013698630136986301d, toListResult.get(3).doubleValue());
    assertEquals(4, actualTruncateSetInclusiveResult.size());
    assertArrayEquals(
        new double[] {-0.5d, 0.0d, 0.0d, 0.0013698630136986301d},
        actualTruncateSetInclusiveResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return min is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); when '-0.5'; then return min is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_when05_thenReturnMinIs05() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(10.0d, -0.5d, DoubleArray.filled(3));

    // Assert
    assertEquals(-0.5d, actualTruncateSetInclusiveResult.min());
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-0.5d, toListResult.get(1).doubleValue());
    assertEquals(9.5d, actualTruncateSetInclusiveResult.sum());
    assertArrayEquals(
        new double[] {10.0d, -0.5d}, actualTruncateSetInclusiveResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return toList size is five.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); when '-0.5'; then return toList size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_when05_thenReturnToListSizeIsFive() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(-0.5d, 10.0d, DoubleArray.filled(3));

    // Assert
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(5, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, toListResult.get(4).doubleValue());
    assertEquals(5, actualTruncateSetInclusiveResult.size());
    assertArrayEquals(
        new double[] {-0.5d, 0.0d, 0.0d, 0.0d, 10.0d},
        actualTruncateSetInclusiveResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return min is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); when DoubleArray with value is ten; then return min is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_whenDoubleArrayWithValueIsTen_thenReturnMinIsTen() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(10.0d, 10.0d, DoubleArray.of(10.0d));

    // Assert
    assertEquals(10.0d, actualTruncateSetInclusiveResult.min());
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(20.0d, actualTruncateSetInclusiveResult.sum());
    assertArrayEquals(
        new double[] {10.0d, 10.0d}, actualTruncateSetInclusiveResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); when DoubleArray with value is ten; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_whenDoubleArrayWithValueIsTen_thenReturnMinIsZero() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(0.0d, 10.0d, DoubleArray.of(10.0d));

    // Assert
    assertEquals(0.0d, actualTruncateSetInclusiveResult.min());
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, actualTruncateSetInclusiveResult.sum());
    assertArrayEquals(
        new double[] {0.0d, 10.0d}, actualTruncateSetInclusiveResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return min is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); when filled three; then return min is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_whenFilledThree_thenReturnMinIsTen() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(10.0d, 10.0d, DoubleArray.filled(3));

    // Assert
    assertEquals(10.0d, actualTruncateSetInclusiveResult.min());
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(20.0d, actualTruncateSetInclusiveResult.sum());
    assertArrayEquals(
        new double[] {10.0d, 10.0d}, actualTruncateSetInclusiveResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return max is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); when NaN; then return max is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_whenNaN_thenReturnMaxIsNaN() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(Double.NaN, 10.0d, DoubleArray.filled(3));

    // Assert
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(Double.NaN, actualTruncateSetInclusiveResult.max());
    assertEquals(Double.NaN, actualTruncateSetInclusiveResult.min());
    assertEquals(Double.NaN, actualTruncateSetInclusiveResult.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, 10.0d}, actualTruncateSetInclusiveResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoublesScheduleGenerator#truncateSetInclusive(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoublesScheduleGenerator#truncateSetInclusive(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test truncateSetInclusive(double, double, DoubleArray); when zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoublesScheduleGenerator.truncateSetInclusive(double, double, DoubleArray)"
  })
  void testTruncateSetInclusive_whenZero_thenReturnMinIsZero() {
    // Arrange and Act
    DoubleArray actualTruncateSetInclusiveResult =
        DoublesScheduleGenerator.truncateSetInclusive(0.0d, 10.0d, DoubleArray.filled(3));

    // Assert
    assertEquals(0.0d, actualTruncateSetInclusiveResult.min());
    List<Double> toListResult = actualTruncateSetInclusiveResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, actualTruncateSetInclusiveResult.sum());
    assertArrayEquals(
        new double[] {0.0d, 10.0d}, actualTruncateSetInclusiveResult.toArrayUnsafe(), 0.0);
  }
}
