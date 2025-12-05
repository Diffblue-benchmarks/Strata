package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsMarketQuoteConverterDiffblueTest {
  /**
   * Test {@link CdsMarketQuoteConverter#CdsMarketQuoteConverter()}.
   *
   * <p>Method under test: {@link CdsMarketQuoteConverter#CdsMarketQuoteConverter()}
   */
  @Test
  @DisplayName("Test new CdsMarketQuoteConverter()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CdsMarketQuoteConverter.<init>()"})
  void testNewCdsMarketQuoteConverter() {
    // Arrange, Act and Assert
    assertEquals(-9.0d, new CdsMarketQuoteConverter().cleanPriceFromPointsUpfront(10.0d));
  }

  /**
   * Test {@link CdsMarketQuoteConverter#CdsMarketQuoteConverter(AccrualOnDefaultFormula)}.
   *
   * <p>Method under test: {@link
   * CdsMarketQuoteConverter#CdsMarketQuoteConverter(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName("Test new CdsMarketQuoteConverter(AccrualOnDefaultFormula)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CdsMarketQuoteConverter.<init>(AccrualOnDefaultFormula)"})
  void testNewCdsMarketQuoteConverter2() {
    // Arrange, Act and Assert
    assertEquals(
        -9.0d,
        new CdsMarketQuoteConverter(AccrualOnDefaultFormula.ORIGINAL_ISDA)
            .cleanPriceFromPointsUpfront(10.0d));
  }

  /**
   * Test {@link CdsMarketQuoteConverter#cleanPriceFromPointsUpfront(double)}.
   *
   * <p>Method under test: {@link CdsMarketQuoteConverter#cleanPriceFromPointsUpfront(double)}
   */
  @Test
  @DisplayName("Test cleanPriceFromPointsUpfront(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CdsMarketQuoteConverter.cleanPriceFromPointsUpfront(double)"})
  void testCleanPriceFromPointsUpfront() {
    // Arrange, Act and Assert
    assertEquals(-9.0d, CdsMarketQuoteConverter.DEFAULT.cleanPriceFromPointsUpfront(10.0d));
  }
}
