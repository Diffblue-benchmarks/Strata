package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
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
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider.Builder;
import com.opengamma.strata.pricer.bond.LegalEntityDiscountingProvider;
import com.opengamma.strata.product.LegalEntityId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DefaultLegalEntityDiscountingMarketDataDiffblueTest {
  /**
   * Test {@link DefaultLegalEntityDiscountingMarketData#of(LegalEntityDiscountingMarketDataLookup,
   * MarketData)}.
   *
   * <ul>
   *   <li>Then discountingProvider return {@link DefaultLookupLegalEntityDiscountingProvider}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLegalEntityDiscountingMarketData#of(LegalEntityDiscountingMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(LegalEntityDiscountingMarketDataLookup, MarketData); then discountingProvider return DefaultLookupLegalEntityDiscountingProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultLegalEntityDiscountingMarketData DefaultLegalEntityDiscountingMarketData.of(LegalEntityDiscountingMarketDataLookup, MarketData)"
  })
  void testOf_thenDiscountingProviderReturnDefaultLookupLegalEntityDiscountingProvider() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultLegalEntityDiscountingMarketData actualOfResult =
        DefaultLegalEntityDiscountingMarketData.of(lookup, marketData);

    // Assert
    LegalEntityDiscountingProvider discountingProviderResult = actualOfResult.discountingProvider();
    assertTrue(discountingProviderResult instanceof DefaultLookupLegalEntityDiscountingProvider);
    assertNull(discountingProviderResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(
        lookup,
        ((DefaultLookupLegalEntityDiscountingProvider) discountingProviderResult).getLookup());
    assertSame(
        marketData,
        ((DefaultLookupLegalEntityDiscountingProvider) discountingProviderResult).getMarketData());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketData#of(LegalEntityDiscountingMarketDataLookup,
   * MarketData)}.
   *
   * <ul>
   *   <li>Then discountingProvider return {@link ImmutableLegalEntityDiscountingProvider}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLegalEntityDiscountingMarketData#of(LegalEntityDiscountingMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(LegalEntityDiscountingMarketDataLookup, MarketData); then discountingProvider return ImmutableLegalEntityDiscountingProvider")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultLegalEntityDiscountingMarketData DefaultLegalEntityDiscountingMarketData.of(LegalEntityDiscountingMarketDataLookup, MarketData)"
  })
  void testOf_thenDiscountingProviderReturnImmutableLegalEntityDiscountingProvider() {
    // Arrange
    LegalEntityDiscountingMarketDataLookup lookup =
        mock(LegalEntityDiscountingMarketDataLookup.class);

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    when(lookup.discountingProvider(Mockito.<MarketData>any()))
        .thenReturn(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(valuationDate)
                .build());

    // Act
    DefaultLegalEntityDiscountingMarketData actualOfResult =
        DefaultLegalEntityDiscountingMarketData.of(lookup, mock(MarketData.class));

    // Assert
    verify(lookup).discountingProvider(isA(MarketData.class));
    LegalEntityDiscountingProvider discountingProviderResult = actualOfResult.discountingProvider();
    assertTrue(discountingProviderResult instanceof ImmutableLegalEntityDiscountingProvider);
    LocalDate valuationDate2 = discountingProviderResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups =
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult)
            .getIssuerCurveGroups();
    assertTrue(issuerCurveGroups.isEmpty());
    assertSame(valuationDate, valuationDate2);
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult).getRepoCurves());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketData#withMarketData(MarketData)}.
   *
   * <p>Method under test: {@link
   * DefaultLegalEntityDiscountingMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName("Test withMarketData(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketData DefaultLegalEntityDiscountingMarketData.withMarketData(MarketData)"
  })
  void testWithMarketData() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    DefaultLegalEntityDiscountingMarketData ofResult =
        DefaultLegalEntityDiscountingMarketData.of(lookup, mock(MarketData.class));
    MarketData marketData = mock(MarketData.class);

    // Act
    LegalEntityDiscountingMarketData actualWithMarketDataResult =
        ofResult.withMarketData(marketData);

    // Assert
    assertTrue(actualWithMarketDataResult instanceof DefaultLegalEntityDiscountingMarketData);
    LegalEntityDiscountingProvider discountingProviderResult =
        actualWithMarketDataResult.discountingProvider();
    assertTrue(discountingProviderResult instanceof DefaultLookupLegalEntityDiscountingProvider);
    assertNull(discountingProviderResult.getValuationDate());
    assertSame(
        lookup,
        ((DefaultLookupLegalEntityDiscountingProvider) discountingProviderResult).getLookup());
    assertSame(lookup, actualWithMarketDataResult.getLookup());
    assertSame(
        marketData,
        ((DefaultLookupLegalEntityDiscountingProvider) discountingProviderResult).getMarketData());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketData#withMarketData(MarketData)}.
   *
   * <p>Method under test: {@link
   * DefaultLegalEntityDiscountingMarketData#withMarketData(MarketData)}
   */
  @Test
  @DisplayName("Test withMarketData(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntityDiscountingMarketData DefaultLegalEntityDiscountingMarketData.withMarketData(MarketData)"
  })
  void testWithMarketData2() {
    // Arrange
    LegalEntityDiscountingMarketDataLookup lookup =
        mock(LegalEntityDiscountingMarketDataLookup.class);

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    when(lookup.discountingProvider(Mockito.<MarketData>any()))
        .thenReturn(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(valuationDate)
                .build());

    // Act
    LegalEntityDiscountingMarketData actualWithMarketDataResult =
        DefaultLegalEntityDiscountingMarketData.of(lookup, mock(MarketData.class))
            .withMarketData(mock(MarketData.class));

    // Assert
    verify(lookup, atLeast(1)).discountingProvider(Mockito.<MarketData>any());
    assertTrue(actualWithMarketDataResult instanceof DefaultLegalEntityDiscountingMarketData);
    LegalEntityDiscountingProvider discountingProviderResult =
        actualWithMarketDataResult.discountingProvider();
    assertTrue(discountingProviderResult instanceof ImmutableLegalEntityDiscountingProvider);
    LocalDate valuationDate2 = discountingProviderResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups =
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult)
            .getIssuerCurveGroups();
    assertTrue(issuerCurveGroups.isEmpty());
    assertSame(valuationDate, valuationDate2);
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult).getIssuerCurves());
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult).getRepoCurveGroups());
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult)
            .getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups,
        ((ImmutableLegalEntityDiscountingProvider) discountingProviderResult).getRepoCurves());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketData#meta()}.
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLegalEntityDiscountingMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultLegalEntityDiscountingMarketData> actualMetaResult =
        DefaultLegalEntityDiscountingMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultLegalEntityDiscountingMarketData> expectedBeanTypeResult =
        DefaultLegalEntityDiscountingMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultLegalEntityDiscountingMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLegalEntityDiscountingMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLegalEntityDiscountingMarketData.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    DefaultLegalEntityDiscountingMarketData ofResult =
        DefaultLegalEntityDiscountingMarketData.of(lookup, mock(MarketData.class));

    // Act
    TypedMetaBean<DefaultLegalEntityDiscountingMarketData> actualMetaBeanResult =
        ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultLegalEntityDiscountingMarketData> expectedBeanTypeResult =
        DefaultLegalEntityDiscountingMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
