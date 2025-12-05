package com.opengamma.strata.report.trade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeReportTemplateIniLoaderDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link TradeReportTemplateIniLoader}
   *   <li>{@link TradeReportTemplateIniLoader#getReportType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeReportTemplateIniLoader.<init>()",
    "java.lang.String TradeReportTemplateIniLoader.getReportType()"
  })
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("trade", new TradeReportTemplateIniLoader().getReportType());
  }
}
