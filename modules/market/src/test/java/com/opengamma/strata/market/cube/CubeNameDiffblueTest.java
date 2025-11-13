package com.opengamma.strata.market.cube;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CubeNameDiffblueTest {
  /**
   * Test {@link CubeName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CubeName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CubeName CubeName.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    CubeName actualOfResult = CubeName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<Cube> expectedMarketDataType = Cube.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CubeName#getMarketDataType()}
   *   <li>{@link CubeName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CubeName.getMarketDataType()", "String CubeName.getName()"})
  void testGettersAndSetters() {
    // Arrange
    CubeName ofResult = CubeName.of("Name");

    // Act
    Class<Cube> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<Cube> expectedMarketDataType = Cube.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
