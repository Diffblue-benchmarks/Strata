package com.opengamma.strata.report.cashflow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CashFlowReportTemplateIniLoaderDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CashFlowReportTemplateIniLoader}
   *   <li>{@link CashFlowReportTemplateIniLoader#getReportType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CashFlowReportTemplateIniLoader.<init>()",
    "java.lang.String CashFlowReportTemplateIniLoader.getReportType()"
  })
  void testGettersAndSetters() {
    // Arrange, Act and Assert
    assertEquals("cashflow", new CashFlowReportTemplateIniLoader().getReportType());
  }
}
