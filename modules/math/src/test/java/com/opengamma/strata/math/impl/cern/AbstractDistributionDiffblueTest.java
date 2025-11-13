package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractDistributionDiffblueTest {
  /**
   * Test {@link AbstractDistribution#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>Then return {@code 7.128034131906791}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); then return '7.128034131906791'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractDistribution.applyAsDouble(double)"})
  void testApplyAsDouble_thenReturn7128034131906791() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(7.128034131906791d, chiSquare.applyAsDouble(10.0d));
  }

  /**
   * Test {@link AbstractDistribution#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>Then return {@code 13.397094781556726}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); then return '13.397094781556726'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractDistribution.applyAsDouble(double)"})
  void testApplyAsDouble_thenReturn13397094781556726() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(13.397094781556726d, chiSquare.applyAsDouble(10.0d));
  }

  /**
   * Test {@link AbstractDistribution#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>Then return {@code 14.041316367978501}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); then return '14.041316367978501'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractDistribution.applyAsDouble(double)"})
  void testApplyAsDouble_thenReturn14041316367978501() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(14.041316367978501d, chiSquare.applyAsDouble(10.0d));
  }

  /**
   * Test {@link AbstractDistribution#applyAsInt(int)}.
   *
   * <ul>
   *   <li>Then return fourteen.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#applyAsInt(int)}
   */
  @Test
  @DisplayName("Test applyAsInt(int); then return fourteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractDistribution.applyAsInt(int)"})
  void testApplyAsInt_thenReturnFourteen() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(14, chiSquare.applyAsInt(1));
  }

  /**
   * Test {@link AbstractDistribution#applyAsInt(int)}.
   *
   * <ul>
   *   <li>Then return seven.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#applyAsInt(int)}
   */
  @Test
  @DisplayName("Test applyAsInt(int); then return seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractDistribution.applyAsInt(int)"})
  void testApplyAsInt_thenReturnSeven() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(7, chiSquare.applyAsInt(1));
  }

  /**
   * Test {@link AbstractDistribution#applyAsInt(int)}.
   *
   * <ul>
   *   <li>Then return thirteen.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#applyAsInt(int)}
   */
  @Test
  @DisplayName("Test applyAsInt(int); then return thirteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractDistribution.applyAsInt(int)"})
  void testApplyAsInt_thenReturnThirteen() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(13, chiSquare.applyAsInt(1));
  }

  /**
   * Test {@link AbstractDistribution#clone()}.
   *
   * <ul>
   *   <li>Then RandomGenerator return {@link MersenneTwister}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#clone()}
   */
  @Test
  @DisplayName("Test clone(); then RandomGenerator return MersenneTwister")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDistribution.clone()"})
  void testClone_thenRandomGeneratorReturnMersenneTwister() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act
    Object actualCloneResult = chiSquare.clone();

    // Assert
    assertTrue(actualCloneResult instanceof ChiSquare);
    assertTrue(((ChiSquare) actualCloneResult).getRandomGenerator() instanceof MersenneTwister);
    assertEquals(10.0d, ((ChiSquare) actualCloneResult).freedom);
  }

  /**
   * Test {@link AbstractDistribution#clone()}.
   *
   * <ul>
   *   <li>Then return RandomGenerator is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#clone()}
   */
  @Test
  @DisplayName("Test clone(); then return RandomGenerator is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractDistribution.clone()"})
  void testClone_thenReturnRandomGeneratorIsNull() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());
    chiSquare.setRandomGenerator(null);

    // Act
    Object actualCloneResult = chiSquare.clone();

    // Assert
    assertTrue(actualCloneResult instanceof ChiSquare);
    assertNull(((ChiSquare) actualCloneResult).getRandomGenerator());
    assertEquals(10.0d, ((ChiSquare) actualCloneResult).freedom);
  }

  /**
   * Test {@link AbstractDistribution#getRandomGenerator()}.
   *
   * <p>Method under test: {@link AbstractDistribution#getRandomGenerator()}
   */
  @Test
  @DisplayName("Test getRandomGenerator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RandomEngine AbstractDistribution.getRandomGenerator()"})
  void testGetRandomGenerator() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act
    RandomEngine actualRandomGenerator = chiSquare.getRandomGenerator();

    // Assert
    assertTrue(actualRandomGenerator instanceof MersenneTwister);
    assertSame(chiSquare.randomGenerator, actualRandomGenerator);
  }

  /**
   * Test {@link AbstractDistribution#makeDefaultGenerator()}.
   *
   * <p>Method under test: {@link AbstractDistribution#makeDefaultGenerator()}
   */
  @Test
  @DisplayName("Test makeDefaultGenerator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RandomEngine AbstractDistribution.makeDefaultGenerator()"})
  void testMakeDefaultGenerator() {
    // Arrange, Act and Assert
    assertTrue(AbstractDistribution.makeDefaultGenerator() instanceof MersenneTwister);
  }

  /**
   * Test {@link AbstractDistribution#nextInt()}.
   *
   * <ul>
   *   <li>Then return fourteen.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#nextInt()}
   */
  @Test
  @DisplayName("Test nextInt(); then return fourteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractDistribution.nextInt()"})
  void testNextInt_thenReturnFourteen() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(14, chiSquare.nextInt());
  }

  /**
   * Test {@link AbstractDistribution#nextInt()}.
   *
   * <ul>
   *   <li>Then return seven.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#nextInt()}
   */
  @Test
  @DisplayName("Test nextInt(); then return seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractDistribution.nextInt()"})
  void testNextInt_thenReturnSeven() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    ChiSquare chiSquare = new ChiSquare(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(7, chiSquare.nextInt());
  }

  /**
   * Test {@link AbstractDistribution#nextInt()}.
   *
   * <ul>
   *   <li>Then return thirteen.
   * </ul>
   *
   * <p>Method under test: {@link AbstractDistribution#nextInt()}
   */
  @Test
  @DisplayName("Test nextInt(); then return thirteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractDistribution.nextInt()"})
  void testNextInt_thenReturnThirteen() {
    // Arrange
    ChiSquare chiSquare = new ChiSquare(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(13, chiSquare.nextInt());
  }
}
