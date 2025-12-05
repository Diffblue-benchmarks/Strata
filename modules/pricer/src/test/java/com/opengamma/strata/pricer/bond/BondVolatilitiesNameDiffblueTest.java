package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BondVolatilitiesNameDiffblueTest {
  /**
   * Test {@link BondVolatilitiesName#of(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link BondVolatilitiesName#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BondVolatilitiesName BondVolatilitiesName.of(String)"})
  void testOf_whenName_thenReturnName() {
    // Arrange and Act
    BondVolatilitiesName actualOfResult = BondVolatilitiesName.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    Class<BondYieldVolatilities> expectedMarketDataType = BondYieldVolatilities.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BondVolatilitiesName#getMarketDataType()}
   *   <li>{@link BondVolatilitiesName#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class BondVolatilitiesName.getMarketDataType()",
    "String BondVolatilitiesName.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    BondVolatilitiesName ofResult = BondVolatilitiesName.of("Name");

    // Act
    Class<BondYieldVolatilities> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    assertEquals("Name", ofResult.getName());
    Class<BondYieldVolatilities> expectedMarketDataType = BondYieldVolatilities.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }
}
