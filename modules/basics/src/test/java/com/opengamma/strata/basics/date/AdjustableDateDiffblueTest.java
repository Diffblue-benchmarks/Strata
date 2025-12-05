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
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.date.AdjustableDate.Meta;
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
import org.mockito.Mockito;

class AdjustableDateDiffblueTest {
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
    Class<? extends AdjustableDate> actualBeanTypeResult = AdjustableDate.meta().beanType();

    // Assert
    Class<AdjustableDate> expectedBeanTypeResult = AdjustableDate.class;
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
    Meta metaResult = AdjustableDate.meta();

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
        AdjustableDate.meta().metaPropertyGet("unadjusted");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("adjustment", adjustmentResult.name());
    assertEquals("unadjusted", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentResult.style());
    Class<AdjustableDate> expectedDeclaringTypeResult = AdjustableDate.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, adjustmentResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
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
        AdjustableDate.meta().metaPropertyGet("adjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedResult = ((Meta) metaBeanResult).unadjusted();
    assertTrue(unadjustedResult instanceof DirectMetaProperty);
    assertEquals("adjustment", actualMetaPropertyGetResult.name());
    assertEquals("unadjusted", unadjustedResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, unadjustedResult.style());
    Class<AdjustableDate> expectedDeclaringTypeResult = AdjustableDate.class;
    assertEquals(expectedDeclaringTypeResult, unadjustedResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, unadjustedResult.propertyType());
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
    assertNull(AdjustableDate.meta().metaPropertyGet("Property Name"));
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
        AdjustableDate.meta().metaPropertyMap();

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
    Class<AdjustableDate> expectedDeclaringTypeResult = AdjustableDate.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<AdjustableDate> expectedDeclaringTypeResult2 = AdjustableDate.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then {@link AdjustableDate} with date is {@link LocalDate} Adjustment is {@link
   *       BusinessDayAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then AdjustableDate with date is LocalDate Adjustment is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenAdjustableDateWithDateIsLocalDateAdjustmentIsNone() {
    // Arrange
    Meta metaResult = AdjustableDate.meta();
    AdjustableDate bean = AdjustableDate.of(LocalDate.of(1970, 1, 1));

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
    assertNull(AdjustableDate.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = AdjustableDate.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                AdjustableDate.of(LocalDate.of(1970, 1, 1)), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjusted}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'unadjusted'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenUnadjusted_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = AdjustableDate.meta();
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(AdjustableDate.of(date), "unadjusted", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(date, actualPropertyGetResult);
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
        () -> AdjustableDate.meta().propertySet(mock(Bean.class), "adjustment", "New Value", true));
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
            AdjustableDate.meta().propertySet(mock(Bean.class), "adjustment", "New Value", false));
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
            AdjustableDate.meta()
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
        () -> AdjustableDate.meta().propertySet(mock(Bean.class), "unadjusted", "New Value", true));
  }

  /**
   * Test {@link AdjustableDate#of(LocalDate)} with {@code date}.
   *
   * <ul>
   *   <li>Then return Adjustment Calendar Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#of(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate) with 'date'; then return Adjustment Calendar Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDate AdjustableDate.of(LocalDate)"})
  void testOfWithDate_thenReturnAdjustmentCalendarNameIsNoHolidays() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    AdjustableDate actualOfResult = AdjustableDate.of(date);

    // Assert
    HolidayCalendarId calendar = actualOfResult.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(date, actualOfResult.getUnadjusted());
  }

  /**
   * Test {@link AdjustableDate#of(LocalDate, BusinessDayAdjustment)} with {@code unadjusted},
   * {@code adjustment}.
   *
   * <p>Method under test: {@link AdjustableDate#of(LocalDate, BusinessDayAdjustment)}
   */
  @Test
  @DisplayName("Test of(LocalDate, BusinessDayAdjustment) with 'unadjusted', 'adjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AdjustableDate AdjustableDate.of(LocalDate, BusinessDayAdjustment)"})
  void testOfWithUnadjustedAdjustment() {
    // Arrange
    LocalDate unadjusted = LocalDate.of(1970, 1, 1);

    // Act
    AdjustableDate actualOfResult = AdjustableDate.of(unadjusted, BusinessDayAdjustment.NONE);

    // Assert
    assertSame(unadjusted, actualOfResult.getUnadjusted());
    assertSame(BusinessDayAdjustment.NONE, actualOfResult.getAdjustment());
  }

  /**
   * Test {@link AdjustableDate#adjusted(ReferenceData)}.
   *
   * <p>Method under test: {@link AdjustableDate#adjusted(ReferenceData)}
   */
  @Test
  @DisplayName("Test adjusted(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate AdjustableDate.adjusted(ReferenceData)"})
  void testAdjusted() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    AdjustableDate ofResult = AdjustableDate.of(date);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustedResult = ofResult.adjusted(refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", actualAdjustedResult.toString());
    assertSame(date, actualAdjustedResult);
  }

  /**
   * Test {@link AdjustableDate#toString()}.
   *
   * <p>Method under test: {@link AdjustableDate#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AdjustableDate.toString()"})
  void testToString() {
    // Arrange
    LocalDate unadjusted = LocalDate.of(1970, 1, 1);
    BusinessDayAdjustment adjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.NO_HOLIDAYS)
            .convention(BusinessDayConventions.NO_ADJUST)
            .build();

    AdjustableDate ofResult = AdjustableDate.of(unadjusted, adjustment);

    // Act and Assert
    assertEquals("1970-01-01", ofResult.toString());
  }

  /**
   * Test {@link AdjustableDate#toString()}.
   *
   * <ul>
   *   <li>Given {@link AdjustableDate} with date is {@link LocalDate}.
   *   <li>Then return {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given AdjustableDate with date is LocalDate; then return '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AdjustableDate.toString()"})
  void testToString_givenAdjustableDateWithDateIsLocalDate_thenReturn19700101() {
    // Arrange, Act and Assert
    assertEquals("1970-01-01", AdjustableDate.of(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link AdjustableDate#toString()}.
   *
   * <ul>
   *   <li>Then return {@code 1970-01-01 adjusted by Following using calendar AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); then return '1970-01-01 adjusted by Following using calendar AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AdjustableDate.toString()"})
  void testToString_thenReturn19700101AdjustedByFollowingUsingCalendarAusy() {
    // Arrange
    LocalDate unadjusted = LocalDate.of(1970, 1, 1);
    BusinessDayAdjustment adjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();

    AdjustableDate ofResult = AdjustableDate.of(unadjusted, adjustment);

    // Act and Assert
    assertEquals("1970-01-01 adjusted by Following using calendar AUSY", ofResult.toString());
  }

  /**
   * Test {@link AdjustableDate#toString()}.
   *
   * <ul>
   *   <li>Then return {@code 1970-01-01 adjusted by NoAdjust using calendar AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '1970-01-01 adjusted by NoAdjust using calendar AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AdjustableDate.toString()"})
  void testToString_thenReturn19700101AdjustedByNoAdjustUsingCalendarAusy() {
    // Arrange
    LocalDate unadjusted = LocalDate.of(1970, 1, 1);
    BusinessDayAdjustment adjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.NO_ADJUST)
            .build();

    AdjustableDate ofResult = AdjustableDate.of(unadjusted, adjustment);

    // Act and Assert
    assertEquals("1970-01-01 adjusted by NoAdjust using calendar AUSY", ofResult.toString());
  }

  /**
   * Test {@link AdjustableDate#meta()}.
   *
   * <p>Method under test: {@link AdjustableDate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AdjustableDate.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = AdjustableDate.meta();

    // Assert
    MetaProperty<BusinessDayAdjustment> adjustmentResult = actualMetaResult.adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedResult = actualMetaResult.unadjusted();
    assertTrue(unadjustedResult instanceof DirectMetaProperty);
    assertEquals("adjustment", adjustmentResult.name());
    assertEquals("unadjusted", unadjustedResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, unadjustedResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<AdjustableDate> expectedDeclaringTypeResult = AdjustableDate.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentResult.declaringType());
    Class<AdjustableDate> expectedDeclaringTypeResult2 = AdjustableDate.class;
    assertEquals(expectedDeclaringTypeResult2, unadjustedResult.declaringType());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, adjustmentResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, unadjustedResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, adjustmentResult.metaBean());
    assertSame(meta, unadjustedResult.metaBean());
  }

  /**
   * Test {@link AdjustableDate#metaBean()}.
   *
   * <p>Method under test: {@link AdjustableDate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta AdjustableDate.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, AdjustableDate.of(LocalDate.of(1970, 1, 1)).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdjustableDate#getAdjustment()}
   *   <li>{@link AdjustableDate#getUnadjusted()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BusinessDayAdjustment AdjustableDate.getAdjustment()",
    "LocalDate AdjustableDate.getUnadjusted()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);
    AdjustableDate ofResult = AdjustableDate.of(date);

    // Act
    BusinessDayAdjustment actualAdjustment = ofResult.getAdjustment();
    LocalDate actualUnadjusted = ofResult.getUnadjusted();

    // Assert
    assertEquals("1970-01-01", actualUnadjusted.toString());
    assertSame(date, actualUnadjusted);
    assertSame(BusinessDayAdjustment.NONE, actualAdjustment);
  }

  /**
   * Test {@link AdjustableDate#equals(Object)}, and {@link AdjustableDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdjustableDate#equals(Object)}
   *   <li>{@link AdjustableDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDate.equals(Object)", "int AdjustableDate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdjustableDate ofResult = AdjustableDate.of(LocalDate.of(1970, 1, 1));
    AdjustableDate ofResult2 = AdjustableDate.of(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link AdjustableDate#equals(Object)}, and {@link AdjustableDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdjustableDate#equals(Object)}
   *   <li>{@link AdjustableDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDate.equals(Object)", "int AdjustableDate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdjustableDate ofResult = AdjustableDate.of(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link AdjustableDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDate.equals(Object)", "int AdjustableDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AdjustableDate.of(LocalDate.of(1970, 1, 1)), 1);
  }

  /**
   * Test {@link AdjustableDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDate.equals(Object)", "int AdjustableDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdjustableDate ofResult = AdjustableDate.of(LocalDate.now());

    // Act and Assert
    assertNotEquals(ofResult, AdjustableDate.of(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link AdjustableDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDate.equals(Object)", "int AdjustableDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LocalDate unadjusted = LocalDate.of(1970, 1, 1);
    BusinessDayAdjustment adjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();

    AdjustableDate ofResult = AdjustableDate.of(unadjusted, adjustment);

    // Act and Assert
    assertNotEquals(ofResult, AdjustableDate.of(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link AdjustableDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDate.equals(Object)", "int AdjustableDate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(AdjustableDate.of(LocalDate.of(1970, 1, 1)), null);
  }

  /**
   * Test {@link AdjustableDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdjustableDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean AdjustableDate.equals(Object)", "int AdjustableDate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        AdjustableDate.of(LocalDate.of(1970, 1, 1)), "Different type to AdjustableDate");
  }
}
