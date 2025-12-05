package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.collect.io.CsvRow;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.product.PortfolioItemInfo;
import com.opengamma.strata.product.PositionInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SensitivityCsvInfoResolverDiffblueTest {
  /**
   * Test {@link SensitivityCsvInfoResolver#standard()}.
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SensitivityCsvInfoResolver SensitivityCsvInfoResolver.standard()"})
  void testStandard() {
    // Arrange and Act
    SensitivityCsvInfoResolver actualStandardResult = SensitivityCsvInfoResolver.standard();
    ReferenceData actualReferenceData = actualStandardResult.getReferenceData();

    // Assert
    ReferenceData referenceData = actualStandardResult.getReferenceData();
    assertTrue(referenceData instanceof ImmutableReferenceData);
    assertTrue(actualStandardResult instanceof StandardCsvInfoImpl);
    assertEquals(30, ((ImmutableReferenceData) referenceData).getValues().size());
    assertTrue(actualStandardResult.isTenorRequired());
    assertSame(referenceData, actualReferenceData);
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#of(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return {@link StandardCsvInfoImpl}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#of(ReferenceData)}
   */
  @Test
  @DisplayName("Test of(ReferenceData); when ReferenceData; then return StandardCsvInfoImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SensitivityCsvInfoResolver SensitivityCsvInfoResolver.of(ReferenceData)"})
  void testOf_whenReferenceData_thenReturnStandardCsvInfoImpl() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    SensitivityCsvInfoResolver actualOfResult = SensitivityCsvInfoResolver.of(refData);
    ReferenceData actualReferenceData = actualOfResult.getReferenceData();

    // Assert
    assertTrue(actualOfResult instanceof StandardCsvInfoImpl);
    assertTrue(actualOfResult.isTenorRequired());
    assertSame(refData, actualOfResult.getReferenceData());
    assertSame(refData, actualReferenceData);
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#isInfoColumn(String)}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#isInfoColumn(String)}
   */
  @Test
  @DisplayName("Test isInfoColumn(String); given INSTANCE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvInfoResolver.isInfoColumn(String)"})
  void testIsInfoColumn_givenInstance_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(StandardCsvInfoImpl.INSTANCE.isInfoColumn("Header Lower Case"));
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#parseSensitivityInfo(CsvRow, PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#parseSensitivityInfo(CsvRow,
   * PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test parseSensitivityInfo(CsvRow, PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PortfolioItemInfo SensitivityCsvInfoResolver.parseSensitivityInfo(CsvRow, PortfolioItemInfo)"
  })
  void testParseSensitivityInfo() {
    // Arrange
    PositionInfo info = PositionInfo.empty();

    // Act
    PortfolioItemInfo actualParseSensitivityInfoResult =
        StandardCsvInfoImpl.INSTANCE.parseSensitivityInfo(null, info);

    // Assert
    assertSame(info, actualParseSensitivityInfoResult);
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#isTenorRequired()}.
   *
   * <ul>
   *   <li>Given {@link StandardCsvInfoImpl#INSTANCE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#isTenorRequired()}
   */
  @Test
  @DisplayName("Test isTenorRequired(); given INSTANCE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvInfoResolver.isTenorRequired()"})
  void testIsTenorRequired_givenInstance_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(StandardCsvInfoImpl.INSTANCE.isTenorRequired());
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#checkSensitivityTenor(Tenor)}.
   *
   * <ul>
   *   <li>When ofDays one.
   *   <li>Then return ofDays one.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#checkSensitivityTenor(Tenor)}
   */
  @Test
  @DisplayName("Test checkSensitivityTenor(Tenor); when ofDays one; then return ofDays one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor SensitivityCsvInfoResolver.checkSensitivityTenor(Tenor)"})
  void testCheckSensitivityTenor_whenOfDaysOne_thenReturnOfDaysOne() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);

    // Act
    Tenor actualCheckSensitivityTenorResult =
        StandardCsvInfoImpl.INSTANCE.checkSensitivityTenor(tenor);

    // Assert
    assertSame(tenor, actualCheckSensitivityTenorResult);
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#checkSensitivityTenor(Tenor)}.
   *
   * <ul>
   *   <li>When ofMonths one.
   *   <li>Then return ofMonths one.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#checkSensitivityTenor(Tenor)}
   */
  @Test
  @DisplayName("Test checkSensitivityTenor(Tenor); when ofMonths one; then return ofMonths one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor SensitivityCsvInfoResolver.checkSensitivityTenor(Tenor)"})
  void testCheckSensitivityTenor_whenOfMonthsOne_thenReturnOfMonthsOne() {
    // Arrange
    Tenor tenor = Tenor.ofMonths(1);

    // Act
    Tenor actualCheckSensitivityTenorResult =
        StandardCsvInfoImpl.INSTANCE.checkSensitivityTenor(tenor);

    // Assert
    assertSame(tenor, actualCheckSensitivityTenorResult);
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#checkSensitivityTenor(Tenor)}.
   *
   * <ul>
   *   <li>When ofMonths twelve.
   *   <li>Then return {@link Tenor#TENOR_12M}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#checkSensitivityTenor(Tenor)}
   */
  @Test
  @DisplayName("Test checkSensitivityTenor(Tenor); when ofMonths twelve; then return TENOR_12M")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor SensitivityCsvInfoResolver.checkSensitivityTenor(Tenor)"})
  void testCheckSensitivityTenor_whenOfMonthsTwelve_thenReturnTenor_12m() {
    // Arrange, Act and Assert
    assertSame(
        Tenor.TENOR_12M, StandardCsvInfoImpl.INSTANCE.checkSensitivityTenor(Tenor.ofMonths(12)));
  }

  /**
   * Test {@link SensitivityCsvInfoResolver#checkCurveName(CurveName)}.
   *
   * <p>Method under test: {@link SensitivityCsvInfoResolver#checkCurveName(CurveName)}
   */
  @Test
  @DisplayName("Test checkCurveName(CurveName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveName SensitivityCsvInfoResolver.checkCurveName(CurveName)"})
  void testCheckCurveName() {
    // Arrange
    CurveName curveName = CurveName.of(CsvLoaderColumns.NAME_FIELD);

    // Act
    CurveName actualCheckCurveNameResult = StandardCsvInfoImpl.INSTANCE.checkCurveName(curveName);

    // Assert
    assertSame(curveName, actualCheckCurveNameResult);
  }
}
