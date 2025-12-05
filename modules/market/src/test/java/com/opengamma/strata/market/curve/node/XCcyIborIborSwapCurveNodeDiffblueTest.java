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
import com.opengamma.strata.data.FxRateId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.market.curve.CurveNodeDate;
import com.opengamma.strata.market.curve.CurveNodeDateOrder;
import com.opengamma.strata.market.curve.node.XCcyIborIborSwapCurveNode.Builder;
import com.opengamma.strata.market.curve.node.XCcyIborIborSwapCurveNode.Meta;
import com.opengamma.strata.product.swap.type.XCcyIborIborSwapTemplate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class XCcyIborIborSwapCurveNodeDiffblueTest {
  /**
   * Test Builder {@link Builder#dateOrder(CurveNodeDateOrder)}.
   *
   * <ul>
   *   <li>When {@link CurveNodeDateOrder#DEFAULT}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dateOrder(CurveNodeDateOrder)}
   */
  @Test
  @DisplayName("Test Builder dateOrder(CurveNodeDateOrder); when DEFAULT; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dateOrder(CurveNodeDateOrder)"})
  void testBuilderDateOrder_whenDefault_thenReturnBuilder() {
    // Arrange
    Builder builderResult = XCcyIborIborSwapCurveNode.builder();

    // Act
    Builder actualDateOrderResult = builderResult.dateOrder(CurveNodeDateOrder.DEFAULT);

    // Assert
    assertSame(builderResult, actualDateOrderResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dateOrder}.
   *   <li>Then return {@link CurveNodeDateOrder#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'dateOrder'; then return DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDateOrder_thenReturnDefault() {
    // Arrange and Act
    Object actualGetResult = XCcyIborIborSwapCurveNode.builder().get("dateOrder");

    // Assert
    assertSame(((CurveNodeDateOrder) actualGetResult).DEFAULT, actualGetResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fxRateId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'fxRateId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFxRateId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(XCcyIborIborSwapCurveNode.builder().get("fxRateId"));
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
    assertNull(XCcyIborIborSwapCurveNode.builder().get("label"));
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
        () -> XCcyIborIborSwapCurveNode.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code spreadId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'spreadId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSpreadId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(XCcyIborIborSwapCurveNode.builder().get("spreadId"));
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
    assertNull(XCcyIborIborSwapCurveNode.builder().get("template"));
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
    Builder builderResult = XCcyIborIborSwapCurveNode.builder();

    // Act
    Builder actualLabelResult = builderResult.label("Label");

    // Assert
    assertSame(builderResult, actualLabelResult);
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
        () -> XCcyIborIborSwapCurveNode.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code dateOrder}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'dateOrder'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenDateOrder_thenReturnBuilder() {
    // Arrange
    Builder builderResult = XCcyIborIborSwapCurveNode.builder();

    // Act
    Builder actualSetResult = builderResult.set("dateOrder", null);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code fxRateId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'fxRateId'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenFxRateId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = XCcyIborIborSwapCurveNode.builder();

    // Act
    Builder actualSetResult = builderResult.set("fxRateId", null);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'label'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenLabel_thenReturnBuilder() {
    // Arrange
    Builder builderResult = XCcyIborIborSwapCurveNode.builder();

    // Act
    Builder actualSetResult = builderResult.set("label", null);

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
    Builder builderResult = XCcyIborIborSwapCurveNode.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#spreadId(ObservableId)}.
   *
   * <ul>
   *   <li>When {@link ObservableId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#spreadId(ObservableId)}
   */
  @Test
  @DisplayName("Test Builder spreadId(ObservableId); when ObservableId; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.spreadId(ObservableId)"})
  void testBuilderSpreadId_whenObservableId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = XCcyIborIborSwapCurveNode.builder();

    // Act
    Builder actualSpreadIdResult = builderResult.spreadId(mock(ObservableId.class));

    // Assert
    assertSame(builderResult, actualSpreadIdResult);
  }

  /**
   * Test {@link XCcyIborIborSwapCurveNode#meta()}.
   *
   * <p>Method under test: {@link XCcyIborIborSwapCurveNode#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta XCcyIborIborSwapCurveNode.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = XCcyIborIborSwapCurveNode.meta();

    // Assert
    assertTrue(actualMetaResult.additionalSpread() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.date() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dateOrder() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.fxRateId() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.label() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.spreadId() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.template() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
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
    Class<? extends XCcyIborIborSwapCurveNode> actualBeanTypeResult =
        XCcyIborIborSwapCurveNode.meta().beanType();

    // Assert
    Class<XCcyIborIborSwapCurveNode> expectedBeanTypeResult = XCcyIborIborSwapCurveNode.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#additionalSpread()}
   *   <li>{@link Meta#date()}
   *   <li>{@link Meta#dateOrder()}
   *   <li>{@link Meta#fxRateId()}
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#spreadId()}
   *   <li>{@link Meta#template()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.additionalSpread()",
    "MetaProperty Meta.date()",
    "MetaProperty Meta.dateOrder()",
    "MetaProperty Meta.fxRateId()",
    "MetaProperty Meta.label()",
    "MetaProperty Meta.spreadId()",
    "MetaProperty Meta.template()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = XCcyIborIborSwapCurveNode.meta();

    // Act
    MetaProperty<Double> actualAdditionalSpreadResult = metaResult.additionalSpread();
    MetaProperty<CurveNodeDate> actualDateResult = metaResult.date();
    MetaProperty<CurveNodeDateOrder> actualDateOrderResult = metaResult.dateOrder();
    MetaProperty<FxRateId> actualFxRateIdResult = metaResult.fxRateId();
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<ObservableId> actualSpreadIdResult = metaResult.spreadId();

    // Assert
    assertTrue(actualAdditionalSpreadResult instanceof DirectMetaProperty);
    assertTrue(actualDateResult instanceof DirectMetaProperty);
    assertTrue(actualDateOrderResult instanceof DirectMetaProperty);
    assertTrue(actualFxRateIdResult instanceof DirectMetaProperty);
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualSpreadIdResult instanceof DirectMetaProperty);
    assertTrue(metaResult.template() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code additionalSpread}.
   *   <li>Then return name is {@code additionalSpread}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'additionalSpread'; then return name is 'additionalSpread'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAdditionalSpread_thenReturnNameIsAdditionalSpread() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        XCcyIborIborSwapCurveNode.meta().metaPropertyGet("additionalSpread");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).date() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dateOrder() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fxRateId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spreadId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("additionalSpread", actualMetaPropertyGetResult.name());
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).additionalSpread());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dateOrder}.
   *   <li>Then return name is {@code dateOrder}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'dateOrder'; then return name is 'dateOrder'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDateOrder_thenReturnNameIsDateOrder() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        XCcyIborIborSwapCurveNode.meta().metaPropertyGet("dateOrder");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).additionalSpread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).date() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fxRateId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spreadId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("dateOrder", actualMetaPropertyGetResult.name());
    Class<CurveNodeDateOrder> expectedPropertyTypeResult = CurveNodeDateOrder.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dateOrder());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then return name is {@code date}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'date'; then return name is 'date'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDate_thenReturnNameIsDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        XCcyIborIborSwapCurveNode.meta().metaPropertyGet("date");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).additionalSpread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dateOrder() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fxRateId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spreadId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("date", actualMetaPropertyGetResult.name());
    Class<CurveNodeDate> expectedPropertyTypeResult = CurveNodeDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).date());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fxRateId}.
   *   <li>Then return name is {@code fxRateId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'fxRateId'; then return name is 'fxRateId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFxRateId_thenReturnNameIsFxRateId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        XCcyIborIborSwapCurveNode.meta().metaPropertyGet("fxRateId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).additionalSpread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).date() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dateOrder() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spreadId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("fxRateId", actualMetaPropertyGetResult.name());
    Class<FxRateId> expectedPropertyTypeResult = FxRateId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fxRateId());
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
        XCcyIborIborSwapCurveNode.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).additionalSpread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).date() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dateOrder() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fxRateId() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spreadId() instanceof DirectMetaProperty);
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
    assertNull(XCcyIborIborSwapCurveNode.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spreadId}.
   *   <li>Then return name is {@code spreadId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'spreadId'; then return name is 'spreadId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpreadId_thenReturnNameIsSpreadId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        XCcyIborIborSwapCurveNode.meta().metaPropertyGet("spreadId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).additionalSpread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).date() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dateOrder() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fxRateId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).template() instanceof DirectMetaProperty);
    assertEquals("spreadId", actualMetaPropertyGetResult.name());
    Class<ObservableId> expectedPropertyTypeResult = ObservableId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spreadId());
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
        XCcyIborIborSwapCurveNode.meta().metaPropertyGet("template");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).additionalSpread() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).date() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dateOrder() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).fxRateId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).label() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).spreadId() instanceof DirectMetaProperty);
    assertEquals("template", actualMetaPropertyGetResult.name());
    Class<XCcyIborIborSwapTemplate> expectedPropertyTypeResult = XCcyIborIborSwapTemplate.class;
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
        XCcyIborIborSwapCurveNode.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("additionalSpread") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("date") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dateOrder") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fxRateId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("label") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("spreadId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("template") instanceof DirectMetaProperty);
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
    // Arrange, Act and Assert
    assertNull(
        XCcyIborIborSwapCurveNode.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code additionalSpread}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'additionalSpread'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdditionalSpread_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            XCcyIborIborSwapCurveNode.meta()
                .propertySet(mock(Bean.class), "additionalSpread", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dateOrder}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dateOrder'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDateOrder_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            XCcyIborIborSwapCurveNode.meta()
                .propertySet(mock(Bean.class), "dateOrder", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code date}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'date'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            XCcyIborIborSwapCurveNode.meta()
                .propertySet(mock(Bean.class), "date", "New Value", true));
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
            XCcyIborIborSwapCurveNode.meta()
                .propertySet(mock(Bean.class), "additionalSpread", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fxRateId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fxRateId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFxRateId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            XCcyIborIborSwapCurveNode.meta()
                .propertySet(mock(Bean.class), "fxRateId", "New Value", true));
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
            XCcyIborIborSwapCurveNode.meta()
                .propertySet(mock(Bean.class), "label", "New Value", true));
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
            XCcyIborIborSwapCurveNode.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
