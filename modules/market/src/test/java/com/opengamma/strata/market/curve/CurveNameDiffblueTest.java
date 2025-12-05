package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveNameDiffblueTest {
  /**
   * Test {@link CurveName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CurveName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveName CurveName.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    CurveName actualOfResult = CurveName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveName#getMarketDataType()}
   *   <li>{@link CurveName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CurveName.getMarketDataType()", "String CurveName.getName()"})
  void testGettersAndSetters() {
    // Arrange
    CurveName ofResult = CurveName.of("Name");

    // Act
    Class<Curve> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
