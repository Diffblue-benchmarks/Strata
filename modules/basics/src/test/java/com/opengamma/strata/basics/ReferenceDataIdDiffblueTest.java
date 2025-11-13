package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ReferenceDataIdDiffblueTest {
  /**
   * Test {@link ReferenceDataId#queryValueOrNull(ReferenceData)}.
   *
   * <p>Method under test: {@link ReferenceDataId#queryValueOrNull(ReferenceData)}
   */
  @Test
  @DisplayName("Test queryValueOrNull(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Object ReferenceDataId.queryValueOrNull(ReferenceData)"})
  void testQueryValueOrNull() {
    // Arrange
    TestingReferenceDataId testingReferenceDataId = new TestingReferenceDataId("42");

    ReferenceData refData = mock(ReferenceData.class);
    Integer valueOfResult = Integer.valueOf(1);
    when(refData.queryValueOrNull(Mockito.<ReferenceDataId<Number>>any()))
        .thenReturn(valueOfResult);

    // Act
    Number actualQueryValueOrNullResult = testingReferenceDataId.queryValueOrNull(refData);

    // Assert
    verify(refData).queryValueOrNull(isA(ReferenceDataId.class));
    assertEquals(1, actualQueryValueOrNullResult.intValue());
    assertSame(valueOfResult, actualQueryValueOrNullResult);
  }
}
