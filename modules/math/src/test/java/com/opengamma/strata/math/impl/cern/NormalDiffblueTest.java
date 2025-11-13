package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalDiffblueTest {
  /**
   * Test {@link Normal#Normal(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Normal#mean} is ten.
   * </ul>
   *
   * <p>Method under test: {@link Normal#Normal(double, double, RandomEngine)}
   */
  @Test
  @DisplayName("Test new Normal(double, double, RandomEngine); when ten; then return mean is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Normal.<init>(double, double, RandomEngine)"})
  void testNewNormal_whenTen_thenReturnMeanIsTen() {
    // Arrange and Act
    Normal actualNormal = new Normal(10.0d, 10.0d, new MersenneTwister());

    // Assert
    assertEquals(0.03989422804014327d, actualNormal.SQRT_INV);
    assertEquals(10.0d, actualNormal.mean);
    assertEquals(10.0d, actualNormal.standardDeviation);
    assertEquals(100.0d, actualNormal.variance);
  }

  /**
   * Test {@link Normal#Normal(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Normal#SQRT_INV} is {@code 0.03989422804014327}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#Normal(double, double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new Normal(double, double, RandomEngine); when zero; then return SQRT_INV is '0.03989422804014327'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Normal.<init>(double, double, RandomEngine)"})
  void testNewNormal_whenZero_thenReturnSqrt_invIs003989422804014327() {
    // Arrange and Act
    Normal actualNormal = new Normal(0.0d, 10.0d, new MersenneTwister());

    // Assert
    assertEquals(0.03989422804014327d, actualNormal.SQRT_INV);
    assertEquals(0.0d, actualNormal.mean);
    assertEquals(10.0d, actualNormal.standardDeviation);
    assertEquals(100.0d, actualNormal.variance);
  }

  /**
   * Test {@link Normal#Normal(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Normal#SQRT_INV} is zero.
   * </ul>
   *
   * <p>Method under test: {@link Normal#Normal(double, double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new Normal(double, double, RandomEngine); when zero; then return SQRT_INV is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Normal.<init>(double, double, RandomEngine)"})
  void testNewNormal_whenZero_thenReturnSqrt_invIsZero() {
    // Arrange and Act
    Normal actualNormal = new Normal(0.0d, 0.0d, new MersenneTwister());

    // Assert
    assertEquals(0.0d, actualNormal.SQRT_INV);
    assertEquals(0.0d, actualNormal.mean);
    assertEquals(0.0d, actualNormal.standardDeviation);
    assertEquals(0.0d, actualNormal.variance);
  }

  /**
   * Test {@link Normal#cdf(double)}.
   *
   * <p>Method under test: {@link Normal#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.cdf(double)"})
  void testCdf() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Normal(90.02601972038427d, 10.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Normal#cdf(double)}.
   *
   * <p>Method under test: {@link Normal#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.cdf(double)"})
  void testCdf2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Normal(2232.005345946843d, 10.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Normal#cdf(double)}.
   *
   * <p>Method under test: {@link Normal#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.cdf(double)"})
  void testCdf3() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Normal(10.0d, 0.5d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Normal#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.21185539858339675}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.21185539858339675'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.cdf(double)"})
  void testCdf_thenReturn021185539858339675() {
    // Arrange, Act and Assert
    assertEquals(0.21185539858339675d, new Normal(10.0d, 10.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Normal#cdf(double)}.
   *
   * <ul>
   *   <li>When {@code 2232.005345946843}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Normal#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when '2232.005345946843'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.cdf(double)"})
  void testCdf_when2232005345946843_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, new Normal(10.0d, 10.0d, new MersenneTwister()).cdf(2232.005345946843d));
  }

  /**
   * Test {@link Normal#cdf(double)}.
   *
   * <ul>
   *   <li>When {@code 90.02601972038427}.
   *   <li>Then return {@code 0.9999999999999993}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when '90.02601972038427'; then return '0.9999999999999993'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.cdf(double)"})
  void testCdf_when9002601972038427_thenReturn09999999999999993() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999993d,
        new Normal(10.0d, 10.0d, new MersenneTwister()).cdf(90.02601972038427d));
  }

  /**
   * Test {@link Normal#cdf(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.15865525393145707}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when zero; then return '0.15865525393145707'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.cdf(double)"})
  void testCdf_whenZero_thenReturn015865525393145707() {
    // Arrange, Act and Assert
    assertEquals(0.15865525393145707d, new Normal(10.0d, 10.0d, new MersenneTwister()).cdf(0.0d));
  }

  /**
   * Test {@link Normal#nextDouble()}.
   *
   * <p>Method under test: {@link Normal#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble()"})
  void testNextDouble() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister());

    // Act
    double actualNextDoubleResult = normal.nextDouble();

    // Assert
    assertEquals(14.76141937901437d, normal.cache);
    assertEquals(19.57111811561545d, actualNextDoubleResult);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble()}.
   *
   * <p>Method under test: {@link Normal#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble()"})
  void testNextDouble2() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister64());

    // Act
    double actualNextDoubleResult = normal.nextDouble();

    // Assert
    assertEquals(-1.9654621737479268d, normal.cache);
    assertEquals(12.901514620313051d, actualNextDoubleResult);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble()}.
   *
   * <p>Method under test: {@link Normal#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble()"})
  void testNextDouble3() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister64(42));

    // Act
    double actualNextDoubleResult = normal.nextDouble();

    // Assert
    assertEquals(1.5292801936593943d, normal.cache);
    assertEquals(7.412144015579824d, actualNextDoubleResult);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <p>Method under test: {@link Normal#nextDouble(double, double)}
   */
  @Test
  @DisplayName("Test nextDouble(double, double) with 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister());

    // Act
    double actualNextDoubleResult = normal.nextDouble(10.0d, 10.0d);

    // Assert
    assertEquals(14.76141937901437d, normal.cache);
    assertEquals(19.57111811561545d, actualNextDoubleResult);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <p>Method under test: {@link Normal#nextDouble(double, double)}
   */
  @Test
  @DisplayName("Test nextDouble(double, double) with 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble2() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister64());

    // Act
    double actualNextDoubleResult = normal.nextDouble(10.0d, 10.0d);

    // Assert
    assertEquals(-1.9654621737479268d, normal.cache);
    assertEquals(12.901514620313051d, actualNextDoubleResult);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <p>Method under test: {@link Normal#nextDouble(double, double)}
   */
  @Test
  @DisplayName("Test nextDouble(double, double) with 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble3() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister64(42));

    // Act
    double actualNextDoubleResult = normal.nextDouble(10.0d, 10.0d);

    // Assert
    assertEquals(1.5292801936593943d, normal.cache);
    assertEquals(7.412144015579824d, actualNextDoubleResult);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <p>Method under test: {@link Normal#nextDouble(double, double)}
   */
  @Test
  @DisplayName("Test nextDouble(double, double) with 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble4() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister());

    // Act
    double actualNextDoubleResult = normal.nextDouble(2.3283064365386963E-10d, 10.0d);

    // Assert
    assertEquals(4.761419379247201d, normal.cache);
    assertEquals(9.571118115848282d, actualNextDoubleResult);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code -9.331601848519412}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; then return '-9.331601848519412'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_thenReturn9331601848519412() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    Normal normal = new Normal(10.0d, 10.0d, randomGenerator);

    // Act and Assert
    assertEquals(-9.331601848519412d, normal.nextDouble(10.0d, 10.0d));
    assertEquals(16.2880595267762d, normal.cache);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 10.571118115615452}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when one; then return '10.571118115615452'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_whenOne_thenReturn10571118115615452() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(10.571118115615452d, normal.nextDouble(1.0d, 10.0d));
    assertEquals(5.76141937901437d, normal.cache);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 11.571118115615452}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when two; then return '11.571118115615452'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_whenTwo_thenReturn11571118115615452() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(11.571118115615452d, normal.nextDouble(2.0d, 10.0d));
    assertEquals(6.76141937901437d, normal.cache);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code -9.331601848519412}.
   * </ul>
   *
   * <p>Method under test: {@link Normal#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '-9.331601848519412'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.nextDouble()"})
  void testNextDouble_thenReturn9331601848519412() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    Normal normal = new Normal(10.0d, 10.0d, randomGenerator);

    // Act and Assert
    assertEquals(-9.331601848519412d, normal.nextDouble());
    assertEquals(16.2880595267762d, normal.cache);
    assertTrue(normal.cacheFilled);
  }

  /**
   * Test {@link Normal#pdf(double)}.
   *
   * <p>Method under test: {@link Normal#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Normal.pdf(double)"})
  void testPdf() {
    // Arrange, Act and Assert
    assertEquals(0.028969155276148274d, new Normal(10.0d, 10.0d, new MersenneTwister()).pdf(2.0d));
  }

  /**
   * Test {@link Normal#setState(double, double)}.
   *
   * <p>Method under test: {@link Normal#setState(double, double)}
   */
  @Test
  @DisplayName("Test setState(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Normal.setState(double, double)"})
  void testSetState() {
    // Arrange
    Normal normal = new Normal(10.0d, 10.0d, new MersenneTwister());

    // Act
    normal.setState(10.0d, 10.0d);

    // Assert that nothing has changed
    assertEquals(0.03989422804014327d, normal.SQRT_INV);
    assertEquals(10.0d, normal.mean);
    assertEquals(10.0d, normal.standardDeviation);
    assertEquals(100.0d, normal.variance);
  }

  /**
   * Test {@link Normal#setState(double, double)}.
   *
   * <p>Method under test: {@link Normal#setState(double, double)}
   */
  @Test
  @DisplayName("Test setState(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Normal.setState(double, double)"})
  void testSetState2() {
    // Arrange
    Normal normal = new Normal(1.0d, 10.0d, new MersenneTwister());

    // Act
    normal.setState(10.0d, 10.0d);

    // Assert
    assertEquals(0.03989422804014327d, normal.SQRT_INV);
    assertEquals(10.0d, normal.mean);
    assertEquals(10.0d, normal.standardDeviation);
    assertEquals(100.0d, normal.variance);
  }

  /**
   * Test {@link Normal#setState(double, double)}.
   *
   * <p>Method under test: {@link Normal#setState(double, double)}
   */
  @Test
  @DisplayName("Test setState(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Normal.setState(double, double)"})
  void testSetState3() {
    // Arrange
    Normal normal = new Normal(10.0d, 1.0d, new MersenneTwister());

    // Act
    normal.setState(10.0d, 10.0d);

    // Assert
    assertEquals(0.03989422804014327d, normal.SQRT_INV);
    assertEquals(10.0d, normal.mean);
    assertEquals(10.0d, normal.standardDeviation);
    assertEquals(100.0d, normal.variance);
  }

  /**
   * Test {@link Normal#toString()}.
   *
   * <p>Method under test: {@link Normal#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String Normal.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "com.opengamma.strata.math.impl.cern.Normal(10.0,10.0)",
        new Normal(10.0d, 10.0d, new MersenneTwister()).toString());
  }
}
