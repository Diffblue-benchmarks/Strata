package com.opengamma.strata.product.swap.type;

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
import com.opengamma.strata.basics.index.PriceIndex;
import com.opengamma.strata.product.swap.PriceIndexCalculationMethod;
import com.opengamma.strata.product.swap.type.InflationRateSwapLegConvention.Builder;
import com.opengamma.strata.product.swap.type.InflationRateSwapLegConvention.Meta;
import java.time.Period;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InflationRateSwapLegConventionDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>Then return {@link PriceIndexCalculationMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; then return PriceIndexCalculationMethod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_thenReturnPriceIndexCalculationMethod() {
    // Arrange and Act
    Object actualGetResult = InflationRateSwapLegConvention.builder().get("indexCalculationMethod");

    // Assert
    assertTrue(actualGetResult instanceof PriceIndexCalculationMethod);
    assertEquals(PriceIndexCalculationMethod.MONTHLY, actualGetResult);
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
    assertNull(InflationRateSwapLegConvention.builder().get("index"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code lag}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'lag'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLag_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InflationRateSwapLegConvention.builder().get("lag"));
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
        () -> InflationRateSwapLegConvention.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#indexCalculationMethod(PriceIndexCalculationMethod)}.
   *
   * <ul>
   *   <li>When {@code MONTHLY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#indexCalculationMethod(PriceIndexCalculationMethod)}
   */
  @Test
  @DisplayName(
      "Test Builder indexCalculationMethod(PriceIndexCalculationMethod); when 'MONTHLY'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.indexCalculationMethod(PriceIndexCalculationMethod)"})
  void testBuilderIndexCalculationMethod_whenMonthly_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InflationRateSwapLegConvention.builder();

    // Act
    Builder actualIndexCalculationMethodResult =
        builderResult.indexCalculationMethod(PriceIndexCalculationMethod.MONTHLY);

    // Assert
    assertSame(builderResult, actualIndexCalculationMethodResult);
  }

  /**
   * Test Builder {@link Builder#index(PriceIndex)}.
   *
   * <ul>
   *   <li>When {@link PriceIndex}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(PriceIndex)}
   */
  @Test
  @DisplayName("Test Builder index(PriceIndex); when PriceIndex; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(PriceIndex)"})
  void testBuilderIndex_whenPriceIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InflationRateSwapLegConvention.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(PriceIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
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
        () -> InflationRateSwapLegConvention.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code indexCalculationMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'indexCalculationMethod'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenIndexCalculationMethod() {
    // Arrange
    Builder builderResult = InflationRateSwapLegConvention.builder();

    // Act
    Builder actualSetResult = builderResult.set("indexCalculationMethod", null);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'index'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InflationRateSwapLegConvention.builder();

    // Act
    Builder actualSetResult = builderResult.set("index", mock(PriceIndex.class));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code lag}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'lag'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenLag_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InflationRateSwapLegConvention.builder();

    // Act
    Builder actualSetResult = builderResult.set("lag", null);

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
    Builder builderResult = InflationRateSwapLegConvention.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link InflationRateSwapLegConvention#meta()}.
   *
   * <p>Method under test: {@link InflationRateSwapLegConvention#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InflationRateSwapLegConvention.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InflationRateSwapLegConvention.meta();

    // Assert
    assertTrue(actualMetaResult.accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.index() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.indexCalculationMethod() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lag() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.notionalExchange() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.paymentDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
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
    Class<? extends InflationRateSwapLegConvention> actualBeanTypeResult =
        InflationRateSwapLegConvention.meta().beanType();

    // Assert
    Class<InflationRateSwapLegConvention> expectedBeanTypeResult =
        InflationRateSwapLegConvention.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#accrualBusinessDayAdjustment()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#indexCalculationMethod()}
   *   <li>{@link Meta#lag()}
   *   <li>{@link Meta#notionalExchange()}
   *   <li>{@link Meta#paymentDateOffset()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.accrualBusinessDayAdjustment()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.indexCalculationMethod()",
    "MetaProperty Meta.lag()",
    "MetaProperty Meta.notionalExchange()",
    "MetaProperty Meta.paymentDateOffset()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InflationRateSwapLegConvention.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualAccrualBusinessDayAdjustmentResult =
        metaResult.accrualBusinessDayAdjustment();
    MetaProperty<PriceIndex> actualIndexResult = metaResult.index();
    MetaProperty<PriceIndexCalculationMethod> actualIndexCalculationMethodResult =
        metaResult.indexCalculationMethod();
    MetaProperty<Period> actualLagResult = metaResult.lag();
    MetaProperty<Boolean> actualNotionalExchangeResult = metaResult.notionalExchange();

    // Assert
    assertTrue(actualAccrualBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualIndexCalculationMethodResult instanceof DirectMetaProperty);
    assertTrue(actualLagResult instanceof DirectMetaProperty);
    assertTrue(actualNotionalExchangeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.paymentDateOffset() instanceof DirectMetaProperty);
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
        InflationRateSwapLegConvention.meta().metaPropertyGet("accrualBusinessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).indexCalculationMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lag() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertEquals("accrualBusinessDayAdjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualBusinessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code indexCalculationMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'indexCalculationMethod'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsIndexCalculationMethod() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationRateSwapLegConvention.meta().metaPropertyGet("indexCalculationMethod");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lag() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertEquals("indexCalculationMethod", actualMetaPropertyGetResult.name());
    Class<PriceIndexCalculationMethod> expectedPropertyTypeResult =
        PriceIndexCalculationMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).indexCalculationMethod());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return name is {@code index}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'index'; then return name is 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndex_thenReturnNameIsIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationRateSwapLegConvention.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).indexCalculationMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lag() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<PriceIndex> expectedPropertyTypeResult = PriceIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code lag}.
   *   <li>Then return name is {@code lag}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'lag'; then return name is 'lag'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLag_thenReturnNameIsLag() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationRateSwapLegConvention.meta().metaPropertyGet("lag");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).indexCalculationMethod() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalExchange() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertEquals("lag", actualMetaPropertyGetResult.name());
    Class<Period> expectedPropertyTypeResult = Period.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lag());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code notionalExchange}.
   *   <li>Then return propertyType Name is {@code boolean}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'notionalExchange'; then return propertyType Name is 'boolean'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNotionalExchange_thenReturnPropertyTypeNameIsBoolean() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InflationRateSwapLegConvention.meta().metaPropertyGet("notionalExchange");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).indexCalculationMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lag() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).paymentDateOffset() instanceof DirectMetaProperty);
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("notionalExchange", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).notionalExchange());
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
        InflationRateSwapLegConvention.meta().metaPropertyGet("paymentDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(
        ((Meta) metaBeanResult).accrualBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).indexCalculationMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lag() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).notionalExchange() instanceof DirectMetaProperty);
    assertEquals("paymentDateOffset", actualMetaPropertyGetResult.name());
    Class<DaysAdjustment> expectedPropertyTypeResult = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).paymentDateOffset());
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
    assertNull(InflationRateSwapLegConvention.meta().metaPropertyGet("Property Name"));
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
        InflationRateSwapLegConvention.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("accrualBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("indexCalculationMethod") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lag") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("notionalExchange") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("paymentDateOffset") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange, Act and Assert
    assertNull(
        InflationRateSwapLegConvention.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            InflationRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "accrualBusinessDayAdjustment", "New Value", true));
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
            InflationRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "accrualBusinessDayAdjustment", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code indexCalculationMethod}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'indexCalculationMethod'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndexCalculationMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "indexCalculationMethod", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code lag}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'lag'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLag_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "lag", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code notionalExchange}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'notionalExchange'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNotionalExchange_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InflationRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "notionalExchange", "New Value", true));
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
            InflationRateSwapLegConvention.meta()
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
            InflationRateSwapLegConvention.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
