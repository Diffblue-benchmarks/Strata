package com.opengamma.strata.examples.report;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeListParameterConverterDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link TradeListParameterConverter}
   *   <li>{@link TradeListParameterConverter#getExpectedType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeListParameterConverter.<init>()",
    "Class TradeListParameterConverter.getExpectedType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<TradeList> actualExpectedType = new TradeListParameterConverter().getExpectedType();

    // Assert
    Class<TradeList> expectedExpectedType = TradeList.class;
    assertEquals(expectedExpectedType, actualExpectedType);
  }
}
