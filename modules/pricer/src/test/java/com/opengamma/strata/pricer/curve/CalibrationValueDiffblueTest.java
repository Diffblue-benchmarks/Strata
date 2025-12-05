package com.opengamma.strata.pricer.curve;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalibrationValueDiffblueTest {
  /**
   * Test {@link CalibrationValue#apply(DoubleArray)} with {@code DoubleArray}.
   *
   * <p>Method under test: {@link CalibrationValue#apply(DoubleArray)}
   */
  @Test
  @DisplayName("Test apply(DoubleArray) with 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CalibrationValue.apply(DoubleArray)"})
  void testApplyWithDoubleArray() {
    // Arrange
    RatesProviderGenerator providerGenerator = mock(RatesProviderGenerator.class);
    when(providerGenerator.generate(Mockito.<DoubleArray>any())).thenReturn(null);
    CalibrationValue calibrationValue =
        new CalibrationValue(
            new ArrayList<>(), CalibrationMeasures.MARKET_QUOTE, providerGenerator);

    // Act
    DoubleArray actualApplyResult = calibrationValue.apply(DoubleArray.of());

    // Assert
    verify(providerGenerator).generate(isA(DoubleArray.class));
    assertSame(DoubleArray.EMPTY, actualApplyResult);
  }
}
