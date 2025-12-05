package com.opengamma.strata.calc.runner;

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
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DerivedCalculationFunctionsDiffblueTest {
  /**
   * Test {@link DerivedCalculationFunctions#DerivedCalculationFunctions(CalculationFunctions,
   * List)}.
   *
   * <p>Method under test: {@link
   * DerivedCalculationFunctions#DerivedCalculationFunctions(CalculationFunctions, List)}
   */
  @Test
  @DisplayName("Test new DerivedCalculationFunctions(CalculationFunctions, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DerivedCalculationFunctions.<init>(CalculationFunctions, List)"})
  void testNewDerivedCalculationFunctions() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    Optional<CalculationFunction<? super CalculationTarget>> emptyResult = Optional.empty();
    Mockito.<Optional<CalculationFunction<? super CalculationTarget>>>when(
            delegateFunctions.findFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(emptyResult);
    ArrayList<DerivedCalculationFunction<?, ?>> functions = new ArrayList<>();

    // Act
    DerivedCalculationFunctions actualDerivedCalculationFunctions =
        new DerivedCalculationFunctions(delegateFunctions, functions);
    UnresolvableTarget unresolvableTarget =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    Optional<CalculationFunction<? super CalculationTarget>> actualFindFunctionResult =
        actualDerivedCalculationFunctions.findFunction(unresolvableTarget);

    // Assert
    verify(delegateFunctions).findFunction(isA(CalculationTarget.class));
    assertEquals("Not all who wander are lost", unresolvableTarget.getMessage());
    assertFalse(actualFindFunctionResult.isPresent());
    assertTrue(functions.isEmpty());
  }

  /**
   * Test {@link DerivedCalculationFunctions#DerivedCalculationFunctions(CalculationFunctions,
   * List)}.
   *
   * <ul>
   *   <li>Then {@link ArrayList#ArrayList()} size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * DerivedCalculationFunctions#DerivedCalculationFunctions(CalculationFunctions, List)}
   */
  @Test
  @DisplayName(
      "Test new DerivedCalculationFunctions(CalculationFunctions, List); then ArrayList() size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DerivedCalculationFunctions.<init>(CalculationFunctions, List)"})
  void testNewDerivedCalculationFunctions_thenArrayListSizeIsOne() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);

    ArrayList<DerivedCalculationFunction<?, ?>> functions = new ArrayList<>();
    DerivedFn derivedFn = new DerivedFn();
    functions.add(derivedFn);

    // Act
    new DerivedCalculationFunctions(delegateFunctions, functions);

    // Assert that nothing has changed
    assertEquals(1, functions.size());
    assertSame(derivedFn, functions.get(0));
  }

  /**
   * Test {@link DerivedCalculationFunctions#DerivedCalculationFunctions(CalculationFunctions,
   * List)}.
   *
   * <ul>
   *   <li>When {@link CalculationFunctions}.
   *   <li>Then {@link ArrayList#ArrayList()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * DerivedCalculationFunctions#DerivedCalculationFunctions(CalculationFunctions, List)}
   */
  @Test
  @DisplayName(
      "Test new DerivedCalculationFunctions(CalculationFunctions, List); when CalculationFunctions; then ArrayList() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DerivedCalculationFunctions.<init>(CalculationFunctions, List)"})
  void testNewDerivedCalculationFunctions_whenCalculationFunctions_thenArrayListEmpty() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    ArrayList<DerivedCalculationFunction<?, ?>> functions = new ArrayList<>();

    // Act
    new DerivedCalculationFunctions(delegateFunctions, functions);

    // Assert that nothing has changed
    assertTrue(functions.isEmpty());
  }
}
