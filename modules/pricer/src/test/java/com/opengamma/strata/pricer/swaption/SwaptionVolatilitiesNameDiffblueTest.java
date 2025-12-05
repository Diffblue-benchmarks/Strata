package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwaptionVolatilitiesNameDiffblueTest {
  /**
   * Test {@link SwaptionVolatilitiesName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionVolatilitiesName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionVolatilitiesName SwaptionVolatilitiesName.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    SwaptionVolatilitiesName actualOfResult = SwaptionVolatilitiesName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<SwaptionVolatilities> expectedMarketDataType = SwaptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SwaptionVolatilitiesName#getMarketDataType()}
   *   <li>{@link SwaptionVolatilitiesName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class SwaptionVolatilitiesName.getMarketDataType()",
    "String SwaptionVolatilitiesName.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    SwaptionVolatilitiesName ofResult = SwaptionVolatilitiesName.of("Name");

    // Act
    Class<SwaptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<SwaptionVolatilities> expectedMarketDataType = SwaptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
