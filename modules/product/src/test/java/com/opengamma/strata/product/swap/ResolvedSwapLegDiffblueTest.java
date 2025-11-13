package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.product.common.PayReceive;
import com.opengamma.strata.product.swap.ResolvedSwapLeg.Builder;
import com.opengamma.strata.product.swap.ResolvedSwapLeg.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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

class ResolvedSwapLegDiffblueTest {
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
    assertNull(ResolvedSwapLeg.builder().get("payReceive"));
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
    Object actualGetResult = ResolvedSwapLeg.builder().get("paymentEvents");

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
    Object actualGetResult = ResolvedSwapLeg.builder().get("paymentPeriods");

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
        NoSuchElementException.class, () -> ResolvedSwapLeg.builder().get("Property Name"));
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
    assertNull(ResolvedSwapLeg.builder().get("type"));
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
    Builder builderResult = ResolvedSwapLeg.builder();

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
    Builder builderResult = ResolvedSwapLeg.builder();

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
    Builder builderResult = ResolvedSwapLeg.builder();

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
    Builder builderResult = ResolvedSwapLeg.builder();

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
    Builder builderResult = ResolvedSwapLeg.builder();

    // Act
    Builder actualPaymentEventsResult = builderResult.paymentEvents();

    // Assert
    assertSame(builderResult, actualPaymentEventsResult);
  }

  /**
   * Test Builder {@link Builder#paymentPeriods(SwapPaymentPeriod[])} with {@code
   * SwapPaymentPeriod[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentPeriods(SwapPaymentPeriod[])}
   */
  @Test
  @DisplayName(
      "Test Builder paymentPeriods(SwapPaymentPeriod[]) with 'SwapPaymentPeriod[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentPeriods(SwapPaymentPeriod[])"})
  void testBuilderPaymentPeriodsWithSwapPaymentPeriod_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwapLeg.builder();

    // Act
    Builder actualPaymentPeriodsResult =
        builderResult.paymentPeriods(mock(SwapPaymentPeriod.class));

    // Assert
    assertSame(builderResult, actualPaymentPeriodsResult);
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
        () -> ResolvedSwapLeg.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ResolvedSwapLeg.builder();

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
    Builder builderResult = ResolvedSwapLeg.builder();

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
    Builder builderResult = ResolvedSwapLeg.builder();

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
    Class<? extends ResolvedSwapLeg> actualBeanTypeResult = ResolvedSwapLeg.meta().beanType();

    // Assert
    Class<ResolvedSwapLeg> expectedBeanTypeResult = ResolvedSwapLeg.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#payReceive()}
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
    "MetaProperty Meta.payReceive()",
    "MetaProperty Meta.paymentEvents()",
    "MetaProperty Meta.paymentPeriods()",
    "MetaProperty Meta.type()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedSwapLeg.meta();

    // Act
    MetaProperty<PayReceive> actualPayReceiveResult = metaResult.payReceive();
    MetaProperty<ImmutableList<SwapPaymentEvent>> actualPaymentEventsResult =
        metaResult.paymentEvents();
    MetaProperty<ImmutableList<SwapPaymentPeriod>> actualPaymentPeriodsResult =
        metaResult.paymentPeriods();

    // Assert
    assertTrue(actualPayReceiveResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentEventsResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentPeriodsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
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
        ResolvedSwapLeg.meta().metaPropertyGet("payReceive");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<SwapPaymentEvent>> paymentEventsResult =
        ((Meta) metaBeanResult).paymentEvents();
    assertTrue(paymentEventsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<SwapPaymentPeriod>> paymentPeriodsResult =
        ((Meta) metaBeanResult).paymentPeriods();
    assertTrue(paymentPeriodsResult instanceof DirectMetaProperty);
    MetaProperty<SwapLegType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("payReceive", actualMetaPropertyGetResult.name());
    Class<PayReceive> expectedPropertyTypeResult = PayReceive.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).payReceive());
    assertSame(metaBeanResult, paymentEventsResult.metaBean());
    assertSame(metaBeanResult, paymentPeriodsResult.metaBean());
    assertSame(metaBeanResult, typeResult.metaBean());
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
        ResolvedSwapLeg.meta().metaPropertyGet("paymentEvents");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PayReceive> payReceiveResult = ((Meta) metaBeanResult).payReceive();
    assertTrue(payReceiveResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<SwapPaymentPeriod>> paymentPeriodsResult =
        ((Meta) metaBeanResult).paymentPeriods();
    assertTrue(paymentPeriodsResult instanceof DirectMetaProperty);
    MetaProperty<SwapLegType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("paymentEvents", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentEvents());
    assertSame(metaBeanResult, payReceiveResult.metaBean());
    assertSame(metaBeanResult, paymentPeriodsResult.metaBean());
    assertSame(metaBeanResult, typeResult.metaBean());
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
        ResolvedSwapLeg.meta().metaPropertyGet("paymentPeriods");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PayReceive> payReceiveResult = ((Meta) metaBeanResult).payReceive();
    assertTrue(payReceiveResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<SwapPaymentEvent>> paymentEventsResult =
        ((Meta) metaBeanResult).paymentEvents();
    assertTrue(paymentEventsResult instanceof DirectMetaProperty);
    MetaProperty<SwapLegType> typeResult = ((Meta) metaBeanResult).type();
    assertTrue(typeResult instanceof DirectMetaProperty);
    assertEquals("paymentPeriods", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentPeriods());
    assertSame(metaBeanResult, payReceiveResult.metaBean());
    assertSame(metaBeanResult, paymentEventsResult.metaBean());
    assertSame(metaBeanResult, typeResult.metaBean());
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
    assertNull(ResolvedSwapLeg.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedSwapLeg.meta().metaPropertyGet("type");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<PayReceive> payReceiveResult = ((Meta) metaBeanResult).payReceive();
    assertTrue(payReceiveResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<SwapPaymentEvent>> paymentEventsResult =
        ((Meta) metaBeanResult).paymentEvents();
    assertTrue(paymentEventsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<SwapPaymentPeriod>> paymentPeriodsResult =
        ((Meta) metaBeanResult).paymentPeriods();
    assertTrue(paymentPeriodsResult instanceof DirectMetaProperty);
    assertEquals("type", actualMetaPropertyGetResult.name());
    Class<SwapLegType> expectedPropertyTypeResult = SwapLegType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).type());
    assertSame(metaBeanResult, payReceiveResult.metaBean());
    assertSame(metaBeanResult, paymentEventsResult.metaBean());
    assertSame(metaBeanResult, paymentPeriodsResult.metaBean());
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
        ResolvedSwapLeg.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("payReceive") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentEvents") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentPeriods") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("type") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = ResolvedSwapLeg.meta();
    ArrayList<SwapPaymentPeriod> paymentPeriods = new ArrayList<>();
    ResolvedSwapLeg bean =
        new ResolvedSwapLeg(
            SwapLegType.FIXED,
            PayReceive.PAY,
            (List<? extends SwapPaymentPeriod>) paymentPeriods,
            new ArrayList<>(),
            null);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
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
    assertNull(ResolvedSwapLeg.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            ResolvedSwapLeg.meta().propertySet(mock(Bean.class), "payReceive", "New Value", false));
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
            ResolvedSwapLeg.meta().propertySet(mock(Bean.class), "payReceive", "New Value", true));
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
            ResolvedSwapLeg.meta()
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
            ResolvedSwapLeg.meta()
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
            ResolvedSwapLeg.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'type'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedSwapLeg.meta().propertySet(mock(Bean.class), "type", "New Value", true));
  }

  /**
   * Test {@link ResolvedSwapLeg#ResolvedSwapLeg(SwapLegType, PayReceive, List, List, Currency)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedSwapLeg#ResolvedSwapLeg(SwapLegType, PayReceive, List,
   * List, Currency)}
   */
  @Test
  @DisplayName(
      "Test new ResolvedSwapLeg(SwapLegType, PayReceive, List, List, Currency); when ArrayList(); then return Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ResolvedSwapLeg.<init>(SwapLegType, PayReceive, List, List, Currency)"})
  void testNewResolvedSwapLeg_whenArrayList_thenReturnCurrencyIsNull() {
    // Arrange
    ArrayList<SwapPaymentPeriod> paymentPeriods = new ArrayList<>();

    // Act
    ResolvedSwapLeg actualResolvedSwapLeg =
        new ResolvedSwapLeg(
            SwapLegType.FIXED,
            PayReceive.PAY,
            (List<? extends SwapPaymentPeriod>) paymentPeriods,
            new ArrayList<>(),
            null);

    // Assert
    assertNull(actualResolvedSwapLeg.getCurrency());
    assertEquals(PayReceive.PAY, actualResolvedSwapLeg.getPayReceive());
    assertEquals(SwapLegType.FIXED, actualResolvedSwapLeg.getType());
    ImmutableList<SwapPaymentEvent> paymentEvents = actualResolvedSwapLeg.getPaymentEvents();
    assertTrue(paymentEvents.isEmpty());
    assertSame(paymentEvents, actualResolvedSwapLeg.getPaymentPeriods());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResolvedSwapLeg#toString()}
   *   <li>{@link ResolvedSwapLeg#getCurrency()}
   *   <li>{@link ResolvedSwapLeg#getPayReceive()}
   *   <li>{@link ResolvedSwapLeg#getPaymentEvents()}
   *   <li>{@link ResolvedSwapLeg#getPaymentPeriods()}
   *   <li>{@link ResolvedSwapLeg#getType()}
   *   <li>{@link ResolvedSwapLeg#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Currency ResolvedSwapLeg.getCurrency()",
    "PayReceive ResolvedSwapLeg.getPayReceive()",
    "ImmutableList ResolvedSwapLeg.getPaymentEvents()",
    "ImmutableList ResolvedSwapLeg.getPaymentPeriods()",
    "SwapLegType ResolvedSwapLeg.getType()",
    "Builder ResolvedSwapLeg.toBuilder()",
    "String ResolvedSwapLeg.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ArrayList<SwapPaymentPeriod> paymentPeriods = new ArrayList<>();
    ResolvedSwapLeg resolvedSwapLeg =
        new ResolvedSwapLeg(
            SwapLegType.FIXED,
            PayReceive.PAY,
            (List<? extends SwapPaymentPeriod>) paymentPeriods,
            new ArrayList<>(),
            null);

    // Act
    String actualToStringResult = resolvedSwapLeg.toString();
    Currency actualCurrency = resolvedSwapLeg.getCurrency();
    PayReceive actualPayReceive = resolvedSwapLeg.getPayReceive();
    ImmutableList<SwapPaymentEvent> actualPaymentEvents = resolvedSwapLeg.getPaymentEvents();
    ImmutableList<SwapPaymentPeriod> actualPaymentPeriods = resolvedSwapLeg.getPaymentPeriods();
    SwapLegType actualType = resolvedSwapLeg.getType();
    resolvedSwapLeg.toBuilder();

    // Assert
    assertEquals(
        "ResolvedSwapLeg{type=Fixed, payReceive=Pay, paymentPeriods=[], paymentEvents=[]}",
        actualToStringResult);
    assertNull(actualCurrency);
    assertEquals(PayReceive.PAY, actualPayReceive);
    assertEquals(SwapLegType.FIXED, actualType);
    assertSame(actualPaymentEvents, actualPaymentPeriods);
  }

  /**
   * Test {@link ResolvedSwapLeg#findPaymentPeriod(LocalDate)}.
   *
   * <p>Method under test: {@link ResolvedSwapLeg#findPaymentPeriod(LocalDate)}
   */
  @Test
  @DisplayName("Test findPaymentPeriod(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ResolvedSwapLeg.findPaymentPeriod(LocalDate)"})
  void testFindPaymentPeriod() {
    // Arrange
    ArrayList<SwapPaymentPeriod> paymentPeriods = new ArrayList<>();
    ResolvedSwapLeg resolvedSwapLeg =
        new ResolvedSwapLeg(
            SwapLegType.FIXED,
            PayReceive.PAY,
            (List<? extends SwapPaymentPeriod>) paymentPeriods,
            new ArrayList<>(),
            null);

    // Act
    Optional<SwapPaymentPeriod> actualFindPaymentPeriodResult =
        resolvedSwapLeg.findPaymentPeriod(LocalDate.of(1970, 1, 1));

    // Assert
    assertFalse(actualFindPaymentPeriodResult.isPresent());
  }

  /**
   * Test {@link ResolvedSwapLeg#meta()}.
   *
   * <p>Method under test: {@link ResolvedSwapLeg#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedSwapLeg.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedSwapLeg.meta();

    // Assert
    assertTrue(actualMetaResult.payReceive() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentEvents() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentPeriods() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.type() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ResolvedSwapLeg#metaBean()}.
   *
   * <p>Method under test: {@link ResolvedSwapLeg#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedSwapLeg.metaBean()"})
  void testMetaBean() {
    // Arrange
    ArrayList<SwapPaymentPeriod> paymentPeriods = new ArrayList<>();
    ResolvedSwapLeg resolvedSwapLeg =
        new ResolvedSwapLeg(
            SwapLegType.FIXED,
            PayReceive.PAY,
            (List<? extends SwapPaymentPeriod>) paymentPeriods,
            new ArrayList<>(),
            null);

    // Act and Assert
    assertSame(Meta.INSTANCE, resolvedSwapLeg.metaBean());
  }
}
