package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.calc.marketdata.BuiltMarketData.Meta;
import com.opengamma.strata.collect.result.Failure;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.MarketDataBox;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BuiltMarketDataDiffblueTest {
  /**
   * Test {@link BuiltMarketData#getValuationDate()}.
   *
   * <ul>
   *   <li>Then calls {@link MarketDataBox#getSingleValue()}.
   * </ul>
   *
   * <p>Method under test: {@link BuiltMarketData#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then calls getSingleValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate BuiltMarketData.getValuationDate()"})
  void testGetValuationDate_thenCallsGetSingleValue() {
    // Arrange
    MarketDataBox<LocalDate> valuationDate = mock(MarketDataBox.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(valuationDate.getSingleValue()).thenReturn(ofResult);
    HashMap<MarketDataId<?>, MarketDataBox<?>> values = new HashMap<>();

    ImmutableScenarioMarketData underlying =
        ImmutableScenarioMarketData.of(3, valuationDate, values, new HashMap<>());
    HashMap<MarketDataId<?>, Failure> valueFailures = new HashMap<>();

    BuiltScenarioMarketData underlying2 =
        new BuiltScenarioMarketData(underlying, valueFailures, new HashMap<>());

    // Act
    LocalDate actualValuationDate = new BuiltMarketData(underlying2).getValuationDate();

    // Assert
    verify(valuationDate).getSingleValue();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }

  /**
   * Test {@link BuiltMarketData#containsValue(MarketDataId)}.
   *
   * <p>Method under test: {@link BuiltMarketData#containsValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test containsValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuiltMarketData.containsValue(MarketDataId)"})
  void testContainsValue() {
    // Arrange, Act and Assert
    assertFalse(
        new BuiltMarketData(BuiltScenarioMarketData.empty())
            .containsValue(mock(MarketDataId.class)));
  }

  /**
   * Test {@link BuiltMarketData#findValue(MarketDataId)}.
   *
   * <p>Method under test: {@link BuiltMarketData#findValue(MarketDataId)}
   */
  @Test
  @DisplayName("Test findValue(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional BuiltMarketData.findValue(MarketDataId)"})
  void testFindValue() {
    // Arrange, Act and Assert
    assertFalse(
        new BuiltMarketData(BuiltScenarioMarketData.empty())
            .findValue(mock(MarketDataId.class))
            .isPresent());
  }

  /**
   * Test {@link BuiltMarketData#getIds()}.
   *
   * <p>Method under test: {@link BuiltMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BuiltMarketData.getIds()"})
  void testGetIds() {
    // Arrange, Act and Assert
    assertTrue(new BuiltMarketData(BuiltScenarioMarketData.empty()).getIds().isEmpty());
  }

  /**
   * Test {@link BuiltMarketData#findIds(MarketDataName)}.
   *
   * <p>Method under test: {@link BuiltMarketData#findIds(MarketDataName)}
   */
  @Test
  @DisplayName("Test findIds(MarketDataName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BuiltMarketData.findIds(MarketDataName)"})
  void testFindIds() {
    // Arrange, Act and Assert
    assertTrue(
        new BuiltMarketData(BuiltScenarioMarketData.empty())
            .findIds(mock(MarketDataName.class))
            .isEmpty());
  }

  /**
   * Test {@link BuiltMarketData#getTimeSeriesIds()}.
   *
   * <p>Method under test: {@link BuiltMarketData#getTimeSeriesIds()}
   */
  @Test
  @DisplayName("Test getTimeSeriesIds()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BuiltMarketData.getTimeSeriesIds()"})
  void testGetTimeSeriesIds() {
    // Arrange, Act and Assert
    assertTrue(new BuiltMarketData(BuiltScenarioMarketData.empty()).getTimeSeriesIds().isEmpty());
  }

  /**
   * Test {@link BuiltMarketData#getValueFailures()}.
   *
   * <p>Method under test: {@link BuiltMarketData#getValueFailures()}
   */
  @Test
  @DisplayName("Test getValueFailures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap BuiltMarketData.getValueFailures()"})
  void testGetValueFailures() {
    // Arrange, Act and Assert
    assertTrue(new BuiltMarketData(BuiltScenarioMarketData.empty()).getValueFailures().isEmpty());
  }

  /**
   * Test {@link BuiltMarketData#getTimeSeriesFailures()}.
   *
   * <p>Method under test: {@link BuiltMarketData#getTimeSeriesFailures()}
   */
  @Test
  @DisplayName("Test getTimeSeriesFailures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap BuiltMarketData.getTimeSeriesFailures()"})
  void testGetTimeSeriesFailures() {
    // Arrange, Act and Assert
    assertTrue(
        new BuiltMarketData(BuiltScenarioMarketData.empty()).getTimeSeriesFailures().isEmpty());
  }

  /**
   * Test {@link BuiltMarketData#meta()}.
   *
   * <p>Method under test: {@link BuiltMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BuiltMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = BuiltMarketData.meta();

    // Assert
    MetaProperty<BuiltScenarioMarketData> underlyingResult = actualMetaResult.underlying();
    assertTrue(underlyingResult instanceof DirectMetaProperty);
    assertEquals("underlying", underlyingResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<BuiltMarketData> expectedDeclaringTypeResult = BuiltMarketData.class;
    assertEquals(expectedDeclaringTypeResult, underlyingResult.declaringType());
    Class<BuiltScenarioMarketData> expectedPropertyTypeResult = BuiltScenarioMarketData.class;
    assertEquals(expectedPropertyTypeResult, underlyingResult.propertyType());
    assertSame(Meta.INSTANCE, underlyingResult.metaBean());
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
    Class<? extends BuiltMarketData> actualBeanTypeResult = BuiltMarketData.meta().beanType();

    // Assert
    Class<BuiltMarketData> expectedBeanTypeResult = BuiltMarketData.class;
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
    assertNull(BuiltMarketData.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlying}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlying'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlying_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BuiltMarketData.meta().metaPropertyGet("underlying");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("underlying", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<BuiltMarketData> expectedDeclaringTypeResult = BuiltMarketData.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    Class<BuiltScenarioMarketData> expectedPropertyTypeResult = BuiltScenarioMarketData.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
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
        BuiltMarketData.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("underlying");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("underlying", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<BuiltMarketData> expectedDeclaringTypeResult = BuiltMarketData.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<BuiltScenarioMarketData> expectedPropertyTypeResult = BuiltScenarioMarketData.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
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
    assertNull(BuiltMarketData.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link BuiltMarketData#BuiltMarketData(BuiltScenarioMarketData)} with underlying is
   *       empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when BuiltMarketData(BuiltScenarioMarketData) with underlying is empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBuiltMarketDataWithUnderlyingIsEmpty_thenReturnEmpty() {
    // Arrange
    Meta metaResult = BuiltMarketData.meta();
    BuiltScenarioMarketData underlying = BuiltScenarioMarketData.empty();

    // Act and Assert
    assertSame(
        underlying, metaResult.propertyGet(new BuiltMarketData(underlying), "underlying", true));
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
    Meta metaResult = BuiltMarketData.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                new BuiltMarketData(BuiltScenarioMarketData.empty()), "Property Name", false));
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
            BuiltMarketData.meta().propertySet(mock(Bean.class), "underlying", "New Value", false));
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
            BuiltMarketData.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
            BuiltMarketData.meta().propertySet(mock(Bean.class), "underlying", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#underlying()}.
   *
   * <p>Method under test: {@link Meta#underlying()}
   */
  @Test
  @DisplayName("Test Meta underlying()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.underlying()"})
  void testMetaUnderlying() {
    // Arrange, Act and Assert
    assertTrue(BuiltMarketData.meta().underlying() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link BuiltMarketData#BuiltMarketData(BuiltScenarioMarketData)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return TimeSeriesFailures Empty.
   * </ul>
   *
   * <p>Method under test: {@link BuiltMarketData#BuiltMarketData(BuiltScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test new BuiltMarketData(BuiltScenarioMarketData); when empty; then return TimeSeriesFailures Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BuiltMarketData.<init>(BuiltScenarioMarketData)"})
  void testNewBuiltMarketData_whenEmpty_thenReturnTimeSeriesFailuresEmpty() {
    // Arrange
    BuiltScenarioMarketData underlying = BuiltScenarioMarketData.empty();

    // Act
    BuiltMarketData actualBuiltMarketData = new BuiltMarketData(underlying);

    // Assert
    ImmutableMap<MarketDataId<?>, Failure> timeSeriesFailures =
        actualBuiltMarketData.getTimeSeriesFailures();
    assertTrue(timeSeriesFailures.isEmpty());
    Set<MarketDataId<?>> ids = actualBuiltMarketData.getIds();
    assertTrue(ids.isEmpty());
    assertSame(ids, actualBuiltMarketData.getTimeSeriesIds());
    assertSame(underlying, actualBuiltMarketData.getUnderlying());
    assertSame(timeSeriesFailures, actualBuiltMarketData.getValueFailures());
  }

  /**
   * Test {@link BuiltMarketData#metaBean()}.
   *
   * <p>Method under test: {@link BuiltMarketData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BuiltMarketData.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, new BuiltMarketData(BuiltScenarioMarketData.empty()).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BuiltMarketData#toString()}
   *   <li>{@link BuiltMarketData#getUnderlying()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BuiltScenarioMarketData BuiltMarketData.getUnderlying()",
    "String BuiltMarketData.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    BuiltScenarioMarketData underlying = BuiltScenarioMarketData.empty();
    BuiltMarketData builtMarketData = new BuiltMarketData(underlying);

    // Act
    builtMarketData.toString();

    // Assert
    assertSame(underlying, builtMarketData.getUnderlying());
  }

  /**
   * Test {@link BuiltMarketData#equals(Object)}, and {@link BuiltMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BuiltMarketData#equals(Object)}
   *   <li>{@link BuiltMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuiltMarketData.equals(Object)", "int BuiltMarketData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BuiltMarketData builtMarketData = new BuiltMarketData(BuiltScenarioMarketData.empty());
    BuiltMarketData builtMarketData2 = new BuiltMarketData(BuiltScenarioMarketData.empty());

    // Act and Assert
    assertEquals(builtMarketData, builtMarketData2);
    assertEquals(builtMarketData.hashCode(), builtMarketData2.hashCode());
  }

  /**
   * Test {@link BuiltMarketData#equals(Object)}, and {@link BuiltMarketData#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BuiltMarketData#equals(Object)}
   *   <li>{@link BuiltMarketData#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuiltMarketData.equals(Object)", "int BuiltMarketData.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BuiltMarketData builtMarketData = new BuiltMarketData(BuiltScenarioMarketData.empty());

    // Act and Assert
    assertEquals(builtMarketData, builtMarketData);
    int expectedHashCodeResult = builtMarketData.hashCode();
    assertEquals(expectedHashCodeResult, builtMarketData.hashCode());
  }

  /**
   * Test {@link BuiltMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BuiltMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuiltMarketData.equals(Object)", "int BuiltMarketData.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new BuiltMarketData(BuiltScenarioMarketData.empty()), null);
  }

  /**
   * Test {@link BuiltMarketData#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BuiltMarketData#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BuiltMarketData.equals(Object)", "int BuiltMarketData.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new BuiltMarketData(BuiltScenarioMarketData.empty()), "Different type to BuiltMarketData");
  }
}
