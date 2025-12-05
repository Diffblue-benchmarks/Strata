package com.opengamma.strata.measure.capfloor;

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

class DefaultIborCapFloorScenarioMarketDataDiffblueTest {
  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#of(IborCapFloorMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborCapFloorScenarioMarketData#of(IborCapFloorMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(IborCapFloorMarketDataLookup, ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborCapFloorScenarioMarketData DefaultIborCapFloorScenarioMarketData.of(IborCapFloorMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();

    // Act
    DefaultIborCapFloorScenarioMarketData actualOfResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#of(IborCapFloorMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborCapFloorScenarioMarketData#of(IborCapFloorMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(IborCapFloorMarketDataLookup, ScenarioMarketData); when LocalDate with '1970' and one and one; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultIborCapFloorScenarioMarketData DefaultIborCapFloorScenarioMarketData.of(IborCapFloorMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    DefaultIborCapFloorScenarioMarketData actualOfResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);

    // Assert
    assertEquals(1, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborCapFloorScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test withMarketData(ScenarioMarketData); then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapFloorScenarioMarketData DefaultIborCapFloorScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    // Act
    IborCapFloorScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultIborCapFloorScenarioMarketData);
    assertEquals(1, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultIborCapFloorScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapFloorScenarioMarketData DefaultIborCapFloorScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);
    ImmutableScenarioMarketData marketData2 = ImmutableScenarioMarketData.empty();

    // Act
    IborCapFloorScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultIborCapFloorScenarioMarketData);
    assertEquals(0, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName(
      "Test getScenarioCount(); given LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultIborCapFloorScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_givenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1, DefaultIborCapFloorScenarioMarketData.of(lookup, marketData).getScenarioCount());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultIborCapFloorScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act and Assert
    assertEquals(
        0,
        DefaultIborCapFloorScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty())
            .getScenarioCount());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link DefaultIborCapFloorMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int); when zero; then return DefaultIborCapFloorMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborCapFloorMarketData DefaultIborCapFloorScenarioMarketData.scenario(int)"})
  void testScenario_whenZero_thenReturnDefaultIborCapFloorMarketData() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    IborCapFloorMarketData actualScenarioResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData).scenario(0);

    // Assert
    assertTrue(actualScenarioResult instanceof DefaultIborCapFloorMarketData);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(valuationDate, valuationDate2);
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborCapFloorScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultIborCapFloorScenarioMarketData> actualMetaResult =
        DefaultIborCapFloorScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultIborCapFloorScenarioMarketData> expectedBeanTypeResult =
        DefaultIborCapFloorScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultIborCapFloorScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    TypedMetaBean<DefaultIborCapFloorScenarioMarketData> actualMetaBeanResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultIborCapFloorScenarioMarketData> expectedBeanTypeResult =
        DefaultIborCapFloorScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborCapFloorScenarioMarketData#toString()}
   *   <li>{@link DefaultIborCapFloorScenarioMarketData#getLookup()}
   *   <li>{@link DefaultIborCapFloorScenarioMarketData#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapFloorMarketDataLookup DefaultIborCapFloorScenarioMarketData.getLookup()",
    "ScenarioMarketData DefaultIborCapFloorScenarioMarketData.getMarketData()",
    "String DefaultIborCapFloorScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);

    // Act
    ofResult.toString();
    IborCapFloorMarketDataLookup actualLookup = ofResult.getLookup();

    // Assert
    assertSame(marketData, ofResult.getMarketData());
    assertSame(lookup, actualLookup);
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}, and {@link
   * DefaultIborCapFloorScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultIborCapFloorScenarioMarketData#equals(Object)}
   *   <li>{@link DefaultIborCapFloorScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorScenarioMarketData.equals(Object)",
    "int DefaultIborCapFloorScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorScenarioMarketData.equals(Object)",
    "int DefaultIborCapFloorScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);
    DefaultIborCapFloorMarketDataLookup lookup2 =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult2 =
        DefaultIborCapFloorScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorScenarioMarketData.equals(Object)",
    "int DefaultIborCapFloorScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IborCapFloorMarketDataLookup lookup = mock(IborCapFloorMarketDataLookup.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult =
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData);
    DefaultIborCapFloorMarketDataLookup lookup2 =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultIborCapFloorScenarioMarketData ofResult2 =
        DefaultIborCapFloorScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorScenarioMarketData.equals(Object)",
    "int DefaultIborCapFloorScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(DefaultIborCapFloorScenarioMarketData.of(lookup, marketData), null);
  }

  /**
   * Test {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultIborCapFloorScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultIborCapFloorScenarioMarketData.equals(Object)",
    "int DefaultIborCapFloorScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup lookup =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertNotEquals(
        DefaultIborCapFloorScenarioMarketData.of(lookup, marketData),
        "Different type to DefaultIborCapFloorScenarioMarketData");
  }
}
