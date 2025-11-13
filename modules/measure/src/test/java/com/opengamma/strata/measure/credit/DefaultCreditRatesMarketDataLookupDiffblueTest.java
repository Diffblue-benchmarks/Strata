package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.pricer.credit.CreditRatesProvider;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultCreditRatesMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#of(Map, Map, Map, ObservableSource)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return CreditCurveIds is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#of(Map, Map, Map,
   * ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map, ObservableSource); when HashMap(); then return CreditCurveIds is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCreditRatesMarketDataLookup DefaultCreditRatesMarketDataLookup.of(Map, Map, Map, ObservableSource)"
  })
  void testOf_whenHashMap_thenReturnCreditCurveIdsIsHashMap() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    // Act
    DefaultCreditRatesMarketDataLookup actualOfResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Assert
    ImmutableMap<Pair<StandardId, Currency>, CurveId> creditCurveIds2 =
        actualOfResult.getCreditCurveIds();
    assertEquals(creditCurveIds, creditCurveIds2);
    assertSame(creditCurveIds2, actualOfResult.getDiscountCurveIds());
    assertSame(creditCurveIds2, actualOfResult.getRecoveryRateCurveIds());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getDiscountCurrencies()}.
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#getDiscountCurrencies()}
   */
  @Test
  @DisplayName("Test getDiscountCurrencies()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getDiscountCurrencies()"
  })
  void testGetDiscountCurrencies() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertTrue(ofResult.getDiscountCurrencies().isEmpty());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getDiscountMarketDataIds(Currency)}.
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesMarketDataLookup#getDiscountMarketDataIds(Currency)}
   */
  @Test
  @DisplayName("Test getDiscountMarketDataIds(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getDiscountMarketDataIds(Currency)"
  })
  void testGetDiscountMarketDataIds() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getDiscountMarketDataIds(null));
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getDiscountMarketDataIds(Currency)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} All is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesMarketDataLookup#getDiscountMarketDataIds(Currency)}
   */
  @Test
  @DisplayName("Test getDiscountMarketDataIds(Currency); given HashMap() All is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getDiscountMarketDataIds(Currency)"
  })
  void testGetDiscountMarketDataIds_givenHashMapAllIsHashMap() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    creditCurveIds.putAll(new HashMap<>());
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getDiscountMarketDataIds(null));
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getCreditLegalEntities()}.
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#getCreditLegalEntities()}
   */
  @Test
  @DisplayName("Test getCreditLegalEntities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getCreditLegalEntities()"
  })
  void testGetCreditLegalEntities() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertTrue(ofResult.getCreditLegalEntities().isEmpty());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getRecoveryRateLegalEntities()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#getRecoveryRateLegalEntities()}
   */
  @Test
  @DisplayName("Test getRecoveryRateLegalEntities(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getRecoveryRateLegalEntities()"
  })
  void testGetRecoveryRateLegalEntities_thenReturnEmpty() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertTrue(ofResult.getRecoveryRateLegalEntities().isEmpty());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getRecoveryRateLegalEntities()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#getRecoveryRateLegalEntities()}
   */
  @Test
  @DisplayName("Test getRecoveryRateLegalEntities(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getRecoveryRateLegalEntities()"
  })
  void testGetRecoveryRateLegalEntities_thenReturnSizeIsOne() {
    // Arrange
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();
    StandardId ofResult = StandardId.of("Scheme", "42");
    recoveryRateCurveIds.put(ofResult, CurveId.of("Group Name", "Curve Name"));
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult2 =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(1, ofResult2.getRecoveryRateLegalEntities().size());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getRecoveryRateMarketDataIds(StandardId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesMarketDataLookup#getRecoveryRateMarketDataIds(StandardId)}
   */
  @Test
  @DisplayName(
      "Test getRecoveryRateMarketDataIds(StandardId); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getRecoveryRateMarketDataIds(StandardId)"
  })
  void testGetRecoveryRateMarketDataIds_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getRecoveryRateMarketDataIds(null));
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#getRecoveryRateMarketDataIds(StandardId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesMarketDataLookup#getRecoveryRateMarketDataIds(StandardId)}
   */
  @Test
  @DisplayName(
      "Test getRecoveryRateMarketDataIds(StandardId); when StandardId with 'Scheme' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.google.common.collect.ImmutableSet DefaultCreditRatesMarketDataLookup.getRecoveryRateMarketDataIds(StandardId)"
  })
  void testGetRecoveryRateMarketDataIds_whenStandardIdWithSchemeAndValueIs42() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.getRecoveryRateMarketDataIds(StandardId.of("Scheme", "42")));
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#creditRatesProvider(MarketData)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultLookupCreditRatesProvider}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCreditRatesMarketDataLookup#creditRatesProvider(MarketData)}
   */
  @Test
  @DisplayName("Test creditRatesProvider(MarketData); then return DefaultLookupCreditRatesProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CreditRatesProvider DefaultCreditRatesMarketDataLookup.creditRatesProvider(MarketData)"
  })
  void testCreditRatesProvider_thenReturnDefaultLookupCreditRatesProvider() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    CreditRatesProvider actualCreditRatesProviderResult = ofResult.creditRatesProvider(marketData);

    // Assert
    assertTrue(actualCreditRatesProviderResult instanceof DefaultLookupCreditRatesProvider);
    assertNull(actualCreditRatesProviderResult.getValuationDate());
    assertSame(
        ofResult, ((DefaultLookupCreditRatesProvider) actualCreditRatesProviderResult).getLookup());
    assertSame(
        marketData,
        ((DefaultLookupCreditRatesProvider) actualCreditRatesProviderResult).getMarketData());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCreditRatesMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultCreditRatesMarketDataLookup> actualMetaResult =
        DefaultCreditRatesMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("creditCurveIds"));
    assertTrue(metaPropertyMapResult.containsKey("discountCurveIds"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(metaPropertyMapResult.containsKey("recoveryRateCurveIds"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultCreditRatesMarketDataLookup> expectedBeanTypeResult =
        DefaultCreditRatesMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultCreditRatesMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act
    TypedMetaBean<DefaultCreditRatesMarketDataLookup> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("creditCurveIds"));
    assertTrue(metaPropertyMapResult.containsKey("discountCurveIds"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(metaPropertyMapResult.containsKey("recoveryRateCurveIds"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultCreditRatesMarketDataLookup> expectedBeanTypeResult =
        DefaultCreditRatesMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCreditRatesMarketDataLookup#toString()}
   *   <li>{@link DefaultCreditRatesMarketDataLookup#getCreditCurveIds()}
   *   <li>{@link DefaultCreditRatesMarketDataLookup#getDiscountCurveIds()}
   *   <li>{@link DefaultCreditRatesMarketDataLookup#getObservableSource()}
   *   <li>{@link DefaultCreditRatesMarketDataLookup#getRecoveryRateCurveIds()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap DefaultCreditRatesMarketDataLookup.getCreditCurveIds()",
    "ImmutableMap DefaultCreditRatesMarketDataLookup.getDiscountCurveIds()",
    "ObservableSource DefaultCreditRatesMarketDataLookup.getObservableSource()",
    "ImmutableMap DefaultCreditRatesMarketDataLookup.getRecoveryRateCurveIds()",
    "String DefaultCreditRatesMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();
    ObservableSource observableSource = ObservableSource.of("Name");

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, observableSource);

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableMap<Pair<StandardId, Currency>, CurveId> actualCreditCurveIds =
        ofResult.getCreditCurveIds();
    ImmutableMap<Currency, CurveId> actualDiscountCurveIds = ofResult.getDiscountCurveIds();
    ObservableSource actualObservableSource = ofResult.getObservableSource();

    // Assert
    assertEquals(
        "DefaultCreditRatesMarketDataLookup{creditCurveIds={}, discountCurveIds={}, recoveryRateCurveIds={},"
            + " observableSource=Name}",
        actualToStringResult);
    assertSame(actualCreditCurveIds, actualDiscountCurveIds);
    assertSame(actualCreditCurveIds, ofResult.getRecoveryRateCurveIds());
    assertSame(observableSource, actualObservableSource);
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#equals(Object)}, and {@link
   * DefaultCreditRatesMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCreditRatesMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultCreditRatesMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesMarketDataLookup.equals(Object)",
    "int DefaultCreditRatesMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds2 = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds2 = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds2 = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult2 =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds2, discountCurveIds2, recoveryRateCurveIds2, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#equals(Object)}, and {@link
   * DefaultCreditRatesMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCreditRatesMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultCreditRatesMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesMarketDataLookup.equals(Object)",
    "int DefaultCreditRatesMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesMarketDataLookup.equals(Object)",
    "int DefaultCreditRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name")),
        1);
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesMarketDataLookup.equals(Object)",
    "int DefaultCreditRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("42"));
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds2 = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds2 = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofResult,
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds2,
            discountCurveIds2,
            recoveryRateCurveIds2,
            ObservableSource.of("Name")));
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesMarketDataLookup.equals(Object)",
    "int DefaultCreditRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name")),
        null);
  }

  /**
   * Test {@link DefaultCreditRatesMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCreditRatesMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCreditRatesMarketDataLookup.equals(Object)",
    "int DefaultCreditRatesMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name")),
        "Different type to DefaultCreditRatesMarketDataLookup");
  }
}
