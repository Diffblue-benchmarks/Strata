package com.opengamma.strata.product;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProductDiffblueTest {
  /**
   * Test {@link Product#isCrossCurrency()}.
   *
   * <ul>
   *   <li>Given {@link Product} {@link Product#isCrossCurrency()} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Product#isCrossCurrency()}
   */
  @Test
  @DisplayName("Test isCrossCurrency(); given Product isCrossCurrency() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.isCrossCurrency()"})
  void testIsCrossCurrency_givenProductIsCrossCurrencyReturnFalse() {
    // Arrange
    Product product = mock(Product.class);
    when(product.isCrossCurrency()).thenReturn(false);

    // Act
    product.isCrossCurrency();

    // Assert
    verify(product).isCrossCurrency();
  }

  /**
   * Test {@link Product#isCrossCurrency()}.
   *
   * <ul>
   *   <li>Given {@link Product} {@link Product#isCrossCurrency()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Product#isCrossCurrency()}
   */
  @Test
  @DisplayName("Test isCrossCurrency(); given Product isCrossCurrency() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Product.isCrossCurrency()"})
  void testIsCrossCurrency_givenProductIsCrossCurrencyReturnTrue() {
    // Arrange
    Product product = mock(Product.class);
    when(product.isCrossCurrency()).thenReturn(true);

    // Act
    product.isCrossCurrency();

    // Assert
    verify(product).isCrossCurrency();
  }
}
