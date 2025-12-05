package com.opengamma.strata.product.fra;

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
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.product.common.BuySell;
import com.opengamma.strata.product.fra.Fra.Builder;
import com.opengamma.strata.product.fra.Fra.Meta;
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

class FraDiffblueTest {
  /**
   * Test Builder {@link Builder#buySell(BuySell)}.
   *
   * <ul>
   *   <li>When {@code BUY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#buySell(BuySell)}
   */
  @Test
  @DisplayName("Test Builder buySell(BuySell); when 'BUY'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.buySell(BuySell)"})
  void testBuilderBuySell_whenBuy_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Fra.builder();

    // Act
    Builder actualBuySellResult = builderResult.buySell(BuySell.BUY);

    // Assert
    assertSame(builderResult, actualBuySellResult);
  }

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
    Builder builderResult = Fra.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#discounting(FraDiscountingMethod)}.
   *
   * <ul>
   *   <li>When {@code NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#discounting(FraDiscountingMethod)}
   */
  @Test
  @DisplayName("Test Builder discounting(FraDiscountingMethod); when 'NONE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.discounting(FraDiscountingMethod)"})
  void testBuilderDiscounting_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Fra.builder();

    // Act
    Builder actualDiscountingResult = builderResult.discounting(FraDiscountingMethod.NONE);

    // Assert
    assertSame(builderResult, actualDiscountingResult);
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
    Builder builderResult = Fra.builder();

    // Act
    Builder actualEndDateResult = builderResult.endDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualEndDateResult);
  }

  /**
   * Test Builder {@link Builder#fixingDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder fixingDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingDateOffset(DaysAdjustment)"})
  void testBuilderFixingDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Fra.builder();

    // Act
    Builder actualFixingDateOffsetResult = builderResult.fixingDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualFixingDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'buySell'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenBuySell_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Fra.builder().get("buySell"));
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
    assertNull(Fra.builder().get("currency"));
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
    assertNull(Fra.builder().get("dayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code discounting}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'discounting'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDiscounting_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Fra.builder().get("discounting"));
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
    assertNull(Fra.builder().get("endDate"));
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
    assertThrows(NoSuchElementException.class, () -> Fra.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#index(IborIndex)}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(IborIndex)}
   */
  @Test
  @DisplayName("Test Builder index(IborIndex); when IborIndex; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(IborIndex)"})
  void testBuilderIndex_whenIborIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Fra.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(IborIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
  }

  /**
   * Test Builder {@link Builder#notional(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#notional(double)}
   */
  @Test
  @DisplayName("Test Builder notional(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.notional(double)"})
  void testBuilderNotional_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Fra.builder();

    // Act
    Builder actualNotionalResult = builderResult.notional(10.0d);

    // Assert
    assertSame(builderResult, actualNotionalResult);
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
        NoSuchElementException.class, () -> Fra.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'buySell'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenBuySell_thenReturnBuilder() {
    // Arrange
    Builder builderResult = Fra.builder();

    // Act
    Builder actualSetResult = builderResult.set("buySell", BuySell.BUY);

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
    Builder builderResult = Fra.builder();

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
    Builder builderResult = Fra.builder();

    // Act
    Builder actualStartDateResult = builderResult.startDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualStartDateResult);
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
    Class<? extends Fra> actualBeanTypeResult = Fra.meta().beanType();

    // Assert
    Class<Fra> expectedBeanTypeResult = Fra.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#businessDayAdjustment()}
   *   <li>{@link Meta#buySell()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#discounting()}
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#fixedRate()}
   *   <li>{@link Meta#fixingDateOffset()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#indexInterpolated()}
   *   <li>{@link Meta#notional()}
   *   <li>{@link Meta#paymentDate()}
   *   <li>{@link Meta#startDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.businessDayAdjustment()",
    "MetaProperty Meta.buySell()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.discounting()",
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.fixedRate()",
    "MetaProperty Meta.fixingDateOffset()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.indexInterpolated()",
    "MetaProperty Meta.notional()",
    "MetaProperty Meta.paymentDate()",
    "MetaProperty Meta.startDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = Fra.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualBusinessDayAdjustmentResult =
        metaResult.businessDayAdjustment();
    MetaProperty<BuySell> actualBuySellResult = metaResult.buySell();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<FraDiscountingMethod> actualDiscountingResult = metaResult.discounting();
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<Double> actualFixedRateResult = metaResult.fixedRate();
    MetaProperty<DaysAdjustment> actualFixingDateOffsetResult = metaResult.fixingDateOffset();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();
    MetaProperty<IborIndex> actualIndexInterpolatedResult = metaResult.indexInterpolated();
    MetaProperty<Double> actualNotionalResult = metaResult.notional();
    MetaProperty<AdjustableDate> actualPaymentDateResult = metaResult.paymentDate();

    // Assert
    assertTrue(actualBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualBuySellResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualDiscountingResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualFixedRateResult instanceof DirectMetaProperty);
    assertTrue(actualFixingDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualIndexInterpolatedResult instanceof DirectMetaProperty);
    assertTrue(actualNotionalResult instanceof DirectMetaProperty);
    assertTrue(actualPaymentDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.startDate() instanceof DirectMetaProperty);
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
        Fra.meta().metaPropertyGet("businessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).discounting() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("businessDayAdjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).businessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then return name is {@code buySell}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'buySell'; then return name is 'buySell'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBuySell_thenReturnNameIsBuySell() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Fra.meta().metaPropertyGet("buySell");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).discounting() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("buySell", actualMetaPropertyGetResult.name());
    Class<BuySell> expectedPropertyTypeResult = BuySell.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).buySell());
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
    MetaProperty<?> actualMetaPropertyGetResult = Fra.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).discounting() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult = Fra.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).discounting() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
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
   *   <li>When {@code discounting}.
   *   <li>Then return name is {@code discounting}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'discounting'; then return name is 'discounting'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDiscounting_thenReturnNameIsDiscounting() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Fra.meta().metaPropertyGet("discounting");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("discounting", actualMetaPropertyGetResult.name());
    Class<FraDiscountingMethod> expectedPropertyTypeResult = FraDiscountingMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discounting());
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
    MetaProperty<?> actualMetaPropertyGetResult = Fra.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).discounting() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixedRate'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixedRate_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Fra.meta().metaPropertyGet("fixedRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).discounting() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("fixedRate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixedRate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return name is {@code fixingDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingDateOffset'; then return name is 'fixingDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingDateOffset_thenReturnNameIsFixingDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = Fra.meta().metaPropertyGet("fixingDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).buySell() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).discounting() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingDateOffset", actualMetaPropertyGetResult.name());
    Class<DaysAdjustment> expectedPropertyTypeResult = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDateOffset());
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
    assertNull(Fra.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = Fra.meta().metaPropertyMap();

    // Assert
    assertEquals(13, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("businessDayAdjustment") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("buySell") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("endDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixedRate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("indexInterpolated") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("notional") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startDate") instanceof DirectMetaProperty);
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
    assertNull(Fra.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        NoSuchElementException.class, () -> Fra.meta().propertyGet(null, "Property Name", false));
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
        () -> Fra.meta().propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code buySell}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'buySell'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBuySell_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> Fra.meta().propertySet(mock(Bean.class), "buySell", "New Value", true));
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
        () -> Fra.meta().propertySet(mock(Bean.class), "currency", "New Value", true));
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
            Fra.meta().propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", false));
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
        () -> Fra.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
