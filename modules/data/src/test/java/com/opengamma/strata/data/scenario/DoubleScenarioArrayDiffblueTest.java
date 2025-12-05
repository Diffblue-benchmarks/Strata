package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.data.scenario.DoubleScenarioArray.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleScenarioArrayDiffblueTest {
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
    Class<? extends DoubleScenarioArray> actualBeanTypeResult =
        DoubleScenarioArray.meta().beanType();

    // Assert
    Class<DoubleScenarioArray> expectedBeanTypeResult = DoubleScenarioArray.class;
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
    // Arrange, Act and Assert
    assertNull(DoubleScenarioArray.meta().metaPropertyGet("Property Name"));
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
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DoubleScenarioArray.meta().metaPropertyGet("values");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<DoubleScenarioArray> expectedDeclaringTypeResult = DoubleScenarioArray.class;
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
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        DoubleScenarioArray.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("values");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("values", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<DoubleScenarioArray> expectedDeclaringTypeResult = DoubleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then {@link DoubleScenarioArray} with values is {@link DoubleArray} Values is {@link
   *       DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then DoubleScenarioArray with values is DoubleArray Values is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenDoubleScenarioArrayWithValuesIsDoubleArrayValuesIsEmpty() {
    // Arrange
    Meta metaResult = DoubleScenarioArray.meta();
    DoubleScenarioArray bean = DoubleScenarioArray.of(DoubleArray.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "values", true);

    // Assert
    DoubleArray doubleArray = ((DoubleArray) actualPropertyGetResult).EMPTY;
    assertSame(doubleArray, bean.getValues());
    assertSame(doubleArray, actualPropertyGetResult);
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
    assertNull(DoubleScenarioArray.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = DoubleScenarioArray.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                DoubleScenarioArray.of(DoubleArray.of()), "Property Name", false));
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
            DoubleScenarioArray.meta().propertySet(mock(Bean.class), "values", "New Value", false));
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
            DoubleScenarioArray.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DoubleScenarioArray.meta().propertySet(mock(Bean.class), "values", "New Value", true));
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
    assertTrue(DoubleScenarioArray.meta().values() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link DoubleScenarioArray#of(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#of(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(DoubleArray) with 'DoubleArray'; when DoubleArray; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleScenarioArray DoubleScenarioArray.of(DoubleArray)"})
  void testOfWithDoubleArray_whenDoubleArray_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    DoubleScenarioArray actualOfResult = DoubleScenarioArray.of(DoubleArray.of());

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    Stream<Double> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(DoubleArray.EMPTY, actualOfResult.getValues());
  }

  /**
   * Test {@link DoubleScenarioArray#of(int, IntToDoubleFunction)} with {@code int}, {@code
   * IntToDoubleFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return Values dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#of(int, IntToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntToDoubleFunction) with 'int', 'IntToDoubleFunction'; given ten; then return Values dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleScenarioArray DoubleScenarioArray.of(int, IntToDoubleFunction)"})
  void testOfWithIntIntToDoubleFunction_givenTen_thenReturnValuesDimensionsIsOne() {
    // Arrange
    IntToDoubleFunction valueFunction = mock(IntToDoubleFunction.class);
    when(valueFunction.applyAsDouble(anyInt())).thenReturn(10.0d);

    // Act
    DoubleScenarioArray actualOfResult = DoubleScenarioArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).applyAsDouble(anyInt());
    DoubleArray values = actualOfResult.getValues();
    assertEquals(1, values.dimensions());
    assertEquals(10.0d, values.max());
    assertEquals(10.0d, values.min());
    Stream<Double> streamResult = actualOfResult.stream();
    List<Double> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals(10.0d, collectResult.get(0).doubleValue());
    assertEquals(10.0d, collectResult.get(1).doubleValue());
    assertEquals(10.0d, collectResult.get(2).doubleValue());
    assertEquals(3, values.size());
    assertEquals(3, actualOfResult.getScenarioCount());
    assertEquals(3, values.toList().size());
    assertEquals(30.0d, values.sum());
    assertFalse(values.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 0.5}.
   *   <li>Then return Values min is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given '0.5'; when ArrayList() add '0.5'; then return Values min is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleScenarioArray DoubleScenarioArray.of(List)"})
  void testOfWithList_given05_whenArrayListAdd05_thenReturnValuesMinIs05() {
    // Arrange
    ArrayList<Double> values = new ArrayList<>();
    values.add(0.5d);
    values.add(10.0d);

    // Act
    DoubleScenarioArray actualOfResult = DoubleScenarioArray.of(values);

    // Assert
    DoubleArray values2 = actualOfResult.getValues();
    assertEquals(0.5d, values2.min());
    Stream<Double> streamResult = actualOfResult.stream();
    List<Double> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals(0.5d, collectResult.get(0).doubleValue());
    assertEquals(10.0d, collectResult.get(1).doubleValue());
    assertEquals(10.5d, values2.sum());
    assertEquals(2, values2.size());
    assertEquals(2, actualOfResult.getScenarioCount());
    assertArrayEquals(new double[] {0.5d, 10.0d}, values2.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link ArrayList#ArrayList()} add ten.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given ten; when ArrayList() add ten; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleScenarioArray DoubleScenarioArray.of(List)"})
  void testOfWithList_givenTen_whenArrayListAddTen_thenReturnValuesSizeIsOne() {
    // Arrange
    ArrayList<Double> values = new ArrayList<>();
    values.add(10.0d);

    // Act
    DoubleScenarioArray actualOfResult = DoubleScenarioArray.of(values);

    // Assert
    DoubleArray values2 = actualOfResult.getValues();
    assertEquals(1, values2.size());
    assertEquals(1, actualOfResult.getScenarioCount());
    Stream<Double> streamResult = actualOfResult.stream();
    List<Double> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals(10.0d, values2.min());
    assertEquals(10.0d, values2.sum());
    assertEquals(10.0d, collectResult.get(0).doubleValue());
    assertArrayEquals(new double[] {10.0d}, values2.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Values size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return Values size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleScenarioArray DoubleScenarioArray.of(List)"})
  void testOfWithList_whenArrayList_thenReturnValuesSizeIsZero() {
    // Arrange and Act
    DoubleScenarioArray actualOfResult = DoubleScenarioArray.of(new ArrayList<>());

    // Assert
    DoubleArray values = actualOfResult.getValues();
    assertEquals(0, values.size());
    assertEquals(0, actualOfResult.getScenarioCount());
    assertEquals(0.0d, values.sum());
    assertTrue(values.isEmpty());
    assertTrue(values.toList().isEmpty());
    Stream<Double> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertArrayEquals(new double[] {}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleScenarioArray#getScenarioCount()}.
   *
   * <p>Method under test: {@link DoubleScenarioArray#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleScenarioArray.getScenarioCount()"})
  void testGetScenarioCount() {
    // Arrange, Act and Assert
    assertEquals(0, DoubleScenarioArray.of(DoubleArray.of()).getScenarioCount());
  }

  /**
   * Test {@link DoubleScenarioArray#get(int)}.
   *
   * <ul>
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double DoubleScenarioArray.get(int)"})
  void testGet_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, DoubleScenarioArray.of(DoubleArray.filled(3)).get(1).doubleValue());
  }

  /**
   * Test {@link DoubleScenarioArray#stream()}.
   *
   * <p>Method under test: {@link DoubleScenarioArray#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream DoubleScenarioArray.stream()"})
  void testStream() {
    // Arrange and Act
    Stream<Double> actualStreamResult = DoubleScenarioArray.of(DoubleArray.of()).stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link DoubleScenarioArray#meta()}.
   *
   * <p>Method under test: {@link DoubleScenarioArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DoubleScenarioArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DoubleScenarioArray.meta();

    // Assert
    MetaProperty<DoubleArray> valuesResult = actualMetaResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, valuesResult.propertyType());
    Class<DoubleScenarioArray> expectedDeclaringTypeResult = DoubleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, valuesResult.declaringType());
    assertSame(Meta.INSTANCE, valuesResult.metaBean());
  }

  /**
   * Test {@link DoubleScenarioArray#metaBean()}.
   *
   * <p>Method under test: {@link DoubleScenarioArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DoubleScenarioArray.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, DoubleScenarioArray.of(DoubleArray.of()).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleScenarioArray#toString()}
   *   <li>{@link DoubleScenarioArray#getValues()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoubleScenarioArray.getValues()",
    "String DoubleScenarioArray.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DoubleScenarioArray ofResult = DoubleScenarioArray.of(DoubleArray.of());

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("DoubleScenarioArray{values=[]}", actualToStringResult);
    assertSame(DoubleArray.EMPTY, ofResult.getValues());
  }

  /**
   * Test {@link DoubleScenarioArray#equals(Object)}, and {@link DoubleScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleScenarioArray#equals(Object)}
   *   <li>{@link DoubleScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleScenarioArray.equals(Object)",
    "int DoubleScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleScenarioArray ofResult = DoubleScenarioArray.of(DoubleArray.of());
    DoubleScenarioArray ofResult2 = DoubleScenarioArray.of(DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DoubleScenarioArray#equals(Object)}, and {@link DoubleScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleScenarioArray#equals(Object)}
   *   <li>{@link DoubleScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleScenarioArray.equals(Object)",
    "int DoubleScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DoubleScenarioArray ofResult = DoubleScenarioArray.of(DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DoubleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleScenarioArray.equals(Object)",
    "int DoubleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IntToDoubleFunction valueFunction = mock(IntToDoubleFunction.class);
    when(valueFunction.applyAsDouble(anyInt())).thenReturn(10.0d);
    DoubleScenarioArray ofResult = DoubleScenarioArray.of(3, valueFunction);

    // Act and Assert
    assertNotEquals(ofResult, DoubleScenarioArray.of(DoubleArray.of()));
  }

  /**
   * Test {@link DoubleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleScenarioArray.equals(Object)",
    "int DoubleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DoubleScenarioArray.of(DoubleArray.of()), null);
  }

  /**
   * Test {@link DoubleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleScenarioArray.equals(Object)",
    "int DoubleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        DoubleScenarioArray.of(DoubleArray.of()), "Different type to DoubleScenarioArray");
  }
}
