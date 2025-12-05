package com.opengamma.strata.basics.schedule;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.AdjustableDate;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.schedule.PeriodicSchedule.Builder;
import com.opengamma.strata.basics.schedule.PeriodicSchedule.Meta;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PeriodicScheduleDiffblueTest {
  /**
   * Test {@link PeriodicSchedule#builder()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PeriodicSchedule#builder()}
   *   <li>{@link PeriodicSchedule#endDateBusinessDayAdjustment(BusinessDayAdjustment)}
   *   <li>{@link PeriodicSchedule#firstRegularStartDate(LocalDate)}
   *   <li>{@link PeriodicSchedule#lastRegularEndDate(LocalDate)}
   *   <li>{@link PeriodicSchedule#overrideStartDate(AdjustableDate)}
   *   <li>{@link PeriodicSchedule#rollConvention(RollConvention)}
   *   <li>{@link PeriodicSchedule#startDateBusinessDayAdjustment(BusinessDayAdjustment)}
   *   <li>{@link PeriodicSchedule#stubConvention(StubConvention)}
   * </ul>
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PeriodicSchedule Builder.build()",
    "Builder Builder.endDateBusinessDayAdjustment(BusinessDayAdjustment)",
    "Builder Builder.firstRegularStartDate(LocalDate)",
    "Builder Builder.lastRegularEndDate(LocalDate)",
    "Builder Builder.overrideStartDate(AdjustableDate)",
    "Builder Builder.rollConvention(RollConvention)",
    "Builder Builder.startDateBusinessDayAdjustment(BusinessDayAdjustment)",
    "Builder Builder.stubConvention(StubConvention)",
    "String Builder.toString()"
  })
  void testBuilder() {
    // Arrange and Act
    Builder actualStartDateBusinessDayAdjustmentResult =
        PeriodicSchedule.builder()
            .businessDayAdjustment(BusinessDayAdjustment.NONE)
            .endDate(LocalDate.of(1970, 1, 1))
            .endDateBusinessDayAdjustment(BusinessDayAdjustment.NONE)
            .firstRegularStartDate(LocalDate.of(1970, 1, 1))
            .frequency(Frequency.P12M)
            .lastRegularEndDate(LocalDate.of(1970, 1, 1))
            .overrideStartDate(null)
            .rollConvention(RollConventions.DAY_1)
            .startDate(LocalDate.of(1970, 1, 1))
            .startDateBusinessDayAdjustment(BusinessDayAdjustment.NONE);
    Builder actualStubConventionResult =
        actualStartDateBusinessDayAdjustmentResult.stubConvention(StubConvention.NONE);

    // Assert
    assertSame(actualStartDateBusinessDayAdjustmentResult, actualStubConventionResult);
  }

  /**
   * Test Builder {@link Builder#businessDayAdjustment(BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link BusinessDayAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#businessDayAdjustment(BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test Builder businessDayAdjustment(BusinessDayAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.businessDayAdjustment(BusinessDayAdjustment)"})
  void testBuilderBusinessDayAdjustment_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PeriodicSchedule.builder();

    // Act
    Builder actualBusinessDayAdjustmentResult =
        builderResult.businessDayAdjustment(BusinessDayAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualBusinessDayAdjustmentResult);
  }

  /**
   * Test Builder {@link Builder#endDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#endDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder endDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.endDate(LocalDate)"})
  void testBuilderEndDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PeriodicSchedule.builder();

    // Act
    Builder actualEndDateResult = builderResult.endDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualEndDateResult);
  }

  /**
   * Test Builder {@link Builder#frequency(Frequency)}.
   *
   * <ul>
   *   <li>When {@link Frequency#P12M}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#frequency(Frequency)}
   */
  @Test
  @DisplayName("Test Builder frequency(Frequency); when P12M; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.frequency(Frequency)"})
  void testBuilderFrequency_whenP12m_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PeriodicSchedule.builder();

    // Act
    Builder actualFrequencyResult = builderResult.frequency(Frequency.P12M);

    // Assert
    assertSame(builderResult, actualFrequencyResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code businessDayAdjustment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'businessDayAdjustment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenBusinessDayAdjustment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PeriodicSchedule.builder().get("businessDayAdjustment"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'endDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenEndDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PeriodicSchedule.builder().get("endDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code frequency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'frequency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFrequency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PeriodicSchedule.builder().get("frequency"));
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
        NoSuchElementException.class, () -> PeriodicSchedule.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'startDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenStartDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(PeriodicSchedule.builder().get("startDate"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PeriodicSchedule.builder();

    // Act
    Builder actualSetResult =
        builderResult.set("businessDayAdjustment", BusinessDayAdjustment.NONE);

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
        () -> PeriodicSchedule.builder().set("Property Name", "New Value"));
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
    Builder builderResult = PeriodicSchedule.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#startDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#startDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder startDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.startDate(LocalDate)"})
  void testBuilderStartDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = PeriodicSchedule.builder();

    // Act
    Builder actualStartDateResult = builderResult.startDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualStartDateResult);
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
    Class<? extends PeriodicSchedule> actualBeanTypeResult = PeriodicSchedule.meta().beanType();

    // Assert
    Class<PeriodicSchedule> expectedBeanTypeResult = PeriodicSchedule.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#businessDayAdjustment()}
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#endDateBusinessDayAdjustment()}
   *   <li>{@link Meta#firstRegularStartDate()}
   *   <li>{@link Meta#frequency()}
   *   <li>{@link Meta#lastRegularEndDate()}
   *   <li>{@link Meta#overrideStartDate()}
   *   <li>{@link Meta#rollConvention()}
   *   <li>{@link Meta#startDate()}
   *   <li>{@link Meta#startDateBusinessDayAdjustment()}
   *   <li>{@link Meta#stubConvention()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.businessDayAdjustment()",
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.endDateBusinessDayAdjustment()",
    "MetaProperty Meta.firstRegularStartDate()",
    "MetaProperty Meta.frequency()",
    "MetaProperty Meta.lastRegularEndDate()",
    "MetaProperty Meta.overrideStartDate()",
    "MetaProperty Meta.rollConvention()",
    "MetaProperty Meta.startDate()",
    "MetaProperty Meta.startDateBusinessDayAdjustment()",
    "MetaProperty Meta.stubConvention()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = PeriodicSchedule.meta();

    // Act
    MetaProperty<BusinessDayAdjustment> actualBusinessDayAdjustmentResult =
        metaResult.businessDayAdjustment();
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<BusinessDayAdjustment> actualEndDateBusinessDayAdjustmentResult =
        metaResult.endDateBusinessDayAdjustment();
    MetaProperty<LocalDate> actualFirstRegularStartDateResult = metaResult.firstRegularStartDate();
    MetaProperty<Frequency> actualFrequencyResult = metaResult.frequency();
    MetaProperty<LocalDate> actualLastRegularEndDateResult = metaResult.lastRegularEndDate();
    MetaProperty<AdjustableDate> actualOverrideStartDateResult = metaResult.overrideStartDate();
    MetaProperty<RollConvention> actualRollConventionResult = metaResult.rollConvention();
    MetaProperty<LocalDate> actualStartDateResult = metaResult.startDate();
    MetaProperty<BusinessDayAdjustment> actualStartDateBusinessDayAdjustmentResult =
        metaResult.startDateBusinessDayAdjustment();

    // Assert
    assertTrue(actualBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualEndDateBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualFirstRegularStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualFrequencyResult instanceof DirectMetaProperty);
    assertTrue(actualLastRegularEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualOverrideStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualRollConventionResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateBusinessDayAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(metaResult.stubConvention() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code businessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'businessDayAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsBusinessDayAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("businessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("businessDayAdjustment", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).businessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code endDateBusinessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'endDateBusinessDayAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsEndDateBusinessDayAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("endDateBusinessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("endDateBusinessDayAdjustment", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDateBusinessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code firstRegularStartDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'firstRegularStartDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsFirstRegularStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("firstRegularStartDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("firstRegularStartDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstRegularStartDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code lastRegularEndDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'lastRegularEndDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsLastRegularEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("lastRegularEndDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("lastRegularEndDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lastRegularEndDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code startDateBusinessDayAdjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then return name is 'startDateBusinessDayAdjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStartDateBusinessDayAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("startDateBusinessDayAdjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertEquals("startDateBusinessDayAdjustment", actualMetaPropertyGetResult.name());
    assertSame(
        actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDateBusinessDayAdjustment());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return name is {@code endDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'endDate'; then return name is 'endDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEndDate_thenReturnNameIsEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code frequency}.
   *   <li>Then return name is {@code frequency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'frequency'; then return name is 'frequency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFrequency_thenReturnNameIsFrequency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("frequency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("frequency", actualMetaPropertyGetResult.name());
    Class<Frequency> expectedPropertyTypeResult = Frequency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).frequency());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code overrideStartDate}.
   *   <li>Then return name is {@code overrideStartDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'overrideStartDate'; then return name is 'overrideStartDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenOverrideStartDate_thenReturnNameIsOverrideStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("overrideStartDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("overrideStartDate", actualMetaPropertyGetResult.name());
    Class<AdjustableDate> expectedPropertyTypeResult = AdjustableDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).overrideStartDate());
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
    assertNull(PeriodicSchedule.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rollConvention}.
   *   <li>Then return name is {@code rollConvention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'rollConvention'; then return name is 'rollConvention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRollConvention_thenReturnNameIsRollConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("rollConvention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).startDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("rollConvention", actualMetaPropertyGetResult.name());
    Class<RollConvention> expectedPropertyTypeResult = RollConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rollConvention());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return name is {@code startDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startDate'; then return name is 'startDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartDate_thenReturnNameIsStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        PeriodicSchedule.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).businessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).endDate() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).endDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).frequency() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lastRegularEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).overrideStartDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rollConvention() instanceof DirectMetaProperty);
    assertTrue(
        ((Meta) metaBeanResult).startDateBusinessDayAdjustment() instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
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
        PeriodicSchedule.meta().metaPropertyMap();

    // Assert
    assertEquals(11, actualMetaPropertyMapResult.size());
    assertTrue(
        actualMetaPropertyMapResult.get("businessDayAdjustment") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("endDate") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("endDateBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("firstRegularStartDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("frequency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lastRegularEndDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("overrideStartDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rollConvention") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startDate") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("startDateBusinessDayAdjustment")
            instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("stubConvention") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code businessDayAdjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'businessDayAdjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBusinessDayAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PeriodicSchedule.meta()
                .propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code endDateBusinessDayAdjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'endDateBusinessDayAdjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEndDateBusinessDayAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PeriodicSchedule.meta()
                .propertySet(mock(Bean.class), "endDateBusinessDayAdjustment", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'endDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEndDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> PeriodicSchedule.meta().propertySet(mock(Bean.class), "endDate", "New Value", true));
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
            PeriodicSchedule.meta()
                .propertySet(mock(Bean.class), "businessDayAdjustment", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code firstRegularStartDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'firstRegularStartDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFirstRegularStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PeriodicSchedule.meta()
                .propertySet(mock(Bean.class), "firstRegularStartDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code frequency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'frequency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFrequency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            PeriodicSchedule.meta().propertySet(mock(Bean.class), "frequency", "New Value", true));
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
            PeriodicSchedule.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
