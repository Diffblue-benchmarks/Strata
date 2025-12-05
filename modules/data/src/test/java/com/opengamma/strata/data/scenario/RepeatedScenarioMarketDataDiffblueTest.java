package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.TestingObservableId;
import com.opengamma.strata.data.scenario.RepeatedScenarioMarketData.Meta;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RepeatedScenarioMarketDataDiffblueTest {
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
    Class<? extends RepeatedScenarioMarketData> actualBeanTypeResult =
        RepeatedScenarioMarketData.meta().beanType();

    // Assert
    Class<RepeatedScenarioMarketData> expectedBeanTypeResult = RepeatedScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#scenarioCount()}
   *   <li>{@link Meta#underlying()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.scenarioCount()", "MetaProperty Meta.underlying()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RepeatedScenarioMarketData.meta();

    // Act
    MetaProperty<Integer> actualScenarioCountResult = metaResult.scenarioCount();

    // Assert
    assertTrue(actualScenarioCountResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlying() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean scenarioCount return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean scenarioCount return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanScenarioCountReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RepeatedScenarioMarketData.meta().metaPropertyGet("underlying");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> scenarioCountResult = ((Meta) metaBeanResult).scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    assertEquals("int", scenarioCountResult.propertyType().getName());
    assertEquals("scenarioCount", scenarioCountResult.name());
    assertEquals("underlying", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, scenarioCountResult.style());
    Class<MarketData> expectedPropertyTypeResult = MarketData.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<RepeatedScenarioMarketData> expectedDeclaringTypeResult =
        RepeatedScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult, scenarioCountResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlying());
    assertSame(Meta.INSTANCE, scenarioCountResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean underlying return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean underlying return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanUnderlyingReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RepeatedScenarioMarketData.meta().metaPropertyGet("scenarioCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<MarketData> underlyingResult = ((Meta) metaBeanResult).underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("scenarioCount", actualMetaPropertyGetResult.name());
    assertEquals("underlying", underlyingResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingResult.style());
    Class<MarketData> expectedPropertyTypeResult = MarketData.class;
    assertEquals(expectedPropertyTypeResult, underlyingResult.propertyType());
    Class<RepeatedScenarioMarketData> expectedDeclaringTypeResult =
        RepeatedScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult, underlyingResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).scenarioCount());
    assertSame(Meta.INSTANCE, underlyingResult.metaBean());
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
    assertNull(RepeatedScenarioMarketData.meta().metaPropertyGet("Property Name"));
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
        RepeatedScenarioMarketData.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("scenarioCount");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("underlying");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("int", getResult.propertyType().getName());
    assertEquals("scenarioCount", getResult.name());
    assertEquals("underlying", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<MarketData> expectedPropertyTypeResult = MarketData.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<RepeatedScenarioMarketData> expectedDeclaringTypeResult =
        RepeatedScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<RepeatedScenarioMarketData> expectedDeclaringTypeResult2 =
        RepeatedScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
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
    assertNull(
        RepeatedScenarioMarketData.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            RepeatedScenarioMarketData.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
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
            RepeatedScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "scenarioCount", "New Value", false));
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
            RepeatedScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code scenarioCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'scenarioCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenScenarioCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RepeatedScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "scenarioCount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlying'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlying_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RepeatedScenarioMarketData.meta()
                .propertySet(mock(Bean.class), "underlying", "New Value", true));
  }

  /**
   * Test {@link RepeatedScenarioMarketData#of(int, MarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is three.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#of(int, MarketData)}
   */
  @Test
  @DisplayName("Test of(int, MarketData); then return ScenarioCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RepeatedScenarioMarketData RepeatedScenarioMarketData.of(int, MarketData)"})
  void testOf_thenReturnScenarioCountIsThree() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));
    SingleScenarioMarketData marketData2 = SingleScenarioMarketData.of(marketData, 1);

    // Act
    RepeatedScenarioMarketData actualOfResult = RepeatedScenarioMarketData.of(3, marketData2);

    // Assert
    assertEquals(3, actualOfResult.getScenarioCount());
    assertTrue(actualOfResult.getIds().isEmpty());
    assertTrue(actualOfResult.getTimeSeriesIds().isEmpty());
    assertSame(marketData2, actualOfResult.getUnderlying());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return {@link SingleMarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return SingleMarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox RepeatedScenarioMarketData.getValuationDate()"})
  void testGetValuationDate_thenReturnSingleMarketDataBox() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(underlying.getValuationDate()).thenReturn(ofResult);
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);

    // Act
    MarketDataBox<LocalDate> actualValuationDate =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1))
            .getValuationDate();

    // Assert
    verify(underlying).getValuationDate();
    assertTrue(actualValuationDate instanceof SingleMarketDataBox);
    LocalDate singleValue = actualValuationDate.getSingleValue();
    assertEquals("1970-01-01", singleValue.toString());
    assertEquals(-1, actualValuationDate.getScenarioCount());
    assertFalse(actualValuationDate.isScenarioValue());
    assertTrue(actualValuationDate.isSingleValue());
    Class<LocalDate> expectedMarketDataType = LocalDate.class;
    assertEquals(expectedMarketDataType, actualValuationDate.getMarketDataType());
    assertSame(ofResult, singleValue);
    assertSame(ofResult, ((SingleMarketDataBox<LocalDate>) actualValuationDate).getValue());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#scenarios()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#scenarios()}
   */
  @Test
  @DisplayName("Test scenarios(); then return limit five collect toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream RepeatedScenarioMarketData.scenarios()"})
  void testScenarios_thenReturnLimitFiveCollectToListSizeIsThree() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));
    SingleScenarioMarketData marketData2 = SingleScenarioMarketData.of(marketData, 1);

    // Act
    Stream<MarketData> actualScenariosResult =
        RepeatedScenarioMarketData.of(3, marketData2).scenarios();

    // Assert
    List<MarketData> collectResult = actualScenariosResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertSame(marketData2, collectResult.get(0));
    assertSame(marketData2, collectResult.get(1));
    assertSame(marketData2, collectResult.get(2));
  }

  /**
   * Test {@link RepeatedScenarioMarketData#scenario(int)}.
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#scenario(int)}
   */
  @Test
  @DisplayName("Test scenario(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketData RepeatedScenarioMarketData.scenario(int)"})
  void testScenario() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));
    SingleScenarioMarketData marketData2 = SingleScenarioMarketData.of(marketData, 1);

    // Act and Assert
    assertSame(marketData2, RepeatedScenarioMarketData.of(3, marketData2).scenario(1));
  }

  /**
   * Test {@link RepeatedScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#containsValue(MarketDataId)} return {@code
   *       false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(MarketDataId); given MarketData containsValue(MarketDataId) return 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RepeatedScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenMarketDataContainsValueReturnFalse_thenReturnFalse() {
    // Arrange
    MarketData marketData = mock(MarketData.class);
    when(marketData.containsValue(Mockito.<MarketDataId<?>>any())).thenReturn(false);

    // Act
    boolean actualContainsValueResult =
        RepeatedScenarioMarketData.of(3, marketData).containsValue(mock(MarketDataId.class));

    // Assert
    verify(marketData).containsValue(isA(MarketDataId.class));
    assertFalse(actualContainsValueResult);
  }

  /**
   * Test {@link RepeatedScenarioMarketData#containsValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#containsValue(MarketDataId)} return {@code
   *       true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test containsValue(MarketDataId); given MarketData containsValue(MarketDataId) return 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RepeatedScenarioMarketData.containsValue(MarketDataId)"})
  void testContainsValue_givenMarketDataContainsValueReturnTrue_thenReturnTrue() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    when(underlying.containsValue(Mockito.<MarketDataId<?>>any())).thenReturn(true);
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);

    // Act
    boolean actualContainsValueResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1))
            .containsValue(mock(MarketDataId.class));

    // Assert
    verify(underlying).containsValue(isA(MarketDataId.class));
    assertTrue(actualContainsValueResult);
  }

  /**
   * Test {@link RepeatedScenarioMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Given {@link ScenarioMarketData} {@link ScenarioMarketData#findValue(MarketDataId)}
   *       return empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName(
      "Test findValue(MarketDataId); given ScenarioMarketData findValue(MarketDataId) return empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RepeatedScenarioMarketData.findValue(MarketDataId)"})
  void testFindValue_givenScenarioMarketDataFindValueReturnEmpty_thenReturnNotPresent() {
    // Arrange
    ScenarioMarketData marketData = mock(ScenarioMarketData.class);
    Optional<MarketDataBox<Object>> emptyResult = Optional.empty();
    when(marketData.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(emptyResult);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    Optional<MarketDataBox<Object>> actualFindValueResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1))
            .findValue(mock(MarketDataId.class));

    // Assert
    verify(marketData).findValue(isA(MarketDataId.class));
    verify(marketData).getScenarioCount();
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#findValue(MarketDataId)}.
   *
   * <ul>
   *   <li>Then {@link Optional#get()} return {@link SingleMarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId); then get() return SingleMarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RepeatedScenarioMarketData.findValue(MarketDataId)"})
  void testFindValue_thenGetReturnSingleMarketDataBox() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    Optional<Object> ofResult = Optional.of("Value");
    when(underlying.findValue(Mockito.<MarketDataId<Object>>any())).thenReturn(ofResult);
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);

    // Act
    Optional<MarketDataBox<Object>> actualFindValueResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1))
            .findValue(mock(MarketDataId.class));

    // Assert
    verify(underlying).findValue(isA(MarketDataId.class));
    MarketDataBox<Object> getResult = actualFindValueResult.get();
    assertTrue(getResult instanceof SingleMarketDataBox);
    assertEquals("Value", getResult.getSingleValue());
    assertEquals("Value", ((SingleMarketDataBox<Object>) getResult).getValue());
    assertEquals(-1, getResult.getScenarioCount());
    assertFalse(getResult.isScenarioValue());
    assertTrue(getResult.isSingleValue());
    assertTrue(actualFindValueResult.isPresent());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, getResult.getMarketDataType());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#getIds()}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#getIds()} return {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); given MarketData getIds() return HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set RepeatedScenarioMarketData.getIds()"})
  void testGetIds_givenMarketDataGetIdsReturnHashSet_thenReturnEmpty() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    Mockito.<Set<MarketDataId<?>>>when(underlying.getIds()).thenReturn(new HashSet<>());
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);

    // Act
    Set<MarketDataId<?>> actualIds =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1)).getIds();

    // Assert
    verify(underlying).getIds();
    assertTrue(actualIds.isEmpty());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#findIds(MarketDataName)}.
   *
   * <ul>
   *   <li>Given {@link MarketData} {@link MarketData#findIds(MarketDataName)} return {@link
   *       HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test findIds(MarketDataName); given MarketData findIds(MarketDataName) return HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set RepeatedScenarioMarketData.findIds(MarketDataName)"})
  void testFindIds_givenMarketDataFindIdsReturnHashSet_thenReturnEmpty() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    when(underlying.findIds(Mockito.<MarketDataName<Object>>any())).thenReturn(new HashSet<>());
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);

    // Act
    Set<MarketDataId<Object>> actualFindIdsResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1)).findIds(null);

    // Assert
    verify(underlying).findIds(isNull());
    assertTrue(actualFindIdsResult.isEmpty());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#getTimeSeriesIds()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set RepeatedScenarioMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds_thenReturnEmpty() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    when(underlying.getTimeSeriesIds()).thenReturn(new HashSet<>());
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);

    // Act
    Set<ObservableId> actualTimeSeriesIds =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1))
            .getTimeSeriesIds();

    // Assert
    verify(underlying).getTimeSeriesIds();
    assertTrue(actualTimeSeriesIds.isEmpty());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#getTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Then calls {@link MarketData#getTimeSeries(ObservableId)}.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#getTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test getTimeSeries(ObservableId); then calls getTimeSeries(ObservableId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalDateDoubleTimeSeries RepeatedScenarioMarketData.getTimeSeries(ObservableId)"
  })
  void testGetTimeSeries_thenCallsGetTimeSeries() {
    // Arrange
    MarketData underlying = mock(MarketData.class);
    when(underlying.getTimeSeries(Mockito.<ObservableId>any()))
        .thenReturn(mock(LocalDateDoubleTimeSeries.class));
    RepeatedScenarioMarketData marketData = new RepeatedScenarioMarketData(3, underlying);
    RepeatedScenarioMarketData ofResult =
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1));

    // Act
    ofResult.getTimeSeries(new TestingObservableId("42"));

    // Assert
    verify(underlying).getTimeSeries(isA(ObservableId.class));
  }

  /**
   * Test {@link RepeatedScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RepeatedScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RepeatedScenarioMarketData.meta();

    // Assert
    MetaProperty<Integer> scenarioCountResult = actualMetaResult.scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    MetaProperty<MarketData> underlyingResult = actualMetaResult.underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("int", scenarioCountResult.propertyType().getName());
    assertEquals("scenarioCount", scenarioCountResult.name());
    assertEquals("underlying", underlyingResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, scenarioCountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<MarketData> expectedPropertyTypeResult = MarketData.class;
    assertEquals(expectedPropertyTypeResult, underlyingResult.propertyType());
    Class<RepeatedScenarioMarketData> expectedDeclaringTypeResult =
        RepeatedScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult, scenarioCountResult.declaringType());
    Class<RepeatedScenarioMarketData> expectedDeclaringTypeResult2 =
        RepeatedScenarioMarketData.class;
    assertEquals(expectedDeclaringTypeResult2, underlyingResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, scenarioCountResult.metaBean());
    assertSame(meta, underlyingResult.metaBean());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#RepeatedScenarioMarketData(int, MarketData)}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is three.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#RepeatedScenarioMarketData(int,
   * MarketData)}
   */
  @Test
  @DisplayName(
      "Test new RepeatedScenarioMarketData(int, MarketData); then return ScenarioCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RepeatedScenarioMarketData.<init>(int, MarketData)"})
  void testNewRepeatedScenarioMarketData_thenReturnScenarioCountIsThree() {
    // Arrange
    SingleScenarioMarketData underlying =
        SingleScenarioMarketData.of(RepeatedScenarioMarketData.of(3, mock(MarketData.class)), 1);

    // Act
    RepeatedScenarioMarketData actualRepeatedScenarioMarketData =
        new RepeatedScenarioMarketData(3, underlying);

    // Assert
    assertEquals(3, actualRepeatedScenarioMarketData.getScenarioCount());
    assertTrue(actualRepeatedScenarioMarketData.getIds().isEmpty());
    assertTrue(actualRepeatedScenarioMarketData.getTimeSeriesIds().isEmpty());
    assertSame(underlying, actualRepeatedScenarioMarketData.getUnderlying());
  }

  /**
   * Test {@link RepeatedScenarioMarketData#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link RepeatedScenarioMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RepeatedScenarioMarketData.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    RepeatedScenarioMarketData marketData =
        new RepeatedScenarioMarketData(3, mock(MarketData.class));

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        RepeatedScenarioMarketData.of(3, SingleScenarioMarketData.of(marketData, 1)).metaBean());
  }
}
