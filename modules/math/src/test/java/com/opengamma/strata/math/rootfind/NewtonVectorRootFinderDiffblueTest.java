package com.opengamma.strata.math.rootfind;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.rootfinding.newton.BroydenVectorRootFinder;
import com.opengamma.strata.math.linearalgebra.Decomposition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NewtonVectorRootFinderDiffblueTest {
  /**
   * Test {@link NewtonVectorRootFinder#broyden()}.
   *
   * <p>Method under test: {@link NewtonVectorRootFinder#broyden()}
   */
  @Test
  @DisplayName("Test broyden()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NewtonVectorRootFinder NewtonVectorRootFinder.broyden()"})
  void testBroyden() {
    // Arrange, Act and Assert
    assertTrue(NewtonVectorRootFinder.broyden() instanceof BroydenVectorRootFinder);
  }

  /**
   * Test {@link NewtonVectorRootFinder#broyden(double, double, int, Decomposition)} with {@code
   * absoluteTol}, {@code relativeTol}, {@code maxSteps}, {@code decomposition}.
   *
   * <p>Method under test: {@link NewtonVectorRootFinder#broyden(double, double, int,
   * Decomposition)}
   */
  @Test
  @DisplayName(
      "Test broyden(double, double, int, Decomposition) with 'absoluteTol', 'relativeTol', 'maxSteps', 'decomposition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "NewtonVectorRootFinder NewtonVectorRootFinder.broyden(double, double, int, Decomposition)"
  })
  void testBroydenWithAbsoluteTolRelativeTolMaxStepsDecomposition() {
    // Arrange, Act and Assert
    assertTrue(
        NewtonVectorRootFinder.broyden(10.0d, 10.0d, 3, mock(Decomposition.class))
            instanceof BroydenVectorRootFinder);
  }

  /**
   * Test {@link NewtonVectorRootFinder#broyden(double, double, int)} with {@code absoluteTol},
   * {@code relativeTol}, {@code maxSteps}.
   *
   * <ul>
   *   <li>Then return {@link BroydenVectorRootFinder}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonVectorRootFinder#broyden(double, double, int)}
   */
  @Test
  @DisplayName(
      "Test broyden(double, double, int) with 'absoluteTol', 'relativeTol', 'maxSteps'; then return BroydenVectorRootFinder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NewtonVectorRootFinder NewtonVectorRootFinder.broyden(double, double, int)"})
  void testBroydenWithAbsoluteTolRelativeTolMaxSteps_thenReturnBroydenVectorRootFinder() {
    // Arrange, Act and Assert
    assertTrue(NewtonVectorRootFinder.broyden(10.0d, 10.0d, 3) instanceof BroydenVectorRootFinder);
  }
}
