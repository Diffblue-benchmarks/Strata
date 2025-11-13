package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletPeriodCurrencyAmounts.Builder;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletPeriodCurrencyAmounts.Meta;
import com.opengamma.strata.product.capfloor.IborCapletFloorletPeriod;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborCapletFloorletPeriodCurrencyAmountsDiffblueTest {
  /**
   * Test Builder {@link Builder#amounts(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return build Amounts is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#amounts(Map)}
   */
  @Test
  @DisplayName("Test Builder amounts(Map); when HashMap(); then return build Amounts is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.amounts(Map)"})
  void testBuilderAmounts_whenHashMap_thenReturnBuildAmountsIsHashMap() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();
    HashMap<IborCapletFloorletPeriod, CurrencyAmount> amounts = new HashMap<>();

    // Act
    Builder actualAmountsResult = builderResult.amounts(amounts);

    // Assert
    assertEquals(amounts, actualAmountsResult.build().getAmounts());
    assertSame(builderResult, actualAmountsResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code amounts}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'amounts'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAmounts_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult = IborCapletFloorletPeriodCurrencyAmounts.builder().get("amounts");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> IborCapletFloorletPeriodCurrencyAmounts.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> IborCapletFloorletPeriodCurrencyAmounts.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code amounts}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'amounts'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenAmounts_thenReturnBuilder() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();

    // Act
    Builder actualSetResult = builderResult.set("amounts", new HashMap<>());

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return build Amounts Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return build Amounts Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuildAmountsEmpty() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertTrue(actualSetResult.build().getAmounts().isEmpty());
    assertSame(builderResult, actualSetResult);
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
    assertTrue(
        IborCapletFloorletPeriodCurrencyAmounts.meta().amounts() instanceof DirectMetaProperty);
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
    Class<? extends IborCapletFloorletPeriodCurrencyAmounts> actualBeanTypeResult =
        IborCapletFloorletPeriodCurrencyAmounts.meta().beanType();

    // Assert
    Class<IborCapletFloorletPeriodCurrencyAmounts> expectedBeanTypeResult =
        IborCapletFloorletPeriodCurrencyAmounts.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#builder()}.
   *
   * <p>Method under test: {@link Meta#builder()}
   */
  @Test
  @DisplayName("Test Meta builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Meta.builder()"})
  void testMetaBuilder() {
    // Arrange, Act and Assert
    assertTrue(
        IborCapletFloorletPeriodCurrencyAmounts.meta().builder().build().getAmounts().isEmpty());
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
        IborCapletFloorletPeriodCurrencyAmounts.meta().metaPropertyGet("amounts");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("amounts", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<IborCapletFloorletPeriodCurrencyAmounts> expectedDeclaringTypeResult =
        IborCapletFloorletPeriodCurrencyAmounts.class;
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
    assertNull(IborCapletFloorletPeriodCurrencyAmounts.meta().metaPropertyGet("Property Name"));
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
        IborCapletFloorletPeriodCurrencyAmounts.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("amounts");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("amounts", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<IborCapletFloorletPeriodCurrencyAmounts> expectedDeclaringTypeResult =
        IborCapletFloorletPeriodCurrencyAmounts.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    Meta metaResult = IborCapletFloorletPeriodCurrencyAmounts.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                IborCapletFloorletPeriodCurrencyAmounts.of(new HashMap<>()),
                "Property Name",
                false));
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
        IborCapletFloorletPeriodCurrencyAmounts.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When builder amounts {@link HashMap#HashMap()} build.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when builder amounts HashMap() build; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBuilderAmountsHashMapBuild_thenReturnMap() {
    // Arrange
    Meta metaResult = IborCapletFloorletPeriodCurrencyAmounts.meta();

    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(builderResult.amounts(new HashMap<>()).build(), "amounts", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
            IborCapletFloorletPeriodCurrencyAmounts.meta()
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
            IborCapletFloorletPeriodCurrencyAmounts.meta()
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
            IborCapletFloorletPeriodCurrencyAmounts.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#of(Map)}.
   *
   * <p>Method under test: {@link IborCapletFloorletPeriodCurrencyAmounts#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletPeriodCurrencyAmounts IborCapletFloorletPeriodCurrencyAmounts.of(Map)"
  })
  void testOf() {
    // Arrange
    HashMap<IborCapletFloorletPeriod, CurrencyAmount> currencyAmountMap = new HashMap<>();

    // Act
    IborCapletFloorletPeriodCurrencyAmounts actualOfResult =
        IborCapletFloorletPeriodCurrencyAmounts.of(currencyAmountMap);

    // Assert
    assertEquals(currencyAmountMap, actualOfResult.getAmounts());
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#findAmount(IborCapletFloorletPeriod)}.
   *
   * <p>Method under test: {@link
   * IborCapletFloorletPeriodCurrencyAmounts#findAmount(IborCapletFloorletPeriod)}
   */
  @Test
  @DisplayName("Test findAmount(IborCapletFloorletPeriod)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional IborCapletFloorletPeriodCurrencyAmounts.findAmount(IborCapletFloorletPeriod)"
  })
  void testFindAmount() {
    // Arrange
    IborCapletFloorletPeriodCurrencyAmounts ofResult =
        IborCapletFloorletPeriodCurrencyAmounts.of(new HashMap<>());

    // Act and Assert
    assertFalse(ofResult.findAmount(null).isPresent());
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#getAmount(IborCapletFloorletPeriod)}.
   *
   * <p>Method under test: {@link
   * IborCapletFloorletPeriodCurrencyAmounts#getAmount(IborCapletFloorletPeriod)}
   */
  @Test
  @DisplayName("Test getAmount(IborCapletFloorletPeriod)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount IborCapletFloorletPeriodCurrencyAmounts.getAmount(IborCapletFloorletPeriod)"
  })
  void testGetAmount() {
    // Arrange
    IborCapletFloorletPeriodCurrencyAmounts ofResult =
        IborCapletFloorletPeriodCurrencyAmounts.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getAmount(null));
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#meta()}.
   *
   * <p>Method under test: {@link IborCapletFloorletPeriodCurrencyAmounts#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborCapletFloorletPeriodCurrencyAmounts.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborCapletFloorletPeriodCurrencyAmounts.meta();

    // Assert
    MetaProperty<ImmutableMap<IborCapletFloorletPeriod, CurrencyAmount>> amountsResult =
        actualMetaResult.amounts();
    assertTrue(amountsResult instanceof DirectMetaProperty);
    assertEquals("amounts", amountsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, amountsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, amountsResult.propertyType());
    Class<IborCapletFloorletPeriodCurrencyAmounts> expectedDeclaringTypeResult =
        IborCapletFloorletPeriodCurrencyAmounts.class;
    assertEquals(expectedDeclaringTypeResult, amountsResult.declaringType());
    assertSame(Meta.INSTANCE, amountsResult.metaBean());
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#metaBean()}.
   *
   * <p>Method under test: {@link IborCapletFloorletPeriodCurrencyAmounts#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborCapletFloorletPeriodCurrencyAmounts.metaBean()"})
  void testMetaBean() {
    // Arrange
    IborCapletFloorletPeriodCurrencyAmounts ofResult =
        IborCapletFloorletPeriodCurrencyAmounts.of(new HashMap<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletPeriodCurrencyAmounts#toString()}
   *   <li>{@link IborCapletFloorletPeriodCurrencyAmounts#getAmounts()}
   *   <li>{@link IborCapletFloorletPeriodCurrencyAmounts#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap IborCapletFloorletPeriodCurrencyAmounts.getAmounts()",
    "Builder IborCapletFloorletPeriodCurrencyAmounts.toBuilder()",
    "String IborCapletFloorletPeriodCurrencyAmounts.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();
    IborCapletFloorletPeriodCurrencyAmounts iborCapletFloorletPeriodCurrencyAmounts =
        builderResult.amounts(new HashMap<>()).build();

    // Act
    String actualToStringResult = iborCapletFloorletPeriodCurrencyAmounts.toString();
    ImmutableMap<IborCapletFloorletPeriod, CurrencyAmount> actualAmounts =
        iborCapletFloorletPeriodCurrencyAmounts.getAmounts();
    iborCapletFloorletPeriodCurrencyAmounts.toBuilder();

    // Assert
    assertEquals("IborCapletFloorletPeriodCurrencyAmounts{amounts={}}", actualToStringResult);
    assertTrue(actualAmounts.isEmpty());
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}, and {@link
   * IborCapletFloorletPeriodCurrencyAmounts#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}
   *   <li>{@link IborCapletFloorletPeriodCurrencyAmounts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletPeriodCurrencyAmounts.equals(Object)",
    "int IborCapletFloorletPeriodCurrencyAmounts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();
    IborCapletFloorletPeriodCurrencyAmounts iborCapletFloorletPeriodCurrencyAmounts =
        builderResult.amounts(new HashMap<>()).build();

    Builder builderResult2 = IborCapletFloorletPeriodCurrencyAmounts.builder();
    IborCapletFloorletPeriodCurrencyAmounts iborCapletFloorletPeriodCurrencyAmounts2 =
        builderResult2.amounts(new HashMap<>()).build();

    // Act and Assert
    assertEquals(iborCapletFloorletPeriodCurrencyAmounts, iborCapletFloorletPeriodCurrencyAmounts2);
    assertEquals(
        iborCapletFloorletPeriodCurrencyAmounts.hashCode(),
        iborCapletFloorletPeriodCurrencyAmounts2.hashCode());
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}, and {@link
   * IborCapletFloorletPeriodCurrencyAmounts#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}
   *   <li>{@link IborCapletFloorletPeriodCurrencyAmounts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletPeriodCurrencyAmounts.equals(Object)",
    "int IborCapletFloorletPeriodCurrencyAmounts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();
    IborCapletFloorletPeriodCurrencyAmounts iborCapletFloorletPeriodCurrencyAmounts =
        builderResult.amounts(new HashMap<>()).build();

    // Act and Assert
    assertEquals(iborCapletFloorletPeriodCurrencyAmounts, iborCapletFloorletPeriodCurrencyAmounts);
    int expectedHashCodeResult = iborCapletFloorletPeriodCurrencyAmounts.hashCode();
    assertEquals(expectedHashCodeResult, iborCapletFloorletPeriodCurrencyAmounts.hashCode());
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletPeriodCurrencyAmounts.equals(Object)",
    "int IborCapletFloorletPeriodCurrencyAmounts.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();

    // Act and Assert
    assertNotEquals(builderResult.amounts(new HashMap<>()).build(), null);
  }

  /**
   * Test {@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IborCapletFloorletPeriodCurrencyAmounts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IborCapletFloorletPeriodCurrencyAmounts.equals(Object)",
    "int IborCapletFloorletPeriodCurrencyAmounts.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = IborCapletFloorletPeriodCurrencyAmounts.builder();

    // Act and Assert
    assertNotEquals(
        builderResult.amounts(new HashMap<>()).build(),
        "Different type to IborCapletFloorletPeriodCurrencyAmounts");
  }
}
