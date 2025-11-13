package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UncheckedReflectiveOperationExceptionDiffblueTest {
  /**
   * Test {@link
   * UncheckedReflectiveOperationException#UncheckedReflectiveOperationException(ReflectiveOperationException)}.
   *
   * <p>Method under test: {@link
   * UncheckedReflectiveOperationException#UncheckedReflectiveOperationException(ReflectiveOperationException)}
   */
  @Test
  @DisplayName("Test new UncheckedReflectiveOperationException(ReflectiveOperationException)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void UncheckedReflectiveOperationException.<init>(ReflectiveOperationException)"
  })
  void testNewUncheckedReflectiveOperationException() {
    // Arrange
    ReflectiveOperationException ex = new ReflectiveOperationException();

    // Act
    UncheckedReflectiveOperationException actualUncheckedReflectiveOperationException =
        new UncheckedReflectiveOperationException(ex);

    // Assert
    assertEquals(
        "java.lang.ReflectiveOperationException",
        actualUncheckedReflectiveOperationException.getMessage());
    assertEquals(0, actualUncheckedReflectiveOperationException.getSuppressed().length);
    assertSame(ex, actualUncheckedReflectiveOperationException.getCause());
  }
}
