package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BondFutureVolatilitiesNameDiffblueTest {
  /**
   * Test {@link BondFutureVolatilitiesName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureVolatilitiesName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BondFutureVolatilitiesName BondFutureVolatilitiesName.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    BondFutureVolatilitiesName actualOfResult = BondFutureVolatilitiesName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<BondFutureVolatilities> expectedMarketDataType = BondFutureVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BondFutureVolatilitiesName#getMarketDataType()}
   *   <li>{@link BondFutureVolatilitiesName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class BondFutureVolatilitiesName.getMarketDataType()",
    "String BondFutureVolatilitiesName.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    BondFutureVolatilitiesName ofResult = BondFutureVolatilitiesName.of("Name");

    // Act
    Class<BondFutureVolatilities> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<BondFutureVolatilities> expectedMarketDataType = BondFutureVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
