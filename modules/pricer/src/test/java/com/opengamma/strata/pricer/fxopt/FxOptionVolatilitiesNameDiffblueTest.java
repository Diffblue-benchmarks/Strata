package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxOptionVolatilitiesNameDiffblueTest {
  /**
   * Test {@link FxOptionVolatilitiesName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionVolatilitiesName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxOptionVolatilitiesName FxOptionVolatilitiesName.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    FxOptionVolatilitiesName actualOfResult = FxOptionVolatilitiesName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<FxOptionVolatilities> expectedMarketDataType = FxOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FxOptionVolatilitiesName#getMarketDataType()}
   *   <li>{@link FxOptionVolatilitiesName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class FxOptionVolatilitiesName.getMarketDataType()",
    "String FxOptionVolatilitiesName.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    FxOptionVolatilitiesName ofResult = FxOptionVolatilitiesName.of("Name");

    // Act
    Class<FxOptionVolatilities> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<FxOptionVolatilities> expectedMarketDataType = FxOptionVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
