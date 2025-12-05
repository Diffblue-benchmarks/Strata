package com.opengamma.strata.math.impl.rootfinding.newton;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.linearalgebra.CholeskyDecompositionOpenGamma;
import com.opengamma.strata.math.impl.linearalgebra.DecompositionFactory;
import com.opengamma.strata.math.impl.linearalgebra.LUDecompositionCommons;
import com.opengamma.strata.math.impl.linearalgebra.QRDecompositionCommons;
import com.opengamma.strata.math.impl.linearalgebra.SVDecompositionCommons;
import com.opengamma.strata.math.linearalgebra.Decomposition;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class InverseJacobianEstimateInitializationFunctionDiffblueTest {
  /**
   * Test {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}.
   *
   * <p>Method under test: {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}
   */
  @Test
  @DisplayName("Test new InverseJacobianEstimateInitializationFunction(Decomposition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseJacobianEstimateInitializationFunction.<init>(Decomposition)"})
  void testNewInverseJacobianEstimateInitializationFunction() {
    // Arrange
    Decomposition<?> decomposition = DecompositionFactory.LU_COMMONS;

    // Act
    InverseJacobianEstimateInitializationFunction
        actualInverseJacobianEstimateInitializationFunction =
            new InverseJacobianEstimateInitializationFunction(decomposition);
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    DoubleMatrix identityResult = DoubleMatrix.identity(3);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(identityResult);
    DoubleArray x = DoubleArray.filled(3);
    DoubleMatrix actualInitializedMatrix =
        actualInverseJacobianEstimateInitializationFunction.getInitializedMatrix(
            jacobianFunction, x);

    // Assert
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    assertTrue(decomposition instanceof LUDecompositionCommons);
    assertEquals(0.0d, x.max());
    assertEquals(0.0d, x.min());
    assertEquals(0.0d, x.sum());
    assertEquals(1, x.dimensions());
    assertEquals(3, x.size());
    assertEquals(3, x.toList().size());
    assertFalse(x.isEmpty());
    assertEquals(identityResult, actualInitializedMatrix);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, x.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}.
   *
   * <p>Method under test: {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}
   */
  @Test
  @DisplayName("Test new InverseJacobianEstimateInitializationFunction(Decomposition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseJacobianEstimateInitializationFunction.<init>(Decomposition)"})
  void testNewInverseJacobianEstimateInitializationFunction2() {
    // Arrange
    Decomposition<?> decomposition = DecompositionFactory.SV_COMMONS;

    // Act
    InverseJacobianEstimateInitializationFunction
        actualInverseJacobianEstimateInitializationFunction =
            new InverseJacobianEstimateInitializationFunction(decomposition);
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    DoubleMatrix identityResult = DoubleMatrix.identity(3);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(identityResult);
    DoubleArray x = DoubleArray.filled(3);
    DoubleMatrix actualInitializedMatrix =
        actualInverseJacobianEstimateInitializationFunction.getInitializedMatrix(
            jacobianFunction, x);

    // Assert
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    assertTrue(decomposition instanceof SVDecompositionCommons);
    assertEquals(0.0d, x.max());
    assertEquals(0.0d, x.min());
    assertEquals(0.0d, x.sum());
    assertEquals(1, x.dimensions());
    assertEquals(3, x.size());
    assertEquals(3, x.toList().size());
    assertFalse(x.isEmpty());
    assertEquals(identityResult, actualInitializedMatrix);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, x.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}.
   *
   * <p>Method under test: {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}
   */
  @Test
  @DisplayName("Test new InverseJacobianEstimateInitializationFunction(Decomposition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseJacobianEstimateInitializationFunction.<init>(Decomposition)"})
  void testNewInverseJacobianEstimateInitializationFunction3() {
    // Arrange
    Decomposition<?> decomposition = DecompositionFactory.QR_COMMONS;

    // Act
    InverseJacobianEstimateInitializationFunction
        actualInverseJacobianEstimateInitializationFunction =
            new InverseJacobianEstimateInitializationFunction(decomposition);
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.identity(3));
    DoubleArray x = DoubleArray.filled(3);
    DoubleMatrix actualInitializedMatrix =
        actualInverseJacobianEstimateInitializationFunction.getInitializedMatrix(
            jacobianFunction, x);

    // Assert
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    assertTrue(decomposition instanceof QRDecompositionCommons);
    assertEquals(0.0d, x.max());
    assertEquals(0.0d, x.min());
    assertEquals(0.0d, x.sum());
    assertEquals(1, x.dimensions());
    assertEquals(2, actualInitializedMatrix.dimensions());
    assertEquals(3, x.size());
    assertEquals(3, x.toList().size());
    assertEquals(3, actualInitializedMatrix.toArrayUnsafe().length);
    assertEquals(3.0d, actualInitializedMatrix.total());
    assertEquals(9, actualInitializedMatrix.size());
    assertFalse(x.isEmpty());
    assertFalse(actualInitializedMatrix.isEmpty());
    assertTrue(actualInitializedMatrix.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, x.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}.
   *
   * <p>Method under test: {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}
   */
  @Test
  @DisplayName("Test new InverseJacobianEstimateInitializationFunction(Decomposition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseJacobianEstimateInitializationFunction.<init>(Decomposition)"})
  void testNewInverseJacobianEstimateInitializationFunction4() {
    // Arrange and Act
    InverseJacobianEstimateInitializationFunction
        actualInverseJacobianEstimateInitializationFunction =
            new InverseJacobianEstimateInitializationFunction(new CholeskyDecompositionOpenGamma());
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    DoubleMatrix identityResult = DoubleMatrix.identity(3);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(identityResult);
    DoubleArray x = DoubleArray.filled(3);
    DoubleMatrix actualInitializedMatrix =
        actualInverseJacobianEstimateInitializationFunction.getInitializedMatrix(
            jacobianFunction, x);

    // Assert
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    assertEquals(0.0d, x.max());
    assertEquals(0.0d, x.min());
    assertEquals(0.0d, x.sum());
    assertEquals(1, x.dimensions());
    assertEquals(3, x.size());
    assertEquals(3, x.toList().size());
    assertFalse(x.isEmpty());
    assertEquals(identityResult, actualInitializedMatrix);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, x.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * InverseJacobianEstimateInitializationFunction#InverseJacobianEstimateInitializationFunction(Decomposition)}
   */
  @Test
  @DisplayName(
      "Test new InverseJacobianEstimateInitializationFunction(Decomposition); then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseJacobianEstimateInitializationFunction.<init>(Decomposition)"})
  void testNewInverseJacobianEstimateInitializationFunction_thenDoubleArraySizeIsZero() {
    // Arrange and Act
    InverseJacobianEstimateInitializationFunction
        actualInverseJacobianEstimateInitializationFunction =
            new InverseJacobianEstimateInitializationFunction(new CholeskyDecompositionOpenGamma());
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());
    DoubleArray x = DoubleArray.of();
    DoubleMatrix actualInitializedMatrix =
        actualInverseJacobianEstimateInitializationFunction.getInitializedMatrix(
            jacobianFunction, x);

    // Assert
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    assertEquals(0, x.size());
    assertEquals(0.0d, x.sum());
    assertEquals(1, x.dimensions());
    assertTrue(x.isEmpty());
    assertTrue(x.toList().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualInitializedMatrix);
    assertArrayEquals(new double[] {}, x.toArrayUnsafe(), 0.0);
  }
}
