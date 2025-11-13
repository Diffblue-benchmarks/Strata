package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StandardCsvInfoImplDiffblueTest {
  /**
   * Test {@link StandardCsvInfoImpl#of(ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return TenorRequired.
   * </ul>
   *
   * <p>Method under test: {@link StandardCsvInfoImpl#of(ReferenceData)}
   */
  @Test
  @DisplayName("Test of(ReferenceData); when ReferenceData; then return TenorRequired")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardCsvInfoImpl StandardCsvInfoImpl.of(ReferenceData)"})
  void testOf_whenReferenceData_thenReturnTenorRequired() {
    // Arrange
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    StandardCsvInfoImpl actualOfResult = StandardCsvInfoImpl.of(refData);

    // Assert
    assertTrue(actualOfResult.isTenorRequired());
    assertSame(refData, actualOfResult.getReferenceData());
  }
}
