package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataNameDiffblueTest {
  /**
   * Test {@link MarketDataName#compareTo(MarketDataName)} with {@code MarketDataName}.
   *
   * <ul>
   *   <li>Given {@link TestingName#TestingName(String)} with name is {@code 42}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataName#compareTo(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test compareTo(MarketDataName) with 'MarketDataName'; given TestingName(String) with name is '42'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketDataName.compareTo(MarketDataName)"})
  void testCompareToWithMarketDataName_givenTestingNameWithNameIs42_thenReturnMinusOne() {
    // Arrange
    TestingName testingName = new TestingName("42");

    // Act
    int actualCompareToResult = testingName.compareTo(new TestingName2("Name"));

    // Assert
    assertEquals(-1, actualCompareToResult);
  }

  /**
   * Test {@link MarketDataName#compareTo(MarketDataName)} with {@code MarketDataName}.
   *
   * <ul>
   *   <li>When {@link TestingName2#TestingName2(String)} with {@code Name}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataName#compareTo(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test compareTo(MarketDataName) with 'MarketDataName'; when TestingName2(String) with 'Name'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketDataName.compareTo(MarketDataName)"})
  void testCompareToWithMarketDataName_whenTestingName2WithName_thenReturnMinusOne() {
    // Arrange
    TestingName testingName = new TestingName("Name");

    // Act
    int actualCompareToResult = testingName.compareTo(new TestingName2("Name"));

    // Assert
    assertEquals(-1, actualCompareToResult);
  }

  /**
   * Test {@link MarketDataName#compareTo(MarketDataName)} with {@code MarketDataName}.
   *
   * <ul>
   *   <li>When {@link TestingName#TestingName(String)} with {@code Name}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataName#compareTo(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test compareTo(MarketDataName) with 'MarketDataName'; when TestingName(String) with 'Name'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MarketDataName.compareTo(MarketDataName)"})
  void testCompareToWithMarketDataName_whenTestingNameWithName_thenReturnZero() {
    // Arrange
    TestingName testingName = new TestingName("Name");

    // Act
    int actualCompareToResult = testingName.compareTo(new TestingName("Name"));

    // Assert
    assertEquals(0, actualCompareToResult);
  }

  /**
   * Test {@link MarketDataName#equals(Object)}, and {@link MarketDataName#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataName#equals(Object)}
   *   <li>{@link MarketDataName#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataName.equals(Object)", "int MarketDataName.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TestingName testingName = new TestingName("Name");
    TestingName testingName2 = new TestingName("Name");

    // Act and Assert
    assertEquals(testingName, testingName2);
    assertEquals(testingName.hashCode(), testingName2.hashCode());
  }

  /**
   * Test {@link MarketDataName#equals(Object)}, and {@link MarketDataName#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataName#equals(Object)}
   *   <li>{@link MarketDataName#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataName.equals(Object)", "int MarketDataName.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TestingName testingName = new TestingName("Name");

    // Act and Assert
    assertEquals(testingName, testingName);
    int expectedHashCodeResult = testingName.hashCode();
    assertEquals(expectedHashCodeResult, testingName.hashCode());
  }

  /**
   * Test {@link MarketDataName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataName.equals(Object)", "int MarketDataName.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TestingName testingName = new TestingName("42");

    // Act and Assert
    assertNotEquals(testingName, new TestingName("Name"));
  }

  /**
   * Test {@link MarketDataName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataName.equals(Object)", "int MarketDataName.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TestingName("Name"), null);
  }

  /**
   * Test {@link MarketDataName#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataName#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataName.equals(Object)", "int MarketDataName.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new TestingName("Name"), "Different type to MarketDataName");
  }

  /**
   * Test {@link MarketDataName#toString()}.
   *
   * <p>Method under test: {@link MarketDataName#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String MarketDataName.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Name", new TestingName("Name").toString());
  }
}
