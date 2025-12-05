package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.CurveMetadata;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RecoveryRatesDiffblueTest {
  /**
   * Test {@link RecoveryRates#of(StandardId, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} return {@link
   *       ValueType} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RecoveryRates#of(StandardId, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, LocalDate, Curve); given CurveMetadata getYValueType() return ValueType with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RecoveryRates RecoveryRates.of(StandardId, LocalDate, Curve)"})
  void testOf_givenCurveMetadataGetYValueTypeReturnValueTypeWithName() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("Name"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> RecoveryRates.of(null, valuationDate, curve));
    verify(curve).getMetadata();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link RecoveryRates#of(StandardId, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} return {@link
   *       ValueType} with name is {@code RecoveryRate}.
   * </ul>
   *
   * <p>Method under test: {@link RecoveryRates#of(StandardId, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, LocalDate, Curve); given CurveMetadata getYValueType() return ValueType with name is 'RecoveryRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RecoveryRates RecoveryRates.of(StandardId, LocalDate, Curve)"})
  void testOf_givenCurveMetadataGetYValueTypeReturnValueTypeWithNameIsRecoveryRate() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("RecoveryRate"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> RecoveryRates.of(null, valuationDate, curve));
    verify(curve).getMetadata();
    verify(curveMetadata).getYValueType();
  }
}
