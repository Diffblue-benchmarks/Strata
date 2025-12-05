package com.opengamma.strata.product.swap.type;

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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.basics.schedule.RollConvention;
import com.opengamma.strata.basics.schedule.StubConvention;
import com.opengamma.strata.product.swap.CompoundingMethod;
import com.opengamma.strata.product.swap.OvernightAccrualMethod;
import com.opengamma.strata.product.swap.type.OvernightRateSwapLegConvention.Builder;
import com.opengamma.strata.product.swap.type.OvernightRateSwapLegConvention.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightRateSwapLegConventionDiffblueTest {
  /**
   * Test Builder {@link Builder#accrualMethod(OvernightAccrualMethod)}.
   *
   * <ul>
   *   <li>When {@code COMPOUNDED}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#accrualMethod(OvernightAccrualMethod)}
   */
  @Test
  @DisplayName(
      "Test Builder accrualMethod(OvernightAccrualMethod); when 'COMPOUNDED'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.accrualMethod(OvernightAccrualMethod)"})
  void testBuilderAccrualMethod_whenCompounded_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightRateSwapLegConvention.builder();

    // Act
    Builder actualAccrualMethodResult =
        builderResult.accrualMethod(OvernightAccrualMethod.COMPOUNDED);

    // Assert
    assertSame(builderResult, actualAccrualMethodResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>Then return {@link OvernightAccrualMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; then return OvernightAccrualMethod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_thenReturnOvernightAccrualMethod() {
    // Arrange and Act
    Object actualGetResult = OvernightRateSwapLegConvention.builder().get("accrualMethod");

    // Assert
    assertTrue(actualGetResult instanceof OvernightAccrualMethod);
    assertEquals(OvernightAccrualMethod.COMPOUNDED, actualGetResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndex_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(OvernightRateSwapLegConvention.builder().get("index"));
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
        () -> OvernightRateSwapLegConvention.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#index(OvernightIndex)}.
   *
   * <ul>
   *   <li>When {@link OvernightIndex}.
   *   <li>Then builder build Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(OvernightIndex)}
   */
  @Test
  @DisplayName(
      "Test Builder index(OvernightIndex); when OvernightIndex; then builder build Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(OvernightIndex)"})
  void testBuilderIndex_whenOvernightIndex_thenBuilderBuildCurrencyIsNull() {
    // Arrange
    Builder builderResult = OvernightRateSwapLegConvention.builder();
    OvernightIndex index = mock(OvernightIndex.class);

    // Act
    Builder actualIndexResult = builderResult.index(index);

    // Assert
    OvernightRateSwapLegConvention overnightRateSwapLegConvention = builderResult.build();
    assertNull(overnightRateSwapLegConvention.getCurrency());
    assertNull(overnightRateSwapLegConvention.getDayCount());
    assertEquals(0, overnightRateSwapLegConvention.getRateCutOffDays());
    assertEquals(StubConvention.SMART_INITIAL, overnightRateSwapLegConvention.getStubConvention());
    assertEquals(CompoundingMethod.NONE, overnightRateSwapLegConvention.getCompoundingMethod());
    assertEquals(
        OvernightAccrualMethod.COMPOUNDED, overnightRateSwapLegConvention.getAccrualMethod());
    assertFalse(overnightRateSwapLegConvention.isNotionalExchange());
    assertSame(builderResult, actualIndexResult);
    assertSame(index, overnightRateSwapLegConvention.getIndex());
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
        () -> OvernightRateSwapLegConvention.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code accrualMethod}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'accrualMethod'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenAccrualMethod_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightRateSwapLegConvention.builder();

    // Act
    Builder actualSetResult = builderResult.set("accrualMethod", OvernightAccrualMethod.COMPOUNDED);

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
    Builder builderResult = OvernightRateSwapLegConvention.builder();

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
    Class<? extends OvernightRateSwapLegConvention> actualBeanTypeResult =
        OvernightRateSwapLegConvention.meta().beanType();

    // Assert
    Class<OvernightRateSwapLegConvention> expectedBeanTypeResult =
        OvernightRateSwapLegConvention.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#accrualBusinessDayAdjustment()}
   *   <li>{@link Meta#accrualFrequency()}
   *   <li>{@link Meta#accrualMethod()}
   *   <li>{@link Meta#compoundingMethod()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#endDateBusinessDayAdjustment()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#notionalExchange()}
   *   <li>{@link Meta#paymentDateOffset()}
   *   <li>{@link Meta#paymentFrequency()}
   *   <li>{@link Meta#rateCutOffDays()}
   *   <li>{@link Meta#rollConvention()}
   *   <li>{@link Meta#startDateBusinessDayAdjustment()}
   *   <li>{@link Meta#stubConvention()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.accrualBusinessDayAdjustment()",
    "MetaProperty Meta.accrualFrequency()",
    "MetaProperty Meta.accrualMethod()",
    "MetaProperty Meta.compoundingMethod()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.endDateBusinessDayAdjustment()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.notionalExchange()",
    "MetaProperty Meta.paymentDateOffset()",
    "MetaProperty Meta.paymentFrequency()",
    "MetaProperty Meta.rateCutOffDays()",
    "MetaProperty Meta.rollConvention()",
    "MetaProperty Meta.startDateBusinessDayAdjustment()",
    "MetaProperty Meta.stubConvention()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = OvernightRateSwapLegConvention.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualAccrualBusinessDayAdjustmentResult =
        metaResult.accrualBusinessDayAdjustment();
    MetaProperty<Frequency> actualAccrualFrequencyResult = metaResult.accrualFrequency();
    MetaProperty<OvernightAccrualMethod> actualAccrualMethodResult = metaResult.accrualMethod();
    MetaProperty<CompoundingMethod> actualCompoundingMethodResult = metaResult.compoundingMethod();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<BusinessDayAdjustment> actualEndDateBusinessDayAdjustmentResult =
        metaResult.endDateBusinessDayAdjustment();
    MetaProperty<OvernightIndex> actualIndexResult = metaResult.index();
    MetaProperty<Boolean> actualNotionalExchangeResult = metaResult.notionalExchange();
    MetaProperty<DaysAdjustment> actualPaymentDateOffsetResult = metaResult.paymentDateOffset();
    MetaProperty<Frequency> actualPaymentFrequencyResult = metaResult.paymentFrequency();
    MetaProperty<Integer> actualRateCutOffDaysResult = metaResult.rateCutOffDays();
    MetaProperty<RollConvention> actualRollConventionResult = metaResult.rollConvention();
    MetaProperty<BusinessDayAdjustment> actualStartDateBusinessDayAdjustmentResult =
        metaResult.startDateBusinessDayAdjustment();

    // Assert
    assertTrue(actualAccrualBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualAccrualFrequencyResult instanceof DirectMetaProperty);
    assertTrue(actualAccrualMethodResult instanceof DirectMetaProperty);
    assertTrue(actualCompoundingMethodResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualNotionalExchangeResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentFrequencyResult instanceof DirectMetaProperty);
    assertTrue(actualRateCutOffDaysResult instanceof DirectMetaProperty);
    assertTrue(actualRollConventionResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(metaResult.stubConvention() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code accrualBusinessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'accrualBusinessDayAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsAccrualBusinessDayAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightRateSwapLegConvention.meta().metaPropertyGet("accrualBusinessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("accrualBusinessDayAdjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualBusinessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code accrualFrequency}.
   *   <li>Then return name is {@code accrualFrequency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'accrualFrequency'; then return name is 'accrualFrequency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAccrualFrequency_thenReturnNameIsAccrualFrequency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightRateSwapLegConvention.meta().metaPropertyGet("accrualFrequency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("accrualFrequency", actualMetaPropertyGetResult.name());
    Class<Frequency> expectedPropertyTypeResult = Frequency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualFrequency());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code accrualMethod}.
   *   <li>Then return name is {@code accrualMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'accrualMethod'; then return name is 'accrualMethod'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAccrualMethod_thenReturnNameIsAccrualMethod() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightRateSwapLegConvention.meta().metaPropertyGet("accrualMethod");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("accrualMethod", actualMetaPropertyGetResult.name());
    Class<OvernightAccrualMethod> expectedPropertyTypeResult = OvernightAccrualMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualMethod());
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
        OvernightRateSwapLegConvention.meta().metaPropertyGet("compoundingMethod");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("compoundingMethod", actualMetaPropertyGetResult.name());
    Class<CompoundingMethod> expectedPropertyTypeResult = CompoundingMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).compoundingMethod());
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
        OvernightRateSwapLegConvention.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
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
        OvernightRateSwapLegConvention.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualFrequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).compoundingMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
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
    assertNull(OvernightRateSwapLegConvention.meta().metaPropertyGet("Property Name"));
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
        OvernightRateSwapLegConvention.meta().metaPropertyMap();

    // Assert
    assertEquals(15, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("accrualBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("accrualFrequency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("accrualMethod") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("endDateBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rateCutOffDays") instanceof DirectMetaProperty);
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
        OvernightRateSwapLegConvention.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> OvernightRateSwapLegConvention.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualBusinessDayAdjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'accrualBusinessDayAdjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAccrualBusinessDayAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "accrualBusinessDayAdjustment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualFrequency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'accrualFrequency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAccrualFrequency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "accrualFrequency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualMethod}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'accrualMethod'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAccrualMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "accrualMethod", "New Value", true));
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
            OvernightRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "accrualBusinessDayAdjustment", "New Value", false));
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
            OvernightRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
