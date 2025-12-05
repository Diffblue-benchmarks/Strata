package com.opengamma.strata.collect.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray.ImmIterator;
import com.opengamma.strata.collect.array.DoubleArray.ImmList;
import com.opengamma.strata.collect.array.DoubleArray.Meta;
import com.opengamma.strata.collect.function.DoubleTernaryOperator;
import com.opengamma.strata.collect.function.IntDoubleConsumer;
import com.opengamma.strata.collect.function.IntDoubleToDoubleFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntToDoubleFunction;
import org.joda.beans.MetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleArrayDiffblueTest {
  /**
   * Test ImmIterator {@link ImmIterator#add(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link ImmIterator#add(Double)}
   */
  @Test
  @DisplayName("Test ImmIterator add(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.add(Double)"})
  void testImmIteratorAddWithDouble() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.add(10.0d));
  }

  /**
   * Test ImmIterator {@link ImmIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ImmIterator#hasNext()}
   */
  @Test
  @DisplayName("Test ImmIterator hasNext(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmIterator.hasNext()"})
  void testImmIteratorHasNext_thenReturnFalse() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {});

    // Act and Assert
    assertFalse(immIterator.hasNext());
  }

  /**
   * Test ImmIterator {@link ImmIterator#hasNext()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmIterator#hasNext()}
   */
  @Test
  @DisplayName("Test ImmIterator hasNext(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmIterator.hasNext()"})
  void testImmIteratorHasNext_thenReturnTrue() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertTrue(immIterator.hasNext());
  }

  /**
   * Test ImmIterator {@link ImmIterator#hasPrevious()}.
   *
   * <p>Method under test: {@link ImmIterator#hasPrevious()}
   */
  @Test
  @DisplayName("Test ImmIterator hasPrevious()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmIterator.hasPrevious()"})
  void testImmIteratorHasPrevious() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertFalse(immIterator.hasPrevious());
  }

  /**
   * Test ImmIterator {@link ImmIterator#ImmIterator(double[])}.
   *
   * <p>Method under test: {@link ImmIterator#ImmIterator(double[])}
   */
  @Test
  @DisplayName("Test ImmIterator new ImmIterator(double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.<init>(double[])"})
  void testImmIteratorNewImmIterator() {
    // Arrange and Act
    ImmIterator actualImmIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    Double nextResult = actualImmIterator.next();
    Double nextResult2 = actualImmIterator.next();
    Double nextResult3 = actualImmIterator.next();
    Double nextResult4 = actualImmIterator.next();
    boolean actualHasNextResult = actualImmIterator.hasNext();
    assertEquals(0.5d, nextResult2.doubleValue());
    assertEquals(0.5d, nextResult4.doubleValue());
    assertEquals(10.0d, nextResult.doubleValue());
    assertEquals(10.0d, nextResult3.doubleValue());
    assertFalse(actualHasNextResult);
  }

  /**
   * Test ImmIterator {@link ImmIterator#nextIndex()}.
   *
   * <p>Method under test: {@link ImmIterator#nextIndex()}
   */
  @Test
  @DisplayName("Test ImmIterator nextIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmIterator.nextIndex()"})
  void testImmIteratorNextIndex() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertEquals(0, immIterator.nextIndex());
  }

  /**
   * Test ImmIterator {@link ImmIterator#next()}.
   *
   * <ul>
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link ImmIterator#next()}
   */
  @Test
  @DisplayName("Test ImmIterator next(); then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ImmIterator.next()"})
  void testImmIteratorNext_thenReturnDoubleValueIsTen() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertEquals(10.0d, immIterator.next().doubleValue());
    Double nextResult = immIterator.next();
    Double nextResult2 = immIterator.next();
    Double nextResult3 = immIterator.next();
    assertFalse(immIterator.hasNext());
    assertEquals(0.5d, nextResult.doubleValue());
    assertEquals(10.0d, nextResult2.doubleValue());
    assertEquals(0.5d, nextResult3.doubleValue());
  }

  /**
   * Test ImmIterator {@link ImmIterator#next()}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmIterator#next()}
   */
  @Test
  @DisplayName("Test ImmIterator next(); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ImmIterator.next()"})
  void testImmIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {});

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> immIterator.next());
  }

  /**
   * Test ImmIterator {@link ImmIterator#previous()}.
   *
   * <p>Method under test: {@link ImmIterator#previous()}
   */
  @Test
  @DisplayName("Test ImmIterator previous()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ImmIterator.previous()"})
  void testImmIteratorPrevious() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> immIterator.previous());
  }

  /**
   * Test ImmIterator {@link ImmIterator#previousIndex()}.
   *
   * <p>Method under test: {@link ImmIterator#previousIndex()}
   */
  @Test
  @DisplayName("Test ImmIterator previousIndex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmIterator.previousIndex()"})
  void testImmIteratorPreviousIndex() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertEquals(-1, immIterator.previousIndex());
  }

  /**
   * Test ImmIterator {@link ImmIterator#remove()}.
   *
   * <p>Method under test: {@link ImmIterator#remove()}
   */
  @Test
  @DisplayName("Test ImmIterator remove()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.remove()"})
  void testImmIteratorRemove() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.remove());
  }

  /**
   * Test ImmIterator {@link ImmIterator#set(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link ImmIterator#set(Double)}
   */
  @Test
  @DisplayName("Test ImmIterator set(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.set(Double)"})
  void testImmIteratorSetWithDouble() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.set(10.0d));
  }

  /**
   * Test ImmList {@link ImmList#ImmList(DoubleArray)}.
   *
   * <p>Method under test: {@link ImmList#ImmList(DoubleArray)}
   */
  @Test
  @DisplayName("Test ImmList new ImmList(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmList.<init>(DoubleArray)"})
  void testImmListNewImmList() {
    // Arrange, Act and Assert
    assertTrue(new ImmList(DoubleArray.EMPTY).isEmpty());
  }

  /**
   * Test {@link DoubleArray#of()}.
   *
   * <p>Method under test: {@link DoubleArray#of()}
   */
  @Test
  @DisplayName("Test of()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of()"})
  void testOf() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0.0d, actualOfResult.sum());
    assertEquals(1, actualOfResult.dimensions());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(int, IntToDoubleFunction)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When three.
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#of(int, IntToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntToDoubleFunction) with 'size', 'valueFunction'; given ten; when three; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(int, IntToDoubleFunction)"})
  void testOfWithSizeValueFunction_givenTen_whenThree_thenReturnMaxIsTen() {
    // Arrange
    IntToDoubleFunction valueFunction = mock(IntToDoubleFunction.class);
    when(valueFunction.applyAsDouble(anyInt())).thenReturn(10.0d);

    // Act
    DoubleArray actualOfResult = DoubleArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).applyAsDouble(anyInt());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualOfResult.size());
    assertEquals(30.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(int, IntToDoubleFunction)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#of(int, IntToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntToDoubleFunction) with 'size', 'valueFunction'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(int, IntToDoubleFunction)"})
  void testOfWithSizeValueFunction_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(0, mock(IntToDoubleFunction.class));

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0.0d, actualOfResult.sum());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(double)} with {@code value}.
   *
   * <p>Method under test: {@link DoubleArray#of(double)}
   */
  @Test
  @DisplayName("Test of(double) with 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(double)"})
  void testOfWithValue() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(1, actualOfResult.size());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    assertEquals(10.0d, actualOfResult.sum());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new double[] {10.0d}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double)} with {@code value1}, {@code value2}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double)}
   */
  @Test
  @DisplayName("Test of(double, double) with 'value1', 'value2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(double, double)"})
  void testOfWithValue1Value2() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(10.0d, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(2, actualOfResult.size());
    assertEquals(20.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double, double)} with {@code value1}, {@code value2}, {@code
   * value3}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double, double)}
   */
  @Test
  @DisplayName("Test of(double, double, double) with 'value1', 'value2', 'value3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(double, double, double)"})
  void testOfWithValue1Value2Value3() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualOfResult.size());
    assertEquals(30.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double, double, double)} with {@code value1}, {@code
   * value2}, {@code value3}, {@code value4}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double, double) with 'value1', 'value2', 'value3', 'value4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(double, double, double, double)"})
  void testOfWithValue1Value2Value3Value4() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(3).doubleValue());
    assertEquals(4, actualOfResult.size());
    assertEquals(40.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d, 10.0d}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double, double, double, double)} with {@code value1}, {@code
   * value2}, {@code value3}, {@code value4}, {@code value5}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double, double, double) with 'value1', 'value2', 'value3', 'value4', 'value5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(double, double, double, double, double)"})
  void testOfWithValue1Value2Value3Value4Value5() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(5, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, toListResult.get(4).doubleValue());
    assertEquals(5, actualOfResult.size());
    assertEquals(50.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d, 10.0d, 10.0d}, actualOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double, double, double, double, double)} with {@code
   * value1}, {@code value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double, double, double, double) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.of(double, double, double, double, double, double)"})
  void testOfWithValue1Value2Value3Value4Value5Value6() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(6, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, toListResult.get(4).doubleValue());
    assertEquals(10.0d, toListResult.get(5).doubleValue());
    assertEquals(6, actualOfResult.size());
    assertEquals(60.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d},
        actualOfResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double, double, double, double, double, double)} with {@code
   * value1}, {@code value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}, {@code
   * value7}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double, double, double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double, double, double, double, double) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoubleArray.of(double, double, double, double, double, double, double)"
  })
  void testOfWithValue1Value2Value3Value4Value5Value6Value7() {
    // Arrange and Act
    DoubleArray actualOfResult = DoubleArray.of(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(7, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(4).doubleValue());
    assertEquals(10.0d, toListResult.get(5).doubleValue());
    assertEquals(10.0d, toListResult.get(6).doubleValue());
    assertEquals(7, actualOfResult.size());
    assertEquals(70.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d},
        actualOfResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double, double, double, double, double, double, double)}
   * with {@code value1}, {@code value2}, {@code value3}, {@code value4}, {@code value5}, {@code
   * value6}, {@code value7}, {@code value8}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double, double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double, double, double, double, double, double) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7', 'value8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoubleArray.of(double, double, double, double, double, double, double, double)"
  })
  void testOfWithValue1Value2Value3Value4Value5Value6Value7Value8() {
    // Arrange and Act
    DoubleArray actualOfResult =
        DoubleArray.of(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(8, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(5).doubleValue());
    assertEquals(10.0d, toListResult.get(6).doubleValue());
    assertEquals(10.0d, toListResult.get(7).doubleValue());
    assertEquals(8, actualOfResult.size());
    assertEquals(80.0d, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d},
        actualOfResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoubleArray#of(double, double, double, double, double, double, double, double,
   * double[])} with {@code value1}, {@code value2}, {@code value3}, {@code value4}, {@code value5},
   * {@code value6}, {@code value7}, {@code value8}, {@code otherValues}.
   *
   * <p>Method under test: {@link DoubleArray#of(double, double, double, double, double, double,
   * double, double, double[])}
   */
  @Test
  @DisplayName(
      "Test of(double, double, double, double, double, double, double, double, double[]) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7', 'value8', 'otherValues'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray DoubleArray.of(double, double, double, double, double, double, double, double, double[])"
  })
  void testOfWithValue1Value2Value3Value4Value5Value6Value7Value8OtherValues() {
    // Arrange and Act
    DoubleArray actualOfResult =
        DoubleArray.of(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d, 1.0d);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(1.0d, actualOfResult.min());
    List<Double> toListResult = actualOfResult.toList();
    assertEquals(12, toListResult.size());
    assertEquals(1.0d, toListResult.get(11).doubleValue());
    assertEquals(1.0d, toListResult.get(9).doubleValue());
    assertEquals(10.0d, actualOfResult.max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(10).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(102.0d, actualOfResult.sum());
    assertEquals(12, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new double[] {
          10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d, 1.0d
        },
        actualOfResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoubleArray#ofUnsafe(double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and one.
   *   <li>Then return min is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#ofUnsafe(double[])}
   */
  @Test
  @DisplayName(
      "Test ofUnsafe(double[]); when array of double with ten and one; then return min is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.ofUnsafe(double[])"})
  void testOfUnsafe_whenArrayOfDoubleWithTenAndOne_thenReturnMinIsOne() {
    // Arrange and Act
    DoubleArray actualOfUnsafeResult =
        DoubleArray.ofUnsafe(new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertEquals(1.0d, actualOfUnsafeResult.min());
    List<Double> toListResult = actualOfUnsafeResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, actualOfUnsafeResult.max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(22.0d, actualOfUnsafeResult.sum());
    assertEquals(4, actualOfUnsafeResult.size());
    assertFalse(actualOfUnsafeResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 1.0d, 10.0d, 1.0d}, actualOfUnsafeResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#ofUnsafe(double[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#ofUnsafe(double[])}
   */
  @Test
  @DisplayName("Test ofUnsafe(double[]); when empty array of double; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.ofUnsafe(double[])"})
  void testOfUnsafe_whenEmptyArrayOfDouble_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualOfUnsafeResult = DoubleArray.ofUnsafe(new double[] {});

    // Assert
    assertEquals(0, actualOfUnsafeResult.size());
    assertEquals(0.0d, actualOfUnsafeResult.sum());
    assertTrue(actualOfUnsafeResult.isEmpty());
    assertTrue(actualOfUnsafeResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualOfUnsafeResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(double[], int, int)} with {@code array}, {@code
   * fromIndexInclusive}, {@code toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(double[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(double[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(double[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive_thenReturnSizeIsOne() {
    // Arrange and Act
    DoubleArray actualCopyOfResult =
        DoubleArray.copyOf(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 0, 1);

    // Assert
    assertEquals(1, actualCopyOfResult.size());
    List<Double> toListResult = actualCopyOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(10.0d, actualCopyOfResult.max());
    assertEquals(10.0d, actualCopyOfResult.min());
    assertEquals(10.0d, actualCopyOfResult.sum());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new double[] {10.0d}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(double[], int, int)} with {@code array}, {@code
   * fromIndexInclusive}, {@code toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(double[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(double[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(double[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualCopyOfResult =
        DoubleArray.copyOf(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 1, 1);

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0.0d, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(double[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(double[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(double[], int) with 'array', 'fromIndex'; when four; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(double[], int)"})
  void testCopyOfWithArrayFromIndex_whenFour_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualCopyOfResult = DoubleArray.copyOf(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 4);

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0.0d, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(double[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return min is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(double[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(double[], int) with 'array', 'fromIndex'; when one; then return min is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(double[], int)"})
  void testCopyOfWithArrayFromIndex_whenOne_thenReturnMinIsOne() {
    // Arrange and Act
    DoubleArray actualCopyOfResult = DoubleArray.copyOf(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 1);

    // Assert
    assertEquals(1.0d, actualCopyOfResult.min());
    List<Double> toListResult = actualCopyOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, actualCopyOfResult.max());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(12.0d, actualCopyOfResult.sum());
    assertEquals(3, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new double[] {1.0d, 10.0d, 1.0d}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(double[])} with {@code array}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and one.
   *   <li>Then return min is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(double[])}
   */
  @Test
  @DisplayName(
      "Test copyOf(double[]) with 'array'; when array of double with ten and one; then return min is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(double[])"})
  void testCopyOfWithArray_whenArrayOfDoubleWithTenAndOne_thenReturnMinIsOne() {
    // Arrange and Act
    DoubleArray actualCopyOfResult = DoubleArray.copyOf(new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertEquals(1.0d, actualCopyOfResult.min());
    List<Double> toListResult = actualCopyOfResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, actualCopyOfResult.max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(22.0d, actualCopyOfResult.sum());
    assertEquals(4, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 1.0d, 10.0d, 1.0d}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(double[])} with {@code array}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(double[])}
   */
  @Test
  @DisplayName(
      "Test copyOf(double[]) with 'array'; when empty array of double; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(double[])"})
  void testCopyOfWithArray_whenEmptyArrayOfDouble_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualCopyOfResult = DoubleArray.copyOf(new double[] {});

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0.0d, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 0.5}.
   *   <li>Then return min is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; given '0.5'; when ArrayList() add '0.5'; then return min is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(Collection)"})
  void testCopyOfWithCollection_given05_whenArrayListAdd05_thenReturnMinIs05() {
    // Arrange
    ArrayList<Double> collection = new ArrayList<>();
    collection.add(0.5d);
    collection.add(10.0d);

    // Act
    DoubleArray actualCopyOfResult = DoubleArray.copyOf(collection);

    // Assert
    assertEquals(0.5d, actualCopyOfResult.min());
    assertEquals(10.5d, actualCopyOfResult.sum());
    assertEquals(2, actualCopyOfResult.size());
    assertArrayEquals(new double[] {0.5d, 10.0d}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link ArrayList#ArrayList()} add ten.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; given ten; when ArrayList() add ten; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(Collection)"})
  void testCopyOfWithCollection_givenTen_whenArrayListAddTen_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Double> collection = new ArrayList<>();
    collection.add(10.0d);

    // Act
    DoubleArray actualCopyOfResult = DoubleArray.copyOf(collection);

    // Assert
    assertEquals(1, actualCopyOfResult.size());
    assertEquals(10.0d, actualCopyOfResult.min());
    assertEquals(10.0d, actualCopyOfResult.sum());
    assertArrayEquals(new double[] {10.0d}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.copyOf(Collection)"})
  void testCopyOfWithCollection_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualCopyOfResult = DoubleArray.copyOf(new ArrayList<>());

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0.0d, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualCopyOfResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#filled(int, double)} with {@code size}, {@code value}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#filled(int, double)}
   */
  @Test
  @DisplayName("Test filled(int, double) with 'size', 'value'; when three; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.filled(int, double)"})
  void testFilledWithSizeValue_whenThree_thenReturnMaxIsTen() {
    // Arrange and Act
    DoubleArray actualFilledResult = DoubleArray.filled(3, 10.0d);

    // Assert
    assertEquals(10.0d, actualFilledResult.max());
    assertEquals(10.0d, actualFilledResult.min());
    List<Double> toListResult = actualFilledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualFilledResult.size());
    assertEquals(30.0d, actualFilledResult.sum());
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, actualFilledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#filled(int, double)} with {@code size}, {@code value}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#filled(int, double)}
   */
  @Test
  @DisplayName("Test filled(int, double) with 'size', 'value'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.filled(int, double)"})
  void testFilledWithSizeValue_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualFilledResult = DoubleArray.filled(0, 10.0d);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertEquals(0.0d, actualFilledResult.sum());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualFilledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#filled(int)} with {@code size}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#filled(int)}
   */
  @Test
  @DisplayName("Test filled(int) with 'size'; when three; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.filled(int)"})
  void testFilledWithSize_whenThree_thenReturnMaxIsZero() {
    // Arrange and Act
    DoubleArray actualFilledResult = DoubleArray.filled(3);

    // Assert
    assertEquals(0.0d, actualFilledResult.max());
    assertEquals(0.0d, actualFilledResult.min());
    List<Double> toListResult = actualFilledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualFilledResult.size());
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualFilledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#filled(int)} with {@code size}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#filled(int)}
   */
  @Test
  @DisplayName("Test filled(int) with 'size'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.filled(int)"})
  void testFilledWithSize_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualFilledResult = DoubleArray.filled(0);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualFilledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#dimensions()}.
   *
   * <p>Method under test: {@link DoubleArray#dimensions()}
   */
  @Test
  @DisplayName("Test dimensions()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.dimensions()"})
  void testDimensions() {
    // Arrange, Act and Assert
    assertEquals(1, DoubleArray.EMPTY.dimensions());
  }

  /**
   * Test {@link DoubleArray#size()}.
   *
   * <p>Method under test: {@link DoubleArray#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, DoubleArray.EMPTY.size());
  }

  /**
   * Test {@link DoubleArray#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(DoubleArray.EMPTY.isEmpty());
  }

  /**
   * Test {@link DoubleArray#isEmpty()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given filled three; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.isEmpty()"})
  void testIsEmpty_givenFilledThree_thenReturnFalse() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertFalse(filledResult.isEmpty());
  }

  /**
   * Test {@link DoubleArray#get(int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.get(int)"})
  void testGet_givenFilledThree_thenReturnZero() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(0.0d, filledResult.get(1));
  }

  /**
   * Test {@link DoubleArray#contains(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#contains(double)}
   */
  @Test
  @DisplayName("Test contains(double); given DoubleArray with value is ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.contains(double)"})
  void testContains_givenDoubleArrayWithValueIsTen_thenReturnTrue() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act and Assert
    assertTrue(ofResult.contains(10.0d));
  }

  /**
   * Test {@link DoubleArray#contains(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#contains(double)}
   */
  @Test
  @DisplayName("Test contains(double); given EMPTY; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.contains(double)"})
  void testContains_givenEmpty_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(DoubleArray.EMPTY.contains(10.0d));
  }

  /**
   * Test {@link DoubleArray#contains(double)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#contains(double)}
   */
  @Test
  @DisplayName("Test contains(double); given filled three; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.contains(double)"})
  void testContains_givenFilledThree_thenReturnFalse() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertFalse(filledResult.contains(10.0d));
  }

  /**
   * Test {@link DoubleArray#indexOf(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#indexOf(double)}
   */
  @Test
  @DisplayName("Test indexOf(double); given DoubleArray with value is ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.indexOf(double)"})
  void testIndexOf_givenDoubleArrayWithValueIsTen_thenReturnZero() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act and Assert
    assertEquals(0, ofResult.indexOf(10.0d));
  }

  /**
   * Test {@link DoubleArray#indexOf(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#indexOf(double)}
   */
  @Test
  @DisplayName("Test indexOf(double); given EMPTY; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.indexOf(double)"})
  void testIndexOf_givenEmpty_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, DoubleArray.EMPTY.indexOf(10.0d));
  }

  /**
   * Test {@link DoubleArray#indexOf(double)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#indexOf(double)}
   */
  @Test
  @DisplayName("Test indexOf(double); given filled three; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.indexOf(double)"})
  void testIndexOf_givenFilledThree_thenReturnMinusOne() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(-1, filledResult.indexOf(10.0d));
  }

  /**
   * Test {@link DoubleArray#lastIndexOf(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#lastIndexOf(double)}
   */
  @Test
  @DisplayName("Test lastIndexOf(double); given DoubleArray with value is ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.lastIndexOf(double)"})
  void testLastIndexOf_givenDoubleArrayWithValueIsTen_thenReturnZero() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act and Assert
    assertEquals(0, ofResult.lastIndexOf(10.0d));
  }

  /**
   * Test {@link DoubleArray#lastIndexOf(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#lastIndexOf(double)}
   */
  @Test
  @DisplayName("Test lastIndexOf(double); given EMPTY; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.lastIndexOf(double)"})
  void testLastIndexOf_givenEmpty_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, DoubleArray.EMPTY.lastIndexOf(10.0d));
  }

  /**
   * Test {@link DoubleArray#lastIndexOf(double)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#lastIndexOf(double)}
   */
  @Test
  @DisplayName("Test lastIndexOf(double); given filled three; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int DoubleArray.lastIndexOf(double)"})
  void testLastIndexOf_givenFilledThree_thenReturnMinusOne() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(-1, filledResult.lastIndexOf(10.0d));
  }

  /**
   * Test {@link DoubleArray#subArray(int, int)} with {@code fromIndexInclusive}, {@code
   * toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#subArray(int, int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int, int) with 'fromIndexInclusive', 'toIndexExclusive'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.subArray(int, int)"})
  void testSubArrayWithFromIndexInclusiveToIndexExclusive_thenReturnEmpty() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, filledResult.subArray(1, 1));
  }

  /**
   * Test {@link DoubleArray#subArray(int, int)} with {@code fromIndexInclusive}, {@code
   * toIndexExclusive}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#subArray(int, int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int, int) with 'fromIndexInclusive', 'toIndexExclusive'; when zero; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.subArray(int, int)"})
  void testSubArrayWithFromIndexInclusiveToIndexExclusive_whenZero_thenReturnMaxIsZero() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualSubArrayResult = filledResult.subArray(0, 1);

    // Assert
    assertEquals(0.0d, actualSubArrayResult.max());
    assertEquals(0.0d, actualSubArrayResult.min());
    List<Double> toListResult = actualSubArrayResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, actualSubArrayResult.size());
    assertFalse(actualSubArrayResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, actualSubArrayResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#subArray(int)} with {@code fromIndexInclusive}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When one.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#subArray(int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int) with 'fromIndexInclusive'; given filled three; when one; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.subArray(int)"})
  void testSubArrayWithFromIndexInclusive_givenFilledThree_whenOne_thenReturnMaxIsZero() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualSubArrayResult = filledResult.subArray(1);

    // Assert
    assertEquals(0.0d, actualSubArrayResult.max());
    assertEquals(0.0d, actualSubArrayResult.min());
    List<Double> toListResult = actualSubArrayResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(2, actualSubArrayResult.size());
    assertFalse(actualSubArrayResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d}, actualSubArrayResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#subArray(int)} with {@code fromIndexInclusive}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#subArray(int)}
   */
  @Test
  @DisplayName("Test subArray(int) with 'fromIndexInclusive'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.subArray(int)"})
  void testSubArrayWithFromIndexInclusive_thenReturnEmpty() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, ofResult.subArray(1));
  }

  /**
   * Test {@link DoubleArray#toArray()}.
   *
   * <p>Method under test: {@link DoubleArray#toArray()}
   */
  @Test
  @DisplayName("Test toArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArray.toArray()"})
  void testToArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[] {}, DoubleArray.EMPTY.toArray(), 0.0);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleArray#toString()}
   *   <li>{@link DoubleArray#toArrayUnsafe()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArray.toArrayUnsafe()", "String DoubleArray.toString()"})
  void testGettersAndSetters() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of();

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("[]", actualToStringResult);
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#toList()}.
   *
   * <p>Method under test: {@link DoubleArray#toList()}
   */
  @Test
  @DisplayName("Test toList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List DoubleArray.toList()"})
  void testToList() {
    // Arrange, Act and Assert
    assertTrue(DoubleArray.EMPTY.toList().isEmpty());
  }

  /**
   * Test {@link DoubleArray#forEach(IntDoubleConsumer)}.
   *
   * <ul>
   *   <li>When {@link IntDoubleConsumer} {@link IntDoubleConsumer#accept(int, double)} does
   *       nothing.
   *   <li>Then calls {@link IntDoubleConsumer#accept(int, double)}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#forEach(IntDoubleConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(IntDoubleConsumer); when IntDoubleConsumer accept(int, double) does nothing; then calls accept(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArray.forEach(IntDoubleConsumer)"})
  void testForEach_whenIntDoubleConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    IntDoubleConsumer action = mock(IntDoubleConsumer.class);
    doNothing().when(action).accept(anyInt(), anyDouble());

    // Act
    filledResult.forEach(action);

    // Assert
    verify(action, atLeast(1)).accept(anyInt(), eq(0.0d));
  }

  /**
   * Test {@link DoubleArray#with(int, double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return {@link DoubleArray} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#with(int, double)}
   */
  @Test
  @DisplayName(
      "Test with(int, double); given DoubleArray with value is ten; then return DoubleArray with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.with(int, double)"})
  void testWith_givenDoubleArrayWithValueIsTen_thenReturnDoubleArrayWithValueIsTen() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act
    DoubleArray actualWithResult = ofResult.with(0, 10.0d);

    // Assert
    assertSame(ofResult, actualWithResult);
  }

  /**
   * Test {@link DoubleArray#with(int, double)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When one.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#with(int, double)}
   */
  @Test
  @DisplayName("Test with(int, double); given filled three; when one; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.with(int, double)"})
  void testWith_givenFilledThree_whenOne_thenReturnMinIsZero() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualWithResult = filledResult.with(1, 10.0d);

    // Assert
    assertEquals(0.0d, actualWithResult.min());
    List<Double> toListResult = actualWithResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(3, actualWithResult.size());
    assertArrayEquals(new double[] {0.0d, 10.0d, 0.0d}, actualWithResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#plus(double)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'amount'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.plus(double)"})
  void testPlusWithAmount_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.plus(10.0d));
  }

  /**
   * Test {@link DoubleArray#plus(double)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'amount'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.plus(double)"})
  void testPlusWithAmount_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleArray.EMPTY.plus(0.0d));
  }

  /**
   * Test {@link DoubleArray#plus(double)} with {@code amount}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'amount'; given filled three; when ten; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.plus(double)"})
  void testPlusWithAmount_givenFilledThree_whenTen_thenReturnMaxIsTen() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualPlusResult = filledResult.plus(10.0d);

    // Assert
    assertEquals(10.0d, actualPlusResult.max());
    assertEquals(10.0d, actualPlusResult.min());
    List<Double> toListResult = actualPlusResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualPlusResult.size());
    assertEquals(30.0d, actualPlusResult.sum());
    assertFalse(actualPlusResult.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, actualPlusResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#plus(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#plus(DoubleArray)}
   */
  @Test
  @DisplayName("Test plus(DoubleArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.plus(DoubleArray)"})
  void testPlusWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.plus(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#plus(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#plus(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test plus(DoubleArray) with 'other'; given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.plus(DoubleArray)"})
  void testPlusWithOther_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.plus(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#plus(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#plus(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test plus(DoubleArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.plus(DoubleArray)"})
  void testPlusWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualPlusResult = filledResult.plus(DoubleArray.filled(3));

    // Assert
    assertEquals(filledResult, actualPlusResult);
  }

  /**
   * Test {@link DoubleArray#minus(double)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#minus(double)}
   */
  @Test
  @DisplayName("Test minus(double) with 'amount'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.minus(double)"})
  void testMinusWithAmount_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.minus(10.0d));
  }

  /**
   * Test {@link DoubleArray#minus(double)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#minus(double)}
   */
  @Test
  @DisplayName("Test minus(double) with 'amount'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.minus(double)"})
  void testMinusWithAmount_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleArray.EMPTY.minus(0.0d));
  }

  /**
   * Test {@link DoubleArray#minus(double)} with {@code amount}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return max is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'amount'; given filled three; when ten; then return max is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.minus(double)"})
  void testMinusWithAmount_givenFilledThree_whenTen_thenReturnMaxIsMinusTen() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualMinusResult = filledResult.minus(10.0d);

    // Assert
    assertEquals(-10.0d, actualMinusResult.max());
    assertEquals(-10.0d, actualMinusResult.min());
    List<Double> toListResult = actualMinusResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-10.0d, toListResult.get(0).doubleValue());
    assertEquals(-10.0d, toListResult.get(1).doubleValue());
    assertEquals(-10.0d, toListResult.get(2).doubleValue());
    assertEquals(-30.0d, actualMinusResult.sum());
    assertEquals(3, actualMinusResult.size());
    assertFalse(actualMinusResult.isEmpty());
    assertArrayEquals(
        new double[] {-10.0d, -10.0d, -10.0d}, actualMinusResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#minus(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#minus(DoubleArray)}
   */
  @Test
  @DisplayName("Test minus(DoubleArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.minus(DoubleArray)"})
  void testMinusWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.minus(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#minus(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#minus(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test minus(DoubleArray) with 'other'; given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.minus(DoubleArray)"})
  void testMinusWithOther_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.minus(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#minus(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#minus(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test minus(DoubleArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.minus(DoubleArray)"})
  void testMinusWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualMinusResult = filledResult.minus(DoubleArray.filled(3));

    // Assert
    assertEquals(filledResult, actualMinusResult);
  }

  /**
   * Test {@link DoubleArray#multipliedBy(double)} with {@code factor}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'factor'; given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.multipliedBy(double)"})
  void testMultipliedByWithFactor_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleArray.EMPTY.multipliedBy(1.0d));
  }

  /**
   * Test {@link DoubleArray#multipliedBy(double)} with {@code factor}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'factor'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.multipliedBy(double)"})
  void testMultipliedByWithFactor_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.multipliedBy(10.0d));
  }

  /**
   * Test {@link DoubleArray#multipliedBy(double)} with {@code factor}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#multipliedBy(double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(double) with 'factor'; given filled three; when ten; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.multipliedBy(double)"})
  void testMultipliedByWithFactor_givenFilledThree_whenTen_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualMultipliedByResult = filledResult.multipliedBy(10.0d);

    // Assert
    assertEquals(filledResult, actualMultipliedByResult);
  }

  /**
   * Test {@link DoubleArray#multipliedBy(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#multipliedBy(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(DoubleArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.multipliedBy(DoubleArray)"})
  void testMultipliedByWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.multipliedBy(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#multipliedBy(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#multipliedBy(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(DoubleArray) with 'other'; given filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.multipliedBy(DoubleArray)"})
  void testMultipliedByWithOther_givenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> filledResult.multipliedBy(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#multipliedBy(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#multipliedBy(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(DoubleArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.multipliedBy(DoubleArray)"})
  void testMultipliedByWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualMultipliedByResult = filledResult.multipliedBy(DoubleArray.filled(3));

    // Assert
    assertEquals(filledResult, actualMultipliedByResult);
  }

  /**
   * Test {@link DoubleArray#dividedBy(double)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#dividedBy(double)}
   */
  @Test
  @DisplayName("Test dividedBy(double) with 'divisor'; given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.dividedBy(double)"})
  void testDividedByWithDivisor_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleArray.EMPTY.dividedBy(1.0d));
  }

  /**
   * Test {@link DoubleArray#dividedBy(double)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#dividedBy(double)}
   */
  @Test
  @DisplayName("Test dividedBy(double) with 'divisor'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.dividedBy(double)"})
  void testDividedByWithDivisor_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.dividedBy(10.0d));
  }

  /**
   * Test {@link DoubleArray#dividedBy(double)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#dividedBy(double)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(double) with 'divisor'; given filled three; when ten; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.dividedBy(double)"})
  void testDividedByWithDivisor_givenFilledThree_whenTen_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualDividedByResult = filledResult.dividedBy(10.0d);

    // Assert
    assertEquals(filledResult, actualDividedByResult);
  }

  /**
   * Test {@link DoubleArray#dividedBy(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#dividedBy(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(DoubleArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.dividedBy(DoubleArray)"})
  void testDividedByWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.dividedBy(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#dividedBy(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#dividedBy(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(DoubleArray) with 'other'; given filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.dividedBy(DoubleArray)"})
  void testDividedByWithOther_givenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.dividedBy(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#dividedBy(DoubleArray)} with {@code other}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#dividedBy(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(DoubleArray) with 'other'; when filled three; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.dividedBy(DoubleArray)"})
  void testDividedByWithOther_whenFilledThree_thenReturnDimensionsIsOne() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualDividedByResult = filledResult.dividedBy(DoubleArray.filled(3));

    // Assert
    assertEquals(1, actualDividedByResult.dimensions());
    assertEquals(3, actualDividedByResult.size());
    List<Double> toListResult = actualDividedByResult.toList();
    assertEquals(3, toListResult.size());
    assertFalse(actualDividedByResult.isEmpty());
    assertEquals(Double.NaN, actualDividedByResult.max());
    assertEquals(Double.NaN, actualDividedByResult.min());
    assertEquals(Double.NaN, actualDividedByResult.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        actualDividedByResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoubleArray#map(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleUnaryOperator}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#map(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(DoubleUnaryOperator); given EMPTY; when DoubleUnaryOperator; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.map(DoubleUnaryOperator)"})
  void testMap_givenEmpty_whenDoubleUnaryOperator_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(DoubleArray.EMPTY, DoubleArray.EMPTY.map(mock(DoubleUnaryOperator.class)));
  }

  /**
   * Test {@link DoubleArray#map(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#map(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test map(DoubleUnaryOperator); given ten; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.map(DoubleUnaryOperator)"})
  void testMap_givenTen_thenReturnDimensionsIsOne() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    DoubleUnaryOperator operator = mock(DoubleUnaryOperator.class);
    when(operator.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    DoubleArray actualMapResult = filledResult.map(operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(0.0d);
    assertEquals(1, actualMapResult.dimensions());
    assertEquals(10.0d, actualMapResult.max());
    assertEquals(10.0d, actualMapResult.min());
    List<Double> toListResult = actualMapResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualMapResult.size());
    assertEquals(30.0d, actualMapResult.sum());
    assertFalse(actualMapResult.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, actualMapResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#mapWithIndex(IntDoubleToDoubleFunction)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link IntDoubleToDoubleFunction}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#mapWithIndex(IntDoubleToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(IntDoubleToDoubleFunction); given EMPTY; when IntDoubleToDoubleFunction; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.mapWithIndex(IntDoubleToDoubleFunction)"})
  void testMapWithIndex_givenEmpty_whenIntDoubleToDoubleFunction_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        DoubleArray.EMPTY, DoubleArray.EMPTY.mapWithIndex(mock(IntDoubleToDoubleFunction.class)));
  }

  /**
   * Test {@link DoubleArray#mapWithIndex(IntDoubleToDoubleFunction)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#mapWithIndex(IntDoubleToDoubleFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(IntDoubleToDoubleFunction); given ten; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.mapWithIndex(IntDoubleToDoubleFunction)"})
  void testMapWithIndex_givenTen_thenReturnDimensionsIsOne() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    IntDoubleToDoubleFunction function = mock(IntDoubleToDoubleFunction.class);
    when(function.applyAsDouble(anyInt(), anyDouble())).thenReturn(10.0d);

    // Act
    DoubleArray actualMapWithIndexResult = filledResult.mapWithIndex(function);

    // Assert
    verify(function, atLeast(1)).applyAsDouble(anyInt(), eq(0.0d));
    assertEquals(1, actualMapWithIndexResult.dimensions());
    assertEquals(10.0d, actualMapWithIndexResult.max());
    assertEquals(10.0d, actualMapWithIndexResult.min());
    List<Double> toListResult = actualMapWithIndexResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualMapWithIndexResult.size());
    assertEquals(30.0d, actualMapWithIndexResult.sum());
    assertFalse(actualMapWithIndexResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d}, actualMapWithIndexResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#combine(DoubleArray, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#combine(DoubleArray, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(DoubleArray, DoubleBinaryOperator); given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.combine(DoubleArray, DoubleBinaryOperator)"})
  void testCombine_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        DoubleArray.EMPTY,
        DoubleArray.EMPTY.combine(DoubleArray.EMPTY, mock(DoubleBinaryOperator.class)));
  }

  /**
   * Test {@link DoubleArray#combine(DoubleArray, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#combine(DoubleArray, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(DoubleArray, DoubleBinaryOperator); given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.combine(DoubleArray, DoubleBinaryOperator)"})
  void testCombine_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> filledResult.combine(DoubleArray.EMPTY, mock(DoubleBinaryOperator.class)));
  }

  /**
   * Test {@link DoubleArray#combine(DoubleArray, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#combine(DoubleArray, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(DoubleArray, DoubleBinaryOperator); given ten; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.combine(DoubleArray, DoubleBinaryOperator)"})
  void testCombine_givenTen_thenReturnDimensionsIsOne() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleArray other = DoubleArray.filled(3);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    DoubleArray actualCombineResult = filledResult.combine(other, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(0.0d, 0.0d);
    assertEquals(1, actualCombineResult.dimensions());
    assertEquals(10.0d, actualCombineResult.max());
    assertEquals(10.0d, actualCombineResult.min());
    List<Double> toListResult = actualCombineResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualCombineResult.size());
    assertEquals(30.0d, actualCombineResult.sum());
    assertFalse(actualCombineResult.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, actualCombineResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#combineReduce(DoubleArray, DoubleTernaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#combineReduce(DoubleArray, DoubleTernaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineReduce(DoubleArray, DoubleTernaryOperator); given EMPTY; when EMPTY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.combineReduce(DoubleArray, DoubleTernaryOperator)"})
  void testCombineReduce_givenEmpty_whenEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        DoubleArray.EMPTY.combineReduce(DoubleArray.EMPTY, mock(DoubleTernaryOperator.class)));
  }

  /**
   * Test {@link DoubleArray#combineReduce(DoubleArray, DoubleTernaryOperator)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#combineReduce(DoubleArray, DoubleTernaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineReduce(DoubleArray, DoubleTernaryOperator); given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.combineReduce(DoubleArray, DoubleTernaryOperator)"})
  void testCombineReduce_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> filledResult.combineReduce(DoubleArray.EMPTY, mock(DoubleTernaryOperator.class)));
  }

  /**
   * Test {@link DoubleArray#combineReduce(DoubleArray, DoubleTernaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#combineReduce(DoubleArray, DoubleTernaryOperator)}
   */
  @Test
  @DisplayName("Test combineReduce(DoubleArray, DoubleTernaryOperator); given ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.combineReduce(DoubleArray, DoubleTernaryOperator)"})
  void testCombineReduce_givenTen_thenReturnTen() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleArray other = DoubleArray.filled(3);

    DoubleTernaryOperator operator = mock(DoubleTernaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    double actualCombineReduceResult = filledResult.combineReduce(other, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble(), eq(0.0d), eq(0.0d));
    assertEquals(10.0d, actualCombineReduceResult);
  }

  /**
   * Test {@link DoubleArray#concat(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#concat(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test concat(DoubleArray) with 'DoubleArray'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.concat(DoubleArray)"})
  void testConcatWithDoubleArray_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleArray.EMPTY.concat(DoubleArray.EMPTY));
  }

  /**
   * Test {@link DoubleArray#concat(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#concat(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test concat(DoubleArray) with 'DoubleArray'; given filled three; when EMPTY; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.concat(DoubleArray)"})
  void testConcatWithDoubleArray_givenFilledThree_whenEmpty_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualConcatResult = filledResult.concat(DoubleArray.EMPTY);

    // Assert
    assertSame(filledResult, actualConcatResult);
  }

  /**
   * Test {@link DoubleArray#concat(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return toList size is six.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#concat(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test concat(DoubleArray) with 'DoubleArray'; when filled three; then return toList size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.concat(DoubleArray)"})
  void testConcatWithDoubleArray_whenFilledThree_thenReturnToListSizeIsSix() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualConcatResult = filledResult.concat(DoubleArray.filled(3));

    // Assert
    List<Double> toListResult = actualConcatResult.toList();
    assertEquals(6, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertEquals(0.0d, toListResult.get(4).doubleValue());
    assertEquals(0.0d, toListResult.get(5).doubleValue());
    assertEquals(6, actualConcatResult.size());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, actualConcatResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#concat(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#concat(double[])}
   */
  @Test
  @DisplayName("Test concat(double[]) with 'double[]'; given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.concat(double[])"})
  void testConcatWithDouble_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleArray.EMPTY.concat());
  }

  /**
   * Test {@link DoubleArray#concat(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When ten and one.
   *   <li>Then return min is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#concat(double[])}
   */
  @Test
  @DisplayName(
      "Test concat(double[]) with 'double[]'; given EMPTY; when ten and one; then return min is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.concat(double[])"})
  void testConcatWithDouble_givenEmpty_whenTenAndOne_thenReturnMinIsOne() {
    // Arrange and Act
    DoubleArray actualConcatResult = DoubleArray.EMPTY.concat(10.0d, 1.0d, 10.0d, 1.0d);

    // Assert
    assertEquals(1.0d, actualConcatResult.min());
    List<Double> toListResult = actualConcatResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(4, actualConcatResult.size());
    assertArrayEquals(
        new double[] {10.0d, 1.0d, 10.0d, 1.0d}, actualConcatResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DoubleArray#concat(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#concat(double[])}
   */
  @Test
  @DisplayName(
      "Test concat(double[]) with 'double[]'; given filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.concat(double[])"})
  void testConcatWithDouble_givenFilledThree_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualConcatResult = filledResult.concat();

    // Assert
    assertSame(filledResult, actualConcatResult);
  }

  /**
   * Test {@link DoubleArray#concat(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten and one.
   *   <li>Then return toList size is seven.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#concat(double[])}
   */
  @Test
  @DisplayName(
      "Test concat(double[]) with 'double[]'; given filled three; when ten and one; then return toList size is seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.concat(double[])"})
  void testConcatWithDouble_givenFilledThree_whenTenAndOne_thenReturnToListSizeIsSeven() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualConcatResult = filledResult.concat(10.0d, 1.0d, 10.0d, 1.0d);

    // Assert
    List<Double> toListResult = actualConcatResult.toList();
    assertEquals(7, toListResult.size());
    assertEquals(1.0d, toListResult.get(4).doubleValue());
    assertEquals(1.0d, toListResult.get(6).doubleValue());
    assertEquals(10.0d, toListResult.get(5).doubleValue());
    assertEquals(7, actualConcatResult.size());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 10.0d, 1.0d, 10.0d, 1.0d},
        actualConcatResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DoubleArray#sorted()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#sorted()}
   */
  @Test
  @DisplayName("Test sorted(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.sorted()"})
  void testSorted_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleArray.EMPTY, DoubleArray.EMPTY.sorted());
  }

  /**
   * Test {@link DoubleArray#sorted()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#sorted()}
   */
  @Test
  @DisplayName("Test sorted(); given filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DoubleArray.sorted()"})
  void testSorted_givenFilledThree_thenReturnFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act
    DoubleArray actualSortedResult = filledResult.sorted();

    // Assert
    assertEquals(filledResult, actualSortedResult);
  }

  /**
   * Test {@link DoubleArray#min()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#min()}
   */
  @Test
  @DisplayName("Test min(); given DoubleArray with value is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.min()"})
  void testMin_givenDoubleArrayWithValueIsTen_thenReturnTen() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.min());
  }

  /**
   * Test {@link DoubleArray#min()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#min()}
   */
  @Test
  @DisplayName("Test min(); given EMPTY; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.min()"})
  void testMin_givenEmpty_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> DoubleArray.EMPTY.min());
  }

  /**
   * Test {@link DoubleArray#min()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#min()}
   */
  @Test
  @DisplayName("Test min(); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.min()"})
  void testMin_givenFilledThree_thenReturnZero() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(0.0d, filledResult.min());
  }

  /**
   * Test {@link DoubleArray#max()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#max()}
   */
  @Test
  @DisplayName("Test max(); given DoubleArray with value is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.max()"})
  void testMax_givenDoubleArrayWithValueIsTen_thenReturnTen() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.max());
  }

  /**
   * Test {@link DoubleArray#max()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#max()}
   */
  @Test
  @DisplayName("Test max(); given EMPTY; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.max()"})
  void testMax_givenEmpty_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> DoubleArray.EMPTY.max());
  }

  /**
   * Test {@link DoubleArray#max()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#max()}
   */
  @Test
  @DisplayName("Test max(); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.max()"})
  void testMax_givenFilledThree_thenReturnZero() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(0.0d, filledResult.max());
  }

  /**
   * Test {@link DoubleArray#sum()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#sum()}
   */
  @Test
  @DisplayName("Test sum(); given EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.sum()"})
  void testSum_givenEmpty() {
    // Arrange, Act and Assert
    assertEquals(0.0d, DoubleArray.EMPTY.sum());
  }

  /**
   * Test {@link DoubleArray#sum()}.
   *
   * <ul>
   *   <li>Given filled three.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#sum()}
   */
  @Test
  @DisplayName("Test sum(); given filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.sum()"})
  void testSum_givenFilledThree() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(0.0d, filledResult.sum());
  }

  /**
   * Test {@link DoubleArray#reduce(double, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleBinaryOperator}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#reduce(double, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(double, DoubleBinaryOperator); given EMPTY; when DoubleBinaryOperator; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.reduce(double, DoubleBinaryOperator)"})
  void testReduce_givenEmpty_whenDoubleBinaryOperator_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, DoubleArray.EMPTY.reduce(10.0d, mock(DoubleBinaryOperator.class)));
  }

  /**
   * Test {@link DoubleArray#reduce(double, DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then calls {@link DoubleBinaryOperator#applyAsDouble(double, double)}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#reduce(double, DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(double, DoubleBinaryOperator); given ten; then calls applyAsDouble(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArray.reduce(double, DoubleBinaryOperator)"})
  void testReduce_givenTen_thenCallsApplyAsDouble() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    double actualReduceResult = filledResult.reduce(10.0d, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(10.0d, 0.0d);
    assertEquals(10.0d, actualReduceResult);
  }

  /**
   * Test {@link DoubleArray#metaBean()}.
   *
   * <p>Method under test: {@link DoubleArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean DoubleArray.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult = DoubleArray.EMPTY.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test {@link DoubleArray#equalWithTolerance(DoubleArray, double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equalWithTolerance(DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(DoubleArray, double); given EMPTY; when EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equalWithTolerance(DoubleArray, double)"})
  void testEqualWithTolerance_givenEmpty_whenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(DoubleArray.EMPTY.equalWithTolerance(DoubleArray.EMPTY, 10.0d));
  }

  /**
   * Test {@link DoubleArray#equalWithTolerance(DoubleArray, double)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equalWithTolerance(DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(DoubleArray, double); given filled three; when EMPTY; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equalWithTolerance(DoubleArray, double)"})
  void testEqualWithTolerance_givenFilledThree_whenEmpty_thenReturnFalse() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertFalse(filledResult.equalWithTolerance(DoubleArray.EMPTY, 10.0d));
  }

  /**
   * Test {@link DoubleArray#equalWithTolerance(DoubleArray, double)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equalWithTolerance(DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(DoubleArray, double); given filled three; when filled three; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equalWithTolerance(DoubleArray, double)"})
  void testEqualWithTolerance_givenFilledThree_whenFilledThree_thenReturnTrue() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertTrue(filledResult.equalWithTolerance(DoubleArray.filled(3), 10.0d));
  }

  /**
   * Test {@link DoubleArray#equalZeroWithTolerance(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is {@link Double#NaN}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equalZeroWithTolerance(double)}
   */
  @Test
  @DisplayName(
      "Test equalZeroWithTolerance(double); given DoubleArray with value is NaN; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equalZeroWithTolerance(double)"})
  void testEqualZeroWithTolerance_givenDoubleArrayWithValueIsNaN_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(DoubleArray.of(Double.NaN).equalZeroWithTolerance(1.0d));
  }

  /**
   * Test {@link DoubleArray#equalZeroWithTolerance(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equalZeroWithTolerance(double)}
   */
  @Test
  @DisplayName(
      "Test equalZeroWithTolerance(double); given DoubleArray with value is ten; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equalZeroWithTolerance(double)"})
  void testEqualZeroWithTolerance_givenDoubleArrayWithValueIsTen_thenReturnFalse() {
    // Arrange
    DoubleArray ofResult = DoubleArray.of(10.0d);

    // Act and Assert
    assertFalse(ofResult.equalZeroWithTolerance(1.0d));
  }

  /**
   * Test {@link DoubleArray#equalZeroWithTolerance(double)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equalZeroWithTolerance(double)}
   */
  @Test
  @DisplayName("Test equalZeroWithTolerance(double); given EMPTY; when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equalZeroWithTolerance(double)"})
  void testEqualZeroWithTolerance_givenEmpty_whenTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(DoubleArray.EMPTY.equalZeroWithTolerance(10.0d));
  }

  /**
   * Test {@link DoubleArray#equalZeroWithTolerance(double)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equalZeroWithTolerance(double)}
   */
  @Test
  @DisplayName(
      "Test equalZeroWithTolerance(double); given filled three; when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equalZeroWithTolerance(double)"})
  void testEqualZeroWithTolerance_givenFilledThree_whenTen_thenReturnTrue() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertTrue(filledResult.equalZeroWithTolerance(10.0d));
  }

  /**
   * Test {@link DoubleArray#equals(Object)}, and {@link DoubleArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleArray#equals(Object)}
   *   <li>{@link DoubleArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equals(Object)", "int DoubleArray.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleArray doubleArray = DoubleArray.EMPTY;
    DoubleArray doubleArray2 = DoubleArray.EMPTY;

    // Act and Assert
    assertEquals(doubleArray, doubleArray2);
    assertEquals(doubleArray.hashCode(), doubleArray2.hashCode());
  }

  /**
   * Test {@link DoubleArray#equals(Object)}, and {@link DoubleArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleArray#equals(Object)}
   *   <li>{@link DoubleArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equals(Object)", "int DoubleArray.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DoubleArray doubleArray = DoubleArray.EMPTY;

    // Act and Assert
    assertEquals(doubleArray, doubleArray);
    int expectedHashCodeResult = doubleArray.hashCode();
    assertEquals(expectedHashCodeResult, doubleArray.hashCode());
  }

  /**
   * Test {@link DoubleArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equals(Object)", "int DoubleArray.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleArray filledResult = DoubleArray.filled(3);

    // Act and Assert
    assertNotEquals(filledResult, DoubleArray.EMPTY);
  }

  /**
   * Test {@link DoubleArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equals(Object)", "int DoubleArray.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DoubleArray.EMPTY, null);
  }

  /**
   * Test {@link DoubleArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArray.equals(Object)", "int DoubleArray.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DoubleArray.EMPTY, "Different type to DoubleArray");
  }
}
