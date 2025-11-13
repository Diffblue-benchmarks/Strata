package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxMatrix;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.data.FxMatrixId;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataFxRateProvider;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxRateLookupDiffblueTest {
  /**
   * Test {@link FxRateLookup#ofRates(ObservableSource)} with {@code observableSource}.
   *
   * <ul>
   *   <li>Then return {@link DefaultFxRateLookup}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateLookup#ofRates(ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test ofRates(ObservableSource) with 'observableSource'; then return DefaultFxRateLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofRates(ObservableSource)"})
  void testOfRatesWithObservableSource_thenReturnDefaultFxRateLookup() {
    // Arrange
    ObservableSource observableSource = ObservableSource.of("Name");

    // Act
    FxRateLookup actualOfRatesResult = FxRateLookup.ofRates(observableSource);
    MarketData marketData = mock(MarketData.class);
    FxRateProvider actualFxRateProviderResult = actualOfRatesResult.fxRateProvider(marketData);

    // Assert
    assertTrue(actualOfRatesResult instanceof DefaultFxRateLookup);
    assertTrue(actualFxRateProviderResult instanceof MarketDataFxRateProvider);
    Optional<Currency> currency = ((DefaultFxRateLookup) actualOfRatesResult).getCurrency();
    assertFalse(currency.isPresent());
    assertSame(
        currency,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getTriangulationCurrency());
    assertSame(observableSource, ((DefaultFxRateLookup) actualOfRatesResult).getObservableSource());
    assertSame(
        observableSource,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getFxRatesSource());
    assertSame(marketData, ((MarketDataFxRateProvider) actualFxRateProviderResult).getMarketData());
  }

  /**
   * Test {@link FxRateLookup#ofRates(Currency, ObservableSource)} with {@code
   * triangulationCurrency}, {@code observableSource}.
   *
   * <p>Method under test: {@link FxRateLookup#ofRates(Currency, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test ofRates(Currency, ObservableSource) with 'triangulationCurrency', 'observableSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofRates(Currency, ObservableSource)"})
  void testOfRatesWithTriangulationCurrencyObservableSource() {
    // Arrange
    ObservableSource observableSource = ObservableSource.of("Name");

    // Act
    FxRateLookup actualOfRatesResult = FxRateLookup.ofRates(null, observableSource);
    MarketData marketData = mock(MarketData.class);
    FxRateProvider actualFxRateProviderResult = actualOfRatesResult.fxRateProvider(marketData);

    // Assert
    assertTrue(actualOfRatesResult instanceof DefaultFxRateLookup);
    assertTrue(actualFxRateProviderResult instanceof MarketDataFxRateProvider);
    Optional<Currency> currency = ((DefaultFxRateLookup) actualOfRatesResult).getCurrency();
    assertFalse(currency.isPresent());
    assertSame(
        currency,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getTriangulationCurrency());
    assertSame(observableSource, ((DefaultFxRateLookup) actualOfRatesResult).getObservableSource());
    assertSame(
        observableSource,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getFxRatesSource());
    assertSame(marketData, ((MarketDataFxRateProvider) actualFxRateProviderResult).getMarketData());
  }

  /**
   * Test {@link FxRateLookup#ofRates(Currency)} with {@code triangulationCurrency}.
   *
   * <ul>
   *   <li>Then return {@link DefaultFxRateLookup}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateLookup#ofRates(Currency)}
   */
  @Test
  @DisplayName(
      "Test ofRates(Currency) with 'triangulationCurrency'; then return DefaultFxRateLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofRates(Currency)"})
  void testOfRatesWithTriangulationCurrency_thenReturnDefaultFxRateLookup() {
    // Arrange and Act
    FxRateLookup actualOfRatesResult = FxRateLookup.ofRates((Currency) null);
    MarketData marketData = mock(MarketData.class);
    FxRateProvider actualFxRateProviderResult = actualOfRatesResult.fxRateProvider(marketData);

    // Assert
    assertTrue(actualOfRatesResult instanceof DefaultFxRateLookup);
    assertTrue(actualFxRateProviderResult instanceof MarketDataFxRateProvider);
    ObservableSource observableSource =
        ((DefaultFxRateLookup) actualOfRatesResult).getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Optional<Currency> currency = ((DefaultFxRateLookup) actualOfRatesResult).getCurrency();
    assertFalse(currency.isPresent());
    assertSame(
        currency,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getTriangulationCurrency());
    assertSame(
        observableSource,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getFxRatesSource());
    assertSame(marketData, ((MarketDataFxRateProvider) actualFxRateProviderResult).getMarketData());
  }

  /**
   * Test {@link FxRateLookup#ofRates()}.
   *
   * <ul>
   *   <li>Then return {@link DefaultFxRateLookup}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateLookup#ofRates()}
   */
  @Test
  @DisplayName("Test ofRates(); then return DefaultFxRateLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofRates()"})
  void testOfRates_thenReturnDefaultFxRateLookup() {
    // Arrange and Act
    FxRateLookup actualOfRatesResult = FxRateLookup.ofRates();
    MarketData marketData = mock(MarketData.class);
    FxRateProvider actualFxRateProviderResult = actualOfRatesResult.fxRateProvider(marketData);

    // Assert
    assertTrue(actualOfRatesResult instanceof DefaultFxRateLookup);
    assertTrue(actualFxRateProviderResult instanceof MarketDataFxRateProvider);
    ObservableSource observableSource =
        ((DefaultFxRateLookup) actualOfRatesResult).getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Optional<Currency> currency = ((DefaultFxRateLookup) actualOfRatesResult).getCurrency();
    assertFalse(currency.isPresent());
    assertSame(
        currency,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getTriangulationCurrency());
    assertSame(
        observableSource,
        ((MarketDataFxRateProvider) actualFxRateProviderResult).getFxRatesSource());
    assertSame(marketData, ((MarketDataFxRateProvider) actualFxRateProviderResult).getMarketData());
  }

  /**
   * Test {@link FxRateLookup#ofMatrix()}.
   *
   * <p>Method under test: {@link FxRateLookup#ofMatrix()}
   */
  @Test
  @DisplayName("Test ofMatrix()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofMatrix()"})
  void testOfMatrix() {
    // Arrange and Act
    FxRateLookup actualOfMatrixResult = FxRateLookup.ofMatrix();

    // Assert
    assertTrue(actualOfMatrixResult instanceof MatrixFxRateLookup);
    FxMatrixId matrixId = ((MatrixFxRateLookup) actualOfMatrixResult).getMatrixId();
    ObservableSource observableSource = matrixId.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<FxMatrix> expectedMarketDataType = FxMatrix.class;
    assertEquals(expectedMarketDataType, matrixId.getMarketDataType());
  }

  /**
   * Test {@link FxRateLookup#ofMatrix(FxMatrixId)} with {@code FxMatrixId}.
   *
   * <ul>
   *   <li>Then return fxRateProvider {@link MarketData} is empty.
   * </ul>
   *
   * <p>Method under test: {@link FxRateLookup#ofMatrix(FxMatrixId)}
   */
  @Test
  @DisplayName(
      "Test ofMatrix(FxMatrixId) with 'FxMatrixId'; then return fxRateProvider MarketData is empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofMatrix(FxMatrixId)"})
  void testOfMatrixWithFxMatrixId_thenReturnFxRateProviderMarketDataIsEmpty() {
    // Arrange
    FxMatrixId matrixId = FxMatrixId.standard();

    // Act
    FxRateLookup actualOfMatrixResult = FxRateLookup.ofMatrix(matrixId);
    MarketData marketData = mock(MarketData.class);
    FxMatrix emptyResult = FxMatrix.empty();
    when(marketData.getValue(Mockito.<MarketDataId<FxMatrix>>any())).thenReturn(emptyResult);
    FxRateProvider actualFxRateProviderResult = actualOfMatrixResult.fxRateProvider(marketData);

    // Assert
    verify(marketData).getValue(isA(MarketDataId.class));
    assertTrue(actualOfMatrixResult instanceof MatrixFxRateLookup);
    Class<FxMatrix> expectedMarketDataType = FxMatrix.class;
    assertEquals(expectedMarketDataType, matrixId.getMarketDataType());
    assertSame(emptyResult, actualFxRateProviderResult);
    assertSame(matrixId, ((MatrixFxRateLookup) actualOfMatrixResult).getMatrixId());
  }

  /**
   * Test {@link FxRateLookup#ofMatrix(FxMatrixId)} with {@code FxMatrixId}.
   *
   * <ul>
   *   <li>When standard.
   *   <li>Then return {@link MatrixFxRateLookup}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateLookup#ofMatrix(FxMatrixId)}
   */
  @Test
  @DisplayName(
      "Test ofMatrix(FxMatrixId) with 'FxMatrixId'; when standard; then return MatrixFxRateLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofMatrix(FxMatrixId)"})
  void testOfMatrixWithFxMatrixId_whenStandard_thenReturnMatrixFxRateLookup() {
    // Arrange
    FxMatrixId matrixId = FxMatrixId.standard();

    // Act
    FxRateLookup actualOfMatrixResult = FxRateLookup.ofMatrix(matrixId);

    // Assert
    assertTrue(actualOfMatrixResult instanceof MatrixFxRateLookup);
    Class<FxMatrix> expectedMarketDataType = FxMatrix.class;
    assertEquals(expectedMarketDataType, matrixId.getMarketDataType());
    assertSame(matrixId, ((MatrixFxRateLookup) actualOfMatrixResult).getMatrixId());
  }

  /**
   * Test {@link FxRateLookup#ofMatrix()}.
   *
   * <ul>
   *   <li>Then return fxRateProvider {@link MarketData} is empty.
   * </ul>
   *
   * <p>Method under test: {@link FxRateLookup#ofMatrix()}
   */
  @Test
  @DisplayName("Test ofMatrix(); then return fxRateProvider MarketData is empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateLookup FxRateLookup.ofMatrix()"})
  void testOfMatrix_thenReturnFxRateProviderMarketDataIsEmpty() {
    // Arrange and Act
    FxRateLookup actualOfMatrixResult = FxRateLookup.ofMatrix();
    MarketData marketData = mock(MarketData.class);
    FxMatrix emptyResult = FxMatrix.empty();
    when(marketData.getValue(Mockito.<MarketDataId<FxMatrix>>any())).thenReturn(emptyResult);
    FxRateProvider actualFxRateProviderResult = actualOfMatrixResult.fxRateProvider(marketData);

    // Assert
    verify(marketData).getValue(isA(MarketDataId.class));
    assertTrue(actualOfMatrixResult instanceof MatrixFxRateLookup);
    FxMatrixId matrixId = ((MatrixFxRateLookup) actualOfMatrixResult).getMatrixId();
    ObservableSource observableSource = matrixId.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<FxMatrix> expectedMarketDataType = FxMatrix.class;
    assertEquals(expectedMarketDataType, matrixId.getMarketDataType());
    assertSame(emptyResult, actualFxRateProviderResult);
  }

  /**
   * Test {@link FxRateLookup#queryType()}.
   *
   * <p>Method under test: {@link FxRateLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FxRateLookup.queryType()"})
  void testQueryType() {
    // Arrange and Act
    Class<? extends CalculationParameter> actualQueryTypeResult =
        DefaultFxRateLookup.DEFAULT.queryType();

    // Assert
    Class<FxRateLookup> expectedQueryTypeResult = FxRateLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }
}
