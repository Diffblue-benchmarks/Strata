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
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScalarFirstOrderDifferentiatorDiffblueTest {
  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.FORWARD);

    // Act and Assert
    assertEquals(
        9.237044207712808E-41d,
        scalarFirstOrderDifferentiator
            .differentiate(new IncompleteBetaFunction(10.0d, 10.0d))
            .apply(0.0d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function, Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given ten; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function, Function)"})
  void testDifferentiateWithFunctionDomain_givenTen_thenReturnApplyTenDoubleValueIsZero() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<Double>any())).thenReturn(true);

    // Act
    Double actualApplyResult =
        scalarFirstOrderDifferentiator.differentiate(function, domain).apply(10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    verify(domain, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.0d, actualApplyResult.doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given ten; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenTen_thenReturnApplyTenDoubleValueIsZero() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.FORWARD);

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualApplyResult = scalarFirstOrderDifferentiator.differentiate(function).apply(10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.0d, actualApplyResult.doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given ten; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenTen_thenReturnApplyTenDoubleValueIsZero2() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD);

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualApplyResult = scalarFirstOrderDifferentiator.differentiate(function).apply(10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.0d, actualApplyResult.doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code -0.013858167691171984}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply '0.5' doubleValue is '-0.013858167691171984'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApply05DoubleValueIs0013858167691171984() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.FORWARD);

    // Act and Assert
    assertEquals(
        -0.013858167691171984d,
        scalarFirstOrderDifferentiator
            .differentiate(new InverseIncompleteBetaFunction(10.0d, 10.0d))
            .apply(0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code 0.018893516334772542}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply '0.5' doubleValue is '0.018893516334772542'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApply05DoubleValueIs0018893516334772542() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD);

    // Act and Assert
    assertEquals(
        0.018893516334772542d,
        scalarFirstOrderDifferentiator
            .differentiate(new InverseIncompleteBetaFunction(10.0d, 10.0d))
            .apply(0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code 0.0025176743218002784}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply '0.5' doubleValue is '0.0025176743218002784'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApply05DoubleValueIs00025176743218002784() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.CENTRAL);

    // Act and Assert
    assertEquals(
        0.0025176743218002784d,
        scalarFirstOrderDifferentiator
            .differentiate(new InverseIncompleteBetaFunction(10.0d, 10.0d))
            .apply(0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code 3.5239410174942027}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply '0.5' doubleValue is '3.5239410174942027'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApply05DoubleValueIs35239410174942027() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.CENTRAL);

    // Act and Assert
    assertEquals(
        3.5239410174942027d,
        scalarFirstOrderDifferentiator
            .differentiate(new IncompleteBetaFunction(10.0d, 10.0d))
            .apply(0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply one doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply one doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApplyOneDoubleValueIsZero() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD);

    // Act and Assert
    assertEquals(
        0.0d,
        scalarFirstOrderDifferentiator
            .differentiate(new IncompleteBetaFunction(10.0d, 10.0d))
            .apply(1.0d)
            .doubleValue());
  }

  /**
   * Test {@link ScalarFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApplyTenDoubleValueIsZero() {
    // Arrange
    ScalarFirstOrderDifferentiator scalarFirstOrderDifferentiator =
        new ScalarFirstOrderDifferentiator();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualApplyResult = scalarFirstOrderDifferentiator.differentiate(function).apply(10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.0d, actualApplyResult.doubleValue());
  }
}
