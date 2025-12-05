package com.opengamma.strata.measure.index;

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

class DefaultIborFutureOptionMarketDataDiffblueTest {
  /**
   * Test {@link DefaultIborFutureOptionMarketData#of(IborFutureOptionMarketDataLookup,
   * MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborFutureOptionMarketData#of(IborFutureOptionMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(IborFutureOptionMarketDataLookup, MarketData); when MarketData; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborFutureOptionMarketData DefaultIborFutureOptionMarketData.of(IborFutureOptionMarketDataLookup, MarketData)"
  })
  void testOf_whenMarketData_thenReturnValuationDateIsNull() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultIborFutureOptionMarketData actualOfResult =
        DefaultIborFutureOptionMarketData.of(lookup, marketData);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return {@link DefaultIborFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); when MarketData; then return DefaultIborFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionMarketData DefaultIborFutureOptionMarketData.withMarketData(MarketData)"
  })
  void testWithMarketData_whenMarketData_thenReturnDefaultIborFutureOptionMarketData() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    IborFutureOptionMarketData actualWithMarketDataResult =
        DefaultIborFutureOptionMarketData.of(lookup, mock(MarketData.class))
            .withMarketData(marketData);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultIborFutureOptionMarketData);
    assertNull(actualWithMarketDataResult.getValuationDate());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(marketData, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborFutureOptionMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultIborFutureOptionMarketData> actualMetaResult =
        DefaultIborFutureOptionMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultIborFutureOptionMarketData> expectedBeanTypeResult =
        DefaultIborFutureOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultIborFutureOptionMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborFutureOptionMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<DefaultIborFutureOptionMarketData> actualMetaBeanResult =
        DefaultIborFutureOptionMarketData.of(
                DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>()), mock(MarketData.class))
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultIborFutureOptionMarketData> expectedBeanTypeResult =
        DefaultIborFutureOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
