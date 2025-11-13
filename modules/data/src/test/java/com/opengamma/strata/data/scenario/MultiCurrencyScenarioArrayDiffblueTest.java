package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray.Meta;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MultiCurrencyScenarioArrayDiffblueTest {
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
    assertTrue(MultiCurrencyScenarioArray.meta().amounts() instanceof DirectMetaProperty);
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
    Class<? extends MultiCurrencyScenarioArray> actualBeanTypeResult =
        MultiCurrencyScenarioArray.meta().beanType();

    // Assert
    Class<MultiCurrencyScenarioArray> expectedBeanTypeResult = MultiCurrencyScenarioArray.class;
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
        MultiCurrencyScenarioArray.meta().metaPropertyGet("amounts");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("amounts", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<MultiCurrencyAmountArray> expectedPropertyTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<MultiCurrencyScenarioArray> expectedDeclaringTypeResult =
        MultiCurrencyScenarioArray.class;
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
    assertNull(MultiCurrencyScenarioArray.meta().metaPropertyGet("Property Name"));
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
        MultiCurrencyScenarioArray.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("amounts");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("amounts", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<MultiCurrencyAmountArray> expectedPropertyTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<MultiCurrencyScenarioArray> expectedDeclaringTypeResult =
        MultiCurrencyScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link MultiCurrencyAmountArray}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return MultiCurrencyAmountArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnMultiCurrencyAmountArray() {
    // Arrange
    Meta metaResult = MultiCurrencyScenarioArray.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MultiCurrencyScenarioArray.of(new ArrayList<>()), "amounts", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof MultiCurrencyAmountArray);
    assertEquals(0, ((MultiCurrencyAmountArray) actualPropertyGetResult).getSize());
    assertEquals(0, ((MultiCurrencyAmountArray) actualPropertyGetResult).size());
    assertTrue(((MultiCurrencyAmountArray) actualPropertyGetResult).getValues().isEmpty());
    assertTrue(((MultiCurrencyAmountArray) actualPropertyGetResult).getCurrencies().isEmpty());
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
        MultiCurrencyScenarioArray.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            MultiCurrencyScenarioArray.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
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
            MultiCurrencyScenarioArray.meta()
                .propertySet(mock(Bean.class), "amounts", "New Value", true));
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
            MultiCurrencyScenarioArray.meta()
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
            MultiCurrencyScenarioArray.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#of(int, IntFunction)} with {@code int}, {@code
   * IntFunction}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Amounts Size is three.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given empty; then return Amounts Size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyScenarioArray MultiCurrencyScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenEmpty_thenReturnAmountsSizeIsThree() {
    // Arrange
    IntFunction<MultiCurrencyAmount> amountFunction = mock(IntFunction.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(amountFunction.apply(anyInt())).thenReturn(emptyResult);

    // Act
    MultiCurrencyScenarioArray actualOfResult = MultiCurrencyScenarioArray.of(3, amountFunction);

    // Assert
    verify(amountFunction, atLeast(1)).apply(anyInt());
    MultiCurrencyAmountArray amounts = actualOfResult.getAmounts();
    assertEquals(3, amounts.getSize());
    assertEquals(3, amounts.size());
    assertEquals(3, actualOfResult.getScenarioCount());
    Stream<MultiCurrencyAmount> streamResult = actualOfResult.stream();
    List<MultiCurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertTrue(amounts.getValues().isEmpty());
    Set<Currency> currencies = actualOfResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertEquals(emptyResult, collectResult.get(0));
    assertEquals(emptyResult, collectResult.get(1));
    assertEquals(emptyResult, collectResult.get(2));
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ArrayList#ArrayList()} add empty.
   *   <li>Then return Amounts Size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given empty; when ArrayList() add empty; then return Amounts Size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyScenarioArray MultiCurrencyScenarioArray.of(List)"})
  void testOfWithList_givenEmpty_whenArrayListAddEmpty_thenReturnAmountsSizeIsOne() {
    // Arrange
    ArrayList<MultiCurrencyAmount> amounts = new ArrayList<>();
    amounts.add(MultiCurrencyAmount.empty());

    // Act
    MultiCurrencyScenarioArray actualOfResult = MultiCurrencyScenarioArray.of(amounts);

    // Assert
    MultiCurrencyAmountArray amounts2 = actualOfResult.getAmounts();
    assertEquals(1, amounts2.getSize());
    assertEquals(1, amounts2.size());
    assertEquals(1, actualOfResult.getScenarioCount());
    Stream<MultiCurrencyAmount> streamResult = actualOfResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ArrayList#ArrayList()} add empty.
   *   <li>Then return Amounts Size is two.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given empty; when ArrayList() add empty; then return Amounts Size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyScenarioArray MultiCurrencyScenarioArray.of(List)"})
  void testOfWithList_givenEmpty_whenArrayListAddEmpty_thenReturnAmountsSizeIsTwo() {
    // Arrange
    ArrayList<MultiCurrencyAmount> amounts = new ArrayList<>();
    amounts.add(MultiCurrencyAmount.empty());
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    amounts.add(emptyResult);

    // Act
    MultiCurrencyScenarioArray actualOfResult = MultiCurrencyScenarioArray.of(amounts);

    // Assert
    MultiCurrencyAmountArray amounts2 = actualOfResult.getAmounts();
    assertEquals(2, amounts2.getSize());
    assertEquals(2, amounts2.size());
    assertEquals(2, actualOfResult.getScenarioCount());
    Stream<MultiCurrencyAmount> streamResult = actualOfResult.stream();
    List<MultiCurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals(emptyResult, collectResult.get(1));
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyScenarioArray MultiCurrencyScenarioArray.of(List)"})
  void testOfWithList_whenArrayList_thenReturnAmountsSizeIsZero() {
    // Arrange and Act
    MultiCurrencyScenarioArray actualOfResult = MultiCurrencyScenarioArray.of(new ArrayList<>());

    // Assert
    MultiCurrencyAmountArray amounts = actualOfResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualOfResult.getScenarioCount());
    Stream<MultiCurrencyAmount> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; when HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyScenarioArray MultiCurrencyScenarioArray.of(Map)"})
  void testOfWithMap_whenHashMap() {
    // Arrange and Act
    MultiCurrencyScenarioArray actualOfResult = MultiCurrencyScenarioArray.of(new HashMap<>());

    // Assert
    MultiCurrencyAmountArray amounts = actualOfResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualOfResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualOfResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link TreeMap#TreeMap()}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; when TreeMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyScenarioArray MultiCurrencyScenarioArray.of(Map)"})
  void testOfWithMap_whenTreeMap() {
    // Arrange and Act
    MultiCurrencyScenarioArray actualOfResult = MultiCurrencyScenarioArray.of(new TreeMap<>());

    // Assert
    MultiCurrencyAmountArray amounts = actualOfResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualOfResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualOfResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#of(MultiCurrencyAmount[])} with {@code
   * MultiCurrencyAmount[]}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Amounts Size is one.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#of(MultiCurrencyAmount[])}
   */
  @Test
  @DisplayName(
      "Test of(MultiCurrencyAmount[]) with 'MultiCurrencyAmount[]'; when empty; then return Amounts Size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray MultiCurrencyScenarioArray.of(MultiCurrencyAmount[])"
  })
  void testOfWithMultiCurrencyAmount_whenEmpty_thenReturnAmountsSizeIsOne() {
    // Arrange
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();

    // Act
    MultiCurrencyScenarioArray actualOfResult = MultiCurrencyScenarioArray.of(emptyResult);

    // Assert
    MultiCurrencyAmountArray amounts = actualOfResult.getAmounts();
    assertEquals(1, amounts.getSize());
    assertEquals(1, amounts.size());
    assertEquals(1, actualOfResult.getScenarioCount());
    Stream<MultiCurrencyAmount> streamResult = actualOfResult.stream();
    List<MultiCurrencyAmount> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertTrue(amounts.getValues().isEmpty());
    Set<Currency> currencies = actualOfResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertEquals(emptyResult, collectResult.get(0));
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#getCurrencies()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#getCurrencies()}
   */
  @Test
  @DisplayName("Test getCurrencies(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set MultiCurrencyScenarioArray.getCurrencies()"})
  void testGetCurrencies_thenReturnEmpty() {
    // Arrange
    MultiCurrencyScenarioArray ofResult = MultiCurrencyScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertTrue(ofResult.getCurrencies().isEmpty());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int MultiCurrencyScenarioArray.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    MultiCurrencyScenarioArray ofResult = MultiCurrencyScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertEquals(0, ofResult.getScenarioCount());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#get(int)}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#get(int)}
   */
  @Test
  @DisplayName("Test get(int); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount MultiCurrencyScenarioArray.get(int)"})
  void testGet_thenReturnSizeIsZero() {
    // Arrange
    MultiCurrencyScenarioArray ofResult = MultiCurrencyScenarioArray.of(new ArrayList<>());

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
   * Test {@link MultiCurrencyScenarioArray#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MultiCurrencyScenarioArray.stream()"})
  void testStream_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    MultiCurrencyScenarioArray ofResult = MultiCurrencyScenarioArray.of(new ArrayList<>());

    // Act
    Stream<MultiCurrencyAmount> actualStreamResult = ofResult.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add empty.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#convertedTo(Currency,
   * ScenarioFxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, ScenarioFxRateProvider); given ArrayList() add empty; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray MultiCurrencyScenarioArray.convertedTo(Currency, ScenarioFxRateProvider)"
  })
  void testConvertedTo_givenArrayListAddEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    ArrayList<MultiCurrencyAmount> amounts = new ArrayList<>();
    amounts.add(MultiCurrencyAmount.empty());
    MultiCurrencyScenarioArray ofResult = MultiCurrencyScenarioArray.of(amounts);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            ofResult.convertedTo(
                null,
                new DefaultScenarioFxRateProvider(
                    ImmutableScenarioMarketData.empty(), ObservableSource.NONE)));
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#total(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#total(Iterable)}
   */
  @Test
  @DisplayName("Test total(Iterable); when ArrayList(); then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyScenarioArray MultiCurrencyScenarioArray.total(Iterable)"})
  void testTotal_whenArrayList_thenReturnAmountsSizeIsZero() {
    // Arrange and Act
    MultiCurrencyScenarioArray actualTotalResult =
        MultiCurrencyScenarioArray.total(new ArrayList<>());

    // Assert
    MultiCurrencyAmountArray amounts = actualTotalResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualTotalResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualTotalResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualTotalResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#meta()}.
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MultiCurrencyScenarioArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = MultiCurrencyScenarioArray.meta();

    // Assert
    MetaProperty<MultiCurrencyAmountArray> amountsResult = actualMetaResult.amounts();
    assertTrue(amountsResult instanceof DirectMetaProperty);
    assertEquals("amounts", amountsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, amountsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<MultiCurrencyAmountArray> expectedPropertyTypeResult = MultiCurrencyAmountArray.class;
    assertEquals(expectedPropertyTypeResult, amountsResult.propertyType());
    Class<MultiCurrencyScenarioArray> expectedDeclaringTypeResult =
        MultiCurrencyScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, amountsResult.declaringType());
    assertSame(Meta.INSTANCE, amountsResult.metaBean());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MultiCurrencyScenarioArray.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    MultiCurrencyScenarioArray ofResult = MultiCurrencyScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link MultiCurrencyScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MultiCurrencyScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean MultiCurrencyScenarioArray.equals(Object)",
    "int MultiCurrencyScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MultiCurrencyScenarioArray ofResult = MultiCurrencyScenarioArray.of(new ArrayList<>());

    // Act and Assert
    assertNotEquals(ofResult, "Obj");
  }
}
