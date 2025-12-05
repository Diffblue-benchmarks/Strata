package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GammaDistributionDiffblueTest {
  /**
   * Test {@link GammaDistribution#GammaDistribution(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return K is ten.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#GammaDistribution(double, double)}
   */
  @Test
  @DisplayName("Test new GammaDistribution(double, double); when ten; then return K is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GammaDistribution.<init>(double, double)"})
  void testNewGammaDistribution_whenTen_thenReturnKIsTen() {
    // Arrange and Act
    GammaDistribution actualGammaDistribution = new GammaDistribution(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualGammaDistribution.getK());
    assertEquals(10.0d, actualGammaDistribution.getTheta());
  }

  /**
   * Test {@link GammaDistribution#GammaDistribution(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return K is ten.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#GammaDistribution(double, double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new GammaDistribution(double, double, RandomEngine); when ten; then return K is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GammaDistribution.<init>(double, double, RandomEngine)"})
  void testNewGammaDistribution_whenTen_thenReturnKIsTen2() {
    // Arrange and Act
    GammaDistribution actualGammaDistribution =
        new GammaDistribution(10.0d, 10.0d, new MersenneTwister());

    // Assert
    assertEquals(10.0d, actualGammaDistribution.getK());
    assertEquals(10.0d, actualGammaDistribution.getTheta());
  }

  /**
   * Test {@link GammaDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_when10e10_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new GammaDistribution(10.0d, 10.0d).getCDF(-1.0E-10d));
  }

  /**
   * Test {@link GammaDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9999999999859864}.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when two; then return '0.9999999999859864'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenTwo_thenReturn09999999999859864() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999859864d, new GammaDistribution(10.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link GammaDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GammaDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName("Test getInverseCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new GammaDistribution(10.0d, 10.0d).getInverseCDF(10.0d));
  }

  /**
   * Test {@link GammaDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link GammaDistribution#GammaDistribution(double, double)} with k is one and theta
   *       is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getPDF(Double) with 'Double'; given GammaDistribution(double, double) with k is one and theta is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_givenGammaDistributionWithKIsOneAndThetaIsTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new GammaDistribution(1.0d, 10.0d).getPDF(0.0d));
  }

  /**
   * Test {@link GammaDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.05816306518329416}.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then return '0.05816306518329416'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenReturn005816306518329416() {
    // Arrange, Act and Assert
    assertEquals(0.05816306518329416d, new GammaDistribution(11.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link GammaDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 2.0611536224385576E-8}.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then return '2.0611536224385576E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenReturn20611536224385576e8() {
    // Arrange, Act and Assert
    assertEquals(2.0611536224385576E-8d, new GammaDistribution(1.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link GammaDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.029081532591647075}.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; when two; then return '0.029081532591647075'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_whenTwo_thenReturn0029081532591647075() {
    // Arrange, Act and Assert
    assertEquals(0.029081532591647075d, new GammaDistribution(10.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link GammaDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new GammaDistribution(10.0d, 10.0d).getPDF(0.0d));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GammaDistribution#getK()}
   *   <li>{@link GammaDistribution#getTheta()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaDistribution.getK()", "double GammaDistribution.getTheta()"})
  void testGettersAndSetters() {
    // Arrange
    GammaDistribution gammaDistribution = new GammaDistribution(10.0d, 10.0d);

    // Act
    double actualK = gammaDistribution.getK();

    // Assert
    assertEquals(10.0d, actualK);
    assertEquals(10.0d, gammaDistribution.getTheta());
  }

  /**
   * Test {@link GammaDistribution#equals(Object)}, and {@link GammaDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GammaDistribution#equals(Object)}
   *   <li>{@link GammaDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GammaDistribution.equals(Object)",
    "int GammaDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GammaDistribution gammaDistribution = new GammaDistribution(10.0d, 10.0d);
    GammaDistribution gammaDistribution2 = new GammaDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(gammaDistribution, gammaDistribution2);
    assertEquals(gammaDistribution.hashCode(), gammaDistribution2.hashCode());
  }

  /**
   * Test {@link GammaDistribution#equals(Object)}, and {@link GammaDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GammaDistribution#equals(Object)}
   *   <li>{@link GammaDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GammaDistribution.equals(Object)",
    "int GammaDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GammaDistribution gammaDistribution = new GammaDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(gammaDistribution, gammaDistribution);
    int expectedHashCodeResult = gammaDistribution.hashCode();
    assertEquals(expectedHashCodeResult, gammaDistribution.hashCode());
  }

  /**
   * Test {@link GammaDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GammaDistribution.equals(Object)",
    "int GammaDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GammaDistribution(10.0d, 10.0d), 1);
  }

  /**
   * Test {@link GammaDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GammaDistribution.equals(Object)",
    "int GammaDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GammaDistribution gammaDistribution = new GammaDistribution(1.0d, 10.0d);

    // Act and Assert
    assertNotEquals(gammaDistribution, new GammaDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link GammaDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GammaDistribution.equals(Object)",
    "int GammaDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    GammaDistribution gammaDistribution = new GammaDistribution(10.0d, 1.0d);

    // Act and Assert
    assertNotEquals(gammaDistribution, new GammaDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link GammaDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GammaDistribution.equals(Object)",
    "int GammaDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GammaDistribution(10.0d, 10.0d), null);
  }

  /**
   * Test {@link GammaDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GammaDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GammaDistribution.equals(Object)",
    "int GammaDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GammaDistribution(10.0d, 10.0d), "Different type to GammaDistribution");
  }
}
