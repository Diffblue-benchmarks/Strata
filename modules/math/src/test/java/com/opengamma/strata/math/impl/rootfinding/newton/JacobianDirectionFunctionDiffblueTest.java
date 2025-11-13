package com.opengamma.strata.math.impl.rootfinding.newton;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.linearalgebra.CholeskyDecompositionOpenGamma;
import com.opengamma.strata.math.impl.linearalgebra.DecompositionFactory;
import com.opengamma.strata.math.impl.linearalgebra.LUDecompositionCommons;
import com.opengamma.strata.math.linearalgebra.Decomposition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JacobianDirectionFunctionDiffblueTest {
  /**
   * Test {@link JacobianDirectionFunction#JacobianDirectionFunction(Decomposition)}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * JacobianDirectionFunction#JacobianDirectionFunction(Decomposition)}
   */
  @Test
  @DisplayName("Test new JacobianDirectionFunction(Decomposition); then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void JacobianDirectionFunction.<init>(Decomposition)"})
  void testNewJacobianDirectionFunction_thenDoubleArraySizeIsZero() {
    // Arrange and Act
    JacobianDirectionFunction actualJacobianDirectionFunction =
        new JacobianDirectionFunction(new CholeskyDecompositionOpenGamma());
    DoubleMatrix estimate = DoubleMatrix.of();
    DoubleArray y = DoubleArray.of();
    DoubleArray actualDirection = actualJacobianDirectionFunction.getDirection(estimate, y);

    // Assert
    assertEquals(0, y.size());
    assertEquals(0, estimate.size());
    assertEquals(0, estimate.toArrayUnsafe().length);
    assertEquals(0.0d, y.sum());
    assertEquals(0.0d, estimate.total());
    assertEquals(1, y.dimensions());
    assertEquals(2, estimate.dimensions());
    assertTrue(y.isEmpty());
    assertTrue(estimate.isEmpty());
    assertTrue(estimate.isSquare());
    assertTrue(y.toList().isEmpty());
    assertSame(DoubleArray.EMPTY, actualDirection);
  }

  /**
   * Test {@link JacobianDirectionFunction#JacobianDirectionFunction(Decomposition)}.
   *
   * <ul>
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * JacobianDirectionFunction#JacobianDirectionFunction(Decomposition)}
   */
  @Test
  @DisplayName("Test new JacobianDirectionFunction(Decomposition); then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void JacobianDirectionFunction.<init>(Decomposition)"})
  void testNewJacobianDirectionFunction_thenFilledThreeMaxIsZero() {
    // Arrange and Act
    JacobianDirectionFunction actualJacobianDirectionFunction =
        new JacobianDirectionFunction(new CholeskyDecompositionOpenGamma());
    DoubleMatrix estimate = DoubleMatrix.identity(3);
    DoubleArray y = DoubleArray.filled(3);
    DoubleArray actualDirection = actualJacobianDirectionFunction.getDirection(estimate, y);

    // Assert
    assertEquals(0.0d, y.max());
    assertEquals(0.0d, y.min());
    assertEquals(0.0d, y.sum());
    assertEquals(1, y.dimensions());
    assertEquals(2, estimate.dimensions());
    assertEquals(3, y.size());
    assertEquals(3, y.toList().size());
    assertEquals(3, estimate.toArrayUnsafe().length);
    assertEquals(3.0d, estimate.total());
    assertEquals(9, estimate.size());
    assertFalse(y.isEmpty());
    assertFalse(estimate.isEmpty());
    assertTrue(estimate.isSquare());
    assertEquals(y, actualDirection);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, y.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link JacobianDirectionFunction#JacobianDirectionFunction(Decomposition)}.
   *
   * <ul>
   *   <li>Then {@link DecompositionFactory#LU_COMMONS} {@link LUDecompositionCommons}.
   * </ul>
   *
   * <p>Method under test: {@link
   * JacobianDirectionFunction#JacobianDirectionFunction(Decomposition)}
   */
  @Test
  @DisplayName(
      "Test new JacobianDirectionFunction(Decomposition); then LU_COMMONS LUDecompositionCommons")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void JacobianDirectionFunction.<init>(Decomposition)"})
  void testNewJacobianDirectionFunction_thenLu_commonsLUDecompositionCommons() {
    // Arrange
    Decomposition<?> decomposition = DecompositionFactory.LU_COMMONS;

    // Act
    JacobianDirectionFunction actualJacobianDirectionFunction =
        new JacobianDirectionFunction(decomposition);
    DoubleMatrix estimate = DoubleMatrix.identity(3);
    DoubleArray y = DoubleArray.filled(3);
    DoubleArray actualDirection = actualJacobianDirectionFunction.getDirection(estimate, y);

    // Assert
    assertTrue(decomposition instanceof LUDecompositionCommons);
    assertEquals(0.0d, y.max());
    assertEquals(0.0d, y.min());
    assertEquals(0.0d, y.sum());
    assertEquals(1, y.dimensions());
    assertEquals(2, estimate.dimensions());
    assertEquals(3, y.size());
    assertEquals(3, y.toList().size());
    assertEquals(3, estimate.toArrayUnsafe().length);
    assertEquals(3.0d, estimate.total());
    assertEquals(9, estimate.size());
    assertFalse(y.isEmpty());
    assertFalse(estimate.isEmpty());
    assertTrue(estimate.isSquare());
    assertEquals(y, actualDirection);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, y.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link JacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link JacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}
   */
  @Test
  @DisplayName("Test getDirection(DoubleMatrix, DoubleArray); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray JacobianDirectionFunction.getDirection(DoubleMatrix, DoubleArray)"
  })
  void testGetDirection_thenReturnEmpty() {
    // Arrange
    JacobianDirectionFunction jacobianDirectionFunction =
        new JacobianDirectionFunction(new CholeskyDecompositionOpenGamma());
    DoubleMatrix estimate = DoubleMatrix.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY, jacobianDirectionFunction.getDirection(estimate, DoubleArray.of()));
  }

  /**
   * Test {@link JacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link JacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getDirection(DoubleMatrix, DoubleArray); when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray JacobianDirectionFunction.getDirection(DoubleMatrix, DoubleArray)"
  })
  void testGetDirection_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    JacobianDirectionFunction jacobianDirectionFunction =
        new JacobianDirectionFunction(DecompositionFactory.LU_COMMONS);
    DoubleMatrix estimate = DoubleMatrix.identity(3);
    DoubleArray y = DoubleArray.filled(3);

    // Act
    DoubleArray actualDirection = jacobianDirectionFunction.getDirection(estimate, y);

    // Assert
    assertEquals(y, actualDirection);
  }

  /**
   * Test {@link JacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link JacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getDirection(DoubleMatrix, DoubleArray); when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray JacobianDirectionFunction.getDirection(DoubleMatrix, DoubleArray)"
  })
  void testGetDirection_whenFilledThree_thenReturnFilledThree2() {
    // Arrange
    JacobianDirectionFunction jacobianDirectionFunction =
        new JacobianDirectionFunction(new CholeskyDecompositionOpenGamma());
    DoubleMatrix estimate = DoubleMatrix.identity(3);
    DoubleArray y = DoubleArray.filled(3);

    // Act
    DoubleArray actualDirection = jacobianDirectionFunction.getDirection(estimate, y);

    // Assert
    assertEquals(y, actualDirection);
  }
}
