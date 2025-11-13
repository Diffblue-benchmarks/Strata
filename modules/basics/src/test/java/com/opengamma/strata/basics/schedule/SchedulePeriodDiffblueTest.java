package com.opengamma.strata.basics.schedule;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.BusinessDayAdjustment;
import com.opengamma.strata.basics.date.DateAdjuster;
import com.opengamma.strata.basics.schedule.SchedulePeriod.Builder;
import com.opengamma.strata.basics.schedule.SchedulePeriod.Meta;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SchedulePeriodDiffblueTest {
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
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualEndDateResult = builderResult.endDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualEndDateResult);
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
    assertNull(SchedulePeriod.builder().get("endDate"));
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
    assertThrows(NoSuchElementException.class, () -> SchedulePeriod.builder().get("Property Name"));
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
    assertNull(SchedulePeriod.builder().get("startDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'unadjustedEndDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenUnadjustedEndDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SchedulePeriod.builder().get("unadjustedEndDate"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code unadjustedStartDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'unadjustedStartDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenUnadjustedStartDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SchedulePeriod.builder().get("unadjustedStartDate"));
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
        () -> SchedulePeriod.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'endDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenEndDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("endDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'startDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenStartDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("startDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'unadjustedEndDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenUnadjustedEndDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("unadjustedEndDate", LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code unadjustedStartDate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'unadjustedStartDate'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenUnadjustedStartDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualSetResult = builderResult.set("unadjustedStartDate", LocalDate.of(1970, 1, 1));

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
    Builder builderResult = SchedulePeriod.builder();

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
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualStartDateResult = builderResult.startDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualStartDateResult);
  }

  /**
   * Test Builder {@link Builder#unadjustedEndDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#unadjustedEndDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder unadjustedEndDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.unadjustedEndDate(LocalDate)"})
  void testBuilderUnadjustedEndDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualUnadjustedEndDateResult =
        builderResult.unadjustedEndDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualUnadjustedEndDateResult);
  }

  /**
   * Test Builder {@link Builder#unadjustedStartDate(LocalDate)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#unadjustedStartDate(LocalDate)}
   */
  @Test
  @DisplayName("Test Builder unadjustedStartDate(LocalDate); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.unadjustedStartDate(LocalDate)"})
  void testBuilderUnadjustedStartDate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SchedulePeriod.builder();

    // Act
    Builder actualUnadjustedStartDateResult =
        builderResult.unadjustedStartDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualUnadjustedStartDateResult);
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
    Class<? extends SchedulePeriod> actualBeanTypeResult = SchedulePeriod.meta().beanType();

    // Assert
    Class<SchedulePeriod> expectedBeanTypeResult = SchedulePeriod.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#startDate()}
   *   <li>{@link Meta#unadjustedEndDate()}
   *   <li>{@link Meta#unadjustedStartDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.startDate()",
    "MetaProperty Meta.unadjustedEndDate()",
    "MetaProperty Meta.unadjustedStartDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SchedulePeriod.meta();

    // Act
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<LocalDate> actualStartDateResult = metaResult.startDate();
    MetaProperty<LocalDate> actualUnadjustedEndDateResult = metaResult.unadjustedEndDate();

    // Assert
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualStartDateResult instanceof DirectMetaProperty);
    assertTrue(actualUnadjustedEndDateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.unadjustedStartDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code unadjustedStartDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'unadjustedStartDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsUnadjustedStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SchedulePeriod.meta().metaPropertyGet("unadjustedStartDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedEndDateResult = ((Meta) metaBeanResult).unadjustedEndDate();
    assertTrue(unadjustedEndDateResult instanceof DirectMetaProperty);
    assertEquals("unadjustedStartDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).unadjustedStartDate());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedEndDateResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult = SchedulePeriod.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedEndDateResult = ((Meta) metaBeanResult).unadjustedEndDate();
    assertTrue(unadjustedEndDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedStartDateResult =
        ((Meta) metaBeanResult).unadjustedStartDate();
    assertTrue(unadjustedStartDateResult instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
    assertSame(metaBeanResult, startDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedEndDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedStartDateResult.metaBean());
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
    assertNull(SchedulePeriod.meta().metaPropertyGet("Property Name"));
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
        SchedulePeriod.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedEndDateResult = ((Meta) metaBeanResult).unadjustedEndDate();
    assertTrue(unadjustedEndDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedStartDateResult =
        ((Meta) metaBeanResult).unadjustedStartDate();
    assertTrue(unadjustedStartDateResult instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedEndDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedStartDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then return name is {@code unadjustedEndDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'unadjustedEndDate'; then return name is 'unadjustedEndDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnadjustedEndDate_thenReturnNameIsUnadjustedEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SchedulePeriod.meta().metaPropertyGet("unadjustedEndDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> unadjustedStartDateResult =
        ((Meta) metaBeanResult).unadjustedStartDate();
    assertTrue(unadjustedStartDateResult instanceof DirectMetaProperty);
    assertEquals("unadjustedEndDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).unadjustedEndDate());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
    assertSame(metaBeanResult, unadjustedStartDateResult.metaBean());
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
        SchedulePeriod.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("endDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("startDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("unadjustedEndDate") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("unadjustedStartDate") instanceof DirectMetaProperty);
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
    assertNull(SchedulePeriod.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'endDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEndDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = SchedulePeriod.meta();
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            SchedulePeriod.of(LocalDate.ofYearDay(1, 1), endDate), "endDate", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(endDate, actualPropertyGetResult);
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
        () -> SchedulePeriod.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return toString is {@code 0001-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'startDate'; then return toString is '0001-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStartDate_thenReturnToStringIs00010101() {
    // Arrange
    Meta metaResult = SchedulePeriod.meta();
    LocalDate startDate = LocalDate.ofYearDay(1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            SchedulePeriod.of(startDate, LocalDate.of(1970, 1, 1)), "startDate", true);

    // Assert
    assertEquals("0001-01-01", actualPropertyGetResult.toString());
    assertSame(startDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'unadjustedEndDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenUnadjustedEndDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = SchedulePeriod.meta();
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            SchedulePeriod.of(LocalDate.ofYearDay(1, 1), endDate), "unadjustedEndDate", true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(endDate, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjustedStartDate}.
   *   <li>Then return toString is {@code 0001-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'unadjustedStartDate'; then return toString is '0001-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenUnadjustedStartDate_thenReturnToStringIs00010101() {
    // Arrange
    Meta metaResult = SchedulePeriod.meta();
    LocalDate startDate = LocalDate.ofYearDay(1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            SchedulePeriod.of(startDate, LocalDate.of(1970, 1, 1)), "unadjustedStartDate", true);

    // Assert
    assertEquals("0001-01-01", actualPropertyGetResult.toString());
    assertSame(startDate, actualPropertyGetResult);
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
        () -> SchedulePeriod.meta().propertySet(mock(Bean.class), "endDate", "New Value", true));
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
        () -> SchedulePeriod.meta().propertySet(mock(Bean.class), "endDate", "New Value", false));
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
            SchedulePeriod.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> SchedulePeriod.meta().propertySet(mock(Bean.class), "startDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjustedEndDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'unadjustedEndDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnadjustedEndDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SchedulePeriod.meta()
                .propertySet(mock(Bean.class), "unadjustedEndDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code unadjustedStartDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'unadjustedStartDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnadjustedStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SchedulePeriod.meta()
                .propertySet(mock(Bean.class), "unadjustedStartDate", "New Value", true));
  }

  /**
   * Test {@link SchedulePeriod#of(LocalDate, LocalDate, LocalDate, LocalDate)} with {@code
   * startDate}, {@code endDate}, {@code unadjustedStartDate}, {@code unadjustedEndDate}.
   *
   * <p>Method under test: {@link SchedulePeriod#of(LocalDate, LocalDate, LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate, LocalDate, LocalDate) with 'startDate', 'endDate', 'unadjustedStartDate', 'unadjustedEndDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SchedulePeriod SchedulePeriod.of(LocalDate, LocalDate, LocalDate, LocalDate)"
  })
  void testOfWithStartDateEndDateUnadjustedStartDateUnadjustedEndDate() {
    // Arrange
    LocalDate startDate = LocalDate.ofYearDay(4, 4);
    LocalDate endDate = LocalDate.of(1970, 1, 1);
    LocalDate unadjustedStartDate = LocalDate.ofYearDay(4, 4);
    LocalDate unadjustedEndDate = LocalDate.of(1970, 1, 1);

    // Act
    SchedulePeriod actualOfResult =
        SchedulePeriod.of(startDate, endDate, unadjustedStartDate, unadjustedEndDate);

    // Assert
    Period lengthResult = actualOfResult.length();
    assertEquals(11, lengthResult.getMonths());
    assertEquals(1965, lengthResult.getYears());
    assertEquals(23591L, lengthResult.toTotalMonths());
    assertEquals(28, lengthResult.getDays());
    assertEquals(3, lengthResult.getUnits().size());
    assertFalse(lengthResult.isNegative());
    assertFalse(lengthResult.isZero());
    assertSame(endDate, actualOfResult.getEndDate());
    assertSame(unadjustedEndDate, actualOfResult.getUnadjustedEndDate());
    assertSame(startDate, actualOfResult.getStartDate());
    assertSame(unadjustedStartDate, actualOfResult.getUnadjustedStartDate());
  }

  /**
   * Test {@link SchedulePeriod#of(LocalDate, LocalDate)} with {@code startDate}, {@code endDate}.
   *
   * <ul>
   *   <li>Then return length Months is eleven.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#of(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, LocalDate) with 'startDate', 'endDate'; then return length Months is eleven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SchedulePeriod SchedulePeriod.of(LocalDate, LocalDate)"})
  void testOfWithStartDateEndDate_thenReturnLengthMonthsIsEleven() {
    // Arrange
    LocalDate startDate = LocalDate.ofYearDay(4, 4);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act
    SchedulePeriod actualOfResult = SchedulePeriod.of(startDate, endDate);

    // Assert
    Period lengthResult = actualOfResult.length();
    assertEquals(11, lengthResult.getMonths());
    assertEquals(1965, lengthResult.getYears());
    assertEquals(23591L, lengthResult.toTotalMonths());
    assertEquals(28, lengthResult.getDays());
    assertEquals(3, lengthResult.getUnits().size());
    assertFalse(lengthResult.isNegative());
    assertFalse(lengthResult.isZero());
    assertSame(endDate, actualOfResult.getEndDate());
    assertSame(endDate, actualOfResult.getUnadjustedEndDate());
    assertSame(startDate, actualOfResult.getStartDate());
    assertSame(startDate, actualOfResult.getUnadjustedStartDate());
  }

  /**
   * Test {@link SchedulePeriod#lengthInDays()}.
   *
   * <ul>
   *   <li>Then return {@code 719162}.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#lengthInDays()}
   */
  @Test
  @DisplayName("Test lengthInDays(); then return '719162'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SchedulePeriod.lengthInDays()"})
  void testLengthInDays_thenReturn719162() {
    // Arrange, Act and Assert
    assertEquals(
        719162,
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1)).lengthInDays());
  }

  /**
   * Test {@link SchedulePeriod#isRegular(Frequency, RollConvention)}.
   *
   * <ul>
   *   <li>Then calls {@link RollConvention#next(LocalDate, Frequency)}.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#isRegular(Frequency, RollConvention)}
   */
  @Test
  @DisplayName("Test isRegular(Frequency, RollConvention); then calls next(LocalDate, Frequency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SchedulePeriod.isRegular(Frequency, RollConvention)"})
  void testIsRegular_thenCallsNext() {
    // Arrange
    SchedulePeriod ofResult =
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1));

    RollConvention rollConvention = mock(RollConvention.class);
    when(rollConvention.previous(Mockito.<LocalDate>any(), Mockito.<Frequency>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));
    when(rollConvention.next(Mockito.<LocalDate>any(), Mockito.<Frequency>any()))
        .thenReturn(LocalDate.of(1970, 1, 1));

    // Act
    boolean actualIsRegularResult = ofResult.isRegular(Frequency.P12M, rollConvention);

    // Assert
    verify(rollConvention).next(isA(LocalDate.class), isA(Frequency.class));
    verify(rollConvention).previous(isA(LocalDate.class), isA(Frequency.class));
    assertFalse(actualIsRegularResult);
  }

  /**
   * Test {@link SchedulePeriod#isRegular(Frequency, RollConvention)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#isRegular(Frequency, RollConvention)}
   */
  @Test
  @DisplayName("Test isRegular(Frequency, RollConvention); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SchedulePeriod.isRegular(Frequency, RollConvention)"})
  void testIsRegular_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1))
            .isRegular(Frequency.P12M, RollConventions.DAY_1));
  }

  /**
   * Test {@link SchedulePeriod#isRegular(Frequency, RollConvention)}.
   *
   * <ul>
   *   <li>When {@link Frequency#P1D}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#isRegular(Frequency, RollConvention)}
   */
  @Test
  @DisplayName("Test isRegular(Frequency, RollConvention); when P1D; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SchedulePeriod.isRegular(Frequency, RollConvention)"})
  void testIsRegular_whenP1d_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1))
            .isRegular(Frequency.P1D, RollConventions.DAY_1));
  }

  /**
   * Test {@link SchedulePeriod#subSchedule(Frequency, RollConvention, StubConvention,
   * BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>Then return not EndDateBusinessDayAdjustment Present.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#subSchedule(Frequency, RollConvention,
   * StubConvention, BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test subSchedule(Frequency, RollConvention, StubConvention, BusinessDayAdjustment); then return not EndDateBusinessDayAdjustment Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PeriodicSchedule SchedulePeriod.subSchedule(Frequency, RollConvention, StubConvention, BusinessDayAdjustment)"
  })
  void testSubSchedule_thenReturnNotEndDateBusinessDayAdjustmentPresent() {
    // Arrange
    LocalDate startDate = LocalDate.ofYearDay(1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act
    PeriodicSchedule actualSubScheduleResult =
        SchedulePeriod.of(startDate, endDate)
            .subSchedule(
                Frequency.P12M,
                RollConventions.DAY_1,
                StubConvention.NONE,
                BusinessDayAdjustment.NONE);

    // Assert
    Optional<BusinessDayAdjustment> endDateBusinessDayAdjustment =
        actualSubScheduleResult.getEndDateBusinessDayAdjustment();
    assertFalse(endDateBusinessDayAdjustment.isPresent());
    assertSame(endDateBusinessDayAdjustment, actualSubScheduleResult.getFirstRegularStartDate());
    assertSame(endDateBusinessDayAdjustment, actualSubScheduleResult.getLastRegularEndDate());
    assertSame(endDateBusinessDayAdjustment, actualSubScheduleResult.getOverrideStartDate());
    assertSame(
        endDateBusinessDayAdjustment, actualSubScheduleResult.getStartDateBusinessDayAdjustment());
    assertSame(endDate, actualSubScheduleResult.getEndDate());
    assertSame(startDate, actualSubScheduleResult.getStartDate());
    assertSame(BusinessDayAdjustment.NONE, actualSubScheduleResult.getBusinessDayAdjustment());
    assertSame(Frequency.P12M, actualSubScheduleResult.getFrequency());
  }

  /**
   * Test {@link SchedulePeriod#toAdjusted(DateAdjuster, int)} with {@code adjuster}, {@code
   * mergeType}.
   *
   * <p>Method under test: {@link SchedulePeriod#toAdjusted(DateAdjuster, int)}
   */
  @Test
  @DisplayName("Test toAdjusted(DateAdjuster, int) with 'adjuster', 'mergeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SchedulePeriod SchedulePeriod.toAdjusted(DateAdjuster, int)"})
  void testToAdjustedWithAdjusterMergeType() {
    // Arrange
    SchedulePeriod ofResult = SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.now());

    DateAdjuster adjuster = mock(DateAdjuster.class);
    when(adjuster.adjust(Mockito.<LocalDate>any())).thenReturn(LocalDate.of(1970, 1, 1));

    // Act
    ofResult.toAdjusted(adjuster, 1);

    // Assert
    verify(adjuster, atLeast(1)).adjust(Mockito.<LocalDate>any());
  }

  /**
   * Test {@link SchedulePeriod#toAdjusted(DateAdjuster, int)} with {@code adjuster}, {@code
   * mergeType}.
   *
   * <p>Method under test: {@link SchedulePeriod#toAdjusted(DateAdjuster, int)}
   */
  @Test
  @DisplayName("Test toAdjusted(DateAdjuster, int) with 'adjuster', 'mergeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SchedulePeriod SchedulePeriod.toAdjusted(DateAdjuster, int)"})
  void testToAdjustedWithAdjusterMergeType2() {
    // Arrange
    SchedulePeriod ofResult =
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1));

    DateAdjuster adjuster = mock(DateAdjuster.class);
    when(adjuster.adjust(Mockito.<LocalDate>any())).thenReturn(LocalDate.of(1970, 1, 1));

    // Act
    SchedulePeriod actualToAdjustedResult = ofResult.toAdjusted(adjuster, -1);

    // Assert
    verify(adjuster, atLeast(1)).adjust(Mockito.<LocalDate>any());
    assertSame(ofResult, actualToAdjustedResult);
  }

  /**
   * Test {@link SchedulePeriod#toAdjusted(DateAdjuster, int)} with {@code adjuster}, {@code
   * mergeType}.
   *
   * <p>Method under test: {@link SchedulePeriod#toAdjusted(DateAdjuster, int)}
   */
  @Test
  @DisplayName("Test toAdjusted(DateAdjuster, int) with 'adjuster', 'mergeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SchedulePeriod SchedulePeriod.toAdjusted(DateAdjuster, int)"})
  void testToAdjustedWithAdjusterMergeType3() {
    // Arrange
    SchedulePeriod ofResult = SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.now());

    DateAdjuster adjuster = mock(DateAdjuster.class);
    when(adjuster.adjust(Mockito.<LocalDate>any())).thenReturn(LocalDate.of(1970, 1, 1));

    // Act
    ofResult.toAdjusted(adjuster, -1);

    // Assert
    verify(adjuster, atLeast(1)).adjust(Mockito.<LocalDate>any());
  }

  /**
   * Test {@link SchedulePeriod#toAdjusted(DateAdjuster, int)} with {@code adjuster}, {@code
   * mergeType}.
   *
   * <ul>
   *   <li>Given ofYearDay one and one.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#toAdjusted(DateAdjuster, int)}
   */
  @Test
  @DisplayName(
      "Test toAdjusted(DateAdjuster, int) with 'adjuster', 'mergeType'; given ofYearDay one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SchedulePeriod SchedulePeriod.toAdjusted(DateAdjuster, int)"})
  void testToAdjustedWithAdjusterMergeType_givenOfYearDayOneAndOne() {
    // Arrange
    SchedulePeriod ofResult =
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1));

    DateAdjuster adjuster = mock(DateAdjuster.class);
    when(adjuster.adjust(Mockito.<LocalDate>any())).thenReturn(LocalDate.ofYearDay(1, 1));

    // Act
    SchedulePeriod actualToAdjustedResult = ofResult.toAdjusted(adjuster, 1);

    // Assert
    verify(adjuster, atLeast(1)).adjust(Mockito.<LocalDate>any());
    assertSame(ofResult, actualToAdjustedResult);
  }

  /**
   * Test {@link SchedulePeriod#compareTo(SchedulePeriod)} with {@code SchedulePeriod}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#compareTo(SchedulePeriod)}
   */
  @Test
  @DisplayName("Test compareTo(SchedulePeriod) with 'SchedulePeriod'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SchedulePeriod.compareTo(SchedulePeriod)"})
  void testCompareToWithSchedulePeriod_thenReturnMinusOne() {
    // Arrange
    SchedulePeriod ofResult =
        SchedulePeriod.of(LocalDate.ofYearDay(0, 1), LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(
        -1,
        ofResult.compareTo(SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1))));
  }

  /**
   * Test {@link SchedulePeriod#compareTo(SchedulePeriod)} with {@code SchedulePeriod}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#compareTo(SchedulePeriod)}
   */
  @Test
  @DisplayName("Test compareTo(SchedulePeriod) with 'SchedulePeriod'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int SchedulePeriod.compareTo(SchedulePeriod)"})
  void testCompareToWithSchedulePeriod_thenReturnZero() {
    // Arrange
    SchedulePeriod ofResult =
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(
        0,
        ofResult.compareTo(SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1))));
  }

  /**
   * Test {@link SchedulePeriod#meta()}.
   *
   * <p>Method under test: {@link SchedulePeriod#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SchedulePeriod.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SchedulePeriod.meta();

    // Assert
    assertTrue(actualMetaResult.endDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.startDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.unadjustedEndDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.unadjustedStartDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link SchedulePeriod#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link SchedulePeriod#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SchedulePeriod.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        SchedulePeriod.of(LocalDate.ofYearDay(1, 1), LocalDate.of(1970, 1, 1)).metaBean());
  }
}
