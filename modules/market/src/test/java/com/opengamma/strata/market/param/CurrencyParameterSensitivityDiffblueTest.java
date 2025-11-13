package com.opengamma.strata.market.param;

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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.market.cube.CubeName;
import com.opengamma.strata.market.param.CurrencyParameterSensitivity.Builder;
import com.opengamma.strata.market.param.CurrencyParameterSensitivity.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyParameterSensitivityDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'currency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurrency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CurrencyParameterSensitivity.builder().get("currency"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code marketDataName}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'marketDataName'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenMarketDataName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CurrencyParameterSensitivity.builder().get("marketDataName"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'parameterMetadata'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenParameterMetadata_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = CurrencyParameterSensitivity.builder().get("parameterMetadata");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
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
        () -> CurrencyParameterSensitivity.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code sensitivity}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'sensitivity'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSensitivity_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CurrencyParameterSensitivity.builder().get("sensitivity"));
  }

  /**
   * Test Builder {@link Builder#marketDataName(MarketDataName)}.
   *
   * <ul>
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#marketDataName(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test Builder marketDataName(MarketDataName); when CubeName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.marketDataName(MarketDataName)"})
  void testBuilderMarketDataName_whenCubeNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualMarketDataNameResult = builderResult.marketDataName(CubeName.of("Name"));

    // Assert
    assertSame(builderResult, actualMarketDataNameResult);
  }

  /**
   * Test Builder {@link Builder#parameterMetadata(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test Builder parameterMetadata(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterMetadata(List)"})
  void testBuilderParameterMetadataWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualParameterMetadataResult = builderResult.parameterMetadata(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test Builder {@link Builder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName(
      "Test Builder parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterMetadata(ParameterMetadata[])"})
  void testBuilderParameterMetadataWithParameterMetadata_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualParameterMetadataResult = builderResult.parameterMetadata();

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test Builder {@link Builder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName(
      "Test Builder parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'; when empty; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterMetadata(ParameterMetadata[])"})
  void testBuilderParameterMetadataWithParameterMetadata_whenEmpty_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualParameterMetadataResult =
        builderResult.parameterMetadata(EmptyParameterMetadata.empty());

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test Builder {@link Builder#parameterSplit(ParameterSize[])} with {@code ParameterSize[]}.
   *
   * <p>Method under test: {@link Builder#parameterSplit(ParameterSize[])}
   */
  @Test
  @DisplayName("Test Builder parameterSplit(ParameterSize[]) with 'ParameterSize[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterSplit(ParameterSize[])"})
  void testBuilderParameterSplitWithParameterSize() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualParameterSplitResult =
        builderResult.parameterSplit(ParameterSize.of(CubeName.of("Name"), 3));

    // Assert
    assertSame(builderResult, actualParameterSplitResult);
  }

  /**
   * Test Builder {@link Builder#parameterSplit(ParameterSize[])} with {@code ParameterSize[]}.
   *
   * <p>Method under test: {@link Builder#parameterSplit(ParameterSize[])}
   */
  @Test
  @DisplayName("Test Builder parameterSplit(ParameterSize[]) with 'ParameterSize[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterSplit(ParameterSize[])"})
  void testBuilderParameterSplitWithParameterSize2() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();
    ParameterSize ofResult = ParameterSize.of(CubeName.of("Name"), 3);

    // Act
    Builder actualParameterSplitResult =
        builderResult.parameterSplit(ofResult, ParameterSize.of(CubeName.of("Name"), 3));

    // Assert
    assertSame(builderResult, actualParameterSplitResult);
  }

  /**
   * Test Builder {@link Builder#parameterSplit(ParameterSize[])} with {@code ParameterSize[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterSplit(ParameterSize[])}
   */
  @Test
  @DisplayName(
      "Test Builder parameterSplit(ParameterSize[]) with 'ParameterSize[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterSplit(ParameterSize[])"})
  void testBuilderParameterSplitWithParameterSize_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualParameterSplitResult = builderResult.parameterSplit();

    // Assert
    assertSame(builderResult, actualParameterSplitResult);
  }

  /**
   * Test Builder {@link Builder#sensitivity(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#sensitivity(DoubleArray)}
   */
  @Test
  @DisplayName("Test Builder sensitivity(DoubleArray); when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.sensitivity(DoubleArray)"})
  void testBuilderSensitivity_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualSensitivityResult = builderResult.sensitivity(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualSensitivityResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName("Test Builder set(String, Object) with 'propertyName', 'newValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> CurrencyParameterSensitivity.builder().set("Property Name", "New Value"));
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
    Builder builderResult = CurrencyParameterSensitivity.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link CurrencyParameterSensitivity#meta()}.
   *
   * <p>Method under test: {@link CurrencyParameterSensitivity#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurrencyParameterSensitivity.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurrencyParameterSensitivity.meta();

    // Assert
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.marketDataName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterSplit() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivity() instanceof DirectMetaProperty);
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
    Class<? extends CurrencyParameterSensitivity> actualBeanTypeResult =
        CurrencyParameterSensitivity.meta().beanType();

    // Assert
    Class<CurrencyParameterSensitivity> expectedBeanTypeResult = CurrencyParameterSensitivity.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#marketDataName()}
   *   <li>{@link Meta#parameterMetadata()}
   *   <li>{@link Meta#parameterSplit()}
   *   <li>{@link Meta#sensitivity()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.marketDataName()",
    "MetaProperty Meta.parameterMetadata()",
    "MetaProperty Meta.parameterSplit()",
    "MetaProperty Meta.sensitivity()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CurrencyParameterSensitivity.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<MarketDataName<?>> actualMarketDataNameResult = metaResult.marketDataName();
    MetaProperty<ImmutableList<ParameterMetadata>> actualParameterMetadataResult =
        metaResult.parameterMetadata();
    MetaProperty<List<ParameterSize>> actualParameterSplitResult = metaResult.parameterSplit();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualMarketDataNameResult instanceof DirectMetaProperty);
    assertTrue(actualParameterMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualParameterSplitResult instanceof DirectMetaProperty);
    assertTrue(metaResult.sensitivity() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return name is {@code currency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'currency'; then return name is 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenReturnNameIsCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyParameterSensitivity.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<MarketDataName<?>> marketDataNameResult = ((Meta) metaBeanResult).marketDataName();
    assertTrue(marketDataNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterSize>> parameterSplitResult =
        ((Meta) metaBeanResult).parameterSplit();
    assertTrue(parameterSplitResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(metaBeanResult, marketDataNameResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, parameterSplitResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code marketDataName}.
   *   <li>Then return name is {@code marketDataName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'marketDataName'; then return name is 'marketDataName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMarketDataName_thenReturnNameIsMarketDataName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyParameterSensitivity.meta().metaPropertyGet("marketDataName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterSize>> parameterSplitResult =
        ((Meta) metaBeanResult).parameterSplit();
    assertTrue(parameterSplitResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    assertEquals("marketDataName", actualMetaPropertyGetResult.name());
    Class<MarketDataName> expectedPropertyTypeResult = MarketDataName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).marketDataName());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, parameterSplitResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then return name is {@code parameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameterMetadata'; then return name is 'parameterMetadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameterMetadata_thenReturnNameIsParameterMetadata() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyParameterSensitivity.meta().metaPropertyGet("parameterMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<MarketDataName<?>> marketDataNameResult = ((Meta) metaBeanResult).marketDataName();
    assertTrue(marketDataNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterSize>> parameterSplitResult =
        ((Meta) metaBeanResult).parameterSplit();
    assertTrue(parameterSplitResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    assertEquals("parameterMetadata", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameterMetadata());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, marketDataNameResult.metaBean());
    assertSame(metaBeanResult, parameterSplitResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameterSplit}.
   *   <li>Then return name is {@code parameterSplit}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameterSplit'; then return name is 'parameterSplit'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameterSplit_thenReturnNameIsParameterSplit() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyParameterSensitivity.meta().metaPropertyGet("parameterSplit");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<MarketDataName<?>> marketDataNameResult = ((Meta) metaBeanResult).marketDataName();
    assertTrue(marketDataNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> sensitivityResult = ((Meta) metaBeanResult).sensitivity();
    assertTrue(sensitivityResult instanceof DirectMetaProperty);
    assertEquals("parameterSplit", actualMetaPropertyGetResult.name());
    Class<List> expectedPropertyTypeResult = List.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameterSplit());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, marketDataNameResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, sensitivityResult.metaBean());
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
    assertNull(CurrencyParameterSensitivity.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code sensitivity}.
   *   <li>Then return name is {@code sensitivity}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'sensitivity'; then return name is 'sensitivity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSensitivity_thenReturnNameIsSensitivity() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyParameterSensitivity.meta().metaPropertyGet("sensitivity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<MarketDataName<?>> marketDataNameResult = ((Meta) metaBeanResult).marketDataName();
    assertTrue(marketDataNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterSize>> parameterSplitResult =
        ((Meta) metaBeanResult).parameterSplit();
    assertTrue(parameterSplitResult instanceof DirectMetaProperty);
    assertEquals("sensitivity", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivity());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, marketDataNameResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, parameterSplitResult.metaBean());
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
        CurrencyParameterSensitivity.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("marketDataName") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameterMetadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameterSplit") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("sensitivity") instanceof DirectMetaProperty);
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
        CurrencyParameterSensitivity.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            CurrencyParameterSensitivity.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurrencyParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            CurrencyParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code marketDataName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'marketDataName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMarketDataName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurrencyParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "marketDataName", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameterMetadata'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameterMetadata_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurrencyParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "parameterMetadata", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameterSplit}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameterSplit'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameterSplit_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurrencyParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "parameterSplit", "New Value", true));
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
            CurrencyParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivity}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivity'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivity_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurrencyParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "sensitivity", "New Value", true));
  }
}
