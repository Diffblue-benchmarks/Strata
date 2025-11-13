package com.opengamma.strata.product.fx;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxProductDiffblueTest {
  /**
   * Test {@link FxProduct#isCrossCurrency()}.
   *
   * <ul>
   *   <li>Given {@link FxProduct} {@link FxProduct#isCrossCurrency()} return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FxProduct#isCrossCurrency()}
   */
  @Test
  @DisplayName("Test isCrossCurrency(); given FxProduct isCrossCurrency() return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxProduct.isCrossCurrency()"})
  void testIsCrossCurrency_givenFxProductIsCrossCurrencyReturnFalse() {
    // Arrange
    FxProduct fxProduct = mock(FxProduct.class);
    when(fxProduct.isCrossCurrency()).thenReturn(false);

    // Act
    fxProduct.isCrossCurrency();

    // Assert
    verify(fxProduct).isCrossCurrency();
  }

  /**
   * Test {@link FxProduct#isCrossCurrency()}.
   *
   * <ul>
   *   <li>Given {@link FxProduct} {@link FxProduct#isCrossCurrency()} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FxProduct#isCrossCurrency()}
   */
  @Test
  @DisplayName("Test isCrossCurrency(); given FxProduct isCrossCurrency() return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FxProduct.isCrossCurrency()"})
  void testIsCrossCurrency_givenFxProductIsCrossCurrencyReturnTrue() {
    // Arrange
    FxProduct fxProduct = mock(FxProduct.class);
    when(fxProduct.isCrossCurrency()).thenReturn(true);

    // Act
    fxProduct.isCrossCurrency();

    // Assert
    verify(fxProduct).isCrossCurrency();
  }
}
