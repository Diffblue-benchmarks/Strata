package com.opengamma.strata.collect.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix.Meta;
import com.opengamma.strata.collect.function.IntIntDoubleConsumer;
import com.opengamma.strata.collect.function.IntIntDoubleToDoubleFunction;
import com.opengamma.strata.collect.function.IntIntToDoubleFunction;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleMatrixDiffblueTest {
  /**
   * Test Meta {@link Meta#array()}.
   *
   * <p>Method under test: {@link Meta#array()}
   */
  @Test
  @DisplayName("Test Meta array()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.array()"})
  void testMetaArray() {
    // Arrange, Act and Assert
    assertTrue(DoubleMatrix.meta().array() instanceof DirectMetaProperty);
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
    Class<? extends DoubleMatrix> actualBeanTypeResult = DoubleMatrix.meta().beanType();

    // Assert
    Class<DoubleMatrix> expectedBeanTypeResult = DoubleMatrix.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code array}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'array'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenArray_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = DoubleMatrix.meta().metaPropertyGet("array");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("[[D", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("array", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<DoubleMatrix> expectedDeclaringTypeResult = DoubleMatrix.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    assertNull(DoubleMatrix.meta().metaPropertyGet("Property Name"));
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
        DoubleMatrix.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("array");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("[[D", getResult.propertyType().getName());
    assertEquals("array", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DoubleMatrix> expectedDeclaringTypeResult = DoubleMatrix.class;
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
    // Arrange, Act and Assert
    assertNull(DoubleMatrix.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix#EMPTY}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when EMPTY; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> DoubleMatrix.meta().propertyGet(DoubleMatrix.EMPTY, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertySet(Bean, String, Object, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            DoubleMatrix.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link DoubleMatrix#of()}.
   *
   * <p>Method under test: {@link DoubleMatrix#of()}
   */
  @Test
  @DisplayName("Test of()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of()"})
  void testOf() {
    // Arrange and Act
    DoubleMatrix actualOfResult = DoubleMatrix.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0, actualOfResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfResult.total());
    assertEquals(2, actualOfResult.dimensions());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)} with {@code rows}, {@code
   * columns}, {@code valueFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, IntIntToDoubleFunction) with 'rows', 'columns', 'valueFunction'; given ten; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, IntIntToDoubleFunction)"})
  void testOfWithRowsColumnsValueFunction_givenTen_thenReturnSizeIsOne() {
    // Arrange
    IntIntToDoubleFunction valueFunction = mock(IntIntToDoubleFunction.class);
    when(valueFunction.applyAsDouble(anyInt(), anyInt())).thenReturn(10.0d);

    // Act
    DoubleMatrix actualOfResult = DoubleMatrix.of(1, 1, valueFunction);

    // Assert
    verify(valueFunction).applyAsDouble(0, 0);
    assertEquals(1, actualOfResult.size());
    double[][] toArrayUnsafeResult = actualOfResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(10.0d, actualOfResult.total());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)} with {@code rows}, {@code
   * columns}, {@code valueFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, IntIntToDoubleFunction) with 'rows', 'columns', 'valueFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, IntIntToDoubleFunction)"})
  void testOfWithRowsColumnsValueFunction_thenThrowIllegalArgumentException() {
    // Arrange
    IntIntToDoubleFunction valueFunction = mock(IntIntToDoubleFunction.class);
    when(valueFunction.applyAsDouble(anyInt(), anyInt())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> DoubleMatrix.of(1, 1, valueFunction));
    verify(valueFunction).applyAsDouble(0, 0);
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)} with {@code rows}, {@code
   * columns}, {@code valueFunction}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, IntIntToDoubleFunction) with 'rows', 'columns', 'valueFunction'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, IntIntToDoubleFunction)"})
  void testOfWithRowsColumnsValueFunction_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualOfResult = DoubleMatrix.of(0, 0, mock(IntIntToDoubleFunction.class));

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0, actualOfResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfResult.total());
    assertTrue(actualOfResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)} with {@code rows}, {@code
   * columns}, {@code valueFunction}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, IntIntToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, IntIntToDoubleFunction) with 'rows', 'columns', 'valueFunction'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, IntIntToDoubleFunction)"})
  void testOfWithRowsColumnsValueFunction_whenZero_thenReturnSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix actualOfResult = DoubleMatrix.of(1, 0, mock(IntIntToDoubleFunction.class));

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0, actualOfResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfResult.total());
    assertTrue(actualOfResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, double[])} with {@code rows}, {@code columns}, {@code
   * values}.
   *
   * <ul>
   *   <li>When ten and two.
   *   <li>Then return total is twenty-four.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, double[])}
   */
  @Test
  @DisplayName(
      "Test of(int, int, double[]) with 'rows', 'columns', 'values'; when ten and two; then return total is twenty-four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, double[])"})
  void testOfWithRowsColumnsValues_whenTenAndTwo_thenReturnTotalIsTwentyFour() {
    // Arrange and Act
    DoubleMatrix actualOfResult = DoubleMatrix.of(4, 1, 10.0d, 2.0d, 10.0d, 2.0d);

    // Assert
    assertEquals(24.0d, actualOfResult.total());
    assertEquals(4, actualOfResult.size());
    double[][] toArrayUnsafeResult = actualOfResult.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertFalse(actualOfResult.isEmpty());
    assertFalse(actualOfResult.isSquare());
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {2.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {2.0d}, toArrayUnsafeResult[3], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, double[])} with {@code rows}, {@code columns}, {@code
   * values}.
   *
   * <ul>
   *   <li>When ten and two.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, double[])}
   */
  @Test
  @DisplayName(
      "Test of(int, int, double[]) with 'rows', 'columns', 'values'; when ten and two; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, double[])"})
  void testOfWithRowsColumnsValues_whenTenAndTwo_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> DoubleMatrix.of(1, 1, 10.0d, 2.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, double[])} with {@code rows}, {@code columns}, {@code
   * values}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, double[])}
   */
  @Test
  @DisplayName(
      "Test of(int, int, double[]) with 'rows', 'columns', 'values'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, double[])"})
  void testOfWithRowsColumnsValues_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualOfResult = DoubleMatrix.of(0, 1);

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0, actualOfResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfResult.total());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#of(int, int, double[])} with {@code rows}, {@code columns}, {@code
   * values}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#of(int, int, double[])}
   */
  @Test
  @DisplayName(
      "Test of(int, int, double[]) with 'rows', 'columns', 'values'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.of(int, int, double[])"})
  void testOfWithRowsColumnsValues_whenZero_thenReturnSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix actualOfResult = DoubleMatrix.of(4, 0);

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0, actualOfResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfResult.total());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#ofArrays(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>Given array of {@code double} with ten and {@code 0.5}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrays(int, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test ofArrays(int, int, IntFunction); given array of double with ten and '0.5'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrays(int, int, IntFunction)"})
  void testOfArrays_givenArrayOfDoubleWithTenAnd05_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<double[]> valuesFunction = mock(IntFunction.class);
    when(valuesFunction.apply(anyInt())).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> DoubleMatrix.ofArrays(1, 1, valuesFunction));
    verify(valuesFunction).apply(0);
  }

  /**
   * Test {@link DoubleMatrix#ofArrays(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>Given array of {@code double} with ten and {@code 0.5}.
   *   <li>When four.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrays(int, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test ofArrays(int, int, IntFunction); given array of double with ten and '0.5'; when four; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrays(int, int, IntFunction)"})
  void testOfArrays_givenArrayOfDoubleWithTenAnd05_whenFour_thenReturnArrayLengthIsOne() {
    // Arrange
    IntFunction<double[]> valuesFunction = mock(IntFunction.class);
    when(valuesFunction.apply(anyInt())).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    DoubleMatrix actualOfArraysResult = DoubleMatrix.ofArrays(1, 4, valuesFunction);

    // Assert
    verify(valuesFunction).apply(0);
    double[][] toArrayUnsafeResult = actualOfArraysResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(21.0d, actualOfArraysResult.total());
    assertEquals(4, actualOfArraysResult.size());
    assertFalse(actualOfArraysResult.isEmpty());
    assertFalse(actualOfArraysResult.isSquare());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#ofArrays(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrays(int, int, IntFunction)}
   */
  @Test
  @DisplayName("Test ofArrays(int, int, IntFunction); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrays(int, int, IntFunction)"})
  void testOfArrays_givenIllegalArgumentException() {
    // Arrange
    IntFunction<double[]> valuesFunction = mock(IntFunction.class);
    when(valuesFunction.apply(anyInt())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> DoubleMatrix.ofArrays(1, 1, valuesFunction));
    verify(valuesFunction).apply(0);
  }

  /**
   * Test {@link DoubleMatrix#ofArrays(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrays(int, int, IntFunction)}
   */
  @Test
  @DisplayName("Test ofArrays(int, int, IntFunction); when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrays(int, int, IntFunction)"})
  void testOfArrays_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualOfArraysResult = DoubleMatrix.ofArrays(0, 1, mock(IntFunction.class));

    // Assert
    assertEquals(0, actualOfArraysResult.size());
    assertEquals(0, actualOfArraysResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfArraysResult.total());
    assertTrue(actualOfArraysResult.isEmpty());
    assertTrue(actualOfArraysResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#ofArrays(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrays(int, int, IntFunction)}
   */
  @Test
  @DisplayName("Test ofArrays(int, int, IntFunction); when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrays(int, int, IntFunction)"})
  void testOfArrays_whenZero_thenReturnSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix actualOfArraysResult = DoubleMatrix.ofArrays(1, 0, mock(IntFunction.class));

    // Assert
    assertEquals(0, actualOfArraysResult.size());
    assertEquals(0, actualOfArraysResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfArraysResult.total());
    assertTrue(actualOfArraysResult.isEmpty());
    assertTrue(actualOfArraysResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test ofArrayObjects(int, int, IntFunction); given DoubleArray with value is ten; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrayObjects(int, int, IntFunction)"})
  void testOfArrayObjects_givenDoubleArrayWithValueIsTen_thenReturnSizeIsOne() {
    // Arrange
    IntFunction<DoubleArray> valuesFunction = mock(IntFunction.class);
    when(valuesFunction.apply(anyInt())).thenReturn(DoubleArray.of(10.0d));

    // Act
    DoubleMatrix actualOfArrayObjectsResult = DoubleMatrix.ofArrayObjects(1, 1, valuesFunction);

    // Assert
    verify(valuesFunction).apply(0);
    assertEquals(1, actualOfArrayObjectsResult.size());
    double[][] toArrayUnsafeResult = actualOfArrayObjectsResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(10.0d, actualOfArrayObjectsResult.total());
    assertFalse(actualOfArrayObjectsResult.isEmpty());
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test ofArrayObjects(int, int, IntFunction); given EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrayObjects(int, int, IntFunction)"})
  void testOfArrayObjects_givenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<DoubleArray> valuesFunction = mock(IntFunction.class);
    when(valuesFunction.apply(anyInt())).thenReturn(DoubleArray.EMPTY);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> DoubleMatrix.ofArrayObjects(1, 1, valuesFunction));
    verify(valuesFunction).apply(0);
  }

  /**
   * Test {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}
   */
  @Test
  @DisplayName("Test ofArrayObjects(int, int, IntFunction); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrayObjects(int, int, IntFunction)"})
  void testOfArrayObjects_givenIllegalArgumentException() {
    // Arrange
    IntFunction<DoubleArray> valuesFunction = mock(IntFunction.class);
    when(valuesFunction.apply(anyInt())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> DoubleMatrix.ofArrayObjects(1, 1, valuesFunction));
    verify(valuesFunction).apply(0);
  }

  /**
   * Test {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}
   */
  @Test
  @DisplayName("Test ofArrayObjects(int, int, IntFunction); when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrayObjects(int, int, IntFunction)"})
  void testOfArrayObjects_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualOfArrayObjectsResult =
        DoubleMatrix.ofArrayObjects(0, 1, mock(IntFunction.class));

    // Assert
    assertEquals(0, actualOfArrayObjectsResult.size());
    assertEquals(0, actualOfArrayObjectsResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfArrayObjectsResult.total());
    assertTrue(actualOfArrayObjectsResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofArrayObjects(int, int, IntFunction)}
   */
  @Test
  @DisplayName("Test ofArrayObjects(int, int, IntFunction); when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofArrayObjects(int, int, IntFunction)"})
  void testOfArrayObjects_whenZero_thenReturnSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix actualOfArrayObjectsResult =
        DoubleMatrix.ofArrayObjects(1, 0, mock(IntFunction.class));

    // Assert
    assertEquals(0, actualOfArrayObjectsResult.size());
    assertEquals(0, actualOfArrayObjectsResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfArrayObjectsResult.total());
    assertTrue(actualOfArrayObjectsResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#ofUnsafe(double[][])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and two.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofUnsafe(double[][])}
   */
  @Test
  @DisplayName(
      "Test ofUnsafe(double[][]); when array of double with ten and two; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofUnsafe(double[][])"})
  void testOfUnsafe_whenArrayOfDoubleWithTenAndTwo_thenReturnArrayLengthIsOne() {
    // Arrange
    double[][] array = new double[][] {new double[] {10.0d, 2.0d, 10.0d, 2.0d}};

    // Act
    DoubleMatrix actualOfUnsafeResult = DoubleMatrix.ofUnsafe(array);

    // Assert
    double[][] toArrayUnsafeResult = actualOfUnsafeResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(24.0d, actualOfUnsafeResult.total());
    assertEquals(4, actualOfUnsafeResult.size());
    assertFalse(actualOfUnsafeResult.isEmpty());
    assertFalse(actualOfUnsafeResult.isSquare());
    assertSame(array, toArrayUnsafeResult);
    assertArrayEquals(new double[] {10.0d, 2.0d, 10.0d, 2.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#ofUnsafe(double[][])}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofUnsafe(double[][])}
   */
  @Test
  @DisplayName("Test ofUnsafe(double[][]); when empty 2D array of double; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofUnsafe(double[][])"})
  void testOfUnsafe_whenEmpty2dArrayOfDouble_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualOfUnsafeResult = DoubleMatrix.ofUnsafe(new double[][] {});

    // Assert
    assertEquals(0, actualOfUnsafeResult.size());
    assertEquals(0, actualOfUnsafeResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfUnsafeResult.total());
    assertTrue(actualOfUnsafeResult.isEmpty());
    assertTrue(actualOfUnsafeResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#ofUnsafe(double[][])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#ofUnsafe(double[][])}
   */
  @Test
  @DisplayName("Test ofUnsafe(double[][]); when empty array of double; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.ofUnsafe(double[][])"})
  void testOfUnsafe_whenEmptyArrayOfDouble_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualOfUnsafeResult = DoubleMatrix.ofUnsafe(new double[][] {new double[] {}});

    // Assert
    assertEquals(0, actualOfUnsafeResult.size());
    assertEquals(0, actualOfUnsafeResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualOfUnsafeResult.total());
    assertTrue(actualOfUnsafeResult.isEmpty());
    assertTrue(actualOfUnsafeResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#copyOf(double[][])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and two.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#copyOf(double[][])}
   */
  @Test
  @DisplayName(
      "Test copyOf(double[][]); when array of double with ten and two; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.copyOf(double[][])"})
  void testCopyOf_whenArrayOfDoubleWithTenAndTwo_thenReturnArrayLengthIsOne() {
    // Arrange and Act
    DoubleMatrix actualCopyOfResult =
        DoubleMatrix.copyOf(new double[][] {new double[] {10.0d, 2.0d, 10.0d, 2.0d}});

    // Assert
    double[][] toArrayUnsafeResult = actualCopyOfResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(24.0d, actualCopyOfResult.total());
    assertEquals(4, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertFalse(actualCopyOfResult.isSquare());
    assertArrayEquals(new double[] {10.0d, 2.0d, 10.0d, 2.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#copyOf(double[][])}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#copyOf(double[][])}
   */
  @Test
  @DisplayName("Test copyOf(double[][]); when empty 2D array of double; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.copyOf(double[][])"})
  void testCopyOf_whenEmpty2dArrayOfDouble_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualCopyOfResult = DoubleMatrix.copyOf(new double[][] {});

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0, actualCopyOfResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualCopyOfResult.total());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#copyOf(double[][])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#copyOf(double[][])}
   */
  @Test
  @DisplayName("Test copyOf(double[][]); when empty array of double; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.copyOf(double[][])"})
  void testCopyOf_whenEmptyArrayOfDouble_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualCopyOfResult = DoubleMatrix.copyOf(new double[][] {new double[] {}});

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0, actualCopyOfResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualCopyOfResult.total());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#filled(int, int, double)} with {@code rows}, {@code columns}, {@code
   * value}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#filled(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test filled(int, int, double) with 'rows', 'columns', 'value'; when one; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.filled(int, int, double)"})
  void testFilledWithRowsColumnsValue_whenOne_thenReturnSizeIsOne() {
    // Arrange and Act
    DoubleMatrix actualFilledResult = DoubleMatrix.filled(1, 1, 10.0d);

    // Assert
    assertEquals(1, actualFilledResult.size());
    double[][] toArrayUnsafeResult = actualFilledResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(10.0d, actualFilledResult.total());
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#filled(int, int, double)} with {@code rows}, {@code columns}, {@code
   * value}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#filled(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test filled(int, int, double) with 'rows', 'columns', 'value'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.filled(int, int, double)"})
  void testFilledWithRowsColumnsValue_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualFilledResult = DoubleMatrix.filled(0, 0, 10.0d);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertEquals(0, actualFilledResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualFilledResult.total());
    assertTrue(actualFilledResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#filled(int, int, double)} with {@code rows}, {@code columns}, {@code
   * value}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#filled(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test filled(int, int, double) with 'rows', 'columns', 'value'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.filled(int, int, double)"})
  void testFilledWithRowsColumnsValue_whenZero_thenReturnSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix actualFilledResult = DoubleMatrix.filled(1, 0, 10.0d);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertEquals(0, actualFilledResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualFilledResult.total());
    assertTrue(actualFilledResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#filled(int, int)} with {@code rows}, {@code columns}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#filled(int, int)}
   */
  @Test
  @DisplayName("Test filled(int, int) with 'rows', 'columns'; when one; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.filled(int, int)"})
  void testFilledWithRowsColumns_whenOne_thenReturnSizeIsOne() {
    // Arrange and Act
    DoubleMatrix actualFilledResult = DoubleMatrix.filled(1, 1);

    // Assert
    assertEquals(1, actualFilledResult.size());
    double[][] toArrayUnsafeResult = actualFilledResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#filled(int, int)} with {@code rows}, {@code columns}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#filled(int, int)}
   */
  @Test
  @DisplayName("Test filled(int, int) with 'rows', 'columns'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.filled(int, int)"})
  void testFilledWithRowsColumns_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualFilledResult = DoubleMatrix.filled(0, 0);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertEquals(0, actualFilledResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualFilledResult.total());
    assertEquals(2, actualFilledResult.dimensions());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#filled(int, int)} with {@code rows}, {@code columns}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#filled(int, int)}
   */
  @Test
  @DisplayName("Test filled(int, int) with 'rows', 'columns'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.filled(int, int)"})
  void testFilledWithRowsColumns_whenZero_thenReturnSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix actualFilledResult = DoubleMatrix.filled(1, 0);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertEquals(0, actualFilledResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualFilledResult.total());
    assertEquals(2, actualFilledResult.dimensions());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#identity(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#identity(int)}
   */
  @Test
  @DisplayName("Test identity(int); when three; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.identity(int)"})
  void testIdentity_whenThree_thenReturnArrayLengthIsThree() {
    // Arrange and Act
    DoubleMatrix actualIdentityResult = DoubleMatrix.identity(3);

    // Assert
    double[][] toArrayUnsafeResult = actualIdentityResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0d, actualIdentityResult.total());
    assertEquals(9, actualIdentityResult.size());
    assertFalse(actualIdentityResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#identity(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#identity(int)}
   */
  @Test
  @DisplayName("Test identity(int); when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.identity(int)"})
  void testIdentity_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualIdentityResult = DoubleMatrix.identity(0);

    // Assert
    assertEquals(0, actualIdentityResult.size());
    assertEquals(0, actualIdentityResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualIdentityResult.total());
    assertTrue(actualIdentityResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#diagonal(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#diagonal(DoubleArray)}
   */
  @Test
  @DisplayName("Test diagonal(DoubleArray); when EMPTY; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.diagonal(DoubleArray)"})
  void testDiagonal_whenEmpty_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualDiagonalResult = DoubleMatrix.diagonal(DoubleArray.EMPTY);

    // Assert
    assertEquals(0, actualDiagonalResult.size());
    assertEquals(0, actualDiagonalResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualDiagonalResult.total());
    assertEquals(2, actualDiagonalResult.dimensions());
    assertTrue(actualDiagonalResult.isEmpty());
    assertTrue(actualDiagonalResult.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#diagonal(DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#diagonal(DoubleArray)}
   */
  @Test
  @DisplayName("Test diagonal(DoubleArray); when filled three; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.diagonal(DoubleArray)"})
  void testDiagonal_whenFilledThree_thenReturnArrayLengthIsThree() {
    // Arrange and Act
    DoubleMatrix actualDiagonalResult = DoubleMatrix.diagonal(DoubleArray.filled(3));

    // Assert
    double[][] toArrayUnsafeResult = actualDiagonalResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualDiagonalResult.size());
    assertFalse(actualDiagonalResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#DoubleMatrix(double[][], int, int)}.
   *
   * <p>Method under test: {@link DoubleMatrix#DoubleMatrix(double[][], int, int)}
   */
  @Test
  @DisplayName("Test new DoubleMatrix(double[][], int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleMatrix.<init>(double[][], int, int)"})
  void testNewDoubleMatrix() {
    // Arrange
    double[][] data = new double[][] {new double[] {10.0d, 2.0d, 10.0d, 2.0d}};

    // Act
    DoubleMatrix actualDoubleMatrix = new DoubleMatrix(data, 1, 1);

    // Assert
    assertEquals(1, actualDoubleMatrix.size());
    double[][] toArrayUnsafeResult = actualDoubleMatrix.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(10.0d, actualDoubleMatrix.total());
    assertEquals(2, actualDoubleMatrix.dimensions());
    assertFalse(actualDoubleMatrix.isEmpty());
    assertTrue(actualDoubleMatrix.isSquare());
    assertSame(data, toArrayUnsafeResult);
    assertArrayEquals(new double[] {10.0d, 2.0d, 10.0d, 2.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#dimensions()}.
   *
   * <p>Method under test: {@link DoubleMatrix#dimensions()}
   */
  @Test
  @DisplayName("Test dimensions()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleMatrix.dimensions()"})
  void testDimensions() {
    // Arrange, Act and Assert
    assertEquals(2, DoubleMatrix.EMPTY.dimensions());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleMatrix#size()}
   *   <li>{@link DoubleMatrix#toArrayUnsafe()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleMatrix.size()", "double[][] DoubleMatrix.toArrayUnsafe()"})
  void testGettersAndSetters() {
    // Arrange
    DoubleMatrix ofResult = DoubleMatrix.of();

    // Act
    int actualSizeResult = ofResult.size();

    // Assert
    assertEquals(0, actualSizeResult);
    assertEquals(0, ofResult.toArrayUnsafe().length);
  }

  /**
   * Test {@link DoubleMatrix#rowCount()}.
   *
   * <p>Method under test: {@link DoubleMatrix#rowCount()}
   */
  @Test
  @DisplayName("Test rowCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleMatrix.rowCount()"})
  void testRowCount() {
    // Arrange, Act and Assert
    assertEquals(0, DoubleMatrix.EMPTY.rowCount());
  }

  /**
   * Test {@link DoubleMatrix#columnCount()}.
   *
   * <p>Method under test: {@link DoubleMatrix#columnCount()}
   */
  @Test
  @DisplayName("Test columnCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleMatrix.columnCount()"})
  void testColumnCount() {
    // Arrange, Act and Assert
    assertEquals(0, DoubleMatrix.EMPTY.columnCount());
  }

  /**
   * Test {@link DoubleMatrix#isSquare()}.
   *
   * <p>Method under test: {@link DoubleMatrix#isSquare()}
   */
  @Test
  @DisplayName("Test isSquare()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.isSquare()"})
  void testIsSquare() {
    // Arrange, Act and Assert
    assertTrue(DoubleMatrix.EMPTY.isSquare());
  }

  /**
   * Test {@link DoubleMatrix#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(DoubleMatrix.EMPTY.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#isEmpty()}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given identity three; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.isEmpty()"})
  void testIsEmpty_givenIdentityThree_thenReturnFalse() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertFalse(identityResult.isEmpty());
  }

  /**
   * Test {@link DoubleMatrix#get(int, int)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#get(int, int)}
   */
  @Test
  @DisplayName("Test get(int, int); given identity three; when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.get(int, int)"})
  void testGet_givenIdentityThree_whenOne_thenReturnOne() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertEquals(1.0d, identityResult.get(1, 1));
  }

  /**
   * Test {@link DoubleMatrix#get(int, int)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#get(int, int)}
   */
  @Test
  @DisplayName("Test get(int, int); given identity three; when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.get(int, int)"})
  void testGet_givenIdentityThree_whenZero_thenReturnOne() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertEquals(1.0d, identityResult.get(0, 0));
  }

  /**
   * Test {@link DoubleMatrix#get(int, int)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#get(int, int)}
   */
  @Test
  @DisplayName("Test get(int, int); given identity three; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.get(int, int)"})
  void testGet_givenIdentityThree_whenZero_thenReturnZero() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertEquals(0.0d, identityResult.get(1, 0));
  }

  /**
   * Test {@link DoubleMatrix#row(int)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#row(int)}
   */
  @Test
  @DisplayName("Test row(int); given identity three; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleMatrix.row(int)"})
  void testRow_givenIdentityThree_thenReturnMinIsZero() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    DoubleArray actualRowResult = identityResult.row(1);

    // Assert
    assertEquals(0.0d, actualRowResult.min());
    List<Double> toListResult = actualRowResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualRowResult.dimensions());
    assertEquals(1.0d, actualRowResult.max());
    assertEquals(1.0d, actualRowResult.sum());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(3, actualRowResult.size());
    assertFalse(actualRowResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d}, actualRowResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleMatrix#rowArray(int)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return array of {@code double} with zero and one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#rowArray(int)}
   */
  @Test
  @DisplayName(
      "Test rowArray(int); given identity three; then return array of double with zero and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleMatrix.rowArray(int)"})
  void testRowArray_givenIdentityThree_thenReturnArrayOfDoubleWithZeroAndOne() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d}, identityResult.rowArray(1), 0.0);
  }

  /**
   * Test {@link DoubleMatrix#column(int)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#column(int)}
   */
  @Test
  @DisplayName("Test column(int); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleMatrix.column(int)"})
  void testColumn_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleMatrix.EMPTY.column(1));
  }

  /**
   * Test {@link DoubleMatrix#column(int)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#column(int)}
   */
  @Test
  @DisplayName("Test column(int); given identity three; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleMatrix.column(int)"})
  void testColumn_givenIdentityThree_thenReturnMinIsZero() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    DoubleArray actualColumnResult = identityResult.column(1);

    // Assert
    assertEquals(0.0d, actualColumnResult.min());
    List<Double> toListResult = actualColumnResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1.0d, actualColumnResult.max());
    assertEquals(1.0d, actualColumnResult.sum());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(3, actualColumnResult.size());
    assertFalse(actualColumnResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d}, actualColumnResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleMatrix#columnArray(int)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>Then return empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#columnArray(int)}
   */
  @Test
  @DisplayName("Test columnArray(int); given EMPTY; then return empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleMatrix.columnArray(int)"})
  void testColumnArray_givenEmpty_thenReturnEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[] {}, DoubleMatrix.EMPTY.columnArray(1), 0.0);
  }

  /**
   * Test {@link DoubleMatrix#columnArray(int)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return array of {@code double} with zero and one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#columnArray(int)}
   */
  @Test
  @DisplayName(
      "Test columnArray(int); given identity three; then return array of double with zero and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleMatrix.columnArray(int)"})
  void testColumnArray_givenIdentityThree_thenReturnArrayOfDoubleWithZeroAndOne() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d}, identityResult.columnArray(1), 0.0);
  }

  /**
   * Test {@link DoubleMatrix#toArray()}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given EMPTY; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] DoubleMatrix.toArray()"})
  void testToArray_givenEmpty_thenReturnArrayLengthIsZero() {
    // Arrange, Act and Assert
    assertEquals(0, DoubleMatrix.EMPTY.toArray().length);
  }

  /**
   * Test {@link DoubleMatrix#toArray()}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given identity three; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] DoubleMatrix.toArray()"})
  void testToArray_givenIdentityThree_thenReturnArrayLengthIsThree() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    double[][] actualToArrayResult = identityResult.toArray();

    // Assert
    assertEquals(3, actualToArrayResult.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d}, actualToArrayResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d}, actualToArrayResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d}, actualToArrayResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#forEach(IntIntDoubleConsumer)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When {@link IntIntDoubleConsumer}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#forEach(IntIntDoubleConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(IntIntDoubleConsumer); given EMPTY; when IntIntDoubleConsumer; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleMatrix.forEach(IntIntDoubleConsumer)"})
  void testForEach_givenEmpty_whenIntIntDoubleConsumer_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> DoubleMatrix.EMPTY.forEach(mock(IntIntDoubleConsumer.class)));
  }

  /**
   * Test {@link DoubleMatrix#forEach(IntIntDoubleConsumer)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#forEach(IntIntDoubleConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(IntIntDoubleConsumer); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleMatrix.forEach(IntIntDoubleConsumer)"})
  void testForEach_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    IntIntDoubleConsumer action = mock(IntIntDoubleConsumer.class);
    doThrow(new IllegalArgumentException()).when(action).accept(anyInt(), anyInt(), anyDouble());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> identityResult.forEach(action));
    verify(action).accept(0, 0, 1.0d);
  }

  /**
   * Test {@link DoubleMatrix#forEach(IntIntDoubleConsumer)}.
   *
   * <ul>
   *   <li>When {@link IntIntDoubleConsumer} {@link IntIntDoubleConsumer#accept(int, int, double)}
   *       does nothing.
   *   <li>Then calls {@link IntIntDoubleConsumer#accept(int, int, double)}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#forEach(IntIntDoubleConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(IntIntDoubleConsumer); when IntIntDoubleConsumer accept(int, int, double) does nothing; then calls accept(int, int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleMatrix.forEach(IntIntDoubleConsumer)"})
  void testForEach_whenIntIntDoubleConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    IntIntDoubleConsumer action = mock(IntIntDoubleConsumer.class);
    doNothing().when(action).accept(anyInt(), anyInt(), anyDouble());

    // Act
    identityResult.forEach(action);

    // Assert
    verify(action, atLeast(1)).accept(anyInt(), anyInt(), anyDouble());
  }

  /**
   * Test {@link DoubleMatrix#with(int, int, double)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When one.
   *   <li>Then return total is twelve.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#with(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test with(int, int, double); given identity three; when one; then return total is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.with(int, int, double)"})
  void testWith_givenIdentityThree_whenOne_thenReturnTotalIsTwelve() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    DoubleMatrix actualWithResult = identityResult.with(1, 1, 10.0d);

    // Assert
    assertEquals(12.0d, actualWithResult.total());
    assertEquals(2, actualWithResult.dimensions());
    double[][] toArrayUnsafeResult = actualWithResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualWithResult.size());
    assertFalse(actualWithResult.isEmpty());
    assertTrue(actualWithResult.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 10.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#multipliedBy(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double); given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.multipliedBy(double)"})
  void testMultipliedBy_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleMatrix.EMPTY, DoubleMatrix.EMPTY.multipliedBy(1.0d));
  }

  /**
   * Test {@link DoubleMatrix#multipliedBy(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double); given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.multipliedBy(double)"})
  void testMultipliedBy_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleMatrix.EMPTY, DoubleMatrix.EMPTY.multipliedBy(10.0d));
  }

  /**
   * Test {@link DoubleMatrix#multipliedBy(double)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When ten.
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#multipliedBy(double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(double); given identity three; when ten; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.multipliedBy(double)"})
  void testMultipliedBy_givenIdentityThree_whenTen_thenReturnArrayLengthIsThree() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    DoubleMatrix actualMultipliedByResult = identityResult.multipliedBy(10.0d);

    // Assert
    double[][] toArrayUnsafeResult = actualMultipliedByResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(30.0d, actualMultipliedByResult.total());
    assertEquals(9, actualMultipliedByResult.size());
    assertFalse(actualMultipliedByResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 10.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {10.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#map(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When {@link DoubleUnaryOperator}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#map(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(DoubleUnaryOperator); given EMPTY; when DoubleUnaryOperator; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.map(DoubleUnaryOperator)"})
  void testMap_givenEmpty_whenDoubleUnaryOperator_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleMatrix.EMPTY, DoubleMatrix.EMPTY.map(mock(DoubleUnaryOperator.class)));
  }

  /**
   * Test {@link DoubleMatrix#map(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#map(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(DoubleUnaryOperator); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.map(DoubleUnaryOperator)"})
  void testMap_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    DoubleUnaryOperator operator = mock(DoubleUnaryOperator.class);
    when(operator.applyAsDouble(anyDouble())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> identityResult.map(operator));
    verify(operator).applyAsDouble(1.0d);
  }

  /**
   * Test {@link DoubleMatrix#map(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return dimensions is two.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#map(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test map(DoubleUnaryOperator); given ten; then return dimensions is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.map(DoubleUnaryOperator)"})
  void testMap_givenTen_thenReturnDimensionsIsTwo() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    DoubleUnaryOperator operator = mock(DoubleUnaryOperator.class);
    when(operator.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    DoubleMatrix actualMapResult = identityResult.map(operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble());
    assertEquals(2, actualMapResult.dimensions());
    double[][] toArrayUnsafeResult = actualMapResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualMapResult.size());
    assertEquals(90.0d, actualMapResult.total());
    assertFalse(actualMapResult.isEmpty());
    assertTrue(actualMapResult.isSquare());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#mapWithIndex(IntIntDoubleToDoubleFunction)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When {@link IntIntDoubleToDoubleFunction}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#mapWithIndex(IntIntDoubleToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(IntIntDoubleToDoubleFunction); given EMPTY; when IntIntDoubleToDoubleFunction; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.mapWithIndex(IntIntDoubleToDoubleFunction)"})
  void testMapWithIndex_givenEmpty_whenIntIntDoubleToDoubleFunction_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        DoubleMatrix.EMPTY,
        DoubleMatrix.EMPTY.mapWithIndex(mock(IntIntDoubleToDoubleFunction.class)));
  }

  /**
   * Test {@link DoubleMatrix#mapWithIndex(IntIntDoubleToDoubleFunction)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#mapWithIndex(IntIntDoubleToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(IntIntDoubleToDoubleFunction); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.mapWithIndex(IntIntDoubleToDoubleFunction)"})
  void testMapWithIndex_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    IntIntDoubleToDoubleFunction function = mock(IntIntDoubleToDoubleFunction.class);
    when(function.applyAsDouble(anyInt(), anyInt(), anyDouble()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> identityResult.mapWithIndex(function));
    verify(function).applyAsDouble(0, 0, 1.0d);
  }

  /**
   * Test {@link DoubleMatrix#mapWithIndex(IntIntDoubleToDoubleFunction)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return dimensions is two.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#mapWithIndex(IntIntDoubleToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(IntIntDoubleToDoubleFunction); given ten; then return dimensions is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.mapWithIndex(IntIntDoubleToDoubleFunction)"})
  void testMapWithIndex_givenTen_thenReturnDimensionsIsTwo() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    IntIntDoubleToDoubleFunction function = mock(IntIntDoubleToDoubleFunction.class);
    when(function.applyAsDouble(anyInt(), anyInt(), anyDouble())).thenReturn(10.0d);

    // Act
    DoubleMatrix actualMapWithIndexResult = identityResult.mapWithIndex(function);

    // Assert
    verify(function, atLeast(1)).applyAsDouble(anyInt(), anyInt(), anyDouble());
    assertEquals(2, actualMapWithIndexResult.dimensions());
    double[][] toArrayUnsafeResult = actualMapWithIndexResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualMapWithIndexResult.size());
    assertEquals(90.0d, actualMapWithIndexResult.total());
    assertFalse(actualMapWithIndexResult.isEmpty());
    assertTrue(actualMapWithIndexResult.isSquare());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#plus(DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When {@link DoubleMatrix#EMPTY}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#plus(DoubleMatrix)}
   */
  @Test
  @DisplayName("Test plus(DoubleMatrix); given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.plus(DoubleMatrix)"})
  void testPlus_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleMatrix.EMPTY, DoubleMatrix.EMPTY.plus(DoubleMatrix.EMPTY));
  }

  /**
   * Test {@link DoubleMatrix#plus(DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When {@link DoubleMatrix#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#plus(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test plus(DoubleMatrix); given identity three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.plus(DoubleMatrix)"})
  void testPlus_givenIdentityThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> identityResult.plus(DoubleMatrix.EMPTY));
  }

  /**
   * Test {@link DoubleMatrix#plus(DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When identity three.
   *   <li>Then return dimensions is two.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#plus(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test plus(DoubleMatrix); given identity three; when identity three; then return dimensions is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.plus(DoubleMatrix)"})
  void testPlus_givenIdentityThree_whenIdentityThree_thenReturnDimensionsIsTwo() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    DoubleMatrix actualPlusResult = identityResult.plus(DoubleMatrix.identity(3));

    // Assert
    assertEquals(2, actualPlusResult.dimensions());
    double[][] toArrayUnsafeResult = actualPlusResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(6.0d, actualPlusResult.total());
    assertEquals(9, actualPlusResult.size());
    assertFalse(actualPlusResult.isEmpty());
    assertTrue(actualPlusResult.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 2.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 2.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {2.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#minus(DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When {@link DoubleMatrix#EMPTY}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#minus(DoubleMatrix)}
   */
  @Test
  @DisplayName("Test minus(DoubleMatrix); given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.minus(DoubleMatrix)"})
  void testMinus_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleMatrix.EMPTY, DoubleMatrix.EMPTY.minus(DoubleMatrix.EMPTY));
  }

  /**
   * Test {@link DoubleMatrix#minus(DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When {@link DoubleMatrix#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#minus(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test minus(DoubleMatrix); given identity three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.minus(DoubleMatrix)"})
  void testMinus_givenIdentityThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> identityResult.minus(DoubleMatrix.EMPTY));
  }

  /**
   * Test {@link DoubleMatrix#minus(DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When identity three.
   *   <li>Then return total is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#minus(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test minus(DoubleMatrix); given identity three; when identity three; then return total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.minus(DoubleMatrix)"})
  void testMinus_givenIdentityThree_whenIdentityThree_thenReturnTotalIsZero() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    DoubleMatrix actualMinusResult = identityResult.minus(DoubleMatrix.identity(3));

    // Assert
    assertEquals(0.0d, actualMinusResult.total());
    assertEquals(2, actualMinusResult.dimensions());
    double[][] toArrayUnsafeResult = actualMinusResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualMinusResult.size());
    assertFalse(actualMinusResult.isEmpty());
    assertTrue(actualMinusResult.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When {@link DoubleMatrix#EMPTY}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(DoubleMatrix, DoubleBinaryOperator); given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.combine(DoubleMatrix, DoubleBinaryOperator)"})
  void testCombine_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        DoubleMatrix.EMPTY,
        DoubleMatrix.EMPTY.combine(DoubleMatrix.EMPTY, mock(DoubleBinaryOperator.class)));
  }

  /**
   * Test {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>When {@link DoubleMatrix#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(DoubleMatrix, DoubleBinaryOperator); given identity three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.combine(DoubleMatrix, DoubleBinaryOperator)"})
  void testCombine_givenIdentityThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> identityResult.combine(DoubleMatrix.EMPTY, mock(DoubleBinaryOperator.class)));
  }

  /**
   * Test {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName("Test combine(DoubleMatrix, DoubleBinaryOperator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.combine(DoubleMatrix, DoubleBinaryOperator)"})
  void testCombine_givenIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);
    DoubleMatrix other = DoubleMatrix.identity(3);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> identityResult.combine(other, operator));
    verify(operator).applyAsDouble(1.0d, 1.0d);
  }

  /**
   * Test {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return dimensions is two.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#combine(DoubleMatrix, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(DoubleMatrix, DoubleBinaryOperator); given ten; then return dimensions is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.combine(DoubleMatrix, DoubleBinaryOperator)"})
  void testCombine_givenTen_thenReturnDimensionsIsTwo() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);
    DoubleMatrix other = DoubleMatrix.identity(3);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    DoubleMatrix actualCombineResult = identityResult.combine(other, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble(), anyDouble());
    assertEquals(2, actualCombineResult.dimensions());
    double[][] toArrayUnsafeResult = actualCombineResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualCombineResult.size());
    assertEquals(90.0d, actualCombineResult.total());
    assertFalse(actualCombineResult.isEmpty());
    assertTrue(actualCombineResult.isSquare());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link DoubleMatrix#total()}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#total()}
   */
  @Test
  @DisplayName("Test total(); given EMPTY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.total()"})
  void testTotal_givenEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, DoubleMatrix.EMPTY.total());
  }

  /**
   * Test {@link DoubleMatrix#total()}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#total()}
   */
  @Test
  @DisplayName("Test total(); given identity three; then return three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.total()"})
  void testTotal_givenIdentityThree_thenReturnThree() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertEquals(3.0d, identityResult.total());
  }

  /**
   * Test {@link DoubleMatrix#reduce(double, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>When {@link DoubleBinaryOperator}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#reduce(double, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(double, DoubleBinaryOperator); given EMPTY; when DoubleBinaryOperator; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.reduce(double, DoubleBinaryOperator)"})
  void testReduce_givenEmpty_whenDoubleBinaryOperator_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, DoubleMatrix.EMPTY.reduce(10.0d, mock(DoubleBinaryOperator.class)));
  }

  /**
   * Test {@link DoubleMatrix#reduce(double, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#reduce(double, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(double, DoubleBinaryOperator); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.reduce(double, DoubleBinaryOperator)"})
  void testReduce_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> identityResult.reduce(10.0d, operator));
    verify(operator).applyAsDouble(10.0d, 1.0d);
  }

  /**
   * Test {@link DoubleMatrix#reduce(double, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link DoubleBinaryOperator} {@link DoubleBinaryOperator#applyAsDouble(double,
   *       double)} return ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#reduce(double, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(double, DoubleBinaryOperator); given ten; when DoubleBinaryOperator applyAsDouble(double, double) return ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleMatrix.reduce(double, DoubleBinaryOperator)"})
  void testReduce_givenTen_whenDoubleBinaryOperatorApplyAsDoubleReturnTen_thenReturnTen() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    double actualReduceResult = identityResult.reduce(10.0d, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(eq(10.0d), anyDouble());
    assertEquals(10.0d, actualReduceResult);
  }

  /**
   * Test {@link DoubleMatrix#transpose()}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#transpose()}
   */
  @Test
  @DisplayName("Test transpose(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.transpose()"})
  void testTranspose_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleMatrix.EMPTY, DoubleMatrix.EMPTY.transpose());
  }

  /**
   * Test {@link DoubleMatrix#transpose()}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return identity three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#transpose()}
   */
  @Test
  @DisplayName("Test transpose(); given identity three; then return identity three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix DoubleMatrix.transpose()"})
  void testTranspose_givenIdentityThree_thenReturnIdentityThree() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act
    DoubleMatrix actualTransposeResult = identityResult.transpose();

    // Assert
    assertEquals(identityResult, actualTransposeResult);
  }

  /**
   * Test {@link DoubleMatrix#equals(Object)}, and {@link DoubleMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleMatrix#equals(Object)}
   *   <li>{@link DoubleMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.equals(Object)", "int DoubleMatrix.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleMatrix doubleMatrix = DoubleMatrix.EMPTY;
    DoubleMatrix doubleMatrix2 = DoubleMatrix.EMPTY;

    // Act and Assert
    assertEquals(doubleMatrix, doubleMatrix2);
    assertEquals(doubleMatrix.hashCode(), doubleMatrix2.hashCode());
  }

  /**
   * Test {@link DoubleMatrix#equals(Object)}, and {@link DoubleMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleMatrix#equals(Object)}
   *   <li>{@link DoubleMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.equals(Object)", "int DoubleMatrix.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);
    DoubleMatrix identityResult2 = DoubleMatrix.identity(3);

    // Act and Assert
    assertEquals(identityResult, identityResult2);
    assertEquals(identityResult.hashCode(), identityResult2.hashCode());
  }

  /**
   * Test {@link DoubleMatrix#equals(Object)}, and {@link DoubleMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleMatrix#equals(Object)}
   *   <li>{@link DoubleMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.equals(Object)", "int DoubleMatrix.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DoubleMatrix doubleMatrix = DoubleMatrix.EMPTY;

    // Act and Assert
    assertEquals(doubleMatrix, doubleMatrix);
    int expectedHashCodeResult = doubleMatrix.hashCode();
    assertEquals(expectedHashCodeResult, doubleMatrix.hashCode());
  }

  /**
   * Test {@link DoubleMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.equals(Object)", "int DoubleMatrix.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertNotEquals(identityResult, DoubleMatrix.EMPTY);
  }

  /**
   * Test {@link DoubleMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.equals(Object)", "int DoubleMatrix.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleMatrix filledResult = DoubleMatrix.filled(1, 1);

    // Act and Assert
    assertNotEquals(filledResult, DoubleMatrix.identity(1));
  }

  /**
   * Test {@link DoubleMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.equals(Object)", "int DoubleMatrix.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DoubleMatrix.EMPTY, null);
  }

  /**
   * Test {@link DoubleMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleMatrix.equals(Object)", "int DoubleMatrix.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DoubleMatrix.EMPTY, "Different type to DoubleMatrix");
  }

  /**
   * Test {@link DoubleMatrix#toString()}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix#EMPTY}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#toString()}
   */
  @Test
  @DisplayName("Test toString(); given EMPTY; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DoubleMatrix.toString()"})
  void testToString_givenEmpty_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", DoubleMatrix.EMPTY.toString());
  }

  /**
   * Test {@link DoubleMatrix#toString()}.
   *
   * <ul>
   *   <li>Given identity three.
   *   <li>Then return {@code 1.0 0.0 0.0 0.0 1.0 0.0 0.0 0.0 1.0}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleMatrix#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given identity three; then return '1.0 0.0 0.0 0.0 1.0 0.0 0.0 0.0 1.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DoubleMatrix.toString()"})
  void testToString_givenIdentityThree_thenReturn100000001000000010() {
    // Arrange
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    // Act and Assert
    assertEquals("1.0 0.0 0.0\n0.0 1.0 0.0\n0.0 0.0 1.0\n", identityResult.toString());
  }

  /**
   * Test {@link DoubleMatrix#meta()}.
   *
   * <p>Method under test: {@link DoubleMatrix#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DoubleMatrix.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DoubleMatrix.meta();

    // Assert
    MetaProperty<double[][]> arrayResult = actualMetaResult.array();
    assertTrue(arrayResult instanceof DirectMetaProperty);
    assertEquals("[[D", arrayResult.propertyType().getName());
    assertEquals("array", arrayResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, arrayResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleMatrix> expectedDeclaringTypeResult = DoubleMatrix.class;
    assertEquals(expectedDeclaringTypeResult, arrayResult.declaringType());
    assertSame(Meta.INSTANCE, arrayResult.metaBean());
  }

  /**
   * Test {@link DoubleMatrix#metaBean()}.
   *
   * <p>Method under test: {@link DoubleMatrix#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DoubleMatrix.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, DoubleMatrix.EMPTY.metaBean());
  }
}
