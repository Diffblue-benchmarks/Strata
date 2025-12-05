package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.BigMoney;
import com.opengamma.strata.collect.Decimal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BuySellDiffblueTest {
  /**
   * Test {@link BuySell#of(String)}.
   *
   * <ul>
   *   <li>When {@code BUY}.
   *   <li>Then return {@code BUY}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'BUY'; then return 'BUY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell BuySell.of(String)"})
  void testOf_whenBuy_thenReturnBuy() {
    // Arrange, Act and Assert
    assertEquals(BuySell.BUY, BuySell.of("BUY"));
  }

  /**
   * Test {@link BuySell#ofBuy(boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code SELL}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#ofBuy(boolean)}
   */
  @Test
  @DisplayName("Test ofBuy(boolean); when 'false'; then return 'SELL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell BuySell.ofBuy(boolean)"})
  void testOfBuy_whenFalse_thenReturnSell() {
    // Arrange, Act and Assert
    assertEquals(BuySell.SELL, BuySell.ofBuy(false));
  }

  /**
   * Test {@link BuySell#ofBuy(boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code BUY}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#ofBuy(boolean)}
   */
  @Test
  @DisplayName("Test ofBuy(boolean); when 'true'; then return 'BUY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell BuySell.ofBuy(boolean)"})
  void testOfBuy_whenTrue_thenReturnBuy() {
    // Arrange, Act and Assert
    assertEquals(BuySell.BUY, BuySell.ofBuy(true));
  }

  /**
   * Test {@link BuySell#normalize(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>Given {@code SELL}.
   *   <li>Then calls {@link BigMoney#negative()}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#normalize(BigMoney)}
   */
  @Test
  @DisplayName("Test normalize(BigMoney) with 'BigMoney'; given 'SELL'; then calls negative()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BuySell.normalize(BigMoney)"})
  void testNormalizeWithBigMoney_givenSell_thenCallsNegative() {
    // Arrange
    BigMoney amount = mock(BigMoney.class);
    when(amount.negative()).thenReturn(null);

    // Act
    BigMoney actualNormalizeResult = BuySell.SELL.normalize(amount);

    // Assert
    verify(amount).negative();
    assertNull(actualNormalizeResult);
  }

  /**
   * Test {@link BuySell#normalize(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>When {@link BigMoney} {@link BigMoney#positive()} return {@code null}.
   *   <li>Then calls {@link BigMoney#positive()}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#normalize(BigMoney)}
   */
  @Test
  @DisplayName(
      "Test normalize(BigMoney) with 'BigMoney'; when BigMoney positive() return 'null'; then calls positive()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BuySell.normalize(BigMoney)"})
  void testNormalizeWithBigMoney_whenBigMoneyPositiveReturnNull_thenCallsPositive() {
    // Arrange
    BigMoney amount = mock(BigMoney.class);
    when(amount.positive()).thenReturn(null);

    // Act
    BigMoney actualNormalizeResult = BuySell.BUY.normalize(amount);

    // Assert
    verify(amount).positive();
    assertNull(actualNormalizeResult);
  }

  /**
   * Test {@link BuySell#normalize(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@code BUY}.
   *   <li>Then return {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#normalize(Decimal)}
   */
  @Test
  @DisplayName(
      "Test normalize(Decimal) with 'Decimal'; given 'BUY'; then return Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal BuySell.normalize(Decimal)"})
  void testNormalizeWithDecimal_givenBuy_thenReturnDecimalWithValueIsFortyTwo() {
    // Arrange
    Decimal amount = Decimal.of(42L);

    // Act
    Decimal actualNormalizeResult = BuySell.BUY.normalize(amount);

    // Assert
    assertEquals(amount, actualNormalizeResult);
  }

  /**
   * Test {@link BuySell#normalize(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@code SELL}.
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#normalize(Decimal)}
   */
  @Test
  @DisplayName(
      "Test normalize(Decimal) with 'Decimal'; given 'SELL'; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal BuySell.normalize(Decimal)"})
  void testNormalizeWithDecimal_givenSell_thenReturnSignumIsMinusOne() {
    // Arrange
    Decimal amount = Decimal.of(42L);

    // Act
    Decimal actualNormalizeResult = BuySell.SELL.normalize(amount);

    // Assert
    assertEquals(-1, actualNormalizeResult.signum());
    Decimal absResult = actualNormalizeResult.abs();
    assertEquals(actualNormalizeResult, absResult.abs().negated());
    assertEquals(actualNormalizeResult, absResult.negated());
    assertEquals(amount, actualNormalizeResult.negated());
  }

  /**
   * Test {@link BuySell#normalize(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@code BUY}.
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#normalize(double)}
   */
  @Test
  @DisplayName("Test normalize(double) with 'double'; given 'BUY'; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BuySell.normalize(double)"})
  void testNormalizeWithDouble_givenBuy_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, BuySell.BUY.normalize(10.0d));
  }

  /**
   * Test {@link BuySell#normalize(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@code BUY}.
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#normalize(double)}
   */
  @Test
  @DisplayName("Test normalize(double) with 'double'; given 'BUY'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BuySell.normalize(double)"})
  void testNormalizeWithDouble_givenBuy_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, BuySell.BUY.normalize(0.0d));
  }

  /**
   * Test {@link BuySell#normalize(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@code SELL}.
   *   <li>When ten.
   *   <li>Then return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#normalize(double)}
   */
  @Test
  @DisplayName(
      "Test normalize(double) with 'double'; given 'SELL'; when ten; then return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BuySell.normalize(double)"})
  void testNormalizeWithDouble_givenSell_whenTen_thenReturnMinusTen() {
    // Arrange, Act and Assert
    assertEquals(-10.0d, BuySell.SELL.normalize(10.0d));
  }

  /**
   * Test {@link BuySell#isBuy()}.
   *
   * <ul>
   *   <li>Given {@code BUY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#isBuy()}
   */
  @Test
  @DisplayName("Test isBuy(); given 'BUY'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuySell.isBuy()"})
  void testIsBuy_givenBuy_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BuySell.BUY.isBuy());
  }

  /**
   * Test {@link BuySell#isBuy()}.
   *
   * <ul>
   *   <li>Given {@code SELL}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#isBuy()}
   */
  @Test
  @DisplayName("Test isBuy(); given 'SELL'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuySell.isBuy()"})
  void testIsBuy_givenSell_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BuySell.SELL.isBuy());
  }

  /**
   * Test {@link BuySell#isSell()}.
   *
   * <ul>
   *   <li>Given {@code BUY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#isSell()}
   */
  @Test
  @DisplayName("Test isSell(); given 'BUY'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuySell.isSell()"})
  void testIsSell_givenBuy_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BuySell.BUY.isSell());
  }

  /**
   * Test {@link BuySell#isSell()}.
   *
   * <ul>
   *   <li>Given {@link BuySell#SELL}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#isSell()}
   */
  @Test
  @DisplayName("Test isSell(); given SELL; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuySell.isSell()"})
  void testIsSell_givenSell_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BuySell.SELL.isSell());
  }

  /**
   * Test {@link BuySell#opposite()}.
   *
   * <ul>
   *   <li>Given {@code BUY}.
   *   <li>Then return {@code SELL}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'BUY'; then return 'SELL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell BuySell.opposite()"})
  void testOpposite_givenBuy_thenReturnSell() {
    // Arrange, Act and Assert
    assertEquals(BuySell.SELL, BuySell.BUY.opposite());
  }

  /**
   * Test {@link BuySell#opposite()}.
   *
   * <ul>
   *   <li>Given {@code SELL}.
   *   <li>Then return {@code BUY}.
   * </ul>
   *
   * <p>Method under test: {@link BuySell#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'SELL'; then return 'BUY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell BuySell.opposite()"})
  void testOpposite_givenSell_thenReturnBuy() {
    // Arrange, Act and Assert
    assertEquals(BuySell.BUY, BuySell.SELL.opposite());
  }

  /**
   * Test {@link BuySell#toString()}.
   *
   * <p>Method under test: {@link BuySell#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BuySell.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Buy", BuySell.valueOf("BUY").toString());
  }
}
