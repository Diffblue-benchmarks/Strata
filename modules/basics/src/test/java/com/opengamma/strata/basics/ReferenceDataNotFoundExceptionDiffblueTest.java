package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReferenceDataNotFoundExceptionDiffblueTest {
  /**
   * Test {@link ReferenceDataNotFoundException#ReferenceDataNotFoundException(String)}.
   *
   * <p>Method under test: {@link
   * ReferenceDataNotFoundException#ReferenceDataNotFoundException(String)}
   */
  @Test
  @DisplayName("Test new ReferenceDataNotFoundException(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ReferenceDataNotFoundException.<init>(String)"})
  void testNewReferenceDataNotFoundException() {
    // Arrange and Act
    ReferenceDataNotFoundException actualReferenceDataNotFoundException =
        new ReferenceDataNotFoundException("An error occurred");

    // Assert
    assertEquals("An error occurred", actualReferenceDataNotFoundException.getMessage());
    assertNull(actualReferenceDataNotFoundException.getCause());
    assertEquals(0, actualReferenceDataNotFoundException.getSuppressed().length);
  }
}
