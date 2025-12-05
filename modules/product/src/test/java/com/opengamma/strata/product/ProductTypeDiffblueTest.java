package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProductTypeDiffblueTest {
  /**
   * Test {@link ProductType#of(String, String)} with {@code name}, {@code description}.
   *
   * <ul>
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ProductType#of(String, String)}
   */
  @Test
  @DisplayName("Test of(String, String) with 'name', 'description'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProductType ProductType.of(String, String)"})
  void testOfWithNameDescription_thenReturnName() {
    // Arrange and Act
    ProductType actualOfResult =
        ProductType.of("Name", "The characteristics of someone or something");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
    assertEquals("The characteristics of someone or something", actualOfResult.getDescription());
  }

  /**
   * Test {@link ProductType#of(String)} with {@code name}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link ProductType#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'name'; when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProductType ProductType.of(String)"})
  void testOfWithName_whenName_thenReturnName() {
    // Arrange and Act
    ProductType actualOfResult = ProductType.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
    assertEquals("Name", actualOfResult.getDescription());
  }

  /**
   * Test {@link ProductType#getDescription()}.
   *
   * <p>Method under test: {@link ProductType#getDescription()}
   */
  @Test
  @DisplayName("Test getDescription()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ProductType.getDescription()"})
  void testGetDescription() {
    // Arrange, Act and Assert
    assertEquals("Name", ProductType.of("Name").getDescription());
  }
}
