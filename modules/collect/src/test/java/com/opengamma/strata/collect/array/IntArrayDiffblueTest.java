package com.opengamma.strata.collect.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.IntArray.ImmIterator;
import com.opengamma.strata.collect.array.IntArray.ImmList;
import com.opengamma.strata.collect.array.IntArray.Meta;
import com.opengamma.strata.collect.function.IntIntConsumer;
import com.opengamma.strata.collect.function.IntTernaryOperator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import org.joda.beans.MetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IntArrayDiffblueTest {
  /**
   * Test ImmIterator {@link ImmIterator#add(Integer)} with {@code Integer}.
   *
   * <p>Method under test: {@link ImmIterator#add(Integer)}
   */
  @Test
  @DisplayName("Test ImmIterator add(Integer) with 'Integer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.add(Integer)"})
  void testImmIteratorAddWithInteger() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.add(42));
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
    ImmIterator immIterator = new ImmIterator(new int[] {});

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
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

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
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

    // Act and Assert
    assertFalse(immIterator.hasPrevious());
  }

  /**
   * Test ImmIterator {@link ImmIterator#ImmIterator(int[])}.
   *
   * <p>Method under test: {@link ImmIterator#ImmIterator(int[])}
   */
  @Test
  @DisplayName("Test ImmIterator new ImmIterator(int[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.<init>(int[])"})
  void testImmIteratorNewImmIterator() {
    // Arrange and Act
    ImmIterator actualImmIterator = new ImmIterator(new int[] {1, -1, 1, -1});

    // Assert
    Integer nextResult = actualImmIterator.next();
    Integer nextResult2 = actualImmIterator.next();
    Integer nextResult3 = actualImmIterator.next();
    Integer nextResult4 = actualImmIterator.next();
    boolean actualHasNextResult = actualImmIterator.hasNext();
    assertEquals(-1, nextResult2.intValue());
    assertEquals(-1, nextResult4.intValue());
    assertEquals(1, nextResult.intValue());
    assertEquals(1, nextResult3.intValue());
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
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(0, immIterator.nextIndex());
  }

  /**
   * Test ImmIterator {@link ImmIterator#next()}.
   *
   * <ul>
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmIterator#next()}
   */
  @Test
  @DisplayName("Test ImmIterator next(); then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integer ImmIterator.next()"})
  void testImmIteratorNext_thenReturnIntValueIsOne() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(1, immIterator.next().intValue());
    Integer nextResult = immIterator.next();
    Integer nextResult2 = immIterator.next();
    Integer nextResult3 = immIterator.next();
    assertFalse(immIterator.hasNext());
    assertEquals(-1, nextResult.intValue());
    assertEquals(1, nextResult2.intValue());
    assertEquals(-1, nextResult3.intValue());
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
  @MethodsUnderTest({"Integer ImmIterator.next()"})
  void testImmIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new int[] {});

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
  @MethodsUnderTest({"Integer ImmIterator.previous()"})
  void testImmIteratorPrevious() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

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
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

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
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.remove());
  }

  /**
   * Test ImmIterator {@link ImmIterator#set(Integer)} with {@code Integer}.
   *
   * <p>Method under test: {@link ImmIterator#set(Integer)}
   */
  @Test
  @DisplayName("Test ImmIterator set(Integer) with 'Integer'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.set(Integer)"})
  void testImmIteratorSetWithInteger() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new int[] {1, -1, 1, -1});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.set(42));
  }

  /**
   * Test ImmList {@link ImmList#ImmList(IntArray)}.
   *
   * <p>Method under test: {@link ImmList#ImmList(IntArray)}
   */
  @Test
  @DisplayName("Test ImmList new ImmList(IntArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmList.<init>(IntArray)"})
  void testImmListNewImmList() {
    // Arrange, Act and Assert
    assertTrue(new ImmList(IntArray.EMPTY).isEmpty());
  }

  /**
   * Test {@link IntArray#of()}.
   *
   * <p>Method under test: {@link IntArray#of()}
   */
  @Test
  @DisplayName("Test of()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of()"})
  void testOf() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0, actualOfResult.sum());
    assertEquals(1, actualOfResult.dimensions());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, IntUnaryOperator)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When three.
   *   <li>Then return max is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#of(int, IntUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntUnaryOperator) with 'size', 'valueFunction'; given one; when three; then return max is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, IntUnaryOperator)"})
  void testOfWithSizeValueFunction_givenOne_whenThree_thenReturnMaxIsOne() {
    // Arrange
    IntUnaryOperator valueFunction = mock(IntUnaryOperator.class);
    when(valueFunction.applyAsInt(anyInt())).thenReturn(1);

    // Act
    IntArray actualOfResult = IntArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).applyAsInt(anyInt());
    assertEquals(1, actualOfResult.max());
    assertEquals(1, actualOfResult.min());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1, toListResult.get(0).intValue());
    assertEquals(1, toListResult.get(1).intValue());
    assertEquals(1, toListResult.get(2).intValue());
    assertEquals(3, actualOfResult.size());
    assertEquals(3, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {1, 1, 1}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, IntUnaryOperator)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#of(int, IntUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntUnaryOperator) with 'size', 'valueFunction'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, IntUnaryOperator)"})
  void testOfWithSizeValueFunction_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(0, mock(IntUnaryOperator.class));

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0, actualOfResult.sum());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int)} with {@code value}.
   *
   * <p>Method under test: {@link IntArray#of(int)}
   */
  @Test
  @DisplayName("Test of(int) with 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int)"})
  void testOfWithValue() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(1, actualOfResult.size());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    assertEquals(42, actualOfResult.sum());
    assertEquals(42, toListResult.get(0).intValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int)} with {@code value1}, {@code value2}.
   *
   * <p>Method under test: {@link IntArray#of(int, int)}
   */
  @Test
  @DisplayName("Test of(int, int) with 'value1', 'value2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int)"})
  void testOfWithValue1Value2() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(2, actualOfResult.size());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(84, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42, 42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int, int)} with {@code value1}, {@code value2}, {@code value3}.
   *
   * <p>Method under test: {@link IntArray#of(int, int, int)}
   */
  @Test
  @DisplayName("Test of(int, int, int) with 'value1', 'value2', 'value3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int, int)"})
  void testOfWithValue1Value2Value3() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42, 42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(126, actualOfResult.sum());
    assertEquals(3, actualOfResult.size());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42, 42, 42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int, int, int)} with {@code value1}, {@code value2}, {@code
   * value3}, {@code value4}.
   *
   * <p>Method under test: {@link IntArray#of(int, int, int, int)}
   */
  @Test
  @DisplayName("Test of(int, int, int, int) with 'value1', 'value2', 'value3', 'value4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int, int, int)"})
  void testOfWithValue1Value2Value3Value4() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42, 42, 42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(168, actualOfResult.sum());
    assertEquals(4, actualOfResult.size());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertEquals(42, toListResult.get(3).intValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42, 42, 42, 42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int, int, int, int)} with {@code value1}, {@code value2}, {@code
   * value3}, {@code value4}, {@code value5}.
   *
   * <p>Method under test: {@link IntArray#of(int, int, int, int, int)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, int, int, int) with 'value1', 'value2', 'value3', 'value4', 'value5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int, int, int, int)"})
  void testOfWithValue1Value2Value3Value4Value5() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42, 42, 42, 42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(210, actualOfResult.sum());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(5, toListResult.size());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertEquals(42, toListResult.get(3).intValue());
    assertEquals(42, toListResult.get(4).intValue());
    assertEquals(5, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42, 42, 42, 42, 42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int, int, int, int, int)} with {@code value1}, {@code value2},
   * {@code value3}, {@code value4}, {@code value5}, {@code value6}.
   *
   * <p>Method under test: {@link IntArray#of(int, int, int, int, int, int)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, int, int, int, int) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int, int, int, int, int)"})
  void testOfWithValue1Value2Value3Value4Value5Value6() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42, 42, 42, 42, 42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(252, actualOfResult.sum());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(6, toListResult.size());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertEquals(42, toListResult.get(3).intValue());
    assertEquals(42, toListResult.get(4).intValue());
    assertEquals(42, toListResult.get(5).intValue());
    assertEquals(6, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42, 42, 42, 42, 42, 42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int, int, int, int, int, int)} with {@code value1}, {@code
   * value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}, {@code value7}.
   *
   * <p>Method under test: {@link IntArray#of(int, int, int, int, int, int, int)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, int, int, int, int, int) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int, int, int, int, int, int)"})
  void testOfWithValue1Value2Value3Value4Value5Value6Value7() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42, 42, 42, 42, 42, 42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(294, actualOfResult.sum());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(7, toListResult.size());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertEquals(42, toListResult.get(4).intValue());
    assertEquals(42, toListResult.get(5).intValue());
    assertEquals(42, toListResult.get(6).intValue());
    assertEquals(7, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42, 42, 42, 42, 42, 42, 42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int, int, int, int, int, int, int)} with {@code value1}, {@code
   * value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}, {@code value7}, {@code
   * value8}.
   *
   * <p>Method under test: {@link IntArray#of(int, int, int, int, int, int, int, int)}
   */
  @Test
  @DisplayName(
      "Test of(int, int, int, int, int, int, int, int) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7', 'value8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int, int, int, int, int, int, int)"})
  void testOfWithValue1Value2Value3Value4Value5Value6Value7Value8() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42, 42, 42, 42, 42, 42, 42);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(336, actualOfResult.sum());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, actualOfResult.min());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(8, toListResult.size());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertEquals(42, toListResult.get(5).intValue());
    assertEquals(42, toListResult.get(6).intValue());
    assertEquals(42, toListResult.get(7).intValue());
    assertEquals(8, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new int[] {42, 42, 42, 42, 42, 42, 42, 42}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#of(int, int, int, int, int, int, int, int, int[])} with {@code value1},
   * {@code value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}, {@code value7},
   * {@code value8}, {@code otherValues}.
   *
   * <p>Method under test: {@link IntArray#of(int, int, int, int, int, int, int, int, int[])}
   */
  @Test
  @DisplayName(
      "Test of(int, int, int, int, int, int, int, int, int[]) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7', 'value8', 'otherValues'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.of(int, int, int, int, int, int, int, int, int[])"})
  void testOfWithValue1Value2Value3Value4Value5Value6Value7Value8OtherValues() {
    // Arrange and Act
    IntArray actualOfResult = IntArray.of(42, 42, 42, 42, 42, 42, 42, 42, 42, 1, 42, 1);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(1, actualOfResult.min());
    List<Integer> toListResult = actualOfResult.toList();
    assertEquals(12, toListResult.size());
    assertEquals(1, toListResult.get(11).intValue());
    assertEquals(1, toListResult.get(9).intValue());
    assertEquals(12, actualOfResult.size());
    assertEquals(42, actualOfResult.max());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(10).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertEquals(422, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new int[] {42, 42, 42, 42, 42, 42, 42, 42, 42, 1, 42, 1}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#ofUnsafe(int[])}.
   *
   * <ul>
   *   <li>When array of {@code int} with one and zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#ofUnsafe(int[])}
   */
  @Test
  @DisplayName("Test ofUnsafe(int[]); when array of int with one and zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.ofUnsafe(int[])"})
  void testOfUnsafe_whenArrayOfIntWithOneAndZero_thenReturnMinIsZero() {
    // Arrange and Act
    IntArray actualOfUnsafeResult = IntArray.ofUnsafe(new int[] {1, 0, 1, 0});

    // Assert
    assertEquals(0, actualOfUnsafeResult.min());
    List<Integer> toListResult = actualOfUnsafeResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0, toListResult.get(1).intValue());
    assertEquals(0, toListResult.get(3).intValue());
    assertEquals(1, actualOfUnsafeResult.max());
    assertEquals(1, toListResult.get(0).intValue());
    assertEquals(1, toListResult.get(2).intValue());
    assertEquals(2, actualOfUnsafeResult.sum());
    assertEquals(4, actualOfUnsafeResult.size());
    assertFalse(actualOfUnsafeResult.isEmpty());
    assertArrayEquals(new int[] {1, 0, 1, 0}, actualOfUnsafeResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#ofUnsafe(int[])}.
   *
   * <ul>
   *   <li>When empty array of {@code int}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#ofUnsafe(int[])}
   */
  @Test
  @DisplayName("Test ofUnsafe(int[]); when empty array of int; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.ofUnsafe(int[])"})
  void testOfUnsafe_whenEmptyArrayOfInt_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualOfUnsafeResult = IntArray.ofUnsafe(new int[] {});

    // Assert
    assertEquals(0, actualOfUnsafeResult.size());
    assertEquals(0, actualOfUnsafeResult.sum());
    assertTrue(actualOfUnsafeResult.isEmpty());
    assertTrue(actualOfUnsafeResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualOfUnsafeResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(int[], int, int)} with {@code array}, {@code fromIndexInclusive},
   * {@code toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return max is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(int[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(int[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'; then return max is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(int[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive_thenReturnMaxIsOne() {
    // Arrange and Act
    IntArray actualCopyOfResult = IntArray.copyOf(new int[] {1, 0, 1, 0}, 0, 1);

    // Assert
    assertEquals(1, actualCopyOfResult.max());
    assertEquals(1, actualCopyOfResult.min());
    assertEquals(1, actualCopyOfResult.size());
    assertEquals(1, actualCopyOfResult.sum());
    List<Integer> toListResult = actualCopyOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1, toListResult.get(0).intValue());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new int[] {1}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(int[], int, int)} with {@code array}, {@code fromIndexInclusive},
   * {@code toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(int[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(int[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(int[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualCopyOfResult = IntArray.copyOf(new int[] {1, 0, 1, 0}, 1, 1);

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(int[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(int[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(int[], int) with 'array', 'fromIndex'; when four; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(int[], int)"})
  void testCopyOfWithArrayFromIndex_whenFour_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualCopyOfResult = IntArray.copyOf(new int[] {1, 0, 1, 0}, 4);

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(int[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(int[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(int[], int) with 'array', 'fromIndex'; when one; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(int[], int)"})
  void testCopyOfWithArrayFromIndex_whenOne_thenReturnMinIsZero() {
    // Arrange and Act
    IntArray actualCopyOfResult = IntArray.copyOf(new int[] {1, 0, 1, 0}, 1);

    // Assert
    assertEquals(0, actualCopyOfResult.min());
    List<Integer> toListResult = actualCopyOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0, toListResult.get(0).intValue());
    assertEquals(0, toListResult.get(2).intValue());
    assertEquals(1, actualCopyOfResult.max());
    assertEquals(1, actualCopyOfResult.sum());
    assertEquals(1, toListResult.get(1).intValue());
    assertEquals(3, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new int[] {0, 1, 0}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(int[])} with {@code array}.
   *
   * <ul>
   *   <li>When array of {@code int} with one and zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(int[])}
   */
  @Test
  @DisplayName(
      "Test copyOf(int[]) with 'array'; when array of int with one and zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(int[])"})
  void testCopyOfWithArray_whenArrayOfIntWithOneAndZero_thenReturnMinIsZero() {
    // Arrange and Act
    IntArray actualCopyOfResult = IntArray.copyOf(new int[] {1, 0, 1, 0});

    // Assert
    assertEquals(0, actualCopyOfResult.min());
    List<Integer> toListResult = actualCopyOfResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0, toListResult.get(1).intValue());
    assertEquals(0, toListResult.get(3).intValue());
    assertEquals(1, actualCopyOfResult.max());
    assertEquals(1, toListResult.get(0).intValue());
    assertEquals(1, toListResult.get(2).intValue());
    assertEquals(2, actualCopyOfResult.sum());
    assertEquals(4, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new int[] {1, 0, 1, 0}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(int[])} with {@code array}.
   *
   * <ul>
   *   <li>When empty array of {@code int}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(int[])}
   */
  @Test
  @DisplayName("Test copyOf(int[]) with 'array'; when empty array of int; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(int[])"})
  void testCopyOfWithArray_whenEmptyArrayOfInt_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualCopyOfResult = IntArray.copyOf(new int[] {});

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link ArrayList#ArrayList()} add one.
   *   <li>Then return min is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; given one; when ArrayList() add one; then return min is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(Collection)"})
  void testCopyOfWithCollection_givenOne_whenArrayListAddOne_thenReturnMinIsOne() {
    // Arrange
    ArrayList<Integer> collection = new ArrayList<>();
    collection.add(1);
    collection.add(2);

    // Act
    IntArray actualCopyOfResult = IntArray.copyOf(collection);

    // Assert
    assertEquals(1, actualCopyOfResult.min());
    assertEquals(2, actualCopyOfResult.size());
    assertEquals(3, actualCopyOfResult.sum());
    assertArrayEquals(new int[] {1, 2}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; given two; when ArrayList() add two; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(Collection)"})
  void testCopyOfWithCollection_givenTwo_whenArrayListAddTwo_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Integer> collection = new ArrayList<>();
    collection.add(2);

    // Act
    IntArray actualCopyOfResult = IntArray.copyOf(collection);

    // Assert
    assertEquals(1, actualCopyOfResult.size());
    assertEquals(2, actualCopyOfResult.min());
    assertEquals(2, actualCopyOfResult.sum());
    assertArrayEquals(new int[] {2}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.copyOf(Collection)"})
  void testCopyOfWithCollection_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualCopyOfResult = IntArray.copyOf(new ArrayList<>());

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#filled(int, int)} with {@code size}, {@code value}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return sum is one hundred twenty-six.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#filled(int, int)}
   */
  @Test
  @DisplayName(
      "Test filled(int, int) with 'size', 'value'; when three; then return sum is one hundred twenty-six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.filled(int, int)"})
  void testFilledWithSizeValue_whenThree_thenReturnSumIsOneHundredTwentySix() {
    // Arrange and Act
    IntArray actualFilledResult = IntArray.filled(3, 42);

    // Assert
    assertEquals(126, actualFilledResult.sum());
    assertEquals(3, actualFilledResult.size());
    List<Integer> toListResult = actualFilledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(42, actualFilledResult.max());
    assertEquals(42, actualFilledResult.min());
    assertEquals(42, toListResult.get(0).intValue());
    assertEquals(42, toListResult.get(1).intValue());
    assertEquals(42, toListResult.get(2).intValue());
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new int[] {42, 42, 42}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#filled(int, int)} with {@code size}, {@code value}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#filled(int, int)}
   */
  @Test
  @DisplayName("Test filled(int, int) with 'size', 'value'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.filled(int, int)"})
  void testFilledWithSizeValue_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualFilledResult = IntArray.filled(0, 42);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertEquals(0, actualFilledResult.sum());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#filled(int)} with {@code size}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#filled(int)}
   */
  @Test
  @DisplayName("Test filled(int) with 'size'; when three; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.filled(int)"})
  void testFilledWithSize_whenThree_thenReturnMaxIsZero() {
    // Arrange and Act
    IntArray actualFilledResult = IntArray.filled(3);

    // Assert
    assertEquals(0, actualFilledResult.max());
    assertEquals(0, actualFilledResult.min());
    List<Integer> toListResult = actualFilledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0, toListResult.get(0).intValue());
    assertEquals(0, toListResult.get(1).intValue());
    assertEquals(0, toListResult.get(2).intValue());
    assertEquals(3, actualFilledResult.size());
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new int[] {0, 0, 0}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#filled(int)} with {@code size}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#filled(int)}
   */
  @Test
  @DisplayName("Test filled(int) with 'size'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.filled(int)"})
  void testFilledWithSize_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    IntArray actualFilledResult = IntArray.filled(0);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.toList().isEmpty());
    assertArrayEquals(new int[] {}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#dimensions()}.
   *
   * <p>Method under test: {@link IntArray#dimensions()}
   */
  @Test
  @DisplayName("Test dimensions()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.dimensions()"})
  void testDimensions() {
    // Arrange, Act and Assert
    assertEquals(1, IntArray.EMPTY.dimensions());
  }

  /**
   * Test {@link IntArray#size()}.
   *
   * <p>Method under test: {@link IntArray#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, IntArray.EMPTY.size());
  }

  /**
   * Test {@link IntArray#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(IntArray.EMPTY.isEmpty());
  }

  /**
   * Test {@link IntArray#isEmpty()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given filled three; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.isEmpty()"})
  void testIsEmpty_givenFilledThree_thenReturnFalse() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertFalse(filledResult.isEmpty());
  }

  /**
   * Test {@link IntArray#get(int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.get(int)"})
  void testGet_givenFilledThree_thenReturnZero() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertEquals(0, filledResult.get(1));
  }

  /**
   * Test {@link IntArray#contains(int)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#contains(int)}
   */
  @Test
  @DisplayName("Test contains(int); given EMPTY; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.contains(int)"})
  void testContains_givenEmpty_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IntArray.EMPTY.contains(42));
  }

  /**
   * Test {@link IntArray#contains(int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#contains(int)}
   */
  @Test
  @DisplayName("Test contains(int); given filled three; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.contains(int)"})
  void testContains_givenFilledThree_thenReturnFalse() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertFalse(filledResult.contains(42));
  }

  /**
   * Test {@link IntArray#contains(int)}.
   *
   * <ul>
   *   <li>Given {@link IntArray} with value is forty-two.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#contains(int)}
   */
  @Test
  @DisplayName("Test contains(int); given IntArray with value is forty-two; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.contains(int)"})
  void testContains_givenIntArrayWithValueIsFortyTwo_thenReturnTrue() {
    // Arrange
    IntArray ofResult = IntArray.of(42);

    // Act and Assert
    assertTrue(ofResult.contains(42));
  }

  /**
   * Test {@link IntArray#indexOf(int)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#indexOf(int)}
   */
  @Test
  @DisplayName("Test indexOf(int); given EMPTY; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.indexOf(int)"})
  void testIndexOf_givenEmpty_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, IntArray.EMPTY.indexOf(42));
  }

  /**
   * Test {@link IntArray#indexOf(int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#indexOf(int)}
   */
  @Test
  @DisplayName("Test indexOf(int); given filled three; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.indexOf(int)"})
  void testIndexOf_givenFilledThree_thenReturnMinusOne() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertEquals(-1, filledResult.indexOf(42));
  }

  /**
   * Test {@link IntArray#indexOf(int)}.
   *
   * <ul>
   *   <li>Given {@link IntArray} with value is forty-two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#indexOf(int)}
   */
  @Test
  @DisplayName("Test indexOf(int); given IntArray with value is forty-two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.indexOf(int)"})
  void testIndexOf_givenIntArrayWithValueIsFortyTwo_thenReturnZero() {
    // Arrange
    IntArray ofResult = IntArray.of(42);

    // Act and Assert
    assertEquals(0, ofResult.indexOf(42));
  }

  /**
   * Test {@link IntArray#lastIndexOf(int)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#lastIndexOf(int)}
   */
  @Test
  @DisplayName("Test lastIndexOf(int); given EMPTY; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.lastIndexOf(int)"})
  void testLastIndexOf_givenEmpty_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, IntArray.EMPTY.lastIndexOf(42));
  }

  /**
   * Test {@link IntArray#lastIndexOf(int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#lastIndexOf(int)}
   */
  @Test
  @DisplayName("Test lastIndexOf(int); given filled three; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.lastIndexOf(int)"})
  void testLastIndexOf_givenFilledThree_thenReturnMinusOne() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertEquals(-1, filledResult.lastIndexOf(42));
  }

  /**
   * Test {@link IntArray#lastIndexOf(int)}.
   *
   * <ul>
   *   <li>Given {@link IntArray} with value is forty-two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#lastIndexOf(int)}
   */
  @Test
  @DisplayName("Test lastIndexOf(int); given IntArray with value is forty-two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.lastIndexOf(int)"})
  void testLastIndexOf_givenIntArrayWithValueIsFortyTwo_thenReturnZero() {
    // Arrange
    IntArray ofResult = IntArray.of(42);

    // Act and Assert
    assertEquals(0, ofResult.lastIndexOf(42));
  }

  /**
   * Test {@link IntArray#subArray(int, int)} with {@code fromIndexInclusive}, {@code
   * toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#subArray(int, int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int, int) with 'fromIndexInclusive', 'toIndexExclusive'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.subArray(int, int)"})
  void testSubArrayWithFromIndexInclusiveToIndexExclusive_thenReturnEmpty() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertSame(IntArray.EMPTY, filledResult.subArray(1, 1));
  }

  /**
   * Test {@link IntArray#subArray(int, int)} with {@code fromIndexInclusive}, {@code
   * toIndexExclusive}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#subArray(int, int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int, int) with 'fromIndexInclusive', 'toIndexExclusive'; when zero; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.subArray(int, int)"})
  void testSubArrayWithFromIndexInclusiveToIndexExclusive_whenZero_thenReturnMaxIsZero() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualSubArrayResult = filledResult.subArray(0, 1);

    // Assert
    assertEquals(0, actualSubArrayResult.max());
    assertEquals(0, actualSubArrayResult.min());
    List<Integer> toListResult = actualSubArrayResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0, toListResult.get(0).intValue());
    assertEquals(1, actualSubArrayResult.size());
    assertFalse(actualSubArrayResult.isEmpty());
    assertArrayEquals(new int[] {0}, actualSubArrayResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#subArray(int)} with {@code fromIndexInclusive}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When one.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#subArray(int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int) with 'fromIndexInclusive'; given filled three; when one; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.subArray(int)"})
  void testSubArrayWithFromIndexInclusive_givenFilledThree_whenOne_thenReturnMaxIsZero() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualSubArrayResult = filledResult.subArray(1);

    // Assert
    assertEquals(0, actualSubArrayResult.max());
    assertEquals(0, actualSubArrayResult.min());
    List<Integer> toListResult = actualSubArrayResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0, toListResult.get(0).intValue());
    assertEquals(0, toListResult.get(1).intValue());
    assertEquals(2, actualSubArrayResult.size());
    assertFalse(actualSubArrayResult.isEmpty());
    assertArrayEquals(new int[] {0, 0}, actualSubArrayResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#subArray(int)} with {@code fromIndexInclusive}.
   *
   * <ul>
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#subArray(int)}
   */
  @Test
  @DisplayName("Test subArray(int) with 'fromIndexInclusive'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.subArray(int)"})
  void testSubArrayWithFromIndexInclusive_thenReturnEmpty() {
    // Arrange
    IntArray ofResult = IntArray.of(42);

    // Act and Assert
    assertSame(IntArray.EMPTY, ofResult.subArray(1));
  }

  /**
   * Test {@link IntArray#toArray()}.
   *
   * <p>Method under test: {@link IntArray#toArray()}
   */
  @Test
  @DisplayName("Test toArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] IntArray.toArray()"})
  void testToArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[] {}, IntArray.EMPTY.toArray());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntArray#toString()}
   *   <li>{@link IntArray#toArrayUnsafe()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] IntArray.toArrayUnsafe()", "String IntArray.toString()"})
  void testGettersAndSetters() {
    // Arrange
    IntArray ofResult = IntArray.of();

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("[]", actualToStringResult);
    assertArrayEquals(new int[] {}, ofResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#toList()}.
   *
   * <p>Method under test: {@link IntArray#toList()}
   */
  @Test
  @DisplayName("Test toList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List IntArray.toList()"})
  void testToList() {
    // Arrange, Act and Assert
    assertTrue(IntArray.EMPTY.toList().isEmpty());
  }

  /**
   * Test {@link IntArray#forEach(IntIntConsumer)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link IntIntConsumer} {@link IntIntConsumer#accept(int, int)} does nothing.
   *   <li>Then calls {@link IntIntConsumer#accept(int, int)}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#forEach(IntIntConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(IntIntConsumer); given filled three; when IntIntConsumer accept(int, int) does nothing; then calls accept(int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IntArray.forEach(IntIntConsumer)"})
  void testForEach_givenFilledThree_whenIntIntConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    IntIntConsumer action = mock(IntIntConsumer.class);
    doNothing().when(action).accept(anyInt(), anyInt());

    // Act
    filledResult.forEach(action);

    // Assert
    verify(action, atLeast(1)).accept(anyInt(), eq(0));
  }

  /**
   * Test {@link IntArray#with(int, int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When forty-two.
   *   <li>Then return toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#with(int, int)}
   */
  @Test
  @DisplayName(
      "Test with(int, int); given filled three; when forty-two; then return toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.with(int, int)"})
  void testWith_givenFilledThree_whenFortyTwo_thenReturnToListSizeIsThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualWithResult = filledResult.with(1, 42);

    // Assert
    List<Integer> toListResult = actualWithResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(42, actualWithResult.max());
    assertEquals(42, actualWithResult.sum());
    assertEquals(42, toListResult.get(1).intValue());
    assertArrayEquals(new int[] {0, 42, 0}, actualWithResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#with(int, int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When zero.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#with(int, int)}
   */
  @Test
  @DisplayName("Test with(int, int); given filled three; when zero; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.with(int, int)"})
  void testWith_givenFilledThree_whenZero_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualWithResult = filledResult.with(1, 0);

    // Assert
    assertSame(filledResult, actualWithResult);
  }

  /**
   * Test {@link IntArray#plus(int)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#plus(int)}
   */
  @Test
  @DisplayName("Test plus(int) with 'amount'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.plus(int)"})
  void testPlusWithAmount_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.plus(10));
  }

  /**
   * Test {@link IntArray#plus(int)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#plus(int)}
   */
  @Test
  @DisplayName("Test plus(int) with 'amount'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.plus(int)"})
  void testPlusWithAmount_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(IntArray.EMPTY, IntArray.EMPTY.plus(0));
  }

  /**
   * Test {@link IntArray#plus(int)} with {@code amount}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#plus(int)}
   */
  @Test
  @DisplayName("Test plus(int) with 'amount'; given filled three; when ten; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.plus(int)"})
  void testPlusWithAmount_givenFilledThree_whenTen_thenReturnMaxIsTen() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualPlusResult = filledResult.plus(10);

    // Assert
    assertEquals(10, actualPlusResult.max());
    assertEquals(10, actualPlusResult.min());
    List<Integer> toListResult = actualPlusResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10, toListResult.get(0).intValue());
    assertEquals(10, toListResult.get(1).intValue());
    assertEquals(10, toListResult.get(2).intValue());
    assertEquals(3, actualPlusResult.size());
    assertEquals(30, actualPlusResult.sum());
    assertFalse(actualPlusResult.isEmpty());
    assertArrayEquals(new int[] {10, 10, 10}, actualPlusResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#plus(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#plus(IntArray)}
   */
  @Test
  @DisplayName("Test plus(IntArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.plus(IntArray)"})
  void testPlusWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.plus(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#plus(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#plus(IntArray)}
   */
  @Test
  @DisplayName(
      "Test plus(IntArray) with 'other'; given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.plus(IntArray)"})
  void testPlusWithOther_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.plus(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#plus(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#plus(IntArray)}
   */
  @Test
  @DisplayName(
      "Test plus(IntArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.plus(IntArray)"})
  void testPlusWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualPlusResult = filledResult.plus(IntArray.filled(3));

    // Assert
    assertEquals(filledResult, actualPlusResult);
  }

  /**
   * Test {@link IntArray#minus(int)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#minus(int)}
   */
  @Test
  @DisplayName("Test minus(int) with 'amount'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.minus(int)"})
  void testMinusWithAmount_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.minus(10));
  }

  /**
   * Test {@link IntArray#minus(int)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#minus(int)}
   */
  @Test
  @DisplayName("Test minus(int) with 'amount'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.minus(int)"})
  void testMinusWithAmount_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(IntArray.EMPTY, IntArray.EMPTY.minus(0));
  }

  /**
   * Test {@link IntArray#minus(int)} with {@code amount}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return max is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#minus(int)}
   */
  @Test
  @DisplayName(
      "Test minus(int) with 'amount'; given filled three; when ten; then return max is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.minus(int)"})
  void testMinusWithAmount_givenFilledThree_whenTen_thenReturnMaxIsMinusTen() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualMinusResult = filledResult.minus(10);

    // Assert
    assertEquals(-10, actualMinusResult.max());
    assertEquals(-10, actualMinusResult.min());
    List<Integer> toListResult = actualMinusResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-10, toListResult.get(0).intValue());
    assertEquals(-10, toListResult.get(1).intValue());
    assertEquals(-10, toListResult.get(2).intValue());
    assertEquals(-30, actualMinusResult.sum());
    assertEquals(3, actualMinusResult.size());
    assertFalse(actualMinusResult.isEmpty());
    assertArrayEquals(new int[] {-10, -10, -10}, actualMinusResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#minus(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#minus(IntArray)}
   */
  @Test
  @DisplayName("Test minus(IntArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.minus(IntArray)"})
  void testMinusWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.minus(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#minus(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#minus(IntArray)}
   */
  @Test
  @DisplayName(
      "Test minus(IntArray) with 'other'; given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.minus(IntArray)"})
  void testMinusWithOther_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.minus(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#minus(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#minus(IntArray)}
   */
  @Test
  @DisplayName(
      "Test minus(IntArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.minus(IntArray)"})
  void testMinusWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualMinusResult = filledResult.minus(IntArray.filled(3));

    // Assert
    assertEquals(filledResult, actualMinusResult);
  }

  /**
   * Test {@link IntArray#multipliedBy(int)} with {@code factor}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#multipliedBy(int)}
   */
  @Test
  @DisplayName("Test multipliedBy(int) with 'factor'; given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.multipliedBy(int)"})
  void testMultipliedByWithFactor_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(IntArray.EMPTY, IntArray.EMPTY.multipliedBy(1));
  }

  /**
   * Test {@link IntArray#multipliedBy(int)} with {@code factor}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When three.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#multipliedBy(int)}
   */
  @Test
  @DisplayName("Test multipliedBy(int) with 'factor'; given EMPTY; when three; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.multipliedBy(int)"})
  void testMultipliedByWithFactor_givenEmpty_whenThree_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.multipliedBy(3));
  }

  /**
   * Test {@link IntArray#multipliedBy(int)} with {@code factor}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#multipliedBy(int)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(int) with 'factor'; given filled three; when three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.multipliedBy(int)"})
  void testMultipliedByWithFactor_givenFilledThree_whenThree_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualMultipliedByResult = filledResult.multipliedBy(3);

    // Assert
    assertEquals(filledResult, actualMultipliedByResult);
  }

  /**
   * Test {@link IntArray#multipliedBy(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#multipliedBy(IntArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(IntArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.multipliedBy(IntArray)"})
  void testMultipliedByWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.multipliedBy(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#multipliedBy(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#multipliedBy(IntArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(IntArray) with 'other'; given filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.multipliedBy(IntArray)"})
  void testMultipliedByWithOther_givenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.multipliedBy(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#multipliedBy(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#multipliedBy(IntArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(IntArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.multipliedBy(IntArray)"})
  void testMultipliedByWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualMultipliedByResult = filledResult.multipliedBy(IntArray.filled(3));

    // Assert
    assertEquals(filledResult, actualMultipliedByResult);
  }

  /**
   * Test {@link IntArray#dividedBy(int)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#dividedBy(int)}
   */
  @Test
  @DisplayName("Test dividedBy(int) with 'divisor'; given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.dividedBy(int)"})
  void testDividedByWithDivisor_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(IntArray.EMPTY, IntArray.EMPTY.dividedBy(1));
  }

  /**
   * Test {@link IntArray#dividedBy(int)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#dividedBy(int)}
   */
  @Test
  @DisplayName("Test dividedBy(int) with 'divisor'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.dividedBy(int)"})
  void testDividedByWithDivisor_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.dividedBy(0));
  }

  /**
   * Test {@link IntArray#dividedBy(int)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#dividedBy(int)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(int) with 'divisor'; given filled three; when three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.dividedBy(int)"})
  void testDividedByWithDivisor_givenFilledThree_whenThree_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualDividedByResult = filledResult.dividedBy(3);

    // Assert
    assertEquals(filledResult, actualDividedByResult);
  }

  /**
   * Test {@link IntArray#dividedBy(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#dividedBy(IntArray)}
   */
  @Test
  @DisplayName("Test dividedBy(IntArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.dividedBy(IntArray)"})
  void testDividedByWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.dividedBy(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#dividedBy(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#dividedBy(IntArray)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(IntArray) with 'other'; given filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.dividedBy(IntArray)"})
  void testDividedByWithOther_givenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.dividedBy(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#dividedBy(IntArray)} with {@code other}.
   *
   * <ul>
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#dividedBy(IntArray)}
   */
  @Test
  @DisplayName("Test dividedBy(IntArray) with 'other'; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.dividedBy(IntArray)"})
  void testDividedByWithOther_thenReturnDimensionsIsOne() {
    // Arrange
    IntArray ofResult = IntArray.of(42);

    // Act
    IntArray actualDividedByResult = ofResult.dividedBy(IntArray.of(42));

    // Assert
    assertEquals(1, actualDividedByResult.dimensions());
    assertEquals(1, actualDividedByResult.max());
    assertEquals(1, actualDividedByResult.min());
    assertEquals(1, actualDividedByResult.size());
    assertEquals(1, actualDividedByResult.sum());
    List<Integer> toListResult = actualDividedByResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1, toListResult.get(0).intValue());
    assertFalse(actualDividedByResult.isEmpty());
    assertArrayEquals(new int[] {1}, actualDividedByResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#map(IntUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntUnaryOperator}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#map(IntUnaryOperator)}
   */
  @Test
  @DisplayName("Test map(IntUnaryOperator); given EMPTY; when IntUnaryOperator; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.map(IntUnaryOperator)"})
  void testMap_givenEmpty_whenIntUnaryOperator_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.map(mock(IntUnaryOperator.class)));
  }

  /**
   * Test {@link IntArray#map(IntUnaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#map(IntUnaryOperator)}
   */
  @Test
  @DisplayName("Test map(IntUnaryOperator); given one; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.map(IntUnaryOperator)"})
  void testMap_givenOne_thenReturnDimensionsIsOne() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    IntUnaryOperator operator = mock(IntUnaryOperator.class);
    when(operator.applyAsInt(anyInt())).thenReturn(1);

    // Act
    IntArray actualMapResult = filledResult.map(operator);

    // Assert
    verify(operator, atLeast(1)).applyAsInt(0);
    assertEquals(1, actualMapResult.dimensions());
    assertEquals(1, actualMapResult.max());
    assertEquals(1, actualMapResult.min());
    List<Integer> toListResult = actualMapResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1, toListResult.get(0).intValue());
    assertEquals(1, toListResult.get(1).intValue());
    assertEquals(1, toListResult.get(2).intValue());
    assertEquals(3, actualMapResult.size());
    assertEquals(3, actualMapResult.sum());
    assertFalse(actualMapResult.isEmpty());
    assertArrayEquals(new int[] {1, 1, 1}, actualMapResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#mapWithIndex(IntBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntBinaryOperator}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#mapWithIndex(IntBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(IntBinaryOperator); given EMPTY; when IntBinaryOperator; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.mapWithIndex(IntBinaryOperator)"})
  void testMapWithIndex_givenEmpty_whenIntBinaryOperator_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(IntArray.EMPTY, IntArray.EMPTY.mapWithIndex(mock(IntBinaryOperator.class)));
  }

  /**
   * Test {@link IntArray#mapWithIndex(IntBinaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#mapWithIndex(IntBinaryOperator)}
   */
  @Test
  @DisplayName("Test mapWithIndex(IntBinaryOperator); given one; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.mapWithIndex(IntBinaryOperator)"})
  void testMapWithIndex_givenOne_thenReturnDimensionsIsOne() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    IntBinaryOperator function = mock(IntBinaryOperator.class);
    when(function.applyAsInt(anyInt(), anyInt())).thenReturn(1);

    // Act
    IntArray actualMapWithIndexResult = filledResult.mapWithIndex(function);

    // Assert
    verify(function, atLeast(1)).applyAsInt(anyInt(), eq(0));
    assertEquals(1, actualMapWithIndexResult.dimensions());
    assertEquals(1, actualMapWithIndexResult.max());
    assertEquals(1, actualMapWithIndexResult.min());
    List<Integer> toListResult = actualMapWithIndexResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1, toListResult.get(0).intValue());
    assertEquals(1, toListResult.get(1).intValue());
    assertEquals(1, toListResult.get(2).intValue());
    assertEquals(3, actualMapWithIndexResult.size());
    assertEquals(3, actualMapWithIndexResult.sum());
    assertFalse(actualMapWithIndexResult.isEmpty());
    assertArrayEquals(new int[] {1, 1, 1}, actualMapWithIndexResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#combine(IntArray, IntBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#combine(IntArray, IntBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(IntArray, IntBinaryOperator); given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.combine(IntArray, IntBinaryOperator)"})
  void testCombine_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        IntArray.EMPTY, IntArray.EMPTY.combine(IntArray.EMPTY, mock(IntBinaryOperator.class)));
  }

  /**
   * Test {@link IntArray#combine(IntArray, IntBinaryOperator)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#combine(IntArray, IntBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(IntArray, IntBinaryOperator); given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.combine(IntArray, IntBinaryOperator)"})
  void testCombine_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> filledResult.combine(IntArray.EMPTY, mock(IntBinaryOperator.class)));
  }

  /**
   * Test {@link IntArray#combine(IntArray, IntBinaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#combine(IntArray, IntBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(IntArray, IntBinaryOperator); given one; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.combine(IntArray, IntBinaryOperator)"})
  void testCombine_givenOne_thenReturnDimensionsIsOne() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);
    IntArray other = IntArray.filled(3);

    IntBinaryOperator operator = mock(IntBinaryOperator.class);
    when(operator.applyAsInt(anyInt(), anyInt())).thenReturn(1);

    // Act
    IntArray actualCombineResult = filledResult.combine(other, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsInt(0, 0);
    assertEquals(1, actualCombineResult.dimensions());
    assertEquals(1, actualCombineResult.max());
    assertEquals(1, actualCombineResult.min());
    List<Integer> toListResult = actualCombineResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1, toListResult.get(0).intValue());
    assertEquals(1, toListResult.get(1).intValue());
    assertEquals(1, toListResult.get(2).intValue());
    assertEquals(3, actualCombineResult.size());
    assertEquals(3, actualCombineResult.sum());
    assertFalse(actualCombineResult.isEmpty());
    assertArrayEquals(new int[] {1, 1, 1}, actualCombineResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#combineReduce(IntArray, IntTernaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#combineReduce(IntArray, IntTernaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineReduce(IntArray, IntTernaryOperator); given EMPTY; when EMPTY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.combineReduce(IntArray, IntTernaryOperator)"})
  void testCombineReduce_givenEmpty_whenEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, IntArray.EMPTY.combineReduce(IntArray.EMPTY, mock(IntTernaryOperator.class)));
  }

  /**
   * Test {@link IntArray#combineReduce(IntArray, IntTernaryOperator)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#combineReduce(IntArray, IntTernaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineReduce(IntArray, IntTernaryOperator); given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.combineReduce(IntArray, IntTernaryOperator)"})
  void testCombineReduce_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> filledResult.combineReduce(IntArray.EMPTY, mock(IntTernaryOperator.class)));
  }

  /**
   * Test {@link IntArray#combineReduce(IntArray, IntTernaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#combineReduce(IntArray, IntTernaryOperator)}
   */
  @Test
  @DisplayName("Test combineReduce(IntArray, IntTernaryOperator); given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.combineReduce(IntArray, IntTernaryOperator)"})
  void testCombineReduce_givenOne_thenReturnOne() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);
    IntArray other = IntArray.filled(3);

    IntTernaryOperator operator = mock(IntTernaryOperator.class);
    when(operator.applyAsInt(anyInt(), anyInt(), anyInt())).thenReturn(1);

    // Act
    int actualCombineReduceResult = filledResult.combineReduce(other, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsInt(anyInt(), eq(0), eq(0));
    assertEquals(1, actualCombineReduceResult);
  }

  /**
   * Test {@link IntArray#concat(IntArray)} with {@code IntArray}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#concat(IntArray)}
   */
  @Test
  @DisplayName("Test concat(IntArray) with 'IntArray'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.concat(IntArray)"})
  void testConcatWithIntArray_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(IntArray.EMPTY, IntArray.EMPTY.concat(IntArray.EMPTY));
  }

  /**
   * Test {@link IntArray#concat(IntArray)} with {@code IntArray}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link IntArray#EMPTY}.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#concat(IntArray)}
   */
  @Test
  @DisplayName(
      "Test concat(IntArray) with 'IntArray'; given filled three; when EMPTY; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.concat(IntArray)"})
  void testConcatWithIntArray_givenFilledThree_whenEmpty_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualConcatResult = filledResult.concat(IntArray.EMPTY);

    // Assert
    assertSame(filledResult, actualConcatResult);
  }

  /**
   * Test {@link IntArray#concat(IntArray)} with {@code IntArray}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return toList size is six.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#concat(IntArray)}
   */
  @Test
  @DisplayName(
      "Test concat(IntArray) with 'IntArray'; when filled three; then return toList size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.concat(IntArray)"})
  void testConcatWithIntArray_whenFilledThree_thenReturnToListSizeIsSix() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualConcatResult = filledResult.concat(IntArray.filled(3));

    // Assert
    List<Integer> toListResult = actualConcatResult.toList();
    assertEquals(6, toListResult.size());
    assertEquals(0, toListResult.get(3).intValue());
    assertEquals(0, toListResult.get(4).intValue());
    assertEquals(0, toListResult.get(5).intValue());
    assertEquals(6, actualConcatResult.size());
    assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0}, actualConcatResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#concat(int[])} with {@code int[]}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#concat(int[])}
   */
  @Test
  @DisplayName("Test concat(int[]) with 'int[]'; given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.concat(int[])"})
  void testConcatWithInt_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(IntArray.EMPTY, IntArray.EMPTY.concat());
  }

  /**
   * Test {@link IntArray#concat(int[])} with {@code int[]}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When one and zero.
   *   <li>Then return toList size is four.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#concat(int[])}
   */
  @Test
  @DisplayName(
      "Test concat(int[]) with 'int[]'; given EMPTY; when one and zero; then return toList size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.concat(int[])"})
  void testConcatWithInt_givenEmpty_whenOneAndZero_thenReturnToListSizeIsFour() {
    // Arrange and Act
    IntArray actualConcatResult = IntArray.EMPTY.concat(1, 0, 1, 0);

    // Assert
    List<Integer> toListResult = actualConcatResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0, toListResult.get(3).intValue());
    assertEquals(1, toListResult.get(0).intValue());
    assertEquals(1, toListResult.get(2).intValue());
    assertEquals(4, actualConcatResult.size());
    assertArrayEquals(new int[] {1, 0, 1, 0}, actualConcatResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#concat(int[])} with {@code int[]}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#concat(int[])}
   */
  @Test
  @DisplayName("Test concat(int[]) with 'int[]'; given filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.concat(int[])"})
  void testConcatWithInt_givenFilledThree_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualConcatResult = filledResult.concat();

    // Assert
    assertSame(filledResult, actualConcatResult);
  }

  /**
   * Test {@link IntArray#concat(int[])} with {@code int[]}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When one and zero.
   *   <li>Then return toList size is seven.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#concat(int[])}
   */
  @Test
  @DisplayName(
      "Test concat(int[]) with 'int[]'; given filled three; when one and zero; then return toList size is seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.concat(int[])"})
  void testConcatWithInt_givenFilledThree_whenOneAndZero_thenReturnToListSizeIsSeven() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualConcatResult = filledResult.concat(1, 0, 1, 0);

    // Assert
    List<Integer> toListResult = actualConcatResult.toList();
    assertEquals(7, toListResult.size());
    assertEquals(0, toListResult.get(4).intValue());
    assertEquals(0, toListResult.get(6).intValue());
    assertEquals(1, toListResult.get(5).intValue());
    assertEquals(7, actualConcatResult.size());
    assertArrayEquals(new int[] {0, 0, 0, 1, 0, 1, 0}, actualConcatResult.toArrayUnsafe());
  }

  /**
   * Test {@link IntArray#sorted()}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then return {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#sorted()}
   */
  @Test
  @DisplayName("Test sorted(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.sorted()"})
  void testSorted_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(IntArray.EMPTY, IntArray.EMPTY.sorted());
  }

  /**
   * Test {@link IntArray#sorted()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#sorted()}
   */
  @Test
  @DisplayName("Test sorted(); given filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IntArray IntArray.sorted()"})
  void testSorted_givenFilledThree_thenReturnFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act
    IntArray actualSortedResult = filledResult.sorted();

    // Assert
    assertEquals(filledResult, actualSortedResult);
  }

  /**
   * Test {@link IntArray#min()}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#min()}
   */
  @Test
  @DisplayName("Test min(); given EMPTY; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.min()"})
  void testMin_givenEmpty_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> IntArray.EMPTY.min());
  }

  /**
   * Test {@link IntArray#min()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#min()}
   */
  @Test
  @DisplayName("Test min(); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.min()"})
  void testMin_givenFilledThree_thenReturnZero() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertEquals(0, filledResult.min());
  }

  /**
   * Test {@link IntArray#min()}.
   *
   * <ul>
   *   <li>Given {@link IntArray} with value is forty-two.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#min()}
   */
  @Test
  @DisplayName("Test min(); given IntArray with value is forty-two; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.min()"})
  void testMin_givenIntArrayWithValueIsFortyTwo_thenReturnFortyTwo() {
    // Arrange
    IntArray ofResult = IntArray.of(42);

    // Act and Assert
    assertEquals(42, ofResult.min());
  }

  /**
   * Test {@link IntArray#max()}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#max()}
   */
  @Test
  @DisplayName("Test max(); given EMPTY; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.max()"})
  void testMax_givenEmpty_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> IntArray.EMPTY.max());
  }

  /**
   * Test {@link IntArray#max()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#max()}
   */
  @Test
  @DisplayName("Test max(); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.max()"})
  void testMax_givenFilledThree_thenReturnZero() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertEquals(0, filledResult.max());
  }

  /**
   * Test {@link IntArray#max()}.
   *
   * <ul>
   *   <li>Given {@link IntArray} with value is forty-two.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#max()}
   */
  @Test
  @DisplayName("Test max(); given IntArray with value is forty-two; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.max()"})
  void testMax_givenIntArrayWithValueIsFortyTwo_thenReturnFortyTwo() {
    // Arrange
    IntArray ofResult = IntArray.of(42);

    // Act and Assert
    assertEquals(42, ofResult.max());
  }

  /**
   * Test {@link IntArray#sum()}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#sum()}
   */
  @Test
  @DisplayName("Test sum(); given EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.sum()"})
  void testSum_givenEmpty() {
    // Arrange, Act and Assert
    assertEquals(0, IntArray.EMPTY.sum());
  }

  /**
   * Test {@link IntArray#sum()}.
   *
   * <ul>
   *   <li>Given filled three.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#sum()}
   */
  @Test
  @DisplayName("Test sum(); given filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.sum()"})
  void testSum_givenFilledThree() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertEquals(0, filledResult.sum());
  }

  /**
   * Test {@link IntArray#reduce(int, IntBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IntArray#EMPTY}.
   *   <li>When {@link IntBinaryOperator}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#reduce(int, IntBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(int, IntBinaryOperator); given EMPTY; when IntBinaryOperator; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.reduce(int, IntBinaryOperator)"})
  void testReduce_givenEmpty_whenIntBinaryOperator_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, IntArray.EMPTY.reduce(1, mock(IntBinaryOperator.class)));
  }

  /**
   * Test {@link IntArray#reduce(int, IntBinaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link IntBinaryOperator} {@link IntBinaryOperator#applyAsInt(int, int)} return one.
   *   <li>Then calls {@link IntBinaryOperator#applyAsInt(int, int)}.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#reduce(int, IntBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(int, IntBinaryOperator); given one; when IntBinaryOperator applyAsInt(int, int) return one; then calls applyAsInt(int, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int IntArray.reduce(int, IntBinaryOperator)"})
  void testReduce_givenOne_whenIntBinaryOperatorApplyAsIntReturnOne_thenCallsApplyAsInt() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    IntBinaryOperator operator = mock(IntBinaryOperator.class);
    when(operator.applyAsInt(anyInt(), anyInt())).thenReturn(1);

    // Act
    int actualReduceResult = filledResult.reduce(1, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsInt(1, 0);
    assertEquals(1, actualReduceResult);
  }

  /**
   * Test {@link IntArray#metaBean()}.
   *
   * <p>Method under test: {@link IntArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean IntArray.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult = IntArray.EMPTY.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test {@link IntArray#equals(Object)}, and {@link IntArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntArray#equals(Object)}
   *   <li>{@link IntArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.equals(Object)", "int IntArray.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IntArray intArray = IntArray.EMPTY;
    IntArray intArray2 = IntArray.EMPTY;

    // Act and Assert
    assertEquals(intArray, intArray2);
    assertEquals(intArray.hashCode(), intArray2.hashCode());
  }

  /**
   * Test {@link IntArray#equals(Object)}, and {@link IntArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IntArray#equals(Object)}
   *   <li>{@link IntArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.equals(Object)", "int IntArray.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IntArray intArray = IntArray.EMPTY;

    // Act and Assert
    assertEquals(intArray, intArray);
    int expectedHashCodeResult = intArray.hashCode();
    assertEquals(expectedHashCodeResult, intArray.hashCode());
  }

  /**
   * Test {@link IntArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.equals(Object)", "int IntArray.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IntArray filledResult = IntArray.filled(3);

    // Act and Assert
    assertNotEquals(filledResult, IntArray.EMPTY);
  }

  /**
   * Test {@link IntArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.equals(Object)", "int IntArray.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IntArray.EMPTY, null);
  }

  /**
   * Test {@link IntArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IntArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IntArray.equals(Object)", "int IntArray.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IntArray.EMPTY, "Different type to IntArray");
  }
}
