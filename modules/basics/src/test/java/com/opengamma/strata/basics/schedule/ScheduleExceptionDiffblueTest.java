package com.opengamma.strata.basics.schedule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ScheduleExceptionDiffblueTest {
  /**
   * Test {@link ScheduleException#ScheduleException(String, Object[])}.
   *
   * <p>Method under test: {@link ScheduleException#ScheduleException(String, Object[])}
   */
  @Test
  @DisplayName("Test new ScheduleException(String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ScheduleException.<init>(String, Object[])"})
  void testNewScheduleException() {
    // Arrange and Act
    ScheduleException actualScheduleException =
        new ScheduleException("Msg Template", "Msg Arguments", "Msg Arguments");

    // Assert
    assertEquals(
        "Msg Template - [Msg Arguments, Msg Arguments]",
        actualScheduleException.getLocalizedMessage());
    assertEquals(
        "Msg Template - [Msg Arguments, Msg Arguments]", actualScheduleException.getMessage());
    assertNull(actualScheduleException.getCause());
    assertEquals(0, actualScheduleException.getSuppressed().length);
    assertFalse(actualScheduleException.getDefinition().isPresent());
  }

  /**
   * Test {@link ScheduleException#ScheduleException(String, Object[])}.
   *
   * <p>Method under test: {@link ScheduleException#ScheduleException(String, Object[])}
   */
  @Test
  @DisplayName("Test new ScheduleException(String, Object[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ScheduleException.<init>(String, Object[])"})
  void testNewScheduleException2() {
    // Arrange and Act
    ScheduleException actualScheduleException = new ScheduleException("{}");

    // Assert
    assertEquals("{}", actualScheduleException.getLocalizedMessage());
    assertEquals("{}", actualScheduleException.getMessage());
    assertNull(actualScheduleException.getCause());
    assertEquals(0, actualScheduleException.getSuppressed().length);
    assertFalse(actualScheduleException.getDefinition().isPresent());
  }

  /**
   * Test {@link ScheduleException#ScheduleException(String, Object[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is {@code Msg Arguments}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleException#ScheduleException(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new ScheduleException(String, Object[]); then return LocalizedMessage is 'Msg Arguments'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ScheduleException.<init>(String, Object[])"})
  void testNewScheduleException_thenReturnLocalizedMessageIsMsgArguments() {
    // Arrange and Act
    ScheduleException actualScheduleException = new ScheduleException("{}", "Msg Arguments");

    // Assert
    assertEquals("Msg Arguments", actualScheduleException.getLocalizedMessage());
    assertEquals("Msg Arguments", actualScheduleException.getMessage());
    assertNull(actualScheduleException.getCause());
    assertEquals(0, actualScheduleException.getSuppressed().length);
    assertFalse(actualScheduleException.getDefinition().isPresent());
  }

  /**
   * Test {@link ScheduleException#ScheduleException(String, Object[])}.
   *
   * <ul>
   *   <li>Then return LocalizedMessage is {@code Msg Template - [Msg Arguments]}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleException#ScheduleException(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new ScheduleException(String, Object[]); then return LocalizedMessage is 'Msg Template - [Msg Arguments]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ScheduleException.<init>(String, Object[])"})
  void testNewScheduleException_thenReturnLocalizedMessageIsMsgTemplateMsgArguments() {
    // Arrange and Act
    ScheduleException actualScheduleException =
        new ScheduleException("Msg Template", "Msg Arguments");

    // Assert
    assertEquals("Msg Template - [Msg Arguments]", actualScheduleException.getLocalizedMessage());
    assertEquals("Msg Template - [Msg Arguments]", actualScheduleException.getMessage());
    assertNull(actualScheduleException.getCause());
    assertEquals(0, actualScheduleException.getSuppressed().length);
    assertFalse(actualScheduleException.getDefinition().isPresent());
  }

  /**
   * Test {@link ScheduleException#ScheduleException(String, Object[])}.
   *
   * <ul>
   *   <li>When {@code Msg Template}.
   *   <li>Then return LocalizedMessage is {@code Msg Template}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleException#ScheduleException(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test new ScheduleException(String, Object[]); when 'Msg Template'; then return LocalizedMessage is 'Msg Template'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ScheduleException.<init>(String, Object[])"})
  void testNewScheduleException_whenMsgTemplate_thenReturnLocalizedMessageIsMsgTemplate() {
    // Arrange and Act
    ScheduleException actualScheduleException = new ScheduleException("Msg Template");

    // Assert
    assertEquals("Msg Template", actualScheduleException.getLocalizedMessage());
    assertEquals("Msg Template", actualScheduleException.getMessage());
    assertNull(actualScheduleException.getCause());
    assertEquals(0, actualScheduleException.getSuppressed().length);
    assertFalse(actualScheduleException.getDefinition().isPresent());
  }

  /**
   * Test {@link ScheduleException#getDefinition()}.
   *
   * <p>Method under test: {@link ScheduleException#getDefinition()}
   */
  @Test
  @DisplayName("Test getDefinition()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional ScheduleException.getDefinition()"})
  void testGetDefinition() {
    // Arrange, Act and Assert
    assertFalse(new ScheduleException("Msg Template", "Msg Arguments").getDefinition().isPresent());
  }
}
