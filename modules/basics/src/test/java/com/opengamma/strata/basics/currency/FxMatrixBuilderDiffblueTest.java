package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxMatrixBuilderDiffblueTest {
  /**
   * Test {@link FxMatrixBuilder#build()}.
   *
   * <p>Method under test: {@link FxMatrixBuilder#build()}
   */
  @Test
  @DisplayName("Test build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrix FxMatrixBuilder.build()"})
  void testBuild() {
    // Arrange, Act and Assert
    DoubleMatrix rates = FxMatrix.builder().build().getRates();
    assertEquals(0, rates.size());
    assertEquals(0, rates.toArrayUnsafe().length);
    assertEquals(0.0d, rates.total());
    assertEquals(2, rates.dimensions());
    assertTrue(rates.isEmpty());
    assertTrue(rates.isSquare());
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with {@code ccy1}, {@code
   * ccy2}, {@code rate}.
   *
   * <ul>
   *   <li>Given {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#ARS} and ccy2 is {@link Currency#AED} and rate is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; given addRate(Currency, Currency, double) with ccy1 is ARS and ccy2 is AED and rate is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(Currency, Currency, double)"})
  void testAddRateWithCcy1Ccy2Rate_givenAddRateWithCcy1IsArsAndCcy2IsAedAndRateIsOne() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.AED, 1.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult.addRate(Currency.AED, Currency.AED, 10.0d).build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with {@code ccy1}, {@code
   * ccy2}, {@code rate}.
   *
   * <ul>
   *   <li>Then return build Rates size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; then return build Rates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(Currency, Currency, double)"})
  void testAddRateWithCcy1Ccy2Rate_thenReturnBuildRatesSizeIsOne() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 1.0d);

    // Act and Assert
    FxMatrix fxMatrix = builderResult.addRate(Currency.AED, Currency.AED, 10.0d).build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(1, rates.size());
    FxMatrix fxMatrix2 = builderResult.build();
    DoubleMatrix rates2 = fxMatrix2.getRates();
    assertEquals(1, rates2.size());
    assertEquals(1, fxMatrix.getCurrencies().size());
    assertEquals(1, fxMatrix2.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = rates2.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(1.0d, rates.total());
    assertEquals(1.0d, rates2.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with {@code ccy1}, {@code
   * ccy2}, {@code rate}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(Currency, Currency, double)"})
  void testAddRateWithCcy1Ccy2Rate_thenReturnBuilder() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.ARS, 1.0d);

    // Act
    FxMatrixBuilder actualAddRateResult = builderResult.addRate(Currency.AED, Currency.AED, 10.0d);

    // Assert
    assertSame(builderResult, actualAddRateResult);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with {@code ccy1}, {@code
   * ccy2}, {@code rate}.
   *
   * <ul>
   *   <li>Then return first element is array of {@code double} with one and {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; then return first element is array of double with one and '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(Currency, Currency, double)"})
  void testAddRateWithCcy1Ccy2Rate_thenReturnFirstElementIsArrayOfDoubleWithOneAnd01() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 1.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult.addRate(Currency.ARS, Currency.AED, 10.0d).build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {1.0d, 0.1d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.1d}, toArrayUnsafeResult2[0], 0.0);
    assertArrayEquals(new double[] {10.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {10.0d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with {@code ccy1}, {@code
   * ccy2}, {@code rate}.
   *
   * <ul>
   *   <li>Then return second element is array of {@code double} with {@code 0.1} and one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; then return second element is array of double with '0.1' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(Currency, Currency, double)"})
  void testAddRateWithCcy1Ccy2Rate_thenReturnSecondElementIsArrayOfDoubleWith01AndOne() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 1.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult.addRate(Currency.AED, Currency.ARS, 10.0d).build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with {@code ccy1}, {@code
   * ccy2}, {@code rate}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then not builder build Rates Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(Currency, Currency, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(Currency, Currency, double) with 'ccy1', 'ccy2', 'rate'; when AED; then not builder build Rates Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(Currency, Currency, double)"})
  void testAddRateWithCcy1Ccy2Rate_whenAed_thenNotBuilderBuildRatesEmpty() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();

    // Act
    FxMatrixBuilder actualAddRateResult = builderResult.addRate(Currency.AED, Currency.AED, 10.0d);

    // Assert
    FxMatrix fxMatrix = builderResult.build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(1, rates.size());
    assertEquals(1, fxMatrix.getCurrencies().size());
    double[][] toArrayUnsafeResult = actualAddRateResult.build().getRates().toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(1.0d, rates.total());
    assertFalse(rates.isEmpty());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(CurrencyPair, double)} with {@code currencyPair}, {@code
   * rate}.
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(CurrencyPair, double)}
   */
  @Test
  @DisplayName("Test addRate(CurrencyPair, double) with 'currencyPair', 'rate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(CurrencyPair, double)"})
  void testAddRateWithCurrencyPairRate() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.AED, 1.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult
            .addRate(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d)
            .build()
            .getRates()
            .toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(CurrencyPair, double)} with {@code currencyPair}, {@code
   * rate}.
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(CurrencyPair, double)}
   */
  @Test
  @DisplayName("Test addRate(CurrencyPair, double) with 'currencyPair', 'rate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(CurrencyPair, double)"})
  void testAddRateWithCurrencyPairRate2() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 1.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult
            .addRate(CurrencyPair.of(Currency.ARS, Currency.AED), 10.0d)
            .build()
            .getRates()
            .toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {1.0d, 0.1d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.1d}, toArrayUnsafeResult2[0], 0.0);
    assertArrayEquals(new double[] {10.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {10.0d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(CurrencyPair, double)} with {@code currencyPair}, {@code
   * rate}.
   *
   * <ul>
   *   <li>Then not builder build Rates Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(CurrencyPair, double) with 'currencyPair', 'rate'; then not builder build Rates Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(CurrencyPair, double)"})
  void testAddRateWithCurrencyPairRate_thenNotBuilderBuildRatesEmpty() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();

    // Act
    FxMatrixBuilder actualAddRateResult =
        builderResult.addRate(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d);

    // Assert
    FxMatrix fxMatrix = builderResult.build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(1, rates.size());
    assertEquals(1, fxMatrix.getCurrencies().size());
    double[][] toArrayUnsafeResult = actualAddRateResult.build().getRates().toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(1.0d, rates.total());
    assertFalse(rates.isEmpty());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(CurrencyPair, double)} with {@code currencyPair}, {@code
   * rate}.
   *
   * <ul>
   *   <li>Then return build Rates size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(CurrencyPair, double) with 'currencyPair', 'rate'; then return build Rates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(CurrencyPair, double)"})
  void testAddRateWithCurrencyPairRate_thenReturnBuildRatesSizeIsOne() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 1.0d);

    // Act and Assert
    FxMatrix fxMatrix =
        builderResult.addRate(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d).build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(1, rates.size());
    FxMatrix fxMatrix2 = builderResult.build();
    DoubleMatrix rates2 = fxMatrix2.getRates();
    assertEquals(1, rates2.size());
    assertEquals(1, fxMatrix.getCurrencies().size());
    assertEquals(1, fxMatrix2.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = rates2.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(1.0d, rates.total());
    assertEquals(1.0d, rates2.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(CurrencyPair, double)} with {@code currencyPair}, {@code
   * rate}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(CurrencyPair, double) with 'currencyPair', 'rate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(CurrencyPair, double)"})
  void testAddRateWithCurrencyPairRate_thenReturnBuilder() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.ARS, 1.0d);

    // Act
    FxMatrixBuilder actualAddRateResult =
        builderResult.addRate(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d);

    // Assert
    assertSame(builderResult, actualAddRateResult);
  }

  /**
   * Test {@link FxMatrixBuilder#addRate(CurrencyPair, double)} with {@code currencyPair}, {@code
   * rate}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#ARS}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRate(CurrencyPair, double)}
   */
  @Test
  @DisplayName(
      "Test addRate(CurrencyPair, double) with 'currencyPair', 'rate'; when CurrencyPair with base is AED and counter is ARS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRate(CurrencyPair, double)"})
  void testAddRateWithCurrencyPairRate_whenCurrencyPairWithBaseIsAedAndCounterIsArs() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 1.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult
            .addRate(CurrencyPair.of(Currency.AED, Currency.ARS), 10.0d)
            .build()
            .getRates()
            .toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRates(Map)}.
   *
   * <ul>
   *   <li>Given {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#ARS} and ccy2 is {@link Currency#AED} and rate is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRates(Map)}
   */
  @Test
  @DisplayName(
      "Test addRates(Map); given addRate(Currency, Currency, double) with ccy1 is ARS and ccy2 is AED and rate is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRates(Map)"})
  void testAddRates_givenAddRateWithCcy1IsArsAndCcy2IsAedAndRateIs05() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.AED, 0.5d);

    HashMap<CurrencyPair, Double> rates = new HashMap<>();
    rates.put(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult.addRates(rates).build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {0.2d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.2d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 5.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 5.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRates(Map)}.
   *
   * <ul>
   *   <li>Given {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#ARS} and ccy2 is {@link Currency#ARS} and rate is {@code 0.5}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRates(Map)}
   */
  @Test
  @DisplayName(
      "Test addRates(Map); given addRate(Currency, Currency, double) with ccy1 is ARS and ccy2 is ARS and rate is '0.5'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRates(Map)"})
  void testAddRates_givenAddRateWithCcy1IsArsAndCcy2IsArsAndRateIs05_thenReturnBuilder() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.ARS, 0.5d);

    HashMap<CurrencyPair, Double> rates = new HashMap<>();
    rates.put(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d);

    // Act
    FxMatrixBuilder actualAddRatesResult = builderResult.addRates(rates);

    // Assert
    assertSame(builderResult, actualAddRatesResult);
  }

  /**
   * Test {@link FxMatrixBuilder#addRates(Map)}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return build Rates size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRates(Map)}
   */
  @Test
  @DisplayName(
      "Test addRates(Map); given builder; when HashMap(); then return build Rates size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRates(Map)"})
  void testAddRates_givenBuilder_whenHashMap_thenReturnBuildRatesSizeIsZero() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();

    // Act and Assert
    FxMatrix fxMatrix = builderResult.addRates(new HashMap<>()).build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(0, rates.size());
    assertEquals(0, rates.toArrayUnsafe().length);
    assertEquals(0.0d, rates.total());
    assertTrue(rates.isEmpty());
    assertTrue(fxMatrix.getCurrencies().isEmpty());
  }

  /**
   * Test {@link FxMatrixBuilder#addRates(Map)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#ARS}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRates(Map)}
   */
  @Test
  @DisplayName("Test addRates(Map); given CurrencyPair with base is AED and counter is ARS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRates(Map)"})
  void testAddRates_givenCurrencyPairWithBaseIsAedAndCounterIsArs() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 0.5d);

    HashMap<CurrencyPair, Double> rates = new HashMap<>();
    rates.put(CurrencyPair.of(Currency.AED, Currency.ARS), 10.0d);

    // Act and Assert
    double[][] toArrayUnsafeResult =
        builderResult.addRates(rates).build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = builderResult.build().getRates().toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertArrayEquals(new double[] {0.2d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.2d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 5.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 5.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRates(Map)}.
   *
   * <ul>
   *   <li>Given {@link FxMatrixBuilder#FxMatrixBuilder()}.
   *   <li>Then {@link FxMatrixBuilder#FxMatrixBuilder()} build Rates size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRates(Map)}
   */
  @Test
  @DisplayName(
      "Test addRates(Map); given FxMatrixBuilder(); then FxMatrixBuilder() build Rates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRates(Map)"})
  void testAddRates_givenFxMatrixBuilder_thenFxMatrixBuilderBuildRatesSizeIsOne() {
    // Arrange
    FxMatrixBuilder fxMatrixBuilder = new FxMatrixBuilder();

    HashMap<CurrencyPair, Double> rates = new HashMap<>();
    rates.put(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d);

    // Act
    FxMatrixBuilder actualAddRatesResult = fxMatrixBuilder.addRates(rates);

    // Assert
    FxMatrix fxMatrix = fxMatrixBuilder.build();
    DoubleMatrix rates2 = fxMatrix.getRates();
    assertEquals(1, rates2.size());
    assertEquals(1, fxMatrix.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates2.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = actualAddRatesResult.build().getRates().toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(1.0d, rates2.total());
    assertFalse(rates2.isEmpty());
    assertSame(fxMatrixBuilder, actualAddRatesResult);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRates(Map)}.
   *
   * <ul>
   *   <li>Then return build Rates size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRates(Map)}
   */
  @Test
  @DisplayName("Test addRates(Map); then return build Rates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRates(Map)"})
  void testAddRates_thenReturnBuildRatesSizeIsOne() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 0.5d);

    HashMap<CurrencyPair, Double> rates = new HashMap<>();
    rates.put(CurrencyPair.of(Currency.AED, Currency.AED), 10.0d);

    // Act and Assert
    FxMatrix fxMatrix = builderResult.addRates(rates).build();
    DoubleMatrix rates2 = fxMatrix.getRates();
    assertEquals(1, rates2.size());
    FxMatrix fxMatrix2 = builderResult.build();
    DoubleMatrix rates3 = fxMatrix2.getRates();
    assertEquals(1, rates3.size());
    assertEquals(1, fxMatrix.getCurrencies().size());
    assertEquals(1, fxMatrix2.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates2.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, rates2.total());
    assertEquals(1.0d, rates3.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#addRates(Map)}.
   *
   * <ul>
   *   <li>Then return build Rates total is {@code 22.05}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#addRates(Map)}
   */
  @Test
  @DisplayName("Test addRates(Map); then return build Rates total is '22.05'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.addRates(Map)"})
  void testAddRates_thenReturnBuildRatesTotalIs2205() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 0.5d);

    HashMap<CurrencyPair, Double> rates = new HashMap<>();
    rates.put(CurrencyPair.of(Currency.ARS, Currency.AED), 10.0d);

    // Act and Assert
    DoubleMatrix rates2 = builderResult.addRates(rates).build().getRates();
    double[][] toArrayUnsafeResult = rates2.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    DoubleMatrix rates3 = builderResult.build().getRates();
    double[][] toArrayUnsafeResult2 = rates3.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult2.length);
    assertEquals(22.05d, rates2.total());
    assertEquals(22.05d, rates3.total());
    assertArrayEquals(new double[] {1.0d, 0.05d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.05d}, toArrayUnsafeResult2[0], 0.0);
    assertArrayEquals(new double[] {20.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {20.0d, 1.0d}, toArrayUnsafeResult2[1], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#FxMatrixBuilder()}.
   *
   * <p>Method under test: {@link FxMatrixBuilder#FxMatrixBuilder()}
   */
  @Test
  @DisplayName("Test new FxMatrixBuilder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FxMatrixBuilder.<init>()"})
  void testNewFxMatrixBuilder() {
    // Arrange, Act and Assert
    FxMatrix fxMatrix = new FxMatrixBuilder().build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(0, rates.size());
    assertEquals(0, rates.toArrayUnsafe().length);
    assertEquals(0.0d, rates.total());
    assertEquals(2, rates.dimensions());
    assertTrue(rates.isEmpty());
    assertTrue(rates.isSquare());
    assertTrue(fxMatrix.getCurrencies().isEmpty());
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>Given {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#AED} and ccy2 is {@link Currency#AED} and rate is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName(
      "Test merge(FxMatrixBuilder); given addRate(Currency, Currency, double) with ccy1 is AED and ccy2 is AED and rate is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_givenAddRateWithCcy1IsAedAndCcy2IsAedAndRateIsTen() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 10.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.merge(FxMatrix.builder()));
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>Given {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#ARS} and ccy2 is {@link Currency#AED} and rate is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName(
      "Test merge(FxMatrixBuilder); given addRate(Currency, Currency, double) with ccy1 is ARS and ccy2 is AED and rate is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_givenAddRateWithCcy1IsArsAndCcy2IsAedAndRateIsTen() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.AED, 10.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.merge(FxMatrix.builder()));
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#AED} and ccy2 is {@link Currency#AED} and rate is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName(
      "Test merge(FxMatrixBuilder); given ten; when addRate(Currency, Currency, double) with ccy1 is AED and ccy2 is AED and rate is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_givenTen_whenAddRateWithCcy1IsAedAndCcy2IsAedAndRateIsTen() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();

    FxMatrixBuilder other = FxMatrix.builder();
    other.addRate(Currency.AED, Currency.AED, 10.0d);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> builderResult.merge(other));
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>Then return build Rates size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName("Test merge(FxMatrixBuilder); then return build Rates size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_thenReturnBuildRatesSizeIsOne() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 10.0d);

    FxMatrixBuilder other = FxMatrix.builder();
    other.addRate(Currency.AED, Currency.AED, 0.5d);

    // Act and Assert
    FxMatrix fxMatrix = builderResult.merge(other).build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(1, rates.size());
    assertEquals(1, fxMatrix.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, rates.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>Then return build Rates total is {@code 22.05}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName("Test merge(FxMatrixBuilder); then return build Rates total is '22.05'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_thenReturnBuildRatesTotalIs2205() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.AED, Currency.AED, 10.0d);

    FxMatrixBuilder other = FxMatrix.builder();
    other.addRate(Currency.ARS, Currency.AED, 0.5d);

    // Act and Assert
    FxMatrix fxMatrix = builderResult.merge(other).build();
    assertEquals(2, fxMatrix.getCurrencies().size());
    DoubleMatrix rates = fxMatrix.getRates();
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(22.05d, rates.total());
    assertEquals(4, rates.size());
    assertArrayEquals(new double[] {0.05d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 20.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>When {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#AED} and ccy2 is {@link Currency#AED} and rate is two.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName(
      "Test merge(FxMatrixBuilder); when addRate(Currency, Currency, double) with ccy1 is AED and ccy2 is AED and rate is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_whenAddRateWithCcy1IsAedAndCcy2IsAedAndRateIsTwo() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.AED, 10.0d);

    FxMatrixBuilder other = FxMatrix.builder();
    other.addRate(Currency.AED, Currency.AED, 2.0d);

    // Act and Assert
    FxMatrix fxMatrix = builderResult.merge(other).build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(12.1d, rates.total());
    assertEquals(2, fxMatrix.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, rates.size());
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>When {@link FxMatrixBuilder#addRate(Currency, Currency, double)} with ccy1 is {@link
   *       Currency#ARS} and ccy2 is {@link Currency#AED} and rate is two.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName(
      "Test merge(FxMatrixBuilder); when addRate(Currency, Currency, double) with ccy1 is ARS and ccy2 is AED and rate is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_whenAddRateWithCcy1IsArsAndCcy2IsAedAndRateIsTwo() {
    // Arrange
    FxMatrixBuilder builderResult = FxMatrix.builder();
    builderResult.addRate(Currency.ARS, Currency.AED, 10.0d);

    FxMatrixBuilder other = FxMatrix.builder();
    other.addRate(Currency.ARS, Currency.AED, 2.0d);

    // Act and Assert
    FxMatrix fxMatrix = builderResult.merge(other).build();
    DoubleMatrix rates = fxMatrix.getRates();
    assertEquals(12.1d, rates.total());
    assertEquals(2, fxMatrix.getCurrencies().size());
    double[][] toArrayUnsafeResult = rates.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, rates.size());
    assertArrayEquals(new double[] {0.1d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link FxMatrixBuilder#merge(FxMatrixBuilder)}.
   *
   * <ul>
   *   <li>When builder.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxMatrixBuilder#merge(FxMatrixBuilder)}
   */
  @Test
  @DisplayName("Test merge(FxMatrixBuilder); when builder; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxMatrixBuilder FxMatrixBuilder.merge(FxMatrixBuilder)"})
  void testMerge_whenBuilder_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> FxMatrix.builder().merge(FxMatrix.builder()));
  }
}
