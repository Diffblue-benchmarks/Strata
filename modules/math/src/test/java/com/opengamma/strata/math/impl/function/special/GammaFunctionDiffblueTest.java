package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GammaFunctionDiffblueTest {
  /**
   * Test {@link GammaFunction#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 1.772453850905516}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunction#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); when '0.5'; then return '1.772453850905516'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunction.applyAsDouble(double)"})
  void testApplyAsDouble_when05_thenReturn1772453850905516() {
    // Arrange, Act and Assert
    assertEquals(1.772453850905516d, new GammaFunction().applyAsDouble(0.5d));
  }

  /**
   * Test {@link GammaFunction#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 9.999999999422794E9}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunction#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); when '1.0E-10'; then return '9.999999999422794E9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunction.applyAsDouble(double)"})
  void testApplyAsDouble_when10e10_thenReturn9999999999422794e9() {
    // Arrange, Act and Assert
    assertEquals(9.999999999422794E9d, new GammaFunction().applyAsDouble(1.0E-10d));
  }

  /**
   * Test {@link GammaFunction#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>When {@code 8.000000000000002}.
   *   <li>Then return {@code 5040.00000000002}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunction#applyAsDouble(double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double); when '8.000000000000002'; then return '5040.00000000002'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunction.applyAsDouble(double)"})
  void testApplyAsDouble_when8000000000000002_thenReturn504000000000002() {
    // Arrange, Act and Assert
    assertEquals(5040.00000000002d, new GammaFunction().applyAsDouble(8.000000000000002d));
  }

  /**
   * Test {@link GammaFunction#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>When {@code 2.5000000000000004}.
   *   <li>Then return {@code 1.3293403881791375}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunction#applyAsDouble(double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double); when '2.5000000000000004'; then return '1.3293403881791375'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunction.applyAsDouble(double)"})
  void testApplyAsDouble_when25000000000000004_thenReturn13293403881791375() {
    // Arrange, Act and Assert
    assertEquals(1.3293403881791375d, new GammaFunction().applyAsDouble(2.5000000000000004d));
  }

  /**
   * Test {@link GammaFunction#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>When {@code 0.49999999999999994}.
   *   <li>Then return {@code 1.7724538509055163}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunction#applyAsDouble(double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double); when '0.49999999999999994'; then return '1.7724538509055163'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunction.applyAsDouble(double)"})
  void testApplyAsDouble_when049999999999999994_thenReturn17724538509055163() {
    // Arrange, Act and Assert
    assertEquals(1.7724538509055163d, new GammaFunction().applyAsDouble(0.49999999999999994d));
  }

  /**
   * Test {@link GammaFunction#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunction#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); when two; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunction.applyAsDouble(double)"})
  void testApplyAsDouble_whenTwo_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new GammaFunction().applyAsDouble(2.0d));
  }

  /**
   * Test {@link GammaFunction#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunction#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunction.applyAsDouble(double)"})
  void testApplyAsDouble_whenZero_thenReturnPositive_infinity() {
    // Arrange, Act and Assert
    assertEquals(Double.POSITIVE_INFINITY, new GammaFunction().applyAsDouble(0.0d));
  }
}
