package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.product.PortfolioItemSummary;
import com.opengamma.strata.product.PortfolioItemType;
import com.opengamma.strata.product.Position;
import com.opengamma.strata.product.ProductType;
import com.opengamma.strata.product.Trade;
import com.opengamma.strata.product.option.Barrier;
import com.opengamma.strata.product.option.BarrierType;
import com.opengamma.strata.product.option.KnockType;
import com.opengamma.strata.product.option.SimpleConstantContinuousBarrier;
import java.time.LocalDate;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SummarizerUtilsDiffblueTest {
  /**
   * Test {@link SummarizerUtils#date(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@code 1Jan70}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#date(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test date(LocalDate); when LocalDate with '1970' and one and one; then return '1Jan70'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.date(LocalDate)"})
  void testDate_whenLocalDateWith1970AndOneAndOne_thenReturn1Jan70() {
    // Arrange, Act and Assert
    assertEquals("1Jan70", SummarizerUtils.date(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link SummarizerUtils#dateRange(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@code 1Jan70-1Jan70}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#dateRange(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test dateRange(LocalDate, LocalDate); when LocalDate with '1970' and one and one; then return '1Jan70-1Jan70'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.dateRange(LocalDate, LocalDate)"})
  void testDateRange_whenLocalDateWith1970AndOneAndOne_thenReturn1Jan701Jan70() {
    // Arrange, Act and Assert
    assertEquals(
        "1Jan70-1Jan70",
        SummarizerUtils.dateRange(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link SummarizerUtils#datePeriod(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay seven.
   *   <li>Then return {@code 1W}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#datePeriod(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test datePeriod(LocalDate, LocalDate); when ofEpochDay seven; then return '1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.datePeriod(LocalDate, LocalDate)"})
  void testDatePeriod_whenOfEpochDaySeven_thenReturn1w() {
    // Arrange, Act and Assert
    assertEquals(
        "1W", SummarizerUtils.datePeriod(LocalDate.of(1970, 1, 1), LocalDate.ofEpochDay(7L)));
  }

  /**
   * Test {@link SummarizerUtils#datePeriod(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay three.
   *   <li>Then return {@code 3D}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#datePeriod(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test datePeriod(LocalDate, LocalDate); when ofEpochDay three; then return '3D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.datePeriod(LocalDate, LocalDate)"})
  void testDatePeriod_whenOfEpochDayThree_thenReturn3d() {
    // Arrange, Act and Assert
    assertEquals(
        "3D", SummarizerUtils.datePeriod(LocalDate.of(1970, 1, 1), LocalDate.ofEpochDay(3L)));
  }

  /**
   * Test {@link SummarizerUtils#datePeriod(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay three and three.
   *   <li>Then return {@code 1967Y}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#datePeriod(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test datePeriod(LocalDate, LocalDate); when ofYearDay three and three; then return '1967Y'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.datePeriod(LocalDate, LocalDate)"})
  void testDatePeriod_whenOfYearDayThreeAndThree_thenReturn1967y() {
    // Arrange, Act and Assert
    assertEquals(
        "1967Y", SummarizerUtils.datePeriod(LocalDate.ofYearDay(3, 3), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link SummarizerUtils#value(double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#value(double)}
   */
  @Test
  @DisplayName("Test value(double); when '0.5'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.value(double)"})
  void testValue_when05_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals("0.5", SummarizerUtils.value(0.5d));
  }

  /**
   * Test {@link SummarizerUtils#value(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#value(double)}
   */
  @Test
  @DisplayName("Test value(double); when '-0.5'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.value(double)"})
  void testValue_when05_thenReturn052() {
    // Arrange, Act and Assert
    assertEquals("-0.5", SummarizerUtils.value(-0.5d));
  }

  /**
   * Test {@link SummarizerUtils#value(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 10}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#value(double)}
   */
  @Test
  @DisplayName("Test value(double); when ten; then return '10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.value(double)"})
  void testValue_whenTen_thenReturn10() {
    // Arrange, Act and Assert
    assertEquals("10", SummarizerUtils.value(10.0d));
  }

  /**
   * Test {@link SummarizerUtils#percent(double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 50%}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#percent(double)}
   */
  @Test
  @DisplayName("Test percent(double); when '0.5'; then return '50%'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.percent(double)"})
  void testPercent_when05_thenReturn50() {
    // Arrange, Act and Assert
    assertEquals("50%", SummarizerUtils.percent(0.5d));
  }

  /**
   * Test {@link SummarizerUtils#percent(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -50%}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#percent(double)}
   */
  @Test
  @DisplayName("Test percent(double); when '-0.5'; then return '-50%'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.percent(double)"})
  void testPercent_when05_thenReturn502() {
    // Arrange, Act and Assert
    assertEquals("-50%", SummarizerUtils.percent(-0.5d));
  }

  /**
   * Test {@link SummarizerUtils#percent(double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 100%}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#percent(double)}
   */
  @Test
  @DisplayName("Test percent(double); when one; then return '100%'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.percent(double)"})
  void testPercent_whenOne_thenReturn100() {
    // Arrange, Act and Assert
    assertEquals("100%", SummarizerUtils.percent(1.0d));
  }

  /**
   * Test {@link SummarizerUtils#percent(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 1000%}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#percent(double)}
   */
  @Test
  @DisplayName("Test percent(double); when ten; then return '1000%'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.percent(double)"})
  void testPercent_whenTen_thenReturn1000() {
    // Arrange, Act and Assert
    assertEquals("1000%", SummarizerUtils.percent(10.0d));
  }

  /**
   * Test {@link SummarizerUtils#payReceive(PayReceive)}.
   *
   * <p>Method under test: {@link SummarizerUtils#payReceive(PayReceive)}
   */
  @Test
  @DisplayName("Test payReceive(PayReceive)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.payReceive(PayReceive)"})
  void testPayReceive() {
    // Arrange, Act and Assert
    assertEquals("Pay", SummarizerUtils.payReceive(PayReceive.PAY));
  }

  /**
   * Test {@link SummarizerUtils#barrier(Barrier, LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@code Down-and-KnockIn @ 10.0}.
   * </ul>
   *
   * <p>Method under test: {@link SummarizerUtils#barrier(Barrier, LocalDate)}
   */
  @Test
  @DisplayName("Test barrier(Barrier, LocalDate); then return 'Down-and-KnockIn @ 10.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SummarizerUtils.barrier(Barrier, LocalDate)"})
  void testBarrier_thenReturnDownAndKnockIn100() {
    // Arrange, Act and Assert
    assertEquals(
        "Down-and-KnockIn @ 10.0",
        SummarizerUtils.barrier(
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d),
            LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link SummarizerUtils#summary(Position, ProductType, String, Currency[])} with {@code
   * position}, {@code type}, {@code description}, {@code currencies}.
   *
   * <p>Method under test: {@link SummarizerUtils#summary(Position, ProductType, String,
   * Currency[])}
   */
  @Test
  @DisplayName(
      "Test summary(Position, ProductType, String, Currency[]) with 'position', 'type', 'description', 'currencies'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PortfolioItemSummary SummarizerUtils.summary(Position, ProductType, String, Currency[])"
  })
  void testSummaryWithPositionTypeDescriptionCurrencies() {
    // Arrange
    Position position = mock(Position.class);
    Optional<StandardId> ofResult = Optional.of(StandardId.of("Scheme", "42"));
    when(position.getId()).thenReturn(ofResult);

    // Act
    PortfolioItemSummary actualSummaryResult =
        SummarizerUtils.summary(
            position, ProductType.BILL, "The characteristics of someone or something");

    // Assert
    verify(position).getId();
    assertEquals(
        "The characteristics of someone or something", actualSummaryResult.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummaryResult.getPortfolioItemType());
    assertTrue(actualSummaryResult.getCurrencies().isEmpty());
    assertEquals(ofResult, actualSummaryResult.getId());
    assertSame(ProductType.BILL, actualSummaryResult.getProductType());
  }

  /**
   * Test {@link SummarizerUtils#summary(Position, ProductType, String, Currency[])} with {@code
   * position}, {@code type}, {@code description}, {@code currencies}.
   *
   * <p>Method under test: {@link SummarizerUtils#summary(Position, ProductType, String,
   * Currency[])}
   */
  @Test
  @DisplayName(
      "Test summary(Position, ProductType, String, Currency[]) with 'position', 'type', 'description', 'currencies'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PortfolioItemSummary SummarizerUtils.summary(Position, ProductType, String, Currency[])"
  })
  void testSummaryWithPositionTypeDescriptionCurrencies2() {
    // Arrange
    Position position = mock(Position.class);
    Optional<StandardId> ofResult = Optional.of(StandardId.of("portfolioItemType", "42"));
    when(position.getId()).thenReturn(ofResult);

    // Act
    PortfolioItemSummary actualSummaryResult =
        SummarizerUtils.summary(
            position, ProductType.BILL, "The characteristics of someone or something");

    // Assert
    verify(position).getId();
    assertEquals(
        "The characteristics of someone or something", actualSummaryResult.getDescription());
    assertEquals(PortfolioItemType.POSITION, actualSummaryResult.getPortfolioItemType());
    assertTrue(actualSummaryResult.getCurrencies().isEmpty());
    assertEquals(ofResult, actualSummaryResult.getId());
    assertSame(ProductType.BILL, actualSummaryResult.getProductType());
  }

  /**
   * Test {@link SummarizerUtils#summary(Trade, ProductType, String, Currency[])} with {@code
   * trade}, {@code type}, {@code description}, {@code currencies}.
   *
   * <p>Method under test: {@link SummarizerUtils#summary(Trade, ProductType, String, Currency[])}
   */
  @Test
  @DisplayName(
      "Test summary(Trade, ProductType, String, Currency[]) with 'trade', 'type', 'description', 'currencies'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PortfolioItemSummary SummarizerUtils.summary(Trade, ProductType, String, Currency[])"
  })
  void testSummaryWithTradeTypeDescriptionCurrencies() {
    // Arrange
    Trade trade = mock(Trade.class);
    Optional<StandardId> ofResult = Optional.of(StandardId.of("Scheme", "42"));
    when(trade.getId()).thenReturn(ofResult);

    // Act
    PortfolioItemSummary actualSummaryResult =
        SummarizerUtils.summary(
            trade, ProductType.BILL, "The characteristics of someone or something");

    // Assert
    verify(trade).getId();
    assertEquals(
        "The characteristics of someone or something", actualSummaryResult.getDescription());
    assertEquals(PortfolioItemType.TRADE, actualSummaryResult.getPortfolioItemType());
    assertTrue(actualSummaryResult.getCurrencies().isEmpty());
    assertEquals(ofResult, actualSummaryResult.getId());
    assertSame(ProductType.BILL, actualSummaryResult.getProductType());
  }
}
