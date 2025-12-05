package com.opengamma.strata.math.impl.rootfinding.newton;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class JacobianEstimateInitializationFunctionDiffblueTest {
  /**
   * Test {@link JacobianEstimateInitializationFunction#getInitializedMatrix(Function,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * JacobianEstimateInitializationFunction#getInitializedMatrix(Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getInitializedMatrix(Function, DoubleArray); given DoubleMatrix; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix JacobianEstimateInitializationFunction.getInitializedMatrix(Function, DoubleArray)"
  })
  void testGetInitializedMatrix_givenDoubleMatrix_thenReturnEmpty() {
    // Arrange
    JacobianEstimateInitializationFunction jacobianEstimateInitializationFunction =
        new JacobianEstimateInitializationFunction();

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());

    // Act
    DoubleMatrix actualInitializedMatrix =
        jacobianEstimateInitializationFunction.getInitializedMatrix(
            jacobianFunction, DoubleArray.of());

    // Assert
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    assertSame(DoubleMatrix.EMPTY, actualInitializedMatrix);
  }
}
