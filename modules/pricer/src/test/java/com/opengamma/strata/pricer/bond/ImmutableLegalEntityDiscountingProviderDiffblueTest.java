package com.opengamma.strata.pricer.bond;

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
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.market.curve.LegalEntityGroup;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.pricer.DiscountFactors;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider.Builder;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider.Meta;
import com.opengamma.strata.product.LegalEntityId;
import com.opengamma.strata.product.SecurityId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableLegalEntityDiscountingProviderDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableLegalEntityDiscountingProvider Builder.build()",
    "String Builder.toString()"
  })
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = ImmutableLegalEntityDiscountingProvider.builder();
    Builder actualIssuerCurveGroupsResult = actualBuilderResult.issuerCurveGroups(new HashMap<>());
    Builder actualIssuerCurvesResult = actualIssuerCurveGroupsResult.issuerCurves(new HashMap<>());
    Builder actualRepoCurveGroupsResult = actualIssuerCurvesResult.repoCurveGroups(new HashMap<>());
    Builder actualRepoCurveSecurityGroupsResult =
        actualRepoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableLegalEntityDiscountingProvider actualImmutableLegalEntityDiscountingProvider =
        actualRepoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(valuationDate)
            .build();

    // Assert
    LocalDate valuationDate2 = actualImmutableLegalEntityDiscountingProvider.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertSame(valuationDate, valuationDate2);
    assertSame(
        actualImmutableLegalEntityDiscountingProvider.getIssuerCurveGroups(),
        actualImmutableLegalEntityDiscountingProvider.getIssuerCurves());
    assertSame(
        actualImmutableLegalEntityDiscountingProvider.getIssuerCurveGroups(),
        actualImmutableLegalEntityDiscountingProvider.getRepoCurveGroups());
    assertSame(
        actualImmutableLegalEntityDiscountingProvider.getIssuerCurveGroups(),
        actualImmutableLegalEntityDiscountingProvider.getRepoCurveSecurityGroups());
    assertSame(
        actualImmutableLegalEntityDiscountingProvider.getIssuerCurveGroups(),
        actualImmutableLegalEntityDiscountingProvider.getRepoCurves());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code issuerCurveGroups}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'issuerCurveGroups'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIssuerCurveGroups_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult =
        ImmutableLegalEntityDiscountingProvider.builder().get("issuerCurveGroups");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
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
    Object actualGetResult = ImmutableLegalEntityDiscountingProvider.builder().get("issuerCurves");

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
        () -> ImmutableLegalEntityDiscountingProvider.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code repoCurveGroups}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'repoCurveGroups'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRepoCurveGroups_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult =
        ImmutableLegalEntityDiscountingProvider.builder().get("repoCurveGroups");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code repoCurveSecurityGroups}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'repoCurveSecurityGroups'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRepoCurveSecurityGroups_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult =
        ImmutableLegalEntityDiscountingProvider.builder().get("repoCurveSecurityGroups");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
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
    Object actualGetResult = ImmutableLegalEntityDiscountingProvider.builder().get("repoCurves");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'valuationDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValuationDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableLegalEntityDiscountingProvider.builder().get("valuationDate"));
  }

  /**
   * Test Builder {@link Builder#issuerCurveGroups(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#issuerCurveGroups(Map)}
   */
  @Test
  @DisplayName("Test Builder issuerCurveGroups(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.issuerCurveGroups(Map)"})
  void testBuilderIssuerCurveGroups_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    // Act
    Builder actualIssuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    // Assert
    assertSame(builderResult, actualIssuerCurveGroupsResult);
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
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    // Act
    Builder actualIssuerCurvesResult = builderResult.issuerCurves(new HashMap<>());

    // Assert
    assertSame(builderResult, actualIssuerCurvesResult);
  }

  /**
   * Test Builder {@link Builder#repoCurveGroups(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#repoCurveGroups(Map)}
   */
  @Test
  @DisplayName("Test Builder repoCurveGroups(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.repoCurveGroups(Map)"})
  void testBuilderRepoCurveGroups_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    // Act
    Builder actualRepoCurveGroupsResult = builderResult.repoCurveGroups(new HashMap<>());

    // Assert
    assertSame(builderResult, actualRepoCurveGroupsResult);
  }

  /**
   * Test Builder {@link Builder#repoCurveSecurityGroups(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#repoCurveSecurityGroups(Map)}
   */
  @Test
  @DisplayName("Test Builder repoCurveSecurityGroups(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.repoCurveSecurityGroups(Map)"})
  void testBuilderRepoCurveSecurityGroups_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    // Act
    Builder actualRepoCurveSecurityGroupsResult =
        builderResult.repoCurveSecurityGroups(new HashMap<>());

    // Assert
    assertSame(builderResult, actualRepoCurveSecurityGroupsResult);
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
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

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
        () -> ImmutableLegalEntityDiscountingProvider.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code issuerCurveGroups}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'issuerCurveGroups'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenIssuerCurveGroups_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    // Act
    Builder actualSetResult = builderResult.set("issuerCurveGroups", new HashMap<>());

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

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
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#valuationDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valuationDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder valuationDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valuationDate(LocalDate)"})
  void testBuilderValuationDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    // Act
    Builder actualValuationDateResult = builderResult.valuationDate(valuationDate);

    // Assert
    assertSame(builderResult, actualValuationDateResult);
    assertSame(valuationDate, builderResult.build().getValuationDate());
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
    Class<? extends ImmutableLegalEntityDiscountingProvider> actualBeanTypeResult =
        ImmutableLegalEntityDiscountingProvider.meta().beanType();

    // Assert
    Class<ImmutableLegalEntityDiscountingProvider> expectedBeanTypeResult =
        ImmutableLegalEntityDiscountingProvider.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#issuerCurveGroups()}
   *   <li>{@link Meta#issuerCurves()}
   *   <li>{@link Meta#repoCurveGroups()}
   *   <li>{@link Meta#repoCurveSecurityGroups()}
   *   <li>{@link Meta#repoCurves()}
   *   <li>{@link Meta#valuationDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.issuerCurveGroups()",
    "MetaProperty Meta.issuerCurves()",
    "MetaProperty Meta.repoCurveGroups()",
    "MetaProperty Meta.repoCurveSecurityGroups()",
    "MetaProperty Meta.repoCurves()",
    "MetaProperty Meta.valuationDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableLegalEntityDiscountingProvider.meta();

    // Act
    MetaProperty<ImmutableMap<LegalEntityId, LegalEntityGroup>> actualIssuerCurveGroupsResult =
        metaResult.issuerCurveGroups();
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, DiscountFactors>>
        actualIssuerCurvesResult = metaResult.issuerCurves();
    MetaProperty<ImmutableMap<LegalEntityId, RepoGroup>> actualRepoCurveGroupsResult =
        metaResult.repoCurveGroups();
    MetaProperty<ImmutableMap<SecurityId, RepoGroup>> actualRepoCurveSecurityGroupsResult =
        metaResult.repoCurveSecurityGroups();
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, DiscountFactors>> actualRepoCurvesResult =
        metaResult.repoCurves();

    // Assert
    assertTrue(actualIssuerCurveGroupsResult instanceof DirectMetaProperty);
    assertTrue(actualIssuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualRepoCurveGroupsResult instanceof DirectMetaProperty);
    assertTrue(actualRepoCurveSecurityGroupsResult instanceof DirectMetaProperty);
    assertTrue(actualRepoCurvesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code repoCurveSecurityGroups}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'repoCurveSecurityGroups'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsRepoCurveSecurityGroups() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableLegalEntityDiscountingProvider.meta().metaPropertyGet("repoCurveSecurityGroups");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<LegalEntityId, LegalEntityGroup>> issuerCurveGroupsResult =
        ((Meta) metaBeanResult).issuerCurveGroups();
    assertTrue(issuerCurveGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, DiscountFactors>>
        issuerCurvesResult = ((Meta) metaBeanResult).issuerCurves();
    assertTrue(issuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<LegalEntityId, RepoGroup>> repoCurveGroupsResult =
        ((Meta) metaBeanResult).repoCurveGroups();
    assertTrue(repoCurveGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, DiscountFactors>> repoCurvesResult =
        ((Meta) metaBeanResult).repoCurves();
    assertTrue(repoCurvesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("repoCurveSecurityGroups", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).repoCurveSecurityGroups());
    assertSame(metaBeanResult, issuerCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, issuerCurvesResult.metaBean());
    assertSame(metaBeanResult, repoCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurvesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code issuerCurveGroups}.
   *   <li>Then return name is {@code issuerCurveGroups}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'issuerCurveGroups'; then return name is 'issuerCurveGroups'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIssuerCurveGroups_thenReturnNameIsIssuerCurveGroups() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableLegalEntityDiscountingProvider.meta().metaPropertyGet("issuerCurveGroups");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, DiscountFactors>>
        issuerCurvesResult = ((Meta) metaBeanResult).issuerCurves();
    assertTrue(issuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<LegalEntityId, RepoGroup>> repoCurveGroupsResult =
        ((Meta) metaBeanResult).repoCurveGroups();
    assertTrue(repoCurveGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<SecurityId, RepoGroup>> repoCurveSecurityGroupsResult =
        ((Meta) metaBeanResult).repoCurveSecurityGroups();
    assertTrue(repoCurveSecurityGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, DiscountFactors>> repoCurvesResult =
        ((Meta) metaBeanResult).repoCurves();
    assertTrue(repoCurvesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("issuerCurveGroups", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).issuerCurveGroups());
    assertSame(metaBeanResult, issuerCurvesResult.metaBean());
    assertSame(metaBeanResult, repoCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurveSecurityGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurvesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
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
        ImmutableLegalEntityDiscountingProvider.meta().metaPropertyGet("issuerCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<LegalEntityId, LegalEntityGroup>> issuerCurveGroupsResult =
        ((Meta) metaBeanResult).issuerCurveGroups();
    assertTrue(issuerCurveGroupsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<LegalEntityId, RepoGroup>> repoCurveGroupsResult =
        ((Meta) metaBeanResult).repoCurveGroups();
    assertTrue(repoCurveGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<SecurityId, RepoGroup>> repoCurveSecurityGroupsResult =
        ((Meta) metaBeanResult).repoCurveSecurityGroups();
    assertTrue(repoCurveSecurityGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, DiscountFactors>> repoCurvesResult =
        ((Meta) metaBeanResult).repoCurves();
    assertTrue(repoCurvesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("issuerCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).issuerCurves());
    assertSame(metaBeanResult, issuerCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurveSecurityGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurvesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
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
    assertNull(ImmutableLegalEntityDiscountingProvider.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code repoCurveGroups}.
   *   <li>Then return name is {@code repoCurveGroups}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'repoCurveGroups'; then return name is 'repoCurveGroups'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRepoCurveGroups_thenReturnNameIsRepoCurveGroups() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableLegalEntityDiscountingProvider.meta().metaPropertyGet("repoCurveGroups");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<LegalEntityId, LegalEntityGroup>> issuerCurveGroupsResult =
        ((Meta) metaBeanResult).issuerCurveGroups();
    assertTrue(issuerCurveGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, DiscountFactors>>
        issuerCurvesResult = ((Meta) metaBeanResult).issuerCurves();
    assertTrue(issuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<SecurityId, RepoGroup>> repoCurveSecurityGroupsResult =
        ((Meta) metaBeanResult).repoCurveSecurityGroups();
    assertTrue(repoCurveSecurityGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<RepoGroup, Currency>, DiscountFactors>> repoCurvesResult =
        ((Meta) metaBeanResult).repoCurves();
    assertTrue(repoCurvesResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("repoCurveGroups", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).repoCurveGroups());
    assertSame(metaBeanResult, issuerCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, issuerCurvesResult.metaBean());
    assertSame(metaBeanResult, repoCurveSecurityGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurvesResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
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
        ImmutableLegalEntityDiscountingProvider.meta().metaPropertyGet("repoCurves");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<LegalEntityId, LegalEntityGroup>> issuerCurveGroupsResult =
        ((Meta) metaBeanResult).issuerCurveGroups();
    assertTrue(issuerCurveGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Pair<LegalEntityGroup, Currency>, DiscountFactors>>
        issuerCurvesResult = ((Meta) metaBeanResult).issuerCurves();
    assertTrue(issuerCurvesResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<LegalEntityId, RepoGroup>> repoCurveGroupsResult =
        ((Meta) metaBeanResult).repoCurveGroups();
    assertTrue(repoCurveGroupsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<SecurityId, RepoGroup>> repoCurveSecurityGroupsResult =
        ((Meta) metaBeanResult).repoCurveSecurityGroups();
    assertTrue(repoCurveSecurityGroupsResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("repoCurves", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).repoCurves());
    assertSame(metaBeanResult, issuerCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, issuerCurvesResult.metaBean());
    assertSame(metaBeanResult, repoCurveGroupsResult.metaBean());
    assertSame(metaBeanResult, repoCurveSecurityGroupsResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return name is {@code valuationDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDate'; then return name is 'valuationDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDate_thenReturnNameIsValuationDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableLegalEntityDiscountingProvider.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).issuerCurveGroups() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).issuerCurves() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).repoCurveGroups() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).repoCurveSecurityGroups() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).repoCurves() instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
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
        ImmutableLegalEntityDiscountingProvider.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("issuerCurveGroups") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("issuerCurves") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("repoCurveGroups") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("repoCurveSecurityGroups") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("repoCurves") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valuationDate") instanceof DirectMetaProperty);
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
        ImmutableLegalEntityDiscountingProvider.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code issuerCurveGroups}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'issuerCurveGroups'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenIssuerCurveGroups_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableLegalEntityDiscountingProvider.meta();

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            "issuerCurveGroups",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
    Meta metaResult = ImmutableLegalEntityDiscountingProvider.meta();

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            "issuerCurves",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoCurveGroups}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'repoCurveGroups'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenRepoCurveGroups_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableLegalEntityDiscountingProvider.meta();

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            "repoCurveGroups",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoCurveSecurityGroups}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'repoCurveSecurityGroups'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenRepoCurveSecurityGroups_thenReturnMap() {
    // Arrange
    Meta metaResult = ImmutableLegalEntityDiscountingProvider.meta();

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            "repoCurveSecurityGroups",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
    Meta metaResult = ImmutableLegalEntityDiscountingProvider.meta();

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            "repoCurves",
            true);

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
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "issuerCurveGroups", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code issuerCurveGroups}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'issuerCurveGroups'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIssuerCurveGroups_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "issuerCurveGroups", "New Value", true));
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
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "issuerCurves", "New Value", true));
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
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoCurveGroups}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'repoCurveGroups'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRepoCurveGroups_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "repoCurveGroups", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoCurveSecurityGroups}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'repoCurveSecurityGroups'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRepoCurveSecurityGroups_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "repoCurveSecurityGroups", "New Value", true));
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
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "repoCurves", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableLegalEntityDiscountingProvider.meta()
                .propertySet(mock(Bean.class), "valuationDate", "New Value", true));
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#repoCurveDiscountFactors(LegalEntityId,
   * Currency)} with {@code issuerId}, {@code currency}.
   *
   * <p>Method under test: {@link
   * ImmutableLegalEntityDiscountingProvider#repoCurveDiscountFactors(LegalEntityId, Currency)}
   */
  @Test
  @DisplayName("Test repoCurveDiscountFactors(LegalEntityId, Currency) with 'issuerId', 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.bond.RepoCurveDiscountFactors ImmutableLegalEntityDiscountingProvider.repoCurveDiscountFactors(LegalEntityId, Currency)"
  })
  void testRepoCurveDiscountFactorsWithIssuerIdCurrency() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build()
                .repoCurveDiscountFactors(CapitalIndexedBondCurveDataSet.getIssuerId(), null));
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#issuerCurveDiscountFactors(LegalEntityId,
   * Currency)} with {@code issuerId}, {@code currency}.
   *
   * <p>Method under test: {@link
   * ImmutableLegalEntityDiscountingProvider#issuerCurveDiscountFactors(LegalEntityId, Currency)}
   */
  @Test
  @DisplayName(
      "Test issuerCurveDiscountFactors(LegalEntityId, Currency) with 'issuerId', 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.bond.IssuerCurveDiscountFactors ImmutableLegalEntityDiscountingProvider.issuerCurveDiscountFactors(LegalEntityId, Currency)"
  })
  void testIssuerCurveDiscountFactorsWithIssuerIdCurrency() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build()
                .issuerCurveDiscountFactors(CapitalIndexedBondCurveDataSet.getIssuerId(), null));
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#data(MarketDataId)}.
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#data(MarketDataId)}
   */
  @Test
  @DisplayName("Test data(MarketDataId)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ImmutableLegalEntityDiscountingProvider.data(MarketDataId)"})
  void testData() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build()
                .data(mock(MarketDataId.class)));
  }

  /**
   * Test {@link
   * ImmutableLegalEntityDiscountingProvider#toImmutableLegalEntityDiscountingProvider()}.
   *
   * <p>Method under test: {@link
   * ImmutableLegalEntityDiscountingProvider#toImmutableLegalEntityDiscountingProvider()}
   */
  @Test
  @DisplayName("Test toImmutableLegalEntityDiscountingProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableLegalEntityDiscountingProvider ImmutableLegalEntityDiscountingProvider.toImmutableLegalEntityDiscountingProvider()"
  })
  void testToImmutableLegalEntityDiscountingProvider() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider =
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act
    ImmutableLegalEntityDiscountingProvider actualToImmutableLegalEntityDiscountingProviderResult =
        immutableLegalEntityDiscountingProvider.toImmutableLegalEntityDiscountingProvider();

    // Assert
    assertSame(
        immutableLegalEntityDiscountingProvider,
        actualToImmutableLegalEntityDiscountingProviderResult);
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#meta()}.
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableLegalEntityDiscountingProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableLegalEntityDiscountingProvider.meta();

    // Assert
    assertTrue(actualMetaResult.issuerCurveGroups() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.issuerCurves() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.repoCurveGroups() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.repoCurveSecurityGroups() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.repoCurves() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valuationDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#metaBean()}.
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableLegalEntityDiscountingProvider.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#toString()}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#getIssuerCurveGroups()}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#getIssuerCurves()}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#getRepoCurveGroups()}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#getRepoCurveSecurityGroups()}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#getRepoCurves()}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#getValuationDate()}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap ImmutableLegalEntityDiscountingProvider.getIssuerCurveGroups()",
    "ImmutableMap ImmutableLegalEntityDiscountingProvider.getIssuerCurves()",
    "ImmutableMap ImmutableLegalEntityDiscountingProvider.getRepoCurveGroups()",
    "ImmutableMap ImmutableLegalEntityDiscountingProvider.getRepoCurveSecurityGroups()",
    "ImmutableMap ImmutableLegalEntityDiscountingProvider.getRepoCurves()",
    "LocalDate ImmutableLegalEntityDiscountingProvider.getValuationDate()",
    "Builder ImmutableLegalEntityDiscountingProvider.toBuilder()",
    "String ImmutableLegalEntityDiscountingProvider.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider =
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(valuationDate)
            .build();

    // Act
    String actualToStringResult = immutableLegalEntityDiscountingProvider.toString();
    ImmutableMap<LegalEntityId, LegalEntityGroup> actualIssuerCurveGroups =
        immutableLegalEntityDiscountingProvider.getIssuerCurveGroups();
    ImmutableMap<Pair<LegalEntityGroup, Currency>, DiscountFactors> actualIssuerCurves =
        immutableLegalEntityDiscountingProvider.getIssuerCurves();
    ImmutableMap<LegalEntityId, RepoGroup> actualRepoCurveGroups =
        immutableLegalEntityDiscountingProvider.getRepoCurveGroups();
    ImmutableMap<SecurityId, RepoGroup> actualRepoCurveSecurityGroups =
        immutableLegalEntityDiscountingProvider.getRepoCurveSecurityGroups();
    ImmutableMap<Pair<RepoGroup, Currency>, DiscountFactors> actualRepoCurves =
        immutableLegalEntityDiscountingProvider.getRepoCurves();
    LocalDate actualValuationDate = immutableLegalEntityDiscountingProvider.getValuationDate();
    immutableLegalEntityDiscountingProvider.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertEquals(
        "ImmutableLegalEntityDiscountingProvider{valuationDate=1970-01-01, repoCurveSecurityGroups={},"
            + " repoCurveGroups={}, repoCurves={}, issuerCurveGroups={}, issuerCurves={}}",
        actualToStringResult);
    assertSame(actualIssuerCurveGroups, actualIssuerCurves);
    assertSame(actualIssuerCurveGroups, actualRepoCurveGroups);
    assertSame(actualIssuerCurveGroups, actualRepoCurveSecurityGroups);
    assertSame(actualIssuerCurveGroups, actualRepoCurves);
    assertSame(valuationDate, actualValuationDate);
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}, and {@link
   * ImmutableLegalEntityDiscountingProvider#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#equals(Object)}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableLegalEntityDiscountingProvider.equals(Object)",
    "int ImmutableLegalEntityDiscountingProvider.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider =
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult2 = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult2 = builderResult2.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult2 = issuerCurveGroupsResult2.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult2 = issuerCurvesResult2.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult2 =
        repoCurveGroupsResult2.repoCurveSecurityGroups(new HashMap<>());
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider2 =
        repoCurveSecurityGroupsResult2
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(immutableLegalEntityDiscountingProvider, immutableLegalEntityDiscountingProvider2);
    assertEquals(
        immutableLegalEntityDiscountingProvider.hashCode(),
        immutableLegalEntityDiscountingProvider2.hashCode());
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}, and {@link
   * ImmutableLegalEntityDiscountingProvider#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#equals(Object)}
   *   <li>{@link ImmutableLegalEntityDiscountingProvider#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableLegalEntityDiscountingProvider.equals(Object)",
    "int ImmutableLegalEntityDiscountingProvider.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider =
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(immutableLegalEntityDiscountingProvider, immutableLegalEntityDiscountingProvider);
    int expectedHashCodeResult = immutableLegalEntityDiscountingProvider.hashCode();
    assertEquals(expectedHashCodeResult, immutableLegalEntityDiscountingProvider.hashCode());
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableLegalEntityDiscountingProvider.equals(Object)",
    "int ImmutableLegalEntityDiscountingProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<LegalEntityId, LegalEntityGroup> issuerCurveGroups = new HashMap<>();
    LegalEntityId issuerId = CapitalIndexedBondCurveDataSet.getIssuerId();
    issuerCurveGroups.put(issuerId, LegalEntityGroup.of("Name"));

    Builder issuerCurveGroupsResult =
        ImmutableLegalEntityDiscountingProvider.builder().issuerCurveGroups(issuerCurveGroups);

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider =
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult2 = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult2 = issuerCurveGroupsResult2.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult2 = issuerCurvesResult2.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult2 =
        repoCurveGroupsResult2.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertNotEquals(
        immutableLegalEntityDiscountingProvider,
        repoCurveSecurityGroupsResult2
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableLegalEntityDiscountingProvider.equals(Object)",
    "int ImmutableLegalEntityDiscountingProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    LegalEntityId issuerId = CapitalIndexedBondCurveDataSet.getIssuerId();
    repoCurveGroups.put(issuerId, RepoGroup.of("Name"));

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder repoCurveGroupsResult =
        issuerCurveGroupsResult.issuerCurves(new HashMap<>()).repoCurveGroups(repoCurveGroups);

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider =
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult2 = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult2 = builderResult2.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult2.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult2 = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult2 =
        repoCurveGroupsResult2.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertNotEquals(
        immutableLegalEntityDiscountingProvider,
        repoCurveSecurityGroupsResult2
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableLegalEntityDiscountingProvider.equals(Object)",
    "int ImmutableLegalEntityDiscountingProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    ImmutableLegalEntityDiscountingProvider immutableLegalEntityDiscountingProvider =
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.now())
            .build();

    Builder builderResult2 = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult2 = builderResult2.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult2 = issuerCurveGroupsResult2.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult2 = issuerCurvesResult2.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult2 =
        repoCurveGroupsResult2.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertNotEquals(
        immutableLegalEntityDiscountingProvider,
        repoCurveSecurityGroupsResult2
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableLegalEntityDiscountingProvider.equals(Object)",
    "int ImmutableLegalEntityDiscountingProvider.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertNotEquals(
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build(),
        null);
  }

  /**
   * Test {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutableLegalEntityDiscountingProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutableLegalEntityDiscountingProvider.equals(Object)",
    "int ImmutableLegalEntityDiscountingProvider.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());

    // Act and Assert
    assertNotEquals(
        repoCurveSecurityGroupsResult
            .repoCurves(new HashMap<>())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build(),
        "Different type to ImmutableLegalEntityDiscountingProvider");
  }
}
