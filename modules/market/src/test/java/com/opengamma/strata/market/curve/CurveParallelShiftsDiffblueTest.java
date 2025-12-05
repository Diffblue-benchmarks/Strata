package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
import com.opengamma.strata.market.ShiftType;
import com.opengamma.strata.market.curve.CurveParallelShifts.Meta;
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

class CurveParallelShiftsDiffblueTest {
  /**
   * Test {@link CurveParallelShifts#absolute(double[])}.
   *
   * <ul>
   *   <li>Then return ShiftAmounts size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#absolute(double[])}
   */
  @Test
  @DisplayName("Test absolute(double[]); then return ShiftAmounts size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveParallelShifts CurveParallelShifts.absolute(double[])"})
  void testAbsolute_thenReturnShiftAmountsSizeIsZero() {
    // Arrange and Act
    CurveParallelShifts actualAbsoluteResult = CurveParallelShifts.absolute();

    // Assert
    DoubleArray shiftAmounts = actualAbsoluteResult.getShiftAmounts();
    assertEquals(0, shiftAmounts.size());
    assertEquals(0, actualAbsoluteResult.getScenarioCount());
    assertEquals(0.0d, shiftAmounts.sum());
    assertTrue(shiftAmounts.isEmpty());
    assertTrue(shiftAmounts.toList().isEmpty());
    assertArrayEquals(new double[] {}, shiftAmounts.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurveParallelShifts#absolute(double[])}.
   *
   * <ul>
   *   <li>When ten and {@code 0.5}.
   *   <li>Then return ShiftAmounts min is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#absolute(double[])}
   */
  @Test
  @DisplayName("Test absolute(double[]); when ten and '0.5'; then return ShiftAmounts min is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveParallelShifts CurveParallelShifts.absolute(double[])"})
  void testAbsolute_whenTenAnd05_thenReturnShiftAmountsMinIs05() {
    // Arrange and Act
    CurveParallelShifts actualAbsoluteResult =
        CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Assert
    DoubleArray shiftAmounts = actualAbsoluteResult.getShiftAmounts();
    assertEquals(0.5d, shiftAmounts.min());
    List<Double> toListResult = shiftAmounts.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(0.5d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, shiftAmounts.max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(21.0d, shiftAmounts.sum());
    assertEquals(4, shiftAmounts.size());
    assertEquals(4, actualAbsoluteResult.getScenarioCount());
    assertFalse(shiftAmounts.isEmpty());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, shiftAmounts.toArrayUnsafe(), 0.0);
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
    Class<? extends CurveParallelShifts> actualBeanTypeResult =
        CurveParallelShifts.meta().beanType();

    // Assert
    Class<CurveParallelShifts> expectedBeanTypeResult = CurveParallelShifts.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#shiftAmounts()}
   *   <li>{@link Meta#shiftType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.shiftAmounts()", "MetaProperty Meta.shiftType()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CurveParallelShifts.meta();

    // Act
    MetaProperty<DoubleArray> actualShiftAmountsResult = metaResult.shiftAmounts();

    // Assert
    assertTrue(actualShiftAmountsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.shiftType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean shiftAmounts return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean shiftAmounts return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanShiftAmountsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurveParallelShifts.meta().metaPropertyGet("shiftType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> shiftAmountsResult = ((Meta) metaBeanResult).shiftAmounts();
    assertTrue(shiftAmountsResult instanceof DirectMetaProperty);
    assertEquals("shiftAmounts", shiftAmountsResult.name());
    assertEquals("shiftType", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, shiftAmountsResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, shiftAmountsResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<CurveParallelShifts> expectedDeclaringTypeResult = CurveParallelShifts.class;
    assertEquals(expectedDeclaringTypeResult, shiftAmountsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftType());
    assertSame(Meta.INSTANCE, shiftAmountsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean shiftType return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean shiftType return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanShiftTypeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurveParallelShifts.meta().metaPropertyGet("shiftAmounts");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("shiftAmounts", actualMetaPropertyGetResult.name());
    assertEquals("shiftType", shiftTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, shiftTypeResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, shiftTypeResult.propertyType());
    Class<CurveParallelShifts> expectedDeclaringTypeResult = CurveParallelShifts.class;
    assertEquals(expectedDeclaringTypeResult, shiftTypeResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftAmounts());
    assertSame(Meta.INSTANCE, shiftTypeResult.metaBean());
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
    assertNull(CurveParallelShifts.meta().metaPropertyGet("Property Name"));
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
        CurveParallelShifts.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("shiftType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("shiftAmounts");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("shiftAmounts", getResult2.name());
    assertEquals("shiftType", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<CurveParallelShifts> expectedDeclaringTypeResult = CurveParallelShifts.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<CurveParallelShifts> expectedDeclaringTypeResult2 = CurveParallelShifts.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
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
    assertNull(CurveParallelShifts.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CurveParallelShifts.meta();
    CurveParallelShifts bean = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftAmounts}.
   *   <li>Then return {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'shiftAmounts'; then return DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenShiftAmounts_thenReturnDoubleArray() {
    // Arrange
    Meta metaResult = CurveParallelShifts.meta();
    CurveParallelShifts bean = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "shiftAmounts", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof DoubleArray);
    assertEquals(0.5d, ((DoubleArray) actualPropertyGetResult).min());
    List<Double> toListResult = ((DoubleArray) actualPropertyGetResult).toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(0.5d, toListResult.get(3).doubleValue());
    assertEquals(1, ((DoubleArray) actualPropertyGetResult).dimensions());
    assertEquals(10.0d, ((DoubleArray) actualPropertyGetResult).max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(21.0d, ((DoubleArray) actualPropertyGetResult).sum());
    assertEquals(4, ((DoubleArray) actualPropertyGetResult).size());
    assertFalse(((DoubleArray) actualPropertyGetResult).isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        ((DoubleArray) actualPropertyGetResult).toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'shiftType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenShiftType_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = CurveParallelShifts.meta();
    CurveParallelShifts bean = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act
    assertDoesNotThrow(() -> metaResult.propertyGet(bean, "shiftType", true));
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
            CurveParallelShifts.meta()
                .propertySet(mock(Bean.class), "shiftAmounts", "New Value", false));
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
            CurveParallelShifts.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shiftAmounts}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shiftAmounts'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShiftAmounts_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurveParallelShifts.meta()
                .propertySet(mock(Bean.class), "shiftAmounts", "New Value", true));
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
            CurveParallelShifts.meta()
                .propertySet(mock(Bean.class), "shiftType", "New Value", true));
  }

  /**
   * Test {@link CurveParallelShifts#relative(double[])}.
   *
   * <ul>
   *   <li>Then return ShiftAmounts size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#relative(double[])}
   */
  @Test
  @DisplayName("Test relative(double[]); then return ShiftAmounts size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveParallelShifts CurveParallelShifts.relative(double[])"})
  void testRelative_thenReturnShiftAmountsSizeIsZero() {
    // Arrange and Act
    CurveParallelShifts actualRelativeResult = CurveParallelShifts.relative();

    // Assert
    DoubleArray shiftAmounts = actualRelativeResult.getShiftAmounts();
    assertEquals(0, shiftAmounts.size());
    assertEquals(0, actualRelativeResult.getScenarioCount());
    assertEquals(0.0d, shiftAmounts.sum());
    assertTrue(shiftAmounts.isEmpty());
    assertTrue(shiftAmounts.toList().isEmpty());
    assertArrayEquals(new double[] {}, shiftAmounts.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurveParallelShifts#relative(double[])}.
   *
   * <ul>
   *   <li>When ten and {@code 0.5}.
   *   <li>Then return ShiftAmounts min is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#relative(double[])}
   */
  @Test
  @DisplayName("Test relative(double[]); when ten and '0.5'; then return ShiftAmounts min is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveParallelShifts CurveParallelShifts.relative(double[])"})
  void testRelative_whenTenAnd05_thenReturnShiftAmountsMinIs05() {
    // Arrange and Act
    CurveParallelShifts actualRelativeResult =
        CurveParallelShifts.relative(10.0d, 0.5d, 10.0d, 0.5d);

    // Assert
    DoubleArray shiftAmounts = actualRelativeResult.getShiftAmounts();
    assertEquals(0.5d, shiftAmounts.min());
    List<Double> toListResult = shiftAmounts.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(0.5d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, shiftAmounts.max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(21.0d, shiftAmounts.sum());
    assertEquals(4, shiftAmounts.size());
    assertEquals(4, actualRelativeResult.getScenarioCount());
    assertFalse(shiftAmounts.isEmpty());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, shiftAmounts.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurveParallelShifts#applyTo(MarketDataBox, ReferenceData)}.
   *
   * <p>Method under test: {@link CurveParallelShifts#applyTo(MarketDataBox, ReferenceData)}
   */
  @Test
  @DisplayName("Test applyTo(MarketDataBox, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox CurveParallelShifts.applyTo(MarketDataBox, ReferenceData)"})
  void testApplyTo() {
    // Arrange
    CurveParallelShifts absoluteResult = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    MarketDataBox<Curve> curve = mock(MarketDataBox.class);
    when(curve.mapWithIndex(anyInt(), Mockito.<ObjIntFunction<Curve, Object>>any()))
        .thenReturn(mock(MarketDataBox.class));

    // Act
    absoluteResult.applyTo(curve, mock(ReferenceData.class));

    // Assert
    verify(curve).mapWithIndex(eq(4), isA(ObjIntFunction.class));
  }

  /**
   * Test {@link CurveParallelShifts#getScenarioCount()}.
   *
   * <p>Method under test: {@link CurveParallelShifts#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurveParallelShifts.getScenarioCount()"})
  void testGetScenarioCount() {
    // Arrange
    CurveParallelShifts absoluteResult = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act and Assert
    assertEquals(4, absoluteResult.getScenarioCount());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveParallelShifts#toString()}
   *   <li>{@link CurveParallelShifts#getMarketDataType()}
   *   <li>{@link CurveParallelShifts#getShiftAmounts()}
   *   <li>{@link CurveParallelShifts#getShiftType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class CurveParallelShifts.getMarketDataType()",
    "DoubleArray CurveParallelShifts.getShiftAmounts()",
    "ShiftType CurveParallelShifts.getShiftType()",
    "String CurveParallelShifts.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveParallelShifts absoluteResult = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act
    String actualToStringResult = absoluteResult.toString();
    Class<Curve> actualMarketDataType = absoluteResult.getMarketDataType();
    DoubleArray actualShiftAmounts = absoluteResult.getShiftAmounts();
    ShiftType actualShiftType = absoluteResult.getShiftType();

    // Assert
    assertEquals(
        "CurveParallelShifts{shiftType=Absolute, shiftAmounts=[10.0, 0.5, 10.0, 0.5]}",
        actualToStringResult);
    assertEquals(0.5d, actualShiftAmounts.min());
    List<Double> toListResult = actualShiftAmounts.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(0.5d, toListResult.get(3).doubleValue());
    assertEquals(1, actualShiftAmounts.dimensions());
    assertEquals(10.0d, actualShiftAmounts.max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(21.0d, actualShiftAmounts.sum());
    assertEquals(4, actualShiftAmounts.size());
    assertEquals(ShiftType.ABSOLUTE, actualShiftType);
    assertFalse(actualShiftAmounts.isEmpty());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualShiftAmounts.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurveParallelShifts#meta()}.
   *
   * <p>Method under test: {@link CurveParallelShifts#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveParallelShifts.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurveParallelShifts.meta();

    // Assert
    MetaProperty<DoubleArray> shiftAmountsResult = actualMetaResult.shiftAmounts();
    assertTrue(shiftAmountsResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = actualMetaResult.shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("shiftAmounts", shiftAmountsResult.name());
    assertEquals("shiftType", shiftTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, shiftAmountsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shiftTypeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, shiftAmountsResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, shiftTypeResult.propertyType());
    Class<CurveParallelShifts> expectedDeclaringTypeResult = CurveParallelShifts.class;
    assertEquals(expectedDeclaringTypeResult, shiftAmountsResult.declaringType());
    Class<CurveParallelShifts> expectedDeclaringTypeResult2 = CurveParallelShifts.class;
    assertEquals(expectedDeclaringTypeResult2, shiftTypeResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, shiftAmountsResult.metaBean());
    assertSame(meta, shiftTypeResult.metaBean());
  }

  /**
   * Test {@link CurveParallelShifts#metaBean()}.
   *
   * <p>Method under test: {@link CurveParallelShifts#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveParallelShifts.metaBean()"})
  void testMetaBean() {
    // Arrange
    CurveParallelShifts absoluteResult = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act and Assert
    assertSame(Meta.INSTANCE, absoluteResult.metaBean());
  }

  /**
   * Test {@link CurveParallelShifts#equals(Object)}, and {@link CurveParallelShifts#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveParallelShifts#equals(Object)}
   *   <li>{@link CurveParallelShifts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParallelShifts.equals(Object)",
    "int CurveParallelShifts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveParallelShifts absoluteResult = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);
    CurveParallelShifts absoluteResult2 = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act and Assert
    assertEquals(absoluteResult, absoluteResult2);
    assertEquals(absoluteResult.hashCode(), absoluteResult2.hashCode());
  }

  /**
   * Test {@link CurveParallelShifts#equals(Object)}, and {@link CurveParallelShifts#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveParallelShifts#equals(Object)}
   *   <li>{@link CurveParallelShifts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParallelShifts.equals(Object)",
    "int CurveParallelShifts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveParallelShifts absoluteResult = CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d);

    // Act and Assert
    assertEquals(absoluteResult, absoluteResult);
    int expectedHashCodeResult = absoluteResult.hashCode();
    assertEquals(expectedHashCodeResult, absoluteResult.hashCode());
  }

  /**
   * Test {@link CurveParallelShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParallelShifts.equals(Object)",
    "int CurveParallelShifts.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveParallelShifts relativeResult = CurveParallelShifts.relative(10.0d, 0.5d, 10.0d, 0.5d);

    // Act and Assert
    assertNotEquals(relativeResult, CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d));
  }

  /**
   * Test {@link CurveParallelShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParallelShifts.equals(Object)",
    "int CurveParallelShifts.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveParallelShifts absoluteResult = CurveParallelShifts.absolute(0.5d, 0.5d, 10.0d, 0.5d);

    // Act and Assert
    assertNotEquals(absoluteResult, CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d));
  }

  /**
   * Test {@link CurveParallelShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParallelShifts.equals(Object)",
    "int CurveParallelShifts.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d), null);
  }

  /**
   * Test {@link CurveParallelShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParallelShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParallelShifts.equals(Object)",
    "int CurveParallelShifts.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CurveParallelShifts.absolute(10.0d, 0.5d, 10.0d, 0.5d),
        "Different type to CurveParallelShifts");
  }
}
