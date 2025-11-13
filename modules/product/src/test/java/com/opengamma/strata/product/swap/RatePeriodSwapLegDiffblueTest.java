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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.product.common.PayReceive;
import com.opengamma.strata.product.swap.RatePeriodSwapLeg.Builder;
import com.opengamma.strata.product.swap.RatePeriodSwapLeg.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatePeriodSwapLegDiffblueTest {
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
    assertNull(RatePeriodSwapLeg.builder().get("payReceive"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentBusinessDayAdjustment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentBusinessDayAdjustment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentBusinessDayAdjustment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RatePeriodSwapLeg.builder().get("paymentBusinessDayAdjustment"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentEvents}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentEvents'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentEvents_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = RatePeriodSwapLeg.builder().get("paymentEvents");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentPeriods}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentPeriods'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentPeriods_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = RatePeriodSwapLeg.builder().get("paymentPeriods");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
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
        NoSuchElementException.class, () -> RatePeriodSwapLeg.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'type'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenType_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RatePeriodSwapLeg.builder().get("type"));
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
    Builder builderResult = RatePeriodSwapLeg.builder();

    // Act
    Builder actualPayReceiveResult = builderResult.payReceive(PayReceive.PAY);

    // Assert
    assertSame(builderResult, actualPayReceiveResult);
  }

  /**
   * Test Builder {@link Builder#paymentEvents(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentEvents(List)}
   */
  @Test
  @DisplayName(
      "Test Builder paymentEvents(List) with 'List'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentEvents(List)"})
  void testBuilderPaymentEventsWithList_givenNull_whenArrayListAddNull() {
    // Arrange
    Builder builderResult = RatePeriodSwapLeg.builder();

    ArrayList<SwapPaymentEvent> paymentEvents = new ArrayList<>();
    paymentEvents.add(null);

    // Act
    Builder actualPaymentEventsResult = builderResult.paymentEvents(paymentEvents);

    // Assert
    assertSame(builderResult, actualPaymentEventsResult);
  }

  /**
   * Test Builder {@link Builder#paymentEvents(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentEvents(List)}
   */
  @Test
  @DisplayName(
      "Test Builder paymentEvents(List) with 'List'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentEvents(List)"})
  void testBuilderPaymentEventsWithList_givenNull_whenArrayListAddNull2() {
    // Arrange
    Builder builderResult = RatePeriodSwapLeg.builder();

    ArrayList<SwapPaymentEvent> paymentEvents = new ArrayList<>();
    paymentEvents.add(null);
    paymentEvents.add(null);

    // Act
    Builder actualPaymentEventsResult = builderResult.paymentEvents(paymentEvents);

    // Assert
    assertSame(builderResult, actualPaymentEventsResult);
  }

  /**
   * Test Builder {@link Builder#paymentEvents(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentEvents(List)}
   */
  @Test
  @DisplayName(
      "Test Builder paymentEvents(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentEvents(List)"})
  void testBuilderPaymentEventsWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatePeriodSwapLeg.builder();

    // Act
    Builder actualPaymentEventsResult = builderResult.paymentEvents(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualPaymentEventsResult);
  }

  /**
   * Test Builder {@link Builder#paymentEvents(SwapPaymentEvent[])} with {@code SwapPaymentEvent[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentEvents(SwapPaymentEvent[])}
   */
  @Test
  @DisplayName(
      "Test Builder paymentEvents(SwapPaymentEvent[]) with 'SwapPaymentEvent[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentEvents(SwapPaymentEvent[])"})
  void testBuilderPaymentEventsWithSwapPaymentEvent_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatePeriodSwapLeg.builder();

    // Act
    Builder actualPaymentEventsResult = builderResult.paymentEvents();

    // Assert
    assertSame(builderResult, actualPaymentEventsResult);
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
        () -> RatePeriodSwapLeg.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code payReceive}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'payReceive'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenPayReceive_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatePeriodSwapLeg.builder();

    // Act
    Builder actualSetResult = builderResult.set("payReceive", PayReceive.PAY);

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
    Builder builderResult = RatePeriodSwapLeg.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#type(SwapLegType)}.
   *
   * <ul>
   *   <li>When {@code FIXED}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#type(SwapLegType)}
   */
  @Test
  @DisplayName("Test Builder type(SwapLegType); when 'FIXED'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.type(SwapLegType)"})
  void testBuilderType_whenFixed_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatePeriodSwapLeg.builder();

    // Act
    Builder actualTypeResult = builderResult.type(SwapLegType.FIXED);

    // Assert
    assertSame(builderResult, actualTypeResult);
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
    Class<? extends RatePeriodSwapLeg> actualBeanTypeResult = RatePeriodSwapLeg.meta().beanType();

    // Assert
    Class<RatePeriodSwapLeg> expectedBeanTypeResult = RatePeriodSwapLeg.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#finalExchange()}
   *   <li>{@link Meta#initialExchange()}
   *   <li>{@link Meta#intermediateExchange()}
   *   <li>{@link Meta#payReceive()}
   *   <li>{@link Meta#paymentBusinessDayAdjustment()}
   *   <li>{@link Meta#paymentEvents()}
   *   <li>{@link Meta#paymentPeriods()}
   *   <li>{@link Meta#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.finalExchange()",
    "MetaProperty Meta.initialExchange()",
    "MetaProperty Meta.intermediateExchange()",
    "MetaProperty Meta.payReceive()",
    "MetaProperty Meta.paymentBusinessDayAdjustment()",
    "MetaProperty Meta.paymentEvents()",
    "MetaProperty Meta.paymentPeriods()",
    "MetaProperty Meta.type()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RatePeriodSwapLeg.meta();

    // Act
    MetaProperty<Boolean> actualFinalExchangeResult = metaResult.finalExchange();
    MetaProperty<Boolean> actualInitialExchangeResult = metaResult.initialExchange();
    MetaProperty<Boolean> actualIntermediateExchangeResult = metaResult.intermediateExchange();
    MetaProperty<PayReceive> actualPayReceiveResult = metaResult.payReceive();
    MetaProperty<BusinessDayAdjustment> actualPaymentBusinessDayAdjustmentResult =
        metaResult.paymentBusinessDayAdjustment();
    MetaProperty<ImmutableList<SwapPaymentEvent>> actualPaymentEventsResult =
        metaResult.paymentEvents();
    MetaProperty<ImmutableList<RatePaymentPeriod>> actualPaymentPeriodsResult =
        metaResult.paymentPeriods();

    // Assert
    assertTrue(actualFinalExchangeResult instanceof DirectMetaProperty);
    assertTrue(actualInitialExchangeResult instanceof DirectMetaProperty);
    assertTrue(actualIntermediateExchangeResult instanceof DirectMetaProperty);
    assertTrue(actualPayReceiveResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentEventsResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentPeriodsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code intermediateExchange}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'intermediateExchange'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsIntermediateExchange() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatePeriodSwapLeg.meta().metaPropertyGet("intermediateExchange");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).paymentBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentEvents() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("intermediateExchange", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).intermediateExchange());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code paymentBusinessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'paymentBusinessDayAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsPaymentBusinessDayAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatePeriodSwapLeg.meta().metaPropertyGet("paymentBusinessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).intermediateExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentEvents() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("paymentBusinessDayAdjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentBusinessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code finalExchange}.
   *   <li>Then return name is {@code finalExchange}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'finalExchange'; then return name is 'finalExchange'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFinalExchange_thenReturnNameIsFinalExchange() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatePeriodSwapLeg.meta().metaPropertyGet("finalExchange");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).initialExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).intermediateExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).paymentBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentEvents() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("finalExchange", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).finalExchange());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code initialExchange}.
   *   <li>Then return name is {@code initialExchange}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'initialExchange'; then return name is 'initialExchange'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInitialExchange_thenReturnNameIsInitialExchange() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatePeriodSwapLeg.meta().metaPropertyGet("initialExchange");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).intermediateExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).paymentBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentEvents() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("initialExchange", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).initialExchange());
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
        RatePeriodSwapLeg.meta().metaPropertyGet("payReceive");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).intermediateExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).paymentBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentEvents() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("payReceive", actualMetaPropertyGetResult.name());
    Class<PayReceive> expectedPropertyTypeResult = PayReceive.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).payReceive());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentEvents}.
   *   <li>Then return name is {@code paymentEvents}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentEvents'; then return name is 'paymentEvents'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentEvents_thenReturnNameIsPaymentEvents() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatePeriodSwapLeg.meta().metaPropertyGet("paymentEvents");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).intermediateExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).paymentBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("paymentEvents", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentEvents());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentPeriods}.
   *   <li>Then return name is {@code paymentPeriods}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentPeriods'; then return name is 'paymentPeriods'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentPeriods_thenReturnNameIsPaymentPeriods() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatePeriodSwapLeg.meta().metaPropertyGet("paymentPeriods");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).intermediateExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).paymentBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentEvents() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("paymentPeriods", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentPeriods());
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
    assertNull(RatePeriodSwapLeg.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return name is {@code type}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'type'; then return name is 'type'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenType_thenReturnNameIsType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = RatePeriodSwapLeg.meta().metaPropertyGet("type");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).intermediateExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).payReceive() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).paymentBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentEvents() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentPeriods() instanceof DirectMetaProperty);
    assertEquals("type", actualMetaPropertyGetResult.name());
    Class<SwapLegType> expectedPropertyTypeResult = SwapLegType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).type());
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
        RatePeriodSwapLeg.meta().metaPropertyMap();

    // Assert
    assertEquals(8, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("finalExchange") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("initialExchange") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("intermediateExchange") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("payReceive") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("paymentBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentEvents") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentPeriods") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("type") instanceof DirectMetaProperty);
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
    assertNull(RatePeriodSwapLeg.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'null'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenNull_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> RatePeriodSwapLeg.meta().propertyGet(null, "Property Name", false));
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
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "finalExchange", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code finalExchange}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'finalExchange'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFinalExchange_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "finalExchange", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialExchange}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'initialExchange'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInitialExchange_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "initialExchange", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code intermediateExchange}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'intermediateExchange'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIntermediateExchange_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "intermediateExchange", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code payReceive}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'payReceive'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPayReceive_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "payReceive", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code paymentBusinessDayAdjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'paymentBusinessDayAdjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPaymentBusinessDayAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "paymentBusinessDayAdjustment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code paymentEvents}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'paymentEvents'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPaymentEvents_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "paymentEvents", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code paymentPeriods}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'paymentPeriods'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPaymentPeriods_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "paymentPeriods", "New Value", true));
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
            RatePeriodSwapLeg.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
