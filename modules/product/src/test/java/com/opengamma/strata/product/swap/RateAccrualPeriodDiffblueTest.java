package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.rate.RateComputation;
import com.opengamma.strata.product.swap.RateAccrualPeriod.Builder;
import com.opengamma.strata.product.swap.RateAccrualPeriod.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RateAccrualPeriodDiffblueTest {
  /**
   * Test {@link RateAccrualPeriod#builder()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RateAccrualPeriod#builder()}
   *   <li>{@link RateAccrualPeriod#gearing(double)}
   *   <li>{@link RateAccrualPeriod#spread(double)}
   * </ul>
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RateAccrualPeriod Builder.build()",
    "Builder Builder.gearing(double)",
    "Builder Builder.spread(double)",
    "String Builder.toString()"
  })
  void testBuilder() {
    // Arrange and Act
    Builder actualUnadjustedStartDateResult =
        RateAccrualPeriod.builder()
            .endDate(LocalDate.of(1970, 1, 1))
            .gearing(10.0d)
            .negativeRateMethod(NegativeRateMethod.ALLOW_NEGATIVE)
            .rateComputation(mock(RateComputation.class))
            .spread(10.0d)
            .startDate(LocalDate.of(1970, 1, 1))
            .unadjustedEndDate(LocalDate.of(1970, 1, 1))
            .unadjustedStartDate(LocalDate.of(1970, 1, 1));
    Builder actualYearFractionResult = actualUnadjustedStartDateResult.yearFraction(10.0d);

    // Assert
    assertSame(actualUnadjustedStartDateResult, actualYearFractionResult);
  }

  /**
   * Test Builder {@link Builder#endDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#endDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder endDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.endDate(LocalDate)"})
  void testBuilderEndDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualEndDateResult = builderResult.endDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualEndDateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'endDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenEndDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateAccrualPeriod.builder().get("endDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code negativeRateMethod}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'negativeRateMethod'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenNegativeRateMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> RateAccrualPeriod.builder().get("negativeRateMethod"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> RateAccrualPeriod.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code rateComputation}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'rateComputation'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRateComputation_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateAccrualPeriod.builder().get("rateComputation"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'startDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenStartDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateAccrualPeriod.builder().get("startDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'unadjustedEndDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenUnadjustedEndDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateAccrualPeriod.builder().get("unadjustedEndDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code unadjustedStartDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'unadjustedStartDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenUnadjustedStartDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateAccrualPeriod.builder().get("unadjustedStartDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'yearFraction'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenYearFraction_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ((Double) RateAccrualPeriod.builder().get("yearFraction")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#negativeRateMethod(NegativeRateMethod)}.
   *
   * <ul>
   *   <li>When {@code ALLOW_NEGATIVE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#negativeRateMethod(NegativeRateMethod)}
   */
  @Test
  @DisplayName(
      "Test Builder negativeRateMethod(NegativeRateMethod); when 'ALLOW_NEGATIVE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.negativeRateMethod(NegativeRateMethod)"})
  void testBuilderNegativeRateMethod_whenAllowNegative_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualNegativeRateMethodResult =
        builderResult.negativeRateMethod(NegativeRateMethod.ALLOW_NEGATIVE);

    // Assert
    assertSame(builderResult, actualNegativeRateMethodResult);
  }

  /**
   * Test Builder {@link Builder#rateComputation(RateComputation)}.
   *
   * <ul>
   *   <li>When {@link RateComputation}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#rateComputation(RateComputation)}
   */
  @Test
  @DisplayName(
      "Test Builder rateComputation(RateComputation); when RateComputation; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.rateComputation(RateComputation)"})
  void testBuilderRateComputation_whenRateComputation_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualRateComputationResult =
        builderResult.rateComputation(mock(RateComputation.class));

    // Assert
    assertSame(builderResult, actualRateComputationResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> RateAccrualPeriod.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'endDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenEndDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("endDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#startDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#startDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder startDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.startDate(LocalDate)"})
  void testBuilderStartDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualStartDateResult = builderResult.startDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualStartDateResult);
  }

  /**
   * Test Builder {@link Builder#unadjustedEndDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#unadjustedEndDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder unadjustedEndDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.unadjustedEndDate(LocalDate)"})
  void testBuilderUnadjustedEndDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualUnadjustedEndDateResult =
        builderResult.unadjustedEndDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualUnadjustedEndDateResult);
  }

  /**
   * Test Builder {@link Builder#unadjustedStartDate(LocalDate)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#unadjustedStartDate(LocalDate)}
   */
  @Test
  @DisplayName("Test Builder unadjustedStartDate(LocalDate); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.unadjustedStartDate(LocalDate)"})
  void testBuilderUnadjustedStartDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualUnadjustedStartDateResult =
        builderResult.unadjustedStartDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualUnadjustedStartDateResult);
  }

  /**
   * Test Builder {@link Builder#yearFraction(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#yearFraction(double)}
   */
  @Test
  @DisplayName("Test Builder yearFraction(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.yearFraction(double)"})
  void testBuilderYearFraction_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateAccrualPeriod.builder();

    // Act
    Builder actualYearFractionResult = builderResult.yearFraction(10.0d);

    // Assert
    assertSame(builderResult, actualYearFractionResult);
  }

  /**
   * Test {@link RateAccrualPeriod#meta()}.
   *
   * <p>Method under test: {@link RateAccrualPeriod#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RateAccrualPeriod.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RateAccrualPeriod.meta();

    // Assert
    assertTrue(actualMetaResult.endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.rateComputation() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.spread() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.startDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yearFraction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
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
    Class<? extends RateAccrualPeriod> actualBeanTypeResult = RateAccrualPeriod.meta().beanType();

    // Assert
    Class<RateAccrualPeriod> expectedBeanTypeResult = RateAccrualPeriod.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#gearing()}
   *   <li>{@link Meta#negativeRateMethod()}
   *   <li>{@link Meta#rateComputation()}
   *   <li>{@link Meta#spread()}
   *   <li>{@link Meta#startDate()}
   *   <li>{@link Meta#unadjustedEndDate()}
   *   <li>{@link Meta#unadjustedStartDate()}
   *   <li>{@link Meta#yearFraction()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.gearing()",
    "MetaProperty Meta.negativeRateMethod()",
    "MetaProperty Meta.rateComputation()",
    "MetaProperty Meta.spread()",
    "MetaProperty Meta.startDate()",
    "MetaProperty Meta.unadjustedEndDate()",
    "MetaProperty Meta.unadjustedStartDate()",
    "MetaProperty Meta.yearFraction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RateAccrualPeriod.meta();

    // Act
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<Double> actualGearingResult = metaResult.gearing();
    MetaProperty<NegativeRateMethod> actualNegativeRateMethodResult =
        metaResult.negativeRateMethod();
    MetaProperty<RateComputation> actualRateComputationResult = metaResult.rateComputation();
    MetaProperty<Double> actualSpreadResult = metaResult.spread();
    MetaProperty<LocalDate> actualStartDateResult = metaResult.startDate();
    MetaProperty<LocalDate> actualUnadjustedEndDateResult = metaResult.unadjustedEndDate();
    MetaProperty<LocalDate> actualUnadjustedStartDateResult = metaResult.unadjustedStartDate();

    // Assert
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualGearingResult instanceof DirectMetaProperty);
    assertTrue(actualNegativeRateMethodResult instanceof DirectMetaProperty);
    assertTrue(actualRateComputationResult instanceof DirectMetaProperty);
    assertTrue(actualSpreadResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualUnadjustedEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualUnadjustedStartDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFraction() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code negativeRateMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'negativeRateMethod'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsNegativeRateMethod() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("negativeRateMethod");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("negativeRateMethod", actualMetaPropertyGetResult.name());
    Class<NegativeRateMethod> expectedPropertyTypeResult = NegativeRateMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).negativeRateMethod());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code unadjustedStartDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'unadjustedStartDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsUnadjustedStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("unadjustedStartDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("unadjustedStartDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).unadjustedStartDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return name is {@code endDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'endDate'; then return name is 'endDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEndDate_thenReturnNameIsEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code gearing}.
   *   <li>Then return name is {@code gearing}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'gearing'; then return name is 'gearing'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenGearing_thenReturnNameIsGearing() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("gearing");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("gearing", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).gearing());
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
    assertNull(RateAccrualPeriod.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rateComputation}.
   *   <li>Then return name is {@code rateComputation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'rateComputation'; then return name is 'rateComputation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRateComputation_thenReturnNameIsRateComputation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("rateComputation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("rateComputation", actualMetaPropertyGetResult.name());
    Class<RateComputation> expectedPropertyTypeResult = RateComputation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rateComputation());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spread}.
   *   <li>Then return name is {@code spread}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'spread'; then return name is 'spread'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpread_thenReturnNameIsSpread() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("spread");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("spread", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spread());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return name is {@code startDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startDate'; then return name is 'startDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartDate_thenReturnNameIsStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then return name is {@code unadjustedEndDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'unadjustedEndDate'; then return name is 'unadjustedEndDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnadjustedEndDate_thenReturnNameIsUnadjustedEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("unadjustedEndDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("unadjustedEndDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).unadjustedEndDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yearFraction}.
   *   <li>Then return name is {@code yearFraction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yearFraction'; then return name is 'yearFraction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYearFraction_thenReturnNameIsYearFraction() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateAccrualPeriod.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateComputation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertEquals("yearFraction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yearFraction());
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
        RateAccrualPeriod.meta().metaPropertyMap();

    // Assert
    assertEquals(9, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("endDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("gearing") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("negativeRateMethod") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rateComputation") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("spread") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("unadjustedEndDate") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("unadjustedStartDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFraction") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'endDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEndDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> RateAccrualPeriod.meta().propertySet(mock(Bean.class), "endDate", "New Value", true));
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
            RateAccrualPeriod.meta().propertySet(mock(Bean.class), "endDate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code gearing}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'gearing'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenGearing_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> RateAccrualPeriod.meta().propertySet(mock(Bean.class), "gearing", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code negativeRateMethod}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'negativeRateMethod'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNegativeRateMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateAccrualPeriod.meta()
                .propertySet(mock(Bean.class), "negativeRateMethod", "New Value", true));
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
            RateAccrualPeriod.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rateComputation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rateComputation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRateComputation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateAccrualPeriod.meta()
                .propertySet(mock(Bean.class), "rateComputation", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code spread}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'spread'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpread_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> RateAccrualPeriod.meta().propertySet(mock(Bean.class), "spread", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateAccrualPeriod.meta().propertySet(mock(Bean.class), "startDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'unadjustedEndDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnadjustedEndDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateAccrualPeriod.meta()
                .propertySet(mock(Bean.class), "unadjustedEndDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjustedStartDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'unadjustedStartDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnadjustedStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateAccrualPeriod.meta()
                .propertySet(mock(Bean.class), "unadjustedStartDate", "New Value", true));
  }
}
