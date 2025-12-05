package com.opengamma.strata.math.impl.differentiation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.special.IncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.InverseIncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.TopHatFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScalarSecondOrderDifferentiatorDiffblueTest {
  /**
   * Test {@link ScalarSecondOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <p>Method under test: {@link ScalarSecondOrderDifferentiator#differentiate(Function, Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function, Function) with 'function', 'domain'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarSecondOrderDifferentiator.differentiate(Function, Function)"})
  void testDifferentiateWithFunctionDomain() {
    // Arrange
    ScalarSecondOrderDifferentiator scalarSecondOrderDifferentiator =
        new ScalarSecondOrderDifferentiator();
    IncompleteBetaFunction function = new IncompleteBetaFunction(10.0d, 10.0d);

    Function<Double, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<Double>any())).thenReturn(true);

    // Act
    Double actualApplyResult =
        scalarSecondOrderDifferentiator.differentiate(function, domain).apply(0.5d);

    // Assert
    verify(domain, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(-3.6703973194107675E-5d, actualApplyResult.doubleValue());
  }

  /**
   * Test {@link ScalarSecondOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <p>Method under test: {@link ScalarSecondOrderDifferentiator#differentiate(Function, Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function, Function) with 'function', 'domain'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarSecondOrderDifferentiator.differentiate(Function, Function)"})
  void testDifferentiateWithFunctionDomain2() {
    // Arrange
    ScalarSecondOrderDifferentiator scalarSecondOrderDifferentiator =
        new ScalarSecondOrderDifferentiator(0.015625d);
    InverseIncompleteBetaFunction function = new InverseIncompleteBetaFunction(10.0d, 10.0d);

    Function<Double, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<Double>any())).thenReturn(true);

    // Act
    Double actualApplyResult =
        scalarSecondOrderDifferentiator.differentiate(function, domain).apply(0.5d);

    // Assert
    verify(domain, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(-3.2287035332019514d, actualApplyResult.doubleValue());
  }

  /**
   * Test {@link ScalarSecondOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarSecondOrderDifferentiator#differentiate(Function, Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given ten; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarSecondOrderDifferentiator.differentiate(Function, Function)"})
  void testDifferentiateWithFunctionDomain_givenTen_thenReturnApplyTenDoubleValueIsZero() {
    // Arrange
    ScalarSecondOrderDifferentiator scalarSecondOrderDifferentiator =
        new ScalarSecondOrderDifferentiator();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<Double>any())).thenReturn(true);

    // Act
    Double actualApplyResult =
        scalarSecondOrderDifferentiator.differentiate(function, domain).apply(10.0d);

    // Assert
    verify(domain, atLeast(1)).apply(Mockito.<Double>any());
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.0d, actualApplyResult.doubleValue());
  }

  /**
   * Test {@link ScalarSecondOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given ten; when Function apply(Object) return ten; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenTen_whenFunctionApplyReturnTen_thenCallsApply() {
    // Arrange
    ScalarSecondOrderDifferentiator scalarSecondOrderDifferentiator =
        new ScalarSecondOrderDifferentiator();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualApplyResult = scalarSecondOrderDifferentiator.differentiate(function).apply(10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.0d, actualApplyResult.doubleValue());
  }

  /**
   * Test {@link ScalarSecondOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code -433.8304977480334}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply '0.5' doubleValue is '-433.8304977480334'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApply05DoubleValueIs4338304977480334() {
    // Arrange
    ScalarSecondOrderDifferentiator scalarSecondOrderDifferentiator =
        new ScalarSecondOrderDifferentiator();

    // Act and Assert
    assertEquals(
        -433.8304977480334d,
        scalarSecondOrderDifferentiator
            .differentiate(new InverseIncompleteBetaFunction(10.0d, 10.0d))
            .apply(0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarSecondOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code -3.6703973194107675E-5}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply '0.5' doubleValue is '-3.6703973194107675E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApply05DoubleValueIs36703973194107675e5() {
    // Arrange
    ScalarSecondOrderDifferentiator scalarSecondOrderDifferentiator =
        new ScalarSecondOrderDifferentiator();

    // Act and Assert
    assertEquals(
        -3.6703973194107675E-5d,
        scalarSecondOrderDifferentiator
            .differentiate(new IncompleteBetaFunction(10.0d, 10.0d))
            .apply(0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarSecondOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>When {@link TopHatFunction#TopHatFunction(double, double, double)} with x1 is one and x2
   *       is two and y is three.
   * </ul>
   *
   * <p>Method under test: {@link ScalarSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; when TopHatFunction(double, double, double) with x1 is one and x2 is two and y is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_whenTopHatFunctionWithX1IsOneAndX2IsTwoAndYIsThree() {
    // Arrange
    ScalarSecondOrderDifferentiator scalarSecondOrderDifferentiator =
        new ScalarSecondOrderDifferentiator();

    // Act and Assert
    assertEquals(
        0.0d,
        scalarSecondOrderDifferentiator
            .differentiate(new TopHatFunction(1.0d, 2.0d, 3.0d))
            .apply(10.0d)
            .doubleValue());
  }
}
