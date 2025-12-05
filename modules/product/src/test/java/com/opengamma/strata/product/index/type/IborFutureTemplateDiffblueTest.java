package com.opengamma.strata.product.index.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import com.opengamma.strata.basics.date.SequenceDate;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.ImmutableFloatingRateName;
import com.opengamma.strata.basics.index.ImmutableIborIndex;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Map;
import java.util.Optional;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IborFutureTemplateDiffblueTest {
  /**
   * Test {@link IborFutureTemplate#of(Period, int, IborFutureConvention)} with {@code
   * minimumPeriod}, {@code sequenceNumber}, {@code convention}.
   *
   * <p>Method under test: {@link IborFutureTemplate#of(Period, int, IborFutureConvention)}
   */
  @Test
  @DisplayName(
      "Test of(Period, int, IborFutureConvention) with 'minimumPeriod', 'sequenceNumber', 'convention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborFutureTemplate IborFutureTemplate.of(Period, int, IborFutureConvention)"})
  void testOfWithMinimumPeriodSequenceNumberConvention() {
    // Arrange and Act
    IborFutureTemplate actualOfResult =
        IborFutureTemplate.of(null, 10, IborFutureConventions.EUR_EURIBOR_3M_QUARTERLY_IMM);

    // Assert
    IborIndex index = actualOfResult.getIndex();
    assertTrue(index.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(index instanceof ImmutableIborIndex);
    IborFutureContractSpec contractSpec = actualOfResult.getContractSpec();
    assertTrue(contractSpec instanceof ImmutableIborFutureContractSpec);
    IborFutureConvention convention = actualOfResult.getConvention();
    assertTrue(convention instanceof ImmutableIborFutureConvention);
    assertEquals("EUR-EURIBOR-3M", index.getName());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", contractSpec.getName());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", convention.getName());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", contractSpec.toString());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", convention.toString());
    SequenceDate sequenceDate = actualOfResult.getSequenceDate();
    assertEquals(10, sequenceDate.getSequenceNumber());
    assertEquals(1000000.0d, contractSpec.getNotional());
    assertFalse(sequenceDate.isFullSequence());
    Optional<Period> minimumPeriod = sequenceDate.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertTrue(index.isActive());
    assertSame(minimumPeriod, sequenceDate.getYearMonth());
    assertSame(index, contractSpec.getIndex());
    assertSame(index, convention.getIndex());
  }

  /**
   * Test {@link IborFutureTemplate#of(SequenceDate, IborFutureContractSpec)} with {@code
   * sequenceDate}, {@code contractSpec}.
   *
   * <p>Method under test: {@link IborFutureTemplate#of(SequenceDate, IborFutureContractSpec)}
   */
  @Test
  @DisplayName("Test of(SequenceDate, IborFutureContractSpec) with 'sequenceDate', 'contractSpec'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureTemplate IborFutureTemplate.of(SequenceDate, IborFutureContractSpec)"
  })
  void testOfWithSequenceDateContractSpec() {
    // Arrange
    SequenceDate sequenceDate = SequenceDate.base(10);
    IborFutureContractSpec contractSpec = IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX;

    // Act
    IborFutureTemplate actualOfResult = IborFutureTemplate.of(sequenceDate, contractSpec);

    // Assert
    IborIndex index = actualOfResult.getIndex();
    assertTrue(index.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(index instanceof ImmutableIborIndex);
    IborFutureConvention convention = actualOfResult.getConvention();
    assertTrue(convention instanceof ImmutableIborFutureConvention);
    assertEquals("EUR-EURIBOR-3M", index.getName());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", convention.getName());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", convention.toString());
    assertTrue(index.isActive());
    assertSame(sequenceDate, actualOfResult.getSequenceDate());
    assertSame(contractSpec, actualOfResult.getContractSpec());
    assertSame(index, convention.getIndex());
  }

  /**
   * Test {@link IborFutureTemplate#of(YearMonth, IborFutureConvention)} with {@code yearMonth},
   * {@code convention}.
   *
   * <p>Method under test: {@link IborFutureTemplate#of(YearMonth, IborFutureConvention)}
   */
  @Test
  @DisplayName("Test of(YearMonth, IborFutureConvention) with 'yearMonth', 'convention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborFutureTemplate IborFutureTemplate.of(YearMonth, IborFutureConvention)"})
  void testOfWithYearMonthConvention() {
    // Arrange and Act
    IborFutureTemplate actualOfResult =
        IborFutureTemplate.of(
            YearMonth.of(1970, Month.JANUARY), IborFutureConventions.EUR_EURIBOR_3M_QUARTERLY_IMM);

    // Assert
    IborIndex index = actualOfResult.getIndex();
    assertTrue(index.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(index instanceof ImmutableIborIndex);
    IborFutureContractSpec contractSpec = actualOfResult.getContractSpec();
    assertTrue(contractSpec instanceof ImmutableIborFutureContractSpec);
    IborFutureConvention convention = actualOfResult.getConvention();
    assertTrue(convention instanceof ImmutableIborFutureConvention);
    assertSame(index, contractSpec.getIndex());
    assertSame(index, convention.getIndex());
  }

  /**
   * Test {@link IborFutureTemplate#of(YearMonth, IborFutureConvention)} with {@code yearMonth},
   * {@code convention}.
   *
   * <p>Method under test: {@link IborFutureTemplate#of(YearMonth, IborFutureConvention)}
   */
  @Test
  @DisplayName("Test of(YearMonth, IborFutureConvention) with 'yearMonth', 'convention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborFutureTemplate IborFutureTemplate.of(YearMonth, IborFutureConvention)"})
  void testOfWithYearMonthConvention2() {
    // Arrange and Act
    IborFutureTemplate actualOfResult =
        IborFutureTemplate.of(null, IborFutureConventions.EUR_EURIBOR_3M_QUARTERLY_IMM);

    // Assert
    assertTrue(actualOfResult.getContractSpec() instanceof ImmutableIborFutureContractSpec);
    assertTrue(actualOfResult.getConvention() instanceof ImmutableIborFutureConvention);
  }

  /**
   * Test {@link IborFutureTemplate#getIndex()}.
   *
   * <p>Method under test: {@link IborFutureTemplate#getIndex()}
   */
  @Test
  @DisplayName("Test getIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborIndex IborFutureTemplate.getIndex()"})
  void testGetIndex() {
    // Arrange and Act
    IborIndex actualIndex =
        IborFutureTemplate.of(
                SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX)
            .getIndex();

    // Assert
    assertTrue(actualIndex.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(actualIndex instanceof ImmutableIborIndex);
    assertEquals("EUR-EURIBOR-3M", actualIndex.getName());
    assertTrue(actualIndex.isActive());
  }

  /**
   * Test {@link IborFutureTemplate#getConvention()}.
   *
   * <p>Method under test: {@link IborFutureTemplate#getConvention()}
   */
  @Test
  @DisplayName("Test getConvention()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborFutureConvention IborFutureTemplate.getConvention()"})
  void testGetConvention() {
    // Arrange and Act
    IborFutureConvention actualConvention =
        IborFutureTemplate.of(
                SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX)
            .getConvention();

    // Assert
    IborIndex index = actualConvention.getIndex();
    assertTrue(index.getFloatingRateName() instanceof ImmutableFloatingRateName);
    assertTrue(index instanceof ImmutableIborIndex);
    assertTrue(actualConvention instanceof ImmutableIborFutureConvention);
    assertEquals("EUR-EURIBOR-3M", index.getName());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", actualConvention.getName());
    assertEquals("EUR-EURIBOR-3M-IMM-ICE", actualConvention.toString());
    assertTrue(index.isActive());
  }

  /**
   * Test {@link IborFutureTemplate#calculateReferenceDateFromTradeDate(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureTemplate#calculateReferenceDateFromTradeDate(LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateReferenceDateFromTradeDate(LocalDate, ReferenceData); then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate IborFutureTemplate.calculateReferenceDateFromTradeDate(LocalDate, ReferenceData)"
  })
  void testCalculateReferenceDateFromTradeDate_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    IborFutureContractSpec contractSpec = mock(IborFutureContractSpec.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(contractSpec.calculateReferenceDate(
            Mockito.<LocalDate>any(), Mockito.<SequenceDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);

    // Act
    LocalDate actualCalculateReferenceDateFromTradeDateResult =
        IborFutureTemplate.of(SequenceDate.base(10), contractSpec)
            .calculateReferenceDateFromTradeDate(
                LocalDate.of(1970, 1, 1), mock(ReferenceData.class));

    // Assert
    verify(contractSpec)
        .calculateReferenceDate(
            isA(LocalDate.class), isA(SequenceDate.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateReferenceDateFromTradeDateResult);
  }

  /**
   * Test {@link IborFutureTemplate#meta()}.
   *
   * <p>Method under test: {@link IborFutureTemplate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IborFutureTemplate.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<IborFutureTemplate> actualMetaResult = IborFutureTemplate.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("contractSpec"));
    assertTrue(metaPropertyMapResult.containsKey("sequenceDate"));
    assertTrue(actualMetaResult.isBuildable());
    Class<IborFutureTemplate> expectedBeanTypeResult = IborFutureTemplate.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link IborFutureTemplate#metaBean()}.
   *
   * <p>Method under test: {@link IborFutureTemplate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IborFutureTemplate.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<IborFutureTemplate> actualMetaBeanResult =
        IborFutureTemplate.of(
                SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX)
            .metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(2, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("contractSpec"));
    assertTrue(metaPropertyMapResult.containsKey("sequenceDate"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<IborFutureTemplate> expectedBeanTypeResult = IborFutureTemplate.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborFutureTemplate#toString()}
   *   <li>{@link IborFutureTemplate#getContractSpec()}
   *   <li>{@link IborFutureTemplate#getSequenceDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureContractSpec IborFutureTemplate.getContractSpec()",
    "SequenceDate IborFutureTemplate.getSequenceDate()",
    "String IborFutureTemplate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SequenceDate sequenceDate = SequenceDate.base(10);
    IborFutureTemplate ofResult =
        IborFutureTemplate.of(sequenceDate, IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX);

    // Act
    String actualToStringResult = ofResult.toString();
    IborFutureContractSpec actualContractSpec = ofResult.getContractSpec();

    // Assert
    assertTrue(actualContractSpec instanceof ImmutableIborFutureContractSpec);
    assertEquals(
        "IborFutureTemplate{sequenceDate=SequenceDate{yearMonth=null, minimumPeriod=null, sequenceNumber=10,"
            + " fullSequence=false}, contractSpec=EUR-EURIBOR-3M-IMM-ICE}",
        actualToStringResult);
    assertSame(sequenceDate, ofResult.getSequenceDate());
  }

  /**
   * Test {@link IborFutureTemplate#equals(Object)}, and {@link IborFutureTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborFutureTemplate#equals(Object)}
   *   <li>{@link IborFutureTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureTemplate.equals(Object)",
    "int IborFutureTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IborFutureTemplate ofResult =
        IborFutureTemplate.of(
            SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX);
    IborFutureTemplate ofResult2 =
        IborFutureTemplate.of(
            SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link IborFutureTemplate#equals(Object)}, and {@link IborFutureTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborFutureTemplate#equals(Object)}
   *   <li>{@link IborFutureTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureTemplate.equals(Object)",
    "int IborFutureTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IborFutureTemplate ofResult =
        IborFutureTemplate.of(
            SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link IborFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureTemplate.equals(Object)",
    "int IborFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IborFutureTemplate ofResult =
        IborFutureTemplate.of(
            SequenceDate.full(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborFutureTemplate.of(
            SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX));
  }

  /**
   * Test {@link IborFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureTemplate.equals(Object)",
    "int IborFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    IborFutureTemplate ofResult =
        IborFutureTemplate.of(SequenceDate.base(10), IborFutureContractSpecs.GBP_LIBOR_3M_IMM_ICE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        IborFutureTemplate.of(
            SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX));
  }

  /**
   * Test {@link IborFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureTemplate.equals(Object)",
    "int IborFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        IborFutureTemplate.of(
            SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX),
        null);
  }

  /**
   * Test {@link IborFutureTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborFutureTemplate.equals(Object)",
    "int IborFutureTemplate.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        IborFutureTemplate.of(
            SequenceDate.base(10), IborFutureContractSpecs.EUR_EURIBOR_3M_IMM_EUREX),
        "Different type to IborFutureTemplate");
  }
}
