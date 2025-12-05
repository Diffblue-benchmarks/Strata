package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NonCentralChiSquaredDistributionDiffblueTest {
  /**
   * Test {@link NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}.
   *
   * <ul>
   *   <li>Then return NonCentrality is one thousand.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}
   */
  @Test
  @DisplayName(
      "Test new NonCentralChiSquaredDistribution(double, double); then return NonCentrality is one thousand")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NonCentralChiSquaredDistribution.<init>(double, double)"})
  void testNewNonCentralChiSquaredDistribution_thenReturnNonCentralityIsOneThousand() {
    // Arrange and Act
    NonCentralChiSquaredDistribution actualNonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(10.0d, 1000.0d);

    // Assert
    assertEquals(10.0d, actualNonCentralChiSquaredDistribution.getDegrees());
    assertEquals(1000.0d, actualNonCentralChiSquaredDistribution.getNonCentrality());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return NonCentrality is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}
   */
  @Test
  @DisplayName(
      "Test new NonCentralChiSquaredDistribution(double, double); when '1.0E-10'; then return NonCentrality is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NonCentralChiSquaredDistribution.<init>(double, double)"})
  void testNewNonCentralChiSquaredDistribution_when10e10_thenReturnNonCentralityIsZero() {
    // Arrange and Act
    NonCentralChiSquaredDistribution actualNonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(1.0E-10d, 0.0d);

    // Assert
    assertEquals(0.0d, actualNonCentralChiSquaredDistribution.getNonCentrality());
    assertEquals(1.0E-10d, actualNonCentralChiSquaredDistribution.getDegrees());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return NonCentrality is {@code 1.0E-16}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}
   */
  @Test
  @DisplayName(
      "Test new NonCentralChiSquaredDistribution(double, double); when '1.0E-16'; then return NonCentrality is '1.0E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NonCentralChiSquaredDistribution.<init>(double, double)"})
  void testNewNonCentralChiSquaredDistribution_when10e16_thenReturnNonCentralityIs10e16() {
    // Arrange and Act
    NonCentralChiSquaredDistribution actualNonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(10.0d, 1.0E-16d);

    // Assert
    assertEquals(1.0E-16d, actualNonCentralChiSquaredDistribution.getNonCentrality());
    assertEquals(10.0d, actualNonCentralChiSquaredDistribution.getDegrees());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return NonCentrality is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonCentralChiSquaredDistribution#NonCentralChiSquaredDistribution(double, double)}
   */
  @Test
  @DisplayName(
      "Test new NonCentralChiSquaredDistribution(double, double); when ten; then return NonCentrality is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NonCentralChiSquaredDistribution.<init>(double, double)"})
  void testNewNonCentralChiSquaredDistribution_whenTen_thenReturnNonCentralityIsTen() {
    // Arrange and Act
    NonCentralChiSquaredDistribution actualNonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualNonCentralChiSquaredDistribution.getDegrees());
    assertEquals(10.0d, actualNonCentralChiSquaredDistribution.getNonCentrality());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new NonCentralChiSquaredDistribution(1000.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble2() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, new NonCentralChiSquaredDistribution(Double.POSITIVE_INFINITY, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble3() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, new NonCentralChiSquaredDistribution(10.0d, Double.POSITIVE_INFINITY).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble4() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, new NonCentralChiSquaredDistribution(Double.POSITIVE_INFINITY, 2.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(
        0.5d,
        new NonCentralChiSquaredDistribution(10.0d, Double.POSITIVE_INFINITY)
            .getCDF(Double.POSITIVE_INFINITY));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.842700792949715}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.842700792949715'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn0842700792949715() {
    // Arrange, Act and Assert
    assertEquals(
        0.842700792949715d, new NonCentralChiSquaredDistribution(1.0d, 1.0E-16d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.05173176939040969}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.05173176939040969'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn005173176939040969() {
    // Arrange, Act and Assert
    assertEquals(
        0.05173176939040969d, new NonCentralChiSquaredDistribution(0.5d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.06563111340750367}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.06563111340750367'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn006563111340750367() {
    // Arrange, Act and Assert
    assertEquals(
        0.06563111340750367d,
        new NonCentralChiSquaredDistribution(2.754125208327982E-5d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.06563194921248536}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.06563194921248536'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn006563194921248536() {
    // Arrange, Act and Assert
    assertEquals(
        0.06563194921248536d, new NonCentralChiSquaredDistribution(1.0E-16d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.023349945229355587}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.023349945229355587'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn0023349945229355587() {
    // Arrange, Act and Assert
    assertEquals(
        0.023349945229355587d, new NonCentralChiSquaredDistribution(2.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.41791880371346785}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.41791880371346785'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn041791880371346785() {
    // Arrange, Act and Assert
    assertEquals(
        0.41791880371346785d, new NonCentralChiSquaredDistribution(1000.0d, 10.0d).getCDF(1000.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 5.3345981573870075E-5}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '5.3345981573870075E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn53345981573870075e5() {
    // Arrange, Act and Assert
    assertEquals(
        5.3345981573870075E-5d, new NonCentralChiSquaredDistribution(10.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new NonCentralChiSquaredDistribution(1.0E-16d, 1.0E-16d).getCDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new NonCentralChiSquaredDistribution(10.0d, 10.0d).getCDF(Double.NaN));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenNegative_infinity_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, new NonCentralChiSquaredDistribution(10.0d, 10.0d).getCDF(Double.NEGATIVE_INFINITY));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When one thousand.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getCDF(Double) with 'Double'; when one thousand; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenOneThousand_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999999d, new NonCentralChiSquaredDistribution(10.0d, 10.0d).getCDF(1000.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new NonCentralChiSquaredDistribution(10.0d, 10.0d).getCDF(0.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName("Test getInverseCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new NonCentralChiSquaredDistribution(10.0d, 10.0d).getInverseCDF(10.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getPDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getPDF(Double)"})
  void testGetPDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new NonCentralChiSquaredDistribution(10.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#nextRandom()}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.nextRandom()"})
  void testNextRandom() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new NonCentralChiSquaredDistribution(10.0d, 10.0d).nextRandom());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getDegrees()}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getDegrees()}
   */
  @Test
  @DisplayName("Test getDegrees()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getDegrees()"})
  void testGetDegrees() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new NonCentralChiSquaredDistribution(10.0d, 10.0d).getDegrees());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#getNonCentrality()}.
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#getNonCentrality()}
   */
  @Test
  @DisplayName("Test getNonCentrality()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NonCentralChiSquaredDistribution.getNonCentrality()"})
  void testGetNonCentrality() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new NonCentralChiSquaredDistribution(10.0d, 10.0d).getNonCentrality());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#equals(Object)}, and {@link
   * NonCentralChiSquaredDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NonCentralChiSquaredDistribution#equals(Object)}
   *   <li>{@link NonCentralChiSquaredDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NonCentralChiSquaredDistribution.equals(Object)",
    "int NonCentralChiSquaredDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NonCentralChiSquaredDistribution nonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(10.0d, 10.0d);
    NonCentralChiSquaredDistribution nonCentralChiSquaredDistribution2 =
        new NonCentralChiSquaredDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(nonCentralChiSquaredDistribution, nonCentralChiSquaredDistribution2);
    assertEquals(
        nonCentralChiSquaredDistribution.hashCode(), nonCentralChiSquaredDistribution2.hashCode());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#equals(Object)}, and {@link
   * NonCentralChiSquaredDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NonCentralChiSquaredDistribution#equals(Object)}
   *   <li>{@link NonCentralChiSquaredDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NonCentralChiSquaredDistribution.equals(Object)",
    "int NonCentralChiSquaredDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NonCentralChiSquaredDistribution nonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(nonCentralChiSquaredDistribution, nonCentralChiSquaredDistribution);
    int expectedHashCodeResult = nonCentralChiSquaredDistribution.hashCode();
    assertEquals(expectedHashCodeResult, nonCentralChiSquaredDistribution.hashCode());
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NonCentralChiSquaredDistribution.equals(Object)",
    "int NonCentralChiSquaredDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NonCentralChiSquaredDistribution(10.0d, 10.0d), 1);
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NonCentralChiSquaredDistribution.equals(Object)",
    "int NonCentralChiSquaredDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    NonCentralChiSquaredDistribution nonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(1.0E-16d, 10.0d);

    // Act and Assert
    assertNotEquals(
        nonCentralChiSquaredDistribution, new NonCentralChiSquaredDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NonCentralChiSquaredDistribution.equals(Object)",
    "int NonCentralChiSquaredDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    NonCentralChiSquaredDistribution nonCentralChiSquaredDistribution =
        new NonCentralChiSquaredDistribution(10.0d, 1.0E-16d);

    // Act and Assert
    assertNotEquals(
        nonCentralChiSquaredDistribution, new NonCentralChiSquaredDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NonCentralChiSquaredDistribution.equals(Object)",
    "int NonCentralChiSquaredDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NonCentralChiSquaredDistribution(10.0d, 10.0d), null);
  }

  /**
   * Test {@link NonCentralChiSquaredDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NonCentralChiSquaredDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NonCentralChiSquaredDistribution.equals(Object)",
    "int NonCentralChiSquaredDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new NonCentralChiSquaredDistribution(10.0d, 10.0d),
        "Different type to NonCentralChiSquaredDistribution");
  }
}
