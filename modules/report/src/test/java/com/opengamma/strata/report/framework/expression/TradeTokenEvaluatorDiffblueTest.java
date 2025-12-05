package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.Trade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeTokenEvaluatorDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link TradeTokenEvaluator}
   *   <li>{@link TradeTokenEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeTokenEvaluator.<init>()",
    "Class TradeTokenEvaluator.getTargetType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<Trade> actualTargetType = new TradeTokenEvaluator().getTargetType();

    // Assert
    Class<Trade> expectedTargetType = Trade.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
