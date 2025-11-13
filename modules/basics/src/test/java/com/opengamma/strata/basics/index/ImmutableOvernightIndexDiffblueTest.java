package com.opengamma.strata.basics.index;

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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DayCounts;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.basics.date.HolidayCalendarIds;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.index.ImmutableOvernightIndex.Builder;
import com.opengamma.strata.basics.index.ImmutableOvernightIndex.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableOvernightIndexDiffblueTest {
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
    Builder builderResult = ImmutableOvernightIndex.builder();

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
    Builder builderResult = ImmutableOvernightIndex.builder();

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
    Builder builderResult = ImmutableOvernightIndex.builder();

    // Act
    Builder actualDefaultFixedLegDayCountResult =
        builderResult.defaultFixedLegDayCount(DayCounts.ACT_360);

    // Assert
    assertSame(builderResult, actualDefaultFixedLegDayCountResult);
  }

  /**
   * Test Builder {@link Builder#effectiveDateOffset(int)}.
   *
   * <p>Method under test: {@link Builder#effectiveDateOffset(int)}
   */
  @Test
  @DisplayName("Test Builder effectiveDateOffset(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.effectiveDateOffset(int)"})
  void testBuilderEffectiveDateOffset() {
    // Arrange
    Builder builderResult = ImmutableOvernightIndex.builder();

    // Act
    Builder actualEffectiveDateOffsetResult = builderResult.effectiveDateOffset(1);

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
    Builder builderResult = ImmutableOvernightIndex.builder();

    // Act
    Builder actualFixingCalendarResult = builderResult.fixingCalendar(HolidayCalendarIds.AUSY);

    // Assert
    assertSame(builderResult, actualFixingCalendarResult);
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
    assertNull(ImmutableOvernightIndex.builder().get("currency"));
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
    assertNull(ImmutableOvernightIndex.builder().get("dayCount"));
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
    assertNull(ImmutableOvernightIndex.builder().get("defaultFixedLegDayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code effectiveDateOffset}.
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'effectiveDateOffset'; then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenEffectiveDateOffset_thenReturnIntValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0, ((Integer) ImmutableOvernightIndex.builder().get("effectiveDateOffset")).intValue());
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
    assertNull(ImmutableOvernightIndex.builder().get("fixingCalendar"));
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
    assertNull(ImmutableOvernightIndex.builder().get("name"));
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
        NoSuchElementException.class, () -> ImmutableOvernightIndex.builder().get("Property Name"));
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
    Builder builderResult = ImmutableOvernightIndex.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#publicationDateOffset(int)}.
   *
   * <p>Method under test: {@link Builder#publicationDateOffset(int)}
   */
  @Test
  @DisplayName("Test Builder publicationDateOffset(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.publicationDateOffset(int)"})
  void testBuilderPublicationDateOffset() {
    // Arrange
    Builder builderResult = ImmutableOvernightIndex.builder();

    // Act
    Builder actualPublicationDateOffsetResult = builderResult.publicationDateOffset(1);

    // Assert
    assertSame(builderResult, actualPublicationDateOffsetResult);
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
        () -> ImmutableOvernightIndex.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ImmutableOvernightIndex.builder();

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
    Builder builderResult = ImmutableOvernightIndex.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link ImmutableOvernightIndex#equals(Object)}, and {@link
   * ImmutableOvernightIndex#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableOvernightIndex#equals(Object)}
   *   <li>{@link ImmutableOvernightIndex#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableOvernightIndex.equals(Object)",
    "int ImmutableOvernightIndex.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutableOvernightIndex immutableOvernightIndex =
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build();
    ImmutableOvernightIndex immutableOvernightIndex2 =
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build();

    // Act and Assert
    assertEquals(immutableOvernightIndex, immutableOvernightIndex2);
    assertEquals(immutableOvernightIndex.hashCode(), immutableOvernightIndex2.hashCode());
  }

  /**
   * Test {@link ImmutableOvernightIndex#equals(Object)}, and {@link
   * ImmutableOvernightIndex#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableOvernightIndex#equals(Object)}
   *   <li>{@link ImmutableOvernightIndex#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableOvernightIndex.equals(Object)",
    "int ImmutableOvernightIndex.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutableOvernightIndex immutableOvernightIndex =
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build();

    // Act and Assert
    assertEquals(immutableOvernightIndex, immutableOvernightIndex);
    int expectedHashCodeResult = immutableOvernightIndex.hashCode();
    assertEquals(expectedHashCodeResult, immutableOvernightIndex.hashCode());
  }

  /**
   * Test {@link ImmutableOvernightIndex#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableOvernightIndex#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableOvernightIndex.equals(Object)",
    "int ImmutableOvernightIndex.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ImmutableOvernightIndex immutableOvernightIndex =
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("com.opengamma.strata.basics.currency.Currency")
            .publicationDateOffset(1)
            .build();

    // Act and Assert
    assertNotEquals(
        immutableOvernightIndex,
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build());
  }

  /**
   * Test {@link ImmutableOvernightIndex#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableOvernightIndex#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableOvernightIndex.equals(Object)",
    "int ImmutableOvernightIndex.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build(),
        null);
  }

  /**
   * Test {@link ImmutableOvernightIndex#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableOvernightIndex#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableOvernightIndex.equals(Object)",
    "int ImmutableOvernightIndex.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build(),
        "Different type to ImmutableOvernightIndex");
  }

  /**
   * Test {@link ImmutableOvernightIndex#meta()}.
   *
   * <p>Method under test: {@link ImmutableOvernightIndex#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableOvernightIndex.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableOvernightIndex.meta();

    // Assert
    assertTrue(actualMetaResult.active() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.publicationDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ImmutableOvernightIndex#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableOvernightIndex#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableOvernightIndex.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build()
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableOvernightIndex#toString()}
   *   <li>{@link ImmutableOvernightIndex#getCurrency()}
   *   <li>{@link ImmutableOvernightIndex#getDayCount()}
   *   <li>{@link ImmutableOvernightIndex#getDefaultFixedLegDayCount()}
   *   <li>{@link ImmutableOvernightIndex#getEffectiveDateOffset()}
   *   <li>{@link ImmutableOvernightIndex#getFixingCalendar()}
   *   <li>{@link ImmutableOvernightIndex#getName()}
   *   <li>{@link ImmutableOvernightIndex#getPublicationDateOffset()}
   *   <li>{@link ImmutableOvernightIndex#getTenor()}
   *   <li>{@link ImmutableOvernightIndex#isActive()}
   *   <li>{@link ImmutableOvernightIndex#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Currency ImmutableOvernightIndex.getCurrency()",
    "DayCount ImmutableOvernightIndex.getDayCount()",
    "DayCount ImmutableOvernightIndex.getDefaultFixedLegDayCount()",
    "int ImmutableOvernightIndex.getEffectiveDateOffset()",
    "HolidayCalendarId ImmutableOvernightIndex.getFixingCalendar()",
    "String ImmutableOvernightIndex.getName()",
    "int ImmutableOvernightIndex.getPublicationDateOffset()",
    "Tenor ImmutableOvernightIndex.getTenor()",
    "boolean ImmutableOvernightIndex.isActive()",
    "Builder ImmutableOvernightIndex.toBuilder()",
    "String ImmutableOvernightIndex.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ImmutableOvernightIndex immutableOvernightIndex =
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build();

    // Act
    String actualToStringResult = immutableOvernightIndex.toString();
    Currency actualCurrency = immutableOvernightIndex.getCurrency();
    immutableOvernightIndex.getDayCount();
    immutableOvernightIndex.getDefaultFixedLegDayCount();
    int actualEffectiveDateOffset = immutableOvernightIndex.getEffectiveDateOffset();
    HolidayCalendarId actualFixingCalendar = immutableOvernightIndex.getFixingCalendar();
    String actualName = immutableOvernightIndex.getName();
    int actualPublicationDateOffset = immutableOvernightIndex.getPublicationDateOffset();
    Tenor actualTenor = immutableOvernightIndex.getTenor();
    boolean actualIsActiveResult = immutableOvernightIndex.isActive();
    immutableOvernightIndex.toBuilder();

    // Assert
    assertEquals("AUSY", actualFixingCalendar.getName());
    assertEquals("AUSY", actualFixingCalendar.toString());
    assertEquals("Name", actualName);
    assertEquals("Name", actualToStringResult);
    assertEquals(1, actualEffectiveDateOffset);
    assertEquals(1, actualPublicationDateOffset);
    assertTrue(actualIsActiveResult);
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualFixingCalendar.getReferenceDataType());
    assertSame(Currency.AED, actualCurrency);
    assertSame(Tenor.TENOR_1D, actualTenor);
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
    Class<? extends ImmutableOvernightIndex> actualBeanTypeResult =
        ImmutableOvernightIndex.meta().beanType();

    // Assert
    Class<ImmutableOvernightIndex> expectedBeanTypeResult = ImmutableOvernightIndex.class;
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
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#publicationDateOffset()}
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
    "MetaProperty Meta.name()",
    "MetaProperty Meta.publicationDateOffset()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableOvernightIndex.meta();

    // Act
    MetaProperty<Boolean> actualActiveResult = metaResult.active();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<DayCount> actualDefaultFixedLegDayCountResult =
        metaResult.defaultFixedLegDayCount();
    MetaProperty<Integer> actualEffectiveDateOffsetResult = metaResult.effectiveDateOffset();
    MetaProperty<HolidayCalendarId> actualFixingCalendarResult = metaResult.fixingCalendar();
    MetaProperty<String> actualNameResult = metaResult.name();

    // Assert
    assertTrue(actualActiveResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualDefaultFixedLegDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualEffectiveDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualFixingCalendarResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.publicationDateOffset() instanceof DirectMetaProperty);
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
        ImmutableOvernightIndex.meta().metaPropertyGet("defaultFixedLegDayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDateOffset() instanceof DirectMetaProperty);
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
        ImmutableOvernightIndex.meta().metaPropertyGet("effectiveDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDateOffset() instanceof DirectMetaProperty);
    assertEquals("effectiveDateOffset", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).effectiveDateOffset());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code publicationDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'publicationDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsPublicationDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableOvernightIndex.meta().metaPropertyGet("publicationDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertEquals("publicationDateOffset", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).publicationDateOffset());
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
        ImmutableOvernightIndex.meta().metaPropertyGet("active");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDateOffset() instanceof DirectMetaProperty);
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
        ImmutableOvernightIndex.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDateOffset() instanceof DirectMetaProperty);
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
        ImmutableOvernightIndex.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDateOffset() instanceof DirectMetaProperty);
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
        ImmutableOvernightIndex.meta().metaPropertyGet("fixingCalendar");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDateOffset() instanceof DirectMetaProperty);
    assertEquals("fixingCalendar", actualMetaPropertyGetResult.name());
    Class<HolidayCalendarId> expectedPropertyTypeResult = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingCalendar());
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
        ImmutableOvernightIndex.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).active() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).currency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).defaultFixedLegDayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).effectiveDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingCalendar() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).publicationDateOffset() instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
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
    assertNull(ImmutableOvernightIndex.meta().metaPropertyGet("Property Name"));
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
        ImmutableOvernightIndex.meta().metaPropertyMap();

    // Assert
    assertEquals(8, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("active") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("defaultFixedLegDayCount") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("effectiveDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingCalendar") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("publicationDateOffset") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = ImmutableOvernightIndex.meta();
    ImmutableOvernightIndex bean =
        ImmutableOvernightIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .dayCount(DayCounts.ACT_360)
            .defaultFixedLegDayCount(DayCounts.ACT_360)
            .effectiveDateOffset(1)
            .fixingCalendar(HolidayCalendarIds.AUSY)
            .name("Name")
            .publicationDateOffset(1)
            .build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "currency", true);

    // Assert
    Currency currency = ((Currency) actualPropertyGetResult).AED;
    assertSame(currency, bean.getCurrency());
    assertSame(currency, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnFalse() {
    // Arrange
    Meta metaResult = ImmutableOvernightIndex.meta();

    // Act and Assert
    assertFalse(
        (Boolean)
            metaResult.propertyGet(
                ImmutableOvernightIndex.builder()
                    .active(false)
                    .currency(Currency.AED)
                    .dayCount(DayCounts.ACT_360)
                    .defaultFixedLegDayCount(DayCounts.ACT_360)
                    .effectiveDateOffset(1)
                    .fixingCalendar(HolidayCalendarIds.AUSY)
                    .name("Name")
                    .publicationDateOffset(1)
                    .build(),
                "active",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'active'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenActive_thenReturnTrue() {
    // Arrange
    Meta metaResult = ImmutableOvernightIndex.meta();

    // Act and Assert
    assertTrue(
        (Boolean)
            metaResult.propertyGet(
                ImmutableOvernightIndex.builder()
                    .active(true)
                    .currency(Currency.AED)
                    .dayCount(DayCounts.ACT_360)
                    .defaultFixedLegDayCount(DayCounts.ACT_360)
                    .effectiveDateOffset(1)
                    .fixingCalendar(HolidayCalendarIds.AUSY)
                    .name("Name")
                    .publicationDateOffset(1)
                    .build(),
                "active",
                true));
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
    assertNull(ImmutableOvernightIndex.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDayCount_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = ImmutableOvernightIndex.meta();

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                ImmutableOvernightIndex.builder()
                    .active(true)
                    .currency(Currency.AED)
                    .dayCount(DayCounts.ACT_360)
                    .defaultFixedLegDayCount(DayCounts.ACT_360)
                    .effectiveDateOffset(1)
                    .fixingCalendar(HolidayCalendarIds.AUSY)
                    .name("Name")
                    .publicationDateOffset(1)
                    .build(),
                "dayCount",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code defaultFixedLegDayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'defaultFixedLegDayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDefaultFixedLegDayCount_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = ImmutableOvernightIndex.meta();

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                ImmutableOvernightIndex.builder()
                    .active(true)
                    .currency(Currency.AED)
                    .dayCount(DayCounts.ACT_360)
                    .defaultFixedLegDayCount(DayCounts.ACT_360)
                    .effectiveDateOffset(1)
                    .fixingCalendar(HolidayCalendarIds.AUSY)
                    .name("Name")
                    .publicationDateOffset(1)
                    .build(),
                "defaultFixedLegDayCount",
                true));
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
        () -> ImmutableOvernightIndex.meta().propertyGet(null, "Property Name", false));
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
        () ->
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "active", "New Value", true));
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
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
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
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
            ImmutableOvernightIndex.meta()
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
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "effectiveDateOffset", "New Value", true));
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
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "active", "New Value", false));
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
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "fixingCalendar", "New Value", true));
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
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "name", "New Value", true));
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
            ImmutableOvernightIndex.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
