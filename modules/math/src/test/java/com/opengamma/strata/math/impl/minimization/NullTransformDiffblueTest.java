package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NullTransformDiffblueTest {
  /**
   * Test {@link NullTransform#inverseTransform(double)}.
   *
   * <p>Method under test: {@link NullTransform#inverseTransform(double)}
   */
  @Test
  @DisplayName("Test inverseTransform(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NullTransform.inverseTransform(double)"})
  void testInverseTransform() {
    // Arrange, Act and Assert
    assertEquals(3.0d, new NullTransform().inverseTransform(3.0d));
  }

  /**
   * Test {@link NullTransform#inverseTransformGradient(double)}.
   *
   * <p>Method under test: {@link NullTransform#inverseTransformGradient(double)}
   */
  @Test
  @DisplayName("Test inverseTransformGradient(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NullTransform.inverseTransformGradient(double)"})
  void testInverseTransformGradient() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new NullTransform().inverseTransformGradient(3.0d));
  }

  /**
   * Test {@link NullTransform#transform(double)}.
   *
   * <p>Method under test: {@link NullTransform#transform(double)}
   */
  @Test
  @DisplayName("Test transform(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NullTransform.transform(double)"})
  void testTransform() {
    // Arrange, Act and Assert
    assertEquals(2.0d, new NullTransform().transform(2.0d));
  }

  /**
   * Test {@link NullTransform#transformGradient(double)}.
   *
   * <p>Method under test: {@link NullTransform#transformGradient(double)}
   */
  @Test
  @DisplayName("Test transformGradient(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NullTransform.transformGradient(double)"})
  void testTransformGradient() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new NullTransform().transformGradient(2.0d));
  }

  /**
   * Test {@link NullTransform#equals(Object)}, and {@link NullTransform#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NullTransform#equals(Object)}
   *   <li>{@link NullTransform#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullTransform.equals(Object)", "int NullTransform.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NullTransform nullTransform = new NullTransform();
    NullTransform nullTransform2 = new NullTransform();

    // Act and Assert
    assertEquals(nullTransform, nullTransform2);
    assertEquals(nullTransform.hashCode(), nullTransform2.hashCode());
  }

  /**
   * Test {@link NullTransform#equals(Object)}, and {@link NullTransform#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NullTransform#equals(Object)}
   *   <li>{@link NullTransform#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullTransform.equals(Object)", "int NullTransform.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NullTransform nullTransform = new NullTransform();

    // Act and Assert
    assertEquals(nullTransform, nullTransform);
    int expectedHashCodeResult = nullTransform.hashCode();
    assertEquals(expectedHashCodeResult, nullTransform.hashCode());
  }

  /**
   * Test {@link NullTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NullTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullTransform.equals(Object)", "int NullTransform.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NullTransform(), 1);
  }

  /**
   * Test {@link NullTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NullTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullTransform.equals(Object)", "int NullTransform.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NullTransform(), null);
  }

  /**
   * Test {@link NullTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NullTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NullTransform.equals(Object)", "int NullTransform.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NullTransform(), "Different type to NullTransform");
  }
}
