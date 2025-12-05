package com.opengamma.strata.market.curve.node;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.market.curve.node.CdsIndexIsdaCreditCurveNode.Builder;
import com.opengamma.strata.market.curve.node.CdsIndexIsdaCreditCurveNode.Meta;
import com.opengamma.strata.product.credit.type.CdsQuoteConvention;
import com.opengamma.strata.product.credit.type.CdsTemplate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsIndexIsdaCreditCurveNodeDiffblueTest {
  /**
   * Test Builder {@link Builder#cdsIndexId(StandardId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#cdsIndexId(StandardId)}
   */
  @Test
  @DisplayName(
      "Test Builder cdsIndexId(StandardId); when StandardId with 'Scheme' and value is '42'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.cdsIndexId(StandardId)"})
  void testBuilderCdsIndexId_whenStandardIdWithSchemeAndValueIs42_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualCdsIndexIdResult = builderResult.cdsIndexId(StandardId.of("Scheme", "42"));

    // Assert
    assertSame(builderResult, actualCdsIndexIdResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'cdsIndexId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCdsIndexId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CdsIndexIsdaCreditCurveNode.builder().get("cdsIndexId"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'label'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLabel_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CdsIndexIsdaCreditCurveNode.builder().get("label"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code legalEntityIds}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'legalEntityIds'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLegalEntityIds_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = CdsIndexIsdaCreditCurveNode.builder().get("legalEntityIds");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code observableId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'observableId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenObservableId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CdsIndexIsdaCreditCurveNode.builder().get("observableId"));
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
        () -> CdsIndexIsdaCreditCurveNode.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code quoteConvention}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'quoteConvention'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenQuoteConvention_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CdsIndexIsdaCreditCurveNode.builder().get("quoteConvention"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code template}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'template'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenTemplate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(CdsIndexIsdaCreditCurveNode.builder().get("template"));
  }

  /**
   * Test Builder {@link Builder#label(String)}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#label(String)}
   */
  @Test
  @DisplayName("Test Builder label(String); when 'Label'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.label(String)"})
  void testBuilderLabel_whenLabel_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualLabelResult = builderResult.label("Label");

    // Assert
    assertSame(builderResult, actualLabelResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(List)}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(List) with 'List'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(List)"})
  void testBuilderLegalEntityIdsWithList_givenNull_whenArrayListAddNull() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    ArrayList<StandardId> legalEntityIds = new ArrayList<>();
    legalEntityIds.add(null);

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds(legalEntityIds);

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(List)}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(List) with 'List'; given 'null'; when ArrayList() add 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(List)"})
  void testBuilderLegalEntityIdsWithList_givenNull_whenArrayListAddNull2() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    ArrayList<StandardId> legalEntityIds = new ArrayList<>();
    legalEntityIds.add(null);
    legalEntityIds.add(null);

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds(legalEntityIds);

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(List)}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(List)"})
  void testBuilderLegalEntityIdsWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(StandardId[])} with {@code StandardId[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(StandardId[])}
   */
  @Test
  @DisplayName("Test Builder legalEntityIds(StandardId[]) with 'StandardId[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(StandardId[])"})
  void testBuilderLegalEntityIdsWithStandardId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualLegalEntityIdsResult = builderResult.legalEntityIds();

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#legalEntityIds(StandardId[])} with {@code StandardId[]}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legalEntityIds(StandardId[])}
   */
  @Test
  @DisplayName(
      "Test Builder legalEntityIds(StandardId[]) with 'StandardId[]'; when StandardId with 'Scheme' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legalEntityIds(StandardId[])"})
  void testBuilderLegalEntityIdsWithStandardId_whenStandardIdWithSchemeAndValueIs42() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualLegalEntityIdsResult =
        builderResult.legalEntityIds(StandardId.of("Scheme", "42"));

    // Assert
    assertSame(builderResult, actualLegalEntityIdsResult);
  }

  /**
   * Test Builder {@link Builder#observableId(ObservableId)}.
   *
   * <ul>
   *   <li>When {@link ObservableId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#observableId(ObservableId)}
   */
  @Test
  @DisplayName("Test Builder observableId(ObservableId); when ObservableId; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.observableId(ObservableId)"})
  void testBuilderObservableId_whenObservableId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualObservableIdResult = builderResult.observableId(mock(ObservableId.class));

    // Assert
    assertSame(builderResult, actualObservableIdResult);
  }

  /**
   * Test Builder {@link Builder#quoteConvention(CdsQuoteConvention)}.
   *
   * <ul>
   *   <li>When {@code PAR_SPREAD}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#quoteConvention(CdsQuoteConvention)}
   */
  @Test
  @DisplayName(
      "Test Builder quoteConvention(CdsQuoteConvention); when 'PAR_SPREAD'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.quoteConvention(CdsQuoteConvention)"})
  void testBuilderQuoteConvention_whenParSpread_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualQuoteConventionResult =
        builderResult.quoteConvention(CdsQuoteConvention.PAR_SPREAD);

    // Assert
    assertSame(builderResult, actualQuoteConventionResult);
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
        () -> CdsIndexIsdaCreditCurveNode.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'cdsIndexId'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCdsIndexId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualSetResult = builderResult.set("cdsIndexId", null);

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
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#template(CdsTemplate)}.
   *
   * <ul>
   *   <li>When {@link CdsTemplate}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#template(CdsTemplate)}
   */
  @Test
  @DisplayName("Test Builder template(CdsTemplate); when CdsTemplate; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.template(CdsTemplate)"})
  void testBuilderTemplate_whenCdsTemplate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CdsIndexIsdaCreditCurveNode.builder();

    // Act
    Builder actualTemplateResult = builderResult.template(mock(CdsTemplate.class));

    // Assert
    assertSame(builderResult, actualTemplateResult);
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
    Class<? extends CdsIndexIsdaCreditCurveNode> actualBeanTypeResult =
        CdsIndexIsdaCreditCurveNode.meta().beanType();

    // Assert
    Class<CdsIndexIsdaCreditCurveNode> expectedBeanTypeResult = CdsIndexIsdaCreditCurveNode.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#cdsIndexId()}
   *   <li>{@link Meta#fixedRate()}
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#legalEntityIds()}
   *   <li>{@link Meta#observableId()}
   *   <li>{@link Meta#quoteConvention()}
   *   <li>{@link Meta#template()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.cdsIndexId()",
    "MetaProperty Meta.fixedRate()",
    "MetaProperty Meta.label()",
    "MetaProperty Meta.legalEntityIds()",
    "MetaProperty Meta.observableId()",
    "MetaProperty Meta.quoteConvention()",
    "MetaProperty Meta.template()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CdsIndexIsdaCreditCurveNode.meta();

    // Act
    MetaProperty<StandardId> actualCdsIndexIdResult = metaResult.cdsIndexId();
    MetaProperty<Double> actualFixedRateResult = metaResult.fixedRate();
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<ImmutableList<StandardId>> actualLegalEntityIdsResult =
        metaResult.legalEntityIds();
    MetaProperty<ObservableId> actualObservableIdResult = metaResult.observableId();
    MetaProperty<CdsQuoteConvention> actualQuoteConventionResult = metaResult.quoteConvention();

    // Assert
    assertTrue(actualCdsIndexIdResult instanceof DirectMetaProperty);
    assertTrue(actualFixedRateResult instanceof DirectMetaProperty);
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualLegalEntityIdsResult instanceof DirectMetaProperty);
    assertTrue(actualObservableIdResult instanceof DirectMetaProperty);
    assertTrue(actualQuoteConventionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.template() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then return name is {@code cdsIndexId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'cdsIndexId'; then return name is 'cdsIndexId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCdsIndexId_thenReturnNameIsCdsIndexId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("cdsIndexId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).observableId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quoteConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("cdsIndexId", actualMetaPropertyGetResult.name());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cdsIndexId());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then return name is {@code fixedRate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixedRate'; then return name is 'fixedRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixedRate_thenReturnNameIsFixedRate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("fixedRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).observableId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quoteConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("fixedRate", actualMetaPropertyGetResult.name());
    Class<Double> expectedPropertyTypeResult = Double.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixedRate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return name is {@code label}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'label'; then return name is 'label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLabel_thenReturnNameIsLabel() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).observableId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quoteConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code legalEntityIds}.
   *   <li>Then return name is {@code legalEntityIds}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'legalEntityIds'; then return name is 'legalEntityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLegalEntityIds_thenReturnNameIsLegalEntityIds() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("legalEntityIds");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).observableId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quoteConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("legalEntityIds", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityIds());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code observableId}.
   *   <li>Then return name is {@code observableId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'observableId'; then return name is 'observableId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenObservableId_thenReturnNameIsObservableId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("observableId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quoteConvention() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("observableId", actualMetaPropertyGetResult.name());
    Class<ObservableId> expectedPropertyTypeResult = ObservableId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).observableId());
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
    assertNull(CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code quoteConvention}.
   *   <li>Then return name is {@code quoteConvention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'quoteConvention'; then return name is 'quoteConvention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenQuoteConvention_thenReturnNameIsQuoteConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("quoteConvention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).observableId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("quoteConvention", actualMetaPropertyGetResult.name());
    Class<CdsQuoteConvention> expectedPropertyTypeResult = CdsQuoteConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).quoteConvention());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code template}.
   *   <li>Then return name is {@code template}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'template'; then return name is 'template'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTemplate_thenReturnNameIsTemplate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyGet("template");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cdsIndexId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fixedRate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).legalEntityIds() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).observableId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).quoteConvention() instanceof DirectMetaProperty);
    assertEquals("template", actualMetaPropertyGetResult.name());
    Class<CdsTemplate> expectedPropertyTypeResult = CdsTemplate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).template());
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
        CdsIndexIsdaCreditCurveNode.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("cdsIndexId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixedRate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("label") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("legalEntityIds") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("observableId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("quoteConvention") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("template") instanceof DirectMetaProperty);
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
        CdsIndexIsdaCreditCurveNode.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> CdsIndexIsdaCreditCurveNode.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cdsIndexId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cdsIndexId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCdsIndexId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CdsIndexIsdaCreditCurveNode.meta()
                .propertySet(mock(Bean.class), "cdsIndexId", "New Value", true));
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
            CdsIndexIsdaCreditCurveNode.meta()
                .propertySet(mock(Bean.class), "cdsIndexId", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixedRate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixedRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CdsIndexIsdaCreditCurveNode.meta()
                .propertySet(mock(Bean.class), "fixedRate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'label'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLabel_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CdsIndexIsdaCreditCurveNode.meta()
                .propertySet(mock(Bean.class), "label", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code legalEntityIds}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'legalEntityIds'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLegalEntityIds_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CdsIndexIsdaCreditCurveNode.meta()
                .propertySet(mock(Bean.class), "legalEntityIds", "New Value", true));
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
            CdsIndexIsdaCreditCurveNode.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
