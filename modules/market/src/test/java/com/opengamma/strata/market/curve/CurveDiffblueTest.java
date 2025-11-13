package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ConstantNodalCurve.Builder;
import com.opengamma.strata.market.curve.CurveTest.TestingCurve;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CurveDiffblueTest {
  /**
   * Test {@link Curve#getName()}.
   *
   * <p>Method under test: {@link Curve#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveName Curve.getName()"})
  void testGetName() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(DefaultCurveMetadata.of(name)).xValue(10.0d).yValue(10.0d).build();

    // Act and Assert
    assertSame(name, AddFixedCurve.of(fixedCurve, spreadCurve).getName());
  }

  /**
   * Test {@link Curve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>Then return propertyNames Empty.
   * </ul>
   *
   * <p>Method under test: {@link Curve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName("Test getParameterMetadata(int); then return propertyNames Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata Curve.getParameterMetadata(int)"})
  void testGetParameterMetadata_thenReturnPropertyNamesEmpty() {
    // Arrange, Act and Assert
    assertTrue(
        ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d)
            .getParameterMetadata(1)
            .propertyNames()
            .isEmpty());
  }

  /**
   * Test {@link Curve#getParameterMetadata(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link SimpleCurveParameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curve#getParameterMetadata(int)}
   */
  @Test
  @DisplayName(
      "Test getParameterMetadata(int); when zero; then return SimpleCurveParameterMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterMetadata Curve.getParameterMetadata(int)"})
  void testGetParameterMetadata_whenZero_thenReturnSimpleCurveParameterMetadata() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    ParameterMetadata actualParameterMetadata =
        AddFixedCurve.of(fixedCurve, spreadCurve).getParameterMetadata(0);

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
   * Test {@link Curve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return {@link AddFixedCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Curve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); given CurveName with 'Name'; then return AddFixedCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Curve Curve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_givenCurveNameWithName_thenReturnAddFixedCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    AddFixedCurve actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertTrue(actualWithPerturbationResult instanceof AddFixedCurve);
    assertEquals(ofResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link Curve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Given {@link TestingCurve#TestingCurve(double)} with value is zero.
   *   <li>Then return {@link TestingCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Curve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); given TestingCurve(double) with value is zero; then return TestingCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Curve Curve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_givenTestingCurveWithValueIsZero_thenReturnTestingCurve() {
    // Arrange
    TestingCurve testingCurve = new TestingCurve(0.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    Curve actualWithPerturbationResult = testingCurve.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(0.0d), isA(ParameterMetadata.class));
    assertTrue(actualWithPerturbationResult instanceof TestingCurve);
    CurveMetadata metadata = actualWithPerturbationResult.getMetadata();
    assertTrue(metadata instanceof DefaultCurveMetadata);
    CurveName name = actualWithPerturbationResult.getName();
    assertEquals("Curve", name.getName());
    ValueType xValueType = metadata.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals(1, actualWithPerturbationResult.getParameterCount());
    assertFalse(metadata.getParameterMetadata().isPresent());
    assertTrue(((DefaultCurveMetadata) metadata).getInfo().isEmpty());
    assertSame(name, metadata.getCurveName());
    assertSame(xValueType, metadata.getYValueType());
  }

  /**
   * Test {@link Curve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then return {@link TestingCurve#TestingCurve(double)} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link Curve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); then return TestingCurve(double) with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Curve Curve.withPerturbation(ParameterPerturbation)"})
  void testWithPerturbation_thenReturnTestingCurveWithValueIsTen() {
    // Arrange
    TestingCurve testingCurve = new TestingCurve(10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    Curve actualWithPerturbationResult = testingCurve.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertSame(testingCurve, actualWithPerturbationResult);
  }

  /**
   * Test {@link Curve#createParameterSensitivity(DoubleArray)} with {@code sensitivities}.
   *
   * <p>Method under test: {@link Curve#createParameterSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName("Test createParameterSensitivity(DoubleArray) with 'sensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity Curve.createParameterSensitivity(DoubleArray)"})
  void testCreateParameterSensitivityWithSensitivities() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(DefaultCurveMetadata.of(name)).xValue(10.0d).yValue(10.0d).build();

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);
    DoubleArray sensitivities = DoubleArray.of(10.0d);

    // Act
    UnitParameterSensitivity actualCreateParameterSensitivityResult =
        ofResult.createParameterSensitivity(sensitivities);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata =
        actualCreateParameterSensitivityResult.getParameterMetadata();
    assertEquals(1, parameterMetadata.size());
    assertTrue(parameterMetadata.get(0) instanceof SimpleCurveParameterMetadata);
    assertEquals(1, actualCreateParameterSensitivityResult.getParameterCount());
    assertEquals(10.0d, actualCreateParameterSensitivityResult.total());
    assertFalse(actualCreateParameterSensitivityResult.getParameterSplit().isPresent());
    assertSame(sensitivities, actualCreateParameterSensitivityResult.getSensitivity());
    assertSame(name, actualCreateParameterSensitivityResult.getMarketDataName());
  }

  /**
   * Test {@link Curve#split()}.
   *
   * <ul>
   *   <li>Given {@link DefaultCurveMetadata} with name is {@link CurveName}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Curve#split()}
   */
  @Test
  @DisplayName(
      "Test split(); given DefaultCurveMetadata with name is CurveName; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Curve.split()"})
  void testSplit_givenDefaultCurveMetadataWithNameIsCurveName_thenReturnSizeIsOne() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    // Act
    ImmutableList<Curve> actualSplitResult = ofResult.split();

    // Assert
    assertEquals(1, actualSplitResult.size());
    assertSame(ofResult, actualSplitResult.get(0));
  }

  /**
   * Test {@link Curve#split()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Curve#split()}
   */
  @Test
  @DisplayName("Test split(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Curve.split()"})
  void testSplit_thenReturnSizeIsTwo() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve fixedCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    ImmutableList<Curve> actualSplitResult = AddFixedCurve.of(fixedCurve, spreadCurve).split();

    // Assert
    assertEquals(2, actualSplitResult.size());
    Curve getResult = actualSplitResult.get(0);
    assertTrue(getResult instanceof ConstantNodalCurve);
    Curve getResult2 = actualSplitResult.get(1);
    assertTrue(getResult2 instanceof ConstantNodalCurve);
    CurveMetadata metadata2 = getResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    assertEquals(1, getResult.getParameterCount());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getXValue());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getYValue());
    assertEquals(getResult, getResult2);
    assertSame(metadata, metadata2);
  }

  /**
   * Test {@link Curve#withUnderlyingCurve(int, Curve)}.
   *
   * <p>Method under test: {@link Curve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Curve Curve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve curve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    Curve actualWithUnderlyingCurveResult = constantNodalCurve.withUnderlyingCurve(0, curve);

    // Assert
    assertSame(curve, actualWithUnderlyingCurveResult);
  }

  /**
   * Test {@link Curve#withUnderlyingCurve(int, Curve)}.
   *
   * <ul>
   *   <li>Then FixedCurve return {@link AddFixedCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Curve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve); then FixedCurve return AddFixedCurve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Curve Curve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve_thenFixedCurveReturnAddFixedCurve() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve fixedCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata2 = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve spreadCurve =
        builderResult2.metadata(metadata2).xValue(10.0d).yValue(10.0d).build();

    AddFixedCurve ofResult = AddFixedCurve.of(fixedCurve, spreadCurve);

    Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult4 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve2 =
        builderResult4
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve2, spreadCurve2);

    // Act
    AddFixedCurve actualWithUnderlyingCurveResult = ofResult.withUnderlyingCurve(0, curve);

    // Assert
    Curve fixedCurve3 = ((AddFixedCurve) actualWithUnderlyingCurveResult).getFixedCurve();
    assertTrue(fixedCurve3 instanceof AddFixedCurve);
    assertTrue(actualWithUnderlyingCurveResult instanceof AddFixedCurve);
    assertTrue(
        ((AddFixedCurve) actualWithUnderlyingCurveResult).getSpreadCurve()
            instanceof ConstantNodalCurve);
    CurveMetadata metadata3 = actualWithUnderlyingCurveResult.getMetadata();
    assertTrue(metadata3 instanceof DefaultCurveMetadata);
    assertEquals(1, actualWithUnderlyingCurveResult.getParameterCount());
    assertEquals(ofResult, fixedCurve3);
    assertEquals(metadata, metadata3);
    assertSame(curve, fixedCurve3);
    assertSame(metadata2, metadata3);
  }

  /**
   * Test {@link Curve#withUnderlyingCurve(int, Curve)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Curve#withUnderlyingCurve(int, Curve)}
   */
  @Test
  @DisplayName("Test withUnderlyingCurve(int, Curve); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Curve Curve.withUnderlyingCurve(int, Curve)"})
  void testWithUnderlyingCurve_thenThrowIllegalArgumentException() {
    // Arrange
    ConstantCurve ofResult = ConstantCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d);

    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve fixedCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve spreadCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    AddFixedCurve curve = AddFixedCurve.of(fixedCurve, spreadCurve);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withUnderlyingCurve(1, curve));
  }
}
