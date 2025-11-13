package com.opengamma.strata.market.cube;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.param.ParameterMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultCubeMetadataBuilderDiffblueTest {
  /**
   * Test {@link DefaultCubeMetadataBuilder#DefaultCubeMetadataBuilder(DefaultCubeMetadata)}.
   *
   * <p>Method under test: {@link
   * DefaultCubeMetadataBuilder#DefaultCubeMetadataBuilder(DefaultCubeMetadata)}
   */
  @Test
  @DisplayName("Test new DefaultCubeMetadataBuilder(DefaultCubeMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCubeMetadataBuilder.<init>(DefaultCubeMetadata)"})
  void testNewDefaultCubeMetadataBuilder() {
    // Arrange
    DefaultCubeMetadata beanToCopy = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act and Assert
    DefaultCubeMetadata actualDefaultCubeMetadata =
        new DefaultCubeMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultCubeMetadata);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#DefaultCubeMetadataBuilder(DefaultCubeMetadata)}.
   *
   * <p>Method under test: {@link
   * DefaultCubeMetadataBuilder#DefaultCubeMetadataBuilder(DefaultCubeMetadata)}
   */
  @Test
  @DisplayName("Test new DefaultCubeMetadataBuilder(DefaultCubeMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCubeMetadataBuilder.<init>(DefaultCubeMetadata)"})
  void testNewDefaultCubeMetadataBuilder2() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("Name");
    info.put(ofResult, "Value");
    CubeName cubeName = CubeName.of("Name");

    DefaultCubeMetadata beanToCopy =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    DefaultCubeMetadata actualDefaultCubeMetadata =
        new DefaultCubeMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultCubeMetadata);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#DefaultCubeMetadataBuilder(DefaultCubeMetadata)}.
   *
   * <ul>
   *   <li>Given of {@code DayCount}.
   *   <li>When {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCubeMetadataBuilder#DefaultCubeMetadataBuilder(DefaultCubeMetadata)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCubeMetadataBuilder(DefaultCubeMetadata); given of 'DayCount'; when HashMap() of 'DayCount' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCubeMetadataBuilder.<init>(DefaultCubeMetadata)"})
  void testNewDefaultCubeMetadataBuilder_givenOfDayCount_whenHashMapOfDayCountIsValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("DayCount");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("Name");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("Name");

    DefaultCubeMetadata beanToCopy =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    DefaultCubeMetadata actualDefaultCubeMetadata =
        new DefaultCubeMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultCubeMetadata);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#cubeName(CubeName)} with {@code CubeName}.
   *
   * <ul>
   *   <li>Then builder build CubeName is {@link CubeName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#cubeName(CubeName)}
   */
  @Test
  @DisplayName(
      "Test cubeName(CubeName) with 'CubeName'; then builder build CubeName is CubeName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.cubeName(CubeName)"})
  void testCubeNameWithCubeName_thenBuilderBuildCubeNameIsCubeNameWithName() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();
    CubeName cubeName = CubeName.of("Name");

    // Act
    DefaultCubeMetadataBuilder actualCubeNameResult = builderResult.cubeName(cubeName);

    // Assert
    assertSame(cubeName, builderResult.build().getCubeName());
    assertSame(builderResult, actualCubeNameResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#cubeName(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Cube Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#cubeName(String)}
   */
  @Test
  @DisplayName("Test cubeName(String) with 'String'; when 'Cube Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.cubeName(String)"})
  void testCubeNameWithString_whenCubeName_thenReturnBuilder() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualCubeNameResult = builderResult.cubeName("Cube Name");

    // Assert
    assertSame(builderResult, actualCubeNameResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#xValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#xValueType(ValueType)}
   */
  @Test
  @DisplayName("Test xValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.xValueType(ValueType)"})
  void testXValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualXValueTypeResult =
        builderResult.xValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualXValueTypeResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#yValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#yValueType(ValueType)}
   */
  @Test
  @DisplayName("Test yValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.yValueType(ValueType)"})
  void testYValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualYValueTypeResult =
        builderResult.yValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualYValueTypeResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#zValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#zValueType(ValueType)}
   */
  @Test
  @DisplayName("Test zValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.zValueType(ValueType)"})
  void testZValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualZValueTypeResult =
        builderResult.zValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualZValueTypeResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#wValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#wValueType(ValueType)}
   */
  @Test
  @DisplayName("Test wValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.wValueType(ValueType)"})
  void testWValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualWValueTypeResult =
        builderResult.wValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualWValueTypeResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test dayCount(DayCount); when DayCount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.dayCount(DayCount)"})
  void testDayCount_whenDayCount() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test dayCount(DayCount); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.dayCount(DayCount)"})
  void testDayCount_whenNull() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualDayCountResult = builderResult.dayCount(null);

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#addInfo(CubeInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@link CubeInfoType} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#addInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test addInfo(CubeInfoType, Object); when CubeInfoType with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.addInfo(CubeInfoType, Object)"
  })
  void testAddInfo_whenCubeInfoTypeWithName_thenReturnBuilder() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadataBuilder actualAddInfoResult = builderResult.addInfo(type, "Value");

    // Assert
    assertSame(builderResult, actualAddInfoResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#addInfo(CubeInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@link CubeInfoType} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#addInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test addInfo(CubeInfoType, Object); when CubeInfoType with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.addInfo(CubeInfoType, Object)"
  })
  void testAddInfo_whenCubeInfoTypeWithName_thenReturnBuilder2() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadataBuilder actualAddInfoResult = builderResult.addInfo(type, null);

    // Assert
    assertSame(builderResult, actualAddInfoResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#parameterMetadata(List)} with {@code List}.
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#parameterMetadata(List)}
   */
  @Test
  @DisplayName("Test parameterMetadata(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.parameterMetadata(List)"
  })
  void testParameterMetadataWithList() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualParameterMetadataResult =
        builderResult.parameterMetadata(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName("Test parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.parameterMetadata(ParameterMetadata[])"
  })
  void testParameterMetadataWithParameterMetadata() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();
    SimpleCubeParameterMetadata ofResult =
        SimpleCubeParameterMetadata.of(
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d,
            ValueType.BLACK_VOLATILITY,
            10.0d);

    // Act
    DefaultCubeMetadataBuilder actualParameterMetadataResult =
        builderResult.parameterMetadata(ofResult);

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test {@link DefaultCubeMetadataBuilder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadataBuilder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName(
      "Test parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultCubeMetadataBuilder DefaultCubeMetadataBuilder.parameterMetadata(ParameterMetadata[])"
  })
  void testParameterMetadataWithParameterMetadata_thenReturnBuilder() {
    // Arrange
    DefaultCubeMetadataBuilder builderResult = DefaultCubeMetadata.builder();

    // Act
    DefaultCubeMetadataBuilder actualParameterMetadataResult = builderResult.parameterMetadata();

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }
}
