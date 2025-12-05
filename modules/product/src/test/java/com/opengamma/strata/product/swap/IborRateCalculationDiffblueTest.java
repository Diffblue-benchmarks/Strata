package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.basics.value.ValueSchedule;
import com.opengamma.strata.product.swap.IborRateCalculation.Builder;
import com.opengamma.strata.product.swap.IborRateCalculation.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborRateCalculationDiffblueTest {
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
    Builder builderResult = IborRateCalculation.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#fixingDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder fixingDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingDateOffset(DaysAdjustment)"})
  void testBuilderFixingDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = IborRateCalculation.builder();

    // Act
    Builder actualFixingDateOffsetResult = builderResult.fixingDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualFixingDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#fixingRelativeTo(FixingRelativeTo)}.
   *
   * <ul>
   *   <li>When {@code PERIOD_START}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingRelativeTo(FixingRelativeTo)}
   */
  @Test
  @DisplayName(
      "Test Builder fixingRelativeTo(FixingRelativeTo); when 'PERIOD_START'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingRelativeTo(FixingRelativeTo)"})
  void testBuilderFixingRelativeTo_whenPeriodStart_thenReturnBuilder() {
    // Arrange
    Builder builderResult = IborRateCalculation.builder();

    // Act
    Builder actualFixingRelativeToResult =
        builderResult.fixingRelativeTo(FixingRelativeTo.PERIOD_START);

    // Assert
    assertSame(builderResult, actualFixingRelativeToResult);
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
    assertNull(IborRateCalculation.builder().get("dayCount"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingDateOffset'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingDateOffset_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IborRateCalculation.builder().get("fixingDateOffset"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingRelativeTo}.
   *   <li>Then return {@link FixingRelativeTo}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingRelativeTo'; then return FixingRelativeTo")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingRelativeTo_thenReturnFixingRelativeTo() {
    // Arrange and Act
    Object actualGetResult = IborRateCalculation.builder().get("fixingRelativeTo");

    // Assert
    assertTrue(actualGetResult instanceof FixingRelativeTo);
    assertEquals(FixingRelativeTo.PERIOD_START, actualGetResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndex_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IborRateCalculation.builder().get("index"));
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
        NoSuchElementException.class, () -> IborRateCalculation.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#index(IborIndex)}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(IborIndex)}
   */
  @Test
  @DisplayName("Test Builder index(IborIndex); when IborIndex; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(IborIndex)"})
  void testBuilderIndex_whenIborIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = IborRateCalculation.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(IborIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
  }

  /**
   * Test Builder {@link Builder#negativeRateMethod(NegativeRateMethod)}.
   *
   * <ul>
   *   <li>When {@code ALLOW_NEGATIVE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#negativeRateMethod(NegativeRateMethod)}
   */
  @Test
  @DisplayName(
      "Test Builder negativeRateMethod(NegativeRateMethod); when 'ALLOW_NEGATIVE'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.negativeRateMethod(NegativeRateMethod)"})
  void testBuilderNegativeRateMethod_whenAllowNegative_thenReturnBuilder() {
    // Arrange
    Builder builderResult = IborRateCalculation.builder();

    // Act
    Builder actualNegativeRateMethodResult =
        builderResult.negativeRateMethod(NegativeRateMethod.ALLOW_NEGATIVE);

    // Assert
    assertSame(builderResult, actualNegativeRateMethodResult);
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
        () -> IborRateCalculation.builder().set("Property Name", "New Value"));
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
    Builder builderResult = IborRateCalculation.builder();

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
    Class<? extends IborRateCalculation> actualBeanTypeResult =
        IborRateCalculation.meta().beanType();

    // Assert
    Class<IborRateCalculation> expectedBeanTypeResult = IborRateCalculation.class;
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
   *   <li>{@link Meta#firstFixingDateOffset()}
   *   <li>{@link Meta#firstRate()}
   *   <li>{@link Meta#firstRegularRate()}
   *   <li>{@link Meta#fixingDateOffset()}
   *   <li>{@link Meta#fixingRelativeTo()}
   *   <li>{@link Meta#gearing()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#initialStub()}
   *   <li>{@link Meta#negativeRateMethod()}
   *   <li>{@link Meta#resetPeriods()}
   *   <li>{@link Meta#spread()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.finalStub()",
    "MetaProperty Meta.firstFixingDateOffset()",
    "MetaProperty Meta.firstRate()",
    "MetaProperty Meta.firstRegularRate()",
    "MetaProperty Meta.fixingDateOffset()",
    "MetaProperty Meta.fixingRelativeTo()",
    "MetaProperty Meta.gearing()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.initialStub()",
    "MetaProperty Meta.negativeRateMethod()",
    "MetaProperty Meta.resetPeriods()",
    "MetaProperty Meta.spread()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborRateCalculation.meta();

    // Act
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<IborRateStubCalculation> actualFinalStubResult = metaResult.finalStub();
    MetaProperty<DaysAdjustment> actualFirstFixingDateOffsetResult =
        metaResult.firstFixingDateOffset();
    MetaProperty<Double> actualFirstRateResult = metaResult.firstRate();
    MetaProperty<Double> actualFirstRegularRateResult = metaResult.firstRegularRate();
    MetaProperty<DaysAdjustment> actualFixingDateOffsetResult = metaResult.fixingDateOffset();
    MetaProperty<FixingRelativeTo> actualFixingRelativeToResult = metaResult.fixingRelativeTo();
    MetaProperty<ValueSchedule> actualGearingResult = metaResult.gearing();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();
    MetaProperty<IborRateStubCalculation> actualInitialStubResult = metaResult.initialStub();
    MetaProperty<NegativeRateMethod> actualNegativeRateMethodResult =
        metaResult.negativeRateMethod();
    MetaProperty<ResetSchedule> actualResetPeriodsResult = metaResult.resetPeriods();

    // Assert
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualFinalStubResult instanceof DirectMetaProperty);
    assertTrue(actualFirstFixingDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualFirstRateResult instanceof DirectMetaProperty);
    assertTrue(actualFirstRegularRateResult instanceof DirectMetaProperty);
    assertTrue(actualFixingDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualFixingRelativeToResult instanceof DirectMetaProperty);
    assertTrue(actualGearingResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualInitialStubResult instanceof DirectMetaProperty);
    assertTrue(actualNegativeRateMethodResult instanceof DirectMetaProperty);
    assertTrue(actualResetPeriodsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.spread() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code firstFixingDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'firstFixingDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsFirstFixingDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateCalculation.meta().metaPropertyGet("firstFixingDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).finalStub() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingRelativeTo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("firstFixingDateOffset", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstFixingDateOffset());
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
        IborRateCalculation.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).finalStub() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstFixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingRelativeTo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
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
        IborRateCalculation.meta().metaPropertyGet("finalStub");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstFixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingRelativeTo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("finalStub", actualMetaPropertyGetResult.name());
    Class<IborRateStubCalculation> expectedPropertyTypeResult = IborRateStubCalculation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).finalStub());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code firstRate}.
   *   <li>Then return name is {@code firstRate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'firstRate'; then return name is 'firstRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFirstRate_thenReturnNameIsFirstRate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateCalculation.meta().metaPropertyGet("firstRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).finalStub() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstFixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingRelativeTo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("firstRate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstRate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code firstRegularRate}.
   *   <li>Then return name is {@code firstRegularRate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'firstRegularRate'; then return name is 'firstRegularRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFirstRegularRate_thenReturnNameIsFirstRegularRate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateCalculation.meta().metaPropertyGet("firstRegularRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).finalStub() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstFixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingRelativeTo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("firstRegularRate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).firstRegularRate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return name is {@code fixingDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingDateOffset'; then return name is 'fixingDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingDateOffset_thenReturnNameIsFixingDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateCalculation.meta().metaPropertyGet("fixingDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).finalStub() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstFixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingRelativeTo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingDateOffset", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDateOffset());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingRelativeTo}.
   *   <li>Then return name is {@code fixingRelativeTo}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingRelativeTo'; then return name is 'fixingRelativeTo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingRelativeTo_thenReturnNameIsFixingRelativeTo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateCalculation.meta().metaPropertyGet("fixingRelativeTo");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).finalStub() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstFixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).gearing() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixingRelativeTo", actualMetaPropertyGetResult.name());
    Class<FixingRelativeTo> expectedPropertyTypeResult = FixingRelativeTo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingRelativeTo());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code gearing}.
   *   <li>Then return name is {@code gearing}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'gearing'; then return name is 'gearing'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenGearing_thenReturnNameIsGearing() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborRateCalculation.meta().metaPropertyGet("gearing");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).finalStub() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstFixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).firstRegularRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingDateOffset() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixingRelativeTo() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("gearing", actualMetaPropertyGetResult.name());
    Class<ValueSchedule> expectedPropertyTypeResult = ValueSchedule.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).gearing());
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
    assertNull(IborRateCalculation.meta().metaPropertyGet("Property Name"));
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
        IborRateCalculation.meta().metaPropertyMap();

    // Assert
    assertEquals(13, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("finalStub") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("firstFixingDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("firstRate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("firstRegularRate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingRelativeTo") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("initialStub") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("negativeRateMethod") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("resetPeriods") instanceof DirectMetaProperty);
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
    assertNull(IborRateCalculation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> IborRateCalculation.meta().propertyGet(null, "Property Name", false));
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
            IborRateCalculation.meta()
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
            IborRateCalculation.meta()
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
            IborRateCalculation.meta()
                .propertySet(mock(Bean.class), "finalStub", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code firstFixingDateOffset}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'firstFixingDateOffset'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFirstFixingDateOffset_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborRateCalculation.meta()
                .propertySet(mock(Bean.class), "firstFixingDateOffset", "New Value", true));
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
            IborRateCalculation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
