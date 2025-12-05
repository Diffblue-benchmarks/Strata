package com.opengamma.strata.market.surface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.param.LabelParameterMetadata;
import com.opengamma.strata.market.param.ParameterMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultSurfaceMetadataBuilderDiffblueTest {
  /**
   * Test {@link
   * DefaultSurfaceMetadataBuilder#DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)}.
   *
   * <p>Method under test: {@link
   * DefaultSurfaceMetadataBuilder#DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)}
   */
  @Test
  @DisplayName("Test new DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultSurfaceMetadataBuilder.<init>(DefaultSurfaceMetadata)"})
  void testNewDefaultSurfaceMetadataBuilder() {
    // Arrange
    DefaultSurfaceMetadata beanToCopy = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act and Assert
    DefaultSurfaceMetadata actualDefaultSurfaceMetadata =
        new DefaultSurfaceMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultSurfaceMetadata);
  }

  /**
   * Test {@link
   * DefaultSurfaceMetadataBuilder#DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)}.
   *
   * <p>Method under test: {@link
   * DefaultSurfaceMetadataBuilder#DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)}
   */
  @Test
  @DisplayName("Test new DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultSurfaceMetadataBuilder.<init>(DefaultSurfaceMetadata)"})
  void testNewDefaultSurfaceMetadataBuilder2() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Name");
    info.put(ofResult, "Value");
    SurfaceName surfaceName = SurfaceName.of("Name");

    DefaultSurfaceMetadata beanToCopy =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    DefaultSurfaceMetadata actualDefaultSurfaceMetadata =
        new DefaultSurfaceMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultSurfaceMetadata);
  }

  /**
   * Test {@link
   * DefaultSurfaceMetadataBuilder#DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)}.
   *
   * <ul>
   *   <li>Given of {@code DayCount}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultSurfaceMetadataBuilder#DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata)}
   */
  @Test
  @DisplayName(
      "Test new DefaultSurfaceMetadataBuilder(DefaultSurfaceMetadata); given of 'DayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultSurfaceMetadataBuilder.<init>(DefaultSurfaceMetadata)"})
  void testNewDefaultSurfaceMetadataBuilder_givenOfDayCount() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("DayCount");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("Name");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("Name");

    DefaultSurfaceMetadata beanToCopy =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    DefaultSurfaceMetadata actualDefaultSurfaceMetadata =
        new DefaultSurfaceMetadataBuilder(beanToCopy).build();
    assertEquals(beanToCopy, actualDefaultSurfaceMetadata);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#surfaceName(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Doe}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#surfaceName(String)}
   */
  @Test
  @DisplayName("Test surfaceName(String) with 'String'; when 'Doe'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.surfaceName(String)"
  })
  void testSurfaceNameWithString_whenDoe_thenReturnBuilder() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualSurfaceNameResult = builderResult.surfaceName("Doe");

    // Assert
    assertSame(builderResult, actualSurfaceNameResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#surfaceName(SurfaceName)} with {@code SurfaceName}.
   *
   * <ul>
   *   <li>When {@link SurfaceName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#surfaceName(SurfaceName)}
   */
  @Test
  @DisplayName(
      "Test surfaceName(SurfaceName) with 'SurfaceName'; when SurfaceName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.surfaceName(SurfaceName)"
  })
  void testSurfaceNameWithSurfaceName_whenSurfaceNameWithName_thenReturnBuilder() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();
    SurfaceName surfaceName = SurfaceName.of("Name");

    // Act
    DefaultSurfaceMetadataBuilder actualSurfaceNameResult = builderResult.surfaceName(surfaceName);

    // Assert
    assertSame(builderResult, actualSurfaceNameResult);
    assertSame(surfaceName, builderResult.build().getSurfaceName());
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#xValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#xValueType(ValueType)}
   */
  @Test
  @DisplayName("Test xValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.xValueType(ValueType)"
  })
  void testXValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualXValueTypeResult =
        builderResult.xValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualXValueTypeResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#yValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#yValueType(ValueType)}
   */
  @Test
  @DisplayName("Test yValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.yValueType(ValueType)"
  })
  void testYValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualYValueTypeResult =
        builderResult.yValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualYValueTypeResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#zValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#zValueType(ValueType)}
   */
  @Test
  @DisplayName("Test zValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.zValueType(ValueType)"
  })
  void testZValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualZValueTypeResult =
        builderResult.zValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualZValueTypeResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test dayCount(DayCount); when DayCount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.dayCount(DayCount)"
  })
  void testDayCount_whenDayCount() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualDayCountResult =
        builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test dayCount(DayCount); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.dayCount(DayCount)"
  })
  void testDayCount_whenNull() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualDayCountResult = builderResult.dayCount(null);

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#addInfo(SurfaceInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@link SurfaceInfoType} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#addInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test addInfo(SurfaceInfoType, Object); when SurfaceInfoType with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.addInfo(SurfaceInfoType, Object)"
  })
  void testAddInfo_whenSurfaceInfoTypeWithName_thenReturnBuilder() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadataBuilder actualAddInfoResult = builderResult.addInfo(type, "Value");

    // Assert
    assertSame(builderResult, actualAddInfoResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#addInfo(SurfaceInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@link SurfaceInfoType} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#addInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test addInfo(SurfaceInfoType, Object); when SurfaceInfoType with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.addInfo(SurfaceInfoType, Object)"
  })
  void testAddInfo_whenSurfaceInfoTypeWithName_thenReturnBuilder2() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadataBuilder actualAddInfoResult = builderResult.addInfo(type, null);

    // Assert
    assertSame(builderResult, actualAddInfoResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#parameterMetadata(List)} with {@code List}.
   *
   * <p>Method under test: {@link DefaultSurfaceMetadataBuilder#parameterMetadata(List)}
   */
  @Test
  @DisplayName("Test parameterMetadata(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.parameterMetadata(List)"
  })
  void testParameterMetadataWithList() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualParameterMetadataResult =
        builderResult.parameterMetadata(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultSurfaceMetadataBuilder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName(
      "Test parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.parameterMetadata(ParameterMetadata[])"
  })
  void testParameterMetadataWithParameterMetadata_thenReturnBuilder() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualParameterMetadataResult = builderResult.parameterMetadata();

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadataBuilder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <ul>
   *   <li>When {@link LabelParameterMetadata} with {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultSurfaceMetadataBuilder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName(
      "Test parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'; when LabelParameterMetadata with 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadataBuilder.parameterMetadata(ParameterMetadata[])"
  })
  void testParameterMetadataWithParameterMetadata_whenLabelParameterMetadataWithLabel() {
    // Arrange
    DefaultSurfaceMetadataBuilder builderResult = DefaultSurfaceMetadata.builder();

    // Act
    DefaultSurfaceMetadataBuilder actualParameterMetadataResult =
        builderResult.parameterMetadata(LabelParameterMetadata.of("Label"));

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }
}
