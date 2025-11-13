package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LinearWeightingFunctionDiffblueTest {
  /**
   * Test {@link LinearWeightingFunction#getWeight(double)} with {@code y}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LinearWeightingFunction#getWeight(double)}
   */
  @Test
  @DisplayName("Test getWeight(double) with 'y'; when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LinearWeightingFunction.getWeight(double)"})
  void testGetWeightWithY_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, LinearWeightingFunction.INSTANCE.getWeight(1.0d));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LinearWeightingFunction#toString()}
   *   <li>{@link LinearWeightingFunction#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String LinearWeightingFunction.getName()",
    "String LinearWeightingFunction.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LinearWeightingFunction linearWeightingFunction = LinearWeightingFunction.INSTANCE;

    // Act
    String actualToStringResult = linearWeightingFunction.toString();

    // Assert
    assertEquals("Linear weighting function", actualToStringResult);
    assertEquals("Linear", linearWeightingFunction.getName());
  }

  /**
   * Test {@link LinearWeightingFunction#equals(Object)}, and {@link
   * LinearWeightingFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LinearWeightingFunction#equals(Object)}
   *   <li>{@link LinearWeightingFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinearWeightingFunction.equals(Object)",
    "int LinearWeightingFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LinearWeightingFunction linearWeightingFunction = LinearWeightingFunction.INSTANCE;
    LinearWeightingFunction linearWeightingFunction2 = LinearWeightingFunction.INSTANCE;

    // Act and Assert
    assertEquals(linearWeightingFunction, linearWeightingFunction2);
    assertEquals(linearWeightingFunction.hashCode(), linearWeightingFunction2.hashCode());
  }

  /**
   * Test {@link LinearWeightingFunction#equals(Object)}, and {@link
   * LinearWeightingFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LinearWeightingFunction#equals(Object)}
   *   <li>{@link LinearWeightingFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinearWeightingFunction.equals(Object)",
    "int LinearWeightingFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LinearWeightingFunction linearWeightingFunction = LinearWeightingFunction.INSTANCE;

    // Act and Assert
    assertEquals(linearWeightingFunction, linearWeightingFunction);
    int expectedHashCodeResult = linearWeightingFunction.hashCode();
    assertEquals(expectedHashCodeResult, linearWeightingFunction.hashCode());
  }

  /**
   * Test {@link LinearWeightingFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LinearWeightingFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinearWeightingFunction.equals(Object)",
    "int LinearWeightingFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LinearWeightingFunction.INSTANCE, 1);
  }

  /**
   * Test {@link LinearWeightingFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LinearWeightingFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinearWeightingFunction.equals(Object)",
    "int LinearWeightingFunction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LinearWeightingFunction.INSTANCE, null);
  }

  /**
   * Test {@link LinearWeightingFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LinearWeightingFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinearWeightingFunction.equals(Object)",
    "int LinearWeightingFunction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LinearWeightingFunction.INSTANCE, "Different type to LinearWeightingFunction");
  }
}
