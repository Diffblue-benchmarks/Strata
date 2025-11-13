package com.opengamma.strata.pricer.impl.volatility.local;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.surface.DefaultSurfaceMetadata;
import com.opengamma.strata.market.surface.DeformedSurface;
import com.opengamma.strata.market.surface.Surface;
import com.opengamma.strata.market.surface.SurfaceMetadata;
import com.opengamma.strata.market.surface.SurfaceName;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DupireLocalVolatilityCalculatorDiffblueTest {
  /**
   * Test {@link DupireLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return Name Name is {@code localVol_Name}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DupireLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface, double, Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return Name Name is 'localVol_Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DeformedSurface DupireLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnNameNameIsLocalVolName() {
    // Arrange
    DupireLocalVolatilityCalculator dupireLocalVolatilityCalculator =
        new DupireLocalVolatilityCalculator();

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));

    // Act
    DeformedSurface actualLocalVolatilityFromImpliedVolatilityResult =
        dupireLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, mock(Function.class), mock(Function.class));

    // Assert
    verify(impliedVolatilitySurface).getName();
    SurfaceMetadata metadata = actualLocalVolatilityFromImpliedVolatilityResult.getMetadata();
    assertTrue(metadata instanceof DefaultSurfaceMetadata);
    ValueType zValueType = metadata.getZValueType();
    assertEquals("LocalVolatility", zValueType.getName());
    assertEquals("LocalVolatility", zValueType.toString());
    ValueType yValueType = metadata.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = metadata.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    SurfaceName name = actualLocalVolatilityFromImpliedVolatilityResult.getName();
    assertEquals("localVol_Name", name.getName());
    assertEquals(0, actualLocalVolatilityFromImpliedVolatilityResult.getParameterCount());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultSurfaceMetadata) metadata).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, name.getMarketDataType());
    assertSame(name, metadata.getSurfaceName());
    assertSame(
        impliedVolatilitySurface,
        actualLocalVolatilityFromImpliedVolatilityResult.getOriginalSurface());
  }

  /**
   * Test {@link DupireLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return Name Name is {@code localVol_null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DupireLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface, double, Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return Name Name is 'localVol_null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DeformedSurface DupireLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnNameNameIsLocalVolNull() {
    // Arrange
    DupireLocalVolatilityCalculator dupireLocalVolatilityCalculator =
        new DupireLocalVolatilityCalculator();

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(null);

    // Act
    DeformedSurface actualLocalVolatilityFromImpliedVolatilityResult =
        dupireLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, mock(Function.class), mock(Function.class));

    // Assert
    verify(impliedVolatilitySurface).getName();
    SurfaceMetadata metadata = actualLocalVolatilityFromImpliedVolatilityResult.getMetadata();
    assertTrue(metadata instanceof DefaultSurfaceMetadata);
    ValueType zValueType = metadata.getZValueType();
    assertEquals("LocalVolatility", zValueType.getName());
    assertEquals("LocalVolatility", zValueType.toString());
    ValueType yValueType = metadata.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = metadata.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    SurfaceName name = actualLocalVolatilityFromImpliedVolatilityResult.getName();
    assertEquals("localVol_null", name.getName());
    assertEquals(0, actualLocalVolatilityFromImpliedVolatilityResult.getParameterCount());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultSurfaceMetadata) metadata).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, name.getMarketDataType());
    assertSame(name, metadata.getSurfaceName());
    assertSame(
        impliedVolatilitySurface,
        actualLocalVolatilityFromImpliedVolatilityResult.getOriginalSurface());
  }

  /**
   * Test {@link DupireLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double, Function,
   * Function)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then return Name Name is {@code localVol_null}.
   * </ul>
   *
   * <p>Method under test: {@link DupireLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); given 'null'; then return Name Name is 'localVol_null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DeformedSurface DupireLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_givenNull_thenReturnNameNameIsLocalVolNull() {
    // Arrange
    DupireLocalVolatilityCalculator dupireLocalVolatilityCalculator =
        new DupireLocalVolatilityCalculator();

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.getName()).thenReturn(null);

    // Act
    DeformedSurface actualLocalVolatilityFromPriceResult =
        dupireLocalVolatilityCalculator.localVolatilityFromPrice(
            callPriceSurface, 10.0d, mock(Function.class), mock(Function.class));

    // Assert
    verify(callPriceSurface).getName();
    SurfaceMetadata metadata = actualLocalVolatilityFromPriceResult.getMetadata();
    assertTrue(metadata instanceof DefaultSurfaceMetadata);
    ValueType zValueType = metadata.getZValueType();
    assertEquals("LocalVolatility", zValueType.getName());
    assertEquals("LocalVolatility", zValueType.toString());
    ValueType yValueType = metadata.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = metadata.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    SurfaceName name = actualLocalVolatilityFromPriceResult.getName();
    assertEquals("localVol_null", name.getName());
    assertEquals(0, actualLocalVolatilityFromPriceResult.getParameterCount());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultSurfaceMetadata) metadata).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, name.getMarketDataType());
    assertSame(name, metadata.getSurfaceName());
    assertSame(callPriceSurface, actualLocalVolatilityFromPriceResult.getOriginalSurface());
  }

  /**
   * Test {@link DupireLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double, Function,
   * Function)}.
   *
   * <ul>
   *   <li>Then return Name Name is {@code localVol_Name}.
   * </ul>
   *
   * <p>Method under test: {@link DupireLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); then return Name Name is 'localVol_Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DeformedSurface DupireLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_thenReturnNameNameIsLocalVolName() {
    // Arrange
    DupireLocalVolatilityCalculator dupireLocalVolatilityCalculator =
        new DupireLocalVolatilityCalculator();

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.getName()).thenReturn(SurfaceName.of("Name"));

    // Act
    DeformedSurface actualLocalVolatilityFromPriceResult =
        dupireLocalVolatilityCalculator.localVolatilityFromPrice(
            callPriceSurface, 10.0d, mock(Function.class), mock(Function.class));

    // Assert
    verify(callPriceSurface).getName();
    SurfaceMetadata metadata = actualLocalVolatilityFromPriceResult.getMetadata();
    assertTrue(metadata instanceof DefaultSurfaceMetadata);
    ValueType zValueType = metadata.getZValueType();
    assertEquals("LocalVolatility", zValueType.getName());
    assertEquals("LocalVolatility", zValueType.toString());
    ValueType yValueType = metadata.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = metadata.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    SurfaceName name = actualLocalVolatilityFromPriceResult.getName();
    assertEquals("localVol_Name", name.getName());
    assertEquals(0, actualLocalVolatilityFromPriceResult.getParameterCount());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultSurfaceMetadata) metadata).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, name.getMarketDataType());
    assertSame(name, metadata.getSurfaceName());
    assertSame(callPriceSurface, actualLocalVolatilityFromPriceResult.getOriginalSurface());
  }
}
