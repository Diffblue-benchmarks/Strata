package com.opengamma.strata.product.credit.type;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.AdjustablePayment;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.basics.schedule.RollConvention;
import com.opengamma.strata.basics.schedule.StubConvention;
import com.opengamma.strata.product.TradeInfo;
import com.opengamma.strata.product.common.BuySell;
import com.opengamma.strata.product.credit.Cds;
import com.opengamma.strata.product.credit.CdsTrade;
import com.opengamma.strata.product.credit.PaymentOnDefault;
import com.opengamma.strata.product.credit.ProtectionStartOfDay;
import com.opengamma.strata.product.credit.type.ImmutableCdsConvention.Builder;
import com.opengamma.strata.product.credit.type.ImmutableCdsConvention.Meta;
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

class ImmutableCdsConventionDiffblueTest {
  /**
   * Test Builder {@link Builder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test Builder dayCount(DayCount); when DayCount; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dayCount(DayCount)"})
  void testBuilderDayCount_whenDayCount_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code businessDayAdjustment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'businessDayAdjustment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenBusinessDayAdjustment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableCdsConvention.builder().get("businessDayAdjustment"));
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
    assertNull(ImmutableCdsConvention.builder().get("currency"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'dayCount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDayCount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableCdsConvention.builder().get("dayCount"));
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
        NoSuchElementException.class, () -> ImmutableCdsConvention.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#name(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(String)}
   */
  @Test
  @DisplayName("Test Builder name(String); when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(String)"})
  void testBuilderName_whenName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

    // Assert
    assertSame(builderResult, actualNameResult);
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
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualPaymentFrequencyResult = builderResult.paymentFrequency(Frequency.ofDays(1));

    // Assert
    assertSame(builderResult, actualPaymentFrequencyResult);
  }

  /**
   * Test Builder {@link Builder#paymentOnDefault(PaymentOnDefault)}.
   *
   * <ul>
   *   <li>When {@code ACCRUED_PREMIUM}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#paymentOnDefault(PaymentOnDefault)}
   */
  @Test
  @DisplayName(
      "Test Builder paymentOnDefault(PaymentOnDefault); when 'ACCRUED_PREMIUM'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.paymentOnDefault(PaymentOnDefault)"})
  void testBuilderPaymentOnDefault_whenAccruedPremium_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualPaymentOnDefaultResult =
        builderResult.paymentOnDefault(PaymentOnDefault.ACCRUED_PREMIUM);

    // Assert
    assertSame(builderResult, actualPaymentOnDefaultResult);
  }

  /**
   * Test Builder {@link Builder#protectionStart(ProtectionStartOfDay)}.
   *
   * <ul>
   *   <li>When {@code BEGINNING}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#protectionStart(ProtectionStartOfDay)}
   */
  @Test
  @DisplayName(
      "Test Builder protectionStart(ProtectionStartOfDay); when 'BEGINNING'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.protectionStart(ProtectionStartOfDay)"})
  void testBuilderProtectionStart_whenBeginning_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualProtectionStartResult =
        builderResult.protectionStart(ProtectionStartOfDay.BEGINNING);

    // Assert
    assertSame(builderResult, actualProtectionStartResult);
  }

  /**
   * Test Builder {@link Builder#rollConvention(RollConvention)}.
   *
   * <ul>
   *   <li>When {@link RollConvention}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#rollConvention(RollConvention)}
   */
  @Test
  @DisplayName(
      "Test Builder rollConvention(RollConvention); when RollConvention; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.rollConvention(RollConvention)"})
  void testBuilderRollConvention_whenRollConvention_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualRollConventionResult = builderResult.rollConvention(mock(RollConvention.class));

    // Assert
    assertSame(builderResult, actualRollConventionResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualSetResult = builderResult.set("businessDayAdjustment", null);

    // Assert
    assertSame(builderResult, actualSetResult);
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
        () -> ImmutableCdsConvention.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#settlementDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#settlementDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder settlementDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.settlementDateOffset(DaysAdjustment)"})
  void testBuilderSettlementDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualSettlementDateOffsetResult =
        builderResult.settlementDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualSettlementDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#stepinDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#stepinDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder stepinDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.stepinDateOffset(DaysAdjustment)"})
  void testBuilderStepinDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualStepinDateOffsetResult = builderResult.stepinDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualStepinDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#stubConvention(StubConvention)}.
   *
   * <ul>
   *   <li>When {@code NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#stubConvention(StubConvention)}
   */
  @Test
  @DisplayName("Test Builder stubConvention(StubConvention); when 'NONE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.stubConvention(StubConvention)"})
  void testBuilderStubConvention_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableCdsConvention.builder();

    // Act
    Builder actualStubConventionResult = builderResult.stubConvention(StubConvention.NONE);

    // Assert
    assertSame(builderResult, actualStubConventionResult);
  }

  /**
   * Test {@link ImmutableCdsConvention#getStartDateBusinessDayAdjustment()}.
   *
   * <p>Method under test: {@link ImmutableCdsConvention#getStartDateBusinessDayAdjustment()}
   */
  @Test
  @DisplayName("Test getStartDateBusinessDayAdjustment()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BusinessDayAdjustment ImmutableCdsConvention.getStartDateBusinessDayAdjustment()"
  })
  void testGetStartDateBusinessDayAdjustment() {
    // Arrange
    ImmutableCdsConvention immutableCdsConvention = StandardCdsConventions.EUR_GB_STANDARD;

    // Act and Assert
    HolidayCalendarId calendar =
        immutableCdsConvention.getStartDateBusinessDayAdjustment().getCalendar();
    assertEquals("EUTA+GBLO", calendar.getName());
    assertEquals("EUTA+GBLO", calendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;
    assertSame(
        businessDayAdjustment, immutableCdsConvention.getSettlementDateOffset().getAdjustment());
    assertSame(businessDayAdjustment, immutableCdsConvention.getStepinDateOffset().getAdjustment());
    assertSame(businessDayAdjustment, immutableCdsConvention.getEndDateBusinessDayAdjustment());
  }

  /**
   * Test {@link ImmutableCdsConvention#getEndDateBusinessDayAdjustment()}.
   *
   * <p>Method under test: {@link ImmutableCdsConvention#getEndDateBusinessDayAdjustment()}
   */
  @Test
  @DisplayName("Test getEndDateBusinessDayAdjustment()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BusinessDayAdjustment ImmutableCdsConvention.getEndDateBusinessDayAdjustment()"
  })
  void testGetEndDateBusinessDayAdjustment() {
    // Arrange
    ImmutableCdsConvention immutableCdsConvention = StandardCdsConventions.EUR_GB_STANDARD;

    // Act
    BusinessDayAdjustment actualEndDateBusinessDayAdjustment =
        immutableCdsConvention.getEndDateBusinessDayAdjustment();

    // Assert
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;
    assertSame(
        businessDayAdjustment, immutableCdsConvention.getSettlementDateOffset().getAdjustment());
    assertSame(businessDayAdjustment, immutableCdsConvention.getStepinDateOffset().getAdjustment());
    assertSame(businessDayAdjustment, actualEndDateBusinessDayAdjustment);
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
    Class<? extends ImmutableCdsConvention> actualBeanTypeResult =
        ImmutableCdsConvention.meta().beanType();

    // Assert
    Class<ImmutableCdsConvention> expectedBeanTypeResult = ImmutableCdsConvention.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#businessDayAdjustment()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#endDateBusinessDayAdjustment()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#paymentFrequency()}
   *   <li>{@link Meta#paymentOnDefault()}
   *   <li>{@link Meta#protectionStart()}
   *   <li>{@link Meta#rollConvention()}
   *   <li>{@link Meta#settlementDateOffset()}
   *   <li>{@link Meta#startDateBusinessDayAdjustment()}
   *   <li>{@link Meta#stepinDateOffset()}
   *   <li>{@link Meta#stubConvention()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.businessDayAdjustment()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.endDateBusinessDayAdjustment()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.paymentFrequency()",
    "MetaProperty Meta.paymentOnDefault()",
    "MetaProperty Meta.protectionStart()",
    "MetaProperty Meta.rollConvention()",
    "MetaProperty Meta.settlementDateOffset()",
    "MetaProperty Meta.startDateBusinessDayAdjustment()",
    "MetaProperty Meta.stepinDateOffset()",
    "MetaProperty Meta.stubConvention()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableCdsConvention.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualBusinessDayAdjustmentResult =
        metaResult.businessDayAdjustment();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<BusinessDayAdjustment> actualEndDateBusinessDayAdjustmentResult =
        metaResult.endDateBusinessDayAdjustment();
    MetaProperty<String> actualNameResult = metaResult.name();
    MetaProperty<Frequency> actualPaymentFrequencyResult = metaResult.paymentFrequency();
    MetaProperty<PaymentOnDefault> actualPaymentOnDefaultResult = metaResult.paymentOnDefault();
    MetaProperty<ProtectionStartOfDay> actualProtectionStartResult = metaResult.protectionStart();
    MetaProperty<RollConvention> actualRollConventionResult = metaResult.rollConvention();
    MetaProperty<DaysAdjustment> actualSettlementDateOffsetResult =
        metaResult.settlementDateOffset();
    MetaProperty<BusinessDayAdjustment> actualStartDateBusinessDayAdjustmentResult =
        metaResult.startDateBusinessDayAdjustment();
    MetaProperty<DaysAdjustment> actualStepinDateOffsetResult = metaResult.stepinDateOffset();

    // Assert
    assertTrue(actualBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentFrequencyResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentOnDefaultResult instanceof DirectMetaProperty);
    assertTrue(actualProtectionStartResult instanceof DirectMetaProperty);
    assertTrue(actualRollConventionResult instanceof DirectMetaProperty);
    assertTrue(actualSettlementDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualStepinDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(metaResult.stubConvention() instanceof DirectMetaProperty);
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
        ImmutableCdsConvention.meta().metaPropertyGet("businessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertEquals("businessDayAdjustment", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).businessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code endDateBusinessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'endDateBusinessDayAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsEndDateBusinessDayAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableCdsConvention.meta().metaPropertyGet("endDateBusinessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertEquals("endDateBusinessDayAdjustment", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDateBusinessDayAdjustment());
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
        ImmutableCdsConvention.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return name is {@code dayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'dayCount'; then return name is 'dayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCount_thenReturnNameIsDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableCdsConvention.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableCdsConvention.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentFrequency() instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
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
        ImmutableCdsConvention.meta().metaPropertyGet("paymentFrequency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertEquals("paymentFrequency", actualMetaPropertyGetResult.name());
    Class<Frequency> expectedPropertyTypeResult = Frequency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentFrequency());
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
    assertNull(ImmutableCdsConvention.meta().metaPropertyGet("Property Name"));
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
        ImmutableCdsConvention.meta().metaPropertyMap();

    // Assert
    assertEquals(13, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("businessDayAdjustment") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("endDateBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentFrequency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentOnDefault") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("protectionStart") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rollConvention") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("startDateBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("stubConvention") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then {@link StandardCdsConventions#EUR_GB_STANDARD} PaymentFrequency is {@link
   *       Frequency#P3M}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then EUR_GB_STANDARD PaymentFrequency is P3M")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenEur_gb_standardPaymentFrequencyIsP3m() {
    // Arrange
    ImmutableCdsConvention bean = StandardCdsConventions.EUR_GB_STANDARD;

    // Act
    Object actualPropertyGetResult =
        ImmutableCdsConvention.meta().propertyGet(bean, "paymentFrequency", false);

    // Assert
    Frequency frequency = ((Frequency) actualPropertyGetResult).P3M;
    assertSame(frequency, bean.getPaymentFrequency());
    assertSame(frequency, actualPropertyGetResult);
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
    assertNull(ImmutableCdsConvention.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code businessDayAdjustment}.
   *   <li>Then return {@link BusinessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'businessDayAdjustment'; then return BusinessDayAdjustment")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBusinessDayAdjustment_thenReturnBusinessDayAdjustment() {
    // Arrange
    ImmutableCdsConvention bean = StandardCdsConventions.EUR_GB_STANDARD;

    // Act
    Object actualPropertyGetResult =
        ImmutableCdsConvention.meta().propertyGet(bean, "businessDayAdjustment", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof BusinessDayAdjustment);
    HolidayCalendarId calendar = ((BusinessDayAdjustment) actualPropertyGetResult).getCalendar();
    assertEquals("EUTA+GBLO", calendar.getName());
    assertEquals("EUTA+GBLO", calendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    BusinessDayAdjustment businessDayAdjustment =
        ((BusinessDayAdjustment) actualPropertyGetResult).NONE;
    assertSame(businessDayAdjustment, bean.getSettlementDateOffset().getAdjustment());
    assertSame(businessDayAdjustment, bean.getStepinDateOffset().getAdjustment());
    assertSame(businessDayAdjustment, bean.getEndDateBusinessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then {@link StandardCdsConventions#EUR_GB_STANDARD} Currency is {@link Currency#EUR}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'currency'; then EUR_GB_STANDARD Currency is EUR")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurrency_thenEur_gb_standardCurrencyIsEur() {
    // Arrange
    ImmutableCdsConvention bean = StandardCdsConventions.EUR_GB_STANDARD;

    // Act
    Object actualPropertyGetResult =
        ImmutableCdsConvention.meta().propertyGet(bean, "currency", true);

    // Assert
    Currency currency = ((Currency) actualPropertyGetResult).EUR;
    assertSame(currency, bean.getCurrency());
    assertSame(currency, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableCdsConvention.meta()
                .propertyGet(StandardCdsConventions.EUR_GB_STANDARD, "dayCount", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code endDateBusinessDayAdjustment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'endDateBusinessDayAdjustment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEndDateBusinessDayAdjustment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        ImmutableCdsConvention.meta()
            .propertyGet(
                StandardCdsConventions.EUR_GB_STANDARD, "endDateBusinessDayAdjustment", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code EUR-GB-STANDARD}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return 'EUR-GB-STANDARD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnEurGbStandard() {
    // Arrange, Act and Assert
    assertEquals(
        "EUR-GB-STANDARD",
        ImmutableCdsConvention.meta()
            .propertyGet(StandardCdsConventions.EUR_GB_STANDARD, "name", false));
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
            ImmutableCdsConvention.meta()
                .propertyGet(StandardCdsConventions.EUR_GB_STANDARD, "Property Name", false));
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
            ImmutableCdsConvention.meta()
                .propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", true));
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
            ImmutableCdsConvention.meta()
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
            ImmutableCdsConvention.meta()
                .propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", false));
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
            ImmutableCdsConvention.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link ImmutableCdsConvention#toTrade(StandardId, TradeInfo, LocalDate, LocalDate,
   * BuySell, double, double)} with {@code legalEntityId}, {@code tradeInfo}, {@code startDate},
   * {@code endDate}, {@code buySell}, {@code notional}, {@code fixedRate}.
   *
   * <p>Method under test: {@link ImmutableCdsConvention#toTrade(StandardId, TradeInfo, LocalDate,
   * LocalDate, BuySell, double, double)}
   */
  @Test
  @DisplayName(
      "Test toTrade(StandardId, TradeInfo, LocalDate, LocalDate, BuySell, double, double) with 'legalEntityId', 'tradeInfo', 'startDate', 'endDate', 'buySell', 'notional', 'fixedRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CdsTrade ImmutableCdsConvention.toTrade(StandardId, TradeInfo, LocalDate, LocalDate, BuySell, double, double)"
  })
  void testToTradeWithLegalEntityIdTradeInfoStartDateEndDateBuySellNotionalFixedRate() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    TradeInfo tradeInfo = TradeInfo.empty();

    // Act
    CdsTrade actualToTradeResult =
        StandardCdsConventions.EUR_GB_STANDARD.toTrade(
            legalEntityId,
            tradeInfo,
            LocalDate.ofYearDay(1, 1),
            LocalDate.of(1970, 1, 1),
            BuySell.BUY,
            10.0d,
            10.0d);

    // Assert
    Cds product = actualToTradeResult.getProduct();
    assertEquals(10.0d, product.getFixedRate());
    assertEquals(10.0d, product.getNotional());
    assertEquals(BuySell.BUY, product.getBuySell());
    assertEquals(PaymentOnDefault.ACCRUED_PREMIUM, product.getPaymentOnDefault());
    assertEquals(ProtectionStartOfDay.BEGINNING, product.getProtectionStart());
    Optional<StandardId> id = actualToTradeResult.getId();
    assertFalse(id.isPresent());
    assertSame(id, actualToTradeResult.getUpfrontFee());
    assertSame(legalEntityId, product.getLegalEntityId());
    assertSame(tradeInfo, actualToTradeResult.getInfo());
  }

  /**
   * Test {@link ImmutableCdsConvention#toTrade(StandardId, TradeInfo, LocalDate, LocalDate,
   * BuySell, double, double, AdjustablePayment)} with {@code legalEntityId}, {@code tradeInfo},
   * {@code startDate}, {@code endDate}, {@code buySell}, {@code notional}, {@code fixedRate},
   * {@code upfrontFee}.
   *
   * <p>Method under test: {@link ImmutableCdsConvention#toTrade(StandardId, TradeInfo, LocalDate,
   * LocalDate, BuySell, double, double, AdjustablePayment)}
   */
  @Test
  @DisplayName(
      "Test toTrade(StandardId, TradeInfo, LocalDate, LocalDate, BuySell, double, double, AdjustablePayment) with 'legalEntityId', 'tradeInfo', 'startDate', 'endDate', 'buySell', 'notional', 'fixedRate', 'upfrontFee'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CdsTrade ImmutableCdsConvention.toTrade(StandardId, TradeInfo, LocalDate, LocalDate, BuySell, double, double, AdjustablePayment)"
  })
  void testToTradeWithLegalEntityIdTradeInfoStartDateEndDateBuySellNotionalFixedRateUpfrontFee() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    TradeInfo tradeInfo = TradeInfo.empty();

    // Act
    CdsTrade actualToTradeResult =
        StandardCdsConventions.EUR_GB_STANDARD.toTrade(
            legalEntityId,
            tradeInfo,
            LocalDate.ofYearDay(1, 1),
            LocalDate.of(1970, 1, 1),
            BuySell.BUY,
            10.0d,
            10.0d,
            null);

    // Assert
    Cds product = actualToTradeResult.getProduct();
    assertEquals(10.0d, product.getFixedRate());
    assertEquals(10.0d, product.getNotional());
    assertEquals(BuySell.BUY, product.getBuySell());
    assertEquals(PaymentOnDefault.ACCRUED_PREMIUM, product.getPaymentOnDefault());
    assertEquals(ProtectionStartOfDay.BEGINNING, product.getProtectionStart());
    Optional<StandardId> id = actualToTradeResult.getId();
    assertFalse(id.isPresent());
    assertSame(id, actualToTradeResult.getUpfrontFee());
    assertSame(legalEntityId, product.getLegalEntityId());
    assertSame(tradeInfo, actualToTradeResult.getInfo());
  }

  /**
   * Test {@link ImmutableCdsConvention#meta()}.
   *
   * <p>Method under test: {@link ImmutableCdsConvention#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableCdsConvention.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableCdsConvention.meta();

    // Assert
    assertTrue(actualMetaResult.businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentFrequency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentOnDefault() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.protectionStart() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.rollConvention() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.settlementDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.stepinDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.stubConvention() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ImmutableCdsConvention#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableCdsConvention#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableCdsConvention.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, StandardCdsConventions.EUR_GB_STANDARD.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableCdsConvention#toString()}
   *   <li>{@link ImmutableCdsConvention#getBusinessDayAdjustment()}
   *   <li>{@link ImmutableCdsConvention#getCurrency()}
   *   <li>{@link ImmutableCdsConvention#getDayCount()}
   *   <li>{@link ImmutableCdsConvention#getName()}
   *   <li>{@link ImmutableCdsConvention#getPaymentFrequency()}
   *   <li>{@link ImmutableCdsConvention#getPaymentOnDefault()}
   *   <li>{@link ImmutableCdsConvention#getProtectionStart()}
   *   <li>{@link ImmutableCdsConvention#getRollConvention()}
   *   <li>{@link ImmutableCdsConvention#getSettlementDateOffset()}
   *   <li>{@link ImmutableCdsConvention#getStepinDateOffset()}
   *   <li>{@link ImmutableCdsConvention#getStubConvention()}
   *   <li>{@link ImmutableCdsConvention#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BusinessDayAdjustment ImmutableCdsConvention.getBusinessDayAdjustment()",
    "Currency ImmutableCdsConvention.getCurrency()",
    "DayCount ImmutableCdsConvention.getDayCount()",
    "String ImmutableCdsConvention.getName()",
    "Frequency ImmutableCdsConvention.getPaymentFrequency()",
    "PaymentOnDefault ImmutableCdsConvention.getPaymentOnDefault()",
    "ProtectionStartOfDay ImmutableCdsConvention.getProtectionStart()",
    "RollConvention ImmutableCdsConvention.getRollConvention()",
    "DaysAdjustment ImmutableCdsConvention.getSettlementDateOffset()",
    "DaysAdjustment ImmutableCdsConvention.getStepinDateOffset()",
    "StubConvention ImmutableCdsConvention.getStubConvention()",
    "Builder ImmutableCdsConvention.toBuilder()",
    "String ImmutableCdsConvention.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ImmutableCdsConvention immutableCdsConvention = StandardCdsConventions.EUR_GB_STANDARD;

    // Act
    String actualToStringResult = immutableCdsConvention.toString();
    BusinessDayAdjustment actualBusinessDayAdjustment =
        immutableCdsConvention.getBusinessDayAdjustment();
    Currency actualCurrency = immutableCdsConvention.getCurrency();
    immutableCdsConvention.getDayCount();
    String actualName = immutableCdsConvention.getName();
    Frequency actualPaymentFrequency = immutableCdsConvention.getPaymentFrequency();
    PaymentOnDefault actualPaymentOnDefault = immutableCdsConvention.getPaymentOnDefault();
    ProtectionStartOfDay actualProtectionStart = immutableCdsConvention.getProtectionStart();
    RollConvention actualRollConvention = immutableCdsConvention.getRollConvention();
    DaysAdjustment actualSettlementDateOffset = immutableCdsConvention.getSettlementDateOffset();
    DaysAdjustment actualStepinDateOffset = immutableCdsConvention.getStepinDateOffset();
    StubConvention actualStubConvention = immutableCdsConvention.getStubConvention();
    immutableCdsConvention.toBuilder();

    // Assert
    assertEquals("EUR-GB-STANDARD", actualName);
    assertEquals("EUR-GB-STANDARD", actualToStringResult);
    HolidayCalendarId calendar = actualBusinessDayAdjustment.getCalendar();
    assertEquals("EUTA+GBLO", calendar.getName());
    assertEquals("EUTA+GBLO", calendar.toString());
    assertEquals(1, actualStepinDateOffset.getDays());
    assertEquals(20, actualRollConvention.getDayOfMonth());
    assertEquals(3, actualSettlementDateOffset.getDays());
    assertEquals(StubConvention.SMART_INITIAL, actualStubConvention);
    assertEquals(PaymentOnDefault.ACCRUED_PREMIUM, actualPaymentOnDefault);
    assertEquals(ProtectionStartOfDay.BEGINNING, actualProtectionStart);
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, actualSettlementDateOffset.getCalendar());
    assertSame(calendar, actualSettlementDateOffset.getResultCalendar());
    assertSame(Currency.EUR, actualCurrency);
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;
    assertSame(businessDayAdjustment, actualSettlementDateOffset.getAdjustment());
    assertSame(businessDayAdjustment, actualStepinDateOffset.getAdjustment());
    assertSame(Frequency.P3M, actualPaymentFrequency);
  }

  /**
   * Test {@link ImmutableCdsConvention#equals(Object)}, and {@link
   * ImmutableCdsConvention#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableCdsConvention#equals(Object)}
   *   <li>{@link ImmutableCdsConvention#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableCdsConvention.equals(Object)",
    "int ImmutableCdsConvention.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutableCdsConvention immutableCdsConvention = StandardCdsConventions.EUR_GB_STANDARD;
    ImmutableCdsConvention immutableCdsConvention2 = StandardCdsConventions.EUR_GB_STANDARD;

    // Act and Assert
    assertEquals(immutableCdsConvention, immutableCdsConvention2);
    assertEquals(immutableCdsConvention.hashCode(), immutableCdsConvention2.hashCode());
  }

  /**
   * Test {@link ImmutableCdsConvention#equals(Object)}, and {@link
   * ImmutableCdsConvention#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableCdsConvention#equals(Object)}
   *   <li>{@link ImmutableCdsConvention#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableCdsConvention.equals(Object)",
    "int ImmutableCdsConvention.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutableCdsConvention immutableCdsConvention = StandardCdsConventions.EUR_GB_STANDARD;

    // Act and Assert
    assertEquals(immutableCdsConvention, immutableCdsConvention);
    int expectedHashCodeResult = immutableCdsConvention.hashCode();
    assertEquals(expectedHashCodeResult, immutableCdsConvention.hashCode());
  }

  /**
   * Test {@link ImmutableCdsConvention#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableCdsConvention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableCdsConvention.equals(Object)",
    "int ImmutableCdsConvention.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StandardCdsConventions.EUR_STANDARD, StandardCdsConventions.EUR_GB_STANDARD);
  }

  /**
   * Test {@link ImmutableCdsConvention#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableCdsConvention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableCdsConvention.equals(Object)",
    "int ImmutableCdsConvention.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(StandardCdsConventions.EUR_GB_STANDARD, null);
  }

  /**
   * Test {@link ImmutableCdsConvention#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableCdsConvention#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableCdsConvention.equals(Object)",
    "int ImmutableCdsConvention.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        StandardCdsConventions.EUR_GB_STANDARD, "Different type to ImmutableCdsConvention");
  }
}
