package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.TestingObservableId;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.IntFunction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScenarioMarketDataDiffblueTest {
  /**
   * Test {@link ScenarioMarketData#of(int, LocalDate, Map, Map)} with {@code int}, {@code
   * LocalDate}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#of(int, LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, LocalDate, Map, Map) with 'int', 'LocalDate', 'Map', 'Map'; then return TimeSeriesIds size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketData ScenarioMarketData.of(int, LocalDate, Map, Map)"})
  void testOfWithIntLocalDateMapMap_thenReturnTimeSeriesIdsSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ScenarioMarketData actualOfResult = ScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult instanceof ImmutableScenarioMarketData);
    assertTrue(actualOfResult.getValuationDate() instanceof SingleMarketDataBox);
    assertEquals(1, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, ((ImmutableScenarioMarketData) actualOfResult).getTimeSeries());
    assertEquals(values, ((ImmutableScenarioMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link ScenarioMarketData#of(int, LocalDate, Map, Map)} with {@code int}, {@code
   * LocalDate}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is two.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#of(int, LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, LocalDate, Map, Map) with 'int', 'LocalDate', 'Map', 'Map'; then return TimeSeriesIds size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketData ScenarioMarketData.of(int, LocalDate, Map, Map)"})
  void testOfWithIntLocalDateMapMap_thenReturnTimeSeriesIdsSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ScenarioMarketData actualOfResult = ScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult instanceof ImmutableScenarioMarketData);
    assertTrue(actualOfResult.getValuationDate() instanceof SingleMarketDataBox);
    assertEquals(2, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, ((ImmutableScenarioMarketData) actualOfResult).getTimeSeries());
    assertEquals(values, ((ImmutableScenarioMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link ScenarioMarketData#of(int, LocalDate, Map, Map)} with {@code int}, {@code
   * LocalDate}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#of(int, LocalDate, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, LocalDate, Map, Map) with 'int', 'LocalDate', 'Map', 'Map'; when three; then return TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketData ScenarioMarketData.of(int, LocalDate, Map, Map)"})
  void testOfWithIntLocalDateMapMap_whenThree_thenReturnTimeSeriesEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    // Act
    ScenarioMarketData actualOfResult =
        ScenarioMarketData.of(3, valuationDate, values, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof ImmutableScenarioMarketData);
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        ((ImmutableScenarioMarketData) actualOfResult).getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    assertSame(timeSeries, ((ImmutableScenarioMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link ScenarioMarketData#of(int, MarketDataBox, Map, Map)} with {@code int}, {@code
   * MarketDataBox}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#of(int, MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketDataBox, Map, Map) with 'int', 'MarketDataBox', 'Map', 'Map'; then return TimeSeriesIds size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketData ScenarioMarketData.of(int, MarketDataBox, Map, Map)"})
  void testOfWithIntMarketDataBoxMapMap_thenReturnTimeSeriesIdsSizeIsOne() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ScenarioMarketData actualOfResult = ScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult instanceof ImmutableScenarioMarketData);
    assertTrue(actualOfResult.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(1, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, ((ImmutableScenarioMarketData) actualOfResult).getTimeSeries());
    assertEquals(values, ((ImmutableScenarioMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link ScenarioMarketData#of(int, MarketDataBox, Map, Map)} with {@code int}, {@code
   * MarketDataBox}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIds size is two.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#of(int, MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketDataBox, Map, Map) with 'int', 'MarketDataBox', 'Map', 'Map'; then return TimeSeriesIds size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketData ScenarioMarketData.of(int, MarketDataBox, Map, Map)"})
  void testOfWithIntMarketDataBoxMapMap_thenReturnTimeSeriesIdsSizeIsTwo() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    HashMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(new TestingObservableId("Id"), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ScenarioMarketData actualOfResult = ScenarioMarketData.of(3, valuationDate, values, timeSeries);

    // Assert
    assertTrue(actualOfResult instanceof ImmutableScenarioMarketData);
    assertTrue(actualOfResult.getValuationDate() instanceof ScenarioMarketDataBox);
    assertEquals(2, actualOfResult.getTimeSeriesIds().size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(timeSeries, ((ImmutableScenarioMarketData) actualOfResult).getTimeSeries());
    assertEquals(values, ((ImmutableScenarioMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link ScenarioMarketData#of(int, MarketDataBox, Map, Map)} with {@code int}, {@code
   * MarketDataBox}, {@code Map}, {@code Map}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#of(int, MarketDataBox, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketDataBox, Map, Map) with 'int', 'MarketDataBox', 'Map', 'Map'; when three; then return TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketData ScenarioMarketData.of(int, MarketDataBox, Map, Map)"})
  void testOfWithIntMarketDataBoxMapMap_whenThree_thenReturnTimeSeriesEmpty() {
    // Arrange
    DefaultScenarioArray<LocalDate> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<LocalDate> valuationDate = ScenarioMarketDataBox.of(value);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    // Act
    ScenarioMarketData actualOfResult =
        ScenarioMarketData.of(3, valuationDate, values, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof ImmutableScenarioMarketData);
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        ((ImmutableScenarioMarketData) actualOfResult).getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    assertSame(timeSeries, ((ImmutableScenarioMarketData) actualOfResult).getValues());
  }

  /**
   * Test {@link ScenarioMarketData#of(int, MarketData)} with {@code int}, {@code MarketData}.
   *
   * <ul>
   *   <li>Then return {@link RepeatedScenarioMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#of(int, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(int, MarketData) with 'int', 'MarketData'; then return RepeatedScenarioMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketData ScenarioMarketData.of(int, MarketData)"})
  void testOfWithIntMarketData_thenReturnRepeatedScenarioMarketData() {
    // Arrange
    SingleScenarioMarketData marketData =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, mock(MarketData.class)), 1);

    // Act
    ScenarioMarketData actualOfResult = ScenarioMarketData.of(3, marketData);

    // Assert
    assertTrue(actualOfResult instanceof RepeatedScenarioMarketData);
    assertEquals(3, actualOfResult.getScenarioCount());
    assertTrue(actualOfResult.getIds().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertSame(marketData, ((RepeatedScenarioMarketData) actualOfResult).getUnderlying());
  }

  /**
   * Test {@link ScenarioMarketData#getScenarioValue(ScenarioMarketDataId)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultScenarioArray} with values is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#getScenarioValue(ScenarioMarketDataId)}
   */
  @Test
  @DisplayName(
      "Test getScenarioValue(ScenarioMarketDataId); then return DefaultScenarioArray with values is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioMarketData.getScenarioValue(ScenarioMarketDataId)"})
  void testGetScenarioValue_thenReturnDefaultScenarioArrayWithValuesIsArrayList() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    when(underlying.getValue(Mockito.<MarketDataId<Object>>any())).thenReturn("Value");
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);
    RepeatedScenarioMarketData ofResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1));

    ScenarioMarketDataId<Object, ScenarioArray<Object>> id = mock(ScenarioMarketDataId.class);
    when(id.getMarketDataId()).thenReturn(mock(MarketDataId.class));
    DefaultScenarioArray<Object> ofResult2 = DefaultScenarioArray.of(new ArrayList<>());
    when(id.createScenarioValue(Mockito.<MarketDataBox<Object>>any(), anyInt()))
        .thenReturn(ofResult2);

    // Act
    ScenarioArray<Object> actualScenarioValue = ofResult.getScenarioValue(id);

    // Assert
    verify(underlying).getValue(isA(MarketDataId.class));
    verify(id).createScenarioValue(isA(MarketDataBox.class), eq(3));
    verify(id).getMarketDataId();
    assertSame(ofResult2, actualScenarioValue);
  }

  /**
   * Test {@link ScenarioMarketData#getScenarioValue(ScenarioMarketDataId)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#getScenarioValue(ScenarioMarketDataId)}
   */
  @Test
  @DisplayName("Test getScenarioValue(ScenarioMarketDataId); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioMarketData.getScenarioValue(ScenarioMarketDataId)"})
  void testGetScenarioValue_thenThrowIllegalArgumentException() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));
    RepeatedScenarioMarketData ofResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1));

    ScenarioMarketDataId<Object, ScenarioArray<Object>> id = mock(ScenarioMarketDataId.class);
    when(id.getMarketDataId()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getScenarioValue(id));
    verify(id).getMarketDataId();
  }

  /**
   * Test {@link ScenarioMarketData#withValue(MarketDataId, MarketDataBox)}.
   *
   * <p>Method under test: {@link ScenarioMarketData#withValue(MarketDataId, MarketDataBox)}
   */
  @Test
  @DisplayName("Test withValue(MarketDataId, MarketDataBox)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioMarketData ScenarioMarketData.withValue(MarketDataId, MarketDataBox)"
  })
  void testWithValue() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));
    RepeatedScenarioMarketData ofResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);

    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(3, valueFunction);
    ScenarioMarketDataBox<Object> value2 = ScenarioMarketDataBox.of(value);

    // Act
    ScenarioMarketData actualWithValueResult = ofResult.withValue(id, value2);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualWithValueResult instanceof ExtendedScenarioMarketData);
    assertSame(value2, ((ExtendedScenarioMarketData<Object>) actualWithValueResult).getValue());
  }

  /**
   * Test {@link ScenarioMarketData#withValue(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>Given three.
   *   <li>Then return Ids size is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#withValue(MarketDataId, MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test withValue(MarketDataId, MarketDataBox); given three; then return Ids size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioMarketData ScenarioMarketData.withValue(MarketDataId, MarketDataBox)"
  })
  void testWithValue_givenThree_thenReturnIdsSizeIsOne() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));
    RepeatedScenarioMarketData ofResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);

    MarketDataBox<Object> value = mock(MarketDataBox.class);
    when(value.getScenarioCount()).thenReturn(3);
    when(value.isScenarioValue()).thenReturn(true);

    // Act
    ScenarioMarketData actualWithValueResult = ofResult.withValue(id, value);

    // Assert
    verify(value).getScenarioCount();
    verify(value).isScenarioValue();
    assertTrue(actualWithValueResult instanceof ExtendedScenarioMarketData);
    assertEquals(1, actualWithValueResult.getIds().size());
    assertEquals(3, actualWithValueResult.getScenarioCount());
    assertTrue(actualWithValueResult.getTimeSeriesIds().isEmpty());
    assertSame(
        ofResult, ((ExtendedScenarioMarketData<Object>) actualWithValueResult).getUnderlying());
    assertSame(id, ((ExtendedScenarioMarketData<Object>) actualWithValueResult).getId());
    assertSame(value, ((ExtendedScenarioMarketData<Object>) actualWithValueResult).getValue());
  }

  /**
   * Test {@link ScenarioMarketData#withValue(MarketDataId, MarketDataBox)}.
   *
   * <ul>
   *   <li>Then return Value is {@link SingleMarketDataBox} with {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#withValue(MarketDataId, MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test withValue(MarketDataId, MarketDataBox); then return Value is SingleMarketDataBox with 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioMarketData ScenarioMarketData.withValue(MarketDataId, MarketDataBox)"
  })
  void testWithValue_thenReturnValueIsSingleMarketDataBoxWithValue() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));
    RepeatedScenarioMarketData ofResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);
    SingleMarketDataBox<Object> value = SingleMarketDataBox.of("Value");

    // Act
    ScenarioMarketData actualWithValueResult = ofResult.withValue(id, value);

    // Assert
    assertTrue(actualWithValueResult instanceof ExtendedScenarioMarketData);
    assertSame(value, ((ExtendedScenarioMarketData<Object>) actualWithValueResult).getValue());
  }

  /**
   * Test {@link ScenarioMarketData#withPerturbation(MarketDataId, ScenarioPerturbation,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketData#withPerturbation(MarketDataId,
   * ScenarioPerturbation, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(MarketDataId, ScenarioPerturbation, ReferenceData); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioMarketData ScenarioMarketData.withPerturbation(MarketDataId, ScenarioPerturbation, ReferenceData)"
  })
  void testWithPerturbation_thenThrowIllegalArgumentException() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(3);
    RepeatedScenarioMarketData ofResult =
        RepeatedScenarioMarketData.of(1, SingleScenarioMarketData.of(marketData, 1));
    MarketDataId<Object> id = mock(MarketDataId.class);

    ScenarioPerturbation<Object> perturbation = mock(ScenarioPerturbation.class);
    when(perturbation.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.withPerturbation(id, perturbation, mock(ReferenceData.class)));
    verify(marketData).getScenarioCount();
    verify(perturbation, atLeast(1)).getScenarioCount();
  }
}
