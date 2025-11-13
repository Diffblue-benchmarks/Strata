package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.pricer.credit.CreditRatesProvider;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultCreditRatesMarketDataDiffblueTest {
  /**
   * Test {@link DefaultCreditRatesMarketData#of(CreditRatesMarketDataLookup, MarketData)}.
   *
   * <ul>
   *   <li>Then creditRatesProvider return {@link DefaultLookupCreditRatesProvider}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketData#of(CreditRatesMarketDataLookup,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(CreditRatesMarketDataLookup, MarketData); then creditRatesProvider return DefaultLookupCreditRatesProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCreditRatesMarketData DefaultCreditRatesMarketData.of(CreditRatesMarketDataLookup, MarketData)"
  })
  void testOf_thenCreditRatesProviderReturnDefaultLookupCreditRatesProvider() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultCreditRatesMarketData actualOfResult =
        DefaultCreditRatesMarketData.of(lookup, marketData);

    // Assert
    CreditRatesProvider creditRatesProviderResult = actualOfResult.creditRatesProvider();
    assertTrue(creditRatesProviderResult instanceof DefaultLookupCreditRatesProvider);
    assertNull(actualOfResult.getValuationDate());
    assertNull(creditRatesProviderResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(lookup, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
    assertSame(
        marketData, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getMarketData());
  }

  /**
   * Test {@link DefaultCreditRatesMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return {@link DefaultCreditRatesMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); when MarketData; then return DefaultCreditRatesMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CreditRatesMarketData DefaultCreditRatesMarketData.withMarketData(MarketData)"
  })
  void testWithMarketData_whenMarketData_thenReturnDefaultCreditRatesMarketData() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    DefaultCreditRatesMarketData ofResult =
        DefaultCreditRatesMarketData.of(lookup, mock(MarketData.class));
    MarketData marketData = mock(MarketData.class);

    // Act
    CreditRatesMarketData actualWithMarketDataResult = ofResult.withMarketData(marketData);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultCreditRatesMarketData);
    CreditRatesProvider creditRatesProviderResult =
        actualWithMarketDataResult.creditRatesProvider();
    assertTrue(creditRatesProviderResult instanceof DefaultLookupCreditRatesProvider);
    assertNull(actualWithMarketDataResult.getValuationDate());
    assertNull(creditRatesProviderResult.getValuationDate());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(lookup, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getLookup());
    assertSame(marketData, actualWithMarketDataResult.getMarketData());
    assertSame(
        marketData, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getMarketData());
  }

  /**
   * Test {@link DefaultCreditRatesMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCreditRatesMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultCreditRatesMarketData> actualMetaResult =
        DefaultCreditRatesMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultCreditRatesMarketData> expectedBeanTypeResult = DefaultCreditRatesMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultCreditRatesMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCreditRatesMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    DefaultCreditRatesMarketData ofResult =
        DefaultCreditRatesMarketData.of(lookup, mock(MarketData.class));

    // Act
    TypedMetaBean<DefaultCreditRatesMarketData> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultCreditRatesMarketData> expectedBeanTypeResult = DefaultCreditRatesMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
