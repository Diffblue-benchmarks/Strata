package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.pricer.fxopt.RecombiningTrinomialTreeData.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RecombiningTrinomialTreeDataDiffblueTest {
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
    Class<? extends RecombiningTrinomialTreeData> actualBeanTypeResult =
        RecombiningTrinomialTreeData.meta().beanType();

    // Assert
    Class<RecombiningTrinomialTreeData> expectedBeanTypeResult = RecombiningTrinomialTreeData.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#discountFactor()}
   *   <li>{@link Meta#stateValue()}
   *   <li>{@link Meta#time()}
   *   <li>{@link Meta#transitionProbability()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.discountFactor()",
    "MetaProperty Meta.stateValue()",
    "MetaProperty Meta.time()",
    "MetaProperty Meta.transitionProbability()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RecombiningTrinomialTreeData.meta();

    // Act
    MetaProperty<DoubleArray> actualDiscountFactorResult = metaResult.discountFactor();
    MetaProperty<DoubleMatrix> actualStateValueResult = metaResult.stateValue();
    MetaProperty<DoubleArray> actualTimeResult = metaResult.time();

    // Assert
    assertTrue(actualDiscountFactorResult instanceof DirectMetaProperty);
    assertTrue(actualStateValueResult instanceof DirectMetaProperty);
    assertTrue(actualTimeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.transitionProbability() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code transitionProbability}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'transitionProbability'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsTransitionProbability() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RecombiningTrinomialTreeData.meta().metaPropertyGet("transitionProbability");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DoubleArray> discountFactorResult = ((Meta) metaBeanResult).discountFactor();
    assertTrue(discountFactorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> stateValueResult = ((Meta) metaBeanResult).stateValue();
    assertTrue(stateValueResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> timeResult = ((Meta) metaBeanResult).time();
    assertTrue(timeResult instanceof DirectMetaProperty);
    assertEquals("transitionProbability", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).transitionProbability());
    assertSame(metaBeanResult, discountFactorResult.metaBean());
    assertSame(metaBeanResult, stateValueResult.metaBean());
    assertSame(metaBeanResult, timeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code discountFactor}.
   *   <li>Then return name is {@code discountFactor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'discountFactor'; then return name is 'discountFactor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDiscountFactor_thenReturnNameIsDiscountFactor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RecombiningTrinomialTreeData.meta().metaPropertyGet("discountFactor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> stateValueResult = ((Meta) metaBeanResult).stateValue();
    assertTrue(stateValueResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> timeResult = ((Meta) metaBeanResult).time();
    assertTrue(timeResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<DoubleMatrix>> transitionProbabilityResult =
        ((Meta) metaBeanResult).transitionProbability();
    assertTrue(transitionProbabilityResult instanceof DirectMetaProperty);
    assertEquals("discountFactor", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountFactor());
    assertSame(metaBeanResult, stateValueResult.metaBean());
    assertSame(metaBeanResult, timeResult.metaBean());
    assertSame(metaBeanResult, transitionProbabilityResult.metaBean());
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
    assertNull(RecombiningTrinomialTreeData.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code stateValue}.
   *   <li>Then return name is {@code stateValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'stateValue'; then return name is 'stateValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStateValue_thenReturnNameIsStateValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RecombiningTrinomialTreeData.meta().metaPropertyGet("stateValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DoubleArray> discountFactorResult = ((Meta) metaBeanResult).discountFactor();
    assertTrue(discountFactorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> timeResult = ((Meta) metaBeanResult).time();
    assertTrue(timeResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<DoubleMatrix>> transitionProbabilityResult =
        ((Meta) metaBeanResult).transitionProbability();
    assertTrue(transitionProbabilityResult instanceof DirectMetaProperty);
    assertEquals("stateValue", actualMetaPropertyGetResult.name());
    Class<DoubleMatrix> expectedPropertyTypeResult = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).stateValue());
    assertSame(metaBeanResult, discountFactorResult.metaBean());
    assertSame(metaBeanResult, timeResult.metaBean());
    assertSame(metaBeanResult, transitionProbabilityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code time}.
   *   <li>Then return name is {@code time}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'time'; then return name is 'time'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTime_thenReturnNameIsTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RecombiningTrinomialTreeData.meta().metaPropertyGet("time");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DoubleArray> discountFactorResult = ((Meta) metaBeanResult).discountFactor();
    assertTrue(discountFactorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> stateValueResult = ((Meta) metaBeanResult).stateValue();
    assertTrue(stateValueResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<DoubleMatrix>> transitionProbabilityResult =
        ((Meta) metaBeanResult).transitionProbability();
    assertTrue(transitionProbabilityResult instanceof DirectMetaProperty);
    assertEquals("time", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).time());
    assertSame(metaBeanResult, discountFactorResult.metaBean());
    assertSame(metaBeanResult, stateValueResult.metaBean());
    assertSame(metaBeanResult, transitionProbabilityResult.metaBean());
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
        RecombiningTrinomialTreeData.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("discountFactor") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("stateValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("time") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("transitionProbability") instanceof DirectMetaProperty);
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
    assertNull(
        RecombiningTrinomialTreeData.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            RecombiningTrinomialTreeData.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountFactor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'discountFactor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDiscountFactor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RecombiningTrinomialTreeData.meta()
                .propertySet(mock(Bean.class), "discountFactor", "New Value", true));
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
            RecombiningTrinomialTreeData.meta()
                .propertySet(mock(Bean.class), "discountFactor", "New Value", false));
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
            RecombiningTrinomialTreeData.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code stateValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'stateValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStateValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RecombiningTrinomialTreeData.meta()
                .propertySet(mock(Bean.class), "stateValue", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code time}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'time'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTime_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RecombiningTrinomialTreeData.meta()
                .propertySet(mock(Bean.class), "time", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code transitionProbability}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'transitionProbability'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTransitionProbability_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RecombiningTrinomialTreeData.meta()
                .propertySet(mock(Bean.class), "transitionProbability", "New Value", true));
  }

  /**
   * Test {@link RecombiningTrinomialTreeData#of(DoubleMatrix, List, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return NumberOfSteps is zero.
   * </ul>
   *
   * <p>Method under test: {@link RecombiningTrinomialTreeData#of(DoubleMatrix, List, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(DoubleMatrix, List, DoubleArray, DoubleArray); when DoubleArray with value is ten; then return NumberOfSteps is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData RecombiningTrinomialTreeData.of(DoubleMatrix, List, DoubleArray, DoubleArray)"
  })
  void testOf_whenDoubleArrayWithValueIsTen_thenReturnNumberOfStepsIsZero() {
    // Arrange
    DoubleMatrix stateValue = DoubleMatrix.filled(1, 1);
    ArrayList<DoubleMatrix> transitionProbability = new ArrayList<>();
    DoubleArray discountFactor = DoubleArray.of();
    DoubleArray time = DoubleArray.of(10.0d);

    // Act
    RecombiningTrinomialTreeData actualOfResult =
        RecombiningTrinomialTreeData.of(stateValue, transitionProbability, discountFactor, time);

    // Assert
    assertEquals(0, actualOfResult.getNumberOfSteps());
    assertEquals(0.0d, actualOfResult.getSpot());
    assertEquals(transitionProbability, actualOfResult.getTransitionProbability());
    assertSame(time, actualOfResult.getTime());
    assertSame(stateValue, actualOfResult.getStateValue());
    assertSame(DoubleArray.EMPTY, actualOfResult.getDiscountFactor());
  }

  /**
   * Test {@link RecombiningTrinomialTreeData#getNumberOfSteps()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link RecombiningTrinomialTreeData#getNumberOfSteps()}
   */
  @Test
  @DisplayName("Test getNumberOfSteps(); given DoubleArray with value is ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int RecombiningTrinomialTreeData.getNumberOfSteps()"})
  void testGetNumberOfSteps_givenDoubleArrayWithValueIsTen_thenReturnZero() {
    // Arrange
    DoubleMatrix stateValue = DoubleMatrix.filled(1, 1);
    ArrayList<DoubleMatrix> transitionProbability = new ArrayList<>();
    DoubleArray discountFactor = DoubleArray.of();

    RecombiningTrinomialTreeData ofResult =
        RecombiningTrinomialTreeData.of(
            stateValue, transitionProbability, discountFactor, DoubleArray.of(10.0d));

    // Act and Assert
    assertEquals(0, ofResult.getNumberOfSteps());
  }

  /**
   * Test {@link RecombiningTrinomialTreeData#getStateValueAtLayer(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link RecombiningTrinomialTreeData#getStateValueAtLayer(int)}
   */
  @Test
  @DisplayName("Test getStateValueAtLayer(int); when zero; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray RecombiningTrinomialTreeData.getStateValueAtLayer(int)"})
  void testGetStateValueAtLayer_whenZero_thenReturnMaxIsZero() {
    // Arrange
    DoubleMatrix stateValue = DoubleMatrix.filled(1, 1);
    ArrayList<DoubleMatrix> transitionProbability = new ArrayList<>();
    DoubleArray discountFactor = DoubleArray.of();

    RecombiningTrinomialTreeData ofResult =
        RecombiningTrinomialTreeData.of(
            stateValue, transitionProbability, discountFactor, DoubleArray.of(10.0d));

    // Act
    DoubleArray actualStateValueAtLayer = ofResult.getStateValueAtLayer(0);

    // Assert
    assertEquals(0.0d, actualStateValueAtLayer.max());
    assertEquals(0.0d, actualStateValueAtLayer.min());
    assertEquals(0.0d, actualStateValueAtLayer.sum());
    List<Double> toListResult = actualStateValueAtLayer.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, actualStateValueAtLayer.dimensions());
    assertEquals(1, actualStateValueAtLayer.size());
    assertFalse(actualStateValueAtLayer.isEmpty());
    assertArrayEquals(new double[] {0.0d}, actualStateValueAtLayer.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link RecombiningTrinomialTreeData#getSpot()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link RecombiningTrinomialTreeData#getSpot()}
   */
  @Test
  @DisplayName("Test getSpot(); given DoubleArray with value is ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RecombiningTrinomialTreeData.getSpot()"})
  void testGetSpot_givenDoubleArrayWithValueIsTen_thenReturnZero() {
    // Arrange
    DoubleMatrix stateValue = DoubleMatrix.filled(1, 1);
    ArrayList<DoubleMatrix> transitionProbability = new ArrayList<>();
    DoubleArray discountFactor = DoubleArray.of();

    RecombiningTrinomialTreeData ofResult =
        RecombiningTrinomialTreeData.of(
            stateValue, transitionProbability, discountFactor, DoubleArray.of(10.0d));

    // Act and Assert
    assertEquals(0.0d, ofResult.getSpot());
  }

  /**
   * Test {@link RecombiningTrinomialTreeData#getTime(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link RecombiningTrinomialTreeData#getTime(int)}
   */
  @Test
  @DisplayName(
      "Test getTime(int) with 'int'; given DoubleArray with value is ten; when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RecombiningTrinomialTreeData.getTime(int)"})
  void testGetTimeWithInt_givenDoubleArrayWithValueIsTen_whenZero_thenReturnTen() {
    // Arrange
    DoubleMatrix stateValue = DoubleMatrix.filled(1, 1);
    ArrayList<DoubleMatrix> transitionProbability = new ArrayList<>();
    DoubleArray discountFactor = DoubleArray.of();

    RecombiningTrinomialTreeData ofResult =
        RecombiningTrinomialTreeData.of(
            stateValue, transitionProbability, discountFactor, DoubleArray.of(10.0d));

    // Act and Assert
    assertEquals(10.0d, ofResult.getTime(0));
  }

  /**
   * Test {@link RecombiningTrinomialTreeData#meta()}.
   *
   * <p>Method under test: {@link RecombiningTrinomialTreeData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RecombiningTrinomialTreeData.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RecombiningTrinomialTreeData.meta();

    // Assert
    assertTrue(actualMetaResult.discountFactor() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.stateValue() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.time() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.transitionProbability() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link RecombiningTrinomialTreeData#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray} with value is ten.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link RecombiningTrinomialTreeData#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); given DoubleArray with value is ten; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RecombiningTrinomialTreeData.metaBean()"})
  void testMetaBean_givenDoubleArrayWithValueIsTen_thenReturnInstance() {
    // Arrange
    DoubleMatrix stateValue = DoubleMatrix.filled(1, 1);
    ArrayList<DoubleMatrix> transitionProbability = new ArrayList<>();
    DoubleArray discountFactor = DoubleArray.of();

    RecombiningTrinomialTreeData ofResult =
        RecombiningTrinomialTreeData.of(
            stateValue, transitionProbability, discountFactor, DoubleArray.of(10.0d));

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
