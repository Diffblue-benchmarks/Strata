package com.opengamma.strata.market.param;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.curve.DummyFraTrade;
import com.opengamma.strata.market.param.ResolvedTradeParameterMetadata.Builder;
import com.opengamma.strata.market.param.ResolvedTradeParameterMetadata.Meta;
import com.opengamma.strata.product.ResolvedTrade;
import java.time.LocalDate;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ResolvedTradeParameterMetadataDiffblueTest {
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
    assertNull(ResolvedTradeParameterMetadata.builder().get("label"));
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
        () -> ResolvedTradeParameterMetadata.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code trade}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'trade'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenTrade_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedTradeParameterMetadata.builder().get("trade"));
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
    Builder builderResult = ResolvedTradeParameterMetadata.builder();

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
        () -> ResolvedTradeParameterMetadata.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ResolvedTradeParameterMetadata.builder();

    // Act
    Builder actualSetResult = builderResult.set("label", "New Value");

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
    Builder builderResult = ResolvedTradeParameterMetadata.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#trade(ResolvedTrade)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#trade(ResolvedTrade)}
   */
  @Test
  @DisplayName(
      "Test Builder trade(ResolvedTrade); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.trade(ResolvedTrade)"})
  void testBuilderTrade_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedTradeParameterMetadata.builder();

    // Act
    Builder actualTradeResult =
        builderResult.trade(DummyFraTrade.of(LocalDate.of(1970, 1, 1), 10.0d));

    // Assert
    assertSame(builderResult, actualTradeResult);
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
    Class<? extends ResolvedTradeParameterMetadata> actualBeanTypeResult =
        ResolvedTradeParameterMetadata.meta().beanType();

    // Assert
    Class<ResolvedTradeParameterMetadata> expectedBeanTypeResult =
        ResolvedTradeParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#trade()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.label()", "MetaProperty Meta.trade()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedTradeParameterMetadata.meta();

    // Act
    MetaProperty<String> actualLabelResult = metaResult.label();

    // Assert
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(metaResult.trade() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then metaBean trade return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'label'; then metaBean trade return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLabel_thenMetaBeanTradeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedTradeParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedTrade> tradeResult = ((Meta) metaBeanResult).trade();
    assertTrue(tradeResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    assertEquals("trade", tradeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, tradeResult.style());
    Class<ResolvedTradeParameterMetadata> expectedDeclaringTypeResult =
        ResolvedTradeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, tradeResult.declaringType());
    Class<ResolvedTrade> expectedPropertyTypeResult = ResolvedTrade.class;
    assertEquals(expectedPropertyTypeResult, tradeResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(Meta.INSTANCE, tradeResult.metaBean());
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
    assertNull(ResolvedTradeParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code trade}.
   *   <li>Then metaBean label return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'trade'; then metaBean label return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTrade_thenMetaBeanLabelReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedTradeParameterMetadata.meta().metaPropertyGet("trade");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("label", labelResult.name());
    assertEquals("trade", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    Class<ResolvedTradeParameterMetadata> expectedDeclaringTypeResult =
        ResolvedTradeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<ResolvedTrade> expectedPropertyTypeResult = ResolvedTrade.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, labelResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).trade());
    assertSame(Meta.INSTANCE, labelResult.metaBean());
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
        ResolvedTradeParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("trade");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("label", getResult2.name());
    assertEquals("trade", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ResolvedTradeParameterMetadata> expectedDeclaringTypeResult =
        ResolvedTradeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ResolvedTradeParameterMetadata> expectedDeclaringTypeResult2 =
        ResolvedTradeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<ResolvedTrade> expectedPropertyTypeResult = ResolvedTrade.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
            ResolvedTradeParameterMetadata.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        ResolvedTradeParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            ResolvedTradeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "label", "New Value", false));
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
            ResolvedTradeParameterMetadata.meta()
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
            ResolvedTradeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code trade}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'trade'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTrade_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedTradeParameterMetadata.meta()
                .propertySet(mock(Bean.class), "trade", "New Value", true));
  }

  /**
   * Test {@link ResolvedTradeParameterMetadata#of(ResolvedTrade, String)}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return Identifier is {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedTradeParameterMetadata#of(ResolvedTrade, String)}
   */
  @Test
  @DisplayName("Test of(ResolvedTrade, String); when 'Label'; then return Identifier is 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ResolvedTradeParameterMetadata ResolvedTradeParameterMetadata.of(ResolvedTrade, String)"
  })
  void testOf_whenLabel_thenReturnIdentifierIsLabel() {
    // Arrange
    DummyFraTrade trade = DummyFraTrade.of(LocalDate.of(1970, 1, 1), 10.0d);

    // Act
    ResolvedTradeParameterMetadata actualOfResult =
        ResolvedTradeParameterMetadata.of(trade, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getIdentifier());
    assertEquals("Label", actualOfResult.getLabel());
    assertSame(trade, actualOfResult.getTrade());
  }

  /**
   * Test {@link ResolvedTradeParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link ResolvedTradeParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedTradeParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedTradeParameterMetadata.meta();

    // Assert
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedTrade> tradeResult = actualMetaResult.trade();
    assertTrue(tradeResult instanceof DirectMetaProperty);
    assertEquals("label", labelResult.name());
    assertEquals("trade", tradeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, tradeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ResolvedTradeParameterMetadata> expectedDeclaringTypeResult =
        ResolvedTradeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<ResolvedTradeParameterMetadata> expectedDeclaringTypeResult2 =
        ResolvedTradeParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, tradeResult.declaringType());
    Class<ResolvedTrade> expectedPropertyTypeResult = ResolvedTrade.class;
    assertEquals(expectedPropertyTypeResult, tradeResult.propertyType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, labelResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, tradeResult.metaBean());
  }
}
