package com.opengamma.strata.data;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ObservableIdDiffblueTest {
  /**
   * Test {@link ObservableId#getMarketDataType()}.
   *
   * <p>Method under test: {@link ObservableId#getMarketDataType()}
   */
  @Test
  @DisplayName("Test getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class ObservableId.getMarketDataType()"})
  void testGetMarketDataType() {
    // Arrange and Act
    Class<Double> actualMarketDataType = new TestingObservableId("42").getMarketDataType();

    // Assert
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
