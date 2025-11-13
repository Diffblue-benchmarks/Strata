package com.opengamma.strata.measure.swaption;

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

class DefaultSwaptionScenarioMarketDataDiffblueTest {
  /**
   * Test {@link DefaultSwaptionScenarioMarketData#of(SwaptionMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#of(SwaptionMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(SwaptionMarketDataLookup, ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSwaptionScenarioMarketData DefaultSwaptionScenarioMarketData.of(SwaptionMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();

    // Act
    DefaultSwaptionScenarioMarketData actualOfResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#of(SwaptionMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#of(SwaptionMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(SwaptionMarketDataLookup, ScenarioMarketData); when LocalDate with '1970' and one and one; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSwaptionScenarioMarketData DefaultSwaptionScenarioMarketData.of(SwaptionMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    DefaultSwaptionScenarioMarketData actualOfResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(1, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultSwaptionScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test withMarketData(ScenarioMarketData); then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionScenarioMarketData DefaultSwaptionScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    // Act
    SwaptionScenarioMarketData actualWithMarketDataResult = ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultSwaptionScenarioMarketData);
    assertEquals(1, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultSwaptionScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionScenarioMarketData DefaultSwaptionScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);
    ImmutableScenarioMarketData marketData2 = ImmutableScenarioMarketData.empty();

    // Act
    SwaptionScenarioMarketData actualWithMarketDataResult = ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultSwaptionScenarioMarketData);
    assertEquals(0, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName(
      "Test getScenarioCount(); given LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultSwaptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_givenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(1, DefaultSwaptionScenarioMarketData.of(lookup, marketData).getScenarioCount());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultSwaptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(
        0,
        DefaultSwaptionScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty())
            .getScenarioCount());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link DefaultSwaptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int); when zero; then return DefaultSwaptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionMarketData DefaultSwaptionScenarioMarketData.scenario(int)"})
  void testScenario_whenZero_thenReturnDefaultSwaptionMarketData() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    SwaptionMarketData actualScenarioResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData).scenario(0);

    // Assert
    assertTrue(actualScenarioResult instanceof DefaultSwaptionMarketData);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultSwaptionScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultSwaptionScenarioMarketData> actualMetaResult =
        DefaultSwaptionScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultSwaptionScenarioMarketData> expectedBeanTypeResult =
        DefaultSwaptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultSwaptionScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    TypedMetaBean<DefaultSwaptionScenarioMarketData> actualMetaBeanResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultSwaptionScenarioMarketData> expectedBeanTypeResult =
        DefaultSwaptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSwaptionScenarioMarketData#toString()}
   *   <li>{@link DefaultSwaptionScenarioMarketData#getLookup()}
   *   <li>{@link DefaultSwaptionScenarioMarketData#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionMarketDataLookup DefaultSwaptionScenarioMarketData.getLookup()",
    "ScenarioMarketData DefaultSwaptionScenarioMarketData.getMarketData()",
    "String DefaultSwaptionScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);

    // Act
    ofResult.toString();
    SwaptionMarketDataLookup actualLookup = ofResult.getLookup();

    // Assert
    assertSame(marketData, ofResult.getMarketData());
    assertSame(lookup, actualLookup);
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#equals(Object)}, and {@link
   * DefaultSwaptionScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSwaptionScenarioMarketData#equals(Object)}
   *   <li>{@link DefaultSwaptionScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionScenarioMarketData.equals(Object)",
    "int DefaultSwaptionScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionScenarioMarketData.equals(Object)",
    "int DefaultSwaptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);
    DefaultSwaptionMarketDataLookup lookup2 = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult2 =
        DefaultSwaptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionScenarioMarketData.equals(Object)",
    "int DefaultSwaptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SwaptionMarketDataLookup lookup = mock(SwaptionMarketDataLookup.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);
    DefaultSwaptionMarketDataLookup lookup2 = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultSwaptionScenarioMarketData ofResult2 =
        DefaultSwaptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionScenarioMarketData.equals(Object)",
    "int DefaultSwaptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(DefaultSwaptionScenarioMarketData.of(lookup, marketData), null);
  }

  /**
   * Test {@link DefaultSwaptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSwaptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSwaptionScenarioMarketData.equals(Object)",
    "int DefaultSwaptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(
        DefaultSwaptionScenarioMarketData.of(lookup, marketData),
        "Different type to DefaultSwaptionScenarioMarketData");
  }
}
