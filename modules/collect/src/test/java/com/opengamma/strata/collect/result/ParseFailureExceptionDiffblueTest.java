package com.opengamma.strata.collect.result;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ParseFailureExceptionDiffblueTest {
  /**
   * Test {@link ParseFailureException#ParseFailureException(FailureItem)}.
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(FailureItem)}
   */
  @Test
  @DisplayName("Test new ParseFailureException(FailureItem)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(FailureItem)"})
  void testNewParseFailureException() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    ParseFailureException actualParseFailureException = new ParseFailureException(item);

    // Assert
    assertEquals(
        "Message Template - [Message Args]", actualParseFailureException.getLocalizedMessage());
    assertEquals("Message Template - [Message Args]", actualParseFailureException.getMessage());
    assertNull(actualParseFailureException.getCause());
    assertEquals(0, actualParseFailureException.getSuppressed().length);
    assertSame(item, actualParseFailureException.getFailureItem());
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName("Test new ParseFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException2() {
    // Arrange and Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(new Throwable(), "An error occurred", "Message Args");

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    assertEquals("An error occurred - [Message Args]", failureItem.getMessage());
    assertEquals("An error occurred - [Message Args]", failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [Message Args]", actualParseFailureException.getLocalizedMessage());
    assertEquals("An error occurred - [Message Args]", actualParseFailureException.getMessage());
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName("Test new ParseFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException3() {
    // Arrange and Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(
            new Throwable(), "An error occurred", "Message Args", "Message Args");

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    assertEquals("An error occurred - [Message Args, Message Args]", failureItem.getMessage());
    assertEquals(
        "An error occurred - [Message Args, Message Args]", failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [Message Args, Message Args]",
        actualParseFailureException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [Message Args, Message Args]",
        actualParseFailureException.getMessage());
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName("Test new ParseFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException4() {
    // Arrange and Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(new Throwable(), "{U}", "Message Args", "Message Args");

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    assertEquals("Message Args - [Message Args]", failureItem.getMessage());
    assertEquals(
        "Message Args - [Message Args]", actualParseFailureException.getLocalizedMessage());
    assertEquals("Message Args - [Message Args]", actualParseFailureException.getMessage());
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey("U"));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName("Test new ParseFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException5() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(cause, "An error occurred", ofResult);

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        failureItem.getMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        actualParseFailureException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        actualParseFailureException.getMessage());
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName("Test new ParseFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException6() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            128, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(cause, "An error occurred", ofAutoStackTraceResult);

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        failureItem.getMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        actualParseFailureException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        actualParseFailureException.getMessage());
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName("Test new ParseFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException7() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(cause, "{U}", ofResult);

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("MULTIPLE: Message Args: java.lang.Throwable", attributes.get("U"));
    assertEquals("MULTIPLE: Message Args: java.lang.Throwable", failureItem.getMessage());
    assertEquals(
        "MULTIPLE: Message Args: java.lang.Throwable",
        actualParseFailureException.getLocalizedMessage());
    assertEquals(
        "MULTIPLE: Message Args: java.lang.Throwable", actualParseFailureException.getMessage());
    assertEquals("U:0:43", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <ul>
   *   <li>Then return FailureItem Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName(
      "Test new ParseFailureException(Throwable, String, Object[]); then return FailureItem Message is 'An error occurred'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException_thenReturnFailureItemMessageIsAnErrorOccurred() {
    // Arrange and Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(new Throwable(), "An error occurred");

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    assertEquals("An error occurred", failureItem.getMessage());
    assertEquals("An error occurred", failureItem.getMessageTemplate());
    assertEquals("An error occurred", actualParseFailureException.getLocalizedMessage());
    assertEquals("An error occurred", actualParseFailureException.getMessage());
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return FailureItem Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName(
      "Test new ParseFailureException(Throwable, String, Object[]); when '{U}'; then return FailureItem Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException_whenU_thenReturnFailureItemMessageIsMessageArgs() {
    // Arrange and Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(new Throwable(), "{U}", "Message Args");

    // Assert
    FailureItem failureItem = actualParseFailureException.getFailureItem();
    assertEquals("Message Args", failureItem.getMessage());
    assertEquals("Message Args", actualParseFailureException.getLocalizedMessage());
    assertEquals("Message Args", actualParseFailureException.getMessage());
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey("U"));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link ParseFailureException#ParseFailureException(Throwable, String, Object[])}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return FailureItem Message is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link ParseFailureException#ParseFailureException(Throwable, String,
   * Object[])}
   */
  @Test
  @DisplayName(
      "Test new ParseFailureException(Throwable, String, Object[]); when '{U}'; then return FailureItem Message is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParseFailureException.<init>(Throwable, String, Object[])"})
  void testNewParseFailureException_whenU_thenReturnFailureItemMessageIsU() {
    // Arrange and Act
    ParseFailureException actualParseFailureException =
        new ParseFailureException(new Throwable(), "{U}");

    // Assert
    assertEquals("{U}", actualParseFailureException.getFailureItem().getMessage());
    assertEquals("{U}", actualParseFailureException.getLocalizedMessage());
    assertEquals("{U}", actualParseFailureException.getMessage());
  }

  /**
   * Test {@link ParseFailureException#getFailureItem()}.
   *
   * <p>Method under test: {@link ParseFailureException#getFailureItem()}
   */
  @Test
  @DisplayName("Test getFailureItem()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem ParseFailureException.getFailureItem()"})
  void testGetFailureItem() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertSame(item, new ParseFailureException(item).getFailureItem());
  }
}
