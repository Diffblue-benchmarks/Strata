package com.opengamma.strata.basics.currency;

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
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSortedSet;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount.Meta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MultiCurrencyAmountDiffblueTest {
  /**
   * Test {@link MultiCurrencyAmount#empty()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.empty()"})
  void testEmpty() {
    // Arrange and Act
    MultiCurrencyAmount actualEmptyResult = MultiCurrencyAmount.empty();

    // Assert
    assertEquals(0, actualEmptyResult.size());
    assertTrue(actualEmptyResult.getAmounts().isEmpty());
    assertTrue(actualEmptyResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualEmptyResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test Meta {@link Meta#amounts()}.
   *
   * <p>Method under test: {@link Meta#amounts()}
   */
  @Test
  @DisplayName("Test Meta amounts()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.amounts()"})
  void testMetaAmounts() {
    // Arrange, Act and Assert
    assertTrue(MultiCurrencyAmount.meta().amounts() instanceof DirectMetaProperty);
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
    Class<? extends MultiCurrencyAmount> actualBeanTypeResult =
        MultiCurrencyAmount.meta().beanType();

    // Assert
    Class<MultiCurrencyAmount> expectedBeanTypeResult = MultiCurrencyAmount.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code amounts}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'amounts'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAmounts_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        MultiCurrencyAmount.meta().metaPropertyGet("amounts");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("amounts", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableSortedSet> expectedPropertyTypeResult = ImmutableSortedSet.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<MultiCurrencyAmount> expectedDeclaringTypeResult = MultiCurrencyAmount.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    assertNull(MultiCurrencyAmount.meta().metaPropertyGet("Property Name"));
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
        MultiCurrencyAmount.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("amounts");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("amounts", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableSortedSet> expectedPropertyTypeResult = ImmutableSortedSet.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<MultiCurrencyAmount> expectedDeclaringTypeResult = MultiCurrencyAmount.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    assertNull(MultiCurrencyAmount.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@link Set}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when empty; then return Set")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenReturnSet() {
    // Arrange
    Meta metaResult = MultiCurrencyAmount.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MultiCurrencyAmount.empty(), "amounts", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Set);
    assertTrue(((Set<Object>) actualPropertyGetResult).isEmpty());
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
    Meta metaResult = MultiCurrencyAmount.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(MultiCurrencyAmount.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code amounts}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'amounts'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAmounts_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            MultiCurrencyAmount.meta().propertySet(mock(Bean.class), "amounts", "New Value", true));
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
            MultiCurrencyAmount.meta()
                .propertySet(mock(Bean.class), "amounts", "New Value", false));
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
            MultiCurrencyAmount.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link MultiCurrencyAmount#of(CurrencyAmount[])} with {@code CurrencyAmount[]}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(CurrencyAmount[])}
   */
  @Test
  @DisplayName("Test of(CurrencyAmount[]) with 'CurrencyAmount[]'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(CurrencyAmount[])"})
  void testOfWithCurrencyAmount_thenReturnSizeIsOne() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(ofResult);

    // Assert
    assertEquals(1, actualOfResult.size());
    assertEquals(1, actualOfResult.getAmounts().size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertSame(ofResult, collectResult.get(0));
  }

  /**
   * Test {@link MultiCurrencyAmount#of(CurrencyAmount[])} with {@code CurrencyAmount[]}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(CurrencyAmount[])}
   */
  @Test
  @DisplayName("Test of(CurrencyAmount[]) with 'CurrencyAmount[]'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(CurrencyAmount[])"})
  void testOfWithCurrencyAmount_thenReturnSizeIsZero() {
    // Arrange and Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of();

    // Assert
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.getAmounts().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when AED; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(Currency, double)"})
  void testOfWithCurrencyDouble_whenAed_thenReturnSizeIsOne() {
    // Arrange and Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Assert
    assertEquals(1, actualOfResult.size());
    assertEquals(1, actualOfResult.getAmounts().size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    assertEquals(10.0d, getResult.getAmount());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
    assertSame(Currency.AED, getResult.getCurrency());
  }

  /**
   * Test {@link MultiCurrencyAmount#of(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(Iterable)}
   */
  @Test
  @DisplayName("Test of(Iterable) with 'Iterable'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(Iterable)"})
  void testOfWithIterable_thenReturnSizeIsOne() {
    // Arrange
    LinkedHashSet<CurrencyAmount> amounts = new LinkedHashSet<>();
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);
    amounts.add(ofResult);

    // Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(amounts);

    // Assert
    assertEquals(1, actualOfResult.size());
    assertEquals(1, actualOfResult.getAmounts().size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertSame(ofResult, collectResult.get(0));
  }

  /**
   * Test {@link MultiCurrencyAmount#of(Iterable)} with {@code Iterable}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(Iterable)}
   */
  @Test
  @DisplayName("Test of(Iterable) with 'Iterable'; when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(Iterable)"})
  void testOfWithIterable_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(new ArrayList<>());

    // Assert
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.getAmounts().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@link Currency#ARS}.
   *   <li>When {@link HashMap#HashMap()} {@link Currency#ARS} is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; given ARS; when HashMap() ARS is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(Map)"})
  void testOfWithMap_givenArs_whenHashMapArsIs05() {
    // Arrange
    BiFunction<Currency, Double, Double> biFunction = mock(BiFunction.class);
    when(biFunction.apply(Mockito.<Currency>any(), Mockito.<Double>any())).thenReturn(10.0d);

    HashMap<Currency, Double> map = new HashMap<>();
    map.put(Currency.ARS, 0.5d);
    map.put(Currency.AED, 0.5d);
    map.replaceAll(biFunction);

    // Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(map);

    // Assert
    verify(biFunction, atLeast(1)).apply(Mockito.<Currency>any(), eq(0.5d));
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualOfResult.size());
    assertEquals(2, actualOfResult.getAmounts().size());
    assertEquals(2, actualOfResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@link Currency#BGN}.
   *   <li>When {@link HashMap#HashMap()} {@link Currency#BGN} is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; given BGN; when HashMap() BGN is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(Map)"})
  void testOfWithMap_givenBgn_whenHashMapBgnIs05() {
    // Arrange
    BiFunction<Currency, Double, Double> biFunction = mock(BiFunction.class);
    when(biFunction.apply(Mockito.<Currency>any(), Mockito.<Double>any())).thenReturn(10.0d);

    HashMap<Currency, Double> map = new HashMap<>();
    map.put(Currency.BGN, 0.5d);
    map.put(Currency.AED, 0.5d);
    map.replaceAll(biFunction);

    // Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(map);

    // Assert
    verify(biFunction, atLeast(1)).apply(Mockito.<Currency>any(), eq(0.5d));
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualOfResult.size());
    assertEquals(2, actualOfResult.getAmounts().size());
    assertEquals(2, actualOfResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link HashMap#HashMap()} {@link Currency#AED} is ten.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'Map'; given ten; when HashMap() AED is ten; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(Map)"})
  void testOfWithMap_givenTen_whenHashMapAedIsTen_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Currency, Double> map = new HashMap<>();
    map.put(Currency.AED, 10.0d);

    // Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(map);

    // Assert
    assertEquals(1, actualOfResult.size());
    assertEquals(1, actualOfResult.getAmounts().size());
    assertEquals(1, actualOfResult.getCurrencies().size());
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
  }

  /**
   * Test {@link MultiCurrencyAmount#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; when HashMap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.of(Map)"})
  void testOfWithMap_whenHashMap_thenReturnSizeIsZero() {
    // Arrange and Act
    MultiCurrencyAmount actualOfResult = MultiCurrencyAmount.of(new HashMap<>());

    // Assert
    assertEquals(0, actualOfResult.size());
    assertTrue(actualOfResult.getAmounts().isEmpty());
    assertTrue(actualOfResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#total(Iterable)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#ARS} and amount is ten.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#total(Iterable)}
   */
  @Test
  @DisplayName(
      "Test total(Iterable); given CurrencyAmount with currency is ARS and amount is ten; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.total(Iterable)"})
  void testTotal_givenCurrencyAmountWithCurrencyIsArsAndAmountIsTen_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<CurrencyAmount> amounts = new ArrayList<>();
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.ARS, 10.0d);
    amounts.add(ofResult);
    amounts.add(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    MultiCurrencyAmount actualTotalResult = MultiCurrencyAmount.total(amounts);

    // Assert
    assertEquals(2, actualTotalResult.size());
    assertEquals(2, actualTotalResult.getAmounts().size());
    assertEquals(2, actualTotalResult.getCurrencies().size());
    Stream<CurrencyAmount> streamResult = actualTotalResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertSame(ofResult, collectResult.get(1));
  }

  /**
   * Test {@link MultiCurrencyAmount#total(Iterable)}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList first negated Amount is minus twenty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#total(Iterable)}
   */
  @Test
  @DisplayName(
      "Test total(Iterable); then return stream limit five collect toList first negated Amount is minus twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.total(Iterable)"})
  void testTotal_thenReturnStreamLimitFiveCollectToListFirstNegatedAmountIsMinusTwenty() {
    // Arrange
    ArrayList<CurrencyAmount> amounts = new ArrayList<>();
    amounts.add(CurrencyAmount.of(Currency.AED, 10.0d));
    amounts.add(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    MultiCurrencyAmount actualTotalResult = MultiCurrencyAmount.total(amounts);

    // Assert
    Stream<CurrencyAmount> streamResult = actualTotalResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(-20.0d, negatedResult.getAmount());
    CurrencyAmount negativeResult = getResult.negative();
    assertEquals(-20.0d, negativeResult.getAmount());
    assertEquals(20.0d, negatedResult.negated().getAmount());
    assertEquals(20.0d, negativeResult.negated().getAmount());
    assertEquals(20.0d, negatedResult.positive().getAmount());
    assertEquals(20.0d, negativeResult.positive().getAmount());
    assertEquals(20.0d, getResult.getAmount());
  }

  /**
   * Test {@link MultiCurrencyAmount#total(Iterable)}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#total(Iterable)}
   */
  @Test
  @DisplayName("Test total(Iterable); then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.total(Iterable)"})
  void testTotal_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange
    ArrayList<CurrencyAmount> amounts = new ArrayList<>();
    amounts.add(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    MultiCurrencyAmount actualTotalResult = MultiCurrencyAmount.total(amounts);

    // Assert
    Stream<CurrencyAmount> streamResult = actualTotalResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
  }

  /**
   * Test {@link MultiCurrencyAmount#total(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#total(Iterable)}
   */
  @Test
  @DisplayName("Test total(Iterable); when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.total(Iterable)"})
  void testTotal_whenArrayList_thenReturnSizeIsZero() {
    // Arrange and Act
    MultiCurrencyAmount actualTotalResult = MultiCurrencyAmount.total(new ArrayList<>());

    // Assert
    assertEquals(0, actualTotalResult.size());
    assertTrue(actualTotalResult.getAmounts().isEmpty());
    assertTrue(actualTotalResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualTotalResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#getCurrencies()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getCurrencies()}
   */
  @Test
  @DisplayName("Test getCurrencies(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet MultiCurrencyAmount.getCurrencies()"})
  void testGetCurrencies_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(MultiCurrencyAmount.empty().getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#getCurrencies()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getCurrencies()}
   */
  @Test
  @DisplayName("Test getCurrencies(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet MultiCurrencyAmount.getCurrencies()"})
  void testGetCurrencies_thenReturnSizeIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, MultiCurrencyAmount.of(Currency.AED, 10.0d).getCurrencies().size());
  }

  /**
   * Test {@link MultiCurrencyAmount#size()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#size()}
   */
  @Test
  @DisplayName("Test size()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiCurrencyAmount.size()"})
  void testSize() {
    // Arrange, Act and Assert
    assertEquals(0, MultiCurrencyAmount.empty().size());
  }

  /**
   * Test {@link MultiCurrencyAmount#contains(Currency)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#contains(Currency)}
   */
  @Test
  @DisplayName("Test contains(Currency); given empty; when AED; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiCurrencyAmount.contains(Currency)"})
  void testContains_givenEmpty_whenAed_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MultiCurrencyAmount.empty().contains(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmount#contains(Currency)}.
   *
   * <ul>
   *   <li>Given {@link MultiCurrencyAmount} with currency is {@link Currency#ARS} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#contains(Currency)}
   */
  @Test
  @DisplayName(
      "Test contains(Currency); given MultiCurrencyAmount with currency is ARS and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiCurrencyAmount.contains(Currency)"})
  void testContains_givenMultiCurrencyAmountWithCurrencyIsArsAndAmountIsTen() {
    // Arrange, Act and Assert
    assertFalse(MultiCurrencyAmount.of(Currency.ARS, 10.0d).contains(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmount#contains(Currency)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#contains(Currency)}
   */
  @Test
  @DisplayName("Test contains(Currency); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MultiCurrencyAmount.contains(Currency)"})
  void testContains_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MultiCurrencyAmount.of(Currency.AED, 10.0d).contains(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmount#getAmount(Currency)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Currency#AED}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getAmount(Currency)}
   */
  @Test
  @DisplayName(
      "Test getAmount(Currency); given empty; when AED; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.getAmount(Currency)"})
  void testGetAmount_givenEmpty_whenAed_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> MultiCurrencyAmount.empty().getAmount(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmount#getAmount(Currency)}.
   *
   * <ul>
   *   <li>Given {@link MultiCurrencyAmount} with currency is {@link Currency#ARS} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getAmount(Currency)}
   */
  @Test
  @DisplayName(
      "Test getAmount(Currency); given MultiCurrencyAmount with currency is ARS and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.getAmount(Currency)"})
  void testGetAmount_givenMultiCurrencyAmountWithCurrencyIsArsAndAmountIsTen() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MultiCurrencyAmount.of(Currency.ARS, 10.0d).getAmount(Currency.AED));
  }

  /**
   * Test {@link MultiCurrencyAmount#getAmount(Currency)}.
   *
   * <ul>
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getAmount(Currency)}
   */
  @Test
  @DisplayName("Test getAmount(Currency); then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.getAmount(Currency)"})
  void testGetAmount_thenReturnAmountIsTen() {
    // Arrange and Act
    CurrencyAmount actualAmount =
        MultiCurrencyAmount.of(Currency.AED, 10.0d).getAmount(Currency.AED);

    // Assert
    assertEquals(10.0d, actualAmount.getAmount());
    assertFalse(actualAmount.isNegative());
    assertFalse(actualAmount.isZero());
    assertTrue(actualAmount.isPositive());
    CurrencyAmount actualPositiveResult = actualAmount.positive();
    assertSame(actualAmount, actualPositiveResult);
    assertSame(Currency.AED, actualAmount.getCurrency());
  }

  /**
   * Test {@link MultiCurrencyAmount#getAmountOrZero(Currency)}.
   *
   * <ul>
   *   <li>Given {@link MultiCurrencyAmount} with currency is {@link Currency#ARS} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getAmountOrZero(Currency)}
   */
  @Test
  @DisplayName(
      "Test getAmountOrZero(Currency); given MultiCurrencyAmount with currency is ARS and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.getAmountOrZero(Currency)"})
  void testGetAmountOrZero_givenMultiCurrencyAmountWithCurrencyIsArsAndAmountIsTen() {
    // Arrange and Act
    CurrencyAmount actualAmountOrZero =
        MultiCurrencyAmount.of(Currency.ARS, 10.0d).getAmountOrZero(Currency.AED);

    // Assert
    CurrencyAmount actualNegatedResult = actualAmountOrZero.negated();
    assertEquals(actualAmountOrZero, actualNegatedResult);
    assertSame(
        actualAmountOrZero.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualAmountOrZero.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    CurrencyAmount actualNegativeResult = actualAmountOrZero.negative();
    assertSame(actualAmountOrZero, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualAmountOrZero.positive();
    assertSame(actualAmountOrZero, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#getAmountOrZero(Currency)}.
   *
   * <ul>
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getAmountOrZero(Currency)}
   */
  @Test
  @DisplayName("Test getAmountOrZero(Currency); then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.getAmountOrZero(Currency)"})
  void testGetAmountOrZero_thenReturnAmountIsTen() {
    // Arrange and Act
    CurrencyAmount actualAmountOrZero =
        MultiCurrencyAmount.of(Currency.AED, 10.0d).getAmountOrZero(Currency.AED);

    // Assert
    assertEquals(10.0d, actualAmountOrZero.getAmount());
    assertFalse(actualAmountOrZero.isZero());
    assertTrue(actualAmountOrZero.isPositive());
    CurrencyAmount actualPositiveResult = actualAmountOrZero.positive();
    assertSame(actualAmountOrZero, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#getAmountOrZero(Currency)}.
   *
   * <ul>
   *   <li>Then return Currency TriangulationCurrency TriangulationCurrency.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#getAmountOrZero(Currency)}
   */
  @Test
  @DisplayName(
      "Test getAmountOrZero(Currency); then return Currency TriangulationCurrency TriangulationCurrency")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.getAmountOrZero(Currency)"})
  void testGetAmountOrZero_thenReturnCurrencyTriangulationCurrencyTriangulationCurrency() {
    // Arrange and Act
    CurrencyAmount actualAmountOrZero = MultiCurrencyAmount.empty().getAmountOrZero(Currency.AED);

    // Assert
    CurrencyAmount actualNegatedResult = actualAmountOrZero.negated();
    assertEquals(actualAmountOrZero, actualNegatedResult);
    assertSame(
        actualAmountOrZero.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualAmountOrZero.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    CurrencyAmount actualNegativeResult = actualAmountOrZero.negative();
    assertSame(actualAmountOrZero, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualAmountOrZero.positive();
    assertSame(actualAmountOrZero, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmount) with 'CurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(CurrencyAmount)"})
  void testPlusWithCurrencyAmount() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult.plus(CurrencyAmount.of(Currency.AED, 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmount) with 'CurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(CurrencyAmount)"})
  void testPlusWithCurrencyAmount2() {
    // Arrange
    Currency currency = new Currency("amountToAdd", 1, "GBP");
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(currency, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult.plus(CurrencyAmount.of(new Currency("amountToAdd", 1, "GBP"), 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, getResult.getCurrency());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(CurrencyAmount) with 'CurrencyAmount'; then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(CurrencyAmount)"})
  void testPlusWithCurrencyAmount_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        emptyResult.plus(CurrencyAmount.of(Currency.AED, 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(CurrencyAmount) with 'CurrencyAmount'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(CurrencyAmount)"})
  void testPlusWithCurrencyAmount_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.ARS, 10.0d);

    // Act
    MultiCurrencyAmount actualPlusResult = ofResult.plus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    Stream<CurrencyAmount> streamResult = actualPlusResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualPlusResult.size());
    assertEquals(2, actualPlusResult.getAmounts().size());
    assertEquals(2, actualPlusResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount getResult2 = collectResult.get(0);
    CurrencyAmount actualPositiveResult = getResult2.positive();
    assertSame(getResult2, actualPositiveResult);
    CurrencyAmount actualPositiveResult2 = getResult.positive();
    assertSame(getResult, actualPositiveResult2);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(Currency, double)}
   */
  @Test
  @DisplayName("Test plus(Currency, double) with 'Currency', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(Currency, double)"})
  void testPlusWithCurrencyDouble() {
    // Arrange, Act and Assert
    Stream<CurrencyAmount> streamResult =
        MultiCurrencyAmount.of(Currency.AED, 10.0d).plus(Currency.AED, 10.0d).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(Currency, double)}
   */
  @Test
  @DisplayName("Test plus(Currency, double) with 'Currency', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(Currency, double)"})
  void testPlusWithCurrencyDouble2() {
    // Arrange
    Currency currency = new Currency("currency", 1, "GBP");
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(currency, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult.plus(new Currency("currency", 1, "GBP"), 10.0d).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, getResult.getCurrency());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test plus(Currency, double) with 'Currency', 'double'; then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(Currency, double)"})
  void testPlusWithCurrencyDouble_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange, Act and Assert
    Stream<CurrencyAmount> streamResult =
        MultiCurrencyAmount.empty().plus(Currency.AED, 10.0d).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test plus(Currency, double) with 'Currency', 'double'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(Currency, double)"})
  void testPlusWithCurrencyDouble_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange and Act
    MultiCurrencyAmount actualPlusResult =
        MultiCurrencyAmount.of(Currency.ARS, 10.0d).plus(Currency.AED, 10.0d);

    // Assert
    Stream<CurrencyAmount> streamResult = actualPlusResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualPlusResult.size());
    assertEquals(2, actualPlusResult.getAmounts().size());
    assertEquals(2, actualPlusResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount getResult2 = collectResult.get(0);
    CurrencyAmount actualPositiveResult = getResult2.positive();
    assertSame(getResult2, actualPositiveResult);
    CurrencyAmount actualPositiveResult2 = getResult.positive();
    assertSame(getResult, actualPositiveResult2);
    assertSame(Currency.ARS, getResult.getCurrency());
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(MultiCurrencyAmount) with 'MultiCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(MultiCurrencyAmount)"})
  void testPlusWithMultiCurrencyAmount() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    MultiCurrencyAmount actualPlusResult = ofResult.plus(MultiCurrencyAmount.empty());

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(MultiCurrencyAmount) with 'MultiCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(MultiCurrencyAmount)"})
  void testPlusWithMultiCurrencyAmount2() {
    // Arrange
    Currency currency = new Currency("amountToAdd", 1, "GBP");
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(currency, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult
            .plus(MultiCurrencyAmount.of(new Currency("amountToAdd", 1, "GBP"), 10.0d))
            .stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, getResult.getCurrency());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmount) with 'MultiCurrencyAmount'; given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(MultiCurrencyAmount)"})
  void testPlusWithMultiCurrencyAmount_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    MultiCurrencyAmount amountToAdd = MultiCurrencyAmount.empty();

    // Act
    MultiCurrencyAmount actualPlusResult = emptyResult.plus(amountToAdd);

    // Assert
    assertEquals(amountToAdd, actualPlusResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmount) with 'MultiCurrencyAmount'; then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(MultiCurrencyAmount)"})
  void testPlusWithMultiCurrencyAmount_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#plus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test plus(MultiCurrencyAmount) with 'MultiCurrencyAmount'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.plus(MultiCurrencyAmount)"})
  void testPlusWithMultiCurrencyAmount_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.ARS, 10.0d);

    // Act
    MultiCurrencyAmount actualPlusResult =
        ofResult.plus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    Stream<CurrencyAmount> streamResult = actualPlusResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualPlusResult.size());
    assertEquals(2, actualPlusResult.getAmounts().size());
    assertEquals(2, actualPlusResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount getResult2 = collectResult.get(0);
    CurrencyAmount actualPositiveResult = getResult2.positive();
    assertSame(getResult2, actualPositiveResult);
    CurrencyAmount actualPositiveResult2 = getResult.positive();
    assertSame(getResult, actualPositiveResult2);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmount) with 'CurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(CurrencyAmount)"})
  void testMinusWithCurrencyAmount() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        emptyResult.minus(CurrencyAmount.of(Currency.AED, 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    CurrencyAmount positiveResult = getResult.positive();
    assertEquals(getResult, positiveResult.negated());
    assertEquals(getResult, negatedResult.negative());
    assertEquals(getResult, positiveResult.negative());
    assertSame(positiveResult.positive(), positiveResult.positive());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmount) with 'CurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(CurrencyAmount)"})
  void testMinusWithCurrencyAmount2() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult.minus(CurrencyAmount.of(Currency.AED, 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount actualNegatedResult = getResult.negated();
    assertEquals(getResult, actualNegatedResult);
    assertSame(
        getResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        getResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(CurrencyAmount) with 'CurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(CurrencyAmount)"})
  void testMinusWithCurrencyAmount3() {
    // Arrange
    Currency currency = new Currency("amountToSubtract", 1, "GBP");
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(currency, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult
            .minus(CurrencyAmount.of(new Currency("amountToSubtract", 1, "GBP"), 10.0d))
            .stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount actualNegatedResult = getResult.negated();
    assertEquals(getResult, actualNegatedResult);
    assertSame(currency, getResult.getCurrency());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(CurrencyAmount) with 'CurrencyAmount'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(CurrencyAmount)"})
  void testMinusWithCurrencyAmount_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.ARS, 10.0d);

    // Act
    MultiCurrencyAmount actualMinusResult = ofResult.minus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    Stream<CurrencyAmount> streamResult = actualMinusResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualMinusResult.size());
    assertEquals(2, actualMinusResult.getAmounts().size());
    assertEquals(2, actualMinusResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount getResult2 = collectResult.get(0);
    CurrencyAmount actualNegativeResult = getResult2.negative();
    assertSame(getResult2, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(Currency, double)}
   */
  @Test
  @DisplayName("Test minus(Currency, double) with 'Currency', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(Currency, double)"})
  void testMinusWithCurrencyDouble() {
    // Arrange, Act and Assert
    Stream<CurrencyAmount> streamResult =
        MultiCurrencyAmount.empty().minus(Currency.AED, 10.0d).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.negative());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(Currency, double)}
   */
  @Test
  @DisplayName("Test minus(Currency, double) with 'Currency', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(Currency, double)"})
  void testMinusWithCurrencyDouble2() {
    // Arrange, Act and Assert
    Stream<CurrencyAmount> streamResult =
        MultiCurrencyAmount.of(Currency.AED, 10.0d).minus(Currency.AED, 10.0d).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount actualNegatedResult = getResult.negated();
    assertEquals(getResult, actualNegatedResult);
    assertSame(
        getResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        getResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(Currency, double)}
   */
  @Test
  @DisplayName("Test minus(Currency, double) with 'Currency', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(Currency, double)"})
  void testMinusWithCurrencyDouble3() {
    // Arrange
    Currency currency = new Currency("currency", 1, "GBP");
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(currency, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult.minus(new Currency("currency", 1, "GBP"), 10.0d).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount actualNegatedResult = getResult.negated();
    assertEquals(getResult, actualNegatedResult);
    assertSame(currency, getResult.getCurrency());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test minus(Currency, double) with 'Currency', 'double'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(Currency, double)"})
  void testMinusWithCurrencyDouble_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange and Act
    MultiCurrencyAmount actualMinusResult =
        MultiCurrencyAmount.of(Currency.ARS, 10.0d).minus(Currency.AED, 10.0d);

    // Assert
    Stream<CurrencyAmount> streamResult = actualMinusResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualMinusResult.size());
    assertEquals(2, actualMinusResult.getAmounts().size());
    assertEquals(2, actualMinusResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount getResult2 = collectResult.get(0);
    CurrencyAmount actualNegativeResult = getResult2.negative();
    assertSame(getResult2, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
    assertSame(Currency.ARS, getResult.getCurrency());
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'MultiCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(MultiCurrencyAmount)"})
  void testMinusWithMultiCurrencyAmount() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    MultiCurrencyAmount actualMinusResult = ofResult.minus(MultiCurrencyAmount.empty());

    // Assert
    assertEquals(ofResult, actualMinusResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'MultiCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(MultiCurrencyAmount)"})
  void testMinusWithMultiCurrencyAmount2() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        emptyResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount negatedResult = getResult.negated();
    assertEquals(getResult, negatedResult.negated());
    assertEquals(getResult, negatedResult.negative());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'MultiCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(MultiCurrencyAmount)"})
  void testMinusWithMultiCurrencyAmount3() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d)).stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount actualNegatedResult = getResult.negated();
    assertEquals(getResult, actualNegatedResult);
    assertSame(
        getResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        getResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'MultiCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(MultiCurrencyAmount)"})
  void testMinusWithMultiCurrencyAmount4() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    MultiCurrencyAmount amountToSubtract = MultiCurrencyAmount.of(Currency.AED, 0.0d);

    // Act
    MultiCurrencyAmount actualMinusResult = emptyResult.minus(amountToSubtract);

    // Assert
    assertEquals(amountToSubtract, actualMinusResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName("Test minus(MultiCurrencyAmount) with 'MultiCurrencyAmount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(MultiCurrencyAmount)"})
  void testMinusWithMultiCurrencyAmount5() {
    // Arrange
    Currency currency = new Currency("amountToSubtract", 1, "GBP");
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(currency, 10.0d);

    // Act and Assert
    Stream<CurrencyAmount> streamResult =
        ofResult
            .minus(MultiCurrencyAmount.of(new Currency("amountToSubtract", 1, "GBP"), 10.0d))
            .stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    CurrencyAmount actualNegatedResult = getResult.negated();
    assertEquals(getResult, actualNegatedResult);
    assertSame(currency, getResult.getCurrency());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(MultiCurrencyAmount) with 'MultiCurrencyAmount'; given empty; when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(MultiCurrencyAmount)"})
  void testMinusWithMultiCurrencyAmount_givenEmpty_whenEmpty_thenReturnEmpty() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    MultiCurrencyAmount amountToSubtract = MultiCurrencyAmount.empty();

    // Act
    MultiCurrencyAmount actualMinusResult = emptyResult.minus(amountToSubtract);

    // Assert
    assertEquals(amountToSubtract, actualMinusResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)} with {@code MultiCurrencyAmount}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#minus(MultiCurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(MultiCurrencyAmount) with 'MultiCurrencyAmount'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.minus(MultiCurrencyAmount)"})
  void testMinusWithMultiCurrencyAmount_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.ARS, 10.0d);

    // Act
    MultiCurrencyAmount actualMinusResult =
        ofResult.minus(MultiCurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    Stream<CurrencyAmount> streamResult = actualMinusResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    CurrencyAmount getResult = collectResult.get(1);
    assertEquals(10.0d, getResult.getAmount());
    assertEquals(2, actualMinusResult.size());
    assertEquals(2, actualMinusResult.getAmounts().size());
    assertEquals(2, actualMinusResult.getCurrencies().size());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount getResult2 = collectResult.get(0);
    CurrencyAmount actualNegativeResult = getResult2.negative();
    assertSame(getResult2, actualNegativeResult);
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#multipliedBy(double)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When ten.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double); given empty; when ten; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.multipliedBy(double)"})
  void testMultipliedBy_givenEmpty_whenTen_thenReturnEmpty() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act
    MultiCurrencyAmount actualMultipliedByResult = emptyResult.multipliedBy(10.0d);

    // Assert
    assertEquals(emptyResult, actualMultipliedByResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#multipliedBy(double)}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.multipliedBy(double)"})
  void testMultipliedBy_thenReturnSizeIsOne() {
    // Arrange and Act
    MultiCurrencyAmount actualMultipliedByResult =
        MultiCurrencyAmount.of(Currency.AED, 10.0d).multipliedBy(10.0d);

    // Assert
    assertEquals(1, actualMultipliedByResult.size());
    assertEquals(1, actualMultipliedByResult.getAmounts().size());
    assertEquals(1, actualMultipliedByResult.getCurrencies().size());
    Stream<CurrencyAmount> streamResult = actualMultipliedByResult.stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    assertEquals(100.0d, getResult.getAmount());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#negated()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#negated()}
   */
  @Test
  @DisplayName("Test negated(); given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.negated()"})
  void testNegated_givenEmpty_thenReturnEmpty() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act
    MultiCurrencyAmount actualNegatedResult = emptyResult.negated();

    // Assert
    assertEquals(emptyResult, actualNegatedResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#negated()}.
   *
   * <ul>
   *   <li>Then return {@link MultiCurrencyAmount} with currency is {@link Currency#AED} and amount
   *       is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#negated()}
   */
  @Test
  @DisplayName(
      "Test negated(); then return MultiCurrencyAmount with currency is AED and amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.negated()"})
  void testNegated_thenReturnMultiCurrencyAmountWithCurrencyIsAedAndAmountIsZero() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 0.0d);

    // Act
    MultiCurrencyAmount actualNegatedResult = ofResult.negated();

    // Assert
    assertEquals(ofResult, actualNegatedResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#negated()}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#negated()}
   */
  @Test
  @DisplayName("Test negated(); then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.negated()"})
  void testNegated_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange, Act and Assert
    Stream<CurrencyAmount> streamResult =
        MultiCurrencyAmount.of(Currency.AED, 10.0d).negated().stream();
    List<CurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    assertEquals(-10.0d, getResult.getAmount());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isNegative());
    CurrencyAmount actualNegativeResult = getResult.negative();
    assertSame(getResult, actualNegativeResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#stream()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#stream()}
   */
  @Test
  @DisplayName("Test stream(); given empty; then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MultiCurrencyAmount.stream()"})
  void testStream_givenEmpty_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Stream<CurrencyAmount> actualStreamResult = MultiCurrencyAmount.empty().stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MultiCurrencyAmount.stream()"})
  void testStream_thenReturnLimitFiveCollectToListSizeIsOne() {
    // Arrange and Act
    Stream<CurrencyAmount> actualStreamResult =
        MultiCurrencyAmount.of(Currency.AED, 10.0d).stream();

    // Assert
    List<CurrencyAmount> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyAmount getResult = collectResult.get(0);
    assertEquals(10.0d, getResult.getAmount());
    assertFalse(getResult.isNegative());
    assertFalse(getResult.isZero());
    assertTrue(getResult.isPositive());
    CurrencyAmount actualPositiveResult = getResult.positive();
    assertSame(getResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#mapAmounts(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link DoubleUnaryOperator}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#mapAmounts(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmounts(DoubleUnaryOperator); given empty; when DoubleUnaryOperator; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.mapAmounts(DoubleUnaryOperator)"})
  void testMapAmounts_givenEmpty_whenDoubleUnaryOperator_thenReturnEmpty() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act
    MultiCurrencyAmount actualMapAmountsResult =
        emptyResult.mapAmounts(mock(DoubleUnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualMapAmountsResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#mapAmounts(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Then return {@link MultiCurrencyAmount} with currency is {@link Currency#AED} and amount
   *       is ten.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#mapAmounts(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmounts(DoubleUnaryOperator); then return MultiCurrencyAmount with currency is AED and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.mapAmounts(DoubleUnaryOperator)"})
  void testMapAmounts_thenReturnMultiCurrencyAmountWithCurrencyIsAedAndAmountIsTen() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    DoubleUnaryOperator mapper = mock(DoubleUnaryOperator.class);
    when(mapper.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    MultiCurrencyAmount actualMapAmountsResult = ofResult.mapAmounts(mapper);

    // Assert
    verify(mapper).applyAsDouble(10.0d);
    assertEquals(ofResult, actualMapAmountsResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#mapCurrencyAmounts(UnaryOperator)}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#mapCurrencyAmounts(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapCurrencyAmounts(UnaryOperator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.mapCurrencyAmounts(UnaryOperator)"})
  void testMapCurrencyAmounts() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    UnaryOperator<CurrencyAmount> operator = mock(UnaryOperator.class);
    when(operator.apply(Mockito.<CurrencyAmount>any()))
        .thenReturn(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    MultiCurrencyAmount actualMapCurrencyAmountsResult = ofResult.mapCurrencyAmounts(operator);

    // Assert
    verify(operator).apply(isA(CurrencyAmount.class));
    assertEquals(ofResult, actualMapCurrencyAmountsResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#mapCurrencyAmounts(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link UnaryOperator}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#mapCurrencyAmounts(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapCurrencyAmounts(UnaryOperator); given empty; when UnaryOperator; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.mapCurrencyAmounts(UnaryOperator)"})
  void testMapCurrencyAmounts_givenEmpty_whenUnaryOperator_thenReturnEmpty() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act
    MultiCurrencyAmount actualMapCurrencyAmountsResult =
        emptyResult.mapCurrencyAmounts(mock(UnaryOperator.class));

    // Assert
    assertEquals(emptyResult, actualMapCurrencyAmountsResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#mapCurrencyAmounts(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#mapCurrencyAmounts(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapCurrencyAmounts(UnaryOperator); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyAmount.mapCurrencyAmounts(UnaryOperator)"})
  void testMapCurrencyAmounts_thenThrowIllegalArgumentException() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    UnaryOperator<CurrencyAmount> operator = mock(UnaryOperator.class);
    when(operator.apply(Mockito.<CurrencyAmount>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.mapCurrencyAmounts(operator));
    verify(operator).apply(isA(CurrencyAmount.class));
  }

  /**
   * Test {@link MultiCurrencyAmount#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link FxRateProvider}.
   *   <li>Then return Amount is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given empty; when FxRateProvider; then return Amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenEmpty_whenFxRateProvider_thenReturnAmountIsZero() {
    // Arrange and Act
    CurrencyAmount actualConvertedToResult =
        MultiCurrencyAmount.empty().convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    assertEquals(0.0d, actualConvertedToResult.getAmount());
    assertFalse(actualConvertedToResult.isPositive());
    assertTrue(actualConvertedToResult.isZero());
    CurrencyAmount actualNegatedResult = actualConvertedToResult.negated();
    assertEquals(actualConvertedToResult, actualNegatedResult);
    CurrencyAmount actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link MultiCurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given MultiCurrencyAmount with currency is AED and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenMultiCurrencyAmountWithCurrencyIsAedAndAmountIsTen() {
    // Arrange and Act
    CurrencyAmount actualConvertedToResult =
        MultiCurrencyAmount.of(Currency.AED, 10.0d)
            .convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    CurrencyAmount negatedResult = actualConvertedToResult.negated();
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link FxRateProvider} {@link FxRateProvider#convert(double, Currency, Currency)}
   *       return ten.
   *   <li>Then calls {@link FxRateProvider#convert(double, Currency, Currency)}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given ten; when FxRateProvider convert(double, Currency, Currency) return ten; then calls convert(double, Currency, Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount MultiCurrencyAmount.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenTen_whenFxRateProviderConvertReturnTen_thenCallsConvert() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.ARS, 10.0d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(10.0d);

    // Act
    CurrencyAmount actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    CurrencyAmount negatedResult = actualConvertedToResult.negated();
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link MultiCurrencyAmount#toMap()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSortedMap MultiCurrencyAmount.toMap()"})
  void testToMap_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(MultiCurrencyAmount.empty().toMap().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#toMap()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSortedMap MultiCurrencyAmount.toMap()"})
  void testToMap_thenReturnSizeIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, MultiCurrencyAmount.of(Currency.AED, 10.0d).toMap().size());
  }

  /**
   * Test {@link MultiCurrencyAmount#meta()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MultiCurrencyAmount.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = MultiCurrencyAmount.meta();

    // Assert
    MetaProperty<ImmutableSortedSet<CurrencyAmount>> amountsResult = actualMetaResult.amounts();
    assertTrue(amountsResult instanceof DirectMetaProperty);
    assertEquals("amounts", amountsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, amountsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableSortedSet> expectedPropertyTypeResult = ImmutableSortedSet.class;
    assertEquals(expectedPropertyTypeResult, amountsResult.propertyType());
    Class<MultiCurrencyAmount> expectedDeclaringTypeResult = MultiCurrencyAmount.class;
    assertEquals(expectedDeclaringTypeResult, amountsResult.declaringType());
    assertSame(Meta.INSTANCE, amountsResult.metaBean());
  }

  /**
   * Test {@link MultiCurrencyAmount#metaBean()}.
   *
   * <p>Method under test: {@link MultiCurrencyAmount#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MultiCurrencyAmount.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, MultiCurrencyAmount.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiCurrencyAmount#toString()}
   *   <li>{@link MultiCurrencyAmount#getAmounts()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableSortedSet MultiCurrencyAmount.getAmounts()",
    "String MultiCurrencyAmount.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("[]", actualToStringResult);
    assertTrue(emptyResult.getAmounts().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyAmount#equals(Object)}, and {@link MultiCurrencyAmount#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiCurrencyAmount#equals(Object)}
   *   <li>{@link MultiCurrencyAmount#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmount.equals(Object)",
    "int MultiCurrencyAmount.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    MultiCurrencyAmount emptyResult2 = MultiCurrencyAmount.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link MultiCurrencyAmount#equals(Object)}, and {@link MultiCurrencyAmount#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MultiCurrencyAmount#equals(Object)}
   *   <li>{@link MultiCurrencyAmount#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmount.equals(Object)",
    "int MultiCurrencyAmount.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link MultiCurrencyAmount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmount.equals(Object)",
    "int MultiCurrencyAmount.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MultiCurrencyAmount ofResult = MultiCurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, MultiCurrencyAmount.empty());
  }

  /**
   * Test {@link MultiCurrencyAmount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmount.equals(Object)",
    "int MultiCurrencyAmount.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MultiCurrencyAmount.empty(), null);
  }

  /**
   * Test {@link MultiCurrencyAmount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyAmount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyAmount.equals(Object)",
    "int MultiCurrencyAmount.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MultiCurrencyAmount.empty(), "Different type to MultiCurrencyAmount");
  }
}
