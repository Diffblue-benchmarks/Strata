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

class MersenneTwisterDiffblueTest {
  /**
   * Test {@link MersenneTwister#clone()}.
   *
   * <p>Method under test: {@link MersenneTwister#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Object MersenneTwister.clone()"})
  void testClone() {
    // Arrange, Act and Assert
    assertTrue(new MersenneTwister().clone() instanceof MersenneTwister);
  }

  /**
   * Test {@link MersenneTwister#nextInt()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister#MersenneTwister()}.
   *   <li>Then return {@code -1428678853}.
   * </ul>
   *
   * <p>Method under test: {@link MersenneTwister#nextInt()}
   */
  @Test
  @DisplayName("Test nextInt(); given MersenneTwister(); then return '-1428678853'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MersenneTwister.nextInt()"})
  void testNextInt_givenMersenneTwister_thenReturn1428678853() {
    // Arrange, Act and Assert
    assertEquals(-1428678853, new MersenneTwister().nextInt());
  }

  /**
   * Test {@link MersenneTwister#nextInt()}.
   *
   * <ul>
   *   <li>Then return {@code -1911077509}.
   * </ul>
   *
   * <p>Method under test: {@link MersenneTwister#nextInt()}
   */
  @Test
  @DisplayName("Test nextInt(); then return '-1911077509'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MersenneTwister.nextInt()"})
  void testNextInt_thenReturn1911077509() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(-1911077509, new MersenneTwister(d).nextInt());
  }
}
