package com.opengamma.strata.measure.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
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
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.pricer.rate.SimpleRatesProvider;
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

class DefaultRatesMarketDataDiffblueTest {
  /**
   * Test {@link DefaultRatesMarketData#of(RatesMarketDataLookup, MarketData)}.
   *
   * <ul>
   *   <li>Given {@link FxRateProvider}.
   *   <li>Then ratesProvider return {@link DefaultLookupRatesProvider}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketData#of(RatesMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(RatesMarketDataLookup, MarketData); given FxRateProvider; then ratesProvider return DefaultLookupRatesProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketData DefaultRatesMarketData.of(RatesMarketDataLookup, MarketData)"
  })
  void testOf_givenFxRateProvider_thenRatesProviderReturnDefaultLookupRatesProvider() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultRatesMarketData actualOfResult = DefaultRatesMarketData.of(lookup, marketData);

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    RatesProvider ratesProviderResult = actualOfResult.ratesProvider();
    assertTrue(ratesProviderResult instanceof DefaultLookupRatesProvider);
    assertNull(ratesProviderResult.getValuationDate());
    Stream<Index> indicesResult = ratesProviderResult.indices();
    assertTrue(indicesResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<IborIndex> iborIndices = ratesProviderResult.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    assertSame(lookup, ((DefaultLookupRatesProvider) ratesProviderResult).getLookup());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, ((DefaultLookupRatesProvider) ratesProviderResult).getMarketData());
    assertSame(iborIndices, ratesProviderResult.getOvernightIndices());
    assertSame(iborIndices, ratesProviderResult.getPriceIndices());
    assertSame(iborIndices, ratesProviderResult.getTimeSeriesIndices());
  }

  /**
   * Test {@link DefaultRatesMarketData#of(RatesMarketDataLookup, MarketData)}.
   *
   * <ul>
   *   <li>Given {@link SimpleRatesProvider#SimpleRatesProvider()}.
   *   <li>Then return ratesProvider is {@link SimpleRatesProvider#SimpleRatesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketData#of(RatesMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(RatesMarketDataLookup, MarketData); given SimpleRatesProvider(); then return ratesProvider is SimpleRatesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketData DefaultRatesMarketData.of(RatesMarketDataLookup, MarketData)"
  })
  void testOf_givenSimpleRatesProvider_thenReturnRatesProviderIsSimpleRatesProvider() {
    // Arrange
    RatesMarketDataLookup lookup = mock(RatesMarketDataLookup.class);
    SimpleRatesProvider simpleRatesProvider = new SimpleRatesProvider();
    when(lookup.ratesProvider(Mockito.<MarketData>any())).thenReturn(simpleRatesProvider);

    // Act
    DefaultRatesMarketData actualOfResult =
        DefaultRatesMarketData.of(lookup, mock(MarketData.class));

    // Assert
    verify(lookup).ratesProvider(isA(MarketData.class));
    assertSame(simpleRatesProvider, actualOfResult.ratesProvider());
    assertSame(lookup, actualOfResult.getLookup());
  }

  /**
   * Test {@link DefaultRatesMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>Then ratesProvider return {@link DefaultLookupRatesProvider}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); then ratesProvider return DefaultLookupRatesProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketData DefaultRatesMarketData.withMarketData(MarketData)"})
  void testWithMarketData_thenRatesProviderReturnDefaultLookupRatesProvider() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultRatesMarketData ofResult = DefaultRatesMarketData.of(lookup, mock(MarketData.class));
    MarketData marketData = mock(MarketData.class);

    // Act
    RatesMarketData actualWithMarketDataResult = ofResult.withMarketData(marketData);

    // Assert
    verify(fxLookup, atLeast(1)).fxRateProvider(Mockito.<MarketData>any());
    RatesProvider ratesProviderResult = actualWithMarketDataResult.ratesProvider();
    assertTrue(ratesProviderResult instanceof DefaultLookupRatesProvider);
    assertTrue(actualWithMarketDataResult instanceof DefaultRatesMarketData);
    assertNull(ratesProviderResult.getValuationDate());
    Stream<Index> indicesResult = ratesProviderResult.indices();
    assertTrue(indicesResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<IborIndex> iborIndices = ratesProviderResult.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    assertSame(lookup, ((DefaultLookupRatesProvider) ratesProviderResult).getLookup());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(marketData, ((DefaultLookupRatesProvider) ratesProviderResult).getMarketData());
    assertSame(iborIndices, ratesProviderResult.getOvernightIndices());
    assertSame(iborIndices, ratesProviderResult.getPriceIndices());
    assertSame(iborIndices, ratesProviderResult.getTimeSeriesIndices());
  }

  /**
   * Test {@link DefaultRatesMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>Then return ratesProvider is {@link SimpleRatesProvider#SimpleRatesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); then return ratesProvider is SimpleRatesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketData DefaultRatesMarketData.withMarketData(MarketData)"})
  void testWithMarketData_thenReturnRatesProviderIsSimpleRatesProvider() {
    // Arrange
    RatesMarketDataLookup lookup = mock(RatesMarketDataLookup.class);
    SimpleRatesProvider simpleRatesProvider = new SimpleRatesProvider();
    when(lookup.ratesProvider(Mockito.<MarketData>any())).thenReturn(simpleRatesProvider);

    // Act
    RatesMarketData actualWithMarketDataResult =
        DefaultRatesMarketData.of(lookup, mock(MarketData.class))
            .withMarketData(mock(MarketData.class));

    // Assert
    verify(lookup, atLeast(1)).ratesProvider(Mockito.<MarketData>any());
    assertTrue(actualWithMarketDataResult instanceof DefaultRatesMarketData);
    assertSame(simpleRatesProvider, actualWithMarketDataResult.ratesProvider());
  }

  /**
   * Test {@link DefaultRatesMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultRatesMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultRatesMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultRatesMarketData> actualMetaResult = DefaultRatesMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultRatesMarketData> expectedBeanTypeResult = DefaultRatesMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultRatesMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultRatesMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultRatesMarketData ofResult = DefaultRatesMarketData.of(lookup, mock(MarketData.class));

    // Act
    TypedMetaBean<DefaultRatesMarketData> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultRatesMarketData> expectedBeanTypeResult = DefaultRatesMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
