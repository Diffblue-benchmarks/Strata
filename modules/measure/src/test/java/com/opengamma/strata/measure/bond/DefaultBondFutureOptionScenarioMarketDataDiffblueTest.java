package com.opengamma.strata.measure.bond;

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

class DefaultBondFutureOptionScenarioMarketDataDiffblueTest {
  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#of(BondFutureOptionMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultBondFutureOptionScenarioMarketData#of(BondFutureOptionMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(BondFutureOptionMarketDataLookup, ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultBondFutureOptionScenarioMarketData DefaultBondFutureOptionScenarioMarketData.of(BondFutureOptionMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();

    // Act
    DefaultBondFutureOptionScenarioMarketData actualOfResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#of(BondFutureOptionMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultBondFutureOptionScenarioMarketData#of(BondFutureOptionMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(BondFutureOptionMarketDataLookup, ScenarioMarketData); when LocalDate with '1970' and one and one; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultBondFutureOptionScenarioMarketData DefaultBondFutureOptionScenarioMarketData.of(BondFutureOptionMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    DefaultBondFutureOptionScenarioMarketData actualOfResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(1, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultBondFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test withMarketData(ScenarioMarketData); then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionScenarioMarketData DefaultBondFutureOptionScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    // Act
    BondFutureOptionScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultBondFutureOptionScenarioMarketData);
    assertEquals(1, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultBondFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionScenarioMarketData DefaultBondFutureOptionScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);
    ImmutableScenarioMarketData marketData2 = ImmutableScenarioMarketData.empty();

    // Act
    BondFutureOptionScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultBondFutureOptionScenarioMarketData);
    assertEquals(0, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName(
      "Test getScenarioCount(); given LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultBondFutureOptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_givenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1, DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData).getScenarioCount());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultBondFutureOptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(
        0,
        DefaultBondFutureOptionScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty())
            .getScenarioCount());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link DefaultBondFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int); when zero; then return DefaultBondFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionMarketData DefaultBondFutureOptionScenarioMarketData.scenario(int)"
  })
  void testScenario_whenZero_thenReturnDefaultBondFutureOptionMarketData() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    BondFutureOptionMarketData actualScenarioResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData).scenario(0);

    // Assert
    assertTrue(actualScenarioResult instanceof DefaultBondFutureOptionMarketData);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultBondFutureOptionScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultBondFutureOptionScenarioMarketData> actualMetaResult =
        DefaultBondFutureOptionScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultBondFutureOptionScenarioMarketData> expectedBeanTypeResult =
        DefaultBondFutureOptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultBondFutureOptionScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    TypedMetaBean<DefaultBondFutureOptionScenarioMarketData> actualMetaBeanResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultBondFutureOptionScenarioMarketData> expectedBeanTypeResult =
        DefaultBondFutureOptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultBondFutureOptionScenarioMarketData#toString()}
   *   <li>{@link DefaultBondFutureOptionScenarioMarketData#getLookup()}
   *   <li>{@link DefaultBondFutureOptionScenarioMarketData#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionMarketDataLookup DefaultBondFutureOptionScenarioMarketData.getLookup()",
    "ScenarioMarketData DefaultBondFutureOptionScenarioMarketData.getMarketData()",
    "String DefaultBondFutureOptionScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);

    // Act
    ofResult.toString();
    BondFutureOptionMarketDataLookup actualLookup = ofResult.getLookup();

    // Assert
    assertSame(marketData, ofResult.getMarketData());
    assertSame(lookup, actualLookup);
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}, and {@link
   * DefaultBondFutureOptionScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}
   *   <li>{@link DefaultBondFutureOptionScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultBondFutureOptionScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultBondFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);
    DefaultBondFutureOptionMarketDataLookup lookup2 =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult2 =
        DefaultBondFutureOptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultBondFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    BondFutureOptionMarketDataLookup lookup = mock(BondFutureOptionMarketDataLookup.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult =
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData);
    DefaultBondFutureOptionMarketDataLookup lookup2 =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultBondFutureOptionScenarioMarketData ofResult2 =
        DefaultBondFutureOptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultBondFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData), null);
  }

  /**
   * Test {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultBondFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultBondFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultBondFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup lookup =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(
        DefaultBondFutureOptionScenarioMarketData.of(lookup, marketData),
        "Different type to DefaultBondFutureOptionScenarioMarketData");
  }
}
