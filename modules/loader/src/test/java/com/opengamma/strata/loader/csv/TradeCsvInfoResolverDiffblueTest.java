package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.io.CsvRow;
import com.opengamma.strata.product.SecurityTrade;
import com.opengamma.strata.product.Trade;
import com.opengamma.strata.product.TradeInfo;
import com.opengamma.strata.product.capfloor.IborCapFloorTrade;
import com.opengamma.strata.product.capfloor.OvernightInArrearsCapFloorTrade;
import com.opengamma.strata.product.credit.CdsIndexTrade;
import com.opengamma.strata.product.credit.CdsTrade;
import com.opengamma.strata.product.deposit.TermDepositTrade;
import com.opengamma.strata.product.fra.FraTrade;
import com.opengamma.strata.product.fx.FxNdfTrade;
import com.opengamma.strata.product.fx.FxSingleTrade;
import com.opengamma.strata.product.fx.FxSwapTrade;
import com.opengamma.strata.product.fxopt.FxVanillaOptionTrade;
import com.opengamma.strata.product.payment.BulletPaymentTrade;
import com.opengamma.strata.product.swap.SwapTrade;
import com.opengamma.strata.product.swaption.SwaptionTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeCsvInfoResolverDiffblueTest {
  /**
   * Test {@link TradeCsvInfoResolver#standard()}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeCsvInfoResolver TradeCsvInfoResolver.standard()"})
  void testStandard() {
    // Arrange and Act
    TradeCsvInfoResolver actualStandardResult = TradeCsvInfoResolver.standard();
    ReferenceData actualReferenceData = actualStandardResult.getReferenceData();

    // Assert
    ReferenceData referenceData = actualStandardResult.getReferenceData();
    assertTrue(referenceData instanceof ImmutableReferenceData);
    assertTrue(actualStandardResult instanceof StandardCsvInfoImpl);
    assertEquals(30, ((ImmutableReferenceData) referenceData).getValues().size());
    assertTrue(((StandardCsvInfoImpl) actualStandardResult).isTenorRequired());
    assertSame(referenceData, actualReferenceData);
  }

  /**
   * Test {@link TradeCsvInfoResolver#of(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return {@link StandardCsvInfoImpl}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#of(ReferenceData)}
   */
  @Test
  @DisplayName("Test of(ReferenceData); when ReferenceData; then return StandardCsvInfoImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeCsvInfoResolver TradeCsvInfoResolver.of(ReferenceData)"})
  void testOf_whenReferenceData_thenReturnStandardCsvInfoImpl() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    TradeCsvInfoResolver actualOfResult = TradeCsvInfoResolver.of(refData);
    ReferenceData actualReferenceData = actualOfResult.getReferenceData();

    // Assert
    assertTrue(actualOfResult instanceof StandardCsvInfoImpl);
    assertTrue(((StandardCsvInfoImpl) actualOfResult).isTenorRequired());
    assertSame(refData, actualOfResult.getReferenceData());
    assertSame(refData, actualReferenceData);
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTradeCommon(CsvRow, Trade)}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTradeCommon(CsvRow, Trade)}
   */
  @Test
  @DisplayName(
      "Test completeTradeCommon(CsvRow, Trade); given INSTANCE; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Trade TradeCsvInfoResolver.completeTradeCommon(CsvRow, Trade)"})
  void testCompleteTradeCommon_givenInstance_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTradeCommon(null, null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, BulletPaymentTrade)} with {@code
   * CsvRow}, {@code BulletPaymentTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, BulletPaymentTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, BulletPaymentTrade) with 'CsvRow', 'BulletPaymentTrade'; given INSTANCE; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BulletPaymentTrade TradeCsvInfoResolver.completeTrade(CsvRow, BulletPaymentTrade)"
  })
  void testCompleteTradeWithCsvRowBulletPaymentTrade_givenInstance_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (BulletPaymentTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, CdsIndexTrade)} with {@code CsvRow},
   * {@code CdsIndexTrade}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, CdsIndexTrade)}
   */
  @Test
  @DisplayName("Test completeTrade(CsvRow, CdsIndexTrade) with 'CsvRow', 'CdsIndexTrade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CdsIndexTrade TradeCsvInfoResolver.completeTrade(CsvRow, CdsIndexTrade)"})
  void testCompleteTradeWithCsvRowCdsIndexTrade() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (CdsIndexTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, CdsTrade)} with {@code CsvRow}, {@code
   * CdsTrade}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, CdsTrade)}
   */
  @Test
  @DisplayName("Test completeTrade(CsvRow, CdsTrade) with 'CsvRow', 'CdsTrade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CdsTrade TradeCsvInfoResolver.completeTrade(CsvRow, CdsTrade)"})
  void testCompleteTradeWithCsvRowCdsTrade() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (CdsTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, FraTrade)} with {@code CsvRow}, {@code
   * FraTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, FraTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, FraTrade) with 'CsvRow', 'FraTrade'; given INSTANCE; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FraTrade TradeCsvInfoResolver.completeTrade(CsvRow, FraTrade)"})
  void testCompleteTradeWithCsvRowFraTrade_givenInstance_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (FraTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxNdfTrade)} with {@code CsvRow}, {@code
   * FxNdfTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxNdfTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, FxNdfTrade) with 'CsvRow', 'FxNdfTrade'; given INSTANCE; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxNdfTrade TradeCsvInfoResolver.completeTrade(CsvRow, FxNdfTrade)"})
  void testCompleteTradeWithCsvRowFxNdfTrade_givenInstance_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (FxNdfTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxSingleTrade)} with {@code CsvRow},
   * {@code FxSingleTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxSingleTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, FxSingleTrade) with 'CsvRow', 'FxSingleTrade'; given INSTANCE; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxSingleTrade TradeCsvInfoResolver.completeTrade(CsvRow, FxSingleTrade)"})
  void testCompleteTradeWithCsvRowFxSingleTrade_givenInstance_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (FxSingleTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxSwapTrade)} with {@code CsvRow},
   * {@code FxSwapTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxSwapTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, FxSwapTrade) with 'CsvRow', 'FxSwapTrade'; given INSTANCE; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxSwapTrade TradeCsvInfoResolver.completeTrade(CsvRow, FxSwapTrade)"})
  void testCompleteTradeWithCsvRowFxSwapTrade_givenInstance_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (FxSwapTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxVanillaOptionTrade)} with {@code
   * CsvRow}, {@code FxVanillaOptionTrade}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, FxVanillaOptionTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, FxVanillaOptionTrade) with 'CsvRow', 'FxVanillaOptionTrade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FxVanillaOptionTrade TradeCsvInfoResolver.completeTrade(CsvRow, FxVanillaOptionTrade)"
  })
  void testCompleteTradeWithCsvRowFxVanillaOptionTrade() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (FxVanillaOptionTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, IborCapFloorTrade)} with {@code CsvRow},
   * {@code IborCapFloorTrade}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, IborCapFloorTrade)}
   */
  @Test
  @DisplayName("Test completeTrade(CsvRow, IborCapFloorTrade) with 'CsvRow', 'IborCapFloorTrade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapFloorTrade TradeCsvInfoResolver.completeTrade(CsvRow, IborCapFloorTrade)"
  })
  void testCompleteTradeWithCsvRowIborCapFloorTrade() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (IborCapFloorTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, OvernightInArrearsCapFloorTrade)} with
   * {@code CsvRow}, {@code OvernightInArrearsCapFloorTrade}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow,
   * OvernightInArrearsCapFloorTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, OvernightInArrearsCapFloorTrade) with 'CsvRow', 'OvernightInArrearsCapFloorTrade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightInArrearsCapFloorTrade TradeCsvInfoResolver.completeTrade(CsvRow, OvernightInArrearsCapFloorTrade)"
  })
  void testCompleteTradeWithCsvRowOvernightInArrearsCapFloorTrade() {
    // Arrange, Act and Assert
    assertNull(
        StandardCsvInfoImpl.INSTANCE.completeTrade(null, (OvernightInArrearsCapFloorTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, SecurityTrade)} with {@code CsvRow},
   * {@code SecurityTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, SecurityTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, SecurityTrade) with 'CsvRow', 'SecurityTrade'; given INSTANCE; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityTrade TradeCsvInfoResolver.completeTrade(CsvRow, SecurityTrade)"})
  void testCompleteTradeWithCsvRowSecurityTrade_givenInstance_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (SecurityTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, SwapTrade)} with {@code CsvRow}, {@code
   * SwapTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, SwapTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, SwapTrade) with 'CsvRow', 'SwapTrade'; given INSTANCE; when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwapTrade TradeCsvInfoResolver.completeTrade(CsvRow, SwapTrade)"})
  void testCompleteTradeWithCsvRowSwapTrade_givenInstance_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (SwapTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, SwaptionTrade)} with {@code CsvRow},
   * {@code SwaptionTrade}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, SwaptionTrade)}
   */
  @Test
  @DisplayName("Test completeTrade(CsvRow, SwaptionTrade) with 'CsvRow', 'SwaptionTrade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionTrade TradeCsvInfoResolver.completeTrade(CsvRow, SwaptionTrade)"})
  void testCompleteTradeWithCsvRowSwaptionTrade() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (SwaptionTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#completeTrade(CsvRow, TermDepositTrade)} with {@code CsvRow},
   * {@code TermDepositTrade}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#completeTrade(CsvRow, TermDepositTrade)}
   */
  @Test
  @DisplayName(
      "Test completeTrade(CsvRow, TermDepositTrade) with 'CsvRow', 'TermDepositTrade'; given INSTANCE; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TermDepositTrade TradeCsvInfoResolver.completeTrade(CsvRow, TermDepositTrade)"
  })
  void testCompleteTradeWithCsvRowTermDepositTrade_givenInstance_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(StandardCsvInfoImpl.INSTANCE.completeTrade(null, (TermDepositTrade) null));
  }

  /**
   * Test {@link TradeCsvInfoResolver#overrideParseTrade(String, CsvRow, TradeInfo)}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#overrideParseTrade(String, CsvRow,
   * TradeInfo)}
   */
  @Test
  @DisplayName("Test overrideParseTrade(String, CsvRow, TradeInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional TradeCsvInfoResolver.overrideParseTrade(String, CsvRow, TradeInfo)"
  })
  void testOverrideParseTrade() {
    // Arrange, Act and Assert
    assertFalse(
        StandardCsvInfoImpl.INSTANCE
            .overrideParseTrade("Type Upper", null, TradeInfo.empty())
            .isPresent());
  }

  /**
   * Test {@link TradeCsvInfoResolver#parseOtherTrade(String, CsvRow, TradeInfo)}.
   *
   * <p>Method under test: {@link TradeCsvInfoResolver#parseOtherTrade(String, CsvRow, TradeInfo)}
   */
  @Test
  @DisplayName("Test parseOtherTrade(String, CsvRow, TradeInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional TradeCsvInfoResolver.parseOtherTrade(String, CsvRow, TradeInfo)"
  })
  void testParseOtherTrade() {
    // Arrange, Act and Assert
    assertFalse(
        StandardCsvInfoImpl.INSTANCE
            .parseOtherTrade("Type Upper", null, TradeInfo.empty())
            .isPresent());
  }
}
