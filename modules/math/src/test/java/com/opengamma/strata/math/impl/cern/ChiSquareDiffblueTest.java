package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ChiSquareDiffblueTest {
  /**
   * Test {@link ChiSquare#ChiSquare(double, RandomEngine)}.
   *
   * <ul>
   *   <li>When {@code 0.9999999999999999}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#ChiSquare(double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new ChiSquare(double, RandomEngine); when '0.9999999999999999'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChiSquare.<init>(double, RandomEngine)"})
  void testNewChiSquare_when09999999999999999_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ChiSquare(0.9999999999999999d, new MersenneTwister()));
  }

  /**
   * Test {@link ChiSquare#ChiSquare(double, RandomEngine)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then RandomGenerator return {@link MersenneTwister}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#ChiSquare(double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new ChiSquare(double, RandomEngine); when ten; then RandomGenerator return MersenneTwister")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChiSquare.<init>(double, RandomEngine)"})
  void testNewChiSquare_whenTen_thenRandomGeneratorReturnMersenneTwister() {
    // Arrange
    MersenneTwister randomGenerator = new MersenneTwister();

    // Act
    ChiSquare actualChiSquare = new ChiSquare(10.0d, randomGenerator);

    // Assert
    RandomEngine randomGenerator2 = actualChiSquare.getRandomGenerator();
    assertTrue(randomGenerator2 instanceof MersenneTwister);
    assertEquals(10.0d, actualChiSquare.freedom);
    assertSame(randomGenerator, randomGenerator2);
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.003659846827343713}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.003659846827343713'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_thenReturn0003659846827343713() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.003659846827343713d, chiSquare.cdf(2.0d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.6321205588285578}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.6321205588285578'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_thenReturn06321205588285578() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setState(2.0d);

    // Act and Assert
    assertEquals(0.6321205588285578d, chiSquare.cdf(2.0d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.8427007929497151}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.8427007929497151'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_thenReturn08427007929497151() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setState(1.0d);

    // Act and Assert
    assertEquals(0.8427007929497151d, chiSquare.cdf(2.0d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.9932620530009145}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.9932620530009145'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_thenReturn09932620530009145() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setState(2.0d);

    // Act and Assert
    assertEquals(0.9932620530009145d, chiSquare.cdf(10.0d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.9984345977419975}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.9984345977419975'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_thenReturn09984345977419975() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setState(1.0d);

    // Act and Assert
    assertEquals(0.9984345977419975d, chiSquare.cdf(10.0d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_thenReturnNaN() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setState(Double.NaN);

    // Act and Assert
    assertEquals(Double.NaN, chiSquare.cdf(2.0d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>When {@code -5.950619042843014E-4}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when '-5.950619042843014E-4'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_when5950619042843014e4_thenReturnZero() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.0d, chiSquare.cdf(-5.950619042843014E-4d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.5595067149347874}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when ten; then return '0.5595067149347874'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_whenTen_thenReturn05595067149347874() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.5595067149347874d, chiSquare.cdf(10.0d));
  }

  /**
   * Test {@link ChiSquare#cdf(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.cdf(double)"})
  void testCdf_whenZero_thenReturnZero() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.0d, chiSquare.cdf(0.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 1.155741424850933}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '1.155741424850933'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn1155741424850933() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(1.155741424850933d, chiSquare.nextDouble(1.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 3.436660114420887}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '3.436660114420887'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn3436660114420887() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64(42));

    // Act and Assert
    assertEquals(3.436660114420887d, chiSquare.nextDouble(10.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 0.6180936546649783}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '0.6180936546649783'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn06180936546649783() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(0.6180936546649783d, chiSquare.nextDouble(1.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 6.293247967941576}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '6.293247967941576'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn6293247967941576() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister64 randomGenerator = new MersenneTwister64(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(6.293247967941576d, chiSquare.nextDouble(1.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 6.919446880605637}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '6.919446880605637'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn6919446880605637() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister(42));

    // Act and Assert
    assertEquals(6.919446880605637d, chiSquare.nextDouble(10.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 7.128034131906791}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '7.128034131906791'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn7128034131906791() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(7.128034131906791d, chiSquare.nextDouble(10.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 12.724614017294025}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '12.724614017294025'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn12724614017294025() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister64 randomGenerator = new MersenneTwister64(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(12.724614017294025d, chiSquare.nextDouble(10.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 13.397094781556726}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '13.397094781556726'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn13397094781556726() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(13.397094781556726d, chiSquare.nextDouble(10.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 14.041316367978501}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '14.041316367978501'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn14041316367978501() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(14.041316367978501d, chiSquare.nextDouble(10.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 0.18767363689215874}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '0.18767363689215874'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn018767363689215874() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister(42));

    // Act and Assert
    assertEquals(0.18767363689215874d, chiSquare.nextDouble(1.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 24.675333653488998}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '24.675333653488998'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn24675333653488998() {
    // Arrange
    LocalDate ofEpochDayResult = LocalDate.ofEpochDay(1L);
    Date d = Date.from(ofEpochDayResult.atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(24.675333653488998d, chiSquare.nextDouble(10.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code 1.0750541497296464}.
   *   <li>Then return {@code 1.3698450535446332}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double) with 'double'; when '1.0750541497296464'; then return '1.3698450535446332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_when10750541497296464_thenReturn13698450535446332() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(1.3698450535446332d, chiSquare.nextDouble(1.0750541497296464d));
  }

  /**
   * Test {@link ChiSquare#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; when minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble(double)"})
  void testNextDoubleWithDouble_whenMinusOne_thenReturnZero() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.0d, chiSquare.nextDouble(-1.0d));
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 1.155741424850933}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '1.155741424850933'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn1155741424850933() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setState(1.0d);

    // Act and Assert
    assertEquals(1.155741424850933d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 3.436660114420887}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '3.436660114420887'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn3436660114420887() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64(42));

    // Act and Assert
    assertEquals(3.436660114420887d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.6180936546649783}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.6180936546649783'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn06180936546649783() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64());
    chiSquare.setState(1.0d);

    // Act and Assert
    assertEquals(0.6180936546649783d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 6.293247967941576}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '6.293247967941576'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn6293247967941576() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister64 randomGenerator = new MersenneTwister64(d);

    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);
    chiSquare.setState(1.0d);

    // Act and Assert
    assertEquals(6.293247967941576d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 6.919446880605637}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '6.919446880605637'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn6919446880605637() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister(42));

    // Act and Assert
    assertEquals(6.919446880605637d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 7.128034131906791}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '7.128034131906791'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn7128034131906791() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(7.128034131906791d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 12.724614017294025}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '12.724614017294025'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn12724614017294025() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister64 randomGenerator = new MersenneTwister64(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(12.724614017294025d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 13.397094781556726}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '13.397094781556726'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn13397094781556726() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(13.397094781556726d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 1.3698450535446332}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '1.3698450535446332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn13698450535446332() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setState(1.0750541497296464d);

    // Act and Assert
    assertEquals(1.3698450535446332d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 14.041316367978501}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '14.041316367978501'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn14041316367978501() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(14.041316367978501d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.18767363689215874}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.18767363689215874'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.nextDouble()"})
  void testNextDouble_thenReturn018767363689215874() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister(42));
    chiSquare.setState(1.0d);

    // Act and Assert
    assertEquals(0.18767363689215874d, chiSquare.nextDouble());
  }

  /**
   * Test {@link ChiSquare#pdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.007664155024384343}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); then return '0.007664155024384343'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.pdf(double)"})
  void testPdf_thenReturn0007664155024384343() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.007664155024384343d, chiSquare.pdf(2.0d));
  }

  /**
   * Test {@link ChiSquare#pdf(double)}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.pdf(double)"})
  void testPdf_thenReturnNaN() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(Double.NaN, new MersenneTwister());

    // Act and Assert
    assertEquals(Double.NaN, chiSquare.pdf(2.0d));
  }

  /**
   * Test {@link ChiSquare#pdf(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ChiSquare.pdf(double)"})
  void testPdf_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> chiSquare.pdf(0.0d));
  }

  /**
   * Test {@link ChiSquare#setState(double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999999999999999}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#setState(double)}
   */
  @Test
  @DisplayName(
      "Test setState(double); when '0.9999999999999999'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChiSquare.setState(double)"})
  void testSetState_when09999999999999999_thenThrowIllegalArgumentException() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> chiSquare.setState(0.9999999999999999d));
  }

  /**
   * Test {@link ChiSquare#setState(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link ChiSquare#setState(double)}
   */
  @Test
  @DisplayName("Test setState(double); when ten; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ChiSquare.setState(double)"})
  void testSetState_whenTen_thenDoesNotThrow() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertDoesNotThrow(() -> chiSquare.setState(10.0d));
  }

  /**
   * Test {@link ChiSquare#toString()}.
   *
   * <p>Method under test: {@link ChiSquare#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String ChiSquare.toString()"})
  void testToString() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals("com.opengamma.strata.math.impl.cern.ChiSquare(10.0)", chiSquare.toString());
  }
}
