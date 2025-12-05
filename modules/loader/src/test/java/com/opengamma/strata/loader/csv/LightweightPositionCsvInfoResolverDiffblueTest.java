package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LightweightPositionCsvInfoResolverDiffblueTest {
  /**
   * Test {@link LightweightPositionCsvInfoResolver#standard()}.
   *
   * <p>Method under test: {@link LightweightPositionCsvInfoResolver#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LightweightPositionCsvInfoResolver LightweightPositionCsvInfoResolver.standard()"
  })
  void testStandard() {
    // Arrange and Act
    LightweightPositionCsvInfoResolver actualStandardResult =
        LightweightPositionCsvInfoResolver.standard();
    ReferenceData actualReferenceData = actualStandardResult.getReferenceData();

    // Assert
    ReferenceData referenceData = actualStandardResult.getReferenceData();
    assertTrue(referenceData instanceof ImmutableReferenceData);
    assertTrue(actualStandardResult instanceof LightweightCsvInfoImpl);
    assertEquals(30, ((ImmutableReferenceData) referenceData).getValues().size());
    assertSame(referenceData, actualReferenceData);
  }

  /**
   * Test {@link LightweightPositionCsvInfoResolver#of(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return {@link LightweightCsvInfoImpl}.
   * </ul>
   *
   * <p>Method under test: {@link LightweightPositionCsvInfoResolver#of(ReferenceData)}
   */
  @Test
  @DisplayName("Test of(ReferenceData); when ReferenceData; then return LightweightCsvInfoImpl")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LightweightPositionCsvInfoResolver LightweightPositionCsvInfoResolver.of(ReferenceData)"
  })
  void testOf_whenReferenceData_thenReturnLightweightCsvInfoImpl() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    LightweightPositionCsvInfoResolver actualOfResult =
        LightweightPositionCsvInfoResolver.of(refData);
    ReferenceData actualReferenceData = actualOfResult.getReferenceData();

    // Assert
    assertTrue(actualOfResult instanceof LightweightCsvInfoImpl);
    assertSame(refData, actualOfResult.getReferenceData());
    assertSame(refData, actualReferenceData);
  }
}
