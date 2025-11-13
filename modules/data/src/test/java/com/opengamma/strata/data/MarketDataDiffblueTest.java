package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataDiffblueTest {
  /**
   * Test {@link MarketData#of(LocalDate, Map, Map)} with {@code valuationDate}, {@code values},
   * {@code timeSeries}.
   *
   * <ul>
   *   <li>Then return Ids size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#of(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map, Map) with 'valuationDate', 'values', 'timeSeries'; then return Ids size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.of(LocalDate, Map, Map)"})
  void testOfWithValuationDateValuesTimeSeries_thenReturnIdsSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    // Act
    MarketData actualOfResult = MarketData.of(valuationDate, values, timeSeries);

    // Assert
    verify(marketDataId).getMarketDataType();
    assertTrue(actualOfResult instanceof ImmutableMarketData);
    assertEquals(1, actualOfResult.getIds().size());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, ((ImmutableMarketData) actualOfResult).getTimeSeries());
    assertEquals(values, ((ImmutableMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link MarketData#of(LocalDate, Map, Map)} with {@code valuationDate}, {@code values},
   * {@code timeSeries}.
   *
   * <ul>
   *   <li>Then return Ids size is two.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#of(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map, Map) with 'valuationDate', 'values', 'timeSeries'; then return Ids size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.of(LocalDate, Map, Map)"})
  void testOfWithValuationDateValuesTimeSeries_thenReturnIdsSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();

    // Act
    MarketData actualOfResult = MarketData.of(valuationDate, values, timeSeries);

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertTrue(actualOfResult instanceof ImmutableMarketData);
    assertEquals(2, actualOfResult.getIds().size());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(timeSeries, ((ImmutableMarketData) actualOfResult).getTimeSeries());
    assertEquals(values, ((ImmutableMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link MarketData#of(LocalDate, Map, Map)} with {@code valuationDate}, {@code values},
   * {@code timeSeries}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#of(LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map, Map) with 'valuationDate', 'values', 'timeSeries'; when HashMap(); then return TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.of(LocalDate, Map, Map)"})
  void testOfWithValuationDateValuesTimeSeries_whenHashMap_thenReturnTimeSeriesEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    // Act
    MarketData actualOfResult = MarketData.of(valuationDate, values, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof ImmutableMarketData);
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        ((ImmutableMarketData) actualOfResult).getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    Set<MarketDataId<?>> ids = actualOfResult.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualOfResult.getTimeSeriesIds());
    assertSame(timeSeries, ((ImmutableMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link MarketData#of(LocalDate, Map)} with {@code valuationDate}, {@code values}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Ids size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map) with 'valuationDate', 'values'; given 'java.lang.Object'; then return Ids size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.of(LocalDate, Map)"})
  void testOfWithValuationDateValues_givenJavaLangObject_thenReturnIdsSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    MarketData actualOfResult = MarketData.of(valuationDate, values);

    // Assert
    verify(marketDataId).getMarketDataType();
    assertTrue(actualOfResult instanceof ImmutableMarketData);
    assertEquals(1, actualOfResult.getIds().size());
    assertTrue(((ImmutableMarketData) actualOfResult).getTimeSeries().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(values, ((ImmutableMarketData) actualOfResult).getValues());
    assertSame(valuationDate, actualOfResult.getValuationDate());
  }

  /**
   * Test {@link MarketData#of(LocalDate, Map)} with {@code valuationDate}, {@code values}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return Ids size is two.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map) with 'valuationDate', 'values'; given 'java.lang.Object'; then return Ids size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.of(LocalDate, Map)"})
  void testOfWithValuationDateValues_givenJavaLangObject_thenReturnIdsSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");

    // Act
    MarketData actualOfResult = MarketData.of(valuationDate, values);

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    assertTrue(actualOfResult instanceof ImmutableMarketData);
    assertEquals(2, actualOfResult.getIds().size());
    assertTrue(((ImmutableMarketData) actualOfResult).getTimeSeries().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertEquals(values, ((ImmutableMarketData) actualOfResult).getValues());
    assertSame(valuationDate, actualOfResult.getValuationDate());
  }

  /**
   * Test {@link MarketData#of(LocalDate, Map)} with {@code valuationDate}, {@code values}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return TimeSeries is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#of(LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, Map) with 'valuationDate', 'values'; when HashMap(); then return TimeSeries is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.of(LocalDate, Map)"})
  void testOfWithValuationDateValues_whenHashMap_thenReturnTimeSeriesIsHashMap() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    // Act
    MarketData actualOfResult = MarketData.of(valuationDate, values);

    // Assert
    assertTrue(actualOfResult instanceof ImmutableMarketData);
    Set<MarketDataId<?>> ids = actualOfResult.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        ((ImmutableMarketData) actualOfResult).getTimeSeries();
    assertEquals(values, timeSeries);
    assertSame(timeSeries, ((ImmutableMarketData) actualOfResult).getValues());
    assertSame(ids, actualOfResult.getTimeSeriesIds());
  }

  /**
   * Test {@link MarketData#empty(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@link ImmutableMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#empty(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test empty(LocalDate); when LocalDate with '1970' and one and one; then return ImmutableMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.empty(LocalDate)"})
  void testEmpty_whenLocalDateWith1970AndOneAndOne_thenReturnImmutableMarketData() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    MarketData actualEmptyResult = MarketData.empty(valuationDate);

    // Assert
    assertTrue(actualEmptyResult instanceof ImmutableMarketData);
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        ((ImmutableMarketData) actualEmptyResult).getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    Set<MarketDataId<?>> ids = actualEmptyResult.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualEmptyResult.getTimeSeriesIds());
    assertSame(valuationDate, actualEmptyResult.getValuationDate());
    assertSame(timeSeries, ((ImmutableMarketData) actualEmptyResult).getValues());
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue3() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue4() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue5() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id, "Value", underlying);

    CombinedMarketData combinedMarketData = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue6() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue7() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    assertFalse(combinedMarketData.containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link MarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then calls {@link MarketDataId#getMarketDataType()}.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(MarketDataId); given 'java.lang.Object'; then calls getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenJavaLangObject_thenCallsGetMarketDataType() {
    // Arrange
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    boolean actualContainsValueResult = combinedMarketData.containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketDataId).getMarketDataType();
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link MarketData#combinedWith(MarketData)}.
   *
   * <p>Method under test: {@link MarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.combinedWith(MarketData)"})
  void testCombinedWith() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate4, new HashMap<>());
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = combinedMarketData.combinedWith(other);

    // Assert
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying2()
            instanceof CombinedMarketData);
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertSame(
        combinedMarketData, ((CombinedMarketData) actualCombinedWithResult).getUnderlying1());
  }

  /**
   * Test {@link MarketData#combinedWith(MarketData)}.
   *
   * <p>Method under test: {@link MarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.combinedWith(MarketData)"})
  void testCombinedWith2() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate4, new HashMap<>());
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = combinedMarketData.combinedWith(other);

    // Assert
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying2()
            instanceof CombinedMarketData);
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertSame(
        combinedMarketData, ((CombinedMarketData) actualCombinedWithResult).getUnderlying1());
  }

  /**
   * Test {@link MarketData#combinedWith(MarketData)}.
   *
   * <p>Method under test: {@link MarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.combinedWith(MarketData)"})
  void testCombinedWith3() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    ExtendedMarketData<Object> other = ExtendedMarketData.of(id, "Value", underlying);

    // Act
    MarketData actualCombinedWithResult = combinedMarketData.combinedWith(other);

    // Assert
    MarketData underlying13 = ((CombinedMarketData) actualCombinedWithResult).getUnderlying1();
    assertTrue(underlying13 instanceof CombinedMarketData);
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertTrue(((CombinedMarketData) underlying13).getUnderlying2() instanceof ImmutableMarketData);
    assertSame(other, ((CombinedMarketData) actualCombinedWithResult).getUnderlying2());
  }

  /**
   * Test {@link MarketData#combinedWith(MarketData)}.
   *
   * <p>Method under test: {@link MarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.combinedWith(MarketData)"})
  void testCombinedWith4() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData other = ImmutableMarketData.of(valuationDate3, new HashMap<>());

    // Act
    MarketData actualCombinedWithResult = combinedMarketData.combinedWith(other);

    // Assert
    MarketData underlying12 = ((CombinedMarketData) actualCombinedWithResult).getUnderlying1();
    assertTrue(underlying12 instanceof CombinedMarketData);
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertTrue(((CombinedMarketData) underlying12).getUnderlying2() instanceof ImmutableMarketData);
    assertSame(other, ((CombinedMarketData) actualCombinedWithResult).getUnderlying2());
  }

  /**
   * Test {@link MarketData#combinedWith(MarketData)}.
   *
   * <p>Method under test: {@link MarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.combinedWith(MarketData)"})
  void testCombinedWith5() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ExtendedMarketData<Object> underlying1 =
        ExtendedMarketData.of(id, "Value", ImmutableMarketData.of(valuationDate, new HashMap<>()));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = combinedMarketData.combinedWith(other);

    // Assert
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying2()
            instanceof CombinedMarketData);
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertSame(
        combinedMarketData, ((CombinedMarketData) actualCombinedWithResult).getUnderlying1());
  }

  /**
   * Test {@link MarketData#combinedWith(MarketData)}.
   *
   * <ul>
   *   <li>Then return Ids size is two.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData); then return Ids size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.combinedWith(MarketData)"})
  void testCombinedWith_thenReturnIdsSizeIsTwo() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    ExtendedMarketData<Object> underlying2 = ExtendedMarketData.of(id2, "Value", underlying);

    ExtendedMarketData<Object> underlying12 = ExtendedMarketData.of(id, "Value", underlying2);
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying13 = ImmutableMarketData.of(valuationDate4, new HashMap<>());
    LocalDate valuationDate5 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying13, ImmutableMarketData.of(valuationDate5, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = combinedMarketData.combinedWith(other);

    // Assert
    assertTrue(
        ((CombinedMarketData) actualCombinedWithResult).getUnderlying2()
            instanceof CombinedMarketData);
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertEquals(2, actualCombinedWithResult.getIds().size());
    assertSame(
        combinedMarketData, ((CombinedMarketData) actualCombinedWithResult).getUnderlying1());
  }

  /**
   * Test {@link MarketData#combinedWith(MarketData)}.
   *
   * <ul>
   *   <li>Then return Underlying2 is Underlying1.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#combinedWith(MarketData)}
   */
  @Test
  @DisplayName("Test combinedWith(MarketData); then return Underlying2 is Underlying1")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.combinedWith(MarketData)"})
  void testCombinedWith_thenReturnUnderlying2IsUnderlying1() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate3, new HashMap<>());
    LocalDate valuationDate4 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate4, new HashMap<>()));

    // Act
    MarketData actualCombinedWithResult = combinedMarketData.combinedWith(other);

    // Assert
    MarketData underlying13 = ((CombinedMarketData) actualCombinedWithResult).getUnderlying1();
    assertTrue(underlying13 instanceof CombinedMarketData);
    MarketData underlying2 = ((CombinedMarketData) actualCombinedWithResult).getUnderlying2();
    assertTrue(underlying2 instanceof CombinedMarketData);
    assertTrue(actualCombinedWithResult instanceof CombinedMarketData);
    assertTrue(((CombinedMarketData) underlying13).getUnderlying2() instanceof ImmutableMarketData);
    assertEquals(underlying13, underlying2);
  }

  /**
   * Test {@link MarketData#withValue(MarketDataId, Object)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then return {@link ExtendedMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link MarketData#withValue(MarketDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test withValue(MarketDataId, Object); when MarketDataId; then return ExtendedMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData MarketData.withValue(MarketDataId, Object)"})
  void testWithValue_whenMarketDataId_thenReturnExtendedMarketData() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData combinedMarketData =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act
    MarketData actualWithValueResult = combinedMarketData.withValue(id, "Value");

    // Assert
    assertTrue(actualWithValueResult instanceof ExtendedMarketData);
    LocalDate valuationDate3 = actualWithValueResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate3.toString());
    assertEquals("Value", ((ExtendedMarketData<Object>) actualWithValueResult).getValue());
    assertEquals(1, actualWithValueResult.getIds().size());
    assertTrue(actualWithValueResult.getTimeSeriesIds().isEmpty());
    assertSame(
        combinedMarketData, ((ExtendedMarketData<Object>) actualWithValueResult).getUnderlying());
    assertSame(valuationDate, valuationDate3);
    assertSame(id, ((ExtendedMarketData<Object>) actualWithValueResult).getId());
  }
}
