package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationTaskRunnerDiffblueTest {
  /**
   * Test {@link CalculationTaskRunner#ofMultiThreaded()}.
   *
   * <p>Method under test: {@link CalculationTaskRunner#ofMultiThreaded()}
   */
  @Test
  @DisplayName("Test ofMultiThreaded()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTaskRunner CalculationTaskRunner.ofMultiThreaded()"})
  void testOfMultiThreaded() {
    // Arrange, Act and Assert
    assertTrue(CalculationTaskRunner.ofMultiThreaded() instanceof DefaultCalculationTaskRunner);
  }

  /**
   * Test {@link CalculationTaskRunner#of(ExecutorService)}.
   *
   * <ul>
   *   <li>When commonPool.
   *   <li>Then return {@link DefaultCalculationTaskRunner}.
   * </ul>
   *
   * <p>Method under test: {@link CalculationTaskRunner#of(ExecutorService)}
   */
  @Test
  @DisplayName(
      "Test of(ExecutorService); when commonPool; then return DefaultCalculationTaskRunner")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalculationTaskRunner CalculationTaskRunner.of(ExecutorService)"})
  void testOf_whenCommonPool_thenReturnDefaultCalculationTaskRunner() {
    // Arrange, Act and Assert
    assertTrue(
        CalculationTaskRunner.of(ForkJoinPool.commonPool())
            instanceof DefaultCalculationTaskRunner);
  }
}
