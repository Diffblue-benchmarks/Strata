package com.opengamma.strata.data.scenario;

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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.SingleScenarioArray.Meta;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
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

class SingleScenarioArrayDiffblueTest {
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act
    Class<? extends SingleScenarioArray<Object>> actualBeanTypeResult =
        metaSingleScenarioArrayResult.beanType();

    // Assert
    Class<SingleScenarioArray> expectedBeanTypeResult = SingleScenarioArray.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#scenarioCount()}
   *   <li>{@link Meta#value()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.scenarioCount()", "MetaProperty Meta.value()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SingleScenarioArray.meta();

    // Act
    MetaProperty<Integer> actualScenarioCountResult = metaResult.scenarioCount();

    // Assert
    assertTrue(actualScenarioCountResult instanceof DirectMetaProperty);
    assertTrue(metaResult.value() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean scenarioCount return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean scenarioCount return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanScenarioCountReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaSingleScenarioArrayResult.metaPropertyGet("value");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> scenarioCountResult = ((Meta<Object>) metaBeanResult).scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    assertEquals("int", scenarioCountResult.propertyType().getName());
    assertEquals("scenarioCount", scenarioCountResult.name());
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, scenarioCountResult.style());
    Class<SingleScenarioArray> expectedDeclaringTypeResult = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, scenarioCountResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).value());
    assertSame(Meta.INSTANCE, scenarioCountResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean value return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean value return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanValueReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaSingleScenarioArrayResult.metaPropertyGet("scenarioCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Object> valueResult = ((Meta<Object>) metaBeanResult).value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("scenarioCount", actualMetaPropertyGetResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    Class<SingleScenarioArray> expectedDeclaringTypeResult = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).scenarioCount());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act and Assert
    assertNull(metaSingleScenarioArrayResult.metaPropertyGet("Property Name"));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaSingleScenarioArrayResult.metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("scenarioCount");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("int", getResult.propertyType().getName());
    assertEquals("scenarioCount", getResult.name());
    assertEquals("value", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<SingleScenarioArray> expectedDeclaringTypeResult = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<SingleScenarioArray> expectedDeclaringTypeResult2 = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenThrowNoSuchElementException() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);
    SingleScenarioArray<Object> bean = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaSingleScenarioArrayResult.propertyGet(bean, "Property Name", false));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act and Assert
    assertNull(metaSingleScenarioArrayResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            metaSingleScenarioArrayResult.propertySet(
                mock(Bean.class), "scenarioCount", "New Value", false));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaSingleScenarioArrayResult.propertySet(
                mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code scenarioCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'scenarioCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenScenarioCount_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaSingleScenarioArrayResult.propertySet(
                mock(Bean.class), "scenarioCount", "New Value", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleScenarioArrayResult = SingleScenarioArray.metaSingleScenarioArray(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaSingleScenarioArrayResult.propertySet(
                mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test {@link SingleScenarioArray#of(int, Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#of(int, Object)}
   */
  @Test
  @DisplayName("Test of(int, Object); when 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SingleScenarioArray SingleScenarioArray.of(int, Object)"})
  void testOf_whenValue_thenReturnValue() {
    // Arrange and Act
    SingleScenarioArray<Object> actualOfResult = SingleScenarioArray.of(3, "Value");

    // Assert
    assertEquals("Value", actualOfResult.getValue());
    assertEquals(3, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link SingleScenarioArray#get(int)}.
   *
   * <ul>
   *   <li>Given {@link SingleScenarioArray} with scenarioCount is three and {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#get(int)}
   */
  @Test
  @DisplayName(
      "Test get(int); given SingleScenarioArray with scenarioCount is three and 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SingleScenarioArray.get(int)"})
  void testGet_givenSingleScenarioArrayWithScenarioCountIsThreeAndValue_thenReturnValue() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertEquals("Value", ofResult.get(1));
  }

  /**
   * Test {@link SingleScenarioArray#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream SingleScenarioArray.stream()"})
  void testStream_thenReturnLimitFiveCollectToListSizeIsThree() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act
    Stream<Object> actualStreamResult = ofResult.stream();

    // Assert
    List<Object> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals("Value", collectResult.get(0));
    assertEquals("Value", collectResult.get(1));
    assertEquals("Value", collectResult.get(2));
  }

  /**
   * Test {@link SingleScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, ScenarioFxRateProvider); then return DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray SingleScenarioArray.convertedTo(Currency, ScenarioFxRateProvider)"
  })
  void testConvertedTo_thenReturnDefaultScenarioArray() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(0, MultiCurrencyAmount.empty());

    // Act
    ScenarioArray<?> actualConvertedToResult =
        ofResult.convertedTo(
            null,
            new DefaultScenarioFxRateProvider(
                ImmutableScenarioMarketData.empty(), ObservableSource.NONE));

    // Assert
    assertTrue(actualConvertedToResult instanceof DefaultScenarioArray);
    assertEquals(0, actualConvertedToResult.getScenarioCount());
    assertTrue(((DefaultScenarioArray<?>) actualConvertedToResult).getValues().isEmpty());
    Stream<?> streamResult = actualConvertedToResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link SingleScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}.
   *
   * <ul>
   *   <li>Then return {@link SingleScenarioArray} with scenarioCount is three and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, ScenarioFxRateProvider); then return SingleScenarioArray with scenarioCount is three and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray SingleScenarioArray.convertedTo(Currency, ScenarioFxRateProvider)"
  })
  void testConvertedTo_thenReturnSingleScenarioArrayWithScenarioCountIsThreeAndValue() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act
    ScenarioArray<?> actualConvertedToResult =
        ofResult.convertedTo(null, new DefaultScenarioFxRateProvider(null, ObservableSource.NONE));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link SingleScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#convertedTo(Currency, ScenarioFxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, ScenarioFxRateProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray SingleScenarioArray.convertedTo(Currency, ScenarioFxRateProvider)"
  })
  void testConvertedTo_thenThrowIllegalArgumentException() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, MultiCurrencyAmount.empty());

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
   * Test {@link SingleScenarioArray#meta()}.
   *
   * <p>Method under test: {@link SingleScenarioArray#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleScenarioArray.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SingleScenarioArray.meta();

    // Assert
    MetaProperty<Integer> scenarioCountResult = actualMetaResult.scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    MetaProperty valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("int", scenarioCountResult.propertyType().getName());
    assertEquals("scenarioCount", scenarioCountResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, scenarioCountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<SingleScenarioArray> expectedDeclaringTypeResult = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, scenarioCountResult.declaringType());
    Class<SingleScenarioArray> expectedDeclaringTypeResult2 = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, scenarioCountResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link SingleScenarioArray#metaSingleScenarioArray(Class)}.
   *
   * <p>Method under test: {@link SingleScenarioArray#metaSingleScenarioArray(Class)}
   */
  @Test
  @DisplayName("Test metaSingleScenarioArray(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleScenarioArray.metaSingleScenarioArray(Class)"})
  void testMetaSingleScenarioArray() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaSingleScenarioArrayResult =
        SingleScenarioArray.metaSingleScenarioArray(cls);

    // Assert
    MetaProperty<Integer> scenarioCountResult = actualMetaSingleScenarioArrayResult.scenarioCount();
    assertTrue(scenarioCountResult instanceof DirectMetaProperty);
    MetaProperty<Object> valueResult = actualMetaSingleScenarioArrayResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("int", scenarioCountResult.propertyType().getName());
    assertEquals("scenarioCount", scenarioCountResult.name());
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, scenarioCountResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaSingleScenarioArrayResult.isBuildable());
    Class<SingleScenarioArray> expectedDeclaringTypeResult = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult, scenarioCountResult.declaringType());
    Class<SingleScenarioArray> expectedDeclaringTypeResult2 = SingleScenarioArray.class;
    assertEquals(expectedDeclaringTypeResult2, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, scenarioCountResult.metaBean());
    assertSame(meta, valueResult.metaBean());
  }

  /**
   * Test {@link SingleScenarioArray#metaBean()}.
   *
   * <p>Method under test: {@link SingleScenarioArray#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleScenarioArray.metaBean()"})
  void testMetaBean() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleScenarioArray#toString()}
   *   <li>{@link SingleScenarioArray#getScenarioCount()}
   *   <li>{@link SingleScenarioArray#getValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int SingleScenarioArray.getScenarioCount()",
    "Object SingleScenarioArray.getValue()",
    "String SingleScenarioArray.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act
    String actualToStringResult = ofResult.toString();
    int actualScenarioCount = ofResult.getScenarioCount();

    // Assert
    assertEquals("SingleScenarioArray{scenarioCount=3, value=Value}", actualToStringResult);
    assertEquals("Value", ofResult.getValue());
    assertEquals(3, actualScenarioCount);
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}, and {@link SingleScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleScenarioArray#equals(Object)}
   *   <li>{@link SingleScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");
    SingleScenarioArray<Object> ofResult2 = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}, and {@link SingleScenarioArray#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleScenarioArray#equals(Object)}
   *   <li>{@link SingleScenarioArray#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertNotEquals(ofResult, 3);
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(1, "Value");
    SingleScenarioArray<Object> ofResult2 = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, 42);
    SingleScenarioArray<Object> ofResult2 = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertNotEquals(ofResult, ofResult2);
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");
    SingleScenarioArray<Object> ofResult2 = SingleScenarioArray.of(3, ofResult);
    SingleScenarioArray<Object> ofResult3 = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertNotEquals(ofResult2, ofResult3);
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link SingleScenarioArray#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleScenarioArray#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleScenarioArray.equals(Object)",
    "int SingleScenarioArray.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SingleScenarioArray<Object> ofResult = SingleScenarioArray.of(3, "Value");

    // Act and Assert
    assertNotEquals(ofResult, "Different type to SingleScenarioArray");
  }
}
