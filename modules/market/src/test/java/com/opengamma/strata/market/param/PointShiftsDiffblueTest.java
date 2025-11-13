package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.market.ShiftType;
import com.opengamma.strata.market.param.PointShifts.Meta;
import java.util.ArrayList;
import java.util.HashMap;
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

class PointShiftsDiffblueTest {
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
    Class<? extends PointShifts> actualBeanTypeResult = PointShifts.meta().beanType();

    // Assert
    Class<PointShifts> expectedBeanTypeResult = PointShifts.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#nodeIndices()}
   *   <li>{@link Meta#shiftType()}
   *   <li>{@link Meta#shifts()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.nodeIndices()",
    "MetaProperty Meta.shiftType()",
    "MetaProperty Meta.shifts()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = PointShifts.meta();

    // Act
    MetaProperty<ImmutableMap<Object, Integer>> actualNodeIndicesResult = metaResult.nodeIndices();
    MetaProperty<ShiftType> actualShiftTypeResult = metaResult.shiftType();

    // Assert
    assertTrue(actualNodeIndicesResult instanceof DirectMetaProperty);
    assertTrue(actualShiftTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.shifts() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code nodeIndices}.
   *   <li>Then return name is {@code nodeIndices}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'nodeIndices'; then return name is 'nodeIndices'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNodeIndices_thenReturnNameIsNodeIndices() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = PointShifts.meta().metaPropertyGet("nodeIndices");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> shiftsResult = ((Meta) metaBeanResult).shifts();
    assertTrue(shiftsResult instanceof DirectMetaProperty);
    assertEquals("nodeIndices", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).nodeIndices());
    assertSame(metaBeanResult, shiftTypeResult.metaBean());
    assertSame(metaBeanResult, shiftsResult.metaBean());
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
    assertNull(PointShifts.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult = PointShifts.meta().metaPropertyGet("shiftType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Object, Integer>> nodeIndicesResult =
        ((Meta) metaBeanResult).nodeIndices();
    assertTrue(nodeIndicesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> shiftsResult = ((Meta) metaBeanResult).shifts();
    assertTrue(shiftsResult instanceof DirectMetaProperty);
    assertEquals("shiftType", actualMetaPropertyGetResult.name());
    Class<ShiftType> expectedPropertyTypeResult = ShiftType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shiftType());
    assertSame(metaBeanResult, nodeIndicesResult.metaBean());
    assertSame(metaBeanResult, shiftsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code shifts}.
   *   <li>Then return name is {@code shifts}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'shifts'; then return name is 'shifts'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenShifts_thenReturnNameIsShifts() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = PointShifts.meta().metaPropertyGet("shifts");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Object, Integer>> nodeIndicesResult =
        ((Meta) metaBeanResult).nodeIndices();
    assertTrue(nodeIndicesResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = ((Meta) metaBeanResult).shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    assertEquals("shifts", actualMetaPropertyGetResult.name());
    Class<DoubleMatrix> expectedPropertyTypeResult = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).shifts());
    assertSame(metaBeanResult, nodeIndicesResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = PointShifts.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("shiftType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("nodeIndices");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("shifts");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("nodeIndices", getResult2.name());
    assertEquals("shiftType", getResult.name());
    assertEquals("shifts", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<ShiftType> expectedPropertyTypeResult3 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Class<PointShifts> expectedDeclaringTypeResult = PointShifts.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<PointShifts> expectedDeclaringTypeResult2 = PointShifts.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<PointShifts> expectedDeclaringTypeResult3 = PointShifts.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
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
    assertNull(PointShifts.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = PointShifts.meta();
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts bean = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code nodeIndices}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'nodeIndices'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenNodeIndices_thenReturnMap() {
    // Arrange
    Meta metaResult = PointShifts.meta();
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts bean = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "nodeIndices", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
    assertSame(DoubleMatrix.EMPTY, bean.getShifts());
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
    Meta metaResult = PointShifts.meta();
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts bean = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act
    metaResult.propertyGet(bean, "shiftType", true);

    // Assert that nothing has changed
    assertSame(DoubleMatrix.EMPTY, bean.getShifts());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code shifts}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'shifts'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenShifts_thenReturnEmpty() {
    // Arrange
    Meta metaResult = PointShifts.meta();
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts bean = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "shifts", true);

    // Assert
    DoubleMatrix doubleMatrix = ((DoubleMatrix) actualPropertyGetResult).EMPTY;
    assertSame(doubleMatrix, bean.getShifts());
    assertSame(doubleMatrix, actualPropertyGetResult);
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
        () -> PointShifts.meta().propertySet(mock(Bean.class), "nodeIndices", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code nodeIndices}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'nodeIndices'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNodeIndices_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> PointShifts.meta().propertySet(mock(Bean.class), "nodeIndices", "New Value", true));
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
        () -> PointShifts.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> PointShifts.meta().propertySet(mock(Bean.class), "shiftType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code shifts}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'shifts'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenShifts_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> PointShifts.meta().propertySet(mock(Bean.class), "shifts", "New Value", true));
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return NodeIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, List); given '42'; when ArrayList() add '42'; then return NodeIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, List)"})
  void testNewPointShifts_given42_whenArrayListAdd42_thenReturnNodeIndicesSizeIsOne() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    ArrayList<Object> nodeIdentifiers = new ArrayList<>();
    nodeIdentifiers.add("42");

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIdentifiers);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    ImmutableMap<Object, Integer> nodeIndices = actualPointShifts.getNodeIndices();
    assertEquals(1, nodeIndices.size());
    assertEquals(0, nodeIndices.get("42").intValue());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is one.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, Map); given '42'; when HashMap() '42' is one; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, Map)"})
  void testNewPointShifts_given42_whenHashMap42IsOne_thenReturnScenarioCountIsZero() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    HashMap<Object, Integer> nodeIndices = new HashMap<>();
    nodeIndices.put("42", 1);
    nodeIndices.put("Key", 42);

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIndices);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    assertEquals(nodeIndices, actualPointShifts.getNodeIndices());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code foo} is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, Map); given 'foo'; when HashMap() 'foo' is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, Map)"})
  void testNewPointShifts_givenFoo_whenHashMapFooIsFortyTwo() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    HashMap<Object, Integer> nodeIndices = new HashMap<>();
    nodeIndices.put("foo", 42);
    nodeIndices.put(-1, 1);
    nodeIndices.put("Key", 42);

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIndices);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    assertEquals(nodeIndices, actualPointShifts.getNodeIndices());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, Map); given 'Key'; when HashMap() 'Key' is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, Map)"})
  void testNewPointShifts_givenKey_whenHashMapKeyIsFortyTwo() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    HashMap<Object, Integer> nodeIndices = new HashMap<>();
    nodeIndices.put("Key", 42);

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIndices);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    assertEquals(nodeIndices, actualPointShifts.getNodeIndices());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}.
   *
   * <ul>
   *   <li>Given minus one.
   *   <li>When {@link HashMap#HashMap()} minus one is one.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, Map); given minus one; when HashMap() minus one is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, Map)"})
  void testNewPointShifts_givenMinusOne_whenHashMapMinusOneIsOne() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    HashMap<Object, Integer> nodeIndices = new HashMap<>();
    nodeIndices.put(-1, 1);
    nodeIndices.put("Key", 42);

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIndices);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    assertEquals(nodeIndices, actualPointShifts.getNodeIndices());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return NodeIndices one intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, List); given one; then return NodeIndices one intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, List)"})
  void testNewPointShifts_givenOne_thenReturnNodeIndicesOneIntValueIsZero() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    ArrayList<Object> nodeIdentifiers = new ArrayList<>();
    nodeIdentifiers.add(1);
    nodeIdentifiers.add("42");

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIdentifiers);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    ImmutableMap<Object, Integer> nodeIndices = actualPointShifts.getNodeIndices();
    assertEquals(2, nodeIndices.size());
    assertEquals(0, nodeIndices.get(1).intValue());
    assertEquals(1, nodeIndices.get("42").intValue());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>Then return NodeIndices two intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, List); given two; then return NodeIndices two intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, List)"})
  void testNewPointShifts_givenTwo_thenReturnNodeIndicesTwoIntValueIsZero() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    ArrayList<Object> nodeIdentifiers = new ArrayList<>();
    nodeIdentifiers.add(2);
    nodeIdentifiers.add("42");

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIdentifiers);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    ImmutableMap<Object, Integer> nodeIndices = actualPointShifts.getNodeIndices();
    assertEquals(2, nodeIndices.size());
    assertEquals(0, nodeIndices.get(2).intValue());
    assertEquals(1, nodeIndices.get("42").intValue());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return NodeIndices Empty.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, List)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, List); when ArrayList(); then return NodeIndices Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, List)"})
  void testNewPointShifts_whenArrayList_thenReturnNodeIndicesEmpty() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    assertTrue(actualPointShifts.getNodeIndices().isEmpty());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#PointShifts(ShiftType, DoubleMatrix, Map)}
   */
  @Test
  @DisplayName(
      "Test new PointShifts(ShiftType, DoubleMatrix, Map); when HashMap(); then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PointShifts.<init>(ShiftType, DoubleMatrix, Map)"})
  void testNewPointShifts_whenHashMap_thenReturnScenarioCountIsZero() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    HashMap<Object, Integer> nodeIndices = new HashMap<>();

    // Act
    PointShifts actualPointShifts = new PointShifts(ShiftType.RELATIVE, shifts, nodeIndices);

    // Assert
    assertEquals(0, actualPointShifts.getScenarioCount());
    assertEquals(ShiftType.RELATIVE, actualPointShifts.getShiftType());
    assertEquals(nodeIndices, actualPointShifts.getNodeIndices());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualPointShifts.getMarketDataType());
    assertSame(DoubleMatrix.EMPTY, actualPointShifts.getShifts());
  }

  /**
   * Test {@link PointShifts#metaBean()}.
   *
   * <p>Method under test: {@link PointShifts#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PointShifts.metaBean()"})
  void testMetaBean() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, pointShifts.metaBean());
  }

  /**
   * Test {@link PointShifts#getScenarioCount()}.
   *
   * <p>Method under test: {@link PointShifts#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int PointShifts.getScenarioCount()"})
  void testGetScenarioCount() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act and Assert
    assertEquals(0, pointShifts.getScenarioCount());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PointShifts#toString()}
   *   <li>{@link PointShifts#getMarketDataType()}
   *   <li>{@link PointShifts#getNodeIndices()}
   *   <li>{@link PointShifts#getShiftType()}
   *   <li>{@link PointShifts#getShifts()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class PointShifts.getMarketDataType()",
    "ImmutableMap PointShifts.getNodeIndices()",
    "ShiftType PointShifts.getShiftType()",
    "DoubleMatrix PointShifts.getShifts()",
    "String PointShifts.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act
    String actualToStringResult = pointShifts.toString();
    Class<ParameterizedData> actualMarketDataType = pointShifts.getMarketDataType();
    ImmutableMap<Object, Integer> actualNodeIndices = pointShifts.getNodeIndices();
    ShiftType actualShiftType = pointShifts.getShiftType();
    DoubleMatrix actualShifts = pointShifts.getShifts();

    // Assert
    assertEquals("PointShifts{shiftType=Relative, shifts=, nodeIndices={}}", actualToStringResult);
    assertEquals(ShiftType.RELATIVE, actualShiftType);
    assertTrue(actualNodeIndices.isEmpty());
    Class<ParameterizedData> expectedMarketDataType = ParameterizedData.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(DoubleMatrix.EMPTY, actualShifts);
  }

  /**
   * Test {@link PointShifts#meta()}.
   *
   * <p>Method under test: {@link PointShifts#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PointShifts.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = PointShifts.meta();

    // Assert
    MetaProperty<ImmutableMap<Object, Integer>> nodeIndicesResult = actualMetaResult.nodeIndices();
    assertTrue(nodeIndicesResult instanceof DirectMetaProperty);
    MetaProperty<ShiftType> shiftTypeResult = actualMetaResult.shiftType();
    assertTrue(shiftTypeResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> shiftsResult = actualMetaResult.shifts();
    assertTrue(shiftsResult instanceof DirectMetaProperty);
    assertEquals("nodeIndices", nodeIndicesResult.name());
    assertEquals("shiftType", shiftTypeResult.name());
    assertEquals("shifts", shiftsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, nodeIndicesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shiftTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, shiftsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, nodeIndicesResult.propertyType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, shiftsResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult3 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult3, shiftTypeResult.propertyType());
    Class<PointShifts> expectedDeclaringTypeResult = PointShifts.class;
    assertEquals(expectedDeclaringTypeResult, nodeIndicesResult.declaringType());
    Class<PointShifts> expectedDeclaringTypeResult2 = PointShifts.class;
    assertEquals(expectedDeclaringTypeResult2, shiftTypeResult.declaringType());
    Class<PointShifts> expectedDeclaringTypeResult3 = PointShifts.class;
    assertEquals(expectedDeclaringTypeResult3, shiftsResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, nodeIndicesResult.metaBean());
    assertSame(meta, shiftTypeResult.metaBean());
    assertSame(meta, shiftsResult.metaBean());
  }

  /**
   * Test {@link PointShifts#equals(Object)}, and {@link PointShifts#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PointShifts#equals(Object)}
   *   <li>{@link PointShifts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointShifts.equals(Object)", "int PointShifts.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());
    DoubleMatrix shifts2 = DoubleMatrix.of();
    PointShifts pointShifts2 = new PointShifts(ShiftType.RELATIVE, shifts2, new ArrayList<>());

    // Act and Assert
    assertEquals(pointShifts, pointShifts2);
    assertEquals(pointShifts.hashCode(), pointShifts2.hashCode());
  }

  /**
   * Test {@link PointShifts#equals(Object)}, and {@link PointShifts#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PointShifts#equals(Object)}
   *   <li>{@link PointShifts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointShifts.equals(Object)", "int PointShifts.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act and Assert
    assertEquals(pointShifts, pointShifts);
    int expectedHashCodeResult = pointShifts.hashCode();
    assertEquals(expectedHashCodeResult, pointShifts.hashCode());
  }

  /**
   * Test {@link PointShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointShifts.equals(Object)", "int PointShifts.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.ABSOLUTE, shifts, new ArrayList<>());
    DoubleMatrix shifts2 = DoubleMatrix.of();
    PointShifts pointShifts2 = new PointShifts(ShiftType.RELATIVE, shifts2, new ArrayList<>());

    // Act and Assert
    assertNotEquals(pointShifts, pointShifts2);
  }

  /**
   * Test {@link PointShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointShifts.equals(Object)", "int PointShifts.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.identity(3);
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());
    DoubleMatrix shifts2 = DoubleMatrix.of();
    PointShifts pointShifts2 = new PointShifts(ShiftType.RELATIVE, shifts2, new ArrayList<>());

    // Act and Assert
    assertNotEquals(pointShifts, pointShifts2);
  }

  /**
   * Test {@link PointShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointShifts.equals(Object)", "int PointShifts.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayList<Object> nodeIdentifiers = new ArrayList<>();
    nodeIdentifiers.add("42");
    PointShifts pointShifts =
        new PointShifts(ShiftType.RELATIVE, DoubleMatrix.of(), nodeIdentifiers);
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts2 = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act and Assert
    assertNotEquals(pointShifts, pointShifts2);
  }

  /**
   * Test {@link PointShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointShifts.equals(Object)", "int PointShifts.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act and Assert
    assertNotEquals(pointShifts, null);
  }

  /**
   * Test {@link PointShifts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PointShifts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PointShifts.equals(Object)", "int PointShifts.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DoubleMatrix shifts = DoubleMatrix.of();
    PointShifts pointShifts = new PointShifts(ShiftType.RELATIVE, shifts, new ArrayList<>());

    // Act and Assert
    assertNotEquals(pointShifts, "Different type to PointShifts");
  }
}
