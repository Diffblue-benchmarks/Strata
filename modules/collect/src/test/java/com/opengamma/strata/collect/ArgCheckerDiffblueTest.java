package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.base.CharMatcher;
import com.google.common.collect.ConcurrentHashMultiset;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.Matrix;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ArgCheckerDiffblueTest {
  /**
   * Test {@link ArgChecker#isTrue(boolean, String, double)} with {@code boolean}, {@code String},
   * {@code double}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, double)}
   */
  @Test
  @DisplayName("Test isTrue(boolean, String, double) with 'boolean', 'String', 'double'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, double)"})
  void testIsTrueWithBooleanStringDouble_whenLeftCurlyBracketRightCurlyBracket() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.isTrue(false, "{}", 10.0d));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, double)} with {@code boolean}, {@code String},
   * {@code double}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, double)}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, double) with 'boolean', 'String', 'double'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, double)"})
  void testIsTrueWithBooleanStringDouble_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.isTrue(false, null, 10.0d));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, double)} with {@code boolean}, {@code String},
   * {@code double}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, double)}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, double) with 'boolean', 'String', 'double'; when 'true'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, double)"})
  void testIsTrueWithBooleanStringDouble_whenTrue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> ArgChecker.isTrue(true, "Not all who wander are lost", 10.0d));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, long)} with {@code boolean}, {@code String},
   * {@code long}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, long)}
   */
  @Test
  @DisplayName("Test isTrue(boolean, String, long) with 'boolean', 'String', 'long'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, long)"})
  void testIsTrueWithBooleanStringLong_whenLeftCurlyBracketRightCurlyBracket() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.isTrue(false, "{}", 1L));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, long)} with {@code boolean}, {@code String},
   * {@code long}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, long)}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, long) with 'boolean', 'String', 'long'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, long)"})
  void testIsTrueWithBooleanStringLong_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.isTrue(false, null, 1L));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, long)} with {@code boolean}, {@code String},
   * {@code long}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, long)}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, long) with 'boolean', 'String', 'long'; when 'true'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, long)"})
  void testIsTrueWithBooleanStringLong_whenTrue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> ArgChecker.isTrue(true, "Not all who wander are lost", 1L));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, Object[])} with {@code boolean}, {@code String},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Arg} and {@code Arg}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, Object[]) with 'boolean', 'String', 'Object[]'; when 'Arg' and 'Arg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, Object[])"})
  void testIsTrueWithBooleanStringObject_whenArgAndArg() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isTrue(false, "Not all who wander are lost", "Arg", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, Object[])} with {@code boolean}, {@code String},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Arg}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, Object[]) with 'boolean', 'String', 'Object[]'; when 'Arg'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, Object[])"})
  void testIsTrueWithBooleanStringObject_whenArg_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isTrue(false, "Not all who wander are lost", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, Object[])} with {@code boolean}, {@code String},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, Object[]) with 'boolean', 'String', 'Object[]'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, Object[])"})
  void testIsTrueWithBooleanStringObject_whenLeftCurlyBracketRightCurlyBracket() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.isTrue(false, "{}", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, Object[])} with {@code boolean}, {@code String},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, Object[]) with 'boolean', 'String', 'Object[]'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, Object[])"})
  void testIsTrueWithBooleanStringObject_whenLeftCurlyBracketRightCurlyBracket2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.isTrue(false, "{}", new Object[] {}));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, Object[])} with {@code boolean}, {@code String},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, Object[]) with 'boolean', 'String', 'Object[]'; when 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, Object[])"})
  void testIsTrueWithBooleanStringObject_whenNotAllWhoWanderAreLost() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isTrue(false, "Not all who wander are lost", new Object[] {}));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String, Object[])} with {@code boolean}, {@code String},
   * {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String, Object[]) with 'boolean', 'String', 'Object[]'; when 'true'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String, Object[])"})
  void testIsTrueWithBooleanStringObject_whenTrue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> ArgChecker.isTrue(true, "Not all who wander are lost", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String)} with {@code boolean}, {@code String}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String)}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String) with 'boolean', 'String'; when 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String)"})
  void testIsTrueWithBooleanString_whenFalse_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isTrue(false, "Not all who wander are lost"));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean, String)} with {@code boolean}, {@code String}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean, String)}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean, String) with 'boolean', 'String'; when 'true'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean, String)"})
  void testIsTrueWithBooleanString_whenTrue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> ArgChecker.isTrue(true, "Not all who wander are lost"));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean)} with {@code boolean}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean)}
   */
  @Test
  @DisplayName(
      "Test isTrue(boolean) with 'boolean'; when 'false'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean)"})
  void testIsTrueWithBoolean_whenFalse_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.isTrue(false));
  }

  /**
   * Test {@link ArgChecker#isTrue(boolean)} with {@code boolean}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isTrue(boolean)}
   */
  @Test
  @DisplayName("Test isTrue(boolean) with 'boolean'; when 'true'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isTrue(boolean)"})
  void testIsTrueWithBoolean_whenTrue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> ArgChecker.isTrue(true));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String, Object[])} with {@code validIfFalse}, {@code
   * message}, {@code arg}.
   *
   * <ul>
   *   <li>When {@code Arg} and {@code Arg}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String, Object[]) with 'validIfFalse', 'message', 'arg'; when 'Arg' and 'Arg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String, Object[])"})
  void testIsFalseWithValidIfFalseMessageArg_whenArgAndArg() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isFalse(true, "Not all who wander are lost", "Arg", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String, Object[])} with {@code validIfFalse}, {@code
   * message}, {@code arg}.
   *
   * <ul>
   *   <li>When {@code Arg}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String, Object[]) with 'validIfFalse', 'message', 'arg'; when 'Arg'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String, Object[])"})
  void testIsFalseWithValidIfFalseMessageArg_whenArg_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isFalse(true, "Not all who wander are lost", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String, Object[])} with {@code validIfFalse}, {@code
   * message}, {@code arg}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String, Object[]) with 'validIfFalse', 'message', 'arg'; when 'false'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String, Object[])"})
  void testIsFalseWithValidIfFalseMessageArg_whenFalse_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> ArgChecker.isFalse(false, "Not all who wander are lost", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String, Object[])} with {@code validIfFalse}, {@code
   * message}, {@code arg}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String, Object[]) with 'validIfFalse', 'message', 'arg'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String, Object[])"})
  void testIsFalseWithValidIfFalseMessageArg_whenLeftCurlyBracketRightCurlyBracket() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.isFalse(true, "{}", "Arg"));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String, Object[])} with {@code validIfFalse}, {@code
   * message}, {@code arg}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String, Object[]) with 'validIfFalse', 'message', 'arg'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String, Object[])"})
  void testIsFalseWithValidIfFalseMessageArg_whenLeftCurlyBracketRightCurlyBracket2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.isFalse(true, "{}", new Object[] {}));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String, Object[])} with {@code validIfFalse}, {@code
   * message}, {@code arg}.
   *
   * <ul>
   *   <li>When {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String, Object[]) with 'validIfFalse', 'message', 'arg'; when 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String, Object[])"})
  void testIsFalseWithValidIfFalseMessageArg_whenNotAllWhoWanderAreLost() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isFalse(true, "Not all who wander are lost", new Object[] {}));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String)} with {@code validIfFalse}, {@code message}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String)}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String) with 'validIfFalse', 'message'; when 'false'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String)"})
  void testIsFalseWithValidIfFalseMessage_whenFalse_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> ArgChecker.isFalse(false, "Not all who wander are lost"));
  }

  /**
   * Test {@link ArgChecker#isFalse(boolean, String)} with {@code validIfFalse}, {@code message}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#isFalse(boolean, String)}
   */
  @Test
  @DisplayName(
      "Test isFalse(boolean, String) with 'validIfFalse', 'message'; when 'true'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.isFalse(boolean, String)"})
  void testIsFalseWithValidIfFalseMessage_whenTrue_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.isFalse(true, "Not all who wander are lost"));
  }

  /**
   * Test {@link ArgChecker#notNull(Object, String)}.
   *
   * <ul>
   *   <li>When {@code Argument}.
   *   <li>Then return {@code Argument}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNull(Object, String)}
   */
  @Test
  @DisplayName("Test notNull(Object, String); when 'Argument'; then return 'Argument'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ArgChecker.notNull(Object, String)"})
  void testNotNull_whenArgument_thenReturnArgument() {
    // Arrange, Act and Assert
    assertEquals("Argument", ArgChecker.notNull("Argument", "Name"));
  }

  /**
   * Test {@link ArgChecker#notNull(Object, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNull(Object, String)}
   */
  @Test
  @DisplayName("Test notNull(Object, String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ArgChecker.notNull(Object, String)"})
  void testNotNull_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNull(null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNullItem(Object)}.
   *
   * <ul>
   *   <li>When {@code Argument}.
   *   <li>Then return {@code Argument}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNullItem(Object)}
   */
  @Test
  @DisplayName("Test notNullItem(Object); when 'Argument'; then return 'Argument'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ArgChecker.notNullItem(Object)"})
  void testNotNullItem_whenArgument_thenReturnArgument() {
    // Arrange, Act and Assert
    assertEquals("Argument", ArgChecker.notNullItem("Argument"));
  }

  /**
   * Test {@link ArgChecker#notNullItem(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNullItem(Object)}
   */
  @Test
  @DisplayName("Test notNullItem(Object); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ArgChecker.notNullItem(Object)"})
  void testNotNullItem_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNullItem(null));
  }

  /**
   * Test {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)} with {@code
   * matcher}, {@code minLength}, {@code maxLength}, {@code argument}, {@code name}, {@code
   * equivalentRegex}.
   *
   * <p>Method under test: {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(CharMatcher, int, int, String, String, String) with 'matcher', 'minLength', 'maxLength', 'argument', 'name', 'equivalentRegex'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(CharMatcher, int, int, String, String, String)"})
  void testMatchesWithMatcherMinLengthMaxLengthArgumentNameEquivalentRegex() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(mock(CharMatcher.class), 3, 3, "Argument", "Name", ".*"));
  }

  /**
   * Test {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)} with {@code
   * matcher}, {@code minLength}, {@code maxLength}, {@code argument}, {@code name}, {@code
   * equivalentRegex}.
   *
   * <p>Method under test: {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(CharMatcher, int, int, String, String, String) with 'matcher', 'minLength', 'maxLength', 'argument', 'name', 'equivalentRegex'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(CharMatcher, int, int, String, String, String)"})
  void testMatchesWithMatcherMinLengthMaxLengthArgumentNameEquivalentRegex2() {
    // Arrange
    CharMatcher matcher = mock(CharMatcher.class);
    when(matcher.matchesAllOf(Mockito.<CharSequence>any())).thenReturn(true);

    // Act
    String actualMatchesResult = ArgChecker.matches(matcher, 3, 8, "Argument", "Name", ".*");

    // Assert
    verify(matcher).matchesAllOf(isA(CharSequence.class));
    assertEquals("Argument", actualMatchesResult);
  }

  /**
   * Test {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)} with {@code
   * matcher}, {@code minLength}, {@code maxLength}, {@code argument}, {@code name}, {@code
   * equivalentRegex}.
   *
   * <p>Method under test: {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(CharMatcher, int, int, String, String, String) with 'matcher', 'minLength', 'maxLength', 'argument', 'name', 'equivalentRegex'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(CharMatcher, int, int, String, String, String)"})
  void testMatchesWithMatcherMinLengthMaxLengthArgumentNameEquivalentRegex3() {
    // Arrange
    CharMatcher matcher = mock(CharMatcher.class);
    when(matcher.matchesAllOf(Mockito.<CharSequence>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(matcher, 3, 8, "Argument", "Name", ".*"));
    verify(matcher).matchesAllOf(isA(CharSequence.class));
  }

  /**
   * Test {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)} with {@code
   * matcher}, {@code minLength}, {@code maxLength}, {@code argument}, {@code name}, {@code
   * equivalentRegex}.
   *
   * <ul>
   *   <li>Given {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(CharMatcher, int, int, String, String, String) with 'matcher', 'minLength', 'maxLength', 'argument', 'name', 'equivalentRegex'; given 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(CharMatcher, int, int, String, String, String)"})
  void testMatchesWithMatcherMinLengthMaxLengthArgumentNameEquivalentRegex_givenFalse() {
    // Arrange
    CharMatcher matcher = mock(CharMatcher.class);
    when(matcher.matchesAllOf(Mockito.<CharSequence>any())).thenReturn(false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(matcher, 3, 8, "Argument", "Name", ".*"));
    verify(matcher).matchesAllOf(isA(CharSequence.class));
  }

  /**
   * Test {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)} with {@code
   * matcher}, {@code minLength}, {@code maxLength}, {@code argument}, {@code name}, {@code
   * equivalentRegex}.
   *
   * <ul>
   *   <li>When {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(CharMatcher, int, int, String, String, String) with 'matcher', 'minLength', 'maxLength', 'argument', 'name', 'equivalentRegex'; when '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(CharMatcher, int, int, String, String, String)"})
  void testMatchesWithMatcherMinLengthMaxLengthArgumentNameEquivalentRegex_when42() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(mock(CharMatcher.class), 3, 8, "42", "Name", ".*"));
  }

  /**
   * Test {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)} with {@code
   * matcher}, {@code minLength}, {@code maxLength}, {@code argument}, {@code name}, {@code
   * equivalentRegex}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(CharMatcher, int, int, String, String, String) with 'matcher', 'minLength', 'maxLength', 'argument', 'name', 'equivalentRegex'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(CharMatcher, int, int, String, String, String)"})
  void testMatchesWithMatcherMinLengthMaxLengthArgumentNameEquivalentRegex_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(null, 3, 3, "Argument", "Name", ".*"));
  }

  /**
   * Test {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)} with {@code
   * matcher}, {@code minLength}, {@code maxLength}, {@code argument}, {@code name}, {@code
   * equivalentRegex}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(CharMatcher, int, int, String, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(CharMatcher, int, int, String, String, String) with 'matcher', 'minLength', 'maxLength', 'argument', 'name', 'equivalentRegex'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(CharMatcher, int, int, String, String, String)"})
  void testMatchesWithMatcherMinLengthMaxLengthArgumentNameEquivalentRegex_whenNull2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(mock(CharMatcher.class), 3, 8, null, "Name", ".*"));
  }

  /**
   * Test {@link ArgChecker#matches(Pattern, String, String)} with {@code pattern}, {@code
   * argument}, {@code name}.
   *
   * <ul>
   *   <li>When {@code Argument}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(Pattern, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(Pattern, String, String) with 'pattern', 'argument', 'name'; when 'Argument'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(Pattern, String, String)"})
  void testMatchesWithPatternArgumentName_whenArgument() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(Pattern.compile(".*\\.txt"), "Argument", "Name"));
  }

  /**
   * Test {@link ArgChecker#matches(Pattern, String, String)} with {@code pattern}, {@code
   * argument}, {@code name}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(Pattern, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(Pattern, String, String) with 'pattern', 'argument', 'name'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(Pattern, String, String)"})
  void testMatchesWithPatternArgumentName_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.matches(Pattern.compile(".*\\.txt"), null, "Name"));
  }

  /**
   * Test {@link ArgChecker#matches(Pattern, String, String)} with {@code pattern}, {@code
   * argument}, {@code name}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(Pattern, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(Pattern, String, String) with 'pattern', 'argument', 'name'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(Pattern, String, String)"})
  void testMatchesWithPatternArgumentName_whenNull_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.matches(null, "Argument", "Name"));
  }

  /**
   * Test {@link ArgChecker#matches(Pattern, String, String)} with {@code pattern}, {@code
   * argument}, {@code name}.
   *
   * <ul>
   *   <li>When {@code U.txt}.
   *   <li>Then return {@code U.txt}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#matches(Pattern, String, String)}
   */
  @Test
  @DisplayName(
      "Test matches(Pattern, String, String) with 'pattern', 'argument', 'name'; when 'U.txt'; then return 'U.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.matches(Pattern, String, String)"})
  void testMatchesWithPatternArgumentName_whenUTxt_thenReturnUTxt() {
    // Arrange and Act
    String actualMatchesResult = ArgChecker.matches(Pattern.compile(".*\\.txt"), "U.txt", "Name");

    // Assert
    assertEquals("U.txt", actualMatchesResult);
  }

  /**
   * Test {@link ArgChecker#notBlank(String, String)}.
   *
   * <ul>
   *   <li>When {@code Argument}.
   *   <li>Then return {@code Argument}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notBlank(String, String)}
   */
  @Test
  @DisplayName("Test notBlank(String, String); when 'Argument'; then return 'Argument'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.notBlank(String, String)"})
  void testNotBlank_whenArgument_thenReturnArgument() {
    // Arrange, Act and Assert
    assertEquals("Argument", ArgChecker.notBlank("Argument", "Name"));
  }

  /**
   * Test {@link ArgChecker#notBlank(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notBlank(String, String)}
   */
  @Test
  @DisplayName(
      "Test notBlank(String, String); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.notBlank(String, String)"})
  void testNotBlank_whenEmptyString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notBlank("", "Name"));
  }

  /**
   * Test {@link ArgChecker#notBlank(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notBlank(String, String)}
   */
  @Test
  @DisplayName("Test notBlank(String, String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.notBlank(String, String)"})
  void testNotBlank_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notBlank(null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Iterable, String)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Iterable, String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Iterable, String); given '42'; when ArrayList() add '42'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable ArgChecker.notEmpty(Iterable, String)"})
  void testNotEmpty_given42_whenArrayListAdd42_thenReturnList() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act
    Iterable<Object> actualNotEmptyResult = ArgChecker.notEmpty(objectList, "Name");
    Iterator<Object> actualIteratorResult = actualNotEmptyResult.iterator();

    // Assert
    assertTrue(actualNotEmptyResult instanceof List);
    assertEquals("42", actualIteratorResult.next());
    assertEquals(1, ((List<Object>) actualNotEmptyResult).size());
    assertEquals("42", ((List<Object>) actualNotEmptyResult).get(0));
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link ArgChecker#notEmpty(Collection, String)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Collection, String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Collection, String); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection ArgChecker.notEmpty(Collection, String)"})
  void testNotEmpty_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act
    Collection<Object> actualNotEmptyResult = ArgChecker.notEmpty(objectList, "Name");

    // Assert
    assertTrue(actualNotEmptyResult instanceof List);
    assertEquals(1, actualNotEmptyResult.size());
    assertEquals("42", ((List<Object>) actualNotEmptyResult).get(0));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Collection, String)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Collection, String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Collection, String); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection ArgChecker.notEmpty(Collection, String)"})
  void testNotEmpty_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    Collection<Object> actualNotEmptyResult = ArgChecker.notEmpty(objectList, "Name");

    // Assert
    assertTrue(actualNotEmptyResult instanceof List);
    assertEquals(2, actualNotEmptyResult.size());
    assertEquals("42", ((List<Object>) actualNotEmptyResult).get(0));
    assertEquals("42", ((List<Object>) actualNotEmptyResult).get(1));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Iterable, String)}.
   *
   * <ul>
   *   <li>Given {@code Element}.
   *   <li>When create add {@code Element} and two.
   *   <li>Then return {@link Collection}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Iterable, String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Iterable, String); given 'Element'; when create add 'Element' and two; then return Collection")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable ArgChecker.notEmpty(Iterable, String)"})
  void testNotEmpty_givenElement_whenCreateAddElementAndTwo_thenReturnCollection() {
    // Arrange
    ConcurrentHashMultiset<Object> createResult = ConcurrentHashMultiset.create();
    createResult.add("Element", 2);

    // Act
    Iterable<Object> actualNotEmptyResult = ArgChecker.notEmpty(createResult, "Name");
    Iterator<Object> actualIteratorResult = actualNotEmptyResult.iterator();

    // Assert
    assertTrue(actualNotEmptyResult instanceof Collection);
    assertEquals("Element", actualIteratorResult.next());
    assertEquals("Element", actualIteratorResult.next());
    assertEquals(2, ((Collection<Object>) actualNotEmptyResult).size());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link ArgChecker#notEmpty(Map, String)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Map, String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Map, String); given 'Key'; when HashMap() 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ArgChecker.notEmpty(Map, String)"})
  void testNotEmpty_givenKey_whenHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put("Key", "Value");

    // Act
    Map<Object, Object> actualNotEmptyResult = ArgChecker.notEmpty(objectObjectMap, "Name");

    // Assert
    assertEquals(1, actualNotEmptyResult.size());
    assertEquals("Value", actualNotEmptyResult.get("Key"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(String, String)}.
   *
   * <ul>
   *   <li>When {@code Argument}.
   *   <li>Then return {@code Argument}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(String, String)}
   */
  @Test
  @DisplayName("Test notEmpty(String, String); when 'Argument'; then return 'Argument'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.notEmpty(String, String)"})
  void testNotEmpty_whenArgument_thenReturnArgument() {
    // Arrange, Act and Assert
    assertEquals("Argument", ArgChecker.notEmpty("Argument", "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Collection, String)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Collection, String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Collection, String); when ArrayList(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collection ArgChecker.notEmpty(Collection, String)"})
  void testNotEmpty_whenArrayList_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notEmpty(new ArrayList<>(), "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(double[], String)}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code -0.0}.
   *   <li>Then return array of {@code double} with ten and {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(double[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(double[], String); when array of double with ten and '-0.0'; then return array of double with ten and '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.notEmpty(double[], String)"})
  void testNotEmpty_whenArrayOfDoubleWithTenAnd00_thenReturnArrayOfDoubleWithTenAnd00() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {10.0d, -0.0d, 10.0d, -0.0d},
        ArgChecker.notEmpty(new double[] {10.0d, -0.0d, 10.0d, -0.0d}, "Name"),
        0.0);
  }

  /**
   * Test {@link ArgChecker#notEmpty(int[], String)}.
   *
   * <ul>
   *   <li>When array of {@code int} with one and zero.
   *   <li>Then return array of {@code int} with one and zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(int[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(int[], String); when array of int with one and zero; then return array of int with one and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] ArgChecker.notEmpty(int[], String)"})
  void testNotEmpty_whenArrayOfIntWithOneAndZero_thenReturnArrayOfIntWithOneAndZero() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[] {1, 0, 1, 0}, ArgChecker.notEmpty(new int[] {1, 0, 1, 0}, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(long[], String)}.
   *
   * <ul>
   *   <li>When array of {@code long} with one and zero.
   *   <li>Then return array of {@code long} with one and zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(long[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(long[], String); when array of long with one and zero; then return array of long with one and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] ArgChecker.notEmpty(long[], String)"})
  void testNotEmpty_whenArrayOfLongWithOneAndZero_thenReturnArrayOfLongWithOneAndZero() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new long[] {1L, 0L, 1L, 0L}, ArgChecker.notEmpty(new long[] {1L, 0L, 1L, 0L}, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Object[], String)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Argument}.
   *   <li>Then return first element is {@code Argument}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Object[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Object[], String); when array of Object with 'Argument'; then return first element is 'Argument'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] ArgChecker.notEmpty(Object[], String)"})
  void testNotEmpty_whenArrayOfObjectWithArgument_thenReturnFirstElementIsArgument() {
    // Arrange and Act
    Object[] actualNotEmptyResult = ArgChecker.notEmpty(new Object[] {"Argument"}, "Name");

    // Assert
    assertEquals("Argument", actualNotEmptyResult[0]);
    assertEquals(1, actualNotEmptyResult.length);
  }

  /**
   * Test {@link ArgChecker#notEmpty(double[], String)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(double[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(double[], String); when empty array of double; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.notEmpty(double[], String)"})
  void testNotEmpty_whenEmptyArrayOfDouble_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notEmpty(new double[] {}, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(int[], String)}.
   *
   * <ul>
   *   <li>When empty array of {@code int}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(int[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(int[], String); when empty array of int; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] ArgChecker.notEmpty(int[], String)"})
  void testNotEmpty_whenEmptyArrayOfInt_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notEmpty(new int[] {}, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(long[], String)}.
   *
   * <ul>
   *   <li>When empty array of {@code long}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(long[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(long[], String); when empty array of long; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] ArgChecker.notEmpty(long[], String)"})
  void testNotEmpty_whenEmptyArrayOfLong_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notEmpty(new long[] {}, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Object[], String)}.
   *
   * <ul>
   *   <li>When empty array of {@link Object}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Object[], String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(Object[], String); when empty array of Object; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] ArgChecker.notEmpty(Object[], String)"})
  void testNotEmpty_whenEmptyArrayOfObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notEmpty(new Object[] {}, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(String, String)}
   */
  @Test
  @DisplayName(
      "Test notEmpty(String, String); when empty string; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.notEmpty(String, String)"})
  void testNotEmpty_whenEmptyString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notEmpty("", "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Matrix, String)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Matrix, String)}
   */
  @Test
  @DisplayName("Test notEmpty(Matrix, String); when EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix ArgChecker.notEmpty(Matrix, String)"})
  void testNotEmpty_whenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notEmpty(DoubleArray.EMPTY, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Matrix, String)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Matrix, String)}
   */
  @Test
  @DisplayName("Test notEmpty(Matrix, String); when filled three; then return DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix ArgChecker.notEmpty(Matrix, String)"})
  void testNotEmpty_whenFilledThree_thenReturnDoubleArray() {
    // Arrange and Act
    Matrix actualNotEmptyResult = ArgChecker.notEmpty(DoubleArray.filled(3), "Name");

    // Assert
    assertTrue(actualNotEmptyResult instanceof DoubleArray);
    assertEquals(0.0d, ((DoubleArray) actualNotEmptyResult).max());
    assertEquals(0.0d, ((DoubleArray) actualNotEmptyResult).min());
    assertEquals(0.0d, ((DoubleArray) actualNotEmptyResult).sum());
    List<Double> toListResult = ((DoubleArray) actualNotEmptyResult).toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualNotEmptyResult.dimensions());
    assertEquals(3, actualNotEmptyResult.size());
    assertFalse(((DoubleArray) actualNotEmptyResult).isEmpty());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, ((DoubleArray) actualNotEmptyResult).toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ArgChecker#notEmpty(Map, String)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Map, String)}
   */
  @Test
  @DisplayName("Test notEmpty(Map, String); when HashMap(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ArgChecker.notEmpty(Map, String)"})
  void testNotEmpty_whenHashMap_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notEmpty(new HashMap<>(), "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(String, String)}
   */
  @Test
  @DisplayName("Test notEmpty(String, String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArgChecker.notEmpty(String, String)"})
  void testNotEmpty_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notEmpty((String) null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(double[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(double[], String)}
   */
  @Test
  @DisplayName("Test notEmpty(double[], String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.notEmpty(double[], String)"})
  void testNotEmpty_whenNull_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notEmpty((double[]) null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(int[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(int[], String)}
   */
  @Test
  @DisplayName("Test notEmpty(int[], String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] ArgChecker.notEmpty(int[], String)"})
  void testNotEmpty_whenNull_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notEmpty((int[]) null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(long[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(long[], String)}
   */
  @Test
  @DisplayName("Test notEmpty(long[], String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] ArgChecker.notEmpty(long[], String)"})
  void testNotEmpty_whenNull_thenThrowIllegalArgumentException4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notEmpty((long[]) null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notEmpty(Object[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notEmpty(Object[], String)}
   */
  @Test
  @DisplayName("Test notEmpty(Object[], String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] ArgChecker.notEmpty(Object[], String)"})
  void testNotEmpty_whenNull_thenThrowIllegalArgumentException5() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notEmpty((Object[]) null, "Name"));
  }

  /**
   * Test {@link ArgChecker#noNulls(Iterable, String)} with {@code Iterable}, {@code String}.
   *
   * <ul>
   *   <li>Given {@code Argument}.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Iterable, String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Iterable, String) with 'Iterable', 'String'; given 'Argument'; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable ArgChecker.noNulls(Iterable, String)"})
  void testNoNullsWithIterableString_givenArgument_thenReturnSet() {
    // Arrange
    LinkedHashSet<Object> objectSet = new LinkedHashSet<>();
    objectSet.add("Argument");

    // Act
    Iterable<Object> actualNoNullsResult = ArgChecker.noNulls(objectSet, "Name");
    Iterator<Object> actualIteratorResult = actualNoNullsResult.iterator();

    // Assert
    assertTrue(actualNoNullsResult instanceof Set);
    assertEquals("Argument", actualIteratorResult.next());
    assertEquals(1, ((Set<Object>) actualNoNullsResult).size());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link ArgChecker#noNulls(Iterable, String)} with {@code Iterable}, {@code String}.
   *
   * <ul>
   *   <li>Given {@code Element}.
   *   <li>Then return iterator next is {@code Element}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Iterable, String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Iterable, String) with 'Iterable', 'String'; given 'Element'; then return iterator next is 'Element'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable ArgChecker.noNulls(Iterable, String)"})
  void testNoNullsWithIterableString_givenElement_thenReturnIteratorNextIsElement() {
    // Arrange
    ConcurrentHashMultiset<Object> createResult = ConcurrentHashMultiset.create();
    createResult.add("Element", 2);

    // Act
    Iterable<Object> actualNoNullsResult = ArgChecker.noNulls(createResult, "Name");
    Iterator<Object> actualIteratorResult = actualNoNullsResult.iterator();

    // Assert
    assertTrue(actualNoNullsResult instanceof Collection);
    assertEquals("Element", actualIteratorResult.next());
    assertEquals("Element", actualIteratorResult.next());
    assertEquals(2, ((Collection<Object>) actualNoNullsResult).size());
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link ArgChecker#noNulls(Iterable, String)} with {@code Iterable}, {@code String}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Iterable, String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Iterable, String) with 'Iterable', 'String'; when ArrayList(); then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable ArgChecker.noNulls(Iterable, String)"})
  void testNoNullsWithIterableString_whenArrayList_thenReturnList() {
    // Arrange and Act
    Iterable<Object> actualNoNullsResult = ArgChecker.noNulls(new ArrayList<>(), "Name");
    Iterator<Object> actualIteratorResult = actualNoNullsResult.iterator();

    // Assert
    assertTrue(actualNoNullsResult instanceof List);
    assertFalse(actualIteratorResult.hasNext());
    assertTrue(((List<Object>) actualNoNullsResult).isEmpty());
  }

  /**
   * Test {@link ArgChecker#noNulls(Iterable, String)} with {@code Iterable}, {@code String}.
   *
   * <ul>
   *   <li>When create.
   *   <li>Then return {@link Collection}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Iterable, String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Iterable, String) with 'Iterable', 'String'; when create; then return Collection")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable ArgChecker.noNulls(Iterable, String)"})
  void testNoNullsWithIterableString_whenCreate_thenReturnCollection() {
    // Arrange
    ConcurrentHashMultiset<Object> createResult = ConcurrentHashMultiset.create();

    // Act
    Iterable<Object> actualNoNullsResult = ArgChecker.noNulls(createResult, "Name");
    Iterator<Object> actualIteratorResult = actualNoNullsResult.iterator();

    // Assert
    assertTrue(actualNoNullsResult instanceof Collection);
    assertFalse(actualIteratorResult.hasNext());
    assertTrue(((Collection<Object>) actualNoNullsResult).isEmpty());
  }

  /**
   * Test {@link ArgChecker#noNulls(Map, String)} with {@code Map}, {@code String}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Map, String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Map, String) with 'Map', 'String'; given 'Key'; when HashMap() 'Key' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ArgChecker.noNulls(Map, String)"})
  void testNoNullsWithMapString_givenKey_whenHashMapKeyIsNull() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put("Key", null);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.noNulls(objectObjectMap, "Name"));
  }

  /**
   * Test {@link ArgChecker#noNulls(Map, String)} with {@code Map}, {@code String}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Map, String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Map, String) with 'Map', 'String'; given 'Key'; when HashMap() 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ArgChecker.noNulls(Map, String)"})
  void testNoNullsWithMapString_givenKey_whenHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put("Key", "Value");

    // Act
    Map<Object, Object> actualNoNullsResult = ArgChecker.noNulls(objectObjectMap, "Name");

    // Assert
    assertEquals(1, actualNoNullsResult.size());
    assertEquals("Value", actualNoNullsResult.get("Key"));
  }

  /**
   * Test {@link ArgChecker#noNulls(Map, String)} with {@code Map}, {@code String}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Map, String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Map, String) with 'Map', 'String'; given 'null'; when HashMap() 'null' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ArgChecker.noNulls(Map, String)"})
  void testNoNullsWithMapString_givenNull_whenHashMapNullIsValue() {
    // Arrange
    HashMap<Object, Object> objectObjectMap = new HashMap<>();
    objectObjectMap.put(null, "Value");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.noNulls(objectObjectMap, "Name"));
  }

  /**
   * Test {@link ArgChecker#noNulls(Map, String)} with {@code Map}, {@code String}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Map, String)}
   */
  @Test
  @DisplayName("Test noNulls(Map, String) with 'Map', 'String'; when HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map ArgChecker.noNulls(Map, String)"})
  void testNoNullsWithMapString_whenHashMap_thenReturnEmpty() {
    // Arrange and Act
    Map<Object, Object> actualNoNullsResult = ArgChecker.noNulls(new HashMap<>(), "Name");

    // Assert
    assertTrue(actualNoNullsResult.isEmpty());
  }

  /**
   * Test {@link ArgChecker#noNulls(Object[], String)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code Argument}.
   *   <li>Then return first element is {@code Argument}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Object[], String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Object[], String); when array of Object with 'Argument'; then return first element is 'Argument'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] ArgChecker.noNulls(Object[], String)"})
  void testNoNulls_whenArrayOfObjectWithArgument_thenReturnFirstElementIsArgument() {
    // Arrange and Act
    Object[] actualNoNullsResult = ArgChecker.noNulls(new Object[] {"Argument"}, "Name");

    // Assert
    assertEquals("Argument", actualNoNullsResult[0]);
    assertEquals(1, actualNoNullsResult.length);
  }

  /**
   * Test {@link ArgChecker#noNulls(Object[], String)}.
   *
   * <ul>
   *   <li>When array of {@link Object} with {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noNulls(Object[], String)}
   */
  @Test
  @DisplayName(
      "Test noNulls(Object[], String); when array of Object with 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] ArgChecker.noNulls(Object[], String)"})
  void testNoNulls_whenArrayOfObjectWithNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.noNulls(new Object[] {null}, "Name"));
  }

  /**
   * Test {@link ArgChecker#noDuplicates(double[], String)}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@code 0.5} and one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicates(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicates(double[], String); then return array of double with '0.5' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicates(double[], String)"})
  void testNoDuplicates_thenReturnArrayOfDoubleWith05AndOne() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 10.0d, -0.0d},
        ArgChecker.noDuplicates(new double[] {0.5d, 1.0d, 10.0d, -0.0d}, "Name"),
        0.0);
  }

  /**
   * Test {@link ArgChecker#noDuplicates(double[], String)}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code -0.0}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicates(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicates(double[], String); when array of double with ten and '-0.0'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicates(double[], String)"})
  void testNoDuplicates_whenArrayOfDoubleWithTenAnd00_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.noDuplicates(new double[] {10.0d, -0.0d, 10.0d, -0.0d}, "Name"));
  }

  /**
   * Test {@link ArgChecker#noDuplicates(double[], String)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicates(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicates(double[], String); when empty array of double; then return empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicates(double[], String)"})
  void testNoDuplicates_whenEmptyArrayOfDouble_thenReturnEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[] {}, ArgChecker.noDuplicates(new double[] {}, "Name"), 0.0);
  }

  /**
   * Test {@link ArgChecker#noDuplicates(double[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicates(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicates(double[], String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicates(double[], String)"})
  void testNoDuplicates_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.noDuplicates(null, "Name"));
  }

  /**
   * Test {@link ArgChecker#noDuplicatesSorted(double[], String)}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@code -0.0} and {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicatesSorted(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicatesSorted(double[], String); when array of double with '-0.0' and '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicatesSorted(double[], String)"})
  void testNoDuplicatesSorted_whenArrayOfDoubleWith00And00() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.noDuplicatesSorted(new double[] {-0.0d, -0.0d, 10.0d, -0.0d}, "Name"));
  }

  /**
   * Test {@link ArgChecker#noDuplicatesSorted(double[], String)}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@code -0.5} and {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicatesSorted(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicatesSorted(double[], String); when array of double with '-0.5' and '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicatesSorted(double[], String)"})
  void testNoDuplicatesSorted_whenArrayOfDoubleWith05And00() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.noDuplicatesSorted(new double[] {-0.5d, -0.0d, 10.0d, -0.0d}, "Name"));
  }

  /**
   * Test {@link ArgChecker#noDuplicatesSorted(double[], String)}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicatesSorted(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicatesSorted(double[], String); when array of double with ten and '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicatesSorted(double[], String)"})
  void testNoDuplicatesSorted_whenArrayOfDoubleWithTenAnd00() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.noDuplicatesSorted(new double[] {10.0d, -0.0d, 10.0d, -0.0d}, "Name"));
  }

  /**
   * Test {@link ArgChecker#noDuplicatesSorted(double[], String)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicatesSorted(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicatesSorted(double[], String); when empty array of double; then return empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicatesSorted(double[], String)"})
  void testNoDuplicatesSorted_whenEmptyArrayOfDouble_thenReturnEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[] {}, ArgChecker.noDuplicatesSorted(new double[] {}, "Name"), 0.0);
  }

  /**
   * Test {@link ArgChecker#noDuplicatesSorted(double[], String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#noDuplicatesSorted(double[], String)}
   */
  @Test
  @DisplayName(
      "Test noDuplicatesSorted(double[], String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ArgChecker.noDuplicatesSorted(double[], String)"})
  void testNoDuplicatesSorted_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.noDuplicatesSorted(null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(Decimal, String)} with {@code Decimal}, {@code String}.
   *
   * <ul>
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notPositive(Decimal, String) with 'Decimal', 'String'; when MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notPositive(Decimal, String)"})
  void testNotPositiveWithDecimalString_whenMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notPositive(Decimal.MAX_VALUE, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(Decimal, String)} with {@code Decimal}, {@code String}.
   *
   * <ul>
   *   <li>When {@link Decimal#MIN_VALUE}.
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notPositive(Decimal, String) with 'Decimal', 'String'; when MIN_VALUE; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notPositive(Decimal, String)"})
  void testNotPositiveWithDecimalString_whenMin_value_thenReturnSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualNotPositiveResult = ArgChecker.notPositive(Decimal.MIN_VALUE, "Name");

    // Assert
    assertEquals(-1, actualNotPositiveResult.signum());
    assertEquals(0, actualNotPositiveResult.scale());
    assertFalse(actualNotPositiveResult.isZero());
    Decimal decimal = Decimal.MAX_VALUE;
    assertEquals(decimal, actualNotPositiveResult.abs());
    assertEquals(decimal, actualNotPositiveResult.negated());
  }

  /**
   * Test {@link ArgChecker#notPositive(Decimal, String)} with {@code Decimal}, {@code String}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notPositive(Decimal, String) with 'Decimal', 'String'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notPositive(Decimal, String)"})
  void testNotPositiveWithDecimalString_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notPositive(null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(double, String)} with {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(double, String)}
   */
  @Test
  @DisplayName(
      "Test notPositive(double, String) with 'double', 'String'; when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notPositive(double, String)"})
  void testNotPositiveWithDoubleString_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notPositive(10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(double, String)} with {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(double, String)}
   */
  @Test
  @DisplayName(
      "Test notPositive(double, String) with 'double', 'String'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notPositive(double, String)"})
  void testNotPositiveWithDoubleString_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ArgChecker.notPositive(0.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(int, String)} with {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(int, String)}
   */
  @Test
  @DisplayName(
      "Test notPositive(int, String) with 'int', 'String'; when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.notPositive(int, String)"})
  void testNotPositiveWithIntString_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notPositive(1, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(int, String)} with {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(int, String)}
   */
  @Test
  @DisplayName("Test notPositive(int, String) with 'int', 'String'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.notPositive(int, String)"})
  void testNotPositiveWithIntString_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, ArgChecker.notPositive(0, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(long, String)} with {@code long}, {@code String}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(long, String)}
   */
  @Test
  @DisplayName(
      "Test notPositive(long, String) with 'long', 'String'; when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArgChecker.notPositive(long, String)"})
  void testNotPositiveWithLongString_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notPositive(1L, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositive(long, String)} with {@code long}, {@code String}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositive(long, String)}
   */
  @Test
  @DisplayName("Test notPositive(long, String) with 'long', 'String'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArgChecker.notPositive(long, String)"})
  void testNotPositiveWithLongString_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0L, ArgChecker.notPositive(0L, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositiveIfPresent(Decimal, String)}.
   *
   * <ul>
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositiveIfPresent(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notPositiveIfPresent(Decimal, String); when MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notPositiveIfPresent(Decimal, String)"})
  void testNotPositiveIfPresent_whenMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.notPositiveIfPresent(Decimal.MAX_VALUE, "Name"));
  }

  /**
   * Test {@link ArgChecker#notPositiveIfPresent(Decimal, String)}.
   *
   * <ul>
   *   <li>When {@link Decimal#MIN_VALUE}.
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositiveIfPresent(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notPositiveIfPresent(Decimal, String); when MIN_VALUE; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notPositiveIfPresent(Decimal, String)"})
  void testNotPositiveIfPresent_whenMin_value_thenReturnSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualNotPositiveIfPresentResult =
        ArgChecker.notPositiveIfPresent(Decimal.MIN_VALUE, "Name");

    // Assert
    assertEquals(-1, actualNotPositiveIfPresentResult.signum());
    assertEquals(0, actualNotPositiveIfPresentResult.scale());
    assertFalse(actualNotPositiveIfPresentResult.isZero());
    Decimal decimal = Decimal.MAX_VALUE;
    assertEquals(decimal, actualNotPositiveIfPresentResult.abs());
    assertEquals(decimal, actualNotPositiveIfPresentResult.negated());
  }

  /**
   * Test {@link ArgChecker#notPositiveIfPresent(Decimal, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notPositiveIfPresent(Decimal, String)}
   */
  @Test
  @DisplayName("Test notPositiveIfPresent(Decimal, String); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notPositiveIfPresent(Decimal, String)"})
  void testNotPositiveIfPresent_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ArgChecker.notPositiveIfPresent(null, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(Decimal, String)} with {@code Decimal}, {@code String}.
   *
   * <ul>
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notNegative(Decimal, String) with 'Decimal', 'String'; when MAX_VALUE; then return scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notNegative(Decimal, String)"})
  void testNotNegativeWithDecimalString_whenMax_value_thenReturnScaleIsZero() {
    // Arrange and Act
    Decimal actualNotNegativeResult = ArgChecker.notNegative(Decimal.MAX_VALUE, "Name");

    // Assert
    assertEquals(0, actualNotNegativeResult.scale());
    assertEquals(1, actualNotNegativeResult.signum());
    assertFalse(actualNotNegativeResult.isZero());
    assertEquals(Decimal.MAX_VALUE, actualNotNegativeResult.abs());
    assertEquals(Decimal.MIN_VALUE, actualNotNegativeResult.negated());
  }

  /**
   * Test {@link ArgChecker#notNegative(Decimal, String)} with {@code Decimal}, {@code String}.
   *
   * <ul>
   *   <li>When {@link Decimal#MIN_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notNegative(Decimal, String) with 'Decimal', 'String'; when MIN_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notNegative(Decimal, String)"})
  void testNotNegativeWithDecimalString_whenMin_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notNegative(Decimal.MIN_VALUE, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(Decimal, String)} with {@code Decimal}, {@code String}.
   *
   * <ul>
   *   <li>When ofScaled {@code -1486618625} and one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notNegative(Decimal, String) with 'Decimal', 'String'; when ofScaled '-1486618625' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notNegative(Decimal, String)"})
  void testNotNegativeWithDecimalString_whenOfScaled1486618625AndOne() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.notNegative(Decimal.ofScaled(-1486618625L, 1), "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(double, String)} with {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegative(double, String) with 'double', 'String'; when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegative(double, String)"})
  void testNotNegativeWithDoubleString_when10e10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNegative(-1.0E-10d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(double, String)} with {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegative(double, String) with 'double', 'String'; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegative(double, String)"})
  void testNotNegativeWithDoubleString_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, ArgChecker.notNegative(10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(int, String)} with {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(int, String)}
   */
  @Test
  @DisplayName(
      "Test notNegative(int, String) with 'int', 'String'; when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.notNegative(int, String)"})
  void testNotNegativeWithIntString_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNegative(-1, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(int, String)} with {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(int, String)}
   */
  @Test
  @DisplayName("Test notNegative(int, String) with 'int', 'String'; when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.notNegative(int, String)"})
  void testNotNegativeWithIntString_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, ArgChecker.notNegative(1, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(long, String)} with {@code long}, {@code String}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(long, String)}
   */
  @Test
  @DisplayName(
      "Test notNegative(long, String) with 'long', 'String'; when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArgChecker.notNegative(long, String)"})
  void testNotNegativeWithLongString_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNegative(-1L, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegative(long, String)} with {@code long}, {@code String}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegative(long, String)}
   */
  @Test
  @DisplayName("Test notNegative(long, String) with 'long', 'String'; when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArgChecker.notNegative(long, String)"})
  void testNotNegativeWithLongString_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1L, ArgChecker.notNegative(1L, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNaN(double, String)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNaN(double, String)}
   */
  @Test
  @DisplayName("Test notNaN(double, String); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNaN(double, String)"})
  void testNotNaN_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNaN(Double.NaN, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNaN(double, String)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNaN(double, String)}
   */
  @Test
  @DisplayName("Test notNaN(double, String); when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNaN(double, String)"})
  void testNotNaN_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, ArgChecker.notNaN(10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(Decimal, String)} with {@code Decimal}, {@code
   * String}.
   *
   * <ul>
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(Decimal, String) with 'Decimal', 'String'; when MAX_VALUE; then return scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notNegativeOrZero(Decimal, String)"})
  void testNotNegativeOrZeroWithDecimalString_whenMax_value_thenReturnScaleIsZero() {
    // Arrange and Act
    Decimal actualNotNegativeOrZeroResult = ArgChecker.notNegativeOrZero(Decimal.MAX_VALUE, "Name");

    // Assert
    assertEquals(0, actualNotNegativeOrZeroResult.scale());
    assertEquals(1, actualNotNegativeOrZeroResult.signum());
    assertFalse(actualNotNegativeOrZeroResult.isZero());
    assertEquals(Decimal.MAX_VALUE, actualNotNegativeOrZeroResult.abs());
    assertEquals(Decimal.MIN_VALUE, actualNotNegativeOrZeroResult.negated());
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(Decimal, String)} with {@code Decimal}, {@code
   * String}.
   *
   * <ul>
   *   <li>When {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(Decimal, String)}
   */
  @Test
  @DisplayName("Test notNegativeOrZero(Decimal, String) with 'Decimal', 'String'; when MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notNegativeOrZero(Decimal, String)"})
  void testNotNegativeOrZeroWithDecimalString_whenMin_value() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.notNegativeOrZero(Decimal.MIN_VALUE, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(Decimal, String)} with {@code Decimal}, {@code
   * String}.
   *
   * <ul>
   *   <li>When ofScaled {@code -1486618625} and one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(Decimal, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(Decimal, String) with 'Decimal', 'String'; when ofScaled '-1486618625' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notNegativeOrZero(Decimal, String)"})
  void testNotNegativeOrZeroWithDecimalString_whenOfScaled1486618625AndOne() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.notNegativeOrZero(Decimal.ofScaled(-1486618625L, 1), "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(Decimal, String)} with {@code Decimal}, {@code
   * String}.
   *
   * <ul>
   *   <li>When {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(Decimal, String)}
   */
  @Test
  @DisplayName("Test notNegativeOrZero(Decimal, String) with 'Decimal', 'String'; when ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal ArgChecker.notNegativeOrZero(Decimal, String)"})
  void testNotNegativeOrZeroWithDecimalString_whenZero() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notNegativeOrZero(Decimal.ZERO, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(double, double, String)} with {@code double}, {@code
   * double}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(double, double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(double, double, String) with 'double', 'double', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegativeOrZero(double, double, String)"})
  void testNotNegativeOrZeroWithDoubleDoubleString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.notNegativeOrZero(10.0d, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(double, double, String)} with {@code double}, {@code
   * double}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(double, double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(double, double, String) with 'double', 'double', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegativeOrZero(double, double, String)"})
  void testNotNegativeOrZeroWithDoubleDoubleString_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.notNegativeOrZero(-1.0E-10d, 0.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(double, double, String)} with {@code double}, {@code
   * double}, {@code String}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(double, double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(double, double, String) with 'double', 'double', 'String'; when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegativeOrZero(double, double, String)"})
  void testNotNegativeOrZeroWithDoubleDoubleString_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, ArgChecker.notNegativeOrZero(Double.NaN, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(double, double, String)} with {@code double}, {@code
   * double}, {@code String}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(double, double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(double, double, String) with 'double', 'double', 'String'; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegativeOrZero(double, double, String)"})
  void testNotNegativeOrZeroWithDoubleDoubleString_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, ArgChecker.notNegativeOrZero(10.0d, 0.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(double, String)} with {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(double, String) with 'double', 'String'; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegativeOrZero(double, String)"})
  void testNotNegativeOrZeroWithDoubleString_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, ArgChecker.notNegativeOrZero(10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(double, String)} with {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(double, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(double, String) with 'double', 'String'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notNegativeOrZero(double, String)"})
  void testNotNegativeOrZeroWithDoubleString_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNegativeOrZero(0.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(int, String)} with {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(int, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(int, String) with 'int', 'String'; when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.notNegativeOrZero(int, String)"})
  void testNotNegativeOrZeroWithIntString_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, ArgChecker.notNegativeOrZero(1, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(int, String)} with {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(int, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(int, String) with 'int', 'String'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.notNegativeOrZero(int, String)"})
  void testNotNegativeOrZeroWithIntString_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNegativeOrZero(0, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(long, String)} with {@code long}, {@code String}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(long, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(long, String) with 'long', 'String'; when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArgChecker.notNegativeOrZero(long, String)"})
  void testNotNegativeOrZeroWithLongString_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1L, ArgChecker.notNegativeOrZero(1L, "Name"));
  }

  /**
   * Test {@link ArgChecker#notNegativeOrZero(long, String)} with {@code long}, {@code String}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notNegativeOrZero(long, String)}
   */
  @Test
  @DisplayName(
      "Test notNegativeOrZero(long, String) with 'long', 'String'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long ArgChecker.notNegativeOrZero(long, String)"})
  void testNotNegativeOrZeroWithLongString_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notNegativeOrZero(0L, "Name"));
  }

  /**
   * Test {@link ArgChecker#notZero(double, String)} with {@code argument}, {@code name}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notZero(double, String)}
   */
  @Test
  @DisplayName("Test notZero(double, String) with 'argument', 'name'; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notZero(double, String)"})
  void testNotZeroWithArgumentName_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, ArgChecker.notZero(10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notZero(double, String)} with {@code argument}, {@code name}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notZero(double, String)}
   */
  @Test
  @DisplayName(
      "Test notZero(double, String) with 'argument', 'name'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notZero(double, String)"})
  void testNotZeroWithArgumentName_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notZero(0.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notZero(double, double, String)} with {@code argument}, {@code
   * tolerance}, {@code name}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notZero(double, double, String)}
   */
  @Test
  @DisplayName(
      "Test notZero(double, double, String) with 'argument', 'tolerance', 'name'; when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notZero(double, double, String)"})
  void testNotZeroWithArgumentToleranceName_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, ArgChecker.notZero(Double.NaN, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notZero(double, double, String)} with {@code argument}, {@code
   * tolerance}, {@code name}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notZero(double, double, String)}
   */
  @Test
  @DisplayName(
      "Test notZero(double, double, String) with 'argument', 'tolerance', 'name'; when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notZero(double, double, String)"})
  void testNotZeroWithArgumentToleranceName_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.notZero(10.0d, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#notZero(double, double, String)} with {@code argument}, {@code
   * tolerance}, {@code name}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#notZero(double, double, String)}
   */
  @Test
  @DisplayName(
      "Test notZero(double, double, String) with 'argument', 'tolerance', 'name'; when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.notZero(double, double, String)"})
  void testNotZeroWithArgumentToleranceName_whenZero_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, ArgChecker.notZero(10.0d, 0.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRange(double, double, double, String)} with {@code double}, {@code
   * double}, {@code double}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRange(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRange(double, double, double, String) with 'double', 'double', 'double', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRange(double, double, double, String)"})
  void testInRangeWithDoubleDoubleDoubleString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.inRange(10.0d, 10.0d, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRange(double, double, double, String)} with {@code double}, {@code
   * double}, {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRange(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRange(double, double, double, String) with 'double', 'double', 'double', 'String'; when '-0.0'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRange(double, double, double, String)"})
  void testInRangeWithDoubleDoubleDoubleString_when00_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.inRange(-0.0d, 10.0d, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRange(double, double, double, String)} with {@code double}, {@code
   * double}, {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRange(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRange(double, double, double, String) with 'double', 'double', 'double', 'String'; when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRange(double, double, double, String)"})
  void testInRangeWithDoubleDoubleDoubleString_whenNaN_thenReturnNaN() {
    // Arrange and Act
    double actualInRangeResult = ArgChecker.inRange(Double.NaN, 10.0d, 10.0d, "Name");

    // Assert
    assertEquals(Double.NaN, actualInRangeResult);
  }

  /**
   * Test {@link ArgChecker#inRange(int, int, int, String)} with {@code int}, {@code int}, {@code
   * int}, {@code String}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRange(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRange(int, int, int, String) with 'int', 'int', 'int', 'String'; when four; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRange(int, int, int, String)"})
  void testInRangeWithIntIntIntString_whenFour_thenReturnOne() {
    // Arrange and Act
    int actualInRangeResult = ArgChecker.inRange(1, 1, 4, "Name");

    // Assert
    assertEquals(1, actualInRangeResult);
  }

  /**
   * Test {@link ArgChecker#inRange(int, int, int, String)} with {@code int}, {@code int}, {@code
   * int}, {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRange(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRange(int, int, int, String) with 'int', 'int', 'int', 'String'; when 'Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRange(int, int, int, String)"})
  void testInRangeWithIntIntIntString_whenName_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.inRange(1, 1, 1, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRange(int, int, int, String)} with {@code int}, {@code int}, {@code
   * int}, {@code String}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRange(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRange(int, int, int, String) with 'int', 'int', 'int', 'String'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRange(int, int, int, String)"})
  void testInRangeWithIntIntIntString_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ArgChecker.inRange(0, 1, 1, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeInclusive(double, double, double, String)} with {@code double},
   * {@code double}, {@code double}, {@code String}.
   *
   * <p>Method under test: {@link ArgChecker#inRangeInclusive(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeInclusive(double, double, double, String) with 'double', 'double', 'double', 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRangeInclusive(double, double, double, String)"})
  void testInRangeInclusiveWithDoubleDoubleDoubleString() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inRangeInclusive(-0.0d, 10.0d, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeInclusive(double, double, double, String)} with {@code double},
   * {@code double}, {@code double}, {@code String}.
   *
   * <p>Method under test: {@link ArgChecker#inRangeInclusive(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeInclusive(double, double, double, String) with 'double', 'double', 'double', 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRangeInclusive(double, double, double, String)"})
  void testInRangeInclusiveWithDoubleDoubleDoubleString2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inRangeInclusive(10.0d, 10.0d, -0.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeInclusive(double, double, double, String)} with {@code double},
   * {@code double}, {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeInclusive(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeInclusive(double, double, double, String) with 'double', 'double', 'double', 'String'; when 'Name'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRangeInclusive(double, double, double, String)"})
  void testInRangeInclusiveWithDoubleDoubleDoubleString_whenName_thenReturnTen() {
    // Arrange and Act
    double actualInRangeInclusiveResult = ArgChecker.inRangeInclusive(10.0d, 10.0d, 10.0d, "Name");

    // Assert
    assertEquals(10.0d, actualInRangeInclusiveResult);
  }

  /**
   * Test {@link ArgChecker#inRangeInclusive(int, int, int, String)} with {@code int}, {@code int},
   * {@code int}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeInclusive(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeInclusive(int, int, int, String) with 'int', 'int', 'int', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRangeInclusive(int, int, int, String)"})
  void testInRangeInclusiveWithIntIntIntString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.inRangeInclusive(0, 1, 1, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeInclusive(int, int, int, String)} with {@code int}, {@code int},
   * {@code int}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeInclusive(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeInclusive(int, int, int, String) with 'int', 'int', 'int', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRangeInclusive(int, int, int, String)"})
  void testInRangeInclusiveWithIntIntIntString_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.inRangeInclusive(1, 1, 0, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeInclusive(int, int, int, String)} with {@code int}, {@code int},
   * {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeInclusive(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeInclusive(int, int, int, String) with 'int', 'int', 'int', 'String'; when 'Name'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRangeInclusive(int, int, int, String)"})
  void testInRangeInclusiveWithIntIntIntString_whenName_thenReturnOne() {
    // Arrange and Act
    int actualInRangeInclusiveResult = ArgChecker.inRangeInclusive(1, 1, 1, "Name");

    // Assert
    assertEquals(1, actualInRangeInclusiveResult);
  }

  /**
   * Test {@link ArgChecker#inRangeExclusive(double, double, double, String)} with {@code double},
   * {@code double}, {@code double}, {@code String}.
   *
   * <p>Method under test: {@link ArgChecker#inRangeExclusive(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeExclusive(double, double, double, String) with 'double', 'double', 'double', 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRangeExclusive(double, double, double, String)"})
  void testInRangeExclusiveWithDoubleDoubleDoubleString() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inRangeExclusive(10.0d, 10.0d, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeExclusive(double, double, double, String)} with {@code double},
   * {@code double}, {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeExclusive(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeExclusive(double, double, double, String) with 'double', 'double', 'double', 'String'; when '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRangeExclusive(double, double, double, String)"})
  void testInRangeExclusiveWithDoubleDoubleDoubleString_when00() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inRangeExclusive(10.0d, -0.0d, 10.0d, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeExclusive(double, double, double, String)} with {@code double},
   * {@code double}, {@code double}, {@code String}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeExclusive(double, double, double, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeExclusive(double, double, double, String) with 'double', 'double', 'double', 'String'; when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ArgChecker.inRangeExclusive(double, double, double, String)"})
  void testInRangeExclusiveWithDoubleDoubleDoubleString_whenNaN_thenReturnNaN() {
    // Arrange and Act
    double actualInRangeExclusiveResult =
        ArgChecker.inRangeExclusive(Double.NaN, 10.0d, 10.0d, "Name");

    // Assert
    assertEquals(Double.NaN, actualInRangeExclusiveResult);
  }

  /**
   * Test {@link ArgChecker#inRangeExclusive(int, int, int, String)} with {@code int}, {@code int},
   * {@code int}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeExclusive(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeExclusive(int, int, int, String) with 'int', 'int', 'int', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRangeExclusive(int, int, int, String)"})
  void testInRangeExclusiveWithIntIntIntString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.inRangeExclusive(1, 1, 1, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeExclusive(int, int, int, String)} with {@code int}, {@code int},
   * {@code int}, {@code String}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeExclusive(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeExclusive(int, int, int, String) with 'int', 'int', 'int', 'String'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRangeExclusive(int, int, int, String)"})
  void testInRangeExclusiveWithIntIntIntString_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ArgChecker.inRangeExclusive(4, 1, 1, "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeExclusive(int, int, int, String)} with {@code int}, {@code int},
   * {@code int}, {@code String}.
   *
   * <ul>
   *   <li>When twenty.
   *   <li>Then return four.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeExclusive(int, int, int, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeExclusive(int, int, int, String) with 'int', 'int', 'int', 'String'; when twenty; then return four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ArgChecker.inRangeExclusive(int, int, int, String)"})
  void testInRangeExclusiveWithIntIntIntString_whenTwenty_thenReturnFour() {
    // Arrange and Act
    int actualInRangeExclusiveResult = ArgChecker.inRangeExclusive(4, 1, 20, "Name");

    // Assert
    assertEquals(4, actualInRangeExclusiveResult);
  }

  /**
   * Test {@link ArgChecker#inRangeComparable(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>Then return Name is {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparable(Comparable, Comparable, Comparable,
   * String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparable(Comparable, Comparable, Comparable, String); then return Name is 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparable(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparable_thenReturnNameIsTestTxt() {
    // Arrange and Act
    File actualInRangeComparableResult =
        ArgChecker.inRangeComparable(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
            Paths.get(System.getProperty("java.io.tmpdir"), "{}").toFile(),
            "Name");

    // Assert
    assertEquals("test.txt", actualInRangeComparableResult.getName());
    assertTrue(actualInRangeComparableResult.isAbsolute());
  }

  /**
   * Test {@link ArgChecker#inRangeComparable(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparable(Comparable, Comparable, Comparable,
   * String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparable(Comparable, Comparable, Comparable, String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparable(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparable_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ArgChecker.inRangeComparable(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeComparable(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>When Property is {@code java.io.tmpdir} is {@code Expected {} <= '{}' < {}, but found {}}
   *       toFile.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparable(Comparable, Comparable, Comparable,
   * String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparable(Comparable, Comparable, Comparable, String); when Property is 'java.io.tmpdir' is 'Expected {} <= '{}' < {}, but found {}' toFile")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparable(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparable_whenPropertyIsJavaIoTmpdirIsExpectedButFoundToFile() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ArgChecker.inRangeComparable(
                Paths.get(
                        System.getProperty("java.io.tmpdir"),
                        "Expected {} <= '{}' < {}, but found {}")
                    .toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeComparableInclusive(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>Then return Name is {@code test.txt}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparableInclusive(Comparable, Comparable,
   * Comparable, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparableInclusive(Comparable, Comparable, Comparable, String); then return Name is 'test.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparableInclusive(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparableInclusive_thenReturnNameIsTestTxt() {
    // Arrange and Act
    File actualInRangeComparableInclusiveResult =
        ArgChecker.inRangeComparableInclusive(
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
            Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
            "Name");

    // Assert
    assertEquals("test.txt", actualInRangeComparableInclusiveResult.getName());
    assertTrue(actualInRangeComparableInclusiveResult.isAbsolute());
  }

  /**
   * Test {@link ArgChecker#inRangeComparableInclusive(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparableInclusive(Comparable, Comparable,
   * Comparable, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparableInclusive(Comparable, Comparable, Comparable, String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparableInclusive(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparableInclusive_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ArgChecker.inRangeComparableInclusive(
                Paths.get(System.getProperty("java.io.tmpdir"), "foo").toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeComparableInclusive(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparableInclusive(Comparable, Comparable,
   * Comparable, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparableInclusive(Comparable, Comparable, Comparable, String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparableInclusive(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparableInclusive_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ArgChecker.inRangeComparableInclusive(
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile(),
                Paths.get(System.getProperty("java.io.tmpdir"), "foo").toFile(),
                "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>When {@code Argument}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable,
   * Comparable, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparableExclusive(Comparable, Comparable, Comparable, String); when 'Argument'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparableExclusive(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparableExclusive_whenArgument_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ArgChecker.inRangeComparableExclusive(
                "Argument", "Low Exclusive", "High Exclusive", "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable,
   * Comparable, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparableExclusive(Comparable, Comparable, Comparable, String); when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparableExclusive(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparableExclusive_whenLeftCurlyBracketRightCurlyBracket() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ArgChecker.inRangeComparableExclusive("{}", "Low Exclusive", "High Exclusive", "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable,
   * Comparable, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparableExclusive(Comparable, Comparable, Comparable, String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparableExclusive(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparableExclusive_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ArgChecker.inRangeComparableExclusive(null, "Low Exclusive", "High Exclusive", "Name"));
  }

  /**
   * Test {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable, Comparable, String)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return intValue is minus eleven.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inRangeComparableExclusive(Comparable, Comparable,
   * Comparable, String)}
   */
  @Test
  @DisplayName(
      "Test inRangeComparableExclusive(Comparable, Comparable, Comparable, String); when one; then return intValue is minus eleven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Comparable ArgChecker.inRangeComparableExclusive(Comparable, Comparable, Comparable, String)"
  })
  void testInRangeComparableExclusive_whenOne_thenReturnIntValueIsMinusEleven() {
    // Arrange and Act
    Object actualInRangeComparableExclusiveResult =
        ArgChecker.inRangeComparableExclusive(-11, Integer.MIN_VALUE, 1, "Name");

    // Assert
    assertEquals(-11, ((Integer) actualInRangeComparableExclusiveResult).intValue());
  }

  /**
   * Test {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderNotEqual(Comparable, Object, String, String); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderNotEqual(Comparable, Object, String, String)"})
  void testInOrderNotEqual_givenIllegalArgumentException() {
    // Arrange
    Comparable<Object> obj1 = mock(Comparable.class);
    when(obj1.compareTo(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inOrderNotEqual(obj1, "Obj2", "Name1", "Name2"));
    verify(obj1).compareTo(isA(Object.class));
  }

  /**
   * Test {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>Given minus one.
   *   <li>When {@link Comparable} {@link Comparable#compareTo(Object)} return minus one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderNotEqual(Comparable, Object, String, String); given minus one; when Comparable compareTo(Object) return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderNotEqual(Comparable, Object, String, String)"})
  void testInOrderNotEqual_givenMinusOne_whenComparableCompareToReturnMinusOne() {
    // Arrange
    Comparable<Object> obj1 = mock(Comparable.class);
    when(obj1.compareTo(Mockito.<Object>any())).thenReturn(-1);

    // Act
    ArgChecker.inOrderNotEqual(obj1, "Obj2", "Name1", "Name2");

    // Assert
    verify(obj1).compareTo(isA(Object.class));
  }

  /**
   * Test {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Comparable} {@link Comparable#compareTo(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderNotEqual(Comparable, Object, String, String); given one; when Comparable compareTo(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderNotEqual(Comparable, Object, String, String)"})
  void testInOrderNotEqual_givenOne_whenComparableCompareToReturnOne() {
    // Arrange
    Comparable<Object> obj1 = mock(Comparable.class);
    when(obj1.compareTo(Mockito.<Object>any())).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inOrderNotEqual(obj1, "Obj2", "Name1", "Name2"));
    verify(obj1).compareTo(isA(Object.class));
  }

  /**
   * Test {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>When {@link Comparable}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderNotEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderNotEqual(Comparable, Object, String, String); when Comparable; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderNotEqual(Comparable, Object, String, String)"})
  void testInOrderNotEqual_whenComparable_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inOrderNotEqual(mock(Comparable.class), null, "Name1", "Name2"));
  }

  /**
   * Test {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderOrEqual(Comparable, Object, String, String); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderOrEqual(Comparable, Object, String, String)"})
  void testInOrderOrEqual_givenIllegalArgumentException() {
    // Arrange
    Comparable<Object> obj1 = mock(Comparable.class);
    when(obj1.compareTo(Mockito.<Object>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inOrderOrEqual(obj1, "Obj2", "Name1", "Name2"));
    verify(obj1).compareTo(isA(Object.class));
  }

  /**
   * Test {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link Comparable} {@link Comparable#compareTo(Object)} return one.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderOrEqual(Comparable, Object, String, String); given one; when Comparable compareTo(Object) return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderOrEqual(Comparable, Object, String, String)"})
  void testInOrderOrEqual_givenOne_whenComparableCompareToReturnOne() {
    // Arrange
    Comparable<Object> obj1 = mock(Comparable.class);
    when(obj1.compareTo(Mockito.<Object>any())).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inOrderOrEqual(obj1, "Obj2", "Name1", "Name2"));
    verify(obj1).compareTo(isA(Object.class));
  }

  /**
   * Test {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link Comparable} {@link Comparable#compareTo(Object)} return zero.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderOrEqual(Comparable, Object, String, String); given zero; when Comparable compareTo(Object) return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderOrEqual(Comparable, Object, String, String)"})
  void testInOrderOrEqual_givenZero_whenComparableCompareToReturnZero() {
    // Arrange
    Comparable<Object> obj1 = mock(Comparable.class);
    when(obj1.compareTo(Mockito.<Object>any())).thenReturn(0);

    // Act
    ArgChecker.inOrderOrEqual(obj1, "Obj2", "Name1", "Name2");

    // Assert
    verify(obj1).compareTo(isA(Object.class));
  }

  /**
   * Test {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}.
   *
   * <ul>
   *   <li>When {@link Comparable}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ArgChecker#inOrderOrEqual(Comparable, Object, String, String)}
   */
  @Test
  @DisplayName(
      "Test inOrderOrEqual(Comparable, Object, String, String); when Comparable; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ArgChecker.inOrderOrEqual(Comparable, Object, String, String)"})
  void testInOrderOrEqual_whenComparable_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ArgChecker.inOrderOrEqual(mock(Comparable.class), null, "Name1", "Name2"));
  }
}
