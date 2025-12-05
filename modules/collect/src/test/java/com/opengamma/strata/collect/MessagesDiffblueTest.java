package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.tuple.Pair;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MessagesDiffblueTest {
  /**
   * Test {@link Messages#format(String, Object)} with {@code messageTemplate}, {@code arg}.
   *
   * <ul>
   *   <li>Then return {@code Arg}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object)}
   */
  @Test
  @DisplayName("Test format(String, Object) with 'messageTemplate', 'arg'; then return 'Arg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object)"})
  void testFormatWithMessageTemplateArg_thenReturnArg() {
    // Arrange, Act and Assert
    assertEquals("Arg", Messages.format("{}", "Arg"));
  }

  /**
   * Test {@link Messages#format(String, Object)} with {@code messageTemplate}, {@code arg}.
   *
   * <ul>
   *   <li>Then return {@code Message Template - [Arg]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object)}
   */
  @Test
  @DisplayName(
      "Test format(String, Object) with 'messageTemplate', 'arg'; then return 'Message Template - [Arg]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object)"})
  void testFormatWithMessageTemplateArg_thenReturnMessageTemplateArg() {
    // Arrange, Act and Assert
    assertEquals("Message Template - [Arg]", Messages.format("Message Template", "Arg"));
  }

  /**
   * Test {@link Messages#format(String, Object)} with {@code messageTemplate}, {@code arg}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code - [Arg]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object)}
   */
  @Test
  @DisplayName(
      "Test format(String, Object) with 'messageTemplate', 'arg'; when 'null'; then return '- [Arg]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object)"})
  void testFormatWithMessageTemplateArg_whenNull_thenReturnArg() {
    // Arrange, Act and Assert
    assertEquals(" - [Arg]", Messages.format(null, "Arg"));
  }

  /**
   * Test {@link Messages#format(String, Object[])} with {@code messageTemplate}, {@code args}.
   *
   * <ul>
   *   <li>Then return {@code Args}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object[])}
   */
  @Test
  @DisplayName("Test format(String, Object[]) with 'messageTemplate', 'args'; then return 'Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object[])"})
  void testFormatWithMessageTemplateArgs_thenReturnArgs() {
    // Arrange, Act and Assert
    assertEquals("Args", Messages.format("{}", "Args"));
  }

  /**
   * Test {@link Messages#format(String, Object[])} with {@code messageTemplate}, {@code args}.
   *
   * <ul>
   *   <li>Then return {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object[])}
   */
  @Test
  @DisplayName("Test format(String, Object[]) with 'messageTemplate', 'args'; then return '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object[])"})
  void testFormatWithMessageTemplateArgs_thenReturnLeftCurlyBracketRightCurlyBracket() {
    // Arrange, Act and Assert
    assertEquals("{}", Messages.format("{}", (Object[]) null));
  }

  /**
   * Test {@link Messages#format(String, Object[])} with {@code messageTemplate}, {@code args}.
   *
   * <ul>
   *   <li>Then return {@code Message Template - [Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test format(String, Object[]) with 'messageTemplate', 'args'; then return 'Message Template - [Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object[])"})
  void testFormatWithMessageTemplateArgs_thenReturnMessageTemplateArgs() {
    // Arrange, Act and Assert
    assertEquals("Message Template - [Args]", Messages.format("Message Template", "Args"));
  }

  /**
   * Test {@link Messages#format(String, Object[])} with {@code messageTemplate}, {@code args}.
   *
   * <ul>
   *   <li>Then return {@code Message Template - [Args, Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test format(String, Object[]) with 'messageTemplate', 'args'; then return 'Message Template - [Args, Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object[])"})
  void testFormatWithMessageTemplateArgs_thenReturnMessageTemplateArgsArgs() {
    // Arrange and Act
    String actualFormatResult = Messages.format("Message Template", "Args", "Args");

    // Assert
    assertEquals("Message Template - [Args, Args]", actualFormatResult);
  }

  /**
   * Test {@link Messages#format(String, Object[])} with {@code messageTemplate}, {@code args}.
   *
   * <ul>
   *   <li>When {@code Message Template}.
   *   <li>Then return {@code Message Template}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test format(String, Object[]) with 'messageTemplate', 'args'; when 'Message Template'; then return 'Message Template'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object[])"})
  void testFormatWithMessageTemplateArgs_whenMessageTemplate_thenReturnMessageTemplate() {
    // Arrange, Act and Assert
    assertEquals("Message Template", Messages.format("Message Template", (Object[]) null));
  }

  /**
   * Test {@link Messages#format(String, Object[])} with {@code messageTemplate}, {@code args}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code - [Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#format(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test format(String, Object[]) with 'messageTemplate', 'args'; when 'null'; then return '- [Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.format(String, Object[])"})
  void testFormatWithMessageTemplateArgs_whenNull_thenReturnArgs() {
    // Arrange, Act and Assert
    assertEquals(" - [Args]", Messages.format(null, "Args"));
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>Then return First is {@code Message Template - [Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test formatWithAttributes(String, Object[]); then return First is 'Message Template - [Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_thenReturnFirstIsMessageTemplateArgs() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes("Message Template", "Args");

    // Assert
    assertEquals("Message Template - [Args]", actualFormatWithAttributesResult.getFirst());
    assertEquals(2, actualFormatWithAttributesResult.size());
    assertTrue(actualFormatWithAttributesResult.getSecond().isEmpty());
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>Then return First is {@code Message Template - [Args, Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test formatWithAttributes(String, Object[]); then return First is 'Message Template - [Args, Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_thenReturnFirstIsMessageTemplateArgsArgs() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes("Message Template", "Args", "Args");

    // Assert
    assertEquals("Message Template - [Args, Args]", actualFormatWithAttributesResult.getFirst());
    assertEquals(2, actualFormatWithAttributesResult.size());
    assertTrue(actualFormatWithAttributesResult.getSecond().isEmpty());
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>When {@code Args} and {@code Args}.
   *   <li>Then return First is {@code Args - [Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test formatWithAttributes(String, Object[]); when 'Args' and 'Args'; then return First is 'Args - [Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_whenArgsAndArgs_thenReturnFirstIsArgsArgs() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes("{U}", "Args", "Args");

    // Assert
    assertEquals("Args - [Args]", actualFormatWithAttributesResult.getFirst());
    Map<String, String> second = actualFormatWithAttributesResult.getSecond();
    assertEquals(2, second.size());
    assertEquals("Args", second.get("U"));
    assertEquals("U:0:4|+:4", second.get("templateLocation"));
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName("Test formatWithAttributes(String, Object[]); when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_whenLeftCurlyBracketRightCurlyBracket() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes("{}", "Args");

    // Assert
    assertEquals("Args", actualFormatWithAttributesResult.getFirst());
    assertEquals(2, actualFormatWithAttributesResult.size());
    assertTrue(actualFormatWithAttributesResult.getSecond().isEmpty());
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>When {@code Message Template}.
   *   <li>Then return First is {@code Message Template}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test formatWithAttributes(String, Object[]); when 'Message Template'; then return First is 'Message Template'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_whenMessageTemplate_thenReturnFirstIsMessageTemplate() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes("Message Template", null);

    // Assert
    assertEquals("Message Template", actualFormatWithAttributesResult.getFirst());
    assertEquals(2, actualFormatWithAttributesResult.size());
    assertTrue(actualFormatWithAttributesResult.getSecond().isEmpty());
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return First is {@code - [Args]}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test formatWithAttributes(String, Object[]); when 'null'; then return First is '- [Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_whenNull_thenReturnFirstIsArgs() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes(null, "Args");

    // Assert
    assertEquals(" - [Args]", actualFormatWithAttributesResult.getFirst());
    assertEquals(2, actualFormatWithAttributesResult.size());
    assertTrue(actualFormatWithAttributesResult.getSecond().isEmpty());
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return First is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test formatWithAttributes(String, Object[]); when '{U}'; then return First is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_whenU_thenReturnFirstIsU() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes("{U}", null);

    // Assert
    assertEquals("{U}", actualFormatWithAttributesResult.getFirst());
    assertEquals(2, actualFormatWithAttributesResult.size());
    assertTrue(actualFormatWithAttributesResult.getSecond().isEmpty());
  }

  /**
   * Test {@link Messages#formatWithAttributes(String, Object[])}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return Second {@code templateLocation} is {@code U:0:4}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#formatWithAttributes(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test formatWithAttributes(String, Object[]); when '{U}'; then return Second 'templateLocation' is 'U:0:4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair Messages.formatWithAttributes(String, Object[])"})
  void testFormatWithAttributes_whenU_thenReturnSecondTemplateLocationIsU04() {
    // Arrange and Act
    Pair<String, Map<String, String>> actualFormatWithAttributesResult =
        Messages.formatWithAttributes("{U}", "Args");

    // Assert
    assertEquals("Args", actualFormatWithAttributesResult.getFirst());
    Map<String, String> second = actualFormatWithAttributesResult.getSecond();
    assertEquals(2, second.size());
    assertEquals("Args", second.get("U"));
    assertEquals("U:0:4", second.get("templateLocation"));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName(
      "Test recreateTemplate(String, String); when '42'; then return 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_when42_thenReturnNotAllWhoWanderAreLost() {
    // Arrange, Act and Assert
    assertEquals(
        "Not all who wander are lost",
        Messages.recreateTemplate("Not all who wander are lost", "42"));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When {@code :}.
   *   <li>Then return {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName(
      "Test recreateTemplate(String, String); when ':'; then return 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_whenColon_thenReturnNotAllWhoWanderAreLost() {
    // Arrange, Act and Assert
    assertEquals(
        "Not all who wander are lost",
        Messages.recreateTemplate("Not all who wander are lost", ":"));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName("Test recreateTemplate(String, String); when empty string; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", Messages.recreateTemplate("", ""));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName(
      "Test recreateTemplate(String, String); when empty string; then return 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_whenEmptyString_thenReturnNotAllWhoWanderAreLost() {
    // Arrange, Act and Assert
    assertEquals(
        "Not all who wander are lost",
        Messages.recreateTemplate("Not all who wander are lost", ""));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName("Test recreateTemplate(String, String); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Messages.recreateTemplate(null, ""));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When {@code +}.
   *   <li>Then return {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName(
      "Test recreateTemplate(String, String); when '+'; then return 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_whenPlusSign_thenReturnNotAllWhoWanderAreLost() {
    // Arrange, Act and Assert
    assertEquals(
        "Not all who wander are lost",
        Messages.recreateTemplate("Not all who wander are lost", "+"));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When {@code Template Location}.
   *   <li>Then return {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName(
      "Test recreateTemplate(String, String); when 'Template Location'; then return 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_whenTemplateLocation_thenReturnNotAllWhoWanderAreLost() {
    // Arrange, Act and Assert
    assertEquals(
        "Not all who wander are lost",
        Messages.recreateTemplate("Not all who wander are lost", "Template Location"));
  }

  /**
   * Test {@link Messages#recreateTemplate(String, String)}.
   *
   * <ul>
   *   <li>When {@code |+:}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#recreateTemplate(String, String)}
   */
  @Test
  @DisplayName("Test recreateTemplate(String, String); when '|+:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.recreateTemplate(String, String)"})
  void testRecreateTemplate_whenVerticalLinePlusSignColon() {
    // Arrange, Act and Assert
    assertEquals(
        "Not all who wander are lost",
        Messages.recreateTemplate("Not all who wander are lost", "|+:"));
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When {@code :}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when ':'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenColon_thenReturnEmptyString() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult =
        Messages.mergeTemplateLocations("Location1", ":", 3);

    // Assert
    assertEquals("", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return {@code +:}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when empty string; then return '+:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenEmptyString_thenReturnPlusSignColon() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult = Messages.mergeTemplateLocations("+:", "", 0);

    // Assert
    assertEquals("+:", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When {@code Location1}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when 'Location1'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenLocation1_thenReturnEmptyString() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult =
        Messages.mergeTemplateLocations("Location1", "+:", 3);

    // Assert
    assertEquals("", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When {@code Location2}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when 'Location2'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenLocation2_thenReturnEmptyString() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult =
        Messages.mergeTemplateLocations("Location1", "Location2", 3);

    // Assert
    assertEquals("", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When {@code Location2}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when 'Location2'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenLocation2_thenReturnEmptyString2() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult =
        Messages.mergeTemplateLocations("+:", "Location2", 3);

    // Assert
    assertEquals("", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when minus one; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenMinusOne_thenReturnEmptyString() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult = Messages.mergeTemplateLocations("+:", "", -1);

    // Assert
    assertEquals("", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code +:}.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName("Test mergeTemplateLocations(String, String, int); when 'null'; then return '+:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenNull_thenReturnPlusSignColon() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult = Messages.mergeTemplateLocations("+:", null, 0);

    // Assert
    assertEquals("+:", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When {@code |+:}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when '|+:'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenVerticalLinePlusSignColon_thenReturnEmptyString() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult =
        Messages.mergeTemplateLocations("|+:", "Location2", 3);

    // Assert
    assertEquals("", actualMergeTemplateLocationsResult);
  }

  /**
   * Test {@link Messages#mergeTemplateLocations(String, String, int)}.
   *
   * <ul>
   *   <li>When {@code |+:}.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Messages#mergeTemplateLocations(String, String, int)}
   */
  @Test
  @DisplayName(
      "Test mergeTemplateLocations(String, String, int); when '|+:'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Messages.mergeTemplateLocations(String, String, int)"})
  void testMergeTemplateLocations_whenVerticalLinePlusSignColon_thenReturnEmptyString2() {
    // Arrange and Act
    String actualMergeTemplateLocationsResult =
        Messages.mergeTemplateLocations("Location1", "|+:", 3);

    // Assert
    assertEquals("", actualMergeTemplateLocationsResult);
  }
}
