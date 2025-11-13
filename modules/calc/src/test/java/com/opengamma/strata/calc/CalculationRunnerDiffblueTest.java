package com.opengamma.strata.calc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationRunnerDiffblueTest {
  /**
   * Test {@link CalculationRunner#ofMultiThreaded()}.
   *
   * <p>Method under test: {@link CalculationRunner#ofMultiThreaded()}
   */
  @Test
  @DisplayName("Test ofMultiThreaded()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationRunner CalculationRunner.ofMultiThreaded()"})
  void testOfMultiThreaded() {
    // Arrange, Act and Assert
    assertTrue(CalculationRunner.ofMultiThreaded() instanceof DefaultCalculationRunner);
  }

  /**
   * Test {@link CalculationRunner#of(ExecutorService)}.
   *
   * <ul>
   *   <li>When commonPool.
   *   <li>Then return {@link DefaultCalculationRunner}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationRunner#of(ExecutorService)}
   */
  @Test
  @DisplayName("Test of(ExecutorService); when commonPool; then return DefaultCalculationRunner")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationRunner CalculationRunner.of(ExecutorService)"})
  void testOf_whenCommonPool_thenReturnDefaultCalculationRunner() {
    // Arrange, Act and Assert
    assertTrue(CalculationRunner.of(ForkJoinPool.commonPool()) instanceof DefaultCalculationRunner);
  }
}
