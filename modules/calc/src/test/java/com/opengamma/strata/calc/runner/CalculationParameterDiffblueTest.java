package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.Measure;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalculationParameterDiffblueTest {
  /**
   * Test {@link CalculationParameter#queryType()}.
   *
   * <p>Method under test: {@link CalculationParameter#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CalculationParameter.queryType()"})
  void testQueryType() {
    // Arrange and Act
    Class<? extends CalculationParameter> actualQueryTypeResult = new TestParameter().queryType();

    // Assert
    Class<TestParameter> expectedQueryTypeResult = TestParameter.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link CalculationParameter#filter(CalculationTarget, Measure)}.
   *
   * <p>Method under test: {@link CalculationParameter#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName("Test filter(CalculationTarget, Measure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CalculationParameter.filter(CalculationTarget, Measure)"})
  void testFilter() {
    // Arrange
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");

    // Act
    Optional<CalculationParameter> actualFilterResult =
        DefaultFxRateLookup.DEFAULT.filter(target, ImmutableMeasure.of("Name"));

    // Assert
    assertTrue(actualFilterResult.isPresent());
    assertSame(DefaultFxRateLookup.DEFAULT, actualFilterResult.get());
  }
}
