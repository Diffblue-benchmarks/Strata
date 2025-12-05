package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.date.DaysAdjustment.Builder;
import com.opengamma.strata.basics.date.DaysAdjustment.Meta;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.SortedSet;
import java.util.TreeSet;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DaysAdjustmentDiffblueTest {
  /**
   * Test Builder {@link Builder#adjustment(BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link BusinessDayAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#adjustment(BusinessDayAdjustment)}
   */
  @Test
  @DisplayName("Test Builder adjustment(BusinessDayAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.adjustment(BusinessDayAdjustment)"})
  void testBuilderAdjustment_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act
    Builder actualAdjustmentResult = builderResult.adjustment(BusinessDayAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualAdjustmentResult);
  }

  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange
    HolidayCalendarId calendar = HolidayCalendarIds.AUSY;

    // Act
    DaysAdjustment actualDaysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(calendar)
            .days(1)
            .build();

    // Assert
    assertEquals(1, actualDaysAdjustment.getDays());
    assertSame(BusinessDayAdjustment.NONE, actualDaysAdjustment.getAdjustment());
    assertSame(calendar, actualDaysAdjustment.getCalendar());
    assertSame(calendar, actualDaysAdjustment.getResultCalendar());
  }

  /**
   * Test Builder {@link Builder#calendar(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#calendar(HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test Builder calendar(HolidayCalendarId); when AUSY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.calendar(HolidayCalendarId)"})
  void testBuilderCalendar_whenAusy_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act
    Builder actualCalendarResult = builderResult.calendar(HolidayCalendarIds.AUSY);

    // Assert
    assertSame(builderResult, actualCalendarResult);
  }

  /**
   * Test Builder {@link Builder#days(int)}.
   *
   * <p>Method under test: {@link Builder#days(int)}
   */
  @Test
  @DisplayName("Test Builder days(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.days(int)"})
  void testBuilderDays() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act
    Builder actualDaysResult = builderResult.days(1);

    // Assert
    assertSame(builderResult, actualDaysResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'adjustment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAdjustment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DaysAdjustment.builder().get("adjustment"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code calendar}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'calendar'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCalendar_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DaysAdjustment.builder().get("calendar"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code days}.
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'days'; then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDays_thenReturnIntValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0, ((Integer) DaysAdjustment.builder().get("days")).intValue());
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
    assertThrows(NoSuchElementException.class, () -> DaysAdjustment.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Given builder days {@code -178324674}.
   *   <li>When {@code calendar}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; given builder days '-178324674'; when 'calendar'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_givenBuilderDays178324674_whenCalendar() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    builderResult.days(-178324674);

    // Act
    Builder actualSetResult = builderResult.set("calendar", HolidayCalendarIds.AUSY);

    // Assert
    assertSame(builderResult, actualSetResult);
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
        () -> DaysAdjustment.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'adjustment'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenAdjustment_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act
    Builder actualSetResult = builderResult.set("adjustment", BusinessDayAdjustment.NONE);

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
    Builder builderResult = DaysAdjustment.builder();

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
    Class<? extends DaysAdjustment> actualBeanTypeResult = DaysAdjustment.meta().beanType();

    // Assert
    Class<DaysAdjustment> expectedBeanTypeResult = DaysAdjustment.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#adjustment()}
   *   <li>{@link Meta#calendar()}
   *   <li>{@link Meta#days()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.adjustment()",
    "MetaProperty Meta.calendar()",
    "MetaProperty Meta.days()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DaysAdjustment.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualAdjustmentResult = metaResult.adjustment();
    MetaProperty<HolidayCalendarId> actualCalendarResult = metaResult.calendar();

    // Assert
    assertTrue(actualAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualCalendarResult instanceof DirectMetaProperty);
    assertTrue(metaResult.days() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then return name is {@code adjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'adjustment'; then return name is 'adjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAdjustment_thenReturnNameIsAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DaysAdjustment.meta().metaPropertyGet("adjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendarId> calendarResult = ((Meta) metaBeanResult).calendar();
    assertTrue(calendarResult instanceof DirectMetaProperty);
    MetaProperty<Integer> daysResult = ((Meta) metaBeanResult).days();
    assertTrue(daysResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("adjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).adjustment());
    assertSame(metaBeanResult, calendarResult.metaBean());
    assertSame(metaBeanResult, daysResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code calendar}.
   *   <li>Then return name is {@code calendar}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'calendar'; then return name is 'calendar'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCalendar_thenReturnNameIsCalendar() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = DaysAdjustment.meta().metaPropertyGet("calendar");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<Integer> daysResult = ((Meta) metaBeanResult).days();
    assertTrue(daysResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("calendar", actualMetaPropertyGetResult.name());
    Class<HolidayCalendarId> expectedPropertyTypeResult = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).calendar());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
    assertSame(metaBeanResult, daysResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code days}.
   *   <li>Then return name is {@code days}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'days'; then return name is 'days'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDays_thenReturnNameIsDays() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = DaysAdjustment.meta().metaPropertyGet("days");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<HolidayCalendarId> calendarResult = ((Meta) metaBeanResult).calendar();
    assertTrue(calendarResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("days", actualMetaPropertyGetResult.name());
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).days());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
    assertSame(metaBeanResult, calendarResult.metaBean());
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
    assertNull(DaysAdjustment.meta().metaPropertyGet("Property Name"));
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
        DaysAdjustment.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("days");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("adjustment");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("calendar");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("adjustment", getResult2.name());
    assertEquals("calendar", getResult3.name());
    assertEquals("days", getResult.name());
    assertEquals("int", getResult.propertyType().getName());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<DaysAdjustment> expectedDeclaringTypeResult = DaysAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<DaysAdjustment> expectedDeclaringTypeResult2 = DaysAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<DaysAdjustment> expectedDeclaringTypeResult3 = DaysAdjustment.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<HolidayCalendarId> expectedPropertyTypeResult2 = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then {@link DaysAdjustment#NONE} Adjustment is {@link BusinessDayAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'adjustment'; then NONE Adjustment is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAdjustment_thenNoneAdjustmentIsNone() {
    // Arrange
    DaysAdjustment bean = DaysAdjustment.NONE;

    // Act
    Object actualPropertyGetResult = DaysAdjustment.meta().propertyGet(bean, "adjustment", true);

    // Assert
    BusinessDayAdjustment businessDayAdjustment =
        ((BusinessDayAdjustment) actualPropertyGetResult).NONE;
    assertSame(businessDayAdjustment, bean.getAdjustment());
    assertSame(businessDayAdjustment, actualPropertyGetResult);
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
    assertNull(DaysAdjustment.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code calendar}.
   *   <li>Then return {@link HolidayCalendarId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'calendar'; then return HolidayCalendarId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCalendar_thenReturnHolidayCalendarId() {
    // Arrange and Act
    Object actualPropertyGetResult =
        DaysAdjustment.meta().propertyGet(DaysAdjustment.NONE, "calendar", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof HolidayCalendarId);
    assertEquals("NoHolidays", ((HolidayCalendarId) actualPropertyGetResult).getName());
    assertEquals("NoHolidays", actualPropertyGetResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType,
        ((HolidayCalendarId) actualPropertyGetResult).getReferenceDataType());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code days}.
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'days'; then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDays_thenReturnIntValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        ((Integer) DaysAdjustment.meta().propertyGet(DaysAdjustment.NONE, "days", true))
            .intValue());
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
        () -> DaysAdjustment.meta().propertyGet(DaysAdjustment.NONE, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'adjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DaysAdjustment.meta().propertySet(mock(Bean.class), "adjustment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code calendar}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'calendar'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCalendar_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DaysAdjustment.meta().propertySet(mock(Bean.class), "calendar", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code days}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'days'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDays_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DaysAdjustment.meta().propertySet(mock(Bean.class), "days", "New Value", true));
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
            DaysAdjustment.meta().propertySet(mock(Bean.class), "adjustment", "New Value", false));
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
            DaysAdjustment.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link DaysAdjustment#ofCalendarDays(int)} with {@code numberOfDays}.
   *
   * <p>Method under test: {@link DaysAdjustment#ofCalendarDays(int)}
   */
  @Test
  @DisplayName("Test ofCalendarDays(int) with 'numberOfDays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.ofCalendarDays(int)"})
  void testOfCalendarDaysWithNumberOfDays() {
    // Arrange and Act
    DaysAdjustment actualOfCalendarDaysResult = DaysAdjustment.ofCalendarDays(10);

    // Assert
    HolidayCalendarId calendar = actualOfCalendarDaysResult.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(10, actualOfCalendarDaysResult.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, actualOfCalendarDaysResult.getAdjustment().getCalendar());
    assertSame(calendar, actualOfCalendarDaysResult.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#ofCalendarDays(int, BusinessDayAdjustment)} with {@code
   * numberOfDays}, {@code adjustment}.
   *
   * <ul>
   *   <li>Then return Calendar Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#ofCalendarDays(int, BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test ofCalendarDays(int, BusinessDayAdjustment) with 'numberOfDays', 'adjustment'; then return Calendar Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.ofCalendarDays(int, BusinessDayAdjustment)"})
  void testOfCalendarDaysWithNumberOfDaysAdjustment_thenReturnCalendarNameIsNoHolidays() {
    // Arrange and Act
    DaysAdjustment actualOfCalendarDaysResult =
        DaysAdjustment.ofCalendarDays(10, BusinessDayAdjustment.NONE);

    // Assert
    HolidayCalendarId calendar = actualOfCalendarDaysResult.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(10, actualOfCalendarDaysResult.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    BusinessDayAdjustment adjustment = actualOfCalendarDaysResult.getAdjustment();
    assertSame(calendar, adjustment.getCalendar());
    assertSame(calendar, actualOfCalendarDaysResult.getResultCalendar());
    assertSame(BusinessDayAdjustment.NONE, adjustment);
  }

  /**
   * Test {@link DaysAdjustment#ofBusinessDays(int, HolidayCalendarId)} with {@code numberOfDays},
   * {@code holidayCalendar}.
   *
   * <p>Method under test: {@link DaysAdjustment#ofBusinessDays(int, HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test ofBusinessDays(int, HolidayCalendarId) with 'numberOfDays', 'holidayCalendar'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.ofBusinessDays(int, HolidayCalendarId)"})
  void testOfBusinessDaysWithNumberOfDaysHolidayCalendar() {
    // Arrange
    HolidayCalendarId holidayCalendar = HolidayCalendarIds.AUSY;

    // Act
    DaysAdjustment actualOfBusinessDaysResult = DaysAdjustment.ofBusinessDays(10, holidayCalendar);

    // Assert
    HolidayCalendarId calendar = actualOfBusinessDaysResult.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(10, actualOfBusinessDaysResult.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    HolidayCalendarId calendar2 = actualOfBusinessDaysResult.getCalendar();
    assertSame(calendar2, actualOfBusinessDaysResult.getResultCalendar());
    assertSame(holidayCalendar, calendar2);
  }

  /**
   * Test {@link DaysAdjustment#ofBusinessDays(int, HolidayCalendarId)} with {@code numberOfDays},
   * {@code holidayCalendar}.
   *
   * <p>Method under test: {@link DaysAdjustment#ofBusinessDays(int, HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test ofBusinessDays(int, HolidayCalendarId) with 'numberOfDays', 'holidayCalendar'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.ofBusinessDays(int, HolidayCalendarId)"})
  void testOfBusinessDaysWithNumberOfDaysHolidayCalendar2() {
    // Arrange
    HolidayCalendarId holidayCalendar = HolidayCalendarIds.AUSY;

    // Act
    DaysAdjustment actualOfBusinessDaysResult = DaysAdjustment.ofBusinessDays(0, holidayCalendar);

    // Assert
    HolidayCalendarId calendar = actualOfBusinessDaysResult.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(0, actualOfBusinessDaysResult.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(holidayCalendar, actualOfBusinessDaysResult.getAdjustment().getCalendar());
  }

  /**
   * Test {@link DaysAdjustment#ofBusinessDays(int, HolidayCalendarId, BusinessDayAdjustment)} with
   * {@code numberOfDays}, {@code holidayCalendar}, {@code adjustment}.
   *
   * <ul>
   *   <li>Then return Days is ten.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#ofBusinessDays(int, HolidayCalendarId,
   * BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test ofBusinessDays(int, HolidayCalendarId, BusinessDayAdjustment) with 'numberOfDays', 'holidayCalendar', 'adjustment'; then return Days is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DaysAdjustment DaysAdjustment.ofBusinessDays(int, HolidayCalendarId, BusinessDayAdjustment)"
  })
  void testOfBusinessDaysWithNumberOfDaysHolidayCalendarAdjustment_thenReturnDaysIsTen() {
    // Arrange
    HolidayCalendarId holidayCalendar = HolidayCalendarIds.AUSY;

    // Act
    DaysAdjustment actualOfBusinessDaysResult =
        DaysAdjustment.ofBusinessDays(10, holidayCalendar, BusinessDayAdjustment.NONE);

    // Assert
    assertEquals(10, actualOfBusinessDaysResult.getDays());
    assertSame(BusinessDayAdjustment.NONE, actualOfBusinessDaysResult.getAdjustment());
    assertSame(holidayCalendar, actualOfBusinessDaysResult.getCalendar());
    assertSame(holidayCalendar, actualOfBusinessDaysResult.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any())).thenReturn(ofResult);

    // Act
    LocalDate actualAdjustResult = DaysAdjustment.NONE.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust2() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust3() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust4() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust5() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust6() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust7() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust8() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust9() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust10() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(combinedHolidayCalendar);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust11() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(combinedHolidayCalendar);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust12() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new LinkedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust13() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new LinkedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust14() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(linkedHolidayCalendar);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust15() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(linkedHolidayCalendar);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@link ReferenceData} {@link ReferenceData#getValue(ReferenceDataId)} return {@link
   *       HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjust(LocalDate, ReferenceData); given FRI_SAT; when ReferenceData getValue(ReferenceDataId) return FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_givenFri_sat_whenReferenceDataGetValueReturnFri_sat() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-04", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>When {@link ReferenceData} {@link ReferenceData#getValue(ReferenceDataId)} return {@link
   *       HolidayCalendars#NO_HOLIDAYS}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjust(LocalDate, ReferenceData); given NO_HOLIDAYS; when ReferenceData getValue(ReferenceDataId) return NO_HOLIDAYS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_givenNo_holidays_whenReferenceDataGetValueReturnNo_holidays() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.NO_HOLIDAYS);

    // Act
    LocalDate actualAdjustResult = DaysAdjustment.NONE.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link DaysAdjustment#NONE}.
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjust(LocalDate, ReferenceData); given NONE; then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_givenNone_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = DaysAdjustment.NONE.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData); then return toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DaysAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_thenReturnToStringIs19700102() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.NO_HOLIDAYS));

    // Act
    LocalDate actualAdjustResult = daysAdjustment.adjust(date, refData);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-02", actualAdjustResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-01-04", actualAdjustResult.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve2() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.MODIFIED_FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-01-04", actualAdjustResult.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve3() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.MODIFIED_PRECEDING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-01-04", actualAdjustResult.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve4() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.NEAREST)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-01-04", actualAdjustResult.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve5() {
    // Arrange
    BusinessDayConvention convention = mock(BusinessDayConvention.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(convention.adjust(Mockito.<LocalDate>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(convention)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    verify(convention).adjust(isA(LocalDate.class), isA(HolidayCalendar.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve6() {
    // Arrange
    BusinessDayConvention convention = mock(BusinessDayConvention.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(convention.adjust(Mockito.<LocalDate>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(convention)
                    .build())
            .calendar(HolidayCalendarIds.NO_HOLIDAYS)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    verify(convention).adjust(isA(LocalDate.class), isA(HolidayCalendar.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId resultCalendar = daysAdjustment.getResultCalendar();
    assertEquals("AUSY", resultCalendar.getName());
    assertEquals("AUSY", resultCalendar.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, resultCalendar.getReferenceDataType());
    assertSame(resultCalendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve7() {
    // Arrange
    BusinessDayConvention convention = mock(BusinessDayConvention.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(convention.adjust(Mockito.<LocalDate>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(convention)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(3076183)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.NO_HOLIDAYS);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    verify(convention).adjust(isA(LocalDate.class), isA(HolidayCalendar.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(3076183, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve8() {
    // Arrange
    BusinessDayConvention convention = mock(BusinessDayConvention.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(convention.adjust(Mockito.<LocalDate>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(convention)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(-1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    verify(convention).adjust(isA(LocalDate.class), isA(HolidayCalendar.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(-1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve9() {
    // Arrange
    BusinessDayConvention convention = mock(BusinessDayConvention.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(convention.adjust(Mockito.<LocalDate>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(convention)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(30)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    verify(convention).adjust(isA(LocalDate.class), isA(HolidayCalendar.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(30, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve10() {
    // Arrange
    BusinessDayConvention convention = mock(BusinessDayConvention.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(convention.adjust(Mockito.<LocalDate>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(convention)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(-1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    verify(convention).adjust(isA(LocalDate.class), isA(HolidayCalendar.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(-1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve11() {
    // Arrange
    BusinessDayConvention convention = mock(BusinessDayConvention.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(convention.adjust(Mockito.<LocalDate>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(convention)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(30)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(isA(ReferenceDataId.class));
    verify(convention).adjust(isA(LocalDate.class), isA(HolidayCalendar.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    assertEquals(30, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link DaysAdjustment#NONE}.
   *   <li>Then {@link DaysAdjustment#NONE} Calendar Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData); given NONE; then NONE Calendar Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_givenNone_thenNoneCalendarNameIsNoHolidays() {
    // Arrange
    DaysAdjustment daysAdjustment = DaysAdjustment.NONE;

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    daysAdjustment.resolve(refData);

    // Assert that nothing has changed
    verify(refData).getValue(isA(ReferenceDataId.class));
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(0, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link DaysAdjustment#NONE}.
   *   <li>Then {@link DaysAdjustment#NONE} Calendar Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData); given NONE; then NONE Calendar Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_givenNone_thenNoneCalendarNameIsNoHolidays2() {
    // Arrange
    DaysAdjustment daysAdjustment = DaysAdjustment.NONE;

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(0, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getAdjustment().getCalendar());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then builder adjustment {@link BusinessDayAdjustment#NONE} calendar {@link
   *       HolidayCalendarIds#AUSY} days one build Calendar Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then builder adjustment NONE calendar AUSY days one build Calendar Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_thenBuilderAdjustmentNoneCalendarAusyDaysOneBuildCalendarNameIsAusy() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    daysAdjustment.resolve(refData);

    // Assert that nothing has changed
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    HolidayCalendarId calendar2 = daysAdjustment.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar2.getName());
    assertEquals("NoHolidays", calendar2.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar2.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then builder adjustment {@link BusinessDayAdjustment#NONE} calendar {@link
   *       HolidayCalendarIds#AUSY} days one build Calendar Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then builder adjustment NONE calendar AUSY days one build Calendar Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_thenBuilderAdjustmentNoneCalendarAusyDaysOneBuildCalendarNameIsAusy2() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-01-04", actualAdjustResult.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    HolidayCalendarId calendar2 = daysAdjustment.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar2.getName());
    assertEquals("NoHolidays", calendar2.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar2.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then builder adjustment {@link BusinessDayAdjustment#NONE} calendar {@link
   *       HolidayCalendarIds#AUSY} days zero build Calendar Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then builder adjustment NONE calendar AUSY days zero build Calendar Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_thenBuilderAdjustmentNoneCalendarAusyDaysZeroBuildCalendarNameIsAusy() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(0)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    HolidayCalendarId calendar2 = daysAdjustment.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar2.getName());
    assertEquals("NoHolidays", calendar2.toString());
    assertEquals(0, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar2.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getResultCalendar());
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return adjust {@link LocalDate} with {@code 1970} and one and one toString is {@code
   *       1969-12-31}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then return adjust LocalDate with '1970' and one and one toString is '1969-12-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_thenReturnAdjustLocalDateWith1970AndOneAndOneToStringIs19691231() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(-1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1969-12-31", actualAdjustResult.toString());
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    HolidayCalendarId calendar2 = daysAdjustment.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar2.getName());
    assertEquals("NoHolidays", calendar2.toString());
    assertEquals(-1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar2.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return adjust {@link LocalDate} with {@code 1970} and one and one toString is {@code
   *       1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then return adjust LocalDate with '1970' and one and one toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_thenReturnAdjustLocalDateWith1970AndOneAndOneToStringIs19700102() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.NO_HOLIDAYS);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-01-02", actualAdjustResult.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    HolidayCalendarId calendar2 = daysAdjustment.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar2.getName());
    assertEquals("NoHolidays", calendar2.toString());
    assertEquals(1, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar2.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return adjust {@link LocalDate} with {@code 1970} and one and one toString is {@code
   *       1970-03-25}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then return adjust LocalDate with '1970' and one and one toString is '1970-03-25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DaysAdjustment.resolve(ReferenceData)"
  })
  void testResolve_thenReturnAdjustLocalDateWith1970AndOneAndOneToStringIs19700325() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(59)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = daysAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData, atLeast(1)).getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any());
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-03-25", actualAdjustResult.toString());
    HolidayCalendarId calendar = daysAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    HolidayCalendarId calendar2 = daysAdjustment.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar2.getName());
    assertEquals("NoHolidays", calendar2.toString());
    assertEquals(59, daysAdjustment.getDays());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar2.getReferenceDataType());
    Class<HolidayCalendar> expectedReferenceDataType2 = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType2, calendar.getReferenceDataType());
    assertSame(calendar, daysAdjustment.getResultCalendar());
  }

  /**
   * Test {@link DaysAdjustment#getResultCalendar()}.
   *
   * <ul>
   *   <li>Given {@link DaysAdjustment#NONE}.
   *   <li>Then return Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#getResultCalendar()}
   */
  @Test
  @DisplayName("Test getResultCalendar(); given NONE; then return Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId DaysAdjustment.getResultCalendar()"})
  void testGetResultCalendar_givenNone_thenReturnNameIsNoHolidays() {
    // Arrange and Act
    HolidayCalendarId actualResultCalendar = DaysAdjustment.NONE.getResultCalendar();

    // Assert
    assertEquals("NoHolidays", actualResultCalendar.getName());
    assertEquals("NoHolidays", actualResultCalendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualResultCalendar.getReferenceDataType());
  }

  /**
   * Test {@link DaysAdjustment#getResultCalendar()}.
   *
   * <ul>
   *   <li>Then return Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#getResultCalendar()}
   */
  @Test
  @DisplayName("Test getResultCalendar(); then return Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId DaysAdjustment.getResultCalendar()"})
  void testGetResultCalendar_thenReturnNameIsAusy() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act
    HolidayCalendarId actualResultCalendar =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build()
            .getResultCalendar();

    // Assert
    assertEquals("AUSY", actualResultCalendar.getName());
    assertEquals("AUSY", actualResultCalendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualResultCalendar.getReferenceDataType());
  }

  /**
   * Test {@link DaysAdjustment#normalized()}.
   *
   * <ul>
   *   <li>Given builder adjustment {@link BusinessDayAdjustment#NONE} calendar {@link
   *       HolidayCalendarIds#AUSY} days zero build.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given builder adjustment NONE calendar AUSY days zero build")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.normalized()"})
  void testNormalized_givenBuilderAdjustmentNoneCalendarAusyDaysZeroBuild() {
    // Arrange, Act and Assert
    assertEquals(
        DaysAdjustment.NONE,
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(0)
            .build()
            .normalized());
  }

  /**
   * Test {@link DaysAdjustment#normalized()}.
   *
   * <ul>
   *   <li>Given {@link DaysAdjustment#NONE}.
   *   <li>Then return {@link DaysAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given NONE; then return NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.normalized()"})
  void testNormalized_givenNone_thenReturnNone() {
    // Arrange, Act and Assert
    assertSame(DaysAdjustment.NONE, DaysAdjustment.NONE.normalized());
  }

  /**
   * Test {@link DaysAdjustment#normalized()}.
   *
   * <ul>
   *   <li>Given ofCalendarDays ten.
   *   <li>Then return ofCalendarDays ten.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given ofCalendarDays ten; then return ofCalendarDays ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.normalized()"})
  void testNormalized_givenOfCalendarDaysTen_thenReturnOfCalendarDaysTen() {
    // Arrange
    DaysAdjustment ofCalendarDaysResult = DaysAdjustment.ofCalendarDays(10);

    // Act
    DaysAdjustment actualNormalizedResult = ofCalendarDaysResult.normalized();

    // Assert
    assertEquals(ofCalendarDaysResult, actualNormalizedResult);
  }

  /**
   * Test {@link DaysAdjustment#normalized()}.
   *
   * <ul>
   *   <li>Then return builder adjustment {@link BusinessDayAdjustment#NONE} calendar {@link
   *       HolidayCalendarIds#AUSY} days one build.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#normalized()}
   */
  @Test
  @DisplayName(
      "Test normalized(); then return builder adjustment NONE calendar AUSY days one build")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DaysAdjustment DaysAdjustment.normalized()"})
  void testNormalized_thenReturnBuilderAdjustmentNoneCalendarAusyDaysOneBuild() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    // Act
    DaysAdjustment actualNormalizedResult = daysAdjustment.normalized();

    // Assert
    assertSame(daysAdjustment, actualNormalizedResult);
  }

  /**
   * Test {@link DaysAdjustment#toString()}.
   *
   * <p>Method under test: {@link DaysAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DaysAdjustment.toString()"})
  void testToString() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act and Assert
    assertEquals(
        "1 business day using calendar AUSY then apply Following using calendar AUSY",
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build()
            .toString());
  }

  /**
   * Test {@link DaysAdjustment#toString()}.
   *
   * <p>Method under test: {@link DaysAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DaysAdjustment.toString()"})
  void testToString2() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act and Assert
    assertEquals(
        "1 business day using calendar AUSY then apply NoAdjust using calendar AUSY",
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.NO_ADJUST)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build()
            .toString());
  }

  /**
   * Test {@link DaysAdjustment#toString()}.
   *
   * <p>Method under test: {@link DaysAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DaysAdjustment.toString()"})
  void testToString3() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();

    // Act and Assert
    assertEquals(
        "1 business day using calendar AUSY",
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.NO_HOLIDAYS)
                    .convention(BusinessDayConventions.NO_ADJUST)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build()
            .toString());
  }

  /**
   * Test {@link DaysAdjustment#toString()}.
   *
   * <ul>
   *   <li>Given builder adjustment {@link BusinessDayAdjustment#NONE} calendar {@link
   *       HolidayCalendarIds#AUSY} days one build.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); given builder adjustment NONE calendar AUSY days one build")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DaysAdjustment.toString()"})
  void testToString_givenBuilderAdjustmentNoneCalendarAusyDaysOneBuild() {
    // Arrange, Act and Assert
    assertEquals(
        "1 business day using calendar AUSY",
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build()
            .toString());
  }

  /**
   * Test {@link DaysAdjustment#toString()}.
   *
   * <ul>
   *   <li>Given {@link DaysAdjustment#NONE}.
   *   <li>Then return {@code 0 calendar days}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); given NONE; then return '0 calendar days'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DaysAdjustment.toString()"})
  void testToString_givenNone_thenReturn0CalendarDays() {
    // Arrange, Act and Assert
    assertEquals("0 calendar days", DaysAdjustment.NONE.toString());
  }

  /**
   * Test {@link DaysAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then return {@code 1 calendar day}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '1 calendar day'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DaysAdjustment.toString()"})
  void testToString_thenReturn1CalendarDay() {
    // Arrange, Act and Assert
    assertEquals(
        "1 calendar day",
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.NO_HOLIDAYS)
            .days(1)
            .build()
            .toString());
  }

  /**
   * Test {@link DaysAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then return {@code 10 business days using calendar AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '10 business days using calendar AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DaysAdjustment.toString()"})
  void testToString_thenReturn10BusinessDaysUsingCalendarAusy() {
    // Arrange
    DaysAdjustment ofBusinessDaysResult =
        DaysAdjustment.ofBusinessDays(10, HolidayCalendarIds.AUSY);

    // Act and Assert
    assertEquals("10 business days using calendar AUSY", ofBusinessDaysResult.toString());
  }

  /**
   * Test {@link DaysAdjustment#meta()}.
   *
   * <p>Method under test: {@link DaysAdjustment#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DaysAdjustment.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DaysAdjustment.meta();

    // Assert
    MetaProperty<BusinessDayAdjustment> adjustmentResult = actualMetaResult.adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<HolidayCalendarId> calendarResult = actualMetaResult.calendar();
    assertTrue(calendarResult instanceof DirectMetaProperty);
    MetaProperty<Integer> daysResult = actualMetaResult.days();
    assertTrue(daysResult instanceof DirectMetaProperty);
    assertEquals("adjustment", adjustmentResult.name());
    assertEquals("calendar", calendarResult.name());
    assertEquals("days", daysResult.name());
    assertEquals("int", daysResult.propertyType().getName());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, calendarResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, daysResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, adjustmentResult.propertyType());
    Class<DaysAdjustment> expectedDeclaringTypeResult = DaysAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentResult.declaringType());
    Class<DaysAdjustment> expectedDeclaringTypeResult2 = DaysAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, calendarResult.declaringType());
    Class<DaysAdjustment> expectedDeclaringTypeResult3 = DaysAdjustment.class;
    assertEquals(expectedDeclaringTypeResult3, daysResult.declaringType());
    Class<HolidayCalendarId> expectedPropertyTypeResult2 = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult2, calendarResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, adjustmentResult.metaBean());
    assertSame(meta, calendarResult.metaBean());
    assertSame(meta, daysResult.metaBean());
  }

  /**
   * Test {@link DaysAdjustment#metaBean()}.
   *
   * <p>Method under test: {@link DaysAdjustment#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DaysAdjustment.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, DaysAdjustment.NONE.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DaysAdjustment#getAdjustment()}
   *   <li>{@link DaysAdjustment#getCalendar()}
   *   <li>{@link DaysAdjustment#getDays()}
   *   <li>{@link DaysAdjustment#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BusinessDayAdjustment DaysAdjustment.getAdjustment()",
    "HolidayCalendarId DaysAdjustment.getCalendar()",
    "int DaysAdjustment.getDays()",
    "Builder DaysAdjustment.toBuilder()"
  })
  void testGettersAndSetters() {
    // Arrange
    DaysAdjustment daysAdjustment = DaysAdjustment.NONE;

    // Act
    BusinessDayAdjustment actualAdjustment = daysAdjustment.getAdjustment();
    daysAdjustment.getCalendar();
    int actualDays = daysAdjustment.getDays();
    daysAdjustment.toBuilder();

    // Assert
    assertEquals(0, actualDays);
    assertSame(BusinessDayAdjustment.NONE, actualAdjustment);
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}, and {@link DaysAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DaysAdjustment#equals(Object)}
   *   <li>{@link DaysAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DaysAdjustment daysAdjustment = DaysAdjustment.NONE;
    DaysAdjustment daysAdjustment2 = DaysAdjustment.NONE;

    // Act and Assert
    assertEquals(daysAdjustment, daysAdjustment2);
    assertEquals(daysAdjustment.hashCode(), daysAdjustment2.hashCode());
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}, and {@link DaysAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DaysAdjustment#equals(Object)}
   *   <li>{@link DaysAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    DaysAdjustment daysAdjustment =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();
    DaysAdjustment daysAdjustment2 =
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    // Act and Assert
    assertEquals(daysAdjustment, daysAdjustment2);
    assertEquals(daysAdjustment.hashCode(), daysAdjustment2.hashCode());
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}, and {@link DaysAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DaysAdjustment#equals(Object)}
   *   <li>{@link DaysAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DaysAdjustment daysAdjustment = DaysAdjustment.NONE;

    // Act and Assert
    assertEquals(daysAdjustment, daysAdjustment);
    int expectedHashCodeResult = daysAdjustment.hashCode();
    assertEquals(expectedHashCodeResult, daysAdjustment.hashCode());
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build(),
        DaysAdjustment.NONE);
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(0)
            .build(),
        DaysAdjustment.NONE);
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder builderResult = DaysAdjustment.builder();
    DaysAdjustment daysAdjustment =
        builderResult
            .adjustment(
                BusinessDayAdjustment.builder()
                    .calendar(HolidayCalendarIds.AUSY)
                    .convention(BusinessDayConventions.FOLLOWING)
                    .build())
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build();

    // Act and Assert
    assertNotEquals(
        daysAdjustment,
        DaysAdjustment.builder()
            .adjustment(BusinessDayAdjustment.NONE)
            .calendar(HolidayCalendarIds.AUSY)
            .days(1)
            .build());
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DaysAdjustment.NONE, null);
  }

  /**
   * Test {@link DaysAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DaysAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DaysAdjustment.equals(Object)", "int DaysAdjustment.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DaysAdjustment.NONE, "Different type to DaysAdjustment");
  }
}
