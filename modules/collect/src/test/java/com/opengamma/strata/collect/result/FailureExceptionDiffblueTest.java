package com.opengamma.strata.collect.result;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FailureExceptionDiffblueTest {
  /**
   * Test {@link FailureException#FailureException(Failure)}.
   *
   * <p>Method under test: {@link FailureException#FailureException(Failure)}
   */
  @Test
  @DisplayName("Test new FailureException(Failure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FailureException.<init>(Failure)"})
  void testNewFailureException() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);

    // Act
    FailureException actualFailureException = new FailureException(failure);

    // Assert
    assertEquals("Message Template - [Message Args]", actualFailureException.getLocalizedMessage());
    assertEquals("Message Template - [Message Args]", actualFailureException.getMessage());
    assertNull(actualFailureException.getCause());
    assertEquals(0, actualFailureException.getSuppressed().length);
    assertSame(failure, actualFailureException.getFailure());
  }

  /**
   * Test {@link FailureException#getFailure()}.
   *
   * <p>Method under test: {@link FailureException#getFailure()}
   */
  @Test
  @DisplayName("Test getFailure()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Failure FailureException.getFailure()"})
  void testGetFailure() {
    // Arrange
    FailureItem item =
        FailureItem.of(FailureReason.MULTIPLE, new Throwable(), "Message Template", "Message Args");
    Failure failure = Failure.of(item);

    // Act and Assert
    assertSame(failure, new FailureException(failure).getFailure());
  }
}
