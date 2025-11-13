package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.MersenneTwister64;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ChiSquareDistributionDiffblueTest {
  /**
   * Test {@link ChiSquareDistribution#ChiSquareDistribution(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return DegreesOfFreedom is ten.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#ChiSquareDistribution(double)}
   */
  @Test
  @DisplayName(
      "Test new ChiSquareDistribution(double); when ten; then return DegreesOfFreedom is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChiSquareDistribution.<init>(double)"})
  void testNewChiSquareDistribution_whenTen_thenReturnDegreesOfFreedomIsTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new ChiSquareDistribution(10.0d).getDegreesOfFreedom());
  }

  /**
   * Test {@link ChiSquareDistribution#ChiSquareDistribution(double, RandomEngine)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return DegreesOfFreedom is ten.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#ChiSquareDistribution(double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new ChiSquareDistribution(double, RandomEngine); when ten; then return DegreesOfFreedom is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChiSquareDistribution.<init>(double, RandomEngine)"})
  void testNewChiSquareDistribution_whenTen_thenReturnDegreesOfFreedomIsTen2() {
    // Arrange and Act
    ChiSquareDistribution actualChiSquareDistribution =
        new ChiSquareDistribution(10.0d, new MersenneTwister());

    // Assert
    assertEquals(10.0d, actualChiSquareDistribution.getDegreesOfFreedom());
  }

  /**
   * Test {@link ChiSquareDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code -5.950619042843014E-4}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when '-5.950619042843014E-4'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_when5950619042843014e4_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new ChiSquareDistribution(10.0d).getCDF(-5.950619042843014E-4d));
  }

  /**
   * Test {@link ChiSquareDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.003659846827343713}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when two; then return '0.003659846827343713'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenTwo_thenReturn0003659846827343713() {
    // Arrange, Act and Assert
    assertEquals(0.003659846827343713d, new ChiSquareDistribution(10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link ChiSquareDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.007664155024384343}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; when two; then return '0.007664155024384343'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_whenTwo_thenReturn0007664155024384343() {
    // Arrange, Act and Assert
    assertEquals(0.007664155024384343d, new ChiSquareDistribution(10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link ChiSquareDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code 0.4549364231195734}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName("Test getInverseCDF(Double) with 'Double'; then return '0.4549364231195734'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_thenReturn04549364231195734() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution =
        new ChiSquareDistribution(1.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.4549364231195734d, chiSquareDistribution.getInverseCDF(0.5d));
  }

  /**
   * Test {@link ChiSquareDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.341817765592316}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '0.5'; then return '9.341817765592316'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when05_thenReturn9341817765592316() {
    // Arrange, Act and Assert
    assertEquals(9.341817765592316d, new ChiSquareDistribution(10.0d).getInverseCDF(0.5d));
  }

  /**
   * Test {@link ChiSquareDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return {@code 0.0207786897050036}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '1.0E-12'; then return '0.0207786897050036'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when10e12_thenReturn00207786897050036() {
    // Arrange, Act and Assert
    assertEquals(0.0207786897050036d, new ChiSquareDistribution(10.0d).getInverseCDF(1.0E-12d));
  }

  /**
   * Test {@link ChiSquareDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.8435}.
   *   <li>Then return {@code 2.007723522774013}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '0.8435'; then return '2.007723522774013'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when08435_thenReturn2007723522774013() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution =
        new ChiSquareDistribution(1.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(2.007723522774013d, chiSquareDistribution.getInverseCDF(0.8435d));
  }

  /**
   * Test {@link ChiSquareDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 1.155741424850933}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '1.155741424850933'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.nextRandom()"})
  void testNextRandom_thenReturn1155741424850933() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution =
        new ChiSquareDistribution(1.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(1.155741424850933d, chiSquareDistribution.nextRandom());
  }

  /**
   * Test {@link ChiSquareDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 0.2613142042796191}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '0.2613142042796191'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.nextRandom()"})
  void testNextRandom_thenReturn02613142042796191() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister engine = new MersenneTwister(d);
    ChiSquareDistribution chiSquareDistribution = new ChiSquareDistribution(1.0d, engine);

    // Act and Assert
    assertEquals(0.2613142042796191d, chiSquareDistribution.nextRandom());
  }

  /**
   * Test {@link ChiSquareDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 0.6180936546649783}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '0.6180936546649783'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.nextRandom()"})
  void testNextRandom_thenReturn06180936546649783() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution =
        new ChiSquareDistribution(1.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(0.6180936546649783d, chiSquareDistribution.nextRandom());
  }

  /**
   * Test {@link ChiSquareDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 6.293247967941576}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '6.293247967941576'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.nextRandom()"})
  void testNextRandom_thenReturn6293247967941576() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister64 engine = new MersenneTwister64(d);
    ChiSquareDistribution chiSquareDistribution = new ChiSquareDistribution(1.0d, engine);

    // Act and Assert
    assertEquals(6.293247967941576d, chiSquareDistribution.nextRandom());
  }

  /**
   * Test {@link ChiSquareDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 1.3698450535446332}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '1.3698450535446332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.nextRandom()"})
  void testNextRandom_thenReturn13698450535446332() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution =
        new ChiSquareDistribution(1.0750541497296464d, new MersenneTwister());

    // Act and Assert
    assertEquals(1.3698450535446332d, chiSquareDistribution.nextRandom());
  }

  /**
   * Test {@link ChiSquareDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 0.18767363689215874}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '0.18767363689215874'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.nextRandom()"})
  void testNextRandom_thenReturn018767363689215874() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution =
        new ChiSquareDistribution(1.0d, new MersenneTwister(42));

    // Act and Assert
    assertEquals(0.18767363689215874d, chiSquareDistribution.nextRandom());
  }

  /**
   * Test {@link ChiSquareDistribution#getDegreesOfFreedom()}.
   *
   * <p>Method under test: {@link ChiSquareDistribution#getDegreesOfFreedom()}
   */
  @Test
  @DisplayName("Test getDegreesOfFreedom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquareDistribution.getDegreesOfFreedom()"})
  void testGetDegreesOfFreedom() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new ChiSquareDistribution(10.0d).getDegreesOfFreedom());
  }

  /**
   * Test {@link ChiSquareDistribution#equals(Object)}, and {@link
   * ChiSquareDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ChiSquareDistribution#equals(Object)}
   *   <li>{@link ChiSquareDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChiSquareDistribution.equals(Object)",
    "int ChiSquareDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution = new ChiSquareDistribution(10.0d);
    ChiSquareDistribution chiSquareDistribution2 = new ChiSquareDistribution(10.0d);

    // Act and Assert
    assertEquals(chiSquareDistribution, chiSquareDistribution2);
    assertEquals(chiSquareDistribution.hashCode(), chiSquareDistribution2.hashCode());
  }

  /**
   * Test {@link ChiSquareDistribution#equals(Object)}, and {@link
   * ChiSquareDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ChiSquareDistribution#equals(Object)}
   *   <li>{@link ChiSquareDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChiSquareDistribution.equals(Object)",
    "int ChiSquareDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution = new ChiSquareDistribution(10.0d);

    // Act and Assert
    assertEquals(chiSquareDistribution, chiSquareDistribution);
    int expectedHashCodeResult = chiSquareDistribution.hashCode();
    assertEquals(expectedHashCodeResult, chiSquareDistribution.hashCode());
  }

  /**
   * Test {@link ChiSquareDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChiSquareDistribution.equals(Object)",
    "int ChiSquareDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChiSquareDistribution(10.0d), 1);
  }

  /**
   * Test {@link ChiSquareDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChiSquareDistribution.equals(Object)",
    "int ChiSquareDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ChiSquareDistribution chiSquareDistribution = new ChiSquareDistribution(1.0d);

    // Act and Assert
    assertNotEquals(chiSquareDistribution, new ChiSquareDistribution(10.0d));
  }

  /**
   * Test {@link ChiSquareDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChiSquareDistribution.equals(Object)",
    "int ChiSquareDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChiSquareDistribution(10.0d), null);
  }

  /**
   * Test {@link ChiSquareDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquareDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ChiSquareDistribution.equals(Object)",
    "int ChiSquareDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new ChiSquareDistribution(10.0d), "Different type to ChiSquareDistribution");
  }
}
