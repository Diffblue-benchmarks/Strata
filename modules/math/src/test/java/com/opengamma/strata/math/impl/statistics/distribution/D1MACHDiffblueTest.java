package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class D1MACHDiffblueTest {
  /**
   * Test {@link D1MACH#one()}.
   *
   * <p>Method under test: {@link D1MACH#one()}
   */
  @Test
  @DisplayName("Test one()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double D1MACH.one()"})
  void testOne() {
    // Arrange, Act and Assert
    assertEquals(Double.MIN_NORMAL, D1MACH.one());
  }

  /**
   * Test {@link D1MACH#two()}.
   *
   * <p>Method under test: {@link D1MACH#two()}
   */
  @Test
  @DisplayName("Test two()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double D1MACH.two()"})
  void testTwo() {
    // Arrange, Act and Assert
    assertEquals(Double.MAX_VALUE, D1MACH.two());
  }

  /**
   * Test {@link D1MACH#three()}.
   *
   * <p>Method under test: {@link D1MACH#three()}
   */
  @Test
  @DisplayName("Test three()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double D1MACH.three()"})
  void testThree() {
    // Arrange, Act and Assert
    assertEquals(1.1102230246251565E-16d, D1MACH.three());
  }

  /**
   * Test {@link D1MACH#four()}.
   *
   * <p>Method under test: {@link D1MACH#four()}
   */
  @Test
  @DisplayName("Test four()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double D1MACH.four()"})
  void testFour() {
    // Arrange, Act and Assert
    assertEquals(2.220446049250313E-16d, D1MACH.four());
  }

  /**
   * Test {@link D1MACH#five()}.
   *
   * <p>Method under test: {@link D1MACH#five()}
   */
  @Test
  @DisplayName("Test five()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double D1MACH.five()"})
  void testFive() {
    // Arrange, Act and Assert
    assertEquals(0.3010299956639812d, D1MACH.five());
  }
}
