package com.opengamma.strata.market.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StrikeDiffblueTest {
  /**
   * Test {@link Strike#getLabel()}.
   *
   * <p>Method under test: {@link Strike#getLabel()}
   */
  @Test
  @DisplayName("Test getLabel()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String Strike.getLabel()"})
  void testGetLabel() {
    // Arrange
    DeltaStrike ofResult = DeltaStrike.of(0.5d);

    // Act and Assert
    assertEquals("Delta=0.5", ofResult.getLabel());
  }
}
