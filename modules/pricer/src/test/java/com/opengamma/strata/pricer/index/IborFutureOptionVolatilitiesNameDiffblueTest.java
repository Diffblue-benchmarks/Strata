package com.opengamma.strata.pricer.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFutureOptionVolatilitiesNameDiffblueTest {
  /**
   * Test {@link IborFutureOptionVolatilitiesName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionVolatilitiesName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionVolatilitiesName IborFutureOptionVolatilitiesName.of(String)"
  })
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    IborFutureOptionVolatilitiesName actualOfResult = IborFutureOptionVolatilitiesName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<IborFutureOptionVolatilities> expectedMarketDataType = IborFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborFutureOptionVolatilitiesName#getMarketDataType()}
   *   <li>{@link IborFutureOptionVolatilitiesName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class IborFutureOptionVolatilitiesName.getMarketDataType()",
    "String IborFutureOptionVolatilitiesName.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    IborFutureOptionVolatilitiesName ofResult = IborFutureOptionVolatilitiesName.of("Name");

    // Act
    Class<IborFutureOptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<IborFutureOptionVolatilities> expectedMarketDataType = IborFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
