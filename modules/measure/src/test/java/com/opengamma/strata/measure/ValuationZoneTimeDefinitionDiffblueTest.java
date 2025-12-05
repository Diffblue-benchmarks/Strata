package com.opengamma.strata.measure;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.data.scenario.MarketDataBox;
import com.opengamma.strata.measure.ValuationZoneTimeDefinition.Meta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValuationZoneTimeDefinitionDiffblueTest {
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
    Class<? extends ValuationZoneTimeDefinition> actualBeanTypeResult =
        ValuationZoneTimeDefinition.meta().beanType();

    // Assert
    Class<ValuationZoneTimeDefinition> expectedBeanTypeResult = ValuationZoneTimeDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#defaultLocalTime()}
   *   <li>{@link Meta#localTimes()}
   *   <li>{@link Meta#zoneId()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.defaultLocalTime()",
    "MetaProperty Meta.localTimes()",
    "MetaProperty Meta.zoneId()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ValuationZoneTimeDefinition.meta();

    // Act
    MetaProperty<LocalTime> actualDefaultLocalTimeResult = metaResult.defaultLocalTime();
    MetaProperty<ImmutableList<LocalTime>> actualLocalTimesResult = metaResult.localTimes();

    // Assert
    assertTrue(actualDefaultLocalTimeResult instanceof DirectMetaProperty);
    assertTrue(actualLocalTimesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zoneId() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code defaultLocalTime}.
   *   <li>Then return name is {@code defaultLocalTime}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'defaultLocalTime'; then return name is 'defaultLocalTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDefaultLocalTime_thenReturnNameIsDefaultLocalTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValuationZoneTimeDefinition.meta().metaPropertyGet("defaultLocalTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<LocalTime>> localTimesResult = ((Meta) metaBeanResult).localTimes();
    assertTrue(localTimesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZoneId> zoneIdResult = ((Meta) metaBeanResult).zoneId();
    assertTrue(zoneIdResult instanceof DirectMetaProperty);
    assertEquals("defaultLocalTime", actualMetaPropertyGetResult.name());
    Class<LocalTime> expectedPropertyTypeResult = LocalTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).defaultLocalTime());
    assertSame(metaBeanResult, localTimesResult.metaBean());
    assertSame(metaBeanResult, zoneIdResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code localTimes}.
   *   <li>Then return name is {@code localTimes}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'localTimes'; then return name is 'localTimes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLocalTimes_thenReturnNameIsLocalTimes() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValuationZoneTimeDefinition.meta().metaPropertyGet("localTimes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalTime> defaultLocalTimeResult = ((Meta) metaBeanResult).defaultLocalTime();
    assertTrue(defaultLocalTimeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZoneId> zoneIdResult = ((Meta) metaBeanResult).zoneId();
    assertTrue(zoneIdResult instanceof DirectMetaProperty);
    assertEquals("localTimes", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).localTimes());
    assertSame(metaBeanResult, defaultLocalTimeResult.metaBean());
    assertSame(metaBeanResult, zoneIdResult.metaBean());
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
    assertNull(ValuationZoneTimeDefinition.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zoneId}.
   *   <li>Then return name is {@code zoneId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'zoneId'; then return name is 'zoneId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZoneId_thenReturnNameIsZoneId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValuationZoneTimeDefinition.meta().metaPropertyGet("zoneId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalTime> defaultLocalTimeResult = ((Meta) metaBeanResult).defaultLocalTime();
    assertTrue(defaultLocalTimeResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<LocalTime>> localTimesResult = ((Meta) metaBeanResult).localTimes();
    assertTrue(localTimesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("zoneId", actualMetaPropertyGetResult.name());
    Class<ZoneId> expectedPropertyTypeResult = ZoneId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zoneId());
    assertSame(metaBeanResult, defaultLocalTimeResult.metaBean());
    assertSame(metaBeanResult, localTimesResult.metaBean());
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
        ValuationZoneTimeDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("defaultLocalTime");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("localTimes");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("zoneId");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("defaultLocalTime", getResult.name());
    assertEquals("localTimes", getResult2.name());
    assertEquals("zoneId", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ValuationZoneTimeDefinition> expectedDeclaringTypeResult =
        ValuationZoneTimeDefinition.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ValuationZoneTimeDefinition> expectedDeclaringTypeResult2 =
        ValuationZoneTimeDefinition.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<ValuationZoneTimeDefinition> expectedDeclaringTypeResult3 =
        ValuationZoneTimeDefinition.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<LocalTime> expectedPropertyTypeResult2 = LocalTime.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<ZoneId> expectedPropertyTypeResult3 = ZoneId.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
        ValuationZoneTimeDefinition.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code defaultLocalTime}.
   *   <li>Then return toString is {@code 00:00}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'defaultLocalTime'; then return toString is '00:00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDefaultLocalTime_thenReturnToStringIs0000() {
    // Arrange
    Meta metaResult = ValuationZoneTimeDefinition.meta();
    ValuationZoneTimeDefinition bean =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "defaultLocalTime", true);

    // Assert
    assertEquals("00:00", actualPropertyGetResult.toString());
    ImmutableList<LocalTime> localTimes = bean.getLocalTimes();
    assertEquals(1, localTimes.size());
    LocalTime localTime = ((LocalTime) actualPropertyGetResult).MIN;
    assertSame(localTime, bean.getDefaultLocalTime());
    assertSame(localTime, actualPropertyGetResult);
    assertSame(localTime, localTimes.get(0));
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
    Meta metaResult = ValuationZoneTimeDefinition.meta();
    ValuationZoneTimeDefinition bean =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code localTimes}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'localTimes'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLocalTimes_thenReturnList() {
    // Arrange
    Meta metaResult = ValuationZoneTimeDefinition.meta();
    ValuationZoneTimeDefinition bean =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "localTimes", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertEquals(1, ((List<LocalTime>) actualPropertyGetResult).size());
    assertEquals("00:00", ((List<LocalTime>) actualPropertyGetResult).get(0).toString());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code zoneId}.
   *   <li>Then return toString is {@code +00:00:01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'zoneId'; then return toString is '+00:00:01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenZoneId_thenReturnToStringIs000001() {
    // Arrange
    Meta metaResult = ValuationZoneTimeDefinition.meta();
    ZoneOffset zoneId = ZoneOffset.ofTotalSeconds(1);
    ValuationZoneTimeDefinition bean =
        ValuationZoneTimeDefinition.of(LocalTime.MIDNIGHT, zoneId, LocalTime.MIDNIGHT);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "zoneId", true);

    // Assert
    assertEquals("+00:00:01", actualPropertyGetResult.toString());
    assertEquals(1, bean.getLocalTimes().size());
    assertSame(zoneId, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code defaultLocalTime}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'defaultLocalTime'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDefaultLocalTime_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValuationZoneTimeDefinition.meta()
                .propertySet(mock(Bean.class), "defaultLocalTime", "New Value", true));
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
            ValuationZoneTimeDefinition.meta()
                .propertySet(mock(Bean.class), "defaultLocalTime", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code localTimes}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'localTimes'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLocalTimes_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValuationZoneTimeDefinition.meta()
                .propertySet(mock(Bean.class), "localTimes", "New Value", true));
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
            ValuationZoneTimeDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zoneId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zoneId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZoneId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValuationZoneTimeDefinition.meta()
                .propertySet(mock(Bean.class), "zoneId", "New Value", true));
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#of(LocalTime, ZoneId, LocalTime[])}.
   *
   * <ul>
   *   <li>When {@link LocalTime#MIDNIGHT} and {@link LocalTime#MIDNIGHT}.
   *   <li>Then return LocalTimes size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#of(LocalTime, ZoneId, LocalTime[])}
   */
  @Test
  @DisplayName(
      "Test of(LocalTime, ZoneId, LocalTime[]); when MIDNIGHT and MIDNIGHT; then return LocalTimes size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValuationZoneTimeDefinition ValuationZoneTimeDefinition.of(LocalTime, ZoneId, LocalTime[])"
  })
  void testOf_whenMidnightAndMidnight_thenReturnLocalTimesSizeIsTwo() {
    // Arrange and Act
    ValuationZoneTimeDefinition actualOfResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT,
            ZoneOffset.ofTotalSeconds(1),
            LocalTime.MIDNIGHT,
            LocalTime.MIDNIGHT);

    // Assert
    ImmutableList<LocalTime> localTimes = actualOfResult.getLocalTimes();
    assertEquals(2, localTimes.size());
    assertSame(LocalTime.MIN, localTimes.get(1));
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#of(LocalTime, ZoneId, LocalTime[])}.
   *
   * <ul>
   *   <li>When ofTotalSeconds one.
   *   <li>Then return LocalTimes Empty.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#of(LocalTime, ZoneId, LocalTime[])}
   */
  @Test
  @DisplayName(
      "Test of(LocalTime, ZoneId, LocalTime[]); when ofTotalSeconds one; then return LocalTimes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValuationZoneTimeDefinition ValuationZoneTimeDefinition.of(LocalTime, ZoneId, LocalTime[])"
  })
  void testOf_whenOfTotalSecondsOne_thenReturnLocalTimesEmpty() {
    // Arrange
    ZoneOffset zoneId = ZoneOffset.ofTotalSeconds(1);

    // Act
    ValuationZoneTimeDefinition actualOfResult =
        ValuationZoneTimeDefinition.of(LocalTime.MIDNIGHT, zoneId);

    // Assert
    assertTrue(actualOfResult.getLocalTimes().isEmpty());
    assertSame(zoneId, actualOfResult.getZoneId());
    assertSame(LocalTime.MIN, actualOfResult.getDefaultLocalTime());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#of(LocalTime, ZoneId, LocalTime[])}.
   *
   * <ul>
   *   <li>When ofTotalSeconds one.
   *   <li>Then return LocalTimes size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#of(LocalTime, ZoneId, LocalTime[])}
   */
  @Test
  @DisplayName(
      "Test of(LocalTime, ZoneId, LocalTime[]); when ofTotalSeconds one; then return LocalTimes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValuationZoneTimeDefinition ValuationZoneTimeDefinition.of(LocalTime, ZoneId, LocalTime[])"
  })
  void testOf_whenOfTotalSecondsOne_thenReturnLocalTimesSizeIsOne() {
    // Arrange and Act
    ValuationZoneTimeDefinition actualOfResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Assert
    ImmutableList<LocalTime> localTimes = actualOfResult.getLocalTimes();
    assertEquals(1, localTimes.size());
    assertSame(LocalTime.MIN, localTimes.get(0));
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}.
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}
   */
  @Test
  @DisplayName("Test toZonedDateTime(MarketDataBox)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ValuationZoneTimeDefinition.toZonedDateTime(MarketDataBox)"})
  void testToZonedDateTime() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1));

    MarketDataBox<LocalDate> dates = mock(MarketDataBox.class);
    when(dates.getValue(anyInt())).thenReturn(LocalDate.of(1970, 1, 1));
    when(dates.getScenarioCount()).thenReturn(3);
    when(dates.isScenarioValue()).thenReturn(true);

    // Act
    MarketDataBox<ZonedDateTime> actualToZonedDateTimeResult = ofResult.toZonedDateTime(dates);

    // Assert
    verify(dates).getScenarioCount();
    verify(dates, atLeast(1)).getValue(anyInt());
    verify(dates).isScenarioValue();
    assertTrue(actualToZonedDateTimeResult.isScenarioValue());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}.
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}
   */
  @Test
  @DisplayName("Test toZonedDateTime(MarketDataBox)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ValuationZoneTimeDefinition.toZonedDateTime(MarketDataBox)"})
  void testToZonedDateTime2() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT,
            ZoneOffset.ofTotalSeconds(1),
            LocalTime.MIDNIGHT,
            LocalTime.MIDNIGHT);

    MarketDataBox<LocalDate> dates = mock(MarketDataBox.class);
    when(dates.getValue(anyInt())).thenReturn(LocalDate.of(1970, 1, 1));
    when(dates.getScenarioCount()).thenReturn(3);
    when(dates.isScenarioValue()).thenReturn(true);

    // Act
    MarketDataBox<ZonedDateTime> actualToZonedDateTimeResult = ofResult.toZonedDateTime(dates);

    // Assert
    verify(dates).getScenarioCount();
    verify(dates, atLeast(1)).getValue(anyInt());
    verify(dates).isScenarioValue();
    assertTrue(actualToZonedDateTimeResult.isScenarioValue());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then calls {@link MarketDataBox#getSingleValue()}.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}
   */
  @Test
  @DisplayName("Test toZonedDateTime(MarketDataBox); given 'false'; then calls getSingleValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ValuationZoneTimeDefinition.toZonedDateTime(MarketDataBox)"})
  void testToZonedDateTime_givenFalse_thenCallsGetSingleValue() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    MarketDataBox<LocalDate> dates = mock(MarketDataBox.class);
    when(dates.getSingleValue()).thenReturn(LocalDate.of(1970, 1, 1));
    when(dates.isScenarioValue()).thenReturn(false);

    // Act
    MarketDataBox<ZonedDateTime> actualToZonedDateTimeResult = ofResult.toZonedDateTime(dates);

    // Assert
    verify(dates).getSingleValue();
    verify(dates).isScenarioValue();
    assertFalse(actualToZonedDateTimeResult.isScenarioValue());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link MarketDataBox} {@link MarketDataBox#getScenarioCount()} return one.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test toZonedDateTime(MarketDataBox); given one; when MarketDataBox getScenarioCount() return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ValuationZoneTimeDefinition.toZonedDateTime(MarketDataBox)"})
  void testToZonedDateTime_givenOne_whenMarketDataBoxGetScenarioCountReturnOne() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    MarketDataBox<LocalDate> dates = mock(MarketDataBox.class);
    when(dates.getValue(anyInt())).thenReturn(LocalDate.of(1970, 1, 1));
    when(dates.getScenarioCount()).thenReturn(1);
    when(dates.isScenarioValue()).thenReturn(true);

    // Act
    MarketDataBox<ZonedDateTime> actualToZonedDateTimeResult = ofResult.toZonedDateTime(dates);

    // Assert
    verify(dates).getScenarioCount();
    verify(dates).getValue(0);
    verify(dates).isScenarioValue();
    assertTrue(actualToZonedDateTimeResult.isScenarioValue());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}.
   *
   * <ul>
   *   <li>Given three.
   *   <li>Then calls {@link MarketDataBox#getValue(int)}.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}
   */
  @Test
  @DisplayName("Test toZonedDateTime(MarketDataBox); given three; then calls getValue(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ValuationZoneTimeDefinition.toZonedDateTime(MarketDataBox)"})
  void testToZonedDateTime_givenThree_thenCallsGetValue() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    MarketDataBox<LocalDate> dates = mock(MarketDataBox.class);
    when(dates.getValue(anyInt())).thenReturn(LocalDate.of(1970, 1, 1));
    when(dates.getScenarioCount()).thenReturn(3);
    when(dates.isScenarioValue()).thenReturn(true);

    // Act
    MarketDataBox<ZonedDateTime> actualToZonedDateTimeResult = ofResult.toZonedDateTime(dates);

    // Assert
    verify(dates).getScenarioCount();
    verify(dates, atLeast(1)).getValue(anyInt());
    verify(dates).isScenarioValue();
    assertTrue(actualToZonedDateTimeResult.isScenarioValue());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link MarketDataBox} {@link MarketDataBox#getScenarioCount()} return zero.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#toZonedDateTime(MarketDataBox)}
   */
  @Test
  @DisplayName(
      "Test toZonedDateTime(MarketDataBox); given zero; when MarketDataBox getScenarioCount() return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ValuationZoneTimeDefinition.toZonedDateTime(MarketDataBox)"})
  void testToZonedDateTime_givenZero_whenMarketDataBoxGetScenarioCountReturnZero() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    MarketDataBox<LocalDate> dates = mock(MarketDataBox.class);
    when(dates.getScenarioCount()).thenReturn(0);
    when(dates.isScenarioValue()).thenReturn(true);

    // Act
    MarketDataBox<ZonedDateTime> actualToZonedDateTimeResult = ofResult.toZonedDateTime(dates);

    // Assert
    verify(dates).getScenarioCount();
    verify(dates).isScenarioValue();
    assertTrue(actualToZonedDateTimeResult.isScenarioValue());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#meta()}.
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValuationZoneTimeDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ValuationZoneTimeDefinition.meta();

    // Assert
    MetaProperty<LocalTime> defaultLocalTimeResult = actualMetaResult.defaultLocalTime();
    assertTrue(defaultLocalTimeResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<LocalTime>> localTimesResult = actualMetaResult.localTimes();
    assertTrue(localTimesResult instanceof DirectMetaProperty);
    MetaProperty<ZoneId> zoneIdResult = actualMetaResult.zoneId();
    assertTrue(zoneIdResult instanceof DirectMetaProperty);
    assertEquals("defaultLocalTime", defaultLocalTimeResult.name());
    assertEquals("localTimes", localTimesResult.name());
    assertEquals("zoneId", zoneIdResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, defaultLocalTimeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, localTimesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, zoneIdResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, localTimesResult.propertyType());
    Class<ValuationZoneTimeDefinition> expectedDeclaringTypeResult =
        ValuationZoneTimeDefinition.class;
    assertEquals(expectedDeclaringTypeResult, defaultLocalTimeResult.declaringType());
    Class<ValuationZoneTimeDefinition> expectedDeclaringTypeResult2 =
        ValuationZoneTimeDefinition.class;
    assertEquals(expectedDeclaringTypeResult2, localTimesResult.declaringType());
    Class<ValuationZoneTimeDefinition> expectedDeclaringTypeResult3 =
        ValuationZoneTimeDefinition.class;
    assertEquals(expectedDeclaringTypeResult3, zoneIdResult.declaringType());
    Class<LocalTime> expectedPropertyTypeResult2 = LocalTime.class;
    assertEquals(expectedPropertyTypeResult2, defaultLocalTimeResult.propertyType());
    Class<ZoneId> expectedPropertyTypeResult3 = ZoneId.class;
    assertEquals(expectedPropertyTypeResult3, zoneIdResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, defaultLocalTimeResult.metaBean());
    assertSame(meta, localTimesResult.metaBean());
    assertSame(meta, zoneIdResult.metaBean());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#metaBean()}.
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValuationZoneTimeDefinition.metaBean()"})
  void testMetaBean() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValuationZoneTimeDefinition#toString()}
   *   <li>{@link ValuationZoneTimeDefinition#getDefaultLocalTime()}
   *   <li>{@link ValuationZoneTimeDefinition#getLocalTimes()}
   *   <li>{@link ValuationZoneTimeDefinition#getZoneId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LocalTime ValuationZoneTimeDefinition.getDefaultLocalTime()",
    "ImmutableList ValuationZoneTimeDefinition.getLocalTimes()",
    "ZoneId ValuationZoneTimeDefinition.getZoneId()",
    "String ValuationZoneTimeDefinition.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ZoneOffset zoneId = ZoneOffset.ofTotalSeconds(1);
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(LocalTime.MIDNIGHT, zoneId, LocalTime.MIDNIGHT);

    // Act
    String actualToStringResult = ofResult.toString();
    LocalTime actualDefaultLocalTime = ofResult.getDefaultLocalTime();
    ImmutableList<LocalTime> actualLocalTimes = ofResult.getLocalTimes();
    ZoneId actualZoneId = ofResult.getZoneId();

    // Assert
    assertEquals("+00:00:01", actualZoneId.toString());
    assertEquals("00:00", actualDefaultLocalTime.toString());
    assertEquals(
        "ValuationZoneTimeDefinition{defaultLocalTime=00:00, zoneId=+00:00:01, localTimes=[00:00]}",
        actualToStringResult);
    assertEquals(1, actualLocalTimes.size());
    assertSame(zoneId, actualZoneId);
    LocalTime localTime = LocalTime.MIN;
    assertSame(localTime, actualDefaultLocalTime);
    assertSame(localTime, actualLocalTimes.get(0));
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}, and {@link
   * ValuationZoneTimeDefinition#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValuationZoneTimeDefinition#equals(Object)}
   *   <li>{@link ValuationZoneTimeDefinition#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);
    ValuationZoneTimeDefinition ofResult2 =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}, and {@link
   * ValuationZoneTimeDefinition#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValuationZoneTimeDefinition#equals(Object)}
   *   <li>{@link ValuationZoneTimeDefinition#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT),
        1);
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.now(), ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT);

    // Act and Assert
    assertNotEquals(
        ofResult,
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT));
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(0), LocalTime.MIDNIGHT);

    // Act and Assert
    assertNotEquals(
        ofResult,
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT));
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ValuationZoneTimeDefinition ofResult =
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.now());

    // Act and Assert
    assertNotEquals(
        ofResult,
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT));
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT),
        null);
  }

  /**
   * Test {@link ValuationZoneTimeDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValuationZoneTimeDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ValuationZoneTimeDefinition.equals(Object)",
    "int ValuationZoneTimeDefinition.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ValuationZoneTimeDefinition.of(
            LocalTime.MIDNIGHT, ZoneOffset.ofTotalSeconds(1), LocalTime.MIDNIGHT),
        "Different type to ValuationZoneTimeDefinition");
  }
}
