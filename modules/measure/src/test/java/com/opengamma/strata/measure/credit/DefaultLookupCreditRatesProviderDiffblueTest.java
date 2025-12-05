package com.opengamma.strata.measure.credit;

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
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.MarketDataNotFoundException;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultLookupCreditRatesProviderDiffblueTest {
  /**
   * Test {@link DefaultLookupCreditRatesProvider#of(DefaultCreditRatesMarketDataLookup,
   * MarketData)}.
   *
   * <ul>
   *   <li>When {@link MarketData}.
   *   <li>Then return ValuationDate is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLookupCreditRatesProvider#of(DefaultCreditRatesMarketDataLookup, MarketData)}
   */
  @Test
  @DisplayName(
      "Test of(DefaultCreditRatesMarketDataLookup, MarketData); when MarketData; then return ValuationDate is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultLookupCreditRatesProvider DefaultLookupCreditRatesProvider.of(DefaultCreditRatesMarketDataLookup, MarketData)"
  })
  void testOf_whenMarketData_thenReturnValuationDateIsNull() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    DefaultLookupCreditRatesProvider actualOfResult =
        DefaultLookupCreditRatesProvider.of(lookup, marketData);

    // Assert
    assertNull(actualOfResult.getValuationDate());
    assertSame(lookup, actualOfResult.getLookup());
    assertSame(marketData, actualOfResult.getMarketData());
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupCreditRatesProvider#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DefaultLookupCreditRatesProvider.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(marketData.getValuationDate()).thenReturn(ofResult);
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    DefaultLookupCreditRatesProvider ofResult2 =
        DefaultLookupCreditRatesProvider.of(lookup, marketData);

    // Act
    LocalDate actualValuationDate = ofResult2.getValuationDate();

    // Assert
    verify(marketData).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#getValuationDate()}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupCreditRatesProvider#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DefaultLookupCreditRatesProvider.getValuationDate()"})
  void testGetValuationDate_thenThrowMarketDataNotFoundException() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.getValuationDate())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    DefaultLookupCreditRatesProvider ofResult =
        DefaultLookupCreditRatesProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.getValuationDate());
    verify(marketData).getValuationDate();
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#discountFactors(Currency)}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupCreditRatesProvider#discountFactors(Currency)}
   */
  @Test
  @DisplayName("Test discountFactors(Currency); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.credit.CreditDiscountFactors DefaultLookupCreditRatesProvider.discountFactors(Currency)"
  })
  void testDiscountFactors_thenThrowMarketDataNotFoundException() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    DefaultLookupCreditRatesProvider ofResult =
        DefaultLookupCreditRatesProvider.of(lookup, mock(MarketData.class));

    // Act and Assert
    assertThrows(MarketDataNotFoundException.class, () -> ofResult.discountFactors(null));
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#parameterSensitivity(PointSensitivities)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} All is {@link HashMap#HashMap()}.
   *   <li>When empty.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLookupCreditRatesProvider#parameterSensitivity(PointSensitivities)}
   */
  @Test
  @DisplayName(
      "Test parameterSensitivity(PointSensitivities); given HashMap() All is HashMap(); when empty; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities DefaultLookupCreditRatesProvider.parameterSensitivity(PointSensitivities)"
  })
  void testParameterSensitivity_givenHashMapAllIsHashMap_whenEmpty_thenReturnSizeIsZero() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    creditCurveIds.putAll(new HashMap<>());
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    DefaultLookupCreditRatesProvider ofResult =
        DefaultLookupCreditRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    CurrencyParameterSensitivities actualParameterSensitivityResult =
        ofResult.parameterSensitivity(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualParameterSensitivityResult.size());
    assertTrue(actualParameterSensitivityResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#parameterSensitivity(PointSensitivities)}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultLookupCreditRatesProvider#parameterSensitivity(PointSensitivities)}
   */
  @Test
  @DisplayName("Test parameterSensitivity(PointSensitivities); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities DefaultLookupCreditRatesProvider.parameterSensitivity(PointSensitivities)"
  })
  void testParameterSensitivity_thenReturnSizeIsZero() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    DefaultLookupCreditRatesProvider ofResult =
        DefaultLookupCreditRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    CurrencyParameterSensitivities actualParameterSensitivityResult =
        ofResult.parameterSensitivity(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualParameterSensitivityResult.size());
    assertTrue(actualParameterSensitivityResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#findData(MarketDataName)}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupCreditRatesProvider#findData(MarketDataName)}
   */
  @Test
  @DisplayName("Test findData(MarketDataName); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional DefaultLookupCreditRatesProvider.findData(MarketDataName)"
  })
  void testFindData_thenReturnNotPresent() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    DefaultLookupCreditRatesProvider ofResult =
        DefaultLookupCreditRatesProvider.of(lookup, mock(MarketData.class));

    // Act and Assert
    assertFalse(ofResult.findData(null).isPresent());
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#toImmutableCreditRatesProvider()}.
   *
   * <ul>
   *   <li>Then throw {@link MarketDataNotFoundException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupCreditRatesProvider#toImmutableCreditRatesProvider()}
   */
  @Test
  @DisplayName("Test toImmutableCreditRatesProvider(); then throw MarketDataNotFoundException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.credit.ImmutableCreditRatesProvider DefaultLookupCreditRatesProvider.toImmutableCreditRatesProvider()"
  })
  void testToImmutableCreditRatesProvider_thenThrowMarketDataNotFoundException() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.getValuationDate())
        .thenThrow(new MarketDataNotFoundException("An error occurred"));
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    DefaultLookupCreditRatesProvider ofResult =
        DefaultLookupCreditRatesProvider.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        MarketDataNotFoundException.class, () -> ofResult.toImmutableCreditRatesProvider());
    verify(marketData).getValuationDate();
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#meta()}.
   *
   * <p>Method under test: {@link DefaultLookupCreditRatesProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLookupCreditRatesProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<DefaultLookupCreditRatesProvider> actualMetaResult =
        DefaultLookupCreditRatesProvider.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaResult.isBuildable());
    Class<DefaultLookupCreditRatesProvider> expectedBeanTypeResult =
        DefaultLookupCreditRatesProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link DefaultLookupCreditRatesProvider#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultLookupCreditRatesProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean DefaultLookupCreditRatesProvider.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    DefaultLookupCreditRatesProvider ofResult =
        DefaultLookupCreditRatesProvider.of(lookup, mock(MarketData.class));

    // Act
    TypedMetaBean<DefaultLookupCreditRatesProvider> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("lookup"));
    assertTrue(metaPropertyMapResult.containsKey("marketData"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<DefaultLookupCreditRatesProvider> expectedBeanTypeResult =
        DefaultLookupCreditRatesProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
