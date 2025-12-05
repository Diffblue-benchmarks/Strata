package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.product.rate.IborRateComputation;
import com.opengamma.strata.product.rate.RateComputation;
import com.opengamma.strata.product.swap.IborRateStubCalculation.Builder;
import com.opengamma.strata.product.swap.IborRateStubCalculation.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IborRateStubCalculationDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> IborRateStubCalculation.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName("Test Builder set(String, Object) with 'propertyName', 'newValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> IborRateStubCalculation.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = IborRateStubCalculation.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link IborRateStubCalculation#createRateComputation(LocalDate, IborIndex,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link IborRateComputation}.
   * </ul>
   *
   * <p>Method under test: {@link IborRateStubCalculation#createRateComputation(LocalDate,
   * IborIndex, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test createRateComputation(LocalDate, IborIndex, ReferenceData); then return IborRateComputation")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RateComputation IborRateStubCalculation.createRateComputation(LocalDate, IborIndex, ReferenceData)"
  })
  void testCreateRateComputation_thenReturnIborRateComputation() {
    // Arrange
    IborRateStubCalculation iborRateStubCalculation = IborRateStubCalculation.NONE;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);

    IborIndex defaultIndex = mock(IborIndex.class);
    when(defaultIndex.getDayCount()).thenReturn(dayCount);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(defaultIndex.calculateEffectiveFromFixing(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    LocalDate ofResult2 = LocalDate.of(1970, 1, 1);
    when(defaultIndex.calculateMaturityFromEffective(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(ofResult2);

    // Act
    RateComputation actualCreateRateComputationResult =
        iborRateStubCalculation.createRateComputation(
            fixingDate, defaultIndex, mock(ReferenceData.class));

    // Assert
    verify(dayCount).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(defaultIndex).getDayCount();
    verify(defaultIndex)
        .calculateEffectiveFromFixing(isA(LocalDate.class), isA(ReferenceData.class));
    verify(defaultIndex)
        .calculateMaturityFromEffective(isA(LocalDate.class), isA(ReferenceData.class));
    assertTrue(actualCreateRateComputationResult instanceof IborRateComputation);
    assertEquals("1970-01-01", fixingDate.toString());
    assertNull(((IborRateComputation) actualCreateRateComputationResult).getCurrency());
    assertEquals(
        10.0d, ((IborRateComputation) actualCreateRateComputationResult).getYearFraction());
    assertFalse(iborRateStubCalculation.isFixedRate());
    assertFalse(iborRateStubCalculation.isFloatingRate());
    assertFalse(iborRateStubCalculation.isInterpolated());
    assertFalse(iborRateStubCalculation.isKnownAmount());
    Optional<IborIndex> index = iborRateStubCalculation.getIndex();
    assertFalse(index.isPresent());
    assertSame(index, iborRateStubCalculation.getIndexInterpolated());
    assertSame(index, iborRateStubCalculation.getKnownAmount());
    assertSame(
        ofResult, ((IborRateComputation) actualCreateRateComputationResult).getEffectiveDate());
    assertSame(
        fixingDate, ((IborRateComputation) actualCreateRateComputationResult).getFixingDate());
    assertSame(
        ofResult2, ((IborRateComputation) actualCreateRateComputationResult).getMaturityDate());
    assertSame(defaultIndex, ((IborRateComputation) actualCreateRateComputationResult).getIndex());
  }

  /**
   * Test {@link IborRateStubCalculation#createRateComputation(LocalDate, IborIndex,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link IborRateComputation}.
   * </ul>
   *
   * <p>Method under test: {@link IborRateStubCalculation#createRateComputation(LocalDate,
   * IborIndex, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test createRateComputation(LocalDate, IborIndex, ReferenceData); then return IborRateComputation")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RateComputation IborRateStubCalculation.createRateComputation(LocalDate, IborIndex, ReferenceData)"
  })
  void testCreateRateComputation_thenReturnIborRateComputation2() {
    // Arrange
    IborRateStubCalculation iborRateStubCalculation = IborRateStubCalculation.NONE;
    LocalDate fixingDate = LocalDate.of(1970, 1, 1);

    DayCount dayCount = mock(DayCount.class);
    when(dayCount.yearFraction(Mockito.<LocalDate>any(), Mockito.<LocalDate>any()))
        .thenReturn(10.0d);

    IborIndex defaultIndex = mock(IborIndex.class);
    when(defaultIndex.getDayCount()).thenReturn(dayCount);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(defaultIndex.calculateEffectiveFromFixing(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    LocalDate ofResult2 = LocalDate.of(1970, 1, 1);
    when(defaultIndex.calculateMaturityFromEffective(
            Mockito.<LocalDate>any(), Mockito.<ReferenceData>any()))
        .thenReturn(ofResult2);

    // Act
    RateComputation actualCreateRateComputationResult =
        iborRateStubCalculation.createRateComputation(
            fixingDate, defaultIndex, mock(ReferenceData.class));
    ImmutableSet.Builder<Index> builder = ImmutableSet.builder();
    actualCreateRateComputationResult.collectIndices(builder);

    // Assert
    verify(dayCount).yearFraction(isA(LocalDate.class), isA(LocalDate.class));
    verify(defaultIndex).getDayCount();
    verify(defaultIndex)
        .calculateEffectiveFromFixing(isA(LocalDate.class), isA(ReferenceData.class));
    verify(defaultIndex)
        .calculateMaturityFromEffective(isA(LocalDate.class), isA(ReferenceData.class));
    assertTrue(actualCreateRateComputationResult instanceof IborRateComputation);
    assertEquals("1970-01-01", fixingDate.toString());
    assertNull(((IborRateComputation) actualCreateRateComputationResult).getCurrency());
    assertEquals(
        10.0d, ((IborRateComputation) actualCreateRateComputationResult).getYearFraction());
    assertFalse(iborRateStubCalculation.isFixedRate());
    assertFalse(iborRateStubCalculation.isFloatingRate());
    assertFalse(iborRateStubCalculation.isInterpolated());
    assertFalse(iborRateStubCalculation.isKnownAmount());
    Optional<IborIndex> index = iborRateStubCalculation.getIndex();
    assertFalse(index.isPresent());
    assertSame(index, iborRateStubCalculation.getIndexInterpolated());
    assertSame(index, iborRateStubCalculation.getKnownAmount());
    assertSame(
        ofResult, ((IborRateComputation) actualCreateRateComputationResult).getEffectiveDate());
    assertSame(
        fixingDate, ((IborRateComputation) actualCreateRateComputationResult).getFixingDate());
    assertSame(
        ofResult2, ((IborRateComputation) actualCreateRateComputationResult).getMaturityDate());
    assertSame(defaultIndex, ((IborRateComputation) actualCreateRateComputationResult).getIndex());
  }

  /**
   * Test {@link IborRateStubCalculation#isFixedRate()}.
   *
   * <ul>
   *   <li>Given {@link IborRateStubCalculation#NONE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IborRateStubCalculation#isFixedRate()}
   */
  @Test
  @DisplayName("Test isFixedRate(); given NONE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IborRateStubCalculation.isFixedRate()"})
  void testIsFixedRate_givenNone_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IborRateStubCalculation.NONE.isFixedRate());
  }

  /**
   * Test {@link IborRateStubCalculation#isFixedRate()}.
   *
   * <ul>
   *   <li>Given ofFixedRate ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IborRateStubCalculation#isFixedRate()}
   */
  @Test
  @DisplayName("Test isFixedRate(); given ofFixedRate ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IborRateStubCalculation.isFixedRate()"})
  void testIsFixedRate_givenOfFixedRateTen_thenReturnTrue() {
    // Arrange
    IborRateStubCalculation ofFixedRateResult = IborRateStubCalculation.ofFixedRate(10.0d);

    // Act and Assert
    assertTrue(ofFixedRateResult.isFixedRate());
  }

  /**
   * Test {@link IborRateStubCalculation#isKnownAmount()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#isKnownAmount()}
   */
  @Test
  @DisplayName("Test isKnownAmount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IborRateStubCalculation.isKnownAmount()"})
  void testIsKnownAmount() {
    // Arrange, Act and Assert
    assertFalse(IborRateStubCalculation.NONE.isKnownAmount());
  }

  /**
   * Test {@link IborRateStubCalculation#isFloatingRate()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#isFloatingRate()}
   */
  @Test
  @DisplayName("Test isFloatingRate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IborRateStubCalculation.isFloatingRate()"})
  void testIsFloatingRate() {
    // Arrange, Act and Assert
    assertFalse(IborRateStubCalculation.NONE.isFloatingRate());
  }

  /**
   * Test {@link IborRateStubCalculation#isInterpolated()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#isInterpolated()}
   */
  @Test
  @DisplayName("Test isInterpolated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IborRateStubCalculation.isInterpolated()"})
  void testIsInterpolated() {
    // Arrange, Act and Assert
    assertFalse(IborRateStubCalculation.NONE.isInterpolated());
  }

  /**
   * Test {@link IborRateStubCalculation#meta()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborRateStubCalculation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborRateStubCalculation.meta();

    // Assert
    assertTrue(actualMetaResult.fixedRate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.index() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.indexInterpolated() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.knownAmount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link IborRateStubCalculation#metaBean()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborRateStubCalculation.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, IborRateStubCalculation.NONE.metaBean());
  }

  /**
   * Test {@link IborRateStubCalculation#getKnownAmount()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#getKnownAmount()}
   */
  @Test
  @DisplayName("Test getKnownAmount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional IborRateStubCalculation.getKnownAmount()"})
  void testGetKnownAmount() {
    // Arrange, Act and Assert
    assertFalse(IborRateStubCalculation.NONE.getKnownAmount().isPresent());
  }

  /**
   * Test {@link IborRateStubCalculation#getIndex()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#getIndex()}
   */
  @Test
  @DisplayName("Test getIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional IborRateStubCalculation.getIndex()"})
  void testGetIndex() {
    // Arrange, Act and Assert
    assertFalse(IborRateStubCalculation.NONE.getIndex().isPresent());
  }

  /**
   * Test {@link IborRateStubCalculation#getIndexInterpolated()}.
   *
   * <p>Method under test: {@link IborRateStubCalculation#getIndexInterpolated()}
   */
  @Test
  @DisplayName("Test getIndexInterpolated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional IborRateStubCalculation.getIndexInterpolated()"})
  void testGetIndexInterpolated() {
    // Arrange, Act and Assert
    assertFalse(IborRateStubCalculation.NONE.getIndexInterpolated().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborRateStubCalculation#toString()}
   *   <li>{@link IborRateStubCalculation#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Builder IborRateStubCalculation.toBuilder()",
    "String IborRateStubCalculation.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    IborRateStubCalculation iborRateStubCalculation = IborRateStubCalculation.NONE;

    // Act
    String actualToStringResult = iborRateStubCalculation.toString();
    iborRateStubCalculation.toBuilder();

    // Assert
    assertEquals(
        "IborRateStubCalculation{fixedRate=null, knownAmount=null, index=null, indexInterpolated=null}",
        actualToStringResult);
  }

  /**
   * Test {@link IborRateStubCalculation#equals(Object)}, and {@link
   * IborRateStubCalculation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborRateStubCalculation#equals(Object)}
   *   <li>{@link IborRateStubCalculation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborRateStubCalculation.equals(Object)",
    "int IborRateStubCalculation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IborRateStubCalculation iborRateStubCalculation = IborRateStubCalculation.NONE;
    IborRateStubCalculation iborRateStubCalculation2 = IborRateStubCalculation.NONE;

    // Act and Assert
    assertEquals(iborRateStubCalculation, iborRateStubCalculation2);
    assertEquals(iborRateStubCalculation.hashCode(), iborRateStubCalculation2.hashCode());
  }

  /**
   * Test {@link IborRateStubCalculation#equals(Object)}, and {@link
   * IborRateStubCalculation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborRateStubCalculation#equals(Object)}
   *   <li>{@link IborRateStubCalculation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborRateStubCalculation.equals(Object)",
    "int IborRateStubCalculation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    IborRateStubCalculation ofFixedRateResult = IborRateStubCalculation.ofFixedRate(10.0d);
    IborRateStubCalculation ofFixedRateResult2 = IborRateStubCalculation.ofFixedRate(10.0d);

    // Act and Assert
    assertEquals(ofFixedRateResult, ofFixedRateResult2);
    assertEquals(ofFixedRateResult.hashCode(), ofFixedRateResult2.hashCode());
  }

  /**
   * Test {@link IborRateStubCalculation#equals(Object)}, and {@link
   * IborRateStubCalculation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborRateStubCalculation#equals(Object)}
   *   <li>{@link IborRateStubCalculation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborRateStubCalculation.equals(Object)",
    "int IborRateStubCalculation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IborRateStubCalculation iborRateStubCalculation = IborRateStubCalculation.NONE;

    // Act and Assert
    assertEquals(iborRateStubCalculation, iborRateStubCalculation);
    int expectedHashCodeResult = iborRateStubCalculation.hashCode();
    assertEquals(expectedHashCodeResult, iborRateStubCalculation.hashCode());
  }

  /**
   * Test {@link IborRateStubCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborRateStubCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborRateStubCalculation.equals(Object)",
    "int IborRateStubCalculation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IborRateStubCalculation ofFixedRateResult = IborRateStubCalculation.ofFixedRate(10.0d);

    // Act and Assert
    assertNotEquals(ofFixedRateResult, IborRateStubCalculation.NONE);
  }

  /**
   * Test {@link IborRateStubCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborRateStubCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborRateStubCalculation.equals(Object)",
    "int IborRateStubCalculation.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IborRateStubCalculation.NONE, null);
  }

  /**
   * Test {@link IborRateStubCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborRateStubCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborRateStubCalculation.equals(Object)",
    "int IborRateStubCalculation.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IborRateStubCalculation.NONE, "Different type to IborRateStubCalculation");
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends IborRateStubCalculation> actualBeanTypeResult =
        IborRateStubCalculation.meta().beanType();

    // Assert
    Class<IborRateStubCalculation> expectedBeanTypeResult = IborRateStubCalculation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#fixedRate()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#indexInterpolated()}
   *   <li>{@link Meta#knownAmount()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.fixedRate()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.indexInterpolated()",
    "MetaProperty Meta.knownAmount()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborRateStubCalculation.meta();

    // Act
    MetaProperty<Double> actualFixedRateResult = metaResult.fixedRate();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();
    MetaProperty<IborIndex> actualIndexInterpolatedResult = metaResult.indexInterpolated();

    // Assert
    assertTrue(actualFixedRateResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualIndexInterpolatedResult instanceof DirectMetaProperty);
    assertTrue(metaResult.knownAmount() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then return name is {@code fixedRate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixedRate'; then return name is 'fixedRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixedRate_thenReturnNameIsFixedRate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateStubCalculation.meta().metaPropertyGet("fixedRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexInterpolatedResult = ((Meta) metaBeanResult).indexInterpolated();
    assertTrue(indexInterpolatedResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> knownAmountResult = ((Meta) metaBeanResult).knownAmount();
    assertTrue(knownAmountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixedRate", actualMetaPropertyGetResult.name());
    Class<Double> expectedPropertyTypeResult = Double.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixedRate());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, indexInterpolatedResult.metaBean());
    assertSame(metaBeanResult, knownAmountResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code indexInterpolated}.
   *   <li>Then return name is {@code indexInterpolated}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'indexInterpolated'; then return name is 'indexInterpolated'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndexInterpolated_thenReturnNameIsIndexInterpolated() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateStubCalculation.meta().metaPropertyGet("indexInterpolated");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> fixedRateResult = ((Meta) metaBeanResult).fixedRate();
    assertTrue(fixedRateResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> knownAmountResult = ((Meta) metaBeanResult).knownAmount();
    assertTrue(knownAmountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("indexInterpolated", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).indexInterpolated());
    assertSame(metaBeanResult, fixedRateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, knownAmountResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return name is {@code index}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'index'; then return name is 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndex_thenReturnNameIsIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateStubCalculation.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> fixedRateResult = ((Meta) metaBeanResult).fixedRate();
    assertTrue(fixedRateResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexInterpolatedResult = ((Meta) metaBeanResult).indexInterpolated();
    assertTrue(indexInterpolatedResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> knownAmountResult = ((Meta) metaBeanResult).knownAmount();
    assertTrue(knownAmountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, fixedRateResult.metaBean());
    assertSame(metaBeanResult, indexInterpolatedResult.metaBean());
    assertSame(metaBeanResult, knownAmountResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code knownAmount}.
   *   <li>Then return name is {@code knownAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'knownAmount'; then return name is 'knownAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenKnownAmount_thenReturnNameIsKnownAmount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateStubCalculation.meta().metaPropertyGet("knownAmount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> fixedRateResult = ((Meta) metaBeanResult).fixedRate();
    assertTrue(fixedRateResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<IborIndex> indexInterpolatedResult = ((Meta) metaBeanResult).indexInterpolated();
    assertTrue(indexInterpolatedResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("knownAmount", actualMetaPropertyGetResult.name());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).knownAmount());
    assertSame(metaBeanResult, fixedRateResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, indexInterpolatedResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IborRateStubCalculation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        IborRateStubCalculation.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("fixedRate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("indexInterpolated") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("knownAmount") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IborRateStubCalculation.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            IborRateStubCalculation.meta()
                .propertyGet(IborRateStubCalculation.NONE, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'fixedRate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFixedRate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        IborRateStubCalculation.meta()
            .propertyGet(IborRateStubCalculation.NONE, "fixedRate", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code indexInterpolated}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'indexInterpolated'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenIndexInterpolated_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        IborRateStubCalculation.meta()
            .propertyGet(IborRateStubCalculation.NONE, "indexInterpolated", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenIndex_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        IborRateStubCalculation.meta().propertyGet(IborRateStubCalculation.NONE, "index", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code knownAmount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'knownAmount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenKnownAmount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        IborRateStubCalculation.meta()
            .propertyGet(IborRateStubCalculation.NONE, "knownAmount", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            IborRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "fixedRate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixedRate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixedRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "fixedRate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code indexInterpolated}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'indexInterpolated'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndexInterpolated_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "indexInterpolated", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code knownAmount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'knownAmount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenKnownAmount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "knownAmount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            IborRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
