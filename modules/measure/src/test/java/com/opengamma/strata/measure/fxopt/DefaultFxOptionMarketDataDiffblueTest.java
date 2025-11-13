package com.opengamma.strata.measure.fxopt;

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

class DefaultFxOptionMarketDataDiffblueTest {
  /**
   * Test {@link DefaultFxOptionMarketData#of(FxOptionMarketDataLookup, MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketData#of(FxOptionMarketDataLookup,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(FxOptionMarketDataLookup, MarketData); when MarketData; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultFxOptionMarketData DefaultFxOptionMarketData.of(FxOptionMarketDataLookup, MarketData)"
  })
  void testOf_whenMarketData_thenReturnValuationDateIsNull() {
    // Arrange
    DefaultFxOptionMarketDataLookup lookup = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultFxOptionMarketData actualOfResult = DefaultFxOptionMarketData.of(lookup, marketData);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultFxOptionMarketData#withMarketData(MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return {@link DefaultFxOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(MarketData); when MarketData; then return DefaultFxOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxOptionMarketData DefaultFxOptionMarketData.withMarketData(MarketData)"})
  void testWithMarketData_whenMarketData_thenReturnDefaultFxOptionMarketData() {
    // Arrange
    DefaultFxOptionMarketDataLookup lookup = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    FxOptionMarketData actualWithMarketDataResult =
        DefaultFxOptionMarketData.of(lookup, mock(MarketData.class)).withMarketData(marketData);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultFxOptionMarketData);
    assertNull(actualWithMarketDataResult.getValuationDate());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(marketData, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultFxOptionMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultFxOptionMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultFxOptionMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultFxOptionMarketData> actualMetaResult = DefaultFxOptionMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultFxOptionMarketData> expectedBeanTypeResult = DefaultFxOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultFxOptionMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultFxOptionMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultFxOptionMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<DefaultFxOptionMarketData> actualMetaBeanResult =
        DefaultFxOptionMarketData.of(
                DefaultFxOptionMarketDataLookup.of(new HashMap<>()), mock(MarketData.class))
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultFxOptionMarketData> expectedBeanTypeResult = DefaultFxOptionMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
