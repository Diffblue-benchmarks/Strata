package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.math.BigDecimal;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FixedScaleDecimalDiffblueTest {
  /**
   * Test {@link FixedScaleDecimal#of(Decimal, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#of(Decimal, int)}
   */
  @Test
  @DisplayName("Test of(Decimal, int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal FixedScaleDecimal.of(Decimal, int)"})
  void testOf_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FixedScaleDecimal.of(Decimal.MAX_VALUE, -1));
  }

  /**
   * Test {@link FixedScaleDecimal#of(Decimal, int)}.
   *
   * <ul>
   *   <li>When nineteen.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#of(Decimal, int)}
   */
  @Test
  @DisplayName("Test of(Decimal, int); when nineteen; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal FixedScaleDecimal.of(Decimal, int)"})
  void testOf_whenNineteen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FixedScaleDecimal.of(Decimal.MAX_VALUE, 19));
  }

  /**
   * Test {@link FixedScaleDecimal#of(Decimal, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return fixedScale is one.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#of(Decimal, int)}
   */
  @Test
  @DisplayName("Test of(Decimal, int); when one; then return fixedScale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal FixedScaleDecimal.of(Decimal, int)"})
  void testOf_whenOne_thenReturnFixedScaleIsOne() {
    // Arrange and Act
    FixedScaleDecimal actualOfResult = FixedScaleDecimal.of(Decimal.MAX_VALUE, 1);

    // Assert
    assertEquals(1, actualOfResult.fixedScale());
    assertSame(Decimal.MAX_VALUE, actualOfResult.decimal());
  }

  /**
   * Test {@link FixedScaleDecimal#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return decimal negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42'; then return decimal negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal FixedScaleDecimal.parse(String)"})
  void testParse_when42_thenReturnDecimalNegatedSignumIsMinusOne() {
    // Arrange and Act
    FixedScaleDecimal actualParseResult = FixedScaleDecimal.parse("42");

    // Assert
    Decimal decimalResult = actualParseResult.decimal();
    Decimal negatedResult = decimalResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(0, negatedResult.scale());
    assertEquals(0, decimalResult.scale());
    assertEquals(0, actualParseResult.fixedScale());
    assertEquals(1, decimalResult.signum());
    assertFalse(negatedResult.isZero());
    assertFalse(decimalResult.isZero());
    assertEquals(decimalResult, negatedResult.abs());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    assertEquals(decimalResult, negatedResult.negated());
  }

  /**
   * Test {@link FixedScaleDecimal#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link FixedScaleDecimal} with decimal is {@link Decimal#MAX_VALUE} and fixedScale
   *       is one.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given FixedScaleDecimal with decimal is MAX_VALUE and fixedScale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal FixedScaleDecimal.map(UnaryOperator)"})
  void testMap_givenFixedScaleDecimalWithDecimalIsMax_valueAndFixedScaleIsOne() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.MAX_VALUE, 1);

    UnaryOperator<Decimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(18L, 18));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.map(fn));
    verify(fn).apply(isA(Decimal.class));
  }

  /**
   * Test {@link FixedScaleDecimal#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#map(UnaryOperator)}
   */
  @Test
  @DisplayName("Test map(UnaryOperator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal FixedScaleDecimal.map(UnaryOperator)"})
  void testMap_givenIllegalArgumentException() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.MAX_VALUE, 18);

    UnaryOperator<Decimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<Decimal>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.map(fn));
    verify(fn).apply(isA(Decimal.class));
  }

  /**
   * Test {@link FixedScaleDecimal#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return {@link FixedScaleDecimal} with decimal is {@link Decimal#MAX_VALUE} and
   *       fixedScale is eighteen.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); then return FixedScaleDecimal with decimal is MAX_VALUE and fixedScale is eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal FixedScaleDecimal.map(UnaryOperator)"})
  void testMap_thenReturnFixedScaleDecimalWithDecimalIsMax_valueAndFixedScaleIsEighteen() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.MAX_VALUE, 18);

    UnaryOperator<Decimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<Decimal>any())).thenReturn(Decimal.MAX_VALUE);

    // Act
    FixedScaleDecimal actualMapResult = ofResult.map(fn);

    // Assert
    verify(fn).apply(isA(Decimal.class));
    assertEquals(ofResult, actualMapResult);
  }

  /**
   * Test {@link FixedScaleDecimal#toBigDecimal()}.
   *
   * <ul>
   *   <li>Given parse {@code 42}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#toBigDecimal()}
   */
  @Test
  @DisplayName("Test toBigDecimal(); given parse '42'; then return BigDecimal(String) with '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal FixedScaleDecimal.toBigDecimal()"})
  void testToBigDecimal_givenParse42_thenReturnBigDecimalWith42() {
    // Arrange and Act
    BigDecimal actualToBigDecimalResult = FixedScaleDecimal.parse("42").toBigDecimal();

    // Assert
    assertEquals(new BigDecimal("42"), actualToBigDecimalResult);
  }

  /**
   * Test {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)} with {@code FixedScaleDecimal}.
   *
   * <p>Method under test: {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)}
   */
  @Test
  @DisplayName("Test compareTo(FixedScaleDecimal) with 'FixedScaleDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FixedScaleDecimal.compareTo(FixedScaleDecimal)"})
  void testCompareToWithFixedScaleDecimal() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.ofScaled(4503599627370496L, 1), 1);

    // Act and Assert
    assertEquals(1, ofResult.compareTo(FixedScaleDecimal.parse("42")));
  }

  /**
   * Test {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)} with {@code FixedScaleDecimal}.
   *
   * <p>Method under test: {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)}
   */
  @Test
  @DisplayName("Test compareTo(FixedScaleDecimal) with 'FixedScaleDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FixedScaleDecimal.compareTo(FixedScaleDecimal)"})
  void testCompareToWithFixedScaleDecimal2() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.ofScaled(1L, 1), 1);

    // Act and Assert
    assertEquals(1, ofResult.compareTo(FixedScaleDecimal.of(Decimal.ZERO, 1)));
  }

  /**
   * Test {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)} with {@code FixedScaleDecimal}.
   *
   * <ul>
   *   <li>Given parse {@code 42}.
   *   <li>When parse {@code 42}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)}
   */
  @Test
  @DisplayName(
      "Test compareTo(FixedScaleDecimal) with 'FixedScaleDecimal'; given parse '42'; when parse '42'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FixedScaleDecimal.compareTo(FixedScaleDecimal)"})
  void testCompareToWithFixedScaleDecimal_givenParse42_whenParse42_thenReturnZero() {
    // Arrange
    FixedScaleDecimal parseResult = FixedScaleDecimal.parse("42");

    // Act and Assert
    assertEquals(0, parseResult.compareTo(FixedScaleDecimal.parse("42")));
  }

  /**
   * Test {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)} with {@code FixedScaleDecimal}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#compareTo(FixedScaleDecimal)}
   */
  @Test
  @DisplayName("Test compareTo(FixedScaleDecimal) with 'FixedScaleDecimal'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FixedScaleDecimal.compareTo(FixedScaleDecimal)"})
  void testCompareToWithFixedScaleDecimal_thenReturnMinusOne() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.ofScaled(1L, 1), 1);

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(FixedScaleDecimal.parse("42")));
  }

  /**
   * Test {@link FixedScaleDecimal#equals(Object)}, and {@link FixedScaleDecimal#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedScaleDecimal#equals(Object)}
   *   <li>{@link FixedScaleDecimal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedScaleDecimal.equals(Object)",
    "int FixedScaleDecimal.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FixedScaleDecimal parseResult = FixedScaleDecimal.parse("42");
    FixedScaleDecimal parseResult2 = FixedScaleDecimal.parse("42");

    // Act and Assert
    assertEquals(parseResult, parseResult2);
    assertEquals(parseResult.hashCode(), parseResult2.hashCode());
  }

  /**
   * Test {@link FixedScaleDecimal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedScaleDecimal.equals(Object)",
    "int FixedScaleDecimal.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.MAX_VALUE, 1);

    // Act and Assert
    assertNotEquals(ofResult, FixedScaleDecimal.parse("42"));
  }

  /**
   * Test {@link FixedScaleDecimal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedScaleDecimal.equals(Object)",
    "int FixedScaleDecimal.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(FixedScaleDecimal.parse("42"), Decimal.MAX_VALUE);
  }

  /**
   * Test {@link FixedScaleDecimal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedScaleDecimal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedScaleDecimal.equals(Object)",
    "int FixedScaleDecimal.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FixedScaleDecimal ofResult = FixedScaleDecimal.of(Decimal.of(42L), 1);

    // Act and Assert
    assertNotEquals(ofResult, FixedScaleDecimal.parse("42"));
  }
}
