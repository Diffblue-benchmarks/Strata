package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyDataLoaderDiffblueTest {
  /**
   * Test {@link CurrencyDataLoader#loadCurrencies(boolean)}.
   *
   * <p>Method under test: {@link CurrencyDataLoader#loadCurrencies(boolean)}
   */
  @Test
  @DisplayName("Test loadCurrencies(boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap CurrencyDataLoader.loadCurrencies(boolean)"})
  void testLoadCurrencies() {
    // Arrange and Act
    ImmutableMap<String, Currency> actualLoadCurrenciesResult =
        CurrencyDataLoader.loadCurrencies(true);

    // Assert
    assertEquals(19, actualLoadCurrenciesResult.size());
    Currency getResult = actualLoadCurrenciesResult.get("ATS");
    assertEquals("ATS", getResult.getCode());
    assertEquals("ATS", getResult.toString());
    Currency getResult2 = actualLoadCurrenciesResult.get("BEF");
    assertEquals("BEF", getResult2.getCode());
    assertEquals("BEF", getResult2.toString());
    Currency getResult3 = actualLoadCurrenciesResult.get("CYP");
    assertEquals("CYP", getResult3.getCode());
    assertEquals("CYP", getResult3.toString());
    Currency getResult4 = actualLoadCurrenciesResult.get("DEM");
    assertEquals("DEM", getResult4.getCode());
    assertEquals("DEM", getResult4.toString());
    Currency getResult5 = actualLoadCurrenciesResult.get("EEK");
    assertEquals("EEK", getResult5.getCode());
    assertEquals("EEK", getResult5.toString());
    Currency getResult6 = actualLoadCurrenciesResult.get("ESP");
    assertEquals("ESP", getResult6.getCode());
    assertEquals("ESP", getResult6.toString());
    Currency getResult7 = actualLoadCurrenciesResult.get("FIM");
    assertEquals("FIM", getResult7.getCode());
    assertEquals("FIM", getResult7.toString());
    Currency getResult8 = actualLoadCurrenciesResult.get("FRF");
    assertEquals("FRF", getResult8.getCode());
    assertEquals("FRF", getResult8.toString());
    Currency getResult9 = actualLoadCurrenciesResult.get("GRD");
    assertEquals("GRD", getResult9.getCode());
    assertEquals("GRD", getResult9.toString());
    Currency getResult10 = actualLoadCurrenciesResult.get("IEP");
    assertEquals("IEP", getResult10.getCode());
    assertEquals("IEP", getResult10.toString());
    Currency getResult11 = actualLoadCurrenciesResult.get("ITL");
    assertEquals("ITL", getResult11.getCode());
    assertEquals("ITL", getResult11.toString());
    assertEquals(0, getResult6.getMinorUnitDigits());
    assertEquals(0, getResult11.getMinorUnitDigits());
    assertEquals(2, getResult.getMinorUnitDigits());
    assertEquals(2, getResult2.getMinorUnitDigits());
    assertEquals(2, getResult3.getMinorUnitDigits());
    assertEquals(2, getResult4.getMinorUnitDigits());
    assertEquals(2, getResult5.getMinorUnitDigits());
    assertEquals(2, getResult7.getMinorUnitDigits());
    assertEquals(2, getResult8.getMinorUnitDigits());
    assertEquals(2, getResult9.getMinorUnitDigits());
    assertEquals(2, getResult10.getMinorUnitDigits());
  }

  /**
   * Test {@link CurrencyDataLoader#loadPairs()}.
   *
   * <p>Method under test: {@link CurrencyDataLoader#loadPairs()}
   */
  @Test
  @DisplayName("Test loadPairs()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap CurrencyDataLoader.loadPairs()"})
  void testLoadPairs() {
    // Arrange and Act
    ImmutableMap<CurrencyPair, Integer> actualLoadPairsResult = CurrencyDataLoader.loadPairs();

    // Assert
    assertEquals(92, actualLoadPairsResult.size());
  }

  /**
   * Test {@link CurrencyDataLoader#loadOrdering()}.
   *
   * <p>Method under test: {@link CurrencyDataLoader#loadOrdering()}
   */
  @Test
  @DisplayName("Test loadOrdering()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap CurrencyDataLoader.loadOrdering()"})
  void testLoadOrdering() {
    // Arrange and Act
    ImmutableMap<Currency, Integer> actualLoadOrderingResult = CurrencyDataLoader.loadOrdering();

    // Assert
    assertEquals(9, actualLoadOrderingResult.size());
  }
}
