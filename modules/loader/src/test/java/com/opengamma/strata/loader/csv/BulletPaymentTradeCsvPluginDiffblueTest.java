package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.payment.BulletPaymentTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BulletPaymentTradeCsvPluginDiffblueTest {
  /**
   * Test {@link BulletPaymentTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link BulletPaymentTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BulletPaymentTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = BulletPaymentTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(3, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("BULLET PAYMENT"));
    assertTrue(actualTradeTypeNamesResult.contains("BULLET"));
    assertTrue(actualTradeTypeNamesResult.contains("BULLETPAYMENT"));
  }

  /**
   * Test {@link BulletPaymentTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link BulletPaymentTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BulletPaymentTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("BulletPaymentTrade", BulletPaymentTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link BulletPaymentTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link BulletPaymentTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BulletPaymentTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        BulletPaymentTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(BulletPaymentTrade.class));
  }

  /**
   * Test {@link BulletPaymentTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link BulletPaymentTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BulletPaymentTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult =
        BulletPaymentTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(6, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DIRECTION_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_CAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_CNV_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_FIELD));
  }
}
