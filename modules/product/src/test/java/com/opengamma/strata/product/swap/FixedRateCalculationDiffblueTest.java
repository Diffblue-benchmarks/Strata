package com.opengamma.strata.product.swap;

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
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.basics.value.ValueSchedule;
import com.opengamma.strata.product.swap.FixedRateCalculation.Builder;
import com.opengamma.strata.product.swap.FixedRateCalculation.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
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

class FixedRateCalculationDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Builder#build()}
   *   <li>{@link Builder#finalStub(FixedRateStubCalculation)}
   *   <li>{@link Builder#futureValueNotional(FutureValueNotional)}
   *   <li>{@link Builder#initialStub(FixedRateStubCalculation)}
   * </ul>
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FixedRateCalculation Builder.build()",
    "Builder Builder.finalStub(FixedRateStubCalculation)",
    "Builder Builder.futureValueNotional(FutureValueNotional)",
    "Builder Builder.initialStub(FixedRateStubCalculation)",
    "String Builder.toString()"
  })
  void testBuilderBuild() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);

    // Act
    Builder actualFinalStubResult =
        FixedRateCalculation.builder().dayCount(dayCount).finalStub(FixedRateStubCalculation.NONE);
    FutureValueNotional futureValueNotional =
        FutureValueNotional.builder()
            .dayCountDays(3)
            .value(10.0d)
            .valueDate(LocalDate.of(1970, 1, 1))
            .build();
    Builder actualInitialStubResult =
        actualFinalStubResult
            .futureValueNotional(futureValueNotional)
            .initialStub(FixedRateStubCalculation.NONE);
    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);
    ValueSchedule rate = stepSequenceResult.steps(new ArrayList<>()).build();
    FixedRateCalculation actualFixedRateCalculation = actualInitialStubResult.rate(rate).build();

    // Assert
    assertEquals(SwapLegType.FIXED, actualFixedRateCalculation.getType());
    Optional<FixedRateStubCalculation> finalStub = actualFixedRateCalculation.getFinalStub();
    assertTrue(finalStub.isPresent());
    Optional<FutureValueNotional> futureValueNotional2 =
        actualFixedRateCalculation.getFutureValueNotional();
    assertTrue(futureValueNotional2.isPresent());
    assertSame(rate, actualFixedRateCalculation.getRate());
    assertSame(futureValueNotional, futureValueNotional2.get());
    assertSame(FixedRateStubCalculation.NONE, finalStub.get());
    assertSame(dayCount, actualFixedRateCalculation.getDayCount());
  }

  /**
   * Test Builder {@link Builder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test Builder dayCount(DayCount); when DayCount; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dayCount(DayCount)"})
  void testBuilderDayCount_whenDayCount_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedRateCalculation.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'dayCount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDayCount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedRateCalculation.builder().get("dayCount"));
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
        NoSuchElementException.class, () -> FixedRateCalculation.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'rate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedRateCalculation.builder().get("rate"));
  }

  /**
   * Test Builder {@link Builder#rate(ValueSchedule)}.
   *
   * <ul>
   *   <li>When {@link ValueSchedule} with value is ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#rate(ValueSchedule)}
   */
  @Test
  @DisplayName(
      "Test Builder rate(ValueSchedule); when ValueSchedule with value is ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.rate(ValueSchedule)"})
  void testBuilderRate_whenValueScheduleWithValueIsTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedRateCalculation.builder();

    // Act
    Builder actualRateResult = builderResult.rate(ValueSchedule.of(10.0d));

    // Assert
    assertSame(builderResult, actualRateResult);
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
        () -> FixedRateCalculation.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'dayCount'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenDayCount_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedRateCalculation.builder();

    // Act
    Builder actualSetResult = builderResult.set("dayCount", mock(DayCount.class));

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
    Builder builderResult = FixedRateCalculation.builder();

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
    Class<? extends FixedRateCalculation> actualBeanTypeResult =
        FixedRateCalculation.meta().beanType();

    // Assert
    Class<FixedRateCalculation> expectedBeanTypeResult = FixedRateCalculation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#finalStub()}
   *   <li>{@link Meta#futureValueNotional()}
   *   <li>{@link Meta#initialStub()}
   *   <li>{@link Meta#rate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.finalStub()",
    "MetaProperty Meta.futureValueNotional()",
    "MetaProperty Meta.initialStub()",
    "MetaProperty Meta.rate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FixedRateCalculation.meta();

    // Act
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<FixedRateStubCalculation> actualFinalStubResult = metaResult.finalStub();
    MetaProperty<FutureValueNotional> actualFutureValueNotionalResult =
        metaResult.futureValueNotional();
    MetaProperty<FixedRateStubCalculation> actualInitialStubResult = metaResult.initialStub();

    // Assert
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualFinalStubResult instanceof DirectMetaProperty);
    assertTrue(actualFutureValueNotionalResult instanceof DirectMetaProperty);
    assertTrue(actualInitialStubResult instanceof DirectMetaProperty);
    assertTrue(metaResult.rate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code futureValueNotional}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'futureValueNotional'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsFutureValueNotional() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedRateCalculation.meta().metaPropertyGet("futureValueNotional");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateStubCalculation> finalStubResult = ((Meta) metaBeanResult).finalStub();
    assertTrue(finalStubResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateStubCalculation> initialStubResult =
        ((Meta) metaBeanResult).initialStub();
    assertTrue(initialStubResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueSchedule> rateResult = ((Meta) metaBeanResult).rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("futureValueNotional", actualMetaPropertyGetResult.name());
    Class<FutureValueNotional> expectedPropertyTypeResult = FutureValueNotional.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).futureValueNotional());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, finalStubResult.metaBean());
    assertSame(metaBeanResult, initialStubResult.metaBean());
    assertSame(metaBeanResult, rateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return name is {@code dayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'dayCount'; then return name is 'dayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCount_thenReturnNameIsDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedRateCalculation.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FixedRateStubCalculation> finalStubResult = ((Meta) metaBeanResult).finalStub();
    assertTrue(finalStubResult instanceof DirectMetaProperty);
    MetaProperty<FutureValueNotional> futureValueNotionalResult =
        ((Meta) metaBeanResult).futureValueNotional();
    assertTrue(futureValueNotionalResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateStubCalculation> initialStubResult =
        ((Meta) metaBeanResult).initialStub();
    assertTrue(initialStubResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueSchedule> rateResult = ((Meta) metaBeanResult).rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
    assertSame(metaBeanResult, finalStubResult.metaBean());
    assertSame(metaBeanResult, futureValueNotionalResult.metaBean());
    assertSame(metaBeanResult, initialStubResult.metaBean());
    assertSame(metaBeanResult, rateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code finalStub}.
   *   <li>Then return name is {@code finalStub}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'finalStub'; then return name is 'finalStub'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFinalStub_thenReturnNameIsFinalStub() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedRateCalculation.meta().metaPropertyGet("finalStub");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<FutureValueNotional> futureValueNotionalResult =
        ((Meta) metaBeanResult).futureValueNotional();
    assertTrue(futureValueNotionalResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateStubCalculation> initialStubResult =
        ((Meta) metaBeanResult).initialStub();
    assertTrue(initialStubResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueSchedule> rateResult = ((Meta) metaBeanResult).rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("finalStub", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).finalStub());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, futureValueNotionalResult.metaBean());
    assertSame(metaBeanResult, initialStubResult.metaBean());
    assertSame(metaBeanResult, rateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code initialStub}.
   *   <li>Then return name is {@code initialStub}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'initialStub'; then return name is 'initialStub'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInitialStub_thenReturnNameIsInitialStub() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedRateCalculation.meta().metaPropertyGet("initialStub");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateStubCalculation> finalStubResult = ((Meta) metaBeanResult).finalStub();
    assertTrue(finalStubResult instanceof DirectMetaProperty);
    MetaProperty<FutureValueNotional> futureValueNotionalResult =
        ((Meta) metaBeanResult).futureValueNotional();
    assertTrue(futureValueNotionalResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueSchedule> rateResult = ((Meta) metaBeanResult).rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("initialStub", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).initialStub());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, finalStubResult.metaBean());
    assertSame(metaBeanResult, futureValueNotionalResult.metaBean());
    assertSame(metaBeanResult, rateResult.metaBean());
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
    assertNull(FixedRateCalculation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then return name is {@code rate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'rate'; then return name is 'rate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRate_thenReturnNameIsRate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedRateCalculation.meta().metaPropertyGet("rate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DayCount> dayCountResult = ((Meta) metaBeanResult).dayCount();
    assertTrue(dayCountResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateStubCalculation> finalStubResult = ((Meta) metaBeanResult).finalStub();
    assertTrue(finalStubResult instanceof DirectMetaProperty);
    MetaProperty<FutureValueNotional> futureValueNotionalResult =
        ((Meta) metaBeanResult).futureValueNotional();
    assertTrue(futureValueNotionalResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateStubCalculation> initialStubResult =
        ((Meta) metaBeanResult).initialStub();
    assertTrue(initialStubResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("rate", actualMetaPropertyGetResult.name());
    Class<ValueSchedule> expectedPropertyTypeResult = ValueSchedule.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rate());
    assertSame(metaBeanResult, dayCountResult.metaBean());
    assertSame(metaBeanResult, finalStubResult.metaBean());
    assertSame(metaBeanResult, futureValueNotionalResult.metaBean());
    assertSame(metaBeanResult, initialStubResult.metaBean());
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
        FixedRateCalculation.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("finalStub") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("futureValueNotional") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("initialStub") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rate") instanceof DirectMetaProperty);
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
    assertNull(FixedRateCalculation.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDayCount_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = FixedRateCalculation.meta();

    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build(),
                "dayCount",
                true));
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
        () -> FixedRateCalculation.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code finalStub}.
   *   <li>Then return {@link FixedRateStubCalculation#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'finalStub'; then return NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFinalStub_thenReturnNone() {
    // Arrange
    Meta metaResult = FixedRateCalculation.meta();

    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);
    FixedRateCalculation bean =
        initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "finalStub", true);

    // Assert
    FixedRateStubCalculation fixedRateStubCalculation =
        ((FixedRateStubCalculation) actualPropertyGetResult).NONE;
    assertSame(fixedRateStubCalculation, actualPropertyGetResult);
    assertSame(fixedRateStubCalculation, bean.getFinalStub().get());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialStub}.
   *   <li>Then return {@link FixedRateStubCalculation#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'initialStub'; then return NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenInitialStub_thenReturnNone() {
    // Arrange
    Meta metaResult = FixedRateCalculation.meta();

    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);
    FixedRateCalculation bean =
        initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "initialStub", true);

    // Assert
    FixedRateStubCalculation fixedRateStubCalculation =
        ((FixedRateStubCalculation) actualPropertyGetResult).NONE;
    assertSame(fixedRateStubCalculation, actualPropertyGetResult);
    assertSame(fixedRateStubCalculation, bean.getFinalStub().get());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then return {@link ValueSchedule}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'rate'; then return ValueSchedule")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenRate_thenReturnValueSchedule() {
    // Arrange
    Meta metaResult = FixedRateCalculation.meta();

    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build(),
            "rate",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof ValueSchedule);
    assertEquals(10.0d, ((ValueSchedule) actualPropertyGetResult).getInitialValue());
    assertFalse(((ValueSchedule) actualPropertyGetResult).getStepSequence().isPresent());
    assertTrue(((ValueSchedule) actualPropertyGetResult).getSteps().isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedRateCalculation.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
            FixedRateCalculation.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code finalStub}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'finalStub'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFinalStub_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedRateCalculation.meta()
                .propertySet(mock(Bean.class), "finalStub", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code futureValueNotional}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'futureValueNotional'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFutureValueNotional_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedRateCalculation.meta()
                .propertySet(mock(Bean.class), "futureValueNotional", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialStub}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'initialStub'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInitialStub_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedRateCalculation.meta()
                .propertySet(mock(Bean.class), "initialStub", "New Value", true));
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
            FixedRateCalculation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FixedRateCalculation.meta().propertySet(mock(Bean.class), "rate", "New Value", true));
  }

  /**
   * Test {@link FixedRateCalculation#of(double, DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   *   <li>Then return Rate InitialValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateCalculation#of(double, DayCount)}
   */
  @Test
  @DisplayName("Test of(double, DayCount); when DayCount; then return Rate InitialValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedRateCalculation FixedRateCalculation.of(double, DayCount)"})
  void testOf_whenDayCount_thenReturnRateInitialValueIsTen() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);

    // Act
    FixedRateCalculation actualOfResult = FixedRateCalculation.of(10.0d, dayCount);

    // Assert
    ValueSchedule rate = actualOfResult.getRate();
    assertEquals(10.0d, rate.getInitialValue());
    assertEquals(SwapLegType.FIXED, actualOfResult.getType());
    Optional<FixedRateStubCalculation> finalStub = actualOfResult.getFinalStub();
    assertFalse(finalStub.isPresent());
    assertTrue(rate.getSteps().isEmpty());
    assertSame(finalStub, rate.getStepSequence());
    assertSame(finalStub, actualOfResult.getFutureValueNotional());
    assertSame(finalStub, actualOfResult.getInitialStub());
    assertSame(dayCount, actualOfResult.getDayCount());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedRateCalculation#collectCurrencies(ImmutableSet.Builder)}
   *   <li>{@link FixedRateCalculation#collectIndices(ImmutableSet.Builder)}
   *   <li>{@link FixedRateCalculation#toString()}
   *   <li>{@link FixedRateCalculation#getDayCount()}
   *   <li>{@link FixedRateCalculation#getRate()}
   *   <li>{@link FixedRateCalculation#getType()}
   *   <li>{@link FixedRateCalculation#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FixedRateCalculation.collectCurrencies(ImmutableSet.Builder)",
    "void FixedRateCalculation.collectIndices(ImmutableSet.Builder)",
    "DayCount FixedRateCalculation.getDayCount()",
    "ValueSchedule FixedRateCalculation.getRate()",
    "SwapLegType FixedRateCalculation.getType()",
    "Builder FixedRateCalculation.toBuilder()",
    "String FixedRateCalculation.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);
    FixedRateCalculation fixedRateCalculation =
        initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build();
    ImmutableSet.Builder<Currency> builder = ImmutableSet.builder();

    // Act
    fixedRateCalculation.collectCurrencies(builder);
    ImmutableSet.Builder<Index> builder2 = ImmutableSet.builder();
    fixedRateCalculation.collectIndices(builder2);
    fixedRateCalculation.toString();
    fixedRateCalculation.getDayCount();
    ValueSchedule actualRate = fixedRateCalculation.getRate();
    SwapLegType actualType = fixedRateCalculation.getType();
    fixedRateCalculation.toBuilder();

    // Assert
    assertEquals(10.0d, actualRate.getInitialValue());
    assertEquals(SwapLegType.FIXED, actualType);
    assertFalse(actualRate.getStepSequence().isPresent());
    assertTrue(actualRate.getSteps().isEmpty());
  }

  /**
   * Test {@link FixedRateCalculation#meta()}.
   *
   * <p>Method under test: {@link FixedRateCalculation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedRateCalculation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FixedRateCalculation.meta();

    // Assert
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.finalStub() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.futureValueNotional() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.initialStub() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.rate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link FixedRateCalculation#metaBean()}.
   *
   * <p>Method under test: {@link FixedRateCalculation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedRateCalculation.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        initialStubResult
            .rate(stepSequenceResult.steps(new ArrayList<>()).build())
            .build()
            .metaBean());
  }

  /**
   * Test {@link FixedRateCalculation#equals(Object)}, and {@link FixedRateCalculation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedRateCalculation#equals(Object)}
   *   <li>{@link FixedRateCalculation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateCalculation.equals(Object)",
    "int FixedRateCalculation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);
    FixedRateCalculation fixedRateCalculation =
        initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build();

    // Act and Assert
    assertEquals(fixedRateCalculation, fixedRateCalculation);
    int expectedHashCodeResult = fixedRateCalculation.hashCode();
    assertEquals(expectedHashCodeResult, fixedRateCalculation.hashCode());
  }

  /**
   * Test {@link FixedRateCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateCalculation.equals(Object)",
    "int FixedRateCalculation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);
    FixedRateCalculation fixedRateCalculation =
        initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build();

    Builder finalStubResult2 =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult2 =
        finalStubResult2
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult2 =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act and Assert
    assertNotEquals(
        fixedRateCalculation,
        initialStubResult2.rate(stepSequenceResult2.steps(new ArrayList<>()).build()).build());
  }

  /**
   * Test {@link FixedRateCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateCalculation.equals(Object)",
    "int FixedRateCalculation.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act and Assert
    assertNotEquals(
        initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build(), null);
  }

  /**
   * Test {@link FixedRateCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateCalculation.equals(Object)",
    "int FixedRateCalculation.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder finalStubResult =
        FixedRateCalculation.builder()
            .dayCount(mock(DayCount.class))
            .finalStub(FixedRateStubCalculation.NONE);

    Builder initialStubResult =
        finalStubResult
            .futureValueNotional(
                FutureValueNotional.builder()
                    .dayCountDays(3)
                    .value(10.0d)
                    .valueDate(LocalDate.of(1970, 1, 1))
                    .build())
            .initialStub(FixedRateStubCalculation.NONE);

    ValueSchedule.Builder stepSequenceResult =
        ValueSchedule.builder().initialValue(10.0d).stepSequence(null);

    // Act and Assert
    assertNotEquals(
        initialStubResult.rate(stepSequenceResult.steps(new ArrayList<>()).build()).build(),
        "Different type to FixedRateCalculation");
  }
}
