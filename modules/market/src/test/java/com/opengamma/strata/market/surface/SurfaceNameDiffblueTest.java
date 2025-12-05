package com.opengamma.strata.market.surface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SurfaceNameDiffblueTest {
  /**
   * Test {@link SurfaceName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link SurfaceName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceName SurfaceName.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    SurfaceName actualOfResult = SurfaceName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SurfaceName#getMarketDataType()}
   *   <li>{@link SurfaceName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class SurfaceName.getMarketDataType()", "String SurfaceName.getName()"})
  void testGettersAndSetters() {
    // Arrange
    SurfaceName ofResult = SurfaceName.of("Name");

    // Act
    Class<Surface> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
