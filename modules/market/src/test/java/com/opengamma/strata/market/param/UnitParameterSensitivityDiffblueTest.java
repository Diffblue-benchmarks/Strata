package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.market.cube.CubeName;
import com.opengamma.strata.market.param.UnitParameterSensitivity.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.DoubleUnaryOperator;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnitParameterSensitivityDiffblueTest {
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
    Class<? extends UnitParameterSensitivity> actualBeanTypeResult =
        UnitParameterSensitivity.meta().beanType();

    // Assert
    Class<UnitParameterSensitivity> expectedBeanTypeResult = UnitParameterSensitivity.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
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
    "MetaProperty Meta.marketDataName()",
    "MetaProperty Meta.parameterMetadata()",
    "MetaProperty Meta.parameterSplit()",
    "MetaProperty Meta.sensitivity()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = UnitParameterSensitivity.meta();

    // Act
    MetaProperty<MarketDataName<?>> actualMarketDataNameResult = metaResult.marketDataName();
    MetaProperty<ImmutableList<ParameterMetadata>> actualParameterMetadataResult =
        metaResult.parameterMetadata();
    MetaProperty<List<ParameterSize>> actualParameterSplitResult = metaResult.parameterSplit();

    // Assert
    assertTrue(actualMarketDataNameResult instanceof DirectMetaProperty);
    assertTrue(actualParameterMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualParameterSplitResult instanceof DirectMetaProperty);
    assertTrue(metaResult.sensitivity() instanceof DirectMetaProperty);
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
        UnitParameterSensitivity.meta().metaPropertyGet("marketDataName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
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
        UnitParameterSensitivity.meta().metaPropertyGet("parameterMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
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
        UnitParameterSensitivity.meta().metaPropertyGet("parameterSplit");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
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
    assertNull(UnitParameterSensitivity.meta().metaPropertyGet("Property Name"));
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
        UnitParameterSensitivity.meta().metaPropertyGet("sensitivity");

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
    assertEquals("sensitivity", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivity());
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
        UnitParameterSensitivity.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
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
        UnitParameterSensitivity.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            UnitParameterSensitivity.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            UnitParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "marketDataName", "New Value", false));
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
            UnitParameterSensitivity.meta()
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
            UnitParameterSensitivity.meta()
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
            UnitParameterSensitivity.meta()
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
            UnitParameterSensitivity.meta()
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
            UnitParameterSensitivity.meta()
                .propertySet(mock(Bean.class), "sensitivity", "New Value", true));
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray)} with {@code
   * marketDataName}, {@code parameterMetadata}, {@code sensitivity}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, List, DoubleArray) with 'marketDataName', 'parameterMetadata', 'sensitivity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, List, DoubleArray)"
  })
  void testOfWithMarketDataNameParameterMetadataSensitivity() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    // Act
    UnitParameterSensitivity actualOfResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Assert
    assertEquals(0, actualOfResult.getParameterCount());
    assertEquals(0.0d, actualOfResult.total());
    assertFalse(actualOfResult.getParameterSplit().isPresent());
    assertEquals(parameterMetadata, actualOfResult.getParameterMetadata());
    assertSame(marketDataName, actualOfResult.getMarketDataName());
    assertSame(DoubleArray.EMPTY, actualOfResult.getSensitivity());
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray)} with {@code
   * marketDataName}, {@code parameterMetadata}, {@code sensitivity}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, List, DoubleArray) with 'marketDataName', 'parameterMetadata', 'sensitivity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, List, DoubleArray)"
  })
  void testOfWithMarketDataNameParameterMetadataSensitivity2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.filled(3)));
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray, List)} with {@code
   * marketDataName}, {@code parameterMetadata}, {@code sensitivity}, {@code parameterSplit}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray,
   * List)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, List, DoubleArray, List) with 'marketDataName', 'parameterMetadata', 'sensitivity', 'parameterSplit'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, List, DoubleArray, List)"
  })
  void testOfWithMarketDataNameParameterMetadataSensitivityParameterSplit() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    // Act
    UnitParameterSensitivity actualOfResult =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());

    // Assert
    assertEquals(0, actualOfResult.getParameterCount());
    assertEquals(0.0d, actualOfResult.total());
    Optional<List<ParameterSize>> parameterSplit = actualOfResult.getParameterSplit();
    assertTrue(parameterSplit.isPresent());
    ImmutableList<ParameterMetadata> parameterMetadata2 = actualOfResult.getParameterMetadata();
    assertEquals(parameterMetadata, parameterMetadata2);
    assertSame(parameterMetadata2, parameterSplit.get());
    assertSame(marketDataName, actualOfResult.getMarketDataName());
    assertSame(DoubleArray.EMPTY, actualOfResult.getSensitivity());
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray, List)} with {@code
   * marketDataName}, {@code parameterMetadata}, {@code sensitivity}, {@code parameterSplit}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray,
   * List)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, List, DoubleArray, List) with 'marketDataName', 'parameterMetadata', 'sensitivity', 'parameterSplit'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, List, DoubleArray, List)"
  })
  void testOfWithMarketDataNameParameterMetadataSensitivityParameterSplit2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            UnitParameterSensitivity.of(
                marketDataName, parameterMetadata, sensitivity, new ArrayList<>()));
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray, List)} with {@code
   * marketDataName}, {@code parameterMetadata}, {@code sensitivity}, {@code parameterSplit}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray,
   * List)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, List, DoubleArray, List) with 'marketDataName', 'parameterMetadata', 'sensitivity', 'parameterSplit'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, List, DoubleArray, List)"
  })
  void testOfWithMarketDataNameParameterMetadataSensitivityParameterSplit3() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    ArrayList<ParameterSize> parameterSplit = new ArrayList<>();
    parameterSplit.add(ParameterSize.of(CubeName.of("marketDataName"), 3));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            UnitParameterSensitivity.of(
                marketDataName, parameterMetadata, sensitivity, parameterSplit));
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray, List)} with {@code
   * marketDataName}, {@code parameterMetadata}, {@code sensitivity}, {@code parameterSplit}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray,
   * List)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, List, DoubleArray, List) with 'marketDataName', 'parameterMetadata', 'sensitivity', 'parameterSplit'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, List, DoubleArray, List)"
  })
  void testOfWithMarketDataNameParameterMetadataSensitivityParameterSplit4() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    ArrayList<ParameterSize> parameterSplit = new ArrayList<>();
    parameterSplit.add(ParameterSize.of(CubeName.of("marketDataName"), 3));
    parameterSplit.add(ParameterSize.of(CubeName.of("marketDataName"), 3));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            UnitParameterSensitivity.of(
                marketDataName, parameterMetadata, sensitivity, parameterSplit));
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray, List)} with {@code
   * marketDataName}, {@code parameterMetadata}, {@code sensitivity}, {@code parameterSplit}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, List, DoubleArray,
   * List)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, List, DoubleArray, List) with 'marketDataName', 'parameterMetadata', 'sensitivity', 'parameterSplit'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, List, DoubleArray, List)"
  })
  void testOfWithMarketDataNameParameterMetadataSensitivityParameterSplit5() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    // Act
    UnitParameterSensitivity actualOfResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of(), null);

    // Assert
    assertEquals(0, actualOfResult.getParameterCount());
    assertEquals(0.0d, actualOfResult.total());
    assertFalse(actualOfResult.getParameterSplit().isPresent());
    assertEquals(parameterMetadata, actualOfResult.getParameterMetadata());
    assertSame(marketDataName, actualOfResult.getMarketDataName());
    assertSame(DoubleArray.EMPTY, actualOfResult.getSensitivity());
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, DoubleArray)} with {@code
   * marketDataName}, {@code sensitivity}.
   *
   * <ul>
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, DoubleArray) with 'marketDataName', 'sensitivity'; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, DoubleArray)"
  })
  void testOfWithMarketDataNameSensitivity_thenReturnParameterCountIsOne() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    DoubleArray sensitivity = DoubleArray.of(10.0d);

    // Act
    UnitParameterSensitivity actualOfResult =
        UnitParameterSensitivity.of(marketDataName, sensitivity);

    // Assert
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(1, actualOfResult.getParameterMetadata().size());
    assertEquals(10.0d, actualOfResult.total());
    assertSame(sensitivity, actualOfResult.getSensitivity());
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, DoubleArray)} with {@code
   * marketDataName}, {@code sensitivity}.
   *
   * <ul>
   *   <li>Then return ParameterCount is three.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, DoubleArray) with 'marketDataName', 'sensitivity'; then return ParameterCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, DoubleArray)"
  })
  void testOfWithMarketDataNameSensitivity_thenReturnParameterCountIsThree() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    DoubleArray sensitivity = DoubleArray.filled(3);

    // Act
    UnitParameterSensitivity actualOfResult =
        UnitParameterSensitivity.of(marketDataName, sensitivity);

    // Assert
    assertEquals(3, actualOfResult.getParameterCount());
    ImmutableList<ParameterMetadata> parameterMetadata = actualOfResult.getParameterMetadata();
    assertEquals(3, parameterMetadata.size());
    ParameterMetadata getResult = parameterMetadata.get(0);
    assertSame(getResult, parameterMetadata.get(1));
    assertSame(getResult, parameterMetadata.get(2));
    assertSame(sensitivity, actualOfResult.getSensitivity());
  }

  /**
   * Test {@link UnitParameterSensitivity#of(MarketDataName, DoubleArray)} with {@code
   * marketDataName}, {@code sensitivity}.
   *
   * <ul>
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#of(MarketDataName, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataName, DoubleArray) with 'marketDataName', 'sensitivity'; then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.of(MarketDataName, DoubleArray)"
  })
  void testOfWithMarketDataNameSensitivity_thenReturnParameterCountIsZero() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");

    // Act
    UnitParameterSensitivity actualOfResult =
        UnitParameterSensitivity.of(marketDataName, DoubleArray.of());

    // Assert
    assertEquals(0, actualOfResult.getParameterCount());
    assertTrue(actualOfResult.getParameterMetadata().isEmpty());
    assertSame(DoubleArray.EMPTY, actualOfResult.getSensitivity());
  }

  /**
   * Test {@link UnitParameterSensitivity#combine(MarketDataName, UnitParameterSensitivity[])}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#combine(MarketDataName,
   * UnitParameterSensitivity[])}
   */
  @Test
  @DisplayName(
      "Test combine(MarketDataName, UnitParameterSensitivity[]); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.combine(MarketDataName, UnitParameterSensitivity[])"
  })
  void testCombine_thenThrowIllegalArgumentException() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> UnitParameterSensitivity.combine(marketDataName, ofResult));
  }

  /**
   * Test {@link UnitParameterSensitivity#getParameterCount()}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount(); given CubeName with 'Name'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int UnitParameterSensitivity.getParameterCount()"})
  void testGetParameterCount_givenCubeNameWithName_thenReturnZero() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertEquals(0, ofResult.getParameterCount());
  }

  /**
   * Test {@link UnitParameterSensitivity#multipliedBy(double)} with {@code factor}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'factor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity UnitParameterSensitivity.multipliedBy(double)"})
  void testMultipliedByWithFactor() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    UnitParameterSensitivity actualMultipliedByResult = ofResult.multipliedBy(10.0d);

    // Assert
    assertEquals(ofResult, actualMultipliedByResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#multipliedBy(double)} with {@code factor}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'factor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity UnitParameterSensitivity.multipliedBy(double)"})
  void testMultipliedByWithFactor2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());

    // Act
    UnitParameterSensitivity actualMultipliedByResult = ofResult.multipliedBy(10.0d);

    // Assert
    assertEquals(ofResult, actualMultipliedByResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#mapSensitivity(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#mapSensitivity(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivity(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.mapSensitivity(DoubleUnaryOperator)"
  })
  void testMapSensitivity() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    UnitParameterSensitivity actualMapSensitivityResult =
        ofResult.mapSensitivity(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(ofResult, actualMapSensitivityResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#mapSensitivity(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#mapSensitivity(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivity(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.mapSensitivity(DoubleUnaryOperator)"
  })
  void testMapSensitivity2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());

    // Act
    UnitParameterSensitivity actualMapSensitivityResult =
        ofResult.mapSensitivity(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(ofResult, actualMapSensitivityResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#withSensitivity(DoubleArray)}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#withSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName("Test withSensitivity(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.withSensitivity(DoubleArray)"
  })
  void testWithSensitivity() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    UnitParameterSensitivity actualWithSensitivityResult =
        ofResult.withSensitivity(DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualWithSensitivityResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#withSensitivity(DoubleArray)}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#withSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName("Test withSensitivity(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.withSensitivity(DoubleArray)"
  })
  void testWithSensitivity2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());

    // Act
    UnitParameterSensitivity actualWithSensitivityResult =
        ofResult.withSensitivity(DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualWithSensitivityResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#withSensitivity(DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#withSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test withSensitivity(DoubleArray); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivity.withSensitivity(DoubleArray)"
  })
  void testWithSensitivity_whenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.withSensitivity(DoubleArray.filled(3)));
  }

  /**
   * Test {@link UnitParameterSensitivity#plus(DoubleArray)} with {@code DoubleArray}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#plus(DoubleArray)}
   */
  @Test
  @DisplayName("Test plus(DoubleArray) with 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity UnitParameterSensitivity.plus(DoubleArray)"})
  void testPlusWithDoubleArray() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    UnitParameterSensitivity actualPlusResult = ofResult.plus(DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#plus(DoubleArray)} with {@code DoubleArray}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#plus(DoubleArray)}
   */
  @Test
  @DisplayName("Test plus(DoubleArray) with 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity UnitParameterSensitivity.plus(DoubleArray)"})
  void testPlusWithDoubleArray2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());

    // Act
    UnitParameterSensitivity actualPlusResult = ofResult.plus(DoubleArray.of());

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link UnitParameterSensitivity#plus(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#plus(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test plus(DoubleArray) with 'DoubleArray'; when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivity UnitParameterSensitivity.plus(DoubleArray)"})
  void testPlusWithDoubleArray_whenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.plus(DoubleArray.filled(3)));
  }

  /**
   * Test {@link UnitParameterSensitivity#split()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#split()}
   */
  @Test
  @DisplayName("Test split(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList UnitParameterSensitivity.split()"})
  void testSplit_thenReturnEmpty() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.split().isEmpty());
  }

  /**
   * Test {@link UnitParameterSensitivity#split()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#split()}
   */
  @Test
  @DisplayName("Test split(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList UnitParameterSensitivity.split()"})
  void testSplit_thenReturnSizeIsOne() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    ImmutableList<UnitParameterSensitivity> actualSplitResult = ofResult.split();

    // Assert
    assertEquals(1, actualSplitResult.size());
    assertSame(ofResult, actualSplitResult.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivity#total()}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#total()}
   */
  @Test
  @DisplayName("Test total(); given CubeName with 'Name'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double UnitParameterSensitivity.total()"})
  void testTotal_givenCubeNameWithName_thenReturnZero() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertEquals(0.0d, ofResult.total());
  }

  /**
   * Test {@link UnitParameterSensitivity#meta()}.
   *
   * <p>Method under test: {@link UnitParameterSensitivity#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta UnitParameterSensitivity.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = UnitParameterSensitivity.meta();

    // Assert
    assertTrue(actualMetaResult.marketDataName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterSplit() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivity() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link UnitParameterSensitivity#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); given CubeName with 'Name'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta UnitParameterSensitivity.metaBean()"})
  void testMetaBean_givenCubeNameWithName_thenReturnInstance() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link UnitParameterSensitivity#getParameterSplit()}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivity#getParameterSplit()}
   */
  @Test
  @DisplayName("Test getParameterSplit(); given CubeName with 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional UnitParameterSensitivity.getParameterSplit()"})
  void testGetParameterSplit_givenCubeNameWithName_thenReturnNotPresent() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertFalse(ofResult.getParameterSplit().isPresent());
  }
}
