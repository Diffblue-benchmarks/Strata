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
import com.opengamma.strata.basics.currency.CurrencyAmountArray.Meta;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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

class CurrencyAmountArrayDiffblueTest {
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
    Class<? extends CurrencyAmountArray> actualBeanTypeResult =
        CurrencyAmountArray.meta().beanType();

    // Assert
    Class<CurrencyAmountArray> expectedBeanTypeResult = CurrencyAmountArray.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#values()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.currency()", "MetaProperty Meta.values()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CurrencyAmountArray.meta();

    // Act
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();

    // Assert
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(metaResult.values() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then metaBean values return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'currency'; then metaBean values return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenMetaBeanValuesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyAmountArray.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> valuesResult = ((Meta) metaBeanResult).values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CurrencyAmountArray> expectedDeclaringTypeResult = CurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, valuesResult.declaringType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, valuesResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(Meta.INSTANCE, valuesResult.metaBean());
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
    assertNull(CurrencyAmountArray.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code values}.
   *   <li>Then metaBean currency return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'values'; then metaBean currency return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValues_thenMetaBeanCurrencyReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurrencyAmountArray.meta().metaPropertyGet("values");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("currency", currencyResult.name());
    assertEquals("values", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyResult.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, currencyResult.propertyType());
    Class<CurrencyAmountArray> expectedDeclaringTypeResult = CurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, currencyResult.declaringType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).values());
    assertSame(Meta.INSTANCE, currencyResult.metaBean());
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
        CurrencyAmountArray.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("currency");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("values");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("currency", getResult.name());
    assertEquals("values", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<CurrencyAmountArray> expectedDeclaringTypeResult = CurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CurrencyAmountArray> expectedDeclaringTypeResult2 = CurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = CurrencyAmountArray.meta();
    CurrencyAmountArray bean = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "currency", true);

    // Assert
    Currency currency = ((Currency) actualPropertyGetResult).AED;
    assertSame(currency, bean.getCurrency());
    assertSame(currency, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet2() {
    // Arrange
    Meta metaResult = CurrencyAmountArray.meta();
    CurrencyAmountArray bean = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "values", true);

    // Assert
    DoubleArray doubleArray = ((DoubleArray) actualPropertyGetResult).EMPTY;
    assertSame(doubleArray, bean.getValues());
    assertSame(doubleArray, actualPropertyGetResult);
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
    assertNull(CurrencyAmountArray.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> CurrencyAmountArray.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurrencyAmountArray.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
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
            CurrencyAmountArray.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", false));
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
            CurrencyAmountArray.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
            CurrencyAmountArray.meta().propertySet(mock(Bean.class), "values", "New Value", true));
  }

  /**
   * Test {@link CurrencyAmountArray#of(List)} with {@code amounts}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'amounts'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.of(List)"})
  void testOfWithAmounts() {
    // Arrange
    ArrayList<CurrencyAmount> amounts = new ArrayList<>();
    Currency currency = new Currency("currency", 1, "GBP");
    amounts.add(CurrencyAmount.of(currency, 10.0d));
    amounts.add(CurrencyAmount.of(new Currency("currency", 1, "GBP"), 10.0d));

    // Act
    CurrencyAmountArray actualOfResult = CurrencyAmountArray.of(amounts);

    // Assert
    assertSame(currency, actualOfResult.getCurrency());
    assertArrayEquals(new double[] {10.0d, 10.0d}, actualOfResult.getValues().toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#of(List)} with {@code amounts}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'amounts'; given ArrayList(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.of(List)"})
  void testOfWithAmounts_givenArrayList_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<CurrencyAmount> amounts = new ArrayList<>();
    amounts.addAll(new ArrayList<>());
    amounts.add(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    CurrencyAmountArray actualOfResult = CurrencyAmountArray.of(amounts);

    // Assert
    assertEquals(1, actualOfResult.size());
    DoubleArray values = actualOfResult.getValues();
    assertEquals(1, values.size());
    assertEquals(1, values.toList().size());
    assertEquals(10.0d, values.sum());
    assertArrayEquals(new double[] {10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#of(List)} with {@code amounts}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'amounts'; then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.of(List)"})
  void testOfWithAmounts_thenReturnCurrencyCodeIsAed() {
    // Arrange
    ArrayList<CurrencyAmount> amounts = new ArrayList<>();
    amounts.add(CurrencyAmount.of(Currency.AED, 10.0d));
    amounts.add(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    CurrencyAmountArray actualOfResult = CurrencyAmountArray.of(amounts);

    // Assert
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    Currency triangulationCurrency = currency.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    DoubleArray values = actualOfResult.getValues();
    List<Double> toListResult = values.toList();
    assertEquals(2, toListResult.size());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(2, currency.getMinorUnitDigits());
    assertEquals(2, actualOfResult.size());
    assertEquals(2, values.size());
    assertEquals(20.0d, values.sum());
    assertSame(
        triangulationCurrency.getTriangulationCurrency(),
        triangulationCurrency.getTriangulationCurrency());
    assertArrayEquals(new double[] {10.0d, 10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#of(Currency, DoubleArray)} with {@code currency}, {@code
   * values}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#of(Currency, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, DoubleArray) with 'currency', 'values'; when DoubleArray; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.of(Currency, DoubleArray)"})
  void testOfWithCurrencyValues_whenDoubleArray_thenReturnSizeIsZero() {
    // Arrange and Act
    CurrencyAmountArray actualOfResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Assert
    assertEquals(0, actualOfResult.size());
    assertSame(Currency.AED, actualOfResult.getCurrency());
    assertSame(DoubleArray.EMPTY, actualOfResult.getValues());
  }

  /**
   * Test {@link CurrencyAmountArray#of(int, IntFunction)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'size', 'valueFunction'; then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.of(int, IntFunction)"})
  void testOfWithSizeValueFunction_thenReturnCurrencyCodeIsAed() {
    // Arrange
    IntFunction<CurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    CurrencyAmountArray actualOfResult = CurrencyAmountArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    Currency currency = actualOfResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    DoubleArray values = actualOfResult.getValues();
    assertEquals(1, values.dimensions());
    assertEquals(10.0d, values.max());
    assertEquals(10.0d, values.min());
    assertEquals(2, currency.getMinorUnitDigits());
    assertEquals(3, actualOfResult.size());
    assertEquals(3, values.size());
    assertEquals(3, values.toList().size());
    assertEquals(30.0d, values.sum());
    assertFalse(values.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#of(int, IntFunction)} with {@code size}, {@code valueFunction}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'size', 'valueFunction'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.of(int, IntFunction)"})
  void testOfWithSizeValueFunction_thenThrowIllegalArgumentException() {
    // Arrange
    IntFunction<CurrencyAmount> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CurrencyAmountArray.of(3, valueFunction));
    verify(valueFunction).apply(0);
  }

  /**
   * Test {@link CurrencyAmountArray#size()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#size()}
   */
  @Test
  @DisplayName("Test size(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyAmountArray.size()"})
  void testSize_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, CurrencyAmountArray.of(Currency.AED, DoubleArray.of()).size());
  }

  /**
   * Test {@link CurrencyAmountArray#get(int)}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmountArray.get(int)"})
  void testGet_thenReturnCurrencyCodeIsAed() {
    // Arrange and Act
    CurrencyAmount actualGetResult =
        CurrencyAmountArray.of(Currency.AED, DoubleArray.filled(3)).get(1);

    // Assert
    Currency currency = actualGetResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(0.0d, actualGetResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(actualGetResult.isNegative());
    assertFalse(actualGetResult.isPositive());
    assertTrue(actualGetResult.isZero());
    CurrencyAmount actualNegatedResult = actualGetResult.negated();
    assertEquals(actualGetResult, actualNegatedResult);
    CurrencyAmount actualNegativeResult = actualGetResult.negative();
    assertSame(actualGetResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualGetResult.positive();
    assertSame(actualGetResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmountArray#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream CurrencyAmountArray.stream()"})
  void testStream_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Stream<CurrencyAmount> actualStreamResult =
        CurrencyAmountArray.of(Currency.AED, DoubleArray.of()).stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray CurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    CurrencyAmountArray actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray CurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.of());

    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.convertedTo(Currency.AED, fxRateProvider));
    verify(fxRateProvider).fxRate(isA(Currency.class), isA(Currency.class));
  }

  /**
   * Test {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return Values is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider); given one; then return Values is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray CurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_givenOne_thenReturnValuesIsEmpty() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.of());

    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any())).thenReturn(1.0d);

    // Act
    CurrencyAmountArray actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, fxRateProvider);

    // Assert
    verify(fxRateProvider).fxRate(isA(Currency.class), isA(Currency.class));
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    DoubleArray values = actualConvertedToResult.getValues();
    assertSame(DoubleArray.EMPTY, values);
    assertArrayEquals(new double[] {}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return Values toArrayUnsafe is empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given ten; then return Values toArrayUnsafe is empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray CurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_givenTen_thenReturnValuesToArrayUnsafeIsEmptyArrayOfDouble() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.of());

    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any())).thenReturn(10.0d);

    // Act
    CurrencyAmountArray actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, fxRateProvider);

    // Assert
    verify(fxRateProvider).fxRate(isA(Currency.class), isA(Currency.class));
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    assertArrayEquals(new double[] {}, actualConvertedToResult.getValues().toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider); then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmountArray CurrencyAmountArray.convertedTo(Currency, FxRateProvider)"
  })
  void testConvertedTo_thenReturnSizeIsThree() {
    // Arrange
    DoubleArray values = DoubleArray.filled(3);
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, values);

    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    when(fxRateProvider.fxRate(Mockito.<Currency>any(), Mockito.<Currency>any())).thenReturn(10.0d);

    // Act
    CurrencyAmountArray actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, fxRateProvider);

    // Assert
    verify(fxRateProvider).fxRate(isA(Currency.class), isA(Currency.class));
    assertEquals(3, actualConvertedToResult.size());
    assertEquals(values, actualConvertedToResult.getValues());
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link CurrencyAmountArray#plus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmount) with 'amount'; then return Values is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.plus(CurrencyAmount)"})
  void testPlusWithAmount_thenReturnValuesIsEmpty() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    CurrencyAmountArray actualPlusResult = ofResult.plus(CurrencyAmount.of(Currency.AED, 0.0d));

    // Assert
    assertSame(
        actualPlusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualPlusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    DoubleArray values = actualPlusResult.getValues();
    assertSame(DoubleArray.EMPTY, values);
    assertArrayEquals(new double[] {}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#plus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values max is ten.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmount) with 'amount'; then return Values max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.plus(CurrencyAmount)"})
  void testPlusWithAmount_thenReturnValuesMaxIsTen() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.filled(3));

    // Act
    CurrencyAmountArray actualPlusResult = ofResult.plus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    DoubleArray values = actualPlusResult.getValues();
    assertEquals(10.0d, values.max());
    assertEquals(10.0d, values.min());
    List<Double> toListResult = values.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualPlusResult.size());
    assertEquals(3, values.size());
    assertEquals(30.0d, values.sum());
    assertFalse(values.isEmpty());
    assertSame(
        actualPlusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualPlusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#plus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values toArrayUnsafe is empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(CurrencyAmount) with 'amount'; then return Values toArrayUnsafe is empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.plus(CurrencyAmount)"})
  void testPlusWithAmount_thenReturnValuesToArrayUnsafeIsEmptyArrayOfDouble() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    CurrencyAmountArray actualPlusResult = ofResult.plus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    assertSame(
        actualPlusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualPlusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    assertArrayEquals(new double[] {}, actualPlusResult.getValues().toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#plus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmount) with 'amount'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.plus(CurrencyAmount)"})
  void testPlusWithAmount_thenThrowIllegalArgumentException() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.plus(CurrencyAmount.of(Currency.AED, 10.0d)));
  }

  /**
   * Test {@link CurrencyAmountArray#plus(CurrencyAmountArray)} with {@code other}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#plus(CurrencyAmountArray)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmountArray) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.plus(CurrencyAmountArray)"})
  void testPlusWithOther() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.plus(CurrencyAmountArray.of(Currency.AED, DoubleArray.of())));
  }

  /**
   * Test {@link CurrencyAmountArray#plus(CurrencyAmountArray)} with {@code other}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#plus(CurrencyAmountArray)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmountArray) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.plus(CurrencyAmountArray)"})
  void testPlusWithOther2() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    CurrencyAmountArray actualPlusResult =
        ofResult.plus(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link CurrencyAmountArray#plus(CurrencyAmountArray)} with {@code other}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#plus(CurrencyAmountArray)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmountArray) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.plus(CurrencyAmountArray)"})
  void testPlusWithOther3() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.plus(CurrencyAmountArray.of(Currency.AED, DoubleArray.of())));
  }

  /**
   * Test {@link CurrencyAmountArray#minus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmount) with 'amount'; then return Values is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.minus(CurrencyAmount)"})
  void testMinusWithAmount_thenReturnValuesIsEmpty() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    CurrencyAmountArray actualMinusResult = ofResult.minus(CurrencyAmount.of(Currency.AED, 0.0d));

    // Assert
    assertSame(
        actualMinusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualMinusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    DoubleArray values = actualMinusResult.getValues();
    assertSame(DoubleArray.EMPTY, values);
    assertArrayEquals(new double[] {}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#minus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values max is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmount) with 'amount'; then return Values max is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.minus(CurrencyAmount)"})
  void testMinusWithAmount_thenReturnValuesMaxIsMinusTen() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.filled(3));

    // Act
    CurrencyAmountArray actualMinusResult = ofResult.minus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    DoubleArray values = actualMinusResult.getValues();
    assertEquals(-10.0d, values.max());
    assertEquals(-10.0d, values.min());
    List<Double> toListResult = values.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-10.0d, toListResult.get(0).doubleValue());
    assertEquals(-10.0d, toListResult.get(1).doubleValue());
    assertEquals(-10.0d, toListResult.get(2).doubleValue());
    assertEquals(-30.0d, values.sum());
    assertEquals(3, actualMinusResult.size());
    assertEquals(3, values.size());
    assertFalse(values.isEmpty());
    assertSame(
        actualMinusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualMinusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    assertArrayEquals(new double[] {-10.0d, -10.0d, -10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#minus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then return Values toArrayUnsafe is empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(CurrencyAmount) with 'amount'; then return Values toArrayUnsafe is empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.minus(CurrencyAmount)"})
  void testMinusWithAmount_thenReturnValuesToArrayUnsafeIsEmptyArrayOfDouble() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    CurrencyAmountArray actualMinusResult = ofResult.minus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    assertSame(
        actualMinusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualMinusResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    assertArrayEquals(new double[] {}, actualMinusResult.getValues().toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CurrencyAmountArray#minus(CurrencyAmount)} with {@code amount}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmount) with 'amount'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.minus(CurrencyAmount)"})
  void testMinusWithAmount_thenThrowIllegalArgumentException() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.minus(CurrencyAmount.of(Currency.AED, 10.0d)));
  }

  /**
   * Test {@link CurrencyAmountArray#minus(CurrencyAmountArray)} with {@code other}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#minus(CurrencyAmountArray)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmountArray) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.minus(CurrencyAmountArray)"})
  void testMinusWithOther() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.minus(CurrencyAmountArray.of(Currency.AED, DoubleArray.of())));
  }

  /**
   * Test {@link CurrencyAmountArray#minus(CurrencyAmountArray)} with {@code other}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#minus(CurrencyAmountArray)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmountArray) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.minus(CurrencyAmountArray)"})
  void testMinusWithOther2() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.AED, DoubleArray.of());

    // Act
    CurrencyAmountArray actualMinusResult =
        ofResult.minus(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()));

    // Assert
    assertEquals(ofResult, actualMinusResult);
  }

  /**
   * Test {@link CurrencyAmountArray#minus(CurrencyAmountArray)} with {@code other}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#minus(CurrencyAmountArray)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmountArray) with 'other'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmountArray CurrencyAmountArray.minus(CurrencyAmountArray)"})
  void testMinusWithOther3() {
    // Arrange
    CurrencyAmountArray ofResult = CurrencyAmountArray.of(Currency.ARS, DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.minus(CurrencyAmountArray.of(Currency.AED, DoubleArray.of())));
  }

  /**
   * Test {@link CurrencyAmountArray#meta()}.
   *
   * <p>Method under test: {@link CurrencyAmountArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurrencyAmountArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurrencyAmountArray.meta();

    // Assert
    MetaProperty<Currency> currencyResult = actualMetaResult.currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> valuesResult = actualMetaResult.values();
    assertTrue(valuesResult instanceof DirectMetaProperty);
    assertEquals("currency", currencyResult.name());
    assertEquals("values", valuesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, currencyResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, currencyResult.propertyType());
    Class<CurrencyAmountArray> expectedDeclaringTypeResult = CurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult, currencyResult.declaringType());
    Class<CurrencyAmountArray> expectedDeclaringTypeResult2 = CurrencyAmountArray.class;
    assertEquals(expectedDeclaringTypeResult2, valuesResult.declaringType());
    Class<DoubleArray> expectedPropertyTypeResult2 = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult2, valuesResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, currencyResult.metaBean());
    assertSame(meta, valuesResult.metaBean());
  }

  /**
   * Test {@link CurrencyAmountArray#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurrencyAmountArray.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, CurrencyAmountArray.of(Currency.AED, DoubleArray.of()).metaBean());
  }

  /**
   * Test {@link CurrencyAmountArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmountArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurrencyAmountArray.equals(Object)",
    "int CurrencyAmountArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurrencyAmountArray.of(Currency.AED, DoubleArray.of()), "Obj");
  }
}
