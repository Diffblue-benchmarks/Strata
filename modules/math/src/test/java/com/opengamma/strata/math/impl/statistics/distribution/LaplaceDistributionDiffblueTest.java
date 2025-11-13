package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LaplaceDistributionDiffblueTest {
  /**
   * Test {@link LaplaceDistribution#LaplaceDistribution(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return B is ten.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#LaplaceDistribution(double, double,
   * RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new LaplaceDistribution(double, double, RandomEngine); when MersenneTwister(); then return B is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LaplaceDistribution.<init>(double, double, RandomEngine)"})
  void testNewLaplaceDistribution_whenMersenneTwister_thenReturnBIsTen() {
    // Arrange and Act
    LaplaceDistribution actualLaplaceDistribution =
        new LaplaceDistribution(10.0d, 10.0d, new MersenneTwister());

    // Assert
    assertEquals(10.0d, actualLaplaceDistribution.getB());
    assertEquals(10.0d, actualLaplaceDistribution.getMu());
  }

  /**
   * Test {@link LaplaceDistribution#LaplaceDistribution(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return B is ten.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#LaplaceDistribution(double, double)}
   */
  @Test
  @DisplayName("Test new LaplaceDistribution(double, double); when ten; then return B is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LaplaceDistribution.<init>(double, double)"})
  void testNewLaplaceDistribution_whenTen_thenReturnBIsTen() {
    // Arrange and Act
    LaplaceDistribution actualLaplaceDistribution = new LaplaceDistribution(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualLaplaceDistribution.getB());
    assertEquals(10.0d, actualLaplaceDistribution.getMu());
  }

  /**
   * Test {@link LaplaceDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.22466448205861078}.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when two; then return '0.22466448205861078'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LaplaceDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenTwo_thenReturn022466448205861078() {
    // Arrange, Act and Assert
    assertEquals(0.22466448205861078d, new LaplaceDistribution(10.0d, 10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link LaplaceDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName("Test getInverseCDF(Double) with 'Double'; when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LaplaceDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_whenZero_thenReturnNegative_infinity() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NEGATIVE_INFINITY, new LaplaceDistribution(10.0d, 10.0d).getInverseCDF(0.0d));
  }

  /**
   * Test {@link LaplaceDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.022466448205861078}.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; when two; then return '0.022466448205861078'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LaplaceDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_whenTwo_thenReturn0022466448205861078() {
    // Arrange, Act and Assert
    assertEquals(0.022466448205861078d, new LaplaceDistribution(10.0d, 10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link LaplaceDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code -9.223372036854776E18}.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '-9.223372036854776E18'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LaplaceDistribution.nextRandom()"})
  void testNextRandom_thenReturn9223372036854776e18() {
    // Arrange, Act and Assert
    assertEquals(
        -9.223372036854776E18d,
        new LaplaceDistribution(-9.223372036854776E18d, 10.0d).nextRandom());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LaplaceDistribution#getB()}
   *   <li>{@link LaplaceDistribution#getMu()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LaplaceDistribution.getB()", "double LaplaceDistribution.getMu()"})
  void testGettersAndSetters() {
    // Arrange
    LaplaceDistribution laplaceDistribution = new LaplaceDistribution(10.0d, 10.0d);

    // Act
    double actualB = laplaceDistribution.getB();

    // Assert
    assertEquals(10.0d, actualB);
    assertEquals(10.0d, laplaceDistribution.getMu());
  }

  /**
   * Test {@link LaplaceDistribution#equals(Object)}, and {@link LaplaceDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LaplaceDistribution#equals(Object)}
   *   <li>{@link LaplaceDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LaplaceDistribution.equals(Object)",
    "int LaplaceDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LaplaceDistribution laplaceDistribution = new LaplaceDistribution(10.0d, 10.0d);
    LaplaceDistribution laplaceDistribution2 = new LaplaceDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(laplaceDistribution, laplaceDistribution2);
    assertEquals(laplaceDistribution.hashCode(), laplaceDistribution2.hashCode());
  }

  /**
   * Test {@link LaplaceDistribution#equals(Object)}, and {@link LaplaceDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LaplaceDistribution#equals(Object)}
   *   <li>{@link LaplaceDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LaplaceDistribution.equals(Object)",
    "int LaplaceDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LaplaceDistribution laplaceDistribution = new LaplaceDistribution(10.0d, 10.0d);

    // Act and Assert
    assertEquals(laplaceDistribution, laplaceDistribution);
    int expectedHashCodeResult = laplaceDistribution.hashCode();
    assertEquals(expectedHashCodeResult, laplaceDistribution.hashCode());
  }

  /**
   * Test {@link LaplaceDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LaplaceDistribution.equals(Object)",
    "int LaplaceDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new LaplaceDistribution(10.0d, 10.0d), 1);
  }

  /**
   * Test {@link LaplaceDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LaplaceDistribution.equals(Object)",
    "int LaplaceDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LaplaceDistribution laplaceDistribution = new LaplaceDistribution(1.0d, 10.0d);

    // Act and Assert
    assertNotEquals(laplaceDistribution, new LaplaceDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link LaplaceDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LaplaceDistribution.equals(Object)",
    "int LaplaceDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LaplaceDistribution laplaceDistribution = new LaplaceDistribution(10.0d, 1.0d);

    // Act and Assert
    assertNotEquals(laplaceDistribution, new LaplaceDistribution(10.0d, 10.0d));
  }

  /**
   * Test {@link LaplaceDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LaplaceDistribution.equals(Object)",
    "int LaplaceDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new LaplaceDistribution(10.0d, 10.0d), null);
  }

  /**
   * Test {@link LaplaceDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LaplaceDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LaplaceDistribution.equals(Object)",
    "int LaplaceDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new LaplaceDistribution(10.0d, 10.0d), "Different type to LaplaceDistribution");
  }
}
