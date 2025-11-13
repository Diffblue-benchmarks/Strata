package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RootEvaluatorDiffblueTest {
  /**
   * Test {@link RootEvaluator#tokens(ResultsRow)} with {@code ResultsRow}.
   *
   * <p>Method under test: {@link RootEvaluator#tokens(ResultsRow)}
   */
  @Test
  @DisplayName("Test tokens(ResultsRow) with 'ResultsRow'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set RootEvaluator.tokens(ResultsRow)"})
  void testTokensWithResultsRow() {
    // Arrange and Act
    Set<String> actualTokensResult = RootEvaluator.INSTANCE.tokens(new ResultsRow(null, 1));

    // Assert
    assertEquals(6, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("Measures"));
    assertTrue(actualTokensResult.contains("Position"));
    assertTrue(actualTokensResult.contains("Product"));
    assertTrue(actualTokensResult.contains("Security"));
    assertTrue(actualTokensResult.contains("Target"));
    assertTrue(actualTokensResult.contains("Trade"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RootEvaluator}
   *   <li>{@link RootEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RootEvaluator.<init>()", "Class RootEvaluator.getTargetType()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Class<?> actualTargetType = new RootEvaluator().getTargetType();

    // Assert
    Class<ResultsRow> expectedTargetType = ResultsRow.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
