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
import com.opengamma.strata.math.impl.matrix.MatrixAlgebra;
import com.opengamma.strata.math.impl.matrix.MatrixAlgebraFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InverseJacobianDirectionFunctionDiffblueTest {
  /**
   * Test {@link InverseJacobianDirectionFunction#InverseJacobianDirectionFunction(MatrixAlgebra)}.
   *
   * <ul>
   *   <li>When {@link MatrixAlgebraFactory#OG_ALGEBRA}.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * InverseJacobianDirectionFunction#InverseJacobianDirectionFunction(MatrixAlgebra)}
   */
  @Test
  @DisplayName(
      "Test new InverseJacobianDirectionFunction(MatrixAlgebra); when OG_ALGEBRA; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseJacobianDirectionFunction.<init>(MatrixAlgebra)"})
  void testNewInverseJacobianDirectionFunction_whenOg_algebra_thenDoubleArraySizeIsZero() {
    // Arrange and Act
    InverseJacobianDirectionFunction actualInverseJacobianDirectionFunction =
        new InverseJacobianDirectionFunction(MatrixAlgebraFactory.OG_ALGEBRA);
    DoubleMatrix estimate = DoubleMatrix.of();
    DoubleArray y = DoubleArray.of();
    DoubleArray actualDirection = actualInverseJacobianDirectionFunction.getDirection(estimate, y);

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
   * Test {@link InverseJacobianDirectionFunction#InverseJacobianDirectionFunction(MatrixAlgebra)}.
   *
   * <ul>
   *   <li>When {@link MatrixAlgebraFactory#OG_ALGEBRA}.
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * InverseJacobianDirectionFunction#InverseJacobianDirectionFunction(MatrixAlgebra)}
   */
  @Test
  @DisplayName(
      "Test new InverseJacobianDirectionFunction(MatrixAlgebra); when OG_ALGEBRA; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseJacobianDirectionFunction.<init>(MatrixAlgebra)"})
  void testNewInverseJacobianDirectionFunction_whenOg_algebra_thenFilledThreeMaxIsZero() {
    // Arrange and Act
    InverseJacobianDirectionFunction actualInverseJacobianDirectionFunction =
        new InverseJacobianDirectionFunction(MatrixAlgebraFactory.OG_ALGEBRA);
    DoubleMatrix estimate = DoubleMatrix.identity(3);
    DoubleArray y = DoubleArray.filled(3);
    DoubleArray actualDirection = actualInverseJacobianDirectionFunction.getDirection(estimate, y);

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
   * Test {@link InverseJacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link InverseJacobianDirectionFunction#getDirection(DoubleMatrix,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test getDirection(DoubleMatrix, DoubleArray); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray InverseJacobianDirectionFunction.getDirection(DoubleMatrix, DoubleArray)"
  })
  void testGetDirection_thenReturnEmpty() {
    // Arrange
    InverseJacobianDirectionFunction inverseJacobianDirectionFunction =
        new InverseJacobianDirectionFunction(MatrixAlgebraFactory.OG_ALGEBRA);
    DoubleMatrix estimate = DoubleMatrix.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        inverseJacobianDirectionFunction.getDirection(estimate, DoubleArray.of()));
  }

  /**
   * Test {@link InverseJacobianDirectionFunction#getDirection(DoubleMatrix, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link InverseJacobianDirectionFunction#getDirection(DoubleMatrix,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getDirection(DoubleMatrix, DoubleArray); when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray InverseJacobianDirectionFunction.getDirection(DoubleMatrix, DoubleArray)"
  })
  void testGetDirection_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    InverseJacobianDirectionFunction inverseJacobianDirectionFunction =
        new InverseJacobianDirectionFunction(MatrixAlgebraFactory.OG_ALGEBRA);
    DoubleMatrix estimate = DoubleMatrix.identity(3);
    DoubleArray y = DoubleArray.filled(3);

    // Act
    DoubleArray actualDirection = inverseJacobianDirectionFunction.getDirection(estimate, y);

    // Assert
    assertEquals(y, actualDirection);
  }
}
