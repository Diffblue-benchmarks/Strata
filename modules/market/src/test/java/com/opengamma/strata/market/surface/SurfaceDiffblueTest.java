package com.opengamma.strata.market.surface;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.tuple.DoublesPair;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SurfaceDiffblueTest {
  /**
   * Test {@link Surface#getName()}.
   *
   * <p>Method under test: {@link Surface#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceName Surface.getName()"})
  void testGetName() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act and Assert
    assertSame(name, ConstantSurface.of(DefaultSurfaceMetadata.of(name), 10.0d).getName());
  }

  /**
   * Test {@link Surface#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>Then return propertyNames Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surface#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int); then return propertyNames Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata Surface.getParameterMetadata(int)"})
  void testGetParameterMetadata_thenReturnPropertyNamesEmpty() {
    // Arrange, Act and Assert
    assertTrue(
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d)
            .getParameterMetadata(1)
            .propertyNames()
            .isEmpty());
  }

  /**
   * Test {@link Surface#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceName} with {@code Name}.
   *   <li>Then return {@link ConstantSurface}.
   * </ul>
   *
   * <p>Method under test: {@link Surface#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); given SurfaceName with 'Name'; then return ConstantSurface")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Surface Surface.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_givenSurfaceNameWithName_thenReturnConstantSurface() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ConstantSurface actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertTrue(actualWithPerturbationResult instanceof ConstantSurface);
    assertEquals(ofResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link Surface#zValue(DoublesPair)} with {@code xyPair}.
   *
   * <ul>
   *   <li>When {@link DoublesPair} with first is ten and second is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link Surface#zValue(DoublesPair)}
   */
  @Test
  @DisplayName(
      "Test zValue(DoublesPair) with 'xyPair'; when DoublesPair with first is ten and second is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Surface.zValue(DoublesPair)"})
  void testZValueWithXyPair_whenDoublesPairWithFirstIsTenAndSecondIsTen_thenReturnTen() {
    // Arrange
    ConstantSurface ofResult =
        ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.zValue(DoublesPair.of(10.0d, 10.0d)));
  }

  /**
   * Test {@link Surface#zValueParameterSensitivity(DoublesPair)} with {@code xyPair}.
   *
   * <ul>
   *   <li>Then return Sensitivity dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link Surface#zValueParameterSensitivity(DoublesPair)}
   */
  @Test
  @DisplayName(
      "Test zValueParameterSensitivity(DoublesPair) with 'xyPair'; then return Sensitivity dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity Surface.zValueParameterSensitivity(DoublesPair)"})
  void testZValueParameterSensitivityWithXyPair_thenReturnSensitivityDimensionsIsOne() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");
    ConstantSurface ofResult = ConstantSurface.of(DefaultSurfaceMetadata.of(name), 10.0d);

    // Act
    UnitParameterSensitivity actualZValueParameterSensitivityResult =
        ofResult.zValueParameterSensitivity(DoublesPair.of(10.0d, 10.0d));

    // Assert
    DoubleArray sensitivity = actualZValueParameterSensitivityResult.getSensitivity();
    assertEquals(1, sensitivity.dimensions());
    assertEquals(1, sensitivity.size());
    assertEquals(1, actualZValueParameterSensitivityResult.getParameterCount());
    assertEquals(1, actualZValueParameterSensitivityResult.getParameterMetadata().size());
    assertEquals(1, sensitivity.toList().size());
    assertEquals(1.0d, sensitivity.max());
    assertEquals(1.0d, sensitivity.min());
    assertEquals(1.0d, sensitivity.sum());
    assertEquals(1.0d, actualZValueParameterSensitivityResult.total());
    assertFalse(sensitivity.isEmpty());
    assertFalse(actualZValueParameterSensitivityResult.getParameterSplit().isPresent());
    assertSame(name, actualZValueParameterSensitivityResult.getMarketDataName());
    assertArrayEquals(new double[] {1.0d}, sensitivity.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link Surface#createParameterSensitivity(DoubleArray)} with {@code sensitivities}.
   *
   * <ul>
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link Surface#createParameterSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test createParameterSensitivity(DoubleArray) with 'sensitivities'; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity Surface.createParameterSensitivity(DoubleArray)"})
  void testCreateParameterSensitivityWithSensitivities_thenReturnParameterCountIsOne() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");
    ConstantSurface ofResult = ConstantSurface.of(DefaultSurfaceMetadata.of(name), 10.0d);
    DoubleArray sensitivities = DoubleArray.of(10.0d);

    // Act
    UnitParameterSensitivity actualCreateParameterSensitivityResult =
        ofResult.createParameterSensitivity(sensitivities);

    // Assert
    assertEquals(1, actualCreateParameterSensitivityResult.getParameterCount());
    assertEquals(1, actualCreateParameterSensitivityResult.getParameterMetadata().size());
    assertEquals(10.0d, actualCreateParameterSensitivityResult.total());
    assertFalse(actualCreateParameterSensitivityResult.getParameterSplit().isPresent());
    assertSame(sensitivities, actualCreateParameterSensitivityResult.getSensitivity());
    assertSame(name, actualCreateParameterSensitivityResult.getMarketDataName());
  }
}
