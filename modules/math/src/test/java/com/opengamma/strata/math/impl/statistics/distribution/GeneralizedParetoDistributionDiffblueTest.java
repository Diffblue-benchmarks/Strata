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

class GeneralizedParetoDistributionDiffblueTest {
  /**
   * Test {@link GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double, double,
   * RandomEngine)}.
   *
   * <ul>
   *   <li>When {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return Ksi is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double, double,
   * RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedParetoDistribution(double, double, double, RandomEngine); when MersenneTwister(); then return Ksi is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void GeneralizedParetoDistribution.<init>(double, double, double, RandomEngine)"
  })
  void testNewGeneralizedParetoDistribution_whenMersenneTwister_thenReturnKsiIsTen() {
    // Arrange and Act
    GeneralizedParetoDistribution actualGeneralizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d, new MersenneTwister());

    // Assert
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getKsi());
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getMu());
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getSigma());
  }

  /**
   * Test {@link GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return Ksi is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedParetoDistribution(double, double, double); when NaN; then return Ksi is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GeneralizedParetoDistribution.<init>(double, double, double)"})
  void testNewGeneralizedParetoDistribution_whenNaN_thenReturnKsiIsNaN() {
    // Arrange and Act
    GeneralizedParetoDistribution actualGeneralizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, Double.NaN);

    // Assert
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getMu());
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getSigma());
    assertEquals(Double.NaN, actualGeneralizedParetoDistribution.getKsi());
  }

  /**
   * Test {@link GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double, double,
   * RandomEngine)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return Ksi is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double, double,
   * RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedParetoDistribution(double, double, double, RandomEngine); when NaN; then return Ksi is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void GeneralizedParetoDistribution.<init>(double, double, double, RandomEngine)"
  })
  void testNewGeneralizedParetoDistribution_whenNaN_thenReturnKsiIsNaN2() {
    // Arrange and Act
    GeneralizedParetoDistribution actualGeneralizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, Double.NaN, new MersenneTwister());

    // Assert
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getMu());
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getSigma());
    assertEquals(Double.NaN, actualGeneralizedParetoDistribution.getKsi());
  }

  /**
   * Test {@link GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Ksi is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * GeneralizedParetoDistribution#GeneralizedParetoDistribution(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedParetoDistribution(double, double, double); when ten; then return Ksi is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GeneralizedParetoDistribution.<init>(double, double, double)"})
  void testNewGeneralizedParetoDistribution_whenTen_thenReturnKsiIsTen() {
    // Arrange and Act
    GeneralizedParetoDistribution actualGeneralizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getKsi());
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getMu());
    assertEquals(10.0d, actualGeneralizedParetoDistribution.getSigma());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GeneralizedParetoDistribution#getKsi()}
   *   <li>{@link GeneralizedParetoDistribution#getMu()}
   *   <li>{@link GeneralizedParetoDistribution#getSigma()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double GeneralizedParetoDistribution.getKsi()",
    "double GeneralizedParetoDistribution.getMu()",
    "double GeneralizedParetoDistribution.getSigma()"
  })
  void testGettersAndSetters() {
    // Arrange
    GeneralizedParetoDistribution generalizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d);

    // Act
    double actualKsi = generalizedParetoDistribution.getKsi();
    double actualMu = generalizedParetoDistribution.getMu();

    // Assert
    assertEquals(10.0d, actualKsi);
    assertEquals(10.0d, actualMu);
    assertEquals(10.0d, generalizedParetoDistribution.getSigma());
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getCDF(Double)"})
  void testGetCDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getCDF(Double)"})
  void testGetCDFWithDouble2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedParetoDistribution(1.0d, 1.0d, -1.0d, new MersenneTwister())
                .getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getCDF(Double)"})
  void testGetCDFWithDouble3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedParetoDistribution(2.0d, 1.0d, -1.0d, new MersenneTwister())
                .getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(
        0.5d,
        new GeneralizedParetoDistribution(1.0d, 1.0d, 1.0d, new MersenneTwister()).getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.75}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; then return '0.75'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_thenReturn075() {
    // Arrange, Act and Assert
    assertEquals(
        0.75d,
        new GeneralizedParetoDistribution(1.0d, 1.0d, -0.5d, new MersenneTwister()).getCDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName("Test getInverseCDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d).getInverseCDF(10.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getPDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getPDF(Double)"})
  void testGetPDFWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getPDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getPDF(Double)"})
  void testGetPDFWithDouble2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedParetoDistribution(-0.5d, 1.0d, -0.5d, new MersenneTwister())
                .getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getPDF(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getPDF(Double)"})
  void testGetPDFWithDouble3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedParetoDistribution(2.0d, 1.0d, -0.5d, new MersenneTwister())
                .getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(
        0.5d,
        new GeneralizedParetoDistribution(1.0d, 1.0d, -0.5d, new MersenneTwister()).getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.25}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; then return '0.25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GeneralizedParetoDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_thenReturn025() {
    // Arrange, Act and Assert
    assertEquals(
        0.25d,
        new GeneralizedParetoDistribution(1.0d, 1.0d, 1.0d, new MersenneTwister()).getPDF(2.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}, and {@link
   * GeneralizedParetoDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GeneralizedParetoDistribution#equals(Object)}
   *   <li>{@link GeneralizedParetoDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GeneralizedParetoDistribution generalizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d);
    GeneralizedParetoDistribution generalizedParetoDistribution2 =
        new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(generalizedParetoDistribution, generalizedParetoDistribution2);
    assertEquals(
        generalizedParetoDistribution.hashCode(), generalizedParetoDistribution2.hashCode());
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}, and {@link
   * GeneralizedParetoDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GeneralizedParetoDistribution#equals(Object)}
   *   <li>{@link GeneralizedParetoDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GeneralizedParetoDistribution generalizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(generalizedParetoDistribution, generalizedParetoDistribution);
    int expectedHashCodeResult = generalizedParetoDistribution.hashCode();
    assertEquals(expectedHashCodeResult, generalizedParetoDistribution.hashCode());
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d), 1);
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GeneralizedParetoDistribution generalizedParetoDistribution =
        new GeneralizedParetoDistribution(1.0E-15d, 10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(
        generalizedParetoDistribution, new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    GeneralizedParetoDistribution generalizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 1.0E-15d, 10.0d);

    // Act and Assert
    assertNotEquals(
        generalizedParetoDistribution, new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    GeneralizedParetoDistribution generalizedParetoDistribution =
        new GeneralizedParetoDistribution(10.0d, 10.0d, 0.5d);

    // Act and Assert
    assertNotEquals(
        generalizedParetoDistribution, new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d), null);
  }

  /**
   * Test {@link GeneralizedParetoDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedParetoDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GeneralizedParetoDistribution.equals(Object)",
    "int GeneralizedParetoDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new GeneralizedParetoDistribution(10.0d, 10.0d, 10.0d),
        "Different type to GeneralizedParetoDistribution");
  }
}
