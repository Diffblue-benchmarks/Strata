package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IncompleteBetaFunctionDiffblueTest {
  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new IncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction() {
    // Arrange, Act and Assert
    assertEquals(
        9.237799999924733E-116d,
        new IncompleteBetaFunction(10.0d, 10.0d).apply(1.0E-12d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName("Test new IncompleteBetaFunction(double, double, double, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction2() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(10.0d, 10.0d, 0.015625d, 3);

    // Assert
    assertEquals(
        9.237799999924733E-116d, actualIncompleteBetaFunction.apply(1.0E-12d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code 0.5000000000001835}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); then return apply '0.5' doubleValue is '0.5000000000001835'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_thenReturnApply05DoubleValueIs05000000000001835() {
    // Arrange, Act and Assert
    assertEquals(
        0.5000000000001835d, new IncompleteBetaFunction(10.0d, 10.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when '0.5'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_when05_thenReturnApplyOneDoubleValueIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(0.5d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when '0.5'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_when05_thenReturnApplyOneDoubleValueIsOne2() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 0.5d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when '0.5'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_when05_thenReturnApplyOneDoubleValueIsOne3() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(0.5d, 10.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when '0.5'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_when05_thenReturnApplyOneDoubleValueIsOne4() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(1.0d, 0.5d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when '1.0E-12'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_when10e12_thenReturnApplyOneDoubleValueIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0E-12d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when '1.0E-12'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_when10e12_thenReturnApplyOneDoubleValueIsOne2() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 1.0E-12d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when '1.0E-12'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_when10e12_thenReturnApplyOneDoubleValueIsOne3() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0E-12d, 0.5d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when '1.0E-12'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_when10e12_thenReturnApplyOneDoubleValueIsOne4() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(1.0E-12d, 10.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when '1.0E-12'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_when10e12_thenReturnApplyOneDoubleValueIsOne5() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(1.0d, 1.0E-12d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when '1.0E-12'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_when10e12_thenReturnApplyOneDoubleValueIsOne6() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(1.0E-12d, 0.5d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when one; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_whenOne_thenReturnApplyOneDoubleValueIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when one; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_whenOne_thenReturnApplyOneDoubleValueIsOne2() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(10.0d, 1.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when one; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_whenOne_thenReturnApplyOneDoubleValueIsOne3() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 1.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when one; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenOne_thenReturnApplyOneDoubleValueIsOne4() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(1.0d, 10.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when one; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenOne_thenReturnApplyOneDoubleValueIsOne5() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(10.0d, 1.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when one; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenOne_thenReturnApplyOneDoubleValueIsOne6() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(1.0d, 1.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when ten; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenTen_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> new IncompleteBetaFunction(10.0d, 10.0d, 0.015625d, 3));
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when ten; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_whenTen_thenReturnApplyOneDoubleValueIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(10.0d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when ten; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenTen_thenReturnApplyOneDoubleValueIsOne2() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(10.0d, 10.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when two; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_whenTwo_thenReturnApplyOneDoubleValueIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(2.0d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when two; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_whenTwo_thenReturnApplyOneDoubleValueIsOne2() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 2.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double); when two; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double)"})
  void testNewIncompleteBetaFunction_whenTwo_thenReturnApplyOneDoubleValueIsOne3() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(2.0d, 2.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when two; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenTwo_thenReturnApplyOneDoubleValueIsOne4() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(2.0d, 10.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when two; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenTwo_thenReturnApplyOneDoubleValueIsOne5() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(1.0d, 2.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double, double, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteBetaFunction(double, double, double, int); when two; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteBetaFunction.<init>(double, double, double, int)"})
  void testNewIncompleteBetaFunction_whenTwo_thenReturnApplyOneDoubleValueIsOne6() {
    // Arrange and Act
    IncompleteBetaFunction actualIncompleteBetaFunction =
        new IncompleteBetaFunction(2.0d, 2.0d, 0.015625d, 3);

    // Assert
    assertEquals(1.0d, actualIncompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble() {
    // Arrange
    IncompleteBetaFunction incompleteBetaFunction =
        new IncompleteBetaFunction(2.0d, 2.0d, 0.015625d, 3);

    // Act and Assert
    assertEquals(1.0d, incompleteBetaFunction.apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble2() {
    // Arrange
    IncompleteBetaFunction incompleteBetaFunction = new IncompleteBetaFunction(2.0d, 2.0d, 0.0d, 3);

    // Act and Assert
    assertThrows(MathException.class, () -> incompleteBetaFunction.apply(1.0d));
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is
   *       {@code 0.5} and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is '0.5' and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIs05AndBIsTen() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(0.5d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is
   *       {@code 1.0E-12} and b is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is '1.0E-12' and b is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIs10e12AndBIs05() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0E-12d, 0.5d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is
   *       {@code 1.0E-12} and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is '1.0E-12' and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIs10e12AndBIsTen() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0E-12d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is one and b is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsOneAndBIs05() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 0.5d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is {@code 1.0E-12}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is one and b is '1.0E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsOneAndBIs10e12() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 1.0E-12d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is one and b is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsOneAndBIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 1.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is one and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsOneAndBIsTen() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is two.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is one and b is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsOneAndBIsTwo() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(1.0d, 2.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is ten
   *       and b is one.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is ten and b is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsTenAndBIsOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(10.0d, 1.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is ten
   *       and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is ten and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsTenAndBIsTen() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(10.0d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is two
   *       and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteBetaFunction(double, double) with a is two and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteBetaFunctionWithAIsTwoAndBIsTen() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new IncompleteBetaFunction(2.0d, 10.0d).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenThrowMathException() {
    // Arrange
    IncompleteBetaFunction incompleteBetaFunction =
        new IncompleteBetaFunction(2.0d, 2.0d, 0.015625d, 3);

    // Act and Assert
    assertThrows(MathException.class, () -> incompleteBetaFunction.apply(0.5d));
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return doubleValue is {@code 0.5000000000001835}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; when '0.5'; then return doubleValue is '0.5000000000001835'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_when05_thenReturnDoubleValueIs05000000000001835() {
    // Arrange, Act and Assert
    assertEquals(
        0.5000000000001835d, new IncompleteBetaFunction(10.0d, 10.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link IncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return doubleValue is {@code 9.237799999924733E-116}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; when '1.0E-12'; then return doubleValue is '9.237799999924733E-116'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_when10e12_thenReturnDoubleValueIs9237799999924733e116() {
    // Arrange, Act and Assert
    assertEquals(
        9.237799999924733E-116d,
        new IncompleteBetaFunction(10.0d, 10.0d).apply(1.0E-12d).doubleValue());
  }
}
