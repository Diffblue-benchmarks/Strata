package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MersenneTwister64DiffblueTest {
  /**
   * Test {@link MersenneTwister64#raw()}.
   *
   * <ul>
   *   <li>Given {@link MersenneTwister64#MersenneTwister64()}.
   *   <li>Then return {@code 0.1673597832760812}.
   * </ul>
   *
   * <p>Method under test: {@link MersenneTwister64#raw()}
   */
  @Test
  @DisplayName("Test raw(); given MersenneTwister64(); then return '0.1673597832760812'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MersenneTwister64.raw()"})
  void testRaw_givenMersenneTwister64_thenReturn01673597832760812() {
    // Arrange, Act and Assert
    assertEquals(0.1673597832760812d, new MersenneTwister64().raw());
  }

  /**
   * Test {@link MersenneTwister64#raw()}.
   *
   * <ul>
   *   <li>Then return {@code 0.05504259358411201}.
   * </ul>
   *
   * <p>Method under test: {@link MersenneTwister64#raw()}
   */
  @Test
  @DisplayName("Test raw(); then return '0.05504259358411201'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MersenneTwister64.raw()"})
  void testRaw_thenReturn005504259358411201() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Act and Assert
    assertEquals(0.05504259358411201d, new MersenneTwister64(d).raw());
  }
}
