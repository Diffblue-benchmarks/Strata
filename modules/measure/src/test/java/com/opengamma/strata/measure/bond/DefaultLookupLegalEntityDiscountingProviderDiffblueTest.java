package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.LegalEntityGroup;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider;
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

class DefaultLookupLegalEntityDiscountingProviderDiffblueTest {
  /**
   * Test {@link
   * DefaultLookupLegalEntityDiscountingProvider#of(DefaultLegalEntityDiscountingMarketDataLookup,
   * MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLookupLegalEntityDiscountingProvider#of(DefaultLegalEntityDiscountingMarketDataLookup,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(DefaultLegalEntityDiscountingMarketDataLookup, MarketData); when MarketData; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultLookupLegalEntityDiscountingProvider DefaultLookupLegalEntityDiscountingProvider.of(DefaultLegalEntityDiscountingMarketDataLookup, MarketData)"
  })
  void testOf_whenMarketData_thenReturnValuationDateIsNull() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultLookupLegalEntityDiscountingProvider actualOfResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, marketData);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultLookupLegalEntityDiscountingProvider#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupLegalEntityDiscountingProvider#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DefaultLookupLegalEntityDiscountingProvider.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    DefaultLookupLegalEntityDiscountingProvider ofResult2 =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, marketData);

    // Act
    LocalDate actualValuationDate = ofResult2.getValuationDate();

    // Assert
    verify(marketData).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }

  /**
   * Test {@link DefaultLookupLegalEntityDiscountingProvider#getValuationDate()}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupLegalEntityDiscountingProvider#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DefaultLookupLegalEntityDiscountingProvider.getValuationDate()"})
  void testGetValuationDate_thenThrowMarketDataNotFoundException() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.getValuationDate())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    DefaultLookupLegalEntityDiscountingProvider ofResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.getValuationDate());
    verify(marketData).getValuationDate();
  }

  /**
   * Test {@link
   * DefaultLookupLegalEntityDiscountingProvider#parameterSensitivity(PointSensitivities)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} All is {@link HashMap#HashMap()}.
   *   <li>When empty.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLookupLegalEntityDiscountingProvider#parameterSensitivity(PointSensitivities)}
   */
  @Test
  @DisplayName(
      "Test parameterSensitivity(PointSensitivities); given HashMap() All is HashMap(); when empty; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities DefaultLookupLegalEntityDiscountingProvider.parameterSensitivity(PointSensitivities)"
  })
  void testParameterSensitivity_givenHashMapAllIsHashMap_whenEmpty_thenReturnSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    repoCurveGroups.putAll(new HashMap<>());
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    DefaultLookupLegalEntityDiscountingProvider ofResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, mock(MarketData.class));

    // Act
    CurrencyParameterSensitivities actualParameterSensitivityResult =
        ofResult.parameterSensitivity(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualParameterSensitivityResult.size());
    assertTrue(actualParameterSensitivityResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link
   * DefaultLookupLegalEntityDiscountingProvider#parameterSensitivity(PointSensitivities)}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLookupLegalEntityDiscountingProvider#parameterSensitivity(PointSensitivities)}
   */
  @Test
  @DisplayName("Test parameterSensitivity(PointSensitivities); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities DefaultLookupLegalEntityDiscountingProvider.parameterSensitivity(PointSensitivities)"
  })
  void testParameterSensitivity_thenReturnSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    DefaultLookupLegalEntityDiscountingProvider ofResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, mock(MarketData.class));

    // Act
    CurrencyParameterSensitivities actualParameterSensitivityResult =
        ofResult.parameterSensitivity(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualParameterSensitivityResult.size());
    assertTrue(actualParameterSensitivityResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link DefaultLookupLegalEntityDiscountingProvider#data(MarketDataId)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupLegalEntityDiscountingProvider#data(MarketDataId)}
   */
  @Test
  @DisplayName("Test data(MarketDataId); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.lang.Object DefaultLookupLegalEntityDiscountingProvider.data(MarketDataId)"
  })
  void testData_thenReturnNull() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    DefaultLookupLegalEntityDiscountingProvider ofResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, mock(MarketData.class));

    // Act and Assert
    assertNull(ofResult.data(mock(MarketDataId.class)));
  }

  /**
   * Test {@link DefaultLookupLegalEntityDiscountingProvider#findData(MarketDataName)}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLookupLegalEntityDiscountingProvider#findData(MarketDataName)}
   */
  @Test
  @DisplayName("Test findData(MarketDataName); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional DefaultLookupLegalEntityDiscountingProvider.findData(MarketDataName)"
  })
  void testFindData_thenReturnNotPresent() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    DefaultLookupLegalEntityDiscountingProvider ofResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, mock(MarketData.class));

    // Act and Assert
    assertFalse(ofResult.findData(null).isPresent());
  }

  /**
   * Test {@link
   * DefaultLookupLegalEntityDiscountingProvider#toImmutableLegalEntityDiscountingProvider()}.
   *
   * <p>Method under test: {@link
   * DefaultLookupLegalEntityDiscountingProvider#toImmutableLegalEntityDiscountingProvider()}
   */
  @Test
  @DisplayName("Test toImmutableLegalEntityDiscountingProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableLegalEntityDiscountingProvider DefaultLookupLegalEntityDiscountingProvider.toImmutableLegalEntityDiscountingProvider()"
  })
  void testToImmutableLegalEntityDiscountingProvider() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    DefaultLookupLegalEntityDiscountingProvider ofResult2 =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, marketData);

    // Act
    ImmutableLegalEntityDiscountingProvider actualToImmutableLegalEntityDiscountingProviderResult =
        ofResult2.toImmutableLegalEntityDiscountingProvider();

    // Assert
    verify(marketData).getValuationDate();
    LocalDate valuationDate =
        actualToImmutableLegalEntityDiscountingProviderResult.getValuationDate();
    assertEquals("1970-01-01", valuationDate.toString());
    ImmutableMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups =
        actualToImmutableLegalEntityDiscountingProviderResult.getIssuerCurveGroups();
    assertTrue(issuerCurveGroups.isEmpty());
    assertSame(ofResult, valuationDate);
    assertSame(
        issuerCurveGroups, actualToImmutableLegalEntityDiscountingProviderResult.getIssuerCurves());
    assertSame(
        issuerCurveGroups,
        actualToImmutableLegalEntityDiscountingProviderResult.getRepoCurveGroups());
    assertSame(
        issuerCurveGroups,
        actualToImmutableLegalEntityDiscountingProviderResult.getRepoCurveSecurityGroups());
    assertSame(
        issuerCurveGroups, actualToImmutableLegalEntityDiscountingProviderResult.getRepoCurves());
  }

  /**
   * Test {@link
   * DefaultLookupLegalEntityDiscountingProvider#toImmutableLegalEntityDiscountingProvider()}.
   *
   * <p>Method under test: {@link
   * DefaultLookupLegalEntityDiscountingProvider#toImmutableLegalEntityDiscountingProvider()}
   */
  @Test
  @DisplayName("Test toImmutableLegalEntityDiscountingProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableLegalEntityDiscountingProvider DefaultLookupLegalEntityDiscountingProvider.toImmutableLegalEntityDiscountingProvider()"
  })
  void testToImmutableLegalEntityDiscountingProvider2() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.getValuationDate())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    DefaultLookupLegalEntityDiscountingProvider ofResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class,
        () -> ofResult.toImmutableLegalEntityDiscountingProvider());
    verify(marketData).getValuationDate();
  }

  /**
   * Test {@link DefaultLookupLegalEntityDiscountingProvider#meta()}.
   *
   * <p>Method under test: {@link DefaultLookupLegalEntityDiscountingProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLookupLegalEntityDiscountingProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultLookupLegalEntityDiscountingProvider> actualMetaResult =
        DefaultLookupLegalEntityDiscountingProvider.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultLookupLegalEntityDiscountingProvider> expectedBeanTypeResult =
        DefaultLookupLegalEntityDiscountingProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultLookupLegalEntityDiscountingProvider#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupLegalEntityDiscountingProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLookupLegalEntityDiscountingProvider.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));
    DefaultLookupLegalEntityDiscountingProvider ofResult =
        DefaultLookupLegalEntityDiscountingProvider.of(lookup, mock(MarketData.class));

    // Act
    TypedMetaBean<DefaultLookupLegalEntityDiscountingProvider> actualMetaBeanResult =
        ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultLookupLegalEntityDiscountingProvider> expectedBeanTypeResult =
        DefaultLookupLegalEntityDiscountingProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
