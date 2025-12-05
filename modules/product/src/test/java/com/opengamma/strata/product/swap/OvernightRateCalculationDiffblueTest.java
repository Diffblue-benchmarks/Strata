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
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.basics.value.ValueSchedule;
import com.opengamma.strata.product.swap.OvernightRateCalculation.Builder;
import com.opengamma.strata.product.swap.OvernightRateCalculation.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightRateCalculationDiffblueTest {
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
    Builder builderResult = OvernightRateCalculation.builder();

    // Act
    Builder actualAccrualMethodResult =
        builderResult.accrualMethod(OvernightAccrualMethod.COMPOUNDED);

    // Assert
    assertSame(builderResult, actualAccrualMethodResult);
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
    Builder builderResult = OvernightRateCalculation.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
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
    Object actualGetResult = OvernightRateCalculation.builder().get("accrualMethod");

    // Assert
    assertTrue(actualGetResult instanceof OvernightAccrualMethod);
    assertEquals(OvernightAccrualMethod.COMPOUNDED, actualGetResult);
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
    assertNull(OvernightRateCalculation.builder().get("dayCount"));
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
    assertNull(OvernightRateCalculation.builder().get("index"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code negativeRateMethod}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'negativeRateMethod'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenNegativeRateMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> OvernightRateCalculation.builder().get("negativeRateMethod"));
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
        () -> OvernightRateCalculation.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code rateCutOffDays}.
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'rateCutOffDays'; then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRateCutOffDays_thenReturnIntValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0, ((Integer) OvernightRateCalculation.builder().get("rateCutOffDays")).intValue());
  }

  /**
   * Test Builder {@link Builder#index(OvernightIndex)}.
   *
   * <ul>
   *   <li>When {@link OvernightIndex}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(OvernightIndex)}
   */
  @Test
  @DisplayName("Test Builder index(OvernightIndex); when OvernightIndex; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(OvernightIndex)"})
  void testBuilderIndex_whenOvernightIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightRateCalculation.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(OvernightIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
  }

  /**
   * Test Builder {@link Builder#negativeRateMethod(NegativeRateMethod)}.
   *
   * <ul>
   *   <li>When {@code ALLOW_NEGATIVE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#negativeRateMethod(NegativeRateMethod)}
   */
  @Test
  @DisplayName(
      "Test Builder negativeRateMethod(NegativeRateMethod); when 'ALLOW_NEGATIVE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.negativeRateMethod(NegativeRateMethod)"})
  void testBuilderNegativeRateMethod_whenAllowNegative_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightRateCalculation.builder();

    // Act
    Builder actualNegativeRateMethodResult =
        builderResult.negativeRateMethod(NegativeRateMethod.ALLOW_NEGATIVE);

    // Assert
    assertSame(builderResult, actualNegativeRateMethodResult);
  }

  /**
   * Test Builder {@link Builder#rateCutOffDays(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#rateCutOffDays(int)}
   */
  @Test
  @DisplayName("Test Builder rateCutOffDays(int); when one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.rateCutOffDays(int)"})
  void testBuilderRateCutOffDays_whenOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = OvernightRateCalculation.builder();

    // Act
    Builder actualRateCutOffDaysResult = builderResult.rateCutOffDays(1);

    // Assert
    assertSame(builderResult, actualRateCutOffDaysResult);
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
        () -> OvernightRateCalculation.builder().set("Property Name", "New Value"));
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
    Builder builderResult = OvernightRateCalculation.builder();

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
    Builder builderResult = OvernightRateCalculation.builder();

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
    Class<? extends OvernightRateCalculation> actualBeanTypeResult =
        OvernightRateCalculation.meta().beanType();

    // Assert
    Class<OvernightRateCalculation> expectedBeanTypeResult = OvernightRateCalculation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#accrualMethod()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#gearing()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#negativeRateMethod()}
   *   <li>{@link Meta#rateCutOffDays()}
   *   <li>{@link Meta#spread()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.accrualMethod()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.gearing()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.negativeRateMethod()",
    "MetaProperty Meta.rateCutOffDays()",
    "MetaProperty Meta.spread()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = OvernightRateCalculation.meta();

    // Act
    MetaProperty<OvernightAccrualMethod> actualAccrualMethodResult = metaResult.accrualMethod();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<ValueSchedule> actualGearingResult = metaResult.gearing();
    MetaProperty<OvernightIndex> actualIndexResult = metaResult.index();
    MetaProperty<NegativeRateMethod> actualNegativeRateMethodResult =
        metaResult.negativeRateMethod();
    MetaProperty<Integer> actualRateCutOffDaysResult = metaResult.rateCutOffDays();

    // Assert
    assertTrue(actualAccrualMethodResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualGearingResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualNegativeRateMethodResult instanceof DirectMetaProperty);
    assertTrue(actualRateCutOffDaysResult instanceof DirectMetaProperty);
    assertTrue(metaResult.spread() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code negativeRateMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'negativeRateMethod'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsNegativeRateMethod() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightRateCalculation.meta().metaPropertyGet("negativeRateMethod");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateCutOffDays() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertEquals("negativeRateMethod", actualMetaPropertyGetResult.name());
    Class<NegativeRateMethod> expectedPropertyTypeResult = NegativeRateMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).negativeRateMethod());
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
        OvernightRateCalculation.meta().metaPropertyGet("accrualMethod");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateCutOffDays() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertEquals("accrualMethod", actualMetaPropertyGetResult.name());
    Class<OvernightAccrualMethod> expectedPropertyTypeResult = OvernightAccrualMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualMethod());
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
        OvernightRateCalculation.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateCutOffDays() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code gearing}.
   *   <li>Then return name is {@code gearing}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'gearing'; then return name is 'gearing'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenGearing_thenReturnNameIsGearing() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightRateCalculation.meta().metaPropertyGet("gearing");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateCutOffDays() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertEquals("gearing", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).gearing());
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
        OvernightRateCalculation.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateCutOffDays() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<OvernightIndex> expectedPropertyTypeResult = OvernightIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
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
    assertNull(OvernightRateCalculation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rateCutOffDays}.
   *   <li>Then return propertyType Name is {@code int}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'rateCutOffDays'; then return propertyType Name is 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRateCutOffDays_thenReturnPropertyTypeNameIsInt() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightRateCalculation.meta().metaPropertyGet("rateCutOffDays");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spread() instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("rateCutOffDays", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rateCutOffDays());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spread}.
   *   <li>Then return name is {@code spread}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'spread'; then return name is 'spread'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpread_thenReturnNameIsSpread() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        OvernightRateCalculation.meta().metaPropertyGet("spread");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).accrualMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).negativeRateMethod() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rateCutOffDays() instanceof DirectMetaProperty);
    assertEquals("spread", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spread());
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
        OvernightRateCalculation.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("accrualMethod") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("gearing") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("negativeRateMethod") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rateCutOffDays") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("spread") instanceof DirectMetaProperty);
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
        OvernightRateCalculation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> OvernightRateCalculation.meta().propertyGet(null, "Property Name", false));
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
            OvernightRateCalculation.meta()
                .propertySet(mock(Bean.class), "accrualMethod", "New Value", true));
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
            OvernightRateCalculation.meta()
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
            OvernightRateCalculation.meta()
                .propertySet(mock(Bean.class), "accrualMethod", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code gearing}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'gearing'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenGearing_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightRateCalculation.meta()
                .propertySet(mock(Bean.class), "gearing", "New Value", true));
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
            OvernightRateCalculation.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code negativeRateMethod}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'negativeRateMethod'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNegativeRateMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightRateCalculation.meta()
                .propertySet(mock(Bean.class), "negativeRateMethod", "New Value", true));
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
            OvernightRateCalculation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rateCutOffDays}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rateCutOffDays'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRateCutOffDays_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            OvernightRateCalculation.meta()
                .propertySet(mock(Bean.class), "rateCutOffDays", "New Value", true));
  }
}
