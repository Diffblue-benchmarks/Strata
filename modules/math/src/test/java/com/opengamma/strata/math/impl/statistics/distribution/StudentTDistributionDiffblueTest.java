package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.MersenneTwister64;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StudentTDistributionDiffblueTest {
  /**
   * Test {@link StudentTDistribution#StudentTDistribution(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return DegreesOfFreedom is ten.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#StudentTDistribution(double)}
   */
  @Test
  @DisplayName(
      "Test new StudentTDistribution(double); when ten; then return DegreesOfFreedom is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTDistribution.<init>(double)"})
  void testNewStudentTDistribution_whenTen_thenReturnDegreesOfFreedomIsTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new StudentTDistribution(10.0d).getDegreesOfFreedom());
  }

  /**
   * Test {@link StudentTDistribution#StudentTDistribution(double, RandomEngine)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return DegreesOfFreedom is ten.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#StudentTDistribution(double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new StudentTDistribution(double, RandomEngine); when ten; then return DegreesOfFreedom is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTDistribution.<init>(double, RandomEngine)"})
  void testNewStudentTDistribution_whenTen_thenReturnDegreesOfFreedomIsTen2() {
    // Arrange and Act
    StudentTDistribution actualStudentTDistribution =
        new StudentTDistribution(10.0d, new MersenneTwister());

    // Assert
    assertEquals(10.0d, actualStudentTDistribution.getDegreesOfFreedom());
  }

  /**
   * Test {@link StudentTDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code 0.3139468028714864}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when '-0.5'; then return '0.3139468028714864'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_when05_thenReturn03139468028714864() {
    // Arrange, Act and Assert
    assertEquals(0.3139468028714864d, new StudentTDistribution(10.0d).getCDF(-0.5d));
  }

  /**
   * Test {@link StudentTDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9633059826146299}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when two; then return '0.9633059826146299'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenTwo_thenReturn09633059826146299() {
    // Arrange, Act and Assert
    assertEquals(0.9633059826146299d, new StudentTDistribution(10.0d).getCDF(2.0d));
  }

  /**
   * Test {@link StudentTDistribution#getCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#getCDF(Double)}
   */
  @Test
  @DisplayName("Test getCDF(Double) with 'Double'; when zero; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getCDF(Double)"})
  void testGetCDFWithDouble_whenZero_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, new StudentTDistribution(10.0d).getCDF(0.0d));
  }

  /**
   * Test {@link StudentTDistribution#getPDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.061145766321151485}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#getPDF(Double)}
   */
  @Test
  @DisplayName("Test getPDF(Double) with 'Double'; when two; then return '0.061145766321151485'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getPDF(Double)"})
  void testGetPDFWithDouble_whenTwo_thenReturn0061145766321151485() {
    // Arrange, Act and Assert
    assertEquals(0.061145766321151485d, new StudentTDistribution(10.0d).getPDF(2.0d));
  }

  /**
   * Test {@link StudentTDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code -0.8639599449216312}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '-0.8639599449216312'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.nextRandom()"})
  void testNextRandom_thenReturn08639599449216312() {
    // Arrange
    StudentTDistribution studentTDistribution =
        new StudentTDistribution(10.0d, new MersenneTwister64(42));

    // Act and Assert
    assertEquals(-0.8639599449216312d, studentTDistribution.nextRandom());
  }

  /**
   * Test {@link StudentTDistribution#nextRandom()}.
   *
   * <ul>
   *   <li>Then return {@code 0.49007448634511386}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#nextRandom()}
   */
  @Test
  @DisplayName("Test nextRandom(); then return '0.49007448634511386'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.nextRandom()"})
  void testNextRandom_thenReturn049007448634511386() {
    // Arrange
    StudentTDistribution studentTDistribution =
        new StudentTDistribution(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.49007448634511386d, studentTDistribution.nextRandom());
  }

  /**
   * Test {@link StudentTDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return {@code -1.6816245718676452}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName("Test getInverseCDF(Double) with 'Double'; then return '-1.6816245718676452'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_thenReturn16816245718676452() {
    // Arrange
    StudentTDistribution studentTDistribution =
        new StudentTDistribution(1.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(-1.6816245718676452d, studentTDistribution.getInverseCDF(0.17076880792803717d));
  }

  /**
   * Test {@link StudentTDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return {@code -102.05070688222632}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '1.0E-16'; then return '-102.05070688222632'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when10e16_thenReturn10205070688222632() {
    // Arrange, Act and Assert
    assertEquals(-102.05070688222632d, new StudentTDistribution(10.0d).getInverseCDF(1.0E-16d));
  }

  /**
   * Test {@link StudentTDistribution#getInverseCDF(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.17076880792803717}.
   *   <li>Then return {@code -0.9986021275039708}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#getInverseCDF(Double)}
   */
  @Test
  @DisplayName(
      "Test getInverseCDF(Double) with 'Double'; when '0.17076880792803717'; then return '-0.9986021275039708'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getInverseCDF(Double)"})
  void testGetInverseCDFWithDouble_when017076880792803717_thenReturn09986021275039708() {
    // Arrange, Act and Assert
    assertEquals(
        -0.9986021275039708d, new StudentTDistribution(10.0d).getInverseCDF(0.17076880792803717d));
  }

  /**
   * Test {@link StudentTDistribution#getDegreesOfFreedom()}.
   *
   * <p>Method under test: {@link StudentTDistribution#getDegreesOfFreedom()}
   */
  @Test
  @DisplayName("Test getDegreesOfFreedom()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentTDistribution.getDegreesOfFreedom()"})
  void testGetDegreesOfFreedom() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new StudentTDistribution(10.0d).getDegreesOfFreedom());
  }

  /**
   * Test {@link StudentTDistribution#equals(Object)}, and {@link StudentTDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StudentTDistribution#equals(Object)}
   *   <li>{@link StudentTDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StudentTDistribution.equals(Object)",
    "int StudentTDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    StudentTDistribution studentTDistribution = new StudentTDistribution(10.0d);
    StudentTDistribution studentTDistribution2 = new StudentTDistribution(10.0d);

    // Act and Assert
    assertEquals(studentTDistribution, studentTDistribution2);
    assertEquals(studentTDistribution.hashCode(), studentTDistribution2.hashCode());
  }

  /**
   * Test {@link StudentTDistribution#equals(Object)}, and {@link StudentTDistribution#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link StudentTDistribution#equals(Object)}
   *   <li>{@link StudentTDistribution#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StudentTDistribution.equals(Object)",
    "int StudentTDistribution.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    StudentTDistribution studentTDistribution = new StudentTDistribution(10.0d);

    // Act and Assert
    assertEquals(studentTDistribution, studentTDistribution);
    int expectedHashCodeResult = studentTDistribution.hashCode();
    assertEquals(expectedHashCodeResult, studentTDistribution.hashCode());
  }

  /**
   * Test {@link StudentTDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StudentTDistribution.equals(Object)",
    "int StudentTDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StudentTDistribution(10.0d), 1);
  }

  /**
   * Test {@link StudentTDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StudentTDistribution.equals(Object)",
    "int StudentTDistribution.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    StudentTDistribution studentTDistribution = new StudentTDistribution(0.5d);

    // Act and Assert
    assertNotEquals(studentTDistribution, new StudentTDistribution(10.0d));
  }

  /**
   * Test {@link StudentTDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StudentTDistribution.equals(Object)",
    "int StudentTDistribution.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StudentTDistribution(10.0d), null);
  }

  /**
   * Test {@link StudentTDistribution#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link StudentTDistribution#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean StudentTDistribution.equals(Object)",
    "int StudentTDistribution.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new StudentTDistribution(10.0d), "Different type to StudentTDistribution");
  }
}
