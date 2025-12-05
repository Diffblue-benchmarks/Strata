package com.opengamma.strata.pricer.rate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.CurveGroupName;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.ImmutableRatesProvider.Meta;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ImmutableRatesProviderDiffblueTest {
  /**
   * Test {@link ImmutableRatesProvider#combined(FxRateProvider, ImmutableRatesProvider[])}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combined(FxRateProvider,
   * ImmutableRatesProvider[])}
   */
  @Test
  @DisplayName(
      "Test combined(FxRateProvider, ImmutableRatesProvider[]); given Index; then return TimeSeriesIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combined(FxRateProvider, ImmutableRatesProvider[])"
  })
  void testCombined_givenIndex_thenReturnTimeSeriesIndicesSizeIsOne() {
    // Arrange
    FxRateProvider fx = mock(FxRateProvider.class);

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    // Act
    ImmutableRatesProvider actualCombinedResult =
        ImmutableRatesProvider.combined(fx, immutableRatesProvider);

    // Assert
    LocalDate valuationDate2 = actualCombinedResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertEquals(1, actualCombinedResult.getTimeSeriesIndices().size());
    assertEquals(1, actualCombinedResult.getTimeSeries().size());
    ImmutableSet<IborIndex> iborIndices = actualCombinedResult.getIborIndices();
    assertSame(iborIndices, actualCombinedResult.getOvernightIndices());
    assertSame(iborIndices, actualCombinedResult.getPriceIndices());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link ImmutableRatesProvider#combined(FxRateProvider, ImmutableRatesProvider[])}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combined(FxRateProvider,
   * ImmutableRatesProvider[])}
   */
  @Test
  @DisplayName(
      "Test combined(FxRateProvider, ImmutableRatesProvider[]); given Index; then return TimeSeriesIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combined(FxRateProvider, ImmutableRatesProvider[])"
  })
  void testCombined_givenIndex_thenReturnTimeSeriesIndicesSizeIsTwo() {
    // Arrange
    FxRateProvider fx = mock(FxRateProvider.class);

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    // Act
    ImmutableRatesProvider actualCombinedResult =
        ImmutableRatesProvider.combined(fx, immutableRatesProvider);

    // Assert
    LocalDate valuationDate2 = actualCombinedResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertEquals(2, actualCombinedResult.getTimeSeriesIndices().size());
    assertEquals(2, actualCombinedResult.getTimeSeries().size());
    ImmutableSet<IborIndex> iborIndices = actualCombinedResult.getIborIndices();
    assertSame(iborIndices, actualCombinedResult.getOvernightIndices());
    assertSame(iborIndices, actualCombinedResult.getPriceIndices());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link ImmutableRatesProvider#combined(FxRateProvider, ImmutableRatesProvider[])}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIndices size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combined(FxRateProvider,
   * ImmutableRatesProvider[])}
   */
  @Test
  @DisplayName(
      "Test combined(FxRateProvider, ImmutableRatesProvider[]); then return TimeSeriesIndices size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combined(FxRateProvider, ImmutableRatesProvider[])"
  })
  void testCombined_thenReturnTimeSeriesIndicesSizeIsThree() {
    // Arrange
    FxRateProvider fx = mock(FxRateProvider.class);

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.putIfAbsent(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.ofEpochDay(1L);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    // Act
    ImmutableRatesProvider actualCombinedResult =
        ImmutableRatesProvider.combined(fx, immutableRatesProvider);

    // Assert
    LocalDate valuationDate2 = actualCombinedResult.getValuationDate();
    assertEquals("1970-01-02", valuationDate2.toString());
    assertEquals(3, actualCombinedResult.getTimeSeriesIndices().size());
    assertEquals(3, actualCombinedResult.getTimeSeries().size());
    ImmutableSet<IborIndex> iborIndices = actualCombinedResult.getIborIndices();
    assertSame(iborIndices, actualCombinedResult.getOvernightIndices());
    assertSame(iborIndices, actualCombinedResult.getPriceIndices());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link ImmutableRatesProvider#combined(FxRateProvider, ImmutableRatesProvider[])}.
   *
   * <ul>
   *   <li>Then return ValuationDate toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combined(FxRateProvider,
   * ImmutableRatesProvider[])}
   */
  @Test
  @DisplayName(
      "Test combined(FxRateProvider, ImmutableRatesProvider[]); then return ValuationDate toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combined(FxRateProvider, ImmutableRatesProvider[])"
  })
  void testCombined_thenReturnValuationDateToStringIs19700101() {
    // Arrange
    FxRateProvider fx = mock(FxRateProvider.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    ImmutableRatesProvider actualCombinedResult =
        ImmutableRatesProvider.combined(fx, immutableRatesProvider);

    // Assert
    LocalDate valuationDate2 = actualCombinedResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    ImmutableSet<IborIndex> iborIndices = actualCombinedResult.getIborIndices();
    assertSame(iborIndices, actualCombinedResult.getOvernightIndices());
    assertSame(iborIndices, actualCombinedResult.getPriceIndices());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link ImmutableRatesProvider#combined(FxRateProvider, ImmutableRatesProvider[])}.
   *
   * <ul>
   *   <li>Then return ValuationDate toString is {@code 1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combined(FxRateProvider,
   * ImmutableRatesProvider[])}
   */
  @Test
  @DisplayName(
      "Test combined(FxRateProvider, ImmutableRatesProvider[]); then return ValuationDate toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combined(FxRateProvider, ImmutableRatesProvider[])"
  })
  void testCombined_thenReturnValuationDateToStringIs19700102() {
    // Arrange
    FxRateProvider fx = mock(FxRateProvider.class);

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.ofEpochDay(1L);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    // Act
    ImmutableRatesProvider actualCombinedResult =
        ImmutableRatesProvider.combined(fx, immutableRatesProvider);

    // Assert
    LocalDate valuationDate2 = actualCombinedResult.getValuationDate();
    assertEquals("1970-01-02", valuationDate2.toString());
    assertEquals(2, actualCombinedResult.getTimeSeriesIndices().size());
    assertEquals(2, actualCombinedResult.getTimeSeries().size());
    ImmutableSet<IborIndex> iborIndices = actualCombinedResult.getIborIndices();
    assertSame(iborIndices, actualCombinedResult.getOvernightIndices());
    assertSame(iborIndices, actualCombinedResult.getPriceIndices());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link ImmutableRatesProvider#getDiscountCurrencies()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getDiscountCurrencies()}
   */
  @Test
  @DisplayName("Test getDiscountCurrencies()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableRatesProvider.getDiscountCurrencies()"})
  void testGetDiscountCurrencies() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertTrue(immutableRatesProvider.getDiscountCurrencies().isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#indices()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#indices()}
   */
  @Test
  @DisplayName("Test indices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream ImmutableRatesProvider.indices()"})
  void testIndices() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    Stream<Index> actualIndicesResult = immutableRatesProvider.indices();

    // Assert
    assertTrue(actualIndicesResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#getIborIndices()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getIborIndices()}
   */
  @Test
  @DisplayName("Test getIborIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableRatesProvider.getIborIndices()"})
  void testGetIborIndices() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertTrue(immutableRatesProvider.getIborIndices().isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#getOvernightIndices()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getOvernightIndices()}
   */
  @Test
  @DisplayName("Test getOvernightIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableRatesProvider.getOvernightIndices()"})
  void testGetOvernightIndices() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertTrue(immutableRatesProvider.getOvernightIndices().isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#getPriceIndices()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getPriceIndices()}
   */
  @Test
  @DisplayName("Test getPriceIndices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableRatesProvider.getPriceIndices()"})
  void testGetPriceIndices() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertTrue(immutableRatesProvider.getPriceIndices().isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#getTimeSeriesIndices()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getTimeSeriesIndices()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIndices(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableRatesProvider.getTimeSeriesIndices()"})
  void testGetTimeSeriesIndices_thenReturnEmpty() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertTrue(immutableRatesProvider.getTimeSeriesIndices().isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#getTimeSeriesIndices()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getTimeSeriesIndices()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIndices(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableRatesProvider.getTimeSeriesIndices()"})
  void testGetTimeSeriesIndices_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    // Act and Assert
    assertEquals(1, immutableRatesProvider.getTimeSeriesIndices().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#getTimeSeriesIndices()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getTimeSeriesIndices()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIndices(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableRatesProvider.getTimeSeriesIndices()"})
  void testGetTimeSeriesIndices_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    // Act and Assert
    assertEquals(2, immutableRatesProvider.getTimeSeriesIndices().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#findData(MarketDataName)}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#findData(MarketDataName)}
   */
  @Test
  @DisplayName("Test findData(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ImmutableRatesProvider.findData(MarketDataName)"})
  void testFindData() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    Optional<Object> actualFindDataResult =
        immutableRatesProvider.findData(mock(MarketDataName.class));

    // Assert
    assertFalse(actualFindDataResult.isPresent());
  }

  /**
   * Test {@link ImmutableRatesProvider#data(MarketDataId)}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#data(MarketDataId)}
   */
  @Test
  @DisplayName("Test data(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableRatesProvider.data(MarketDataId)"})
  void testData() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> immutableRatesProvider.data(mock(MarketDataId.class)));
  }

  /**
   * Test {@link ImmutableRatesProvider#fxRate(Currency, Currency)} with {@code baseCurrency},
   * {@code counterCurrency}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ImmutableRatesProvider.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_thenReturnTen() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any())).thenReturn(10.0d);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    double actualFxRateResult = immutableRatesProvider.fxRate(null, null);

    // Assert
    verify(fxRateProvider).fxRate(isNull(), isNull());
    assertEquals(10.0d, actualFxRateResult);
  }

  /**
   * Test {@link ImmutableRatesProvider#fxRate(Currency, Currency)} with {@code baseCurrency},
   * {@code counterCurrency}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ImmutableRatesProvider.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_thenThrowIllegalArgumentException() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenThrow(new IllegalArgumentException());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> immutableRatesProvider.fxRate(null, null));
    verify(fxRateProvider).fxRate(isNull(), isNull());
  }

  /**
   * Test {@link ImmutableRatesProvider#discountFactors(Currency)}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#discountFactors(Currency)}
   */
  @Test
  @DisplayName("Test discountFactors(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.DiscountFactors ImmutableRatesProvider.discountFactors(Currency)"
  })
  void testDiscountFactors() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.discountFactors(null));
  }

  /**
   * Test {@link ImmutableRatesProvider#fxIndexRates(FxIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#fxIndexRates(FxIndex)}
   */
  @Test
  @DisplayName("Test fxIndexRates(FxIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fx.FxIndexRates ImmutableRatesProvider.fxIndexRates(FxIndex)"
  })
  void testFxIndexRates_givenHashMapIndexIsLocalDateDoubleTimeSeries() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> immutableRatesProvider.fxIndexRates(index));
    verify(index).getCurrencyPair();
  }

  /**
   * Test {@link ImmutableRatesProvider#fxIndexRates(FxIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#fxIndexRates(FxIndex)}
   */
  @Test
  @DisplayName("Test fxIndexRates(FxIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fx.FxIndexRates ImmutableRatesProvider.fxIndexRates(FxIndex)"
  })
  void testFxIndexRates_givenHashMapIndexIsLocalDateDoubleTimeSeries2() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> immutableRatesProvider.fxIndexRates(index));
    verify(index).getCurrencyPair();
  }

  /**
   * Test {@link ImmutableRatesProvider#fxIndexRates(FxIndex)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#fxIndexRates(FxIndex)}
   */
  @Test
  @DisplayName(
      "Test fxIndexRates(FxIndex); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fx.FxIndexRates ImmutableRatesProvider.fxIndexRates(FxIndex)"
  })
  void testFxIndexRates_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    FxIndex index = mock(FxIndex.class);
    when(index.getCurrencyPair()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> immutableRatesProvider.fxIndexRates(index));
    verify(index).getCurrencyPair();
  }

  /**
   * Test {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link IborIndex} {@link IborIndex#isActive()} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName(
      "Test iborIndexRates(IborIndex); given 'false'; when IborIndex isActive() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.IborIndexRates ImmutableRatesProvider.iborIndexRates(IborIndex)"
  })
  void testIborIndexRates_givenFalse_whenIborIndexIsActiveReturnFalse() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.iborIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} computeIfPresent {@link Index} and {@link BiFunction}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName(
      "Test iborIndexRates(IborIndex); given HashMap() computeIfPresent Index and BiFunction")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.IborIndexRates ImmutableRatesProvider.iborIndexRates(IborIndex)"
  })
  void testIborIndexRates_givenHashMapComputeIfPresentIndexAndBiFunction() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.computeIfPresent(mock(Index.class), mock(BiFunction.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.iborIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName("Test iborIndexRates(IborIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.IborIndexRates ImmutableRatesProvider.iborIndexRates(IborIndex)"
  })
  void testIborIndexRates_givenHashMapIndexIsLocalDateDoubleTimeSeries() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.iborIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName("Test iborIndexRates(IborIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.IborIndexRates ImmutableRatesProvider.iborIndexRates(IborIndex)"
  })
  void testIborIndexRates_givenHashMapIndexIsLocalDateDoubleTimeSeries2() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.iborIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link IborIndex} {@link IborIndex#isActive()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#iborIndexRates(IborIndex)}
   */
  @Test
  @DisplayName(
      "Test iborIndexRates(IborIndex); given 'true'; when IborIndex isActive() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.IborIndexRates ImmutableRatesProvider.iborIndexRates(IborIndex)"
  })
  void testIborIndexRates_givenTrue_whenIborIndexIsActiveReturnTrue() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    IborIndex index = mock(IborIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.iborIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends ImmutableRatesProvider> actualBeanTypeResult =
        ImmutableRatesProvider.meta().beanType();

    // Assert
    Class<ImmutableRatesProvider> expectedBeanTypeResult = ImmutableRatesProvider.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#discountCurves()}
   *   <li>{@link Meta#fxRateProvider()}
   *   <li>{@link Meta#indexCurves()}
   *   <li>{@link Meta#timeSeries()}
   *   <li>{@link Meta#valuationDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.discountCurves()",
    "MetaProperty Meta.fxRateProvider()",
    "MetaProperty Meta.indexCurves()",
    "MetaProperty Meta.timeSeries()",
    "MetaProperty Meta.valuationDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableRatesProvider.meta();

    // Act
    MetaProperty<ImmutableMap<Currency, Curve>> actualDiscountCurvesResult =
        metaResult.discountCurves();
    MetaProperty<FxRateProvider> actualFxRateProviderResult = metaResult.fxRateProvider();
    MetaProperty<ImmutableMap<Index, Curve>> actualIndexCurvesResult = metaResult.indexCurves();
    MetaProperty<ImmutableMap<Index, LocalDateDoubleTimeSeries>> actualTimeSeriesResult =
        metaResult.timeSeries();

    // Assert
    assertTrue(actualDiscountCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualFxRateProviderResult instanceof DirectMetaProperty);
    assertTrue(actualIndexCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualTimeSeriesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then return name is {@code discountCurves}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'discountCurves'; then return name is 'discountCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDiscountCurves_thenReturnNameIsDiscountCurves() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableRatesProvider.meta().metaPropertyGet("discountCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FxRateProvider> fxRateProviderResult = ((Meta) metaBeanResult).fxRateProvider();
    assertTrue(fxRateProviderResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, Curve>> indexCurvesResult =
        ((Meta) metaBeanResult).indexCurves();
    assertTrue(indexCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("discountCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountCurves());
    assertSame(metaBeanResult, fxRateProviderResult.metaBean());
    assertSame(metaBeanResult, indexCurvesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fxRateProvider}.
   *   <li>Then return name is {@code fxRateProvider}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fxRateProvider'; then return name is 'fxRateProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFxRateProvider_thenReturnNameIsFxRateProvider() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableRatesProvider.meta().metaPropertyGet("fxRateProvider");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Currency, Curve>> discountCurvesResult =
        ((Meta) metaBeanResult).discountCurves();
    assertTrue(discountCurvesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, Curve>> indexCurvesResult =
        ((Meta) metaBeanResult).indexCurves();
    assertTrue(indexCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("fxRateProvider", actualMetaPropertyGetResult.name());
    Class<FxRateProvider> expectedPropertyTypeResult = FxRateProvider.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fxRateProvider());
    assertSame(metaBeanResult, discountCurvesResult.metaBean());
    assertSame(metaBeanResult, indexCurvesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code indexCurves}.
   *   <li>Then return name is {@code indexCurves}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'indexCurves'; then return name is 'indexCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndexCurves_thenReturnNameIsIndexCurves() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableRatesProvider.meta().metaPropertyGet("indexCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Currency, Curve>> discountCurvesResult =
        ((Meta) metaBeanResult).discountCurves();
    assertTrue(discountCurvesResult instanceof DirectMetaProperty);
    MetaProperty<FxRateProvider> fxRateProviderResult = ((Meta) metaBeanResult).fxRateProvider();
    assertTrue(fxRateProviderResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("indexCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).indexCurves());
    assertSame(metaBeanResult, discountCurvesResult.metaBean());
    assertSame(metaBeanResult, fxRateProviderResult.metaBean());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableRatesProvider.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code timeSeries}.
   *   <li>Then return name is {@code timeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'timeSeries'; then return name is 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTimeSeries_thenReturnNameIsTimeSeries() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableRatesProvider.meta().metaPropertyGet("timeSeries");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Currency, Curve>> discountCurvesResult =
        ((Meta) metaBeanResult).discountCurves();
    assertTrue(discountCurvesResult instanceof DirectMetaProperty);
    MetaProperty<FxRateProvider> fxRateProviderResult = ((Meta) metaBeanResult).fxRateProvider();
    assertTrue(fxRateProviderResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, Curve>> indexCurvesResult =
        ((Meta) metaBeanResult).indexCurves();
    assertTrue(indexCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("timeSeries", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeSeries());
    assertSame(metaBeanResult, discountCurvesResult.metaBean());
    assertSame(metaBeanResult, fxRateProviderResult.metaBean());
    assertSame(metaBeanResult, indexCurvesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return name is {@code valuationDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDate'; then return name is 'valuationDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDate_thenReturnNameIsValuationDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableRatesProvider.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Currency, Curve>> discountCurvesResult =
        ((Meta) metaBeanResult).discountCurves();
    assertTrue(discountCurvesResult instanceof DirectMetaProperty);
    MetaProperty<FxRateProvider> fxRateProviderResult = ((Meta) metaBeanResult).fxRateProvider();
    assertTrue(fxRateProviderResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, Curve>> indexCurvesResult =
        ((Meta) metaBeanResult).indexCurves();
    assertTrue(indexCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, LocalDateDoubleTimeSeries>> timeSeriesResult =
        ((Meta) metaBeanResult).timeSeries();
    assertTrue(timeSeriesResult instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
    assertSame(metaBeanResult, discountCurvesResult.metaBean());
    assertSame(metaBeanResult, fxRateProviderResult.metaBean());
    assertSame(metaBeanResult, indexCurvesResult.metaBean());
    assertSame(metaBeanResult, timeSeriesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        ImmutableRatesProvider.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("discountCurves") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fxRateProvider") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("indexCurves") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("timeSeries") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valuationDate") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableRatesProvider.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'discountCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDiscountCurves_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableRatesProvider.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider bean =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "discountCurves", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = ImmutableRatesProvider.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider bean =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fxRateProvider}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'fxRateProvider'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFxRateProvider_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = ImmutableRatesProvider.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider bean =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    assertDoesNotThrow(() -> metaResult.propertyGet(bean, "fxRateProvider", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code indexCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'indexCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenIndexCurves_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableRatesProvider.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider bean =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "indexCurves", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeries}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'timeSeries'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTimeSeries_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableRatesProvider.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider bean =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "timeSeries", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'valuationDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = ImmutableRatesProvider.meta();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider bean =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "valuationDate", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(valuationDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'discountCurves'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDiscountCurves_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableRatesProvider.meta()
                .propertySet(mock(Bean.class), "discountCurves", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            ImmutableRatesProvider.meta()
                .propertySet(mock(Bean.class), "discountCurves", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fxRateProvider}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fxRateProvider'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFxRateProvider_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableRatesProvider.meta()
                .propertySet(mock(Bean.class), "fxRateProvider", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code indexCurves}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'indexCurves'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndexCurves_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableRatesProvider.meta()
                .propertySet(mock(Bean.class), "indexCurves", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            ImmutableRatesProvider.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeSeries}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeSeries'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeSeries_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableRatesProvider.meta()
                .propertySet(mock(Bean.class), "timeSeries", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableRatesProvider.meta()
                .propertySet(mock(Bean.class), "valuationDate", "New Value", true));
  }

  /**
   * Test {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName("Test overnightIndexRates(OvernightIndex)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.OvernightIndexRates ImmutableRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.ofEpochDay(12L);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.overnightIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link OvernightIndex} {@link OvernightIndex#isActive()} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName(
      "Test overnightIndexRates(OvernightIndex); given 'false'; when OvernightIndex isActive() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.OvernightIndexRates ImmutableRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates_givenFalse_whenOvernightIndexIsActiveReturnFalse() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.overnightIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName(
      "Test overnightIndexRates(OvernightIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.OvernightIndexRates ImmutableRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates_givenHashMapIndexIsLocalDateDoubleTimeSeries() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.overnightIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName(
      "Test overnightIndexRates(OvernightIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.OvernightIndexRates ImmutableRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates_givenHashMapIndexIsLocalDateDoubleTimeSeries2() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.overnightIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link OvernightIndex} {@link OvernightIndex#isActive()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#overnightIndexRates(OvernightIndex)}
   */
  @Test
  @DisplayName(
      "Test overnightIndexRates(OvernightIndex); given 'true'; when OvernightIndex isActive() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.OvernightIndexRates ImmutableRatesProvider.overnightIndexRates(OvernightIndex)"
  })
  void testOvernightIndexRates_givenTrue_whenOvernightIndexIsActiveReturnTrue() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    OvernightIndex index = mock(OvernightIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.overnightIndexRates(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName("Test priceIndexValues(PriceIndex)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.PriceIndexValues ImmutableRatesProvider.priceIndexValues(PriceIndex)"
  })
  void testPriceIndexValues() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.ofYearDay(12, 12);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.priceIndexValues(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>When {@link PriceIndex} {@link PriceIndex#isActive()} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName(
      "Test priceIndexValues(PriceIndex); given 'false'; when PriceIndex isActive() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.PriceIndexValues ImmutableRatesProvider.priceIndexValues(PriceIndex)"
  })
  void testPriceIndexValues_givenFalse_whenPriceIndexIsActiveReturnFalse() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.priceIndexValues(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName(
      "Test priceIndexValues(PriceIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.PriceIndexValues ImmutableRatesProvider.priceIndexValues(PriceIndex)"
  })
  void testPriceIndexValues_givenHashMapIndexIsLocalDateDoubleTimeSeries() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.priceIndexValues(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Index} is {@link LocalDateDoubleTimeSeries}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName(
      "Test priceIndexValues(PriceIndex); given HashMap() Index is LocalDateDoubleTimeSeries")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.PriceIndexValues ImmutableRatesProvider.priceIndexValues(PriceIndex)"
  })
  void testPriceIndexValues_givenHashMapIndexIsLocalDateDoubleTimeSeries2() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.priceIndexValues(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName("Test priceIndexValues(PriceIndex); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.PriceIndexValues ImmutableRatesProvider.priceIndexValues(PriceIndex)"
  })
  void testPriceIndexValues_givenIllegalArgumentException() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.priceIndexValues(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link PriceIndex} {@link PriceIndex#isActive()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#priceIndexValues(PriceIndex)}
   */
  @Test
  @DisplayName(
      "Test priceIndexValues(PriceIndex); given 'true'; when PriceIndex isActive() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.rate.PriceIndexValues ImmutableRatesProvider.priceIndexValues(PriceIndex)"
  })
  void testPriceIndexValues_givenTrue_whenPriceIndexIsActiveReturnTrue() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    PriceIndex index = mock(PriceIndex.class);
    when(index.isActive()).thenReturn(true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> immutableRatesProvider.priceIndexValues(index));
    verify(index).isActive();
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName("Test combinedWith(ImmutableRatesProvider, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    MockRatesProvider fxRateProvider2 = new MockRatesProvider();
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, indexCurves, new HashMap<>());

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    ImmutableSet<IborIndex> iborIndices = actualCombinedWithResult.getIborIndices();
    assertSame(iborIndices, actualCombinedWithResult.getOvernightIndices());
    assertSame(iborIndices, actualCombinedWithResult.getPriceIndices());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); given Index; then return TimeSeriesIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_givenIndex_thenReturnTimeSeriesIndicesSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, new HashMap<>(), timeSeries);

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    assertEquals(1, actualCombinedWithResult.getTimeSeriesIndices().size());
    assertEquals(1, actualCombinedWithResult.getTimeSeries().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); given Index; then return TimeSeriesIndices size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_givenIndex_thenReturnTimeSeriesIndicesSizeIsThree() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries2 = new HashMap<>();
    timeSeries2.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries2.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, new HashMap<>(), timeSeries2);

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    assertEquals(3, actualCombinedWithResult.getTimeSeriesIndices().size());
    assertEquals(3, actualCombinedWithResult.getTimeSeries().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); given Index; then return TimeSeriesIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_givenIndex_thenReturnTimeSeriesIndicesSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, new HashMap<>(), timeSeries);

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    assertEquals(2, actualCombinedWithResult.getTimeSeriesIndices().size());
    assertEquals(2, actualCombinedWithResult.getTimeSeries().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); given Index; then return TimeSeriesIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_givenIndex_thenReturnTimeSeriesIndicesSizeIsTwo2() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries2 = new HashMap<>();
    timeSeries2.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, new HashMap<>(), timeSeries2);

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    assertEquals(2, actualCombinedWithResult.getTimeSeriesIndices().size());
    assertEquals(2, actualCombinedWithResult.getTimeSeries().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return OvernightIndices is IborIndices.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); then return OvernightIndices is IborIndices")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_thenReturnOvernightIndicesIsIborIndices() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves2 = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, indexCurves2, new HashMap<>());

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    ImmutableSet<IborIndex> iborIndices = actualCombinedWithResult.getIborIndices();
    assertSame(iborIndices, actualCombinedWithResult.getOvernightIndices());
    assertSame(iborIndices, actualCombinedWithResult.getPriceIndices());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); then return TimeSeriesIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_thenReturnTimeSeriesIndicesSizeIsOne() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, indexCurves, new HashMap<>());

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    assertEquals(1, actualCombinedWithResult.getTimeSeriesIndices().size());
    assertEquals(1, actualCombinedWithResult.getTimeSeries().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIndices size is three.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); then return TimeSeriesIndices size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_thenReturnTimeSeriesIndicesSizeIsThree() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, indexCurves, new HashMap<>());

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    assertEquals(3, actualCombinedWithResult.getTimeSeriesIndices().size());
    assertEquals(3, actualCombinedWithResult.getTimeSeries().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return TimeSeriesIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#combinedWith(ImmutableRatesProvider,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(ImmutableRatesProvider, FxRateProvider); then return TimeSeriesIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProvider ImmutableRatesProvider.combinedWith(ImmutableRatesProvider, FxRateProvider)"
  })
  void testCombinedWith_thenReturnTimeSeriesIndicesSizeIsTwo() {
    // Arrange
    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, new HashMap<>(), timeSeries);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider other =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, indexCurves, new HashMap<>());

    // Act
    ImmutableRatesProvider actualCombinedWithResult =
        immutableRatesProvider.combinedWith(other, mock(FxRateProvider.class));

    // Assert
    assertEquals(2, actualCombinedWithResult.getTimeSeriesIndices().size());
    assertEquals(2, actualCombinedWithResult.getTimeSeries().size());
  }

  /**
   * Test {@link ImmutableRatesProvider#toImmutableRatesProvider()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#toImmutableRatesProvider()}
   */
  @Test
  @DisplayName("Test toImmutableRatesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableRatesProvider ImmutableRatesProvider.toImmutableRatesProvider()"})
  void testToImmutableRatesProvider() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    ImmutableRatesProvider actualToImmutableRatesProviderResult =
        immutableRatesProvider.toImmutableRatesProvider();

    // Assert
    assertSame(immutableRatesProvider, actualToImmutableRatesProviderResult);
  }

  /**
   * Test {@link ImmutableRatesProvider#getCurves()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getCurves()}
   */
  @Test
  @DisplayName("Test getCurves()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ImmutableRatesProvider.getCurves()"})
  void testGetCurves() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertTrue(immutableRatesProvider.getCurves().isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#getCurves(CurveGroupName)} with {@code CurveGroupName}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#getCurves(CurveGroupName)}
   */
  @Test
  @DisplayName("Test getCurves(CurveGroupName) with 'CurveGroupName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ImmutableRatesProvider.getCurves(CurveGroupName)"})
  void testGetCurvesWithCurveGroupName() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    Map<CurveId, Curve> actualCurves = immutableRatesProvider.getCurves(CurveGroupName.of("Name"));

    // Assert
    assertTrue(actualCurves.isEmpty());
  }

  /**
   * Test {@link ImmutableRatesProvider#meta()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableRatesProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableRatesProvider.meta();

    // Assert
    assertTrue(actualMetaResult.discountCurves() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fxRateProvider() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.indexCurves() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeSeries() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valuationDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ImmutableRatesProvider#ImmutableRatesProvider(LocalDate, FxRateProvider, Map, Map,
   * Map)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#ImmutableRatesProvider(LocalDate,
   * FxRateProvider, Map, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableRatesProvider(LocalDate, FxRateProvider, Map, Map, Map); given Index; then return TimeSeriesIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableRatesProvider.<init>(LocalDate, FxRateProvider, Map, Map, Map)"
  })
  void testNewImmutableRatesProvider_givenIndex_thenReturnTimeSeriesIndicesSizeIsOne() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableRatesProvider actualImmutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, timeSeries);

    // Assert
    assertEquals(1, actualImmutableRatesProvider.getTimeSeriesIndices().size());
    ImmutableMap<Currency, Curve> discountCurves2 =
        actualImmutableRatesProvider.getDiscountCurves();
    assertEquals(discountCurves, discountCurves2);
    assertEquals(timeSeries, actualImmutableRatesProvider.getTimeSeries());
    assertSame(discountCurves2, actualImmutableRatesProvider.getIndexCurves());
    ImmutableSet<IborIndex> iborIndices = actualImmutableRatesProvider.getIborIndices();
    assertSame(iborIndices, actualImmutableRatesProvider.getOvernightIndices());
    assertSame(iborIndices, actualImmutableRatesProvider.getPriceIndices());
  }

  /**
   * Test {@link ImmutableRatesProvider#ImmutableRatesProvider(LocalDate, FxRateProvider, Map, Map,
   * Map)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return TimeSeriesIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#ImmutableRatesProvider(LocalDate,
   * FxRateProvider, Map, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableRatesProvider(LocalDate, FxRateProvider, Map, Map, Map); given Index; then return TimeSeriesIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableRatesProvider.<init>(LocalDate, FxRateProvider, Map, Map, Map)"
  })
  void testNewImmutableRatesProvider_givenIndex_thenReturnTimeSeriesIndicesSizeIsTwo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));

    // Act
    ImmutableRatesProvider actualImmutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, timeSeries);

    // Assert
    assertEquals(2, actualImmutableRatesProvider.getTimeSeriesIndices().size());
    ImmutableMap<Currency, Curve> discountCurves2 =
        actualImmutableRatesProvider.getDiscountCurves();
    assertEquals(discountCurves, discountCurves2);
    assertEquals(timeSeries, actualImmutableRatesProvider.getTimeSeries());
    assertSame(discountCurves2, actualImmutableRatesProvider.getIndexCurves());
    ImmutableSet<IborIndex> iborIndices = actualImmutableRatesProvider.getIborIndices();
    assertSame(iborIndices, actualImmutableRatesProvider.getOvernightIndices());
    assertSame(iborIndices, actualImmutableRatesProvider.getPriceIndices());
  }

  /**
   * Test {@link ImmutableRatesProvider#ImmutableRatesProvider(LocalDate, FxRateProvider, Map, Map,
   * Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return TimeSeries is DiscountCurves.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#ImmutableRatesProvider(LocalDate,
   * FxRateProvider, Map, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableRatesProvider(LocalDate, FxRateProvider, Map, Map, Map); when HashMap(); then return TimeSeries is DiscountCurves")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableRatesProvider.<init>(LocalDate, FxRateProvider, Map, Map, Map)"
  })
  void testNewImmutableRatesProvider_whenHashMap_thenReturnTimeSeriesIsDiscountCurves() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    // Act
    ImmutableRatesProvider actualImmutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Assert
    ImmutableMap<Currency, Curve> discountCurves2 =
        actualImmutableRatesProvider.getDiscountCurves();
    assertEquals(discountCurves, discountCurves2);
    assertSame(discountCurves2, actualImmutableRatesProvider.getIndexCurves());
    assertSame(discountCurves2, actualImmutableRatesProvider.getTimeSeries());
    ImmutableSet<IborIndex> iborIndices = actualImmutableRatesProvider.getIborIndices();
    assertSame(iborIndices, actualImmutableRatesProvider.getOvernightIndices());
    assertSame(iborIndices, actualImmutableRatesProvider.getPriceIndices());
  }

  /**
   * Test {@link ImmutableRatesProvider#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableRatesProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableRatesProvider.metaBean()"})
  void testMetaBean() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, immutableRatesProvider.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableRatesProvider#toString()}
   *   <li>{@link ImmutableRatesProvider#getDiscountCurves()}
   *   <li>{@link ImmutableRatesProvider#getFxRateProvider()}
   *   <li>{@link ImmutableRatesProvider#getIndexCurves()}
   *   <li>{@link ImmutableRatesProvider#getTimeSeries()}
   *   <li>{@link ImmutableRatesProvider#getValuationDate()}
   *   <li>{@link ImmutableRatesProvider#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap ImmutableRatesProvider.getDiscountCurves()",
    "FxRateProvider ImmutableRatesProvider.getFxRateProvider()",
    "ImmutableMap ImmutableRatesProvider.getIndexCurves()",
    "ImmutableMap ImmutableRatesProvider.getTimeSeries()",
    "LocalDate ImmutableRatesProvider.getValuationDate()",
    "ImmutableRatesProviderBuilder ImmutableRatesProvider.toBuilder()",
    "String ImmutableRatesProvider.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    immutableRatesProvider.toString();
    ImmutableMap<Currency, Curve> actualDiscountCurves = immutableRatesProvider.getDiscountCurves();
    immutableRatesProvider.getFxRateProvider();
    ImmutableMap<Index, Curve> actualIndexCurves = immutableRatesProvider.getIndexCurves();
    ImmutableMap<Index, LocalDateDoubleTimeSeries> actualTimeSeries =
        immutableRatesProvider.getTimeSeries();
    LocalDate actualValuationDate = immutableRatesProvider.getValuationDate();
    immutableRatesProvider.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(actualDiscountCurves, actualIndexCurves);
    assertSame(actualDiscountCurves, actualTimeSeries);
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ImmutableRatesProvider#equals(Object)}, and {@link
   * ImmutableRatesProvider#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableRatesProvider#equals(Object)}
   *   <li>{@link ImmutableRatesProvider#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRatesProvider.equals(Object)",
    "int ImmutableRatesProvider.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act and Assert
    assertEquals(immutableRatesProvider, immutableRatesProvider);
    int expectedHashCodeResult = immutableRatesProvider.hashCode();
    assertEquals(expectedHashCodeResult, immutableRatesProvider.hashCode());
  }

  /**
   * Test {@link ImmutableRatesProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRatesProvider.equals(Object)",
    "int ImmutableRatesProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        immutableRatesProvider,
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, indexCurves2, new HashMap<>()));
  }

  /**
   * Test {@link ImmutableRatesProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRatesProvider.equals(Object)",
    "int ImmutableRatesProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LocalDate valuationDate = LocalDate.now();
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider2 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        immutableRatesProvider,
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider2, discountCurves2, indexCurves2, new HashMap<>()));
  }

  /**
   * Test {@link ImmutableRatesProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRatesProvider.equals(Object)",
    "int ImmutableRatesProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider fxRateProvider2 =
        new ImmutableRatesProvider(
            valuationDate2, fxRateProvider, discountCurves, indexCurves, new HashMap<>());
    HashMap<Currency, Curve> discountCurves2 = new HashMap<>();
    HashMap<Index, Curve> indexCurves2 = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider2, discountCurves2, indexCurves2, new HashMap<>());
    LocalDate valuationDate3 = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider3 = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves3 = new HashMap<>();
    HashMap<Index, Curve> indexCurves3 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        immutableRatesProvider,
        new ImmutableRatesProvider(
            valuationDate3, fxRateProvider3, discountCurves3, indexCurves3, new HashMap<>()));
  }

  /**
   * Test {@link ImmutableRatesProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRatesProvider.equals(Object)",
    "int ImmutableRatesProvider.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>()),
        null);
  }

  /**
   * Test {@link ImmutableRatesProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableRatesProvider.equals(Object)",
    "int ImmutableRatesProvider.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>()),
        "Different type to ImmutableRatesProvider");
  }
}
