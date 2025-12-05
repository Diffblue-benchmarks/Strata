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
import com.opengamma.strata.basics.date.BusinessDayAdjustment.Builder;
import com.opengamma.strata.basics.date.BusinessDayAdjustment.Meta;
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

class BusinessDayAdjustmentDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BusinessDayAdjustment Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange
    HolidayCalendarId calendar = HolidayCalendarIds.AUSY;
    BusinessDayConvention convention = BusinessDayConventions.FOLLOWING;

    // Act
    BusinessDayAdjustment actualBusinessDayAdjustment =
        BusinessDayAdjustment.builder().calendar(calendar).convention(convention).build();

    // Assert
    assertSame(convention, actualBusinessDayAdjustment.getConvention());
    assertSame(calendar, actualBusinessDayAdjustment.getCalendar());
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
    Builder builderResult = BusinessDayAdjustment.builder();

    // Act
    Builder actualCalendarResult = builderResult.calendar(HolidayCalendarIds.AUSY);

    // Assert
    assertSame(builderResult, actualCalendarResult);
  }

  /**
   * Test Builder {@link Builder#convention(BusinessDayConvention)}.
   *
   * <ul>
   *   <li>When {@link BusinessDayConventions#FOLLOWING}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#convention(BusinessDayConvention)}
   */
  @Test
  @DisplayName(
      "Test Builder convention(BusinessDayConvention); when FOLLOWING; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.convention(BusinessDayConvention)"})
  void testBuilderConvention_whenFollowing_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BusinessDayAdjustment.builder();

    // Act
    Builder actualConventionResult = builderResult.convention(BusinessDayConventions.FOLLOWING);

    // Assert
    assertSame(builderResult, actualConventionResult);
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
    assertNull(BusinessDayAdjustment.builder().get("calendar"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'convention'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenConvention_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(BusinessDayAdjustment.builder().get("convention"));
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
        NoSuchElementException.class, () -> BusinessDayAdjustment.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName("Test Builder set(String, Object) with 'propertyName', 'newValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> BusinessDayAdjustment.builder().set("Property Name", "New Value"));
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
    Builder builderResult = BusinessDayAdjustment.builder();

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
    Class<? extends BusinessDayAdjustment> actualBeanTypeResult =
        BusinessDayAdjustment.meta().beanType();

    // Assert
    Class<BusinessDayAdjustment> expectedBeanTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#calendar()}
   *   <li>{@link Meta#convention()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.calendar()", "MetaProperty Meta.convention()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = BusinessDayAdjustment.meta();

    // Act
    MetaProperty<HolidayCalendarId> actualCalendarResult = metaResult.calendar();

    // Assert
    assertTrue(actualCalendarResult instanceof DirectMetaProperty);
    assertTrue(metaResult.convention() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean calendar return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean calendar return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanCalendarReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BusinessDayAdjustment.meta().metaPropertyGet("convention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<HolidayCalendarId> calendarResult = ((Meta) metaBeanResult).calendar();
    assertTrue(calendarResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("calendar", calendarResult.name());
    assertEquals("convention", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, calendarResult.style());
    Class<BusinessDayAdjustment> expectedDeclaringTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, calendarResult.declaringType());
    Class<BusinessDayConvention> expectedPropertyTypeResult = BusinessDayConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<HolidayCalendarId> expectedPropertyTypeResult2 = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult2, calendarResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).convention());
    assertSame(Meta.INSTANCE, calendarResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean convention return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean convention return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanConventionReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BusinessDayAdjustment.meta().metaPropertyGet("calendar");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayConvention> conventionResult = ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("calendar", actualMetaPropertyGetResult.name());
    assertEquals("convention", conventionResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, conventionResult.style());
    Class<BusinessDayAdjustment> expectedDeclaringTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, conventionResult.declaringType());
    Class<BusinessDayConvention> expectedPropertyTypeResult = BusinessDayConvention.class;
    assertEquals(expectedPropertyTypeResult, conventionResult.propertyType());
    Class<HolidayCalendarId> expectedPropertyTypeResult2 = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).calendar());
    assertSame(Meta.INSTANCE, conventionResult.metaBean());
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
    assertNull(BusinessDayAdjustment.meta().metaPropertyGet("Property Name"));
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
        BusinessDayAdjustment.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("convention");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("calendar");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("calendar", getResult2.name());
    assertEquals("convention", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<BusinessDayAdjustment> expectedDeclaringTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<BusinessDayAdjustment> expectedDeclaringTypeResult2 = BusinessDayAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<BusinessDayConvention> expectedPropertyTypeResult = BusinessDayConvention.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<HolidayCalendarId> expectedPropertyTypeResult2 = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
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
    assertNull(BusinessDayAdjustment.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        BusinessDayAdjustment.meta().propertyGet(BusinessDayAdjustment.NONE, "calendar", true);

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
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BusinessDayAdjustment.meta()
                .propertyGet(BusinessDayAdjustment.NONE, "convention", true));
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
            BusinessDayAdjustment.meta()
                .propertyGet(BusinessDayAdjustment.NONE, "Property Name", false));
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
        () ->
            BusinessDayAdjustment.meta()
                .propertySet(mock(Bean.class), "calendar", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BusinessDayAdjustment.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", true));
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
            BusinessDayAdjustment.meta()
                .propertySet(mock(Bean.class), "calendar", "New Value", false));
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
            BusinessDayAdjustment.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link BusinessDayAdjustment#of(BusinessDayConvention, HolidayCalendarId)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return Convention is {@link BusinessDayConventions#FOLLOWING}.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#of(BusinessDayConvention,
   * HolidayCalendarId)}
   */
  @Test
  @DisplayName(
      "Test of(BusinessDayConvention, HolidayCalendarId); when AUSY; then return Convention is FOLLOWING")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BusinessDayAdjustment BusinessDayAdjustment.of(BusinessDayConvention, HolidayCalendarId)"
  })
  void testOf_whenAusy_thenReturnConventionIsFollowing() {
    // Arrange
    BusinessDayConvention convention = BusinessDayConventions.FOLLOWING;
    HolidayCalendarId calendar = HolidayCalendarIds.AUSY;

    // Act
    BusinessDayAdjustment actualOfResult = BusinessDayAdjustment.of(convention, calendar);

    // Assert
    assertSame(convention, actualOfResult.getConvention());
    assertSame(calendar, actualOfResult.getCalendar());
  }

  /**
   * Test {@link BusinessDayAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given builder calendar {@link HolidayCalendarIds#AUSY} convention {@link
   *       BusinessDayConventions#FOLLOWING} build.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjust(LocalDate, ReferenceData); given builder calendar AUSY convention FOLLOWING build")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate BusinessDayAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_givenBuilderCalendarAusyConventionFollowingBuild() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = businessDayAdjustment.adjust(date, refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link BusinessDayAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link BusinessDayAdjustment#NONE}.
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjust(LocalDate, ReferenceData); given NONE; then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate BusinessDayAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_givenNone_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = BusinessDayAdjustment.NONE.adjust(date, refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link BusinessDayAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link BusinessDayAdjustment#NONE}.
   *   <li>Then {@link LocalDate} with {@code 1970} and one and one toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); given NONE; then LocalDate with '1970' and one and one toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster BusinessDayAdjustment.resolve(ReferenceData)"
  })
  void testResolve_givenNone_thenLocalDateWith1970AndOneAndOneToStringIs19700101() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = businessDayAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = businessDayAdjustment.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link BusinessDayAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link BusinessDayAdjustment#NONE}.
   *   <li>Then {@link BusinessDayAdjustment#NONE} Calendar Name is {@code NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData); given NONE; then NONE Calendar Name is 'NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster BusinessDayAdjustment.resolve(ReferenceData)"
  })
  void testResolve_givenNone_thenNoneCalendarNameIsNoHolidays() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    businessDayAdjustment.resolve(refData);

    // Assert that nothing has changed
    verify(refData).getValue(isA(ReferenceDataId.class));
    HolidayCalendarId calendar = businessDayAdjustment.getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
  }

  /**
   * Test {@link BusinessDayAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then builder calendar {@link HolidayCalendarIds#AUSY} convention {@link
   *       BusinessDayConventions#FOLLOWING} build Calendar Name is {@code AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then builder calendar AUSY convention FOLLOWING build Calendar Name is 'AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster BusinessDayAdjustment.resolve(ReferenceData)"
  })
  void testResolve_thenBuilderCalendarAusyConventionFollowingBuildCalendarNameIsAusy() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = businessDayAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    HolidayCalendarId calendar = businessDayAdjustment.getCalendar();
    assertEquals("AUSY", calendar.getName());
    assertEquals("AUSY", calendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link BusinessDayAdjustment#toString()}.
   *
   * <ul>
   *   <li>Given builder calendar {@link HolidayCalendarIds#NO_HOLIDAYS} convention {@link
   *       BusinessDayConventions#NO_ADJUST} build.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); given builder calendar NO_HOLIDAYS convention NO_ADJUST build")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BusinessDayAdjustment.toString()"})
  void testToString_givenBuilderCalendarNo_holidaysConventionNo_adjustBuild() {
    // Arrange, Act and Assert
    assertEquals(
        "NoAdjust",
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.NO_HOLIDAYS)
            .convention(BusinessDayConventions.NO_ADJUST)
            .build()
            .toString());
  }

  /**
   * Test {@link BusinessDayAdjustment#toString()}.
   *
   * <ul>
   *   <li>Given {@link BusinessDayAdjustment#NONE}.
   *   <li>Then return {@code NoAdjust}.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); given NONE; then return 'NoAdjust'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BusinessDayAdjustment.toString()"})
  void testToString_givenNone_thenReturnNoAdjust() {
    // Arrange, Act and Assert
    assertEquals("NoAdjust", BusinessDayAdjustment.NONE.toString());
  }

  /**
   * Test {@link BusinessDayAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then return {@code Following using calendar AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'Following using calendar AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BusinessDayAdjustment.toString()"})
  void testToString_thenReturnFollowingUsingCalendarAusy() {
    // Arrange, Act and Assert
    assertEquals(
        "Following using calendar AUSY",
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build()
            .toString());
  }

  /**
   * Test {@link BusinessDayAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then return {@code NoAdjust using calendar AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'NoAdjust using calendar AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BusinessDayAdjustment.toString()"})
  void testToString_thenReturnNoAdjustUsingCalendarAusy() {
    // Arrange, Act and Assert
    assertEquals(
        "NoAdjust using calendar AUSY",
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.NO_ADJUST)
            .build()
            .toString());
  }

  /**
   * Test {@link BusinessDayAdjustment#meta()}.
   *
   * <p>Method under test: {@link BusinessDayAdjustment#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BusinessDayAdjustment.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = BusinessDayAdjustment.meta();

    // Assert
    MetaProperty<HolidayCalendarId> calendarResult = actualMetaResult.calendar();
    assertTrue(calendarResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayConvention> conventionResult = actualMetaResult.convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    assertEquals("calendar", calendarResult.name());
    assertEquals("convention", conventionResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, calendarResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, conventionResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<BusinessDayAdjustment> expectedDeclaringTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, calendarResult.declaringType());
    Class<BusinessDayAdjustment> expectedDeclaringTypeResult2 = BusinessDayAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, conventionResult.declaringType());
    Class<BusinessDayConvention> expectedPropertyTypeResult = BusinessDayConvention.class;
    assertEquals(expectedPropertyTypeResult, conventionResult.propertyType());
    Class<HolidayCalendarId> expectedPropertyTypeResult2 = HolidayCalendarId.class;
    assertEquals(expectedPropertyTypeResult2, calendarResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, calendarResult.metaBean());
    assertSame(meta, conventionResult.metaBean());
  }

  /**
   * Test {@link BusinessDayAdjustment#metaBean()}.
   *
   * <p>Method under test: {@link BusinessDayAdjustment#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BusinessDayAdjustment.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, BusinessDayAdjustment.NONE.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BusinessDayAdjustment#getCalendar()}
   *   <li>{@link BusinessDayAdjustment#getConvention()}
   *   <li>{@link BusinessDayAdjustment#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HolidayCalendarId BusinessDayAdjustment.getCalendar()",
    "BusinessDayConvention BusinessDayAdjustment.getConvention()",
    "Builder BusinessDayAdjustment.toBuilder()"
  })
  void testGettersAndSetters() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;

    // Act
    HolidayCalendarId actualCalendar = businessDayAdjustment.getCalendar();
    businessDayAdjustment.getConvention();
    businessDayAdjustment.toBuilder();

    // Assert
    assertEquals("NoHolidays", actualCalendar.getName());
    assertEquals("NoHolidays", actualCalendar.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualCalendar.getReferenceDataType());
  }

  /**
   * Test {@link BusinessDayAdjustment#equals(Object)}, and {@link
   * BusinessDayAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BusinessDayAdjustment#equals(Object)}
   *   <li>{@link BusinessDayAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BusinessDayAdjustment.equals(Object)",
    "int BusinessDayAdjustment.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;
    BusinessDayAdjustment businessDayAdjustment2 = BusinessDayAdjustment.NONE;

    // Act and Assert
    assertEquals(businessDayAdjustment, businessDayAdjustment2);
    assertEquals(businessDayAdjustment.hashCode(), businessDayAdjustment2.hashCode());
  }

  /**
   * Test {@link BusinessDayAdjustment#equals(Object)}, and {@link
   * BusinessDayAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BusinessDayAdjustment#equals(Object)}
   *   <li>{@link BusinessDayAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BusinessDayAdjustment.equals(Object)",
    "int BusinessDayAdjustment.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();
    BusinessDayAdjustment businessDayAdjustment2 =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();

    // Act and Assert
    assertEquals(businessDayAdjustment, businessDayAdjustment2);
    assertEquals(businessDayAdjustment.hashCode(), businessDayAdjustment2.hashCode());
  }

  /**
   * Test {@link BusinessDayAdjustment#equals(Object)}, and {@link
   * BusinessDayAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BusinessDayAdjustment#equals(Object)}
   *   <li>{@link BusinessDayAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BusinessDayAdjustment.equals(Object)",
    "int BusinessDayAdjustment.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BusinessDayAdjustment businessDayAdjustment = BusinessDayAdjustment.NONE;

    // Act and Assert
    assertEquals(businessDayAdjustment, businessDayAdjustment);
    int expectedHashCodeResult = businessDayAdjustment.hashCode();
    assertEquals(expectedHashCodeResult, businessDayAdjustment.hashCode());
  }

  /**
   * Test {@link BusinessDayAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BusinessDayAdjustment.equals(Object)",
    "int BusinessDayAdjustment.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build(),
        BusinessDayAdjustment.NONE);
  }

  /**
   * Test {@link BusinessDayAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BusinessDayAdjustment.equals(Object)",
    "int BusinessDayAdjustment.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.NO_ADJUST)
            .build(),
        BusinessDayAdjustment.NONE);
  }

  /**
   * Test {@link BusinessDayAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BusinessDayAdjustment.equals(Object)",
    "int BusinessDayAdjustment.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BusinessDayAdjustment.NONE, null);
  }

  /**
   * Test {@link BusinessDayAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BusinessDayAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean BusinessDayAdjustment.equals(Object)",
    "int BusinessDayAdjustment.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BusinessDayAdjustment.NONE, "Different type to BusinessDayAdjustment");
  }
}
