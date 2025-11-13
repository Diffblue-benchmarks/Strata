package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSortedMap;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray.Meta;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MultiCurrencyAmountArrayDiffblueTest {
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
    Class<? extends MultiCurrencyAmountArray> actualBeanTypeResult =
        MultiCurrencyAmountArray.meta().beanType();

    // Assert
    Class<MultiCurrencyAmountArray> expectedBeanTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#size()}
   *   <li>{@link Meta#values()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.size()", "MetaProperty Meta.values()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = MultiCurrencyAmountArray.meta();

    // Act
    MetaProperty<Integer> actualSizeResult = metaResult.size();

    // Assert
    assertTrue(actualSizeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.values() instanceof DirectMetaProperty);
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
    assertNull(MultiCurrencyAmountArray.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code size}.
   *   <li>Then metaBean values return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'size'; then metaBean values return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSize_thenMetaBeanValuesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        MultiCurrencyAmountArray.meta().metaPropertyGet("size");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSortedMap<Currency, DoubleArray>> valuesResult =
        ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("size", actualMetaPropertyGetResult.name());
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    Class<ImmutableSortedMap> expectedPropertyTypeResult = ImmutableSortedMap.class;
    assertEquals(expectedPropertyTypeResult, valuesResult.propertyType());
    Class<MultiCurrencyAmountArray> expectedDeclaringTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, valuesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).size());
    assertSame(Meta.INSTANCE, valuesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then metaBean size return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'values'; then metaBean size return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValues_thenMetaBeanSizeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        MultiCurrencyAmountArray.meta().metaPropertyGet("values");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> sizeResult = ((Meta) metaBeanResult).size();
    assertTrue(sizeResult instanceof DirectMetaProperty);
    assertEquals("int", sizeResult.propertyType().getName());
    assertEquals("size", sizeResult.name());
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sizeResult.style());
    Class<ImmutableSortedMap> expectedPropertyTypeResult = ImmutableSortedMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<MultiCurrencyAmountArray> expectedDeclaringTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, sizeResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).values());
    assertSame(Meta.INSTANCE, sizeResult.metaBean());
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
        MultiCurrencyAmountArray.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("size");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("values");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("int", getResult.propertyType().getName());
    assertEquals("size", getResult.name());
    assertEquals("values", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ImmutableSortedMap> expectedPropertyTypeResult = ImmutableSortedMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<MultiCurrencyAmountArray> expectedDeclaringTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<MultiCurrencyAmountArray> expectedDeclaringTypeResult2 = MultiCurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
        MultiCurrencyAmountArray.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = MultiCurrencyAmountArray.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                MultiCurrencyAmountArray.of(new ArrayList<>()), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code size}.
   *   <li>Then return intValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'size'; then return intValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSize_thenReturnIntValueIsZero() {
    // Arrange
    Meta metaResult = MultiCurrencyAmountArray.meta();

    // Act and Assert
    assertEquals(
        0,
        ((Integer)
                metaResult.propertyGet(
                    MultiCurrencyAmountArray.of(new ArrayList<>()), "size", true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'values'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValues_thenReturnMap() {
    // Arrange
    Meta metaResult = MultiCurrencyAmountArray.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MultiCurrencyAmountArray.of(new ArrayList<>()), "values", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
            MultiCurrencyAmountArray.meta()
                .propertySet(mock(Bean.class), "size", "New Value", false));
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
            MultiCurrencyAmountArray.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code size}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'size'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSize_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            MultiCurrencyAmountArray.meta()
                .propertySet(mock(Bean.class), "size", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'values'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            MultiCurrencyAmountArray.meta()
                .propertySet(mock(Bean.class), "values", "New Value", true));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(int, IntFunction)} with {@code int}, {@code
   * IntFunction}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Values Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given empty; then return Values Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenEmpty_thenReturnValuesEmpty() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.empty());

    // Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(3, actualOfResult.getSize());
    assertEquals(3, actualOfResult.size());
    assertTrue(actualOfResult.getValues().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(int, IntFunction)} with {@code int}, {@code
   * IntFunction}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_thenReturnValuesSizeIsOne() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(1, actualOfResult.getValues().size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    assertEquals(3, actualOfResult.getSize());
    assertEquals(3, actualOfResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(int, IntFunction)} with {@code int}, {@code
   * IntFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MultiCurrencyAmountArray.of(3, valueFunction));
    verify(valueFunction).apply(0);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ArrayList#ArrayList()} add empty.
   *   <li>Then return Size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given empty; when ArrayList() add empty; then return Size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(List)"})
  void testOfWithList_givenEmpty_whenArrayListAddEmpty_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<MultiCurrencyAmount> amounts = new ArrayList<>();
    amounts.add(MultiCurrencyAmount.empty());

    // Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(amounts);

    // Assert
    assertEquals(1, actualOfResult.getSize());
    assertEquals(1, actualOfResult.size());
    assertTrue(actualOfResult.getValues().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ArrayList#ArrayList()} add empty.
   *   <li>Then return Size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given empty; when ArrayList() add empty; then return Size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(List)"})
  void testOfWithList_givenEmpty_whenArrayListAddEmpty_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<MultiCurrencyAmount> amounts = new ArrayList<>();
    amounts.add(MultiCurrencyAmount.empty());
    amounts.add(MultiCurrencyAmount.empty());

    // Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(amounts);

    // Assert
    assertEquals(2, actualOfResult.getSize());
    assertEquals(2, actualOfResult.size());
    assertTrue(actualOfResult.getValues().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(List)"})
  void testOfWithList_thenReturnValuesSizeIsOne() {
    // Arrange
    ArrayList<MultiCurrencyAmount> amounts = new ArrayList<>();
    amounts.add(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(amounts);

    // Assert
    assertEquals(1, actualOfResult.getValues().size());
    assertEquals(1, actualOfResult.getSize());
    assertEquals(1, actualOfResult.size());
    assertEquals(1, actualOfResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(List)"})
  void testOfWithList_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Assert
    assertEquals(0, actualOfResult.getSize());
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.getValues().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@link Currency#AED}.
   *   <li>When {@link HashMap#HashMap()} {@link Currency#AED} is {@link DoubleArray}.
   *   <li>Then return Currencies size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'Map'; given AED; when HashMap() AED is DoubleArray; then return Currencies size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(Map)"})
  void testOfWithMap_givenAed_whenHashMapAedIsDoubleArray_thenReturnCurrenciesSizeIsOne() {
    // Arrange
    HashMap<Currency, DoubleArray> values = new HashMap<>();
    values.put(Currency.AED, DoubleArray.of());

    // Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(values);

    // Assert
    assertEquals(0, actualOfResult.getSize());
    assertEquals(0, actualOfResult.size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@link Currency#ARS}.
   *   <li>When {@link HashMap#HashMap()} {@link Currency#ARS} is {@link DoubleArray}.
   *   <li>Then return Currencies size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'Map'; given ARS; when HashMap() ARS is DoubleArray; then return Currencies size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(Map)"})
  void testOfWithMap_givenArs_whenHashMapArsIsDoubleArray_thenReturnCurrenciesSizeIsTwo() {
    // Arrange
    HashMap<Currency, DoubleArray> values = new HashMap<>();
    values.put(Currency.AED, DoubleArray.of());
    values.put(Currency.ARS, DoubleArray.of());

    // Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(values);

    // Assert
    assertEquals(0, actualOfResult.getSize());
    assertEquals(0, actualOfResult.size());
    assertEquals(2, actualOfResult.getCurrencies().size());
    assertEquals(values, actualOfResult.getValues());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; given filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(Map)"})
  void testOfWithMap_givenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Currency, DoubleArray> values = new HashMap<>();
    values.put(Currency.AED, DoubleArray.filled(3));
    values.put(null, DoubleArray.of());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MultiCurrencyAmountArray.of(values));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Values Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; when HashMap(); then return Values Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(Map)"})
  void testOfWithMap_whenHashMap_thenReturnValuesEmpty() {
    // Arrange and Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(new HashMap<>());

    // Assert
    assertTrue(actualOfResult.getValues().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.
   *   <li>Then return Values Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; when TreeMap(); then return Values Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(Map)"})
  void testOfWithMap_whenTreeMap_thenReturnValuesEmpty() {
    // Arrange and Act
    MultiCurrencyAmountArray actualOfResult = MultiCurrencyAmountArray.of(new TreeMap<>());

    // Assert
    assertTrue(actualOfResult.getValues().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(MultiCurrencyAmount[])} with {@code
   * MultiCurrencyAmount[]}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(MultiCurrencyAmount[])}
   */
  @Test
  @DisplayName(
      "Test of(MultiCurrencyAmount[]) with 'MultiCurrencyAmount[]'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(MultiCurrencyAmount[])"})
  void testOfWithMultiCurrencyAmount_thenReturnValuesSizeIsOne() {
    // Arrange and Act
    MultiCurrencyAmountArray actualOfResult =
        MultiCurrencyAmountArray.of(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    assertEquals(1, actualOfResult.getValues().size());
    assertEquals(1, actualOfResult.getSize());
    assertEquals(1, actualOfResult.size());
    assertEquals(1, actualOfResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#of(MultiCurrencyAmount[])} with {@code
   * MultiCurrencyAmount[]}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Values Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#of(MultiCurrencyAmount[])}
   */
  @Test
  @DisplayName(
      "Test of(MultiCurrencyAmount[]) with 'MultiCurrencyAmount[]'; when empty; then return Values Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.of(MultiCurrencyAmount[])"})
  void testOfWithMultiCurrencyAmount_whenEmpty_thenReturnValuesEmpty() {
    // Arrange and Act
    MultiCurrencyAmountArray actualOfResult =
        MultiCurrencyAmountArray.of(MultiCurrencyAmount.empty());

    // Assert
    assertEquals(1, actualOfResult.getSize());
    assertEquals(1, actualOfResult.size());
    assertTrue(actualOfResult.getValues().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#getCurrencies()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#getCurrencies()}
   */
  @Test
  @DisplayName("Test getCurrencies()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set MultiCurrencyAmountArray.getCurrencies()"})
  void testGetCurrencies() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#getValues(Currency)} with {@code Currency}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Currency#AED} is {@link DoubleArray}.
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#getValues(Currency)}
   */
  @Test
  @DisplayName(
      "Test getValues(Currency) with 'Currency'; given HashMap() AED is DoubleArray; when AED; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray MultiCurrencyAmountArray.getValues(Currency)"})
  void testGetValuesWithCurrency_givenHashMapAedIsDoubleArray_whenAed_thenReturnEmpty() {
    // Arrange
    HashMap<Currency, DoubleArray> values = new HashMap<>();
    values.put(Currency.AED, DoubleArray.of());
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(values);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, ofResult.getValues(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#getValues(Currency)} with {@code Currency}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@link Currency#ARS} is {@link DoubleArray}.
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#getValues(Currency)}
   */
  @Test
  @DisplayName(
      "Test getValues(Currency) with 'Currency'; given HashMap() ARS is DoubleArray; when AED; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray MultiCurrencyAmountArray.getValues(Currency)"})
  void testGetValuesWithCurrency_givenHashMapArsIsDoubleArray_whenAed_thenReturnEmpty() {
    // Arrange
    HashMap<Currency, DoubleArray> values = new HashMap<>();
    values.put(Currency.ARS, DoubleArray.of());
    values.put(Currency.AED, DoubleArray.of());
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(values);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, ofResult.getValues(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#getValues(Currency)} with {@code Currency}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#getValues(Currency)}
   */
  @Test
  @DisplayName("Test getValues(Currency) with 'Currency'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray MultiCurrencyAmountArray.getValues(Currency)"})
  void testGetValuesWithCurrency_thenThrowIllegalArgumentException() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getValues(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#getValues(Currency)} with {@code Currency}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#getValues(Currency)}
   */
  @Test
  @DisplayName(
      "Test getValues(Currency) with 'Currency'; when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray MultiCurrencyAmountArray.getValues(Currency)"})
  void testGetValuesWithCurrency_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getValues(null));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#get(int)}.
   *
   * <ul>
   *   <li>Given {@link MultiCurrencyAmountArray} with amounts is {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given MultiCurrencyAmountArray with amounts is ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmountArray.get(int)"})
  void testGet_givenMultiCurrencyAmountArrayWithAmountsIsArrayList_thenReturnSizeIsZero() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    MultiCurrencyAmount actualGetResult = ofResult.get(1);

    // Assert
    assertEquals(0, actualGetResult.size());
    assertTrue(actualGetResult.getAmounts().isEmpty());
    assertTrue(actualGetResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualGetResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#get(int)}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmountArray.get(int)"})
  void testGet_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange
    HashMap<Currency, DoubleArray> values = new HashMap<>();
    values.put(Currency.AED, DoubleArray.filled(3));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(values);

    // Act
    MultiCurrencyAmount actualGetResult = ofResult.get(1);

    // Assert
    Stream<CurrencyAmount> streamResult = actualGetResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    assertEquals(0.0d, getResult.getAmount());
    assertEquals(1, actualGetResult.size());
    assertEquals(1, actualGetResult.getAmounts().size());
    assertEquals(1, actualGetResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isPositive());
    assertTrue(getResult.isZero());
    CurrencyAmount actualNegatedResult = getResult.negated();
    assertEquals(getResult, actualNegatedResult);
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#stream()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MultiCurrencyAmountArray.stream()"})
  void testStream() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    Stream<MultiCurrencyAmount> actualStreamResult = ofResult.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray MultiCurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.convertedTo(Currency.AED, fxRateProvider));
    verify(fxRateProvider).fxRate(isA(Currency.class), isA(Currency.class));
    verify(valueFunction, atLeast(1)).apply(anyInt());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link IntFunction} {@link IntFunction#apply(int)} return empty.
   *   <li>Then return Values max is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given IntFunction apply(int) return empty; then return Values max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray MultiCurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_givenIntFunctionApplyReturnEmpty_thenReturnValuesMaxIsZero() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.empty());

    // Act
    CurrencyAmountArray actualConvertedToResult =
        MultiCurrencyAmountArray.of(3, valueFunction)
            .convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    DoubleArray values = actualConvertedToResult.getValues();
    assertEquals(0.0d, values.max());
    assertEquals(0.0d, values.min());
    List<Double> toListResult = values.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return Values max is one hundred.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given ten; then return Values max is one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray MultiCurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_givenTen_thenReturnValuesMaxIsOneHundred() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any())).thenReturn(10.0d);

    // Act
    CurrencyAmountArray actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, fxRateProvider);

    // Assert
    verify(fxRateProvider, atLeast(1)).fxRate(isA(Currency.class), isA(Currency.class));
    verify(valueFunction, atLeast(1)).apply(anyInt());
    DoubleArray values = actualConvertedToResult.getValues();
    assertEquals(100.0d, values.max());
    assertEquals(100.0d, values.min());
    List<Double> toListResult = values.toList();
    assertEquals(3, toListResult.size());
    assertEquals(100.0d, toListResult.get(0).doubleValue());
    assertEquals(100.0d, toListResult.get(1).doubleValue());
    assertEquals(100.0d, toListResult.get(2).doubleValue());
    assertEquals(300.0d, values.sum());
    assertArrayEquals(new double[] {100.0d, 100.0d, 100.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray MultiCurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_thenReturnSizeIsZero() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    CurrencyAmountArray actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    assertEquals(0, actualConvertedToResult.size());
    DoubleArray values = actualConvertedToResult.getValues();
    assertEquals(0, values.size());
    assertTrue(values.isEmpty());
    assertTrue(values.toList().isEmpty());
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    assertArrayEquals(new double[] {}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(MultiCurrencyAmount) with 'amount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.ARS, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualPlusResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(2, actualPlusResult.getValues().size());
    assertEquals(2, actualPlusResult.getCurrencies().size());
    assertEquals(3, actualPlusResult.getSize());
    assertEquals(3, actualPlusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(MultiCurrencyAmount) with 'amount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount2() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AUD, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualPlusResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(2, actualPlusResult.getValues().size());
    assertEquals(2, actualPlusResult.getCurrencies().size());
    assertEquals(3, actualPlusResult.getSize());
    assertEquals(3, actualPlusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(MultiCurrencyAmount) with 'amount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount3() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualPlusResult = ofResult.plus(MultiCurrencyAmount.empty());

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link IntFunction} {@link IntFunction#apply(int)} return empty.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmount) with 'amount'; given IntFunction apply(int) return empty; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount_givenIntFunctionApplyReturnEmpty_thenReturnValuesSizeIsOne() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.empty());
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualPlusResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(1, actualPlusResult.getValues().size());
    assertEquals(1, actualPlusResult.getCurrencies().size());
    assertEquals(3, actualPlusResult.getSize());
    assertEquals(3, actualPlusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return {@link MultiCurrencyAmountArray} with amounts is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmount) with 'amount'; then return MultiCurrencyAmountArray with amounts is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount_thenReturnMultiCurrencyAmountArrayWithAmountsIsArrayList() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    MultiCurrencyAmountArray actualPlusResult = ofResult.plus(MultiCurrencyAmount.empty());

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(MultiCurrencyAmount) with 'amount'; then return Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount_thenReturnSizeIsZero() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    MultiCurrencyAmountArray actualPlusResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    assertEquals(0, actualPlusResult.getSize());
    assertEquals(0, actualPlusResult.size());
    assertEquals(1, actualPlusResult.getValues().size());
    assertEquals(1, actualPlusResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(MultiCurrencyAmount) with 'amount'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount_thenReturnValuesSizeIsOne() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualPlusResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(1, actualPlusResult.getValues().size());
    assertEquals(1, actualPlusResult.getCurrencies().size());
    assertEquals(3, actualPlusResult.getSize());
    assertEquals(3, actualPlusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>When {@link MultiCurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmount) with 'amount'; when MultiCurrencyAmount with currency is AED and amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmount)"})
  void testPlusWithAmount_whenMultiCurrencyAmountWithCurrencyIsAedAndAmountIsZero() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualPlusResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 0.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmountArray)} with {@code other}.
   *
   * <ul>
   *   <li>Then return {@link MultiCurrencyAmountArray} with amounts is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmountArray)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmountArray) with 'other'; then return MultiCurrencyAmountArray with amounts is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmountArray)"
  })
  void testPlusWithOther_thenReturnMultiCurrencyAmountArrayWithAmountsIsArrayList() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    MultiCurrencyAmountArray actualPlusResult =
        ofResult.plus(MultiCurrencyAmountArray.of(new ArrayList<>()));

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmountArray)} with {@code other}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#plus(MultiCurrencyAmountArray)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmountArray) with 'other'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.plus(MultiCurrencyAmountArray)"
  })
  void testPlusWithOther_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.empty());
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.plus(MultiCurrencyAmountArray.of(new ArrayList<>())));
    verify(valueFunction, atLeast(1)).apply(anyInt());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'amount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.ARS, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualMinusResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(2, actualMinusResult.getValues().size());
    assertEquals(2, actualMinusResult.getCurrencies().size());
    assertEquals(3, actualMinusResult.getSize());
    assertEquals(3, actualMinusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'amount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount2() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AUD, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualMinusResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(2, actualMinusResult.getValues().size());
    assertEquals(2, actualMinusResult.getCurrencies().size());
    assertEquals(3, actualMinusResult.getSize());
    assertEquals(3, actualMinusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'amount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount3() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualMinusResult = ofResult.minus(MultiCurrencyAmount.empty());

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(ofResult, actualMinusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Given {@link IntFunction} {@link IntFunction#apply(int)} return empty.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(MultiCurrencyAmount) with 'amount'; given IntFunction apply(int) return empty; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount_givenIntFunctionApplyReturnEmpty_thenReturnValuesSizeIsOne() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.empty());
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualMinusResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(1, actualMinusResult.getValues().size());
    assertEquals(1, actualMinusResult.getCurrencies().size());
    assertEquals(3, actualMinusResult.getSize());
    assertEquals(3, actualMinusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return {@link MultiCurrencyAmountArray} with amounts is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(MultiCurrencyAmount) with 'amount'; then return MultiCurrencyAmountArray with amounts is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount_thenReturnMultiCurrencyAmountArrayWithAmountsIsArrayList() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    MultiCurrencyAmountArray actualMinusResult = ofResult.minus(MultiCurrencyAmount.empty());

    // Assert
    assertEquals(ofResult, actualMinusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'amount'; then return Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount_thenReturnSizeIsZero() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    MultiCurrencyAmountArray actualMinusResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    assertEquals(0, actualMinusResult.getSize());
    assertEquals(0, actualMinusResult.size());
    assertEquals(1, actualMinusResult.getValues().size());
    assertEquals(1, actualMinusResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'amount'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount_thenReturnValuesSizeIsOne() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualMinusResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(1, actualMinusResult.getValues().size());
    assertEquals(1, actualMinusResult.getCurrencies().size());
    assertEquals(3, actualMinusResult.getSize());
    assertEquals(3, actualMinusResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>When {@link MultiCurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(MultiCurrencyAmount) with 'amount'; when MultiCurrencyAmount with currency is AED and amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmount)"
  })
  void testMinusWithAmount_whenMultiCurrencyAmountWithCurrencyIsAedAndAmountIsZero() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.of(Currency.AED, 10.0d));
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act
    MultiCurrencyAmountArray actualMinusResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 0.0d));

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals(ofResult, actualMinusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmountArray)} with {@code other}.
   *
   * <ul>
   *   <li>Then return {@link MultiCurrencyAmountArray} with amounts is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmountArray)}
   */
  @Test
  @DisplayName(
      "Test minus(MultiCurrencyAmountArray) with 'other'; then return MultiCurrencyAmountArray with amounts is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmountArray)"
  })
  void testMinusWithOther_thenReturnMultiCurrencyAmountArrayWithAmountsIsArrayList() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    MultiCurrencyAmountArray actualMinusResult =
        ofResult.minus(MultiCurrencyAmountArray.of(new ArrayList<>()));

    // Assert
    assertEquals(ofResult, actualMinusResult);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmountArray)} with {@code other}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#minus(MultiCurrencyAmountArray)}
   */
  @Test
  @DisplayName(
      "Test minus(MultiCurrencyAmountArray) with 'other'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmountArray MultiCurrencyAmountArray.minus(MultiCurrencyAmountArray)"
  })
  void testMinusWithOther_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.empty());
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.minus(MultiCurrencyAmountArray.of(new ArrayList<>())));
    verify(valueFunction, atLeast(1)).apply(anyInt());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#total(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>When {@link ArrayList#ArrayList()} addAll {@link ArrayList#ArrayList()}.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#total(Iterable)}
   */
  @Test
  @DisplayName(
      "Test total(Iterable); given ArrayList(); when ArrayList() addAll ArrayList(); then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.total(Iterable)"})
  void testTotal_givenArrayList_whenArrayListAddAllArrayList_thenReturnValuesSizeIsOne() {
    // Arrange
    ArrayList<CurrencyAmountArray> arrays = new ArrayList<>();
    arrays.addAll(new ArrayList<>());
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));

    // Act
    MultiCurrencyAmountArray actualTotalResult = MultiCurrencyAmountArray.total(arrays);

    // Assert
    assertEquals(0, actualTotalResult.getSize());
    assertEquals(0, actualTotalResult.size());
    assertEquals(1, actualTotalResult.getValues().size());
    assertEquals(1, actualTotalResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#total(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmountArray} with currency is {@link Currency#ARS} and values is
   *       {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#total(Iterable)}
   */
  @Test
  @DisplayName(
      "Test total(Iterable); given CurrencyAmountArray with currency is ARS and values is DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.total(Iterable)"})
  void testTotal_givenCurrencyAmountArrayWithCurrencyIsArsAndValuesIsDoubleArray() {
    // Arrange
    ArrayList<CurrencyAmountArray> arrays = new ArrayList<>();
    arrays.add(CurrencyAmountArray.of(Currency.ARS, DoubleArray.of()));
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));

    // Act
    MultiCurrencyAmountArray actualTotalResult = MultiCurrencyAmountArray.total(arrays);

    // Assert
    assertEquals(0, actualTotalResult.getSize());
    assertEquals(0, actualTotalResult.size());
    assertEquals(2, actualTotalResult.getValues().size());
    assertEquals(2, actualTotalResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#total(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmountArray} with currency is {@link Currency#AUD} and values is
   *       {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#total(Iterable)}
   */
  @Test
  @DisplayName(
      "Test total(Iterable); given CurrencyAmountArray with currency is AUD and values is DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.total(Iterable)"})
  void testTotal_givenCurrencyAmountArrayWithCurrencyIsAudAndValuesIsDoubleArray() {
    // Arrange
    ArrayList<CurrencyAmountArray> arrays = new ArrayList<>();
    arrays.add(CurrencyAmountArray.of(Currency.AUD, DoubleArray.of()));
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));

    // Act
    MultiCurrencyAmountArray actualTotalResult = MultiCurrencyAmountArray.total(arrays);

    // Assert
    assertEquals(0, actualTotalResult.getSize());
    assertEquals(0, actualTotalResult.size());
    assertEquals(2, actualTotalResult.getValues().size());
    assertEquals(2, actualTotalResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#total(Iterable)}.
   *
   * <ul>
   *   <li>Then return Size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#total(Iterable)}
   */
  @Test
  @DisplayName("Test total(Iterable); then return Size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.total(Iterable)"})
  void testTotal_thenReturnSizeIsThree() {
    // Arrange
    ArrayList<CurrencyAmountArray> arrays = new ArrayList<>();
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.filled(3)));
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.filled(3)));

    // Act
    MultiCurrencyAmountArray actualTotalResult = MultiCurrencyAmountArray.total(arrays);

    // Assert
    assertEquals(1, actualTotalResult.getValues().size());
    assertEquals(1, actualTotalResult.getCurrencies().size());
    assertEquals(3, actualTotalResult.getSize());
    assertEquals(3, actualTotalResult.size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#total(Iterable)}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#total(Iterable)}
   */
  @Test
  @DisplayName("Test total(Iterable); then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.total(Iterable)"})
  void testTotal_thenReturnValuesSizeIsOne() {
    // Arrange
    ArrayList<CurrencyAmountArray> arrays = new ArrayList<>();
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));

    // Act
    MultiCurrencyAmountArray actualTotalResult = MultiCurrencyAmountArray.total(arrays);

    // Assert
    assertEquals(0, actualTotalResult.getSize());
    assertEquals(0, actualTotalResult.size());
    assertEquals(1, actualTotalResult.getValues().size());
    assertEquals(1, actualTotalResult.getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#total(Iterable)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#total(Iterable)}
   */
  @Test
  @DisplayName("Test total(Iterable); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.total(Iterable)"})
  void testTotal_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<CurrencyAmountArray> arrays = new ArrayList<>();
    arrays.add(CurrencyAmountArray.of(Currency.ARS, DoubleArray.filled(3)));
    arrays.add(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> MultiCurrencyAmountArray.total(arrays));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#total(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Values Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#total(Iterable)}
   */
  @Test
  @DisplayName("Test total(Iterable); when ArrayList(); then return Values Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmountArray MultiCurrencyAmountArray.total(Iterable)"})
  void testTotal_whenArrayList_thenReturnValuesEmpty() {
    // Arrange and Act
    MultiCurrencyAmountArray actualTotalResult = MultiCurrencyAmountArray.total(new ArrayList<>());

    // Assert
    assertEquals(0, actualTotalResult.getSize());
    assertEquals(0, actualTotalResult.size());
    assertTrue(actualTotalResult.getValues().isEmpty());
    assertTrue(actualTotalResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#meta()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MultiCurrencyAmountArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = MultiCurrencyAmountArray.meta();

    // Assert
    MetaProperty<Integer> sizeResult = actualMetaResult.size();
    assertTrue(sizeResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableSortedMap<Currency, DoubleArray>> valuesResult =
        actualMetaResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("int", sizeResult.propertyType().getName());
    assertEquals("size", sizeResult.name());
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sizeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableSortedMap> expectedPropertyTypeResult = ImmutableSortedMap.class;
    assertEquals(expectedPropertyTypeResult, valuesResult.propertyType());
    Class<MultiCurrencyAmountArray> expectedDeclaringTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, sizeResult.declaringType());
    Class<MultiCurrencyAmountArray> expectedDeclaringTypeResult2 = MultiCurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult2, valuesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, sizeResult.metaBean());
    assertSame(meta, valuesResult.metaBean());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#metaBean()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MultiCurrencyAmountArray.metaBean()"})
  void testMetaBean() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiCurrencyAmountArray#toString()}
   *   <li>{@link MultiCurrencyAmountArray#getSize()}
   *   <li>{@link MultiCurrencyAmountArray#getValues()}
   *   <li>{@link MultiCurrencyAmountArray#size()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int MultiCurrencyAmountArray.getSize()",
    "ImmutableSortedMap MultiCurrencyAmountArray.getValues()",
    "int MultiCurrencyAmountArray.size()",
    "String MultiCurrencyAmountArray.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act
    String actualToStringResult = ofResult.toString();
    int actualSize = ofResult.getSize();
    ImmutableSortedMap<Currency, DoubleArray> actualValues = ofResult.getValues();

    // Assert
    assertEquals("MultiCurrencyAmountArray{size=0, values={}}", actualToStringResult);
    assertEquals(0, actualSize);
    assertEquals(0, ofResult.size());
    assertTrue(actualValues.isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#equals(Object)}, and {@link
   * MultiCurrencyAmountArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiCurrencyAmountArray#equals(Object)}
   *   <li>{@link MultiCurrencyAmountArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmountArray.equals(Object)",
    "int MultiCurrencyAmountArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());
    MultiCurrencyAmountArray ofResult2 = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#equals(Object)}, and {@link
   * MultiCurrencyAmountArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiCurrencyAmountArray#equals(Object)}
   *   <li>{@link MultiCurrencyAmountArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmountArray.equals(Object)",
    "int MultiCurrencyAmountArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link MultiCurrencyAmountArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmountArray.equals(Object)",
    "int MultiCurrencyAmountArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IntFunction<MultiCurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(MultiCurrencyAmount.empty());
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(3, valueFunction);

    // Act and Assert
    assertNotEquals(ofResult, MultiCurrencyAmountArray.of(new ArrayList<>()));
  }

  /**
   * Test {@link MultiCurrencyAmountArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmountArray.equals(Object)",
    "int MultiCurrencyAmountArray.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link MultiCurrencyAmountArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmountArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmountArray.equals(Object)",
    "int MultiCurrencyAmountArray.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    MultiCurrencyAmountArray ofResult = MultiCurrencyAmountArray.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to MultiCurrencyAmountArray");
  }
}
