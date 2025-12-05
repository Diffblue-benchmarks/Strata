package com.opengamma.strata.measure.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.calc.runner.FxRateLookup;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.rate.RatesProvider;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DefaultRatesScenarioMarketDataDiffblueTest {
  /**
   * Test {@link DefaultRatesScenarioMarketData#of(RatesMarketDataLookup, ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#of(RatesMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(RatesMarketDataLookup, ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesScenarioMarketData DefaultRatesScenarioMarketData.of(RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();

    // Act
    DefaultRatesScenarioMarketData actualOfResult =
        DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Assert
    assertTrue(actualOfResult.getLookup() instanceof DefaultRatesMarketDataLookup);
    assertEquals(0, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#of(RatesMarketDataLookup, ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#of(RatesMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(RatesMarketDataLookup, ScenarioMarketData); when LocalDate with '1970' and one and one; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesScenarioMarketData DefaultRatesScenarioMarketData.of(RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnScenarioCountIsOne() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    DefaultRatesScenarioMarketData actualOfResult =
        DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Assert
    assertTrue(actualOfResult.getLookup() instanceof DefaultRatesMarketDataLookup);
    assertEquals(1, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test withMarketData(ScenarioMarketData); then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesScenarioMarketData DefaultRatesScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_thenReturnScenarioCountIsOne() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    // Act
    RatesScenarioMarketData actualWithMarketDataResult = ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult.getLookup() instanceof DefaultRatesMarketDataLookup);
    assertTrue(actualWithMarketDataResult instanceof DefaultRatesScenarioMarketData);
    assertEquals(1, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesScenarioMarketData DefaultRatesScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);
    ImmutableScenarioMarketData marketData2 = ImmutableScenarioMarketData.empty();

    // Act
    RatesScenarioMarketData actualWithMarketDataResult = ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult.getLookup() instanceof DefaultRatesMarketDataLookup);
    assertTrue(actualWithMarketDataResult instanceof DefaultRatesScenarioMarketData);
    assertEquals(0, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName(
      "Test getScenarioCount(); given LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultRatesScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_givenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(1, ofResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultRatesScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertEquals(
        0,
        DefaultRatesScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty())
            .getScenarioCount());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>Then ratesProvider return {@link DefaultLookupRatesProvider}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int); then ratesProvider return DefaultLookupRatesProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketData DefaultRatesScenarioMarketData.scenario(int)"})
  void testScenario_thenRatesProviderReturnDefaultLookupRatesProvider() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Act
    RatesMarketData actualScenarioResult = ofResult.scenario(0);

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    RatesProvider ratesProviderResult = actualScenarioResult.ratesProvider();
    assertTrue(ratesProviderResult instanceof DefaultLookupRatesProvider);
    assertTrue(actualScenarioResult instanceof DefaultRatesMarketData);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    Stream<Index> indicesResult = ratesProviderResult.indices();
    assertTrue(indicesResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<IborIndex> iborIndices = ratesProviderResult.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    assertSame(lookup, ((DefaultLookupRatesProvider) ratesProviderResult).getLookup());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(valuationDate, valuationDate2);
    assertSame(valuationDate, ratesProviderResult.getValuationDate());
    assertSame(iborIndices, ratesProviderResult.getOvernightIndices());
    assertSame(iborIndices, ratesProviderResult.getPriceIndices());
    assertSame(iborIndices, ratesProviderResult.getTimeSeriesIndices());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultRatesScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultRatesScenarioMarketData> actualMetaResult =
        DefaultRatesScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultRatesScenarioMarketData> expectedBeanTypeResult =
        DefaultRatesScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultRatesScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Act
    TypedMetaBean<DefaultRatesScenarioMarketData> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultRatesScenarioMarketData> expectedBeanTypeResult =
        DefaultRatesScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultRatesScenarioMarketData#toString()}
   *   <li>{@link DefaultRatesScenarioMarketData#getLookup()}
   *   <li>{@link DefaultRatesScenarioMarketData#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesMarketDataLookup DefaultRatesScenarioMarketData.getLookup()",
    "ScenarioMarketData DefaultRatesScenarioMarketData.getMarketData()",
    "String DefaultRatesScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Act
    ofResult.toString();
    RatesMarketDataLookup actualLookup = ofResult.getLookup();

    // Assert
    assertSame(marketData, ofResult.getMarketData());
    assertSame(lookup, actualLookup);
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#equals(Object)}, and {@link
   * DefaultRatesScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultRatesScenarioMarketData#equals(Object)}
   *   <li>{@link DefaultRatesScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesScenarioMarketData.equals(Object)",
    "int DefaultRatesScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesScenarioMarketData.equals(Object)",
    "int DefaultRatesScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);
    HashMap<Currency, CurveId> discountCurveIds2 = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds2 = new HashMap<>();

    DefaultRatesMarketDataLookup lookup2 =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds2,
            forwardCurveIds2,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult2 =
        DefaultRatesScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesScenarioMarketData.equals(Object)",
    "int DefaultRatesScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultRatesScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesScenarioMarketData.equals(Object)",
    "int DefaultRatesScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultRatesScenarioMarketData ofResult = DefaultRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultRatesScenarioMarketData");
  }
}
