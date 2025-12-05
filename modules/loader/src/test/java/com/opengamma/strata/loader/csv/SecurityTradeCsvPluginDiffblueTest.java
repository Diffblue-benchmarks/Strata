package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.SecurityTrade;
import com.opengamma.strata.product.bond.BillTrade;
import com.opengamma.strata.product.bond.BondFutureOptionTrade;
import com.opengamma.strata.product.bond.CapitalIndexedBondTrade;
import com.opengamma.strata.product.bond.FixedCouponBondTrade;
import com.opengamma.strata.product.dsf.DsfTrade;
import com.opengamma.strata.product.etd.EtdFutureTrade;
import com.opengamma.strata.product.etd.EtdOptionTrade;
import com.opengamma.strata.product.index.IborFutureOptionTrade;
import com.opengamma.strata.product.index.IborFutureTrade;
import com.opengamma.strata.product.index.OvernightFutureTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityTradeCsvPluginDiffblueTest {
  /**
   * Test {@link SecurityTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link SecurityTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SecurityTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = SecurityTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(1, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("SECURITY"));
  }

  /**
   * Test {@link SecurityTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link SecurityTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SecurityTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult = SecurityTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(5, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.BUY_SELL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PRICE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.QUANTITY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.SECURITY_ID_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.SECURITY_ID_SCHEME_FIELD));
  }

  /**
   * Test {@link SecurityTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link SecurityTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SecurityTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("SecurityTrade", SecurityTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link SecurityTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link SecurityTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SecurityTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        SecurityTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(11, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(SecurityTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(BillTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(BondFutureOptionTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(CapitalIndexedBondTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(FixedCouponBondTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(DsfTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(EtdFutureTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(EtdOptionTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(IborFutureOptionTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(IborFutureTrade.class));
    assertTrue(actualSupportedTradeTypesResult.contains(OvernightFutureTrade.class));
  }
}
