package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.product.etd.EtdOptionType;
import com.opengamma.strata.product.etd.EtdSettlementType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CsvLoaderUtilsDiffblueTest {
  /**
   * Test {@link CsvLoaderUtils#parseEtdSettlementType(String)}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then return {@code ALTERNATE}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdSettlementType(String)}
   */
  @Test
  @DisplayName("Test parseEtdSettlementType(String); when 'A'; then return 'ALTERNATE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType CsvLoaderUtils.parseEtdSettlementType(String)"})
  void testParseEtdSettlementType_whenA_thenReturnAlternate() {
    // Arrange, Act and Assert
    assertEquals(EtdSettlementType.ALTERNATE, CsvLoaderUtils.parseEtdSettlementType("A"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdSettlementType(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdSettlementType(String)}
   */
  @Test
  @DisplayName("Test parseEtdSettlementType(String); when 'name'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType CsvLoaderUtils.parseEtdSettlementType(String)"})
  void testParseEtdSettlementType_whenName_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> CsvLoaderUtils.parseEtdSettlementType("name"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdSettlementType(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdSettlementType(String)}
   */
  @Test
  @DisplayName("Test parseEtdSettlementType(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdSettlementType CsvLoaderUtils.parseEtdSettlementType(String)"})
  void testParseEtdSettlementType_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> CsvLoaderUtils.parseEtdSettlementType("Str"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdOptionType(String)}.
   *
   * <ul>
   *   <li>When {@code A}.
   *   <li>Then return {@code AMERICAN}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdOptionType(String)}
   */
  @Test
  @DisplayName("Test parseEtdOptionType(String); when 'A'; then return 'AMERICAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType CsvLoaderUtils.parseEtdOptionType(String)"})
  void testParseEtdOptionType_whenA_thenReturnAmerican() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.AMERICAN, CsvLoaderUtils.parseEtdOptionType("A"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdOptionType(String)}.
   *
   * <ul>
   *   <li>When {@code AMERICAN}.
   *   <li>Then return {@code AMERICAN}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdOptionType(String)}
   */
  @Test
  @DisplayName("Test parseEtdOptionType(String); when 'AMERICAN'; then return 'AMERICAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType CsvLoaderUtils.parseEtdOptionType(String)"})
  void testParseEtdOptionType_whenAmerican_thenReturnAmerican() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.AMERICAN, CsvLoaderUtils.parseEtdOptionType("AMERICAN"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdOptionType(String)}.
   *
   * <ul>
   *   <li>When {@code ASIAN}.
   *   <li>Then return {@code ASIAN}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdOptionType(String)}
   */
  @Test
  @DisplayName("Test parseEtdOptionType(String); when 'ASIAN'; then return 'ASIAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType CsvLoaderUtils.parseEtdOptionType(String)"})
  void testParseEtdOptionType_whenAsian_thenReturnAsian() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.ASIAN, CsvLoaderUtils.parseEtdOptionType("ASIAN"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdOptionType(String)}.
   *
   * <ul>
   *   <li>When {@code E}.
   *   <li>Then return {@code EUROPEAN}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdOptionType(String)}
   */
  @Test
  @DisplayName("Test parseEtdOptionType(String); when 'E'; then return 'EUROPEAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType CsvLoaderUtils.parseEtdOptionType(String)"})
  void testParseEtdOptionType_whenE_thenReturnEuropean() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.EUROPEAN, CsvLoaderUtils.parseEtdOptionType("E"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdOptionType(String)}.
   *
   * <ul>
   *   <li>When {@code EUROPEAN}.
   *   <li>Then return {@code EUROPEAN}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdOptionType(String)}
   */
  @Test
  @DisplayName("Test parseEtdOptionType(String); when 'EUROPEAN'; then return 'EUROPEAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType CsvLoaderUtils.parseEtdOptionType(String)"})
  void testParseEtdOptionType_whenEuropean_thenReturnEuropean() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.EUROPEAN, CsvLoaderUtils.parseEtdOptionType("EUROPEAN"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdOptionType(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdOptionType(String)}
   */
  @Test
  @DisplayName("Test parseEtdOptionType(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType CsvLoaderUtils.parseEtdOptionType(String)"})
  void testParseEtdOptionType_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> CsvLoaderUtils.parseEtdOptionType("Str"));
  }

  /**
   * Test {@link CsvLoaderUtils#parseEtdOptionType(String)}.
   *
   * <ul>
   *   <li>When {@code T}.
   *   <li>Then return {@code ASIAN}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#parseEtdOptionType(String)}
   */
  @Test
  @DisplayName("Test parseEtdOptionType(String); when 'T'; then return 'ASIAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdOptionType CsvLoaderUtils.parseEtdOptionType(String)"})
  void testParseEtdOptionType_whenT_thenReturnAsian() {
    // Arrange, Act and Assert
    assertEquals(EtdOptionType.ASIAN, CsvLoaderUtils.parseEtdOptionType("T"));
  }

  /**
   * Test {@link CsvLoaderUtils#formattedPercentage(double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 50}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#formattedPercentage(double)}
   */
  @Test
  @DisplayName("Test formattedPercentage(double); when '0.5'; then return '50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CsvLoaderUtils.formattedPercentage(double)"})
  void testFormattedPercentage_when05_thenReturn50() {
    // Arrange, Act and Assert
    assertEquals("50", CsvLoaderUtils.formattedPercentage(0.5d));
  }

  /**
   * Test {@link CsvLoaderUtils#formattedPercentage(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -50}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#formattedPercentage(double)}
   */
  @Test
  @DisplayName("Test formattedPercentage(double); when '-0.5'; then return '-50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CsvLoaderUtils.formattedPercentage(double)"})
  void testFormattedPercentage_when05_thenReturn502() {
    // Arrange, Act and Assert
    assertEquals("-50", CsvLoaderUtils.formattedPercentage(-0.5d));
  }

  /**
   * Test {@link CsvLoaderUtils#formattedPercentage(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 1000}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#formattedPercentage(double)}
   */
  @Test
  @DisplayName("Test formattedPercentage(double); when ten; then return '1000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CsvLoaderUtils.formattedPercentage(double)"})
  void testFormattedPercentage_whenTen_thenReturn1000() {
    // Arrange, Act and Assert
    assertEquals("1000", CsvLoaderUtils.formattedPercentage(10.0d));
  }

  /**
   * Test {@link CsvLoaderUtils#formattedDouble(double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#formattedDouble(double)}
   */
  @Test
  @DisplayName("Test formattedDouble(double); when '0.5'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CsvLoaderUtils.formattedDouble(double)"})
  void testFormattedDouble_when05_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals("0.5", CsvLoaderUtils.formattedDouble(0.5d));
  }

  /**
   * Test {@link CsvLoaderUtils#formattedDouble(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#formattedDouble(double)}
   */
  @Test
  @DisplayName("Test formattedDouble(double); when '-0.5'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CsvLoaderUtils.formattedDouble(double)"})
  void testFormattedDouble_when05_thenReturn052() {
    // Arrange, Act and Assert
    assertEquals("-0.5", CsvLoaderUtils.formattedDouble(-0.5d));
  }

  /**
   * Test {@link CsvLoaderUtils#formattedDouble(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 10}.
   * </ul>
   *
   * <p>Method under test: {@link CsvLoaderUtils#formattedDouble(double)}
   */
  @Test
  @DisplayName("Test formattedDouble(double); when ten; then return '10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CsvLoaderUtils.formattedDouble(double)"})
  void testFormattedDouble_whenTen_thenReturn10() {
    // Arrange, Act and Assert
    assertEquals("10", CsvLoaderUtils.formattedDouble(10.0d));
  }
}
