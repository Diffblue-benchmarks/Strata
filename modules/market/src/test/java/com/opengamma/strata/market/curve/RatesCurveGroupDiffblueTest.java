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
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.market.curve.CurveTest.TestingCurve;
import com.opengamma.strata.market.curve.RatesCurveGroup.Builder;
import com.opengamma.strata.market.curve.RatesCurveGroup.Meta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
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

class RatesCurveGroupDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroup Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = RatesCurveGroup.builder();
    Builder actualDiscountCurvesResult = actualBuilderResult.discountCurves(new HashMap<>());
    Builder actualForwardCurvesResult = actualDiscountCurvesResult.forwardCurves(new HashMap<>());
    CurveGroupName name = CurveGroupName.of("Name");
    RatesCurveGroup actualRatesCurveGroup = actualForwardCurvesResult.name(name).build();

    // Assert
    assertSame(name, actualRatesCurveGroup.getName());
    assertSame(actualRatesCurveGroup.getDiscountCurves(), actualRatesCurveGroup.getForwardCurves());
  }

  /**
   * Test Builder {@link Builder#discountCurves(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#discountCurves(Map)}
   */
  @Test
  @DisplayName("Test Builder discountCurves(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.discountCurves(Map)"})
  void testBuilderDiscountCurves_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    // Act
    Builder actualDiscountCurvesResult = builderResult.discountCurves(new HashMap<>());

    // Assert
    assertSame(builderResult, actualDiscountCurvesResult);
  }

  /**
   * Test Builder {@link Builder#forwardCurves(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#forwardCurves(Map)}
   */
  @Test
  @DisplayName("Test Builder forwardCurves(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.forwardCurves(Map)"})
  void testBuilderForwardCurves_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    // Act
    Builder actualForwardCurvesResult = builderResult.forwardCurves(new HashMap<>());

    // Assert
    assertSame(builderResult, actualForwardCurvesResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'discountCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDiscountCurves_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult = RatesCurveGroup.builder().get("discountCurves");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code forwardCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'forwardCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenForwardCurves_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult = RatesCurveGroup.builder().get("forwardCurves");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RatesCurveGroup.builder().get("name"));
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
        NoSuchElementException.class, () -> RatesCurveGroup.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#name(CurveGroupName)}.
   *
   * <ul>
   *   <li>Then builder build Name is {@link CurveGroupName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(CurveGroupName)}
   */
  @Test
  @DisplayName(
      "Test Builder name(CurveGroupName); then builder build Name is CurveGroupName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(CurveGroupName)"})
  void testBuilderName_thenBuilderBuildNameIsCurveGroupNameWithName() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();
    CurveGroupName name = CurveGroupName.of("Name");

    // Act
    Builder actualNameResult = builderResult.name(name);

    // Assert
    assertSame(name, builderResult.build().getName());
    assertSame(builderResult, actualNameResult);
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
        () -> RatesCurveGroup.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'discountCurves'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenDiscountCurves_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    // Act
    Builder actualSetResult = builderResult.set("discountCurves", new HashMap<>());

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Class<? extends RatesCurveGroup> actualBeanTypeResult = RatesCurveGroup.meta().beanType();

    // Assert
    Class<RatesCurveGroup> expectedBeanTypeResult = RatesCurveGroup.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#discountCurves()}
   *   <li>{@link Meta#forwardCurves()}
   *   <li>{@link Meta#name()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.discountCurves()",
    "MetaProperty Meta.forwardCurves()",
    "MetaProperty Meta.name()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RatesCurveGroup.meta();

    // Act
    MetaProperty<ImmutableMap<Currency, Curve>> actualDiscountCurvesResult =
        metaResult.discountCurves();
    MetaProperty<ImmutableMap<Index, Curve>> actualForwardCurvesResult = metaResult.forwardCurves();

    // Assert
    assertTrue(actualDiscountCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualForwardCurvesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.name() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then return name is {@code discountCurves}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'discountCurves'; then return name is 'discountCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDiscountCurves_thenReturnNameIsDiscountCurves() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroup.meta().metaPropertyGet("discountCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Index, Curve>> forwardCurvesResult =
        ((Meta) metaBeanResult).forwardCurves();
    assertTrue(forwardCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("discountCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountCurves());
    assertSame(metaBeanResult, forwardCurvesResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code forwardCurves}.
   *   <li>Then return name is {@code forwardCurves}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'forwardCurves'; then return name is 'forwardCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenForwardCurves_thenReturnNameIsForwardCurves() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveGroup.meta().metaPropertyGet("forwardCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Currency, Curve>> discountCurvesResult =
        ((Meta) metaBeanResult).discountCurves();
    assertTrue(discountCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("forwardCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).forwardCurves());
    assertSame(metaBeanResult, discountCurvesResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = RatesCurveGroup.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Currency, Curve>> discountCurvesResult =
        ((Meta) metaBeanResult).discountCurves();
    assertTrue(discountCurvesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, Curve>> forwardCurvesResult =
        ((Meta) metaBeanResult).forwardCurves();
    assertTrue(forwardCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<CurveGroupName> expectedPropertyTypeResult = CurveGroupName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, discountCurvesResult.metaBean());
    assertSame(metaBeanResult, forwardCurvesResult.metaBean());
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
    assertNull(RatesCurveGroup.meta().metaPropertyGet("Property Name"));
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
        RatesCurveGroup.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("name");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("discountCurves");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("forwardCurves");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("discountCurves", getResult2.name());
    assertEquals("forwardCurves", getResult3.name());
    assertEquals("name", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<CurveGroupName> expectedPropertyTypeResult3 = CurveGroupName.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Class<RatesCurveGroup> expectedDeclaringTypeResult = RatesCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<RatesCurveGroup> expectedDeclaringTypeResult2 = RatesCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<RatesCurveGroup> expectedDeclaringTypeResult3 = RatesCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
    assertNull(RatesCurveGroup.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link CurveGroupName} with {@code Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when CurveGroupName with 'Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurveGroupNameWithName_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = RatesCurveGroup.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    RatesCurveGroup bean = RatesCurveGroup.of(name, discountCurves, new HashMap<>());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'discountCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDiscountCurves_thenReturnMap() {
    // Arrange
    Meta metaResult = RatesCurveGroup.meta();

    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            forwardCurvesResult.name(CurveGroupName.of("Name")).build(), "discountCurves", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code forwardCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'forwardCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenForwardCurves_thenReturnMap() {
    // Arrange
    Meta metaResult = RatesCurveGroup.meta();

    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            forwardCurvesResult.name(CurveGroupName.of("Name")).build(), "forwardCurves", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@link CurveGroupName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return CurveGroupName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnCurveGroupNameWithName() {
    // Arrange
    Meta metaResult = RatesCurveGroup.meta();

    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    CurveGroupName name = CurveGroupName.of("Name");

    // Act and Assert
    assertSame(name, metaResult.propertyGet(forwardCurvesResult.name(name).build(), "name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountCurves}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'discountCurves'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDiscountCurves_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroup.meta()
                .propertySet(mock(Bean.class), "discountCurves", "New Value", true));
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
            RatesCurveGroup.meta()
                .propertySet(mock(Bean.class), "discountCurves", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code forwardCurves}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'forwardCurves'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenForwardCurves_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveGroup.meta()
                .propertySet(mock(Bean.class), "forwardCurves", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> RatesCurveGroup.meta().propertySet(mock(Bean.class), "name", "New Value", true));
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
            RatesCurveGroup.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}.
   *
   * <p>Method under test: {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName("Test of(CurveGroupName, Map, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroup RatesCurveGroup.of(CurveGroupName, Map, Map)"})
  void testOf() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.putIfAbsent(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfResult = RatesCurveGroup.of(name, discountCurves, forwardCurves);

    // Assert
    assertEquals(discountCurves, actualOfResult.getDiscountCurves());
    assertEquals(forwardCurves, actualOfResult.getForwardCurves());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}.
   *
   * <p>Method under test: {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName("Test of(CurveGroupName, Map, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroup RatesCurveGroup.of(CurveGroupName, Map, Map)"})
  void testOf2() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.putIfAbsent(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.putIfAbsent(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index3 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult3 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index3,
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfResult = RatesCurveGroup.of(name, discountCurves, forwardCurves);

    // Assert
    assertEquals(discountCurves, actualOfResult.getDiscountCurves());
    assertEquals(forwardCurves, actualOfResult.getForwardCurves());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return ForwardCurves is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Map, Map); given Index; then return ForwardCurves is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroup RatesCurveGroup.of(CurveGroupName, Map, Map)"})
  void testOf_givenIndex_thenReturnForwardCurvesIsHashMap() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfResult = RatesCurveGroup.of(name, discountCurves, forwardCurves);

    // Assert
    assertEquals(discountCurves, actualOfResult.getDiscountCurves());
    assertEquals(forwardCurves, actualOfResult.getForwardCurves());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}.
   *
   * <ul>
   *   <li>Given {@link Index}.
   *   <li>Then return ForwardCurves is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Map, Map); given Index; then return ForwardCurves is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroup RatesCurveGroup.of(CurveGroupName, Map, Map)"})
  void testOf_givenIndex_thenReturnForwardCurvesIsHashMap2() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfResult = RatesCurveGroup.of(name, discountCurves, forwardCurves);

    // Assert
    assertEquals(discountCurves, actualOfResult.getDiscountCurves());
    assertEquals(forwardCurves, actualOfResult.getForwardCurves());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ForwardCurves is DiscountCurves.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Map, Map); when HashMap(); then return ForwardCurves is DiscountCurves")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveGroup RatesCurveGroup.of(CurveGroupName, Map, Map)"})
  void testOf_whenHashMap_thenReturnForwardCurvesIsDiscountCurves() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    // Act
    RatesCurveGroup actualOfResult = RatesCurveGroup.of(name, discountCurves, new HashMap<>());

    // Assert
    ImmutableMap<Currency, Curve> discountCurves2 = actualOfResult.getDiscountCurves();
    assertEquals(discountCurves, discountCurves2);
    assertSame(discountCurves2, actualOfResult.getForwardCurves());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)} with {@code
   * RatesCurveGroupDefinition}, {@code Collection}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Collection) with 'RatesCurveGroupDefinition', 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Collection)"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCollection() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<Curve> curves = new ArrayList<>();

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    curves.add(
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfCurvesResult = RatesCurveGroup.ofCurves(curveGroupDefinition, curves);

    // Assert
    ImmutableMap<Currency, Curve> discountCurves = actualOfCurvesResult.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    assertSame(name, actualOfCurvesResult.getName());
    assertSame(discountCurves, actualOfCurvesResult.getForwardCurves());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)} with {@code
   * RatesCurveGroupDefinition}, {@code Collection}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Collection) with 'RatesCurveGroupDefinition', 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Collection)"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCollection2() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<Curve> curves = new ArrayList<>();

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    curves.add(
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    curves.add(
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfCurvesResult = RatesCurveGroup.ofCurves(curveGroupDefinition, curves);

    // Assert
    ImmutableMap<Currency, Curve> discountCurves = actualOfCurvesResult.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    assertSame(name, actualOfCurvesResult.getName());
    assertSame(discountCurves, actualOfCurvesResult.getForwardCurves());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)} with {@code
   * RatesCurveGroupDefinition}, {@code Collection}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Collection) with 'RatesCurveGroupDefinition', 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Collection)"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCollection3() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    RatesCurveGroupEntry.Builder discountCurrenciesResult =
        curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<Curve> curves = new ArrayList<>();

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    curves.add(
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfCurvesResult = RatesCurveGroup.ofCurves(curveGroupDefinition, curves);

    // Assert
    ImmutableMap<Currency, Curve> discountCurves = actualOfCurvesResult.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    assertSame(name, actualOfCurvesResult.getName());
    assertSame(discountCurves, actualOfCurvesResult.getForwardCurves());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)} with {@code
   * RatesCurveGroupDefinition}, {@code Collection}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Collection) with 'RatesCurveGroupDefinition', 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Collection)"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCollection4() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<Curve> curves = new ArrayList<>();

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    curves.add(
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfCurvesResult = RatesCurveGroup.ofCurves(curveGroupDefinition, curves);

    // Assert
    assertEquals(1, actualOfCurvesResult.getForwardCurves().size());
    assertTrue(actualOfCurvesResult.getDiscountCurves().isEmpty());
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)} with {@code
   * RatesCurveGroupDefinition}, {@code Collection}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Collection) with 'RatesCurveGroupDefinition', 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Collection)"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCollection5() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ArrayList<Curve> curves = new ArrayList<>();

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    curves.add(
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    // Act
    RatesCurveGroup actualOfCurvesResult = RatesCurveGroup.ofCurves(curveGroupDefinition, curves);

    // Assert
    assertEquals(2, actualOfCurvesResult.getForwardCurves().size());
    assertTrue(actualOfCurvesResult.getDiscountCurves().isEmpty());
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)} with {@code
   * RatesCurveGroupDefinition}, {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Collection) with 'RatesCurveGroupDefinition', 'Collection'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Collection)"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCollection_whenArrayList() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, new ArrayList<>());

    // Assert
    ImmutableMap<Currency, Curve> discountCurves = actualOfCurvesResult.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    assertSame(name, actualOfCurvesResult.getName());
    assertSame(discountCurves, actualOfCurvesResult.getForwardCurves());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)} with {@code
   * RatesCurveGroupDefinition}, {@code Collection}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Collection)}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Collection) with 'RatesCurveGroupDefinition', 'Collection'; when ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Collection)"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCollection_whenArrayList2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    RatesCurveGroupEntry.Builder discountCurrenciesResult =
        curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, new ArrayList<>());

    // Assert
    ImmutableMap<Currency, Curve> discountCurves = actualOfCurvesResult.getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    assertSame(name, actualOfCurvesResult.getName());
    assertSame(discountCurves, actualOfCurvesResult.getForwardCurves());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, constantNodalCurve);

    // Assert
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve2() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act and Assert
    assertSame(name, RatesCurveGroup.ofCurves(curveGroupDefinition).getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve3() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve2 =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, constantNodalCurve, constantNodalCurve2);

    // Assert
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve4() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    RatesCurveGroupEntry.Builder discountCurrenciesResult =
        curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    ConstantNodalCurve.Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, constantNodalCurve, constantNodalCurve2);

    // Assert
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve5() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("42");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    ConstantNodalCurve.Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, constantNodalCurve, constantNodalCurve2);

    // Assert
    assertEquals(2, actualOfCurvesResult.getForwardCurves().size());
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <ul>
   *   <li>Then return DiscountCurves is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'; then return DiscountCurves is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve_thenReturnDiscountCurvesIsHashMap() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    ArrayList<CurveDefinition> curveDefinitions = new ArrayList<>();
    HashMap<CurveName, SeasonalityDefinition> seasonalityDefinitions = new HashMap<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, curveDefinitions, seasonalityDefinitions);

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, new TestingCurve(10.0d));

    // Assert
    ImmutableMap<Currency, Curve> discountCurves = actualOfCurvesResult.getDiscountCurves();
    assertEquals(seasonalityDefinitions, discountCurves);
    assertSame(discountCurves, actualOfCurvesResult.getForwardCurves());
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <ul>
   *   <li>Then return ForwardCurves size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'; then return ForwardCurves size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve_thenReturnForwardCurvesSizeIsOne() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    ConstantNodalCurve.Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, constantNodalCurve, constantNodalCurve2);

    // Assert
    assertEquals(1, actualOfCurvesResult.getForwardCurves().size());
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <ul>
   *   <li>Then return ForwardCurves size is two.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'; then return ForwardCurves size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve_thenReturnForwardCurvesSizeIsTwo() {
    // Arrange
    HashSet<Index> indices = new HashSet<>();
    indices.add(mock(Index.class));
    indices.add(mock(Index.class));

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));
    RatesCurveGroupEntry ratesCurveGroupEntry =
        curveNameResult.discountCurrencies(new HashSet<>()).indices(indices).build();

    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();
    entries.add(ratesCurveGroupEntry);
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    ConstantNodalCurve.Builder builderResult3 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve2 =
        builderResult3
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, constantNodalCurve, constantNodalCurve2);

    // Assert
    assertEquals(2, actualOfCurvesResult.getForwardCurves().size());
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <ul>
   *   <li>When {@link TestingCurve#TestingCurve(double)} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'; when TestingCurve(double) with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve_whenTestingCurveWithValueIsTen() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, new TestingCurve(10.0d));

    // Assert
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])} with {@code
   * RatesCurveGroupDefinition}, {@code Curve[]}.
   *
   * <ul>
   *   <li>When {@link TestingCurve#TestingCurve(double)} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#ofCurves(RatesCurveGroupDefinition, Curve[])}
   */
  @Test
  @DisplayName(
      "Test ofCurves(RatesCurveGroupDefinition, Curve[]) with 'RatesCurveGroupDefinition', 'Curve[]'; when TestingCurve(double) with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveGroup RatesCurveGroup.ofCurves(RatesCurveGroupDefinition, Curve[])"
  })
  void testOfCurvesWithRatesCurveGroupDefinitionCurve_whenTestingCurveWithValueIsTen2() {
    // Arrange
    ArrayList<RatesCurveGroupEntry> entries = new ArrayList<>();

    RatesCurveGroupEntry.Builder builderResult = RatesCurveGroupEntry.builder();

    RatesCurveGroupEntry.Builder curveNameResult = builderResult.curveName(CurveName.of("Name"));

    RatesCurveGroupEntry.Builder discountCurrenciesResult =
        curveNameResult.discountCurrencies(new HashSet<>());
    entries.add(discountCurrenciesResult.indices(new HashSet<>()).build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroupDefinition curveGroupDefinition =
        RatesCurveGroupDefinition.of(name, entries, new ArrayList<>());

    // Act
    RatesCurveGroup actualOfCurvesResult =
        RatesCurveGroup.ofCurves(curveGroupDefinition, new TestingCurve(10.0d));

    // Assert
    assertSame(name, actualOfCurvesResult.getName());
  }

  /**
   * Test {@link RatesCurveGroup#findCurve(CurveName)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return {@link Optional#get()} Name is {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#findCurve(CurveName)}
   */
  @Test
  @DisplayName(
      "Test findCurve(CurveName); given CurveName with 'Name'; then return get() Name is CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findCurve(CurveName)"})
  void testFindCurve_givenCurveNameWithName_thenReturnGetNameIsCurveNameWithName() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    forwardCurves.put(index, builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name2, new HashMap<>(), forwardCurves);

    // Act
    Optional<Curve> actualFindCurveResult = ofResult.findCurve(CurveName.of("Name"));

    // Assert
    Curve getResult = actualFindCurveResult.get();
    assertTrue(getResult instanceof ConstantNodalCurve);
    assertSame(name, getResult.getName());
    assertSame(metadata, getResult.getMetadata());
    assertArrayEquals(
        new double[] {10.0d}, ((ConstantNodalCurve) getResult).getXValues().toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {10.0d}, ((ConstantNodalCurve) getResult).getYValues().toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link RatesCurveGroup#findCurve(CurveName)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return {@link Optional#get()} ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#findCurve(CurveName)}
   */
  @Test
  @DisplayName(
      "Test findCurve(CurveName); given CurveName with 'Name'; then return get() ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findCurve(CurveName)"})
  void testFindCurve_givenCurveNameWithName_thenReturnGetParameterCountIsOne() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, new HashMap<>(), forwardCurves);

    // Act
    Optional<Curve> actualFindCurveResult = ofResult.findCurve(CurveName.of("Name"));

    // Assert
    Curve getResult = actualFindCurveResult.get();
    assertTrue(getResult instanceof ConstantNodalCurve);
    assertEquals(1, getResult.getParameterCount());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getXValue());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getYValue());
    assertTrue(actualFindCurveResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#findCurve(CurveName)}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#findCurve(CurveName)}
   */
  @Test
  @DisplayName("Test findCurve(CurveName); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findCurve(CurveName)"})
  void testFindCurve_thenReturnNotPresent() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, discountCurves, new HashMap<>());

    // Act
    Optional<Curve> actualFindCurveResult = ofResult.findCurve(CurveName.of("Name"));

    // Assert
    assertFalse(actualFindCurveResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#findDiscountCurve(Currency)}.
   *
   * <p>Method under test: {@link RatesCurveGroup#findDiscountCurve(Currency)}
   */
  @Test
  @DisplayName("Test findDiscountCurve(Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findDiscountCurve(Currency)"})
  void testFindDiscountCurve() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, discountCurves, new HashMap<>());

    // Act and Assert
    assertFalse(ofResult.findDiscountCurve(null).isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#findForwardCurve(Index)}.
   *
   * <p>Method under test: {@link RatesCurveGroup#findForwardCurve(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurve(Index)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findForwardCurve(Index)"})
  void testFindForwardCurve() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, discountCurves, new HashMap<>());

    // Act
    Optional<Curve> actualFindForwardCurveResult = ofResult.findForwardCurve(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#findForwardCurve(Index)}.
   *
   * <p>Method under test: {@link RatesCurveGroup#findForwardCurve(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurve(Index)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findForwardCurve(Index)"})
  void testFindForwardCurve2() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.putIfAbsent(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, new HashMap<>(), forwardCurves);

    // Act
    Optional<Curve> actualFindForwardCurveResult = ofResult.findForwardCurve(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#findForwardCurve(Index)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#findForwardCurve(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurve(Index); given CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findForwardCurve(Index)"})
  void testFindForwardCurve_givenCurveNameWithName() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, new HashMap<>(), forwardCurves);

    // Act
    Optional<Curve> actualFindForwardCurveResult = ofResult.findForwardCurve(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#findForwardCurve(Index)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#findForwardCurve(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurve(Index); given CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findForwardCurve(Index)"})
  void testFindForwardCurve_givenCurveNameWithName2() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, new HashMap<>(), forwardCurves);

    // Act
    Optional<Curve> actualFindForwardCurveResult = ofResult.findForwardCurve(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#findForwardCurve(Index)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#findForwardCurve(Index)}
   */
  @Test
  @DisplayName("Test findForwardCurve(Index); given CurveName with 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional RatesCurveGroup.findForwardCurve(Index)"})
  void testFindForwardCurve_givenCurveNameWithName3() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, new HashMap<>(), forwardCurves);

    // Act
    Optional<Curve> actualFindForwardCurveResult = ofResult.findForwardCurve(mock(Index.class));

    // Assert
    assertFalse(actualFindForwardCurveResult.isPresent());
  }

  /**
   * Test {@link RatesCurveGroup#stream()}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#stream()}
   */
  @Test
  @DisplayName(
      "Test stream(); given CurveName with 'Name'; then return limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream RatesCurveGroup.stream()"})
  void testStream_givenCurveNameWithName_thenReturnLimitFiveCollectToListSizeIsOne() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    forwardCurves.put(index, builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build());
    CurveGroupName name2 = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name2, new HashMap<>(), forwardCurves);

    // Act
    Stream<Curve> actualStreamResult = ofResult.stream();

    // Assert
    List<Curve> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    Curve getResult = collectResult.get(0);
    assertTrue(getResult instanceof ConstantNodalCurve);
    CurveMetadata metadata2 = getResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    assertEquals(1, getResult.getParameterCount());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getXValue());
    assertEquals(10.0d, ((ConstantNodalCurve) getResult).getYValue());
    assertSame(name, getResult.getName());
    assertSame(metadata, metadata2);
  }

  /**
   * Test {@link RatesCurveGroup#stream()}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#stream()}
   */
  @Test
  @DisplayName(
      "Test stream(); given CurveName with 'Name'; then return limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream RatesCurveGroup.stream()"})
  void testStream_givenCurveNameWithName_thenReturnLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    Index index2 = mock(Index.class);

    ConstantNodalCurve.Builder builderResult2 = ConstantNodalCurve.builder();
    forwardCurves.put(
        index2,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
    CurveGroupName name = CurveGroupName.of("Name");

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, new HashMap<>(), forwardCurves);

    // Act
    Stream<Curve> actualStreamResult = ofResult.stream();

    // Assert
    List<Curve> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    Curve getResult = collectResult.get(1);
    assertTrue(getResult instanceof ConstantNodalCurve);
    assertEquals(collectResult.get(0), getResult);
  }

  /**
   * Test {@link RatesCurveGroup#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream RatesCurveGroup.stream()"})
  void testStream_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, discountCurves, new HashMap<>());

    // Act
    Stream<Curve> actualStreamResult = ofResult.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link RatesCurveGroup#meta()}.
   *
   * <p>Method under test: {@link RatesCurveGroup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveGroup.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RatesCurveGroup.meta();

    // Assert
    MetaProperty<ImmutableMap<Currency, Curve>> discountCurvesResult =
        actualMetaResult.discountCurves();
    assertTrue(discountCurvesResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Index, Curve>> forwardCurvesResult = actualMetaResult.forwardCurves();
    assertTrue(forwardCurvesResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = actualMetaResult.name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("discountCurves", discountCurvesResult.name());
    assertEquals("forwardCurves", forwardCurvesResult.name());
    assertEquals("name", nameResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, discountCurvesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, forwardCurvesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, nameResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, discountCurvesResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, forwardCurvesResult.propertyType());
    Class<CurveGroupName> expectedPropertyTypeResult3 = CurveGroupName.class;
    assertEquals(expectedPropertyTypeResult3, nameResult.propertyType());
    Class<RatesCurveGroup> expectedDeclaringTypeResult = RatesCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult, discountCurvesResult.declaringType());
    Class<RatesCurveGroup> expectedDeclaringTypeResult2 = RatesCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult2, forwardCurvesResult.declaringType());
    Class<RatesCurveGroup> expectedDeclaringTypeResult3 = RatesCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult3, nameResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, discountCurvesResult.metaBean());
    assertSame(meta, forwardCurvesResult.metaBean());
    assertSame(meta, nameResult.metaBean());
  }

  /**
   * Test {@link RatesCurveGroup#metaBean()}.
   *
   * <p>Method under test: {@link RatesCurveGroup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveGroup.metaBean()"})
  void testMetaBean() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Currency, Curve> discountCurves = new HashMap<>();

    RatesCurveGroup ofResult = RatesCurveGroup.of(name, discountCurves, new HashMap<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroup#toString()}
   *   <li>{@link RatesCurveGroup#getDiscountCurves()}
   *   <li>{@link RatesCurveGroup#getForwardCurves()}
   *   <li>{@link RatesCurveGroup#getName()}
   *   <li>{@link RatesCurveGroup#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCurveGroup.getDiscountCurves()",
    "ImmutableMap RatesCurveGroup.getForwardCurves()",
    "CurveGroupName RatesCurveGroup.getName()",
    "Builder RatesCurveGroup.toBuilder()",
    "String RatesCurveGroup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    CurveGroupName name = CurveGroupName.of("Name");
    RatesCurveGroup ratesCurveGroup = forwardCurvesResult.name(name).build();

    // Act
    String actualToStringResult = ratesCurveGroup.toString();
    ImmutableMap<Currency, Curve> actualDiscountCurves = ratesCurveGroup.getDiscountCurves();
    ImmutableMap<Index, Curve> actualForwardCurves = ratesCurveGroup.getForwardCurves();
    CurveGroupName actualName = ratesCurveGroup.getName();
    ratesCurveGroup.toBuilder();

    // Assert
    assertEquals(
        "RatesCurveGroup{name=Name, discountCurves={}, forwardCurves={}}", actualToStringResult);
    assertSame(actualDiscountCurves, actualForwardCurves);
    assertSame(name, actualName);
  }

  /**
   * Test {@link RatesCurveGroup#equals(Object)}, and {@link RatesCurveGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroup#equals(Object)}
   *   <li>{@link RatesCurveGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveGroup.equals(Object)", "int RatesCurveGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    RatesCurveGroup ratesCurveGroup = forwardCurvesResult.name(CurveGroupName.of("Name")).build();

    Builder builderResult2 = RatesCurveGroup.builder();

    Builder discountCurvesResult2 = builderResult2.discountCurves(new HashMap<>());

    Builder forwardCurvesResult2 = discountCurvesResult2.forwardCurves(new HashMap<>());
    RatesCurveGroup ratesCurveGroup2 = forwardCurvesResult2.name(CurveGroupName.of("Name")).build();

    // Act and Assert
    assertEquals(ratesCurveGroup, ratesCurveGroup2);
    assertEquals(ratesCurveGroup.hashCode(), ratesCurveGroup2.hashCode());
  }

  /**
   * Test {@link RatesCurveGroup#equals(Object)}, and {@link RatesCurveGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroup#equals(Object)}
   *   <li>{@link RatesCurveGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveGroup.equals(Object)", "int RatesCurveGroup.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    RatesCurveGroup ratesCurveGroup = forwardCurvesResult.name(CurveGroupName.of("Name")).build();

    // Act and Assert
    assertEquals(ratesCurveGroup, ratesCurveGroup);
    int expectedHashCodeResult = ratesCurveGroup.hashCode();
    assertEquals(expectedHashCodeResult, ratesCurveGroup.hashCode());
  }

  /**
   * Test {@link RatesCurveGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveGroup.equals(Object)", "int RatesCurveGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Index, Curve> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);

    ConstantNodalCurve.Builder builderResult = ConstantNodalCurve.builder();
    forwardCurves.put(
        index,
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());

    Builder builderResult2 = RatesCurveGroup.builder();

    Builder forwardCurvesResult =
        builderResult2.discountCurves(new HashMap<>()).forwardCurves(forwardCurves);
    RatesCurveGroup ratesCurveGroup = forwardCurvesResult.name(CurveGroupName.of("Name")).build();

    Builder builderResult3 = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult3.discountCurves(new HashMap<>());

    Builder forwardCurvesResult2 = discountCurvesResult.forwardCurves(new HashMap<>());

    // Act and Assert
    assertNotEquals(ratesCurveGroup, forwardCurvesResult2.name(CurveGroupName.of("Name")).build());
  }

  /**
   * Test {@link RatesCurveGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveGroup.equals(Object)", "int RatesCurveGroup.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    RatesCurveGroup ratesCurveGroup = forwardCurvesResult.name(CurveGroupName.of("42")).build();

    Builder builderResult2 = RatesCurveGroup.builder();

    Builder discountCurvesResult2 = builderResult2.discountCurves(new HashMap<>());

    Builder forwardCurvesResult2 = discountCurvesResult2.forwardCurves(new HashMap<>());

    // Act and Assert
    assertNotEquals(ratesCurveGroup, forwardCurvesResult2.name(CurveGroupName.of("Name")).build());
  }

  /**
   * Test {@link RatesCurveGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveGroup.equals(Object)", "int RatesCurveGroup.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());

    // Act and Assert
    assertNotEquals(forwardCurvesResult.name(CurveGroupName.of("Name")).build(), null);
  }

  /**
   * Test {@link RatesCurveGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveGroup.equals(Object)", "int RatesCurveGroup.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());

    // Act and Assert
    assertNotEquals(
        forwardCurvesResult.name(CurveGroupName.of("Name")).build(),
        "Different type to RatesCurveGroup");
  }
}
