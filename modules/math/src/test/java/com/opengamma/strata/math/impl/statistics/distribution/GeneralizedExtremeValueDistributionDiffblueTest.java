package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GeneralizedExtremeValueDistributionDiffblueTest {
  /**
   * Test {@link GeneralizedExtremeValueDistribution#GeneralizedExtremeValueDistribution(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return Ksi is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * GeneralizedExtremeValueDistribution#GeneralizedExtremeValueDistribution(double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedExtremeValueDistribution(double, double, double); when NaN; then return Ksi is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GeneralizedExtremeValueDistribution.<init>(double, double, double)"})
  void testNewGeneralizedExtremeValueDistribution_whenNaN_thenReturnKsiIsNaN() {
    // Arrange and Act
    GeneralizedExtremeValueDistribution actualGeneralizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, Double.NaN);

    // Assert
    assertEquals(10.0d, actualGeneralizedExtremeValueDistribution.getMu());
    assertEquals(10.0d, actualGeneralizedExtremeValueDistribution.getSigma());
    assertEquals(Double.NaN, actualGeneralizedExtremeValueDistribution.getKsi());
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#GeneralizedExtremeValueDistribution(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Ksi is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * GeneralizedExtremeValueDistribution#GeneralizedExtremeValueDistribution(double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedExtremeValueDistribution(double, double, double); when ten; then return Ksi is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GeneralizedExtremeValueDistribution.<init>(double, double, double)"})
  void testNewGeneralizedExtremeValueDistribution_whenTen_thenReturnKsiIsTen() {
    // Arrange and Act
    GeneralizedExtremeValueDistribution actualGeneralizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualGeneralizedExtremeValueDistribution.getKsi());
    assertEquals(10.0d, actualGeneralizedExtremeValueDistribution.getMu());
    assertEquals(10.0d, actualGeneralizedExtremeValueDistribution.getSigma());
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#GeneralizedExtremeValueDistribution(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Ksi is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * GeneralizedExtremeValueDistribution#GeneralizedExtremeValueDistribution(double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedExtremeValueDistribution(double, double, double); when zero; then return Ksi is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GeneralizedExtremeValueDistribution.<init>(double, double, double)"})
  void testNewGeneralizedExtremeValueDistribution_whenZero_thenReturnKsiIsZero() {
    // Arrange and Act
    GeneralizedExtremeValueDistribution actualGeneralizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualGeneralizedExtremeValueDistribution.getKsi());
    assertEquals(0.0d, actualGeneralizedExtremeValueDistribution.getSigma());
    assertEquals(10.0d, actualGeneralizedExtremeValueDistribution.getMu());
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.10800896179308592}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.10800896179308592'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn010800896179308592() {
    // Arrange, Act and Assert
    assertEquals(
        0.10800896179308592d,
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, -1.0E-10d).getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.10800897769659155}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.10800897769659155'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn010800897769659155() {
    // Arrange, Act and Assert
    assertEquals(
        0.10800897769659155d,
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 0.0d).getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.36787944117144233}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.36787944117144233'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn036787944117144233() {
    // Arrange, Act and Assert
    assertEquals(
        0.36787944117144233d,
        new GeneralizedExtremeValueDistribution(2.0d, 10.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName("Test getInverseCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d).getInverseCDF(10.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.02403783809987661}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then return '0.02403783809987661'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenReturn002403783809987661() {
    // Arrange, Act and Assert
    assertEquals(
        0.02403783809987661d,
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, -1.0E-10d).getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.024037840050839462}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then return '0.024037840050839462'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenReturn0024037840050839462() {
    // Arrange, Act and Assert
    assertEquals(
        0.024037840050839462d,
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 0.0d).getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.036787944117144235}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then return '0.036787944117144235'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenReturn0036787944117144235() {
    // Arrange, Act and Assert
    assertEquals(
        0.036787944117144235d,
        new GeneralizedExtremeValueDistribution(2.0d, 10.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#nextRandom()}.
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedExtremeValueDistribution.nextRandom()"})
  void testNextRandom() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d).nextRandom());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GeneralizedExtremeValueDistribution#getKsi()}
   *   <li>{@link GeneralizedExtremeValueDistribution#getMu()}
   *   <li>{@link GeneralizedExtremeValueDistribution#getSigma()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double GeneralizedExtremeValueDistribution.getKsi()",
    "double GeneralizedExtremeValueDistribution.getMu()",
    "double GeneralizedExtremeValueDistribution.getSigma()"
  })
  void testGettersAndSetters() {
    // Arrange
    GeneralizedExtremeValueDistribution generalizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d);

    // Act
    double actualKsi = generalizedExtremeValueDistribution.getKsi();
    double actualMu = generalizedExtremeValueDistribution.getMu();

    // Assert
    assertEquals(10.0d, actualKsi);
    assertEquals(10.0d, actualMu);
    assertEquals(10.0d, generalizedExtremeValueDistribution.getSigma());
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#equals(Object)}, and {@link
   * GeneralizedExtremeValueDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GeneralizedExtremeValueDistribution#equals(Object)}
   *   <li>{@link GeneralizedExtremeValueDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedExtremeValueDistribution.equals(Object)",
    "int GeneralizedExtremeValueDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GeneralizedExtremeValueDistribution generalizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d);
    GeneralizedExtremeValueDistribution generalizedExtremeValueDistribution2 =
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(generalizedExtremeValueDistribution, generalizedExtremeValueDistribution2);
    assertEquals(
        generalizedExtremeValueDistribution.hashCode(),
        generalizedExtremeValueDistribution2.hashCode());
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#equals(Object)}, and {@link
   * GeneralizedExtremeValueDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GeneralizedExtremeValueDistribution#equals(Object)}
   *   <li>{@link GeneralizedExtremeValueDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedExtremeValueDistribution.equals(Object)",
    "int GeneralizedExtremeValueDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GeneralizedExtremeValueDistribution generalizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(generalizedExtremeValueDistribution, generalizedExtremeValueDistribution);
    int expectedHashCodeResult = generalizedExtremeValueDistribution.hashCode();
    assertEquals(expectedHashCodeResult, generalizedExtremeValueDistribution.hashCode());
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedExtremeValueDistribution.equals(Object)",
    "int GeneralizedExtremeValueDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GeneralizedExtremeValueDistribution generalizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(1.0E-13d, 10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(
        generalizedExtremeValueDistribution,
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedExtremeValueDistribution.equals(Object)",
    "int GeneralizedExtremeValueDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GeneralizedExtremeValueDistribution generalizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 1.0E-13d, 10.0d);

    // Act and Assert
    assertNotEquals(
        generalizedExtremeValueDistribution,
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedExtremeValueDistribution.equals(Object)",
    "int GeneralizedExtremeValueDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    GeneralizedExtremeValueDistribution generalizedExtremeValueDistribution =
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 1.0E-13d);

    // Act and Assert
    assertNotEquals(
        generalizedExtremeValueDistribution,
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedExtremeValueDistribution.equals(Object)",
    "int GeneralizedExtremeValueDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d), null);
  }

  /**
   * Test {@link GeneralizedExtremeValueDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedExtremeValueDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedExtremeValueDistribution.equals(Object)",
    "int GeneralizedExtremeValueDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new GeneralizedExtremeValueDistribution(10.0d, 10.0d, 10.0d),
        "Different type to GeneralizedExtremeValueDistribution");
  }
}
