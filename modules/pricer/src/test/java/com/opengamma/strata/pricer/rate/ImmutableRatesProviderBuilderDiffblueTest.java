package com.opengamma.strata.pricer.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxMatrix;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.basics.index.PriceIndex;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.pricer.rate.ImmutableRatesProviderParameterSensitivityTest.ConstantDiscountFactorCurve;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableRatesProviderBuilderDiffblueTest {
  /**
   * Test {@link ImmutableRatesProviderBuilder#ImmutableRatesProviderBuilder(LocalDate)}.
   *
   * <ul>
   *   <li>Then build FxRateProvider return {@link FxMatrix}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImmutableRatesProviderBuilder#ImmutableRatesProviderBuilder(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableRatesProviderBuilder(LocalDate); then build FxRateProvider return FxMatrix")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableRatesProviderBuilder.<init>(LocalDate)"})
  void testNewImmutableRatesProviderBuilder_thenBuildFxRateProviderReturnFxMatrix() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProviderBuilder(valuationDate).build();
    FxRateProvider fxRateProvider = immutableRatesProvider.getFxRateProvider();
    assertTrue(fxRateProvider instanceof FxMatrix);
    ImmutableMap<Currency, Curve> discountCurves = immutableRatesProvider.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    ImmutableSet<Currency> discountCurrencies = immutableRatesProvider.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    ImmutableSet<IborIndex> iborIndices = immutableRatesProvider.getIborIndices();
    assertTrue(iborIndices.isEmpty());
    assertTrue(immutableRatesProvider.getCurves().isEmpty());
    assertSame(valuationDate, immutableRatesProvider.getValuationDate());
    assertSame(discountCurves, immutableRatesProvider.getIndexCurves());
    assertSame(discountCurves, immutableRatesProvider.getTimeSeries());
    assertSame(discountCurrencies, ((FxMatrix) fxRateProvider).getCurrencies());
    assertSame(discountCurrencies, immutableRatesProvider.getTimeSeriesIndices());
    assertSame(iborIndices, immutableRatesProvider.getOvernightIndices());
    assertSame(iborIndices, immutableRatesProvider.getPriceIndices());
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#fxRateProvider(FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#fxRateProvider(FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test fxRateProvider(FxRateProvider); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.fxRateProvider(FxRateProvider)"
  })
  void testFxRateProvider_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);

    // Act
    ImmutableRatesProviderBuilder actualFxRateProviderResult =
        builderResult.fxRateProvider(fxRateProvider);

    // Assert
    assertSame(builderResult, actualFxRateProviderResult);
    assertSame(fxRateProvider, builderResult.build().getFxRateProvider());
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#discountCurves(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#discountCurves(Map)}
   */
  @Test
  @DisplayName(
      "Test discountCurves(Map); when HashMap(); then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.discountCurves(Map)"
  })
  void testDiscountCurves_whenHashMap_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableRatesProviderBuilder actualDiscountCurvesResult =
        builderResult.discountCurves(new HashMap<>());

    // Assert
    assertSame(builderResult, actualDiscountCurvesResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#iborIndexCurve(IborIndex, Curve)} with {@code index},
   * {@code forwardCurve}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#iborIndexCurve(IborIndex, Curve)}
   */
  @Test
  @DisplayName("Test iborIndexCurve(IborIndex, Curve) with 'index', 'forwardCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.iborIndexCurve(IborIndex, Curve)"
  })
  void testIborIndexCurveWithIndexForwardCurve() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    IborIndex index = mock(IborIndex.class);

    // Act
    ImmutableRatesProviderBuilder actualIborIndexCurveResult =
        builderResult.iborIndexCurve(index, new ConstantDiscountFactorCurve("Name", 10.0d));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getIborIndices().size());
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertSame(builderResult, actualIborIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#iborIndexCurve(IborIndex, Curve,
   * LocalDateDoubleTimeSeries)} with {@code index}, {@code forwardCurve}, {@code timeSeries}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#iborIndexCurve(IborIndex, Curve,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test iborIndexCurve(IborIndex, Curve, LocalDateDoubleTimeSeries) with 'index', 'forwardCurve', 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.iborIndexCurve(IborIndex, Curve, LocalDateDoubleTimeSeries)"
  })
  void testIborIndexCurveWithIndexForwardCurveTimeSeries() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    IborIndex index = mock(IborIndex.class);

    // Act
    ImmutableRatesProviderBuilder actualIborIndexCurveResult =
        builderResult.iborIndexCurve(
            index,
            new ConstantDiscountFactorCurve("Name", 10.0d),
            mock(LocalDateDoubleTimeSeries.class));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getIborIndices().size());
    assertEquals(1, immutableRatesProvider.getTimeSeriesIndices().size());
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertEquals(1, immutableRatesProvider.getTimeSeries().size());
    assertSame(builderResult, actualIborIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#overnightIndexCurve(OvernightIndex, Curve)} with
   * {@code index}, {@code forwardCurve}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#overnightIndexCurve(OvernightIndex,
   * Curve)}
   */
  @Test
  @DisplayName("Test overnightIndexCurve(OvernightIndex, Curve) with 'index', 'forwardCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.overnightIndexCurve(OvernightIndex, Curve)"
  })
  void testOvernightIndexCurveWithIndexForwardCurve() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    OvernightIndex index = mock(OvernightIndex.class);

    // Act
    ImmutableRatesProviderBuilder actualOvernightIndexCurveResult =
        builderResult.overnightIndexCurve(index, new ConstantDiscountFactorCurve("Name", 10.0d));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getOvernightIndices().size());
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertSame(builderResult, actualOvernightIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#overnightIndexCurve(OvernightIndex, Curve,
   * LocalDateDoubleTimeSeries)} with {@code index}, {@code forwardCurve}, {@code timeSeries}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#overnightIndexCurve(OvernightIndex,
   * Curve, LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test overnightIndexCurve(OvernightIndex, Curve, LocalDateDoubleTimeSeries) with 'index', 'forwardCurve', 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.overnightIndexCurve(OvernightIndex, Curve, LocalDateDoubleTimeSeries)"
  })
  void testOvernightIndexCurveWithIndexForwardCurveTimeSeries() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    OvernightIndex index = mock(OvernightIndex.class);

    // Act
    ImmutableRatesProviderBuilder actualOvernightIndexCurveResult =
        builderResult.overnightIndexCurve(
            index,
            new ConstantDiscountFactorCurve("Name", 10.0d),
            mock(LocalDateDoubleTimeSeries.class));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getOvernightIndices().size());
    assertEquals(1, immutableRatesProvider.getTimeSeriesIndices().size());
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertEquals(1, immutableRatesProvider.getTimeSeries().size());
    assertSame(builderResult, actualOvernightIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#priceIndexCurve(PriceIndex, Curve)} with {@code
   * index}, {@code forwardCurve}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#priceIndexCurve(PriceIndex, Curve)}
   */
  @Test
  @DisplayName("Test priceIndexCurve(PriceIndex, Curve) with 'index', 'forwardCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.priceIndexCurve(PriceIndex, Curve)"
  })
  void testPriceIndexCurveWithIndexForwardCurve() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    PriceIndex index = mock(PriceIndex.class);

    // Act
    ImmutableRatesProviderBuilder actualPriceIndexCurveResult =
        builderResult.priceIndexCurve(index, new ConstantDiscountFactorCurve("Name", 10.0d));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getPriceIndices().size());
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertSame(builderResult, actualPriceIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#priceIndexCurve(PriceIndex, Curve,
   * LocalDateDoubleTimeSeries)} with {@code index}, {@code forwardCurve}, {@code timeSeries}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#priceIndexCurve(PriceIndex, Curve,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test priceIndexCurve(PriceIndex, Curve, LocalDateDoubleTimeSeries) with 'index', 'forwardCurve', 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.priceIndexCurve(PriceIndex, Curve, LocalDateDoubleTimeSeries)"
  })
  void testPriceIndexCurveWithIndexForwardCurveTimeSeries() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    PriceIndex index = mock(PriceIndex.class);

    // Act
    ImmutableRatesProviderBuilder actualPriceIndexCurveResult =
        builderResult.priceIndexCurve(
            index,
            new ConstantDiscountFactorCurve("Name", 10.0d),
            mock(LocalDateDoubleTimeSeries.class));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getPriceIndices().size());
    assertEquals(1, immutableRatesProvider.getTimeSeriesIndices().size());
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertEquals(1, immutableRatesProvider.getTimeSeries().size());
    assertSame(builderResult, actualPriceIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#indexCurve(Index, Curve)} with {@code index}, {@code
   * forwardCurve}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#indexCurve(Index, Curve)}
   */
  @Test
  @DisplayName("Test indexCurve(Index, Curve) with 'index', 'forwardCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.indexCurve(Index, Curve)"
  })
  void testIndexCurveWithIndexForwardCurve() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    Index index = mock(Index.class);

    // Act
    ImmutableRatesProviderBuilder actualIndexCurveResult =
        builderResult.indexCurve(index, new ConstantDiscountFactorCurve("Name", 10.0d));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertSame(builderResult, actualIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#indexCurve(Index, Curve, LocalDateDoubleTimeSeries)}
   * with {@code index}, {@code forwardCurve}, {@code timeSeries}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#indexCurve(Index, Curve,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName(
      "Test indexCurve(Index, Curve, LocalDateDoubleTimeSeries) with 'index', 'forwardCurve', 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.indexCurve(Index, Curve, LocalDateDoubleTimeSeries)"
  })
  void testIndexCurveWithIndexForwardCurveTimeSeries() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    Index index = mock(Index.class);

    // Act
    ImmutableRatesProviderBuilder actualIndexCurveResult =
        builderResult.indexCurve(
            index,
            new ConstantDiscountFactorCurve("Name", 10.0d),
            mock(LocalDateDoubleTimeSeries.class));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getTimeSeriesIndices().size());
    assertEquals(1, immutableRatesProvider.getCurves().size());
    assertEquals(1, immutableRatesProvider.getIndexCurves().size());
    assertEquals(1, immutableRatesProvider.getTimeSeries().size());
    assertSame(builderResult, actualIndexCurveResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#indexCurves(Map, Map)} with {@code indexCurves},
   * {@code timeSeries}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#indexCurves(Map, Map)}
   */
  @Test
  @DisplayName("Test indexCurves(Map, Map) with 'indexCurves', 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.indexCurves(Map, Map)"
  })
  void testIndexCurvesWithIndexCurvesTimeSeries() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    // Act
    ImmutableRatesProviderBuilder actualIndexCurvesResult =
        builderResult.indexCurves(indexCurves, new HashMap<>());

    // Assert
    assertSame(builderResult, actualIndexCurvesResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#indexCurves(Map)} with {@code indexCurves}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#indexCurves(Map)}
   */
  @Test
  @DisplayName(
      "Test indexCurves(Map) with 'indexCurves'; then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.indexCurves(Map)"
  })
  void testIndexCurvesWithIndexCurves_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableRatesProviderBuilder actualIndexCurvesResult =
        builderResult.indexCurves(new HashMap<>());

    // Assert
    assertSame(builderResult, actualIndexCurvesResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#timeSeries(Index, LocalDateDoubleTimeSeries)} with
   * {@code index}, {@code timeSeries}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#timeSeries(Index,
   * LocalDateDoubleTimeSeries)}
   */
  @Test
  @DisplayName("Test timeSeries(Index, LocalDateDoubleTimeSeries) with 'index', 'timeSeries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.timeSeries(Index, LocalDateDoubleTimeSeries)"
  })
  void testTimeSeriesWithIndexTimeSeries() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableRatesProviderBuilder actualTimeSeriesResult =
        builderResult.timeSeries(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));

    // Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.build();
    assertEquals(1, immutableRatesProvider.getTimeSeriesIndices().size());
    assertEquals(1, immutableRatesProvider.getTimeSeries().size());
    assertSame(builderResult, actualTimeSeriesResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#timeSeries(Map)} with {@code timeSeries}.
   *
   * <ul>
   *   <li>Then return build TimeSeriesIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#timeSeries(Map)}
   */
  @Test
  @DisplayName(
      "Test timeSeries(Map) with 'timeSeries'; then return build TimeSeriesIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.timeSeries(Map)"})
  void testTimeSeriesWithTimeSeries_thenReturnBuildTimeSeriesIndicesSizeIsOne() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));

    HashMap<Index, LocalDateDoubleTimeSeries> timeSeries = new HashMap<>();
    timeSeries.put(mock(Index.class), mock(LocalDateDoubleTimeSeries.class));

    // Act and Assert
    ImmutableRatesProvider immutableRatesProvider = builderResult.timeSeries(timeSeries).build();
    assertEquals(1, immutableRatesProvider.getTimeSeriesIndices().size());
    ImmutableRatesProvider immutableRatesProvider2 = builderResult.build();
    assertEquals(1, immutableRatesProvider2.getTimeSeriesIndices().size());
    assertEquals(timeSeries, immutableRatesProvider.getTimeSeries());
    assertEquals(timeSeries, immutableRatesProvider2.getTimeSeries());
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#timeSeries(Map)} with {@code timeSeries}.
   *
   * <ul>
   *   <li>Then return builder {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#timeSeries(Map)}
   */
  @Test
  @DisplayName(
      "Test timeSeries(Map) with 'timeSeries'; then return builder LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableRatesProviderBuilder ImmutableRatesProviderBuilder.timeSeries(Map)"})
  void testTimeSeriesWithTimeSeries_thenReturnBuilderLocalDateWith1970AndOneAndOne() {
    // Arrange
    ImmutableRatesProviderBuilder builderResult =
        ImmutableRatesProvider.builder(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableRatesProviderBuilder actualTimeSeriesResult =
        builderResult.timeSeries(new HashMap<>());

    // Assert
    assertSame(builderResult, actualTimeSeriesResult);
  }

  /**
   * Test {@link ImmutableRatesProviderBuilder#build()}.
   *
   * <p>Method under test: {@link ImmutableRatesProviderBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableRatesProvider ImmutableRatesProviderBuilder.build()"})
  void testBuild() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);

    // Act
    ImmutableRatesProvider actualImmutableRatesProvider =
        ImmutableRatesProvider.builder(valuationDate).fxRateProvider(fxRateProvider).build();

    // Assert
    LocalDate valuationDate2 = actualImmutableRatesProvider.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertTrue(actualImmutableRatesProvider.getCurves().isEmpty());
    assertSame(valuationDate, valuationDate2);
    assertSame(fxRateProvider, actualImmutableRatesProvider.getFxRateProvider());
    assertSame(
        actualImmutableRatesProvider.getDiscountCurves(),
        actualImmutableRatesProvider.getIndexCurves());
    assertSame(
        actualImmutableRatesProvider.getDiscountCurves(),
        actualImmutableRatesProvider.getTimeSeries());
    assertSame(
        actualImmutableRatesProvider.getDiscountCurrencies(),
        actualImmutableRatesProvider.getTimeSeriesIndices());
    assertSame(
        actualImmutableRatesProvider.getIborIndices(),
        actualImmutableRatesProvider.getOvernightIndices());
    assertSame(
        actualImmutableRatesProvider.getIborIndices(),
        actualImmutableRatesProvider.getPriceIndices());
  }
}
