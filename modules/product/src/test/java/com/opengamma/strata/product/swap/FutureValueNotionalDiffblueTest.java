package com.opengamma.strata.product.swap;

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
import com.opengamma.strata.product.swap.FutureValueNotional.Builder;
import com.opengamma.strata.product.swap.FutureValueNotional.Meta;
import java.time.LocalDate;
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

class FutureValueNotionalDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> FutureValueNotional.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName("Test Builder set(String, Object) with 'propertyName', 'newValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> FutureValueNotional.builder().set("Property Name", "New Value"));
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
    Builder builderResult = FutureValueNotional.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link FutureValueNotional#meta()}.
   *
   * <p>Method under test: {@link FutureValueNotional#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FutureValueNotional.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FutureValueNotional.meta();

    // Assert
    MetaProperty<Integer> dayCountDaysResult = actualMetaResult.dayCountDays();
    assertTrue(dayCountDaysResult instanceof DirectMetaProperty);
    MetaProperty<Double> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valueDateResult = actualMetaResult.valueDate();
    assertTrue(valueDateResult instanceof DirectMetaProperty);
    assertEquals("dayCountDays", dayCountDaysResult.name());
    assertEquals("value", valueResult.name());
    assertEquals("valueDate", valueDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dayCountDaysResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueDateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<FutureValueNotional> expectedDeclaringTypeResult = FutureValueNotional.class;
    assertEquals(expectedDeclaringTypeResult, dayCountDaysResult.declaringType());
    Class<FutureValueNotional> expectedDeclaringTypeResult2 = FutureValueNotional.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<FutureValueNotional> expectedDeclaringTypeResult3 = FutureValueNotional.class;
    assertEquals(expectedDeclaringTypeResult3, valueDateResult.declaringType());
    Class<Double> expectedPropertyTypeResult = Double.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<Integer> expectedPropertyTypeResult2 = Integer.class;
    assertEquals(expectedPropertyTypeResult2, dayCountDaysResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, valueDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dayCountDaysResult.metaBean());
    assertSame(meta, valueResult.metaBean());
    assertSame(meta, valueDateResult.metaBean());
  }

  /**
   * Test {@link FutureValueNotional#metaBean()}.
   *
   * <p>Method under test: {@link FutureValueNotional#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FutureValueNotional.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, FutureValueNotional.autoCalculate().metaBean());
  }

  /**
   * Test {@link FutureValueNotional#getValueDate()}.
   *
   * <p>Method under test: {@link FutureValueNotional#getValueDate()}
   */
  @Test
  @DisplayName("Test getValueDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional FutureValueNotional.getValueDate()"})
  void testGetValueDate() {
    // Arrange, Act and Assert
    assertFalse(FutureValueNotional.autoCalculate().getValueDate().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FutureValueNotional#toString()}
   *   <li>{@link FutureValueNotional#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Builder FutureValueNotional.toBuilder()",
    "String FutureValueNotional.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    FutureValueNotional futureValueNotional =
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act
    String actualToStringResult = futureValueNotional.toString();
    futureValueNotional.toBuilder();

    // Assert
    assertEquals(
        "FutureValueNotional{value=10.0, valueDate=1970-01-01, dayCountDays=3}",
        actualToStringResult);
  }

  /**
   * Test {@link FutureValueNotional#equals(Object)}, and {@link FutureValueNotional#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FutureValueNotional#equals(Object)}
   *   <li>{@link FutureValueNotional#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FutureValueNotional.equals(Object)",
    "int FutureValueNotional.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FutureValueNotional futureValueNotional =
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build();
    FutureValueNotional futureValueNotional2 =
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(futureValueNotional, futureValueNotional2);
    assertEquals(futureValueNotional.hashCode(), futureValueNotional2.hashCode());
  }

  /**
   * Test {@link FutureValueNotional#equals(Object)}, and {@link FutureValueNotional#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FutureValueNotional#equals(Object)}
   *   <li>{@link FutureValueNotional#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FutureValueNotional.equals(Object)",
    "int FutureValueNotional.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FutureValueNotional futureValueNotional =
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(futureValueNotional, futureValueNotional);
    int expectedHashCodeResult = futureValueNotional.hashCode();
    assertEquals(expectedHashCodeResult, futureValueNotional.hashCode());
  }

  /**
   * Test {@link FutureValueNotional#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FutureValueNotional#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FutureValueNotional.equals(Object)",
    "int FutureValueNotional.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FutureValueNotional futureValueNotional =
        FutureValueNotional.builder()
            .dayCountDays(1)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertNotEquals(
        futureValueNotional,
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link FutureValueNotional#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FutureValueNotional#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FutureValueNotional.equals(Object)",
    "int FutureValueNotional.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FutureValueNotional futureValueNotional =
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(null)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertNotEquals(
        futureValueNotional,
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link FutureValueNotional#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FutureValueNotional#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FutureValueNotional.equals(Object)",
    "int FutureValueNotional.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FutureValueNotional futureValueNotional =
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.now())
            .build();

    // Act and Assert
    assertNotEquals(
        futureValueNotional,
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link FutureValueNotional#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FutureValueNotional#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FutureValueNotional.equals(Object)",
    "int FutureValueNotional.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build(),
        null);
  }

  /**
   * Test {@link FutureValueNotional#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FutureValueNotional#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FutureValueNotional.equals(Object)",
    "int FutureValueNotional.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build(),
        "Different type to FutureValueNotional");
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
    Class<? extends FutureValueNotional> actualBeanTypeResult =
        FutureValueNotional.meta().beanType();

    // Assert
    Class<FutureValueNotional> expectedBeanTypeResult = FutureValueNotional.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dayCountDays()}
   *   <li>{@link Meta#value()}
   *   <li>{@link Meta#valueDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCountDays()",
    "MetaProperty Meta.value()",
    "MetaProperty Meta.valueDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FutureValueNotional.meta();

    // Act
    MetaProperty<Integer> actualDayCountDaysResult = metaResult.dayCountDays();
    MetaProperty<Double> actualValueResult = metaResult.value();

    // Assert
    assertTrue(actualDayCountDaysResult instanceof DirectMetaProperty);
    assertTrue(actualValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valueDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCountDays}.
   *   <li>Then return name is {@code dayCountDays}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'dayCountDays'; then return name is 'dayCountDays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCountDays_thenReturnNameIsDayCountDays() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FutureValueNotional.meta().metaPropertyGet("dayCountDays");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valueDateResult = ((Meta) metaBeanResult).valueDate();
    assertTrue(valueDateResult instanceof DirectMetaProperty);
    assertEquals("dayCountDays", actualMetaPropertyGetResult.name());
    Class<Integer> expectedPropertyTypeResult = Integer.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCountDays());
    assertSame(metaBeanResult, valueResult.metaBean());
    assertSame(metaBeanResult, valueDateResult.metaBean());
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
    assertNull(FutureValueNotional.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valueDate}.
   *   <li>Then return name is {@code valueDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valueDate'; then return name is 'valueDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValueDate_thenReturnNameIsValueDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FutureValueNotional.meta().metaPropertyGet("valueDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Integer> dayCountDaysResult = ((Meta) metaBeanResult).dayCountDays();
    assertTrue(dayCountDaysResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("valueDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valueDate());
    assertSame(metaBeanResult, dayCountDaysResult.metaBean());
    assertSame(metaBeanResult, valueResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult =
        FutureValueNotional.meta().metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Integer> dayCountDaysResult = ((Meta) metaBeanResult).dayCountDays();
    assertTrue(dayCountDaysResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valueDateResult = ((Meta) metaBeanResult).valueDate();
    assertTrue(valueDateResult instanceof DirectMetaProperty);
    assertEquals("value", actualMetaPropertyGetResult.name());
    Class<Double> expectedPropertyTypeResult = Double.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).value());
    assertSame(metaBeanResult, dayCountDaysResult.metaBean());
    assertSame(metaBeanResult, valueDateResult.metaBean());
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
        FutureValueNotional.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("dayCountDays");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("valueDate");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("dayCountDays", getResult2.name());
    assertEquals("value", getResult.name());
    assertEquals("valueDate", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<FutureValueNotional> expectedDeclaringTypeResult = FutureValueNotional.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<FutureValueNotional> expectedDeclaringTypeResult2 = FutureValueNotional.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<FutureValueNotional> expectedDeclaringTypeResult3 = FutureValueNotional.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<Double> expectedPropertyTypeResult = Double.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<Integer> expectedPropertyTypeResult2 = Integer.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When autoCalculate.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when autoCalculate; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAutoCalculate_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = FutureValueNotional.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(FutureValueNotional.autoCalculate(), "Property Name", false));
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
    assertNull(FutureValueNotional.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCountDays}.
   *   <li>Then return intValue is three.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'dayCountDays'; then return intValue is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDayCountDays_thenReturnIntValueIsThree() {
    // Arrange
    Meta metaResult = FutureValueNotional.meta();

    // Act and Assert
    assertEquals(
        3,
        ((Integer)
                metaResult.propertyGet(
                    FutureValueNotional.builder()
                        .dayCountDays(3)
                        .value(10.0d)
                        .valueDate(LocalDate.of(1970, 1, 1))
                        .build(),
                    "dayCountDays",
                    true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code valueDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'valueDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValueDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = FutureValueNotional.meta();
    LocalDate valueDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            FutureValueNotional.builder().dayCountDays(3).value(10.0d).valueDate(valueDate).build(),
            "valueDate",
            true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(valueDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'value'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = FutureValueNotional.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    FutureValueNotional.builder()
                        .dayCountDays(3)
                        .value(10.0d)
                        .valueDate(LocalDate.of(1970, 1, 1))
                        .build(),
                    "value",
                    true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCountDays}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCountDays'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCountDays_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FutureValueNotional.meta()
                .propertySet(mock(Bean.class), "dayCountDays", "New Value", true));
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
            FutureValueNotional.meta()
                .propertySet(mock(Bean.class), "dayCountDays", "New Value", false));
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
            FutureValueNotional.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valueDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valueDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValueDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FutureValueNotional.meta()
                .propertySet(mock(Bean.class), "valueDate", "New Value", true));
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
        () -> FutureValueNotional.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }
}
