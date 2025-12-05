package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.param.ParameterMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultCurveMetadataBuilderDiffblueTest {
  /**
   * Test {@link DefaultCurveMetadataBuilder#DefaultCurveMetadataBuilder(DefaultCurveMetadata)}.
   *
   * <p>Method under test: {@link
   * DefaultCurveMetadataBuilder#DefaultCurveMetadataBuilder(DefaultCurveMetadata)}
   */
  @Test
  @DisplayName("Test new DefaultCurveMetadataBuilder(DefaultCurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCurveMetadataBuilder.<init>(DefaultCurveMetadata)"})
  void testNewDefaultCurveMetadataBuilder() {
    // Arrange
    DefaultCurveMetadata beanToCopy = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act and Assert
    DefaultCurveMetadata actualDefaultCurveMetadata =
        new DefaultCurveMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultCurveMetadata);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#DefaultCurveMetadataBuilder(DefaultCurveMetadata)}.
   *
   * <p>Method under test: {@link
   * DefaultCurveMetadataBuilder#DefaultCurveMetadataBuilder(DefaultCurveMetadata)}
   */
  @Test
  @DisplayName("Test new DefaultCurveMetadataBuilder(DefaultCurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCurveMetadataBuilder.<init>(DefaultCurveMetadata)"})
  void testNewDefaultCurveMetadataBuilder2() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("Name");
    info.put(ofResult, "Value");
    CurveName curveName = CurveName.of("Name");

    DefaultCurveMetadata beanToCopy =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    DefaultCurveMetadata actualDefaultCurveMetadata =
        new DefaultCurveMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultCurveMetadata);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#DefaultCurveMetadataBuilder(DefaultCurveMetadata)}.
   *
   * <ul>
   *   <li>Given of {@code CdsIndexFactor}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCurveMetadataBuilder#DefaultCurveMetadataBuilder(DefaultCurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCurveMetadataBuilder(DefaultCurveMetadata); given of 'CdsIndexFactor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCurveMetadataBuilder.<init>(DefaultCurveMetadata)"})
  void testNewDefaultCurveMetadataBuilder_givenOfCdsIndexFactor() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("CdsIndexFactor");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("Name");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("Name");

    DefaultCurveMetadata beanToCopy =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    DefaultCurveMetadata actualDefaultCurveMetadata =
        new DefaultCurveMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultCurveMetadata);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#curveName(CurveName)} with {@code CurveName}.
   *
   * <ul>
   *   <li>Then builder build CurveName is {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#curveName(CurveName)}
   */
  @Test
  @DisplayName(
      "Test curveName(CurveName) with 'CurveName'; then builder build CurveName is CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.curveName(CurveName)"
  })
  void testCurveNameWithCurveName_thenBuilderBuildCurveNameIsCurveNameWithName() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();
    CurveName curveName = CurveName.of("Name");

    // Act
    DefaultCurveMetadataBuilder actualCurveNameResult = builderResult.curveName(curveName);

    // Assert
    assertSame(curveName, builderResult.build().getCurveName());
    assertSame(builderResult, actualCurveNameResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#curveName(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Curve Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#curveName(String)}
   */
  @Test
  @DisplayName("Test curveName(String) with 'String'; when 'Curve Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.curveName(String)"})
  void testCurveNameWithString_whenCurveName_thenReturnBuilder() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualCurveNameResult = builderResult.curveName("Curve Name");

    // Assert
    assertSame(builderResult, actualCurveNameResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#xValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#xValueType(ValueType)}
   */
  @Test
  @DisplayName("Test xValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.xValueType(ValueType)"
  })
  void testXValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualXValueTypeResult =
        builderResult.xValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualXValueTypeResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#yValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#yValueType(ValueType)}
   */
  @Test
  @DisplayName("Test yValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.yValueType(ValueType)"
  })
  void testYValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualYValueTypeResult =
        builderResult.yValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualYValueTypeResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test dayCount(DayCount); when DayCount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.dayCount(DayCount)"})
  void testDayCount_whenDayCount() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test dayCount(DayCount); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.dayCount(DayCount)"})
  void testDayCount_whenNull() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualDayCountResult = builderResult.dayCount(null);

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#jacobian(JacobianCalibrationMatrix)}.
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#jacobian(JacobianCalibrationMatrix)}
   */
  @Test
  @DisplayName("Test jacobian(JacobianCalibrationMatrix)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.jacobian(JacobianCalibrationMatrix)"
  })
  void testJacobian() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();
    ArrayList<CurveParameterSize> order = new ArrayList<>();

    // Act
    DefaultCurveMetadataBuilder actualJacobianResult =
        builderResult.jacobian(JacobianCalibrationMatrix.of(order, DoubleMatrix.of()));

    // Assert
    assertSame(builderResult, actualJacobianResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#jacobian(JacobianCalibrationMatrix)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#jacobian(JacobianCalibrationMatrix)}
   */
  @Test
  @DisplayName("Test jacobian(JacobianCalibrationMatrix); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.jacobian(JacobianCalibrationMatrix)"
  })
  void testJacobian_whenNull() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualJacobianResult = builderResult.jacobian(null);

    // Assert
    assertSame(builderResult, actualJacobianResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#addInfo(CurveInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@link CurveInfoType} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#addInfo(CurveInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test addInfo(CurveInfoType, Object); when CurveInfoType with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.addInfo(CurveInfoType, Object)"
  })
  void testAddInfo_whenCurveInfoTypeWithName_thenReturnBuilder() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    DefaultCurveMetadataBuilder actualAddInfoResult = builderResult.addInfo(type, "Value");

    // Assert
    assertSame(builderResult, actualAddInfoResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#addInfo(CurveInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@link CurveInfoType} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#addInfo(CurveInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test addInfo(CurveInfoType, Object); when CurveInfoType with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.addInfo(CurveInfoType, Object)"
  })
  void testAddInfo_whenCurveInfoTypeWithName_thenReturnBuilder2() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    DefaultCurveMetadataBuilder actualAddInfoResult = builderResult.addInfo(type, null);

    // Assert
    assertSame(builderResult, actualAddInfoResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#parameterMetadata(List)} with {@code List}.
   *
   * <p>Method under test: {@link DefaultCurveMetadataBuilder#parameterMetadata(List)}
   */
  @Test
  @DisplayName("Test parameterMetadata(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.parameterMetadata(List)"
  })
  void testParameterMetadataWithList() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualParameterMetadataResult =
        builderResult.parameterMetadata(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <p>Method under test: {@link
   * DefaultCurveMetadataBuilder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName("Test parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.parameterMetadata(ParameterMetadata[])"
  })
  void testParameterMetadataWithParameterMetadata() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualParameterMetadataResult =
        builderResult.parameterMetadata(
            SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d));

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test {@link DefaultCurveMetadataBuilder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCurveMetadataBuilder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName(
      "Test parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCurveMetadataBuilder DefaultCurveMetadataBuilder.parameterMetadata(ParameterMetadata[])"
  })
  void testParameterMetadataWithParameterMetadata_thenReturnBuilder() {
    // Arrange
    DefaultCurveMetadataBuilder builderResult = DefaultCurveMetadata.builder();

    // Act
    DefaultCurveMetadataBuilder actualParameterMetadataResult = builderResult.parameterMetadata();

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }
}
