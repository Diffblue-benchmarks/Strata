package com.opengamma.strata.measure.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.basics.index.FxIndex;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.basics.index.PriceIndex;
import com.opengamma.strata.calc.marketdata.TestObservableId;
import com.opengamma.strata.calc.runner.FxRateLookup;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.pricer.rate.HistoricIborIndexRates;
import com.opengamma.strata.pricer.rate.HistoricOvernightIndexRates;
import com.opengamma.strata.pricer.rate.HistoricPriceIndexValues;
import com.opengamma.strata.pricer.rate.IborIndexRates;
import com.opengamma.strata.pricer.rate.ImmutableRatesProvider;
import com.opengamma.strata.pricer.rate.OvernightIndexRates;
import com.opengamma.strata.pricer.rate.PriceIndexValues;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DefaultLookupRatesProviderDiffblueTest {
  /**
   * Test {@link DefaultLookupRatesProvider#of(DefaultRatesMarketDataLookup, MarketData)}.
   *
   * <ul>
   *   <li>Given {@link FxRateProvider}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#of(DefaultRatesMarketDataLookup,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(DefaultRatesMarketDataLookup, MarketData); given FxRateProvider; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultLookupRatesProvider DefaultLookupRatesProvider.of(DefaultRatesMarketDataLookup, MarketData)"
  })
  void testOf_givenFxRateProvider_thenReturnValuationDateIsNull() {
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
    DefaultLookupRatesProvider actualOfResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertNull(actualOfResult.getValuationDate());
    assertTrue(actualOfResult.getDiscountCurrencies().isEmpty());
    ImmutableSet<IborIndex> iborIndices = actualOfResult.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    Stream<Index> indicesResult = actualOfResult.indices();
    assertTrue(indicesResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
    assertSame(iborIndices, actualOfResult.getOvernightIndices());
    assertSame(iborIndices, actualOfResult.getPriceIndices());
    assertSame(iborIndices, actualOfResult.getTimeSeriesIndices());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DefaultLookupRatesProvider.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);

    DefaultLookupRatesProvider ofResult2 = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act
    LocalDate actualValuationDate = ofResult2.getValuationDate();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getValuationDate()}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DefaultLookupRatesProvider.getValuationDate()"})
  void testGetValuationDate_thenThrowMarketDataNotFoundException() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getValuationDate())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.getValuationDate());
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getValuationDate();
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getDiscountCurrencies()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getDiscountCurrencies()}
   */
  @Test
  @DisplayName("Test getDiscountCurrencies(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultLookupRatesProvider.getDiscountCurrencies()"})
  void testGetDiscountCurrencies_thenReturnEmpty() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    ImmutableSet<Currency> actualDiscountCurrencies = ofResult.getDiscountCurrencies();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualDiscountCurrencies.isEmpty());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#indices()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#indices()}
   */
  @Test
  @DisplayName("Test indices(); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream DefaultLookupRatesProvider.indices()"})
  void testIndices_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    Stream<Index> actualIndicesResult = ofResult.indices();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualIndicesResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getIborIndices()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getIborIndices()}
   */
  @Test
  @DisplayName("Test getIborIndices(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultLookupRatesProvider.getIborIndices()"})
  void testGetIborIndices_thenReturnEmpty() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    ImmutableSet<IborIndex> actualIborIndices = ofResult.getIborIndices();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualIborIndices.isEmpty());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getOvernightIndices()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getOvernightIndices()}
   */
  @Test
  @DisplayName("Test getOvernightIndices(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultLookupRatesProvider.getOvernightIndices()"})
  void testGetOvernightIndices_thenReturnEmpty() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    ImmutableSet<OvernightIndex> actualOvernightIndices = ofResult.getOvernightIndices();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualOvernightIndices.isEmpty());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getPriceIndices()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getPriceIndices()}
   */
  @Test
  @DisplayName("Test getPriceIndices(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultLookupRatesProvider.getPriceIndices()"})
  void testGetPriceIndices_thenReturnEmpty() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    ImmutableSet<PriceIndex> actualPriceIndices = ofResult.getPriceIndices();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualPriceIndices.isEmpty());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getTimeSeriesIndices()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link TestObservableId} with id is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getTimeSeriesIndices()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIndices(); given HashSet() add TestObservableId with id is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultLookupRatesProvider.getTimeSeriesIndices()"})
  void testGetTimeSeriesIndices_givenHashSetAddTestObservableIdWithIdIs42() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    HashSet<ObservableId> observableIdSet = new HashSet<>();
    observableIdSet.add(TestObservableId.of("42"));

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeriesIds()).thenReturn(observableIdSet);

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act
    ImmutableSet<Index> actualTimeSeriesIndices = ofResult.getTimeSeriesIndices();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeriesIds();
    assertTrue(actualTimeSeriesIndices.isEmpty());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getTimeSeriesIndices()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getTimeSeriesIndices()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIndices(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultLookupRatesProvider.getTimeSeriesIndices()"})
  void testGetTimeSeriesIndices_thenReturnEmpty() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeriesIds()).thenReturn(new HashSet<>());

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act
    ImmutableSet<Index> actualTimeSeriesIndices = ofResult.getTimeSeriesIndices();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeriesIds();
    assertTrue(actualTimeSeriesIndices.isEmpty());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#getTimeSeriesIndices()}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#getTimeSeriesIndices()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIndices(); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet DefaultLookupRatesProvider.getTimeSeriesIndices()"})
  void testGetTimeSeriesIndices_thenThrowMarketDataNotFoundException() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeriesIds())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.getTimeSeriesIndices());
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeriesIds();
  }

  /**
   * Test {@link DefaultLookupRatesProvider#data(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link FxRateLookup} {@link FxRateLookup#fxRateProvider(MarketData)} return {@link
   *       FxRateProvider}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#data(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test data(MarketDataId); given FxRateLookup fxRateProvider(MarketData) return FxRateProvider; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultLookupRatesProvider.data(MarketDataId)"})
  void testData_givenFxRateLookupFxRateProviderReturnFxRateProvider_thenReturnNull() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    Object actualDataResult = ofResult.data(mock(MarketDataId.class));

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertNull(actualDataResult);
  }

  /**
   * Test {@link DefaultLookupRatesProvider#findData(MarketDataName)}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#findData(MarketDataName)}
   */
  @Test
  @DisplayName("Test findData(MarketDataName); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultLookupRatesProvider.findData(MarketDataName)"})
  void testFindData_thenReturnNotPresent() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    Optional<Object> actualFindDataResult = ofResult.findData(null);

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertFalse(actualFindDataResult.isPresent());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#timeSeries(Index)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#getTimeSeries(ObservableId)} return {@link
   *       LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#timeSeries(Index)}
   */
  @Test
  @DisplayName(
      "Test timeSeries(Index); given MarketData getTimeSeries(ObservableId) return LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries DefaultLookupRatesProvider.timeSeries(Index)"})
  void testTimeSeries_givenMarketDataGetTimeSeriesReturnLocalDateDoubleTimeSeries() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act
    ofResult.timeSeries(mock(Index.class));

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#timeSeries(Index)}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#timeSeries(Index)}
   */
  @Test
  @DisplayName("Test timeSeries(Index); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoubleTimeSeries DefaultLookupRatesProvider.timeSeries(Index)"})
  void testTimeSeries_thenThrowMarketDataNotFoundException() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.timeSeries(mock(Index.class)));
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#fxRate(Currency, Currency)} with {@code baseCurrency},
   * {@code counterCurrency}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DefaultLookupRatesProvider.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_thenReturnTen() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any())).thenReturn(10.0d);

    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(fxRateProvider);
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    double actualFxRateResult = ofResult.fxRate(null, null);

    // Assert
    verify(fxRateProvider).fxRate(isNull(), isNull());
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertEquals(10.0d, actualFxRateResult);
  }

  /**
   * Test {@link DefaultLookupRatesProvider#fxRate(Currency, Currency)} with {@code baseCurrency},
   * {@code counterCurrency}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DefaultLookupRatesProvider.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_thenThrowMarketDataNotFoundException() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(fxRateProvider);
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.fxRate(null, null));
    verify(fxRateProvider).fxRate(isNull(), isNull());
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#discountFactors(Currency)}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#discountFactors(Currency)}
   */
  @Test
  @DisplayName("Test discountFactors(Currency); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.DiscountFactors DefaultLookupRatesProvider.discountFactors(Currency)"
  })
  void testDiscountFactors_thenThrowMarketDataNotFoundException() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.discountFactors(null));
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#fxIndexRates(FxIndex)}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#fxIndexRates(FxIndex)}
   */
  @Test
  @DisplayName("Test fxIndexRates(FxIndex); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fx.FxIndexRates DefaultLookupRatesProvider.fxIndexRates(FxIndex)"
  })
  void testFxIndexRates_thenThrowMarketDataNotFoundException() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenThrow(new MarketDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.fxIndexRates(index));
    verify(index).getCurrencyPair();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName("Test iborIndexRates(IborIndex)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborIndexRates DefaultLookupRatesProvider.iborIndexRates(IborIndex)"})
  void testIborIndexRates() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.iborIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName(
      "Test iborIndexRates(IborIndex); given LocalDateDoubleTimeSeries isEmpty() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborIndexRates DefaultLookupRatesProvider.iborIndexRates(IborIndex)"})
  void testIborIndexRates_givenLocalDateDoubleTimeSeriesIsEmptyReturnTrue() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(true);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.iborIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataNotFoundException#MarketDataNotFoundException(String)} with
   *       message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName(
      "Test iborIndexRates(IborIndex); given MarketDataNotFoundException(String) with message is 'An error occurred'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborIndexRates DefaultLookupRatesProvider.iborIndexRates(IborIndex)"})
  void testIborIndexRates_givenMarketDataNotFoundExceptionWithMessageIsAnErrorOccurred() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenThrow(new MarketDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.iborIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link IborIndex} {@link IborIndex#isActive()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName(
      "Test iborIndexRates(IborIndex); given 'true'; when IborIndex isActive() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborIndexRates DefaultLookupRatesProvider.iborIndexRates(IborIndex)"})
  void testIborIndexRates_givenTrue_whenIborIndexIsActiveReturnTrue() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.iborIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Then return {@link HistoricIborIndexRates}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName("Test iborIndexRates(IborIndex); then return HistoricIborIndexRates")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborIndexRates DefaultLookupRatesProvider.iborIndexRates(IborIndex)"})
  void testIborIndexRates_thenReturnHistoricIborIndexRates() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(false);

    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult2 = DefaultLookupRatesProvider.of(lookup, marketData);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act
    IborIndexRates actualIborIndexRatesResult = ofResult2.iborIndexRates(index);

    // Assert
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
    verify(marketData).getValuationDate();
    assertTrue(actualIborIndexRatesResult instanceof HistoricIborIndexRates);
    LocalDate valuationDate = actualIborIndexRatesResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate.toString());
    assertEquals(0, actualIborIndexRatesResult.getParameterCount());
    assertSame(ofResult, valuationDate);
    assertSame(index, actualIborIndexRatesResult.getIndex());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName("Test overnightIndexRates(OvernightIndex)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexRates DefaultLookupRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenThrow(new MarketDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.overnightIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName("Test overnightIndexRates(OvernightIndex)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexRates DefaultLookupRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates2() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.overnightIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName(
      "Test overnightIndexRates(OvernightIndex); given LocalDateDoubleTimeSeries isEmpty() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexRates DefaultLookupRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates_givenLocalDateDoubleTimeSeriesIsEmptyReturnTrue() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(true);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.overnightIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link OvernightIndex} {@link OvernightIndex#isActive()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName(
      "Test overnightIndexRates(OvernightIndex); given 'true'; when OvernightIndex isActive() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexRates DefaultLookupRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates_givenTrue_whenOvernightIndexIsActiveReturnTrue() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.overnightIndexRates(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <ul>
   *   <li>Then return {@link HistoricOvernightIndexRates}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName("Test overnightIndexRates(OvernightIndex); then return HistoricOvernightIndexRates")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightIndexRates DefaultLookupRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates_thenReturnHistoricOvernightIndexRates() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(false);

    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult2 = DefaultLookupRatesProvider.of(lookup, marketData);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act
    OvernightIndexRates actualOvernightIndexRatesResult = ofResult2.overnightIndexRates(index);

    // Assert
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
    verify(marketData).getValuationDate();
    assertTrue(actualOvernightIndexRatesResult instanceof HistoricOvernightIndexRates);
    LocalDate valuationDate = actualOvernightIndexRatesResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate.toString());
    assertEquals(0, actualOvernightIndexRatesResult.getParameterCount());
    assertSame(ofResult, valuationDate);
    assertSame(index, actualOvernightIndexRatesResult.getIndex());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName("Test priceIndexValues(PriceIndex)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndexValues DefaultLookupRatesProvider.priceIndexValues(PriceIndex)"})
  void testPriceIndexValues() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenThrow(new MarketDataNotFoundException("An error occurred"));

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.priceIndexValues(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName("Test priceIndexValues(PriceIndex)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndexValues DefaultLookupRatesProvider.priceIndexValues(PriceIndex)"})
  void testPriceIndexValues2() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.priceIndexValues(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Given {@link LocalDateDoubleTimeSeries} {@link LocalDateDoubleTimeSeries#isEmpty()}
   *       return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName(
      "Test priceIndexValues(PriceIndex); given LocalDateDoubleTimeSeries isEmpty() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndexValues DefaultLookupRatesProvider.priceIndexValues(PriceIndex)"})
  void testPriceIndexValues_givenLocalDateDoubleTimeSeriesIsEmptyReturnTrue() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(true);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.priceIndexValues(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link PriceIndex} {@link PriceIndex#isActive()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName(
      "Test priceIndexValues(PriceIndex); given 'true'; when PriceIndex isActive() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndexValues DefaultLookupRatesProvider.priceIndexValues(PriceIndex)"})
  void testPriceIndexValues_givenTrue_whenPriceIndexIsActiveReturnTrue() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.priceIndexValues(index));
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Then return {@link HistoricPriceIndexValues}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName("Test priceIndexValues(PriceIndex); then return HistoricPriceIndexValues")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndexValues DefaultLookupRatesProvider.priceIndexValues(PriceIndex)"})
  void testPriceIndexValues_thenReturnHistoricPriceIndexValues() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    LocalDateDoubleTimeSeries localDateDoubleTimeSeries = mock(LocalDateDoubleTimeSeries.class);
    when(localDateDoubleTimeSeries.isEmpty()).thenReturn(false);

    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    when(marketData.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(localDateDoubleTimeSeries);

    DefaultLookupRatesProvider ofResult2 = DefaultLookupRatesProvider.of(lookup, marketData);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act
    PriceIndexValues actualPriceIndexValuesResult = ofResult2.priceIndexValues(index);

    // Assert
    verify(index).isActive();
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(localDateDoubleTimeSeries).isEmpty();
    verify(marketData).getTimeSeries(isA(ObservableId.class));
    verify(marketData).getValuationDate();
    assertTrue(actualPriceIndexValuesResult instanceof HistoricPriceIndexValues);
    LocalDate valuationDate = actualPriceIndexValuesResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate.toString());
    assertEquals(0, actualPriceIndexValuesResult.getParameterCount());
    assertSame(ofResult, valuationDate);
    assertSame(index, actualPriceIndexValuesResult.getIndex());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#toImmutableRatesProvider()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link TestObservableId} with id is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#toImmutableRatesProvider()}
   */
  @Test
  @DisplayName(
      "Test toImmutableRatesProvider(); given HashSet() add TestObservableId with id is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider DefaultLookupRatesProvider.toImmutableRatesProvider()"
  })
  void testToImmutableRatesProvider_givenHashSetAddTestObservableIdWithIdIs42() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    HashSet<ObservableId> observableIdSet = new HashSet<>();
    observableIdSet.add(TestObservableId.of("42"));

    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    when(marketData.getTimeSeriesIds()).thenReturn(observableIdSet);

    DefaultLookupRatesProvider ofResult2 = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act
    ImmutableRatesProvider actualToImmutableRatesProviderResult =
        ofResult2.toImmutableRatesProvider();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeriesIds();
    verify(marketData).getValuationDate();
    LocalDate valuationDate = actualToImmutableRatesProviderResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate.toString());
    ImmutableMap<Currency, Curve> discountCurves =
        actualToImmutableRatesProviderResult.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    ImmutableSet<Currency> discountCurrencies =
        actualToImmutableRatesProviderResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    ImmutableSet<IborIndex> iborIndices = actualToImmutableRatesProviderResult.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    assertTrue(actualToImmutableRatesProviderResult.getCurves().isEmpty());
    assertSame(ofResult, valuationDate);
    assertSame(discountCurves, actualToImmutableRatesProviderResult.getIndexCurves());
    assertSame(discountCurves, actualToImmutableRatesProviderResult.getTimeSeries());
    assertSame(discountCurrencies, actualToImmutableRatesProviderResult.getTimeSeriesIndices());
    assertSame(iborIndices, actualToImmutableRatesProviderResult.getOvernightIndices());
    assertSame(iborIndices, actualToImmutableRatesProviderResult.getPriceIndices());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#toImmutableRatesProvider()}.
   *
   * <ul>
   *   <li>Then return ValuationDate toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#toImmutableRatesProvider()}
   */
  @Test
  @DisplayName(
      "Test toImmutableRatesProvider(); then return ValuationDate toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider DefaultLookupRatesProvider.toImmutableRatesProvider()"
  })
  void testToImmutableRatesProvider_thenReturnValuationDateToStringIs19700101() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    when(marketData.getTimeSeriesIds()).thenReturn(new HashSet<>());

    DefaultLookupRatesProvider ofResult2 = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act
    ImmutableRatesProvider actualToImmutableRatesProviderResult =
        ofResult2.toImmutableRatesProvider();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeriesIds();
    verify(marketData).getValuationDate();
    LocalDate valuationDate = actualToImmutableRatesProviderResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate.toString());
    ImmutableMap<Currency, Curve> discountCurves =
        actualToImmutableRatesProviderResult.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    ImmutableSet<Currency> discountCurrencies =
        actualToImmutableRatesProviderResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    ImmutableSet<IborIndex> iborIndices = actualToImmutableRatesProviderResult.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    assertTrue(actualToImmutableRatesProviderResult.getCurves().isEmpty());
    assertSame(ofResult, valuationDate);
    assertSame(discountCurves, actualToImmutableRatesProviderResult.getIndexCurves());
    assertSame(discountCurves, actualToImmutableRatesProviderResult.getTimeSeries());
    assertSame(discountCurrencies, actualToImmutableRatesProviderResult.getTimeSeriesIndices());
    assertSame(iborIndices, actualToImmutableRatesProviderResult.getOvernightIndices());
    assertSame(iborIndices, actualToImmutableRatesProviderResult.getPriceIndices());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#toImmutableRatesProvider()}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#toImmutableRatesProvider()}
   */
  @Test
  @DisplayName("Test toImmutableRatesProvider(); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider DefaultLookupRatesProvider.toImmutableRatesProvider()"
  })
  void testToImmutableRatesProvider_thenThrowMarketDataNotFoundException() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);

    MarketData marketData = mock(MarketData.class);
    when(marketData.getTimeSeriesIds())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));

    DefaultLookupRatesProvider ofResult = DefaultLookupRatesProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.toImmutableRatesProvider());
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    verify(marketData).getTimeSeriesIds();
  }

  /**
   * Test {@link DefaultLookupRatesProvider#meta()}.
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLookupRatesProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultLookupRatesProvider> actualMetaResult = DefaultLookupRatesProvider.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultLookupRatesProvider> expectedBeanTypeResult = DefaultLookupRatesProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultLookupRatesProvider#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupRatesProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLookupRatesProvider.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup lookup =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    DefaultLookupRatesProvider ofResult =
        DefaultLookupRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    TypedMetaBean<DefaultLookupRatesProvider> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultLookupRatesProvider> expectedBeanTypeResult = DefaultLookupRatesProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
