package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.DataOutputStream;
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
   * <ul>
   *   <li>Given {@code Utf}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given 'Utf'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenUtf_thenThrowNoSuchElementException() throws IOException {
    // Arrange
    Meta metaResult = ImmutableHolidayCalendar.meta();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ImmutableHolidayCalendar.readExternal(in), "Property Name", false));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@code Utf}.
   *   <li>When {@code id}.
   *   <li>Then return {@link HolidayCalendarId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given 'Utf'; when 'id'; then return HolidayCalendarId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenUtf_whenId_thenReturnHolidayCalendarId() throws IOException {
    // Arrange
    Meta metaResult = ImmutableHolidayCalendar.meta();

    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(ImmutableHolidayCalendar.readExternal(in), "id", false);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertTrue(actualPropertyGetResult instanceof HolidayCalendarId);
    assertEquals("Utf", ((HolidayCalendarId) actualPropertyGetResult).getName());
    assertEquals("Utf", actualPropertyGetResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType,
        ((HolidayCalendarId) actualPropertyGetResult).getReferenceDataType());
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
   * Test {@link ImmutableHolidayCalendar#writeExternal(DataOutput)}.
   *
   * <ul>
   *   <li>Then {@link DataOutputStream#DataOutputStream(OutputStream)} with {@link
   *       ByteArrayOutputStream#ByteArrayOutputStream()} size is fifteen.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#writeExternal(DataOutput)}
   */
  @Test
  @DisplayName(
      "Test writeExternal(DataOutput); then DataOutputStream(OutputStream) with ByteArrayOutputStream() size is fifteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImmutableHolidayCalendar.writeExternal(DataOutput)"})
  void testWriteExternal_thenDataOutputStreamWithByteArrayOutputStreamSizeIsFifteen()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());
    ImmutableHolidayCalendar readExternalResult = ImmutableHolidayCalendar.readExternal(in);
    DataOutputStream out = new DataOutputStream(new ByteArrayOutputStream());

    // Act
    readExternalResult.writeExternal(out);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(15, out.size());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#readExternal(DataInput)}.
   *
   * <ul>
   *   <li>Given {@code id}.
   *   <li>When {@link ObjectInputStream} {@link ObjectInputStream#readUTF()} return {@code id}.
   *   <li>Then return Name is {@code id}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#readExternal(DataInput)}
   */
  @Test
  @DisplayName(
      "Test readExternal(DataInput); given 'id'; when ObjectInputStream readUTF() return 'id'; then return Name is 'id'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableHolidayCalendar ImmutableHolidayCalendar.readExternal(DataInput)"})
  void testReadExternal_givenId_whenObjectInputStreamReadUTFReturnId_thenReturnNameIsId()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("id");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableHolidayCalendar actualReadExternalResult = ImmutableHolidayCalendar.readExternal(in);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("id", actualReadExternalResult.getName());
    HolidayCalendarId id = actualReadExternalResult.getId();
    assertEquals("id", id.getName());
    assertEquals("id", id.toString());
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
   * Test {@link ImmutableHolidayCalendar#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readUTF()} return {@code Utf}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given ObjectInputStream readUTF() return 'Utf'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableHolidayCalendar.metaBean()"})
  void testMetaBean_givenObjectInputStreamReadUTFReturnUtf_thenReturnInstance() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    Meta actualMetaBeanResult = ImmutableHolidayCalendar.readExternal(in).metaBean();

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertSame(Meta.INSTANCE, actualMetaBeanResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getHolidays()}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getHolidays()}
   */
  @Test
  @DisplayName(
      "Test getHolidays(); given TreeSet() add LocalDate with '1970' and one and one; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getHolidays()"})
  void testGetHolidays_givenTreeSetAddLocalDateWith1970AndOneAndOne_thenReturnSizeIsOne() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertEquals(1, ofResult.getHolidays().size());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getHolidays()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getHolidays()}
   */
  @Test
  @DisplayName("Test getHolidays(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getHolidays()"})
  void testGetHolidays_thenReturnEmpty() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.getHolidays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getHolidays()}.
   *
   * <ul>
   *   <li>Then return size is twenty-six.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getHolidays()}
   */
  @Test
  @DisplayName("Test getHolidays(); then return size is twenty-six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getHolidays()"})
  void testGetHolidays_thenReturnSizeIsTwentySix() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableSortedSet<LocalDate> actualHolidays =
        ImmutableHolidayCalendar.readExternal(in).getHolidays();

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(26, actualHolidays.size());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getHolidays()}.
   *
   * <ul>
   *   <li>Then return size is two hundred seventy.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getHolidays()}
   */
  @Test
  @DisplayName("Test getHolidays(); then return size is two hundred seventy")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getHolidays()"})
  void testGetHolidays_thenReturnSizeIsTwoHundredSeventy() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 31);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableSortedSet<LocalDate> actualHolidays =
        ImmutableHolidayCalendar.readExternal(in).getHolidays();

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(270, actualHolidays.size());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code MONDAY}.
   *   <li>Then return contains {@code TUESDAY}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName(
      "Test getWeekendDays(); given HashSet() add 'MONDAY'; then return contains 'TUESDAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddMonday_thenReturnContainsTuesday() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.WEDNESDAY);
    weekendDays.add(DayOfWeek.MONDAY);
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.FRIDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    ImmutableSet<DayOfWeek> actualWeekendDays = ofResult.getWeekendDays();

    // Assert
    assertEquals(4, actualWeekendDays.size());
    assertTrue(actualWeekendDays.contains(DayOfWeek.FRIDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.TUESDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.WEDNESDAY));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code MONDAY}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName("Test getWeekendDays(); given HashSet() add 'MONDAY'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddMonday_thenReturnHashSet() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.MONDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertEquals(weekendDays, ofResult.getWeekendDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code MONDAY}.
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName("Test getWeekendDays(); given HashSet() add 'MONDAY'; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddMonday_thenReturnSizeIsFive() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.MONDAY);
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.WEDNESDAY);
    weekendDays.add(DayOfWeek.THURSDAY);
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.FRIDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    ImmutableSet<DayOfWeek> actualWeekendDays = ofResult.getWeekendDays();

    // Assert
    assertEquals(5, actualWeekendDays.size());
    assertTrue(actualWeekendDays.contains(DayOfWeek.FRIDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.THURSDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.WEDNESDAY));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code SATURDAY}.
   *   <li>Then return contains {@code SATURDAY}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName(
      "Test getWeekendDays(); given HashSet() add 'SATURDAY'; then return contains 'SATURDAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddSaturday_thenReturnContainsSaturday() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.WEDNESDAY);
    weekendDays.add(DayOfWeek.THURSDAY);
    weekendDays.add(DayOfWeek.SATURDAY);
    weekendDays.add(DayOfWeek.FRIDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    ImmutableSet<DayOfWeek> actualWeekendDays = ofResult.getWeekendDays();

    // Assert
    assertEquals(4, actualWeekendDays.size());
    assertTrue(actualWeekendDays.contains(DayOfWeek.FRIDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.THURSDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.WEDNESDAY));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code SATURDAY}.
   *   <li>Then return contains {@code SATURDAY}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName(
      "Test getWeekendDays(); given HashSet() add 'SATURDAY'; then return contains 'SATURDAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddSaturday_thenReturnContainsSaturday2() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.WEDNESDAY);
    weekendDays.add(DayOfWeek.THURSDAY);
    weekendDays.add(DayOfWeek.SATURDAY);
    weekendDays.add(DayOfWeek.MONDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    ImmutableSet<DayOfWeek> actualWeekendDays = ofResult.getWeekendDays();

    // Assert
    assertEquals(4, actualWeekendDays.size());
    assertTrue(actualWeekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.THURSDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.WEDNESDAY));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code SATURDAY}.
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName("Test getWeekendDays(); given HashSet() add 'SATURDAY'; then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddSaturday_thenReturnSizeIsSix() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.MONDAY);
    weekendDays.add(DayOfWeek.SATURDAY);
    weekendDays.add(DayOfWeek.WEDNESDAY);
    weekendDays.add(DayOfWeek.THURSDAY);
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.FRIDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    ImmutableSet<DayOfWeek> actualWeekendDays = ofResult.getWeekendDays();

    // Assert
    assertEquals(6, actualWeekendDays.size());
    assertTrue(actualWeekendDays.contains(DayOfWeek.FRIDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.SATURDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.THURSDAY));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code THURSDAY}.
   *   <li>Then return contains {@code TUESDAY}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName(
      "Test getWeekendDays(); given HashSet() add 'THURSDAY'; then return contains 'TUESDAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddThursday_thenReturnContainsTuesday() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.WEDNESDAY);
    weekendDays.add(DayOfWeek.THURSDAY);
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.FRIDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    ImmutableSet<DayOfWeek> actualWeekendDays = ofResult.getWeekendDays();

    // Assert
    assertEquals(4, actualWeekendDays.size());
    assertTrue(actualWeekendDays.contains(DayOfWeek.FRIDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.THURSDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.TUESDAY));
    assertTrue(actualWeekendDays.contains(DayOfWeek.WEDNESDAY));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code TUESDAY}.
   *   <li>Then return {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName("Test getWeekendDays(); given HashSet() add 'TUESDAY'; then return HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenHashSetAddTuesday_thenReturnHashSet() {
    // Arrange
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    weekendDays.add(DayOfWeek.TUESDAY);
    weekendDays.add(DayOfWeek.FRIDAY);
    TreeSet<LocalDate> holidays = new TreeSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertEquals(weekendDays, ofResult.getWeekendDays());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readUTF()} return {@code Utf}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName(
      "Test getWeekendDays(); given ObjectInputStream readUTF() return 'Utf'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_givenObjectInputStreamReadUTFReturnUtf_thenReturnSizeIsOne()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableSet<DayOfWeek> actualWeekendDays =
        ImmutableHolidayCalendar.readExternal(in).getWeekendDays();

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(1, actualWeekendDays.size());
    assertTrue(actualWeekendDays.contains(DayOfWeek.MONDAY));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWeekendDays()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWeekendDays()}
   */
  @Test
  @DisplayName("Test getWeekendDays(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ImmutableHolidayCalendar.getWeekendDays()"})
  void testGetWeekendDays_thenReturnEmpty() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.getWeekendDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWorkingDays()}.
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWorkingDays()}
   */
  @Test
  @DisplayName("Test getWorkingDays()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getWorkingDays()"})
  void testGetWorkingDays() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWorkingDays()}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return one.
   *   <li>Then calls {@link ObjectInputStream#readFully(byte[])}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWorkingDays()}
   */
  @Test
  @DisplayName(
      "Test getWorkingDays(); given ObjectInputStream readShort() return one; then calls readFully(byte[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getWorkingDays()"})
  void testGetWorkingDays_givenObjectInputStreamReadShortReturnOne_thenCallsReadFully()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableSortedSet<LocalDate> actualWorkingDays =
        ImmutableHolidayCalendar.readExternal(in).getWorkingDays();

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertTrue(actualWorkingDays.isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWorkingDays()}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return thirty-one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWorkingDays()}
   */
  @Test
  @DisplayName("Test getWorkingDays(); given ObjectInputStream readShort() return thirty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getWorkingDays()"})
  void testGetWorkingDays_givenObjectInputStreamReadShortReturnThirtyOne() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 31);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableSortedSet<LocalDate> actualWorkingDays =
        ImmutableHolidayCalendar.readExternal(in).getWorkingDays();

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertTrue(actualWorkingDays.isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#getWorkingDays()}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#getWorkingDays()}
   */
  @Test
  @DisplayName(
      "Test getWorkingDays(); given TreeSet() add LocalDate with '1970' and one and one; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSortedSet ImmutableHolidayCalendar.getWorkingDays()"})
  void testGetWorkingDays_givenTreeSetAddLocalDateWith1970AndOneAndOne_thenReturnEmpty() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.getWorkingDays().isEmpty());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return {@code
   *       1970}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isHoliday(LocalDate); given ObjectInputStream readShort() return '1970'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_givenObjectInputStreamReadShortReturn1970_thenReturnTrue() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    boolean actualIsHolidayResult =
        ImmutableHolidayCalendar.readExternal(in).isHoliday(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertTrue(actualIsHolidayResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isHoliday(LocalDate); given ObjectInputStream readShort() return one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_givenObjectInputStreamReadShortReturnOne_thenReturnFalse() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    boolean actualIsHolidayResult =
        ImmutableHolidayCalendar.readExternal(in).isHoliday(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertFalse(actualIsHolidayResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return twelve.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isHoliday(LocalDate); given ObjectInputStream readShort() return twelve; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_givenObjectInputStreamReadShortReturnTwelve_thenReturnTrue()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 12);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    boolean actualIsHolidayResult =
        ImmutableHolidayCalendar.readExternal(in).isHoliday(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertTrue(actualIsHolidayResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay minus one and twelve.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isHoliday(LocalDate); when ofYearDay minus one and twelve; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_whenOfYearDayMinusOneAndTwelve_thenThrowIllegalArgumentException()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ImmutableHolidayCalendar.readExternal(in).isHoliday(LocalDate.ofYearDay(-1, 12)));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test {@link ImmutableHolidayCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-02-04}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int); then return toString is '1970-02-04'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.shift(LocalDate, int)"})
  void testShift_thenReturnToStringIs19700204() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 59);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualShiftResult =
        ImmutableHolidayCalendar.readExternal(in).shift(LocalDate.of(1970, 1, 1), 10);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1970-02-04", actualShiftResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return toString is {@code 1969-12-31}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int); when minus one; then return toString is '1969-12-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.shift(LocalDate, int)"})
  void testShift_whenMinusOne_thenReturnToStringIs19691231() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualShiftResult =
        ImmutableHolidayCalendar.readExternal(in).shift(LocalDate.of(1970, 1, 1), -1);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1969-12-31", actualShiftResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return toString is {@code 1970-01-13}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int); when ten; then return toString is '1970-01-13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.shift(LocalDate, int)"})
  void testShift_whenTen_thenReturnToStringIs19700113() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualShiftResult =
        ImmutableHolidayCalendar.readExternal(in).shift(LocalDate.of(1970, 1, 1), 10);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1970-01-13", actualShiftResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test shift(LocalDate, int); when zero; then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.shift(LocalDate, int)"})
  void testShift_whenZero_thenReturnLocalDateWith1970AndOneAndOne() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualShiftResult = ImmutableHolidayCalendar.readExternal(in).shift(date, 0);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertSame(date, actualShiftResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return one.
   *   <li>Then return toString is {@code 1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); given ObjectInputStream readShort() return one; then return toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.next(LocalDate)"})
  void testNext_givenObjectInputStreamReadShortReturnOne_thenReturnToStringIs19700102()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualNextResult =
        ImmutableHolidayCalendar.readExternal(in).next(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1970-01-02", actualNextResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate); given TreeSet() add LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.next(LocalDate)"})
  void testNext_givenTreeSetAddLocalDateWith1970AndOneAndOne() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    LocalDate actualNextResult = ofResult.next(LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals("1970-01-02", actualNextResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-04}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate); then return toString is '1970-01-04'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.next(LocalDate)"})
  void testNext_thenReturnToStringIs19700104() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 59);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualNextResult =
        ImmutableHolidayCalendar.readExternal(in).next(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1970-01-04", actualNextResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); when ofEpochDay minus one; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.next(LocalDate)"})
  void testNext_whenOfEpochDayMinusOne_thenReturnToStringIs19700101() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualNextResult =
        ImmutableHolidayCalendar.readExternal(in).next(LocalDate.ofEpochDay(-1L));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1970-01-01", actualNextResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay minus one and one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); when ofYearDay minus one and one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.next(LocalDate)"})
  void testNext_whenOfYearDayMinusOneAndOne_thenThrowIllegalArgumentException() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ImmutableHolidayCalendar.readExternal(in).next(LocalDate.ofYearDay(-1, 1)));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test {@link ImmutableHolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay one and one.
   *   <li>Then return toString is {@code 0001-02-01}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); when ofYearDay one and one; then return toString is '0001-02-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.next(LocalDate)"})
  void testNext_whenOfYearDayOneAndOne_thenReturnToStringIs00010201() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualNextResult =
        ImmutableHolidayCalendar.readExternal(in).next(LocalDate.ofYearDay(1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("0001-02-01", actualNextResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#previous(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return {@code
   *       1970}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate); given ObjectInputStream readShort() return '1970'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.previous(LocalDate)"})
  void testPrevious_givenObjectInputStreamReadShortReturn1970() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualPreviousResult =
        ImmutableHolidayCalendar.readExternal(in).previous(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1969-12-31", actualPreviousResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#previous(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test previous(LocalDate); given TreeSet() add LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.previous(LocalDate)"})
  void testPrevious_givenTreeSetAddLocalDateWith1970AndOneAndOne() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    LocalDate actualPreviousResult = ofResult.previous(LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals("1969-12-31", actualPreviousResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#previous(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1968-12-31}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate); then return toString is '1968-12-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.previous(LocalDate)"})
  void testPrevious_thenReturnToStringIs19681231() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1969);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualPreviousResult =
        ImmutableHolidayCalendar.readExternal(in).previous(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1968-12-31", actualPreviousResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#previous(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1969-12-30}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate); then return toString is '1969-12-30'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.previous(LocalDate)"})
  void testPrevious_thenReturnToStringIs19691230() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 12);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualPreviousResult =
        ImmutableHolidayCalendar.readExternal(in).previous(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1969-12-30", actualPreviousResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#previous(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1969-12-31}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate); then return toString is '1969-12-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.previous(LocalDate)"})
  void testPrevious_thenReturnToStringIs19691231() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualPreviousResult =
        ImmutableHolidayCalendar.readExternal(in).previous(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1969-12-31", actualPreviousResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#previous(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay minus one and one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test previous(LocalDate); when ofYearDay minus one and one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.previous(LocalDate)"})
  void testPrevious_whenOfYearDayMinusOneAndOne_thenThrowIllegalArgumentException()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ImmutableHolidayCalendar.readExternal(in).previous(LocalDate.ofYearDay(-1, 1)));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test nextSameOrLastInMonth(LocalDate); given TreeSet() add LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth_givenTreeSetAddLocalDateWith1970AndOneAndOne() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        ofResult.nextSameOrLastInMonth(LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals("1970-01-02", actualNextSameOrLastInMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test nextSameOrLastInMonth(LocalDate); then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth_thenReturnLocalDateWith1970AndOneAndOne() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        ImmutableHolidayCalendar.readExternal(in).nextSameOrLastInMonth(date);

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1969-12-28}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate); then return toString is '1969-12-28'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth_thenReturnToStringIs19691228() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 31);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        ImmutableHolidayCalendar.readExternal(in).nextSameOrLastInMonth(LocalDate.ofEpochDay(-1L));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1969-12-28", actualNextSameOrLastInMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1969-12-30}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate); then return toString is '1969-12-30'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth_thenReturnToStringIs19691230() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 12);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        ImmutableHolidayCalendar.readExternal(in).nextSameOrLastInMonth(LocalDate.ofEpochDay(-1L));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1969-12-30", actualNextSameOrLastInMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate); then return toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth_thenReturnToStringIs19700102() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 12);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        ImmutableHolidayCalendar.readExternal(in).nextSameOrLastInMonth(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1970-01-02", actualNextSameOrLastInMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth_thenThrowIllegalArgumentException() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ImmutableHolidayCalendar.readExternal(in)
                .nextSameOrLastInMonth(LocalDate.ofYearDay(-1, 12)));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return {@code
   *       1970}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isLastBusinessDayOfMonth(LocalDate); given ObjectInputStream readShort() return '1970'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth_givenObjectInputStreamReadShortReturn1970() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    boolean actualIsLastBusinessDayOfMonthResult =
        ImmutableHolidayCalendar.readExternal(in)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertFalse(actualIsLastBusinessDayOfMonthResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isLastBusinessDayOfMonth(LocalDate); given ObjectInputStream readShort() return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth_givenObjectInputStreamReadShortReturnOne() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    boolean actualIsLastBusinessDayOfMonthResult =
        ImmutableHolidayCalendar.readExternal(in)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertFalse(actualIsLastBusinessDayOfMonthResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return twelve.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isLastBusinessDayOfMonth(LocalDate); given ObjectInputStream readShort() return twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth_givenObjectInputStreamReadShortReturnTwelve()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 12);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    boolean actualIsLastBusinessDayOfMonthResult =
        ImmutableHolidayCalendar.readExternal(in)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertFalse(actualIsLastBusinessDayOfMonthResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isLastBusinessDayOfMonth(LocalDate); given TreeSet() add LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth_givenTreeSetAddLocalDateWith1970AndOneAndOne() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.isLastBusinessDayOfMonth(LocalDate.ofEpochDay(-1L)));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add ofEpochDay twelve.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isLastBusinessDayOfMonth(LocalDate); given TreeSet() add ofEpochDay twelve; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth_givenTreeSetAddOfEpochDayTwelve_thenReturnTrue() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.ofEpochDay(12L));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.isLastBusinessDayOfMonth(LocalDate.ofEpochDay(-1L)));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth_thenReturnTrue() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.isLastBusinessDayOfMonth(LocalDate.ofEpochDay(-1L)));
  }

  /**
   * Test {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay twelve.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate); when ofEpochDay twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ImmutableHolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth_whenOfEpochDayTwelve() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 12);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    boolean actualIsLastBusinessDayOfMonthResult =
        ImmutableHolidayCalendar.readExternal(in)
            .isLastBusinessDayOfMonth(LocalDate.ofEpochDay(12L));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertFalse(actualIsLastBusinessDayOfMonthResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link TreeSet#TreeSet()} add {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test lastBusinessDayOfMonth(LocalDate); given TreeSet() add LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_givenTreeSetAddLocalDateWith1970AndOneAndOne() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    holidays.add(LocalDate.of(1970, 1, 1));
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar ofResult =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    LocalDate actualLastBusinessDayOfMonthResult =
        ofResult.lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1));

    // Assert
    assertEquals("1970-01-31", actualLastBusinessDayOfMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 0012-01-29}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate); then return toString is '0012-01-29'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_thenReturnToStringIs00120129() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 59);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualLastBusinessDayOfMonthResult =
        ImmutableHolidayCalendar.readExternal(in)
            .lastBusinessDayOfMonth(LocalDate.ofYearDay(12, 12));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("0012-01-29", actualLastBusinessDayOfMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 0012-01-30}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate); then return toString is '0012-01-30'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_thenReturnToStringIs00120130() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualLastBusinessDayOfMonthResult =
        ImmutableHolidayCalendar.readExternal(in)
            .lastBusinessDayOfMonth(LocalDate.ofYearDay(12, 12));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("0012-01-30", actualLastBusinessDayOfMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-31}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate); then return toString is '1970-01-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_thenReturnToStringIs19700131() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    LocalDate actualLastBusinessDayOfMonthResult =
        ImmutableHolidayCalendar.readExternal(in).lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals("1970-01-31", actualLastBusinessDayOfMonthResult.toString());
  }

  /**
   * Test {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay {@code 10000} and twelve.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate); when ofYearDay '10000' and twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_whenOfYearDay10000AndTwelve() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ImmutableHolidayCalendar.readExternal(in)
                .lastBusinessDayOfMonth(LocalDate.ofYearDay(10000, 12)));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay minus one and twelve.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate); when ofYearDay minus one and twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ImmutableHolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_whenOfYearDayMinusOneAndTwelve() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ImmutableHolidayCalendar.readExternal(in)
                .lastBusinessDayOfMonth(LocalDate.ofYearDay(-1, 12)));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return {@code
   *       1970}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test daysBetween(LocalDate, LocalDate); given ObjectInputStream readShort() return '1970'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmutableHolidayCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_givenObjectInputStreamReadShortReturn1970_thenReturnZero()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    int actualDaysBetweenResult =
        ImmutableHolidayCalendar.readExternal(in)
            .daysBetween(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(0, actualDaysBetweenResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return {@code
   *       1970}.
   *   <li>When now.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test daysBetween(LocalDate, LocalDate); given ObjectInputStream readShort() return '1970'; when now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmutableHolidayCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_givenObjectInputStreamReadShortReturn1970_whenNow() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1970);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    ImmutableHolidayCalendar.readExternal(in)
        .daysBetween(LocalDate.of(1970, 1, 1), LocalDate.now());

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
  }

  /**
   * Test {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link ObjectInputStream} {@link ObjectInputStream#readShort()} return one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test daysBetween(LocalDate, LocalDate); given ObjectInputStream readShort() return one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmutableHolidayCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_givenObjectInputStreamReadShortReturnOne_thenReturnZero()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    int actualDaysBetweenResult =
        ImmutableHolidayCalendar.readExternal(in)
            .daysBetween(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(0, actualDaysBetweenResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay fifty-nine.
   *   <li>Then return fifty-one.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test daysBetween(LocalDate, LocalDate); when ofEpochDay fifty-nine; then return fifty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmutableHolidayCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_whenOfEpochDayFiftyNine_thenReturnFiftyOne() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    int actualDaysBetweenResult =
        ImmutableHolidayCalendar.readExternal(in)
            .daysBetween(LocalDate.of(1970, 1, 1), LocalDate.ofEpochDay(59L));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(51, actualDaysBetweenResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay twelve.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test daysBetween(LocalDate, LocalDate); when ofEpochDay twelve; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmutableHolidayCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_whenOfEpochDayTwelve_thenReturnTen() throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act
    int actualDaysBetweenResult =
        ImmutableHolidayCalendar.readExternal(in)
            .daysBetween(LocalDate.of(1970, 1, 1), LocalDate.ofEpochDay(12L));

    // Assert
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
    assertEquals(10, actualDaysBetweenResult);
  }

  /**
   * Test {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay {@code -1958} and twelve.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableHolidayCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test daysBetween(LocalDate, LocalDate); when ofYearDay '-1958' and twelve; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ImmutableHolidayCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_whenOfYearDay1958AndTwelve_thenThrowIllegalArgumentException()
      throws IOException {
    // Arrange
    ObjectInputStream in = mock(ObjectInputStream.class);
    when(in.readUTF()).thenReturn("Utf");
    when(in.readShort()).thenReturn((short) 1);
    doNothing().when(in).readFully(Mockito.<byte[]>any());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ImmutableHolidayCalendar.readExternal(in)
                .daysBetween(LocalDate.ofYearDay(-1958, 12), LocalDate.of(1970, 1, 1)));
    verify(in).readFully(isA(byte[].class));
    verify(in, atLeast(1)).readShort();
    verify(in).readUTF();
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
