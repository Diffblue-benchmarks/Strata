package com.opengamma.strata.collect.timeseries;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LocalDateDoubleTimeSeriesBuilderDiffblueTest {
  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#build()}.
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void LocalDateDoubleTimeSeriesBuilder.<init>()",
    "LocalDateDoubleTimeSeries LocalDateDoubleTimeSeriesBuilder.build()"
  })
  void testBuild() {
    // Arrange and Act
    LocalDateDoubleTimeSeries actualLocalDateDoubleTimeSeries =
        LocalDateDoubleTimeSeries.builder().build();

    // Assert
    assertSame(
        ((SparseLocalDateDoubleTimeSeries) actualLocalDateDoubleTimeSeries).EMPTY,
        actualLocalDateDoubleTimeSeries);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}.
   *
   * <p>Method under test: {@link
   * LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}
   */
  @Test
  @DisplayName("Test new LocalDateDoubleTimeSeriesBuilder(Stream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalDateDoubleTimeSeriesBuilder.<init>(Stream)"})
  void testNewLocalDateDoubleTimeSeriesBuilder() {
    // Arrange
    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    LocalDate date = LocalDate.of(1970, 1, 1);
    localDateDoublePointList.add(LocalDateDoublePoint.of(date, 10.0d));
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        new LocalDateDoubleTimeSeriesBuilder(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDate earliestDate = localDateDoubleTimeSeries.getEarliestDate();
    assertEquals("1970-01-01", earliestDate.toString());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, earliestDate);
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}.
   *
   * <p>Method under test: {@link
   * LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}
   */
  @Test
  @DisplayName("Test new LocalDateDoubleTimeSeriesBuilder(Stream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalDateDoubleTimeSeriesBuilder.<init>(Stream)"})
  void testNewLocalDateDoubleTimeSeriesBuilder2() {
    // Arrange
    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    LocalDate date = LocalDate.of(1970, 1, 1);
    localDateDoublePointList.add(LocalDateDoublePoint.of(date, 10.0d));
    localDateDoublePointList.add(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d));
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        new LocalDateDoubleTimeSeriesBuilder(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDate earliestDate = localDateDoubleTimeSeries.getEarliestDate();
    assertEquals("1970-01-01", earliestDate.toString());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, earliestDate);
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}.
   *
   * <p>Method under test: {@link
   * LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}
   */
  @Test
  @DisplayName("Test new LocalDateDoubleTimeSeriesBuilder(Stream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalDateDoubleTimeSeriesBuilder.<init>(Stream)"})
  void testNewLocalDateDoubleTimeSeriesBuilder3() {
    // Arrange
    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    LocalDate date = LocalDate.ofYearDay(5, 1);
    localDateDoublePointList.add(LocalDateDoublePoint.of(date, 10.0d));
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        new LocalDateDoubleTimeSeriesBuilder(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDate earliestDate = localDateDoubleTimeSeries.getEarliestDate();
    assertEquals("0005-01-01", earliestDate.toString());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, earliestDate);
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}.
   *
   * <p>Method under test: {@link
   * LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}
   */
  @Test
  @DisplayName("Test new LocalDateDoubleTimeSeriesBuilder(Stream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalDateDoubleTimeSeriesBuilder.<init>(Stream)"})
  void testNewLocalDateDoubleTimeSeriesBuilder4() {
    // Arrange
    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    localDateDoublePointList.add(LocalDateDoublePoint.of(LocalDate.ofYearDay(5, 1), 10.0d));
    LocalDate date = LocalDate.of(1970, 1, 1);
    localDateDoublePointList.add(LocalDateDoublePoint.of(date, 10.0d));
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        new LocalDateDoubleTimeSeriesBuilder(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof SparseLocalDateDoubleTimeSeries);
    LocalDate latestDate = localDateDoubleTimeSeries.getLatestDate();
    assertEquals("1970-01-01", latestDate.toString());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(2, localDateDoubleTimeSeries.size());
    assertFalse(localDateDoubleTimeSeries.isEmpty());
    assertSame(date, latestDate);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(LocalDate[],
   * double[])}.
   *
   * <p>Method under test: {@link
   * LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(LocalDate[], double[])}
   */
  @Test
  @DisplayName("Test new LocalDateDoubleTimeSeriesBuilder(LocalDate[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalDateDoubleTimeSeriesBuilder.<init>(LocalDate[], double[])"})
  void testNewLocalDateDoubleTimeSeriesBuilder5() {
    // Arrange
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    LocalDate[] dates = new LocalDate[] {ofResult};

    // Act
    LocalDateDoubleTimeSeriesBuilder actualLocalDateDoubleTimeSeriesBuilder =
        new LocalDateDoubleTimeSeriesBuilder(dates, new double[] {10.0d, 0.7d, 10.0d, 0.7d});

    // Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        actualLocalDateDoubleTimeSeriesBuilder.build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDate earliestDate = localDateDoubleTimeSeries.getEarliestDate();
    assertEquals("1970-01-01", earliestDate.toString());
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertSame(
        ofResult, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(ofResult, earliestDate);
    assertSame(ofResult, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}.
   *
   * <ul>
   *   <li>Then return build size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * LocalDateDoubleTimeSeriesBuilder#LocalDateDoubleTimeSeriesBuilder(Stream)}
   */
  @Test
  @DisplayName("Test new LocalDateDoubleTimeSeriesBuilder(Stream); then return build size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LocalDateDoubleTimeSeriesBuilder.<init>(Stream)"})
  void testNewLocalDateDoubleTimeSeriesBuilder_thenReturnBuildSizeIsZero() {
    // Arrange
    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        new LocalDateDoubleTimeSeriesBuilder(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof SparseLocalDateDoubleTimeSeries);
    assertEquals(0, localDateDoubleTimeSeries.size());
    assertTrue(localDateDoubleTimeSeries.isEmpty());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#put(LocalDate, double)} with {@code date}, {@code
   * value}.
   *
   * <ul>
   *   <li>Then builder build {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#put(LocalDate, double)}
   */
  @Test
  @DisplayName(
      "Test put(LocalDate, double) with 'date', 'value'; then builder build DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.put(LocalDate, double)"
  })
  void testPutWithDateValue_thenBuilderBuildDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutResult = builderResult.put(date, 10.0d);

    // Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertSame(builderResult, actualPutResult);
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#put(LocalDateDoublePoint)} with {@code point}.
   *
   * <ul>
   *   <li>Then builder build {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#put(LocalDateDoublePoint)}
   */
  @Test
  @DisplayName(
      "Test put(LocalDateDoublePoint) with 'point'; then builder build DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.put(LocalDateDoublePoint)"
  })
  void testPutWithPoint_thenBuilderBuildDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutResult =
        builderResult.put(LocalDateDoublePoint.of(date, 10.0d));

    // Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertSame(builderResult, actualPutResult);
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDate, double, DoubleBinaryOperator)}
   * with {@code date}, {@code value}, {@code operator}.
   *
   * <ul>
   *   <li>Then builder build {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDate, double,
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test merge(LocalDate, double, DoubleBinaryOperator) with 'date', 'value', 'operator'; then builder build DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.merge(LocalDate, double, DoubleBinaryOperator)"
  })
  void testMergeWithDateValueOperator_thenBuilderBuildDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    builderResult.merge(date, 10.0d, mock(DoubleBinaryOperator.class));

    // Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDate, double, DoubleBinaryOperator)}
   * with {@code date}, {@code value}, {@code operator}.
   *
   * <ul>
   *   <li>Then calls {@link DoubleBinaryOperator#applyAsDouble(double, double)}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDate, double,
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test merge(LocalDate, double, DoubleBinaryOperator) with 'date', 'value', 'operator'; then calls applyAsDouble(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.merge(LocalDate, double, DoubleBinaryOperator)"
  })
  void testMergeWithDateValueOperator_thenCallsApplyAsDouble() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();
    LocalDate date = LocalDate.of(1970, 1, 1);
    builderResult.put(date, 10.0d);
    LocalDate date2 = LocalDate.of(1970, 1, 1);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    builderResult.merge(date2, 10.0d, operator);

    // Assert that nothing has changed
    verify(operator).applyAsDouble(10.0d, 10.0d);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDateDoublePoint, DoubleBinaryOperator)}
   * with {@code point}, {@code operator}.
   *
   * <ul>
   *   <li>Then builder build {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDateDoublePoint,
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test merge(LocalDateDoublePoint, DoubleBinaryOperator) with 'point', 'operator'; then builder build DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.merge(LocalDateDoublePoint, DoubleBinaryOperator)"
  })
  void testMergeWithPointOperator_thenBuilderBuildDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    builderResult.merge(LocalDateDoublePoint.of(date, 10.0d), mock(DoubleBinaryOperator.class));

    // Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDateDoublePoint, DoubleBinaryOperator)}
   * with {@code point}, {@code operator}.
   *
   * <ul>
   *   <li>Then calls {@link DoubleBinaryOperator#applyAsDouble(double, double)}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#merge(LocalDateDoublePoint,
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test merge(LocalDateDoublePoint, DoubleBinaryOperator) with 'point', 'operator'; then calls applyAsDouble(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.merge(LocalDateDoublePoint, DoubleBinaryOperator)"
  })
  void testMergeWithPointOperator_thenCallsApplyAsDouble() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();
    LocalDate date = LocalDate.of(1970, 1, 1);
    builderResult.put(date, 10.0d);
    LocalDateDoublePoint point = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    builderResult.merge(point, operator);

    // Assert that nothing has changed
    verify(operator).applyAsDouble(10.0d, 10.0d);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, Collection)} with {@code
   * Collection}, {@code Collection}.
   *
   * <ul>
   *   <li>Then build return {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test putAll(Collection, Collection) with 'Collection', 'Collection'; then build return DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Collection, Collection)"
  })
  void testPutAllWithCollectionCollection_thenBuildReturnDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    ArrayList<LocalDate> dates = new ArrayList<>();
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    dates.add(ofResult);

    ArrayList<Double> values = new ArrayList<>();
    values.add(10.0d);

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        builderResult.putAll(dates, values).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 = builderResult.build();
    assertTrue(localDateDoubleTimeSeries2 instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(1, localDateDoubleTimeSeries2.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getLatestValue());
    assertSame(
        ofResult, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(
        ofResult, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries2).getStartDate());
    assertSame(ofResult, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(ofResult, localDateDoubleTimeSeries2.getEarliestDate());
    assertSame(ofResult, localDateDoubleTimeSeries.getLatestDate());
    assertSame(ofResult, localDateDoubleTimeSeries2.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, Collection)} with {@code
   * Collection}, {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, Collection)}
   */
  @Test
  @DisplayName(
      "Test putAll(Collection, Collection) with 'Collection', 'Collection'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Collection, Collection)"
  })
  void testPutAllWithCollectionCollection_whenArrayList_thenReturnBuilder() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();
    ArrayList<LocalDate> dates = new ArrayList<>();

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutAllResult =
        builderResult.putAll(dates, new ArrayList<>());

    // Assert
    assertSame(builderResult, actualPutAllResult);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, double[])} with {@code
   * Collection}, {@code double[]}.
   *
   * <ul>
   *   <li>Then build return {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, double[])}
   */
  @Test
  @DisplayName(
      "Test putAll(Collection, double[]) with 'Collection', 'double[]'; then build return DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Collection, double[])"
  })
  void testPutAllWithCollectionDouble_thenBuildReturnDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    ArrayList<LocalDate> dates = new ArrayList<>();
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    dates.add(ofResult);
    dates.add(LocalDate.of(1970, 1, 1));
    dates.add(LocalDate.of(1970, 1, 1));
    dates.add(LocalDate.of(1970, 1, 1));

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        builderResult.putAll(dates, new double[] {10.0d, 0.7d, 10.0d, 0.7d}).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 = builderResult.build();
    assertTrue(localDateDoubleTimeSeries2 instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(0.7d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(0.7d, localDateDoubleTimeSeries2.getEarliestValue());
    assertEquals(0.7d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(0.7d, localDateDoubleTimeSeries2.getLatestValue());
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(1, localDateDoubleTimeSeries2.size());
    assertSame(
        ofResult, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(
        ofResult, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries2).getStartDate());
    assertSame(ofResult, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(ofResult, localDateDoubleTimeSeries2.getEarliestDate());
    assertSame(ofResult, localDateDoubleTimeSeries.getLatestDate());
    assertSame(ofResult, localDateDoubleTimeSeries2.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, double[])} with {@code
   * Collection}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Collection, double[])}
   */
  @Test
  @DisplayName(
      "Test putAll(Collection, double[]) with 'Collection', 'double[]'; when empty array of double; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Collection, double[])"
  })
  void testPutAllWithCollectionDouble_whenEmptyArrayOfDouble_thenReturnBuilder() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutAllResult =
        builderResult.putAll(new ArrayList<>(), new double[] {});

    // Assert
    assertSame(builderResult, actualPutAllResult);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then build return {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(List)}
   */
  @Test
  @DisplayName("Test putAll(List) with 'List'; then build return DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(List)"
  })
  void testPutAllWithList_thenBuildReturnDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    ArrayList<LocalDateDoublePoint> points = new ArrayList<>();
    LocalDate date = LocalDate.of(1970, 1, 1);
    points.add(LocalDateDoublePoint.of(date, 10.0d));

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.putAll(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 = builderResult.build();
    assertTrue(localDateDoubleTimeSeries2 instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(1, localDateDoubleTimeSeries2.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries2).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries2.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
    assertSame(date, localDateDoubleTimeSeries2.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then build return {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(List)}
   */
  @Test
  @DisplayName("Test putAll(List) with 'List'; then build return DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(List)"
  })
  void testPutAllWithList_thenBuildReturnDenseLocalDateDoubleTimeSeries2() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    ArrayList<LocalDateDoublePoint> points = new ArrayList<>();
    LocalDate date = LocalDate.of(1970, 1, 1);
    points.add(LocalDateDoublePoint.of(date, 10.0d));
    points.add(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d));

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.putAll(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 = builderResult.build();
    assertTrue(localDateDoubleTimeSeries2 instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(1, localDateDoubleTimeSeries2.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries2).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries2.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
    assertSame(date, localDateDoubleTimeSeries2.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(List)}
   */
  @Test
  @DisplayName("Test putAll(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(List)"
  })
  void testPutAllWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutAllResult = builderResult.putAll(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualPutAllResult);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(LocalDateDoubleTimeSeriesBuilder)} with
   * {@code LocalDateDoubleTimeSeriesBuilder}.
   *
   * <ul>
   *   <li>When builder.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link
   * LocalDateDoubleTimeSeriesBuilder#putAll(LocalDateDoubleTimeSeriesBuilder)}
   */
  @Test
  @DisplayName(
      "Test putAll(LocalDateDoubleTimeSeriesBuilder) with 'LocalDateDoubleTimeSeriesBuilder'; when builder; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(LocalDateDoubleTimeSeriesBuilder)"
  })
  void testPutAllWithLocalDateDoubleTimeSeriesBuilder_whenBuilder_thenReturnBuilder() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutAllResult =
        builderResult.putAll(LocalDateDoubleTimeSeries.builder());

    // Assert
    assertSame(builderResult, actualPutAllResult);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Then build return {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map) with 'Map'; then build return DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Map)"
  })
  void testPutAllWithMap_thenBuildReturnDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    HashMap<LocalDate, Double> map = new HashMap<>();
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    map.put(ofResult, 10.0d);

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.putAll(map).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 = builderResult.build();
    assertTrue(localDateDoubleTimeSeries2 instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(1, localDateDoubleTimeSeries2.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getLatestValue());
    assertSame(
        ofResult, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(
        ofResult, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries2).getStartDate());
    assertSame(ofResult, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(ofResult, localDateDoubleTimeSeries2.getEarliestDate());
    assertSame(ofResult, localDateDoubleTimeSeries.getLatestDate());
    assertSame(ofResult, localDateDoubleTimeSeries2.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Map)}
   */
  @Test
  @DisplayName("Test putAll(Map) with 'Map'; when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Map)"
  })
  void testPutAllWithMap_whenHashMap_thenReturnBuilder() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutAllResult = builderResult.putAll(new HashMap<>());

    // Assert
    assertSame(builderResult, actualPutAllResult);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Stream)} with {@code Stream}.
   *
   * <ul>
   *   <li>Then build return {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Stream)}
   */
  @Test
  @DisplayName(
      "Test putAll(Stream) with 'Stream'; then build return DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Stream)"
  })
  void testPutAllWithStream_thenBuildReturnDenseLocalDateDoubleTimeSeries() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    LocalDate date = LocalDate.of(1970, 1, 1);
    localDateDoublePointList.add(LocalDateDoublePoint.of(date, 10.0d));
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.putAll(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 = builderResult.build();
    assertTrue(localDateDoubleTimeSeries2 instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(1, localDateDoubleTimeSeries2.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries2).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries2.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
    assertSame(date, localDateDoubleTimeSeries2.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Stream)} with {@code Stream}.
   *
   * <ul>
   *   <li>Then build return {@link DenseLocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Stream)}
   */
  @Test
  @DisplayName(
      "Test putAll(Stream) with 'Stream'; then build return DenseLocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Stream)"
  })
  void testPutAllWithStream_thenBuildReturnDenseLocalDateDoubleTimeSeries2() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    LocalDate date = LocalDate.of(1970, 1, 1);
    localDateDoublePointList.add(LocalDateDoublePoint.of(date, 10.0d));
    localDateDoublePointList.add(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d));
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = builderResult.putAll(points).build();
    assertTrue(localDateDoubleTimeSeries instanceof DenseLocalDateDoubleTimeSeries);
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 = builderResult.build();
    assertTrue(localDateDoubleTimeSeries2 instanceof DenseLocalDateDoubleTimeSeries);
    assertEquals(1, localDateDoubleTimeSeries.size());
    assertEquals(1, localDateDoubleTimeSeries2.size());
    assertEquals(10.0d, localDateDoubleTimeSeries.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getEarliestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries.getLatestValue());
    assertEquals(10.0d, localDateDoubleTimeSeries2.getLatestValue());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).getStartDate());
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries2).getStartDate());
    assertSame(date, localDateDoubleTimeSeries.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries2.getEarliestDate());
    assertSame(date, localDateDoubleTimeSeries.getLatestDate());
    assertSame(date, localDateDoubleTimeSeries2.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeriesBuilder#putAll(Stream)} with {@code Stream}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()} stream.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeriesBuilder#putAll(Stream)}
   */
  @Test
  @DisplayName("Test putAll(Stream) with 'Stream'; when ArrayList() stream; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeriesBuilder.putAll(Stream)"
  })
  void testPutAllWithStream_whenArrayListStream_thenReturnBuilder() {
    // Arrange
    LocalDateDoubleTimeSeriesBuilder builderResult = LocalDateDoubleTimeSeries.builder();

    ArrayList<LocalDateDoublePoint> localDateDoublePointList = new ArrayList<>();
    Stream<LocalDateDoublePoint> points = localDateDoublePointList.stream();

    // Act
    LocalDateDoubleTimeSeriesBuilder actualPutAllResult = builderResult.putAll(points);

    // Assert
    assertSame(builderResult, actualPutAllResult);
  }
}
