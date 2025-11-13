package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
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
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableMarketDataBuilderDiffblueTest {
  /**
   * Test {@link ImmutableMarketDataBuilder#ImmutableMarketDataBuilder(LocalDate)}.
   *
   * <ul>
   *   <li>Then return build TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#ImmutableMarketDataBuilder(LocalDate)}
   */
  @Test
  @DisplayName("Test new ImmutableMarketDataBuilder(LocalDate); then return build TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketDataBuilder.<init>(LocalDate)"})
  void testNewImmutableMarketDataBuilder_thenReturnBuildTimeSeriesEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    ImmutableMarketData immutableMarketData = new ImmutableMarketDataBuilder(valuationDate).build();
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        immutableMarketData.getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
    assertSame(valuationDate, immutableMarketData.getValuationDate());
    assertSame(timeSeries, immutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#ImmutableMarketDataBuilder(LocalDate, Map, Map)}.
   *
   * <ul>
   *   <li>Then return build TimeSeries Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#ImmutableMarketDataBuilder(LocalDate,
   * Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableMarketDataBuilder(LocalDate, Map, Map); then return build TimeSeries Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableMarketDataBuilder.<init>(LocalDate, Map, Map)"})
  void testNewImmutableMarketDataBuilder_thenReturnBuildTimeSeriesEmpty2() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    // Act
    ImmutableMarketDataBuilder actualImmutableMarketDataBuilder =
        new ImmutableMarketDataBuilder(valuationDate, values, new HashMap<>());

    // Assert
    ImmutableMarketData immutableMarketData = actualImmutableMarketDataBuilder.build();
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        immutableMarketData.getTimeSeries();
    assertTrue(timeSeries.isEmpty());
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
    assertSame(valuationDate, immutableMarketData.getValuationDate());
    assertSame(timeSeries, immutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#valuationDate(LocalDate)}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#valuationDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test valuationDate(LocalDate); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMarketDataBuilder ImmutableMarketDataBuilder.valuationDate(LocalDate)"
  })
  void testValuationDate_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMarketDataBuilder actualValuationDateResult =
        builderResult.valuationDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualValuationDateResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#values(Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return build Ids size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#values(Map)}
   */
  @Test
  @DisplayName("Test values(Map); given 'java.lang.Object'; then return build Ids size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.values(Map)"})
  void testValues_givenJavaLangObject_thenReturnBuildIdsSizeIsOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    ImmutableMarketDataBuilder actualValuesResult = builderResult.values(values);

    // Assert
    verify(marketDataId).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualValuesResult.build();
    assertEquals(1, immutableMarketData.getIds().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(1, immutableMarketData2.getIds().size());
    assertTrue(immutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(values, immutableMarketData.getValues());
    assertEquals(values, immutableMarketData2.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#values(Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return build Ids size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#values(Map)}
   */
  @Test
  @DisplayName("Test values(Map); given 'java.lang.Object'; then return build Ids size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.values(Map)"})
  void testValues_givenJavaLangObject_thenReturnBuildIdsSizeIsTwo() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

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
    ImmutableMarketDataBuilder actualValuesResult = builderResult.values(values);

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualValuesResult.build();
    assertEquals(2, immutableMarketData.getIds().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(2, immutableMarketData2.getIds().size());
    assertTrue(immutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(values, immutableMarketData.getValues());
    assertEquals(values, immutableMarketData2.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#values(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return build Ids Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#values(Map)}
   */
  @Test
  @DisplayName("Test values(Map); when HashMap(); then return build Ids Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.values(Map)"})
  void testValues_whenHashMap_thenReturnBuildIdsEmpty() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    // Act and Assert
    ImmutableMarketData immutableMarketData = builderResult.values(values).build();
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        immutableMarketData.getTimeSeries();
    assertEquals(values, timeSeries);
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
    assertSame(timeSeries, immutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#timeSeries(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#timeSeries(Map)}
   */
  @Test
  @DisplayName(
      "Test timeSeries(Map); when HashMap(); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.timeSeries(Map)"})
  void testTimeSeries_whenHashMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMarketDataBuilder actualTimeSeriesResult = builderResult.timeSeries(new HashMap<>());

    // Assert
    assertSame(builderResult, actualTimeSeriesResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#addValue(MarketDataId, Object)}.
   *
   * <ul>
   *   <li>Then builder {@link LocalDate} with {@code 1970} and one and one build Values size is
   *       one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#addValue(MarketDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test addValue(MarketDataId, Object); then builder LocalDate with '1970' and one and one build Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMarketDataBuilder ImmutableMarketDataBuilder.addValue(MarketDataId, Object)"
  })
  void testAddValue_thenBuilderLocalDateWith1970AndOneAndOneBuildValuesSizeIsOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMarketDataBuilder actualAddValueResult =
        builderResult.addValue(mock(MarketDataId.class), "Value");

    // Assert
    ImmutableMarketData immutableMarketData = builderResult.build();
    assertEquals(1, immutableMarketData.getValues().size());
    assertEquals(1, immutableMarketData.getIds().size());
    assertSame(builderResult, actualAddValueResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#addValueUnsafe(MarketDataId, Object)}.
   *
   * <ul>
   *   <li>Then builder {@link LocalDate} with {@code 1970} and one and one build Values size is
   *       one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#addValueUnsafe(MarketDataId, Object)}
   */
  @Test
  @DisplayName(
      "Test addValueUnsafe(MarketDataId, Object); then builder LocalDate with '1970' and one and one build Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMarketDataBuilder ImmutableMarketDataBuilder.addValueUnsafe(MarketDataId, Object)"
  })
  void testAddValueUnsafe_thenBuilderLocalDateWith1970AndOneAndOneBuildValuesSizeIsOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> id = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(id.getMarketDataType()).thenReturn(forNameResult);

    // Act
    ImmutableMarketDataBuilder actualAddValueUnsafeResult =
        builderResult.addValueUnsafe(id, "Value");

    // Assert
    verify(id).getMarketDataType();
    ImmutableMarketData immutableMarketData = builderResult.build();
    assertEquals(1, immutableMarketData.getValues().size());
    assertEquals(1, immutableMarketData.getIds().size());
    assertSame(builderResult, actualAddValueUnsafeResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#addValueMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return build Ids size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#addValueMap(Map)}
   */
  @Test
  @DisplayName("Test addValueMap(Map); given 'java.lang.Object'; then return build Ids size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.addValueMap(Map)"})
  void testAddValueMap_givenJavaLangObject_thenReturnBuildIdsSizeIsOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    ImmutableMarketDataBuilder actualAddValueMapResult = builderResult.addValueMap(values);

    // Assert
    verify(marketDataId).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddValueMapResult.build();
    assertEquals(1, immutableMarketData.getIds().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(1, immutableMarketData2.getIds().size());
    assertTrue(immutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(values, immutableMarketData.getValues());
    assertEquals(values, immutableMarketData2.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#addValueMap(Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return build Ids size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#addValueMap(Map)}
   */
  @Test
  @DisplayName("Test addValueMap(Map); given 'java.lang.Object'; then return build Ids size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.addValueMap(Map)"})
  void testAddValueMap_givenJavaLangObject_thenReturnBuildIdsSizeIsTwo() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

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
    ImmutableMarketDataBuilder actualAddValueMapResult = builderResult.addValueMap(values);

    // Assert
    verify(marketDataId2).getMarketDataType();
    verify(marketDataId).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddValueMapResult.build();
    assertEquals(2, immutableMarketData.getIds().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(2, immutableMarketData2.getIds().size());
    assertTrue(immutableMarketData.getTimeSeriesIds().isEmpty());
    assertEquals(values, immutableMarketData.getValues());
    assertEquals(values, immutableMarketData2.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#addValueMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return build Ids Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#addValueMap(Map)}
   */
  @Test
  @DisplayName("Test addValueMap(Map); when HashMap(); then return build Ids Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.addValueMap(Map)"})
  void testAddValueMap_whenHashMap_thenReturnBuildIdsEmpty() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));
    HashMap<MarketDataId<?>, Object> values = new HashMap<>();

    // Act and Assert
    ImmutableMarketData immutableMarketData = builderResult.addValueMap(values).build();
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> timeSeries =
        immutableMarketData.getTimeSeries();
    assertEquals(values, timeSeries);
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
    assertSame(timeSeries, immutableMarketData.getValues());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#addTimeSeries(ObservableId, LocalDateDoubleTimeSeries)}.
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#addTimeSeries(ObservableId,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName("Test addTimeSeries(ObservableId, LocalDateDoubleTimeSeries)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMarketDataBuilder ImmutableMarketDataBuilder.addTimeSeries(ObservableId, LocalDateDoubleTimeSeries)"
  })
  void testAddTimeSeries() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMarketDataBuilder actualAddTimeSeriesResult =
        builderResult.addTimeSeries(
            new TestingObservableId("42"), mock(LocalDateDoubleTimeSeries.class));

    // Assert
    ImmutableMarketData immutableMarketData = builderResult.build();
    assertEquals(1, immutableMarketData.getTimeSeries().size());
    assertEquals(1, immutableMarketData.getTimeSeriesIds().size());
    assertSame(builderResult, actualAddTimeSeriesResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#addTimeSeriesMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#addTimeSeriesMap(Map)}
   */
  @Test
  @DisplayName(
      "Test addTimeSeriesMap(Map); when HashMap(); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.addTimeSeriesMap(Map)"})
  void testAddTimeSeriesMap_whenHashMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMarketDataBuilder actualAddTimeSeriesMapResult =
        builderResult.addTimeSeriesMap(new HashMap<>());

    // Assert
    assertSame(builderResult, actualAddTimeSeriesMapResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName("Test add(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying2 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData other = new CombinedMarketData(underlying1, underlying2);

    // Act and Assert
    ImmutableMarketData immutableMarketData = builderResult.add(other).build();
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMarketData actualImmutableMarketData = builderResult.build();
    assertEquals(underlying1, actualImmutableMarketData);
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName("Test add(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd2() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying2 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying12 = ImmutableMarketData.of(valuationDate2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying22 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData underlying13 = new CombinedMarketData(underlying1, underlying22);

    CombinedMarketData other = new CombinedMarketData(underlying13, underlying2);

    // Act
    ImmutableMarketDataBuilder actualAddResult = builderResult.add(other);

    // Assert
    verify(marketDataId, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(1, immutableMarketData.getValues().size());
    assertEquals(1, immutableMarketData.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return build Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName(
      "Test add(MarketData); given 'java.lang.Object'; then return build Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_givenJavaLangObject_thenReturnBuildValuesSizeIsOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    ImmutableMarketDataBuilder actualAddResult = builderResult.add(other);

    // Assert
    verify(marketDataId, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(1, immutableMarketData.getValues().size());
    assertEquals(1, immutableMarketData.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return build Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName(
      "Test add(MarketData); given 'java.lang.Object'; then return build Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_givenJavaLangObject_thenReturnBuildValuesSizeIsThree() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);

    MarketDataId<Object> marketDataId3 = mock(MarketDataId.class);
    Class<Object> forNameResult3 = Object.class;
    when(marketDataId3.getMarketDataType()).thenReturn(forNameResult3);

    HashMap<MarketDataId<?>, Object> values2 = new HashMap<>();
    values2.put(marketDataId3, "Value");
    CombinedMarketData other =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values2));

    // Act
    ImmutableMarketDataBuilder actualAddResult = builderResult.add(other);

    // Assert
    verify(marketDataId2, atLeast(1)).getMarketDataType();
    verify(marketDataId, atLeast(1)).getMarketDataType();
    verify(marketDataId3, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(3, immutableMarketData.getValues().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(3, immutableMarketData2.getValues().size());
    assertEquals(3, immutableMarketData.getIds().size());
    assertEquals(3, immutableMarketData2.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return build Values size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName(
      "Test add(MarketData); given 'java.lang.Object'; then return build Values size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_givenJavaLangObject_thenReturnBuildValuesSizeIsTwo() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId2, "Value");
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    // Act
    ImmutableMarketDataBuilder actualAddResult = builderResult.add(other);

    // Assert
    verify(marketDataId2, atLeast(1)).getMarketDataType();
    verify(marketDataId, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(2, immutableMarketData.getValues().size());
    assertEquals(2, immutableMarketData.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Then builder {@link LocalDate} with {@code 1970} and one and one build Values size is
   *       one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName(
      "Test add(MarketData); then builder LocalDate with '1970' and one and one build Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_thenBuilderLocalDateWith1970AndOneAndOneBuildValuesSizeIsOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");

    // Act
    ImmutableMarketDataBuilder actualAddResult =
        builderResult.add(ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values));

    // Assert
    verify(marketDataId, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(1, immutableMarketData.getValues().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(1, immutableMarketData2.getValues().size());
    assertEquals(1, immutableMarketData.getIds().size());
    assertEquals(1, immutableMarketData2.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Then builder {@link LocalDate} with {@code 1970} and one and one build Values size is
   *       two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName(
      "Test add(MarketData); then builder LocalDate with '1970' and one and one build Values size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_thenBuilderLocalDateWith1970AndOneAndOneBuildValuesSizeIsTwo() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying1 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(underlying1, ImmutableMarketData.of(valuationDate, new HashMap<>()));

    MarketDataId<Object> marketDataId2 = mock(MarketDataId.class);
    Class<Object> forNameResult2 = Object.class;
    when(marketDataId2.getMarketDataType()).thenReturn(forNameResult2);

    HashMap<MarketDataId<?>, Object> values2 = new HashMap<>();
    values2.put(marketDataId2, "Value");
    CombinedMarketData other =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values2));

    // Act
    ImmutableMarketDataBuilder actualAddResult = builderResult.add(other);

    // Assert
    verify(marketDataId, atLeast(1)).getMarketDataType();
    verify(marketDataId2, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(2, immutableMarketData.getValues().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(2, immutableMarketData2.getValues().size());
    assertEquals(2, immutableMarketData.getIds().size());
    assertEquals(2, immutableMarketData2.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Then builder {@link LocalDate} with {@code 1970} and one and one build Values size is
   *       two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName(
      "Test add(MarketData); then builder LocalDate with '1970' and one and one build Values size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_thenBuilderLocalDateWith1970AndOneAndOneBuildValuesSizeIsTwo2() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

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
    ImmutableMarketDataBuilder actualAddResult =
        builderResult.add(ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values));

    // Assert
    verify(marketDataId2, atLeast(1)).getMarketDataType();
    verify(marketDataId, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(2, immutableMarketData.getValues().size());
    ImmutableMarketData immutableMarketData2 = builderResult.build();
    assertEquals(2, immutableMarketData2.getValues().size());
    assertEquals(2, immutableMarketData.getIds().size());
    assertEquals(2, immutableMarketData2.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Then return build Ids Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName("Test add(MarketData); then return build Ids Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_thenReturnBuildIdsEmpty() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    // Act and Assert
    ImmutableMarketData immutableMarketData = builderResult.add(other).build();
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMarketData actualImmutableMarketData = builderResult.build();
    assertEquals(underlying1, actualImmutableMarketData);
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Then return build Ids Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName("Test add(MarketData); then return build Ids Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_thenReturnBuildIdsEmpty2() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData other =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    // Act and Assert
    ImmutableMarketData immutableMarketData = builderResult.add(other).build();
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMarketData actualImmutableMarketData = builderResult.build();
    assertEquals(underlying1, actualImmutableMarketData);
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Then return build Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName("Test add(MarketData); then return build Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_thenReturnBuildValuesSizeIsOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying2 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));

    CombinedMarketData other = new CombinedMarketData(underlying12, underlying2);

    // Act
    ImmutableMarketDataBuilder actualAddResult = builderResult.add(other);

    // Assert
    verify(marketDataId, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(1, immutableMarketData.getValues().size());
    assertEquals(1, immutableMarketData.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>Then return build Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName("Test add(MarketData); then return build Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_thenReturnBuildValuesSizeIsOne2() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    MarketDataId<Object> marketDataId = mock(MarketDataId.class);
    Class<Object> forNameResult = Object.class;
    when(marketDataId.getMarketDataType()).thenReturn(forNameResult);

    HashMap<MarketDataId<?>, Object> values = new HashMap<>();
    values.put(marketDataId, "Value");
    ImmutableMarketData underlying2 = ImmutableMarketData.of(LocalDate.of(1970, 1, 1), values);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData underlying1 = ImmutableMarketData.of(valuationDate, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying12 =
        new CombinedMarketData(
            underlying1, ImmutableMarketData.of(valuationDate2, new HashMap<>()));
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    CombinedMarketData underlying13 =
        new CombinedMarketData(
            underlying12, ImmutableMarketData.of(valuationDate3, new HashMap<>()));

    CombinedMarketData other = new CombinedMarketData(underlying13, underlying2);

    // Act
    ImmutableMarketDataBuilder actualAddResult = builderResult.add(other);

    // Assert
    verify(marketDataId, atLeast(1)).getMarketDataType();
    ImmutableMarketData immutableMarketData = actualAddResult.build();
    assertEquals(1, immutableMarketData.getValues().size());
    assertEquals(1, immutableMarketData.getIds().size());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#add(MarketData)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return build Ids Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#add(MarketData)}
   */
  @Test
  @DisplayName(
      "Test add(MarketData); when LocalDate with '1970' and one and one; then return build Ids Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketDataBuilder ImmutableMarketDataBuilder.add(MarketData)"})
  void testAdd_whenLocalDateWith1970AndOneAndOne_thenReturnBuildIdsEmpty() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableMarketData other = ImmutableMarketData.of(valuationDate, new HashMap<>());

    // Act and Assert
    ImmutableMarketData immutableMarketData = builderResult.add(other).build();
    Set<MarketDataId<?>> ids = immutableMarketData.getIds();
    assertTrue(ids.isEmpty());
    ImmutableMarketData actualImmutableMarketData = builderResult.build();
    assertEquals(other, actualImmutableMarketData);
    assertSame(ids, immutableMarketData.getTimeSeriesIds());
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#removeTimeSeriesIf(Predicate)}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#removeTimeSeriesIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeTimeSeriesIf(Predicate); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMarketDataBuilder ImmutableMarketDataBuilder.removeTimeSeriesIf(Predicate)"
  })
  void testRemoveTimeSeriesIf_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMarketDataBuilder actualRemoveTimeSeriesIfResult =
        builderResult.removeTimeSeriesIf(mock(Predicate.class));

    // Assert
    assertSame(builderResult, actualRemoveTimeSeriesIfResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#removeValueIf(Predicate)}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#removeValueIf(Predicate)}
   */
  @Test
  @DisplayName(
      "Test removeValueIf(Predicate); when Predicate; then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMarketDataBuilder ImmutableMarketDataBuilder.removeValueIf(Predicate)"
  })
  void testRemoveValueIf_whenPredicate_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableMarketDataBuilder builderResult =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMarketDataBuilder actualRemoveValueIfResult =
        builderResult.removeValueIf(mock(Predicate.class));

    // Assert
    assertSame(builderResult, actualRemoveValueIfResult);
  }

  /**
   * Test {@link ImmutableMarketDataBuilder#build()}.
   *
   * <p>Method under test: {@link ImmutableMarketDataBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMarketData ImmutableMarketDataBuilder.build()"})
  void testBuild() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    ImmutableMarketData actualImmutableMarketData =
        ImmutableMarketData.builder(LocalDate.of(1970, 1, 1)).valuationDate(valuationDate).build();

    // Assert
    LocalDate valuationDate2 = actualImmutableMarketData.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertTrue(actualImmutableMarketData.getIds().isEmpty());
    assertSame(valuationDate, valuationDate2);
    assertSame(actualImmutableMarketData.getTimeSeries(), actualImmutableMarketData.getValues());
  }
}
