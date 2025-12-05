package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.Decimal;
import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxRateProviderDiffblueTest {
  /**
   * Test {@link FxRateProvider#lazy(Supplier)}.
   *
   * <ul>
   *   <li>When {@link Supplier}.
   *   <li>Then return {@link LazyFxRateProvider}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#lazy(Supplier)}
   */
  @Test
  @DisplayName("Test lazy(Supplier); when Supplier; then return LazyFxRateProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateProvider FxRateProvider.lazy(Supplier)"})
  void testLazy_whenSupplier_thenReturnLazyFxRateProvider() {
    // Arrange and Act
    FxRateProvider actualLazyResult = FxRateProvider.lazy(mock(Supplier.class));
    double actualFxRateResult = actualLazyResult.fxRate(Currency.AED, Currency.AED);

    // Assert
    assertTrue(actualLazyResult instanceof LazyFxRateProvider);
    assertEquals(1.0d, actualFxRateResult);
  }

  /**
   * Test {@link FxRateProvider#noConversion()}.
   *
   * <p>Method under test: {@link FxRateProvider#noConversion()}
   */
  @Test
  @DisplayName("Test noConversion()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateProvider FxRateProvider.noConversion()"})
  void testNoConversion() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FxRateProvider.noConversion().fxRate(Currency.AED, Currency.AED));
  }

  /**
   * Test {@link FxRateProvider#noConversion()}.
   *
   * <p>Method under test: {@link FxRateProvider#noConversion()}
   */
  @Test
  @DisplayName("Test noConversion()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateProvider FxRateProvider.noConversion()"})
  void testNoConversion2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FxRateProvider.noConversion().fxRate(null, Currency.AED));
  }

  /**
   * Test {@link FxRateProvider#minimal()}.
   *
   * <ul>
   *   <li>Then return fxRate {@link Currency#AED} and {@link Currency#AED} is one.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#minimal()}
   */
  @Test
  @DisplayName("Test minimal(); then return fxRate AED and AED is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateProvider FxRateProvider.minimal()"})
  void testMinimal_thenReturnFxRateAedAndAedIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, FxRateProvider.minimal().fxRate(Currency.AED, Currency.AED));
  }

  /**
   * Test {@link FxRateProvider#minimal()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#minimal()}
   */
  @Test
  @DisplayName("Test minimal(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxRateProvider FxRateProvider.minimal()"})
  void testMinimal_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FxRateProvider.minimal().fxRate(Currency.ARS, Currency.AED));
  }

  /**
   * Test {@link FxRateProvider#convert(Decimal, Currency, Currency)} with {@code Decimal}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>Given {@link FxRateProvider} {@link FxRateProvider#fxRate(CurrencyPair)} return {@code
   *       0.5}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(Decimal, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(Decimal, Currency, Currency) with 'Decimal', 'Currency', 'Currency'; given FxRateProvider fxRate(CurrencyPair) return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal FxRateProvider.convert(Decimal, Currency, Currency)"})
  void testConvertWithDecimalCurrencyCurrency_givenFxRateProviderFxRateReturn05() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(0.5d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(target);

    // Act
    Decimal actualConvertResult =
        lazyFxRateProvider.convert(Decimal.of(42L), Currency.ARS, Currency.AED);

    // Assert
    verify(fxRateProvider).fxRate(isA(CurrencyPair.class));
    verify(target).get();
    Decimal actualAbsResult = actualConvertResult.abs();
    assertEquals(actualConvertResult, actualAbsResult);
    Decimal negatedResult = actualConvertResult.negated();
    assertEquals(actualConvertResult, negatedResult.abs().abs());
    assertEquals(actualConvertResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link FxRateProvider#convert(Decimal, Currency, Currency)} with {@code Decimal}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>Given {@link FxRateProvider} {@link FxRateProvider#fxRate(CurrencyPair)} return ten.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(Decimal, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(Decimal, Currency, Currency) with 'Decimal', 'Currency', 'Currency'; given FxRateProvider fxRate(CurrencyPair) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal FxRateProvider.convert(Decimal, Currency, Currency)"})
  void testConvertWithDecimalCurrencyCurrency_givenFxRateProviderFxRateReturnTen() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(10.0d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(target);

    // Act
    Decimal actualConvertResult =
        lazyFxRateProvider.convert(Decimal.of(42L), Currency.ARS, Currency.AED);

    // Assert
    verify(fxRateProvider).fxRate(isA(CurrencyPair.class));
    verify(target).get();
    Decimal actualAbsResult = actualConvertResult.abs();
    assertEquals(actualConvertResult, actualAbsResult);
    Decimal negatedResult = actualConvertResult.negated();
    assertEquals(actualConvertResult, negatedResult.abs().abs());
    assertEquals(actualConvertResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link FxRateProvider#convert(Decimal, Currency, Currency)} with {@code Decimal}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>Given {@link FxRateProvider} {@link FxRateProvider#fxRate(CurrencyPair)} return zero.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(Decimal, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(Decimal, Currency, Currency) with 'Decimal', 'Currency', 'Currency'; given FxRateProvider fxRate(CurrencyPair) return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal FxRateProvider.convert(Decimal, Currency, Currency)"})
  void testConvertWithDecimalCurrencyCurrency_givenFxRateProviderFxRateReturnZero() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(0.0d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(target);

    // Act
    Decimal actualConvertResult =
        lazyFxRateProvider.convert(Decimal.of(42L), Currency.ARS, Currency.AED);

    // Assert
    verify(fxRateProvider).fxRate(isA(CurrencyPair.class));
    verify(target).get();
    Decimal actualNegatedResult = actualConvertResult.negated();
    assertEquals(actualConvertResult, actualNegatedResult);
  }

  /**
   * Test {@link FxRateProvider#convert(Decimal, Currency, Currency)} with {@code Decimal}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>Then return {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(Decimal, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(Decimal, Currency, Currency) with 'Decimal', 'Currency', 'Currency'; then return Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal FxRateProvider.convert(Decimal, Currency, Currency)"})
  void testConvertWithDecimalCurrencyCurrency_thenReturnDecimalWithValueIsFortyTwo() {
    // Arrange
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(mock(Supplier.class));
    Decimal amount = Decimal.of(42L);

    // Act
    Decimal actualConvertResult = lazyFxRateProvider.convert(amount, Currency.AED, Currency.AED);

    // Assert
    assertEquals(amount, actualConvertResult);
  }

  /**
   * Test {@link FxRateProvider#convert(Decimal, Currency, Currency)} with {@code Decimal}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>Then return ofScaled {@code 66820} and {@code 66820}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(Decimal, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(Decimal, Currency, Currency) with 'Decimal', 'Currency', 'Currency'; then return ofScaled '66820' and '66820'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal FxRateProvider.convert(Decimal, Currency, Currency)"})
  void testConvertWithDecimalCurrencyCurrency_thenReturnOfScaled66820And66820() {
    // Arrange
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(mock(Supplier.class));
    Decimal amount = Decimal.ofScaled(66820L, 66820);

    // Act
    Decimal actualConvertResult = lazyFxRateProvider.convert(amount, Currency.AED, Currency.AED);

    // Assert
    assertSame(amount, actualConvertResult);
  }

  /**
   * Test {@link FxRateProvider#convert(Decimal, Currency, Currency)} with {@code Decimal}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(Decimal, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(Decimal, Currency, Currency) with 'Decimal', 'Currency', 'Currency'; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal FxRateProvider.convert(Decimal, Currency, Currency)"})
  void testConvertWithDecimalCurrencyCurrency_thenReturnSignumIsMinusOne() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(-0.5d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(target);

    // Act
    Decimal actualConvertResult =
        lazyFxRateProvider.convert(Decimal.of(42L), Currency.ARS, Currency.AED);

    // Assert
    verify(fxRateProvider).fxRate(isA(CurrencyPair.class));
    verify(target).get();
    assertEquals(-1, actualConvertResult.signum());
    Decimal absResult = actualConvertResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    Decimal negatedResult = absResult.negated();
    assertEquals(absResult2, negatedResult.abs().abs());
    assertEquals(absResult2, negatedResult.negated().abs());
    assertEquals(absResult2, actualConvertResult.negated());
  }

  /**
   * Test {@link FxRateProvider#convert(Decimal, Currency, Currency)} with {@code Decimal}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>When {@link Decimal} with value is {@code 66820}.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(Decimal, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(Decimal, Currency, Currency) with 'Decimal', 'Currency', 'Currency'; when Decimal with value is '66820'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal FxRateProvider.convert(Decimal, Currency, Currency)"})
  void testConvertWithDecimalCurrencyCurrency_whenDecimalWithValueIs66820() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(0.5d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(target);

    // Act
    Decimal actualConvertResult =
        lazyFxRateProvider.convert(Decimal.of(66820L), Currency.ARS, Currency.AED);

    // Assert
    verify(fxRateProvider).fxRate(isA(CurrencyPair.class));
    verify(target).get();
    Decimal actualAbsResult = actualConvertResult.abs();
    assertEquals(actualConvertResult, actualAbsResult);
    Decimal negatedResult = actualConvertResult.negated();
    assertEquals(actualConvertResult, negatedResult.abs().abs());
    assertEquals(actualConvertResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link FxRateProvider#convert(double, Currency, Currency)} with {@code double}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#convert(double, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(double, Currency, Currency) with 'double', 'Currency', 'Currency'; when AED; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRateProvider.convert(double, Currency, Currency)"})
  void testConvertWithDoubleCurrencyCurrency_whenAed_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, FxMatrix.empty().convert(10.0d, Currency.AED, Currency.AED));
  }

  /**
   * Test {@link FxRateProvider#fxRate(CurrencyPair)} with {@code currencyPair}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link FxRateProvider#fxRate(CurrencyPair)}
   */
  @Test
  @DisplayName("Test fxRate(CurrencyPair) with 'currencyPair'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FxRateProvider.fxRate(CurrencyPair)"})
  void testFxRateWithCurrencyPair_thenReturnOne() {
    // Arrange
    FxMatrix emptyResult = FxMatrix.empty();

    // Act and Assert
    assertEquals(1.0d, emptyResult.fxRate(CurrencyPair.of(Currency.AED, Currency.AED)));
  }
}
