package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BasisFunctionGeneratorDiffblueTest {
  /**
   * Test {@link BasisFunctionGenerator#generateSet(BasisFunctionKnots[])} with {@code
   * BasisFunctionKnots[]}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generateSet(BasisFunctionKnots[])}
   */
  @Test
  @DisplayName(
      "Test generateSet(BasisFunctionKnots[]) with 'BasisFunctionKnots[]'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List BasisFunctionGenerator.generateSet(BasisFunctionKnots[])"})
  void testGenerateSetWithBasisFunctionKnots_thenReturnEmpty() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots fromUniformResult = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 1, 0);

    // Act and Assert
    assertTrue(
        basisFunctionGenerator.generateSet(new BasisFunctionKnots[] {fromUniformResult}).isEmpty());
  }

  /**
   * Test {@link BasisFunctionGenerator#generateSet(BasisFunctionKnots[])} with {@code
   * BasisFunctionKnots[]}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generateSet(BasisFunctionKnots[])}
   */
  @Test
  @DisplayName(
      "Test generateSet(BasisFunctionKnots[]) with 'BasisFunctionKnots[]'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List BasisFunctionGenerator.generateSet(BasisFunctionKnots[])"})
  void testGenerateSetWithBasisFunctionKnots_thenReturnSizeIsOne() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots fromUniformResult = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 0);

    // Act and Assert
    assertEquals(
        1, basisFunctionGenerator.generateSet(new BasisFunctionKnots[] {fromUniformResult}).size());
  }

  /**
   * Test {@link BasisFunctionGenerator#generateSet(BasisFunctionKnots[])} with {@code
   * BasisFunctionKnots[]}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generateSet(BasisFunctionKnots[])}
   */
  @Test
  @DisplayName(
      "Test generateSet(BasisFunctionKnots[]) with 'BasisFunctionKnots[]'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List BasisFunctionGenerator.generateSet(BasisFunctionKnots[])"})
  void testGenerateSetWithBasisFunctionKnots_thenReturnSizeIsTwo() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots fromUniformResult = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 1);

    // Act and Assert
    assertEquals(
        2, basisFunctionGenerator.generateSet(new BasisFunctionKnots[] {fromUniformResult}).size());
  }

  /**
   * Test {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)} with {@code data}, {@code
   * index}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)}
   */
  @Test
  @DisplayName(
      "Test generate(BasisFunctionKnots, int) with 'data', 'index'; then return apply '0.5' doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.function.Function BasisFunctionGenerator.generate(BasisFunctionKnots, int)"
  })
  void testGenerateWithDataIndex_thenReturnApply05DoubleValueIsZero() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots data = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 0);

    // Act and Assert
    assertEquals(0.0d, basisFunctionGenerator.generate(data, 0).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)} with {@code data}, {@code
   * index}.
   *
   * <ul>
   *   <li>Then return apply {@link Double#NaN} doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)}
   */
  @Test
  @DisplayName(
      "Test generate(BasisFunctionKnots, int) with 'data', 'index'; then return apply NaN doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.function.Function BasisFunctionGenerator.generate(BasisFunctionKnots, int)"
  })
  void testGenerateWithDataIndex_thenReturnApplyNaNDoubleValueIsNaN() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots data = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 1);

    // Act and Assert
    assertEquals(
        Double.NaN, basisFunctionGenerator.generate(data, 1).apply(Double.NaN).doubleValue());
  }

  /**
   * Test {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)} with {@code data}, {@code
   * index}.
   *
   * <ul>
   *   <li>Then return apply one doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)}
   */
  @Test
  @DisplayName(
      "Test generate(BasisFunctionKnots, int) with 'data', 'index'; then return apply one doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.function.Function BasisFunctionGenerator.generate(BasisFunctionKnots, int)"
  })
  void testGenerateWithDataIndex_thenReturnApplyOneDoubleValueIsOne() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots data = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 0);

    // Act and Assert
    assertEquals(1.0d, basisFunctionGenerator.generate(data, 0).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)} with {@code data}, {@code
   * index}.
   *
   * <ul>
   *   <li>Then return apply one doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)}
   */
  @Test
  @DisplayName(
      "Test generate(BasisFunctionKnots, int) with 'data', 'index'; then return apply one doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.function.Function BasisFunctionGenerator.generate(BasisFunctionKnots, int)"
  })
  void testGenerateWithDataIndex_thenReturnApplyOneDoubleValueIsZero() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots data = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 1);

    // Act and Assert
    assertEquals(0.0d, basisFunctionGenerator.generate(data, 1).apply(1.0d).doubleValue());
  }

  /**
   * Test {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)} with {@code data}, {@code
   * index}.
   *
   * <ul>
   *   <li>Then return apply ten doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)}
   */
  @Test
  @DisplayName(
      "Test generate(BasisFunctionKnots, int) with 'data', 'index'; then return apply ten doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.function.Function BasisFunctionGenerator.generate(BasisFunctionKnots, int)"
  })
  void testGenerateWithDataIndex_thenReturnApplyTenDoubleValueIsOne() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots data = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 1);

    // Act and Assert
    assertEquals(1.0d, basisFunctionGenerator.generate(data, 1).apply(10.0d).doubleValue());
  }

  /**
   * Test {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)} with {@code data}, {@code
   * index}.
   *
   * <ul>
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)}
   */
  @Test
  @DisplayName(
      "Test generate(BasisFunctionKnots, int) with 'data', 'index'; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.function.Function BasisFunctionGenerator.generate(BasisFunctionKnots, int)"
  })
  void testGenerateWithDataIndex_thenReturnApplyTenDoubleValueIsZero() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots data = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 0);

    // Act and Assert
    assertEquals(0.0d, basisFunctionGenerator.generate(data, 0).apply(10.0d).doubleValue());
  }

  /**
   * Test {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)} with {@code data}, {@code
   * index}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionGenerator#generate(BasisFunctionKnots, int)}
   */
  @Test
  @DisplayName(
      "Test generate(BasisFunctionKnots, int) with 'data', 'index'; when zero; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.function.Function BasisFunctionGenerator.generate(BasisFunctionKnots, int)"
  })
  void testGenerateWithDataIndex_whenZero_thenReturnApplyTenDoubleValueIsZero() {
    // Arrange
    BasisFunctionGenerator basisFunctionGenerator = new BasisFunctionGenerator();
    BasisFunctionKnots data = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 1);

    // Act and Assert
    assertEquals(0.0d, basisFunctionGenerator.generate(data, 0).apply(10.0d).doubleValue());
  }
}
