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
import static org.mockito.Mockito.anyLong;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.LongArray.ImmIterator;
import com.opengamma.strata.collect.array.LongArray.ImmList;
import com.opengamma.strata.collect.array.LongArray.Meta;
import com.opengamma.strata.collect.function.IntLongConsumer;
import com.opengamma.strata.collect.function.IntLongToLongFunction;
import com.opengamma.strata.collect.function.LongTernaryOperator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.IntToLongFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import org.joda.beans.MetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LongArrayDiffblueTest {
  /**
   * Test ImmIterator {@link ImmIterator#add(Long)} with {@code Long}.
   *
   * <p>Method under test: {@link ImmIterator#add(Long)}
   */
  @Test
  @DisplayName("Test ImmIterator add(Long) with 'Long'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.add(Long)"})
  void testImmIteratorAddWithLong() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.add(42L));
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
    ImmIterator immIterator = new ImmIterator(new long[] {});

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
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

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
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

    // Act and Assert
    assertFalse(immIterator.hasPrevious());
  }

  /**
   * Test ImmIterator {@link ImmIterator#ImmIterator(long[])}.
   *
   * <p>Method under test: {@link ImmIterator#ImmIterator(long[])}
   */
  @Test
  @DisplayName("Test ImmIterator new ImmIterator(long[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.<init>(long[])"})
  void testImmIteratorNewImmIterator() {
    // Arrange and Act
    ImmIterator actualImmIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

    // Assert
    Long nextResult = actualImmIterator.next();
    Long nextResult2 = actualImmIterator.next();
    Long nextResult3 = actualImmIterator.next();
    Long nextResult4 = actualImmIterator.next();
    boolean actualHasNextResult = actualImmIterator.hasNext();
    assertEquals(-1L, nextResult2.longValue());
    assertEquals(-1L, nextResult4.longValue());
    assertEquals(1L, nextResult.longValue());
    assertEquals(1L, nextResult3.longValue());
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
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

    // Act and Assert
    assertEquals(0, immIterator.nextIndex());
  }

  /**
   * Test ImmIterator {@link ImmIterator#next()}.
   *
   * <ul>
   *   <li>Then return longValue is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmIterator#next()}
   */
  @Test
  @DisplayName("Test ImmIterator next(); then return longValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Long ImmIterator.next()"})
  void testImmIteratorNext_thenReturnLongValueIsOne() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

    // Act and Assert
    assertEquals(1L, immIterator.next().longValue());
    Long nextResult = immIterator.next();
    Long nextResult2 = immIterator.next();
    Long nextResult3 = immIterator.next();
    assertFalse(immIterator.hasNext());
    assertEquals(-1L, nextResult.longValue());
    assertEquals(1L, nextResult2.longValue());
    assertEquals(-1L, nextResult3.longValue());
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
  @MethodsUnderTest({"Long ImmIterator.next()"})
  void testImmIteratorNext_thenThrowNoSuchElementException() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new long[] {});

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
  @MethodsUnderTest({"Long ImmIterator.previous()"})
  void testImmIteratorPrevious() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

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
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

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
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.remove());
  }

  /**
   * Test ImmIterator {@link ImmIterator#set(Long)} with {@code Long}.
   *
   * <p>Method under test: {@link ImmIterator#set(Long)}
   */
  @Test
  @DisplayName("Test ImmIterator set(Long) with 'Long'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmIterator.set(Long)"})
  void testImmIteratorSetWithLong() {
    // Arrange
    ImmIterator immIterator = new ImmIterator(new long[] {1L, -1L, 1L, -1L});

    // Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> immIterator.set(42L));
  }

  /**
   * Test ImmList {@link ImmList#ImmList(LongArray)}.
   *
   * <p>Method under test: {@link ImmList#ImmList(LongArray)}
   */
  @Test
  @DisplayName("Test ImmList new ImmList(LongArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmList.<init>(LongArray)"})
  void testImmListNewImmList() {
    // Arrange, Act and Assert
    assertTrue(new ImmList(LongArray.EMPTY).isEmpty());
  }

  /**
   * Test {@link LongArray#of()}.
   *
   * <p>Method under test: {@link LongArray#of()}
   */
  @Test
  @DisplayName("Test of()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of()"})
  void testOf() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0L, actualOfResult.sum());
    assertEquals(1, actualOfResult.dimensions());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(int, IntToLongFunction)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When three.
   *   <li>Then return max is one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#of(int, IntToLongFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntToLongFunction) with 'size', 'valueFunction'; given one; when three; then return max is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(int, IntToLongFunction)"})
  void testOfWithSizeValueFunction_givenOne_whenThree_thenReturnMaxIsOne() {
    // Arrange
    IntToLongFunction valueFunction = mock(IntToLongFunction.class);
    when(valueFunction.applyAsLong(anyInt())).thenReturn(1L);

    // Act
    LongArray actualOfResult = LongArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).applyAsLong(anyInt());
    assertEquals(1L, actualOfResult.max());
    assertEquals(1L, actualOfResult.min());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1L, toListResult.get(0).longValue());
    assertEquals(1L, toListResult.get(1).longValue());
    assertEquals(1L, toListResult.get(2).longValue());
    assertEquals(3, actualOfResult.size());
    assertEquals(3L, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new long[] {1L, 1L, 1L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(int, IntToLongFunction)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#of(int, IntToLongFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntToLongFunction) with 'size', 'valueFunction'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(int, IntToLongFunction)"})
  void testOfWithSizeValueFunction_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(0, mock(IntToLongFunction.class));

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(0L, actualOfResult.sum());
    assertTrue(actualOfResult.isEmpty());
    assertTrue(actualOfResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long)} with {@code value}.
   *
   * <p>Method under test: {@link LongArray#of(long)}
   */
  @Test
  @DisplayName("Test of(long) with 'value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long)"})
  void testOfWithValue() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(1, actualOfResult.size());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    assertEquals(42L, actualOfResult.sum());
    assertEquals(42L, toListResult.get(0).longValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new long[] {42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long)} with {@code value1}, {@code value2}.
   *
   * <p>Method under test: {@link LongArray#of(long, long)}
   */
  @Test
  @DisplayName("Test of(long, long) with 'value1', 'value2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long, long)"})
  void testOfWithValue1Value2() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L, 42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(2, actualOfResult.size());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(84L, actualOfResult.sum());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new long[] {42L, 42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long, long)} with {@code value1}, {@code value2}, {@code
   * value3}.
   *
   * <p>Method under test: {@link LongArray#of(long, long, long)}
   */
  @Test
  @DisplayName("Test of(long, long, long) with 'value1', 'value2', 'value3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long, long, long)"})
  void testOfWithValue1Value2Value3() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L, 42L, 42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(126L, actualOfResult.sum());
    assertEquals(3, actualOfResult.size());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new long[] {42L, 42L, 42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long, long, long)} with {@code value1}, {@code value2}, {@code
   * value3}, {@code value4}.
   *
   * <p>Method under test: {@link LongArray#of(long, long, long, long)}
   */
  @Test
  @DisplayName("Test of(long, long, long, long) with 'value1', 'value2', 'value3', 'value4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long, long, long, long)"})
  void testOfWithValue1Value2Value3Value4() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L, 42L, 42L, 42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(168L, actualOfResult.sum());
    assertEquals(4, actualOfResult.size());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertEquals(42L, toListResult.get(3).longValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new long[] {42L, 42L, 42L, 42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long, long, long, long)} with {@code value1}, {@code value2},
   * {@code value3}, {@code value4}, {@code value5}.
   *
   * <p>Method under test: {@link LongArray#of(long, long, long, long, long)}
   */
  @Test
  @DisplayName(
      "Test of(long, long, long, long, long) with 'value1', 'value2', 'value3', 'value4', 'value5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long, long, long, long, long)"})
  void testOfWithValue1Value2Value3Value4Value5() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L, 42L, 42L, 42L, 42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(210L, actualOfResult.sum());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(5, toListResult.size());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertEquals(42L, toListResult.get(3).longValue());
    assertEquals(42L, toListResult.get(4).longValue());
    assertEquals(5, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new long[] {42L, 42L, 42L, 42L, 42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long, long, long, long, long)} with {@code value1}, {@code
   * value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}.
   *
   * <p>Method under test: {@link LongArray#of(long, long, long, long, long, long)}
   */
  @Test
  @DisplayName(
      "Test of(long, long, long, long, long, long) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long, long, long, long, long, long)"})
  void testOfWithValue1Value2Value3Value4Value5Value6() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L, 42L, 42L, 42L, 42L, 42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(252L, actualOfResult.sum());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(6, toListResult.size());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertEquals(42L, toListResult.get(3).longValue());
    assertEquals(42L, toListResult.get(4).longValue());
    assertEquals(42L, toListResult.get(5).longValue());
    assertEquals(6, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(new long[] {42L, 42L, 42L, 42L, 42L, 42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long, long, long, long, long, long)} with {@code value1}, {@code
   * value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}, {@code value7}.
   *
   * <p>Method under test: {@link LongArray#of(long, long, long, long, long, long, long)}
   */
  @Test
  @DisplayName(
      "Test of(long, long, long, long, long, long, long) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long, long, long, long, long, long, long)"})
  void testOfWithValue1Value2Value3Value4Value5Value6Value7() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L, 42L, 42L, 42L, 42L, 42L, 42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(294L, actualOfResult.sum());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(7, toListResult.size());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertEquals(42L, toListResult.get(4).longValue());
    assertEquals(42L, toListResult.get(5).longValue());
    assertEquals(42L, toListResult.get(6).longValue());
    assertEquals(7, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new long[] {42L, 42L, 42L, 42L, 42L, 42L, 42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long, long, long, long, long, long, long)} with {@code value1},
   * {@code value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}, {@code value7},
   * {@code value8}.
   *
   * <p>Method under test: {@link LongArray#of(long, long, long, long, long, long, long, long)}
   */
  @Test
  @DisplayName(
      "Test of(long, long, long, long, long, long, long, long) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7', 'value8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.of(long, long, long, long, long, long, long, long)"})
  void testOfWithValue1Value2Value3Value4Value5Value6Value7Value8() {
    // Arrange and Act
    LongArray actualOfResult = LongArray.of(42L, 42L, 42L, 42L, 42L, 42L, 42L, 42L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(336L, actualOfResult.sum());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, actualOfResult.min());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(8, toListResult.size());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertEquals(42L, toListResult.get(5).longValue());
    assertEquals(42L, toListResult.get(6).longValue());
    assertEquals(42L, toListResult.get(7).longValue());
    assertEquals(8, actualOfResult.size());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new long[] {42L, 42L, 42L, 42L, 42L, 42L, 42L, 42L}, actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#of(long, long, long, long, long, long, long, long, long[])} with {@code
   * value1}, {@code value2}, {@code value3}, {@code value4}, {@code value5}, {@code value6}, {@code
   * value7}, {@code value8}, {@code otherValues}.
   *
   * <p>Method under test: {@link LongArray#of(long, long, long, long, long, long, long, long,
   * long[])}
   */
  @Test
  @DisplayName(
      "Test of(long, long, long, long, long, long, long, long, long[]) with 'value1', 'value2', 'value3', 'value4', 'value5', 'value6', 'value7', 'value8', 'otherValues'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LongArray LongArray.of(long, long, long, long, long, long, long, long, long[])"
  })
  void testOfWithValue1Value2Value3Value4Value5Value6Value7Value8OtherValues() {
    // Arrange and Act
    LongArray actualOfResult =
        LongArray.of(42L, 42L, 42L, 42L, 42L, 42L, 42L, 42L, 42L, 1L, 42L, 1L);

    // Assert
    assertEquals(1, actualOfResult.dimensions());
    assertEquals(12, actualOfResult.size());
    List<Long> toListResult = actualOfResult.toList();
    assertEquals(12, toListResult.size());
    assertEquals(1L, actualOfResult.min());
    assertEquals(1L, toListResult.get(11).longValue());
    assertEquals(1L, toListResult.get(9).longValue());
    assertEquals(422L, actualOfResult.sum());
    assertEquals(42L, actualOfResult.max());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(10).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertFalse(actualOfResult.isEmpty());
    assertArrayEquals(
        new long[] {42L, 42L, 42L, 42L, 42L, 42L, 42L, 42L, 42L, 1L, 42L, 1L},
        actualOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#ofUnsafe(long[])}.
   *
   * <ul>
   *   <li>When array of {@code long} with one and zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#ofUnsafe(long[])}
   */
  @Test
  @DisplayName(
      "Test ofUnsafe(long[]); when array of long with one and zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.ofUnsafe(long[])"})
  void testOfUnsafe_whenArrayOfLongWithOneAndZero_thenReturnMinIsZero() {
    // Arrange and Act
    LongArray actualOfUnsafeResult = LongArray.ofUnsafe(new long[] {1L, 0L, 1L, 0L});

    // Assert
    assertEquals(0L, actualOfUnsafeResult.min());
    List<Long> toListResult = actualOfUnsafeResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0L, toListResult.get(1).longValue());
    assertEquals(0L, toListResult.get(3).longValue());
    assertEquals(1L, actualOfUnsafeResult.max());
    assertEquals(1L, toListResult.get(0).longValue());
    assertEquals(1L, toListResult.get(2).longValue());
    assertEquals(2L, actualOfUnsafeResult.sum());
    assertEquals(4, actualOfUnsafeResult.size());
    assertFalse(actualOfUnsafeResult.isEmpty());
    assertArrayEquals(new long[] {1L, 0L, 1L, 0L}, actualOfUnsafeResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#ofUnsafe(long[])}.
   *
   * <ul>
   *   <li>When empty array of {@code long}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#ofUnsafe(long[])}
   */
  @Test
  @DisplayName("Test ofUnsafe(long[]); when empty array of long; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.ofUnsafe(long[])"})
  void testOfUnsafe_whenEmptyArrayOfLong_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualOfUnsafeResult = LongArray.ofUnsafe(new long[] {});

    // Assert
    assertEquals(0, actualOfUnsafeResult.size());
    assertEquals(0L, actualOfUnsafeResult.sum());
    assertTrue(actualOfUnsafeResult.isEmpty());
    assertTrue(actualOfUnsafeResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualOfUnsafeResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(long[], int, int)} with {@code array}, {@code fromIndexInclusive},
   * {@code toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(long[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(long[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(long[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive_thenReturnSizeIsOne() {
    // Arrange and Act
    LongArray actualCopyOfResult = LongArray.copyOf(new long[] {1L, 0L, 1L, 0L}, 0, 1);

    // Assert
    assertEquals(1, actualCopyOfResult.size());
    List<Long> toListResult = actualCopyOfResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1L, actualCopyOfResult.max());
    assertEquals(1L, actualCopyOfResult.min());
    assertEquals(1L, actualCopyOfResult.sum());
    assertEquals(1L, toListResult.get(0).longValue());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new long[] {1L}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(long[], int, int)} with {@code array}, {@code fromIndexInclusive},
   * {@code toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(long[], int, int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(long[], int, int) with 'array', 'fromIndexInclusive', 'toIndexExclusive'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(long[], int, int)"})
  void testCopyOfWithArrayFromIndexInclusiveToIndexExclusive_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualCopyOfResult = LongArray.copyOf(new long[] {1L, 0L, 1L, 0L}, 1, 1);

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0L, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(long[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(long[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(long[], int) with 'array', 'fromIndex'; when four; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(long[], int)"})
  void testCopyOfWithArrayFromIndex_whenFour_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualCopyOfResult = LongArray.copyOf(new long[] {1L, 0L, 1L, 0L}, 4);

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0L, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(long[], int)} with {@code array}, {@code fromIndex}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(long[], int)}
   */
  @Test
  @DisplayName(
      "Test copyOf(long[], int) with 'array', 'fromIndex'; when one; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(long[], int)"})
  void testCopyOfWithArrayFromIndex_whenOne_thenReturnMinIsZero() {
    // Arrange and Act
    LongArray actualCopyOfResult = LongArray.copyOf(new long[] {1L, 0L, 1L, 0L}, 1);

    // Assert
    assertEquals(0L, actualCopyOfResult.min());
    List<Long> toListResult = actualCopyOfResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0L, toListResult.get(0).longValue());
    assertEquals(0L, toListResult.get(2).longValue());
    assertEquals(1L, actualCopyOfResult.max());
    assertEquals(1L, actualCopyOfResult.sum());
    assertEquals(1L, toListResult.get(1).longValue());
    assertEquals(3, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new long[] {0L, 1L, 0L}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(long[])} with {@code array}.
   *
   * <ul>
   *   <li>When array of {@code long} with one and zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(long[])}
   */
  @Test
  @DisplayName(
      "Test copyOf(long[]) with 'array'; when array of long with one and zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(long[])"})
  void testCopyOfWithArray_whenArrayOfLongWithOneAndZero_thenReturnMinIsZero() {
    // Arrange and Act
    LongArray actualCopyOfResult = LongArray.copyOf(new long[] {1L, 0L, 1L, 0L});

    // Assert
    assertEquals(0L, actualCopyOfResult.min());
    List<Long> toListResult = actualCopyOfResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0L, toListResult.get(1).longValue());
    assertEquals(0L, toListResult.get(3).longValue());
    assertEquals(1L, actualCopyOfResult.max());
    assertEquals(1L, toListResult.get(0).longValue());
    assertEquals(1L, toListResult.get(2).longValue());
    assertEquals(2L, actualCopyOfResult.sum());
    assertEquals(4, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertArrayEquals(new long[] {1L, 0L, 1L, 0L}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(long[])} with {@code array}.
   *
   * <ul>
   *   <li>When empty array of {@code long}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(long[])}
   */
  @Test
  @DisplayName(
      "Test copyOf(long[]) with 'array'; when empty array of long; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(long[])"})
  void testCopyOfWithArray_whenEmptyArrayOfLong_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualCopyOfResult = LongArray.copyOf(new long[] {});

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0L, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link ArrayList#ArrayList()} add one.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; given one; when ArrayList() add one; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(Collection)"})
  void testCopyOfWithCollection_givenOne_whenArrayListAddOne_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Long> collection = new ArrayList<>();
    collection.add(1L);

    // Act
    LongArray actualCopyOfResult = LongArray.copyOf(collection);

    // Assert
    assertEquals(1, actualCopyOfResult.size());
    assertEquals(1L, actualCopyOfResult.max());
    assertEquals(1L, actualCopyOfResult.min());
    assertEquals(1L, actualCopyOfResult.sum());
    assertFalse(actualCopyOfResult.isEmpty());
    assertEquals(collection, actualCopyOfResult.toList());
    assertArrayEquals(new long[] {1L}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link ArrayList#ArrayList()} add zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; given zero; when ArrayList() add zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(Collection)"})
  void testCopyOfWithCollection_givenZero_whenArrayListAddZero_thenReturnMinIsZero() {
    // Arrange
    ArrayList<Long> collection = new ArrayList<>();
    collection.add(0L);
    collection.add(1L);

    // Act
    LongArray actualCopyOfResult = LongArray.copyOf(collection);

    // Assert
    assertEquals(0L, actualCopyOfResult.min());
    assertEquals(1L, actualCopyOfResult.max());
    assertEquals(1L, actualCopyOfResult.sum());
    assertEquals(2, actualCopyOfResult.size());
    assertFalse(actualCopyOfResult.isEmpty());
    assertEquals(collection, actualCopyOfResult.toList());
    assertArrayEquals(new long[] {0L, 1L}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#copyOf(Collection)} with {@code collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#copyOf(Collection)}
   */
  @Test
  @DisplayName(
      "Test copyOf(Collection) with 'collection'; when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.copyOf(Collection)"})
  void testCopyOfWithCollection_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualCopyOfResult = LongArray.copyOf(new ArrayList<>());

    // Assert
    assertEquals(0, actualCopyOfResult.size());
    assertEquals(0L, actualCopyOfResult.sum());
    assertTrue(actualCopyOfResult.isEmpty());
    assertTrue(actualCopyOfResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualCopyOfResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#filled(int, long)} with {@code size}, {@code value}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return sum is one hundred twenty-six.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#filled(int, long)}
   */
  @Test
  @DisplayName(
      "Test filled(int, long) with 'size', 'value'; when three; then return sum is one hundred twenty-six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.filled(int, long)"})
  void testFilledWithSizeValue_whenThree_thenReturnSumIsOneHundredTwentySix() {
    // Arrange and Act
    LongArray actualFilledResult = LongArray.filled(3, 42L);

    // Assert
    assertEquals(126L, actualFilledResult.sum());
    assertEquals(3, actualFilledResult.size());
    List<Long> toListResult = actualFilledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(42L, actualFilledResult.max());
    assertEquals(42L, actualFilledResult.min());
    assertEquals(42L, toListResult.get(0).longValue());
    assertEquals(42L, toListResult.get(1).longValue());
    assertEquals(42L, toListResult.get(2).longValue());
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new long[] {42L, 42L, 42L}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#filled(int, long)} with {@code size}, {@code value}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#filled(int, long)}
   */
  @Test
  @DisplayName("Test filled(int, long) with 'size', 'value'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.filled(int, long)"})
  void testFilledWithSizeValue_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualFilledResult = LongArray.filled(0, 42L);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertEquals(0L, actualFilledResult.sum());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#filled(int)} with {@code size}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#filled(int)}
   */
  @Test
  @DisplayName("Test filled(int) with 'size'; when three; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.filled(int)"})
  void testFilledWithSize_whenThree_thenReturnMaxIsZero() {
    // Arrange and Act
    LongArray actualFilledResult = LongArray.filled(3);

    // Assert
    assertEquals(0L, actualFilledResult.max());
    assertEquals(0L, actualFilledResult.min());
    List<Long> toListResult = actualFilledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0L, toListResult.get(0).longValue());
    assertEquals(0L, toListResult.get(1).longValue());
    assertEquals(0L, toListResult.get(2).longValue());
    assertEquals(3, actualFilledResult.size());
    assertFalse(actualFilledResult.isEmpty());
    assertArrayEquals(new long[] {0L, 0L, 0L}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#filled(int)} with {@code size}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#filled(int)}
   */
  @Test
  @DisplayName("Test filled(int) with 'size'; when zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.filled(int)"})
  void testFilledWithSize_whenZero_thenReturnSizeIsZero() {
    // Arrange and Act
    LongArray actualFilledResult = LongArray.filled(0);

    // Assert
    assertEquals(0, actualFilledResult.size());
    assertTrue(actualFilledResult.isEmpty());
    assertTrue(actualFilledResult.toList().isEmpty());
    assertArrayEquals(new long[] {}, actualFilledResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#dimensions()}.
   *
   * <p>Method under test: {@link LongArray#dimensions()}
   */
  @Test
  @DisplayName("Test dimensions()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.dimensions()"})
  void testDimensions() {
    // Arrange, Act and Assert
    assertEquals(1, LongArray.EMPTY.dimensions());
  }

  /**
   * Test {@link LongArray#size()}.
   *
   * <p>Method under test: {@link LongArray#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, LongArray.EMPTY.size());
  }

  /**
   * Test {@link LongArray#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given EMPTY; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(LongArray.EMPTY.isEmpty());
  }

  /**
   * Test {@link LongArray#isEmpty()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given filled three; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.isEmpty()"})
  void testIsEmpty_givenFilledThree_thenReturnFalse() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertFalse(filledResult.isEmpty());
  }

  /**
   * Test {@link LongArray#get(int)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.get(int)"})
  void testGet_givenFilledThree_thenReturnZero() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertEquals(0L, filledResult.get(1));
  }

  /**
   * Test {@link LongArray#contains(long)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#contains(long)}
   */
  @Test
  @DisplayName("Test contains(long); given EMPTY; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.contains(long)"})
  void testContains_givenEmpty_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(LongArray.EMPTY.contains(42L));
  }

  /**
   * Test {@link LongArray#contains(long)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#contains(long)}
   */
  @Test
  @DisplayName("Test contains(long); given filled three; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.contains(long)"})
  void testContains_givenFilledThree_thenReturnFalse() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertFalse(filledResult.contains(42L));
  }

  /**
   * Test {@link LongArray#contains(long)}.
   *
   * <ul>
   *   <li>Given {@link LongArray} with value is forty-two.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#contains(long)}
   */
  @Test
  @DisplayName("Test contains(long); given LongArray with value is forty-two; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.contains(long)"})
  void testContains_givenLongArrayWithValueIsFortyTwo_thenReturnTrue() {
    // Arrange
    LongArray ofResult = LongArray.of(42L);

    // Act and Assert
    assertTrue(ofResult.contains(42L));
  }

  /**
   * Test {@link LongArray#indexOf(long)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#indexOf(long)}
   */
  @Test
  @DisplayName("Test indexOf(long); given EMPTY; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.indexOf(long)"})
  void testIndexOf_givenEmpty_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, LongArray.EMPTY.indexOf(42L));
  }

  /**
   * Test {@link LongArray#indexOf(long)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#indexOf(long)}
   */
  @Test
  @DisplayName("Test indexOf(long); given filled three; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.indexOf(long)"})
  void testIndexOf_givenFilledThree_thenReturnMinusOne() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertEquals(-1, filledResult.indexOf(42L));
  }

  /**
   * Test {@link LongArray#indexOf(long)}.
   *
   * <ul>
   *   <li>Given {@link LongArray} with value is forty-two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#indexOf(long)}
   */
  @Test
  @DisplayName("Test indexOf(long); given LongArray with value is forty-two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.indexOf(long)"})
  void testIndexOf_givenLongArrayWithValueIsFortyTwo_thenReturnZero() {
    // Arrange
    LongArray ofResult = LongArray.of(42L);

    // Act and Assert
    assertEquals(0, ofResult.indexOf(42L));
  }

  /**
   * Test {@link LongArray#lastIndexOf(long)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#lastIndexOf(long)}
   */
  @Test
  @DisplayName("Test lastIndexOf(long); given EMPTY; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.lastIndexOf(long)"})
  void testLastIndexOf_givenEmpty_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, LongArray.EMPTY.lastIndexOf(42L));
  }

  /**
   * Test {@link LongArray#lastIndexOf(long)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#lastIndexOf(long)}
   */
  @Test
  @DisplayName("Test lastIndexOf(long); given filled three; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.lastIndexOf(long)"})
  void testLastIndexOf_givenFilledThree_thenReturnMinusOne() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertEquals(-1, filledResult.lastIndexOf(42L));
  }

  /**
   * Test {@link LongArray#lastIndexOf(long)}.
   *
   * <ul>
   *   <li>Given {@link LongArray} with value is forty-two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#lastIndexOf(long)}
   */
  @Test
  @DisplayName("Test lastIndexOf(long); given LongArray with value is forty-two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LongArray.lastIndexOf(long)"})
  void testLastIndexOf_givenLongArrayWithValueIsFortyTwo_thenReturnZero() {
    // Arrange
    LongArray ofResult = LongArray.of(42L);

    // Act and Assert
    assertEquals(0, ofResult.lastIndexOf(42L));
  }

  /**
   * Test {@link LongArray#subArray(int, int)} with {@code fromIndexInclusive}, {@code
   * toIndexExclusive}.
   *
   * <ul>
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#subArray(int, int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int, int) with 'fromIndexInclusive', 'toIndexExclusive'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.subArray(int, int)"})
  void testSubArrayWithFromIndexInclusiveToIndexExclusive_thenReturnEmpty() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertSame(LongArray.EMPTY, filledResult.subArray(1, 1));
  }

  /**
   * Test {@link LongArray#subArray(int, int)} with {@code fromIndexInclusive}, {@code
   * toIndexExclusive}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#subArray(int, int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int, int) with 'fromIndexInclusive', 'toIndexExclusive'; when zero; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.subArray(int, int)"})
  void testSubArrayWithFromIndexInclusiveToIndexExclusive_whenZero_thenReturnMaxIsZero() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualSubArrayResult = filledResult.subArray(0, 1);

    // Assert
    assertEquals(0L, actualSubArrayResult.max());
    assertEquals(0L, actualSubArrayResult.min());
    List<Long> toListResult = actualSubArrayResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0L, toListResult.get(0).longValue());
    assertEquals(1, actualSubArrayResult.size());
    assertFalse(actualSubArrayResult.isEmpty());
    assertArrayEquals(new long[] {0L}, actualSubArrayResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#subArray(int)} with {@code fromIndexInclusive}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When one.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#subArray(int)}
   */
  @Test
  @DisplayName(
      "Test subArray(int) with 'fromIndexInclusive'; given filled three; when one; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.subArray(int)"})
  void testSubArrayWithFromIndexInclusive_givenFilledThree_whenOne_thenReturnMaxIsZero() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualSubArrayResult = filledResult.subArray(1);

    // Assert
    assertEquals(0L, actualSubArrayResult.max());
    assertEquals(0L, actualSubArrayResult.min());
    List<Long> toListResult = actualSubArrayResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0L, toListResult.get(0).longValue());
    assertEquals(0L, toListResult.get(1).longValue());
    assertEquals(2, actualSubArrayResult.size());
    assertFalse(actualSubArrayResult.isEmpty());
    assertArrayEquals(new long[] {0L, 0L}, actualSubArrayResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#subArray(int)} with {@code fromIndexInclusive}.
   *
   * <ul>
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#subArray(int)}
   */
  @Test
  @DisplayName("Test subArray(int) with 'fromIndexInclusive'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.subArray(int)"})
  void testSubArrayWithFromIndexInclusive_thenReturnEmpty() {
    // Arrange
    LongArray ofResult = LongArray.of(42L);

    // Act and Assert
    assertSame(LongArray.EMPTY, ofResult.subArray(1));
  }

  /**
   * Test {@link LongArray#toArray()}.
   *
   * <p>Method under test: {@link LongArray#toArray()}
   */
  @Test
  @DisplayName("Test toArray()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] LongArray.toArray()"})
  void testToArray() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {}, LongArray.EMPTY.toArray());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LongArray#toString()}
   *   <li>{@link LongArray#toArrayUnsafe()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] LongArray.toArrayUnsafe()", "String LongArray.toString()"})
  void testGettersAndSetters() {
    // Arrange
    LongArray ofResult = LongArray.of();

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("[]", actualToStringResult);
    assertArrayEquals(new long[] {}, ofResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#toList()}.
   *
   * <p>Method under test: {@link LongArray#toList()}
   */
  @Test
  @DisplayName("Test toList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List LongArray.toList()"})
  void testToList() {
    // Arrange, Act and Assert
    assertTrue(LongArray.EMPTY.toList().isEmpty());
  }

  /**
   * Test {@link LongArray#forEach(IntLongConsumer)}.
   *
   * <ul>
   *   <li>When {@link IntLongConsumer} {@link IntLongConsumer#accept(int, long)} does nothing.
   *   <li>Then calls {@link IntLongConsumer#accept(int, long)}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#forEach(IntLongConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(IntLongConsumer); when IntLongConsumer accept(int, long) does nothing; then calls accept(int, long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LongArray.forEach(IntLongConsumer)"})
  void testForEach_whenIntLongConsumerAcceptDoesNothing_thenCallsAccept() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    IntLongConsumer action = mock(IntLongConsumer.class);
    doNothing().when(action).accept(anyInt(), anyLong());

    // Act
    filledResult.forEach(action);

    // Assert
    verify(action, atLeast(1)).accept(anyInt(), eq(0L));
  }

  /**
   * Test {@link LongArray#with(int, long)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When forty-two.
   *   <li>Then return toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#with(int, long)}
   */
  @Test
  @DisplayName(
      "Test with(int, long); given filled three; when forty-two; then return toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.with(int, long)"})
  void testWith_givenFilledThree_whenFortyTwo_thenReturnToListSizeIsThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualWithResult = filledResult.with(1, 42L);

    // Assert
    List<Long> toListResult = actualWithResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(42L, actualWithResult.max());
    assertEquals(42L, actualWithResult.sum());
    assertEquals(42L, toListResult.get(1).longValue());
    assertArrayEquals(new long[] {0L, 42L, 0L}, actualWithResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#with(int, long)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When zero.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#with(int, long)}
   */
  @Test
  @DisplayName("Test with(int, long); given filled three; when zero; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.with(int, long)"})
  void testWith_givenFilledThree_whenZero_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualWithResult = filledResult.with(1, 0L);

    // Assert
    assertSame(filledResult, actualWithResult);
  }

  /**
   * Test {@link LongArray#plus(long)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'amount'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.plus(long)"})
  void testPlusWithAmount_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.plus(10L));
  }

  /**
   * Test {@link LongArray#plus(long)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'amount'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.plus(long)"})
  void testPlusWithAmount_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(LongArray.EMPTY, LongArray.EMPTY.plus(0L));
  }

  /**
   * Test {@link LongArray#plus(long)} with {@code amount}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'amount'; given filled three; when ten; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.plus(long)"})
  void testPlusWithAmount_givenFilledThree_whenTen_thenReturnMaxIsTen() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualPlusResult = filledResult.plus(10L);

    // Assert
    assertEquals(10L, actualPlusResult.max());
    assertEquals(10L, actualPlusResult.min());
    List<Long> toListResult = actualPlusResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10L, toListResult.get(0).longValue());
    assertEquals(10L, toListResult.get(1).longValue());
    assertEquals(10L, toListResult.get(2).longValue());
    assertEquals(3, actualPlusResult.size());
    assertEquals(30L, actualPlusResult.sum());
    assertFalse(actualPlusResult.isEmpty());
    assertArrayEquals(new long[] {10L, 10L, 10L}, actualPlusResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#plus(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#plus(LongArray)}
   */
  @Test
  @DisplayName("Test plus(LongArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.plus(LongArray)"})
  void testPlusWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.plus(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#plus(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#plus(LongArray)}
   */
  @Test
  @DisplayName(
      "Test plus(LongArray) with 'other'; given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.plus(LongArray)"})
  void testPlusWithOther_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.plus(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#plus(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#plus(LongArray)}
   */
  @Test
  @DisplayName(
      "Test plus(LongArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.plus(LongArray)"})
  void testPlusWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualPlusResult = filledResult.plus(LongArray.filled(3));

    // Assert
    assertEquals(filledResult, actualPlusResult);
  }

  /**
   * Test {@link LongArray#minus(long)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When ten.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#minus(long)}
   */
  @Test
  @DisplayName("Test minus(long) with 'amount'; given EMPTY; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.minus(long)"})
  void testMinusWithAmount_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.minus(10L));
  }

  /**
   * Test {@link LongArray#minus(long)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#minus(long)}
   */
  @Test
  @DisplayName("Test minus(long) with 'amount'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.minus(long)"})
  void testMinusWithAmount_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(LongArray.EMPTY, LongArray.EMPTY.minus(0L));
  }

  /**
   * Test {@link LongArray#minus(long)} with {@code amount}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When ten.
   *   <li>Then return max is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'amount'; given filled three; when ten; then return max is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.minus(long)"})
  void testMinusWithAmount_givenFilledThree_whenTen_thenReturnMaxIsMinusTen() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualMinusResult = filledResult.minus(10L);

    // Assert
    assertEquals(-10L, actualMinusResult.max());
    assertEquals(-10L, actualMinusResult.min());
    List<Long> toListResult = actualMinusResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-10L, toListResult.get(0).longValue());
    assertEquals(-10L, toListResult.get(1).longValue());
    assertEquals(-10L, toListResult.get(2).longValue());
    assertEquals(-30L, actualMinusResult.sum());
    assertEquals(3, actualMinusResult.size());
    assertFalse(actualMinusResult.isEmpty());
    assertArrayEquals(new long[] {-10L, -10L, -10L}, actualMinusResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#minus(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#minus(LongArray)}
   */
  @Test
  @DisplayName("Test minus(LongArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.minus(LongArray)"})
  void testMinusWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.minus(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#minus(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#minus(LongArray)}
   */
  @Test
  @DisplayName(
      "Test minus(LongArray) with 'other'; given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.minus(LongArray)"})
  void testMinusWithOther_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.minus(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#minus(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#minus(LongArray)}
   */
  @Test
  @DisplayName(
      "Test minus(LongArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.minus(LongArray)"})
  void testMinusWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualMinusResult = filledResult.minus(LongArray.filled(3));

    // Assert
    assertEquals(filledResult, actualMinusResult);
  }

  /**
   * Test {@link LongArray#multipliedBy(long)} with {@code factor}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'factor'; given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.multipliedBy(long)"})
  void testMultipliedByWithFactor_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(LongArray.EMPTY, LongArray.EMPTY.multipliedBy(1L));
  }

  /**
   * Test {@link LongArray#multipliedBy(long)} with {@code factor}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'factor'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.multipliedBy(long)"})
  void testMultipliedByWithFactor_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.multipliedBy(0L));
  }

  /**
   * Test {@link LongArray#multipliedBy(long)} with {@code factor}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When zero.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long) with 'factor'; given filled three; when zero; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.multipliedBy(long)"})
  void testMultipliedByWithFactor_givenFilledThree_whenZero_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualMultipliedByResult = filledResult.multipliedBy(0L);

    // Assert
    assertEquals(filledResult, actualMultipliedByResult);
  }

  /**
   * Test {@link LongArray#multipliedBy(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#multipliedBy(LongArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(LongArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.multipliedBy(LongArray)"})
  void testMultipliedByWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.multipliedBy(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#multipliedBy(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#multipliedBy(LongArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(LongArray) with 'other'; given filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.multipliedBy(LongArray)"})
  void testMultipliedByWithOther_givenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.multipliedBy(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#multipliedBy(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#multipliedBy(LongArray)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(LongArray) with 'other'; given filled three; when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.multipliedBy(LongArray)"})
  void testMultipliedByWithOther_givenFilledThree_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualMultipliedByResult = filledResult.multipliedBy(LongArray.filled(3));

    // Assert
    assertEquals(filledResult, actualMultipliedByResult);
  }

  /**
   * Test {@link LongArray#dividedBy(long)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When one.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'divisor'; given EMPTY; when one; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.dividedBy(long)"})
  void testDividedByWithDivisor_givenEmpty_whenOne_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(LongArray.EMPTY, LongArray.EMPTY.dividedBy(1L));
  }

  /**
   * Test {@link LongArray#dividedBy(long)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When zero.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'divisor'; given EMPTY; when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.dividedBy(long)"})
  void testDividedByWithDivisor_givenEmpty_whenZero_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.dividedBy(0L));
  }

  /**
   * Test {@link LongArray#dividedBy(long)} with {@code divisor}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When minus one.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#dividedBy(long)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(long) with 'divisor'; given filled three; when minus one; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.dividedBy(long)"})
  void testDividedByWithDivisor_givenFilledThree_whenMinusOne_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualDividedByResult = filledResult.dividedBy(-1L);

    // Assert
    assertEquals(filledResult, actualDividedByResult);
  }

  /**
   * Test {@link LongArray#dividedBy(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#dividedBy(LongArray)}
   */
  @Test
  @DisplayName("Test dividedBy(LongArray) with 'other'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.dividedBy(LongArray)"})
  void testDividedByWithOther_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.dividedBy(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#dividedBy(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#dividedBy(LongArray)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(LongArray) with 'other'; given filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.dividedBy(LongArray)"})
  void testDividedByWithOther_givenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> filledResult.dividedBy(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#dividedBy(LongArray)} with {@code other}.
   *
   * <ul>
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#dividedBy(LongArray)}
   */
  @Test
  @DisplayName("Test dividedBy(LongArray) with 'other'; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.dividedBy(LongArray)"})
  void testDividedByWithOther_thenReturnDimensionsIsOne() {
    // Arrange
    LongArray ofResult = LongArray.of(42L);

    // Act
    LongArray actualDividedByResult = ofResult.dividedBy(LongArray.of(42L));

    // Assert
    assertEquals(1, actualDividedByResult.dimensions());
    assertEquals(1, actualDividedByResult.size());
    List<Long> toListResult = actualDividedByResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1L, actualDividedByResult.max());
    assertEquals(1L, actualDividedByResult.min());
    assertEquals(1L, actualDividedByResult.sum());
    assertEquals(1L, toListResult.get(0).longValue());
    assertFalse(actualDividedByResult.isEmpty());
    assertArrayEquals(new long[] {1L}, actualDividedByResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#map(LongUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongUnaryOperator}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#map(LongUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(LongUnaryOperator); given EMPTY; when LongUnaryOperator; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.map(LongUnaryOperator)"})
  void testMap_givenEmpty_whenLongUnaryOperator_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.map(mock(LongUnaryOperator.class)));
  }

  /**
   * Test {@link LongArray#map(LongUnaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#map(LongUnaryOperator)}
   */
  @Test
  @DisplayName("Test map(LongUnaryOperator); given one; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.map(LongUnaryOperator)"})
  void testMap_givenOne_thenReturnDimensionsIsOne() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    LongUnaryOperator operator = mock(LongUnaryOperator.class);
    when(operator.applyAsLong(anyLong())).thenReturn(1L);

    // Act
    LongArray actualMapResult = filledResult.map(operator);

    // Assert
    verify(operator, atLeast(1)).applyAsLong(0L);
    assertEquals(1, actualMapResult.dimensions());
    assertEquals(1L, actualMapResult.max());
    assertEquals(1L, actualMapResult.min());
    List<Long> toListResult = actualMapResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1L, toListResult.get(0).longValue());
    assertEquals(1L, toListResult.get(1).longValue());
    assertEquals(1L, toListResult.get(2).longValue());
    assertEquals(3, actualMapResult.size());
    assertEquals(3L, actualMapResult.sum());
    assertFalse(actualMapResult.isEmpty());
    assertArrayEquals(new long[] {1L, 1L, 1L}, actualMapResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#mapWithIndex(IntLongToLongFunction)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link IntLongToLongFunction}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#mapWithIndex(IntLongToLongFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(IntLongToLongFunction); given EMPTY; when IntLongToLongFunction; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.mapWithIndex(IntLongToLongFunction)"})
  void testMapWithIndex_givenEmpty_whenIntLongToLongFunction_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(LongArray.EMPTY, LongArray.EMPTY.mapWithIndex(mock(IntLongToLongFunction.class)));
  }

  /**
   * Test {@link LongArray#mapWithIndex(IntLongToLongFunction)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#mapWithIndex(IntLongToLongFunction)}
   */
  @Test
  @DisplayName("Test mapWithIndex(IntLongToLongFunction); given one; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.mapWithIndex(IntLongToLongFunction)"})
  void testMapWithIndex_givenOne_thenReturnDimensionsIsOne() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    IntLongToLongFunction function = mock(IntLongToLongFunction.class);
    when(function.applyAsLong(anyInt(), anyLong())).thenReturn(1L);

    // Act
    LongArray actualMapWithIndexResult = filledResult.mapWithIndex(function);

    // Assert
    verify(function, atLeast(1)).applyAsLong(anyInt(), eq(0L));
    assertEquals(1, actualMapWithIndexResult.dimensions());
    assertEquals(1L, actualMapWithIndexResult.max());
    assertEquals(1L, actualMapWithIndexResult.min());
    List<Long> toListResult = actualMapWithIndexResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1L, toListResult.get(0).longValue());
    assertEquals(1L, toListResult.get(1).longValue());
    assertEquals(1L, toListResult.get(2).longValue());
    assertEquals(3, actualMapWithIndexResult.size());
    assertEquals(3L, actualMapWithIndexResult.sum());
    assertFalse(actualMapWithIndexResult.isEmpty());
    assertArrayEquals(new long[] {1L, 1L, 1L}, actualMapWithIndexResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#combine(LongArray, LongBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#combine(LongArray, LongBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(LongArray, LongBinaryOperator); given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.combine(LongArray, LongBinaryOperator)"})
  void testCombine_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertEquals(
        LongArray.EMPTY, LongArray.EMPTY.combine(LongArray.EMPTY, mock(LongBinaryOperator.class)));
  }

  /**
   * Test {@link LongArray#combine(LongArray, LongBinaryOperator)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#combine(LongArray, LongBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(LongArray, LongBinaryOperator); given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.combine(LongArray, LongBinaryOperator)"})
  void testCombine_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> filledResult.combine(LongArray.EMPTY, mock(LongBinaryOperator.class)));
  }

  /**
   * Test {@link LongArray#combine(LongArray, LongBinaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#combine(LongArray, LongBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(LongArray, LongBinaryOperator); given one; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.combine(LongArray, LongBinaryOperator)"})
  void testCombine_givenOne_thenReturnDimensionsIsOne() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);
    LongArray other = LongArray.filled(3);

    LongBinaryOperator operator = mock(LongBinaryOperator.class);
    when(operator.applyAsLong(anyLong(), anyLong())).thenReturn(1L);

    // Act
    LongArray actualCombineResult = filledResult.combine(other, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsLong(0L, 0L);
    assertEquals(1, actualCombineResult.dimensions());
    assertEquals(1L, actualCombineResult.max());
    assertEquals(1L, actualCombineResult.min());
    List<Long> toListResult = actualCombineResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1L, toListResult.get(0).longValue());
    assertEquals(1L, toListResult.get(1).longValue());
    assertEquals(1L, toListResult.get(2).longValue());
    assertEquals(3, actualCombineResult.size());
    assertEquals(3L, actualCombineResult.sum());
    assertFalse(actualCombineResult.isEmpty());
    assertArrayEquals(new long[] {1L, 1L, 1L}, actualCombineResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#combineReduce(LongArray, LongTernaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#combineReduce(LongArray, LongTernaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineReduce(LongArray, LongTernaryOperator); given EMPTY; when EMPTY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.combineReduce(LongArray, LongTernaryOperator)"})
  void testCombineReduce_givenEmpty_whenEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0L, LongArray.EMPTY.combineReduce(LongArray.EMPTY, mock(LongTernaryOperator.class)));
  }

  /**
   * Test {@link LongArray#combineReduce(LongArray, LongTernaryOperator)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#combineReduce(LongArray, LongTernaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineReduce(LongArray, LongTernaryOperator); given filled three; when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.combineReduce(LongArray, LongTernaryOperator)"})
  void testCombineReduce_givenFilledThree_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> filledResult.combineReduce(LongArray.EMPTY, mock(LongTernaryOperator.class)));
  }

  /**
   * Test {@link LongArray#combineReduce(LongArray, LongTernaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#combineReduce(LongArray, LongTernaryOperator)}
   */
  @Test
  @DisplayName("Test combineReduce(LongArray, LongTernaryOperator); given one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.combineReduce(LongArray, LongTernaryOperator)"})
  void testCombineReduce_givenOne_thenReturnOne() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);
    LongArray other = LongArray.filled(3);

    LongTernaryOperator operator = mock(LongTernaryOperator.class);
    when(operator.applyAsLong(anyLong(), anyLong(), anyLong())).thenReturn(1L);

    // Act
    long actualCombineReduceResult = filledResult.combineReduce(other, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsLong(anyLong(), eq(0L), eq(0L));
    assertEquals(1L, actualCombineReduceResult);
  }

  /**
   * Test {@link LongArray#concat(LongArray)} with {@code LongArray}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#concat(LongArray)}
   */
  @Test
  @DisplayName(
      "Test concat(LongArray) with 'LongArray'; given EMPTY; when EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.concat(LongArray)"})
  void testConcatWithLongArray_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(LongArray.EMPTY, LongArray.EMPTY.concat(LongArray.EMPTY));
  }

  /**
   * Test {@link LongArray#concat(LongArray)} with {@code LongArray}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When {@link LongArray#EMPTY}.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#concat(LongArray)}
   */
  @Test
  @DisplayName(
      "Test concat(LongArray) with 'LongArray'; given filled three; when EMPTY; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.concat(LongArray)"})
  void testConcatWithLongArray_givenFilledThree_whenEmpty_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualConcatResult = filledResult.concat(LongArray.EMPTY);

    // Assert
    assertSame(filledResult, actualConcatResult);
  }

  /**
   * Test {@link LongArray#concat(LongArray)} with {@code LongArray}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return toList size is six.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#concat(LongArray)}
   */
  @Test
  @DisplayName(
      "Test concat(LongArray) with 'LongArray'; when filled three; then return toList size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.concat(LongArray)"})
  void testConcatWithLongArray_whenFilledThree_thenReturnToListSizeIsSix() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualConcatResult = filledResult.concat(LongArray.filled(3));

    // Assert
    List<Long> toListResult = actualConcatResult.toList();
    assertEquals(6, toListResult.size());
    assertEquals(0L, toListResult.get(3).longValue());
    assertEquals(0L, toListResult.get(4).longValue());
    assertEquals(0L, toListResult.get(5).longValue());
    assertEquals(6, actualConcatResult.size());
    assertArrayEquals(new long[] {0L, 0L, 0L, 0L, 0L, 0L}, actualConcatResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#concat(long[])} with {@code long[]}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#concat(long[])}
   */
  @Test
  @DisplayName("Test concat(long[]) with 'long[]'; given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.concat(long[])"})
  void testConcatWithLong_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(LongArray.EMPTY, LongArray.EMPTY.concat());
  }

  /**
   * Test {@link LongArray#concat(long[])} with {@code long[]}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When one and zero.
   *   <li>Then return toList size is four.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#concat(long[])}
   */
  @Test
  @DisplayName(
      "Test concat(long[]) with 'long[]'; given EMPTY; when one and zero; then return toList size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.concat(long[])"})
  void testConcatWithLong_givenEmpty_whenOneAndZero_thenReturnToListSizeIsFour() {
    // Arrange and Act
    LongArray actualConcatResult = LongArray.EMPTY.concat(1L, 0L, 1L, 0L);

    // Assert
    List<Long> toListResult = actualConcatResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0L, toListResult.get(3).longValue());
    assertEquals(1L, toListResult.get(0).longValue());
    assertEquals(1L, toListResult.get(2).longValue());
    assertEquals(4, actualConcatResult.size());
    assertArrayEquals(new long[] {1L, 0L, 1L, 0L}, actualConcatResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#concat(long[])} with {@code long[]}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#concat(long[])}
   */
  @Test
  @DisplayName("Test concat(long[]) with 'long[]'; given filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.concat(long[])"})
  void testConcatWithLong_givenFilledThree_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualConcatResult = filledResult.concat();

    // Assert
    assertSame(filledResult, actualConcatResult);
  }

  /**
   * Test {@link LongArray#concat(long[])} with {@code long[]}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>When one and zero.
   *   <li>Then return toList size is seven.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#concat(long[])}
   */
  @Test
  @DisplayName(
      "Test concat(long[]) with 'long[]'; given filled three; when one and zero; then return toList size is seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.concat(long[])"})
  void testConcatWithLong_givenFilledThree_whenOneAndZero_thenReturnToListSizeIsSeven() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualConcatResult = filledResult.concat(1L, 0L, 1L, 0L);

    // Assert
    List<Long> toListResult = actualConcatResult.toList();
    assertEquals(7, toListResult.size());
    assertEquals(0L, toListResult.get(4).longValue());
    assertEquals(0L, toListResult.get(6).longValue());
    assertEquals(1L, toListResult.get(5).longValue());
    assertEquals(7, actualConcatResult.size());
    assertArrayEquals(new long[] {0L, 0L, 0L, 1L, 0L, 1L, 0L}, actualConcatResult.toArrayUnsafe());
  }

  /**
   * Test {@link LongArray#sorted()}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then return {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#sorted()}
   */
  @Test
  @DisplayName("Test sorted(); given EMPTY; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.sorted()"})
  void testSorted_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(LongArray.EMPTY, LongArray.EMPTY.sorted());
  }

  /**
   * Test {@link LongArray#sorted()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#sorted()}
   */
  @Test
  @DisplayName("Test sorted(); given filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongArray LongArray.sorted()"})
  void testSorted_givenFilledThree_thenReturnFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act
    LongArray actualSortedResult = filledResult.sorted();

    // Assert
    assertEquals(filledResult, actualSortedResult);
  }

  /**
   * Test {@link LongArray#min()}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#min()}
   */
  @Test
  @DisplayName("Test min(); given EMPTY; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.min()"})
  void testMin_givenEmpty_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> LongArray.EMPTY.min());
  }

  /**
   * Test {@link LongArray#min()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#min()}
   */
  @Test
  @DisplayName("Test min(); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.min()"})
  void testMin_givenFilledThree_thenReturnZero() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertEquals(0L, filledResult.min());
  }

  /**
   * Test {@link LongArray#min()}.
   *
   * <ul>
   *   <li>Given {@link LongArray} with value is forty-two.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#min()}
   */
  @Test
  @DisplayName("Test min(); given LongArray with value is forty-two; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.min()"})
  void testMin_givenLongArrayWithValueIsFortyTwo_thenReturnFortyTwo() {
    // Arrange
    LongArray ofResult = LongArray.of(42L);

    // Act and Assert
    assertEquals(42L, ofResult.min());
  }

  /**
   * Test {@link LongArray#max()}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#max()}
   */
  @Test
  @DisplayName("Test max(); given EMPTY; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.max()"})
  void testMax_givenEmpty_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> LongArray.EMPTY.max());
  }

  /**
   * Test {@link LongArray#max()}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#max()}
   */
  @Test
  @DisplayName("Test max(); given filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.max()"})
  void testMax_givenFilledThree_thenReturnZero() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertEquals(0L, filledResult.max());
  }

  /**
   * Test {@link LongArray#max()}.
   *
   * <ul>
   *   <li>Given {@link LongArray} with value is forty-two.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#max()}
   */
  @Test
  @DisplayName("Test max(); given LongArray with value is forty-two; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.max()"})
  void testMax_givenLongArrayWithValueIsFortyTwo_thenReturnFortyTwo() {
    // Arrange
    LongArray ofResult = LongArray.of(42L);

    // Act and Assert
    assertEquals(42L, ofResult.max());
  }

  /**
   * Test {@link LongArray#sum()}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#sum()}
   */
  @Test
  @DisplayName("Test sum(); given EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.sum()"})
  void testSum_givenEmpty() {
    // Arrange, Act and Assert
    assertEquals(0L, LongArray.EMPTY.sum());
  }

  /**
   * Test {@link LongArray#sum()}.
   *
   * <ul>
   *   <li>Given filled three.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#sum()}
   */
  @Test
  @DisplayName("Test sum(); given filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.sum()"})
  void testSum_givenFilledThree() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertEquals(0L, filledResult.sum());
  }

  /**
   * Test {@link LongArray#reduce(long, LongBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link LongArray#EMPTY}.
   *   <li>When {@link LongBinaryOperator}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#reduce(long, LongBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(long, LongBinaryOperator); given EMPTY; when LongBinaryOperator; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.reduce(long, LongBinaryOperator)"})
  void testReduce_givenEmpty_whenLongBinaryOperator_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1L, LongArray.EMPTY.reduce(1L, mock(LongBinaryOperator.class)));
  }

  /**
   * Test {@link LongArray#reduce(long, LongBinaryOperator)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then calls {@link LongBinaryOperator#applyAsLong(long, long)}.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#reduce(long, LongBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(long, LongBinaryOperator); given one; then calls applyAsLong(long, long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LongArray.reduce(long, LongBinaryOperator)"})
  void testReduce_givenOne_thenCallsApplyAsLong() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    LongBinaryOperator operator = mock(LongBinaryOperator.class);
    when(operator.applyAsLong(anyLong(), anyLong())).thenReturn(1L);

    // Act
    long actualReduceResult = filledResult.reduce(1L, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsLong(1L, 0L);
    assertEquals(1L, actualReduceResult);
  }

  /**
   * Test {@link LongArray#metaBean()}.
   *
   * <p>Method under test: {@link LongArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean LongArray.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    MetaBean actualMetaBeanResult = LongArray.EMPTY.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof Meta);
    assertTrue(actualMetaBeanResult.isBuildable());
  }

  /**
   * Test {@link LongArray#equals(Object)}, and {@link LongArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LongArray#equals(Object)}
   *   <li>{@link LongArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.equals(Object)", "int LongArray.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LongArray longArray = LongArray.EMPTY;
    LongArray longArray2 = LongArray.EMPTY;

    // Act and Assert
    assertEquals(longArray, longArray2);
    assertEquals(longArray.hashCode(), longArray2.hashCode());
  }

  /**
   * Test {@link LongArray#equals(Object)}, and {@link LongArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LongArray#equals(Object)}
   *   <li>{@link LongArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.equals(Object)", "int LongArray.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LongArray longArray = LongArray.EMPTY;

    // Act and Assert
    assertEquals(longArray, longArray);
    int expectedHashCodeResult = longArray.hashCode();
    assertEquals(expectedHashCodeResult, longArray.hashCode());
  }

  /**
   * Test {@link LongArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.equals(Object)", "int LongArray.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LongArray filledResult = LongArray.filled(3);

    // Act and Assert
    assertNotEquals(filledResult, LongArray.EMPTY);
  }

  /**
   * Test {@link LongArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.equals(Object)", "int LongArray.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LongArray.EMPTY, null);
  }

  /**
   * Test {@link LongArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LongArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongArray.equals(Object)", "int LongArray.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LongArray.EMPTY, "Different type to LongArray");
  }
}
