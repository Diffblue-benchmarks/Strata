package com.opengamma.strata.market;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueTypeDiffblueTest {
  /**
   * Test {@link ValueType#of(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ValueType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueType ValueType.of(String)"})
  void testOf_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ValueType.of("Value type must only contain the characters A-Z, a-z, 0-9 and -"));
  }

  /**
   * Test {@link ValueType#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ValueType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueType ValueType.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    ValueType actualOfResult = ValueType.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
  }

  /**
   * Test {@link ValueType#checkEquals(ValueType, String)}.
   *
   * <ul>
   *   <li>Given {@link ValueType#BLACK_VOLATILITY}.
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ValueType#checkEquals(ValueType, String)}
   */
  @Test
  @DisplayName(
      "Test checkEquals(ValueType, String); given BLACK_VOLATILITY; when BLACK_VOLATILITY; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValueType.checkEquals(ValueType, String)"})
  void testCheckEquals_givenBlack_volatility_whenBlack_volatility_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueType.BLACK_VOLATILITY.checkEquals(ValueType.BLACK_VOLATILITY, "Exception Prefix"));
  }

  /**
   * Test {@link ValueType#checkEquals(ValueType, String)}.
   *
   * <ul>
   *   <li>Given {@link ValueType#CORRELATION}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ValueType#checkEquals(ValueType, String)}
   */
  @Test
  @DisplayName(
      "Test checkEquals(ValueType, String); given CORRELATION; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValueType.checkEquals(ValueType, String)"})
  void testCheckEquals_givenCorrelation_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ValueType.CORRELATION.checkEquals(ValueType.BLACK_VOLATILITY, "Exception Prefix"));
  }

  /**
   * Test {@link ValueType#checkEquals(ValueType, String)}.
   *
   * <ul>
   *   <li>Given {@link ValueType#CORRELATION}.
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ValueType#checkEquals(ValueType, String)}
   */
  @Test
  @DisplayName(
      "Test checkEquals(ValueType, String); given CORRELATION; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ValueType.checkEquals(ValueType, String)"})
  void testCheckEquals_givenCorrelation_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ValueType.CORRELATION.checkEquals(null, "Exception Prefix"));
  }
}
