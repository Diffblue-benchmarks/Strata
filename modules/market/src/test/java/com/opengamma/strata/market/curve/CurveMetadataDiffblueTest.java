package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveMetadataDiffblueTest {
  /**
   * Test {@link CurveMetadata#getParameterMetadata(int)} with {@code int}.
   *
   * <ul>
   *   <li>Then return propertyNames Empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveMetadata#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int) with 'int'; then return propertyNames Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.param.ParameterMetadata CurveMetadata.getParameterMetadata(int)"
  })
  void testGetParameterMetadataWithInt_thenReturnPropertyNamesEmpty() {
    // Arrange, Act and Assert
    assertTrue(
        DefaultCurveMetadata.of(CurveName.of("Name"))
            .getParameterMetadata(1)
            .propertyNames()
            .isEmpty());
  }
}
