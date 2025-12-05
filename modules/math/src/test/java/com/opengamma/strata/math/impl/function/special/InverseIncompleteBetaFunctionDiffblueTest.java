package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InverseIncompleteBetaFunctionDiffblueTest {
  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction() {
    // Arrange, Act and Assert
    assertEquals(
        0.15771106594423187d,
        new InverseIncompleteBetaFunction(10.0d, 10.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction2() {
    // Arrange, Act and Assert
    assertEquals(
        0.47639976575461507d,
        new InverseIncompleteBetaFunction(10.0d, 10.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction3() {
    // Arrange, Act and Assert
    assertEquals(
        4.49398621728058E-11d,
        new InverseIncompleteBetaFunction(1.0d, 10.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction4() {
    // Arrange, Act and Assert
    assertEquals(
        0.0021310108223894335d,
        new InverseIncompleteBetaFunction(2.30753d, 10.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction5() {
    // Arrange, Act and Assert
    assertEquals(
        1.6885453131719634E-4d,
        new InverseIncompleteBetaFunction(10.0d, 1.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction6() {
    // Arrange, Act and Assert
    assertEquals(
        0.029840275393468778d,
        new InverseIncompleteBetaFunction(10.0d, 0.5d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction7() {
    // Arrange, Act and Assert
    assertEquals(
        0.9328189171593043d,
        new InverseIncompleteBetaFunction(10.0d, 1.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction8() {
    // Arrange, Act and Assert
    assertEquals(
        4.41874227545291E-12d,
        new InverseIncompleteBetaFunction(1.0d, 1.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction9() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999997224d,
        new InverseIncompleteBetaFunction(1.0d, 1.0E-16d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction10() {
    // Arrange, Act and Assert
    assertEquals(
        2.5827509319516237E-11d,
        new InverseIncompleteBetaFunction(1.0d, 2.30753d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction11() {
    // Arrange, Act and Assert
    assertEquals(
        4.1480238239215747E-4d,
        new InverseIncompleteBetaFunction(2.30753d, 2.30753d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new InverseIncompleteBetaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction12() {
    // Arrange, Act and Assert
    assertEquals(
        0.9887044515523529d,
        new InverseIncompleteBetaFunction(0.9999999999997514d, 1.0E-16d)
            .apply(1.0E-16d)
            .doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link
   * InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   */
  @Test
  @DisplayName(
      "Test new InverseIncompleteBetaFunction(double, double); when ten; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteBetaFunction.<init>(double, double)"})
  void testNewInverseIncompleteBetaFunction_whenTen_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> new InverseIncompleteBetaFunction(10.0d, 10.0d));
  }
}
