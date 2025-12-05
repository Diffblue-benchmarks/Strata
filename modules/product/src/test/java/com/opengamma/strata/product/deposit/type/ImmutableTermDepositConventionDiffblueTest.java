package com.opengamma.strata.product.deposit.type;

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
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.product.deposit.type.ImmutableTermDepositConvention.Builder;
import com.opengamma.strata.product.deposit.type.ImmutableTermDepositConvention.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableTermDepositConventionDiffblueTest {
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
    Builder builderResult = ImmutableTermDepositConvention.builder();

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
    assertNull(ImmutableTermDepositConvention.builder().get("businessDayAdjustment"));
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
    assertNull(ImmutableTermDepositConvention.builder().get("currency"));
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
    assertNull(ImmutableTermDepositConvention.builder().get("dayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableTermDepositConvention.builder().get("name"));
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
        () -> ImmutableTermDepositConvention.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code spotDateOffset}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'spotDateOffset'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSpotDateOffset_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableTermDepositConvention.builder().get("spotDateOffset"));
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
    Builder builderResult = ImmutableTermDepositConvention.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

    // Assert
    assertSame(builderResult, actualNameResult);
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
    Builder builderResult = ImmutableTermDepositConvention.builder();

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
        () -> ImmutableTermDepositConvention.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ImmutableTermDepositConvention.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#spotDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#spotDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder spotDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.spotDateOffset(DaysAdjustment)"})
  void testBuilderSpotDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableTermDepositConvention.builder();

    // Act
    Builder actualSpotDateOffsetResult = builderResult.spotDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualSpotDateOffsetResult);
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
    Class<? extends ImmutableTermDepositConvention> actualBeanTypeResult =
        ImmutableTermDepositConvention.meta().beanType();

    // Assert
    Class<ImmutableTermDepositConvention> expectedBeanTypeResult =
        ImmutableTermDepositConvention.class;
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
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#spotDateOffset()}
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
    "MetaProperty Meta.name()",
    "MetaProperty Meta.spotDateOffset()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableTermDepositConvention.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualBusinessDayAdjustmentResult =
        metaResult.businessDayAdjustment();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<String> actualNameResult = metaResult.name();

    // Assert
    assertTrue(actualBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.spotDateOffset() instanceof DirectMetaProperty);
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
        ImmutableTermDepositConvention.meta().metaPropertyGet("businessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    assertEquals("businessDayAdjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).businessDayAdjustment());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
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
        ImmutableTermDepositConvention.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> businessDayAdjustmentResult =
        ((Meta) metaBeanResult).businessDayAdjustment();
    assertTrue(businessDayAdjustmentResult instanceof DirectMetaProperty);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(metaBeanResult, businessDayAdjustmentResult.metaBean());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
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
        ImmutableTermDepositConvention.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> businessDayAdjustmentResult =
        ((Meta) metaBeanResult).businessDayAdjustment();
    assertTrue(businessDayAdjustmentResult instanceof DirectMetaProperty);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
    assertSame(metaBeanResult, businessDayAdjustmentResult.metaBean());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
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
        ImmutableTermDepositConvention.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> businessDayAdjustmentResult =
        ((Meta) metaBeanResult).businessDayAdjustment();
    assertTrue(businessDayAdjustmentResult instanceof DirectMetaProperty);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, businessDayAdjustmentResult.metaBean());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
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
    assertNull(ImmutableTermDepositConvention.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spotDateOffset}.
   *   <li>Then return name is {@code spotDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'spotDateOffset'; then return name is 'spotDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpotDateOffset_thenReturnNameIsSpotDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableTermDepositConvention.meta().metaPropertyGet("spotDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> businessDayAdjustmentResult =
        ((Meta) metaBeanResult).businessDayAdjustment();
    assertTrue(businessDayAdjustmentResult instanceof DirectMetaProperty);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("spotDateOffset", actualMetaPropertyGetResult.name());
    Class<DaysAdjustment> expectedPropertyTypeResult = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spotDateOffset());
    assertSame(metaBeanResult, businessDayAdjustmentResult.metaBean());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
        ImmutableTermDepositConvention.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("businessDayAdjustment") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("spotDateOffset") instanceof DirectMetaProperty);
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
        ImmutableTermDepositConvention.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ImmutableTermDepositConvention.meta().propertyGet(null, "Property Name", false));
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
            ImmutableTermDepositConvention.meta()
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
            ImmutableTermDepositConvention.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableTermDepositConvention.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
            ImmutableTermDepositConvention.meta()
                .propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableTermDepositConvention.meta()
                .propertySet(mock(Bean.class), "name", "New Value", true));
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
            ImmutableTermDepositConvention.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code spotDateOffset}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'spotDateOffset'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpotDateOffset_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableTermDepositConvention.meta()
                .propertySet(mock(Bean.class), "spotDateOffset", "New Value", true));
  }
}
