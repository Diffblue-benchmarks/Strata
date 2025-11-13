package com.opengamma.strata.measure.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.calc.runner.FxRateLookup;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.pricer.rate.RatesProvider;
import java.util.HashMap;
import java.util.HashSet;
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

class DefaultRatesMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)}.
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName("Test of(Map, Map, ObservableSource, FxRateLookup)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketDataLookup DefaultRatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOf() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.putIfAbsent(index, CurveId.of("discountCurves", "discountCurves"));
    Index index2 = mock(Index.class);
    forwardCurveIds.put(index2, CurveId.of("discountCurves", "discountCurves"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DefaultRatesMarketDataLookup.of(
                discountCurveIds,
                forwardCurveIds,
                ObservableSource.of("Name"),
                mock(FxRateLookup.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)}.
   *
   * <ul>
   *   <li>Given {@link CurveId} with groupName is {@code 42} and curveName is {@code
   *       discountCurves}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup); given CurveId with groupName is '42' and curveName is 'discountCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketDataLookup DefaultRatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOf_givenCurveIdWithGroupNameIs42AndCurveNameIsDiscountCurves() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.putIfAbsent(index, CurveId.of("42", "discountCurves"));
    Index index2 = mock(Index.class);
    forwardCurveIds.putIfAbsent(index2, CurveId.of("discountCurves", "discountCurves"));
    Index index3 = mock(Index.class);
    forwardCurveIds.put(index3, CurveId.of("discountCurves", "discountCurves"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DefaultRatesMarketDataLookup.of(
                discountCurveIds,
                forwardCurveIds,
                ObservableSource.of("Name"),
                mock(FxRateLookup.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketDataLookup DefaultRatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOf_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.put(index, CurveId.of("discountCurves", "discountCurves"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DefaultRatesMarketDataLookup.of(
                discountCurveIds,
                forwardCurveIds,
                ObservableSource.of("Name"),
                mock(FxRateLookup.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketDataLookup DefaultRatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOf_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.put(index, CurveId.of("discountCurves", "discountCurves"));
    Index index2 = mock(Index.class);
    forwardCurveIds.put(index2, CurveId.of("discountCurves", "discountCurves"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DefaultRatesMarketDataLookup.of(
                discountCurveIds,
                forwardCurveIds,
                ObservableSource.of("Name"),
                mock(FxRateLookup.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return DiscountCurves is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup); when HashMap(); then return DiscountCurves is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketDataLookup DefaultRatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOf_whenHashMap_thenReturnDiscountCurvesIsHashMap() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    DefaultRatesMarketDataLookup actualOfResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));

    // Assert
    ImmutableMap<Currency, CurveId> discountCurves = actualOfResult.getDiscountCurves();
    assertEquals(discountCurveIds, discountCurves);
    assertSame(discountCurves, actualOfResult.getForwardCurves());
    assertSame(obsSource, actualOfResult.getObservableSource());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)}.
   *
   * <ul>
   *   <li>When {@link ObservableSource} with name is {@code None}.
   *   <li>Then return ForwardIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup); when ObservableSource with name is 'None'; then return ForwardIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultRatesMarketDataLookup DefaultRatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOf_whenObservableSourceWithNameIsNone_thenReturnForwardIndicesSizeIsOne() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.put(index, CurveId.of("discountCurves", "discountCurves"));
    ObservableSource obsSource = ObservableSource.of("None");

    // Act
    DefaultRatesMarketDataLookup actualOfResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));

    // Assert
    assertEquals(1, actualOfResult.getForwardIndices().size());
    assertEquals(forwardCurveIds, actualOfResult.getForwardCurves());
    assertSame(obsSource, actualOfResult.getObservableSource());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#getDiscountCurrencies()}.
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#getDiscountCurrencies()}
   */
  @Test
  @DisplayName("Test getDiscountCurrencies()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultRatesMarketDataLookup.getDiscountCurrencies()"})
  void testGetDiscountCurrencies() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertTrue(ofResult.getDiscountCurrencies().isEmpty());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#getDiscountMarketDataIds(Currency)}.
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#getDiscountMarketDataIds(Currency)}
   */
  @Test
  @DisplayName("Test getDiscountMarketDataIds(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSet DefaultRatesMarketDataLookup.getDiscountMarketDataIds(Currency)"
  })
  void testGetDiscountMarketDataIds() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getDiscountMarketDataIds(null));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#getForwardIndices()}.
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#getForwardIndices()}
   */
  @Test
  @DisplayName("Test getForwardIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultRatesMarketDataLookup.getForwardIndices()"})
  void testGetForwardIndices() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertTrue(ofResult.getForwardIndices().isEmpty());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#getForwardMarketDataIds(Index)}.
   *
   * <ul>
   *   <li>When {@link Index}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#getForwardMarketDataIds(Index)}
   */
  @Test
  @DisplayName("Test getForwardMarketDataIds(Index); when Index")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultRatesMarketDataLookup.getForwardMarketDataIds(Index)"})
  void testGetForwardMarketDataIds_whenIndex() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getForwardMarketDataIds(mock(Index.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#getForwardMarketDataIds(Index)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#getForwardMarketDataIds(Index)}
   */
  @Test
  @DisplayName("Test getForwardMarketDataIds(Index); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultRatesMarketDataLookup.getForwardMarketDataIds(Index)"})
  void testGetForwardMarketDataIds_whenNull() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getForwardMarketDataIds(null));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#requirements(Set, Set)} with {@code currencies},
   * {@code indices}.
   *
   * <ul>
   *   <li>Then return OutputCurrencies is {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#requirements(Set, Set)}
   */
  @Test
  @DisplayName(
      "Test requirements(Set, Set) with 'currencies', 'indices'; then return OutputCurrencies is HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultRatesMarketDataLookup.requirements(Set, Set)"})
  void testRequirementsWithCurrenciesIndices_thenReturnOutputCurrenciesIsHashSet() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));
    HashSet<Currency> currencies = new HashSet<>();

    // Act
    FunctionRequirements actualRequirementsResult =
        ofResult.requirements(currencies, new HashSet<>());

    // Assert
    ImmutableSet<Currency> outputCurrencies = actualRequirementsResult.getOutputCurrencies();
    assertEquals(currencies, outputCurrencies);
    assertSame(outputCurrencies, actualRequirementsResult.getTimeSeriesRequirements());
    assertSame(outputCurrencies, actualRequirementsResult.getValueRequirements());
    assertSame(obsSource, actualRequirementsResult.getObservableSource());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#requirements(Set, Set)} with {@code currencies},
   * {@code indices}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()} add {@link Index}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#requirements(Set, Set)}
   */
  @Test
  @DisplayName("Test requirements(Set, Set) with 'currencies', 'indices'; when HashSet() add Index")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements DefaultRatesMarketDataLookup.requirements(Set, Set)"})
  void testRequirementsWithCurrenciesIndices_whenHashSetAddIndex() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    HashSet<Currency> currencies = new HashSet<>();

    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(currencies, indices));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#ratesProvider(MarketData)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultLookupRatesProvider}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#ratesProvider(MarketData)}
   */
  @Test
  @DisplayName("Test ratesProvider(MarketData); then return DefaultLookupRatesProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesProvider DefaultRatesMarketDataLookup.ratesProvider(MarketData)"})
  void testRatesProvider_thenReturnDefaultLookupRatesProvider() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    MarketData marketData = mock(MarketData.class);

    // Act
    RatesProvider actualRatesProviderResult = ofResult.ratesProvider(marketData);

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualRatesProviderResult instanceof DefaultLookupRatesProvider);
    assertNull(actualRatesProviderResult.getValuationDate());
    Stream<Index> indicesResult = actualRatesProviderResult.indices();
    assertTrue(indicesResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertTrue(actualRatesProviderResult.getDiscountCurrencies().isEmpty());
    Set<IborIndex> iborIndices = actualRatesProviderResult.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    assertSame(ofResult, ((DefaultLookupRatesProvider) actualRatesProviderResult).getLookup());
    assertSame(
        marketData, ((DefaultLookupRatesProvider) actualRatesProviderResult).getMarketData());
    assertSame(iborIndices, actualRatesProviderResult.getOvernightIndices());
    assertSame(iborIndices, actualRatesProviderResult.getPriceIndices());
    assertSame(iborIndices, actualRatesProviderResult.getTimeSeriesIndices());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#ratesProvider(MarketData)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#ratesProvider(MarketData)}
   */
  @Test
  @DisplayName("Test ratesProvider(MarketData); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesProvider DefaultRatesMarketDataLookup.ratesProvider(MarketData)"})
  void testRatesProvider_thenThrowIllegalArgumentException() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any()))
        .thenThrow(new IllegalArgumentException());
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.ratesProvider(mock(MarketData.class)));
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#msgCurrencyNotFound(Currency)}.
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#msgCurrencyNotFound(Currency)}
   */
  @Test
  @DisplayName("Test msgCurrencyNotFound(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DefaultRatesMarketDataLookup.msgCurrencyNotFound(Currency)"})
  void testMsgCurrencyNotFound() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertEquals(
        "Rates lookup has no discount curve defined for currency 'null'",
        ofResult.msgCurrencyNotFound(null));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultRatesMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultRatesMarketDataLookup> actualMetaResult =
        DefaultRatesMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("discountCurves"));
    assertTrue(metaPropertyMapResult.containsKey("forwardCurves"));
    assertTrue(metaPropertyMapResult.containsKey("fxRateLookup"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultRatesMarketDataLookup> expectedBeanTypeResult = DefaultRatesMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultRatesMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act
    TypedMetaBean<DefaultRatesMarketDataLookup> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("discountCurves"));
    assertTrue(metaPropertyMapResult.containsKey("forwardCurves"));
    assertTrue(metaPropertyMapResult.containsKey("fxRateLookup"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultRatesMarketDataLookup> expectedBeanTypeResult = DefaultRatesMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultRatesMarketDataLookup#toString()}
   *   <li>{@link DefaultRatesMarketDataLookup#getDiscountCurves()}
   *   <li>{@link DefaultRatesMarketDataLookup#getForwardCurves()}
   *   <li>{@link DefaultRatesMarketDataLookup#getFxRateLookup()}
   *   <li>{@link DefaultRatesMarketDataLookup#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap DefaultRatesMarketDataLookup.getDiscountCurves()",
    "ImmutableMap DefaultRatesMarketDataLookup.getForwardCurves()",
    "FxRateLookup DefaultRatesMarketDataLookup.getFxRateLookup()",
    "ObservableSource DefaultRatesMarketDataLookup.getObservableSource()",
    "String DefaultRatesMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));

    // Act
    ofResult.toString();
    ImmutableMap<Currency, CurveId> actualDiscountCurves = ofResult.getDiscountCurves();
    ImmutableMap<Index, CurveId> actualForwardCurves = ofResult.getForwardCurves();
    ofResult.getFxRateLookup();

    // Assert
    assertSame(actualDiscountCurves, actualForwardCurves);
    assertSame(obsSource, ofResult.getObservableSource());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#equals(Object)}, and {@link
   * DefaultRatesMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultRatesMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultRatesMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesMarketDataLookup.equals(Object)",
    "int DefaultRatesMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesMarketDataLookup.equals(Object)",
    "int DefaultRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    HashMap<Currency, CurveId> discountCurveIds2 = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofResult,
        DefaultRatesMarketDataLookup.of(
            discountCurveIds2,
            forwardCurveIds2,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesMarketDataLookup.equals(Object)",
    "int DefaultRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("42"), mock(FxRateLookup.class));
    HashMap<Currency, CurveId> discountCurveIds2 = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofResult,
        DefaultRatesMarketDataLookup.of(
            discountCurveIds2,
            forwardCurveIds2,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesMarketDataLookup.equals(Object)",
    "int DefaultRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");
    HashMap<Currency, CurveId> discountCurveIds2 = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds2 = new HashMap<>();

    DefaultRatesMarketDataLookup fxLookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds2,
            forwardCurveIds2,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(discountCurveIds, forwardCurveIds, obsSource, fxLookup);
    HashMap<Currency, CurveId> discountCurveIds3 = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds3 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofResult,
        DefaultRatesMarketDataLookup.of(
            discountCurveIds3,
            forwardCurveIds3,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class)));
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesMarketDataLookup.equals(Object)",
    "int DefaultRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class)),
        null);
  }

  /**
   * Test {@link DefaultRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultRatesMarketDataLookup.equals(Object)",
    "int DefaultRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class)),
        "Different type to DefaultRatesMarketDataLookup");
  }
}
