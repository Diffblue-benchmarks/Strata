package com.opengamma.strata.basics.date;

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
import com.opengamma.strata.basics.date.HolidayCalendarTest.MockEomHolCal;
import com.opengamma.strata.basics.date.LinkedHolidayCalendar.Meta;
import java.time.LocalDate;
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

class LinkedHolidayCalendarDiffblueTest {
  /**
   * Test {@link LinkedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId LinkedHolidayCalendar.getId()"})
  void testGetId() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new LinkedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link LinkedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Given {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar,
   *       HolidayCalendar)} with calendar1 is {@link HolidayCalendars#FRI_SAT} and calendar2 is
   *       {@link HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName(
      "Test getId(); given LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar) with calendar1 is FRI_SAT and calendar2 is FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId LinkedHolidayCalendar.getId()"})
  void testGetId_givenLinkedHolidayCalendarWithCalendar1IsFri_satAndCalendar2IsFri_sat() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link LinkedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Then return Name is {@code Fri/Sat~MockEom}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId(); then return Name is 'Fri/Sat~MockEom'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId LinkedHolidayCalendar.getId()"})
  void testGetId_thenReturnNameIsFriSatMockEom() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new LinkedHolidayCalendar(new MockEomHolCal(), HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat~MockEom", actualId.getName());
    assertEquals("Fri/Sat~MockEom", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link LinkedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Then return Name is {@code Fri/Sat~Sat/Sun}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId(); then return Name is 'Fri/Sat~Sat/Sun'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId LinkedHolidayCalendar.getId()"})
  void testGetId_thenReturnNameIsFriSatSatSun() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new LinkedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat~Sat/Sun", actualId.getName());
    assertEquals("Fri/Sat~Sat/Sun", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link LinkedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Then return Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId(); then return Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId LinkedHolidayCalendar.getId()"})
  void testGetId_thenReturnNameIsNoHolidays() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new LinkedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("NoHolidays", actualId.getName());
    assertEquals("NoHolidays", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link LinkedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday() {
    // Arrange, Act and Assert
    assertFalse(
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LinkedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday2() {
    // Arrange, Act and Assert
    assertFalse(
        new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LinkedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday3() {
    // Arrange, Act and Assert
    assertFalse(
        new LinkedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LinkedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday4() {
    // Arrange, Act and Assert
    assertFalse(
        new LinkedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.NO_HOLIDAYS)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LinkedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday5() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            HolidayCalendars.THU_FRI,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(linkedHolidayCalendar.isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LinkedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LinkedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(
        new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.THU_FRI)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LinkedHolidayCalendar#meta()}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LinkedHolidayCalendar.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LinkedHolidayCalendar.meta();

    // Assert
    MetaProperty<HolidayCalendar> calendar1Result = actualMetaResult.calendar1();
    assertTrue(calendar1Result instanceof DirectMetaProperty);
    MetaProperty<HolidayCalendar> calendar2Result = actualMetaResult.calendar2();
    assertTrue(calendar2Result instanceof DirectMetaProperty);
    assertEquals("calendar1", calendar1Result.name());
    assertEquals("calendar2", calendar2Result.name());
    assertEquals(PropertyStyle.IMMUTABLE, calendar1Result.style());
    assertEquals(PropertyStyle.IMMUTABLE, calendar2Result.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, calendar1Result.propertyType());
    Class<HolidayCalendar> expectedPropertyTypeResult2 = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult2, calendar2Result.propertyType());
    Class<LinkedHolidayCalendar> expectedDeclaringTypeResult = LinkedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, calendar1Result.declaringType());
    Class<LinkedHolidayCalendar> expectedDeclaringTypeResult2 = LinkedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult2, calendar2Result.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, calendar1Result.metaBean());
    assertSame(meta, calendar2Result.metaBean());
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
    Class<? extends LinkedHolidayCalendar> actualBeanTypeResult =
        LinkedHolidayCalendar.meta().beanType();

    // Assert
    Class<LinkedHolidayCalendar> expectedBeanTypeResult = LinkedHolidayCalendar.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#calendar1()}
   *   <li>{@link Meta#calendar2()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.calendar1()", "MetaProperty Meta.calendar2()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = LinkedHolidayCalendar.meta();

    // Act
    MetaProperty<HolidayCalendar> actualCalendar1Result = metaResult.calendar1();

    // Assert
    assertTrue(actualCalendar1Result instanceof DirectMetaProperty);
    assertTrue(metaResult.calendar2() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean calendar1 return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean calendar1 return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanCalendar1ReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        LinkedHolidayCalendar.meta().metaPropertyGet("calendar2");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendar> calendar1Result = ((Meta) metaBeanResult).calendar1();
    assertTrue(calendar1Result instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("calendar1", calendar1Result.name());
    assertEquals("calendar2", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, calendar1Result.style());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, calendar1Result.propertyType());
    Class<LinkedHolidayCalendar> expectedDeclaringTypeResult = LinkedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, calendar1Result.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).calendar2());
    assertSame(Meta.INSTANCE, calendar1Result.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean calendar2 return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean calendar2 return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanCalendar2ReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        LinkedHolidayCalendar.meta().metaPropertyGet("calendar1");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendar> calendar2Result = ((Meta) metaBeanResult).calendar2();
    assertTrue(calendar2Result instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("calendar1", actualMetaPropertyGetResult.name());
    assertEquals("calendar2", calendar2Result.name());
    assertEquals(PropertyStyle.IMMUTABLE, calendar2Result.style());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, calendar2Result.propertyType());
    Class<LinkedHolidayCalendar> expectedDeclaringTypeResult = LinkedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, calendar2Result.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).calendar1());
    assertSame(Meta.INSTANCE, calendar2Result.metaBean());
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
    assertNull(LinkedHolidayCalendar.meta().metaPropertyGet("Property Name"));
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
        LinkedHolidayCalendar.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("calendar1");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("calendar2");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("calendar1", getResult.name());
    assertEquals("calendar2", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<HolidayCalendar> expectedPropertyTypeResult2 = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<LinkedHolidayCalendar> expectedDeclaringTypeResult = LinkedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<LinkedHolidayCalendar> expectedDeclaringTypeResult2 = LinkedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    Meta metaResult = LinkedHolidayCalendar.meta();
    LinkedHolidayCalendar bean =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "calendar1", true);

    // Assert
    WeekendHolidayCalendar weekendHolidayCalendar =
        ((WeekendHolidayCalendar) actualPropertyGetResult).FRI_SAT;
    assertSame(weekendHolidayCalendar, bean.getCalendar1());
    assertSame(weekendHolidayCalendar, bean.getCalendar2());
    assertSame(weekendHolidayCalendar, actualPropertyGetResult);
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
  void testMetaPropertyGet2() {
    // Arrange
    Meta metaResult = LinkedHolidayCalendar.meta();
    LinkedHolidayCalendar bean =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "calendar2", true);

    // Assert
    WeekendHolidayCalendar weekendHolidayCalendar =
        ((WeekendHolidayCalendar) actualPropertyGetResult).FRI_SAT;
    assertSame(weekendHolidayCalendar, bean.getCalendar1());
    assertSame(weekendHolidayCalendar, bean.getCalendar2());
    assertSame(weekendHolidayCalendar, actualPropertyGetResult);
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
    assertNull(LinkedHolidayCalendar.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = LinkedHolidayCalendar.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code calendar1}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'calendar1'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCalendar1_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            LinkedHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "calendar1", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code calendar2}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'calendar2'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCalendar2_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            LinkedHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "calendar2", "New Value", true));
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
            LinkedHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "calendar1", "New Value", false));
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
            LinkedHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return Name is {@code Fri/Sat}.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar,
   * HolidayCalendar)}
   */
  @Test
  @DisplayName(
      "Test new LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar); when FRI_SAT; then return Name is 'Fri/Sat'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LinkedHolidayCalendar.<init>(HolidayCalendar, HolidayCalendar)"})
  void testNewLinkedHolidayCalendar_whenFri_sat_thenReturnNameIsFriSat() {
    // Arrange
    HolidayCalendar calendar2 = HolidayCalendars.FRI_SAT;

    // Act
    LinkedHolidayCalendar actualLinkedHolidayCalendar =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, calendar2);

    // Assert
    assertEquals("Fri/Sat", actualLinkedHolidayCalendar.getName());
    HolidayCalendarId id = actualLinkedHolidayCalendar.getId();
    assertEquals("Fri/Sat", id.getName());
    assertEquals("Fri/Sat", id.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
    WeekendHolidayCalendar weekendHolidayCalendar = ((WeekendHolidayCalendar) calendar2).FRI_SAT;
    assertSame(weekendHolidayCalendar, actualLinkedHolidayCalendar.getCalendar1());
    assertSame(weekendHolidayCalendar, actualLinkedHolidayCalendar.getCalendar2());
  }

  /**
   * Test {@link LinkedHolidayCalendar#metaBean()}.
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LinkedHolidayCalendar.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LinkedHolidayCalendar#toString()}
   *   <li>{@link LinkedHolidayCalendar#getCalendar1()}
   *   <li>{@link LinkedHolidayCalendar#getCalendar2()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HolidayCalendar LinkedHolidayCalendar.getCalendar1()",
    "HolidayCalendar LinkedHolidayCalendar.getCalendar2()",
    "String LinkedHolidayCalendar.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act
    String actualToStringResult = linkedHolidayCalendar.toString();
    HolidayCalendar actualCalendar1 = linkedHolidayCalendar.getCalendar1();
    HolidayCalendar actualCalendar2 = linkedHolidayCalendar.getCalendar2();

    // Assert
    assertEquals("HolidayCalendar[Fri/Sat]", actualToStringResult);
    WeekendHolidayCalendar weekendHolidayCalendar =
        ((WeekendHolidayCalendar) actualCalendar2).FRI_SAT;
    assertSame(weekendHolidayCalendar, actualCalendar1);
    assertSame(weekendHolidayCalendar, actualCalendar2);
  }

  /**
   * Test {@link LinkedHolidayCalendar#equals(Object)}, and {@link
   * LinkedHolidayCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LinkedHolidayCalendar#equals(Object)}
   *   <li>{@link LinkedHolidayCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinkedHolidayCalendar.equals(Object)",
    "int LinkedHolidayCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);
    LinkedHolidayCalendar linkedHolidayCalendar2 =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertEquals(linkedHolidayCalendar, linkedHolidayCalendar2);
    assertEquals(linkedHolidayCalendar.hashCode(), linkedHolidayCalendar2.hashCode());
  }

  /**
   * Test {@link LinkedHolidayCalendar#equals(Object)}, and {@link
   * LinkedHolidayCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LinkedHolidayCalendar#equals(Object)}
   *   <li>{@link LinkedHolidayCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinkedHolidayCalendar.equals(Object)",
    "int LinkedHolidayCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertEquals(linkedHolidayCalendar, linkedHolidayCalendar);
    int expectedHashCodeResult = linkedHolidayCalendar.hashCode();
    assertEquals(expectedHashCodeResult, linkedHolidayCalendar.hashCode());
  }

  /**
   * Test {@link LinkedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinkedHolidayCalendar.equals(Object)",
    "int LinkedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        linkedHolidayCalendar,
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
  }

  /**
   * Test {@link LinkedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinkedHolidayCalendar.equals(Object)",
    "int LinkedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
            HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        linkedHolidayCalendar,
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
  }

  /**
   * Test {@link LinkedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinkedHolidayCalendar.equals(Object)",
    "int LinkedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT), null);
  }

  /**
   * Test {@link LinkedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LinkedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LinkedHolidayCalendar.equals(Object)",
    "int LinkedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
        "Different type to LinkedHolidayCalendar");
  }
}
