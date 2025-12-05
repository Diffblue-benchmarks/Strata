package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.MarketData;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultBondFutureOptionMarketDataDiffblueTest {
  /**
   * Test {@link DefaultBondFutureOptionMarketData#of(BondFutureOptionMarketDataLookup,
   * MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultBondFutureOptionMarketData#of(BondFutureOptionMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(BondFutureOptionMarketDataLookup, MarketData); when MarketData; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultBondFutureOptionMarketData DefaultBondFutureOptionMarketData.of(BondFutureOptionMarketDataLookup, MarketData)"
  })
  void testOf_whenMarketData_thenReturnValuationDateIsNull() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultBondFutureOptionMarketData actualOfResult =
        DefaultBondFutureOptionMarketData.of(lookup, marketData);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return {@link DefaultBondFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); when MarketData; then return DefaultBondFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionMarketData DefaultBondFutureOptionMarketData.withMarketData(MarketData)"
  })
  void testWithMarketData_whenMarketData_thenReturnDefaultBondFutureOptionMarketData() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    BondFutureOptionMarketData actualWithMarketDataResult =
        DefaultBondFutureOptionMarketData.of(lookup, mock(MarketData.class))
            .withMarketData(marketData);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultBondFutureOptionMarketData);
    assertNull(actualWithMarketDataResult.getValuationDate());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(marketData, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultBondFutureOptionMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultBondFutureOptionMarketData> actualMetaResult =
        DefaultBondFutureOptionMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultBondFutureOptionMarketData> expectedBeanTypeResult =
        DefaultBondFutureOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultBondFutureOptionMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultBondFutureOptionMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<DefaultBondFutureOptionMarketData> actualMetaBeanResult =
        DefaultBondFutureOptionMarketData.of(
                DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>()), mock(MarketData.class))
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultBondFutureOptionMarketData> expectedBeanTypeResult =
        DefaultBondFutureOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
