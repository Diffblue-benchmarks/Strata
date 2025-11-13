package com.opengamma.strata.market.surface;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SurfaceMetadataDiffblueTest {
  /**
   * Test {@link SurfaceMetadata#getParameterMetadata(int)} with {@code int}.
   *
   * <ul>
   *   <li>Then return propertyNames Empty.
   * </ul>
   *
   * <p>Method under test: {@link SurfaceMetadata#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int) with 'int'; then return propertyNames Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.param.ParameterMetadata SurfaceMetadata.getParameterMetadata(int)"
  })
  void testGetParameterMetadataWithInt_thenReturnPropertyNamesEmpty() {
    // Arrange, Act and Assert
    assertTrue(
        DefaultSurfaceMetadata.of(SurfaceName.of("Name"))
            .getParameterMetadata(1)
            .propertyNames()
            .isEmpty());
  }
}
