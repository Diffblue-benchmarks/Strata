package com.opengamma.strata.pricer.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightFutureOptionVolatilitiesNameDiffblueTest {
  /**
   * Test {@link OvernightFutureOptionVolatilitiesName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightFutureOptionVolatilitiesName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionVolatilitiesName OvernightFutureOptionVolatilitiesName.of(String)"
  })
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    OvernightFutureOptionVolatilitiesName actualOfResult =
        OvernightFutureOptionVolatilitiesName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<OvernightFutureOptionVolatilities> expectedMarketDataType =
        OvernightFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightFutureOptionVolatilitiesName#getMarketDataType()}
   *   <li>{@link OvernightFutureOptionVolatilitiesName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class OvernightFutureOptionVolatilitiesName.getMarketDataType()",
    "String OvernightFutureOptionVolatilitiesName.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    OvernightFutureOptionVolatilitiesName ofResult =
        OvernightFutureOptionVolatilitiesName.of("Name");

    // Act
    Class<OvernightFutureOptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<OvernightFutureOptionVolatilities> expectedMarketDataType =
        OvernightFutureOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
