package com.opengamma.strata.measure.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultIborFutureOptionScenarioMarketDataDiffblueTest {
  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#of(IborFutureOptionMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborFutureOptionScenarioMarketData#of(IborFutureOptionMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(IborFutureOptionMarketDataLookup, ScenarioMarketData); then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborFutureOptionScenarioMarketData DefaultIborFutureOptionScenarioMarketData.of(IborFutureOptionMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    DefaultIborFutureOptionScenarioMarketData actualOfResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(1, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
    assertSame(lookup, actualOfResult.getLookup());
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultIborFutureOptionScenarioMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(ScenarioMarketData); then return DefaultIborFutureOptionScenarioMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionScenarioMarketData DefaultIborFutureOptionScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_thenReturnDefaultIborFutureOptionScenarioMarketData() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborFutureOptionScenarioMarketData ofResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    // Act
    IborFutureOptionScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultIborFutureOptionScenarioMarketData);
    assertEquals(1, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName(
      "Test getScenarioCount(); given LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultIborFutureOptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_givenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1, DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData).getScenarioCount());
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultIborFutureOptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(
        0,
        DefaultIborFutureOptionScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty())
            .getScenarioCount());
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link DefaultIborFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int); when zero; then return DefaultIborFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionMarketData DefaultIborFutureOptionScenarioMarketData.scenario(int)"
  })
  void testScenario_whenZero_thenReturnDefaultIborFutureOptionMarketData() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    IborFutureOptionMarketData actualScenarioResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData).scenario(0);

    // Assert
    assertTrue(actualScenarioResult instanceof DefaultIborFutureOptionMarketData);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborFutureOptionScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultIborFutureOptionScenarioMarketData> actualMetaResult =
        DefaultIborFutureOptionScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultIborFutureOptionScenarioMarketData> expectedBeanTypeResult =
        DefaultIborFutureOptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborFutureOptionScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    TypedMetaBean<DefaultIborFutureOptionScenarioMarketData> actualMetaBeanResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultIborFutureOptionScenarioMarketData> expectedBeanTypeResult =
        DefaultIborFutureOptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborFutureOptionScenarioMarketData#toString()}
   *   <li>{@link DefaultIborFutureOptionScenarioMarketData#getLookup()}
   *   <li>{@link DefaultIborFutureOptionScenarioMarketData#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionMarketDataLookup DefaultIborFutureOptionScenarioMarketData.getLookup()",
    "ScenarioMarketData DefaultIborFutureOptionScenarioMarketData.getMarketData()",
    "String DefaultIborFutureOptionScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborFutureOptionScenarioMarketData ofResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData);

    // Act
    ofResult.toString();
    IborFutureOptionMarketDataLookup actualLookup = ofResult.getLookup();

    // Assert
    assertSame(marketData, ofResult.getMarketData());
    assertSame(lookup, actualLookup);
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}, and {@link
   * DefaultIborFutureOptionScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}
   *   <li>{@link DefaultIborFutureOptionScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultIborFutureOptionScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborFutureOptionScenarioMarketData ofResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultIborFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborFutureOptionScenarioMarketData ofResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData);
    DefaultIborFutureOptionMarketDataLookup lookup2 =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultIborFutureOptionScenarioMarketData ofResult2 =
        DefaultIborFutureOptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultIborFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IborFutureOptionMarketDataLookup lookup = mock(IborFutureOptionMarketDataLookup.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborFutureOptionScenarioMarketData ofResult =
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData);
    DefaultIborFutureOptionMarketDataLookup lookup2 =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultIborFutureOptionScenarioMarketData ofResult2 =
        DefaultIborFutureOptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultIborFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData), null);
  }

  /**
   * Test {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultIborFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup lookup =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(
        DefaultIborFutureOptionScenarioMarketData.of(lookup, marketData),
        "Different type to DefaultIborFutureOptionScenarioMarketData");
  }
}
