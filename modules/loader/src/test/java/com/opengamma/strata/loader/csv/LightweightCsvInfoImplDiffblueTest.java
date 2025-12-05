package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LightweightCsvInfoImplDiffblueTest {
  /**
   * Test {@link LightweightCsvInfoImpl#of(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return {@link ReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link LightweightCsvInfoImpl#of(ReferenceData)}
   */
  @Test
  @DisplayName("Test of(ReferenceData); when ReferenceData; then return ReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LightweightCsvInfoImpl LightweightCsvInfoImpl.of(ReferenceData)"})
  void testOf_whenReferenceData_thenReturnReferenceData() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);

    // Act and Assert
    assertSame(refData, LightweightCsvInfoImpl.of(refData).getReferenceData());
  }
}
