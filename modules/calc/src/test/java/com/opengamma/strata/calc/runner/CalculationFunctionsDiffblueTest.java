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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculationFunctionsDiffblueTest {
  /**
   * Test {@link CalculationFunctions#empty()}.
   *
   * <p>Method under test: {@link CalculationFunctions#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationFunctions CalculationFunctions.empty()"})
  void testEmpty() {
    // Arrange and Act
    CalculationFunctions actualEmptyResult = CalculationFunctions.empty();
    UnresolvableTarget unresolvableTarget =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    Optional<CalculationFunction<? super CalculationTarget>> actualFindFunctionResult =
        actualEmptyResult.findFunction(unresolvableTarget);

    // Assert
    assertTrue(actualEmptyResult instanceof DefaultCalculationFunctions);
    assertEquals("Not all who wander are lost", unresolvableTarget.getMessage());
    assertFalse(actualFindFunctionResult.isPresent());
    assertTrue(((DefaultCalculationFunctions) actualEmptyResult).getFunctions().isEmpty());
  }

  /**
   * Test {@link CalculationFunctions#empty()}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCalculationFunctions}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationFunctions#empty()}
   */
  @Test
  @DisplayName("Test empty(); then return DefaultCalculationFunctions")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationFunctions CalculationFunctions.empty()"})
  void testEmpty_thenReturnDefaultCalculationFunctions() {
    // Arrange and Act
    CalculationFunctions actualEmptyResult = CalculationFunctions.empty();

    // Assert
    assertTrue(actualEmptyResult instanceof DefaultCalculationFunctions);
    assertTrue(((DefaultCalculationFunctions) actualEmptyResult).getFunctions().isEmpty());
  }

  /**
   * Test {@link CalculationFunctions#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Functions is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationFunctions#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; when HashMap(); then return Functions is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationFunctions CalculationFunctions.of(Map)"})
  void testOfWithMap_whenHashMap_thenReturnFunctionsIsHashMap() {
    // Arrange
    HashMap<Class<?>, CalculationFunction<?>> functions = new HashMap<>();

    // Act
    CalculationFunctions actualOfResult = CalculationFunctions.of(functions);
    Optional<CalculationFunction<? super CalculationTarget>> actualFindFunctionResult =
        actualOfResult.findFunction(
            new UnresolvableTarget(
                mock(ResolvableCalculationTarget.class), "Not all who wander are lost"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultCalculationFunctions);
    assertFalse(actualFindFunctionResult.isPresent());
    assertEquals(functions, ((DefaultCalculationFunctions) actualOfResult).getFunctions());
  }

  /**
   * Test {@link CalculationFunctions#getFunction(CalculationTarget)}.
   *
   * <ul>
   *   <li>Then return {@link MissingConfigCalculationFunction#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationFunctions#getFunction(CalculationTarget)}
   */
  @Test
  @DisplayName("Test getFunction(CalculationTarget); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationFunction CalculationFunctions.getFunction(CalculationTarget)"})
  void testGetFunction_thenReturnInstance() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    Optional<CalculationFunction<? super CalculationTarget>> emptyResult = Optional.empty();
    Mockito.<Optional<CalculationFunction<? super CalculationTarget>>>when(
            delegateFunctions.findFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(emptyResult);
    DerivedCalculationFunctions derivedCalculationFunctions =
        new DerivedCalculationFunctions(delegateFunctions, new ArrayList<>());

    // Act
    CalculationFunction<? super CalculationTarget> actualFunction =
        derivedCalculationFunctions.getFunction(
            new UnresolvableTarget(
                mock(ResolvableCalculationTarget.class), "Not all who wander are lost"));

    // Assert
    verify(delegateFunctions).findFunction(isA(CalculationTarget.class));
    assertSame(((MissingConfigCalculationFunction) actualFunction).INSTANCE, actualFunction);
  }

  /**
   * Test {@link CalculationFunctions#composedWith(CalculationFunctions)} with {@code
   * CalculationFunctions}.
   *
   * <ul>
   *   <li>When {@link CalculationFunctions}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationFunctions#composedWith(CalculationFunctions)}
   */
  @Test
  @DisplayName(
      "Test composedWith(CalculationFunctions) with 'CalculationFunctions'; when CalculationFunctions")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationFunctions CalculationFunctions.composedWith(CalculationFunctions)"
  })
  void testComposedWithWithCalculationFunctions_whenCalculationFunctions() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    DerivedCalculationFunctions derivedCalculationFunctions =
        new DerivedCalculationFunctions(delegateFunctions, new ArrayList<>());
    CalculationFunctions other = mock(CalculationFunctions.class);

    // Act
    CalculationFunctions actualComposedWithResult = derivedCalculationFunctions.composedWith(other);

    // Assert
    assertTrue(actualComposedWithResult instanceof CompositeCalculationFunctions);
    CalculationFunctions functions1 =
        ((CompositeCalculationFunctions) actualComposedWithResult).getFunctions1();
    assertTrue(functions1 instanceof DerivedCalculationFunctions);
    assertSame(derivedCalculationFunctions, functions1);
    assertSame(other, ((CompositeCalculationFunctions) actualComposedWithResult).getFunctions2());
  }

  /**
   * Test {@link CalculationFunctions#composedWith(DerivedCalculationFunction[])} with {@code
   * DerivedCalculationFunction[]}.
   *
   * <p>Method under test: {@link CalculationFunctions#composedWith(DerivedCalculationFunction[])}
   */
  @Test
  @DisplayName(
      "Test composedWith(DerivedCalculationFunction[]) with 'DerivedCalculationFunction[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationFunctions CalculationFunctions.composedWith(DerivedCalculationFunction[])"
  })
  void testComposedWithWithDerivedCalculationFunction() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    Optional<CalculationFunction<? super CalculationTarget>> emptyResult = Optional.empty();
    Mockito.<Optional<CalculationFunction<? super CalculationTarget>>>when(
            delegateFunctions.findFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(emptyResult);
    DerivedCalculationFunctions derivedCalculationFunctions =
        new DerivedCalculationFunctions(delegateFunctions, new ArrayList<>());
    DerivedFn derivedFn = new DerivedFn();
    DerivedCalculationFunction<?, ?>[] functions = new DerivedCalculationFunction[] {derivedFn};

    // Act
    CalculationFunctions actualComposedWithResult =
        derivedCalculationFunctions.composedWith(functions);
    UnresolvableTarget unresolvableTarget =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    Optional<CalculationFunction<? super CalculationTarget>> actualFindFunctionResult =
        actualComposedWithResult.findFunction(unresolvableTarget);

    // Assert
    verify(delegateFunctions).findFunction(isA(CalculationTarget.class));
    assertTrue(actualComposedWithResult instanceof DerivedCalculationFunctions);
    assertEquals("Not all who wander are lost", unresolvableTarget.getMessage());
    assertEquals(1, functions.length);
    assertFalse(actualFindFunctionResult.isPresent());
    assertSame(derivedFn, functions[0]);
  }

  /**
   * Test {@link CalculationFunctions#composedWith(DerivedCalculationFunction[])} with {@code
   * DerivedCalculationFunction[]}.
   *
   * <ul>
   *   <li>Then first element is {@link DerivedFn#DerivedFn()}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationFunctions#composedWith(DerivedCalculationFunction[])}
   */
  @Test
  @DisplayName(
      "Test composedWith(DerivedCalculationFunction[]) with 'DerivedCalculationFunction[]'; then first element is DerivedFn()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalculationFunctions CalculationFunctions.composedWith(DerivedCalculationFunction[])"
  })
  void testComposedWithWithDerivedCalculationFunction_thenFirstElementIsDerivedFn() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    DerivedCalculationFunctions derivedCalculationFunctions =
        new DerivedCalculationFunctions(delegateFunctions, new ArrayList<>());
    DerivedFn derivedFn = new DerivedFn();
    DerivedCalculationFunction<?, ?>[] functions = new DerivedCalculationFunction[] {derivedFn};

    // Act
    CalculationFunctions actualComposedWithResult =
        derivedCalculationFunctions.composedWith(functions);

    // Assert
    assertTrue(actualComposedWithResult instanceof DerivedCalculationFunctions);
    assertEquals(1, functions.length);
    assertSame(derivedFn, functions[0]);
  }

  /**
   * Test {@link CalculationFunctions#composedWith(List)} with {@code List}.
   *
   * <p>Method under test: {@link CalculationFunctions#composedWith(List)}
   */
  @Test
  @DisplayName("Test composedWith(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationFunctions CalculationFunctions.composedWith(List)"})
  void testComposedWithWithList() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    Optional<CalculationFunction<? super CalculationTarget>> emptyResult = Optional.empty();
    Mockito.<Optional<CalculationFunction<? super CalculationTarget>>>when(
            delegateFunctions.findFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(emptyResult);
    ArrayList<DerivedCalculationFunction<?, ?>> functions = new ArrayList<>();

    DerivedCalculationFunctions derivedCalculationFunctions =
        new DerivedCalculationFunctions(delegateFunctions, functions);
    ArrayList<DerivedCalculationFunction<?, ?>> functions2 = new ArrayList<>();

    // Act
    CalculationFunctions actualComposedWithResult =
        derivedCalculationFunctions.composedWith(functions2);
    UnresolvableTarget unresolvableTarget =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    Optional<CalculationFunction<? super CalculationTarget>> actualFindFunctionResult =
        actualComposedWithResult.findFunction(unresolvableTarget);

    // Assert
    verify(delegateFunctions).findFunction(isA(CalculationTarget.class));
    assertTrue(actualComposedWithResult instanceof DerivedCalculationFunctions);
    assertEquals("Not all who wander are lost", unresolvableTarget.getMessage());
    assertFalse(actualFindFunctionResult.isPresent());
    assertEquals(functions, functions2);
  }

  /**
   * Test {@link CalculationFunctions#composedWith(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationFunctions#composedWith(List)}
   */
  @Test
  @DisplayName("Test composedWith(List) with 'List'; when ArrayList(); then ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationFunctions CalculationFunctions.composedWith(List)"})
  void testComposedWithWithList_whenArrayList_thenArrayList() {
    // Arrange
    CalculationFunctions delegateFunctions = mock(CalculationFunctions.class);
    ArrayList<DerivedCalculationFunction<?, ?>> functions = new ArrayList<>();

    DerivedCalculationFunctions derivedCalculationFunctions =
        new DerivedCalculationFunctions(delegateFunctions, functions);
    ArrayList<DerivedCalculationFunction<?, ?>> functions2 = new ArrayList<>();

    // Act and Assert
    assertTrue(
        derivedCalculationFunctions.composedWith(functions2)
            instanceof DerivedCalculationFunctions);
    assertEquals(functions, functions2);
  }
}
