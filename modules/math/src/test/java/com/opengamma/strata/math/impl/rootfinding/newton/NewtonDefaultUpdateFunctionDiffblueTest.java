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

class NewtonDefaultUpdateFunctionDiffblueTest {
  /**
   * Test {@link NewtonDefaultUpdateFunction#getUpdatedMatrix(Function, DoubleArray, DoubleArray,
   * DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonDefaultUpdateFunction#getUpdatedMatrix(Function,
   * DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix); given DoubleMatrix; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix NewtonDefaultUpdateFunction.getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)"
  })
  void testGetUpdatedMatrix_givenDoubleMatrix_thenReturnEmpty() {
    // Arrange
    NewtonDefaultUpdateFunction newtonDefaultUpdateFunction = new NewtonDefaultUpdateFunction();

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());
    DoubleArray x = DoubleArray.of();
    DoubleArray deltaX = DoubleArray.of();
    DoubleArray deltaY = DoubleArray.of();

    // Act
    DoubleMatrix actualUpdatedMatrix =
        newtonDefaultUpdateFunction.getUpdatedMatrix(
            jacobianFunction, x, deltaX, deltaY, DoubleMatrix.of());

    // Assert
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    assertSame(DoubleMatrix.EMPTY, actualUpdatedMatrix);
  }
}
