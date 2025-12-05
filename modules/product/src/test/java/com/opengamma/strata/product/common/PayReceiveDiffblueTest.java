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

class PayReceiveDiffblueTest {
  /**
   * Test {@link PayReceive#of(String)}.
   *
   * <ul>
   *   <li>When {@code PAY}.
   *   <li>Then return {@code PAY}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'PAY'; then return 'PAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PayReceive PayReceive.of(String)"})
  void testOf_whenPay_thenReturnPay() {
    // Arrange, Act and Assert
    assertEquals(PayReceive.PAY, PayReceive.of("PAY"));
  }

  /**
   * Test {@link PayReceive#ofPay(boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code RECEIVE}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#ofPay(boolean)}
   */
  @Test
  @DisplayName("Test ofPay(boolean); when 'false'; then return 'RECEIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PayReceive PayReceive.ofPay(boolean)"})
  void testOfPay_whenFalse_thenReturnReceive() {
    // Arrange, Act and Assert
    assertEquals(PayReceive.RECEIVE, PayReceive.ofPay(false));
  }

  /**
   * Test {@link PayReceive#ofPay(boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code PAY}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#ofPay(boolean)}
   */
  @Test
  @DisplayName("Test ofPay(boolean); when 'true'; then return 'PAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PayReceive PayReceive.ofPay(boolean)"})
  void testOfPay_whenTrue_thenReturnPay() {
    // Arrange, Act and Assert
    assertEquals(PayReceive.PAY, PayReceive.ofPay(true));
  }

  /**
   * Test {@link PayReceive#ofSignedAmount(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code PAY}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#ofSignedAmount(double)}
   */
  @Test
  @DisplayName("Test ofSignedAmount(double); when '-0.5'; then return 'PAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PayReceive PayReceive.ofSignedAmount(double)"})
  void testOfSignedAmount_when05_thenReturnPay() {
    // Arrange, Act and Assert
    assertEquals(PayReceive.PAY, PayReceive.ofSignedAmount(-0.5d));
  }

  /**
   * Test {@link PayReceive#ofSignedAmount(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code RECEIVE}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#ofSignedAmount(double)}
   */
  @Test
  @DisplayName("Test ofSignedAmount(double); when ten; then return 'RECEIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PayReceive PayReceive.ofSignedAmount(double)"})
  void testOfSignedAmount_whenTen_thenReturnReceive() {
    // Arrange, Act and Assert
    assertEquals(PayReceive.RECEIVE, PayReceive.ofSignedAmount(10.0d));
  }

  /**
   * Test {@link PayReceive#normalize(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>Given {@code RECEIVE}.
   *   <li>Then calls {@link BigMoney#positive()}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#normalize(BigMoney)}
   */
  @Test
  @DisplayName("Test normalize(BigMoney) with 'BigMoney'; given 'RECEIVE'; then calls positive()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney PayReceive.normalize(BigMoney)"})
  void testNormalizeWithBigMoney_givenReceive_thenCallsPositive() {
    // Arrange
    BigMoney amount = mock(BigMoney.class);
    when(amount.positive()).thenReturn(null);

    // Act
    BigMoney actualNormalizeResult = PayReceive.RECEIVE.normalize(amount);

    // Assert
    verify(amount).positive();
    assertNull(actualNormalizeResult);
  }

  /**
   * Test {@link PayReceive#normalize(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>When {@link BigMoney} {@link BigMoney#negative()} return {@code null}.
   *   <li>Then calls {@link BigMoney#negative()}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#normalize(BigMoney)}
   */
  @Test
  @DisplayName(
      "Test normalize(BigMoney) with 'BigMoney'; when BigMoney negative() return 'null'; then calls negative()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney PayReceive.normalize(BigMoney)"})
  void testNormalizeWithBigMoney_whenBigMoneyNegativeReturnNull_thenCallsNegative() {
    // Arrange
    BigMoney amount = mock(BigMoney.class);
    when(amount.negative()).thenReturn(null);

    // Act
    BigMoney actualNormalizeResult = PayReceive.PAY.normalize(amount);

    // Assert
    verify(amount).negative();
    assertNull(actualNormalizeResult);
  }

  /**
   * Test {@link PayReceive#normalize(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@code PAY}.
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#normalize(Decimal)}
   */
  @Test
  @DisplayName(
      "Test normalize(Decimal) with 'Decimal'; given 'PAY'; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal PayReceive.normalize(Decimal)"})
  void testNormalizeWithDecimal_givenPay_thenReturnSignumIsMinusOne() {
    // Arrange
    Decimal amount = Decimal.of(42L);

    // Act
    Decimal actualNormalizeResult = PayReceive.PAY.normalize(amount);

    // Assert
    assertEquals(-1, actualNormalizeResult.signum());
    Decimal absResult = actualNormalizeResult.abs();
    assertEquals(actualNormalizeResult, absResult.abs().negated());
    assertEquals(actualNormalizeResult, absResult.negated());
    assertEquals(amount, actualNormalizeResult.negated());
  }

  /**
   * Test {@link PayReceive#normalize(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@code RECEIVE}.
   *   <li>Then return {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#normalize(Decimal)}
   */
  @Test
  @DisplayName(
      "Test normalize(Decimal) with 'Decimal'; given 'RECEIVE'; then return Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal PayReceive.normalize(Decimal)"})
  void testNormalizeWithDecimal_givenReceive_thenReturnDecimalWithValueIsFortyTwo() {
    // Arrange
    Decimal amount = Decimal.of(42L);

    // Act
    Decimal actualNormalizeResult = PayReceive.RECEIVE.normalize(amount);

    // Assert
    assertEquals(amount, actualNormalizeResult);
  }

  /**
   * Test {@link PayReceive#normalize(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@code PAY}.
   *   <li>When ten.
   *   <li>Then return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#normalize(double)}
   */
  @Test
  @DisplayName("Test normalize(double) with 'double'; given 'PAY'; when ten; then return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double PayReceive.normalize(double)"})
  void testNormalizeWithDouble_givenPay_whenTen_thenReturnMinusTen() {
    // Arrange, Act and Assert
    assertEquals(-10.0d, PayReceive.PAY.normalize(10.0d));
  }

  /**
   * Test {@link PayReceive#normalize(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@code PAY}.
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#normalize(double)}
   */
  @Test
  @DisplayName("Test normalize(double) with 'double'; given 'PAY'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double PayReceive.normalize(double)"})
  void testNormalizeWithDouble_givenPay_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, PayReceive.PAY.normalize(0.0d));
  }

  /**
   * Test {@link PayReceive#normalize(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@code RECEIVE}.
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#normalize(double)}
   */
  @Test
  @DisplayName("Test normalize(double) with 'double'; given 'RECEIVE'; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double PayReceive.normalize(double)"})
  void testNormalizeWithDouble_givenReceive_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, PayReceive.RECEIVE.normalize(10.0d));
  }

  /**
   * Test {@link PayReceive#isPay()}.
   *
   * <ul>
   *   <li>Given {@code PAY}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#isPay()}
   */
  @Test
  @DisplayName("Test isPay(); given 'PAY'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PayReceive.isPay()"})
  void testIsPay_givenPay_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(PayReceive.PAY.isPay());
  }

  /**
   * Test {@link PayReceive#isPay()}.
   *
   * <ul>
   *   <li>Given {@code RECEIVE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#isPay()}
   */
  @Test
  @DisplayName("Test isPay(); given 'RECEIVE'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PayReceive.isPay()"})
  void testIsPay_givenReceive_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(PayReceive.RECEIVE.isPay());
  }

  /**
   * Test {@link PayReceive#isReceive()}.
   *
   * <ul>
   *   <li>Given {@code PAY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#isReceive()}
   */
  @Test
  @DisplayName("Test isReceive(); given 'PAY'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PayReceive.isReceive()"})
  void testIsReceive_givenPay_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(PayReceive.PAY.isReceive());
  }

  /**
   * Test {@link PayReceive#isReceive()}.
   *
   * <ul>
   *   <li>Given {@link PayReceive#RECEIVE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#isReceive()}
   */
  @Test
  @DisplayName("Test isReceive(); given RECEIVE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PayReceive.isReceive()"})
  void testIsReceive_givenReceive_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(PayReceive.RECEIVE.isReceive());
  }

  /**
   * Test {@link PayReceive#opposite()}.
   *
   * <ul>
   *   <li>Given {@code PAY}.
   *   <li>Then return {@code RECEIVE}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'PAY'; then return 'RECEIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PayReceive PayReceive.opposite()"})
  void testOpposite_givenPay_thenReturnReceive() {
    // Arrange, Act and Assert
    assertEquals(PayReceive.RECEIVE, PayReceive.PAY.opposite());
  }

  /**
   * Test {@link PayReceive#opposite()}.
   *
   * <ul>
   *   <li>Given {@code RECEIVE}.
   *   <li>Then return {@code PAY}.
   * </ul>
   *
   * <p>Method under test: {@link PayReceive#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'RECEIVE'; then return 'PAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PayReceive PayReceive.opposite()"})
  void testOpposite_givenReceive_thenReturnPay() {
    // Arrange, Act and Assert
    assertEquals(PayReceive.PAY, PayReceive.RECEIVE.opposite());
  }

  /**
   * Test {@link PayReceive#toString()}.
   *
   * <p>Method under test: {@link PayReceive#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PayReceive.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Pay", PayReceive.valueOf("PAY").toString());
  }
}
