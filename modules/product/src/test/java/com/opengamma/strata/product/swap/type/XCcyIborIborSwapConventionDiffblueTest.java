package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class XCcyIborIborSwapConventionDiffblueTest {
  /**
   * Test {@link XCcyIborIborSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link XCcyIborIborSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum XCcyIborIborSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<XCcyIborIborSwapConvention> actualExtendedEnumResult =
        XCcyIborIborSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<XCcyIborIborSwapConvention> expectedType = XCcyIborIborSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link XCcyIborIborSwapConvention#getCurrencyPair()}.
   *
   * <ul>
   *   <li>Given {@link StandardXCcyIborIborSwapConventions#EUR_EURIBOR_3M_USD_LIBOR_3M}.
   *   <li>Then return Base Code is {@code EUR}.
   * </ul>
   *
   * <p>Method under test: {@link XCcyIborIborSwapConvention#getCurrencyPair()}
   */
  @Test
  @DisplayName(
      "Test getCurrencyPair(); given EUR_EURIBOR_3M_USD_LIBOR_3M; then return Base Code is 'EUR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair XCcyIborIborSwapConvention.getCurrencyPair()"})
  void testGetCurrencyPair_givenEur_euribor_3m_usd_libor_3m_thenReturnBaseCodeIsEur() {
    // Arrange and Act
    CurrencyPair actualCurrencyPair =
        StandardXCcyIborIborSwapConventions.EUR_EURIBOR_3M_USD_LIBOR_3M.getCurrencyPair();

    // Assert
    Currency base = actualCurrencyPair.getBase();
    assertEquals("EUR", base.getCode());
    assertEquals("EUR", base.toString());
    Currency counter = actualCurrencyPair.getCounter();
    assertEquals("USD", counter.getCode());
    assertEquals("USD", counter.toString());
    CurrencyPair inverseResult = actualCurrencyPair.inverse();
    assertEquals(4, inverseResult.getRateDigits());
    assertEquals(4, actualCurrencyPair.getRateDigits());
    assertEquals(actualCurrencyPair, inverseResult.inverse());
    assertEquals(actualCurrencyPair, inverseResult.toConventional());
    assertSame(base, inverseResult.getCounter());
    assertSame(counter, base.getTriangulationCurrency());
    Currency actualTriangulationCurrency = counter.getTriangulationCurrency();
    assertSame(counter, actualTriangulationCurrency);
    assertSame(counter, inverseResult.getBase());
    CurrencyPair actualToConventionalResult = actualCurrencyPair.toConventional();
    assertSame(actualCurrencyPair, actualToConventionalResult);
  }

  /**
   * Test {@link XCcyIborIborSwapConvention#getCurrencyPair()}.
   *
   * <ul>
   *   <li>Given {@link StandardXCcyIborIborSwapConventions#GBP_LIBOR_3M_EUR_EURIBOR_3M}.
   *   <li>Then return Counter Code is {@code EUR}.
   * </ul>
   *
   * <p>Method under test: {@link XCcyIborIborSwapConvention#getCurrencyPair()}
   */
  @Test
  @DisplayName(
      "Test getCurrencyPair(); given GBP_LIBOR_3M_EUR_EURIBOR_3M; then return Counter Code is 'EUR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair XCcyIborIborSwapConvention.getCurrencyPair()"})
  void testGetCurrencyPair_givenGbp_libor_3m_eur_euribor_3m_thenReturnCounterCodeIsEur() {
    // Arrange and Act
    CurrencyPair actualCurrencyPair =
        StandardXCcyIborIborSwapConventions.GBP_LIBOR_3M_EUR_EURIBOR_3M.getCurrencyPair();

    // Assert
    Currency counter = actualCurrencyPair.getCounter();
    assertEquals("EUR", counter.getCode());
    assertEquals("EUR", counter.toString());
    Currency base = actualCurrencyPair.getBase();
    assertEquals("GBP", base.getCode());
    assertEquals("GBP", base.toString());
    CurrencyPair inverseResult = actualCurrencyPair.inverse();
    assertEquals(5, inverseResult.getRateDigits());
    assertEquals(5, actualCurrencyPair.getRateDigits());
    assertEquals(actualCurrencyPair, inverseResult.inverse());
    assertSame(base, inverseResult.getCounter());
    assertSame(counter, inverseResult.getBase());
  }
}
