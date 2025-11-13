package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.minimization.ParameterLimitsTransform.LimitType;
import java.util.BitSet;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UncoupledParameterTransformsDiffblueTest {
  /**
   * Test {@link UncoupledParameterTransforms#UncoupledParameterTransforms(DoubleArray,
   * ParameterLimitsTransform[], BitSet)}.
   *
   * <ul>
   *   <li>Then return NumberOfFittingParameters is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * UncoupledParameterTransforms#UncoupledParameterTransforms(DoubleArray,
   * ParameterLimitsTransform[], BitSet)}
   */
  @Test
  @DisplayName(
      "Test new UncoupledParameterTransforms(DoubleArray, ParameterLimitsTransform[], BitSet); then return NumberOfFittingParameters is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UncoupledParameterTransforms.<init>(DoubleArray, ParameterLimitsTransform[], BitSet)"
  })
  void testNewUncoupledParameterTransforms_thenReturnNumberOfFittingParametersIsOne() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    // Act
    UncoupledParameterTransforms actualUncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Assert
    assertEquals(1, actualUncoupledParameterTransforms.getNumberOfFittingParameters());
    assertEquals(1, actualUncoupledParameterTransforms.getNumberOfModelParameters());
  }

  /**
   * Test {@link UncoupledParameterTransforms#transform(DoubleArray)}.
   *
   * <ul>
   *   <li>Then return max is minus fifty.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#transform(DoubleArray)}
   */
  @Test
  @DisplayName("Test transform(DoubleArray); then return max is minus fifty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray UncoupledParameterTransforms.transform(DoubleArray)"})
  void testTransform_thenReturnMaxIsMinusFifty() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms =
        new ParameterLimitsTransform[] {
          new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN)
        };

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act
    DoubleArray actualTransformResult =
        uncoupledParameterTransforms.transform(DoubleArray.of(10.0d));

    // Assert
    assertEquals(-50.0d, actualTransformResult.max());
    assertEquals(-50.0d, actualTransformResult.min());
    assertEquals(-50.0d, actualTransformResult.sum());
    List<Double> toListResult = actualTransformResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(-50.0d, toListResult.get(0).doubleValue());
    assertEquals(1, actualTransformResult.dimensions());
    assertEquals(1, actualTransformResult.size());
    assertFalse(actualTransformResult.isEmpty());
    assertArrayEquals(new double[] {-50.0d}, actualTransformResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link UncoupledParameterTransforms#transform(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return {@link DoubleArray} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#transform(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test transform(DoubleArray); when DoubleArray with value is ten; then return DoubleArray with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray UncoupledParameterTransforms.transform(DoubleArray)"})
  void testTransform_whenDoubleArrayWithValueIsTen_thenReturnDoubleArrayWithValueIsTen() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act and Assert
    assertEquals(startValues, uncoupledParameterTransforms.transform(DoubleArray.of(10.0d)));
  }

  /**
   * Test {@link UncoupledParameterTransforms#inverseTransform(DoubleArray)}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#inverseTransform(DoubleArray)}
   */
  @Test
  @DisplayName("Test inverseTransform(DoubleArray); then return DoubleArray with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray UncoupledParameterTransforms.inverseTransform(DoubleArray)"})
  void testInverseTransform_thenReturnDoubleArrayWithValueIsTen() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act and Assert
    assertEquals(startValues, uncoupledParameterTransforms.inverseTransform(DoubleArray.of(10.0d)));
  }

  /**
   * Test {@link UncoupledParameterTransforms#jacobian(DoubleArray)}.
   *
   * <ul>
   *   <li>Then return total is {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#jacobian(DoubleArray)}
   */
  @Test
  @DisplayName("Test jacobian(DoubleArray); then return total is POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix UncoupledParameterTransforms.jacobian(DoubleArray)"})
  void testJacobian_thenReturnTotalIsPositive_infinity() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms =
        new ParameterLimitsTransform[] {
          new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN)
        };

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act
    DoubleMatrix actualJacobianResult =
        uncoupledParameterTransforms.jacobian(DoubleArray.of(10.0d));

    // Assert
    assertEquals(1, actualJacobianResult.size());
    double[][] toArrayUnsafeResult = actualJacobianResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(2, actualJacobianResult.dimensions());
    assertFalse(actualJacobianResult.isEmpty());
    assertTrue(actualJacobianResult.isSquare());
    assertEquals(Double.POSITIVE_INFINITY, actualJacobianResult.total());
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link UncoupledParameterTransforms#jacobian(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return total is one.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#jacobian(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test jacobian(DoubleArray); when DoubleArray with value is ten; then return total is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix UncoupledParameterTransforms.jacobian(DoubleArray)"})
  void testJacobian_whenDoubleArrayWithValueIsTen_thenReturnTotalIsOne() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act
    DoubleMatrix actualJacobianResult =
        uncoupledParameterTransforms.jacobian(DoubleArray.of(10.0d));

    // Assert
    assertEquals(1, actualJacobianResult.size());
    double[][] toArrayUnsafeResult = actualJacobianResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, actualJacobianResult.total());
    assertEquals(2, actualJacobianResult.dimensions());
    assertFalse(actualJacobianResult.isEmpty());
    assertTrue(actualJacobianResult.isSquare());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link UncoupledParameterTransforms#inverseJacobian(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#inverseJacobian(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test inverseJacobian(DoubleArray); when DoubleArray with value is ten; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix UncoupledParameterTransforms.inverseJacobian(DoubleArray)"})
  void testInverseJacobian_whenDoubleArrayWithValueIsTen_thenReturnSizeIsOne() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act
    DoubleMatrix actualInverseJacobianResult =
        uncoupledParameterTransforms.inverseJacobian(DoubleArray.of(10.0d));

    // Assert
    assertEquals(1, actualInverseJacobianResult.size());
    double[][] toArrayUnsafeResult = actualInverseJacobianResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, actualInverseJacobianResult.total());
    assertEquals(2, actualInverseJacobianResult.dimensions());
    assertFalse(actualInverseJacobianResult.isEmpty());
    assertTrue(actualInverseJacobianResult.isSquare());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link UncoupledParameterTransforms#equals(Object)}, and {@link
   * UncoupledParameterTransforms#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UncoupledParameterTransforms#equals(Object)}
   *   <li>{@link UncoupledParameterTransforms#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UncoupledParameterTransforms.equals(Object)",
    "int UncoupledParameterTransforms.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());
    DoubleArray startValues2 = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms2 = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms uncoupledParameterTransforms2 =
        new UncoupledParameterTransforms(startValues2, transforms2, new BitSet());

    // Act and Assert
    assertEquals(uncoupledParameterTransforms, uncoupledParameterTransforms2);
    assertEquals(uncoupledParameterTransforms.hashCode(), uncoupledParameterTransforms2.hashCode());
  }

  /**
   * Test {@link UncoupledParameterTransforms#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UncoupledParameterTransforms.equals(Object)",
    "int UncoupledParameterTransforms.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    // Act and Assert
    assertNotEquals(new UncoupledParameterTransforms(startValues, transforms, new BitSet()), 1);
  }

  /**
   * Test {@link UncoupledParameterTransforms#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UncoupledParameterTransforms.equals(Object)",
    "int UncoupledParameterTransforms.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    // Act and Assert
    assertNotEquals(new UncoupledParameterTransforms(startValues, transforms, new BitSet()), null);
  }

  /**
   * Test {@link UncoupledParameterTransforms#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UncoupledParameterTransforms#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UncoupledParameterTransforms.equals(Object)",
    "int UncoupledParameterTransforms.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DoubleArray startValues = DoubleArray.of(0.5d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms uncoupledParameterTransforms =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());
    DoubleArray startValues2 = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms2 = new ParameterLimitsTransform[] {new NullTransform()};

    // Act and Assert
    assertNotEquals(
        uncoupledParameterTransforms,
        new UncoupledParameterTransforms(startValues2, transforms2, new BitSet()));
  }
}
