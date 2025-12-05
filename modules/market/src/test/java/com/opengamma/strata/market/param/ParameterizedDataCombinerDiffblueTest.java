package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ParameterizedDataCombinerDiffblueTest {
  /**
   * Test {@link ParameterizedDataCombiner#of(ParameterizedData[])} with {@code
   * ParameterizedData[]}.
   *
   * <ul>
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedDataCombiner#of(ParameterizedData[])}
   */
  @Test
  @DisplayName(
      "Test of(ParameterizedData[]) with 'ParameterizedData[]'; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterizedDataCombiner ParameterizedDataCombiner.of(ParameterizedData[])"})
  void testOfWithParameterizedData_thenReturnParameterCountIsOne() {
    // Arrange, Act and Assert
    assertEquals(
        1, ParameterizedDataCombiner.of(new TestingParameterizedData(10.0d)).getParameterCount());
  }
}
