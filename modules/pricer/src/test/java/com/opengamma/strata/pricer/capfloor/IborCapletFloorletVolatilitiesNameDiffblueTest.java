package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborCapletFloorletVolatilitiesNameDiffblueTest {
  /**
   * Test {@link IborCapletFloorletVolatilitiesName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilitiesName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletVolatilitiesName IborCapletFloorletVolatilitiesName.of(String)"
  })
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    IborCapletFloorletVolatilitiesName actualOfResult =
        IborCapletFloorletVolatilitiesName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<IborCapletFloorletVolatilities> expectedMarketDataType =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletVolatilitiesName#getMarketDataType()}
   *   <li>{@link IborCapletFloorletVolatilitiesName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class IborCapletFloorletVolatilitiesName.getMarketDataType()",
    "String IborCapletFloorletVolatilitiesName.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    IborCapletFloorletVolatilitiesName ofResult = IborCapletFloorletVolatilitiesName.of("Name");

    // Act
    Class<IborCapletFloorletVolatilities> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<IborCapletFloorletVolatilities> expectedMarketDataType =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
