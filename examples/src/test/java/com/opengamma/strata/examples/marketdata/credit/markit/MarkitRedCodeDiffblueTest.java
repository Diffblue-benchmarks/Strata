package com.opengamma.strata.examples.marketdata.credit.markit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarkitRedCodeDiffblueTest {
  /**
   * Test {@link MarkitRedCode#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name42}.
   *   <li>Then return Name is {@code Name42}.
   * </ul>
   *
   * <p>Method under test: {@link MarkitRedCode#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name42'; then return Name is 'Name42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarkitRedCode MarkitRedCode.of(String)"})
  void testOf_whenName42_thenReturnNameIsName42() {
    // Arrange and Act
    MarkitRedCode actualOfResult = MarkitRedCode.of("Name42");

    // Assert
    assertEquals("Name42", actualOfResult.getName());
    assertEquals("Name42", actualOfResult.toString());
  }

  /**
   * Test {@link MarkitRedCode#id(String)}.
   *
   * <ul>
   *   <li>When {@code Name42}.
   *   <li>Then return Value is {@code Name42}.
   * </ul>
   *
   * <p>Method under test: {@link MarkitRedCode#id(String)}
   */
  @Test
  @DisplayName("Test id(String); when 'Name42'; then return Value is 'Name42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId MarkitRedCode.id(String)"})
  void testId_whenName42_thenReturnValueIsName42() {
    // Arrange and Act
    StandardId actualIdResult = MarkitRedCode.id("Name42");

    // Assert
    assertEquals("Name42", actualIdResult.getValue());
    assertEquals(MarkitRedCode.MARKIT_REDCODE_SCHEME, actualIdResult.getScheme());
  }

  /**
   * Test {@link MarkitRedCode#toStandardId()}.
   *
   * <ul>
   *   <li>Given {@link MarkitRedCode} with name is {@code Name42}.
   *   <li>Then return Value is {@code Name42}.
   * </ul>
   *
   * <p>Method under test: {@link MarkitRedCode#toStandardId()}
   */
  @Test
  @DisplayName(
      "Test toStandardId(); given MarkitRedCode with name is 'Name42'; then return Value is 'Name42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId MarkitRedCode.toStandardId()"})
  void testToStandardId_givenMarkitRedCodeWithNameIsName42_thenReturnValueIsName42() {
    // Arrange and Act
    StandardId actualToStandardIdResult = MarkitRedCode.of("Name42").toStandardId();

    // Assert
    assertEquals("Name42", actualToStandardIdResult.getValue());
    assertEquals(MarkitRedCode.MARKIT_REDCODE_SCHEME, actualToStandardIdResult.getScheme());
  }
}
