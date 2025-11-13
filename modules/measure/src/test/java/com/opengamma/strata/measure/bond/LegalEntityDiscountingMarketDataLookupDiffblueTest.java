package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.curve.CurveGroupName;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.LegalEntityCurveGroup;
import com.opengamma.strata.market.curve.LegalEntityCurveGroup.Builder;
import com.opengamma.strata.market.curve.LegalEntityGroup;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.bond.LegalEntityDiscountingProvider;
import com.opengamma.strata.product.LegalEntityId;
import com.opengamma.strata.product.SecurityId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LegalEntityDiscountingMarketDataLookupDiffblueTest {
  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(LegalEntityCurveGroup, Map)} with {@code
   * curveGroup}, {@code repoCurveGroups}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(LegalEntityCurveGroup,
   * Map)}
   */
  @Test
  @DisplayName("Test of(LegalEntityCurveGroup, Map) with 'curveGroup', 'repoCurveGroups'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(LegalEntityCurveGroup, Map)"
  })
  void testOfWithCurveGroupRepoCurveGroups() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));
    LegalEntityCurveGroup curveGroup = nameResult.repoCurves(new HashMap<>()).build();

    // Act and Assert
    assertTrue(
        LegalEntityDiscountingMarketDataLookup.of(curveGroup, new HashMap<>())
            instanceof DefaultLegalEntityDiscountingMarketDataLookup);
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(LegalEntityCurveGroup, Map, Map)} with
   * {@code curveGroup}, {@code repoCurveGroups}, {@code issuerCurveGroups}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(LegalEntityCurveGroup,
   * Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LegalEntityCurveGroup, Map, Map) with 'curveGroup', 'repoCurveGroups', 'issuerCurveGroups'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(LegalEntityCurveGroup, Map, Map)"
  })
  void testOfWithCurveGroupRepoCurveGroupsIssuerCurveGroups() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));
    LegalEntityCurveGroup curveGroup = nameResult.repoCurves(new HashMap<>()).build();
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();

    // Act
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(curveGroup, repoCurveGroups, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(LegalEntityCurveGroup, Map, Map, Map)}
   * with {@code curveGroup}, {@code repoCurveSecurityGroups}, {@code repoCurveGroups}, {@code
   * issuerCurveGroups}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(LegalEntityCurveGroup,
   * Map, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(LegalEntityCurveGroup, Map, Map, Map) with 'curveGroup', 'repoCurveSecurityGroups', 'repoCurveGroups', 'issuerCurveGroups'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(LegalEntityCurveGroup, Map, Map, Map)"
  })
  void testOfWithCurveGroupRepoCurveSecurityGroupsRepoCurveGroupsIssuerCurveGroups() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));
    LegalEntityCurveGroup curveGroup = nameResult.repoCurves(new HashMap<>()).build();
    HashMap<SecurityId, RepoGroup> repoCurveSecurityGroups = new HashMap<>();
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();

    // Act
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(
            curveGroup, repoCurveSecurityGroups, repoCurveGroups, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map)} with {@code
   * repoCurveGroups}, {@code repoCurveIds}, {@code issuerCurveGroups}, {@code issuerCurveIds}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map, Map) with 'repoCurveGroups', 'repoCurveIds', 'issuerCurveGroups', 'issuerCurveIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(Map, Map, Map, Map)"
  })
  void testOfWithRepoCurveGroupsRepoCurveIdsIssuerCurveGroupsIssuerCurveIds() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();
    HashMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups = new HashMap<>();

    // Act
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, issuerCurveGroups, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups2 =
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurveGroups();
    assertEquals(repoCurveGroups, issuerCurveGroups2);
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurves());
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map, ObservableSource)}
   * with {@code repoCurveGroups}, {@code repoCurveIds}, {@code issuerCurveGroups}, {@code
   * issuerCurveIds}, {@code obsSource}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map,
   * ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map, Map, ObservableSource) with 'repoCurveGroups', 'repoCurveIds', 'issuerCurveGroups', 'issuerCurveIds', 'obsSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(Map, Map, Map, Map, ObservableSource)"
  })
  void testOfWithRepoCurveGroupsRepoCurveIdsIssuerCurveGroupsIssuerCurveIdsObsSource() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();
    HashMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups = new HashMap<>();
    HashMap<Pair<LegalEntityGroup, Currency>, CurveId> issuerCurveIds = new HashMap<>();

    // Act
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups,
            repoCurveIds,
            issuerCurveGroups,
            issuerCurveIds,
            ObservableSource.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups2 =
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurveGroups();
    assertEquals(repoCurveGroups, issuerCurveGroups2);
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurves());
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, ObservableSource)} with {@code
   * repoCurveGroups}, {@code repoCurveIds}, {@code obsSource}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map,
   * ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource) with 'repoCurveGroups', 'repoCurveIds', 'obsSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(Map, Map, ObservableSource)"
  })
  void testOfWithRepoCurveGroupsRepoCurveIdsObsSource() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    // Act
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups =
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurveGroups();
    assertEquals(repoCurveGroups, issuerCurveGroups);
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurves());
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map)} with {@code repoCurveGroups},
   * {@code repoCurveIds}.
   *
   * <ul>
   *   <li>Then return IssuerCurveGroups is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map) with 'repoCurveGroups', 'repoCurveIds'; then return IssuerCurveGroups is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(Map, Map)"
  })
  void testOfWithRepoCurveGroupsRepoCurveIds_thenReturnIssuerCurveGroupsIsHashMap() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();

    // Act
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(repoCurveGroups, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups =
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurveGroups();
    assertEquals(repoCurveGroups, issuerCurveGroups);
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurves());
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map, Map)} with {@code
   * repoCurveSecurityGroups}, {@code repoCurveGroups}, {@code repoCurveIds}, {@code
   * issuerCurveGroups}, {@code issuerCurveIds}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map,
   * Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map, Map, Map) with 'repoCurveSecurityGroups', 'repoCurveGroups', 'repoCurveIds', 'issuerCurveGroups', 'issuerCurveIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(Map, Map, Map, Map, Map)"
  })
  void
      testOfWithRepoCurveSecurityGroupsRepoCurveGroupsRepoCurveIdsIssuerCurveGroupsIssuerCurveIds() {
    // Arrange
    HashMap<SecurityId, RepoGroup> repoCurveSecurityGroups = new HashMap<>();
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();
    HashMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups = new HashMap<>();

    // Act
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(
            repoCurveSecurityGroups,
            repoCurveGroups,
            repoCurveIds,
            issuerCurveGroups,
            new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups2 =
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurveGroups();
    assertEquals(repoCurveSecurityGroups, issuerCurveGroups2);
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurves());
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map, Map,
   * ObservableSource)} with {@code repoCurveSecurityGroups}, {@code repoCurveGroups}, {@code
   * repoCurveIds}, {@code issuerCurveGroups}, {@code issuerCurveIds}, {@code obsSource}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#of(Map, Map, Map, Map, Map,
   * ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map, Map, Map, ObservableSource) with 'repoCurveSecurityGroups', 'repoCurveGroups', 'repoCurveIds', 'issuerCurveGroups', 'issuerCurveIds', 'obsSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketDataLookup LegalEntityDiscountingMarketDataLookup.of(Map, Map, Map, Map, Map, ObservableSource)"
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
    LegalEntityDiscountingMarketDataLookup actualOfResult =
        LegalEntityDiscountingMarketDataLookup.of(
            repoCurveSecurityGroups,
            repoCurveGroups,
            repoCurveIds,
            issuerCurveGroups,
            issuerCurveIds,
            ObservableSource.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultLegalEntityDiscountingMarketDataLookup);
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups2 =
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurveGroups();
    assertEquals(repoCurveSecurityGroups, issuerCurveGroups2);
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups2,
        ((DefaultLegalEntityDiscountingMarketDataLookup) actualOfResult).getRepoCurves());
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class LegalEntityDiscountingMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<LegalEntityDiscountingMarketDataLookup> expectedQueryTypeResult =
        LegalEntityDiscountingMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#marketDataView(MarketData)} with {@code
   * MarketData}.
   *
   * <p>Method under test: {@link LegalEntityDiscountingMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketData LegalEntityDiscountingMarketDataLookup.marketDataView(MarketData)"
  })
  void testMarketDataViewWithMarketData() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    LegalEntityDiscountingMarketData actualMarketDataViewResult =
        ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultLegalEntityDiscountingMarketData);
    LegalEntityDiscountingProvider discountingProviderResult =
        actualMarketDataViewResult.discountingProvider();
    assertTrue(discountingProviderResult instanceof DefaultLookupLegalEntityDiscountingProvider);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertNull(discountingProviderResult.getValuationDate());
    assertSame(
        ofResult,
        ((DefaultLookupLegalEntityDiscountingProvider) discountingProviderResult).getLookup());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(
        marketData,
        ((DefaultLookupLegalEntityDiscountingProvider) discountingProviderResult).getMarketData());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link LegalEntityDiscountingMarketDataLookup#marketDataView(ScenarioMarketData)} with
   * {@code ScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * LegalEntityDiscountingMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingScenarioMarketData LegalEntityDiscountingMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup ofResult =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    LegalEntityDiscountingScenarioMarketData actualMarketDataViewResult =
        ofResult.marketDataView(marketData);

    // Assert
    assertTrue(
        actualMarketDataViewResult instanceof DefaultLegalEntityDiscountingScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
