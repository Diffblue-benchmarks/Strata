package com.opengamma.strata.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathExceptionDiffblueTest {
  /**
   * Test {@link MathException#MathException()}.
   *
   * <ul>
   *   <li>Then return Message is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MathException#MathException()}
   */
  @Test
  @DisplayName("Test new MathException(); then return Message is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MathException.<init>()",
    "void MathException.<init>(String)",
    "void MathException.<init>(String, Throwable)",
    "void MathException.<init>(Throwable)"
  })
  void testNewMathException_thenReturnMessageIsNull() {
    // Arrange and Act
    MathException actualMathException = new MathException();

    // Assert
    assertNull(actualMathException.getMessage());
    assertNull(actualMathException.getCause());
    assertEquals(0, actualMathException.getSuppressed().length);
  }

  /**
   * Test {@link MathException#MathException(String)}.
   *
   * <ul>
   *   <li>When {@code 0123456789ABCDEF}.
   *   <li>Then return Message is {@code 0123456789ABCDEF}.
   * </ul>
   *
   * <p>Method under test: {@link MathException#MathException(String)}
   */
  @Test
  @DisplayName(
      "Test new MathException(String); when '0123456789ABCDEF'; then return Message is '0123456789ABCDEF'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MathException.<init>()",
    "void MathException.<init>(String)",
    "void MathException.<init>(String, Throwable)",
    "void MathException.<init>(Throwable)"
  })
  void testNewMathException_when0123456789abcdef_thenReturnMessageIs0123456789abcdef() {
    // Arrange and Act
    MathException actualMathException = new MathException("0123456789ABCDEF");

    // Assert
    assertEquals("0123456789ABCDEF", actualMathException.getMessage());
    assertNull(actualMathException.getCause());
    assertEquals(0, actualMathException.getSuppressed().length);
  }

  /**
   * Test {@link MathException#MathException(String, Throwable)}.
   *
   * <ul>
   *   <li>When {@code 0123456789ABCDEF}.
   *   <li>Then return Message is {@code 0123456789ABCDEF}.
   * </ul>
   *
   * <p>Method under test: {@link MathException#MathException(String, Throwable)}
   */
  @Test
  @DisplayName(
      "Test new MathException(String, Throwable); when '0123456789ABCDEF'; then return Message is '0123456789ABCDEF'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MathException.<init>()",
    "void MathException.<init>(String)",
    "void MathException.<init>(String, Throwable)",
    "void MathException.<init>(Throwable)"
  })
  void testNewMathException_when0123456789abcdef_thenReturnMessageIs0123456789abcdef2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    MathException actualMathException = new MathException("0123456789ABCDEF", cause);

    // Assert
    assertEquals("0123456789ABCDEF", actualMathException.getMessage());
    assertEquals(0, actualMathException.getSuppressed().length);
    assertSame(cause, actualMathException.getCause());
  }

  /**
   * Test {@link MathException#MathException(Throwable)}.
   *
   * <ul>
   *   <li>When {@link Throwable#Throwable()}.
   *   <li>Then return Message is {@code Throwable}.
   * </ul>
   *
   * <p>Method under test: {@link MathException#MathException(Throwable)}
   */
  @Test
  @DisplayName(
      "Test new MathException(Throwable); when Throwable(); then return Message is 'java.lang.Throwable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MathException.<init>()",
    "void MathException.<init>(String)",
    "void MathException.<init>(String, Throwable)",
    "void MathException.<init>(Throwable)"
  })
  void testNewMathException_whenThrowable_thenReturnMessageIsJavaLangThrowable() {
    // Arrange
    Throwable cause = new Throwable();

    // Act
    MathException actualMathException = new MathException(cause);

    // Assert
    assertEquals("java.lang.Throwable", actualMathException.getMessage());
    assertEquals(0, actualMathException.getSuppressed().length);
    assertSame(cause, actualMathException.getCause());
  }
}
