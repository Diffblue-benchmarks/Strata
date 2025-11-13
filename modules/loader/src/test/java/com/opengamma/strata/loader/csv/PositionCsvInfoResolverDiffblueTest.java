package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.io.CsvRow;
import com.opengamma.strata.product.SecurityPosition;
import com.opengamma.strata.product.etd.EtdContractSpec;
import com.opengamma.strata.product.etd.EtdFuturePosition;
import com.opengamma.strata.product.etd.EtdOptionPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PositionCsvInfoResolverDiffblueTest {
  /**
   * Test {@link PositionCsvInfoResolver#standard()}.
   *
   * <p>Method under test: {@link PositionCsvInfoResolver#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionCsvInfoResolver PositionCsvInfoResolver.standard()"})
  void testStandard() {
    // Arrange and Act
    PositionCsvInfoResolver actualStandardResult = PositionCsvInfoResolver.standard();
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
   * Test {@link PositionCsvInfoResolver#of(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return {@link StandardCsvInfoImpl}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvInfoResolver#of(ReferenceData)}
   */
  @Test
  @DisplayName("Test of(ReferenceData); when ReferenceData; then return StandardCsvInfoImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionCsvInfoResolver PositionCsvInfoResolver.of(ReferenceData)"})
  void testOf_whenReferenceData_thenReturnStandardCsvInfoImpl() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    PositionCsvInfoResolver actualOfResult = PositionCsvInfoResolver.of(refData);
    ReferenceData actualReferenceData = actualOfResult.getReferenceData();

    // Assert
    assertTrue(actualOfResult instanceof StandardCsvInfoImpl);
    assertTrue(((StandardCsvInfoImpl) actualOfResult).isTenorRequired());
    assertSame(refData, actualOfResult.getReferenceData());
    assertSame(refData, actualReferenceData);
  }

  /**
   * Test {@link PositionCsvInfoResolver#completePosition(CsvRow, EtdFuturePosition,
   * EtdContractSpec)} with {@code CsvRow}, {@code EtdFuturePosition}, {@code EtdContractSpec}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvInfoResolver#completePosition(CsvRow,
   * EtdFuturePosition, EtdContractSpec)}
   */
  @Test
  @DisplayName(
      "Test completePosition(CsvRow, EtdFuturePosition, EtdContractSpec) with 'CsvRow', 'EtdFuturePosition', 'EtdContractSpec'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "EtdFuturePosition PositionCsvInfoResolver.completePosition(CsvRow, EtdFuturePosition, EtdContractSpec)"
  })
  void testCompletePositionWithCsvRowEtdFuturePositionEtdContractSpec_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        LightweightCsvInfoImpl.INSTANCE.completePosition(null, (EtdFuturePosition) null, null));
  }

  /**
   * Test {@link PositionCsvInfoResolver#completePosition(CsvRow, EtdOptionPosition,
   * EtdContractSpec)} with {@code CsvRow}, {@code EtdOptionPosition}, {@code EtdContractSpec}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvInfoResolver#completePosition(CsvRow,
   * EtdOptionPosition, EtdContractSpec)}
   */
  @Test
  @DisplayName(
      "Test completePosition(CsvRow, EtdOptionPosition, EtdContractSpec) with 'CsvRow', 'EtdOptionPosition', 'EtdContractSpec'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "EtdOptionPosition PositionCsvInfoResolver.completePosition(CsvRow, EtdOptionPosition, EtdContractSpec)"
  })
  void testCompletePositionWithCsvRowEtdOptionPositionEtdContractSpec_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        LightweightCsvInfoImpl.INSTANCE.completePosition(null, (EtdOptionPosition) null, null));
  }

  /**
   * Test {@link PositionCsvInfoResolver#completePosition(CsvRow, SecurityPosition)} with {@code
   * CsvRow}, {@code SecurityPosition}.
   *
   * <ul>
   *   <li>Given {@link LightweightCsvInfoImpl#INSTANCE}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvInfoResolver#completePosition(CsvRow,
   * SecurityPosition)}
   */
  @Test
  @DisplayName(
      "Test completePosition(CsvRow, SecurityPosition) with 'CsvRow', 'SecurityPosition'; given INSTANCE; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SecurityPosition PositionCsvInfoResolver.completePosition(CsvRow, SecurityPosition)"
  })
  void testCompletePositionWithCsvRowSecurityPosition_givenInstance_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(LightweightCsvInfoImpl.INSTANCE.completePosition(null, null));
  }
}
