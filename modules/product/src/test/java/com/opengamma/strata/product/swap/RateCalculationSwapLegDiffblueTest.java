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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.schedule.PeriodicSchedule;
import com.opengamma.strata.basics.value.ValueSchedule;
import com.opengamma.strata.product.common.PayReceive;
import com.opengamma.strata.product.swap.RateCalculationSwapLeg.Builder;
import com.opengamma.strata.product.swap.RateCalculationSwapLeg.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RateCalculationSwapLegDiffblueTest {
  /**
   * Test Builder {@link Builder#calculation(RateCalculation)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#calculation(RateCalculation)}
   */
  @Test
  @DisplayName("Test Builder calculation(RateCalculation); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.calculation(RateCalculation)"})
  void testBuilderCalculation_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateCalculationSwapLeg.builder();

    FixedRateCalculation.Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    FixedRateCalculation.Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act
    Builder actualCalculationResult =
        builderResult.calculation(
            initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build());

    // Assert
    assertSame(builderResult, actualCalculationResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code accrualSchedule}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'accrualSchedule'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAccrualSchedule_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateCalculationSwapLeg.builder().get("accrualSchedule"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code calculation}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'calculation'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCalculation_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateCalculationSwapLeg.builder().get("calculation"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code notionalSchedule}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'notionalSchedule'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenNotionalSchedule_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateCalculationSwapLeg.builder().get("notionalSchedule"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code payReceive}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'payReceive'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPayReceive_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateCalculationSwapLeg.builder().get("payReceive"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentSchedule}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentSchedule'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentSchedule_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateCalculationSwapLeg.builder().get("paymentSchedule"));
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
        NoSuchElementException.class, () -> RateCalculationSwapLeg.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#payReceive(PayReceive)}.
   *
   * <ul>
   *   <li>When {@code PAY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#payReceive(PayReceive)}
   */
  @Test
  @DisplayName("Test Builder payReceive(PayReceive); when 'PAY'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.payReceive(PayReceive)"})
  void testBuilderPayReceive_whenPay_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateCalculationSwapLeg.builder();

    // Act
    Builder actualPayReceiveResult = builderResult.payReceive(PayReceive.PAY);

    // Assert
    assertSame(builderResult, actualPayReceiveResult);
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
        () -> RateCalculationSwapLeg.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code accrualSchedule}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'accrualSchedule'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenAccrualSchedule_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateCalculationSwapLeg.builder();

    // Act
    Builder actualSetResult = builderResult.set("accrualSchedule", null);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code calculation}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'calculation'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCalculation_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RateCalculationSwapLeg.builder();

    FixedRateCalculation.Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    FixedRateCalculation.Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act
    Builder actualSetResult =
        builderResult.set(
            "calculation",
            initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build());

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
    Builder builderResult = RateCalculationSwapLeg.builder();

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
    Class<? extends RateCalculationSwapLeg> actualBeanTypeResult =
        RateCalculationSwapLeg.meta().beanType();

    // Assert
    Class<RateCalculationSwapLeg> expectedBeanTypeResult = RateCalculationSwapLeg.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#accrualSchedule()}
   *   <li>{@link Meta#calculation()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#notionalSchedule()}
   *   <li>{@link Meta#payReceive()}
   *   <li>{@link Meta#paymentSchedule()}
   *   <li>{@link Meta#startDate()}
   *   <li>{@link Meta#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.accrualSchedule()",
    "MetaProperty Meta.calculation()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.notionalSchedule()",
    "MetaProperty Meta.payReceive()",
    "MetaProperty Meta.paymentSchedule()",
    "MetaProperty Meta.startDate()",
    "MetaProperty Meta.type()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RateCalculationSwapLeg.meta();

    // Act
    MetaProperty<PeriodicSchedule> actualAccrualScheduleResult = metaResult.accrualSchedule();
    MetaProperty<RateCalculation> actualCalculationResult = metaResult.calculation();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<AdjustableDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<NotionalSchedule> actualNotionalScheduleResult = metaResult.notionalSchedule();
    MetaProperty<PayReceive> actualPayReceiveResult = metaResult.payReceive();
    MetaProperty<PaymentSchedule> actualPaymentScheduleResult = metaResult.paymentSchedule();
    MetaProperty<AdjustableDate> actualStartDateResult = metaResult.startDate();

    // Assert
    assertTrue(actualAccrualScheduleResult instanceof DirectMetaProperty);
    assertTrue(actualCalculationResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualNotionalScheduleResult instanceof DirectMetaProperty);
    assertTrue(actualPayReceiveResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentScheduleResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code accrualSchedule}.
   *   <li>Then return name is {@code accrualSchedule}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'accrualSchedule'; then return name is 'accrualSchedule'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAccrualSchedule_thenReturnNameIsAccrualSchedule() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateCalculationSwapLeg.meta().metaPropertyGet("accrualSchedule");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).calculation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("accrualSchedule", actualMetaPropertyGetResult.name());
    Class<PeriodicSchedule> expectedPropertyTypeResult = PeriodicSchedule.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualSchedule());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code calculation}.
   *   <li>Then return name is {@code calculation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'calculation'; then return name is 'calculation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCalculation_thenReturnNameIsCalculation() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateCalculationSwapLeg.meta().metaPropertyGet("calculation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("calculation", actualMetaPropertyGetResult.name());
    Class<RateCalculation> expectedPropertyTypeResult = RateCalculation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).calculation());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return name is {@code currency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'currency'; then return name is 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenReturnNameIsCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateCalculationSwapLeg.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
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
        RateCalculationSwapLeg.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code notionalSchedule}.
   *   <li>Then return name is {@code notionalSchedule}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'notionalSchedule'; then return name is 'notionalSchedule'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNotionalSchedule_thenReturnNameIsNotionalSchedule() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateCalculationSwapLeg.meta().metaPropertyGet("notionalSchedule");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("notionalSchedule", actualMetaPropertyGetResult.name());
    Class<NotionalSchedule> expectedPropertyTypeResult = NotionalSchedule.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).notionalSchedule());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code payReceive}.
   *   <li>Then return name is {@code payReceive}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'payReceive'; then return name is 'payReceive'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPayReceive_thenReturnNameIsPayReceive() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateCalculationSwapLeg.meta().metaPropertyGet("payReceive");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("payReceive", actualMetaPropertyGetResult.name());
    Class<PayReceive> expectedPropertyTypeResult = PayReceive.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).payReceive());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentSchedule}.
   *   <li>Then return name is {@code paymentSchedule}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentSchedule'; then return name is 'paymentSchedule'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentSchedule_thenReturnNameIsPaymentSchedule() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RateCalculationSwapLeg.meta().metaPropertyGet("paymentSchedule");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("paymentSchedule", actualMetaPropertyGetResult.name());
    Class<PaymentSchedule> expectedPropertyTypeResult = PaymentSchedule.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentSchedule());
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
    assertNull(RateCalculationSwapLeg.meta().metaPropertyGet("Property Name"));
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
        RateCalculationSwapLeg.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).calculation() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalSchedule() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentSchedule() instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
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
        RateCalculationSwapLeg.meta().metaPropertyMap();

    // Assert
    assertEquals(9, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("accrualSchedule") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("calculation") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("endDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("notionalSchedule") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("payReceive") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentSchedule") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("type") instanceof DirectMetaProperty);
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
        () -> RateCalculationSwapLeg.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RateCalculationSwapLeg.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualSchedule}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'accrualSchedule'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAccrualSchedule_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateCalculationSwapLeg.meta()
                .propertySet(mock(Bean.class), "accrualSchedule", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code calculation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'calculation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCalculation_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateCalculationSwapLeg.meta()
                .propertySet(mock(Bean.class), "calculation", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RateCalculationSwapLeg.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
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
            RateCalculationSwapLeg.meta()
                .propertySet(mock(Bean.class), "accrualSchedule", "New Value", false));
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
            RateCalculationSwapLeg.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
