package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.math.impl.statistics.descriptive.QuantileResult.Meta;
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

class QuantileResultDiffblueTest {
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
    Class<? extends QuantileResult> actualBeanTypeResult = QuantileResult.meta().beanType();

    // Assert
    Class<QuantileResult> expectedBeanTypeResult = QuantileResult.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#indices()}
   *   <li>{@link Meta#value()}
   *   <li>{@link Meta#weights()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.indices()",
    "MetaProperty Meta.value()",
    "MetaProperty Meta.weights()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = QuantileResult.meta();

    // Act
    MetaProperty<int[]> actualIndicesResult = metaResult.indices();
    MetaProperty<Double> actualValueResult = metaResult.value();

    // Assert
    assertTrue(actualIndicesResult instanceof DirectMetaProperty);
    assertTrue(actualValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.weights() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code indices}.
   *   <li>Then return propertyType Name is {@code [I}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'indices'; then return propertyType Name is '[I'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndices_thenReturnPropertyTypeNameIsI() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = QuantileResult.meta().metaPropertyGet("indices");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> weightsResult = ((Meta) metaBeanResult).weights();
    assertTrue(weightsResult instanceof DirectMetaProperty);
    assertEquals("[I", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("indices", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).indices());
    assertSame(metaBeanResult, valueResult.metaBean());
    assertSame(metaBeanResult, weightsResult.metaBean());
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
    assertNull(QuantileResult.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'value'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = QuantileResult.meta().metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<int[]> indicesResult = ((Meta) metaBeanResult).indices();
    assertTrue(indicesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> weightsResult = ((Meta) metaBeanResult).weights();
    assertTrue(weightsResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).value());
    assertSame(metaBeanResult, indicesResult.metaBean());
    assertSame(metaBeanResult, weightsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code weights}.
   *   <li>Then return name is {@code weights}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'weights'; then return name is 'weights'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenWeights_thenReturnNameIsWeights() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = QuantileResult.meta().metaPropertyGet("weights");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<int[]> indicesResult = ((Meta) metaBeanResult).indices();
    assertTrue(indicesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> valueResult = ((Meta) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("weights", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).weights());
    assertSame(metaBeanResult, indicesResult.metaBean());
    assertSame(metaBeanResult, valueResult.metaBean());
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
        QuantileResult.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("indices");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("weights");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("[I", getResult2.propertyType().getName());
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("indices", getResult2.name());
    assertEquals("value", getResult.name());
    assertEquals("weights", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<QuantileResult> expectedDeclaringTypeResult = QuantileResult.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<QuantileResult> expectedDeclaringTypeResult2 = QuantileResult.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<QuantileResult> expectedDeclaringTypeResult3 = QuantileResult.class;
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
    assertNull(QuantileResult.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> QuantileResult.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'value'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = QuantileResult.meta();
    QuantileResult bean =
        QuantileResult.of(
            10.0d, new int[] {111972721, 1230441723, 111972721, 1230441723}, DoubleArray.of());

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "value", true)).doubleValue());
    assertSame(DoubleArray.EMPTY, bean.getWeights());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code weights}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'weights'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenWeights_thenReturnEmpty() {
    // Arrange
    Meta metaResult = QuantileResult.meta();
    QuantileResult bean =
        QuantileResult.of(
            10.0d, new int[] {111972721, 1230441723, 111972721, 1230441723}, DoubleArray.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "weights", true);

    // Assert
    DoubleArray doubleArray = ((DoubleArray) actualPropertyGetResult).EMPTY;
    assertSame(doubleArray, bean.getWeights());
    assertSame(doubleArray, actualPropertyGetResult);
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
        () -> QuantileResult.meta().propertySet(mock(Bean.class), "indices", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code indices}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'indices'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndices_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> QuantileResult.meta().propertySet(mock(Bean.class), "indices", "New Value", true));
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
            QuantileResult.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> QuantileResult.meta().propertySet(mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code weights}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'weights'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenWeights_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> QuantileResult.meta().propertySet(mock(Bean.class), "weights", "New Value", true));
  }

  /**
   * Test {@link QuantileResult#of(double, int[], DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Indices is array of {@code int} with one and one hundred twenty-eight.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#of(double, int[], DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(double, int[], DoubleArray); then return Indices is array of int with one and one hundred twenty-eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuantileResult QuantileResult.of(double, int[], DoubleArray)"})
  void testOf_thenReturnIndicesIsArrayOfIntWithOneAndOneHundredTwentyEight() {
    // Arrange and Act
    QuantileResult actualOfResult =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of());

    // Assert
    assertEquals(10.0d, actualOfResult.getValue());
    assertSame(DoubleArray.EMPTY, actualOfResult.getWeights());
    assertArrayEquals(new int[] {1, 128, 1, 128}, actualOfResult.getIndices());
  }

  /**
   * Test {@link QuantileResult#of(double, int[], DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Indices is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#of(double, int[], DoubleArray)}
   */
  @Test
  @DisplayName("Test of(double, int[], DoubleArray); when 'null'; then return Indices is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuantileResult QuantileResult.of(double, int[], DoubleArray)"})
  void testOf_whenNull_thenReturnIndicesIsNull() {
    // Arrange and Act
    QuantileResult actualOfResult = QuantileResult.of(10.0d, null, DoubleArray.of());

    // Assert
    assertNull(actualOfResult.getIndices());
    assertEquals(10.0d, actualOfResult.getValue());
    assertSame(DoubleArray.EMPTY, actualOfResult.getWeights());
  }

  /**
   * Test {@link QuantileResult#meta()}.
   *
   * <p>Method under test: {@link QuantileResult#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta QuantileResult.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = QuantileResult.meta();

    // Assert
    MetaProperty<int[]> indicesResult = actualMetaResult.indices();
    assertTrue(indicesResult instanceof DirectMetaProperty);
    MetaProperty<Double> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> weightsResult = actualMetaResult.weights();
    assertTrue(weightsResult instanceof DirectMetaProperty);
    assertEquals("[I", indicesResult.propertyType().getName());
    assertEquals("double", valueResult.propertyType().getName());
    assertEquals("indices", indicesResult.name());
    assertEquals("value", valueResult.name());
    assertEquals("weights", weightsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, indicesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, weightsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, weightsResult.propertyType());
    Class<QuantileResult> expectedDeclaringTypeResult = QuantileResult.class;
    assertEquals(expectedDeclaringTypeResult, indicesResult.declaringType());
    Class<QuantileResult> expectedDeclaringTypeResult2 = QuantileResult.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<QuantileResult> expectedDeclaringTypeResult3 = QuantileResult.class;
    assertEquals(expectedDeclaringTypeResult3, weightsResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, indicesResult.metaBean());
    assertSame(meta, valueResult.metaBean());
    assertSame(meta, weightsResult.metaBean());
  }

  /**
   * Test {@link QuantileResult#metaBean()}.
   *
   * <p>Method under test: {@link QuantileResult#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta QuantileResult.metaBean()"})
  void testMetaBean() {
    // Arrange
    QuantileResult ofResult =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuantileResult#toString()}
   *   <li>{@link QuantileResult#getValue()}
   *   <li>{@link QuantileResult#getWeights()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double QuantileResult.getValue()",
    "DoubleArray QuantileResult.getWeights()",
    "String QuantileResult.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    QuantileResult ofResult =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of());

    // Act
    String actualToStringResult = ofResult.toString();
    double actualValue = ofResult.getValue();

    // Assert
    assertEquals(
        "QuantileResult{value=10.0, indices=[1, 128, 1, 128], weights=[]}", actualToStringResult);
    assertEquals(10.0d, actualValue);
    assertSame(DoubleArray.EMPTY, ofResult.getWeights());
  }

  /**
   * Test {@link QuantileResult#getIndices()}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with one and one hundred twenty-eight.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#getIndices()}
   */
  @Test
  @DisplayName("Test getIndices(); then return array of int with one and one hundred twenty-eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] QuantileResult.getIndices()"})
  void testGetIndices_thenReturnArrayOfIntWithOneAndOneHundredTwentyEight() {
    // Arrange
    QuantileResult ofResult =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of());

    // Act and Assert
    assertArrayEquals(new int[] {1, 128, 1, 128}, ofResult.getIndices());
  }

  /**
   * Test {@link QuantileResult#getIndices()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#getIndices()}
   */
  @Test
  @DisplayName("Test getIndices(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] QuantileResult.getIndices()"})
  void testGetIndices_thenReturnNull() {
    // Arrange
    QuantileResult ofResult = QuantileResult.of(10.0d, null, DoubleArray.of());

    // Act and Assert
    assertNull(ofResult.getIndices());
  }

  /**
   * Test {@link QuantileResult#equals(Object)}, and {@link QuantileResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuantileResult#equals(Object)}
   *   <li>{@link QuantileResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    QuantileResult ofResult =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of());
    QuantileResult ofResult2 =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link QuantileResult#equals(Object)}, and {@link QuantileResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuantileResult#equals(Object)}
   *   <li>{@link QuantileResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    QuantileResult ofResult =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link QuantileResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of()), 1);
  }

  /**
   * Test {@link QuantileResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    QuantileResult ofResult = QuantileResult.of(0.5d, new int[] {1, 128, 1, 128}, DoubleArray.of());

    // Act and Assert
    assertNotEquals(
        ofResult, QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of()));
  }

  /**
   * Test {@link QuantileResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    QuantileResult ofResult =
        QuantileResult.of(10.0d, new int[] {0, 128, 1, 128}, DoubleArray.of());

    // Act and Assert
    assertNotEquals(
        ofResult, QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of()));
  }

  /**
   * Test {@link QuantileResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    QuantileResult ofResult =
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.filled(3));

    // Act and Assert
    assertNotEquals(
        ofResult, QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of()));
  }

  /**
   * Test {@link QuantileResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of()), null);
  }

  /**
   * Test {@link QuantileResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuantileResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuantileResult.equals(Object)", "int QuantileResult.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        QuantileResult.of(10.0d, new int[] {1, 128, 1, 128}, DoubleArray.of()),
        "Different type to QuantileResult");
  }
}
