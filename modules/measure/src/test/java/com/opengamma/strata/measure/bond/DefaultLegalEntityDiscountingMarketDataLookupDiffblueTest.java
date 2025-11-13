package com.opengamma.strata.measure.bond;

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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.LegalEntityGroup;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.pricer.bond.LegalEntityDiscountingProvider;
import com.opengamma.strata.product.LegalEntityId;
import com.opengamma.strata.product.SecurityId;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultLegalEntityDiscountingMarketDataLookupDiffblueTest {
  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#of(Map, Map, ObservableSource)} with
   * {@code repoCurveGroups}, {@code repoCurveIds}, {@code obsSource}.
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#of(Map, Map,
   * ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource) with 'repoCurveGroups', 'repoCurveIds', 'obsSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultLegalEntityDiscountingMarketDataLookup DefaultLegalEntityDiscountingMarketDataLookup.of(Map, Map, ObservableSource)"
  })
  void testOfWithRepoCurveGroupsRepoCurveIdsObsSource() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    // Act
    DefaultLegalEntityDiscountingMarketDataLookup actualOfResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Assert
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups =
        actualOfResult.getIssuerCurveGroups();
    assertEquals(repoCurveGroups, issuerCurveGroups);
    assertSame(issuerCurveGroups, actualOfResult.getIssuerCurves());
    assertSame(issuerCurveGroups, actualOfResult.getRepoCurveGroups());
    assertSame(issuerCurveGroups, actualOfResult.getRepoCurveSecurityGroups());
    assertSame(issuerCurveGroups, actualOfResult.getRepoCurves());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map, Map,
   * ObservableSource)} with {@code repoCurveSecurityGroups}, {@code repoCurveGroups}, {@code
   * repoCurveIds}, {@code issuerCurveGroups}, {@code issuerCurveIds}, {@code obsSource}.
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#of(Map, Map, Map,
   * Map, Map, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map, Map, Map, ObservableSource) with 'repoCurveSecurityGroups', 'repoCurveGroups', 'repoCurveIds', 'issuerCurveGroups', 'issuerCurveIds', 'obsSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultLegalEntityDiscountingMarketDataLookup DefaultLegalEntityDiscountingMarketDataLookup.of(Map, Map, Map, Map, Map, ObservableSource)"
  })
  void
      testOfWithRepoCurveSecurityGroupsRepoCurveGroupsRepoCurveIdsIssuerCurveGroupsIssuerCurveIdsObsSource() {
    // Arrange
    HashMap<SecurityId, RepoGroup> repoCurveSecurityGroups = new HashMap<>();
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();
    HashMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups = new HashMap<>();
    HashMap<Pair<LegalEntityGroup, Currency>, CurveId> issuerCurveIds = new HashMap<>();

    // Act
    DefaultLegalEntityDiscountingMarketDataLookup actualOfResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveSecurityGroups,
            repoCurveGroups,
            repoCurveIds,
            issuerCurveGroups,
            issuerCurveIds,
            ObservableSource.of("Name"));

    // Assert
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups2 =
        actualOfResult.getIssuerCurveGroups();
    assertEquals(repoCurveSecurityGroups, issuerCurveGroups2);
    assertSame(issuerCurveGroups2, actualOfResult.getIssuerCurves());
    assertSame(issuerCurveGroups2, actualOfResult.getRepoCurveGroups());
    assertSame(issuerCurveGroups2, actualOfResult.getRepoCurveSecurityGroups());
    assertSame(issuerCurveGroups2, actualOfResult.getRepoCurves());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#requirements(LegalEntityId,
   * Currency)} with {@code issuerId}, {@code currency}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLegalEntityDiscountingMarketDataLookup#requirements(LegalEntityId, Currency)}
   */
  @Test
  @DisplayName(
      "Test requirements(LegalEntityId, Currency) with 'issuerId', 'currency'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.calc.runner.FunctionRequirements DefaultLegalEntityDiscountingMarketDataLookup.requirements(LegalEntityId, Currency)"
  })
  void testRequirementsWithIssuerIdCurrency_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(null, null));
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#requirements(SecurityId,
   * LegalEntityId, Currency)} with {@code securityId}, {@code issuerId}, {@code currency}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLegalEntityDiscountingMarketDataLookup#requirements(SecurityId, LegalEntityId,
   * Currency)}
   */
  @Test
  @DisplayName(
      "Test requirements(SecurityId, LegalEntityId, Currency) with 'securityId', 'issuerId', 'currency'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.calc.runner.FunctionRequirements DefaultLegalEntityDiscountingMarketDataLookup.requirements(SecurityId, LegalEntityId, Currency)"
  })
  void testRequirementsWithSecurityIdIssuerIdCurrency_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.requirements(null, null, null));
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#discountingProvider(MarketData)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultLookupLegalEntityDiscountingProvider}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLegalEntityDiscountingMarketDataLookup#discountingProvider(MarketData)}
   */
  @Test
  @DisplayName(
      "Test discountingProvider(MarketData); then return DefaultLookupLegalEntityDiscountingProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingProvider DefaultLegalEntityDiscountingMarketDataLookup.discountingProvider(MarketData)"
  })
  void testDiscountingProvider_thenReturnDefaultLookupLegalEntityDiscountingProvider() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    LegalEntityDiscountingProvider actualDiscountingProviderResult =
        ofResult.discountingProvider(marketData);

    // Assert
    assertTrue(
        actualDiscountingProviderResult instanceof DefaultLookupLegalEntityDiscountingProvider);
    assertNull(actualDiscountingProviderResult.getValuationDate());
    assertSame(
        ofResult,
        ((DefaultLookupLegalEntityDiscountingProvider) actualDiscountingProviderResult)
            .getLookup());
    assertSame(
        marketData,
        ((DefaultLookupLegalEntityDiscountingProvider) actualDiscountingProviderResult)
            .getMarketData());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#meta()}.
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLegalEntityDiscountingMarketDataLookup.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultLegalEntityDiscountingMarketDataLookup> actualMetaResult =
        DefaultLegalEntityDiscountingMarketDataLookup.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(6, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("issuerCurveGroups"));
    assertTrue(metaPropertyMapResult.containsKey("issuerCurves"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(metaPropertyMapResult.containsKey("repoCurveGroups"));
    assertTrue(metaPropertyMapResult.containsKey("repoCurveSecurityGroups"));
    assertTrue(metaPropertyMapResult.containsKey("repoCurves"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultLegalEntityDiscountingMarketDataLookup> expectedBeanTypeResult =
        DefaultLegalEntityDiscountingMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#metaBean()}.
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLegalEntityDiscountingMarketDataLookup.metaBean()"})
  void testMetaBean() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    TypedMetaBean<DefaultLegalEntityDiscountingMarketDataLookup> actualMetaBeanResult =
        ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(6, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("issuerCurveGroups"));
    assertTrue(metaPropertyMapResult.containsKey("issuerCurves"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(metaPropertyMapResult.containsKey("repoCurveGroups"));
    assertTrue(metaPropertyMapResult.containsKey("repoCurveSecurityGroups"));
    assertTrue(metaPropertyMapResult.containsKey("repoCurves"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultLegalEntityDiscountingMarketDataLookup> expectedBeanTypeResult =
        DefaultLegalEntityDiscountingMarketDataLookup.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#toString()}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#getIssuerCurveGroups()}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#getIssuerCurves()}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#getObservableSource()}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#getRepoCurveGroups()}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#getRepoCurveSecurityGroups()}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#getRepoCurves()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap DefaultLegalEntityDiscountingMarketDataLookup.getIssuerCurveGroups()",
    "ImmutableMap DefaultLegalEntityDiscountingMarketDataLookup.getIssuerCurves()",
    "ObservableSource DefaultLegalEntityDiscountingMarketDataLookup.getObservableSource()",
    "ImmutableMap DefaultLegalEntityDiscountingMarketDataLookup.getRepoCurveGroups()",
    "ImmutableMap DefaultLegalEntityDiscountingMarketDataLookup.getRepoCurveSecurityGroups()",
    "ImmutableMap DefaultLegalEntityDiscountingMarketDataLookup.getRepoCurves()",
    "String DefaultLegalEntityDiscountingMarketDataLookup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(repoCurveGroups, repoCurveIds, obsSource);

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableMap<LegalEntityId, LegalEntityGroup> actualIssuerCurveGroups =
        ofResult.getIssuerCurveGroups();
    ImmutableMap<Pair<LegalEntityGroup, Currency>, CurveId> actualIssuerCurves =
        ofResult.getIssuerCurves();
    ObservableSource actualObservableSource = ofResult.getObservableSource();
    ImmutableMap<LegalEntityId, RepoGroup> actualRepoCurveGroups = ofResult.getRepoCurveGroups();
    ImmutableMap<SecurityId, RepoGroup> actualRepoCurveSecurityGroups =
        ofResult.getRepoCurveSecurityGroups();

    // Assert
    assertEquals(
        "DefaultLegalEntityDiscountingMarketDataLookup{repoCurveSecurityGroups={}, repoCurveGroups={},"
            + " repoCurves={}, issuerCurveGroups={}, issuerCurves={}, observableSource=Name}",
        actualToStringResult);
    assertSame(actualIssuerCurveGroups, actualIssuerCurves);
    assertSame(actualIssuerCurveGroups, actualRepoCurveGroups);
    assertSame(actualIssuerCurveGroups, actualRepoCurveSecurityGroups);
    assertSame(actualIssuerCurveGroups, ofResult.getRepoCurves());
    assertSame(obsSource, actualObservableSource);
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}, and {@link
   * DefaultLegalEntityDiscountingMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultLegalEntityDiscountingMarketDataLookup.equals(Object)",
    "int DefaultLegalEntityDiscountingMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups2 = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds2 = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult2 =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups2, repoCurveIds2, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}, and {@link
   * DefaultLegalEntityDiscountingMarketDataLookup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}
   *   <li>{@link DefaultLegalEntityDiscountingMarketDataLookup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultLegalEntityDiscountingMarketDataLookup.equals(Object)",
    "int DefaultLegalEntityDiscountingMarketDataLookup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultLegalEntityDiscountingMarketDataLookup.equals(Object)",
    "int DefaultLegalEntityDiscountingMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name")),
        1);
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultLegalEntityDiscountingMarketDataLookup.equals(Object)",
    "int DefaultLegalEntityDiscountingMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("42"));
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups2 = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofResult,
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups2, repoCurveIds2, ObservableSource.of("Name")));
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultLegalEntityDiscountingMarketDataLookup.equals(Object)",
    "int DefaultLegalEntityDiscountingMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name")),
        null);
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketDataLookup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultLegalEntityDiscountingMarketDataLookup.equals(Object)",
    "int DefaultLegalEntityDiscountingMarketDataLookup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name")),
        "Different type to DefaultLegalEntityDiscountingMarketDataLookup");
  }
}
