package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.market.ShiftType;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PointShiftsBuilderDiffblueTest {
  /**
   * Test {@link PointShiftsBuilder#PointShiftsBuilder(ShiftType)}.
   *
   * <ul>
   *   <li>When {@code RELATIVE}.
   *   <li>Then return build Shifts size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointShiftsBuilder#PointShiftsBuilder(ShiftType)}
   */
  @Test
  @DisplayName(
      "Test new PointShiftsBuilder(ShiftType); when 'RELATIVE'; then return build Shifts size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShiftsBuilder.<init>(ShiftType)"})
  void testNewPointShiftsBuilder_whenRelative_thenReturnBuildShiftsSizeIsZero() {
    // Arrange, Act and Assert
    PointShifts pointShifts = new PointShiftsBuilder(ShiftType.RELATIVE).build();
    DoubleMatrix shifts = pointShifts.getShifts();
    assertEquals(0, shifts.size());
    assertEquals(0, pointShifts.getScenarioCount());
    assertEquals(0, shifts.toArrayUnsafe().length);
    assertEquals(0.0d, shifts.total());
    assertEquals(2, shifts.dimensions());
    assertEquals(ShiftType.RELATIVE, pointShifts.getShiftType());
    assertTrue(pointShifts.getNodeIndices().isEmpty());
    assertTrue(shifts.isEmpty());
    assertTrue(shifts.isSquare());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, pointShifts.getMarketDataType());
  }

  /**
   * Test {@link PointShiftsBuilder#addShift(int, Object, double)}.
   *
   * <p>Method under test: {@link PointShiftsBuilder#addShift(int, Object, double)}
   */
  @Test
  @DisplayName("Test addShift(int, Object, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointShiftsBuilder PointShiftsBuilder.addShift(int, Object, double)"})
  void testAddShift() {
    // Arrange
    PointShiftsBuilder builderResult = PointShifts.builder(ShiftType.RELATIVE);
    builderResult.addShift(1, "Node Identifier", 10.0d);

    // Act
    builderResult.addShift(1, "Node Identifier", 10.0d);

    // Assert that nothing has changed
    PointShifts pointShifts = builderResult.build();
    ImmutableMap<Object, Integer> nodeIndices = pointShifts.getNodeIndices();
    assertEquals(1, nodeIndices.size());
    assertEquals(0, nodeIndices.get("Node Identifier").intValue());
    DoubleMatrix shifts = pointShifts.getShifts();
    assertEquals(10.0d, shifts.total());
    assertEquals(2, shifts.size());
    assertEquals(2, pointShifts.getScenarioCount());
    double[][] toArrayUnsafeResult = shifts.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertFalse(shifts.isEmpty());
    assertFalse(shifts.isSquare());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PointShiftsBuilder#addShift(int, Object, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then builder {@code RELATIVE} build NodeIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link PointShiftsBuilder#addShift(int, Object, double)}
   */
  @Test
  @DisplayName(
      "Test addShift(int, Object, double); when one; then builder 'RELATIVE' build NodeIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointShiftsBuilder PointShiftsBuilder.addShift(int, Object, double)"})
  void testAddShift_whenOne_thenBuilderRelativeBuildNodeIndicesSizeIsOne() {
    // Arrange
    PointShiftsBuilder builderResult = PointShifts.builder(ShiftType.RELATIVE);

    // Act
    builderResult.addShift(1, "Node Identifier", 10.0d);

    // Assert
    PointShifts pointShifts = builderResult.build();
    ImmutableMap<Object, Integer> nodeIndices = pointShifts.getNodeIndices();
    assertEquals(1, nodeIndices.size());
    assertEquals(0, nodeIndices.get("Node Identifier").intValue());
    DoubleMatrix shifts = pointShifts.getShifts();
    assertEquals(10.0d, shifts.total());
    assertEquals(2, shifts.size());
    assertEquals(2, pointShifts.getScenarioCount());
    double[][] toArrayUnsafeResult = shifts.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertFalse(shifts.isEmpty());
    assertFalse(shifts.isSquare());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PointShiftsBuilder#addShifts(int, Map)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then builder {@code RELATIVE} build NodeIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link PointShiftsBuilder#addShifts(int, Map)}
   */
  @Test
  @DisplayName(
      "Test addShifts(int, Map); given '42'; then builder 'RELATIVE' build NodeIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointShiftsBuilder PointShiftsBuilder.addShifts(int, Map)"})
  void testAddShifts_given42_thenBuilderRelativeBuildNodeIndicesSizeIsTwo() {
    // Arrange
    PointShiftsBuilder builderResult = PointShifts.builder(ShiftType.RELATIVE);

    HashMap<Object, Double> shiftMap = new HashMap<>();
    shiftMap.put("42", 0.5d);
    shiftMap.put("Key", 10.0d);

    // Act
    builderResult.addShifts(1, shiftMap);

    // Assert
    PointShifts pointShifts = builderResult.build();
    ImmutableMap<Object, Integer> nodeIndices = pointShifts.getNodeIndices();
    assertEquals(2, nodeIndices.size());
    assertEquals(0, nodeIndices.get("42").intValue());
    assertEquals(1, nodeIndices.get("Key").intValue());
    DoubleMatrix shifts = pointShifts.getShifts();
    assertEquals(10.5d, shifts.total());
    double[][] toArrayUnsafeResult = shifts.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, shifts.size());
    assertTrue(shifts.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.5d, 10.0d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PointShiftsBuilder#addShifts(int, Map)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>Then builder {@code RELATIVE} build NodeIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link PointShiftsBuilder#addShifts(int, Map)}
   */
  @Test
  @DisplayName(
      "Test addShifts(int, Map); given 'Key'; then builder 'RELATIVE' build NodeIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointShiftsBuilder PointShiftsBuilder.addShifts(int, Map)"})
  void testAddShifts_givenKey_thenBuilderRelativeBuildNodeIndicesSizeIsOne() {
    // Arrange
    PointShiftsBuilder builderResult = PointShifts.builder(ShiftType.RELATIVE);

    HashMap<Object, Double> shiftMap = new HashMap<>();
    shiftMap.put("Key", 10.0d);

    // Act
    builderResult.addShifts(1, shiftMap);

    // Assert
    PointShifts pointShifts = builderResult.build();
    ImmutableMap<Object, Integer> nodeIndices = pointShifts.getNodeIndices();
    assertEquals(1, nodeIndices.size());
    assertEquals(0, nodeIndices.get("Key").intValue());
    DoubleMatrix shifts = pointShifts.getShifts();
    assertEquals(10.0d, shifts.total());
    assertEquals(2, shifts.size());
    double[][] toArrayUnsafeResult = shifts.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertFalse(shifts.isSquare());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PointShiftsBuilder#addShifts(int, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return build Shifts size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointShiftsBuilder#addShifts(int, Map)}
   */
  @Test
  @DisplayName("Test addShifts(int, Map); when HashMap(); then return build Shifts size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointShiftsBuilder PointShiftsBuilder.addShifts(int, Map)"})
  void testAddShifts_whenHashMap_thenReturnBuildShiftsSizeIsZero() {
    // Arrange
    PointShiftsBuilder builderResult = PointShifts.builder(ShiftType.RELATIVE);

    // Act and Assert
    PointShifts pointShifts = builderResult.addShifts(1, new HashMap<>()).build();
    DoubleMatrix shifts = pointShifts.getShifts();
    assertEquals(0, shifts.size());
    assertEquals(0, pointShifts.getScenarioCount());
    assertEquals(0, shifts.toArrayUnsafe().length);
    assertEquals(0.0d, shifts.total());
    assertEquals(2, shifts.dimensions());
    assertEquals(ShiftType.RELATIVE, pointShifts.getShiftType());
    assertTrue(pointShifts.getNodeIndices().isEmpty());
    assertTrue(shifts.isEmpty());
    assertTrue(shifts.isSquare());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, pointShifts.getMarketDataType());
  }

  /**
   * Test {@link PointShiftsBuilder#build()}.
   *
   * <p>Method under test: {@link PointShiftsBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PointShifts PointShiftsBuilder.build()"})
  void testBuild() {
    // Arrange and Act
    PointShifts actualPointShifts = PointShifts.builder(ShiftType.RELATIVE).build();

    // Assert
    DoubleMatrix shifts = actualPointShifts.getShifts();
    assertEquals(0, shifts.size());
    assertEquals(0, actualPointShifts.getScenarioCount());
    assertEquals(0, shifts.toArrayUnsafe().length);
    assertEquals(0.0d, shifts.total());
    assertEquals(2, shifts.dimensions());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    assertTrue(shifts.isEmpty());
    assertTrue(shifts.isSquare());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
  }
}
