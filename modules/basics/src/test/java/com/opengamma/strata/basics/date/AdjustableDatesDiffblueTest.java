package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.date.AdjustableDates.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
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
import org.mockito.Mockito;

class AdjustableDatesDiffblueTest {
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
    Class<? extends AdjustableDates> actualBeanTypeResult = AdjustableDates.meta().beanType();

    // Assert
    Class<AdjustableDates> expectedBeanTypeResult = AdjustableDates.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#adjustment()}
   *   <li>{@link Meta#unadjusted()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.adjustment()", "MetaProperty Meta.unadjusted()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = AdjustableDates.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualAdjustmentResult = metaResult.adjustment();

    // Assert
    assertTrue(actualAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(metaResult.unadjusted() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean adjustment return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean adjustment return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanAdjustmentReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        AdjustableDates.meta().metaPropertyGet("unadjusted");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("adjustment", adjustmentResult.name());
    assertEquals("unadjusted", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<AdjustableDates> expectedDeclaringTypeResult = AdjustableDates.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult2 = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult2, adjustmentResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).unadjusted());
    assertSame(Meta.INSTANCE, adjustmentResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean unadjusted return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean unadjusted return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanUnadjustedReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        AdjustableDates.meta().metaPropertyGet("adjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<LocalDate>> unadjustedResult = ((Meta) metaBeanResult).unadjusted();
    assertTrue(unadjustedResult instanceof DirectMetaProperty);
    assertEquals("adjustment", actualMetaPropertyGetResult.name());
    assertEquals("unadjusted", unadjustedResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, unadjustedResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, unadjustedResult.propertyType());
    Class<AdjustableDates> expectedDeclaringTypeResult = AdjustableDates.class;
    assertEquals(expectedDeclaringTypeResult, unadjustedResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult2 = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).adjustment());
    assertSame(Meta.INSTANCE, unadjustedResult.metaBean());
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
    assertNull(AdjustableDates.meta().metaPropertyGet("Property Name"));
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
        AdjustableDates.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("unadjusted");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("adjustment");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("adjustment", getResult2.name());
    assertEquals("unadjusted", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<AdjustableDates> expectedDeclaringTypeResult = AdjustableDates.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<AdjustableDates> expectedDeclaringTypeResult2 = AdjustableDates.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult2 = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); given LocalDate with '1970' and one and one; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_givenLocalDateWith1970AndOneAndOne_thenReturnArrayList() {
    // Arrange
    Meta metaResult = AdjustableDates.meta();

    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(dates, metaResult.propertyGet(AdjustableDates.of(dates), "unadjusted", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then {@link AdjustableDates} with dates is {@link ArrayList#ArrayList()} Adjustment is
   *       {@link BusinessDayAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then AdjustableDates with dates is ArrayList() Adjustment is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenAdjustableDatesWithDatesIsArrayListAdjustmentIsNone() {
    // Arrange
    Meta metaResult = AdjustableDates.meta();

    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates bean = AdjustableDates.of(dates);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "adjustment", true);

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
    assertNull(AdjustableDates.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> AdjustableDates.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
        () ->
            AdjustableDates.meta().propertySet(mock(Bean.class), "adjustment", "New Value", true));
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
            AdjustableDates.meta().propertySet(mock(Bean.class), "adjustment", "New Value", false));
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
            AdjustableDates.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjusted}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'unadjusted'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnadjusted_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            AdjustableDates.meta().propertySet(mock(Bean.class), "unadjusted", "New Value", true));
  }

  /**
   * Test {@link AdjustableDates#of(BusinessDayAdjustment, List)} with {@code adjustment}, {@code
   * dates}.
   *
   * <ul>
   *   <li>Given ofYearDay one and one.
   *   <li>Then return Unadjusted size is two.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(BusinessDayAdjustment, List)}
   */
  @Test
  @DisplayName(
      "Test of(BusinessDayAdjustment, List) with 'adjustment', 'dates'; given ofYearDay one and one; then return Unadjusted size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDates AdjustableDates.of(BusinessDayAdjustment, List)"})
  void testOfWithAdjustmentDates_givenOfYearDayOneAndOne_thenReturnUnadjustedSizeIsTwo() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    LocalDate ofYearDayResult = LocalDate.ofYearDay(1, 1);
    dates.add(ofYearDayResult);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    dates.add(ofResult);

    // Act and Assert
    ImmutableList<LocalDate> unadjusted =
        AdjustableDates.of(BusinessDayAdjustment.NONE, dates).getUnadjusted();
    assertEquals(2, unadjusted.size());
    LocalDate getResult = unadjusted.get(0);
    assertEquals("0001-01-01", getResult.toString());
    LocalDate getResult2 = unadjusted.get(1);
    assertEquals("1970-01-01", getResult2.toString());
    assertSame(ofResult, getResult2);
    assertSame(ofYearDayResult, getResult);
  }

  /**
   * Test {@link AdjustableDates#of(BusinessDayAdjustment, List)} with {@code adjustment}, {@code
   * dates}.
   *
   * <ul>
   *   <li>Then return Unadjusted is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(BusinessDayAdjustment, List)}
   */
  @Test
  @DisplayName(
      "Test of(BusinessDayAdjustment, List) with 'adjustment', 'dates'; then return Unadjusted is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDates AdjustableDates.of(BusinessDayAdjustment, List)"})
  void testOfWithAdjustmentDates_thenReturnUnadjustedIsArrayList() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));

    // Act
    AdjustableDates actualOfResult = AdjustableDates.of(BusinessDayAdjustment.NONE, dates);

    // Assert
    assertEquals(dates, actualOfResult.getUnadjusted());
    assertSame(BusinessDayAdjustment.NONE, actualOfResult.getAdjustment());
  }

  /**
   * Test {@link AdjustableDates#of(BusinessDayAdjustment, LocalDate, LocalDate[])} with {@code
   * adjustment}, {@code firstDate}, {@code remainingDates}.
   *
   * <ul>
   *   <li>Then return Unadjusted size is one.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(BusinessDayAdjustment, LocalDate, LocalDate[])}
   */
  @Test
  @DisplayName(
      "Test of(BusinessDayAdjustment, LocalDate, LocalDate[]) with 'adjustment', 'firstDate', 'remainingDates'; then return Unadjusted size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AdjustableDates AdjustableDates.of(BusinessDayAdjustment, LocalDate, LocalDate[])"
  })
  void testOfWithAdjustmentFirstDateRemainingDates_thenReturnUnadjustedSizeIsOne() {
    // Arrange
    LocalDate firstDate = LocalDate.of(1970, 1, 1);

    // Act
    AdjustableDates actualOfResult = AdjustableDates.of(BusinessDayAdjustment.NONE, firstDate);

    // Assert
    ImmutableList<LocalDate> unadjusted = actualOfResult.getUnadjusted();
    assertEquals(1, unadjusted.size());
    assertSame(firstDate, unadjusted.get(0));
    assertSame(BusinessDayAdjustment.NONE, actualOfResult.getAdjustment());
  }

  /**
   * Test {@link AdjustableDates#of(BusinessDayAdjustment, LocalDate, LocalDate[])} with {@code
   * adjustment}, {@code firstDate}, {@code remainingDates}.
   *
   * <ul>
   *   <li>Then return Unadjusted size is two.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(BusinessDayAdjustment, LocalDate, LocalDate[])}
   */
  @Test
  @DisplayName(
      "Test of(BusinessDayAdjustment, LocalDate, LocalDate[]) with 'adjustment', 'firstDate', 'remainingDates'; then return Unadjusted size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AdjustableDates AdjustableDates.of(BusinessDayAdjustment, LocalDate, LocalDate[])"
  })
  void testOfWithAdjustmentFirstDateRemainingDates_thenReturnUnadjustedSizeIsTwo() {
    // Arrange
    LocalDate firstDate = LocalDate.ofYearDay(1, 1);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);

    // Act
    AdjustableDates actualOfResult =
        AdjustableDates.of(BusinessDayAdjustment.NONE, firstDate, ofResult);

    // Assert
    ImmutableList<LocalDate> unadjusted = actualOfResult.getUnadjusted();
    assertEquals(2, unadjusted.size());
    LocalDate getResult = unadjusted.get(1);
    assertEquals("1970-01-01", getResult.toString());
    assertSame(ofResult, getResult);
    assertSame(firstDate, unadjusted.get(0));
  }

  /**
   * Test {@link AdjustableDates#of(List)} with {@code dates}.
   *
   * <ul>
   *   <li>Given ofYearDay one and one.
   *   <li>Then return Unadjusted size is two.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'dates'; given ofYearDay one and one; then return Unadjusted size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDates AdjustableDates.of(List)"})
  void testOfWithDates_givenOfYearDayOneAndOne_thenReturnUnadjustedSizeIsTwo() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    LocalDate ofYearDayResult = LocalDate.ofYearDay(1, 1);
    dates.add(ofYearDayResult);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    dates.add(ofResult);

    // Act
    AdjustableDates actualOfResult = AdjustableDates.of(dates);

    // Assert
    ImmutableList<LocalDate> unadjusted = actualOfResult.getUnadjusted();
    assertEquals(2, unadjusted.size());
    LocalDate getResult = unadjusted.get(0);
    assertEquals("0001-01-01", getResult.toString());
    LocalDate getResult2 = unadjusted.get(1);
    assertEquals("1970-01-01", getResult2.toString());
    assertSame(ofResult, getResult2);
    assertSame(ofYearDayResult, getResult);
  }

  /**
   * Test {@link AdjustableDates#of(List)} with {@code dates}.
   *
   * <ul>
   *   <li>Then return Adjustment Calendar Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'dates'; then return Adjustment Calendar Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDates AdjustableDates.of(List)"})
  void testOfWithDates_thenReturnAdjustmentCalendarNameIsNoHolidays() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));

    // Act
    AdjustableDates actualOfResult = AdjustableDates.of(dates);

    // Assert
    HolidayCalendarId calendar = actualOfResult.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals(dates, actualOfResult.getUnadjusted());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
  }

  /**
   * Test {@link AdjustableDates#of(LocalDate, LocalDate[])} with {@code firstDate}, {@code
   * remainingDates}.
   *
   * <ul>
   *   <li>Then return Adjustment Calendar Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(LocalDate, LocalDate[])}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate[]) with 'firstDate', 'remainingDates'; then return Adjustment Calendar Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDates AdjustableDates.of(LocalDate, LocalDate[])"})
  void testOfWithFirstDateRemainingDates_thenReturnAdjustmentCalendarNameIsNoHolidays() {
    // Arrange
    LocalDate firstDate = LocalDate.of(1970, 1, 1);

    // Act
    AdjustableDates actualOfResult = AdjustableDates.of(firstDate);

    // Assert
    HolidayCalendarId calendar = actualOfResult.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    ImmutableList<LocalDate> unadjusted = actualOfResult.getUnadjusted();
    assertEquals(1, unadjusted.size());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(firstDate, unadjusted.get(0));
  }

  /**
   * Test {@link AdjustableDates#of(LocalDate, LocalDate[])} with {@code firstDate}, {@code
   * remainingDates}.
   *
   * <ul>
   *   <li>Then return Unadjusted size is two.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#of(LocalDate, LocalDate[])}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate[]) with 'firstDate', 'remainingDates'; then return Unadjusted size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDates AdjustableDates.of(LocalDate, LocalDate[])"})
  void testOfWithFirstDateRemainingDates_thenReturnUnadjustedSizeIsTwo() {
    // Arrange
    LocalDate firstDate = LocalDate.ofYearDay(1, 1);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);

    // Act and Assert
    ImmutableList<LocalDate> unadjusted = AdjustableDates.of(firstDate, ofResult).getUnadjusted();
    assertEquals(2, unadjusted.size());
    LocalDate getResult = unadjusted.get(1);
    assertEquals("1970-01-01", getResult.toString());
    assertSame(ofResult, getResult);
    assertSame(firstDate, unadjusted.get(0));
  }

  /**
   * Test {@link AdjustableDates#adjusted(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link LocalDate} with {@code 1970} and one and
   *       one.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#adjusted(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjusted(ReferenceData); given ArrayList() add LocalDate with '1970' and one and one; then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList AdjustableDates.adjusted(ReferenceData)"})
  void testAdjusted_givenArrayListAddLocalDateWith1970AndOneAndOne_thenReturnArrayList() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult = AdjustableDates.of(dates);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    ImmutableList<LocalDate> actualAdjustedResult = ofResult.adjusted(refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals(dates, actualAdjustedResult);
  }

  /**
   * Test {@link AdjustableDates#adjusted(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#adjusted(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjusted(ReferenceData); given LocalDate with '1970' and one and one; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList AdjustableDates.adjusted(ReferenceData)"})
  void testAdjusted_givenLocalDateWith1970AndOneAndOne_thenReturnSizeIsTwo() {
    // Arrange
    LocalDate firstDate = LocalDate.ofYearDay(1, 1);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);

    AdjustableDates ofResult2 = AdjustableDates.of(firstDate, ofResult);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    ImmutableList<LocalDate> actualAdjustedResult = ofResult2.adjusted(refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals(2, actualAdjustedResult.size());
    LocalDate getResult = actualAdjustedResult.get(0);
    assertEquals("0001-01-01", getResult.toString());
    LocalDate getResult2 = actualAdjustedResult.get(1);
    assertEquals("1970-01-01", getResult2.toString());
    assertSame(ofResult, getResult2);
    assertSame(firstDate, getResult);
  }

  /**
   * Test {@link AdjustableDates#toAdjustableDateList()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add ofYearDay one and one.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#toAdjustableDateList()}
   */
  @Test
  @DisplayName(
      "Test toAdjustableDateList(); given ArrayList() add ofYearDay one and one; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList AdjustableDates.toAdjustableDateList()"})
  void testToAdjustableDateList_givenArrayListAddOfYearDayOneAndOne_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    LocalDate ofYearDayResult = LocalDate.ofYearDay(1, 1);
    dates.add(ofYearDayResult);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    dates.add(ofResult);
    AdjustableDates ofResult2 = AdjustableDates.of(dates);

    // Act
    ImmutableList<AdjustableDate> actualToAdjustableDateListResult =
        ofResult2.toAdjustableDateList();

    // Assert
    assertEquals(2, actualToAdjustableDateListResult.size());
    LocalDate unadjusted = actualToAdjustableDateListResult.get(0).getUnadjusted();
    assertEquals("0001-01-01", unadjusted.toString());
    LocalDate unadjusted2 = actualToAdjustableDateListResult.get(1).getUnadjusted();
    assertEquals("1970-01-01", unadjusted2.toString());
    assertSame(ofResult, unadjusted2);
    assertSame(ofYearDayResult, unadjusted);
  }

  /**
   * Test {@link AdjustableDates#toAdjustableDateList()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#toAdjustableDateList()}
   */
  @Test
  @DisplayName("Test toAdjustableDateList(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList AdjustableDates.toAdjustableDateList()"})
  void testToAdjustableDateList_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    dates.add(ofResult);
    AdjustableDates ofResult2 = AdjustableDates.of(dates);

    // Act
    ImmutableList<AdjustableDate> actualToAdjustableDateListResult =
        ofResult2.toAdjustableDateList();

    // Assert
    assertEquals(1, actualToAdjustableDateListResult.size());
    AdjustableDate getResult = actualToAdjustableDateListResult.get(0);
    LocalDate unadjusted = getResult.getUnadjusted();
    assertEquals("1970-01-01", unadjusted.toString());
    HolidayCalendarId calendar = getResult.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(ofResult, unadjusted);
  }

  /**
   * Test {@link AdjustableDates#toString()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link LocalDate} with {@code 1970} and one and
   *       one.
   *   <li>Then return {@code [1970-01-01]}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given ArrayList() add LocalDate with '1970' and one and one; then return '[1970-01-01]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AdjustableDates.toString()"})
  void testToString_givenArrayListAddLocalDateWith1970AndOneAndOne_thenReturn19700101() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult = AdjustableDates.of(dates);

    // Act and Assert
    assertEquals("[1970-01-01]", ofResult.toString());
  }

  /**
   * Test {@link AdjustableDates#toString()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add ofYearDay one and one.
   *   <li>Then return {@code [0001-01-01, 1970-01-01]}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given ArrayList() add ofYearDay one and one; then return '[0001-01-01, 1970-01-01]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AdjustableDates.toString()"})
  void testToString_givenArrayListAddOfYearDayOneAndOne_thenReturn0001010119700101() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.ofYearDay(1, 1));
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult = AdjustableDates.of(dates);

    // Act and Assert
    assertEquals("[0001-01-01, 1970-01-01]", ofResult.toString());
  }

  /**
   * Test {@link AdjustableDates#meta()}.
   *
   * <p>Method under test: {@link AdjustableDates#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AdjustableDates.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = AdjustableDates.meta();

    // Assert
    MetaProperty<BusinessDayAdjustment> adjustmentResult = actualMetaResult.adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<LocalDate>> unadjustedResult = actualMetaResult.unadjusted();
    assertTrue(unadjustedResult instanceof DirectMetaProperty);
    assertEquals("adjustment", adjustmentResult.name());
    assertEquals("unadjusted", unadjustedResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, unadjustedResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, unadjustedResult.propertyType());
    Class<AdjustableDates> expectedDeclaringTypeResult = AdjustableDates.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentResult.declaringType());
    Class<AdjustableDates> expectedDeclaringTypeResult2 = AdjustableDates.class;
    assertEquals(expectedDeclaringTypeResult2, unadjustedResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult2 = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult2, adjustmentResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, adjustmentResult.metaBean());
    assertSame(meta, unadjustedResult.metaBean());
  }

  /**
   * Test {@link AdjustableDates#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@link LocalDate} with {@code 1970} and one and
   *       one.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given ArrayList() add LocalDate with '1970' and one and one; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AdjustableDates.metaBean()"})
  void testMetaBean_givenArrayListAddLocalDateWith1970AndOneAndOne_thenReturnInstance() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult = AdjustableDates.of(dates);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link AdjustableDates#equals(Object)}, and {@link AdjustableDates#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdjustableDates#equals(Object)}
   *   <li>{@link AdjustableDates#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDates.equals(Object)", "int AdjustableDates.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult = AdjustableDates.of(dates);

    ArrayList<LocalDate> dates2 = new ArrayList<>();
    dates2.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult2 = AdjustableDates.of(dates2);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link AdjustableDates#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDates.equals(Object)", "int AdjustableDates.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult = AdjustableDates.of(dates);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link AdjustableDates#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDates.equals(Object)", "int AdjustableDates.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.of(1970, 1, 1));
    AdjustableDates ofResult = AdjustableDates.of(dates);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link AdjustableDates#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDates#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDates.equals(Object)", "int AdjustableDates.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayList<LocalDate> dates = new ArrayList<>();
    dates.add(LocalDate.now());
    AdjustableDates ofResult = AdjustableDates.of(dates);

    ArrayList<LocalDate> dates2 = new ArrayList<>();
    dates2.add(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertNotEquals(ofResult, AdjustableDates.of(dates2));
  }
}
