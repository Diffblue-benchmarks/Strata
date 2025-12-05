package com.opengamma.strata.report.framework.format;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ToStringValueFormatterDiffblueTest {
  /**
   * Test {@link ToStringValueFormatter#formatForCsv(Object)}.
   *
   * <p>Method under test: {@link ToStringValueFormatter#formatForCsv(Object)}
   */
  @Test
  @DisplayName("Test formatForCsv(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String ToStringValueFormatter.formatForCsv(Object)"})
  void testFormatForCsv() {
    // Arrange, Act and Assert
    assertEquals("Object", ToStringValueFormatter.INSTANCE.formatForCsv("Object"));
  }

  /**
   * Test {@link ToStringValueFormatter#formatForDisplay(Object)}.
   *
   * <p>Method under test: {@link ToStringValueFormatter#formatForDisplay(Object)}
   */
  @Test
  @DisplayName("Test formatForDisplay(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String ToStringValueFormatter.formatForDisplay(Object)"})
  void testFormatForDisplay() {
    // Arrange, Act and Assert
    assertEquals("Object", ToStringValueFormatter.INSTANCE.formatForDisplay("Object"));
  }
}
