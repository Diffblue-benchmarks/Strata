package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.model.SabrInterestRateParameters;
import com.opengamma.strata.pricer.swaption.NormalSabrParametersSwaptionVolatilities.Builder;
import com.opengamma.strata.pricer.swaption.NormalSabrParametersSwaptionVolatilities.Meta;
import com.opengamma.strata.product.swap.type.FixedFloatSwapConvention;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalSabrParametersSwaptionVolatilitiesDiffblueTest {
  /**
   * Test Builder {@link Builder#convention(FixedFloatSwapConvention)}.
   *
   * <ul>
   *   <li>When {@link FixedFloatSwapConvention}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#convention(FixedFloatSwapConvention)}
   */
  @Test
  @DisplayName(
      "Test Builder convention(FixedFloatSwapConvention); when FixedFloatSwapConvention; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.convention(FixedFloatSwapConvention)"})
  void testBuilderConvention_whenFixedFloatSwapConvention_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualConventionResult = builderResult.convention(mock(FixedFloatSwapConvention.class));

    // Assert
    assertSame(builderResult, actualConventionResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityAlpha(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityAlpha(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityAlpha(DoubleArray[]) with 'DoubleArray[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityAlpha(DoubleArray[])"})
  void testBuilderDataSensitivityAlphaWithDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityAlphaResult = builderResult.dataSensitivityAlpha();

    // Assert
    assertSame(builderResult, actualDataSensitivityAlphaResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityAlpha(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} and {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityAlpha(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityAlpha(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray and DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityAlpha(DoubleArray[])"})
  void testBuilderDataSensitivityAlphaWithDoubleArray_whenDoubleArrayAndDoubleArray() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();
    DoubleArray ofResult = DoubleArray.of();

    // Act
    Builder actualDataSensitivityAlphaResult =
        builderResult.dataSensitivityAlpha(ofResult, DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityAlphaResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityAlpha(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityAlpha(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityAlpha(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityAlpha(DoubleArray[])"})
  void testBuilderDataSensitivityAlphaWithDoubleArray_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityAlphaResult = builderResult.dataSensitivityAlpha(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityAlphaResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityBeta(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityBeta(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityBeta(DoubleArray[]) with 'DoubleArray[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityBeta(DoubleArray[])"})
  void testBuilderDataSensitivityBetaWithDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityBetaResult = builderResult.dataSensitivityBeta();

    // Assert
    assertSame(builderResult, actualDataSensitivityBetaResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityBeta(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} and {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityBeta(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityBeta(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray and DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityBeta(DoubleArray[])"})
  void testBuilderDataSensitivityBetaWithDoubleArray_whenDoubleArrayAndDoubleArray() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();
    DoubleArray ofResult = DoubleArray.of();

    // Act
    Builder actualDataSensitivityBetaResult =
        builderResult.dataSensitivityBeta(ofResult, DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityBetaResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityBeta(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityBeta(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityBeta(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityBeta(DoubleArray[])"})
  void testBuilderDataSensitivityBetaWithDoubleArray_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityBetaResult = builderResult.dataSensitivityBeta(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityBetaResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityNu(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityNu(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityNu(DoubleArray[]) with 'DoubleArray[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityNu(DoubleArray[])"})
  void testBuilderDataSensitivityNuWithDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityNuResult = builderResult.dataSensitivityNu();

    // Assert
    assertSame(builderResult, actualDataSensitivityNuResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityNu(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} and {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityNu(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityNu(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray and DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityNu(DoubleArray[])"})
  void testBuilderDataSensitivityNuWithDoubleArray_whenDoubleArrayAndDoubleArray() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();
    DoubleArray ofResult = DoubleArray.of();

    // Act
    Builder actualDataSensitivityNuResult =
        builderResult.dataSensitivityNu(ofResult, DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityNuResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityNu(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityNu(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityNu(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityNu(DoubleArray[])"})
  void testBuilderDataSensitivityNuWithDoubleArray_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityNuResult = builderResult.dataSensitivityNu(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityNuResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityRho(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityRho(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityRho(DoubleArray[]) with 'DoubleArray[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityRho(DoubleArray[])"})
  void testBuilderDataSensitivityRhoWithDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityRhoResult = builderResult.dataSensitivityRho();

    // Assert
    assertSame(builderResult, actualDataSensitivityRhoResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityRho(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} and {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityRho(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityRho(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray and DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityRho(DoubleArray[])"})
  void testBuilderDataSensitivityRhoWithDoubleArray_whenDoubleArrayAndDoubleArray() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();
    DoubleArray ofResult = DoubleArray.of();

    // Act
    Builder actualDataSensitivityRhoResult =
        builderResult.dataSensitivityRho(ofResult, DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityRhoResult);
  }

  /**
   * Test Builder {@link Builder#dataSensitivityRho(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dataSensitivityRho(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder dataSensitivityRho(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dataSensitivityRho(DoubleArray[])"})
  void testBuilderDataSensitivityRhoWithDoubleArray_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualDataSensitivityRhoResult = builderResult.dataSensitivityRho(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualDataSensitivityRhoResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'convention'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenConvention_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NormalSabrParametersSwaptionVolatilities.builder().get("convention"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NormalSabrParametersSwaptionVolatilities.builder().get("name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'parameters'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenParameters_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NormalSabrParametersSwaptionVolatilities.builder().get("parameters"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> NormalSabrParametersSwaptionVolatilities.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code valuationDateTime}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'valuationDateTime'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValuationDateTime_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NormalSabrParametersSwaptionVolatilities.builder().get("valuationDateTime"));
  }

  /**
   * Test Builder {@link Builder#name(SwaptionVolatilitiesName)}.
   *
   * <ul>
   *   <li>When {@link SwaptionVolatilitiesName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(SwaptionVolatilitiesName)}
   */
  @Test
  @DisplayName(
      "Test Builder name(SwaptionVolatilitiesName); when SwaptionVolatilitiesName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(SwaptionVolatilitiesName)"})
  void testBuilderName_whenSwaptionVolatilitiesNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualNameResult = builderResult.name(SwaptionVolatilitiesName.of("Name"));

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> NormalSabrParametersSwaptionVolatilities.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'convention'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenConvention_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualSetResult = builderResult.set("convention", null);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#valuationDateTime(ZonedDateTime)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valuationDateTime(ZonedDateTime)}
   */
  @Test
  @DisplayName("Test Builder valuationDateTime(ZonedDateTime); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valuationDateTime(ZonedDateTime)"})
  void testBuilderValuationDateTime_thenReturnBuilder() {
    // Arrange
    Builder builderResult = NormalSabrParametersSwaptionVolatilities.builder();

    // Act
    Builder actualValuationDateTimeResult =
        builderResult.valuationDateTime(
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Assert
    assertSame(builderResult, actualValuationDateTimeResult);
  }

  /**
   * Test {@link NormalSabrParametersSwaptionVolatilities#meta()}.
   *
   * <p>Method under test: {@link NormalSabrParametersSwaptionVolatilities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta NormalSabrParametersSwaptionVolatilities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = NormalSabrParametersSwaptionVolatilities.meta();

    // Assert
    assertTrue(actualMetaResult.convention() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameters() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valuationDateTime() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends NormalSabrParametersSwaptionVolatilities> actualBeanTypeResult =
        NormalSabrParametersSwaptionVolatilities.meta().beanType();

    // Assert
    Class<NormalSabrParametersSwaptionVolatilities> expectedBeanTypeResult =
        NormalSabrParametersSwaptionVolatilities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#convention()}
   *   <li>{@link Meta#dataSensitivityAlpha()}
   *   <li>{@link Meta#dataSensitivityBeta()}
   *   <li>{@link Meta#dataSensitivityNu()}
   *   <li>{@link Meta#dataSensitivityRho()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#parameters()}
   *   <li>{@link Meta#valuationDateTime()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.convention()",
    "MetaProperty Meta.dataSensitivityAlpha()",
    "MetaProperty Meta.dataSensitivityBeta()",
    "MetaProperty Meta.dataSensitivityNu()",
    "MetaProperty Meta.dataSensitivityRho()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.parameters()",
    "MetaProperty Meta.valuationDateTime()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = NormalSabrParametersSwaptionVolatilities.meta();

    // Act
    MetaProperty<FixedFloatSwapConvention> actualConventionResult = metaResult.convention();
    MetaProperty<ImmutableList<DoubleArray>> actualDataSensitivityAlphaResult =
        metaResult.dataSensitivityAlpha();
    MetaProperty<ImmutableList<DoubleArray>> actualDataSensitivityBetaResult =
        metaResult.dataSensitivityBeta();
    MetaProperty<ImmutableList<DoubleArray>> actualDataSensitivityNuResult =
        metaResult.dataSensitivityNu();
    MetaProperty<ImmutableList<DoubleArray>> actualDataSensitivityRhoResult =
        metaResult.dataSensitivityRho();
    MetaProperty<SwaptionVolatilitiesName> actualNameResult = metaResult.name();
    MetaProperty<SabrInterestRateParameters> actualParametersResult = metaResult.parameters();

    // Assert
    assertTrue(actualConventionResult instanceof DirectMetaProperty);
    assertTrue(actualDataSensitivityAlphaResult instanceof DirectMetaProperty);
    assertTrue(actualDataSensitivityBetaResult instanceof DirectMetaProperty);
    assertTrue(actualDataSensitivityNuResult instanceof DirectMetaProperty);
    assertTrue(actualDataSensitivityRhoResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualParametersResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDateTime() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code dataSensitivityAlpha}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'dataSensitivityAlpha'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsDataSensitivityAlpha() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("dataSensitivityAlpha");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).convention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDateTime() instanceof DirectMetaProperty);
    assertEquals("dataSensitivityAlpha", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dataSensitivityAlpha());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code dataSensitivityBeta}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'dataSensitivityBeta'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsDataSensitivityBeta() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("dataSensitivityBeta");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).convention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDateTime() instanceof DirectMetaProperty);
    assertEquals("dataSensitivityBeta", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dataSensitivityBeta());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code dataSensitivityRho}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'dataSensitivityRho'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsDataSensitivityRho() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("dataSensitivityRho");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).convention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDateTime() instanceof DirectMetaProperty);
    assertEquals("dataSensitivityRho", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dataSensitivityRho());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return name is {@code convention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'convention'; then return name is 'convention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenConvention_thenReturnNameIsConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("convention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDateTime() instanceof DirectMetaProperty);
    assertEquals("convention", actualMetaPropertyGetResult.name());
    Class<FixedFloatSwapConvention> expectedPropertyTypeResult = FixedFloatSwapConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).convention());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dataSensitivityNu}.
   *   <li>Then return name is {@code dataSensitivityNu}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'dataSensitivityNu'; then return name is 'dataSensitivityNu'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDataSensitivityNu_thenReturnNameIsDataSensitivityNu() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("dataSensitivityNu");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).convention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDateTime() instanceof DirectMetaProperty);
    assertEquals("dataSensitivityNu", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dataSensitivityNu());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).convention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDateTime() instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<SwaptionVolatilitiesName> expectedPropertyTypeResult = SwaptionVolatilitiesName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return name is {@code parameters}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameters'; then return name is 'parameters'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameters_thenReturnNameIsParameters() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("parameters");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).convention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valuationDateTime() instanceof DirectMetaProperty);
    assertEquals("parameters", actualMetaPropertyGetResult.name());
    Class<SabrInterestRateParameters> expectedPropertyTypeResult = SabrInterestRateParameters.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameters());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDateTime}.
   *   <li>Then return name is {@code valuationDateTime}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDateTime'; then return name is 'valuationDateTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDateTime_thenReturnNameIsValuationDateTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyGet("valuationDateTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).convention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityAlpha() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityBeta() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityNu() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dataSensitivityRho() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameters() instanceof DirectMetaProperty);
    assertEquals("valuationDateTime", actualMetaPropertyGetResult.name());
    Class<ZonedDateTime> expectedPropertyTypeResult = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDateTime());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        NormalSabrParametersSwaptionVolatilities.meta().metaPropertyMap();

    // Assert
    assertEquals(8, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("convention") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("dataSensitivityAlpha") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("dataSensitivityBeta") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dataSensitivityNu") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dataSensitivityRho") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameters") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valuationDateTime") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        NormalSabrParametersSwaptionVolatilities.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'convention'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConvention_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dataSensitivityAlpha}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dataSensitivityAlpha'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDataSensitivityAlpha_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "dataSensitivityAlpha", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dataSensitivityBeta}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dataSensitivityBeta'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDataSensitivityBeta_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "dataSensitivityBeta", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dataSensitivityNu}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dataSensitivityNu'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDataSensitivityNu_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "dataSensitivityNu", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dataSensitivityRho}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dataSensitivityRho'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDataSensitivityRho_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "dataSensitivityRho", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameters'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameters_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "parameters", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            NormalSabrParametersSwaptionVolatilities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
