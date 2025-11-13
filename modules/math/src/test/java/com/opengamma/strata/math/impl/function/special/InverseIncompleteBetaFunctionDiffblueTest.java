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
        4.4187422754529164E-12d,
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
        2.582750931951612E-11d,
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

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   *       with a is {@code 0.5} and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given InverseIncompleteBetaFunction(double, double) with a is '0.5' and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenInverseIncompleteBetaFunctionWithAIs05AndBIsTen() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class, () -> new InverseIncompleteBetaFunction(0.5d, 10.0d).apply(1.0d));
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   *       with a is {@code 0.5} and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given InverseIncompleteBetaFunction(double, double) with a is '0.5' and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenInverseIncompleteBetaFunctionWithAIs05AndBIsTen2() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class, () -> new InverseIncompleteBetaFunction(0.5d, 10.0d).apply(0.0d));
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link InverseIncompleteBetaFunction#InverseIncompleteBetaFunction(double, double)}
   *       with a is ten and b is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given InverseIncompleteBetaFunction(double, double) with a is ten and b is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_givenInverseIncompleteBetaFunctionWithAIsTenAndBIs05() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class, () -> new InverseIncompleteBetaFunction(10.0d, 0.5d).apply(1.0d));
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 4.49398621728058E-11}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '4.49398621728058E-11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs449398621728058e11() {
    // Arrange, Act and Assert
    assertEquals(
        4.49398621728058E-11d,
        new InverseIncompleteBetaFunction(1.0d, 10.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 2.582750931951612E-11}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '2.582750931951612E-11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs2582750931951612e11() {
    // Arrange, Act and Assert
    assertEquals(
        2.582750931951612E-11d,
        new InverseIncompleteBetaFunction(1.0d, 2.30753d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.9328189171593043}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is '0.9328189171593043'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs09328189171593043() {
    // Arrange, Act and Assert
    assertEquals(
        0.9328189171593043d,
        new InverseIncompleteBetaFunction(10.0d, 1.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.9887044515523529}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is '0.9887044515523529'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs09887044515523529() {
    // Arrange, Act and Assert
    assertEquals(
        0.9887044515523529d,
        new InverseIncompleteBetaFunction(0.9999999999997514d, 1.0E-16d)
            .apply(1.0E-16d)
            .doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.9999999999997224}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is '0.9999999999997224'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs09999999999997224() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999997224d,
        new InverseIncompleteBetaFunction(1.0d, 1.0E-16d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.15771106594423187}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is '0.15771106594423187'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs015771106594423187() {
    // Arrange, Act and Assert
    assertEquals(
        0.15771106594423187d,
        new InverseIncompleteBetaFunction(10.0d, 10.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 1.6885453131719634E-4}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '1.6885453131719634E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs16885453131719634e4() {
    // Arrange, Act and Assert
    assertEquals(
        1.6885453131719634E-4d,
        new InverseIncompleteBetaFunction(10.0d, 1.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.0021310108223894335}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '0.0021310108223894335'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs00021310108223894335() {
    // Arrange, Act and Assert
    assertEquals(
        0.0021310108223894335d,
        new InverseIncompleteBetaFunction(2.30753d, 10.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.029840275393468778}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '0.029840275393468778'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs0029840275393468778() {
    // Arrange, Act and Assert
    assertEquals(
        0.029840275393468778d,
        new InverseIncompleteBetaFunction(10.0d, 0.5d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 4.1480238239215747E-4}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '4.1480238239215747E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs41480238239215747e4() {
    // Arrange, Act and Assert
    assertEquals(
        4.1480238239215747E-4d,
        new InverseIncompleteBetaFunction(2.30753d, 2.30753d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 4.4187422754529164E-12}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '4.4187422754529164E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs44187422754529164e12() {
    // Arrange, Act and Assert
    assertEquals(
        4.4187422754529164E-12d,
        new InverseIncompleteBetaFunction(1.0d, 1.0d).apply(1.0E-16d).doubleValue());
  }

  /**
   * Test {@link InverseIncompleteBetaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return doubleValue is {@code 0.47639976575461507}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteBetaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; when '0.5'; then return doubleValue is '0.47639976575461507'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double InverseIncompleteBetaFunction.apply(Double)"})
  void testApplyWithDouble_when05_thenReturnDoubleValueIs047639976575461507() {
    // Arrange, Act and Assert
    assertEquals(
        0.47639976575461507d,
        new InverseIncompleteBetaFunction(10.0d, 10.0d).apply(0.5d).doubleValue());
  }
}
