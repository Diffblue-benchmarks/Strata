package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CharMatchersDiffblueTest {
  /**
   * Test {@link CharMatchers#upperLetters()}.
   *
   * <p>Method under test: {@link CharMatchers#upperLetters()}
   */
  @Test
  @DisplayName("Test upperLetters()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.upperLetters()"})
  void testUpperLetters() {
    // Arrange, Act and Assert
    assertTrue(CharMatchers.upperLetters().apply('A'));
  }

  /**
   * Test {@link CharMatchers#lowerLetters()}.
   *
   * <p>Method under test: {@link CharMatchers#lowerLetters()}
   */
  @Test
  @DisplayName("Test lowerLetters()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.lowerLetters()"})
  void testLowerLetters() {
    // Arrange, Act and Assert
    assertFalse(CharMatchers.lowerLetters().apply('A'));
  }

  /**
   * Test {@link CharMatchers#letters()}.
   *
   * <p>Method under test: {@link CharMatchers#letters()}
   */
  @Test
  @DisplayName("Test letters()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.letters()"})
  void testLetters() {
    // Arrange, Act and Assert
    assertTrue(CharMatchers.letters().apply('A'));
  }

  /**
   * Test {@link CharMatchers#digits()}.
   *
   * <p>Method under test: {@link CharMatchers#digits()}
   */
  @Test
  @DisplayName("Test digits()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.digits()"})
  void testDigits() {
    // Arrange, Act and Assert
    assertFalse(CharMatchers.digits().apply('A'));
  }

  /**
   * Test {@link CharMatchers#lettersAndDigits()}.
   *
   * <p>Method under test: {@link CharMatchers#lettersAndDigits()}
   */
  @Test
  @DisplayName("Test lettersAndDigits()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.lettersAndDigits()"})
  void testLettersAndDigits() {
    // Arrange, Act and Assert
    assertTrue(CharMatchers.lettersAndDigits().apply('A'));
  }

  /**
   * Test {@link CharMatchers#upperHex()}.
   *
   * <p>Method under test: {@link CharMatchers#upperHex()}
   */
  @Test
  @DisplayName("Test upperHex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.upperHex()"})
  void testUpperHex() {
    // Arrange, Act and Assert
    assertTrue(CharMatchers.upperHex().apply('A'));
  }

  /**
   * Test {@link CharMatchers#lowerHex()}.
   *
   * <p>Method under test: {@link CharMatchers#lowerHex()}
   */
  @Test
  @DisplayName("Test lowerHex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.lowerHex()"})
  void testLowerHex() {
    // Arrange, Act and Assert
    assertFalse(CharMatchers.lowerHex().apply('A'));
  }

  /**
   * Test {@link CharMatchers#hex()}.
   *
   * <p>Method under test: {@link CharMatchers#hex()}
   */
  @Test
  @DisplayName("Test hex()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.base.CharMatcher CharMatchers.hex()"})
  void testHex() {
    // Arrange, Act and Assert
    assertTrue(CharMatchers.hex().apply('A'));
  }
}
