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
import com.opengamma.strata.basics.date.WeekendHolidayCalendar.Meta;
import java.time.DayOfWeek;
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

class WeekendHolidayCalendarDiffblueTest {
  /**
   * Test {@link WeekendHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link WeekendHolidayCalendar#FRI_SAT}.
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isHoliday(LocalDate); given FRI_SAT; when LocalDate with '1970' and one and one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeekendHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_givenFri_sat_whenLocalDateWith1970AndOneAndOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(WeekendHolidayCalendar.FRI_SAT.isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link WeekendHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link WeekendHolidayCalendar#THU_FRI}.
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isHoliday(LocalDate); given THU_FRI; when LocalDate with '1970' and one and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeekendHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_givenThu_fri_whenLocalDateWith1970AndOneAndOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(WeekendHolidayCalendar.THU_FRI.isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link WeekendHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link WeekendHolidayCalendar#THU_FRI}.
   *   <li>When ofEpochDay one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate); given THU_FRI; when ofEpochDay one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean WeekendHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday_givenThu_fri_whenOfEpochDayOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(WeekendHolidayCalendar.THU_FRI.isHoliday(LocalDate.ofEpochDay(1L)));
  }

  /**
   * Test {@link WeekendHolidayCalendar#equals(Object)}, and {@link
   * WeekendHolidayCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link WeekendHolidayCalendar#equals(Object)}
   *   <li>{@link WeekendHolidayCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean WeekendHolidayCalendar.equals(Object)",
    "int WeekendHolidayCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    WeekendHolidayCalendar weekendHolidayCalendar = WeekendHolidayCalendar.FRI_SAT;
    WeekendHolidayCalendar weekendHolidayCalendar2 = WeekendHolidayCalendar.FRI_SAT;

    // Act and Assert
    assertEquals(weekendHolidayCalendar, weekendHolidayCalendar2);
    assertEquals(weekendHolidayCalendar.hashCode(), weekendHolidayCalendar2.hashCode());
  }

  /**
   * Test {@link WeekendHolidayCalendar#equals(Object)}, and {@link
   * WeekendHolidayCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link WeekendHolidayCalendar#equals(Object)}
   *   <li>{@link WeekendHolidayCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean WeekendHolidayCalendar.equals(Object)",
    "int WeekendHolidayCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    WeekendHolidayCalendar weekendHolidayCalendar = WeekendHolidayCalendar.FRI_SAT;

    // Act and Assert
    assertEquals(weekendHolidayCalendar, weekendHolidayCalendar);
    int expectedHashCodeResult = weekendHolidayCalendar.hashCode();
    assertEquals(expectedHashCodeResult, weekendHolidayCalendar.hashCode());
  }

  /**
   * Test {@link WeekendHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean WeekendHolidayCalendar.equals(Object)",
    "int WeekendHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(WeekendHolidayCalendar.SAT_SUN, WeekendHolidayCalendar.FRI_SAT);
  }

  /**
   * Test {@link WeekendHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean WeekendHolidayCalendar.equals(Object)",
    "int WeekendHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(WeekendHolidayCalendar.FRI_SAT, null);
  }

  /**
   * Test {@link WeekendHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean WeekendHolidayCalendar.equals(Object)",
    "int WeekendHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(WeekendHolidayCalendar.FRI_SAT, "Different type to WeekendHolidayCalendar");
  }

  /**
   * Test {@link WeekendHolidayCalendar#meta()}.
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta WeekendHolidayCalendar.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = WeekendHolidayCalendar.meta();

    // Assert
    MetaProperty<DayOfWeek> day1Result = actualMetaResult.day1();
    assertTrue(day1Result instanceof DirectMetaProperty);
    MetaProperty<DayOfWeek> day2Result = actualMetaResult.day2();
    assertTrue(day2Result instanceof DirectMetaProperty);
    MetaProperty<HolidayCalendarId> idResult = actualMetaResult.id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertEquals("day1", day1Result.name());
    assertEquals("day2", day2Result.name());
    assertEquals("id", idResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, day1Result.style());
    assertEquals(PropertyStyle.IMMUTABLE, day2Result.style());
    assertEquals(PropertyStyle.IMMUTABLE, idResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<HolidayCalendarId> expectedPropertyTypeResult = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult, idResult.propertyType());
    Class<WeekendHolidayCalendar> expectedDeclaringTypeResult = WeekendHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, day1Result.declaringType());
    Class<WeekendHolidayCalendar> expectedDeclaringTypeResult2 = WeekendHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult2, day2Result.declaringType());
    Class<WeekendHolidayCalendar> expectedDeclaringTypeResult3 = WeekendHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult3, idResult.declaringType());
    Class<DayOfWeek> expectedPropertyTypeResult2 = DayOfWeek.class;
    assertEquals(expectedPropertyTypeResult2, day1Result.propertyType());
    Class<DayOfWeek> expectedPropertyTypeResult3 = DayOfWeek.class;
    assertEquals(expectedPropertyTypeResult3, day2Result.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, day1Result.metaBean());
    assertSame(meta, day2Result.metaBean());
    assertSame(meta, idResult.metaBean());
  }

  /**
   * Test {@link WeekendHolidayCalendar#metaBean()}.
   *
   * <p>Method under test: {@link WeekendHolidayCalendar#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta WeekendHolidayCalendar.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, WeekendHolidayCalendar.FRI_SAT.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link WeekendHolidayCalendar#toString()}
   *   <li>{@link WeekendHolidayCalendar#getDay1()}
   *   <li>{@link WeekendHolidayCalendar#getDay2()}
   *   <li>{@link WeekendHolidayCalendar#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DayOfWeek WeekendHolidayCalendar.getDay1()",
    "DayOfWeek WeekendHolidayCalendar.getDay2()",
    "HolidayCalendarId WeekendHolidayCalendar.getId()",
    "String WeekendHolidayCalendar.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    WeekendHolidayCalendar weekendHolidayCalendar = WeekendHolidayCalendar.FRI_SAT;

    // Act
    String actualToStringResult = weekendHolidayCalendar.toString();
    DayOfWeek actualDay1 = weekendHolidayCalendar.getDay1();
    DayOfWeek actualDay2 = weekendHolidayCalendar.getDay2();
    HolidayCalendarId actualId = weekendHolidayCalendar.getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    assertEquals("HolidayCalendar[Fri/Sat]", actualToStringResult);
    assertEquals(DayOfWeek.FRIDAY, actualDay1);
    assertEquals(DayOfWeek.SATURDAY, actualDay2);
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
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
    Class<? extends WeekendHolidayCalendar> actualBeanTypeResult =
        WeekendHolidayCalendar.meta().beanType();

    // Assert
    Class<WeekendHolidayCalendar> expectedBeanTypeResult = WeekendHolidayCalendar.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#day1()}
   *   <li>{@link Meta#day2()}
   *   <li>{@link Meta#id()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.day1()",
    "MetaProperty Meta.day2()",
    "MetaProperty Meta.id()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = WeekendHolidayCalendar.meta();

    // Act
    MetaProperty<DayOfWeek> actualDay1Result = metaResult.day1();
    MetaProperty<DayOfWeek> actualDay2Result = metaResult.day2();

    // Assert
    assertTrue(actualDay1Result instanceof DirectMetaProperty);
    assertTrue(actualDay2Result instanceof DirectMetaProperty);
    assertTrue(metaResult.id() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code day1}.
   *   <li>Then return name is {@code day1}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'day1'; then return name is 'day1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDay1_thenReturnNameIsDay1() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        WeekendHolidayCalendar.meta().metaPropertyGet("day1");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayOfWeek> day2Result = ((Meta) metaBeanResult).day2();
    assertTrue(day2Result instanceof DirectMetaProperty);
    MetaProperty<HolidayCalendarId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("day1", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).day1());
    assertSame(metaBeanResult, day2Result.metaBean());
    assertSame(metaBeanResult, idResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code day2}.
   *   <li>Then return name is {@code day2}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'day2'; then return name is 'day2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDay2_thenReturnNameIsDay2() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        WeekendHolidayCalendar.meta().metaPropertyGet("day2");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayOfWeek> day1Result = ((Meta) metaBeanResult).day1();
    assertTrue(day1Result instanceof DirectMetaProperty);
    MetaProperty<HolidayCalendarId> idResult = ((Meta) metaBeanResult).id();
    assertTrue(idResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("day2", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).day2());
    assertSame(metaBeanResult, day1Result.metaBean());
    assertSame(metaBeanResult, idResult.metaBean());
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
        WeekendHolidayCalendar.meta().metaPropertyGet("id");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayOfWeek> day1Result = ((Meta) metaBeanResult).day1();
    assertTrue(day1Result instanceof DirectMetaProperty);
    MetaProperty<DayOfWeek> day2Result = ((Meta) metaBeanResult).day2();
    assertTrue(day2Result instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("id", actualMetaPropertyGetResult.name());
    Class<HolidayCalendarId> expectedPropertyTypeResult = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).id());
    assertSame(metaBeanResult, day1Result.metaBean());
    assertSame(metaBeanResult, day2Result.metaBean());
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
    assertNull(WeekendHolidayCalendar.meta().metaPropertyGet("Property Name"));
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
        WeekendHolidayCalendar.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("id");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("day1");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("day2");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("day1", getResult2.name());
    assertEquals("day2", getResult3.name());
    assertEquals("id", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<HolidayCalendarId> expectedPropertyTypeResult = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<WeekendHolidayCalendar> expectedDeclaringTypeResult = WeekendHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<WeekendHolidayCalendar> expectedDeclaringTypeResult2 = WeekendHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<WeekendHolidayCalendar> expectedDeclaringTypeResult3 = WeekendHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<DayOfWeek> expectedPropertyTypeResult2 = DayOfWeek.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<DayOfWeek> expectedPropertyTypeResult3 = DayOfWeek.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
    assertSame(meta, metaBeanResult);
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
    assertNull(WeekendHolidayCalendar.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code day1}.
   *   <li>Then return {@code FRIDAY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'day1'; then return 'FRIDAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDay1_thenReturnFriday() {
    // Arrange and Act
    Object actualPropertyGetResult =
        WeekendHolidayCalendar.meta().propertyGet(WeekendHolidayCalendar.FRI_SAT, "day1", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof DayOfWeek);
    assertEquals(DayOfWeek.FRIDAY, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code day2}.
   *   <li>Then return {@code SATURDAY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'day2'; then return 'SATURDAY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDay2_thenReturnSaturday() {
    // Arrange and Act
    Object actualPropertyGetResult =
        WeekendHolidayCalendar.meta().propertyGet(WeekendHolidayCalendar.FRI_SAT, "day2", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof DayOfWeek);
    assertEquals(DayOfWeek.SATURDAY, actualPropertyGetResult);
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
            WeekendHolidayCalendar.meta()
                .propertyGet(WeekendHolidayCalendar.FRI_SAT, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then return {@link HolidayCalendarId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'id'; then return HolidayCalendarId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenId_thenReturnHolidayCalendarId() {
    // Arrange and Act
    Object actualPropertyGetResult =
        WeekendHolidayCalendar.meta().propertyGet(WeekendHolidayCalendar.FRI_SAT, "id", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof HolidayCalendarId);
    assertEquals("Fri/Sat", ((HolidayCalendarId) actualPropertyGetResult).getName());
    assertEquals("Fri/Sat", actualPropertyGetResult.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(
        expectedReferenceDataType,
        ((HolidayCalendarId) actualPropertyGetResult).getReferenceDataType());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code day1}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'day1'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDay1_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            WeekendHolidayCalendar.meta().propertySet(mock(Bean.class), "day1", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code day2}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'day2'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDay2_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            WeekendHolidayCalendar.meta().propertySet(mock(Bean.class), "day2", "New Value", true));
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
            WeekendHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "day1", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'id'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> WeekendHolidayCalendar.meta().propertySet(mock(Bean.class), "id", "New Value", true));
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
            WeekendHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
