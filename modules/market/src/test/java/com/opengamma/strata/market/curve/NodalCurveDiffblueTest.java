package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NodalCurveDiffblueTest {
  /**
   * Test {@link NodalCurve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link SimpleCurveParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link NodalCurve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName(
      "Test getParameterMetadata(int); when zero; then return SimpleCurveParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata NodalCurve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenZero_thenReturnSimpleCurveParameterMetadata() {
    // Arrange and Act
    ParameterMetadata actualParameterMetadata =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d)
            .getParameterMetadata(0);

    // Assert
    assertTrue(actualParameterMetadata instanceof SimpleCurveParameterMetadata);
    ValueType xValueType = ((SimpleCurveParameterMetadata) actualParameterMetadata).getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals("Unknown=10.0", actualParameterMetadata.getIdentifier());
    assertEquals("Unknown=10.0", actualParameterMetadata.getLabel());
    assertEquals(10.0d, ((SimpleCurveParameterMetadata) actualParameterMetadata).getXValue());
  }

  /**
   * Test {@link NodalCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then return {@link ConstantNodalCurve}.
   * </ul>
   *
   * <p>Method under test: {@link NodalCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation); then return ConstantNodalCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NodalCurve NodalCurve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_thenReturnConstantNodalCurve() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ConstantNodalCurve actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertTrue(actualWithPerturbationResult instanceof ConstantNodalCurve);
    assertEquals(ofResult, actualWithPerturbationResult);
  }
}
