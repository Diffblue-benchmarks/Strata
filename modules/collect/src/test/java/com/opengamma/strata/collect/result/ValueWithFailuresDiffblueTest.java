package com.opengamma.strata.collect.result;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.result.ValueWithFailures.Meta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ValueWithFailuresDiffblueTest {
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act
    Class<? extends ValueWithFailures<Object>> actualBeanTypeResult =
        metaValueWithFailuresResult.beanType();

    // Assert
    Class<ValueWithFailures> expectedBeanTypeResult = ValueWithFailures.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#failures()}
   *   <li>{@link Meta#value()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.failures()", "MetaProperty Meta.value()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ValueWithFailures.meta();

    // Act
    MetaProperty<ImmutableList<FailureItem>> actualFailuresResult = metaResult.failures();

    // Assert
    assertTrue(actualFailuresResult instanceof DirectMetaProperty);
    assertTrue(metaResult.value() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code failures}.
   *   <li>Then metaBean value return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'failures'; then metaBean value return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFailures_thenMetaBeanValueReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaValueWithFailuresResult.metaPropertyGet("failures");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Object> valueResult = ((Meta<Object>) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("failures", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ValueWithFailures> expectedDeclaringTypeResult = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, valueResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).failures());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act and Assert
    assertNull(metaValueWithFailuresResult.metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@link FailureAttributeKeys#VALUE}.
   *   <li>Then metaBean failures return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when VALUE; then metaBean failures return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenMetaBeanFailuresReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaValueWithFailuresResult.metaPropertyGet(FailureAttributeKeys.VALUE);

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<FailureItem>> failuresResult =
        ((Meta<Object>) metaBeanResult).failures();
    assertTrue(failuresResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("failures", failuresResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, failuresResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, failuresResult.propertyType());
    Class<ValueWithFailures> expectedDeclaringTypeResult = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult, failuresResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).value());
    assertSame(Meta.INSTANCE, failuresResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaValueWithFailuresResult.metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get(FailureAttributeKeys.VALUE);
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("failures");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("failures", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ValueWithFailures> expectedDeclaringTypeResult = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ValueWithFailures> expectedDeclaringTypeResult2 = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, getResult.name());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act and Assert
    assertNull(metaValueWithFailuresResult.propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code failures}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'failures'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFailures_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaValueWithFailuresResult.propertySet(
                mock(Bean.class), "failures", "New Value", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            metaValueWithFailuresResult.propertySet(
                mock(Bean.class), "failures", "New Value", false));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaValueWithFailuresResult.propertySet(
                mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@link FailureAttributeKeys#VALUE}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when VALUE; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaValueWithFailuresResult.propertySet(
                mock(Bean.class), FailureAttributeKeys.VALUE, "New Value", true));
  }

  /**
   * Test {@link ValueWithFailures#of(Object, Collection)} with {@code Object}, {@code Collection}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Object, Collection) with 'Object', 'Collection'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, Collection)"})
  void testOfWithObjectCollection_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    failures.add(ofResult);

    // Act
    ValueWithFailures<Object> actualOfResult =
        ValueWithFailures.of("Success Value", (Collection<FailureItem>) failures);

    // Assert
    ImmutableList<FailureItem> failures2 = actualOfResult.getFailures();
    assertEquals(1, failures2.size());
    assertTrue(actualOfResult.hasFailures());
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link ValueWithFailures#of(Object, Collection)} with {@code Object}, {@code Collection}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Object, Collection) with 'Object', 'Collection'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, Collection)"})
  void testOfWithObjectCollection_thenReturnFailuresSizeIsTwo() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    failures.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    failures.add(ofResult2);

    // Act
    ValueWithFailures<Object> actualOfResult =
        ValueWithFailures.of("Success Value", (Collection<FailureItem>) failures);

    // Assert
    ImmutableList<FailureItem> failures2 = actualOfResult.getFailures();
    assertEquals(2, failures2.size());
    assertSame(ofResult2, failures2.get(1));
  }

  /**
   * Test {@link ValueWithFailures#of(Object, Collection)} with {@code Object}, {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Value is {@code Success Value}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, Collection)}
   */
  @Test
  @DisplayName(
      "Test of(Object, Collection) with 'Object', 'Collection'; when ArrayList(); then return Value is 'Success Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, Collection)"})
  void testOfWithObjectCollection_whenArrayList_thenReturnValueIsSuccessValue() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();

    // Act
    ValueWithFailures<Object> actualOfResult =
        ValueWithFailures.of("Success Value", (Collection<FailureItem>) failures);

    // Assert
    assertEquals("Success Value", actualOfResult.getValue());
    assertFalse(actualOfResult.hasFailures());
    assertEquals(failures, actualOfResult.getFailures());
  }

  /**
   * Test {@link ValueWithFailures#of(Object, FailureItem[])} with {@code Object}, {@code
   * FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, FailureItem[])}
   */
  @Test
  @DisplayName(
      "Test of(Object, FailureItem[]) with 'Object', 'FailureItem[]'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, FailureItem[])"})
  void testOfWithObjectFailureItem_thenReturnFailuresSizeIsOne() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    ValueWithFailures<Object> actualOfResult = ValueWithFailures.of("Success Value", ofResult);

    // Assert
    ImmutableList<FailureItem> failures = actualOfResult.getFailures();
    assertEquals(1, failures.size());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link ValueWithFailures#of(Object, FailureItem[])} with {@code Object}, {@code
   * FailureItem[]}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, FailureItem[])}
   */
  @Test
  @DisplayName(
      "Test of(Object, FailureItem[]) with 'Object', 'FailureItem[]'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, FailureItem[])"})
  void testOfWithObjectFailureItem_thenReturnFailuresSizeIsTwo() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    // Act
    ValueWithFailures<Object> actualOfResult =
        ValueWithFailures.of("Success Value", ofResult, ofResult2);

    // Assert
    ImmutableList<FailureItem> failures = actualOfResult.getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult, failures.get(0));
    assertSame(ofResult2, failures.get(1));
  }

  /**
   * Test {@link ValueWithFailures#of(Object, FailureItem[])} with {@code Object}, {@code
   * FailureItem[]}.
   *
   * <ul>
   *   <li>When {@code Success Value}.
   *   <li>Then return Value is {@code Success Value}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, FailureItem[])}
   */
  @Test
  @DisplayName(
      "Test of(Object, FailureItem[]) with 'Object', 'FailureItem[]'; when 'Success Value'; then return Value is 'Success Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, FailureItem[])"})
  void testOfWithObjectFailureItem_whenSuccessValue_thenReturnValueIsSuccessValue() {
    // Arrange and Act
    ValueWithFailures<Object> actualOfResult = ValueWithFailures.of("Success Value");

    // Assert
    assertEquals("Success Value", actualOfResult.getValue());
    assertFalse(actualOfResult.hasFailures());
    assertTrue(actualOfResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#of(Object, List)} with {@code Object}, {@code List}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, List)}
   */
  @Test
  @DisplayName("Test of(Object, List) with 'Object', 'List'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, List)"})
  void testOfWithObjectList_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    failures.add(ofResult);

    // Act
    ValueWithFailures<Object> actualOfResult =
        ValueWithFailures.of("Success Value", (List<FailureItem>) failures);

    // Assert
    ImmutableList<FailureItem> failures2 = actualOfResult.getFailures();
    assertEquals(1, failures2.size());
    assertTrue(actualOfResult.hasFailures());
    assertSame(ofResult, failures2.get(0));
  }

  /**
   * Test {@link ValueWithFailures#of(Object, List)} with {@code Object}, {@code List}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, List)}
   */
  @Test
  @DisplayName("Test of(Object, List) with 'Object', 'List'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, List)"})
  void testOfWithObjectList_thenReturnFailuresSizeIsTwo() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    failures.add(ofResult);
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    failures.add(ofResult2);

    // Act
    ValueWithFailures<Object> actualOfResult =
        ValueWithFailures.of("Success Value", (List<FailureItem>) failures);

    // Assert
    ImmutableList<FailureItem> failures2 = actualOfResult.getFailures();
    assertEquals(2, failures2.size());
    assertSame(ofResult2, failures2.get(1));
  }

  /**
   * Test {@link ValueWithFailures#of(Object, List)} with {@code Object}, {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Value is {@code Success Value}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, List)}
   */
  @Test
  @DisplayName(
      "Test of(Object, List) with 'Object', 'List'; when ArrayList(); then return Value is 'Success Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, List)"})
  void testOfWithObjectList_whenArrayList_thenReturnValueIsSuccessValue() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();

    // Act
    ValueWithFailures<Object> actualOfResult =
        ValueWithFailures.of("Success Value", (List<FailureItem>) failures);

    // Assert
    assertEquals("Success Value", actualOfResult.getValue());
    assertFalse(actualOfResult.hasFailures());
    assertEquals(failures, actualOfResult.getFailures());
  }

  /**
   * Test {@link ValueWithFailures#of(Object, Supplier)} with {@code Object}, {@code Supplier}.
   *
   * <p>Method under test: {@link ValueWithFailures#of(Object, Supplier)}
   */
  @Test
  @DisplayName("Test of(Object, Supplier) with 'Object', 'Supplier'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.of(Object, Supplier)"})
  void testOfWithObjectSupplier() {
    // Arrange
    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    ValueWithFailures<Object> actualOfResult = ValueWithFailures.of("Empty Value", supplier);

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualOfResult.getValue());
    assertFalse(actualOfResult.hasFailures());
    assertTrue(actualOfResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combiningValues(BinaryOperator)}.
   *
   * <p>Method under test: {@link ValueWithFailures#combiningValues(BinaryOperator)}
   */
  @Test
  @DisplayName("Test combiningValues(BinaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator ValueWithFailures.combiningValues(BinaryOperator)"})
  void testCombiningValues() {
    // Arrange
    BinaryOperator<Object> combiner = mock(BinaryOperator.class);
    when(combiner.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    BinaryOperator<ValueWithFailures<Object>> actualCombiningValuesResult =
        ValueWithFailures.combiningValues(combiner);
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult4 = ValueWithFailures.of("Success Value", ofResult3);
    ValueWithFailures<Object> actualApplyResult =
        actualCombiningValuesResult.apply(ofResult2, ofResult4);

    // Assert
    verify(combiner).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualApplyResult.getValue());
    assertEquals("Success Value", ofResult2.getValue());
    ImmutableList<FailureItem> failures = ofResult2.getFailures();
    assertEquals(1, failures.size());
    ImmutableList<FailureItem> failures2 = actualApplyResult.getFailures();
    assertEquals(2, failures2.size());
    assertTrue(actualApplyResult.hasFailures());
    assertTrue(ofResult2.hasFailures());
    assertSame(ofResult, failures2.get(0));
    assertSame(ofResult3, failures2.get(1));
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link ValueWithFailures#combiningValues(BinaryOperator)}.
   *
   * <p>Method under test: {@link ValueWithFailures#combiningValues(BinaryOperator)}
   */
  @Test
  @DisplayName("Test combiningValues(BinaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator ValueWithFailures.combiningValues(BinaryOperator)"})
  void testCombiningValues2() {
    // Arrange
    BinaryOperator<Object> combiner = mock(BinaryOperator.class);
    when(combiner.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    BinaryOperator<ValueWithFailures<Object>> actualCombiningValuesResult =
        ValueWithFailures.combiningValues(combiner);
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult4 =
        ValueWithFailures.of("Success Value", ofResult, ofResult2, ofResult3);
    FailureItem ofResult5 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult6 = ValueWithFailures.of("Success Value", ofResult5);
    ValueWithFailures<Object> actualApplyResult =
        actualCombiningValuesResult.apply(ofResult4, ofResult6);

    // Assert
    verify(combiner).apply(isA(Object.class), isA(Object.class));
    assertEquals("Apply", actualApplyResult.getValue());
    assertEquals("Success Value", ofResult6.getValue());
    assertEquals("Success Value", ofResult4.getValue());
    assertEquals(1, ofResult6.getFailures().size());
    assertEquals(3, ofResult4.getFailures().size());
    assertEquals(4, actualApplyResult.getFailures().size());
    assertTrue(actualApplyResult.hasFailures());
    assertTrue(ofResult6.hasFailures());
    assertTrue(ofResult4.hasFailures());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsList(Iterable)}.
   *
   * <ul>
   *   <li>Given of {@code Success Value} and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsList(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsList(Iterable); given of 'Success Value' and ArrayList(); then return Value size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsList(Iterable)"})
  void testCombineValuesAsList_givenOfSuccessValueAndArrayList_thenReturnValueSizeIsOne() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult);

    // Act
    ValueWithFailures<List<Object>> actualCombineValuesAsListResult =
        ValueWithFailures.combineValuesAsList(items);

    // Assert
    List<Object> value = actualCombineValuesAsListResult.getValue();
    assertEquals(1, value.size());
    assertEquals("Success Value", value.get(0));
    assertFalse(actualCombineValuesAsListResult.hasFailures());
    assertTrue(actualCombineValuesAsListResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsList(Iterable)}.
   *
   * <ul>
   *   <li>Given of {@code Success Value} and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsList(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsList(Iterable); given of 'Success Value' and ArrayList(); then return Value size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsList(Iterable)"})
  void testCombineValuesAsList_givenOfSuccessValueAndArrayList_thenReturnValueSizeIsTwo() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ArrayList<FailureItem> failures = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("Success Value", failures);
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult2);

    // Act
    ValueWithFailures<List<Object>> actualCombineValuesAsListResult =
        ValueWithFailures.combineValuesAsList(items);

    // Assert
    List<Object> value = actualCombineValuesAsListResult.getValue();
    assertEquals(2, value.size());
    assertEquals("Success Value", value.get(1));
    assertEquals(failures, actualCombineValuesAsListResult.getFailures());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsList(Iterable)}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsList(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsList(Iterable); then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsList(Iterable)"})
  void testCombineValuesAsList_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", ofResult);
    items.add(ofResult2);

    // Act
    ValueWithFailures<List<Object>> actualCombineValuesAsListResult =
        ValueWithFailures.combineValuesAsList(items);

    // Assert
    ImmutableList<FailureItem> failures = actualCombineValuesAsListResult.getFailures();
    assertEquals(1, failures.size());
    assertTrue(actualCombineValuesAsListResult.hasFailures());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsList(Iterable)}.
   *
   * <ul>
   *   <li>Then return Value size is five.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsList(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsList(Iterable); then return Value size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsList(Iterable)"})
  void testCombineValuesAsList_thenReturnValueSizeIsFive() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult2);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult3);
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult4);
    ValueWithFailures<?> ofResult5 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult5);

    // Act
    ValueWithFailures<List<Object>> actualCombineValuesAsListResult =
        ValueWithFailures.combineValuesAsList(items);

    // Assert
    List<Object> value = actualCombineValuesAsListResult.getValue();
    assertEquals(5, value.size());
    assertEquals("Success Value", value.get(2));
    assertEquals("Success Value", value.get(3));
    assertEquals("Success Value", value.get(4));
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsList(Iterable)}.
   *
   * <ul>
   *   <li>Then return Value size is four.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsList(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsList(Iterable); then return Value size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsList(Iterable)"})
  void testCombineValuesAsList_thenReturnValueSizeIsFour() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult2);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult3);
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult4);

    // Act
    ValueWithFailures<List<Object>> actualCombineValuesAsListResult =
        ValueWithFailures.combineValuesAsList(items);

    // Assert
    List<Object> value = actualCombineValuesAsListResult.getValue();
    assertEquals(4, value.size());
    assertEquals("Success Value", value.get(2));
    assertEquals("Success Value", value.get(3));
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsList(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Value is Failures.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsList(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsList(Iterable); when ArrayList(); then return Value is Failures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsList(Iterable)"})
  void testCombineValuesAsList_whenArrayList_thenReturnValueIsFailures() {
    // Arrange and Act
    ValueWithFailures<List<Object>> actualCombineValuesAsListResult =
        ValueWithFailures.combineValuesAsList(new ArrayList<>());

    // Assert
    assertFalse(actualCombineValuesAsListResult.hasFailures());
    ImmutableList<FailureItem> failures = actualCombineValuesAsListResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualCombineValuesAsListResult.getValue());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Set<Object>> ofResult2 = ValueWithFailures.of(objectSet, ofResult);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of(ofResult2, new ArrayList<>());
    items.add(ofResult3);
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult4);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(2, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet2() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of(ofResult2, new ArrayList<>());
    items.add(ofResult3);
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult4);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(2, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet3() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            1, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    ValueWithFailures<Set<Object>> ofResult =
        ValueWithFailures.of(objectSet, ofAutoStackTraceResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of(ofResult, new ArrayList<>());
    items.add(ofResult2);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult3);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(2, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet4() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Set<Object>> ofResult3 = ValueWithFailures.of(objectSet, ofResult, ofResult2);
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of(ofResult3, new ArrayList<>());
    items.add(ofResult4);
    ValueWithFailures<?> ofResult5 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult5);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(2, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of {@code 42} and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is five.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of '42' and ArrayList(); then return Value size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOf42AndArrayList_thenReturnValueSizeIsFive() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("42", new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of(42, new ArrayList<>());
    items.add(ofResult2);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of(1, new ArrayList<>());
    items.add(ofResult3);
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofResult4 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Set<Object>> ofResult5 = ValueWithFailures.of(objectSet, ofResult4);
    ValueWithFailures<?> ofResult6 = ValueWithFailures.of(ofResult5, new ArrayList<>());
    items.add(ofResult6);
    ValueWithFailures<?> ofResult7 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult7);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(5, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of {@code 42} and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is four.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of '42' and ArrayList(); then return Value size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOf42AndArrayList_thenReturnValueSizeIsFour() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("42", new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of(1, new ArrayList<>());
    items.add(ofResult2);
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Set<Object>> ofResult4 = ValueWithFailures.of(objectSet, ofResult3);
    ValueWithFailures<?> ofResult5 = ValueWithFailures.of(ofResult4, new ArrayList<>());
    items.add(ofResult5);
    ValueWithFailures<?> ofResult6 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult6);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(4, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of {@code 42} and {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()} add of {@code 42} and {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of '42' and ArrayList(); when ArrayList() add of '42' and ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOf42AndArrayList_whenArrayListAddOf42AndArrayList() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("42", new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult2);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(2, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of forty-two and {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable); given of forty-two and ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfFortyTwoAndArrayList() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of(42, new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult2);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(2, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of forty-two and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is four.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of forty-two and ArrayList(); then return Value size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfFortyTwoAndArrayList_thenReturnValueSizeIsFour() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of(42, new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of(1, new ArrayList<>());
    items.add(ofResult2);
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Set<Object>> ofResult4 = ValueWithFailures.of(objectSet, ofResult3);
    ValueWithFailures<?> ofResult5 = ValueWithFailures.of(ofResult4, new ArrayList<>());
    items.add(ofResult5);
    ValueWithFailures<?> ofResult6 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult6);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(4, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of ninety-six and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is six.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of ninety-six and ArrayList(); then return Value size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfNinetySixAndArrayList_thenReturnValueSizeIsSix() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of(96, new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("42", new ArrayList<>());
    items.add(ofResult2);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of(42, new ArrayList<>());
    items.add(ofResult3);
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of(1, new ArrayList<>());
    items.add(ofResult4);
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofResult5 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Set<Object>> ofResult6 = ValueWithFailures.of(objectSet, ofResult5);
    ValueWithFailures<?> ofResult7 = ValueWithFailures.of(ofResult6, new ArrayList<>());
    items.add(ofResult7);
    ValueWithFailures<?> ofResult8 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult8);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(6, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of of {@link HashSet#HashSet()} and {@link ArrayList#ArrayList()} and {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of of HashSet() and ArrayList() and ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfOfHashSetAndArrayListAndArrayList() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    HashSet<Object> objectSet = new HashSet<>();
    ValueWithFailures<Set<Object>> ofResult = ValueWithFailures.of(objectSet, new ArrayList<>());
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of(ofResult, new ArrayList<>());
    items.add(ofResult2);
    ValueWithFailures<?> ofResult3 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult3);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(2, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of of {@link HashSet#HashSet()} and {@link ArrayList#ArrayList()} and {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of of HashSet() and ArrayList() and ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfOfHashSetAndArrayListAndArrayList2() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    HashSet<Object> objectSet = new HashSet<>();
    ValueWithFailures<Set<Object>> ofResult = ValueWithFailures.of(objectSet, new ArrayList<>());
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of(ofResult, new ArrayList<>());
    items.add(ofResult2);
    HashSet<Object> objectSet2 = new HashSet<>();
    ValueWithFailures<Set<Object>> ofResult3 = ValueWithFailures.of(objectSet2, new ArrayList<>());
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of(ofResult3, new ArrayList<>());
    items.add(ofResult4);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(1, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of one and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is three.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of one and ArrayList(); then return Value size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfOneAndArrayList_thenReturnValueSizeIsThree() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of(1, new ArrayList<>());
    items.add(ofResult);
    HashSet<Object> objectSet = new HashSet<>();
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Set<Object>> ofResult3 = ValueWithFailures.of(objectSet, ofResult2);
    ValueWithFailures<?> ofResult4 = ValueWithFailures.of(ofResult3, new ArrayList<>());
    items.add(ofResult4);
    ValueWithFailures<?> ofResult5 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult5);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(3, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of {@code Success Value} and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of 'Success Value' and ArrayList(); then return Value size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfSuccessValueAndArrayList_thenReturnValueSizeIsOne() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(1, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Given of {@code Success Value} and {@link ArrayList#ArrayList()}.
   *   <li>Then return Value size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName(
      "Test combineValuesAsSet(Iterable); given of 'Success Value' and ArrayList(); then return Value size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_givenOfSuccessValueAndArrayList_thenReturnValueSizeIsOne2() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    ValueWithFailures<?> ofResult = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult);
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", new ArrayList<>());
    items.add(ofResult2);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    assertEquals(1, actualCombineValuesAsSetResult.getValue().size());
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable); then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_thenReturnFailuresSizeIsOne() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<?> ofResult2 = ValueWithFailures.of("Success Value", ofResult);
    items.add(ofResult2);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    ImmutableList<FailureItem> failures = actualCombineValuesAsSetResult.getFailures();
    assertEquals(1, failures.size());
    assertTrue(actualCombineValuesAsSetResult.hasFailures());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable); then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_thenReturnFailuresSizeIsTwo() {
    // Arrange
    ArrayList<ValueWithFailures<?>> items = new ArrayList<>();
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<?> ofResult3 = ValueWithFailures.of("Success Value", ofResult, ofResult2);
    items.add(ofResult3);

    // Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(items);

    // Assert
    ImmutableList<FailureItem> failures = actualCombineValuesAsSetResult.getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult2, failures.get(1));
  }

  /**
   * Test {@link ValueWithFailures#combineValuesAsSet(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Value Empty.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combineValuesAsSet(Iterable)}
   */
  @Test
  @DisplayName("Test combineValuesAsSet(Iterable); when ArrayList(); then return Value Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.combineValuesAsSet(Iterable)"})
  void testCombineValuesAsSet_whenArrayList_thenReturnValueEmpty() {
    // Arrange and Act
    ValueWithFailures<Set<Object>> actualCombineValuesAsSetResult =
        ValueWithFailures.combineValuesAsSet(new ArrayList<>());

    // Assert
    assertFalse(actualCombineValuesAsSetResult.hasFailures());
    assertTrue(actualCombineValuesAsSetResult.getFailures().isEmpty());
    assertTrue(actualCombineValuesAsSetResult.getValue().isEmpty());
  }

  /**
   * Test {@link ValueWithFailures#hasFailures()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#hasFailures()}
   */
  @Test
  @DisplayName("Test hasFailures(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueWithFailures.hasFailures()"})
  void testHasFailures_thenReturnTrue() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);

    // Act and Assert
    assertTrue(ofResult2.hasFailures());
  }

  /**
   * Test {@link ValueWithFailures#map(Function)}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function); then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.map(Function)"})
  void testMap_thenReturnFailuresSizeIsOne() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);

    Function<Object, Object> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    ValueWithFailures<Object> actualMapResult = ofResult2.map(function);

    // Assert
    verify(function).apply(isA(Object.class));
    ImmutableList<FailureItem> failures = actualMapResult.getFailures();
    assertEquals(1, failures.size());
    assertTrue(actualMapResult.hasFailures());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link ValueWithFailures#mapFailures(Function)}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#mapFailures(Function)}
   */
  @Test
  @DisplayName("Test mapFailures(Function); then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.mapFailures(Function)"})
  void testMapFailures_thenReturnFailuresSizeIsTwo() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Object> ofResult3 =
        ValueWithFailures.of("Success Value", ofResult, ofResult2);

    Function<FailureItem, FailureItem> function = mock(Function.class);
    FailureItem ofResult4 =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    when(function.apply(Mockito.<FailureItem>any())).thenReturn(ofResult4);

    // Act
    ValueWithFailures<Object> actualMapFailuresResult = ofResult3.mapFailures(function);

    // Assert
    verify(function, atLeast(1)).apply(isA(FailureItem.class));
    ImmutableList<FailureItem> failures = actualMapFailuresResult.getFailures();
    assertEquals(2, failures.size());
    assertTrue(actualMapFailuresResult.hasFailures());
    assertSame(ofResult4, failures.get(0));
    assertSame(ofResult4, failures.get(1));
  }

  /**
   * Test {@link ValueWithFailures#flatMap(Function)}.
   *
   * <ul>
   *   <li>Then return Failures size is five.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#flatMap(Function)}
   */
  @Test
  @DisplayName("Test flatMap(Function); then return Failures size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.flatMap(Function)"})
  void testFlatMap_thenReturnFailuresSizeIsFive() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult2 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Object> ofResult4 =
        ValueWithFailures.of("Success Value", ofResult, ofResult2, ofResult3);

    Function<Object, ValueWithFailures<Object>> function = mock(Function.class);
    FailureItem ofResult5 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    FailureItem ofResult6 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");

    ValueWithFailures<Object> ofResult7 =
        ValueWithFailures.of("Success Value", ofResult5, ofResult6);
    when(function.apply(Mockito.<Object>any())).thenReturn(ofResult7);

    // Act
    ValueWithFailures<Object> actualFlatMapResult = ofResult4.flatMap(function);

    // Assert
    verify(function).apply(isA(Object.class));
    ImmutableList<FailureItem> failures = actualFlatMapResult.getFailures();
    assertEquals(5, failures.size());
    assertSame(ofResult6, failures.get(4));
  }

  /**
   * Test {@link ValueWithFailures#flatMap(Function)}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#flatMap(Function)}
   */
  @Test
  @DisplayName("Test flatMap(Function); then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.flatMap(Function)"})
  void testFlatMap_thenReturnFailuresSizeIsTwo() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);

    Function<Object, ValueWithFailures<Object>> function = mock(Function.class);
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult4 = ValueWithFailures.of("Success Value", ofResult3);
    when(function.apply(Mockito.<Object>any())).thenReturn(ofResult4);

    // Act
    ValueWithFailures<Object> actualFlatMapResult = ofResult2.flatMap(function);

    // Assert
    verify(function).apply(isA(Object.class));
    ImmutableList<FailureItem> failures = actualFlatMapResult.getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult3, failures.get(1));
  }

  /**
   * Test {@link ValueWithFailures#combinedWith(ValueWithFailures, BiFunction)}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#combinedWith(ValueWithFailures, BiFunction)}
   */
  @Test
  @DisplayName("Test combinedWith(ValueWithFailures, BiFunction); then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueWithFailures ValueWithFailures.combinedWith(ValueWithFailures, BiFunction)"
  })
  void testCombinedWith_thenReturnFailuresSizeIsTwo() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> other = ValueWithFailures.of("Success Value", ofResult3);

    BiFunction<Object, Object, Object> combiner = mock(BiFunction.class);
    when(combiner.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    ValueWithFailures<Object> actualCombinedWithResult = ofResult2.combinedWith(other, combiner);

    // Assert
    verify(combiner).apply(isA(Object.class), isA(Object.class));
    ImmutableList<FailureItem> failures = actualCombinedWithResult.getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult3, failures.get(1));
  }

  /**
   * Test {@link ValueWithFailures#withValue(Object, List)} with {@code value}, {@code
   * additionalFailures}.
   *
   * <p>Method under test: {@link ValueWithFailures#withValue(Object, List)}
   */
  @Test
  @DisplayName("Test withValue(Object, List) with 'value', 'additionalFailures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.withValue(Object, List)"})
  void testWithValueWithValueAdditionalFailures() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);

    // Act and Assert
    ImmutableList<FailureItem> failures =
        ofResult2.withValue("Value", new ArrayList<>()).getFailures();
    assertEquals(1, failures.size());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link ValueWithFailures#withValue(Object, List)} with {@code value}, {@code
   * additionalFailures}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#withValue(Object, List)}
   */
  @Test
  @DisplayName(
      "Test withValue(Object, List) with 'value', 'additionalFailures'; when ArrayList(); then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.withValue(Object, List)"})
  void testWithValueWithValueAdditionalFailures_whenArrayList_thenReturnValue() {
    // Arrange
    ArrayList<FailureItem> failures = new ArrayList<>();
    ValueWithFailures<Object> ofResult =
        ValueWithFailures.of("Success Value", (Collection<FailureItem>) failures);

    // Act
    ValueWithFailures<Object> actualWithValueResult =
        ofResult.withValue("Value", new ArrayList<>());

    // Assert
    assertEquals("Value", actualWithValueResult.getValue());
    assertFalse(actualWithValueResult.hasFailures());
    assertEquals(failures, actualWithValueResult.getFailures());
  }

  /**
   * Test {@link ValueWithFailures#withValue(ValueWithFailures)} with {@code valueWithFailures}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#withValue(ValueWithFailures)}
   */
  @Test
  @DisplayName(
      "Test withValue(ValueWithFailures) with 'valueWithFailures'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.withValue(ValueWithFailures)"})
  void testWithValueWithValueWithFailures_thenReturnFailuresSizeIsTwo() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);
    FailureItem ofResult3 =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> valueWithFailures = ValueWithFailures.of("Success Value", ofResult3);

    // Act and Assert
    ImmutableList<FailureItem> failures = ofResult2.withValue(valueWithFailures).getFailures();
    assertEquals(2, failures.size());
    assertSame(ofResult3, failures.get(1));
  }

  /**
   * Test {@link ValueWithFailures#withValue(Object)} with {@code value}.
   *
   * <ul>
   *   <li>Then return Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueWithFailures#withValue(Object)}
   */
  @Test
  @DisplayName("Test withValue(Object) with 'value'; then return Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.withValue(Object)"})
  void testWithValueWithValue_thenReturnFailuresSizeIsOne() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);

    // Act
    ValueWithFailures<Object> actualWithValueResult = ofResult2.withValue("Value");

    // Assert
    ImmutableList<FailureItem> failures = actualWithValueResult.getFailures();
    assertEquals(1, failures.size());
    assertTrue(actualWithValueResult.hasFailures());
    assertSame(ofResult, failures.get(0));
  }

  /**
   * Test {@link ValueWithFailures#withAdditionalFailures(List)}.
   *
   * <p>Method under test: {@link ValueWithFailures#withAdditionalFailures(List)}
   */
  @Test
  @DisplayName("Test withAdditionalFailures(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures ValueWithFailures.withAdditionalFailures(List)"})
  void testWithAdditionalFailures() {
    // Arrange
    FailureItem ofResult =
        FailureItem.of(
            FailureReason.MULTIPLE, new Throwable(), FailureAttributeKeys.VALUE, "Message Args");
    ValueWithFailures<Object> ofResult2 = ValueWithFailures.of("Success Value", ofResult);

    // Act
    ValueWithFailures<Object> actualWithAdditionalFailuresResult =
        ofResult2.withAdditionalFailures(new ArrayList<>());

    // Assert
    assertEquals(ofResult2, actualWithAdditionalFailuresResult);
  }

  /**
   * Test {@link ValueWithFailures#meta()}.
   *
   * <p>Method under test: {@link ValueWithFailures#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueWithFailures.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ValueWithFailures.meta();

    // Assert
    MetaProperty<ImmutableList<FailureItem>> failuresResult = actualMetaResult.failures();
    assertTrue(failuresResult instanceof DirectMetaProperty);
    MetaProperty valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("failures", failuresResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, failuresResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, failuresResult.propertyType());
    Class<ValueWithFailures> expectedDeclaringTypeResult = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult, failuresResult.declaringType());
    Class<ValueWithFailures> expectedDeclaringTypeResult2 = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, valueResult.name());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, failuresResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link ValueWithFailures#metaValueWithFailures(Class)}.
   *
   * <p>Method under test: {@link ValueWithFailures#metaValueWithFailures(Class)}
   */
  @Test
  @DisplayName("Test metaValueWithFailures(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueWithFailures.metaValueWithFailures(Class)"})
  void testMetaValueWithFailures() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaValueWithFailuresResult = ValueWithFailures.metaValueWithFailures(cls);

    // Assert
    MetaProperty<ImmutableList<FailureItem>> failuresResult =
        actualMetaValueWithFailuresResult.failures();
    assertTrue(failuresResult instanceof DirectMetaProperty);
    MetaProperty<Object> valueResult = actualMetaValueWithFailuresResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("failures", failuresResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, failuresResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaValueWithFailuresResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, failuresResult.propertyType());
    Class<ValueWithFailures> expectedDeclaringTypeResult = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult, failuresResult.declaringType());
    Class<ValueWithFailures> expectedDeclaringTypeResult2 = ValueWithFailures.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult2 = Object.class;
    assertEquals(expectedPropertyTypeResult2, valueResult.propertyType());
    assertEquals(FailureAttributeKeys.VALUE, valueResult.name());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, failuresResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }
}
