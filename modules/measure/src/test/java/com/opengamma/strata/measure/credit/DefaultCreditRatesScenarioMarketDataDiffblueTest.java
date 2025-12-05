package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.credit.CreditRatesProvider;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultCreditRatesScenarioMarketDataDiffblueTest {
  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#of(CreditRatesMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesScenarioMarketData#of(CreditRatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(CreditRatesMarketDataLookup, ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCreditRatesScenarioMarketData DefaultCreditRatesScenarioMarketData.of(CreditRatesMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();

    // Act
    DefaultCreditRatesScenarioMarketData actualOfResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Assert
    assertTrue(actualOfResult.getLookup() instanceof DefaultCreditRatesMarketDataLookup);
    assertEquals(0, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#of(CreditRatesMarketDataLookup,
   * ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesScenarioMarketData#of(CreditRatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(CreditRatesMarketDataLookup, ScenarioMarketData); when LocalDate with '1970' and one and one; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCreditRatesScenarioMarketData DefaultCreditRatesScenarioMarketData.of(CreditRatesMarketDataLookup, ScenarioMarketData)"
  })
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnScenarioCountIsOne() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    DefaultCreditRatesScenarioMarketData actualOfResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Assert
    assertTrue(actualOfResult.getLookup() instanceof DefaultCreditRatesMarketDataLookup);
    assertEquals(1, actualOfResult.getScenarioCount());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test withMarketData(ScenarioMarketData); then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCreditRatesScenarioMarketData DefaultCreditRatesScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_thenReturnScenarioCountIsOne() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    // Act
    DefaultCreditRatesScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(
        actualWithMarketDataResult.getLookup() instanceof DefaultCreditRatesMarketDataLookup);
    assertEquals(1, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#withMarketData(ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesScenarioMarketData#withMarketData(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test withMarketData(ScenarioMarketData); when empty; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCreditRatesScenarioMarketData DefaultCreditRatesScenarioMarketData.withMarketData(ScenarioMarketData)"
  })
  void testWithMarketData_whenEmpty_thenReturnScenarioCountIsZero() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);
    ImmutableScenarioMarketData marketData2 = ImmutableScenarioMarketData.empty();

    // Act
    DefaultCreditRatesScenarioMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData2);

    // Assert
    assertTrue(
        actualWithMarketDataResult.getLookup() instanceof DefaultCreditRatesMarketDataLookup);
    assertEquals(0, actualWithMarketDataResult.getScenarioCount());
    assertSame(marketData2, actualWithMarketDataResult.getMarketData());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName(
      "Test getScenarioCount(); given LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultCreditRatesScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_givenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(1, ofResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultCreditRatesScenarioMarketData.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(
        0,
        DefaultCreditRatesScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty())
            .getScenarioCount());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} All is {@link HashMap#HashMap()}.
   *   <li>Then return {@link DefaultCreditRatesMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName(
      "Test scenario(int); given HashMap() All is HashMap(); then return DefaultCreditRatesMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreditRatesMarketData DefaultCreditRatesScenarioMarketData.scenario(int)"})
  void testScenario_givenHashMapAllIsHashMap_thenReturnDefaultCreditRatesMarketData() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    creditCurveIds.putAll(new HashMap<>());
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act
    CreditRatesMarketData actualScenarioResult = ofResult.scenario(0);

    // Assert
    assertTrue(actualScenarioResult instanceof DefaultCreditRatesMarketData);
    CreditRatesProvider creditRatesProviderResult = actualScenarioResult.creditRatesProvider();
    assertTrue(creditRatesProviderResult instanceof DefaultLookupCreditRatesProvider);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(lookup, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getLookup());
    assertSame(valuationDate, valuationDate2);
    assertSame(valuationDate, creditRatesProviderResult.getValuationDate());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#scenario(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link DefaultCreditRatesMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int); when zero; then return DefaultCreditRatesMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreditRatesMarketData DefaultCreditRatesScenarioMarketData.scenario(int)"})
  void testScenario_whenZero_thenReturnDefaultCreditRatesMarketData() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act
    CreditRatesMarketData actualScenarioResult = ofResult.scenario(0);

    // Assert
    assertTrue(actualScenarioResult instanceof DefaultCreditRatesMarketData);
    CreditRatesProvider creditRatesProviderResult = actualScenarioResult.creditRatesProvider();
    assertTrue(creditRatesProviderResult instanceof DefaultLookupCreditRatesProvider);
    LocalDate valuationDate2 = actualScenarioResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(lookup, actualScenarioResult.getLookup());
    assertSame(lookup, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getLookup());
    assertSame(valuationDate, valuationDate2);
    assertSame(valuationDate, creditRatesProviderResult.getValuationDate());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCreditRatesScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultCreditRatesScenarioMarketData> actualMetaResult =
        DefaultCreditRatesScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultCreditRatesScenarioMarketData> expectedBeanTypeResult =
        DefaultCreditRatesScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#metaBean()}.
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCreditRatesScenarioMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act
    TypedMetaBean<DefaultCreditRatesScenarioMarketData> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultCreditRatesScenarioMarketData> expectedBeanTypeResult =
        DefaultCreditRatesScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCreditRatesScenarioMarketData#toString()}
   *   <li>{@link DefaultCreditRatesScenarioMarketData#getLookup()}
   *   <li>{@link DefaultCreditRatesScenarioMarketData#getMarketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CreditRatesMarketDataLookup DefaultCreditRatesScenarioMarketData.getLookup()",
    "ScenarioMarketData DefaultCreditRatesScenarioMarketData.getMarketData()",
    "String DefaultCreditRatesScenarioMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act
    ofResult.toString();
    CreditRatesMarketDataLookup actualLookup = ofResult.getLookup();

    // Assert
    assertSame(marketData, ofResult.getMarketData());
    assertSame(lookup, actualLookup);
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#equals(Object)}, and {@link
   * DefaultCreditRatesScenarioMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCreditRatesScenarioMarketData#equals(Object)}
   *   <li>{@link DefaultCreditRatesScenarioMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesScenarioMarketData.equals(Object)",
    "int DefaultCreditRatesScenarioMarketData.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesScenarioMarketData.equals(Object)",
    "int DefaultCreditRatesScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds2 = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds2 = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds2 = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup2 =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds2, discountCurveIds2, recoveryRateCurveIds2, ObservableSource.of("Name"));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult2 =
        DefaultCreditRatesScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesScenarioMarketData.equals(Object)",
    "int DefaultCreditRatesScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CreditRatesMarketDataLookup lookup = mock(CreditRatesMarketDataLookup.class);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup2 =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate2 = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap2 = new HashMap<>();

    TestMarketDataMap marketData2 =
        new TestMarketDataMap(valuationDate2, valueMap2, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult2 =
        DefaultCreditRatesScenarioMarketData.of(lookup2, marketData2);

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesScenarioMarketData.equals(Object)",
    "int DefaultCreditRatesScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultCreditRatesScenarioMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesScenarioMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesScenarioMarketData.equals(Object)",
    "int DefaultCreditRatesScenarioMarketData.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultCreditRatesScenarioMarketData ofResult =
        DefaultCreditRatesScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultCreditRatesScenarioMarketData");
  }
}
