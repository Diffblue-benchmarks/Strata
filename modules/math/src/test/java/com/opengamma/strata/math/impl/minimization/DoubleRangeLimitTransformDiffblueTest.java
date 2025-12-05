package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleRangeLimitTransformDiffblueTest {
  /**
   * Test {@link DoubleRangeLimitTransform#DoubleRangeLimitTransform(double, double)}.
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#DoubleRangeLimitTransform(double,
   * double)}
   */
  @Test
  @DisplayName("Test new DoubleRangeLimitTransform(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleRangeLimitTransform.<init>(double, double)"})
  void testNewDoubleRangeLimitTransform() {
    // Arrange and Act
    DoubleRangeLimitTransform actualDoubleRangeLimitTransform =
        new DoubleRangeLimitTransform(-25.0d, 10.0d);

    // Assert
    assertEquals(0.08101851851851852d, actualDoubleRangeLimitTransform.transformGradient(2.0d));
    assertEquals(
        0.17265565039520336d, actualDoubleRangeLimitTransform.inverseTransformGradient(3.0d));
    assertEquals(0.6081976621622465d, actualDoubleRangeLimitTransform.transform(2.0d));
    assertEquals(9.913458189517783d, actualDoubleRangeLimitTransform.inverseTransform(3.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#inverseTransform(double)}.
   *
   * <ul>
   *   <li>When {@code -25.000000000000004}.
   *   <li>Then return minus twenty-five.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#inverseTransform(double)}
   */
  @Test
  @DisplayName(
      "Test inverseTransform(double); when '-25.000000000000004'; then return minus twenty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.inverseTransform(double)"})
  void testInverseTransform_when25000000000000004_thenReturnMinusTwentyFive() {
    // Arrange, Act and Assert
    assertEquals(
        -25.0d,
        new DoubleRangeLimitTransform(-25.0d, 10.0d).inverseTransform(-25.000000000000004d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#inverseTransform(double)}.
   *
   * <ul>
   *   <li>When {@code 25.000000000000004}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#inverseTransform(double)}
   */
  @Test
  @DisplayName("Test inverseTransform(double); when '25.000000000000004'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.inverseTransform(double)"})
  void testInverseTransform_when25000000000000004_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, new DoubleRangeLimitTransform(-25.0d, 10.0d).inverseTransform(25.000000000000004d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#inverseTransform(double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 9.913458189517783}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#inverseTransform(double)}
   */
  @Test
  @DisplayName("Test inverseTransform(double); when three; then return '9.913458189517783'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.inverseTransform(double)"})
  void testInverseTransform_whenThree_thenReturn9913458189517783() {
    // Arrange, Act and Assert
    assertEquals(
        9.913458189517783d, new DoubleRangeLimitTransform(-25.0d, 10.0d).inverseTransform(3.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#transform(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.6081976621622465}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#transform(double)}
   */
  @Test
  @DisplayName("Test transform(double); then return '0.6081976621622465'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.transform(double)"})
  void testTransform_thenReturn06081976621622465() {
    // Arrange, Act and Assert
    assertEquals(0.6081976621622465d, new DoubleRangeLimitTransform(-25.0d, 10.0d).transform(2.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#transform(double)}.
   *
   * <ul>
   *   <li>Then return minus twenty-five.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#transform(double)}
   */
  @Test
  @DisplayName("Test transform(double); then return minus twenty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.transform(double)"})
  void testTransform_thenReturnMinusTwentyFive() {
    // Arrange, Act and Assert
    assertEquals(-25.0d, new DoubleRangeLimitTransform(2.0d, 10.0d).transform(2.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#transform(double)}.
   *
   * <ul>
   *   <li>Then return twenty-five.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#transform(double)}
   */
  @Test
  @DisplayName("Test transform(double); then return twenty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.transform(double)"})
  void testTransform_thenReturnTwentyFive() {
    // Arrange, Act and Assert
    assertEquals(25.0d, new DoubleRangeLimitTransform(-25.0d, 2.0d).transform(2.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#inverseTransformGradient(double)}.
   *
   * <ul>
   *   <li>When {@code 25.000000000000004}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#inverseTransformGradient(double)}
   */
  @Test
  @DisplayName("Test inverseTransformGradient(double); when '25.000000000000004'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.inverseTransformGradient(double)"})
  void testInverseTransformGradient_when25000000000000004_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        new DoubleRangeLimitTransform(-25.0d, 10.0d).inverseTransformGradient(25.000000000000004d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#inverseTransformGradient(double)}.
   *
   * <ul>
   *   <li>When {@code -25.000000000000004}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#inverseTransformGradient(double)}
   */
  @Test
  @DisplayName(
      "Test inverseTransformGradient(double); when '-25.000000000000004'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.inverseTransformGradient(double)"})
  void testInverseTransformGradient_when25000000000000004_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        new DoubleRangeLimitTransform(-25.0d, 10.0d)
            .inverseTransformGradient(-25.000000000000004d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#inverseTransformGradient(double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 0.17265565039520336}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#inverseTransformGradient(double)}
   */
  @Test
  @DisplayName(
      "Test inverseTransformGradient(double); when three; then return '0.17265565039520336'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.inverseTransformGradient(double)"})
  void testInverseTransformGradient_whenThree_thenReturn017265565039520336() {
    // Arrange, Act and Assert
    assertEquals(
        0.17265565039520336d,
        new DoubleRangeLimitTransform(-25.0d, 10.0d).inverseTransformGradient(3.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#transformGradient(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.08101851851851852}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#transformGradient(double)}
   */
  @Test
  @DisplayName("Test transformGradient(double); then return '0.08101851851851852'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleRangeLimitTransform.transformGradient(double)"})
  void testTransformGradient_thenReturn008101851851851852() {
    // Arrange, Act and Assert
    assertEquals(
        0.08101851851851852d, new DoubleRangeLimitTransform(-25.0d, 10.0d).transformGradient(2.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#equals(Object)}, and {@link
   * DoubleRangeLimitTransform#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DoubleRangeLimitTransform#equals(Object)}
   *   <li>{@link DoubleRangeLimitTransform#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleRangeLimitTransform.equals(Object)",
    "int DoubleRangeLimitTransform.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleRangeLimitTransform doubleRangeLimitTransform =
        new DoubleRangeLimitTransform(-25.0d, 10.0d);
    DoubleRangeLimitTransform doubleRangeLimitTransform2 =
        new DoubleRangeLimitTransform(-25.0d, 10.0d);

    // Act and Assert
    assertEquals(doubleRangeLimitTransform, doubleRangeLimitTransform2);
    assertEquals(doubleRangeLimitTransform.hashCode(), doubleRangeLimitTransform2.hashCode());
  }

  /**
   * Test {@link DoubleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleRangeLimitTransform.equals(Object)",
    "int DoubleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleRangeLimitTransform doubleRangeLimitTransform =
        new DoubleRangeLimitTransform(0.5d, 10.0d);

    // Act and Assert
    assertNotEquals(doubleRangeLimitTransform, new DoubleRangeLimitTransform(-25.0d, 10.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleRangeLimitTransform.equals(Object)",
    "int DoubleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleRangeLimitTransform doubleRangeLimitTransform =
        new DoubleRangeLimitTransform(-25.0d, 0.5d);

    // Act and Assert
    assertNotEquals(doubleRangeLimitTransform, new DoubleRangeLimitTransform(-25.0d, 10.0d));
  }

  /**
   * Test {@link DoubleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleRangeLimitTransform.equals(Object)",
    "int DoubleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange, Act and Assert
    assertNotEquals(new DoubleRangeLimitTransform(-25.0d, 10.0d), 1);
  }

  /**
   * Test {@link DoubleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DoubleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DoubleRangeLimitTransform.equals(Object)",
    "int DoubleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange, Act and Assert
    assertNotEquals(new DoubleRangeLimitTransform(-25.0d, 10.0d), null);
  }
}
