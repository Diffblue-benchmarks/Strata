package com.opengamma.strata.pricer.curve;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.product.ResolvedTrade;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalibrationDerivativeDiffblueTest {
  /**
   * Test {@link CalibrationDerivative#apply(DoubleArray)} with {@code DoubleArray}.
   *
   * <p>Method under test: {@link CalibrationDerivative#apply(DoubleArray)}
   */
  @Test
  @DisplayName("Test apply(DoubleArray) with 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CalibrationDerivative.apply(DoubleArray)"})
  void testApplyWithDoubleArray() {
    // Arrange
    RatesProviderGenerator providerGenerator = mock(RatesProviderGenerator.class);
    when(providerGenerator.generate(Mockito.<DoubleArray>any())).thenReturn(null);
    ArrayList<ResolvedTrade> trades = new ArrayList<>();

    CalibrationDerivative calibrationDerivative =
        new CalibrationDerivative(
            trades, CalibrationMeasures.MARKET_QUOTE, providerGenerator, new ArrayList<>());

    // Act
    DoubleMatrix actualApplyResult = calibrationDerivative.apply(DoubleArray.of());

    // Assert
    verify(providerGenerator).generate(isA(DoubleArray.class));
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
  }
}
