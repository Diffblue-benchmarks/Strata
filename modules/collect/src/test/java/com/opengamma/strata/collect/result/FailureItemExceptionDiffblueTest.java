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

class FailureItemExceptionDiffblueTest {
  /**
   * Test {@link FailureItemException#FailureItemException(FailureItem)}.
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureItem)}
   */
  @Test
  @DisplayName("Test new FailureItemException(FailureItem)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FailureItemException.<init>(FailureItem)"})
  void testNewFailureItemException() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act
    FailureItemException actualFailureItemException = new FailureItemException(item);

    // Assert
    assertEquals(
        "Message Template - [Message Args]", actualFailureItemException.getLocalizedMessage());
    assertEquals("Message Template - [Message Args]", actualFailureItemException.getMessage());
    assertNull(actualFailureItemException.getCause());
    assertEquals(0, actualFailureItemException.getSuppressed().length);
    assertSame(item, actualFailureItemException.getFailureItem());
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName("Test new FailureItemException(FailureReason, Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException2() {
    // Arrange and Act
    FailureItemException actualFailureItemException =
        new FailureItemException(
            FailureReason.MULTIPLE, new Throwable(), "An error occurred", "Message Args");

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    assertEquals("An error occurred - [Message Args]", failureItem.getMessage());
    assertEquals("An error occurred - [Message Args]", failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [Message Args]", actualFailureItemException.getLocalizedMessage());
    assertEquals("An error occurred - [Message Args]", actualFailureItemException.getMessage());
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName("Test new FailureItemException(FailureReason, Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException3() {
    // Arrange and Act
    FailureItemException actualFailureItemException =
        new FailureItemException(
            FailureReason.MULTIPLE,
            new Throwable(),
            "An error occurred",
            "Message Args",
            "Message Args");

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    assertEquals("An error occurred - [Message Args, Message Args]", failureItem.getMessage());
    assertEquals(
        "An error occurred - [Message Args, Message Args]", failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [Message Args, Message Args]",
        actualFailureItemException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [Message Args, Message Args]",
        actualFailureItemException.getMessage());
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName("Test new FailureItemException(FailureReason, Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException4() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Act
    FailureItemException actualFailureItemException =
        new FailureItemException(FailureReason.MULTIPLE, cause, "An error occurred", ofResult);

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        failureItem.getMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        actualFailureItemException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Message Args: java.lang.Throwable]",
        actualFailureItemException.getMessage());
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName("Test new FailureItemException(FailureReason, Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException5() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofAutoStackTraceResult =
        FailureItem.ofAutoStackTrace(
            128, FailureReason.MULTIPLE, "Not all who wander are lost", "Message Args");

    // Act
    FailureItemException actualFailureItemException =
        new FailureItemException(
            FailureReason.MULTIPLE, cause, "An error occurred", ofAutoStackTraceResult);

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        failureItem.getMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        failureItem.getMessageTemplate());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        actualFailureItemException.getLocalizedMessage());
    assertEquals(
        "An error occurred - [MULTIPLE: Not all who wander are lost - [Message Args]]",
        actualFailureItemException.getMessage());
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName("Test new FailureItemException(FailureReason, Throwable, String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException6() {
    // Arrange
    Throwable cause = new Throwable();
    FailureItem ofResult =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Act
    FailureItemException actualFailureItemException =
        new FailureItemException(FailureReason.MULTIPLE, cause, "{U}", ofResult);

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("MULTIPLE: Message Args: java.lang.Throwable", attributes.get("U"));
    assertEquals("MULTIPLE: Message Args: java.lang.Throwable", failureItem.getMessage());
    assertEquals(
        "MULTIPLE: Message Args: java.lang.Throwable",
        actualFailureItemException.getLocalizedMessage());
    assertEquals(
        "MULTIPLE: Message Args: java.lang.Throwable", actualFailureItemException.getMessage());
    assertEquals("U:0:43", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <ul>
   *   <li>Then return FailureItem Message is {@code An error occurred}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new FailureItemException(FailureReason, Throwable, String, Object[]); then return FailureItem Message is 'An error occurred'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException_thenReturnFailureItemMessageIsAnErrorOccurred() {
    // Arrange and Act
    FailureItemException actualFailureItemException =
        new FailureItemException(FailureReason.MULTIPLE, new Throwable(), "An error occurred");

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    assertEquals("An error occurred", failureItem.getMessage());
    assertEquals("An error occurred", failureItem.getMessageTemplate());
    assertEquals("An error occurred", actualFailureItemException.getLocalizedMessage());
    assertEquals("An error occurred", actualFailureItemException.getMessage());
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <ul>
   *   <li>Then return FailureItem Message is {@code Message Args - [Message Args]}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new FailureItemException(FailureReason, Throwable, String, Object[]); then return FailureItem Message is 'Message Args - [Message Args]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException_thenReturnFailureItemMessageIsMessageArgsMessageArgs() {
    // Arrange and Act
    FailureItemException actualFailureItemException =
        new FailureItemException(
            FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args", "Message Args");

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    assertEquals("Message Args - [Message Args]", failureItem.getMessage());
    assertEquals("Message Args - [Message Args]", actualFailureItemException.getLocalizedMessage());
    assertEquals("Message Args - [Message Args]", actualFailureItemException.getMessage());
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("U:0:12|+:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey("U"));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return FailureItem Message is {@code Message Args}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new FailureItemException(FailureReason, Throwable, String, Object[]); when '{U}'; then return FailureItem Message is 'Message Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException_whenU_thenReturnFailureItemMessageIsMessageArgs() {
    // Arrange and Act
    FailureItemException actualFailureItemException =
        new FailureItemException(FailureReason.MULTIPLE, new Throwable(), "{U}", "Message Args");

    // Assert
    FailureItem failureItem = actualFailureItemException.getFailureItem();
    assertEquals("Message Args", failureItem.getMessage());
    assertEquals("Message Args", actualFailureItemException.getLocalizedMessage());
    assertEquals("Message Args", actualFailureItemException.getMessage());
    ImmutableMap<String, String> attributes = failureItem.getAttributes();
    assertEquals(3, attributes.size());
    assertEquals("U:0:12", attributes.get(FailureAttributeKeys.TEMPLATE_LOCATION));
    assertTrue(attributes.containsKey("U"));
    assertTrue(attributes.containsKey(FailureAttributeKeys.EXCEPTION_MESSAGE));
  }

  /**
   * Test {@link FailureItemException#FailureItemException(FailureReason, Throwable, String,
   * Object[])}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then return FailureItem Message is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link FailureItemException#FailureItemException(FailureReason,
   * Throwable, String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new FailureItemException(FailureReason, Throwable, String, Object[]); when '{U}'; then return FailureItem Message is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FailureItemException.<init>(FailureReason, Throwable, String, Object[])"
  })
  void testNewFailureItemException_whenU_thenReturnFailureItemMessageIsU() {
    // Arrange and Act
    FailureItemException actualFailureItemException =
        new FailureItemException(FailureReason.MULTIPLE, new Throwable(), "{U}");

    // Assert
    assertEquals("{U}", actualFailureItemException.getFailureItem().getMessage());
    assertEquals("{U}", actualFailureItemException.getLocalizedMessage());
    assertEquals("{U}", actualFailureItemException.getMessage());
  }

  /**
   * Test {@link FailureItemException#getFailureItem()}.
   *
   * <p>Method under test: {@link FailureItemException#getFailureItem()}
   */
  @Test
  @DisplayName("Test getFailureItem()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureItem FailureItemException.getFailureItem()"})
  void testGetFailureItem() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");

    // Act and Assert
    assertSame(item, new FailureItemException(item).getFailureItem());
  }
}
