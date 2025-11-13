package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BasisFunctionKnotsDiffblueTest {
  /**
   * Test {@link BasisFunctionKnots#fromUniform(double, double, int, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return Degree is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionKnots#fromUniform(double, double, int, int)}
   */
  @Test
  @DisplayName("Test fromUniform(double, double, int, int); when two; then return Degree is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisFunctionKnots BasisFunctionKnots.fromUniform(double, double, int, int)"})
  void testFromUniform_whenTwo_thenReturnDegreeIsOne() {
    // Arrange and Act
    BasisFunctionKnots actualFromUniformResult = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 2, 1);

    // Assert
    assertEquals(1, actualFromUniformResult.getDegree());
    assertEquals(2, actualFromUniformResult.getNumSplines());
    assertEquals(4, actualFromUniformResult.getNumKnots());
    assertArrayEquals(
        new double[] {-8.0d, 1.0d, 10.0d, 19.0d}, actualFromUniformResult.getKnots(), 0.0);
  }

  /**
   * Test {@link BasisFunctionKnots#getKnots()}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with ten.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionKnots#getKnots()}
   */
  @Test
  @DisplayName("Test getKnots(); then return array of double with ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] BasisFunctionKnots.getKnots()"})
  void testGetKnots_thenReturnArrayOfDoubleWithTen() {
    // Arrange
    BasisFunctionKnots fromUniformResult = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 1, 0);

    // Act and Assert
    assertArrayEquals(new double[] {10.0d}, fromUniformResult.getKnots(), 0.0);
  }

  /**
   * Test {@link BasisFunctionKnots#getNumKnots()}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BasisFunctionKnots#getNumKnots()}
   */
  @Test
  @DisplayName("Test getNumKnots(); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BasisFunctionKnots.getNumKnots()"})
  void testGetNumKnots_thenReturnOne() {
    // Arrange
    BasisFunctionKnots fromUniformResult = BasisFunctionKnots.fromUniform(1.0d, 10.0d, 1, 0);

    // Act and Assert
    assertEquals(1, fromUniformResult.getNumKnots());
  }
}
