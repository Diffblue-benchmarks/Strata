package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.CurveMetadata;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CreditDiscountFactorsDiffblueTest {
  /**
   * Test {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getXValueType()} return {@link
   *       ValueType} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, LocalDate, Curve); given CurveMetadata getXValueType() return ValueType with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreditDiscountFactors CreditDiscountFactors.of(Currency, LocalDate, Curve)"})
  void testOf_givenCurveMetadataGetXValueTypeReturnValueTypeWithName() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("Name"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CreditDiscountFactors.of(null, valuationDate, curve));
    verify(curve).getMetadata();
    verify(curveMetadata).getXValueType();
  }

  /**
   * Test {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} return {@link
   *       ValueType} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, LocalDate, Curve); given CurveMetadata getYValueType() return ValueType with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreditDiscountFactors CreditDiscountFactors.of(Currency, LocalDate, Curve)"})
  void testOf_givenCurveMetadataGetYValueTypeReturnValueTypeWithName() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("Name"));
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CreditDiscountFactors.of(null, valuationDate, curve));
    verify(curve).getMetadata();
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} return {@link
   *       ValueType} with name is {@code ZeroRate}.
   * </ul>
   *
   * <p>Method under test: {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, LocalDate, Curve); given CurveMetadata getYValueType() return ValueType with name is 'ZeroRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreditDiscountFactors CreditDiscountFactors.of(Currency, LocalDate, Curve)"})
  void testOf_givenCurveMetadataGetYValueTypeReturnValueTypeWithNameIsZeroRate() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenReturn(ValueType.of("ZeroRate"));
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CreditDiscountFactors.of(null, valuationDate, curve));
    verify(curve).getMetadata();
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }

  /**
   * Test {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}.
   *
   * <ul>
   *   <li>Given {@link CurveMetadata} {@link CurveMetadata#getYValueType()} throw {@link
   *       IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link CreditDiscountFactors#of(Currency, LocalDate, Curve)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, LocalDate, Curve); given CurveMetadata getYValueType() throw IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreditDiscountFactors CreditDiscountFactors.of(Currency, LocalDate, Curve)"})
  void testOf_givenCurveMetadataGetYValueTypeThrowIllegalArgumentException() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    CurveMetadata curveMetadata = mock(CurveMetadata.class);
    when(curveMetadata.getYValueType()).thenThrow(new IllegalArgumentException());
    when(curveMetadata.getXValueType()).thenReturn(ValueType.of("YearFraction"));

    Curve curve = mock(Curve.class);
    when(curve.getMetadata()).thenReturn(curveMetadata);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CreditDiscountFactors.of(null, valuationDate, curve));
    verify(curve).getMetadata();
    verify(curveMetadata).getXValueType();
    verify(curveMetadata).getYValueType();
  }
}
