package com.opengamma.strata.math.impl.rootfinding.newton;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.MathException;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BaseNewtonVectorRootFinderDiffblueTest {
  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray() {
    // Arrange
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            mock(NewtonRootFinderMatrixInitializationFunction.class),
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray2() {
    // Arrange
    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray3() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            directionFunction,
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray4() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction)
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray5() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 20, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction, atLeast(1))
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray6() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.filled(3)));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <ul>
   *   <li>Then calls {@link NewtonRootFinderMatrixUpdateFunction#getUpdatedMatrix(Function,
   *       DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'; then calls getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray_thenCallsGetUpdatedMatrix() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray_thenReturnEmpty() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            directionFunction,
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    DoubleArray actualRoot = baseNewtonVectorRootFinder.getRoot(function, DoubleArray.of());

    // Assert
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
    assertEquals(DoubleArray.EMPTY, actualRoot);
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)} with {@code Function},
   * {@code DoubleArray}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#getRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, DoubleArray) with 'Function', 'DoubleArray'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.getRoot(Function, DoubleArray)"})
  void testGetRootWithFunctionDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            mock(NewtonRootFinderMatrixInitializationFunction.class),
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> baseNewtonVectorRootFinder.getRoot(function, DoubleArray.filled(3)));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition() {
    // Arrange
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            mock(NewtonRootFinderMatrixInitializationFunction.class),
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition2() {
    // Arrange
    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition3() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            directionFunction,
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition4() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction)
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition5() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition6() {
    // Arrange
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            mock(NewtonRootFinderMatrixInitializationFunction.class),
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.filled(3)));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition7() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 20, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction, atLeast(1))
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition8() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.filled(3)));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <ul>
   *   <li>Given identity three.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'; given identity three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition_givenIdentityThree() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.identity(3));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <ul>
   *   <li>Given {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'; given 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition_givenNull() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(null);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <ul>
   *   <li>Then calls {@link NewtonRootFinderMatrixUpdateFunction#getUpdatedMatrix(Function,
   *       DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'; then calls getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition_thenCallsGetUpdatedMatrix() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);
    when(jacobianFunction.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(jacobianFunction).apply(isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, Function, DoubleArray)} with {@code
   * function}, {@code jacobianFunction}, {@code startPosition}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, Function, DoubleArray) with 'function', 'jacobianFunction', 'startPosition'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, Function, DoubleArray)"
  })
  void testFindRootWithFunctionJacobianFunctionStartPosition_thenReturnEmpty() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            directionFunction,
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    Function<DoubleArray, DoubleMatrix> jacobianFunction = mock(Function.class);

    // Act
    DoubleArray actualFindRootResult =
        baseNewtonVectorRootFinder.findRoot(function, jacobianFunction, DoubleArray.of());

    // Assert
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
    assertEquals(DoubleArray.EMPTY, actualFindRootResult);
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test findRoot(Function, DoubleArray) with 'function', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition() {
    // Arrange
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            mock(NewtonRootFinderMatrixInitializationFunction.class),
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.of()));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test findRoot(Function, DoubleArray) with 'function', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition2() {
    // Arrange
    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.of()));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test findRoot(Function, DoubleArray) with 'function', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition3() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            directionFunction,
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.of()));
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test findRoot(Function, DoubleArray) with 'function', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition4() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.of()));
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction)
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test findRoot(Function, DoubleArray) with 'function', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition5() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 20, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction, atLeast(1))
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName("Test findRoot(Function, DoubleArray) with 'function', 'startPosition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition6() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.filled(3)));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <ul>
   *   <li>Then calls {@link NewtonRootFinderMatrixUpdateFunction#getUpdatedMatrix(Function,
   *       DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, DoubleArray) with 'function', 'startPosition'; then calls getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition_thenCallsGetUpdatedMatrix() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    NewtonRootFinderMatrixUpdateFunction updateFunction =
        mock(NewtonRootFinderMatrixUpdateFunction.class);
    when(updateFunction.getUpdatedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleMatrix>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d, 10.0d, 3, directionFunction, initializationFunction, updateFunction);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        MathException.class, () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.of()));
    verify(directionFunction, atLeast(1))
        .getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(updateFunction, atLeast(1))
        .getUpdatedMatrix(
            isA(Function.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleMatrix.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, DoubleArray) with 'function', 'startPosition'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition_thenReturnEmpty() {
    // Arrange
    NewtonRootFinderDirectionFunction directionFunction =
        mock(NewtonRootFinderDirectionFunction.class);
    when(directionFunction.getDirection(Mockito.<DoubleMatrix>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.of());

    NewtonRootFinderMatrixInitializationFunction initializationFunction =
        mock(NewtonRootFinderMatrixInitializationFunction.class);
    when(initializationFunction.getInitializedMatrix(
            Mockito.<Function<DoubleArray, DoubleMatrix>>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.of());

    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            10.0d,
            10.0d,
            3,
            directionFunction,
            initializationFunction,
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    DoubleArray actualFindRootResult =
        baseNewtonVectorRootFinder.findRoot(function, DoubleArray.of());

    // Assert
    verify(directionFunction).getDirection(isA(DoubleMatrix.class), isA(DoubleArray.class));
    verify(initializationFunction)
        .getInitializedMatrix(isA(Function.class), isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
    assertEquals(DoubleArray.EMPTY, actualFindRootResult);
  }

  /**
   * Test {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)} with {@code function},
   * {@code startPosition}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BaseNewtonVectorRootFinder#findRoot(Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test findRoot(Function, DoubleArray) with 'function', 'startPosition'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray BaseNewtonVectorRootFinder.findRoot(Function, DoubleArray)"})
  void testFindRootWithFunctionStartPosition_thenThrowIllegalArgumentException() {
    // Arrange
    BaseNewtonVectorRootFinder baseNewtonVectorRootFinder =
        new BaseNewtonVectorRootFinder(
            0.0d,
            10.0d,
            3,
            mock(NewtonRootFinderDirectionFunction.class),
            mock(NewtonRootFinderMatrixInitializationFunction.class),
            mock(NewtonRootFinderMatrixUpdateFunction.class));

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> baseNewtonVectorRootFinder.findRoot(function, DoubleArray.filled(3)));
    verify(function).apply(isA(DoubleArray.class));
  }
}
