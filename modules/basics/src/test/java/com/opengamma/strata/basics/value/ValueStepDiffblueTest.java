package com.opengamma.strata.basics.value;

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
import com.opengamma.strata.basics.value.ValueStep.Builder;
import com.opengamma.strata.basics.value.ValueStep.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueStepDiffblueTest {
  /**
   * Test {@link ValueStep#builder()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueStep#builder()}
   *   <li>{@link ValueStep#date(LocalDate)}
   *   <li>{@link ValueStep#periodIndex(Integer)}
   * </ul>
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueStep Builder.build()",
    "Builder Builder.date(LocalDate)",
    "Builder Builder.periodIndex(Integer)",
    "String Builder.toString()"
  })
  void testBuilder() {
    // Arrange and Act
    Builder actualPeriodIndexResult =
        ValueStep.builder().date(LocalDate.of(1970, 1, 1)).periodIndex(1);
    Builder actualValueResult = actualPeriodIndexResult.value(ValueAdjustment.NONE);

    // Assert
    assertSame(actualPeriodIndexResult, actualValueResult);
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
    assertThrows(NoSuchElementException.class, () -> ValueStep.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ValueStep.builder().get("value"));
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
        NoSuchElementException.class, () -> ValueStep.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ValueStep.builder();

    // Act
    Builder actualSetResult = builderResult.set("value", ValueAdjustment.NONE);

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
    Builder builderResult = ValueStep.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#value(ValueAdjustment)}.
   *
   * <ul>
   *   <li>When {@link ValueAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#value(ValueAdjustment)}
   */
  @Test
  @DisplayName("Test Builder value(ValueAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.value(ValueAdjustment)"})
  void testBuilderValue_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ValueStep.builder();

    // Act
    Builder actualValueResult = builderResult.value(ValueAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualValueResult);
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
    Class<? extends ValueStep> actualBeanTypeResult = ValueStep.meta().beanType();

    // Assert
    Class<ValueStep> expectedBeanTypeResult = ValueStep.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#date()}
   *   <li>{@link Meta#periodIndex()}
   *   <li>{@link Meta#value()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.date()",
    "MetaProperty Meta.periodIndex()",
    "MetaProperty Meta.value()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ValueStep.meta();

    // Act
    MetaProperty<LocalDate> actualDateResult = metaResult.date();
    MetaProperty<Integer> actualPeriodIndexResult = metaResult.periodIndex();

    // Assert
    assertTrue(actualDateResult instanceof DirectMetaProperty);
    assertTrue(actualPeriodIndexResult instanceof DirectMetaProperty);
    assertTrue(metaResult.value() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return name is {@code date}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'date'; then return name is 'date'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDate_thenReturnNameIsDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ValueStep.meta().metaPropertyGet("date");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> periodIndexResult = ((Meta) metaBeanResult).periodIndex();
    assertTrue(periodIndexResult instanceof DirectMetaProperty);
    MetaProperty<ValueAdjustment> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("date", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).date());
    assertSame(metaBeanResult, periodIndexResult.metaBean());
    assertSame(metaBeanResult, valueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code periodIndex}.
   *   <li>Then return name is {@code periodIndex}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'periodIndex'; then return name is 'periodIndex'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPeriodIndex_thenReturnNameIsPeriodIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ValueStep.meta().metaPropertyGet("periodIndex");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueAdjustment> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("periodIndex", actualMetaPropertyGetResult.name());
    Class<Integer> expectedPropertyTypeResult = Integer.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).periodIndex());
    assertSame(metaBeanResult, dateResult.metaBean());
    assertSame(metaBeanResult, valueResult.metaBean());
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
    assertNull(ValueStep.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return name is {@code value}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'value'; then return name is 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenReturnNameIsValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ValueStep.meta().metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> dateResult = ((Meta) metaBeanResult).date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> periodIndexResult = ((Meta) metaBeanResult).periodIndex();
    assertTrue(periodIndexResult instanceof DirectMetaProperty);
    assertEquals("value", actualMetaPropertyGetResult.name());
    Class<ValueAdjustment> expectedPropertyTypeResult = ValueAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).value());
    assertSame(metaBeanResult, dateResult.metaBean());
    assertSame(metaBeanResult, periodIndexResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = ValueStep.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("periodIndex");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("date");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("date", getResult2.name());
    assertEquals("periodIndex", getResult.name());
    assertEquals("value", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ValueAdjustment> expectedPropertyTypeResult = ValueAdjustment.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<ValueStep> expectedDeclaringTypeResult = ValueStep.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ValueStep> expectedDeclaringTypeResult2 = ValueStep.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<ValueStep> expectedDeclaringTypeResult3 = ValueStep.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<Integer> expectedPropertyTypeResult2 = Integer.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then {@link ValueStep} with periodIndex is one and value is {@link ValueAdjustment#NONE}
   *       Value is {@link ValueAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then ValueStep with periodIndex is one and value is NONE Value is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenValueStepWithPeriodIndexIsOneAndValueIsNoneValueIsNone() {
    // Arrange
    Meta metaResult = ValueStep.meta();
    ValueStep bean = ValueStep.of(1, ValueAdjustment.NONE);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "value", true);

    // Assert
    ValueAdjustment valueAdjustment = ((ValueAdjustment) actualPropertyGetResult).NONE;
    assertSame(valueAdjustment, bean.getValue());
    assertSame(valueAdjustment, actualPropertyGetResult);
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
    assertNull(ValueStep.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'date'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDate_thenReturnNull() {
    // Arrange
    Meta metaResult = ValueStep.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(ValueStep.of(1, ValueAdjustment.NONE), "date", true));
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
    // Arrange
    Meta metaResult = ValueStep.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(ValueStep.of(1, ValueAdjustment.NONE), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code periodIndex}.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'periodIndex'; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPeriodIndex_thenReturnIntValueIsOne() {
    // Arrange
    Meta metaResult = ValueStep.meta();

    // Act and Assert
    assertEquals(
        1,
        ((Integer)
                metaResult.propertyGet(ValueStep.of(1, ValueAdjustment.NONE), "periodIndex", true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'date'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ValueStep.meta().propertySet(mock(Bean.class), "date", "New Value", true));
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
        () -> ValueStep.meta().propertySet(mock(Bean.class), "date", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code periodIndex}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'periodIndex'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPeriodIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ValueStep.meta().propertySet(mock(Bean.class), "periodIndex", "New Value", true));
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
        () -> ValueStep.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ValueStep.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test {@link ValueStep#of(LocalDate, ValueAdjustment)} with {@code date}, {@code value}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ValueStep#of(LocalDate, ValueAdjustment)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, ValueAdjustment) with 'date', 'value'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueStep ValueStep.of(LocalDate, ValueAdjustment)"})
  void testOfWithDateValue_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ValueStep.of(null, ValueAdjustment.NONE));
  }

  /**
   * Test {@link ValueStep#of(int, ValueAdjustment)} with {@code periodIndex}, {@code value}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ValueStep#of(int, ValueAdjustment)}
   */
  @Test
  @DisplayName(
      "Test of(int, ValueAdjustment) with 'periodIndex', 'value'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueStep ValueStep.of(int, ValueAdjustment)"})
  void testOfWithPeriodIndexValue_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ValueStep.of(0, ValueAdjustment.NONE));
  }

  /**
   * Test {@link ValueStep#findIndex(List)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link ValueStep#findIndex(List)}
   */
  @Test
  @DisplayName(
      "Test findIndex(List); given LocalDate with '1970' and one and one; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ValueStep.findIndex(List)"})
  void testFindIndex_givenLocalDateWith1970AndOneAndOne_thenReturnMinusOne() {
    // Arrange
    ValueStep ofResult = ValueStep.of(LocalDate.of(1970, 1, 1), ValueAdjustment.NONE);

    // Act and Assert
    assertEquals(-1, ofResult.findIndex(new ArrayList<>()));
  }

  /**
   * Test {@link ValueStep#findIndex(List)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ValueStep#findIndex(List)}
   */
  @Test
  @DisplayName("Test findIndex(List); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ValueStep.findIndex(List)"})
  void testFindIndex_thenThrowIllegalArgumentException() {
    // Arrange
    ValueStep ofResult = ValueStep.of(1, ValueAdjustment.NONE);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.findIndex(new ArrayList<>()));
  }

  /**
   * Test {@link ValueStep#meta()}.
   *
   * <p>Method under test: {@link ValueStep#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueStep.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ValueStep.meta();

    // Assert
    MetaProperty<LocalDate> dateResult = actualMetaResult.date();
    assertTrue(dateResult instanceof DirectMetaProperty);
    MetaProperty<Integer> periodIndexResult = actualMetaResult.periodIndex();
    assertTrue(periodIndexResult instanceof DirectMetaProperty);
    MetaProperty<ValueAdjustment> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("date", dateResult.name());
    assertEquals("periodIndex", periodIndexResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, periodIndexResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ValueAdjustment> expectedPropertyTypeResult = ValueAdjustment.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<ValueStep> expectedDeclaringTypeResult = ValueStep.class;
    assertEquals(expectedDeclaringTypeResult, dateResult.declaringType());
    Class<ValueStep> expectedDeclaringTypeResult2 = ValueStep.class;
    assertEquals(expectedDeclaringTypeResult2, periodIndexResult.declaringType());
    Class<ValueStep> expectedDeclaringTypeResult3 = ValueStep.class;
    assertEquals(expectedDeclaringTypeResult3, valueResult.declaringType());
    Class<Integer> expectedPropertyTypeResult2 = Integer.class;
    assertEquals(expectedPropertyTypeResult2, periodIndexResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, dateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateResult.metaBean());
    assertSame(meta, periodIndexResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link ValueStep#metaBean()}.
   *
   * <p>Method under test: {@link ValueStep#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueStep.metaBean()"})
  void testMetaBean() {
    // Arrange
    ValueStep ofResult = ValueStep.of(1, ValueAdjustment.NONE);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link ValueStep#getDate()}.
   *
   * <p>Method under test: {@link ValueStep#getDate()}
   */
  @Test
  @DisplayName("Test getDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ValueStep.getDate()"})
  void testGetDate() {
    // Arrange
    ValueStep ofResult = ValueStep.of(1, ValueAdjustment.NONE);

    // Act and Assert
    assertFalse(ofResult.getDate().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueStep#toString()}
   *   <li>{@link ValueStep#getValue()}
   *   <li>{@link ValueStep#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueAdjustment ValueStep.getValue()",
    "Builder ValueStep.toBuilder()",
    "String ValueStep.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ValueStep ofResult = ValueStep.of(1, ValueAdjustment.NONE);

    // Act
    String actualToStringResult = ofResult.toString();
    ValueAdjustment actualValue = ofResult.getValue();
    ofResult.toBuilder();

    // Assert
    assertEquals(
        "ValueStep{periodIndex=1, date=null, value=ValueAdjustment[result = input]}",
        actualToStringResult);
    assertSame(ValueAdjustment.NONE, actualValue);
  }

  /**
   * Test {@link ValueStep#equals(Object)}, and {@link ValueStep#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueStep#equals(Object)}
   *   <li>{@link ValueStep#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueStep.equals(Object)", "int ValueStep.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ValueStep valueStep =
        ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build();
    ValueStep valueStep2 =
        ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build();

    // Act and Assert
    assertEquals(valueStep, valueStep2);
    assertEquals(valueStep.hashCode(), valueStep2.hashCode());
  }

  /**
   * Test {@link ValueStep#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStep#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueStep.equals(Object)", "int ValueStep.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ValueStep valueStep =
        ValueStep.builder().date(null).periodIndex(128).value(ValueAdjustment.NONE).build();

    // Act and Assert
    assertNotEquals(
        valueStep,
        ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());
  }

  /**
   * Test {@link ValueStep#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueStep#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueStep.equals(Object)", "int ValueStep.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder periodIndexResult = ValueStep.builder().date(null).periodIndex(1);
    ValueStep valueStep = periodIndexResult.value(ValueAdjustment.ofDeltaAmount(0.5d)).build();

    // Act and Assert
    assertNotEquals(
        valueStep,
        ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());
  }
}
