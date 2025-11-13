package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.minimization.ParameterLimitsTransform.LimitType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SingleRangeLimitTransformDiffblueTest {
  /**
   * Test {@link SingleRangeLimitTransform#SingleRangeLimitTransform(double, LimitType)}.
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#SingleRangeLimitTransform(double,
   * LimitType)}
   */
  @Test
  @DisplayName("Test new SingleRangeLimitTransform(double, LimitType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SingleRangeLimitTransform.<init>(double, LimitType)"})
  void testNewSingleRangeLimitTransform() {
    // Arrange and Act
    SingleRangeLimitTransform actualSingleRangeLimitTransform =
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN);

    // Assert
    assertEquals(
        0.9525741268224333d, actualSingleRangeLimitTransform.inverseTransformGradient(3.0d));
    assertEquals(13.048587351573742d, actualSingleRangeLimitTransform.inverseTransform(3.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#SingleRangeLimitTransform(double, LimitType)}.
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#SingleRangeLimitTransform(double,
   * LimitType)}
   */
  @Test
  @DisplayName("Test new SingleRangeLimitTransform(double, LimitType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SingleRangeLimitTransform.<init>(double, LimitType)"})
  void testNewSingleRangeLimitTransform2() {
    // Arrange and Act
    SingleRangeLimitTransform actualSingleRangeLimitTransform =
        new SingleRangeLimitTransform(10.0d, LimitType.LESS_THAN);

    // Assert
    assertEquals(
        -0.9525741268224333d, actualSingleRangeLimitTransform.inverseTransformGradient(3.0d));
    assertEquals(-1.0003355752008412d, actualSingleRangeLimitTransform.transformGradient(2.0d));
    assertEquals(6.951412648426258d, actualSingleRangeLimitTransform.inverseTransform(3.0d));
    assertEquals(7.999664481091923d, actualSingleRangeLimitTransform.transform(2.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#inverseTransform(double)}.
   *
   * <ul>
   *   <li>When {@code 50.00000000000001}.
   *   <li>Then return {@code 60.00000000000001}.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#inverseTransform(double)}
   */
  @Test
  @DisplayName(
      "Test inverseTransform(double); when '50.00000000000001'; then return '60.00000000000001'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.inverseTransform(double)"})
  void testInverseTransform_when5000000000000001_thenReturn6000000000000001() {
    // Arrange, Act and Assert
    assertEquals(
        60.00000000000001d,
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN)
            .inverseTransform(50.00000000000001d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#inverseTransform(double)}.
   *
   * <ul>
   *   <li>When {@code -50.00000000000001}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#inverseTransform(double)}
   */
  @Test
  @DisplayName("Test inverseTransform(double); when '-50.00000000000001'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.inverseTransform(double)"})
  void testInverseTransform_when5000000000000001_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN)
            .inverseTransform(-50.00000000000001d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#inverseTransform(double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 13.048587351573742}.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#inverseTransform(double)}
   */
  @Test
  @DisplayName("Test inverseTransform(double); when three; then return '13.048587351573742'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.inverseTransform(double)"})
  void testInverseTransform_whenThree_thenReturn13048587351573742() {
    // Arrange, Act and Assert
    assertEquals(
        13.048587351573742d,
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN).inverseTransform(3.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#transform(double)}.
   *
   * <ul>
   *   <li>Then return {@code 1.2475175410745458}.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#transform(double)}
   */
  @Test
  @DisplayName("Test transform(double); then return '1.2475175410745458'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.transform(double)"})
  void testTransform_thenReturn12475175410745458() {
    // Arrange, Act and Assert
    assertEquals(
        1.2475175410745458d,
        new SingleRangeLimitTransform(0.5d, LimitType.GREATER_THAN).transform(2.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#transform(double)}.
   *
   * <ul>
   *   <li>Then return fifty-two.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#transform(double)}
   */
  @Test
  @DisplayName("Test transform(double); then return fifty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.transform(double)"})
  void testTransform_thenReturnFiftyTwo() {
    // Arrange, Act and Assert
    assertEquals(
        52.0d, new SingleRangeLimitTransform(-50.0d, LimitType.GREATER_THAN).transform(2.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#transform(double)}.
   *
   * <ul>
   *   <li>Then return minus fifty.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#transform(double)}
   */
  @Test
  @DisplayName("Test transform(double); then return minus fifty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.transform(double)"})
  void testTransform_thenReturnMinusFifty() {
    // Arrange, Act and Assert
    assertEquals(
        -50.0d, new SingleRangeLimitTransform(2.0d, LimitType.GREATER_THAN).transform(2.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#inverseTransformGradient(double)}.
   *
   * <ul>
   *   <li>When {@code 50.00000000000001}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#inverseTransformGradient(double)}
   */
  @Test
  @DisplayName("Test inverseTransformGradient(double); when '50.00000000000001'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.inverseTransformGradient(double)"})
  void testInverseTransformGradient_when5000000000000001_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN)
            .inverseTransformGradient(50.00000000000001d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#inverseTransformGradient(double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 0.9525741268224333}.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#inverseTransformGradient(double)}
   */
  @Test
  @DisplayName(
      "Test inverseTransformGradient(double); when three; then return '0.9525741268224333'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.inverseTransformGradient(double)"})
  void testInverseTransformGradient_whenThree_thenReturn09525741268224333() {
    // Arrange, Act and Assert
    assertEquals(
        0.9525741268224333d,
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN)
            .inverseTransformGradient(3.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#transformGradient(double)}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#transformGradient(double)}
   */
  @Test
  @DisplayName("Test transformGradient(double); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.transformGradient(double)"})
  void testTransformGradient_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        new SingleRangeLimitTransform(-50.0d, LimitType.GREATER_THAN).transformGradient(2.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#transformGradient(double)}.
   *
   * <ul>
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#transformGradient(double)}
   */
  @Test
  @DisplayName("Test transformGradient(double); then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SingleRangeLimitTransform.transformGradient(double)"})
  void testTransformGradient_thenReturnPositive_infinity() {
    // Arrange, Act and Assert
    assertEquals(
        Double.POSITIVE_INFINITY,
        new SingleRangeLimitTransform(2.0d, LimitType.GREATER_THAN).transformGradient(2.0d));
  }

  /**
   * Test {@link SingleRangeLimitTransform#equals(Object)}, and {@link
   * SingleRangeLimitTransform#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleRangeLimitTransform#equals(Object)}
   *   <li>{@link SingleRangeLimitTransform#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleRangeLimitTransform.equals(Object)",
    "int SingleRangeLimitTransform.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SingleRangeLimitTransform singleRangeLimitTransform =
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN);
    SingleRangeLimitTransform singleRangeLimitTransform2 =
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN);

    // Act and Assert
    assertEquals(singleRangeLimitTransform, singleRangeLimitTransform2);
    assertEquals(singleRangeLimitTransform.hashCode(), singleRangeLimitTransform2.hashCode());
  }

  /**
   * Test {@link SingleRangeLimitTransform#equals(Object)}, and {@link
   * SingleRangeLimitTransform#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleRangeLimitTransform#equals(Object)}
   *   <li>{@link SingleRangeLimitTransform#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleRangeLimitTransform.equals(Object)",
    "int SingleRangeLimitTransform.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SingleRangeLimitTransform singleRangeLimitTransform =
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN);

    // Act and Assert
    assertEquals(singleRangeLimitTransform, singleRangeLimitTransform);
    int expectedHashCodeResult = singleRangeLimitTransform.hashCode();
    assertEquals(expectedHashCodeResult, singleRangeLimitTransform.hashCode());
  }

  /**
   * Test {@link SingleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleRangeLimitTransform.equals(Object)",
    "int SingleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SingleRangeLimitTransform singleRangeLimitTransform =
        new SingleRangeLimitTransform(-50.0d, LimitType.GREATER_THAN);

    // Act and Assert
    assertNotEquals(
        singleRangeLimitTransform, new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN));
  }

  /**
   * Test {@link SingleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleRangeLimitTransform.equals(Object)",
    "int SingleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SingleRangeLimitTransform singleRangeLimitTransform =
        new SingleRangeLimitTransform(10.0d, null);

    // Act and Assert
    assertNotEquals(
        singleRangeLimitTransform, new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN));
  }

  /**
   * Test {@link SingleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleRangeLimitTransform.equals(Object)",
    "int SingleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN), null);
  }

  /**
   * Test {@link SingleRangeLimitTransform#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleRangeLimitTransform#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleRangeLimitTransform.equals(Object)",
    "int SingleRangeLimitTransform.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new SingleRangeLimitTransform(10.0d, LimitType.GREATER_THAN),
        "Different type to SingleRangeLimitTransform");
  }
}
