package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Supplier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LazyFxRateProviderDiffblueTest {
  /**
   * Test {@link LazyFxRateProvider#convert(double, Currency, Currency)} with {@code double}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link LazyFxRateProvider#convert(double, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(double, Currency, Currency) with 'double', 'Currency', 'Currency'; when AED; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LazyFxRateProvider.convert(double, Currency, Currency)"})
  void testConvertWithDoubleCurrencyCurrency_whenAed_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        new LazyFxRateProvider(mock(Supplier.class)).convert(10.0d, Currency.AED, Currency.AED));
  }

  /**
   * Test {@link LazyFxRateProvider#convert(double, Currency, Currency)} with {@code double}, {@code
   * Currency}, {@code Currency}.
   *
   * <ul>
   *   <li>When {@link Currency#ARS}.
   *   <li>Then calls {@link FxRateProvider#convert(double, Currency, Currency)}.
   * </ul>
   *
   * <p>Method under test: {@link LazyFxRateProvider#convert(double, Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test convert(double, Currency, Currency) with 'double', 'Currency', 'Currency'; when ARS; then calls convert(double, Currency, Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LazyFxRateProvider.convert(double, Currency, Currency)"})
  void testConvertWithDoubleCurrencyCurrency_whenArs_thenCallsConvert() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(10.0d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);

    // Act
    double actualConvertResult =
        new LazyFxRateProvider(target).convert(10.0d, Currency.ARS, Currency.AED);

    // Assert
    verify(fxRateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    verify(target).get();
    assertEquals(10.0d, actualConvertResult);
  }

  /**
   * Test {@link LazyFxRateProvider#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link LazyFxRateProvider#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LazyFxRateProvider.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_thenReturnTen() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(10.0d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);

    // Act
    double actualFxRateResult = new LazyFxRateProvider(target).fxRate(Currency.ARS, Currency.AED);

    // Assert
    verify(fxRateProvider).fxRate(isA(CurrencyPair.class));
    verify(target).get();
    assertEquals(10.0d, actualFxRateResult);
  }

  /**
   * Test {@link LazyFxRateProvider#fxRate(Currency, Currency)} with {@code baseCurrency}, {@code
   * counterCurrency}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LazyFxRateProvider#fxRate(Currency, Currency)}
   */
  @Test
  @DisplayName(
      "Test fxRate(Currency, Currency) with 'baseCurrency', 'counterCurrency'; when AED; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LazyFxRateProvider.fxRate(Currency, Currency)"})
  void testFxRateWithBaseCurrencyCounterCurrency_whenAed_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d, new LazyFxRateProvider(mock(Supplier.class)).fxRate(Currency.AED, Currency.AED));
  }

  /**
   * Test {@link LazyFxRateProvider#fxRate(CurrencyPair)} with {@code currencyPair}.
   *
   * <ul>
   *   <li>Given {@link FxRateProvider} {@link FxRateProvider#fxRate(CurrencyPair)} return ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link LazyFxRateProvider#fxRate(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test fxRate(CurrencyPair) with 'currencyPair'; given FxRateProvider fxRate(CurrencyPair) return ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LazyFxRateProvider.fxRate(CurrencyPair)"})
  void testFxRateWithCurrencyPair_givenFxRateProviderFxRateReturnTen_thenReturnTen() {
    // Arrange
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(10.0d);

    Supplier<FxRateProvider> target = mock(Supplier.class);
    when(target.get()).thenReturn(fxRateProvider);
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(target);

    // Act
    double actualFxRateResult =
        lazyFxRateProvider.fxRate(CurrencyPair.of(Currency.ARS, Currency.AED));

    // Assert
    verify(fxRateProvider).fxRate(isA(CurrencyPair.class));
    verify(target).get();
    assertEquals(10.0d, actualFxRateResult);
  }

  /**
   * Test {@link LazyFxRateProvider#fxRate(CurrencyPair)} with {@code currencyPair}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LazyFxRateProvider#fxRate(CurrencyPair)}
   */
  @Test
  @DisplayName("Test fxRate(CurrencyPair) with 'currencyPair'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LazyFxRateProvider.fxRate(CurrencyPair)"})
  void testFxRateWithCurrencyPair_thenReturnOne() {
    // Arrange
    LazyFxRateProvider lazyFxRateProvider = new LazyFxRateProvider(mock(Supplier.class));

    // Act and Assert
    assertEquals(1.0d, lazyFxRateProvider.fxRate(CurrencyPair.of(Currency.AED, Currency.AED)));
  }
}
