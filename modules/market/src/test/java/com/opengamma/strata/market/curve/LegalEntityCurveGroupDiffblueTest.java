package com.opengamma.strata.market.curve;

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
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.market.curve.LegalEntityCurveGroup.Builder;
import com.opengamma.strata.market.curve.LegalEntityCurveGroup.Meta;
import java.util.HashMap;
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

class LegalEntityCurveGroupDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityCurveGroup Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = LegalEntityCurveGroup.builder();
    CurveGroupName name = CurveGroupName.of("Name");
    Builder actualNameResult = actualBuilderResult.name(name);
    LegalEntityCurveGroup actualLegalEntityCurveGroup =
        actualNameResult.repoCurves(new HashMap<>()).build();

    // Assert
    assertSame(name, actualLegalEntityCurveGroup.getName());
    assertSame(
        actualLegalEntityCurveGroup.getIssuerCurves(), actualLegalEntityCurveGroup.getRepoCurves());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code issuerCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'issuerCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIssuerCurves_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult = LegalEntityCurveGroup.builder().get("issuerCurves");

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
    assertNull(LegalEntityCurveGroup.builder().get("name"));
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
        NoSuchElementException.class, () -> LegalEntityCurveGroup.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code repoCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'repoCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRepoCurves_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult = LegalEntityCurveGroup.builder().get("repoCurves");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#issuerCurves(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#issuerCurves(Map)}
   */
  @Test
  @DisplayName("Test Builder issuerCurves(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.issuerCurves(Map)"})
  void testBuilderIssuerCurves_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    // Act
    Builder actualIssuerCurvesResult = builderResult.issuerCurves(new HashMap<>());

    // Assert
    assertSame(builderResult, actualIssuerCurvesResult);
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
    Builder builderResult = LegalEntityCurveGroup.builder();
    CurveGroupName name = CurveGroupName.of("Name");

    // Act
    Builder actualNameResult = builderResult.name(name);

    // Assert
    assertSame(name, builderResult.build().getName());
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#repoCurves(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#repoCurves(Map)}
   */
  @Test
  @DisplayName("Test Builder repoCurves(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.repoCurves(Map)"})
  void testBuilderRepoCurves_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    // Act
    Builder actualRepoCurvesResult = builderResult.repoCurves(new HashMap<>());

    // Assert
    assertSame(builderResult, actualRepoCurvesResult);
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
        () -> LegalEntityCurveGroup.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code issuerCurves}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'issuerCurves'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenIssuerCurves_thenReturnBuilder() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    // Act
    Builder actualSetResult = builderResult.set("issuerCurves", new HashMap<>());

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
    Builder builderResult = LegalEntityCurveGroup.builder();

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
    Class<? extends LegalEntityCurveGroup> actualBeanTypeResult =
        LegalEntityCurveGroup.meta().beanType();

    // Assert
    Class<LegalEntityCurveGroup> expectedBeanTypeResult = LegalEntityCurveGroup.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#issuerCurves()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#repoCurves()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.issuerCurves()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.repoCurves()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = LegalEntityCurveGroup.meta();

    // Act
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, Curve>> actualIssuerCurvesResult =
        metaResult.issuerCurves();
    MetaProperty<CurveGroupName> actualNameResult = metaResult.name();

    // Assert
    assertTrue(actualIssuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.repoCurves() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code issuerCurves}.
   *   <li>Then return name is {@code issuerCurves}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'issuerCurves'; then return name is 'issuerCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIssuerCurves_thenReturnNameIsIssuerCurves() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        LegalEntityCurveGroup.meta().metaPropertyGet("issuerCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, Curve>> repoCurvesResult =
        ((Meta) metaBeanResult).repoCurves();
    assertTrue(repoCurvesResult instanceof DirectMetaProperty);
    assertEquals("issuerCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).issuerCurves());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, repoCurvesResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult =
        LegalEntityCurveGroup.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, Curve>> issuerCurvesResult =
        ((Meta) metaBeanResult).issuerCurves();
    assertTrue(issuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, Curve>> repoCurvesResult =
        ((Meta) metaBeanResult).repoCurves();
    assertTrue(repoCurvesResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<CurveGroupName> expectedPropertyTypeResult = CurveGroupName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, issuerCurvesResult.metaBean());
    assertSame(metaBeanResult, repoCurvesResult.metaBean());
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
    assertNull(LegalEntityCurveGroup.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code repoCurves}.
   *   <li>Then return name is {@code repoCurves}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'repoCurves'; then return name is 'repoCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRepoCurves_thenReturnNameIsRepoCurves() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        LegalEntityCurveGroup.meta().metaPropertyGet("repoCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, Curve>> issuerCurvesResult =
        ((Meta) metaBeanResult).issuerCurves();
    assertTrue(issuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("repoCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).repoCurves());
    assertSame(metaBeanResult, issuerCurvesResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
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
        LegalEntityCurveGroup.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("name");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("issuerCurves");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("repoCurves");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("issuerCurves", getResult2.name());
    assertEquals("name", getResult.name());
    assertEquals("repoCurves", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<CurveGroupName> expectedPropertyTypeResult3 = CurveGroupName.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Class<LegalEntityCurveGroup> expectedDeclaringTypeResult = LegalEntityCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<LegalEntityCurveGroup> expectedDeclaringTypeResult2 = LegalEntityCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<LegalEntityCurveGroup> expectedDeclaringTypeResult3 = LegalEntityCurveGroup.class;
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
    assertNull(LegalEntityCurveGroup.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = LegalEntityCurveGroup.meta();
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Pair<RepoGroup, Currency>, Curve> repoCurves = new HashMap<>();

    LegalEntityCurveGroup bean = LegalEntityCurveGroup.of(name, repoCurves, new HashMap<>());

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code issuerCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'issuerCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenIssuerCurves_thenReturnMap() {
    // Arrange
    Meta metaResult = LegalEntityCurveGroup.meta();

    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            nameResult.repoCurves(new HashMap<>()).build(), "issuerCurves", true);

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
    Meta metaResult = LegalEntityCurveGroup.meta();

    Builder builderResult = LegalEntityCurveGroup.builder();
    CurveGroupName name = CurveGroupName.of("Name");

    Builder nameResult = builderResult.name(name);

    // Act and Assert
    assertSame(
        name, metaResult.propertyGet(nameResult.repoCurves(new HashMap<>()).build(), "name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoCurves}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'repoCurves'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenRepoCurves_thenReturnMap() {
    // Arrange
    Meta metaResult = LegalEntityCurveGroup.meta();

    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(nameResult.repoCurves(new HashMap<>()).build(), "repoCurves", true);

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
            LegalEntityCurveGroup.meta()
                .propertySet(mock(Bean.class), "issuerCurves", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code issuerCurves}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'issuerCurves'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIssuerCurves_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            LegalEntityCurveGroup.meta()
                .propertySet(mock(Bean.class), "issuerCurves", "New Value", true));
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
        () ->
            LegalEntityCurveGroup.meta().propertySet(mock(Bean.class), "name", "New Value", true));
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
            LegalEntityCurveGroup.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoCurves}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'repoCurves'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRepoCurves_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            LegalEntityCurveGroup.meta()
                .propertySet(mock(Bean.class), "repoCurves", "New Value", true));
  }

  /**
   * Test {@link LegalEntityCurveGroup#of(CurveGroupName, Map, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return IssuerCurves Empty.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName("Test of(CurveGroupName, Map, Map); when HashMap(); then return IssuerCurves Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityCurveGroup LegalEntityCurveGroup.of(CurveGroupName, Map, Map)"})
  void testOf_whenHashMap_thenReturnIssuerCurvesEmpty() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Pair<RepoGroup, Currency>, Curve> repoCurves = new HashMap<>();

    // Act
    LegalEntityCurveGroup actualOfResult =
        LegalEntityCurveGroup.of(name, repoCurves, new HashMap<>());

    // Assert
    ImmutableMap<Pair<LegalEntityGroup, Currency>, Curve> issuerCurves =
        actualOfResult.getIssuerCurves();
    assertTrue(issuerCurves.isEmpty());
    assertSame(name, actualOfResult.getName());
    assertSame(issuerCurves, actualOfResult.getRepoCurves());
  }

  /**
   * Test {@link LegalEntityCurveGroup#findCurve(CurveName)}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#findCurve(CurveName)}
   */
  @Test
  @DisplayName("Test findCurve(CurveName)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LegalEntityCurveGroup.findCurve(CurveName)"})
  void testFindCurve() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Pair<RepoGroup, Currency>, Curve> repoCurves = new HashMap<>();

    LegalEntityCurveGroup ofResult = LegalEntityCurveGroup.of(name, repoCurves, new HashMap<>());

    // Act
    Optional<Curve> actualFindCurveResult = ofResult.findCurve(CurveName.of("Name"));

    // Assert
    assertFalse(actualFindCurveResult.isPresent());
  }

  /**
   * Test {@link LegalEntityCurveGroup#stream()}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream LegalEntityCurveGroup.stream()"})
  void testStream() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Pair<RepoGroup, Currency>, Curve> repoCurves = new HashMap<>();

    LegalEntityCurveGroup ofResult = LegalEntityCurveGroup.of(name, repoCurves, new HashMap<>());

    // Act
    Stream<Curve> actualStreamResult = ofResult.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link LegalEntityCurveGroup#repoCurveStream()}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#repoCurveStream()}
   */
  @Test
  @DisplayName("Test repoCurveStream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream LegalEntityCurveGroup.repoCurveStream()"})
  void testRepoCurveStream() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Pair<RepoGroup, Currency>, Curve> repoCurves = new HashMap<>();

    LegalEntityCurveGroup ofResult = LegalEntityCurveGroup.of(name, repoCurves, new HashMap<>());

    // Act
    Stream<Curve> actualRepoCurveStreamResult = ofResult.repoCurveStream();

    // Assert
    assertTrue(actualRepoCurveStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link LegalEntityCurveGroup#issuerCurveStream()}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#issuerCurveStream()}
   */
  @Test
  @DisplayName("Test issuerCurveStream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream LegalEntityCurveGroup.issuerCurveStream()"})
  void testIssuerCurveStream() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Pair<RepoGroup, Currency>, Curve> repoCurves = new HashMap<>();

    LegalEntityCurveGroup ofResult = LegalEntityCurveGroup.of(name, repoCurves, new HashMap<>());

    // Act
    Stream<Curve> actualIssuerCurveStreamResult = ofResult.issuerCurveStream();

    // Assert
    assertTrue(actualIssuerCurveStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link LegalEntityCurveGroup#meta()}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LegalEntityCurveGroup.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LegalEntityCurveGroup.meta();

    // Assert
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, Curve>> issuerCurvesResult =
        actualMetaResult.issuerCurves();
    assertTrue(issuerCurvesResult instanceof DirectMetaProperty);
    MetaProperty<CurveGroupName> nameResult = actualMetaResult.name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, Curve>> repoCurvesResult =
        actualMetaResult.repoCurves();
    assertTrue(repoCurvesResult instanceof DirectMetaProperty);
    assertEquals("issuerCurves", issuerCurvesResult.name());
    assertEquals("name", nameResult.name());
    assertEquals("repoCurves", repoCurvesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, issuerCurvesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, nameResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, repoCurvesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, issuerCurvesResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, repoCurvesResult.propertyType());
    Class<CurveGroupName> expectedPropertyTypeResult3 = CurveGroupName.class;
    assertEquals(expectedPropertyTypeResult3, nameResult.propertyType());
    Class<LegalEntityCurveGroup> expectedDeclaringTypeResult = LegalEntityCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult, issuerCurvesResult.declaringType());
    Class<LegalEntityCurveGroup> expectedDeclaringTypeResult2 = LegalEntityCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult2, nameResult.declaringType());
    Class<LegalEntityCurveGroup> expectedDeclaringTypeResult3 = LegalEntityCurveGroup.class;
    assertEquals(expectedDeclaringTypeResult3, repoCurvesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, issuerCurvesResult.metaBean());
    assertSame(meta, nameResult.metaBean());
    assertSame(meta, repoCurvesResult.metaBean());
  }

  /**
   * Test {@link LegalEntityCurveGroup#metaBean()}.
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LegalEntityCurveGroup.metaBean()"})
  void testMetaBean() {
    // Arrange
    CurveGroupName name = CurveGroupName.of("Name");
    HashMap<Pair<RepoGroup, Currency>, Curve> repoCurves = new HashMap<>();

    LegalEntityCurveGroup ofResult = LegalEntityCurveGroup.of(name, repoCurves, new HashMap<>());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegalEntityCurveGroup#toString()}
   *   <li>{@link LegalEntityCurveGroup#getIssuerCurves()}
   *   <li>{@link LegalEntityCurveGroup#getName()}
   *   <li>{@link LegalEntityCurveGroup#getRepoCurves()}
   *   <li>{@link LegalEntityCurveGroup#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap LegalEntityCurveGroup.getIssuerCurves()",
    "CurveGroupName LegalEntityCurveGroup.getName()",
    "ImmutableMap LegalEntityCurveGroup.getRepoCurves()",
    "Builder LegalEntityCurveGroup.toBuilder()",
    "String LegalEntityCurveGroup.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();
    CurveGroupName name = CurveGroupName.of("Name");

    Builder nameResult = builderResult.name(name);
    LegalEntityCurveGroup legalEntityCurveGroup = nameResult.repoCurves(new HashMap<>()).build();

    // Act
    String actualToStringResult = legalEntityCurveGroup.toString();
    ImmutableMap<Pair<LegalEntityGroup, Currency>, Curve> actualIssuerCurves =
        legalEntityCurveGroup.getIssuerCurves();
    CurveGroupName actualName = legalEntityCurveGroup.getName();
    ImmutableMap<Pair<RepoGroup, Currency>, Curve> actualRepoCurves =
        legalEntityCurveGroup.getRepoCurves();
    legalEntityCurveGroup.toBuilder();

    // Assert
    assertEquals(
        "LegalEntityCurveGroup{name=Name, repoCurves={}, issuerCurves={}}", actualToStringResult);
    assertSame(actualIssuerCurves, actualRepoCurves);
    assertSame(name, actualName);
  }

  /**
   * Test {@link LegalEntityCurveGroup#equals(Object)}, and {@link
   * LegalEntityCurveGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegalEntityCurveGroup#equals(Object)}
   *   <li>{@link LegalEntityCurveGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroup.equals(Object)",
    "int LegalEntityCurveGroup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));
    LegalEntityCurveGroup legalEntityCurveGroup = nameResult.repoCurves(new HashMap<>()).build();

    Builder builderResult2 = LegalEntityCurveGroup.builder();

    Builder nameResult2 = builderResult2.name(CurveGroupName.of("Name"));
    LegalEntityCurveGroup legalEntityCurveGroup2 = nameResult2.repoCurves(new HashMap<>()).build();

    // Act and Assert
    assertEquals(legalEntityCurveGroup, legalEntityCurveGroup2);
    assertEquals(legalEntityCurveGroup.hashCode(), legalEntityCurveGroup2.hashCode());
  }

  /**
   * Test {@link LegalEntityCurveGroup#equals(Object)}, and {@link
   * LegalEntityCurveGroup#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegalEntityCurveGroup#equals(Object)}
   *   <li>{@link LegalEntityCurveGroup#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroup.equals(Object)",
    "int LegalEntityCurveGroup.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));
    LegalEntityCurveGroup legalEntityCurveGroup = nameResult.repoCurves(new HashMap<>()).build();

    // Act and Assert
    assertEquals(legalEntityCurveGroup, legalEntityCurveGroup);
    int expectedHashCodeResult = legalEntityCurveGroup.hashCode();
    assertEquals(expectedHashCodeResult, legalEntityCurveGroup.hashCode());
  }

  /**
   * Test {@link LegalEntityCurveGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroup.equals(Object)",
    "int LegalEntityCurveGroup.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("42"));
    LegalEntityCurveGroup legalEntityCurveGroup = nameResult.repoCurves(new HashMap<>()).build();

    Builder builderResult2 = LegalEntityCurveGroup.builder();

    Builder nameResult2 = builderResult2.name(CurveGroupName.of("Name"));

    // Act and Assert
    assertNotEquals(legalEntityCurveGroup, nameResult2.repoCurves(new HashMap<>()).build());
  }

  /**
   * Test {@link LegalEntityCurveGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroup.equals(Object)",
    "int LegalEntityCurveGroup.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));

    // Act and Assert
    assertNotEquals(nameResult.repoCurves(new HashMap<>()).build(), null);
  }

  /**
   * Test {@link LegalEntityCurveGroup#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityCurveGroup#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityCurveGroup.equals(Object)",
    "int LegalEntityCurveGroup.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = LegalEntityCurveGroup.builder();

    Builder nameResult = builderResult.name(CurveGroupName.of("Name"));

    // Act and Assert
    assertNotEquals(
        nameResult.repoCurves(new HashMap<>()).build(), "Different type to LegalEntityCurveGroup");
  }
}
