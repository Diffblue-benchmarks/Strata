package com.opengamma.strata.basics.value;

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
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.basics.value.ValueSchedule.Builder;
import com.opengamma.strata.basics.value.ValueSchedule.Meta;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueScheduleDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Builder#build()}
   *   <li>{@link Builder#initialValue(double)}
   *   <li>{@link Builder#stepSequence(ValueStepSequence)}
   * </ul>
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueSchedule Builder.build()",
    "Builder Builder.initialValue(double)",
    "Builder Builder.stepSequence(ValueStepSequence)",
    "String Builder.toString()"
  })
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualInitialValueResult = ValueSchedule.builder().initialValue(10.0d);
    ValueStepSequence stepSequence =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);
    Builder actualStepSequenceResult = actualInitialValueResult.stepSequence(stepSequence);
    ValueSchedule actualValueSchedule = actualStepSequenceResult.steps(new ArrayList<>()).build();

    // Assert
    assertEquals(10.0d, actualValueSchedule.getInitialValue());
    assertTrue(actualValueSchedule.getSteps().isEmpty());
    Optional<ValueStepSequence> stepSequence2 = actualValueSchedule.getStepSequence();
    assertTrue(stepSequence2.isPresent());
    assertSame(stepSequence, stepSequence2.get());
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
    assertThrows(NoSuchElementException.class, () -> ValueSchedule.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code steps}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'steps'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSteps_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = ValueSchedule.builder().get("steps");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
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
        () -> ValueSchedule.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code steps}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'steps'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenSteps_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ValueSchedule.builder();

    // Act
    Builder actualSetResult = builderResult.set("steps", new ArrayList<>());

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
    Builder builderResult = ValueSchedule.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#steps(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return build Steps is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#steps(List)}
   */
  @Test
  @DisplayName("Test Builder steps(List) with 'List'; then return build Steps is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.steps(List)"})
  void testBuilderStepsWithList_thenReturnBuildStepsIsArrayList() {
    // Arrange
    Builder builderResult = ValueSchedule.builder();

    ArrayList<ValueStep> steps = new ArrayList<>();
    steps.add(ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());

    // Act and Assert
    assertEquals(steps, builderResult.steps(steps).build().getSteps());
    assertEquals(steps, builderResult.build().getSteps());
  }

  /**
   * Test Builder {@link Builder#steps(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return build Steps is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#steps(List)}
   */
  @Test
  @DisplayName("Test Builder steps(List) with 'List'; then return build Steps is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.steps(List)"})
  void testBuilderStepsWithList_thenReturnBuildStepsIsArrayList2() {
    // Arrange
    Builder builderResult = ValueSchedule.builder();

    ArrayList<ValueStep> steps = new ArrayList<>();
    steps.add(ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());
    steps.add(ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());

    // Act and Assert
    assertEquals(steps, builderResult.steps(steps).build().getSteps());
    assertEquals(steps, builderResult.build().getSteps());
  }

  /**
   * Test Builder {@link Builder#steps(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#steps(List)}
   */
  @Test
  @DisplayName("Test Builder steps(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.steps(List)"})
  void testBuilderStepsWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ValueSchedule.builder();

    // Act
    Builder actualStepsResult = builderResult.steps(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualStepsResult);
  }

  /**
   * Test Builder {@link Builder#steps(ValueStep[])} with {@code ValueStep[]}.
   *
   * <ul>
   *   <li>Then return build Steps size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#steps(ValueStep[])}
   */
  @Test
  @DisplayName(
      "Test Builder steps(ValueStep[]) with 'ValueStep[]'; then return build Steps size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.steps(ValueStep[])"})
  void testBuilderStepsWithValueStep_thenReturnBuildStepsSizeIsOne() {
    // Arrange
    Builder builderResult = ValueSchedule.builder();
    ValueStep ofResult = ValueStep.of(1, ValueAdjustment.NONE);

    // Act and Assert
    List<ValueStep> steps = builderResult.steps(ofResult).build().getSteps();
    assertEquals(1, steps.size());
    assertSame(ofResult, steps.get(0));
  }

  /**
   * Test Builder {@link Builder#steps(ValueStep[])} with {@code ValueStep[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#steps(ValueStep[])}
   */
  @Test
  @DisplayName("Test Builder steps(ValueStep[]) with 'ValueStep[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.steps(ValueStep[])"})
  void testBuilderStepsWithValueStep_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ValueSchedule.builder();

    // Act
    Builder actualStepsResult = builderResult.steps();

    // Assert
    assertSame(builderResult, actualStepsResult);
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
    Class<? extends ValueSchedule> actualBeanTypeResult = ValueSchedule.meta().beanType();

    // Assert
    Class<ValueSchedule> expectedBeanTypeResult = ValueSchedule.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#builder()}.
   *
   * <p>Method under test: {@link Meta#builder()}
   */
  @Test
  @DisplayName("Test Meta builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Meta.builder()"})
  void testMetaBuilder() {
    // Arrange, Act and Assert
    ValueSchedule valueSchedule = ValueSchedule.meta().builder().build();
    assertEquals(0.0d, valueSchedule.getInitialValue());
    assertFalse(valueSchedule.getStepSequence().isPresent());
    assertTrue(valueSchedule.getSteps().isEmpty());
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#initialValue()}
   *   <li>{@link Meta#stepSequence()}
   *   <li>{@link Meta#steps()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.initialValue()",
    "MetaProperty Meta.stepSequence()",
    "MetaProperty Meta.steps()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ValueSchedule.meta();

    // Act
    MetaProperty<Double> actualInitialValueResult = metaResult.initialValue();
    MetaProperty<ValueStepSequence> actualStepSequenceResult = metaResult.stepSequence();

    // Assert
    assertTrue(actualInitialValueResult instanceof DirectMetaProperty);
    assertTrue(actualStepSequenceResult instanceof DirectMetaProperty);
    assertTrue(metaResult.steps() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code initialValue}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'initialValue'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInitialValue_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValueSchedule.meta().metaPropertyGet("initialValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueStepSequence> stepSequenceResult = ((Meta) metaBeanResult).stepSequence();
    assertTrue(stepSequenceResult instanceof DirectMetaProperty);
    MetaProperty<List<ValueStep>> stepsResult = ((Meta) metaBeanResult).steps();
    assertTrue(stepsResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("initialValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).initialValue());
    assertSame(metaBeanResult, stepSequenceResult.metaBean());
    assertSame(metaBeanResult, stepsResult.metaBean());
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
    assertNull(ValueSchedule.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code stepSequence}.
   *   <li>Then return name is {@code stepSequence}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'stepSequence'; then return name is 'stepSequence'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStepSequence_thenReturnNameIsStepSequence() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ValueSchedule.meta().metaPropertyGet("stepSequence");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> initialValueResult = ((Meta) metaBeanResult).initialValue();
    assertTrue(initialValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ValueStep>> stepsResult = ((Meta) metaBeanResult).steps();
    assertTrue(stepsResult instanceof DirectMetaProperty);
    assertEquals("stepSequence", actualMetaPropertyGetResult.name());
    Class<ValueStepSequence> expectedPropertyTypeResult = ValueStepSequence.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).stepSequence());
    assertSame(metaBeanResult, initialValueResult.metaBean());
    assertSame(metaBeanResult, stepsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code steps}.
   *   <li>Then return name is {@code steps}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'steps'; then return name is 'steps'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSteps_thenReturnNameIsSteps() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ValueSchedule.meta().metaPropertyGet("steps");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> initialValueResult = ((Meta) metaBeanResult).initialValue();
    assertTrue(initialValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueStepSequence> stepSequenceResult = ((Meta) metaBeanResult).stepSequence();
    assertTrue(stepSequenceResult instanceof DirectMetaProperty);
    assertEquals("steps", actualMetaPropertyGetResult.name());
    Class<List> expectedPropertyTypeResult = List.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).steps());
    assertSame(metaBeanResult, initialValueResult.metaBean());
    assertSame(metaBeanResult, stepSequenceResult.metaBean());
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
        ValueSchedule.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("initialValue");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("stepSequence");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("steps");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("initialValue", getResult.name());
    assertEquals("stepSequence", getResult2.name());
    assertEquals("steps", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ValueSchedule> expectedDeclaringTypeResult = ValueSchedule.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ValueSchedule> expectedDeclaringTypeResult2 = ValueSchedule.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<ValueSchedule> expectedDeclaringTypeResult3 = ValueSchedule.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<ValueStepSequence> expectedPropertyTypeResult = ValueStepSequence.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<List> expectedPropertyTypeResult2 = List.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
    assertNull(ValueSchedule.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ValueSchedule.meta().propertyGet(ValueSchedule.ALWAYS_0, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialValue}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'initialValue'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenInitialValue_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ((Double) ValueSchedule.meta().propertyGet(ValueSchedule.ALWAYS_0, "initialValue", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code stepSequence}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'stepSequence'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStepSequence_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ValueSchedule.meta().propertyGet(ValueSchedule.ALWAYS_0, "stepSequence", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code steps}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'steps'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSteps_thenReturnList() {
    // Arrange and Act
    Object actualPropertyGetResult =
        ValueSchedule.meta().propertyGet(ValueSchedule.ALWAYS_0, "steps", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
            ValueSchedule.meta().propertySet(mock(Bean.class), "initialValue", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'initialValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInitialValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueSchedule.meta().propertySet(mock(Bean.class), "initialValue", "New Value", true));
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
            ValueSchedule.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code stepSequence}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'stepSequence'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStepSequence_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ValueSchedule.meta().propertySet(mock(Bean.class), "stepSequence", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code steps}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'steps'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSteps_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ValueSchedule.meta().propertySet(mock(Bean.class), "steps", "New Value", true));
  }

  /**
   * Test {@link ValueSchedule#of(double)} with {@code double}.
   *
   * <p>Method under test: {@link ValueSchedule#of(double)}
   */
  @Test
  @DisplayName("Test of(double) with 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueSchedule ValueSchedule.of(double)"})
  void testOfWithDouble() {
    // Arrange and Act
    ValueSchedule actualOfResult = ValueSchedule.of(10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getInitialValue());
    assertFalse(actualOfResult.getStepSequence().isPresent());
    assertTrue(actualOfResult.getSteps().isEmpty());
  }

  /**
   * Test {@link ValueSchedule#of(double, List)} with {@code double}, {@code List}.
   *
   * <ul>
   *   <li>Then return Steps is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#of(double, List)}
   */
  @Test
  @DisplayName("Test of(double, List) with 'double', 'List'; then return Steps is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueSchedule ValueSchedule.of(double, List)"})
  void testOfWithDoubleList_thenReturnStepsIsArrayList() {
    // Arrange
    ArrayList<ValueStep> steps = new ArrayList<>();
    steps.add(ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());

    // Act and Assert
    assertEquals(steps, ValueSchedule.of(10.0d, steps).getSteps());
  }

  /**
   * Test {@link ValueSchedule#of(double, List)} with {@code double}, {@code List}.
   *
   * <ul>
   *   <li>Then return Steps is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#of(double, List)}
   */
  @Test
  @DisplayName("Test of(double, List) with 'double', 'List'; then return Steps is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueSchedule ValueSchedule.of(double, List)"})
  void testOfWithDoubleList_thenReturnStepsIsArrayList2() {
    // Arrange
    ArrayList<ValueStep> steps = new ArrayList<>();
    steps.add(ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());
    steps.add(ValueStep.builder().date(null).periodIndex(1).value(ValueAdjustment.NONE).build());

    // Act and Assert
    assertEquals(steps, ValueSchedule.of(10.0d, steps).getSteps());
  }

  /**
   * Test {@link ValueSchedule#of(double, List)} with {@code double}, {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return InitialValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#of(double, List)}
   */
  @Test
  @DisplayName(
      "Test of(double, List) with 'double', 'List'; when ArrayList(); then return InitialValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueSchedule ValueSchedule.of(double, List)"})
  void testOfWithDoubleList_whenArrayList_thenReturnInitialValueIsTen() {
    // Arrange and Act
    ValueSchedule actualOfResult = ValueSchedule.of(10.0d, new ArrayList<>());

    // Assert
    assertEquals(10.0d, actualOfResult.getInitialValue());
    assertFalse(actualOfResult.getStepSequence().isPresent());
    assertTrue(actualOfResult.getSteps().isEmpty());
  }

  /**
   * Test {@link ValueSchedule#of(double, ValueStepSequence)} with {@code double}, {@code
   * ValueStepSequence}.
   *
   * <p>Method under test: {@link ValueSchedule#of(double, ValueStepSequence)}
   */
  @Test
  @DisplayName("Test of(double, ValueStepSequence) with 'double', 'ValueStepSequence'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueSchedule ValueSchedule.of(double, ValueStepSequence)"})
  void testOfWithDoubleValueStepSequence() {
    // Arrange
    ValueStepSequence stepSequence =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    // Act
    ValueSchedule actualOfResult = ValueSchedule.of(10.0d, stepSequence);

    // Assert
    assertEquals(10.0d, actualOfResult.getInitialValue());
    assertTrue(actualOfResult.getSteps().isEmpty());
    Optional<ValueStepSequence> stepSequence2 = actualOfResult.getStepSequence();
    assertTrue(stepSequence2.isPresent());
    assertSame(stepSequence, stepSequence2.get());
  }

  /**
   * Test {@link ValueSchedule#of(double, ValueStep[])} with {@code double}, {@code ValueStep[]}.
   *
   * <ul>
   *   <li>Then return Steps size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#of(double, ValueStep[])}
   */
  @Test
  @DisplayName(
      "Test of(double, ValueStep[]) with 'double', 'ValueStep[]'; then return Steps size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueSchedule ValueSchedule.of(double, ValueStep[])"})
  void testOfWithDoubleValueStep_thenReturnStepsSizeIsOne() {
    // Arrange
    ValueStep ofResult = ValueStep.of(1, ValueAdjustment.NONE);

    // Act and Assert
    List<ValueStep> steps = ValueSchedule.of(10.0d, ofResult).getSteps();
    assertEquals(1, steps.size());
    assertSame(ofResult, steps.get(0));
  }

  /**
   * Test {@link ValueSchedule#of(double, ValueStep[])} with {@code double}, {@code ValueStep[]}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return InitialValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#of(double, ValueStep[])}
   */
  @Test
  @DisplayName(
      "Test of(double, ValueStep[]) with 'double', 'ValueStep[]'; when ten; then return InitialValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueSchedule ValueSchedule.of(double, ValueStep[])"})
  void testOfWithDoubleValueStep_whenTen_thenReturnInitialValueIsTen() {
    // Arrange and Act
    ValueSchedule actualOfResult = ValueSchedule.of(10.0d, new ValueStep[] {});

    // Assert
    assertEquals(10.0d, actualOfResult.getInitialValue());
    assertFalse(actualOfResult.getStepSequence().isPresent());
    assertTrue(actualOfResult.getSteps().isEmpty());
  }

  /**
   * Test {@link ValueSchedule#meta()}.
   *
   * <p>Method under test: {@link ValueSchedule#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueSchedule.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ValueSchedule.meta();

    // Assert
    MetaProperty<Double> initialValueResult = actualMetaResult.initialValue();
    assertTrue(initialValueResult instanceof DirectMetaProperty);
    MetaProperty<ValueStepSequence> stepSequenceResult = actualMetaResult.stepSequence();
    assertTrue(stepSequenceResult instanceof DirectMetaProperty);
    MetaProperty<List<ValueStep>> stepsResult = actualMetaResult.steps();
    assertTrue(stepsResult instanceof DirectMetaProperty);
    assertEquals("double", initialValueResult.propertyType().getName());
    assertEquals("initialValue", initialValueResult.name());
    assertEquals("stepSequence", stepSequenceResult.name());
    assertEquals("steps", stepsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, initialValueResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, stepSequenceResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, stepsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ValueSchedule> expectedDeclaringTypeResult = ValueSchedule.class;
    assertEquals(expectedDeclaringTypeResult, initialValueResult.declaringType());
    Class<ValueSchedule> expectedDeclaringTypeResult2 = ValueSchedule.class;
    assertEquals(expectedDeclaringTypeResult2, stepSequenceResult.declaringType());
    Class<ValueSchedule> expectedDeclaringTypeResult3 = ValueSchedule.class;
    assertEquals(expectedDeclaringTypeResult3, stepsResult.declaringType());
    Class<ValueStepSequence> expectedPropertyTypeResult = ValueStepSequence.class;
    assertEquals(expectedPropertyTypeResult, stepSequenceResult.propertyType());
    Class<List> expectedPropertyTypeResult2 = List.class;
    assertEquals(expectedPropertyTypeResult2, stepsResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, initialValueResult.metaBean());
    assertSame(meta, stepSequenceResult.metaBean());
    assertSame(meta, stepsResult.metaBean());
  }

  /**
   * Test {@link ValueSchedule#metaBean()}.
   *
   * <p>Method under test: {@link ValueSchedule#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ValueSchedule.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, ValueSchedule.ALWAYS_0.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueSchedule#toString()}
   *   <li>{@link ValueSchedule#getInitialValue()}
   *   <li>{@link ValueSchedule#getSteps()}
   *   <li>{@link ValueSchedule#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ValueSchedule.getInitialValue()",
    "List ValueSchedule.getSteps()",
    "Builder ValueSchedule.toBuilder()",
    "String ValueSchedule.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ValueSchedule valueSchedule = ValueSchedule.ALWAYS_0;

    // Act
    String actualToStringResult = valueSchedule.toString();
    double actualInitialValue = valueSchedule.getInitialValue();
    List<ValueStep> actualSteps = valueSchedule.getSteps();
    valueSchedule.toBuilder();

    // Assert
    assertEquals(
        "ValueSchedule{initialValue=0.0, steps=[], stepSequence=null}", actualToStringResult);
    assertEquals(0.0d, actualInitialValue);
    assertTrue(actualSteps.isEmpty());
  }

  /**
   * Test {@link ValueSchedule#getStepSequence()}.
   *
   * <p>Method under test: {@link ValueSchedule#getStepSequence()}
   */
  @Test
  @DisplayName("Test getStepSequence()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ValueSchedule.getStepSequence()"})
  void testGetStepSequence() {
    // Arrange, Act and Assert
    assertFalse(ValueSchedule.ALWAYS_0.getStepSequence().isPresent());
  }

  /**
   * Test {@link ValueSchedule#equals(Object)}, and {@link ValueSchedule#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueSchedule#equals(Object)}
   *   <li>{@link ValueSchedule#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueSchedule.equals(Object)", "int ValueSchedule.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ValueSchedule valueSchedule = ValueSchedule.ALWAYS_0;
    ValueSchedule valueSchedule2 = ValueSchedule.ALWAYS_0;

    // Act and Assert
    assertEquals(valueSchedule, valueSchedule2);
    assertEquals(valueSchedule.hashCode(), valueSchedule2.hashCode());
  }

  /**
   * Test {@link ValueSchedule#equals(Object)}, and {@link ValueSchedule#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueSchedule#equals(Object)}
   *   <li>{@link ValueSchedule#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueSchedule.equals(Object)", "int ValueSchedule.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Builder initialValueResult = ValueSchedule.builder().initialValue(10.0d);
    ValueStepSequence stepSequence =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    Builder stepSequenceResult = initialValueResult.stepSequence(stepSequence);
    ValueSchedule valueSchedule = stepSequenceResult.steps(new ArrayList<>()).build();

    Builder initialValueResult2 = ValueSchedule.builder().initialValue(10.0d);
    ValueStepSequence stepSequence2 =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    Builder stepSequenceResult2 = initialValueResult2.stepSequence(stepSequence2);
    ValueSchedule valueSchedule2 = stepSequenceResult2.steps(new ArrayList<>()).build();

    // Act and Assert
    assertEquals(valueSchedule, valueSchedule2);
    assertEquals(valueSchedule.hashCode(), valueSchedule2.hashCode());
  }

  /**
   * Test {@link ValueSchedule#equals(Object)}, and {@link ValueSchedule#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ValueSchedule#equals(Object)}
   *   <li>{@link ValueSchedule#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueSchedule.equals(Object)", "int ValueSchedule.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ValueSchedule valueSchedule = ValueSchedule.ALWAYS_0;

    // Act and Assert
    assertEquals(valueSchedule, valueSchedule);
    int expectedHashCodeResult = valueSchedule.hashCode();
    assertEquals(expectedHashCodeResult, valueSchedule.hashCode());
  }

  /**
   * Test {@link ValueSchedule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueSchedule.equals(Object)", "int ValueSchedule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ValueSchedule.ALWAYS_1, ValueSchedule.ALWAYS_0);
  }

  /**
   * Test {@link ValueSchedule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueSchedule.equals(Object)", "int ValueSchedule.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder stepSequenceResult = ValueSchedule.builder().initialValue(10.0d).stepSequence(null);
    ValueSchedule valueSchedule = stepSequenceResult.steps(new ArrayList<>()).build();

    Builder initialValueResult = ValueSchedule.builder().initialValue(10.0d);
    ValueStepSequence stepSequence =
        ValueStepSequence.of(
            LocalDate.of(1970, 1, 1),
            LocalDate.of(1970, 1, 1),
            Frequency.P12M,
            ValueAdjustment.NONE);

    Builder stepSequenceResult2 = initialValueResult.stepSequence(stepSequence);

    // Act and Assert
    assertNotEquals(valueSchedule, stepSequenceResult2.steps(new ArrayList<>()).build());
  }

  /**
   * Test {@link ValueSchedule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueSchedule.equals(Object)", "int ValueSchedule.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ValueSchedule.ALWAYS_0, null);
  }

  /**
   * Test {@link ValueSchedule#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ValueSchedule#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ValueSchedule.equals(Object)", "int ValueSchedule.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ValueSchedule.ALWAYS_0, "Different type to ValueSchedule");
  }
}
