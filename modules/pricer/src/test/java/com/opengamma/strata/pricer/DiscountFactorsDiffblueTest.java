package com.opengamma.strata.pricer;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.CurveInfoType;
import com.opengamma.strata.market.curve.CurveMetadata;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DiscountFactorsDiffblueTest {
  /**
   * Test {@link DiscountFactors#of(Currency, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#findInfo(CurveInfoType)} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then calls {@link CurveMetadata#findInfo(CurveInfoType)}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountFactors#of(Currency, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, LocalDate, Curve); given CurveMetadata findInfo(CurveInfoType) throw IllegalArgumentException(); then calls findInfo(CurveInfoType)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DiscountFactors DiscountFactors.of(Currency, LocalDate, Curve)"})
  void testOf_givenCurveMetadataFindInfoThrowIllegalArgumentException_thenCallsFindInfo() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.findInfo(Mockito.<CurveInfoType<Object>>any()))
        .thenThrow(new IllegalArgumentException());
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("ZeroRate"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> DiscountFactors.of(null, valuationDate, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata).findInfo(isA(CurveInfoType.class));
    verify(curveMetadata, atLeast(1)).getYValueType();
  }

  /**
   * Test {@link DiscountFactors#of(Currency, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} return {@link
   *       ValueType} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountFactors#of(Currency, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, LocalDate, Curve); given CurveMetadata getYValueType() return ValueType with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DiscountFactors DiscountFactors.of(Currency, LocalDate, Curve)"})
  void testOf_givenCurveMetadataGetYValueTypeReturnValueTypeWithName() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("Name"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> DiscountFactors.of(null, valuationDate, curve));
    verify(curve, atLeast(1)).getMetadata();
    verify(curveMetadata, atLeast(1)).getYValueType();
  }
}
