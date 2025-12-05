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

class DefaultOvernightFutureOptionMarketDataDiffblueTest {
  /**
   * Test {@link DefaultOvernightFutureOptionMarketData#of(OvernightFutureOptionMarketDataLookup,
   * MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionMarketData#of(OvernightFutureOptionMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightFutureOptionMarketDataLookup, MarketData); when MarketData; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultOvernightFutureOptionMarketData DefaultOvernightFutureOptionMarketData.of(OvernightFutureOptionMarketDataLookup, MarketData)"
  })
  void testOf_whenMarketData_thenReturnValuationDateIsNull() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultOvernightFutureOptionMarketData actualOfResult =
        DefaultOvernightFutureOptionMarketData.of(lookup, marketData);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultOvernightFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); then return DefaultOvernightFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionMarketData DefaultOvernightFutureOptionMarketData.withMarketData(MarketData)"
  })
  void testWithMarketData_thenReturnDefaultOvernightFutureOptionMarketData() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    OvernightFutureOptionMarketData actualWithMarketDataResult =
        DefaultOvernightFutureOptionMarketData.of(lookup, mock(MarketData.class))
            .withMarketData(marketData);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultOvernightFutureOptionMarketData);
    assertNull(actualWithMarketDataResult.getValuationDate());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(marketData, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultOvernightFutureOptionMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultOvernightFutureOptionMarketData> actualMetaResult =
        DefaultOvernightFutureOptionMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultOvernightFutureOptionMarketData> expectedBeanTypeResult =
        DefaultOvernightFutureOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultOvernightFutureOptionMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<DefaultOvernightFutureOptionMarketData> actualMetaBeanResult =
        DefaultOvernightFutureOptionMarketData.of(
                DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>()),
                mock(MarketData.class))
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultOvernightFutureOptionMarketData> expectedBeanTypeResult =
        DefaultOvernightFutureOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
