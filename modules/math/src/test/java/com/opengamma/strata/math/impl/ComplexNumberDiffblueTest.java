package com.opengamma.strata.math.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ComplexNumberDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComplexNumber#ComplexNumber(double)}
   *   <li>{@link ComplexNumber#getImaginary()}
   *   <li>{@link ComplexNumber#getReal()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ComplexNumber.<init>(double)",
    "double ComplexNumber.getImaginary()",
    "double ComplexNumber.getReal()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ComplexNumber actualComplexNumber = new ComplexNumber(10.0d);
    double actualImaginary = actualComplexNumber.getImaginary();

    // Assert
    assertEquals(0.0d, actualImaginary);
    assertEquals(10.0d, actualComplexNumber.getReal());
  }

  /**
   * Test {@link ComplexNumber#ComplexNumber(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Real is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#ComplexNumber(double, double)}
   */
  @Test
  @DisplayName("Test new ComplexNumber(double, double); when '0.5'; then return Real is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComplexNumber.<init>(double, double)"})
  void testNewComplexNumber_when05_thenReturnRealIs05() {
    // Arrange and Act
    ComplexNumber actualComplexNumber = new ComplexNumber(0.5d, 10.0d);

    // Assert
    assertEquals(0.5d, actualComplexNumber.getReal());
    assertEquals(10.0d, actualComplexNumber.getImaginary());
  }

  /**
   * Test {@link ComplexNumber#ComplexNumber(double, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return Real is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#ComplexNumber(double, double)}
   */
  @Test
  @DisplayName(
      "Test new ComplexNumber(double, double); when minus one; then return Real is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComplexNumber.<init>(double, double)"})
  void testNewComplexNumber_whenMinusOne_thenReturnRealIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualComplexNumber = new ComplexNumber(-1.0d, 10.0d);

    // Assert
    assertEquals(-1.0d, actualComplexNumber.getReal());
    assertEquals(10.0d, actualComplexNumber.getImaginary());
  }

  /**
   * Test {@link ComplexNumber#ComplexNumber(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Real is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#ComplexNumber(double, double)}
   */
  @Test
  @DisplayName("Test new ComplexNumber(double, double); when one; then return Real is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComplexNumber.<init>(double, double)"})
  void testNewComplexNumber_whenOne_thenReturnRealIsOne() {
    // Arrange and Act
    ComplexNumber actualComplexNumber = new ComplexNumber(1.0d, 10.0d);

    // Assert
    assertEquals(1.0d, actualComplexNumber.getReal());
    assertEquals(10.0d, actualComplexNumber.getImaginary());
  }

  /**
   * Test {@link ComplexNumber#ComplexNumber(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Real is ten.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#ComplexNumber(double, double)}
   */
  @Test
  @DisplayName("Test new ComplexNumber(double, double); when ten; then return Real is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ComplexNumber.<init>(double, double)"})
  void testNewComplexNumber_whenTen_thenReturnRealIsTen() {
    // Arrange and Act
    ComplexNumber actualComplexNumber = new ComplexNumber(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualComplexNumber.getImaginary());
    assertEquals(10.0d, actualComplexNumber.getReal());
  }

  /**
   * Test {@link ComplexNumber#doubleValue()}.
   *
   * <p>Method under test: {@link ComplexNumber#doubleValue()}
   */
  @Test
  @DisplayName("Test doubleValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ComplexNumber.doubleValue()"})
  void testDoubleValue() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> ComplexNumber.I.doubleValue());
  }

  /**
   * Test {@link ComplexNumber#floatValue()}.
   *
   * <p>Method under test: {@link ComplexNumber#floatValue()}
   */
  @Test
  @DisplayName("Test floatValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float ComplexNumber.floatValue()"})
  void testFloatValue() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> ComplexNumber.I.floatValue());
  }

  /**
   * Test {@link ComplexNumber#intValue()}.
   *
   * <p>Method under test: {@link ComplexNumber#intValue()}
   */
  @Test
  @DisplayName("Test intValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ComplexNumber.intValue()"})
  void testIntValue() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> ComplexNumber.I.intValue());
  }

  /**
   * Test {@link ComplexNumber#longValue()}.
   *
   * <p>Method under test: {@link ComplexNumber#longValue()}
   */
  @Test
  @DisplayName("Test longValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ComplexNumber.longValue()"})
  void testLongValue() {
    // Arrange, Act and Assert
    assertThrows(UnsupportedOperationException.class, () -> ComplexNumber.I.longValue());
  }

  /**
   * Test {@link ComplexNumber#equals(Object)}, and {@link ComplexNumber#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComplexNumber#equals(Object)}
   *   <li>{@link ComplexNumber#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComplexNumber.equals(Object)", "int ComplexNumber.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ComplexNumber complexNumber = ComplexNumber.I;
    ComplexNumber complexNumber2 = ComplexNumber.I;

    // Act and Assert
    assertEquals(complexNumber, complexNumber2);
    assertEquals(complexNumber.hashCode(), complexNumber2.hashCode());
  }

  /**
   * Test {@link ComplexNumber#equals(Object)}, and {@link ComplexNumber#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComplexNumber#equals(Object)}
   *   <li>{@link ComplexNumber#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComplexNumber.equals(Object)", "int ComplexNumber.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ComplexNumber addResult = ComplexMathUtils.add(ComplexNumber.I);
    ComplexNumber complexNumber = ComplexNumber.I;

    // Act and Assert
    assertEquals(addResult, complexNumber);
    assertEquals(addResult.hashCode(), complexNumber.hashCode());
  }

  /**
   * Test {@link ComplexNumber#equals(Object)}, and {@link ComplexNumber#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ComplexNumber#equals(Object)}
   *   <li>{@link ComplexNumber#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComplexNumber.equals(Object)", "int ComplexNumber.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ComplexNumber complexNumber = ComplexNumber.I;

    // Act and Assert
    assertEquals(complexNumber, complexNumber);
    int expectedHashCodeResult = complexNumber.hashCode();
    assertEquals(expectedHashCodeResult, complexNumber.hashCode());
  }

  /**
   * Test {@link ComplexNumber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComplexNumber.equals(Object)", "int ComplexNumber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ComplexNumber.MINUS_I, ComplexNumber.I);
  }

  /**
   * Test {@link ComplexNumber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComplexNumber.equals(Object)", "int ComplexNumber.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(new ComplexNumber(10.0d, 1.0d), ComplexNumber.I);
  }

  /**
   * Test {@link ComplexNumber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComplexNumber.equals(Object)", "int ComplexNumber.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ComplexNumber.I, null);
  }

  /**
   * Test {@link ComplexNumber#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ComplexNumber.equals(Object)", "int ComplexNumber.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ComplexNumber.I, "Different type to ComplexNumber");
  }

  /**
   * Test {@link ComplexNumber#toString()}.
   *
   * <ul>
   *   <li>Given {@link ComplexNumber#I}.
   *   <li>Then return {@code 0.0 + 1.0i}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#toString()}
   */
  @Test
  @DisplayName("Test toString(); given I; then return '0.0 + 1.0i'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String ComplexNumber.toString()"})
  void testToString_givenI_thenReturn0010i() {
    // Arrange, Act and Assert
    assertEquals("0.0 + 1.0i", ComplexNumber.I.toString());
  }

  /**
   * Test {@link ComplexNumber#toString()}.
   *
   * <ul>
   *   <li>Given {@link ComplexNumber#MINUS_I}.
   *   <li>Then return {@code 0.0 - 1.0i}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexNumber#toString()}
   */
  @Test
  @DisplayName("Test toString(); given MINUS_I; then return '0.0 - 1.0i'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String ComplexNumber.toString()"})
  void testToString_givenMinus_i_thenReturn0010i() {
    // Arrange, Act and Assert
    assertEquals("0.0 - 1.0i", ComplexNumber.MINUS_I.toString());
  }
}
