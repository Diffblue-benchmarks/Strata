package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.DefaultScenarioArray.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultScenarioArrayDiffblueTest {
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
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act
    Class<? extends DefaultScenarioArray<Object>> actualBeanTypeResult =
        metaDefaultScenarioArrayResult.beanType();

    // Assert
    Class<DefaultScenarioArray> expectedBeanTypeResult = DefaultScenarioArray.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act and Assert
    assertNull(metaDefaultScenarioArrayResult.metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'values'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValues_thenReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaDefaultScenarioArrayResult.metaPropertyGet("values");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<DefaultScenarioArray> expectedDeclaringTypeResult = DefaultScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaDefaultScenarioArrayResult.metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("values");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("values", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<DefaultScenarioArray> expectedDeclaringTypeResult = DefaultScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act and Assert
    assertNull(metaDefaultScenarioArrayResult.propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link DefaultScenarioArray} with values is {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when DefaultScenarioArray with values is ArrayList(); then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDefaultScenarioArrayWithValuesIsArrayList_thenReturnList() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);
    DefaultScenarioArray<Object> bean = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    Object actualPropertyGetResult =
        metaDefaultScenarioArrayResult.propertyGet(bean, "values", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
    Class<Object> cls = Object.class;
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);
    DefaultScenarioArray<Object> bean = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaDefaultScenarioArrayResult.propertyGet(bean, "Property Name", false));
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
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            metaDefaultScenarioArrayResult.propertySet(
                mock(Bean.class), "values", "New Value", false));
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
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaDefaultScenarioArrayResult.propertySet(
                mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'values'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValues_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaDefaultScenarioArrayResult.propertySet(
                mock(Bean.class), "values", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#values()}.
   *
   * <p>Method under test: {@link Meta#values()}
   */
  @Test
  @DisplayName("Test Meta values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.values()"})
  void testMetaValues() {
    // Arrange, Act and Assert
    assertTrue(DefaultScenarioArray.meta().values() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link DefaultScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When four.
   *   <li>Then return Values size is four.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when four; then return Values size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenFour_thenReturnValuesSizeIsFour() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of(4, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    ImmutableList<Object> values = actualOfResult.getValues();
    assertEquals(4, values.size());
    assertEquals("Apply", values.get(3));
    assertEquals(4, actualOfResult.getScenarioCount());
    Stream<Object> streamResult = actualOfResult.stream();
    assertEquals(4, streamResult.limit(5).collect(Collectors.toList()).size());
  }

  /**
   * Test {@link DefaultScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When one.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when one; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenOne_thenReturnValuesSizeIsOne() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of(1, valueFunction);

    // Assert
    verify(valueFunction).apply(0);
    ImmutableList<Object> values = actualOfResult.getValues();
    assertEquals(1, values.size());
    assertEquals("Apply", values.get(0));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Apply", collectResult.get(0));
    assertEquals(1, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link Double#SIZE}.
   *   <li>Then return Values size is {@link Double#SIZE}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when SIZE; then return Values size is SIZE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenSize_thenReturnValuesSizeIsSize() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    DefaultScenarioArray<Object> actualOfResult =
        DefaultScenarioArray.of(Double.SIZE, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    ImmutableList<Object> values = actualOfResult.getValues();
    assertEquals(Double.SIZE, values.size());
    assertEquals("Apply", values.get(61));
    assertEquals("Apply", values.get(62));
    assertEquals("Apply", values.get(63));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(5, collectResult.size());
    assertEquals("Apply", collectResult.get(4));
    assertEquals(Double.SIZE, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When three.
   *   <li>Then return Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when three; then return Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenThree_thenReturnValuesSizeIsThree() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    ImmutableList<Object> values = actualOfResult.getValues();
    assertEquals(3, values.size());
    assertEquals("Apply", values.get(1));
    assertEquals("Apply", values.get(2));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals("Apply", collectResult.get(1));
    assertEquals("Apply", collectResult.get(2));
    assertEquals(3, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> DefaultScenarioArray.of(3, valueFunction));
    verify(valueFunction).apply(0);
  }

  /**
   * Test {@link DefaultScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given '42'; then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(List)"})
  void testOfWithList_given42_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of(values);

    // Assert
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("42", collectResult.get(0));
    assertEquals(1, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given '42'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(List)"})
  void testOfWithList_given42_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();
    values.add("42");
    values.add("42");

    // Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of(values);

    // Assert
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals("42", collectResult.get(1));
    assertEquals(2, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(List)"})
  void testOfWithList_whenArrayList_thenReturnScenarioCountIsZero() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();

    // Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of(values);

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    Stream<Object> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link DefaultScenarioArray#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(Object[])}
   */
  @Test
  @DisplayName("Test of(Object[]) with 'Object[]'; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(Object[])"})
  void testOfWithObject_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of();

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    assertTrue(actualOfResult.getValues().isEmpty());
    Stream<Object> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link DefaultScenarioArray#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Values} and {@code Values}.
   *   <li>Then return Values size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(Object[])}
   */
  @Test
  @DisplayName(
      "Test of(Object[]) with 'Object[]'; when 'Values' and 'Values'; then return Values size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(Object[])"})
  void testOfWithObject_whenValuesAndValues_thenReturnValuesSizeIsTwo() {
    // Arrange and Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of("Values", "Values");

    // Assert
    ImmutableList<Object> values = actualOfResult.getValues();
    assertEquals(2, values.size());
    assertEquals("Values", values.get(1));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals("Values", collectResult.get(1));
    assertEquals(2, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Values}.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#of(Object[])}
   */
  @Test
  @DisplayName("Test of(Object[]) with 'Object[]'; when 'Values'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultScenarioArray DefaultScenarioArray.of(Object[])"})
  void testOfWithObject_whenValues_thenReturnValuesSizeIsOne() {
    // Arrange and Act
    DefaultScenarioArray<Object> actualOfResult = DefaultScenarioArray.of("Values");

    // Assert
    ImmutableList<Object> values = actualOfResult.getValues();
    assertEquals(1, values.size());
    assertEquals("Values", values.get(0));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Values", collectResult.get(0));
    assertEquals(1, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link DefaultScenarioArray} with {@code Values}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); given DefaultScenarioArray with 'Values'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultScenarioArray.getScenarioCount()"})
  void testGetScenarioCount_givenDefaultScenarioArrayWithValues_thenReturnOne() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of("Values");

    // Act and Assert
    assertEquals(1, ofResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DefaultScenarioArray.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertEquals(0, ofResult.getScenarioCount());
  }

  /**
   * Test {@link DefaultScenarioArray#get(int)}.
   *
   * <ul>
   *   <li>Given {@link DefaultScenarioArray} with {@code Values}.
   *   <li>When zero.
   *   <li>Then return {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given DefaultScenarioArray with 'Values'; when zero; then return 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultScenarioArray.get(int)"})
  void testGet_givenDefaultScenarioArrayWithValues_whenZero_thenReturnValues() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of("Values");

    // Act and Assert
    assertEquals("Values", ofResult.get(0));
  }

  /**
   * Test {@link DefaultScenarioArray#get(int)}.
   *
   * <ul>
   *   <li>Given {@link IntFunction} {@link IntFunction#apply(int)} return {@code Apply}.
   *   <li>When one.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given IntFunction apply(int) return 'Apply'; when one; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultScenarioArray.get(int)"})
  void testGet_givenIntFunctionApplyReturnApply_whenOne_thenReturnApply() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(3, valueFunction);

    // Act
    Object actualGetResult = ofResult.get(1);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals("Apply", actualGetResult);
  }

  /**
   * Test {@link DefaultScenarioArray#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream DefaultScenarioArray.stream()"})
  void testStream_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    Stream<Object> actualStreamResult = ofResult.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link DefaultScenarioArray#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream DefaultScenarioArray.stream()"})
  void testStream_thenReturnLimitFiveCollectToListSizeIsOne() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of("Values");

    // Act
    Stream<Object> actualStreamResult = ofResult.stream();

    // Assert
    List<Object> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Values", collectResult.get(0));
  }

  /**
   * Test {@link DefaultScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#convertedTo(Currency,
   * ScenarioFxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, ScenarioFxRateProvider); then return DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray DefaultScenarioArray.convertedTo(Currency, ScenarioFxRateProvider)"
  })
  void testConvertedTo_thenReturnDefaultScenarioArray() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    ScenarioArray<?> actualConvertedToResult =
        ofResult.convertedTo(
            null,
            new DefaultScenarioFxRateProvider(
                ImmutableScenarioMarketData.empty(), ObservableSource.NONE));

    // Assert
    assertTrue(actualConvertedToResult instanceof DefaultScenarioArray);
    assertEquals(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link DefaultScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#convertedTo(Currency,
   * ScenarioFxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, ScenarioFxRateProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray DefaultScenarioArray.convertedTo(Currency, ScenarioFxRateProvider)"
  })
  void testConvertedTo_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of("Values");

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ofResult.convertedTo(
                null,
                new DefaultScenarioFxRateProvider(
                    ImmutableScenarioMarketData.empty(), ObservableSource.NONE)));
  }

  /**
   * Test {@link DefaultScenarioArray#meta()}.
   *
   * <p>Method under test: {@link DefaultScenarioArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultScenarioArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DefaultScenarioArray.meta();

    // Assert
    MetaProperty<ImmutableList> valuesResult = actualMetaResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, valuesResult.propertyType());
    Class<DefaultScenarioArray> expectedDeclaringTypeResult = DefaultScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, valuesResult.declaringType());
    assertSame(Meta.INSTANCE, valuesResult.metaBean());
  }

  /**
   * Test {@link DefaultScenarioArray#metaDefaultScenarioArray(Class)}.
   *
   * <p>Method under test: {@link DefaultScenarioArray#metaDefaultScenarioArray(Class)}
   */
  @Test
  @DisplayName("Test metaDefaultScenarioArray(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultScenarioArray.metaDefaultScenarioArray(Class)"})
  void testMetaDefaultScenarioArray() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaDefaultScenarioArrayResult =
        DefaultScenarioArray.metaDefaultScenarioArray(cls);

    // Assert
    MetaProperty<ImmutableList<Object>> valuesResult =
        actualMetaDefaultScenarioArrayResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaDefaultScenarioArrayResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, valuesResult.propertyType());
    Class<DefaultScenarioArray> expectedDeclaringTypeResult = DefaultScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, valuesResult.declaringType());
    assertSame(Meta.INSTANCE, valuesResult.metaBean());
  }

  /**
   * Test {@link DefaultScenarioArray#metaBean()}.
   *
   * <p>Method under test: {@link DefaultScenarioArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultScenarioArray.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultScenarioArray#toString()}
   *   <li>{@link DefaultScenarioArray#getValues()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList DefaultScenarioArray.getValues()",
    "String DefaultScenarioArray.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DefaultScenarioArray{values=[]}", actualToStringResult);
    assertTrue(ofResult.getValues().isEmpty());
  }

  /**
   * Test {@link DefaultScenarioArray#equals(Object)}, and {@link DefaultScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultScenarioArray#equals(Object)}
   *   <li>{@link DefaultScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultScenarioArray.equals(Object)",
    "int DefaultScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());
    DefaultScenarioArray<Object> ofResult2 = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultScenarioArray#equals(Object)}, and {@link DefaultScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultScenarioArray#equals(Object)}
   *   <li>{@link DefaultScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultScenarioArray.equals(Object)",
    "int DefaultScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultScenarioArray.equals(Object)",
    "int DefaultScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of("Values");
    DefaultScenarioArray<Object> ofResult2 = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link DefaultScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultScenarioArray.equals(Object)",
    "int DefaultScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link DefaultScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultScenarioArray.equals(Object)",
    "int DefaultScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to DefaultScenarioArray");
  }
}
