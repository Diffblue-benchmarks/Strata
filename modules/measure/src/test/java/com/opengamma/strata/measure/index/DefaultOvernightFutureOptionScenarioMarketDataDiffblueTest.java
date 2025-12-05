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

class DefaultOvernightFutureOptionScenarioMarketDataDiffblueTest {
  /**
   * Test {@link
   * DefaultOvernightFutureOptionScenarioMarketData#of(OvernightFutureOptionMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionScenarioMarketData#of(OvernightFutureOptionMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightFutureOptionMarketDataLookup, ScenarioMarketData); then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultOvernightFutureOptionScenarioMarketData DefaultOvernightFutureOptionScenarioMarketData.of(OvernightFutureOptionMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    DefaultOvernightFutureOptionScenarioMarketData actualOfResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(1, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
    assertSame(lookup, actualOfResult.getLookup());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultOvernightFutureOptionScenarioMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultOvernightFutureOptionScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(ScenarioMarketData); then return DefaultOvernightFutureOptionScenarioMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionScenarioMarketData DefaultOvernightFutureOptionScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_thenReturnDefaultOvernightFutureOptionScenarioMarketData() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultOvernightFutureOptionScenarioMarketData ofResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    // Act
    OvernightFutureOptionScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(
        actualWithMarketDataResult instanceof DefaultOvernightFutureOptionScenarioMarketData);
    assertEquals(1, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName(
      "Test getScenarioCount(); given LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultOvernightFutureOptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_givenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1,
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData).getScenarioCount());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultOvernightFutureOptionScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(
        0,
        DefaultOvernightFutureOptionScenarioMarketData.of(
                lookup, ImmutableScenarioMarketData.empty())
            .getScenarioCount());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link DefaultOvernightFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int); when zero; then return DefaultOvernightFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionMarketData DefaultOvernightFutureOptionScenarioMarketData.scenario(int)"
  })
  void testScenario_whenZero_thenReturnDefaultOvernightFutureOptionMarketData() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    OvernightFutureOptionMarketData actualScenarioResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData).scenario(0);

    // Assert
    assertTrue(actualScenarioResult instanceof DefaultOvernightFutureOptionMarketData);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultOvernightFutureOptionScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultOvernightFutureOptionScenarioMarketData> actualMetaResult =
        DefaultOvernightFutureOptionScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultOvernightFutureOptionScenarioMarketData> expectedBeanTypeResult =
        DefaultOvernightFutureOptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultOvernightFutureOptionScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    TypedMetaBean<DefaultOvernightFutureOptionScenarioMarketData> actualMetaBeanResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultOvernightFutureOptionScenarioMarketData> expectedBeanTypeResult =
        DefaultOvernightFutureOptionScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultOvernightFutureOptionScenarioMarketData#toString()}
   *   <li>{@link DefaultOvernightFutureOptionScenarioMarketData#getLookup()}
   *   <li>{@link DefaultOvernightFutureOptionScenarioMarketData#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionMarketDataLookup DefaultOvernightFutureOptionScenarioMarketData.getLookup()",
    "ScenarioMarketData DefaultOvernightFutureOptionScenarioMarketData.getMarketData()",
    "String DefaultOvernightFutureOptionScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultOvernightFutureOptionScenarioMarketData ofResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData);

    // Act
    ofResult.toString();
    OvernightFutureOptionMarketDataLookup actualLookup = ofResult.getLookup();

    // Assert
    assertSame(marketData, ofResult.getMarketData());
    assertSame(lookup, actualLookup);
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}, and {@link
   * DefaultOvernightFutureOptionScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}
   *   <li>{@link DefaultOvernightFutureOptionScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultOvernightFutureOptionScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultOvernightFutureOptionScenarioMarketData ofResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultOvernightFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultOvernightFutureOptionScenarioMarketData ofResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData);
    DefaultOvernightFutureOptionMarketDataLookup lookup2 =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultOvernightFutureOptionScenarioMarketData ofResult2 =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultOvernightFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    OvernightFutureOptionMarketDataLookup lookup =
        mock(OvernightFutureOptionMarketDataLookup.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultOvernightFutureOptionScenarioMarketData ofResult =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData);
    DefaultOvernightFutureOptionMarketDataLookup lookup2 =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultOvernightFutureOptionScenarioMarketData ofResult2 =
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultOvernightFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData), null);
  }

  /**
   * Test {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultOvernightFutureOptionScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultOvernightFutureOptionScenarioMarketData.equals(Object)",
    "int DefaultOvernightFutureOptionScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup lookup =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(
        DefaultOvernightFutureOptionScenarioMarketData.of(lookup, marketData),
        "Different type to DefaultOvernightFutureOptionScenarioMarketData");
  }
}
