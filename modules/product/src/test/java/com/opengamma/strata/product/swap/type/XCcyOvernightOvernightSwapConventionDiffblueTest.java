package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

class XCcyOvernightOvernightSwapConventionDiffblueTest {
  /**
   * Test {@link XCcyOvernightOvernightSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link XCcyOvernightOvernightSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum XCcyOvernightOvernightSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<XCcyOvernightOvernightSwapConvention> actualExtendedEnumResult =
        XCcyOvernightOvernightSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<XCcyOvernightOvernightSwapConvention> expectedType =
        XCcyOvernightOvernightSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link XCcyOvernightOvernightSwapConvention#getCurrencyPair()}.
   *
   * <ul>
   *   <li>Given {@link StandardXCcyOvernightOvernightSwapConventions#EUR_ESTR_3M_USD_SOFR_3M}.
   *   <li>Then return Base Code is {@code EUR}.
   * </ul>
   *
   * <p>Method under test: {@link XCcyOvernightOvernightSwapConvention#getCurrencyPair()}
   */
  @Test
  @DisplayName(
      "Test getCurrencyPair(); given EUR_ESTR_3M_USD_SOFR_3M; then return Base Code is 'EUR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair XCcyOvernightOvernightSwapConvention.getCurrencyPair()"})
  void testGetCurrencyPair_givenEur_estr_3m_usd_sofr_3m_thenReturnBaseCodeIsEur() {
    // Arrange and Act
    CurrencyPair actualCurrencyPair =
        StandardXCcyOvernightOvernightSwapConventions.EUR_ESTR_3M_USD_SOFR_3M.getCurrencyPair();

    // Assert
    Currency base = actualCurrencyPair.getBase();
    assertEquals("EUR", base.getCode());
    assertEquals("EUR", base.toString());
    Currency counter = actualCurrencyPair.getCounter();
    assertEquals("USD", counter.getCode());
    assertEquals("USD", counter.toString());
    assertEquals(2, base.getMinorUnitDigits());
    assertEquals(2, counter.getMinorUnitDigits());
    CurrencyPair inverseResult = actualCurrencyPair.inverse();
    assertEquals(4, inverseResult.getRateDigits());
    assertEquals(4, actualCurrencyPair.getRateDigits());
    assertFalse(inverseResult.isIdentity());
    assertFalse(actualCurrencyPair.isIdentity());
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
}
