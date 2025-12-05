package com.opengamma.strata.report.trade;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.report.trade.TradeReportTemplate.Builder;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeReportRunnerDiffblueTest {
  /**
   * Test {@link TradeReportRunner#requirements(TradeReportTemplate)} with {@code
   * TradeReportTemplate}.
   *
   * <p>Method under test: {@link TradeReportRunner#requirements(TradeReportTemplate)}
   */
  @Test
  @DisplayName("Test requirements(TradeReportTemplate) with 'TradeReportTemplate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.report.ReportRequirements TradeReportRunner.requirements(TradeReportTemplate)"
  })
  void testRequirementsWithTradeReportTemplate() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    // Act and Assert
    assertTrue(
        TradeReportRunner.INSTANCE
            .requirements(TradeReportTemplate.builder().columns(columns).build())
            .getTradeMeasureRequirements()
            .isEmpty());
  }

  /**
   * Test {@link TradeReportRunner#requirements(TradeReportTemplate)} with {@code
   * TradeReportTemplate}.
   *
   * <p>Method under test: {@link TradeReportRunner#requirements(TradeReportTemplate)}
   */
  @Test
  @DisplayName("Test requirements(TradeReportTemplate) with 'TradeReportTemplate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.report.ReportRequirements TradeReportRunner.requirements(TradeReportTemplate)"
  })
  void testRequirementsWithTradeReportTemplate2() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder()
            .header("Header")
            .ignoreFailures(true)
            .value("Invalid root: {}. Value path must start with one of: {}")
            .build());

    // Act and Assert
    assertTrue(
        TradeReportRunner.INSTANCE
            .requirements(TradeReportTemplate.builder().columns(columns).build())
            .getTradeMeasureRequirements()
            .isEmpty());
  }

  /**
   * Test {@link TradeReportRunner#requirements(TradeReportTemplate)} with {@code
   * TradeReportTemplate}.
   *
   * <ul>
   *   <li>Then return TradeMeasureRequirements Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportRunner#requirements(TradeReportTemplate)}
   */
  @Test
  @DisplayName(
      "Test requirements(TradeReportTemplate) with 'TradeReportTemplate'; then return TradeMeasureRequirements Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.report.ReportRequirements TradeReportRunner.requirements(TradeReportTemplate)"
  })
  void testRequirementsWithTradeReportTemplate_thenReturnTradeMeasureRequirementsEmpty() {
    // Arrange
    Builder builderResult = TradeReportTemplate.builder();

    // Act and Assert
    assertTrue(
        TradeReportRunner.INSTANCE
            .requirements(builderResult.columns(new ArrayList<>()).build())
            .getTradeMeasureRequirements()
            .isEmpty());
  }
}
