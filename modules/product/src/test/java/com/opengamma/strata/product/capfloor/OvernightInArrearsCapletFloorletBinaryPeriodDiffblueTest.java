package com.opengamma.strata.product.capfloor;

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
import com.opengamma.strata.product.capfloor.OvernightInArrearsCapletFloorletBinaryPeriod.Builder;
import com.opengamma.strata.product.capfloor.OvernightInArrearsCapletFloorletBinaryPeriod.Meta;
import com.opengamma.strata.product.rate.OvernightCompoundedRateComputation;
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

class OvernightInArrearsCapletFloorletBinaryPeriodDiffblueTest {
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
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

    // Act
    Builder actualEndDateResult = builderResult.endDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualEndDateResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'currency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurrency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("currency"));
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
    assertNull(OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("endDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code overnightRate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'overnightRate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenOvernightRate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("overnightRate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code paymentDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'paymentDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPaymentDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("paymentDate"));
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
        () -> OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("Property Name"));
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
    assertNull(OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("startDate"));
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
    assertNull(OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("unadjustedEndDate"));
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
    assertNull(OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("unadjustedStartDate"));
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
    assertEquals(
        0.0d,
        ((Double) OvernightInArrearsCapletFloorletBinaryPeriod.builder().get("yearFraction"))
            .doubleValue());
  }

  /**
   * Test Builder {@link Builder#paymentDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder paymentDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentDate(LocalDate)"})
  void testBuilderPaymentDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

    // Act
    Builder actualPaymentDateResult = builderResult.paymentDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualPaymentDateResult);
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
        () ->
            OvernightInArrearsCapletFloorletBinaryPeriod.builder()
                .set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'currency'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCurrency_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("currency", null);

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
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

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
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

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
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

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
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

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
    Builder builderResult = OvernightInArrearsCapletFloorletBinaryPeriod.builder();

    // Act
    Builder actualYearFractionResult = builderResult.yearFraction(10.0d);

    // Assert
    assertSame(builderResult, actualYearFractionResult);
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
    Class<? extends OvernightInArrearsCapletFloorletBinaryPeriod> actualBeanTypeResult =
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().beanType();

    // Assert
    Class<OvernightInArrearsCapletFloorletBinaryPeriod> expectedBeanTypeResult =
        OvernightInArrearsCapletFloorletBinaryPeriod.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#amount()}
   *   <li>{@link Meta#caplet()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#floorlet()}
   *   <li>{@link Meta#overnightRate()}
   *   <li>{@link Meta#paymentDate()}
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
    "MetaProperty Meta.amount()",
    "MetaProperty Meta.caplet()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.floorlet()",
    "MetaProperty Meta.overnightRate()",
    "MetaProperty Meta.paymentDate()",
    "MetaProperty Meta.startDate()",
    "MetaProperty Meta.unadjustedEndDate()",
    "MetaProperty Meta.unadjustedStartDate()",
    "MetaProperty Meta.yearFraction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = OvernightInArrearsCapletFloorletBinaryPeriod.meta();

    // Act
    MetaProperty<Double> actualAmountResult = metaResult.amount();
    MetaProperty<Double> actualCapletResult = metaResult.caplet();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<Double> actualFloorletResult = metaResult.floorlet();
    MetaProperty<OvernightCompoundedRateComputation> actualOvernightRateResult =
        metaResult.overnightRate();
    MetaProperty<LocalDate> actualPaymentDateResult = metaResult.paymentDate();
    MetaProperty<LocalDate> actualStartDateResult = metaResult.startDate();
    MetaProperty<LocalDate> actualUnadjustedEndDateResult = metaResult.unadjustedEndDate();
    MetaProperty<LocalDate> actualUnadjustedStartDateResult = metaResult.unadjustedStartDate();

    // Assert
    assertTrue(actualAmountResult instanceof DirectMetaProperty);
    assertTrue(actualCapletResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualFloorletResult instanceof DirectMetaProperty);
    assertTrue(actualOvernightRateResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentDateResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualUnadjustedEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualUnadjustedStartDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yearFraction() instanceof DirectMetaProperty);
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("unadjustedStartDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
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
   *   <li>When {@code amount}.
   *   <li>Then return name is {@code amount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'amount'; then return name is 'amount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAmount_thenReturnNameIsAmount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("amount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("amount", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).amount());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code caplet}.
   *   <li>Then return name is {@code caplet}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'caplet'; then return name is 'caplet'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCaplet_thenReturnNameIsCaplet() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("caplet");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("caplet", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).caplet());
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
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
   *   <li>When {@code floorlet}.
   *   <li>Then return name is {@code floorlet}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'floorlet'; then return name is 'floorlet'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFloorlet_thenReturnNameIsFloorlet() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("floorlet");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("floorlet", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).floorlet());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code overnightRate}.
   *   <li>Then return name is {@code overnightRate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'overnightRate'; then return name is 'overnightRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenOvernightRate_thenReturnNameIsOvernightRate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("overnightRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("overnightRate", actualMetaPropertyGetResult.name());
    Class<OvernightCompoundedRateComputation> expectedPropertyTypeResult =
        OvernightCompoundedRateComputation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).overnightRate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code paymentDate}.
   *   <li>Then return name is {@code paymentDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'paymentDate'; then return name is 'paymentDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPaymentDate_thenReturnNameIsPaymentDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("paymentDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yearFraction() instanceof DirectMetaProperty);
    assertEquals("paymentDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentDate());
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
    assertNull(
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("Property Name"));
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("unadjustedEndDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyGet("yearFraction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).amount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).caplet() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).floorlet() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overnightRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDate() instanceof DirectMetaProperty);
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta().metaPropertyMap();

    // Assert
    assertEquals(11, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("amount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("caplet") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("endDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("floorlet") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("overnightRate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("unadjustedEndDate") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("unadjustedStartDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yearFraction") instanceof DirectMetaProperty);
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
        OvernightInArrearsCapletFloorletBinaryPeriod.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
        () ->
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code amount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'amount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAmount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "amount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code caplet}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'caplet'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCaplet_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "caplet", "New Value", true));
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
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
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
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
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
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "amount", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code floorlet}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'floorlet'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFloorlet_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "floorlet", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code overnightRate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'overnightRate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenOvernightRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "overnightRate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code paymentDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'paymentDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPaymentDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "paymentDate", "New Value", true));
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
            OvernightInArrearsCapletFloorletBinaryPeriod.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
