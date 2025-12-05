package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SineWeightingFunctionDiffblueTest {
  /**
   * Test {@link SineWeightingFunction#getWeight(double)} with {@code y}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link SineWeightingFunction#getWeight(double)}
   */
  @Test
  @DisplayName("Test getWeight(double) with 'y'; when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SineWeightingFunction.getWeight(double)"})
  void testGetWeightWithY_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, SineWeightingFunction.INSTANCE.getWeight(1.0d));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SineWeightingFunction#toString()}
   *   <li>{@link SineWeightingFunction#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String SineWeightingFunction.getName()",
    "String SineWeightingFunction.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SineWeightingFunction sineWeightingFunction = SineWeightingFunction.INSTANCE;

    // Act
    String actualToStringResult = sineWeightingFunction.toString();

    // Assert
    assertEquals("Sine weighting function", actualToStringResult);
    assertEquals("Sine", sineWeightingFunction.getName());
  }

  /**
   * Test {@link SineWeightingFunction#equals(Object)}, and {@link
   * SineWeightingFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SineWeightingFunction#equals(Object)}
   *   <li>{@link SineWeightingFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SineWeightingFunction.equals(Object)",
    "int SineWeightingFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SineWeightingFunction sineWeightingFunction = SineWeightingFunction.INSTANCE;
    SineWeightingFunction sineWeightingFunction2 = SineWeightingFunction.INSTANCE;

    // Act and Assert
    assertEquals(sineWeightingFunction, sineWeightingFunction2);
    assertEquals(sineWeightingFunction.hashCode(), sineWeightingFunction2.hashCode());
  }

  /**
   * Test {@link SineWeightingFunction#equals(Object)}, and {@link
   * SineWeightingFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SineWeightingFunction#equals(Object)}
   *   <li>{@link SineWeightingFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SineWeightingFunction.equals(Object)",
    "int SineWeightingFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SineWeightingFunction sineWeightingFunction = SineWeightingFunction.INSTANCE;

    // Act and Assert
    assertEquals(sineWeightingFunction, sineWeightingFunction);
    int expectedHashCodeResult = sineWeightingFunction.hashCode();
    assertEquals(expectedHashCodeResult, sineWeightingFunction.hashCode());
  }

  /**
   * Test {@link SineWeightingFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SineWeightingFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SineWeightingFunction.equals(Object)",
    "int SineWeightingFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SineWeightingFunction.INSTANCE, 1);
  }

  /**
   * Test {@link SineWeightingFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SineWeightingFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SineWeightingFunction.equals(Object)",
    "int SineWeightingFunction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SineWeightingFunction.INSTANCE, null);
  }

  /**
   * Test {@link SineWeightingFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SineWeightingFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SineWeightingFunction.equals(Object)",
    "int SineWeightingFunction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SineWeightingFunction.INSTANCE, "Different type to SineWeightingFunction");
  }
}
