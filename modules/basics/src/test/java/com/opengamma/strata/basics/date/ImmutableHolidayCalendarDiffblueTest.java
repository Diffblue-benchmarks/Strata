package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import com.opengamma.strata.basics.date.ImmutableHolidayCalendar.Meta;
import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ImmutableHolidayCalendarDiffblueTest {
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
    Class<? extends ImmutableHolidayCalendar> actualBeanTypeResult =
        ImmutableHolidayCalendar.meta().beanType();

    // Assert
    Class<ImmutableHolidayCalendar> expectedBeanTypeResult = ImmutableHolidayCalendar.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#id()}
   *   <li>{@link Meta#lookup()}
   *   <li>{@link Meta#startYear()}
   *   <li>{@link Meta#weekends()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.id()",
    "MetaProperty Meta.lookup()",
    "MetaProperty Meta.startYear()",
    "MetaProperty Meta.weekends()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableHolidayCalendar.meta();

    // Act
    MetaProperty<HolidayCalendarId> actualIdResult = metaResult.id();
    MetaProperty<int[]> actualLookupResult = metaResult.lookup();
    MetaProperty<Integer> actualStartYearResult = metaResult.startYear();

    // Assert
    assertTrue(actualIdResult instanceof DirectMetaProperty);
    assertTrue(actualLookupResult instanceof DirectMetaProperty);
    assertTrue(actualStartYearResult instanceof DirectMetaProperty);
    assertTrue(metaResult.weekends() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then return name is {@code id}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'id'; then return name is 'id'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenId_thenReturnNameIsId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableHolidayCalendar.meta().metaPropertyGet("id");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<int[]> lookupResult = ((Meta) metaBeanResult).lookup();
    assertTrue(lookupResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> startYearResult = ((Meta) metaBeanResult).startYear();
    assertTrue(startYearResult instanceof DirectMetaProperty);
    MetaProperty<Integer> weekendsResult = ((Meta) metaBeanResult).weekends();
    assertTrue(weekendsResult instanceof DirectMetaProperty);
    assertEquals("id", actualMetaPropertyGetResult.name());
    Class<HolidayCalendarId> expectedPropertyTypeResult = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).id());
    assertSame(metaBeanResult, lookupResult.metaBean());
    assertSame(metaBeanResult, startYearResult.metaBean());
    assertSame(metaBeanResult, weekendsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code lookup}.
   *   <li>Then return propertyType Name is {@code [I}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'lookup'; then return propertyType Name is '[I'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLookup_thenReturnPropertyTypeNameIsI() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableHolidayCalendar.meta().metaPropertyGet("lookup");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendarId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> startYearResult = ((Meta) metaBeanResult).startYear();
    assertTrue(startYearResult instanceof DirectMetaProperty);
    MetaProperty<Integer> weekendsResult = ((Meta) metaBeanResult).weekends();
    assertTrue(weekendsResult instanceof DirectMetaProperty);
    assertEquals("[I", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("lookup", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lookup());
    assertSame(metaBeanResult, idResult.metaBean());
    assertSame(metaBeanResult, startYearResult.metaBean());
    assertSame(metaBeanResult, weekendsResult.metaBean());
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
    assertNull(ImmutableHolidayCalendar.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startYear}.
   *   <li>Then return name is {@code startYear}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startYear'; then return name is 'startYear'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartYear_thenReturnNameIsStartYear() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableHolidayCalendar.meta().metaPropertyGet("startYear");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendarId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    MetaProperty<int[]> lookupResult = ((Meta) metaBeanResult).lookup();
    assertTrue(lookupResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> weekendsResult = ((Meta) metaBeanResult).weekends();
    assertTrue(weekendsResult instanceof DirectMetaProperty);
    assertEquals("startYear", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startYear());
    assertSame(metaBeanResult, idResult.metaBean());
    assertSame(metaBeanResult, lookupResult.metaBean());
    assertSame(metaBeanResult, weekendsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code weekends}.
   *   <li>Then return name is {@code weekends}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'weekends'; then return name is 'weekends'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenWeekends_thenReturnNameIsWeekends() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableHolidayCalendar.meta().metaPropertyGet("weekends");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendarId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    MetaProperty<int[]> lookupResult = ((Meta) metaBeanResult).lookup();
    assertTrue(lookupResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> startYearResult = ((Meta) metaBeanResult).startYear();
    assertTrue(startYearResult instanceof DirectMetaProperty);
    assertEquals("weekends", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).weekends());
    assertSame(metaBeanResult, idResult.metaBean());
    assertSame(metaBeanResult, lookupResult.metaBean());
    assertSame(metaBeanResult, startYearResult.metaBean());
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
        ImmutableHolidayCalendar.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("id") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lookup") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startYear") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("weekends") instanceof DirectMetaProperty);
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
    // Arrange, Act and Assert
    assertNull(
        ImmutableHolidayCalendar.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertySet(Bean, String, Object, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            ImmutableHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)}
   * with {@code HolidayCalendarId}, {@code Iterable}, {@code DayOfWeek}, {@code DayOfWeek}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * DayOfWeek, DayOfWeek)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek) with 'HolidayCalendarId', 'Iterable', 'DayOfWeek', 'DayOfWeek'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)"
  })
  void testOfWithHolidayCalendarIdIterableDayOfWeekDayOfWeek() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, DayOfWeek.MONDAY, DayOfWeek.MONDAY);

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    assertEquals(1, actualOfResult.getWeekendDays().size());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)}
   * with {@code HolidayCalendarId}, {@code Iterable}, {@code DayOfWeek}, {@code DayOfWeek}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * DayOfWeek, DayOfWeek)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek) with 'HolidayCalendarId', 'Iterable', 'DayOfWeek', 'DayOfWeek'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)"
  })
  void testOfWithHolidayCalendarIdIterableDayOfWeekDayOfWeek2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, DayOfWeek.MONDAY, DayOfWeek.MONDAY);

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    assertEquals(1, actualOfResult.getWeekendDays().size());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)}
   * with {@code HolidayCalendarId}, {@code Iterable}, {@code DayOfWeek}, {@code DayOfWeek}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * DayOfWeek, DayOfWeek)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek) with 'HolidayCalendarId', 'Iterable', 'DayOfWeek', 'DayOfWeek'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)"
  })
  void testOfWithHolidayCalendarIdIterableDayOfWeekDayOfWeek3() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, DayOfWeek.TUESDAY, DayOfWeek.MONDAY);

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualOfResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.TUESDAY));
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)}
   * with {@code HolidayCalendarId}, {@code Iterable}, {@code DayOfWeek}, {@code DayOfWeek}.
   *
   * <ul>
   *   <li>Given now.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * DayOfWeek, DayOfWeek)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek) with 'HolidayCalendarId', 'Iterable', 'DayOfWeek', 'DayOfWeek'; given now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)"
  })
  void testOfWithHolidayCalendarIdIterableDayOfWeekDayOfWeek_givenNow() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.now());
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, DayOfWeek.MONDAY, DayOfWeek.MONDAY);

    // Assert
    assertEquals(1, actualOfResult.getWeekendDays().size());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)}
   * with {@code HolidayCalendarId}, {@code Iterable}, {@code DayOfWeek}, {@code DayOfWeek}.
   *
   * <ul>
   *   <li>Given now.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * DayOfWeek, DayOfWeek)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek) with 'HolidayCalendarId', 'Iterable', 'DayOfWeek', 'DayOfWeek'; given now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)"
  })
  void testOfWithHolidayCalendarIdIterableDayOfWeekDayOfWeek_givenNow2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    holidays.add(LocalDate.now());
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, DayOfWeek.MONDAY, DayOfWeek.MONDAY);

    // Assert
    assertEquals(1, actualOfResult.getWeekendDays().size());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)}
   * with {@code HolidayCalendarId}, {@code Iterable}, {@code DayOfWeek}, {@code DayOfWeek}.
   *
   * <ul>
   *   <li>Then return Holidays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * DayOfWeek, DayOfWeek)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek) with 'HolidayCalendarId', 'Iterable', 'DayOfWeek', 'DayOfWeek'; then return Holidays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)"
  })
  void testOfWithHolidayCalendarIdIterableDayOfWeekDayOfWeek_thenReturnHolidaysEmpty() {
    // Arrange and Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, new ArrayList<>(), DayOfWeek.TUESDAY, DayOfWeek.MONDAY);

    // Assert
    ImmutableSet<DayOfWeek> weekendDays = actualOfResult.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.TUESDAY));
    ImmutableSortedSet<LocalDate> holidays = actualOfResult.getHolidays();
    assertTrue(holidays.isEmpty());
    assertSame(holidays, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)}
   * with {@code HolidayCalendarId}, {@code Iterable}, {@code DayOfWeek}, {@code DayOfWeek}.
   *
   * <ul>
   *   <li>Then return Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * DayOfWeek, DayOfWeek)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek) with 'HolidayCalendarId', 'Iterable', 'DayOfWeek', 'DayOfWeek'; then return Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, DayOfWeek, DayOfWeek)"
  })
  void testOfWithHolidayCalendarIdIterableDayOfWeekDayOfWeek_thenReturnNameIsAusy() {
    // Arrange
    HolidayCalendarId id = HolidayCalendarIds.AUSY;

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(id, new ArrayList<>(), DayOfWeek.MONDAY, DayOfWeek.MONDAY);

    // Assert
    assertEquals("AUSY", actualOfResult.getName());
    ImmutableSet<DayOfWeek> weekendDays = actualOfResult.getWeekendDays();
    assertEquals(1, weekendDays.size());
    assertTrue(weekendDays.contains(DayOfWeek.MONDAY));
    assertSame(id, actualOfResult.getId());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(1, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.MONDAY));
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(2, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.MONDAY));
    assertTrue(weekendDays2.contains(DayOfWeek.TUESDAY));
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable3() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(1, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.MONDAY));
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable4() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(2, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.MONDAY));
    assertTrue(weekendDays2.contains(DayOfWeek.TUESDAY));
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Given now.
   *   <li>When {@link ArrayList#ArrayList()} add now.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; given now; when ArrayList() add now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_givenNow_whenArrayListAddNow() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.now());
    holidays.add(LocalDate.of(1970, 1, 1));
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Given now.
   *   <li>When {@link ArrayList#ArrayList()} add now.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; given now; when ArrayList() add now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_givenNow_whenArrayListAddNow2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    holidays.add(LocalDate.now());
    holidays.add(LocalDate.of(1970, 1, 1));
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Given ofYearDay one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; given ofYearDay one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_givenOfYearDayOneAndOne() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.ofYearDay(1, 1));
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    ArrayList<LocalDate> workingDays = new ArrayList<>();
    workingDays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, weekendDays, workingDays);

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return Holidays size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; then return Holidays size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_thenReturnHolidaysSizeIsOne() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return Holidays size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; then return Holidays size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_thenReturnHolidaysSizeIsOne2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    holidays.add(LocalDate.of(1970, 1, 1));
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; then return WeekendDays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_thenReturnWeekendDaysEmpty() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, holidays, weekendDays, new ArrayList<>());

    // Assert
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; then return WeekendDays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_thenReturnWeekendDaysEmpty2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    ArrayList<LocalDate> workingDays = new ArrayList<>();
    workingDays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, weekendDays, workingDays);

    // Assert
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable, Iterable)} with
   * {@code HolidayCalendarId}, {@code Iterable}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable', 'Iterable'; then return WeekendDays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterableIterable_thenReturnWeekendDaysEmpty3() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.now());
    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();

    ArrayList<LocalDate> workingDays = new ArrayList<>();
    workingDays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, weekendDays, workingDays);

    // Assert
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Given now.
   *   <li>When {@link ArrayList#ArrayList()} add now.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; given now; when ArrayList() add now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_givenNow_whenArrayListAddNow() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.now());
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Given now.
   *   <li>When {@link ArrayList#ArrayList()} add now.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; given now; when ArrayList() add now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_givenNow_whenArrayListAddNow2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    holidays.add(LocalDate.now());
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return Holidays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; then return Holidays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_thenReturnHolidaysEmpty() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, new ArrayList<>());

    // Assert
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return Holidays size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; then return Holidays size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_thenReturnHolidaysSizeIsOne() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, new ArrayList<>());

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return Holidays size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; then return Holidays size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_thenReturnHolidaysSizeIsOne2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    holidays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, new ArrayList<>());

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; then return WeekendDays size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_thenReturnWeekendDaysSizeIsOne() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, weekendDays);

    // Assert
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(1, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.MONDAY));
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; then return WeekendDays size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_thenReturnWeekendDaysSizeIsOne2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, weekendDays);

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(1, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.MONDAY));
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; then return WeekendDays size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_thenReturnWeekendDaysSizeIsTwo() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, weekendDays);

    // Assert
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(2, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.TUESDAY));
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable, Iterable)} with {@code
   * HolidayCalendarId}, {@code Iterable}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays size is two.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, Iterable,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, Iterable, Iterable) with 'HolidayCalendarId', 'Iterable', 'Iterable'; then return WeekendDays size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, Iterable, Iterable)"
  })
  void testOfWithHolidayCalendarIdIterableIterable_thenReturnWeekendDaysSizeIsTwo2() {
    // Arrange
    ArrayList<LocalDate> holidays = new ArrayList<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    ArrayList<DayOfWeek> weekendDays = new ArrayList<>();
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(HolidayCalendarIds.AUSY, holidays, weekendDays);

    // Assert
    assertEquals(1, actualOfResult.getHolidays().size());
    ImmutableSet<DayOfWeek> weekendDays2 = actualOfResult.getWeekendDays();
    assertEquals(2, weekendDays2.size());
    assertTrue(weekendDays2.contains(DayOfWeek.MONDAY));
    assertTrue(weekendDays2.contains(DayOfWeek.TUESDAY));
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set, Iterable)} with
   * {@code HolidayCalendarId}, {@code SortedSet}, {@code Set}, {@code Iterable}.
   *
   * <ul>
   *   <li>Given {@code TUESDAY}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, SortedSet, Set, Iterable) with 'HolidayCalendarId', 'SortedSet', 'Set', 'Iterable'; given 'TUESDAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, SortedSet, Set, Iterable)"
  })
  void testOfWithHolidayCalendarIdSortedSetSetIterable_givenTuesday() {
    // Arrange
    HolidayCalendarId id = HolidayCalendarIds.AUSY;
    TreeSet<LocalDate> holidays = new TreeSet<>();

    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            id, (SortedSet<LocalDate>) holidays, weekendDays, new ArrayList<>());

    // Assert
    assertEquals("AUSY", actualOfResult.getName());
    assertEquals(weekendDays, actualOfResult.getWeekendDays());
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertEquals(holidays, holidays2);
    assertSame(holidays2, actualOfResult.getWorkingDays());
    assertSame(id, actualOfResult.getId());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set, Iterable)} with
   * {@code HolidayCalendarId}, {@code SortedSet}, {@code Set}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return Holidays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, SortedSet, Set, Iterable) with 'HolidayCalendarId', 'SortedSet', 'Set', 'Iterable'; then return Holidays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, SortedSet, Set, Iterable)"
  })
  void testOfWithHolidayCalendarIdSortedSetSetIterable_thenReturnHolidaysEmpty() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();

    ArrayList<LocalDate> workingDays = new ArrayList<>();
    workingDays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, (SortedSet<LocalDate>) holidays, weekendDays, workingDays);

    // Assert
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertTrue(holidays2.isEmpty());
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set, Iterable)} with
   * {@code HolidayCalendarId}, {@code SortedSet}, {@code Set}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WeekendDays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, SortedSet, Set, Iterable) with 'HolidayCalendarId', 'SortedSet', 'Set', 'Iterable'; then return WeekendDays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, SortedSet, Set, Iterable)"
  })
  void testOfWithHolidayCalendarIdSortedSetSetIterable_thenReturnWeekendDaysEmpty() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.getWeekendDays().isEmpty());
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertEquals(holidays, holidays2);
    assertSame(holidays2, actualOfResult.getWorkingDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set, Iterable)} with
   * {@code HolidayCalendarId}, {@code SortedSet}, {@code Set}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WorkingDays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, SortedSet, Set, Iterable) with 'HolidayCalendarId', 'SortedSet', 'Set', 'Iterable'; then return WorkingDays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, SortedSet, Set, Iterable)"
  })
  void testOfWithHolidayCalendarIdSortedSetSetIterable_thenReturnWorkingDaysEmpty() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
    assertEquals(holidays, actualOfResult.getHolidays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set, Iterable)} with
   * {@code HolidayCalendarId}, {@code SortedSet}, {@code Set}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WorkingDays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, SortedSet, Set, Iterable) with 'HolidayCalendarId', 'SortedSet', 'Set', 'Iterable'; then return WorkingDays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, SortedSet, Set, Iterable)"
  })
  void testOfWithHolidayCalendarIdSortedSetSetIterable_thenReturnWorkingDaysEmpty2() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));

    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Assert
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
    assertEquals(weekendDays, actualOfResult.getWeekendDays());
    assertEquals(holidays, actualOfResult.getHolidays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set, Iterable)} with
   * {@code HolidayCalendarId}, {@code SortedSet}, {@code Set}, {@code Iterable}.
   *
   * <ul>
   *   <li>Then return WorkingDays Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, SortedSet, Set, Iterable) with 'HolidayCalendarId', 'SortedSet', 'Set', 'Iterable'; then return WorkingDays Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, SortedSet, Set, Iterable)"
  })
  void testOfWithHolidayCalendarIdSortedSetSetIterable_thenReturnWorkingDaysEmpty3() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.ofYearDay(1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();

    ArrayList<LocalDate> workingDays = new ArrayList<>();
    workingDays.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY, (SortedSet<LocalDate>) holidays, weekendDays, workingDays);

    // Assert
    assertTrue(actualOfResult.getWorkingDays().isEmpty());
    assertEquals(holidays, actualOfResult.getHolidays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set, Iterable)} with
   * {@code HolidayCalendarId}, {@code SortedSet}, {@code Set}, {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link TreeSet#TreeSet()}.
   *   <li>Then return Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#of(HolidayCalendarId, SortedSet, Set,
   * Iterable)}
   */
  @Test
  @DisplayName(
      "Test of(HolidayCalendarId, SortedSet, Set, Iterable) with 'HolidayCalendarId', 'SortedSet', 'Set', 'Iterable'; when TreeSet(); then return Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableHolidayCalendar ImmutableHolidayCalendar.of(HolidayCalendarId, SortedSet, Set, Iterable)"
  })
  void testOfWithHolidayCalendarIdSortedSetSetIterable_whenTreeSet_thenReturnNameIsAusy() {
    // Arrange
    HolidayCalendarId id = HolidayCalendarIds.AUSY;
    TreeSet<LocalDate> holidays = new TreeSet<>();

    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.MONDAY);

    // Act
    ImmutableHolidayCalendar actualOfResult =
        ImmutableHolidayCalendar.of(
            id, (SortedSet<LocalDate>) holidays, weekendDays, new ArrayList<>());

    // Assert
    assertEquals("AUSY", actualOfResult.getName());
    assertEquals(weekendDays, actualOfResult.getWeekendDays());
    ImmutableSortedSet<LocalDate> holidays2 = actualOfResult.getHolidays();
    assertEquals(holidays, holidays2);
    assertSame(holidays2, actualOfResult.getWorkingDays());
    assertSame(id, actualOfResult.getId());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#readExternal(DataInput)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readUTF()} return {@code 42}.
   *   <li>Then return Name is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#readExternal(DataInput)}
   */
  @Test
  @DisplayName(
      "Test readExternal(DataInput); given '42'; when ObjectInputStream readUTF() return '42'; then return Name is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar ImmutableHolidayCalendar.readExternal(DataInput)"})
  void testReadExternal_given42_whenObjectInputStreamReadUTFReturn42_thenReturnNameIs42()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("42");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableHolidayCalendar actualReadExternalResult = ImmutableHolidayCalendar.readExternal(in);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("42", actualReadExternalResult.getName());
    HolidayCalendarId id = actualReadExternalResult.getId();
    assertEquals("42", id.getName());
    assertEquals("42", id.toString());
    ImmutableSet<DayOfWeek> weekendDays = actualReadExternalResult.getWeekendDays();
    assertEquals(1, weekendDays.size());
    assertEquals(26, actualReadExternalResult.getHolidays().size());
    assertTrue(weekendDays.contains(DayOfWeek.MONDAY));
    assertTrue(actualReadExternalResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#readExternal(DataInput)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return Name is {@code Utf}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#readExternal(DataInput)}
   */
  @Test
  @DisplayName("Test readExternal(DataInput); given one; then return Name is 'Utf'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar ImmutableHolidayCalendar.readExternal(DataInput)"})
  void testReadExternal_givenOne_thenReturnNameIsUtf() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableHolidayCalendar actualReadExternalResult = ImmutableHolidayCalendar.readExternal(in);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("Utf", actualReadExternalResult.getName());
    HolidayCalendarId id = actualReadExternalResult.getId();
    assertEquals("Utf", id.getName());
    assertEquals("Utf", id.toString());
    ImmutableSet<DayOfWeek> weekendDays = actualReadExternalResult.getWeekendDays();
    assertEquals(1, weekendDays.size());
    assertEquals(26, actualReadExternalResult.getHolidays().size());
    assertTrue(weekendDays.contains(DayOfWeek.MONDAY));
    assertTrue(actualReadExternalResult.getWorkingDays().isEmpty());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#ImmutableHolidayCalendar(HolidayCalendarId, int, int,
   * int[], boolean)}.
   *
   * <ul>
   *   <li>Then return Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImmutableHolidayCalendar#ImmutableHolidayCalendar(HolidayCalendarId, int, int, int[], boolean)}
   */
  @Test
  @DisplayName(
      "Test new ImmutableHolidayCalendar(HolidayCalendarId, int, int, int[], boolean); then return Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ImmutableHolidayCalendar.<init>(HolidayCalendarId, int, int, int[], boolean)"
  })
  void testNewImmutableHolidayCalendar_thenReturnNameIsAusy() {
    // Arrange
    HolidayCalendarId id = HolidayCalendarIds.AUSY;

    // Act
    ImmutableHolidayCalendar actualImmutableHolidayCalendar =
        new ImmutableHolidayCalendar(id, 3, 1, new int[] {1, 0, 1, 0}, true);

    // Assert
    assertEquals("AUSY", actualImmutableHolidayCalendar.getName());
    assertEquals(1, actualImmutableHolidayCalendar.getWorkingDays().size());
    ImmutableSet<DayOfWeek> weekendDays = actualImmutableHolidayCalendar.getWeekendDays();
    assertEquals(2, weekendDays.size());
    assertEquals(84, actualImmutableHolidayCalendar.getHolidays().size());
    assertTrue(weekendDays.contains(DayOfWeek.MONDAY));
    assertTrue(weekendDays.contains(DayOfWeek.TUESDAY));
    assertSame(id, actualImmutableHolidayCalendar.getId());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#meta()}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableHolidayCalendar.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableHolidayCalendar.meta();

    // Assert
    assertTrue(actualMetaResult.id() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lookup() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.startYear() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.weekends() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
