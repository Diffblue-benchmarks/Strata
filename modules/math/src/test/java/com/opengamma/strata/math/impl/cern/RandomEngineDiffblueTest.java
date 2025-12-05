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

class RandomEngineDiffblueTest {
  /**
   * Test {@link RandomEngine#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister64#MersenneTwister64()}.
   *   <li>Then return {@code 0.1673597832760812}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#applyAsDouble(double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double); given MersenneTwister64(); then return '0.1673597832760812'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RandomEngine.applyAsDouble(double)"})
  void testApplyAsDouble_givenMersenneTwister64_thenReturn01673597832760812() {
    // Arrange, Act and Assert
    assertEquals(0.1673597832760812d, new MersenneTwister64().applyAsDouble(10.0d));
  }

  /**
   * Test {@link RandomEngine#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return {@code 0.6673597830813378}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#applyAsDouble(double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double); given MersenneTwister(); then return '0.6673597830813378'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RandomEngine.applyAsDouble(double)"})
  void testApplyAsDouble_givenMersenneTwister_thenReturn06673597830813378() {
    // Arrange, Act and Assert
    assertEquals(0.6673597830813378d, new MersenneTwister().applyAsDouble(10.0d));
  }

  /**
   * Test {@link RandomEngine#applyAsDouble(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.5550425935070962}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double); then return '0.5550425935070962'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RandomEngine.applyAsDouble(double)"})
  void testApplyAsDouble_thenReturn05550425935070962() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(0.5550425935070962d, new MersenneTwister(d).applyAsDouble(10.0d));
  }

  /**
   * Test {@link RandomEngine#applyAsInt(int)}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return {@code -1428678853}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#applyAsInt(int)}
   */
  @Test
  @DisplayName("Test applyAsInt(int); given MersenneTwister(); then return '-1428678853'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int RandomEngine.applyAsInt(int)"})
  void testApplyAsInt_givenMersenneTwister_thenReturn1428678853() {
    // Arrange, Act and Assert
    assertEquals(-1428678853, new MersenneTwister().applyAsInt(1));
  }

  /**
   * Test {@link RandomEngine#applyAsInt(int)}.
   *
   * <ul>
   *   <li>Then return {@code -1911077509}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#applyAsInt(int)}
   */
  @Test
  @DisplayName("Test applyAsInt(int); then return '-1911077509'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int RandomEngine.applyAsInt(int)"})
  void testApplyAsInt_thenReturn1911077509() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(-1911077509, new MersenneTwister(d).applyAsInt(1));
  }

  /**
   * Test {@link RandomEngine#makeDefault()}.
   *
   * <p>Method under test: {@link RandomEngine#makeDefault()}
   */
  @Test
  @DisplayName("Test makeDefault()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RandomEngine RandomEngine.makeDefault()"})
  void testMakeDefault() {
    // Arrange, Act and Assert
    assertTrue(RandomEngine.makeDefault() instanceof MersenneTwister);
  }

  /**
   * Test {@link RandomEngine#nextDouble()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return {@code 0.1673597832760812}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); given MersenneTwister(); then return '0.1673597832760812'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RandomEngine.nextDouble()"})
  void testNextDouble_givenMersenneTwister_thenReturn01673597832760812() {
    // Arrange, Act and Assert
    assertEquals(0.1673597832760812d, new MersenneTwister().nextDouble());
  }

  /**
   * Test {@link RandomEngine#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.05504259358411201}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.05504259358411201'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RandomEngine.nextDouble()"})
  void testNextDouble_thenReturn005504259358411201() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(0.05504259358411201d, new MersenneTwister(d).nextDouble());
  }

  /**
   * Test {@link RandomEngine#nextFloat()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister64#MersenneTwister64()}.
   *   <li>Then return {@code 0.16735978}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#nextFloat()}
   */
  @Test
  @DisplayName("Test nextFloat(); given MersenneTwister64(); then return '0.16735978'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float RandomEngine.nextFloat()"})
  void testNextFloat_givenMersenneTwister64_thenReturn016735978() {
    // Arrange, Act and Assert
    assertEquals(0.16735978f, new MersenneTwister64().nextFloat());
  }

  /**
   * Test {@link RandomEngine#nextFloat()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return {@code 0.66735977}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#nextFloat()}
   */
  @Test
  @DisplayName("Test nextFloat(); given MersenneTwister(); then return '0.66735977'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float RandomEngine.nextFloat()"})
  void testNextFloat_givenMersenneTwister_thenReturn066735977() {
    // Arrange, Act and Assert
    assertEquals(0.66735977f, new MersenneTwister().nextFloat());
  }

  /**
   * Test {@link RandomEngine#nextFloat()}.
   *
   * <ul>
   *   <li>Then return {@code 0.55504256}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#nextFloat()}
   */
  @Test
  @DisplayName("Test nextFloat(); then return '0.55504256'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float RandomEngine.nextFloat()"})
  void testNextFloat_thenReturn055504256() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(0.55504256f, new MersenneTwister(d).nextFloat());
  }

  /**
   * Test {@link RandomEngine#nextLong()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return {@code -6136128946529409786}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#nextLong()}
   */
  @Test
  @DisplayName("Test nextLong(); given MersenneTwister(); then return '-6136128946529409786'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long RandomEngine.nextLong()"})
  void testNextLong_givenMersenneTwister_thenReturn6136128946529409786() {
    // Arrange, Act and Assert
    assertEquals(-6136128946529409786L, new MersenneTwister().nextLong());
  }

  /**
   * Test {@link RandomEngine#nextLong()}.
   *
   * <ul>
   *   <li>Then return {@code -8208015399855453697}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#nextLong()}
   */
  @Test
  @DisplayName("Test nextLong(); then return '-8208015399855453697'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long RandomEngine.nextLong()"})
  void testNextLong_thenReturn8208015399855453697() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(-8208015399855453697L, new MersenneTwister(d).nextLong());
  }

  /**
   * Test {@link RandomEngine#raw()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return {@code 0.6673597830813378}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#raw()}
   */
  @Test
  @DisplayName("Test raw(); given MersenneTwister(); then return '0.6673597830813378'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RandomEngine.raw()"})
  void testRaw_givenMersenneTwister_thenReturn06673597830813378() {
    // Arrange, Act and Assert
    assertEquals(0.6673597830813378d, new MersenneTwister().raw());
  }

  /**
   * Test {@link RandomEngine#raw()}.
   *
   * <ul>
   *   <li>Then return {@code 0.5550425935070962}.
   * </ul>
   *
   * <p>Method under test: {@link RandomEngine#raw()}
   */
  @Test
  @DisplayName("Test raw(); then return '0.5550425935070962'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RandomEngine.raw()"})
  void testRaw_thenReturn05550425935070962() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(0.5550425935070962d, new MersenneTwister(d).raw());
  }
}
