package com.opengamma.strata.report.cashflow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.Measure;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CashFlowReportRunnerDiffblueTest {
  /**
   * Test {@link CashFlowReportRunner#requirements(CashFlowReportTemplate)} with {@code
   * CashFlowReportTemplate}.
   *
   * <p>Method under test: {@link CashFlowReportRunner#requirements(CashFlowReportTemplate)}
   */
  @Test
  @DisplayName("Test requirements(CashFlowReportTemplate) with 'CashFlowReportTemplate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.report.ReportRequirements CashFlowReportRunner.requirements(CashFlowReportTemplate)"
  })
  void testRequirementsWithCashFlowReportTemplate() {
    // Arrange, Act and Assert
    ImmutableList<Column> tradeMeasureRequirements =
        CashFlowReportRunner.INSTANCE
            .requirements(new CashFlowReportTemplate())
            .getTradeMeasureRequirements();
    assertEquals(1, tradeMeasureRequirements.size());
    Column getResult = tradeMeasureRequirements.get(0);
    Measure measure = getResult.getMeasure();
    assertTrue(measure instanceof ImmutableMeasure);
    assertEquals("ExplainPresentValue", measure.getName());
    ColumnName name = getResult.getName();
    assertEquals("ExplainPresentValue", name.getName());
    assertEquals("ExplainPresentValue", name.toString());
    assertFalse(measure.isCurrencyConvertible());
    assertFalse(getResult.getReportingCurrency().isPresent());
    assertTrue(getResult.getParameters().getParameters().isEmpty());
  }
}
