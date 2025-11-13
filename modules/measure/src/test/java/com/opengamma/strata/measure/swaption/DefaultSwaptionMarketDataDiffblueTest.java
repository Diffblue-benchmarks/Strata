package com.opengamma.strata.measure.swaption;

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

class DefaultSwaptionMarketDataDiffblueTest {
  /**
   * Test {@link DefaultSwaptionMarketData#of(SwaptionMarketDataLookup, MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketData#of(SwaptionMarketDataLookup,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(SwaptionMarketDataLookup, MarketData); when MarketData; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSwaptionMarketData DefaultSwaptionMarketData.of(SwaptionMarketDataLookup, MarketData)"
  })
  void testOf_whenMarketData_thenReturnValuationDateIsNull() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultSwaptionMarketData actualOfResult = DefaultSwaptionMarketData.of(lookup, marketData);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultSwaptionMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return {@link DefaultSwaptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); when MarketData; then return DefaultSwaptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionMarketData DefaultSwaptionMarketData.withMarketData(MarketData)"})
  void testWithMarketData_whenMarketData_thenReturnDefaultSwaptionMarketData() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    SwaptionMarketData actualWithMarketDataResult =
        DefaultSwaptionMarketData.of(lookup, mock(MarketData.class)).withMarketData(marketData);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultSwaptionMarketData);
    assertNull(actualWithMarketDataResult.getValuationDate());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(marketData, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultSwaptionMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultSwaptionMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultSwaptionMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultSwaptionMarketData> actualMetaResult = DefaultSwaptionMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultSwaptionMarketData> expectedBeanTypeResult = DefaultSwaptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultSwaptionMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultSwaptionMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<DefaultSwaptionMarketData> actualMetaBeanResult =
        DefaultSwaptionMarketData.of(
                DefaultSwaptionMarketDataLookup.of(new HashMap<>()), mock(MarketData.class))
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultSwaptionMarketData> expectedBeanTypeResult = DefaultSwaptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
