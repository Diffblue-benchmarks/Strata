package com.opengamma.strata.product.bond;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Payment;
import com.opengamma.strata.product.bond.KnownAmountBondPaymentPeriod.Builder;
import com.opengamma.strata.product.bond.KnownAmountBondPaymentPeriod.Meta;
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

class KnownAmountBondPaymentPeriodDiffblueTest {
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
    Builder builderResult = KnownAmountBondPaymentPeriod.builder();

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
    assertNull(KnownAmountBondPaymentPeriod.builder().get("endDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code payment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'payment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPayment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(KnownAmountBondPaymentPeriod.builder().get("payment"));
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
        NoSuchElementException.class,
        () -> KnownAmountBondPaymentPeriod.builder().get("Property Name"));
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
    assertNull(KnownAmountBondPaymentPeriod.builder().get("startDate"));
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
    assertNull(KnownAmountBondPaymentPeriod.builder().get("unadjustedEndDate"));
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
    assertNull(KnownAmountBondPaymentPeriod.builder().get("unadjustedStartDate"));
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
        () -> KnownAmountBondPaymentPeriod.builder().set("Property Name", "New Value"));
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
    Builder builderResult = KnownAmountBondPaymentPeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("endDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code payment}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'payment'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenPayment_thenReturnBuilder() {
    // Arrange
    Builder builderResult = KnownAmountBondPaymentPeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("payment", null);

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
    Builder builderResult = KnownAmountBondPaymentPeriod.builder();

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
    Builder builderResult = KnownAmountBondPaymentPeriod.builder();

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
    Builder builderResult = KnownAmountBondPaymentPeriod.builder();

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
    Builder builderResult = KnownAmountBondPaymentPeriod.builder();

    // Act
    Builder actualUnadjustedStartDateResult =
        builderResult.unadjustedStartDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualUnadjustedStartDateResult);
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
    Class<? extends KnownAmountBondPaymentPeriod> actualBeanTypeResult =
        KnownAmountBondPaymentPeriod.meta().beanType();

    // Assert
    Class<KnownAmountBondPaymentPeriod> expectedBeanTypeResult = KnownAmountBondPaymentPeriod.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#payment()}
   *   <li>{@link Meta#startDate()}
   *   <li>{@link Meta#unadjustedEndDate()}
   *   <li>{@link Meta#unadjustedStartDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.payment()",
    "MetaProperty Meta.startDate()",
    "MetaProperty Meta.unadjustedEndDate()",
    "MetaProperty Meta.unadjustedStartDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = KnownAmountBondPaymentPeriod.meta();

    // Act
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<Payment> actualPaymentResult = metaResult.payment();
    MetaProperty<LocalDate> actualStartDateResult = metaResult.startDate();
    MetaProperty<LocalDate> actualUnadjustedEndDateResult = metaResult.unadjustedEndDate();

    // Assert
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualUnadjustedEndDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.unadjustedStartDate() instanceof DirectMetaProperty);
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
        KnownAmountBondPaymentPeriod.meta().metaPropertyGet("unadjustedStartDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Payment> paymentResult = ((Meta) metaBeanResult).payment();
    assertTrue(paymentResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedEndDateResult = ((Meta) metaBeanResult).unadjustedEndDate();
    assertTrue(unadjustedEndDateResult instanceof DirectMetaProperty);
    assertEquals("unadjustedStartDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).unadjustedStartDate());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, paymentResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedEndDateResult.metaBean());
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
        KnownAmountBondPaymentPeriod.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Payment> paymentResult = ((Meta) metaBeanResult).payment();
    assertTrue(paymentResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedEndDateResult = ((Meta) metaBeanResult).unadjustedEndDate();
    assertTrue(unadjustedEndDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedStartDateResult =
        ((Meta) metaBeanResult).unadjustedStartDate();
    assertTrue(unadjustedStartDateResult instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
    assertSame(metaBeanResult, paymentResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedEndDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedStartDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code payment}.
   *   <li>Then return name is {@code payment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'payment'; then return name is 'payment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPayment_thenReturnNameIsPayment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        KnownAmountBondPaymentPeriod.meta().metaPropertyGet("payment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedEndDateResult = ((Meta) metaBeanResult).unadjustedEndDate();
    assertTrue(unadjustedEndDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedStartDateResult =
        ((Meta) metaBeanResult).unadjustedStartDate();
    assertTrue(unadjustedStartDateResult instanceof DirectMetaProperty);
    assertEquals("payment", actualMetaPropertyGetResult.name());
    Class<Payment> expectedPropertyTypeResult = Payment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).payment());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedEndDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedStartDateResult.metaBean());
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
    assertNull(KnownAmountBondPaymentPeriod.meta().metaPropertyGet("Property Name"));
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
        KnownAmountBondPaymentPeriod.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Payment> paymentResult = ((Meta) metaBeanResult).payment();
    assertTrue(paymentResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedEndDateResult = ((Meta) metaBeanResult).unadjustedEndDate();
    assertTrue(unadjustedEndDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedStartDateResult =
        ((Meta) metaBeanResult).unadjustedStartDate();
    assertTrue(unadjustedStartDateResult instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, paymentResult.metaBean());
    assertSame(metaBeanResult, unadjustedEndDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedStartDateResult.metaBean());
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
        KnownAmountBondPaymentPeriod.meta().metaPropertyGet("unadjustedEndDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Payment> paymentResult = ((Meta) metaBeanResult).payment();
    assertTrue(paymentResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedStartDateResult =
        ((Meta) metaBeanResult).unadjustedStartDate();
    assertTrue(unadjustedStartDateResult instanceof DirectMetaProperty);
    assertEquals("unadjustedEndDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).unadjustedEndDate());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, paymentResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedStartDateResult.metaBean());
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
        KnownAmountBondPaymentPeriod.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("endDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("payment") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("unadjustedEndDate") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("unadjustedStartDate") instanceof DirectMetaProperty);
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
    assertNull(
        KnownAmountBondPaymentPeriod.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> KnownAmountBondPaymentPeriod.meta().propertyGet(null, "Property Name", false));
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
        () ->
            KnownAmountBondPaymentPeriod.meta()
                .propertySet(mock(Bean.class), "endDate", "New Value", true));
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
            KnownAmountBondPaymentPeriod.meta()
                .propertySet(mock(Bean.class), "endDate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code payment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'payment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPayment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            KnownAmountBondPaymentPeriod.meta()
                .propertySet(mock(Bean.class), "payment", "New Value", true));
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
            KnownAmountBondPaymentPeriod.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
            KnownAmountBondPaymentPeriod.meta()
                .propertySet(mock(Bean.class), "startDate", "New Value", true));
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
            KnownAmountBondPaymentPeriod.meta()
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
            KnownAmountBondPaymentPeriod.meta()
                .propertySet(mock(Bean.class), "unadjustedStartDate", "New Value", true));
  }
}
