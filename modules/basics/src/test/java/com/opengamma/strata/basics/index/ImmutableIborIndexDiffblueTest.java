package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DayCounts;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.date.HolidayCalendarIds;
import com.opengamma.strata.basics.date.PeriodAdditionConventions;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.date.TenorAdjustment;
import com.opengamma.strata.basics.index.ImmutableIborIndex.Builder;
import com.opengamma.strata.basics.index.ImmutableIborIndex.Meta;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableIborIndexDiffblueTest {
  /**
   * Test Builder {@link Builder#currency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#currency(Currency)}
   */
  @Test
  @DisplayName("Test Builder currency(Currency); when AED; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.currency(Currency)"})
  void testBuilderCurrency_whenAed_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualCurrencyResult = builderResult.currency(Currency.AED);

    // Assert
    assertSame(builderResult, actualCurrencyResult);
  }

  /**
   * Test Builder {@link Builder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCounts#ACT_360}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test Builder dayCount(DayCount); when ACT_360; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dayCount(DayCount)"})
  void testBuilderDayCount_whenAct_360_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(DayCounts.ACT_360);

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#defaultFixedLegDayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCounts#ACT_360}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#defaultFixedLegDayCount(DayCount)}
   */
  @Test
  @DisplayName("Test Builder defaultFixedLegDayCount(DayCount); when ACT_360; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.defaultFixedLegDayCount(DayCount)"})
  void testBuilderDefaultFixedLegDayCount_whenAct_360_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualDefaultFixedLegDayCountResult =
        builderResult.defaultFixedLegDayCount(DayCounts.ACT_360);

    // Assert
    assertSame(builderResult, actualDefaultFixedLegDayCountResult);
  }

  /**
   * Test Builder {@link Builder#effectiveDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#effectiveDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder effectiveDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.effectiveDateOffset(DaysAdjustment)"})
  void testBuilderEffectiveDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualEffectiveDateOffsetResult =
        builderResult.effectiveDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualEffectiveDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#fixingCalendar(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingCalendar(HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test Builder fixingCalendar(HolidayCalendarId); when AUSY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingCalendar(HolidayCalendarId)"})
  void testBuilderFixingCalendar_whenAusy_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualFixingCalendarResult = builderResult.fixingCalendar(HolidayCalendarIds.AUSY);

    // Assert
    assertSame(builderResult, actualFixingCalendarResult);
  }

  /**
   * Test Builder {@link Builder#fixingDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder fixingDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingDateOffset(DaysAdjustment)"})
  void testBuilderFixingDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualFixingDateOffsetResult = builderResult.fixingDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualFixingDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#fixingTime(LocalTime)}.
   *
   * <ul>
   *   <li>When {@link LocalTime#MIDNIGHT}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingTime(LocalTime)}
   */
  @Test
  @DisplayName("Test Builder fixingTime(LocalTime); when MIDNIGHT; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingTime(LocalTime)"})
  void testBuilderFixingTime_whenMidnight_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualFixingTimeResult = builderResult.fixingTime(LocalTime.MIDNIGHT);

    // Assert
    assertSame(builderResult, actualFixingTimeResult);
  }

  /**
   * Test Builder {@link Builder#fixingZone(ZoneId)}.
   *
   * <ul>
   *   <li>When ofTotalSeconds one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingZone(ZoneId)}
   */
  @Test
  @DisplayName("Test Builder fixingZone(ZoneId); when ofTotalSeconds one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingZone(ZoneId)"})
  void testBuilderFixingZone_whenOfTotalSecondsOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualFixingZoneResult = builderResult.fixingZone(ZoneOffset.ofTotalSeconds(1));

    // Assert
    assertSame(builderResult, actualFixingZoneResult);
  }

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
    assertNull(ImmutableIborIndex.builder().get("currency"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'dayCount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDayCount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableIborIndex.builder().get("dayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code defaultFixedLegDayCount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'defaultFixedLegDayCount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDefaultFixedLegDayCount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableIborIndex.builder().get("defaultFixedLegDayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code effectiveDateOffset}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'effectiveDateOffset'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenEffectiveDateOffset_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableIborIndex.builder().get("effectiveDateOffset"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingCalendar}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingCalendar'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingCalendar_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableIborIndex.builder().get("fixingCalendar"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingDateOffset'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingDateOffset_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableIborIndex.builder().get("fixingDateOffset"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingTime}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingTime'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingTime_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableIborIndex.builder().get("fixingTime"));
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
        NoSuchElementException.class, () -> ImmutableIborIndex.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#maturityDateOffset(TenorAdjustment)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#maturityDateOffset(TenorAdjustment)}
   */
  @Test
  @DisplayName("Test Builder maturityDateOffset(TenorAdjustment); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.maturityDateOffset(TenorAdjustment)"})
  void testBuilderMaturityDateOffset_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();
    TenorAdjustment maturityDateOffset =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);

    // Act
    Builder actualMaturityDateOffsetResult = builderResult.maturityDateOffset(maturityDateOffset);

    // Assert
    assertSame(builderResult, actualMaturityDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#name(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(String)}
   */
  @Test
  @DisplayName("Test Builder name(String); when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(String)"})
  void testBuilderName_whenName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

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
        () -> ImmutableIborIndex.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'currency'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCurrency_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualSetResult = builderResult.set("currency", Currency.AED);

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
    Builder builderResult = ImmutableIborIndex.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Class<? extends ImmutableIborIndex> actualBeanTypeResult = ImmutableIborIndex.meta().beanType();

    // Assert
    Class<ImmutableIborIndex> expectedBeanTypeResult = ImmutableIborIndex.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#active()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#defaultFixedLegDayCount()}
   *   <li>{@link Meta#effectiveDateOffset()}
   *   <li>{@link Meta#fixingCalendar()}
   *   <li>{@link Meta#fixingDateOffset()}
   *   <li>{@link Meta#fixingTime()}
   *   <li>{@link Meta#fixingZone()}
   *   <li>{@link Meta#maturityDateOffset()}
   *   <li>{@link Meta#name()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.active()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.defaultFixedLegDayCount()",
    "MetaProperty Meta.effectiveDateOffset()",
    "MetaProperty Meta.fixingCalendar()",
    "MetaProperty Meta.fixingDateOffset()",
    "MetaProperty Meta.fixingTime()",
    "MetaProperty Meta.fixingZone()",
    "MetaProperty Meta.maturityDateOffset()",
    "MetaProperty Meta.name()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableIborIndex.meta();

    // Act
    MetaProperty<Boolean> actualActiveResult = metaResult.active();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<DayCount> actualDefaultFixedLegDayCountResult =
        metaResult.defaultFixedLegDayCount();
    MetaProperty<DaysAdjustment> actualEffectiveDateOffsetResult = metaResult.effectiveDateOffset();
    MetaProperty<HolidayCalendarId> actualFixingCalendarResult = metaResult.fixingCalendar();
    MetaProperty<DaysAdjustment> actualFixingDateOffsetResult = metaResult.fixingDateOffset();
    MetaProperty<LocalTime> actualFixingTimeResult = metaResult.fixingTime();
    MetaProperty<ZoneId> actualFixingZoneResult = metaResult.fixingZone();
    MetaProperty<TenorAdjustment> actualMaturityDateOffsetResult = metaResult.maturityDateOffset();

    // Assert
    assertTrue(actualActiveResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualDefaultFixedLegDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualEffectiveDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualFixingCalendarResult instanceof DirectMetaProperty);
    assertTrue(actualFixingDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualFixingTimeResult instanceof DirectMetaProperty);
    assertTrue(actualFixingZoneResult instanceof DirectMetaProperty);
    assertTrue(actualMaturityDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(metaResult.name() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code defaultFixedLegDayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'defaultFixedLegDayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsDefaultFixedLegDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("defaultFixedLegDayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("defaultFixedLegDayCount", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).defaultFixedLegDayCount());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code effectiveDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'effectiveDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsEffectiveDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("effectiveDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("effectiveDateOffset", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).effectiveDateOffset());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then return name is {@code active}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'active'; then return name is 'active'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenActive_thenReturnNameIsActive() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("active");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("active", actualMetaPropertyGetResult.name());
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).active());
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
        ImmutableIborIndex.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return name is {@code dayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'dayCount'; then return name is 'dayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCount_thenReturnNameIsDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingCalendar}.
   *   <li>Then return name is {@code fixingCalendar}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingCalendar'; then return name is 'fixingCalendar'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingCalendar_thenReturnNameIsFixingCalendar() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("fixingCalendar");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingCalendar", actualMetaPropertyGetResult.name());
    Class<HolidayCalendarId> expectedPropertyTypeResult = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingCalendar());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return name is {@code fixingDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingDateOffset'; then return name is 'fixingDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingDateOffset_thenReturnNameIsFixingDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("fixingDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingDateOffset", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDateOffset());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingTime}.
   *   <li>Then return name is {@code fixingTime}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingTime'; then return name is 'fixingTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingTime_thenReturnNameIsFixingTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("fixingTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingZone() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingTime", actualMetaPropertyGetResult.name());
    Class<LocalTime> expectedPropertyTypeResult = LocalTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingTime());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingZone}.
   *   <li>Then return name is {@code fixingZone}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingZone'; then return name is 'fixingZone'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingZone_thenReturnNameIsFixingZone() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableIborIndex.meta().metaPropertyGet("fixingZone");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingTime() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingZone", actualMetaPropertyGetResult.name());
    Class<ZoneId> expectedPropertyTypeResult = ZoneId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingZone());
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
    assertNull(ImmutableIborIndex.meta().metaPropertyGet("Property Name"));
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
        ImmutableIborIndex.meta().metaPropertyMap();

    // Assert
    assertEquals(11, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("active") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("defaultFixedLegDayCount") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("effectiveDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingCalendar") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingTime") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingZone") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("maturityDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
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
    assertNull(ImmutableIborIndex.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ImmutableIborIndex.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'active'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenActive_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ImmutableIborIndex.meta().propertySet(mock(Bean.class), "active", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'active'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenActive_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            ImmutableIborIndex.meta().propertySet(mock(Bean.class), "active", "New Value", false));
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
            ImmutableIborIndex.meta().propertySet(mock(Bean.class), "currency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableIborIndex.meta().propertySet(mock(Bean.class), "dayCount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code defaultFixedLegDayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'defaultFixedLegDayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDefaultFixedLegDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableIborIndex.meta()
                .propertySet(mock(Bean.class), "defaultFixedLegDayCount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code effectiveDateOffset}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'effectiveDateOffset'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEffectiveDateOffset_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableIborIndex.meta()
                .propertySet(mock(Bean.class), "effectiveDateOffset", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingCalendar}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingCalendar'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingCalendar_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableIborIndex.meta()
                .propertySet(mock(Bean.class), "fixingCalendar", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingDateOffset'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingDateOffset_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            ImmutableIborIndex.meta()
                .propertySet(mock(Bean.class), "fixingDateOffset", "New Value", false));
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
            ImmutableIborIndex.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
