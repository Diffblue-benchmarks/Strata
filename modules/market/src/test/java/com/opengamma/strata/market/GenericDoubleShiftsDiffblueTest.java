package com.opengamma.strata.market;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.function.ObjIntFunction;
import com.opengamma.strata.data.scenario.MarketDataBox;
import com.opengamma.strata.market.GenericDoubleShifts.Meta;
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

class GenericDoubleShiftsDiffblueTest {
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
    Class<? extends GenericDoubleShifts> actualBeanTypeResult =
        GenericDoubleShifts.meta().beanType();

    // Assert
    Class<GenericDoubleShifts> expectedBeanTypeResult = GenericDoubleShifts.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#shiftAmount()}
   *   <li>{@link Meta#shiftType()}
   *   <li>{@link Meta#spread()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.shiftAmount()",
    "MetaProperty Meta.shiftType()",
    "MetaProperty Meta.spread()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = GenericDoubleShifts.meta();

    // Act
    MetaProperty<DoubleArray> actualShiftAmountResult = metaResult.shiftAmount();
    MetaProperty<ShiftType> actualShiftTypeResult = metaResult.shiftType();

    // Assert
    assertTrue(actualShiftAmountResult instanceof DirectMetaProperty);
    assertTrue(actualShiftTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.spread() instanceof DirectMetaProperty);
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
    assertNull(GenericDoubleShifts.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then return name is {@code shiftAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shiftAmount'; then return name is 'shiftAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShiftAmount_thenReturnNameIsShiftAmount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericDoubleShifts.meta().metaPropertyGet("shiftAmount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    MetaProperty<Double> spreadResult = ((Meta) metaBeanResult).spread();
    assertTrue(spreadResult instanceof DirectMetaProperty);
    assertEquals("shiftAmount", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftAmount());
    assertSame(metaBeanResult, shiftTypeResult.metaBean());
    assertSame(metaBeanResult, spreadResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then return name is {@code shiftType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'shiftType'; then return name is 'shiftType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShiftType_thenReturnNameIsShiftType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericDoubleShifts.meta().metaPropertyGet("shiftType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> shiftAmountResult = ((Meta) metaBeanResult).shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<Double> spreadResult = ((Meta) metaBeanResult).spread();
    assertTrue(spreadResult instanceof DirectMetaProperty);
    assertEquals("shiftType", actualMetaPropertyGetResult.name());
    Class<ShiftType> expectedPropertyTypeResult = ShiftType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftType());
    assertSame(metaBeanResult, shiftAmountResult.metaBean());
    assertSame(metaBeanResult, spreadResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spread}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'spread'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpread_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericDoubleShifts.meta().metaPropertyGet("spread");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> shiftAmountResult = ((Meta) metaBeanResult).shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("spread", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spread());
    assertSame(metaBeanResult, shiftAmountResult.metaBean());
    assertSame(metaBeanResult, shiftTypeResult.metaBean());
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
        GenericDoubleShifts.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("shiftType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("shiftAmount");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("spread");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("double", getResult3.propertyType().getName());
    assertEquals("shiftAmount", getResult2.name());
    assertEquals("shiftType", getResult.name());
    assertEquals("spread", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<GenericDoubleShifts> expectedDeclaringTypeResult = GenericDoubleShifts.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<GenericDoubleShifts> expectedDeclaringTypeResult2 = GenericDoubleShifts.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<GenericDoubleShifts> expectedDeclaringTypeResult3 = GenericDoubleShifts.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
    assertNull(GenericDoubleShifts.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = GenericDoubleShifts.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'shiftAmount'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenShiftAmount_thenReturnEmpty() {
    // Arrange
    Meta metaResult = GenericDoubleShifts.meta();
    GenericDoubleShifts bean = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "shiftAmount", true);

    // Assert
    DoubleArray doubleArray = ((DoubleArray) actualPropertyGetResult).EMPTY;
    assertSame(doubleArray, bean.getShiftAmount());
    assertSame(doubleArray, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'shiftType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenShiftType() {
    // Arrange
    Meta metaResult = GenericDoubleShifts.meta();
    GenericDoubleShifts bean = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    // Act
    metaResult.propertyGet(bean, "shiftType", true);

    // Assert that nothing has changed
    assertSame(DoubleArray.EMPTY, bean.getShiftAmount());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code spread}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'spread'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSpread_thenReturnDoubleValueIsZero() {
    // Arrange
    Meta metaResult = GenericDoubleShifts.meta();
    GenericDoubleShifts bean = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    // Act and Assert
    assertEquals(0.0d, ((Double) metaResult.propertyGet(bean, "spread", true)).doubleValue());
    assertSame(DoubleArray.EMPTY, bean.getShiftAmount());
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
            GenericDoubleShifts.meta()
                .propertySet(mock(Bean.class), "shiftAmount", "New Value", false));
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
            GenericDoubleShifts.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftAmount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftAmount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftAmount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GenericDoubleShifts.meta()
                .propertySet(mock(Bean.class), "shiftAmount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GenericDoubleShifts.meta()
                .propertySet(mock(Bean.class), "shiftType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code spread}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'spread'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpread_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GenericDoubleShifts.meta().propertySet(mock(Bean.class), "spread", "New Value", true));
  }

  /**
   * Test {@link GenericDoubleShifts#of(ShiftType, DoubleArray, double)} with {@code shiftType},
   * {@code shiftAmount}, {@code spread}.
   *
   * <ul>
   *   <li>When {@code RELATIVE}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#of(ShiftType, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test of(ShiftType, DoubleArray, double) with 'shiftType', 'shiftAmount', 'spread'; when 'RELATIVE'; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GenericDoubleShifts GenericDoubleShifts.of(ShiftType, DoubleArray, double)"})
  void testOfWithShiftTypeShiftAmountSpread_whenRelative_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    GenericDoubleShifts actualOfResult =
        GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of(), 10.0d);

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    assertEquals(10.0d, actualOfResult.getSpread());
    assertEquals(ShiftType.RELATIVE, actualOfResult.getShiftType());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(DoubleArray.EMPTY, actualOfResult.getShiftAmount());
  }

  /**
   * Test {@link GenericDoubleShifts#of(ShiftType, DoubleArray)} with {@code shiftType}, {@code
   * shiftAmount}.
   *
   * <ul>
   *   <li>When {@code RELATIVE}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#of(ShiftType, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(ShiftType, DoubleArray) with 'shiftType', 'shiftAmount'; when 'RELATIVE'; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GenericDoubleShifts GenericDoubleShifts.of(ShiftType, DoubleArray)"})
  void testOfWithShiftTypeShiftAmount_whenRelative_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    GenericDoubleShifts actualOfResult =
        GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    assertEquals(0.0d, actualOfResult.getSpread());
    assertEquals(ShiftType.RELATIVE, actualOfResult.getShiftType());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(DoubleArray.EMPTY, actualOfResult.getShiftAmount());
  }

  /**
   * Test {@link GenericDoubleShifts#applyTo(MarketDataBox, ReferenceData)}.
   *
   * <p>Method under test: {@link GenericDoubleShifts#applyTo(MarketDataBox, ReferenceData)}
   */
  @Test
  @DisplayName("Test applyTo(MarketDataBox, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox GenericDoubleShifts.applyTo(MarketDataBox, ReferenceData)"})
  void testApplyTo() {
    // Arrange
    GenericDoubleShifts ofResult = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    MarketDataBox<Double> marketData = mock(MarketDataBox.class);
    when(marketData.mapWithIndex(anyInt(), Mockito.<ObjIntFunction<Double, Object>>any()))
        .thenReturn(mock(MarketDataBox.class));

    // Act
    ofResult.applyTo(marketData, mock(ReferenceData.class));

    // Assert
    verify(marketData).mapWithIndex(eq(0), isA(ObjIntFunction.class));
  }

  /**
   * Test {@link GenericDoubleShifts#getScenarioCount()}.
   *
   * <p>Method under test: {@link GenericDoubleShifts#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int GenericDoubleShifts.getScenarioCount()"})
  void testGetScenarioCount() {
    // Arrange, Act and Assert
    assertEquals(
        0, GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()).getScenarioCount());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GenericDoubleShifts#toString()}
   *   <li>{@link GenericDoubleShifts#getMarketDataType()}
   *   <li>{@link GenericDoubleShifts#getShiftAmount()}
   *   <li>{@link GenericDoubleShifts#getShiftType()}
   *   <li>{@link GenericDoubleShifts#getSpread()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class GenericDoubleShifts.getMarketDataType()",
    "DoubleArray GenericDoubleShifts.getShiftAmount()",
    "ShiftType GenericDoubleShifts.getShiftType()",
    "double GenericDoubleShifts.getSpread()",
    "String GenericDoubleShifts.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    GenericDoubleShifts ofResult = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    // Act
    String actualToStringResult = ofResult.toString();
    Class<Double> actualMarketDataType = ofResult.getMarketDataType();
    DoubleArray actualShiftAmount = ofResult.getShiftAmount();
    ShiftType actualShiftType = ofResult.getShiftType();

    // Assert
    assertEquals(
        "GenericDoubleShifts{shiftType=Relative, shiftAmount=[], spread=0.0}",
        actualToStringResult);
    assertEquals(0.0d, ofResult.getSpread());
    assertEquals(ShiftType.RELATIVE, actualShiftType);
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(DoubleArray.EMPTY, actualShiftAmount);
  }

  /**
   * Test {@link GenericDoubleShifts#meta()}.
   *
   * <p>Method under test: {@link GenericDoubleShifts#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GenericDoubleShifts.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = GenericDoubleShifts.meta();

    // Assert
    MetaProperty<DoubleArray> shiftAmountResult = actualMetaResult.shiftAmount();
    assertTrue(shiftAmountResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = actualMetaResult.shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    MetaProperty<Double> spreadResult = actualMetaResult.spread();
    assertTrue(spreadResult instanceof DirectMetaProperty);
    assertEquals("double", spreadResult.propertyType().getName());
    assertEquals("shiftAmount", shiftAmountResult.name());
    assertEquals("shiftType", shiftTypeResult.name());
    assertEquals("spread", spreadResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, shiftAmountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shiftTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, spreadResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, shiftAmountResult.propertyType());
    Class<GenericDoubleShifts> expectedDeclaringTypeResult = GenericDoubleShifts.class;
    assertEquals(expectedDeclaringTypeResult, shiftAmountResult.declaringType());
    Class<GenericDoubleShifts> expectedDeclaringTypeResult2 = GenericDoubleShifts.class;
    assertEquals(expectedDeclaringTypeResult2, shiftTypeResult.declaringType());
    Class<GenericDoubleShifts> expectedDeclaringTypeResult3 = GenericDoubleShifts.class;
    assertEquals(expectedDeclaringTypeResult3, spreadResult.declaringType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, shiftTypeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, shiftAmountResult.metaBean());
    assertSame(meta, shiftTypeResult.metaBean());
    assertSame(meta, spreadResult.metaBean());
  }

  /**
   * Test {@link GenericDoubleShifts#GenericDoubleShifts(ShiftType, DoubleArray, double)}.
   *
   * <ul>
   *   <li>When {@code RELATIVE}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#GenericDoubleShifts(ShiftType, DoubleArray,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new GenericDoubleShifts(ShiftType, DoubleArray, double); when 'RELATIVE'; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GenericDoubleShifts.<init>(ShiftType, DoubleArray, double)"})
  void testNewGenericDoubleShifts_whenRelative_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    GenericDoubleShifts actualGenericDoubleShifts =
        new GenericDoubleShifts(ShiftType.RELATIVE, DoubleArray.of(), 10.0d);

    // Assert
    assertEquals(0, actualGenericDoubleShifts.getScenarioCount());
    assertEquals(10.0d, actualGenericDoubleShifts.getSpread());
    assertEquals(ShiftType.RELATIVE, actualGenericDoubleShifts.getShiftType());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualGenericDoubleShifts.getMarketDataType());
    assertSame(DoubleArray.EMPTY, actualGenericDoubleShifts.getShiftAmount());
  }

  /**
   * Test {@link GenericDoubleShifts#metaBean()}.
   *
   * <p>Method under test: {@link GenericDoubleShifts#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GenericDoubleShifts.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE, GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()).metaBean());
  }

  /**
   * Test {@link GenericDoubleShifts#equals(Object)}, and {@link GenericDoubleShifts#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GenericDoubleShifts#equals(Object)}
   *   <li>{@link GenericDoubleShifts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericDoubleShifts.equals(Object)",
    "int GenericDoubleShifts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GenericDoubleShifts ofResult = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());
    GenericDoubleShifts ofResult2 = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link GenericDoubleShifts#equals(Object)}, and {@link GenericDoubleShifts#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GenericDoubleShifts#equals(Object)}
   *   <li>{@link GenericDoubleShifts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericDoubleShifts.equals(Object)",
    "int GenericDoubleShifts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GenericDoubleShifts ofResult = GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link GenericDoubleShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericDoubleShifts.equals(Object)",
    "int GenericDoubleShifts.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GenericDoubleShifts ofResult =
        GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of(), 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()));
  }

  /**
   * Test {@link GenericDoubleShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericDoubleShifts.equals(Object)",
    "int GenericDoubleShifts.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GenericDoubleShifts ofResult = GenericDoubleShifts.of(ShiftType.ABSOLUTE, DoubleArray.of());

    // Act and Assert
    assertNotEquals(ofResult, GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()));
  }

  /**
   * Test {@link GenericDoubleShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericDoubleShifts.equals(Object)",
    "int GenericDoubleShifts.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    GenericDoubleShifts ofResult =
        GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.filled(3));

    // Act and Assert
    assertNotEquals(ofResult, GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()));
  }

  /**
   * Test {@link GenericDoubleShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericDoubleShifts.equals(Object)",
    "int GenericDoubleShifts.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()), null);
  }

  /**
   * Test {@link GenericDoubleShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GenericDoubleShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericDoubleShifts.equals(Object)",
    "int GenericDoubleShifts.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        GenericDoubleShifts.of(ShiftType.RELATIVE, DoubleArray.of()),
        "Different type to GenericDoubleShifts");
  }
}
