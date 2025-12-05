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
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.product.swap.PaymentSchedule.Builder;
import com.opengamma.strata.product.swap.PaymentSchedule.Meta;
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

class PaymentScheduleDiffblueTest {
  /**
   * Test Builder {@link Builder#compoundingMethod(CompoundingMethod)}.
   *
   * <ul>
   *   <li>When {@code NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#compoundingMethod(CompoundingMethod)}
   */
  @Test
  @DisplayName(
      "Test Builder compoundingMethod(CompoundingMethod); when 'NONE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.compoundingMethod(CompoundingMethod)"})
  void testBuilderCompoundingMethod_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PaymentSchedule.builder();

    // Act
    Builder actualCompoundingMethodResult = builderResult.compoundingMethod(CompoundingMethod.NONE);

    // Assert
    assertSame(builderResult, actualCompoundingMethodResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code compoundingMethod}.
   *   <li>Then return {@link CompoundingMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'compoundingMethod'; then return CompoundingMethod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCompoundingMethod_thenReturnCompoundingMethod() {
    // Arrange and Act
    Object actualGetResult = PaymentSchedule.builder().get("compoundingMethod");

    // Assert
    assertTrue(actualGetResult instanceof CompoundingMethod);
    assertEquals(CompoundingMethod.NONE, actualGetResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentDateOffset}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentDateOffset'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentDateOffset_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PaymentSchedule.builder().get("paymentDateOffset"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentFrequency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentFrequency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentFrequency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PaymentSchedule.builder().get("paymentFrequency"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentRelativeTo}.
   *   <li>Then return {@link PaymentRelativeTo}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentRelativeTo'; then return PaymentRelativeTo")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentRelativeTo_thenReturnPaymentRelativeTo() {
    // Arrange and Act
    Object actualGetResult = PaymentSchedule.builder().get("paymentRelativeTo");

    // Assert
    assertTrue(actualGetResult instanceof PaymentRelativeTo);
    assertEquals(PaymentRelativeTo.PERIOD_END, actualGetResult);
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
        NoSuchElementException.class, () -> PaymentSchedule.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#paymentDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder paymentDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentDateOffset(DaysAdjustment)"})
  void testBuilderPaymentDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PaymentSchedule.builder();

    // Act
    Builder actualPaymentDateOffsetResult = builderResult.paymentDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualPaymentDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#paymentFrequency(Frequency)}.
   *
   * <ul>
   *   <li>When ofDays one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentFrequency(Frequency)}
   */
  @Test
  @DisplayName("Test Builder paymentFrequency(Frequency); when ofDays one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentFrequency(Frequency)"})
  void testBuilderPaymentFrequency_whenOfDaysOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PaymentSchedule.builder();

    // Act
    Builder actualPaymentFrequencyResult = builderResult.paymentFrequency(Frequency.ofDays(1));

    // Assert
    assertSame(builderResult, actualPaymentFrequencyResult);
  }

  /**
   * Test Builder {@link Builder#paymentRelativeTo(PaymentRelativeTo)}.
   *
   * <ul>
   *   <li>When {@code PERIOD_START}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentRelativeTo(PaymentRelativeTo)}
   */
  @Test
  @DisplayName(
      "Test Builder paymentRelativeTo(PaymentRelativeTo); when 'PERIOD_START'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentRelativeTo(PaymentRelativeTo)"})
  void testBuilderPaymentRelativeTo_whenPeriodStart_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PaymentSchedule.builder();

    // Act
    Builder actualPaymentRelativeToResult =
        builderResult.paymentRelativeTo(PaymentRelativeTo.PERIOD_START);

    // Assert
    assertSame(builderResult, actualPaymentRelativeToResult);
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
        () -> PaymentSchedule.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code compoundingMethod}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'compoundingMethod'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCompoundingMethod_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PaymentSchedule.builder();

    // Act
    Builder actualSetResult = builderResult.set("compoundingMethod", null);

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
    Builder builderResult = PaymentSchedule.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Class<? extends PaymentSchedule> actualBeanTypeResult = PaymentSchedule.meta().beanType();

    // Assert
    Class<PaymentSchedule> expectedBeanTypeResult = PaymentSchedule.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#businessDayAdjustment()}
   *   <li>{@link Meta#compoundingMethod()}
   *   <li>{@link Meta#firstRegularStartDate()}
   *   <li>{@link Meta#lastRegularEndDate()}
   *   <li>{@link Meta#paymentDateOffset()}
   *   <li>{@link Meta#paymentFrequency()}
   *   <li>{@link Meta#paymentRelativeTo()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.businessDayAdjustment()",
    "MetaProperty Meta.compoundingMethod()",
    "MetaProperty Meta.firstRegularStartDate()",
    "MetaProperty Meta.lastRegularEndDate()",
    "MetaProperty Meta.paymentDateOffset()",
    "MetaProperty Meta.paymentFrequency()",
    "MetaProperty Meta.paymentRelativeTo()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = PaymentSchedule.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualBusinessDayAdjustmentResult =
        metaResult.businessDayAdjustment();
    MetaProperty<CompoundingMethod> actualCompoundingMethodResult = metaResult.compoundingMethod();
    MetaProperty<LocalDate> actualFirstRegularStartDateResult = metaResult.firstRegularStartDate();
    MetaProperty<LocalDate> actualLastRegularEndDateResult = metaResult.lastRegularEndDate();
    MetaProperty<DaysAdjustment> actualPaymentDateOffsetResult = metaResult.paymentDateOffset();
    MetaProperty<Frequency> actualPaymentFrequencyResult = metaResult.paymentFrequency();

    // Assert
    assertTrue(actualBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualCompoundingMethodResult instanceof DirectMetaProperty);
    assertTrue(actualFirstRegularStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualLastRegularEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentFrequencyResult instanceof DirectMetaProperty);
    assertTrue(metaResult.paymentRelativeTo() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code businessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'businessDayAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsBusinessDayAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PaymentSchedule.meta().metaPropertyGet("businessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentRelativeTo() instanceof DirectMetaProperty);
    assertEquals("businessDayAdjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).businessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code firstRegularStartDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'firstRegularStartDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsFirstRegularStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PaymentSchedule.meta().metaPropertyGet("firstRegularStartDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentRelativeTo() instanceof DirectMetaProperty);
    assertEquals("firstRegularStartDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstRegularStartDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code lastRegularEndDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'lastRegularEndDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsLastRegularEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PaymentSchedule.meta().metaPropertyGet("lastRegularEndDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentRelativeTo() instanceof DirectMetaProperty);
    assertEquals("lastRegularEndDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lastRegularEndDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code compoundingMethod}.
   *   <li>Then return name is {@code compoundingMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'compoundingMethod'; then return name is 'compoundingMethod'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCompoundingMethod_thenReturnNameIsCompoundingMethod() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PaymentSchedule.meta().metaPropertyGet("compoundingMethod");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentRelativeTo() instanceof DirectMetaProperty);
    assertEquals("compoundingMethod", actualMetaPropertyGetResult.name());
    Class<CompoundingMethod> expectedPropertyTypeResult = CompoundingMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).compoundingMethod());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentDateOffset}.
   *   <li>Then return name is {@code paymentDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentDateOffset'; then return name is 'paymentDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentDateOffset_thenReturnNameIsPaymentDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PaymentSchedule.meta().metaPropertyGet("paymentDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentRelativeTo() instanceof DirectMetaProperty);
    assertEquals("paymentDateOffset", actualMetaPropertyGetResult.name());
    Class<DaysAdjustment> expectedPropertyTypeResult = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentDateOffset());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentFrequency}.
   *   <li>Then return name is {@code paymentFrequency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentFrequency'; then return name is 'paymentFrequency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentFrequency_thenReturnNameIsPaymentFrequency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PaymentSchedule.meta().metaPropertyGet("paymentFrequency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentRelativeTo() instanceof DirectMetaProperty);
    assertEquals("paymentFrequency", actualMetaPropertyGetResult.name());
    Class<Frequency> expectedPropertyTypeResult = Frequency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentFrequency());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentRelativeTo}.
   *   <li>Then return name is {@code paymentRelativeTo}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentRelativeTo'; then return name is 'paymentRelativeTo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentRelativeTo_thenReturnNameIsPaymentRelativeTo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PaymentSchedule.meta().metaPropertyGet("paymentRelativeTo");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertEquals("paymentRelativeTo", actualMetaPropertyGetResult.name());
    Class<PaymentRelativeTo> expectedPropertyTypeResult = PaymentRelativeTo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentRelativeTo());
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
    assertNull(PaymentSchedule.meta().metaPropertyGet("Property Name"));
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
        PaymentSchedule.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("businessDayAdjustment") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("compoundingMethod") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("firstRegularStartDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lastRegularEndDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentFrequency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentRelativeTo") instanceof DirectMetaProperty);
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
    assertNull(PaymentSchedule.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> PaymentSchedule.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code businessDayAdjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'businessDayAdjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBusinessDayAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PaymentSchedule.meta()
                .propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code compoundingMethod}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'compoundingMethod'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCompoundingMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PaymentSchedule.meta()
                .propertySet(mock(Bean.class), "compoundingMethod", "New Value", true));
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
            PaymentSchedule.meta()
                .propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code firstRegularStartDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'firstRegularStartDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFirstRegularStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PaymentSchedule.meta()
                .propertySet(mock(Bean.class), "firstRegularStartDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code lastRegularEndDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'lastRegularEndDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLastRegularEndDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PaymentSchedule.meta()
                .propertySet(mock(Bean.class), "lastRegularEndDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code paymentDateOffset}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'paymentDateOffset'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPaymentDateOffset_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PaymentSchedule.meta()
                .propertySet(mock(Bean.class), "paymentDateOffset", "New Value", true));
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
            PaymentSchedule.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
