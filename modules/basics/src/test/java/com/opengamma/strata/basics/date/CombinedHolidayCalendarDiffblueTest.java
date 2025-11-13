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
import com.opengamma.strata.basics.date.CombinedHolidayCalendar.Meta;
import com.opengamma.strata.basics.date.HolidayCalendarTest.MockEomHolCal;
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

class CombinedHolidayCalendarDiffblueTest {
  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId2() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId3() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
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
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId4() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(new MockEomHolCal(), HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat+MockEom", actualId.getName());
    assertEquals("Fri/Sat+MockEom", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId5() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.NO_HOLIDAYS).getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId6() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    HolidayCalendarId actualId = combinedHolidayCalendar.getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId7() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, new MockEomHolCal());

    // Act
    HolidayCalendarId actualId = combinedHolidayCalendar.getId();

    // Assert
    assertEquals("Fri/Sat+MockEom", actualId.getName());
    assertEquals("Fri/Sat+MockEom", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId8() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    HolidayCalendarId actualId = combinedHolidayCalendar.getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId9() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId10() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId11() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(new MockEomHolCal(), HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat~Fri/Sat+MockEom", actualId.getName());
    assertEquals("Fri/Sat~Fri/Sat+MockEom", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId12() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId13() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.NO_HOLIDAYS),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId14() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId15() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, new MockEomHolCal());

    // Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat~Fri/Sat+MockEom", actualId.getName());
    assertEquals("Fri/Sat~Fri/Sat+MockEom", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId16() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Given {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar,
   *       HolidayCalendar)} with calendar1 is {@link HolidayCalendars#FRI_SAT} and calendar2 is
   *       {@link HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName(
      "Test getId(); given LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar) with calendar1 is FRI_SAT and calendar2 is FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId_givenLinkedHolidayCalendarWithCalendar1IsFri_satAndCalendar2IsFri_sat() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat", actualId.getName());
    assertEquals("Fri/Sat", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Then return Name is {@code Fri/Sat~Fri/Sat+Sat/Sun}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId(); then return Name is 'Fri/Sat~Fri/Sat+Sat/Sun'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId_thenReturnNameIsFriSatFriSatSatSun() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat~Fri/Sat+Sat/Sun", actualId.getName());
    assertEquals("Fri/Sat~Fri/Sat+Sat/Sun", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Then return Name is {@code Fri/Sat+Sat/Sun}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId(); then return Name is 'Fri/Sat+Sat/Sun'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId_thenReturnNameIsFriSatSatSun() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT).getId();

    // Assert
    assertEquals("Fri/Sat+Sat/Sun", actualId.getName());
    assertEquals("Fri/Sat+Sat/Sun", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#getId()}.
   *
   * <ul>
   *   <li>Then return Name is {@code Fri/Sat+Sat/Sun}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#getId()}
   */
  @Test
  @DisplayName("Test getId(); then return Name is 'Fri/Sat+Sat/Sun'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendarId CombinedHolidayCalendar.getId()"})
  void testGetId_thenReturnNameIsFriSatSatSun2() {
    // Arrange and Act
    HolidayCalendarId actualId =
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getId();

    // Assert
    assertEquals("Fri/Sat+Sat/Sun", actualId.getName());
    assertEquals("Fri/Sat+Sat/Sun", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday2() {
    // Arrange, Act and Assert
    assertTrue(
        new CombinedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday3() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday4() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday5() {
    // Arrange, Act and Assert
    assertTrue(
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.THU_FRI)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday6() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(combinedHolidayCalendar.isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday7() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(combinedHolidayCalendar.isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday8() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday9() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday10() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday11() {
    // Arrange, Act and Assert
    assertTrue(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.THU_FRI),
                HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday12() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.THU_FRI,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CombinedHolidayCalendar.isHoliday(LocalDate)"})
  void testIsHoliday13() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.THU_FRI,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CombinedHolidayCalendar#meta()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CombinedHolidayCalendar.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CombinedHolidayCalendar.meta();

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
    Class<CombinedHolidayCalendar> expectedDeclaringTypeResult = CombinedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, calendar1Result.declaringType());
    Class<CombinedHolidayCalendar> expectedDeclaringTypeResult2 = CombinedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult2, calendar2Result.declaringType());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, calendar1Result.propertyType());
    Class<HolidayCalendar> expectedPropertyTypeResult2 = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult2, calendar2Result.propertyType());
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
    Class<? extends CombinedHolidayCalendar> actualBeanTypeResult =
        CombinedHolidayCalendar.meta().beanType();

    // Assert
    Class<CombinedHolidayCalendar> expectedBeanTypeResult = CombinedHolidayCalendar.class;
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
    Meta metaResult = CombinedHolidayCalendar.meta();

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
        CombinedHolidayCalendar.meta().metaPropertyGet("calendar2");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendar> calendar1Result = ((Meta) metaBeanResult).calendar1();
    assertTrue(calendar1Result instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("calendar1", calendar1Result.name());
    assertEquals("calendar2", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, calendar1Result.style());
    Class<CombinedHolidayCalendar> expectedDeclaringTypeResult = CombinedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, calendar1Result.declaringType());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, calendar1Result.propertyType());
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
        CombinedHolidayCalendar.meta().metaPropertyGet("calendar1");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendar> calendar2Result = ((Meta) metaBeanResult).calendar2();
    assertTrue(calendar2Result instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("calendar1", actualMetaPropertyGetResult.name());
    assertEquals("calendar2", calendar2Result.name());
    assertEquals(PropertyStyle.IMMUTABLE, calendar2Result.style());
    Class<CombinedHolidayCalendar> expectedDeclaringTypeResult = CombinedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, calendar2Result.declaringType());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, calendar2Result.propertyType());
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
    assertNull(CombinedHolidayCalendar.meta().metaPropertyGet("Property Name"));
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
        CombinedHolidayCalendar.meta().metaPropertyMap();

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
    Class<CombinedHolidayCalendar> expectedDeclaringTypeResult = CombinedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CombinedHolidayCalendar> expectedDeclaringTypeResult2 = CombinedHolidayCalendar.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<HolidayCalendar> expectedPropertyTypeResult = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<HolidayCalendar> expectedPropertyTypeResult2 = HolidayCalendar.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
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
    Meta metaResult = CombinedHolidayCalendar.meta();
    CombinedHolidayCalendar bean =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

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
    Meta metaResult = CombinedHolidayCalendar.meta();
    CombinedHolidayCalendar bean =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

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
    assertNull(CombinedHolidayCalendar.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CombinedHolidayCalendar.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
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
            CombinedHolidayCalendar.meta()
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
            CombinedHolidayCalendar.meta()
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
            CombinedHolidayCalendar.meta()
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
            CombinedHolidayCalendar.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link CombinedHolidayCalendar#CombinedHolidayCalendar(HolidayCalendar, HolidayCalendar)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return Name is {@code Fri/Sat}.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#CombinedHolidayCalendar(HolidayCalendar,
   * HolidayCalendar)}
   */
  @Test
  @DisplayName(
      "Test new CombinedHolidayCalendar(HolidayCalendar, HolidayCalendar); when FRI_SAT; then return Name is 'Fri/Sat'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CombinedHolidayCalendar.<init>(HolidayCalendar, HolidayCalendar)"})
  void testNewCombinedHolidayCalendar_whenFri_sat_thenReturnNameIsFriSat() {
    // Arrange
    HolidayCalendar calendar2 = HolidayCalendars.FRI_SAT;

    // Act
    CombinedHolidayCalendar actualCombinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, calendar2);

    // Assert
    assertEquals("Fri/Sat", actualCombinedHolidayCalendar.getName());
    HolidayCalendarId id = actualCombinedHolidayCalendar.getId();
    assertEquals("Fri/Sat", id.getName());
    assertEquals("Fri/Sat", id.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, id.getReferenceDataType());
    WeekendHolidayCalendar weekendHolidayCalendar = ((WeekendHolidayCalendar) calendar2).FRI_SAT;
    assertSame(weekendHolidayCalendar, actualCombinedHolidayCalendar.getCalendar1());
    assertSame(weekendHolidayCalendar, actualCombinedHolidayCalendar.getCalendar2());
  }

  /**
   * Test {@link CombinedHolidayCalendar#metaBean()}.
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CombinedHolidayCalendar.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedHolidayCalendar#toString()}
   *   <li>{@link CombinedHolidayCalendar#getCalendar1()}
   *   <li>{@link CombinedHolidayCalendar#getCalendar2()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HolidayCalendar CombinedHolidayCalendar.getCalendar1()",
    "HolidayCalendar CombinedHolidayCalendar.getCalendar2()",
    "String CombinedHolidayCalendar.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act
    String actualToStringResult = combinedHolidayCalendar.toString();
    HolidayCalendar actualCalendar1 = combinedHolidayCalendar.getCalendar1();
    HolidayCalendar actualCalendar2 = combinedHolidayCalendar.getCalendar2();

    // Assert
    assertEquals("HolidayCalendar[Fri/Sat]", actualToStringResult);
    WeekendHolidayCalendar weekendHolidayCalendar =
        ((WeekendHolidayCalendar) actualCalendar2).FRI_SAT;
    assertSame(weekendHolidayCalendar, actualCalendar1);
    assertSame(weekendHolidayCalendar, actualCalendar2);
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}, and {@link
   * CombinedHolidayCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedHolidayCalendar#equals(Object)}
   *   <li>{@link CombinedHolidayCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);
    CombinedHolidayCalendar combinedHolidayCalendar2 =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertEquals(combinedHolidayCalendar, combinedHolidayCalendar2);
    assertEquals(combinedHolidayCalendar.hashCode(), combinedHolidayCalendar2.hashCode());
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}, and {@link
   * CombinedHolidayCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CombinedHolidayCalendar#equals(Object)}
   *   <li>{@link CombinedHolidayCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertEquals(combinedHolidayCalendar, combinedHolidayCalendar);
    int expectedHashCodeResult = combinedHolidayCalendar.hashCode();
    assertEquals(expectedHashCodeResult, combinedHolidayCalendar.hashCode());
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        combinedHolidayCalendar,
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
            HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(
        combinedHolidayCalendar,
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.NO_HOLIDAYS);

    // Act and Assert
    assertNotEquals(
        combinedHolidayCalendar,
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertNotEquals(
        combinedHolidayCalendar,
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT), null);
  }

  /**
   * Test {@link CombinedHolidayCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CombinedHolidayCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CombinedHolidayCalendar.equals(Object)",
    "int CombinedHolidayCalendar.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
        "Different type to CombinedHolidayCalendar");
  }
}
