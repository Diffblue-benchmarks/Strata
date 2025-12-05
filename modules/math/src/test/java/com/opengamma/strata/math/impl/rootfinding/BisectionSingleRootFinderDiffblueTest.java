package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BisectionSingleRootFinderDiffblueTest {
  /**
   * Test {@link BisectionSingleRootFinder#getRoot(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link BisectionSingleRootFinder#getRoot(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Double, Double) with 'Function', 'Double', 'Double'; given zero; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double BisectionSingleRootFinder.getRoot(Function, Double, Double)"})
  void testGetRootWithFunctionDoubleDouble_givenZero_thenReturnDoubleValueIsTen() {
    // Arrange
    BisectionSingleRootFinder bisectionSingleRootFinder = new BisectionSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    Double actualRoot = bisectionSingleRootFinder.getRoot(function, 1.0d, 10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(10.0d, actualRoot.doubleValue());
  }
}
