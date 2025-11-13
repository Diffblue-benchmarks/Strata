package com.opengamma.strata.market.sensitivity;

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
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.CurveSensitivities.Meta;
import com.opengamma.strata.product.PortfolioItemInfo;
import com.opengamma.strata.product.PortfolioItemSummary;
import com.opengamma.strata.product.PortfolioItemType;
import com.opengamma.strata.product.PositionInfo;
import com.opengamma.strata.product.ProductType;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveSensitivitiesDiffblueTest {
  /**
   * Test {@link CurveSensitivities#empty()}.
   *
   * <p>Method under test: {@link CurveSensitivities#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.empty()"})
  void testEmpty() {
    // Arrange and Act
    CurveSensitivities actualEmptyResult = CurveSensitivities.empty();

    // Assert
    assertFalse(actualEmptyResult.getId().isPresent());
    assertTrue(actualEmptyResult.getTypedSensitivities().isEmpty());
    assertTrue(actualEmptyResult.getInfo().getAttributeTypes().isEmpty());
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
    Class<? extends CurveSensitivities> actualBeanTypeResult = CurveSensitivities.meta().beanType();

    // Assert
    Class<CurveSensitivities> expectedBeanTypeResult = CurveSensitivities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#typedSensitivities()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.info()", "MetaProperty Meta.typedSensitivities()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CurveSensitivities.meta();

    // Act
    MetaProperty<PortfolioItemInfo> actualInfoResult = metaResult.info();

    // Assert
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(metaResult.typedSensitivities() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean info return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean info return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanInfoReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurveSensitivities.meta().metaPropertyGet("typedSensitivities");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PortfolioItemInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("info", infoResult.name());
    assertEquals("typedSensitivities", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, infoResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CurveSensitivities> expectedDeclaringTypeResult = CurveSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, infoResult.declaringType());
    Class<PortfolioItemInfo> expectedPropertyTypeResult2 = PortfolioItemInfo.class;
    assertEquals(expectedPropertyTypeResult2, infoResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).typedSensitivities());
    assertSame(Meta.INSTANCE, infoResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean typedSensitivities return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean typedSensitivities return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanTypedSensitivitiesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CurveSensitivities.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveSensitivitiesType, CurrencyParameterSensitivities>>
        typedSensitivitiesResult = ((Meta) metaBeanResult).typedSensitivities();
    assertTrue(typedSensitivitiesResult instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    assertEquals("typedSensitivities", typedSensitivitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, typedSensitivitiesResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, typedSensitivitiesResult.propertyType());
    Class<CurveSensitivities> expectedDeclaringTypeResult = CurveSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, typedSensitivitiesResult.declaringType());
    Class<PortfolioItemInfo> expectedPropertyTypeResult2 = PortfolioItemInfo.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
    assertSame(Meta.INSTANCE, typedSensitivitiesResult.metaBean());
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
    assertNull(CurveSensitivities.meta().metaPropertyGet("Property Name"));
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
        CurveSensitivities.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("info");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("typedSensitivities");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("info", getResult.name());
    assertEquals("typedSensitivities", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<CurveSensitivities> expectedDeclaringTypeResult = CurveSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CurveSensitivities> expectedDeclaringTypeResult2 = CurveSensitivities.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<PortfolioItemInfo> expectedPropertyTypeResult2 = PortfolioItemInfo.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(CurveSensitivities.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CurveSensitivities.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(CurveSensitivities.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'info'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenInfo_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = CurveSensitivities.meta();

    // Act
    assertDoesNotThrow(() -> metaResult.propertyGet(CurveSensitivities.empty(), "info", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code typedSensitivities}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'typedSensitivities'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTypedSensitivities_thenReturnMap() {
    // Arrange
    Meta metaResult = CurveSensitivities.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(CurveSensitivities.empty(), "typedSensitivities", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
        () -> CurveSensitivities.meta().propertySet(mock(Bean.class), "info", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'info'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInfo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CurveSensitivities.meta().propertySet(mock(Bean.class), "info", "New Value", true));
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
            CurveSensitivities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code typedSensitivities}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'typedSensitivities'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTypedSensitivities_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurveSensitivities.meta()
                .propertySet(mock(Bean.class), "typedSensitivities", "New Value", true));
  }

  /**
   * Test {@link CurveSensitivities#of(PortfolioItemInfo, CurveSensitivitiesType,
   * CurrencyParameterSensitivities)} with {@code info}, {@code type}, {@code sensitivities}.
   *
   * <ul>
   *   <li>Then return TypedSensitivities size is one.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#of(PortfolioItemInfo, CurveSensitivitiesType,
   * CurrencyParameterSensitivities)}
   */
  @Test
  @DisplayName(
      "Test of(PortfolioItemInfo, CurveSensitivitiesType, CurrencyParameterSensitivities) with 'info', 'type', 'sensitivities'; then return TypedSensitivities size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveSensitivities CurveSensitivities.of(PortfolioItemInfo, CurveSensitivitiesType, CurrencyParameterSensitivities)"
  })
  void testOfWithInfoTypeSensitivities_thenReturnTypedSensitivitiesSizeIsOne() {
    // Arrange
    PositionInfo info = PositionInfo.empty();

    // Act
    CurveSensitivities actualOfResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Assert
    assertEquals(1, actualOfResult.getTypedSensitivities().size());
    assertFalse(actualOfResult.getId().isPresent());
    assertSame(info, actualOfResult.getInfo());
  }

  /**
   * Test {@link CurveSensitivities#of(PortfolioItemInfo, Map)} with {@code info}, {@code
   * typedSensitivities}.
   *
   * <ul>
   *   <li>Given {@link CurveSensitivitiesType} with name is {@code info}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#of(PortfolioItemInfo, Map)}
   */
  @Test
  @DisplayName(
      "Test of(PortfolioItemInfo, Map) with 'info', 'typedSensitivities'; given CurveSensitivitiesType with name is 'info'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.of(PortfolioItemInfo, Map)"})
  void testOfWithInfoTypedSensitivities_givenCurveSensitivitiesTypeWithNameIsInfo() {
    // Arrange
    PositionInfo info = PositionInfo.empty();

    HashMap<CurveSensitivitiesType, CurrencyParameterSensitivities> typedSensitivities =
        new HashMap<>();
    typedSensitivities.put(
        CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());
    CurveSensitivitiesType ofResult = CurveSensitivitiesType.of("info");
    typedSensitivities.put(ofResult, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualOfResult = CurveSensitivities.of(info, typedSensitivities);

    // Assert
    PortfolioItemInfo info2 = actualOfResult.getInfo();
    assertTrue(info2 instanceof PositionInfo);
    assertTrue(((PositionInfo) info2).getAttributes().isEmpty());
    assertEquals(typedSensitivities, actualOfResult.getTypedSensitivities());
  }

  /**
   * Test {@link CurveSensitivities#of(PortfolioItemInfo, Map)} with {@code info}, {@code
   * typedSensitivities}.
   *
   * <ul>
   *   <li>Given {@link CurveSensitivitiesType#ZERO_RATE_GAMMA}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#of(PortfolioItemInfo, Map)}
   */
  @Test
  @DisplayName(
      "Test of(PortfolioItemInfo, Map) with 'info', 'typedSensitivities'; given ZERO_RATE_GAMMA")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.of(PortfolioItemInfo, Map)"})
  void testOfWithInfoTypedSensitivities_givenZero_rate_gamma() {
    // Arrange
    PositionInfo info = PositionInfo.empty();

    HashMap<CurveSensitivitiesType, CurrencyParameterSensitivities> typedSensitivities =
        new HashMap<>();
    typedSensitivities.put(
        CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());
    typedSensitivities.put(
        CurveSensitivitiesType.ZERO_RATE_GAMMA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualOfResult = CurveSensitivities.of(info, typedSensitivities);

    // Assert
    PortfolioItemInfo info2 = actualOfResult.getInfo();
    assertTrue(info2 instanceof PositionInfo);
    assertTrue(((PositionInfo) info2).getAttributes().isEmpty());
    assertEquals(typedSensitivities, actualOfResult.getTypedSensitivities());
  }

  /**
   * Test {@link CurveSensitivities#of(PortfolioItemInfo, Map)} with {@code info}, {@code
   * typedSensitivities}.
   *
   * <ul>
   *   <li>Then return Info Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#of(PortfolioItemInfo, Map)}
   */
  @Test
  @DisplayName(
      "Test of(PortfolioItemInfo, Map) with 'info', 'typedSensitivities'; then return Info Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.of(PortfolioItemInfo, Map)"})
  void testOfWithInfoTypedSensitivities_thenReturnInfoAttributesEmpty() {
    // Arrange
    PositionInfo info = PositionInfo.empty();

    HashMap<CurveSensitivitiesType, CurrencyParameterSensitivities> typedSensitivities =
        new HashMap<>();
    typedSensitivities.put(
        CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualOfResult = CurveSensitivities.of(info, typedSensitivities);

    // Assert
    PortfolioItemInfo info2 = actualOfResult.getInfo();
    assertTrue(info2 instanceof PositionInfo);
    assertTrue(((PositionInfo) info2).getAttributes().isEmpty());
    assertEquals(typedSensitivities, actualOfResult.getTypedSensitivities());
  }

  /**
   * Test {@link CurveSensitivities#of(PortfolioItemInfo, Map)} with {@code info}, {@code
   * typedSensitivities}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Info is empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#of(PortfolioItemInfo, Map)}
   */
  @Test
  @DisplayName(
      "Test of(PortfolioItemInfo, Map) with 'info', 'typedSensitivities'; when HashMap(); then return Info is empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.of(PortfolioItemInfo, Map)"})
  void testOfWithInfoTypedSensitivities_whenHashMap_thenReturnInfoIsEmpty() {
    // Arrange
    PositionInfo info = PositionInfo.empty();

    // Act and Assert
    assertSame(info, CurveSensitivities.of(info, new HashMap<>()).getInfo());
  }

  /**
   * Test {@link CurveSensitivities#getTypedSensitivity(CurveSensitivitiesType)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#getTypedSensitivity(CurveSensitivitiesType)}
   */
  @Test
  @DisplayName(
      "Test getTypedSensitivity(CurveSensitivitiesType); given empty; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivities.getTypedSensitivity(CurveSensitivitiesType)"
  })
  void testGetTypedSensitivity_givenEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            CurveSensitivities.empty().getTypedSensitivity(CurveSensitivitiesType.ZERO_RATE_DELTA));
  }

  /**
   * Test {@link CurveSensitivities#getTypedSensitivity(CurveSensitivitiesType)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#getTypedSensitivity(CurveSensitivitiesType)}
   */
  @Test
  @DisplayName(
      "Test getTypedSensitivity(CurveSensitivitiesType); given empty; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivities.getTypedSensitivity(CurveSensitivitiesType)"
  })
  void testGetTypedSensitivity_givenEmpty_whenNull_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> CurveSensitivities.empty().getTypedSensitivity(null));
  }

  /**
   * Test {@link CurveSensitivities#getTypedSensitivity(CurveSensitivitiesType)}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#getTypedSensitivity(CurveSensitivitiesType)}
   */
  @Test
  @DisplayName("Test getTypedSensitivity(CurveSensitivitiesType); then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities CurveSensitivities.getTypedSensitivity(CurveSensitivitiesType)"
  })
  void testGetTypedSensitivity_thenReturnEmpty() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    CurveSensitivities ofResult =
        CurveSensitivities.of(info, CurveSensitivitiesType.ZERO_RATE_DELTA, sensitivities);

    // Act and Assert
    assertSame(sensitivities, ofResult.getTypedSensitivity(CurveSensitivitiesType.ZERO_RATE_DELTA));
  }

  /**
   * Test {@link CurveSensitivities#findTypedSensitivity(CurveSensitivitiesType)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#findTypedSensitivity(CurveSensitivitiesType)}
   */
  @Test
  @DisplayName(
      "Test findTypedSensitivity(CurveSensitivitiesType); given empty; when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurveSensitivities.findTypedSensitivity(CurveSensitivitiesType)"})
  void testFindTypedSensitivity_givenEmpty_whenNull_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(CurveSensitivities.empty().findTypedSensitivity(null).isPresent());
  }

  /**
   * Test {@link CurveSensitivities#findTypedSensitivity(CurveSensitivitiesType)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link CurveSensitivitiesType#ZERO_RATE_DELTA}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#findTypedSensitivity(CurveSensitivitiesType)}
   */
  @Test
  @DisplayName(
      "Test findTypedSensitivity(CurveSensitivitiesType); given empty; when ZERO_RATE_DELTA; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurveSensitivities.findTypedSensitivity(CurveSensitivitiesType)"})
  void testFindTypedSensitivity_givenEmpty_whenZero_rate_delta_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(
        CurveSensitivities.empty()
            .findTypedSensitivity(CurveSensitivitiesType.ZERO_RATE_DELTA)
            .isPresent());
  }

  /**
   * Test {@link CurveSensitivities#findTypedSensitivity(CurveSensitivitiesType)}.
   *
   * <ul>
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#findTypedSensitivity(CurveSensitivitiesType)}
   */
  @Test
  @DisplayName("Test findTypedSensitivity(CurveSensitivitiesType); then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurveSensitivities.findTypedSensitivity(CurveSensitivitiesType)"})
  void testFindTypedSensitivity_thenReturnPresent() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurrencyParameterSensitivities sensitivities = CurrencyParameterSensitivities.empty();

    CurveSensitivities ofResult =
        CurveSensitivities.of(info, CurveSensitivitiesType.ZERO_RATE_DELTA, sensitivities);

    // Act
    Optional<CurrencyParameterSensitivities> actualFindTypedSensitivityResult =
        ofResult.findTypedSensitivity(CurveSensitivitiesType.ZERO_RATE_DELTA);

    // Assert
    assertTrue(actualFindTypedSensitivityResult.isPresent());
    assertSame(sensitivities, actualFindTypedSensitivityResult.get());
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(CurveSensitivities)} with {@code CurveSensitivities}.
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test mergedWith(CurveSensitivities) with 'CurveSensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(CurveSensitivities)"})
  void testMergedWithWithCurveSensitivities() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult = CurveSensitivities.of(info, new HashMap<>());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(CurveSensitivities.empty());

    // Assert
    assertEquals(ofResult, actualMergedWithResult);
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(CurveSensitivities)} with {@code CurveSensitivities}.
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test mergedWith(CurveSensitivities) with 'CurveSensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(CurveSensitivities)"})
  void testMergedWithWithCurveSensitivities2() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(CurveSensitivities.empty());

    // Assert
    assertEquals(ofResult, actualMergedWithResult);
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(CurveSensitivities)} with {@code CurveSensitivities}.
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test mergedWith(CurveSensitivities) with 'CurveSensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(CurveSensitivities)"})
  void testMergedWithWithCurveSensitivities3() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult = CurveSensitivities.of(info, new HashMap<>());
    PositionInfo info2 = PositionInfo.empty();
    CurveSensitivities other = CurveSensitivities.of(info2, new HashMap<>());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(other);

    // Assert
    assertEquals(ofResult, actualMergedWithResult);
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(CurveSensitivities)} with {@code CurveSensitivities}.
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test mergedWith(CurveSensitivities) with 'CurveSensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(CurveSensitivities)"})
  void testMergedWithWithCurveSensitivities4() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_GAMMA, CurrencyParameterSensitivities.empty());
    PositionInfo info2 = PositionInfo.empty();
    CurveSensitivities other =
        CurveSensitivities.of(
            info2, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(other);

    // Assert
    PortfolioItemInfo info3 = actualMergedWithResult.getInfo();
    assertTrue(info3 instanceof PositionInfo);
    assertEquals(2, actualMergedWithResult.getTypedSensitivities().size());
    assertTrue(((PositionInfo) info3).getAttributes().isEmpty());
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(CurveSensitivities)} with {@code CurveSensitivities}.
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test mergedWith(CurveSensitivities) with 'CurveSensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(CurveSensitivities)"})
  void testMergedWithWithCurveSensitivities5() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_GAMMA, CurrencyParameterSensitivities.empty());
    PositionInfo info2 = PositionInfo.empty();
    CurveSensitivitiesType type = CurveSensitivitiesType.of("attributes");

    CurveSensitivities other =
        CurveSensitivities.of(info2, type, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(other);

    // Assert
    PortfolioItemInfo info3 = actualMergedWithResult.getInfo();
    assertTrue(info3 instanceof PositionInfo);
    assertEquals(2, actualMergedWithResult.getTypedSensitivities().size());
    assertTrue(((PositionInfo) info3).getAttributes().isEmpty());
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(CurveSensitivities)} with {@code CurveSensitivities}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(CurveSensitivities)}
   */
  @Test
  @DisplayName(
      "Test mergedWith(CurveSensitivities) with 'CurveSensitivities'; given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(CurveSensitivities)"})
  void testMergedWithWithCurveSensitivities_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();
    CurveSensitivities other = CurveSensitivities.empty();

    // Act
    CurveSensitivities actualMergedWithResult = emptyResult.mergedWith(other);

    // Assert
    assertEquals(other, actualMergedWithResult);
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(CurveSensitivities)} with {@code CurveSensitivities}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(CurveSensitivities)}
   */
  @Test
  @DisplayName("Test mergedWith(CurveSensitivities) with 'CurveSensitivities'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(CurveSensitivities)"})
  void testMergedWithWithCurveSensitivities_thenReturnEmpty() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities other = CurveSensitivities.of(info, new HashMap<>());

    // Act
    CurveSensitivities actualMergedWithResult = emptyResult.mergedWith(other);

    // Assert
    assertEquals(emptyResult, actualMergedWithResult);
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(Map)} with {@code Map}.
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(Map)}
   */
  @Test
  @DisplayName("Test mergedWith(Map) with 'Map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(Map)"})
  void testMergedWithWithMap() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(new HashMap<>());

    // Assert
    assertEquals(ofResult, actualMergedWithResult);
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(Map)} with {@code Map}.
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(Map)}
   */
  @Test
  @DisplayName("Test mergedWith(Map) with 'Map'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(Map)"})
  void testMergedWithWithMap2() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_GAMMA, CurrencyParameterSensitivities.empty());

    HashMap<CurveSensitivitiesType, CurrencyParameterSensitivities> other = new HashMap<>();
    other.put(CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(other);

    // Assert
    assertEquals(2, actualMergedWithResult.getTypedSensitivities().size());
    assertSame(info, actualMergedWithResult.getInfo());
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@link CurveSensitivitiesType} with name is {@code info}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(Map)}
   */
  @Test
  @DisplayName("Test mergedWith(Map) with 'Map'; given CurveSensitivitiesType with name is 'info'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(Map)"})
  void testMergedWithWithMap_givenCurveSensitivitiesTypeWithNameIsInfo() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivitiesType type = CurveSensitivitiesType.of("info");

    CurveSensitivities ofResult =
        CurveSensitivities.of(info, type, CurrencyParameterSensitivities.empty());

    HashMap<CurveSensitivitiesType, CurrencyParameterSensitivities> other = new HashMap<>();
    other.put(CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualMergedWithResult = ofResult.mergedWith(other);

    // Assert
    assertEquals(2, actualMergedWithResult.getTypedSensitivities().size());
    assertSame(info, actualMergedWithResult.getInfo());
  }

  /**
   * Test {@link CurveSensitivities#mergedWith(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#mergedWith(Map)}
   */
  @Test
  @DisplayName("Test mergedWith(Map) with 'Map'; given empty; when HashMap(); then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.mergedWith(Map)"})
  void testMergedWithWithMap_givenEmpty_whenHashMap_thenReturnEmpty() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();

    // Act
    CurveSensitivities actualMergedWithResult = emptyResult.mergedWith(new HashMap<>());

    // Assert
    assertEquals(emptyResult, actualMergedWithResult);
  }

  /**
   * Test {@link CurveSensitivities#withMarketDataNames(Function)}.
   *
   * <p>Method under test: {@link CurveSensitivities#withMarketDataNames(Function)}
   */
  @Test
  @DisplayName("Test withMarketDataNames(Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.withMarketDataNames(Function)"})
  void testWithMarketDataNames() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualWithMarketDataNamesResult =
        ofResult.withMarketDataNames(mock(Function.class));

    // Assert
    assertEquals(ofResult, actualWithMarketDataNamesResult);
  }

  /**
   * Test {@link CurveSensitivities#withMarketDataNames(Function)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#withMarketDataNames(Function)}
   */
  @Test
  @DisplayName("Test withMarketDataNames(Function); given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.withMarketDataNames(Function)"})
  void testWithMarketDataNames_givenEmpty_thenReturnEmpty() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();

    // Act
    CurveSensitivities actualWithMarketDataNamesResult =
        emptyResult.withMarketDataNames(mock(Function.class));

    // Assert
    assertEquals(emptyResult, actualWithMarketDataNamesResult);
  }

  /**
   * Test {@link CurveSensitivities#withParameterMetadatas(UnaryOperator)}.
   *
   * <p>Method under test: {@link CurveSensitivities#withParameterMetadatas(UnaryOperator)}
   */
  @Test
  @DisplayName("Test withParameterMetadatas(UnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.withParameterMetadatas(UnaryOperator)"})
  void testWithParameterMetadatas() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualWithParameterMetadatasResult =
        ofResult.withParameterMetadatas(mock(UnaryOperator.class));

    // Assert
    assertEquals(ofResult, actualWithParameterMetadatasResult);
  }

  /**
   * Test {@link CurveSensitivities#withParameterMetadatas(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#withParameterMetadatas(UnaryOperator)}
   */
  @Test
  @DisplayName("Test withParameterMetadatas(UnaryOperator); given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.withParameterMetadatas(UnaryOperator)"})
  void testWithParameterMetadatas_givenEmpty_thenReturnEmpty() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();

    // Act
    CurveSensitivities actualWithParameterMetadatasResult =
        emptyResult.withParameterMetadatas(mock(UnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualWithParameterMetadatasResult);
  }

  /**
   * Test {@link CurveSensitivities#convertedTo(Currency, FxRateProvider)}.
   *
   * <p>Method under test: {@link CurveSensitivities#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualConvertedToResult =
        ofResult.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link CurveSensitivities#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider); given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenEmpty_thenReturnEmpty() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();

    // Act
    CurveSensitivities actualConvertedToResult =
        emptyResult.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(emptyResult, actualConvertedToResult);
  }

  /**
   * Test {@link CurveSensitivities#summarize()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Description is {@code CurveSensitivities[]}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); given empty; then return Description is 'CurveSensitivities[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary CurveSensitivities.summarize()"})
  void testSummarize_givenEmpty_thenReturnDescriptionIsCurveSensitivities() {
    // Arrange and Act
    PortfolioItemSummary actualSummarizeResult = CurveSensitivities.empty().summarize();

    // Assert
    assertEquals("CurveSensitivities[]", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Sensitivities", productType.getName());
    assertEquals("Sensitivities", productType.toString());
    assertEquals("Sensitivities", productType.getDescription());
    assertEquals(PortfolioItemType.SENSITIVITIES, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link CurveSensitivities#summarize()}.
   *
   * <ul>
   *   <li>Then return Description is {@code CurveSensitivities[ZeroRateDelta]}.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#summarize()}
   */
  @Test
  @DisplayName("Test summarize(); then return Description is 'CurveSensitivities[ZeroRateDelta]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemSummary CurveSensitivities.summarize()"})
  void testSummarize_thenReturnDescriptionIsCurveSensitivitiesZeroRateDelta() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    PortfolioItemSummary actualSummarizeResult = ofResult.summarize();

    // Assert
    assertEquals("CurveSensitivities[ZeroRateDelta]", actualSummarizeResult.getDescription());
    ProductType productType = actualSummarizeResult.getProductType();
    assertEquals("Sensitivities", productType.getName());
    assertEquals("Sensitivities", productType.toString());
    assertEquals("Sensitivities", productType.getDescription());
    assertEquals(PortfolioItemType.SENSITIVITIES, actualSummarizeResult.getPortfolioItemType());
    assertFalse(actualSummarizeResult.getId().isPresent());
    assertTrue(actualSummarizeResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link CurveSensitivities#withInfo(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link CurveSensitivities#withInfo(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test withInfo(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.withInfo(PortfolioItemInfo)"})
  void testWithInfo() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult =
        CurveSensitivities.of(
            info, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty());

    // Act
    CurveSensitivities actualWithInfoResult = ofResult.withInfo(PositionInfo.empty());

    // Assert
    assertEquals(ofResult, actualWithInfoResult);
  }

  /**
   * Test {@link CurveSensitivities#withInfo(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return not Id Present.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#withInfo(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test withInfo(PortfolioItemInfo); given empty; when empty; then return not Id Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveSensitivities CurveSensitivities.withInfo(PortfolioItemInfo)"})
  void testWithInfo_givenEmpty_whenEmpty_thenReturnNotIdPresent() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();
    PositionInfo info = PositionInfo.empty();

    // Act
    CurveSensitivities actualWithInfoResult = emptyResult.withInfo(info);

    // Assert
    assertFalse(actualWithInfoResult.getId().isPresent());
    assertTrue(actualWithInfoResult.getTypedSensitivities().isEmpty());
    assertSame(info, actualWithInfoResult.getInfo());
  }

  /**
   * Test {@link CurveSensitivities#meta()}.
   *
   * <p>Method under test: {@link CurveSensitivities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveSensitivities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurveSensitivities.meta();

    // Assert
    MetaProperty<PortfolioItemInfo> infoResult = actualMetaResult.info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveSensitivitiesType, CurrencyParameterSensitivities>>
        typedSensitivitiesResult = actualMetaResult.typedSensitivities();
    assertTrue(typedSensitivitiesResult instanceof DirectMetaProperty);
    assertEquals("info", infoResult.name());
    assertEquals("typedSensitivities", typedSensitivitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, infoResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, typedSensitivitiesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, typedSensitivitiesResult.propertyType());
    Class<CurveSensitivities> expectedDeclaringTypeResult = CurveSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, infoResult.declaringType());
    Class<CurveSensitivities> expectedDeclaringTypeResult2 = CurveSensitivities.class;
    assertEquals(expectedDeclaringTypeResult2, typedSensitivitiesResult.declaringType());
    Class<PortfolioItemInfo> expectedPropertyTypeResult2 = PortfolioItemInfo.class;
    assertEquals(expectedPropertyTypeResult2, infoResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, infoResult.metaBean());
    assertSame(meta, typedSensitivitiesResult.metaBean());
  }

  /**
   * Test {@link CurveSensitivities#metaBean()}.
   *
   * <p>Method under test: {@link CurveSensitivities#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveSensitivities.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, CurveSensitivities.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveSensitivities#toString()}
   *   <li>{@link CurveSensitivities#getInfo()}
   *   <li>{@link CurveSensitivities#getTypedSensitivities()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PortfolioItemInfo CurveSensitivities.getInfo()",
    "ImmutableMap CurveSensitivities.getTypedSensitivities()",
    "String CurveSensitivities.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();

    // Act
    String actualToStringResult = emptyResult.toString();
    PortfolioItemInfo actualInfo = emptyResult.getInfo();

    // Assert
    assertEquals(
        "CurveSensitivities{info=ItemInfo{id=null, attributes={}}, typedSensitivities={}}",
        actualToStringResult);
    assertTrue(emptyResult.getTypedSensitivities().isEmpty());
    assertTrue(actualInfo.getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link CurveSensitivities#equals(Object)}, and {@link CurveSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveSensitivities#equals(Object)}
   *   <li>{@link CurveSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveSensitivities.equals(Object)",
    "int CurveSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();
    CurveSensitivities emptyResult2 = CurveSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link CurveSensitivities#equals(Object)}, and {@link CurveSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveSensitivities#equals(Object)}
   *   <li>{@link CurveSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveSensitivities.equals(Object)",
    "int CurveSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult = CurveSensitivities.of(info, new HashMap<>());
    PositionInfo info2 = PositionInfo.empty();
    CurveSensitivities ofResult2 = CurveSensitivities.of(info2, new HashMap<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CurveSensitivities#equals(Object)}, and {@link CurveSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveSensitivities#equals(Object)}
   *   <li>{@link CurveSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveSensitivities.equals(Object)",
    "int CurveSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveSensitivities emptyResult = CurveSensitivities.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link CurveSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveSensitivities.equals(Object)",
    "int CurveSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult = CurveSensitivities.of(info, new HashMap<>());

    // Act and Assert
    assertNotEquals(ofResult, CurveSensitivities.empty());
  }

  /**
   * Test {@link CurveSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveSensitivities.equals(Object)",
    "int CurveSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    PositionInfo info = PositionInfo.empty();
    CurveSensitivities ofResult = CurveSensitivities.of(info, new HashMap<>());
    PositionInfo info2 = PositionInfo.empty();

    // Act and Assert
    assertNotEquals(
        ofResult,
        CurveSensitivities.of(
            info2, CurveSensitivitiesType.ZERO_RATE_DELTA, CurrencyParameterSensitivities.empty()));
  }

  /**
   * Test {@link CurveSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveSensitivities.equals(Object)",
    "int CurveSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveSensitivities.empty(), null);
  }

  /**
   * Test {@link CurveSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveSensitivities.equals(Object)",
    "int CurveSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveSensitivities.empty(), "Different type to CurveSensitivities");
  }
}
