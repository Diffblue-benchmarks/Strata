package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import com.opengamma.strata.basics.date.PeriodAdjustment.Builder;
import com.opengamma.strata.basics.date.PeriodAdjustment.Meta;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
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

class PeriodAdjustmentDiffblueTest {
  /**
   * Test {@link PeriodAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link PeriodAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjust(LocalDate, ReferenceData); given FRI_SAT; then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate PeriodAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_givenFri_sat_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = PeriodAdjustment.NONE.adjust(date, refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test Builder {@link Builder#additionConvention(PeriodAdditionConvention)}.
   *
   * <ul>
   *   <li>When {@link PeriodAdditionConventions#LAST_BUSINESS_DAY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#additionConvention(PeriodAdditionConvention)}
   */
  @Test
  @DisplayName(
      "Test Builder additionConvention(PeriodAdditionConvention); when LAST_BUSINESS_DAY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.additionConvention(PeriodAdditionConvention)"})
  void testBuilderAdditionConvention_whenLast_business_day_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PeriodAdjustment.builder();

    // Act
    Builder actualAdditionConventionResult =
        builderResult.additionConvention(PeriodAdditionConventions.LAST_BUSINESS_DAY);

    // Assert
    assertSame(builderResult, actualAdditionConventionResult);
  }

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
    Builder builderResult = PeriodAdjustment.builder();

    // Act
    Builder actualAdjustmentResult = builderResult.adjustment(BusinessDayAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualAdjustmentResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code additionConvention}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'additionConvention'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAdditionConvention_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PeriodAdjustment.builder().get("additionConvention"));
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
    assertNull(PeriodAdjustment.builder().get("adjustment"));
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
        NoSuchElementException.class, () -> PeriodAdjustment.builder().get("Property Name"));
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
        () -> PeriodAdjustment.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code additionConvention}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'additionConvention'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenAdditionConvention_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PeriodAdjustment.builder();

    // Act
    Builder actualSetResult = builderResult.set("additionConvention", null);

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
    Builder builderResult = PeriodAdjustment.builder();

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
    Class<? extends PeriodAdjustment> actualBeanTypeResult = PeriodAdjustment.meta().beanType();

    // Assert
    Class<PeriodAdjustment> expectedBeanTypeResult = PeriodAdjustment.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#additionConvention()}
   *   <li>{@link Meta#adjustment()}
   *   <li>{@link Meta#period()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.additionConvention()",
    "MetaProperty Meta.adjustment()",
    "MetaProperty Meta.period()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = PeriodAdjustment.meta();

    // Act
    MetaProperty<PeriodAdditionConvention> actualAdditionConventionResult =
        metaResult.additionConvention();
    MetaProperty<BusinessDayAdjustment> actualAdjustmentResult = metaResult.adjustment();

    // Assert
    assertTrue(actualAdditionConventionResult instanceof DirectMetaProperty);
    assertTrue(actualAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(metaResult.period() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code additionConvention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'additionConvention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsAdditionConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodAdjustment.meta().metaPropertyGet("additionConvention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Period> periodResult = ((Meta) metaBeanResult).period();
    assertTrue(periodResult instanceof DirectMetaProperty);
    assertEquals("additionConvention", actualMetaPropertyGetResult.name());
    Class<PeriodAdditionConvention> expectedPropertyTypeResult = PeriodAdditionConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).additionConvention());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
    assertSame(metaBeanResult, periodResult.metaBean());
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
        PeriodAdjustment.meta().metaPropertyGet("adjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PeriodAdditionConvention> additionConventionResult =
        ((Meta) metaBeanResult).additionConvention();
    assertTrue(additionConventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Period> periodResult = ((Meta) metaBeanResult).period();
    assertTrue(periodResult instanceof DirectMetaProperty);
    assertEquals("adjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).adjustment());
    assertSame(metaBeanResult, additionConventionResult.metaBean());
    assertSame(metaBeanResult, periodResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code period}.
   *   <li>Then return name is {@code period}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'period'; then return name is 'period'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPeriod_thenReturnNameIsPeriod() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = PeriodAdjustment.meta().metaPropertyGet("period");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PeriodAdditionConvention> additionConventionResult =
        ((Meta) metaBeanResult).additionConvention();
    assertTrue(additionConventionResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("period", actualMetaPropertyGetResult.name());
    Class<Period> expectedPropertyTypeResult = Period.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).period());
    assertSame(metaBeanResult, additionConventionResult.metaBean());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
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
    assertNull(PeriodAdjustment.meta().metaPropertyGet("Property Name"));
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
        PeriodAdjustment.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("period");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("additionConvention");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("adjustment");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("additionConvention", getResult2.name());
    assertEquals("adjustment", getResult3.name());
    assertEquals("period", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<PeriodAdditionConvention> expectedPropertyTypeResult2 = PeriodAdditionConvention.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<PeriodAdjustment> expectedDeclaringTypeResult = PeriodAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<PeriodAdjustment> expectedDeclaringTypeResult2 = PeriodAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<PeriodAdjustment> expectedDeclaringTypeResult3 = PeriodAdjustment.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<Period> expectedPropertyTypeResult3 = Period.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code additionConvention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'additionConvention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAdditionConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PeriodAdjustment.meta().propertyGet(PeriodAdjustment.NONE, "additionConvention", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then {@link PeriodAdjustment#NONE} Adjustment is {@link BusinessDayAdjustment#NONE}.
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
    PeriodAdjustment bean = PeriodAdjustment.NONE;

    // Act
    Object actualPropertyGetResult = PeriodAdjustment.meta().propertyGet(bean, "adjustment", true);

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
    assertNull(PeriodAdjustment.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> PeriodAdjustment.meta().propertyGet(PeriodAdjustment.NONE, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code period}.
   *   <li>Then {@link PeriodAdjustment#NONE} Period is {@link Period#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'period'; then NONE Period is ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPeriod_thenNonePeriodIsZero() {
    // Arrange
    PeriodAdjustment bean = PeriodAdjustment.NONE;

    // Act
    Object actualPropertyGetResult = PeriodAdjustment.meta().propertyGet(bean, "period", true);

    // Assert
    Period period = ((Period) actualPropertyGetResult).ZERO;
    assertSame(period, bean.getPeriod());
    assertSame(period, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code additionConvention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'additionConvention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdditionConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PeriodAdjustment.meta()
                .propertySet(mock(Bean.class), "additionConvention", "New Value", true));
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
            PeriodAdjustment.meta().propertySet(mock(Bean.class), "adjustment", "New Value", true));
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
            PeriodAdjustment.meta()
                .propertySet(mock(Bean.class), "additionConvention", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code period}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'period'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPeriod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> PeriodAdjustment.meta().propertySet(mock(Bean.class), "period", "New Value", true));
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
            PeriodAdjustment.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link PeriodAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then {@link LocalDate} with {@code 1970} and one and one toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link PeriodAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); given FRI_SAT; then LocalDate with '1970' and one and one toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster PeriodAdjustment.resolve(ReferenceData)"
  })
  void testResolve_givenFri_sat_thenLocalDateWith1970AndOneAndOneToStringIs19700101() {
    // Arrange
    PeriodAdjustment periodAdjustment = PeriodAdjustment.NONE;

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualAdjustResult = periodAdjustment.resolve(refData).adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-01-01", date.toString());
    Period period = periodAdjustment.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0, period.getMonths());
    assertEquals(0, period.getYears());
    assertEquals(0L, period.toTotalMonths());
    assertEquals(3, period.getUnits().size());
    assertFalse(period.isNegative());
    assertTrue(period.isZero());
    assertSame(date, actualAdjustResult);
  }

  /**
   * Test {@link PeriodAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then {@link PeriodAdjustment#NONE} Period Units first {@link ChronoUnit}.
   * </ul>
   *
   * <p>Method under test: {@link PeriodAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); given FRI_SAT; then NONE Period Units first ChronoUnit")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster PeriodAdjustment.resolve(ReferenceData)"
  })
  void testResolve_givenFri_sat_thenNonePeriodUnitsFirstChronoUnit() {
    // Arrange
    PeriodAdjustment periodAdjustment = PeriodAdjustment.NONE;

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    periodAdjustment.resolve(refData);

    // Assert that nothing has changed
    verify(refData).getValue(isA(ReferenceDataId.class));
    Period period = periodAdjustment.getPeriod();
    List<TemporalUnit> units = period.getUnits();
    assertEquals(3, units.size());
    TemporalUnit getResult = units.get(0);
    assertTrue(getResult instanceof ChronoUnit);
    TemporalUnit getResult2 = units.get(1);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = units.get(2);
    assertTrue(getResult3 instanceof ChronoUnit);
    IsoChronology chronology = period.getChronology();
    assertEquals("ISO", chronology.getId());
    HolidayCalendarId calendar = periodAdjustment.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    assertEquals("iso8601", chronology.getCalendarType());
    assertEquals(0, period.getDays());
    assertEquals(0, period.getMonths());
    assertEquals(0, period.getYears());
    assertEquals(0L, period.toTotalMonths());
    assertEquals(ChronoUnit.DAYS, getResult3);
    assertEquals(ChronoUnit.MONTHS, getResult2);
    assertEquals(ChronoUnit.YEARS, getResult);
    assertFalse(period.isNegative());
    assertTrue(period.isZero());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
  }

  /**
   * Test {@link PeriodAdjustment#toString()}.
   *
   * <p>Method under test: {@link PeriodAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PeriodAdjustment.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("P0D", PeriodAdjustment.NONE.toString());
  }

  /**
   * Test {@link PeriodAdjustment#meta()}.
   *
   * <p>Method under test: {@link PeriodAdjustment#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PeriodAdjustment.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = PeriodAdjustment.meta();

    // Assert
    MetaProperty<PeriodAdditionConvention> additionConventionResult =
        actualMetaResult.additionConvention();
    assertTrue(additionConventionResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = actualMetaResult.adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<Period> periodResult = actualMetaResult.period();
    assertTrue(periodResult instanceof DirectMetaProperty);
    assertEquals("additionConvention", additionConventionResult.name());
    assertEquals("adjustment", adjustmentResult.name());
    assertEquals("period", periodResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, additionConventionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, periodResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, adjustmentResult.propertyType());
    Class<PeriodAdditionConvention> expectedPropertyTypeResult2 = PeriodAdditionConvention.class;
    assertEquals(expectedPropertyTypeResult2, additionConventionResult.propertyType());
    Class<PeriodAdjustment> expectedDeclaringTypeResult = PeriodAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, additionConventionResult.declaringType());
    Class<PeriodAdjustment> expectedDeclaringTypeResult2 = PeriodAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, adjustmentResult.declaringType());
    Class<PeriodAdjustment> expectedDeclaringTypeResult3 = PeriodAdjustment.class;
    assertEquals(expectedDeclaringTypeResult3, periodResult.declaringType());
    Class<Period> expectedPropertyTypeResult3 = Period.class;
    assertEquals(expectedPropertyTypeResult3, periodResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, additionConventionResult.metaBean());
    assertSame(meta, adjustmentResult.metaBean());
    assertSame(meta, periodResult.metaBean());
  }

  /**
   * Test {@link PeriodAdjustment#metaBean()}.
   *
   * <p>Method under test: {@link PeriodAdjustment#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PeriodAdjustment.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, PeriodAdjustment.NONE.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PeriodAdjustment#getAdditionConvention()}
   *   <li>{@link PeriodAdjustment#getAdjustment()}
   *   <li>{@link PeriodAdjustment#getPeriod()}
   *   <li>{@link PeriodAdjustment#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PeriodAdditionConvention PeriodAdjustment.getAdditionConvention()",
    "BusinessDayAdjustment PeriodAdjustment.getAdjustment()",
    "Period PeriodAdjustment.getPeriod()",
    "Builder PeriodAdjustment.toBuilder()"
  })
  void testGettersAndSetters() {
    // Arrange
    PeriodAdjustment periodAdjustment = PeriodAdjustment.NONE;

    // Act
    periodAdjustment.getAdditionConvention();
    BusinessDayAdjustment actualAdjustment = periodAdjustment.getAdjustment();
    Period actualPeriod = periodAdjustment.getPeriod();
    periodAdjustment.toBuilder();

    // Assert
    assertSame(BusinessDayAdjustment.NONE, actualAdjustment);
    assertSame(Period.ZERO, actualPeriod);
  }

  /**
   * Test {@link PeriodAdjustment#equals(Object)}, and {@link PeriodAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PeriodAdjustment#equals(Object)}
   *   <li>{@link PeriodAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PeriodAdjustment.equals(Object)", "int PeriodAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PeriodAdjustment periodAdjustment = PeriodAdjustment.NONE;
    PeriodAdjustment periodAdjustment2 = PeriodAdjustment.NONE;

    // Act and Assert
    assertEquals(periodAdjustment, periodAdjustment2);
    assertEquals(periodAdjustment.hashCode(), periodAdjustment2.hashCode());
  }

  /**
   * Test {@link PeriodAdjustment#equals(Object)}, and {@link PeriodAdjustment#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PeriodAdjustment#equals(Object)}
   *   <li>{@link PeriodAdjustment#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PeriodAdjustment.equals(Object)", "int PeriodAdjustment.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PeriodAdjustment periodAdjustment = PeriodAdjustment.NONE;

    // Act and Assert
    assertEquals(periodAdjustment, periodAdjustment);
    int expectedHashCodeResult = periodAdjustment.hashCode();
    assertEquals(expectedHashCodeResult, periodAdjustment.hashCode());
  }

  /**
   * Test {@link PeriodAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PeriodAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PeriodAdjustment.equals(Object)", "int PeriodAdjustment.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PeriodAdjustment.NONE, null);
  }

  /**
   * Test {@link PeriodAdjustment#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PeriodAdjustment#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PeriodAdjustment.equals(Object)", "int PeriodAdjustment.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PeriodAdjustment.NONE, "Different type to PeriodAdjustment");
  }
}
