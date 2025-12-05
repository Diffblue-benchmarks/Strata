package com.opengamma.strata.basics.value;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.Decimal;
import java.math.BigDecimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RoundingDiffblueTest {
  /**
   * Test {@link Rounding#none()}.
   *
   * <p>Method under test: {@link Rounding#none()}
   */
  @Test
  @DisplayName("Test none()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rounding Rounding.none()"})
  void testNone() {
    // Arrange and Act
    Rounding actualNoneResult = Rounding.none();
    BigDecimal actualRoundResult = actualNoneResult.round(new BigDecimal("2.3"));

    // Assert
    assertTrue(actualNoneResult instanceof NoRounding);
    assertTrue(((NoRounding) actualNoneResult).propertyNames().isEmpty());
    assertTrue(((NoRounding) actualNoneResult).metaBean().isBuildable());
    assertEquals(new BigDecimal("2.3"), actualRoundResult);
  }

  /**
   * Test {@link Rounding#of(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@link HalfUpRounding}.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#of(Currency)}
   */
  @Test
  @DisplayName("Test of(Currency); when AED; then return HalfUpRounding")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rounding Rounding.of(Currency)"})
  void testOf_whenAed_thenReturnHalfUpRounding() {
    // Arrange and Act
    Rounding actualOfResult = Rounding.of(Currency.AED);
    BigDecimal actualRoundResult = actualOfResult.round(new BigDecimal("2.3"));

    // Assert
    assertTrue(actualOfResult instanceof HalfUpRounding);
    assertEquals(0, ((HalfUpRounding) actualOfResult).getFraction());
    assertEquals(2, ((HalfUpRounding) actualOfResult).getDecimalPlaces());
    assertEquals(new BigDecimal("2.30"), actualRoundResult);
  }

  /**
   * Test {@link Rounding#ofDecimalPlaces(int)}.
   *
   * <p>Method under test: {@link Rounding#ofDecimalPlaces(int)}
   */
  @Test
  @DisplayName("Test ofDecimalPlaces(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rounding Rounding.ofDecimalPlaces(int)"})
  void testOfDecimalPlaces() {
    // Arrange and Act
    Rounding actualOfDecimalPlacesResult = Rounding.ofDecimalPlaces(Short.SIZE);
    BigDecimal actualRoundResult = actualOfDecimalPlacesResult.round(new BigDecimal("2.3"));

    // Assert
    assertTrue(actualOfDecimalPlacesResult instanceof HalfUpRounding);
    assertEquals(0, ((HalfUpRounding) actualOfDecimalPlacesResult).getFraction());
    assertEquals(new BigDecimal("2.3000000000000000"), actualRoundResult);
    assertEquals(Short.SIZE, ((HalfUpRounding) actualOfDecimalPlacesResult).getDecimalPlaces());
  }

  /**
   * Test {@link Rounding#ofDecimalPlaces(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return DecimalPlaces is one.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#ofDecimalPlaces(int)}
   */
  @Test
  @DisplayName("Test ofDecimalPlaces(int); when one; then return DecimalPlaces is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rounding Rounding.ofDecimalPlaces(int)"})
  void testOfDecimalPlaces_whenOne_thenReturnDecimalPlacesIsOne() {
    // Arrange and Act
    Rounding actualOfDecimalPlacesResult = Rounding.ofDecimalPlaces(1);
    BigDecimal actualRoundResult = actualOfDecimalPlacesResult.round(new BigDecimal("2.3"));

    // Assert
    assertTrue(actualOfDecimalPlacesResult instanceof HalfUpRounding);
    assertEquals(0, ((HalfUpRounding) actualOfDecimalPlacesResult).getFraction());
    assertEquals(1, ((HalfUpRounding) actualOfDecimalPlacesResult).getDecimalPlaces());
    assertEquals(new BigDecimal("2.3"), actualRoundResult);
  }

  /**
   * Test {@link Rounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>Then return DecimalPlaces is zero.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName("Test ofFractionalDecimalPlaces(int, int); then return DecimalPlaces is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rounding Rounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_thenReturnDecimalPlacesIsZero() {
    // Arrange and Act
    Rounding actualOfFractionalDecimalPlacesResult = Rounding.ofFractionalDecimalPlaces(0, 256);
    BigDecimal actualRoundResult =
        actualOfFractionalDecimalPlacesResult.round(new BigDecimal("2.3"));

    // Assert
    assertTrue(actualOfFractionalDecimalPlacesResult instanceof HalfUpRounding);
    assertEquals(0, ((HalfUpRounding) actualOfFractionalDecimalPlacesResult).getDecimalPlaces());
    assertEquals(256, ((HalfUpRounding) actualOfFractionalDecimalPlacesResult).getFraction());
    assertEquals(new BigDecimal("2.30078125"), actualRoundResult);
  }

  /**
   * Test {@link Rounding#ofFractionalDecimalPlaces(int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Fraction is zero.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#ofFractionalDecimalPlaces(int, int)}
   */
  @Test
  @DisplayName("Test ofFractionalDecimalPlaces(int, int); when one; then return Fraction is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Rounding Rounding.ofFractionalDecimalPlaces(int, int)"})
  void testOfFractionalDecimalPlaces_whenOne_thenReturnFractionIsZero() {
    // Arrange and Act
    Rounding actualOfFractionalDecimalPlacesResult = Rounding.ofFractionalDecimalPlaces(1, 1);
    BigDecimal actualRoundResult =
        actualOfFractionalDecimalPlacesResult.round(new BigDecimal("2.3"));

    // Assert
    assertTrue(actualOfFractionalDecimalPlacesResult instanceof HalfUpRounding);
    assertEquals(0, ((HalfUpRounding) actualOfFractionalDecimalPlacesResult).getFraction());
    assertEquals(1, ((HalfUpRounding) actualOfFractionalDecimalPlacesResult).getDecimalPlaces());
    assertEquals(new BigDecimal("2.3"), actualRoundResult);
  }

  /**
   * Test {@link Rounding#round(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#round(Decimal)}
   */
  @Test
  @DisplayName("Test round(Decimal) with 'Decimal'; then return Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Rounding.round(Decimal)"})
  void testRoundWithDecimal_thenReturnDecimalWithValueIsFortyTwo() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);
    Decimal value = Decimal.of(42L);

    // Act
    Decimal actualRoundResult = ofDecimalPlacesResult.round(value);

    // Assert
    assertEquals(value, actualRoundResult);
  }

  /**
   * Test {@link Rounding#round(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return ofScaled {@link Long#MAX_VALUE} and one.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#round(Decimal)}
   */
  @Test
  @DisplayName("Test round(Decimal) with 'Decimal'; then return ofScaled MAX_VALUE and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Rounding.round(Decimal)"})
  void testRoundWithDecimal_thenReturnOfScaledMax_valueAndOne() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);
    Decimal value = Decimal.ofScaled(Long.MAX_VALUE, 1);

    // Act
    Decimal actualRoundResult = ofDecimalPlacesResult.round(value);

    // Assert
    assertEquals(value, actualRoundResult);
  }

  /**
   * Test {@link Rounding#round(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal} with value is zero.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#round(Decimal)}
   */
  @Test
  @DisplayName(
      "Test round(Decimal) with 'Decimal'; when Decimal with value is zero; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Rounding.round(Decimal)"})
  void testRoundWithDecimal_whenDecimalWithValueIsZero_thenReturnZero() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);

    // Act and Assert
    assertSame(Decimal.ZERO, ofDecimalPlacesResult.round(Decimal.of(0L)));
  }

  /**
   * Test {@link Rounding#round(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When ofScaled one and one.
   *   <li>Then return ofScaled one and one.
   * </ul>
   *
   * <p>Method under test: {@link Rounding#round(Decimal)}
   */
  @Test
  @DisplayName(
      "Test round(Decimal) with 'Decimal'; when ofScaled one and one; then return ofScaled one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Rounding.round(Decimal)"})
  void testRoundWithDecimal_whenOfScaledOneAndOne_thenReturnOfScaledOneAndOne() {
    // Arrange
    HalfUpRounding ofDecimalPlacesResult = HalfUpRounding.ofDecimalPlaces(1);
    Decimal value = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualRoundResult = ofDecimalPlacesResult.round(value);

    // Assert
    assertEquals(value, actualRoundResult);
  }
}
