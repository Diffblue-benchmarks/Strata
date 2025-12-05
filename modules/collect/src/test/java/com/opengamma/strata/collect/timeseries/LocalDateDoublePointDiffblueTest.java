package com.opengamma.strata.collect.timeseries;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LocalDateDoublePointDiffblueTest {
  /**
   * Test {@link LocalDateDoublePoint#of(LocalDate, double)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Value is ten.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#of(LocalDate, double)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, double); when LocalDate with '1970' and one and one; then return Value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoublePoint LocalDateDoublePoint.of(LocalDate, double)"})
  void testOf_whenLocalDateWith1970AndOneAndOne_thenReturnValueIsTen() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDateDoublePoint actualOfResult = LocalDateDoublePoint.of(date, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getValue());
    assertSame(date, actualOfResult.getDate());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LocalDateDoublePoint#toString()}
   *   <li>{@link LocalDateDoublePoint#getDate()}
   *   <li>{@link LocalDateDoublePoint#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDate LocalDateDoublePoint.getDate()",
    "double LocalDateDoublePoint.getValue()",
    "String LocalDateDoublePoint.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(date, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    LocalDate actualDate = ofResult.getDate();

    // Assert
    assertEquals("(1970-01-01=10.0)", actualToStringResult);
    assertEquals("1970-01-01", actualDate.toString());
    assertEquals(10.0d, ofResult.getValue());
    assertSame(date, actualDate);
  }

  /**
   * Test {@link LocalDateDoublePoint#withDate(LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@link LocalDateDoublePoint} with date is {@link LocalDate} and value is ten.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#withDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test withDate(LocalDate); then return LocalDateDoublePoint with date is LocalDate and value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoublePoint LocalDateDoublePoint.withDate(LocalDate)"})
  void testWithDate_thenReturnLocalDateDoublePointWithDateIsLocalDateAndValueIsTen() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act
    LocalDateDoublePoint actualWithDateResult = ofResult.withDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals(ofResult, actualWithDateResult);
  }

  /**
   * Test {@link LocalDateDoublePoint#withValue(double)}.
   *
   * <p>Method under test: {@link LocalDateDoublePoint#withValue(double)}
   */
  @Test
  @DisplayName("Test withValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDateDoublePoint LocalDateDoublePoint.withValue(double)"})
  void testWithValue() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act
    LocalDateDoublePoint actualWithValueResult = ofResult.withValue(10.0d);

    // Assert
    assertEquals(ofResult, actualWithValueResult);
  }

  /**
   * Test {@link LocalDateDoublePoint#compareTo(LocalDateDoublePoint)} with {@code
   * LocalDateDoublePoint}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#compareTo(LocalDateDoublePoint)}
   */
  @Test
  @DisplayName(
      "Test compareTo(LocalDateDoublePoint) with 'LocalDateDoublePoint'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LocalDateDoublePoint.compareTo(LocalDateDoublePoint)"})
  void testCompareToWithLocalDateDoublePoint_thenReturnMinusOne() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.ofYearDay(1, 1), 10.0d);

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d)));
  }

  /**
   * Test {@link LocalDateDoublePoint#compareTo(LocalDateDoublePoint)} with {@code
   * LocalDateDoublePoint}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#compareTo(LocalDateDoublePoint)}
   */
  @Test
  @DisplayName("Test compareTo(LocalDateDoublePoint) with 'LocalDateDoublePoint'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LocalDateDoublePoint.compareTo(LocalDateDoublePoint)"})
  void testCompareToWithLocalDateDoublePoint_thenReturnZero() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act and Assert
    assertEquals(0, ofResult.compareTo(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d)));
  }

  /**
   * Test {@link LocalDateDoublePoint#equals(Object)}, and {@link LocalDateDoublePoint#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LocalDateDoublePoint#equals(Object)}
   *   <li>{@link LocalDateDoublePoint#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LocalDateDoublePoint.equals(Object)",
    "int LocalDateDoublePoint.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d);
    LocalDateDoublePoint ofResult2 = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link LocalDateDoublePoint#equals(Object)}, and {@link LocalDateDoublePoint#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LocalDateDoublePoint#equals(Object)}
   *   <li>{@link LocalDateDoublePoint#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LocalDateDoublePoint.equals(Object)",
    "int LocalDateDoublePoint.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LocalDateDoublePoint#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LocalDateDoublePoint.equals(Object)",
    "int LocalDateDoublePoint.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d), 1);
  }

  /**
   * Test {@link LocalDateDoublePoint#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LocalDateDoublePoint.equals(Object)",
    "int LocalDateDoublePoint.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.now(), 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d));
  }

  /**
   * Test {@link LocalDateDoublePoint#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LocalDateDoublePoint.equals(Object)",
    "int LocalDateDoublePoint.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LocalDateDoublePoint ofResult = LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 0.5d);

    // Act and Assert
    assertNotEquals(ofResult, LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d));
  }

  /**
   * Test {@link LocalDateDoublePoint#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LocalDateDoublePoint.equals(Object)",
    "int LocalDateDoublePoint.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d), null);
  }

  /**
   * Test {@link LocalDateDoublePoint#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateDoublePoint#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LocalDateDoublePoint.equals(Object)",
    "int LocalDateDoublePoint.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        LocalDateDoublePoint.of(LocalDate.of(1970, 1, 1), 10.0d),
        "Different type to LocalDateDoublePoint");
  }
}
