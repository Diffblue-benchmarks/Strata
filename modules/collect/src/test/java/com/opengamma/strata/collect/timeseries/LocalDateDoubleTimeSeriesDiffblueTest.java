package com.opengamma.strata.collect.timeseries;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.function.ObjDoublePredicate;
import com.opengamma.strata.collect.tuple.Pair;
import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoublePredicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LocalDateDoubleTimeSeriesDiffblueTest {
  /**
   * Test {@link LocalDateDoubleTimeSeries#empty()}.
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries LocalDateDoubleTimeSeries.empty()"})
  void testEmpty() {
    // Arrange and Act
    LocalDateDoubleTimeSeries actualEmptyResult = LocalDateDoubleTimeSeries.empty();

    // Assert
    assertTrue(actualEmptyResult instanceof SparseLocalDateDoubleTimeSeries);
    assertEquals(0, actualEmptyResult.size());
    assertTrue(actualEmptyResult.isEmpty());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#of(LocalDate, double)}.
   *
   * <ul>
   *   <li>Then return StartDate is {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#of(LocalDate, double)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, double); then return StartDate is LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries LocalDateDoubleTimeSeries.of(LocalDate, double)"})
  void testOf_thenReturnStartDateIsLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDateDoubleTimeSeries actualOfResult = LocalDateDoubleTimeSeries.of(date, 10.0d);

    // Assert
    assertTrue(actualOfResult instanceof DenseLocalDateDoubleTimeSeries);
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) actualOfResult).getStartDate());
    assertSame(date, actualOfResult.getEarliestDate());
    assertSame(date, actualOfResult.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#of(LocalDate, double)}.
   *
   * <ul>
   *   <li>When ofYearDay five and one.
   *   <li>Then return StartDate is ofYearDay five and one.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#of(LocalDate, double)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, double); when ofYearDay five and one; then return StartDate is ofYearDay five and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries LocalDateDoubleTimeSeries.of(LocalDate, double)"})
  void testOf_whenOfYearDayFiveAndOne_thenReturnStartDateIsOfYearDayFiveAndOne() {
    // Arrange
    LocalDate date = LocalDate.ofYearDay(5, 1);

    // Act
    LocalDateDoubleTimeSeries actualOfResult = LocalDateDoubleTimeSeries.of(date, 10.0d);

    // Assert
    assertTrue(actualOfResult instanceof DenseLocalDateDoubleTimeSeries);
    assertSame(date, ((DenseLocalDateDoubleTimeSeries) actualOfResult).getStartDate());
    assertSame(date, actualOfResult.getEarliestDate());
    assertSame(date, actualOfResult.getLatestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#builder()}.
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#builder()}
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeriesBuilder LocalDateDoubleTimeSeries.builder()"})
  void testBuilder() {
    // Arrange, Act and Assert
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries =
        LocalDateDoubleTimeSeries.builder().build();
    assertTrue(localDateDoubleTimeSeries instanceof SparseLocalDateDoubleTimeSeries);
    assertEquals(0, localDateDoubleTimeSeries.size());
    assertTrue(localDateDoubleTimeSeries.isEmpty());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#getEarliestDate()}.
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#getEarliestDate()}
   */
  @Test
  @DisplayName("Test getEarliestDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate LocalDateDoubleTimeSeries.getEarliestDate()"})
  void testGetEarliestDate() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SparseLocalDateDoubleTimeSeries.EMPTY.getEarliestDate());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#getEarliestValue()}.
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#getEarliestValue()}
   */
  @Test
  @DisplayName("Test getEarliestValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LocalDateDoubleTimeSeries.getEarliestValue()"})
  void testGetEarliestValue() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SparseLocalDateDoubleTimeSeries.EMPTY.getEarliestValue());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#intersection(LocalDateDoubleTimeSeries,
   * DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>When {@link SparseLocalDateDoubleTimeSeries#EMPTY}.
   *   <li>Then return {@link SparseLocalDateDoubleTimeSeries#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#intersection(LocalDateDoubleTimeSeries,
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test intersection(LocalDateDoubleTimeSeries, DoubleBinaryOperator); when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries LocalDateDoubleTimeSeries.intersection(LocalDateDoubleTimeSeries, DoubleBinaryOperator)"
  })
  void testIntersection_whenEmpty_thenReturnEmpty() {
    // Arrange and Act
    LocalDateDoubleTimeSeries actualIntersectionResult =
        SparseLocalDateDoubleTimeSeries.EMPTY.intersection(
            SparseLocalDateDoubleTimeSeries.EMPTY, mock(DoubleBinaryOperator.class));

    // Assert
    assertSame(
        ((SparseLocalDateDoubleTimeSeries) actualIntersectionResult).EMPTY,
        actualIntersectionResult);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#union(LocalDateDoubleTimeSeries, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>When {@link SparseLocalDateDoubleTimeSeries#EMPTY}.
   *   <li>Then return {@link SparseLocalDateDoubleTimeSeries#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#union(LocalDateDoubleTimeSeries,
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test union(LocalDateDoubleTimeSeries, DoubleBinaryOperator); when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries LocalDateDoubleTimeSeries.union(LocalDateDoubleTimeSeries, DoubleBinaryOperator)"
  })
  void testUnion_whenEmpty_thenReturnEmpty() {
    // Arrange and Act
    LocalDateDoubleTimeSeries actualUnionResult =
        SparseLocalDateDoubleTimeSeries.EMPTY.union(
            SparseLocalDateDoubleTimeSeries.EMPTY, mock(DoubleBinaryOperator.class));

    // Assert
    assertSame(((SparseLocalDateDoubleTimeSeries) actualUnionResult).EMPTY, actualUnionResult);
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#partition(ObjDoublePredicate)}.
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#partition(ObjDoublePredicate)}
   */
  @Test
  @DisplayName("Test partition(ObjDoublePredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair LocalDateDoubleTimeSeries.partition(ObjDoublePredicate)"})
  void testPartition() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = SparseLocalDateDoubleTimeSeries.EMPTY;

    // Act
    Pair<LocalDateDoubleTimeSeries, LocalDateDoubleTimeSeries> actualPartitionResult =
        localDateDoubleTimeSeries.partition(mock(ObjDoublePredicate.class));

    // Assert
    assertEquals(2, actualPartitionResult.size());
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 =
        ((SparseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).EMPTY;
    assertSame(localDateDoubleTimeSeries2, actualPartitionResult.getFirst());
    assertSame(localDateDoubleTimeSeries2, actualPartitionResult.getSecond());
  }

  /**
   * Test {@link LocalDateDoubleTimeSeries#partitionByValue(DoublePredicate)}.
   *
   * <p>Method under test: {@link LocalDateDoubleTimeSeries#partitionByValue(DoublePredicate)}
   */
  @Test
  @DisplayName("Test partitionByValue(DoublePredicate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair LocalDateDoubleTimeSeries.partitionByValue(DoublePredicate)"})
  void testPartitionByValue() {
    // Arrange
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = SparseLocalDateDoubleTimeSeries.EMPTY;

    // Act
    Pair<LocalDateDoubleTimeSeries, LocalDateDoubleTimeSeries> actualPartitionByValueResult =
        localDateDoubleTimeSeries.partitionByValue(mock(DoublePredicate.class));

    // Assert
    assertEquals(2, actualPartitionByValueResult.size());
    LocalDateDoubleTimeSeries localDateDoubleTimeSeries2 =
        ((SparseLocalDateDoubleTimeSeries) localDateDoubleTimeSeries).EMPTY;
    assertSame(localDateDoubleTimeSeries2, actualPartitionByValueResult.getFirst());
    assertSame(localDateDoubleTimeSeries2, actualPartitionByValueResult.getSecond());
  }
}
