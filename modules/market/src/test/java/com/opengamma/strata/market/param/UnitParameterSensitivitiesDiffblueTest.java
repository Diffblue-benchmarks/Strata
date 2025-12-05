package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.param.UnitParameterSensitivities.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.DoubleUnaryOperator;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class UnitParameterSensitivitiesDiffblueTest {
  /**
   * Test {@link UnitParameterSensitivities#empty()}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.empty()"})
  void testEmpty() {
    // Arrange and Act
    UnitParameterSensitivities actualEmptyResult = UnitParameterSensitivities.empty();

    // Assert
    assertEquals(0, actualEmptyResult.size());
    assertTrue(actualEmptyResult.getSensitivities().isEmpty());
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
    Class<? extends UnitParameterSensitivities> actualBeanTypeResult =
        UnitParameterSensitivities.meta().beanType();

    // Assert
    Class<UnitParameterSensitivities> expectedBeanTypeResult = UnitParameterSensitivities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    assertNull(UnitParameterSensitivities.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'sensitivities'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSensitivities_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        UnitParameterSensitivities.meta().metaPropertyGet("sensitivities");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<UnitParameterSensitivities> expectedDeclaringTypeResult =
        UnitParameterSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
        UnitParameterSensitivities.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("sensitivities");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<UnitParameterSensitivities> expectedDeclaringTypeResult =
        UnitParameterSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
        UnitParameterSensitivities.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange
    Meta metaResult = UnitParameterSensitivities.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(UnitParameterSensitivities.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'sensitivities'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSensitivities_thenReturnList() {
    // Arrange
    Meta metaResult = UnitParameterSensitivities.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(UnitParameterSensitivities.empty(), "sensitivities", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
            UnitParameterSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", false));
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
            UnitParameterSensitivities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivities'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivities_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            UnitParameterSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#sensitivities()}.
   *
   * <p>Method under test: {@link Meta#sensitivities()}
   */
  @Test
  @DisplayName("Test Meta sensitivities()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.sensitivities()"})
  void testMetaSensitivities() {
    // Arrange, Act and Assert
    assertTrue(UnitParameterSensitivities.meta().sensitivities() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link UnitParameterSensitivities#of(List)} with {@code List}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.of(List)"})
  void testOfWithList() {
    // Arrange
    ArrayList<UnitParameterSensitivity> sensitivities = new ArrayList<>();
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    sensitivities.add(ofResult);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity ofResult2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());
    sensitivities.add(ofResult2);

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(sensitivities);

    // Assert
    ImmutableList<UnitParameterSensitivity> sensitivities2 = actualOfResult.getSensitivities();
    assertEquals(1, sensitivities2.size());
    assertEquals(ofResult, sensitivities2.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivities#of(List)} with {@code List}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.of(List)"})
  void testOfWithList2() {
    // Arrange
    ArrayList<UnitParameterSensitivity> sensitivities = new ArrayList<>();
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());
    sensitivities.add(ofResult);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity ofResult2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());
    sensitivities.add(ofResult2);

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(sensitivities);

    // Assert
    ImmutableList<UnitParameterSensitivity> sensitivities2 = actualOfResult.getSensitivities();
    assertEquals(1, sensitivities2.size());
    assertEquals(ofResult, sensitivities2.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivities#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; given CubeName with 'Name'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.of(List)"})
  void testOfWithList_givenCubeNameWithName_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<UnitParameterSensitivity> sensitivities = new ArrayList<>();
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    sensitivities.add(ofResult);

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(sensitivities);

    // Assert
    assertEquals(1, actualOfResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities2 = actualOfResult.getSensitivities();
    assertEquals(1, sensitivities2.size());
    assertSame(ofResult, sensitivities2.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivities#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; given CurveName with 'Name'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.of(List)"})
  void testOfWithList_givenCurveNameWithName_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<UnitParameterSensitivity> sensitivities = new ArrayList<>();
    CurveName marketDataName = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    sensitivities.add(ofResult);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity ofResult2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());
    sensitivities.add(ofResult2);

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(sensitivities);

    // Assert
    assertEquals(2, actualOfResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities2 = actualOfResult.getSensitivities();
    assertEquals(2, sensitivities2.size());
    assertSame(ofResult, sensitivities2.get(1));
  }

  /**
   * Test {@link UnitParameterSensitivities#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; given CurveName with 'Name'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.of(List)"})
  void testOfWithList_givenCurveNameWithName_thenReturnSizeIsTwo2() {
    // Arrange
    ArrayList<UnitParameterSensitivity> sensitivities = new ArrayList<>();
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    sensitivities.add(ofResult);
    CurveName marketDataName2 = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity ofResult2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());
    sensitivities.add(ofResult2);

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(sensitivities);

    // Assert
    assertEquals(2, actualOfResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities2 = actualOfResult.getSensitivities();
    assertEquals(2, sensitivities2.size());
    assertSame(ofResult2, sensitivities2.get(1));
  }

  /**
   * Test {@link UnitParameterSensitivities#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.of(List)"})
  void testOfWithList_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    ArrayList<UnitParameterSensitivity> sensitivities = new ArrayList<>();

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(sensitivities);

    // Assert
    assertEquals(0, actualOfResult.size());
    assertEquals(sensitivities, actualOfResult.getSensitivities());
  }

  /**
   * Test {@link UnitParameterSensitivities#of(UnitParameterSensitivity[])} with {@code
   * UnitParameterSensitivity[]}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(UnitParameterSensitivity[])}
   */
  @Test
  @DisplayName(
      "Test of(UnitParameterSensitivity[]) with 'UnitParameterSensitivity[]'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.of(UnitParameterSensitivity[])"
  })
  void testOfWithUnitParameterSensitivity_thenReturnSizeIsZero() {
    // Arrange and Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link UnitParameterSensitivities#of(UnitParameterSensitivity)} with {@code
   * UnitParameterSensitivity}.
   *
   * <ul>
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(UnitParameterSensitivity)}
   */
  @Test
  @DisplayName(
      "Test of(UnitParameterSensitivity) with 'UnitParameterSensitivity'; when CubeName with 'Name'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.of(UnitParameterSensitivity)"
  })
  void testOfWithUnitParameterSensitivity_whenCubeNameWithName_thenReturnSizeIsOne() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(sensitivity);

    // Assert
    assertEquals(1, actualOfResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities = actualOfResult.getSensitivities();
    assertEquals(1, sensitivities.size());
    assertSame(sensitivity, sensitivities.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivities#of(UnitParameterSensitivity[])} with {@code
   * UnitParameterSensitivity[]}.
   *
   * <ul>
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#of(UnitParameterSensitivity[])}
   */
  @Test
  @DisplayName(
      "Test of(UnitParameterSensitivity[]) with 'UnitParameterSensitivity[]'; when CubeName with 'Name'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.of(UnitParameterSensitivity[])"
  })
  void testOfWithUnitParameterSensitivity_whenCubeNameWithName_thenReturnSizeIsOne2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity ofResult =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    UnitParameterSensitivities actualOfResult = UnitParameterSensitivities.of(ofResult);

    // Assert
    assertEquals(1, actualOfResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities = actualOfResult.getSensitivities();
    assertEquals(1, sensitivities.size());
    assertSame(ofResult, sensitivities.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivities#size()}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#size()}
   */
  @Test
  @DisplayName("Test size(); given CubeName with 'Name'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int UnitParameterSensitivities.size()"})
  void testSize_givenCubeNameWithName_thenReturnOne() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertEquals(1, UnitParameterSensitivities.of(sensitivity).size());
  }

  /**
   * Test {@link UnitParameterSensitivities#size()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#size()}
   */
  @Test
  @DisplayName("Test size(); given empty; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int UnitParameterSensitivities.size()"})
  void testSize_givenEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, UnitParameterSensitivities.empty().size());
  }

  /**
   * Test {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName("Test getSensitivity(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivities.getSensitivity(MarketDataName)"
  })
  void testGetSensitivity() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act and Assert
    assertSame(sensitivity, ofResult.getSensitivity(CubeName.of("Name")));
  }

  /**
   * Test {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName("Test getSensitivity(MarketDataName); given CubeName with 'Name'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivities.getSensitivity(MarketDataName)"
  })
  void testGetSensitivity_givenCubeNameWithName_whenNull() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> UnitParameterSensitivities.of(sensitivity).getSensitivity(null));
  }

  /**
   * Test {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>When {@link CubeName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test getSensitivity(MarketDataName); given CurveName with 'Name'; when CubeName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivities.getSensitivity(MarketDataName)"
  })
  void testGetSensitivity_givenCurveNameWithName_whenCubeNameWithName() {
    // Arrange
    CurveName marketDataName = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.getSensitivity(CubeName.of("Name")));
  }

  /**
   * Test {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link CubeName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName("Test getSensitivity(MarketDataName); given empty; when CubeName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivities.getSensitivity(MarketDataName)"
  })
  void testGetSensitivity_givenEmpty_whenCubeNameWithName() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> emptyResult.getSensitivity(CubeName.of("Name")));
  }

  /**
   * Test {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#getSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test getSensitivity(MarketDataName); given empty; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity UnitParameterSensitivities.getSensitivity(MarketDataName)"
  })
  void testGetSensitivity_givenEmpty_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> UnitParameterSensitivities.empty().getSensitivity(null));
  }

  /**
   * Test {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findSensitivity(MarketDataName); given CubeName with 'Name'; when CubeName with 'Name'; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional UnitParameterSensitivities.findSensitivity(MarketDataName)"})
  void testFindSensitivity_givenCubeNameWithName_whenCubeNameWithName_thenReturnPresent() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act
    Optional<UnitParameterSensitivity> actualFindSensitivityResult =
        ofResult.findSensitivity(CubeName.of("Name"));

    // Assert
    assertTrue(actualFindSensitivityResult.isPresent());
    assertSame(sensitivity, actualFindSensitivityResult.get());
  }

  /**
   * Test {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findSensitivity(MarketDataName); given CubeName with 'Name'; when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional UnitParameterSensitivities.findSensitivity(MarketDataName)"})
  void testFindSensitivity_givenCubeNameWithName_whenNull_thenReturnNotPresent() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertFalse(UnitParameterSensitivities.of(sensitivity).findSensitivity(null).isPresent());
  }

  /**
   * Test {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findSensitivity(MarketDataName); given CurveName with 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional UnitParameterSensitivities.findSensitivity(MarketDataName)"})
  void testFindSensitivity_givenCurveNameWithName_thenReturnNotPresent() {
    // Arrange
    CurveName marketDataName = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act and Assert
    assertFalse(ofResult.findSensitivity(CubeName.of("Name")).isPresent());
  }

  /**
   * Test {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#findSensitivity(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findSensitivity(MarketDataName); given empty; when CubeName with 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional UnitParameterSensitivities.findSensitivity(MarketDataName)"})
  void testFindSensitivity_givenEmpty_whenCubeNameWithName_thenReturnNotPresent() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act and Assert
    assertFalse(emptyResult.findSensitivity(CubeName.of("Name")).isPresent());
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)} with {@code
   * UnitParameterSensitivities}.
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)}
   */
  @Test
  @DisplayName("Test combinedWith(UnitParameterSensitivities) with 'UnitParameterSensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivities)"
  })
  void testCombinedWithWithUnitParameterSensitivities() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities other = UnitParameterSensitivities.of(sensitivity);

    // Act
    UnitParameterSensitivities actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)} with {@code
   * UnitParameterSensitivities}.
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)}
   */
  @Test
  @DisplayName("Test combinedWith(UnitParameterSensitivities) with 'UnitParameterSensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivities)"
  })
  void testCombinedWithWithUnitParameterSensitivities2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity2);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity sensitivity3 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());

    // Act
    UnitParameterSensitivities actualCombinedWithResult =
        ofResult.combinedWith(UnitParameterSensitivities.of(sensitivity3));

    // Assert
    assertEquals(ofResult, actualCombinedWithResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)} with {@code
   * UnitParameterSensitivities}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(UnitParameterSensitivities) with 'UnitParameterSensitivities'; given CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivities)"
  })
  void testCombinedWithWithUnitParameterSensitivities_givenCurveNameWithName() {
    // Arrange
    CurveName marketDataName = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());

    // Act
    UnitParameterSensitivities actualCombinedWithResult =
        ofResult.combinedWith(UnitParameterSensitivities.of(sensitivity2));

    // Assert
    assertEquals(2, actualCombinedWithResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities =
        actualCombinedWithResult.getSensitivities();
    assertEquals(2, sensitivities.size());
    assertSame(sensitivity, sensitivities.get(1));
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)} with {@code
   * UnitParameterSensitivities}.
   *
   * <ul>
   *   <li>Then return Sensitivities size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(UnitParameterSensitivities) with 'UnitParameterSensitivities'; then return Sensitivities size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivities)"
  })
  void testCombinedWithWithUnitParameterSensitivities_thenReturnSensitivitiesSizeIsOne() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());

    // Act and Assert
    ImmutableList<UnitParameterSensitivity> sensitivities =
        ofResult.combinedWith(UnitParameterSensitivities.of(sensitivity2)).getSensitivities();
    assertEquals(1, sensitivities.size());
    assertEquals(sensitivity, sensitivities.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)} with {@code
   * UnitParameterSensitivities}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(UnitParameterSensitivities) with 'UnitParameterSensitivities'; when CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivities)"
  })
  void testCombinedWithWithUnitParameterSensitivities_whenCurveNameWithName() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);
    CurveName marketDataName2 = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());

    // Act
    UnitParameterSensitivities actualCombinedWithResult =
        ofResult.combinedWith(UnitParameterSensitivities.of(sensitivity2));

    // Assert
    assertEquals(2, actualCombinedWithResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities =
        actualCombinedWithResult.getSensitivities();
    assertEquals(2, sensitivities.size());
    assertSame(sensitivity2, sensitivities.get(1));
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)} with {@code
   * UnitParameterSensitivities}.
   *
   * <ul>
   *   <li>When empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(UnitParameterSensitivities) with 'UnitParameterSensitivities'; when empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivities)"
  })
  void testCombinedWithWithUnitParameterSensitivities_whenEmpty() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act
    UnitParameterSensitivities actualCombinedWithResult =
        ofResult.combinedWith(UnitParameterSensitivities.empty());

    // Assert
    assertEquals(ofResult, actualCombinedWithResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)} with {@code
   * UnitParameterSensitivities}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#combinedWith(UnitParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(UnitParameterSensitivities) with 'UnitParameterSensitivities'; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivities)"
  })
  void testCombinedWithWithUnitParameterSensitivities_whenEmpty_thenReturnEmpty() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();
    UnitParameterSensitivities other = UnitParameterSensitivities.empty();

    // Act
    UnitParameterSensitivities actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(other, actualCombinedWithResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivity)} with {@code
   * UnitParameterSensitivity}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#combinedWith(UnitParameterSensitivity)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(UnitParameterSensitivity) with 'UnitParameterSensitivity'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.combinedWith(UnitParameterSensitivity)"
  })
  void testCombinedWithWithUnitParameterSensitivity_thenReturnSizeIsOne() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity other =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act
    UnitParameterSensitivities actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(1, actualCombinedWithResult.size());
    ImmutableList<UnitParameterSensitivity> sensitivities =
        actualCombinedWithResult.getSensitivities();
    assertEquals(1, sensitivities.size());
    assertSame(other, sensitivities.get(0));
  }

  /**
   * Test {@link UnitParameterSensitivities#multipliedBy(Currency, double)} with {@code currency},
   * {@code amount}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When ten.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#multipliedBy(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(Currency, double) with 'currency', 'amount'; given empty; when ten; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities UnitParameterSensitivities.multipliedBy(Currency, double)"
  })
  void testMultipliedByWithCurrencyAmount_givenEmpty_whenTen_thenReturnSizeIsZero() {
    // Arrange and Act
    CurrencyParameterSensitivities actualMultipliedByResult =
        UnitParameterSensitivities.empty().multipliedBy(null, 10.0d);

    // Assert
    assertEquals(0, actualMultipliedByResult.size());
    assertTrue(actualMultipliedByResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link UnitParameterSensitivities#multipliedBy(double)} with {@code factor}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'factor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.multipliedBy(double)"})
  void testMultipliedByWithFactor() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act
    UnitParameterSensitivities actualMultipliedByResult = ofResult.multipliedBy(10.0d);

    // Assert
    assertEquals(ofResult, actualMultipliedByResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#multipliedBy(double)} with {@code factor}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'factor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.multipliedBy(double)"})
  void testMultipliedByWithFactor2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity2);

    // Act
    UnitParameterSensitivities actualMultipliedByResult = ofResult.multipliedBy(10.0d);

    // Assert
    assertEquals(ofResult, actualMultipliedByResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#multipliedBy(double)} with {@code factor}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'factor'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.multipliedBy(double)"})
  void testMultipliedByWithFactor_givenEmpty_thenReturnEmpty() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act
    UnitParameterSensitivities actualMultipliedByResult = emptyResult.multipliedBy(10.0d);

    // Assert
    assertEquals(emptyResult, actualMultipliedByResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivities(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.mapSensitivities(DoubleUnaryOperator)"
  })
  void testMapSensitivities() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act
    UnitParameterSensitivities actualMapSensitivitiesResult =
        ofResult.mapSensitivities(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(ofResult, actualMapSensitivitiesResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivities(DoubleUnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.mapSensitivities(DoubleUnaryOperator)"
  })
  void testMapSensitivities2() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity2);

    // Act
    UnitParameterSensitivities actualMapSensitivitiesResult =
        ofResult.mapSensitivities(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(ofResult, actualMapSensitivitiesResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#mapSensitivities(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapSensitivities(DoubleUnaryOperator); given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivities UnitParameterSensitivities.mapSensitivities(DoubleUnaryOperator)"
  })
  void testMapSensitivities_givenEmpty_thenReturnEmpty() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act
    UnitParameterSensitivities actualMapSensitivitiesResult =
        emptyResult.mapSensitivities(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualMapSensitivitiesResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#split()}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#split()}
   */
  @Test
  @DisplayName("Test split()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.split()"})
  void testSplit() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act
    UnitParameterSensitivities actualSplitResult = ofResult.split();

    // Assert
    assertSame(ofResult, actualSplitResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#split()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#split()}
   */
  @Test
  @DisplayName("Test split(); given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.split()"})
  void testSplit_givenEmpty_thenReturnEmpty() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act
    UnitParameterSensitivities actualSplitResult = emptyResult.split();

    // Assert
    assertSame(emptyResult, actualSplitResult);
  }

  /**
   * Test {@link UnitParameterSensitivities#split()}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#split()}
   */
  @Test
  @DisplayName("Test split(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"UnitParameterSensitivities UnitParameterSensitivities.split()"})
  void testSplit_thenReturnSizeIsZero() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();
    DoubleArray sensitivity = DoubleArray.of();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(
            marketDataName, parameterMetadata, sensitivity, new ArrayList<>());

    // Act
    UnitParameterSensitivities actualSplitResult =
        UnitParameterSensitivities.of(sensitivity2).split();

    // Assert
    assertEquals(0, actualSplitResult.size());
    assertTrue(actualSplitResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(UnitParameterSensitivities, double); given CubeName with 'Name'; when CubeName with 'Name'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equalWithTolerance(UnitParameterSensitivities, double)"
  })
  void testEqualWithTolerance_givenCubeNameWithName_whenCubeNameWithName_thenReturnTrue() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());

    // Act and Assert
    assertTrue(ofResult.equalWithTolerance(UnitParameterSensitivities.of(sensitivity2), 10.0d));
  }

  /**
   * Test {@link UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>When {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(UnitParameterSensitivities, double); given CubeName with 'Name'; when CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equalWithTolerance(UnitParameterSensitivities, double)"
  })
  void testEqualWithTolerance_givenCubeNameWithName_whenCurveNameWithName() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);
    CurveName marketDataName2 = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());

    // Act and Assert
    assertTrue(ofResult.equalWithTolerance(UnitParameterSensitivities.of(sensitivity2), 10.0d));
  }

  /**
   * Test {@link UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>When empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(UnitParameterSensitivities, double); given CubeName with 'Name'; when empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equalWithTolerance(UnitParameterSensitivities, double)"
  })
  void testEqualWithTolerance_givenCubeNameWithName_whenEmpty_thenReturnTrue() {
    // Arrange
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);

    // Act and Assert
    assertTrue(ofResult.equalWithTolerance(UnitParameterSensitivities.empty(), 10.0d));
  }

  /**
   * Test {@link UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>When {@link CubeName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(UnitParameterSensitivities, double); given CurveName with 'Name'; when CubeName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equalWithTolerance(UnitParameterSensitivities, double)"
  })
  void testEqualWithTolerance_givenCurveNameWithName_whenCubeNameWithName() {
    // Arrange
    CurveName marketDataName = CurveName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(sensitivity);
    CubeName marketDataName2 = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata2 = new ArrayList<>();

    UnitParameterSensitivity sensitivity2 =
        UnitParameterSensitivity.of(marketDataName2, parameterMetadata2, DoubleArray.of());

    // Act and Assert
    assertTrue(ofResult.equalWithTolerance(UnitParameterSensitivities.of(sensitivity2), 10.0d));
  }

  /**
   * Test {@link UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(UnitParameterSensitivities, double); given empty; when CubeName with 'Name'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equalWithTolerance(UnitParameterSensitivities, double)"
  })
  void testEqualWithTolerance_givenEmpty_whenCubeNameWithName_thenReturnTrue() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();
    CubeName marketDataName = CubeName.of("Name");
    ArrayList<ParameterMetadata> parameterMetadata = new ArrayList<>();

    UnitParameterSensitivity sensitivity =
        UnitParameterSensitivity.of(marketDataName, parameterMetadata, DoubleArray.of());

    // Act and Assert
    assertTrue(emptyResult.equalWithTolerance(UnitParameterSensitivities.of(sensitivity), 10.0d));
  }

  /**
   * Test {@link UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link
   * UnitParameterSensitivities#equalWithTolerance(UnitParameterSensitivities, double)}
   */
  @Test
  @DisplayName(
      "Test equalWithTolerance(UnitParameterSensitivities, double); given empty; when empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equalWithTolerance(UnitParameterSensitivities, double)"
  })
  void testEqualWithTolerance_givenEmpty_whenEmpty_thenReturnTrue() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act and Assert
    assertTrue(emptyResult.equalWithTolerance(UnitParameterSensitivities.empty(), 10.0d));
  }

  /**
   * Test {@link UnitParameterSensitivities#meta()}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta UnitParameterSensitivities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = UnitParameterSensitivities.meta();

    // Assert
    MetaProperty<ImmutableList<UnitParameterSensitivity>> sensitivitiesResult =
        actualMetaResult.sensitivities();
    assertTrue(sensitivitiesResult instanceof DirectMetaProperty);
    assertEquals("sensitivities", sensitivitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sensitivitiesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, sensitivitiesResult.propertyType());
    Class<UnitParameterSensitivities> expectedDeclaringTypeResult =
        UnitParameterSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, sensitivitiesResult.declaringType());
    assertSame(Meta.INSTANCE, sensitivitiesResult.metaBean());
  }

  /**
   * Test {@link UnitParameterSensitivities#metaBean()}.
   *
   * <p>Method under test: {@link UnitParameterSensitivities#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta UnitParameterSensitivities.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, UnitParameterSensitivities.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnitParameterSensitivities#toString()}
   *   <li>{@link UnitParameterSensitivities#getSensitivities()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList UnitParameterSensitivities.getSensitivities()",
    "String UnitParameterSensitivities.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("UnitParameterSensitivities{sensitivities=[]}", actualToStringResult);
    assertTrue(emptyResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link UnitParameterSensitivities#equals(Object)}, and {@link
   * UnitParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnitParameterSensitivities#equals(Object)}
   *   <li>{@link UnitParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equals(Object)",
    "int UnitParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();
    UnitParameterSensitivities emptyResult2 = UnitParameterSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link UnitParameterSensitivities#equals(Object)}, and {@link
   * UnitParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnitParameterSensitivities#equals(Object)}
   *   <li>{@link UnitParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equals(Object)",
    "int UnitParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(new ArrayList<>());
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act and Assert
    assertEquals(ofResult, emptyResult);
    assertEquals(ofResult.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link UnitParameterSensitivities#equals(Object)}, and {@link
   * UnitParameterSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link UnitParameterSensitivities#equals(Object)}
   *   <li>{@link UnitParameterSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equals(Object)",
    "int UnitParameterSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    UnitParameterSensitivities emptyResult = UnitParameterSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link UnitParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equals(Object)",
    "int UnitParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    UnitParameterSensitivities ofResult = UnitParameterSensitivities.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link UnitParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equals(Object)",
    "int UnitParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(UnitParameterSensitivities.empty(), null);
  }

  /**
   * Test {@link UnitParameterSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link UnitParameterSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean UnitParameterSensitivities.equals(Object)",
    "int UnitParameterSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        UnitParameterSensitivities.empty(), "Different type to UnitParameterSensitivities");
  }
}
