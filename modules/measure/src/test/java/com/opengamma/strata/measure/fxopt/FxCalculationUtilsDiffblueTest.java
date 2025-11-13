package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilities;
import com.opengamma.strata.product.option.Barrier;
import com.opengamma.strata.product.option.BarrierType;
import com.opengamma.strata.product.option.KnockType;
import com.opengamma.strata.product.option.SimpleConstantContinuousBarrier;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxCalculationUtilsDiffblueTest {
  /**
   * Test {@link FxCalculationUtils#checkBlackVolatilities(FxOptionVolatilities)}.
   *
   * <p>Method under test: {@link FxCalculationUtils#checkBlackVolatilities(FxOptionVolatilities)}
   */
  @Test
  @DisplayName("Test checkBlackVolatilities(FxOptionVolatilities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fxopt.BlackFxOptionVolatilities FxCalculationUtils.checkBlackVolatilities(FxOptionVolatilities)"
  })
  void testCheckBlackVolatilities() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> FxCalculationUtils.checkBlackVolatilities(null));
  }

  /**
   * Test {@link FxCalculationUtils#checkVannaVolgaVolatilities(FxOptionVolatilities)}.
   *
   * <p>Method under test: {@link
   * FxCalculationUtils#checkVannaVolgaVolatilities(FxOptionVolatilities)}
   */
  @Test
  @DisplayName("Test checkVannaVolgaVolatilities(FxOptionVolatilities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fxopt.BlackFxOptionSmileVolatilities FxCalculationUtils.checkVannaVolgaVolatilities(FxOptionVolatilities)"
  })
  void testCheckVannaVolgaVolatilities() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> FxCalculationUtils.checkVannaVolgaVolatilities(null));
  }

  /**
   * Test {@link FxCalculationUtils#checkTrinomialTreeVolatilities(FxOptionVolatilities)}.
   *
   * <p>Method under test: {@link
   * FxCalculationUtils#checkTrinomialTreeVolatilities(FxOptionVolatilities)}
   */
  @Test
  @DisplayName("Test checkTrinomialTreeVolatilities(FxOptionVolatilities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fxopt.BlackFxOptionVolatilities FxCalculationUtils.checkTrinomialTreeVolatilities(FxOptionVolatilities)"
  })
  void testCheckTrinomialTreeVolatilities() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FxCalculationUtils.checkTrinomialTreeVolatilities(null));
  }

  /**
   * Test {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)}.
   *
   * <p>Method under test: {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair,
   * FxRateProvider)}
   */
  @Test
  @DisplayName("Test isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxCalculationUtils.isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)"
  })
  void testIsBarrierBreached() {
    // Arrange
    SimpleConstantContinuousBarrier barrier =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(10.0d);

    // Act
    boolean actualIsBarrierBreachedResult =
        FxCalculationUtils.isBarrierBreached(barrier, null, rateProvider);

    // Assert
    verify(rateProvider).fxRate(isNull());
    assertFalse(actualIsBarrierBreachedResult);
  }

  /**
   * Test {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link FxRateProvider} {@link FxRateProvider#fxRate(CurrencyPair)} return {@code
   *       0.5}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test isBarrierBreached(Barrier, CurrencyPair, FxRateProvider); given '0.5'; when FxRateProvider fxRate(CurrencyPair) return '0.5'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxCalculationUtils.isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)"
  })
  void testIsBarrierBreached_given05_whenFxRateProviderFxRateReturn05_thenReturnFalse() {
    // Arrange
    SimpleConstantContinuousBarrier barrier =
        SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(0.5d);

    // Act
    boolean actualIsBarrierBreachedResult =
        FxCalculationUtils.isBarrierBreached(barrier, null, rateProvider);

    // Assert
    verify(rateProvider).fxRate(isNull());
    assertFalse(actualIsBarrierBreachedResult);
  }

  /**
   * Test {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair,
   * FxRateProvider)}
   */
  @Test
  @DisplayName("Test isBarrierBreached(Barrier, CurrencyPair, FxRateProvider); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxCalculationUtils.isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)"
  })
  void testIsBarrierBreached_thenReturnTrue() {
    // Arrange
    SimpleConstantContinuousBarrier barrier =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(10.0d);

    // Act
    boolean actualIsBarrierBreachedResult =
        FxCalculationUtils.isBarrierBreached(barrier, null, rateProvider);

    // Assert
    verify(rateProvider).fxRate(isNull());
    assertTrue(actualIsBarrierBreachedResult);
  }

  /**
   * Test {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair,
   * FxRateProvider)}
   */
  @Test
  @DisplayName("Test isBarrierBreached(Barrier, CurrencyPair, FxRateProvider); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxCalculationUtils.isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)"
  })
  void testIsBarrierBreached_thenReturnTrue2() {
    // Arrange
    SimpleConstantContinuousBarrier barrier =
        SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.fxRate(Mockito.<CurrencyPair>any())).thenReturn(10.0d);

    // Act
    boolean actualIsBarrierBreachedResult =
        FxCalculationUtils.isBarrierBreached(barrier, null, rateProvider);

    // Assert
    verify(rateProvider).fxRate(isNull());
    assertTrue(actualIsBarrierBreachedResult);
  }

  /**
   * Test {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxCalculationUtils#isBarrierBreached(Barrier, CurrencyPair,
   * FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test isBarrierBreached(Barrier, CurrencyPair, FxRateProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FxCalculationUtils.isBarrierBreached(Barrier, CurrencyPair, FxRateProvider)"
  })
  void testIsBarrierBreached_thenThrowIllegalArgumentException() {
    // Arrange
    SimpleConstantContinuousBarrier barrier =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.fxRate(Mockito.<CurrencyPair>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FxCalculationUtils.isBarrierBreached(barrier, null, rateProvider));
    verify(rateProvider).fxRate(isNull());
  }
}
