package com.opengamma.strata.product.index.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.SequenceDate;
import com.opengamma.strata.basics.index.ImmutableFloatingRateName;
import com.opengamma.strata.basics.index.ImmutableOvernightIndex;
import com.opengamma.strata.basics.index.OvernightIndex;
import java.time.LocalDate;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OvernightFutureTemplateDiffblueTest {
  /**
   * Test {@link OvernightFutureTemplate#of(SequenceDate, OvernightFutureContractSpec)}.
   *
   * <ul>
   *   <li>Then Index FloatingRateName return {@link ImmutableFloatingRateName}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureTemplate#of(SequenceDate,
   * OvernightFutureContractSpec)}
   */
  @Test
  @DisplayName(
      "Test of(SequenceDate, OvernightFutureContractSpec); then Index FloatingRateName return ImmutableFloatingRateName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureTemplate OvernightFutureTemplate.of(SequenceDate, OvernightFutureContractSpec)"
  })
  void testOf_thenIndexFloatingRateNameReturnImmutableFloatingRateName() {
    // Arrange
    SequenceDate sequenceDate = SequenceDate.base(10);
    OvernightFutureContractSpec contractSpec = OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX;

    // Act
    OvernightFutureTemplate actualOfResult = OvernightFutureTemplate.of(sequenceDate, contractSpec);

    // Assert
    OvernightIndex index = actualOfResult.getIndex();
    assertTrue(index.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(index instanceof ImmutableOvernightIndex);
    assertEquals("CHF-SARON", index.getName());
    assertEquals(0, index.getEffectiveDateOffset());
    assertEquals(0, index.getPublicationDateOffset());
    assertTrue(index.isActive());
    assertSame(sequenceDate, actualOfResult.getSequenceDate());
    assertSame(contractSpec, actualOfResult.getContractSpec());
  }

  /**
   * Test {@link OvernightFutureTemplate#getIndex()}.
   *
   * <p>Method under test: {@link OvernightFutureTemplate#getIndex()}
   */
  @Test
  @DisplayName("Test getIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OvernightIndex OvernightFutureTemplate.getIndex()"})
  void testGetIndex() {
    // Arrange and Act
    OvernightIndex actualIndex =
        OvernightFutureTemplate.of(
                SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX)
            .getIndex();

    // Assert
    assertTrue(actualIndex.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(actualIndex instanceof ImmutableOvernightIndex);
    assertEquals("CHF-SARON", actualIndex.getName());
    assertEquals(0, actualIndex.getEffectiveDateOffset());
    assertEquals(0, actualIndex.getPublicationDateOffset());
    assertTrue(actualIndex.isActive());
  }

  /**
   * Test {@link OvernightFutureTemplate#calculateReferenceDateFromTradeDate(LocalDate,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1972-06-21}.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTemplate#calculateReferenceDateFromTradeDate(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateReferenceDateFromTradeDate(LocalDate, ReferenceData); then return toString is '1972-06-21'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate OvernightFutureTemplate.calculateReferenceDateFromTradeDate(LocalDate, ReferenceData)"
  })
  void testCalculateReferenceDateFromTradeDate_thenReturnToStringIs19720621() {
    // Arrange
    OvernightFutureTemplate ofResult =
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX);
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any())).thenReturn(null);

    // Act
    LocalDate actualCalculateReferenceDateFromTradeDateResult =
        ofResult.calculateReferenceDateFromTradeDate(tradeDate, refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1972-06-21", actualCalculateReferenceDateFromTradeDateResult.toString());
  }

  /**
   * Test {@link OvernightFutureTemplate#meta()}.
   *
   * <p>Method under test: {@link OvernightFutureTemplate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean OvernightFutureTemplate.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<OvernightFutureTemplate> actualMetaResult = OvernightFutureTemplate.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("contractSpec"));
    assertTrue(metaPropertyMapResult.containsKey("sequenceDate"));
    assertTrue(actualMetaResult.isBuildable());
    Class<OvernightFutureTemplate> expectedBeanTypeResult = OvernightFutureTemplate.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link OvernightFutureTemplate#metaBean()}.
   *
   * <p>Method under test: {@link OvernightFutureTemplate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean OvernightFutureTemplate.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<OvernightFutureTemplate> actualMetaBeanResult =
        OvernightFutureTemplate.of(
                SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX)
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("contractSpec"));
    assertTrue(metaPropertyMapResult.containsKey("sequenceDate"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<OvernightFutureTemplate> expectedBeanTypeResult = OvernightFutureTemplate.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightFutureTemplate#toString()}
   *   <li>{@link OvernightFutureTemplate#getContractSpec()}
   *   <li>{@link OvernightFutureTemplate#getSequenceDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureContractSpec OvernightFutureTemplate.getContractSpec()",
    "SequenceDate OvernightFutureTemplate.getSequenceDate()",
    "String OvernightFutureTemplate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SequenceDate sequenceDate = SequenceDate.base(10);
    OvernightFutureTemplate ofResult =
        OvernightFutureTemplate.of(
            sequenceDate, OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX);

    // Act
    String actualToStringResult = ofResult.toString();
    OvernightFutureContractSpec actualContractSpec = ofResult.getContractSpec();

    // Assert
    assertTrue(actualContractSpec instanceof ImmutableOvernightFutureContractSpec);
    assertEquals(
        "OvernightFutureTemplate{sequenceDate=SequenceDate{yearMonth=null, minimumPeriod=null, sequenceNumber=10,"
            + " fullSequence=false}, contractSpec=CHF-SARON-3M-IMM-EUREX}",
        actualToStringResult);
    assertSame(sequenceDate, ofResult.getSequenceDate());
  }

  /**
   * Test {@link OvernightFutureTemplate#equals(Object)}, and {@link
   * OvernightFutureTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightFutureTemplate#equals(Object)}
   *   <li>{@link OvernightFutureTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureTemplate.equals(Object)",
    "int OvernightFutureTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    OvernightFutureTemplate ofResult =
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX);
    OvernightFutureTemplate ofResult2 =
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link OvernightFutureTemplate#equals(Object)}, and {@link
   * OvernightFutureTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightFutureTemplate#equals(Object)}
   *   <li>{@link OvernightFutureTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureTemplate.equals(Object)",
    "int OvernightFutureTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    OvernightFutureTemplate ofResult =
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link OvernightFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureTemplate.equals(Object)",
    "int OvernightFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    OvernightFutureTemplate ofResult =
        OvernightFutureTemplate.of(
            SequenceDate.full(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX);

    // Act and Assert
    assertNotEquals(
        ofResult,
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX));
  }

  /**
   * Test {@link OvernightFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureTemplate.equals(Object)",
    "int OvernightFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    OvernightFutureTemplate ofResult =
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_ICE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX));
  }

  /**
   * Test {@link OvernightFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureTemplate.equals(Object)",
    "int OvernightFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX),
        null);
  }

  /**
   * Test {@link OvernightFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightFutureTemplate.equals(Object)",
    "int OvernightFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        OvernightFutureTemplate.of(
            SequenceDate.base(10), OvernightFutureContractSpecs.CHF_SARON_3M_IMM_EUREX),
        "Different type to OvernightFutureTemplate");
  }
}
