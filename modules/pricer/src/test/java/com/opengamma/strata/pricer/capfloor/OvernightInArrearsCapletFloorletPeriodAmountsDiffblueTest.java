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
import com.opengamma.strata.pricer.capfloor.OvernightInArrearsCapletFloorletPeriodAmounts.Builder;
import com.opengamma.strata.pricer.capfloor.OvernightInArrearsCapletFloorletPeriodAmounts.Meta;
import com.opengamma.strata.product.capfloor.OvernightInArrearsCapletFloorletPeriod;
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

class OvernightInArrearsCapletFloorletPeriodAmountsDiffblueTest {
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
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();
    HashMap<OvernightInArrearsCapletFloorletPeriod, Double> amounts = new HashMap<>();

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
    Object actualGetResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder().get("amounts");

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
        () -> OvernightInArrearsCapletFloorletPeriodAmounts.builder().get("Property Name"));
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
        () ->
            OvernightInArrearsCapletFloorletPeriodAmounts.builder()
                .set("Property Name", "New Value"));
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
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();

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
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();

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
        OvernightInArrearsCapletFloorletPeriodAmounts.meta().amounts()
            instanceof DirectMetaProperty);
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
    Class<? extends OvernightInArrearsCapletFloorletPeriodAmounts> actualBeanTypeResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.meta().beanType();

    // Assert
    Class<OvernightInArrearsCapletFloorletPeriodAmounts> expectedBeanTypeResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.class;
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
        OvernightInArrearsCapletFloorletPeriodAmounts.meta()
            .builder()
            .build()
            .getAmounts()
            .isEmpty());
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
        OvernightInArrearsCapletFloorletPeriodAmounts.meta().metaPropertyGet("amounts");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("amounts", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<OvernightInArrearsCapletFloorletPeriodAmounts> expectedDeclaringTypeResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.class;
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
    assertNull(
        OvernightInArrearsCapletFloorletPeriodAmounts.meta().metaPropertyGet("Property Name"));
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
        OvernightInArrearsCapletFloorletPeriodAmounts.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("amounts");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("amounts", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<OvernightInArrearsCapletFloorletPeriodAmounts> expectedDeclaringTypeResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.class;
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
    Meta metaResult = OvernightInArrearsCapletFloorletPeriodAmounts.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                OvernightInArrearsCapletFloorletPeriodAmounts.of(new HashMap<>()),
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
        OvernightInArrearsCapletFloorletPeriodAmounts.meta()
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
    Meta metaResult = OvernightInArrearsCapletFloorletPeriodAmounts.meta();

    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();

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
            OvernightInArrearsCapletFloorletPeriodAmounts.meta()
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
            OvernightInArrearsCapletFloorletPeriodAmounts.meta()
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
            OvernightInArrearsCapletFloorletPeriodAmounts.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link OvernightInArrearsCapletFloorletPeriodAmounts#of(Map)}.
   *
   * <p>Method under test: {@link OvernightInArrearsCapletFloorletPeriodAmounts#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightInArrearsCapletFloorletPeriodAmounts OvernightInArrearsCapletFloorletPeriodAmounts.of(Map)"
  })
  void testOf() {
    // Arrange
    HashMap<OvernightInArrearsCapletFloorletPeriod, Double> doubleMap = new HashMap<>();

    // Act
    OvernightInArrearsCapletFloorletPeriodAmounts actualOfResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.of(doubleMap);

    // Assert
    assertEquals(doubleMap, actualOfResult.getAmounts());
  }

  /**
   * Test {@link
   * OvernightInArrearsCapletFloorletPeriodAmounts#findAmount(OvernightInArrearsCapletFloorletPeriod)}.
   *
   * <p>Method under test: {@link
   * OvernightInArrearsCapletFloorletPeriodAmounts#findAmount(OvernightInArrearsCapletFloorletPeriod)}
   */
  @Test
  @DisplayName("Test findAmount(OvernightInArrearsCapletFloorletPeriod)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional OvernightInArrearsCapletFloorletPeriodAmounts.findAmount(OvernightInArrearsCapletFloorletPeriod)"
  })
  void testFindAmount() {
    // Arrange
    OvernightInArrearsCapletFloorletPeriodAmounts ofResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.of(new HashMap<>());

    // Act and Assert
    assertFalse(ofResult.findAmount(null).isPresent());
  }

  /**
   * Test {@link
   * OvernightInArrearsCapletFloorletPeriodAmounts#getAmount(OvernightInArrearsCapletFloorletPeriod)}.
   *
   * <p>Method under test: {@link
   * OvernightInArrearsCapletFloorletPeriodAmounts#getAmount(OvernightInArrearsCapletFloorletPeriod)}
   */
  @Test
  @DisplayName("Test getAmount(OvernightInArrearsCapletFloorletPeriod)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double OvernightInArrearsCapletFloorletPeriodAmounts.getAmount(OvernightInArrearsCapletFloorletPeriod)"
  })
  void testGetAmount() {
    // Arrange
    OvernightInArrearsCapletFloorletPeriodAmounts ofResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.of(new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getAmount(null));
  }

  /**
   * Test {@link OvernightInArrearsCapletFloorletPeriodAmounts#meta()}.
   *
   * <p>Method under test: {@link OvernightInArrearsCapletFloorletPeriodAmounts#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta OvernightInArrearsCapletFloorletPeriodAmounts.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = OvernightInArrearsCapletFloorletPeriodAmounts.meta();

    // Assert
    MetaProperty<ImmutableMap<OvernightInArrearsCapletFloorletPeriod, Double>> amountsResult =
        actualMetaResult.amounts();
    assertTrue(amountsResult instanceof DirectMetaProperty);
    assertEquals("amounts", amountsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, amountsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, amountsResult.propertyType());
    Class<OvernightInArrearsCapletFloorletPeriodAmounts> expectedDeclaringTypeResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.class;
    assertEquals(expectedDeclaringTypeResult, amountsResult.declaringType());
    assertSame(Meta.INSTANCE, amountsResult.metaBean());
  }

  /**
   * Test {@link OvernightInArrearsCapletFloorletPeriodAmounts#metaBean()}.
   *
   * <p>Method under test: {@link OvernightInArrearsCapletFloorletPeriodAmounts#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta OvernightInArrearsCapletFloorletPeriodAmounts.metaBean()"})
  void testMetaBean() {
    // Arrange
    OvernightInArrearsCapletFloorletPeriodAmounts ofResult =
        OvernightInArrearsCapletFloorletPeriodAmounts.of(new HashMap<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightInArrearsCapletFloorletPeriodAmounts#toString()}
   *   <li>{@link OvernightInArrearsCapletFloorletPeriodAmounts#getAmounts()}
   *   <li>{@link OvernightInArrearsCapletFloorletPeriodAmounts#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap OvernightInArrearsCapletFloorletPeriodAmounts.getAmounts()",
    "Builder OvernightInArrearsCapletFloorletPeriodAmounts.toBuilder()",
    "String OvernightInArrearsCapletFloorletPeriodAmounts.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();
    OvernightInArrearsCapletFloorletPeriodAmounts overnightInArrearsCapletFloorletPeriodAmounts =
        builderResult.amounts(new HashMap<>()).build();

    // Act
    String actualToStringResult = overnightInArrearsCapletFloorletPeriodAmounts.toString();
    ImmutableMap<OvernightInArrearsCapletFloorletPeriod, Double> actualAmounts =
        overnightInArrearsCapletFloorletPeriodAmounts.getAmounts();
    overnightInArrearsCapletFloorletPeriodAmounts.toBuilder();

    // Assert
    assertEquals("OvernightInArrearsCapletFloorletPeriodAmounts{amounts={}}", actualToStringResult);
    assertTrue(actualAmounts.isEmpty());
  }

  /**
   * Test {@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}, and {@link
   * OvernightInArrearsCapletFloorletPeriodAmounts#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}
   *   <li>{@link OvernightInArrearsCapletFloorletPeriodAmounts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightInArrearsCapletFloorletPeriodAmounts.equals(Object)",
    "int OvernightInArrearsCapletFloorletPeriodAmounts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();
    OvernightInArrearsCapletFloorletPeriodAmounts overnightInArrearsCapletFloorletPeriodAmounts =
        builderResult.amounts(new HashMap<>()).build();

    Builder builderResult2 = OvernightInArrearsCapletFloorletPeriodAmounts.builder();
    OvernightInArrearsCapletFloorletPeriodAmounts overnightInArrearsCapletFloorletPeriodAmounts2 =
        builderResult2.amounts(new HashMap<>()).build();

    // Act and Assert
    assertEquals(
        overnightInArrearsCapletFloorletPeriodAmounts,
        overnightInArrearsCapletFloorletPeriodAmounts2);
    assertEquals(
        overnightInArrearsCapletFloorletPeriodAmounts.hashCode(),
        overnightInArrearsCapletFloorletPeriodAmounts2.hashCode());
  }

  /**
   * Test {@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}, and {@link
   * OvernightInArrearsCapletFloorletPeriodAmounts#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}
   *   <li>{@link OvernightInArrearsCapletFloorletPeriodAmounts#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightInArrearsCapletFloorletPeriodAmounts.equals(Object)",
    "int OvernightInArrearsCapletFloorletPeriodAmounts.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();
    OvernightInArrearsCapletFloorletPeriodAmounts overnightInArrearsCapletFloorletPeriodAmounts =
        builderResult.amounts(new HashMap<>()).build();

    // Act and Assert
    assertEquals(
        overnightInArrearsCapletFloorletPeriodAmounts,
        overnightInArrearsCapletFloorletPeriodAmounts);
    int expectedHashCodeResult = overnightInArrearsCapletFloorletPeriodAmounts.hashCode();
    assertEquals(expectedHashCodeResult, overnightInArrearsCapletFloorletPeriodAmounts.hashCode());
  }

  /**
   * Test {@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightInArrearsCapletFloorletPeriodAmounts.equals(Object)",
    "int OvernightInArrearsCapletFloorletPeriodAmounts.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();

    // Act and Assert
    assertNotEquals(builderResult.amounts(new HashMap<>()).build(), null);
  }

  /**
   * Test {@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link OvernightInArrearsCapletFloorletPeriodAmounts#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean OvernightInArrearsCapletFloorletPeriodAmounts.equals(Object)",
    "int OvernightInArrearsCapletFloorletPeriodAmounts.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = OvernightInArrearsCapletFloorletPeriodAmounts.builder();

    // Act and Assert
    assertNotEquals(
        builderResult.amounts(new HashMap<>()).build(),
        "Different type to OvernightInArrearsCapletFloorletPeriodAmounts");
  }
}
