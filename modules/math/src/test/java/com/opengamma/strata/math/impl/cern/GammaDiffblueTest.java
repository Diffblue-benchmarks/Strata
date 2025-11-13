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

class GammaDiffblueTest {
  /**
   * Test {@link Gamma#Gamma(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#Gamma(double, double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new Gamma(double, double, RandomEngine); when '1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Gamma.<init>(double, double, RandomEngine)"})
  void testNewGamma_when10e10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new Gamma(1.0E-10d, 0.0d, new MersenneTwister()));
  }

  /**
   * Test {@link Gamma#Gamma(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then RandomGenerator return {@link MersenneTwister}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#Gamma(double, double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new Gamma(double, double, RandomEngine); when ten; then RandomGenerator return MersenneTwister")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Gamma.<init>(double, double, RandomEngine)"})
  void testNewGamma_whenTen_thenRandomGeneratorReturnMersenneTwister() {
    // Arrange
    MersenneTwister randomGenerator = new MersenneTwister();

    // Act
    Gamma actualGamma = new Gamma(10.0d, 10.0d, randomGenerator);

    // Assert
    RandomEngine randomGenerator2 = actualGamma.getRandomGenerator();
    assertTrue(randomGenerator2 instanceof MersenneTwister);
    assertEquals(10.0d, actualGamma.alpha);
    assertEquals(10.0d, actualGamma.lambda);
    assertSame(randomGenerator, randomGenerator2);
  }

  /**
   * Test {@link Gamma#Gamma(double, double, RandomEngine)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#Gamma(double, double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new Gamma(double, double, RandomEngine); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Gamma.<init>(double, double, RandomEngine)"})
  void testNewGamma_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new Gamma(0.0d, 0.0d, new MersenneTwister()));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.99999999999992}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.99999999999992'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_thenReturn099999999999992() {
    // Arrange, Act and Assert
    assertEquals(
        0.99999999999992d,
        new Gamma(10.0d, 8.116141674705085E-4d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.5297427331607578}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.5297427331607578'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_thenReturn05297427331607578() {
    // Arrange, Act and Assert
    assertEquals(0.5297427331607578d, new Gamma(10.0d, 20.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.008132242796933871}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.008132242796933871'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_thenReturn0008132242796933871() {
    // Arrange, Act and Assert
    assertEquals(0.008132242796933871d, new Gamma(2.0d, 10.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.9950045876916924}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.9950045876916924'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_thenReturn09950045876916924() {
    // Arrange, Act and Assert
    assertEquals(0.9950045876916924d, new Gamma(10.0d, 10.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.9999999979388464}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.9999999979388464'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_thenReturn09999999979388464() {
    // Arrange, Act and Assert
    assertEquals(0.9999999979388464d, new Gamma(10.0d, 1.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 3.4945579774194216E-35}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '3.4945579774194216E-35'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_thenReturn34945579774194216e35() {
    // Arrange, Act and Assert
    assertEquals(
        3.4945579774194216E-35d,
        new Gamma(8.116141674705085E-4d, 10.0d, new MersenneTwister()).cdf(2.0d));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_when10e10_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Gamma(10.0d, 10.0d, new MersenneTwister()).cdf(-1.0E-10d));
  }

  /**
   * Test {@link Gamma#cdf(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.cdf(double)"})
  void testCdf_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Gamma(10.0d, 10.0d, new MersenneTwister()).cdf(0.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 0.6169927583786114}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; then return '0.6169927583786114'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_thenReturn06169927583786114() {
    // Arrange, Act and Assert
    assertEquals(
        0.6169927583786114d,
        new Gamma(10.0d, 10.0d, new MersenneTwister64()).nextDouble(10.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 0.7068531545622192}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; then return '0.7068531545622192'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_thenReturn07068531545622192() {
    // Arrange, Act and Assert
    assertEquals(
        0.7068531545622192d,
        new Gamma(10.0d, 10.0d, new MersenneTwister64(42)).nextDouble(10.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 1.1024245800957333}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; then return '1.1024245800957333'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_thenReturn11024245800957333() {
    // Arrange, Act and Assert
    assertEquals(
        1.1024245800957333d,
        new Gamma(10.0d, 10.0d, new MersenneTwister()).nextDouble(10.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 1.1536959341448783}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; then return '1.1536959341448783'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_thenReturn11536959341448783() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);

    // Act and Assert
    assertEquals(
        1.1536959341448783d, new Gamma(10.0d, 10.0d, randomGenerator).nextDouble(10.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.120158362084851E-4}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when '0.5'; then return '9.120158362084851E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_when05_thenReturn9120158362084851e4() {
    // Arrange, Act and Assert
    assertEquals(
        9.120158362084851E-4d,
        new Gamma(10.0d, 10.0d, new MersenneTwister()).nextDouble(0.5d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.0208333723}.
   *   <li>Then return {@code 5.351306359958641E-10}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when '0.0208333723'; then return '5.351306359958641E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_when00208333723_thenReturn5351306359958641e10() {
    // Arrange, Act and Assert
    assertEquals(
        5.351306359958641E-10d,
        new Gamma(10.0d, 10.0d, new MersenneTwister()).nextDouble(0.0208333723d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.0416666664}.
   *   <li>Then return {@code 3.35881379433761E-20}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when '0.0416666664'; then return '3.35881379433761E-20'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_when00416666664_thenReturn335881379433761e20() {
    // Arrange, Act and Assert
    assertEquals(
        3.35881379433761E-20d,
        new Gamma(10.0d, 10.0d, new MersenneTwister64()).nextDouble(0.0416666664d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.0416666664}.
   *   <li>Then return {@code 8.774053080976305E-6}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when '0.0416666664'; then return '8.774053080976305E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_when00416666664_thenReturn8774053080976305e6() {
    // Arrange, Act and Assert
    assertEquals(
        8.774053080976305E-6d,
        new Gamma(10.0d, 10.0d, new MersenneTwister()).nextDouble(0.0416666664d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return {@code -11.024245800957333}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when minus one; then return '-11.024245800957333'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_whenMinusOne_thenReturn11024245800957333() {
    // Arrange, Act and Assert
    assertEquals(
        -11.024245800957333d,
        new Gamma(10.0d, 10.0d, new MersenneTwister()).nextDouble(10.0d, -1.0d));
  }

  /**
   * Test {@link Gamma#nextDouble(double, double)} with {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double, double) with 'double', 'double'; when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble(double, double)"})
  void testNextDoubleWithDoubleDouble_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new Gamma(10.0d, 10.0d, new MersenneTwister()).nextDouble(-1.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()} Seed is {@code -1727483681}.
   *   <li>Then return {@code 0.2813836440660193}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName(
      "Test nextDouble(); given MersenneTwister() Seed is '-1727483681'; then return '0.2813836440660193'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_givenMersenneTwisterSeedIs1727483681_thenReturn02813836440660193() {
    // Arrange
    MersenneTwister randomGenerator = new MersenneTwister();
    randomGenerator.setSeed(-1727483681);

    // Act and Assert
    assertEquals(0.2813836440660193d, new Gamma(0.5d, 10.0d, randomGenerator).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 3.35881379433761E-20}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '3.35881379433761E-20'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn335881379433761e20() {
    // Arrange, Act and Assert
    assertEquals(
        3.35881379433761E-20d,
        new Gamma(0.0416666664d, 10.0d, new MersenneTwister64()).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.1729981152845861}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.1729981152845861'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn01729981152845861() {
    // Arrange, Act and Assert
    assertEquals(0.1729981152845861d, new Gamma(1.0d, 10.0d, new MersenneTwister64()).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.6169927583786114}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.6169927583786114'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn06169927583786114() {
    // Arrange, Act and Assert
    assertEquals(
        0.6169927583786114d, new Gamma(10.0d, 10.0d, new MersenneTwister64()).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.7068531545622192}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.7068531545622192'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn07068531545622192() {
    // Arrange, Act and Assert
    assertEquals(
        0.7068531545622192d, new Gamma(10.0d, 10.0d, new MersenneTwister64(42)).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.008041239343436351}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.008041239343436351'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn0008041239343436351() {
    // Arrange, Act and Assert
    assertEquals(
        0.008041239343436351d, new Gamma(1.0d, 10.0d, new MersenneTwister64(42)).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 8.774053080976305E-6}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '8.774053080976305E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn8774053080976305e6() {
    // Arrange, Act and Assert
    assertEquals(
        8.774053080976305E-6d, new Gamma(0.0416666664d, 10.0d, new MersenneTwister()).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 9.120158362084851E-4}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '9.120158362084851E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn9120158362084851e4() {
    // Arrange, Act and Assert
    assertEquals(9.120158362084851E-4d, new Gamma(0.5d, 10.0d, new MersenneTwister()).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.10361630858290607}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.10361630858290607'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn010361630858290607() {
    // Arrange, Act and Assert
    assertEquals(
        0.10361630858290607d, new Gamma(1.0d, 10.0d, new MersenneTwister64(227)).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 1.1024245800957333}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '1.1024245800957333'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn11024245800957333() {
    // Arrange, Act and Assert
    assertEquals(1.1024245800957333d, new Gamma(10.0d, 10.0d, new MersenneTwister()).nextDouble());
  }

  /**
   * Test {@link Gamma#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 1.1536959341448783}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '1.1536959341448783'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.nextDouble()"})
  void testNextDouble_thenReturn11536959341448783() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);

    // Act and Assert
    assertEquals(1.1536959341448783d, new Gamma(10.0d, 10.0d, randomGenerator).nextDouble());
  }

  /**
   * Test {@link Gamma#pdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); then return '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.pdf(double)"})
  void testPdf_thenReturn01() {
    // Arrange, Act and Assert
    assertEquals(0.1d, new Gamma(1.0d, 10.0d, new MersenneTwister()).pdf(0.0d));
  }

  /**
   * Test {@link Gamma#pdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 1.155175665715373E-13}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); then return '1.155175665715373E-13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.pdf(double)"})
  void testPdf_thenReturn1155175665715373e13() {
    // Arrange, Act and Assert
    assertEquals(1.155175665715373E-13d, new Gamma(10.0d, 10.0d, new MersenneTwister()).pdf(2.0d));
  }

  /**
   * Test {@link Gamma#pdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.08187307530779818}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); then return '0.08187307530779818'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.pdf(double)"})
  void testPdf_thenReturn008187307530779818() {
    // Arrange, Act and Assert
    assertEquals(0.08187307530779818d, new Gamma(1.0d, 10.0d, new MersenneTwister()).pdf(2.0d));
  }

  /**
   * Test {@link Gamma#pdf(double)}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.pdf(double)"})
  void testPdf_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new Gamma(Double.NaN, 10.0d, new MersenneTwister()).pdf(2.0d));
  }

  /**
   * Test {@link Gamma#pdf(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.pdf(double)"})
  void testPdf_when10e10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new Gamma(10.0d, 10.0d, new MersenneTwister()).pdf(-1.0E-10d));
  }

  /**
   * Test {@link Gamma#pdf(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.pdf(double)"})
  void testPdf_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new Gamma(10.0d, 10.0d, new MersenneTwister()).pdf(0.0d));
  }

  /**
   * Test {@link Gamma#setState(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#setState(double, double)}
   */
  @Test
  @DisplayName("Test setState(double, double); when '1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Gamma.setState(double, double)"})
  void testSetState_when10e10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new Gamma(10.0d, 10.0d, new MersenneTwister()).setState(1.0E-10d, 0.0d));
  }

  /**
   * Test {@link Gamma#setState(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#setState(double, double)}
   */
  @Test
  @DisplayName("Test setState(double, double); when ten; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Gamma.setState(double, double)"})
  void testSetState_whenTen_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> new Gamma(10.0d, 10.0d, new MersenneTwister()).setState(10.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#setState(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#setState(double, double)}
   */
  @Test
  @DisplayName("Test setState(double, double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Gamma.setState(double, double)"})
  void testSetState_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new Gamma(10.0d, 10.0d, new MersenneTwister()).setState(0.0d, 0.0d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '0.5'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when05_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(0.5d, 0.0416666664d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '-0.5'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when05_thenDoesNotThrow2() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(0.5d, -0.5d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '-0.5'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when05_thenDoesNotThrow3() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(1.0d, -0.5d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code -3.349403E-4}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '-3.349403E-4'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when3349403e4_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(10.0d, -3.349403E-4d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.0079849875}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '0.0079849875'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when00079849875_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(10.0d, 0.0079849875d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.0079849875}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '0.0079849875'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when00079849875_thenDoesNotThrow2() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(0.5d, 0.0079849875d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.0208333723}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '0.0208333723'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when00208333723_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(0.0208333723d, 10.0d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.0416666664}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when '0.0416666664'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_when00416666664_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(0.0416666664d, 10.0d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when minus one; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_whenMinusOne_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(10.0d, -1.0d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test staticNextDouble(double, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Gamma.staticNextDouble(-1.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when one; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_whenOne_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(1.0d, 0.0416666664d));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when one; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_whenOne_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Gamma.staticNextDouble(1.0d, Double.NaN));
  }

  /**
   * Test {@link Gamma#staticNextDouble(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Gamma#staticNextDouble(double, double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double, double); when ten; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Gamma.staticNextDouble(double, double)"})
  void testStaticNextDouble_whenTen_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> Gamma.staticNextDouble(10.0d, 10.0d));
  }

  /**
   * Test {@link Gamma#toString()}.
   *
   * <p>Method under test: {@link Gamma#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String Gamma.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "com.opengamma.strata.math.impl.cern.Gamma(10.0,10.0)",
        new Gamma(10.0d, 10.0d, new MersenneTwister()).toString());
  }
}
