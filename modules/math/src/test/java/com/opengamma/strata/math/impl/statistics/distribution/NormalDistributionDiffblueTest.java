package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalDistributionDiffblueTest {
  /**
   * Test {@link NormalDistribution#NormalDistribution(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return Mean is ten.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#NormalDistribution(double, double,
   * RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new NormalDistribution(double, double, RandomEngine); when MersenneTwister(); then return Mean is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NormalDistribution.<init>(double, double, RandomEngine)"})
  void testNewNormalDistribution_whenMersenneTwister_thenReturnMeanIsTen() {
    // Arrange and Act
    NormalDistribution actualNormalDistribution =
        new NormalDistribution(10.0d, 10.0d, new MersenneTwister());

    // Assert
    assertEquals(10.0d, actualNormalDistribution.getMean());
    assertEquals(10.0d, actualNormalDistribution.getStandardDeviation());
  }

  /**
   * Test {@link NormalDistribution#NormalDistribution(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Mean is ten.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#NormalDistribution(double, double)}
   */
  @Test
  @DisplayName("Test new NormalDistribution(double, double); when ten; then return Mean is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NormalDistribution.<init>(double, double)"})
  void testNewNormalDistribution_whenTen_thenReturnMeanIsTen() {
    // Arrange and Act
    NormalDistribution actualNormalDistribution = new NormalDistribution(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualNormalDistribution.getMean());
    assertEquals(10.0d, actualNormalDistribution.getStandardDeviation());
  }

  /**
   * Test {@link NormalDistribution#NormalDistribution(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Mean is zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#NormalDistribution(double, double)}
   */
  @Test
  @DisplayName("Test new NormalDistribution(double, double); when zero; then return Mean is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NormalDistribution.<init>(double, double)"})
  void testNewNormalDistribution_whenZero_thenReturnMeanIsZero() {
    // Arrange and Act
    NormalDistribution actualNormalDistribution = new NormalDistribution(0.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualNormalDistribution.getMean());
    assertEquals(10.0d, actualNormalDistribution.getStandardDeviation());
  }

  /**
   * Test {@link NormalDistribution#NormalDistribution(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Mean is zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#NormalDistribution(double, double,
   * RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new NormalDistribution(double, double, RandomEngine); when zero; then return Mean is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NormalDistribution.<init>(double, double, RandomEngine)"})
  void testNewNormalDistribution_whenZero_thenReturnMeanIsZero2() {
    // Arrange and Act
    NormalDistribution actualNormalDistribution =
        new NormalDistribution(0.0d, 10.0d, new MersenneTwister());

    // Assert
    assertEquals(0.0d, actualNormalDistribution.getMean());
    assertEquals(10.0d, actualNormalDistribution.getStandardDeviation());
  }

  /**
   * Test {@link NormalDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code -1.414213562373095}.
   *   <li>Then return {@code 0.07864960352514244}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getCDF(Double) with 'Double'; when '-1.414213562373095'; then return '0.07864960352514244'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_when1414213562373095_thenReturn007864960352514244() {
    // Arrange, Act and Assert
    assertEquals(
        0.07864960352514244d, new NormalDistribution(10.0d, 10.0d).getCDF(-1.414213562373095d));
  }

  /**
   * Test {@link NormalDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return {@code 9.067505535168582E-10}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getCDF(Double) with 'Double'; when '-6.0136873569177505'; then return '9.067505535168582E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_when60136873569177505_thenReturn9067505535168582e10() {
    // Arrange, Act and Assert
    assertEquals(
        9.067505535168582E-10d, new NormalDistribution(10.0d, 10.0d).getCDF(-6.0136873569177505d));
  }

  /**
   * Test {@link NormalDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when ten; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenTen_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new NormalDistribution(10.0d, 10.0d).getCDF(10.0d));
  }

  /**
   * Test {@link NormalDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9772498680518208}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when two; then return '0.9772498680518208'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenTwo_thenReturn09772498680518208() {
    // Arrange, Act and Assert
    assertEquals(0.9772498680518208d, new NormalDistribution(10.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link NormalDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when zero; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenZero_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, new NormalDistribution(10.0d, 10.0d).getCDF(0.0d));
  }

  /**
   * Test {@link NormalDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.028969155276148274}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; when two; then return '0.028969155276148274'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_whenTwo_thenReturn0028969155276148274() {
    // Arrange, Act and Assert
    assertEquals(0.028969155276148274d, new NormalDistribution(10.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link NormalDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code -1.8663203697038822}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '-1.8663203697038822'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.nextRandom()"})
  void testNextRandom_thenReturn18663203697038822() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomEngine = new MersenneTwister(d);

    // Act and Assert
    assertEquals(
        -1.8663203697038822d, new NormalDistribution(2.0d, 2.0d, randomEngine).nextRandom());
  }

  /**
   * Test {@link NormalDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 3.9142236231230907}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '3.9142236231230907'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.nextRandom()"})
  void testNextRandom_thenReturn39142236231230907() {
    // Arrange, Act and Assert
    assertEquals(
        3.9142236231230907d,
        new NormalDistribution(2.0d, 2.0d, new MersenneTwister()).nextRandom());
  }

  /**
   * Test {@link NormalDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code -6.361340902404056}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '1.0E-10'; then return '-6.361340902404056'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when10e10_thenReturn6361340902404056() {
    // Arrange, Act and Assert
    assertEquals(-6.361340902404056d, new NormalDistribution(10.0d, 10.0d).getInverseCDF(1.0E-10d));
  }

  /**
   * Test {@link NormalDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.8646647167633873}.
   *   <li>Then return {@code 1.1015196284987503}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '0.8646647167633873'; then return '1.1015196284987503'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when08646647167633873_thenReturn11015196284987503() {
    // Arrange, Act and Assert
    assertEquals(
        1.1015196284987503d,
        new NormalDistribution(10.0d, 10.0d).getInverseCDF(0.8646647167633873d));
  }

  /**
   * Test {@link NormalDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.9999999999999999}.
   *   <li>Then return {@code 8.209536151601387}.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '0.9999999999999999'; then return '8.209536151601387'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NormalDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when09999999999999999_thenReturn8209536151601387() {
    // Arrange, Act and Assert
    assertEquals(
        8.209536151601387d,
        new NormalDistribution(10.0d, 10.0d).getInverseCDF(0.9999999999999999d));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NormalDistribution#getMean()}
   *   <li>{@link NormalDistribution#getStandardDeviation()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalDistribution.getMean()",
    "double NormalDistribution.getStandardDeviation()"
  })
  void testGettersAndSetters() {
    // Arrange
    NormalDistribution normalDistribution = new NormalDistribution(10.0d, 10.0d);

    // Act
    double actualMean = normalDistribution.getMean();

    // Assert
    assertEquals(10.0d, actualMean);
    assertEquals(10.0d, normalDistribution.getStandardDeviation());
  }

  /**
   * Test {@link NormalDistribution#equals(Object)}, and {@link NormalDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NormalDistribution#equals(Object)}
   *   <li>{@link NormalDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NormalDistribution.equals(Object)",
    "int NormalDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NormalDistribution normalDistribution = new NormalDistribution(10.0d, 10.0d);
    NormalDistribution normalDistribution2 = new NormalDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(normalDistribution, normalDistribution2);
    assertEquals(normalDistribution.hashCode(), normalDistribution2.hashCode());
  }

  /**
   * Test {@link NormalDistribution#equals(Object)}, and {@link NormalDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NormalDistribution#equals(Object)}
   *   <li>{@link NormalDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NormalDistribution.equals(Object)",
    "int NormalDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NormalDistribution normalDistribution = new NormalDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(normalDistribution, normalDistribution);
    int expectedHashCodeResult = normalDistribution.hashCode();
    assertEquals(expectedHashCodeResult, normalDistribution.hashCode());
  }

  /**
   * Test {@link NormalDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NormalDistribution.equals(Object)",
    "int NormalDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NormalDistribution(10.0d, 10.0d), 1);
  }

  /**
   * Test {@link NormalDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NormalDistribution.equals(Object)",
    "int NormalDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    NormalDistribution normalDistribution = new NormalDistribution(1.0d, 10.0d);

    // Act and Assert
    assertNotEquals(normalDistribution, new NormalDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link NormalDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NormalDistribution.equals(Object)",
    "int NormalDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    NormalDistribution normalDistribution = new NormalDistribution(10.0d, 1.0d);

    // Act and Assert
    assertNotEquals(normalDistribution, new NormalDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link NormalDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NormalDistribution.equals(Object)",
    "int NormalDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NormalDistribution(10.0d, 10.0d), null);
  }

  /**
   * Test {@link NormalDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NormalDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NormalDistribution.equals(Object)",
    "int NormalDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new NormalDistribution(10.0d, 10.0d), "Different type to NormalDistribution");
  }
}
