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

class IllegalArgFailureExceptionDiffblueTest {
  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(FailureItem)}.
   *
   * <p>Method under test: {@link
   * IllegalArgFailureException#IllegalArgFailureException(FailureItem)}
   */
  @Test
  @DisplayName("Test new IllegalArgFailureException(FailureItem)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(FailureItem)"})
  void testNewIllegalArgFailureException() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(item);

    // Assert
    assertEquals(
        "Message Template - [Message Args]",
        actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals(
        "Message Template - [Message Args]", actualIllegalArgFailureException.getMessage());
    assertNull(actualIllegalArgFailureException.getCause());
    assertEquals(0, actualIllegalArgFailureException.getSuppressed().length);
    assertSame(item, actualIllegalArgFailureException.getFailureItem());
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName("Test new IllegalArgFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException2() {
    // Arrange and Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(new Throwable(), "An error occurred", "Message Args");

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    assertEquals("An error occurred - [Message Args]", failureItem.getMessage());
    assertEquals("An error occurred - [Message Args]", failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [Message Args]",
        actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [Message Args]", actualIllegalArgFailureException.getMessage());
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName("Test new IllegalArgFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException3() {
    // Arrange and Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(
            new Throwable(), "An error occurred", "Message Args", "Message Args");

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    assertEquals("An error occurred - [Message Args, Message Args]", failureItem.getMessage());
    assertEquals(
        "An error occurred - [Message Args, Message Args]", failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [Message Args, Message Args]",
        actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [Message Args, Message Args]",
        actualIllegalArgFailureException.getMessage());
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName("Test new IllegalArgFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException4() {
    // Arrange and Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(new Throwable(), "{U}", "Message Args", "Message Args");

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    assertEquals("Message Args - [Message Args]", failureItem.getMessage());
    assertEquals(
        "Message Args - [Message Args]", actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals("Message Args - [Message Args]", actualIllegalArgFailureException.getMessage());
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey("U"));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName("Test new IllegalArgFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException5() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(cause, "An error occurred", ofResult);

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        failureItem.getMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        actualIllegalArgFailureException.getMessage());
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName("Test new IllegalArgFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException6() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            128, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(cause, "An error occurred", ofAutoStackTraceResult);

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        failureItem.getMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        actualIllegalArgFailureException.getMessage());
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName("Test new IllegalArgFailureException(Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException7() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(cause, "{U}", ofResult);

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("MULTIPLE: Message Args: java.lang.Throwable", attributes.get("U"));
    assertEquals("MULTIPLE: Message Args: java.lang.Throwable", failureItem.getMessage());
    assertEquals(
        "MULTIPLE: Message Args: java.lang.Throwable",
        actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals(
        "MULTIPLE: Message Args: java.lang.Throwable",
        actualIllegalArgFailureException.getMessage());
    assertEquals("U:0:43", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <ul>
   *   <li>Then return FailureItem Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new IllegalArgFailureException(Throwable, String, Object[]); then return FailureItem Message is 'An error occurred'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException_thenReturnFailureItemMessageIsAnErrorOccurred() {
    // Arrange and Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(new Throwable(), "An error occurred");

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    assertEquals("An error occurred", failureItem.getMessage());
    assertEquals("An error occurred", failureItem.getMessageTemplate());
    assertEquals("An error occurred", actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals("An error occurred", actualIllegalArgFailureException.getMessage());
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <ul>
   *   <li>Then return FailureItem Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new IllegalArgFailureException(Throwable, String, Object[]); then return FailureItem Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException_thenReturnFailureItemMessageIsMessageArgs() {
    // Arrange and Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(new Throwable(), "{U}", "Message Args");

    // Assert
    FailureItem failureItem = actualIllegalArgFailureException.getFailureItem();
    assertEquals("Message Args", failureItem.getMessage());
    assertEquals("Message Args", actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals("Message Args", actualIllegalArgFailureException.getMessage());
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey("U"));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link IllegalArgFailureException#IllegalArgFailureException(Throwable, String,
   * Object[])}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return FailureItem Message is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link IllegalArgFailureException#IllegalArgFailureException(Throwable,
   * String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new IllegalArgFailureException(Throwable, String, Object[]); when '{U}'; then return FailureItem Message is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IllegalArgFailureException.<init>(Throwable, String, Object[])"})
  void testNewIllegalArgFailureException_whenU_thenReturnFailureItemMessageIsU() {
    // Arrange and Act
    IllegalArgFailureException actualIllegalArgFailureException =
        new IllegalArgFailureException(new Throwable(), "{U}");

    // Assert
    assertEquals("{U}", actualIllegalArgFailureException.getFailureItem().getMessage());
    assertEquals("{U}", actualIllegalArgFailureException.getLocalizedMessage());
    assertEquals("{U}", actualIllegalArgFailureException.getMessage());
  }

  /**
   * Test {@link IllegalArgFailureException#getFailureItem()}.
   *
   * <p>Method under test: {@link IllegalArgFailureException#getFailureItem()}
   */
  @Test
  @DisplayName("Test getFailureItem()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem IllegalArgFailureException.getFailureItem()"})
  void testGetFailureItem() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertSame(item, new IllegalArgFailureException(item).getFailureItem());
  }
}
