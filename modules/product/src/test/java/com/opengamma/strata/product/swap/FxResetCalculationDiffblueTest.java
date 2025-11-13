package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.index.FxIndex;
import com.opengamma.strata.product.swap.FxResetCalculation.Builder;
import com.opengamma.strata.product.swap.FxResetCalculation.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxResetCalculationDiffblueTest {
  /**
   * Test Builder {@link Builder#fixingDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder fixingDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingDateOffset(DaysAdjustment)"})
  void testBuilderFixingDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FxResetCalculation.builder();

    // Act
    Builder actualFixingDateOffsetResult = builderResult.fixingDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualFixingDateOffsetResult);
  }

  /**
   * Test Builder {@link Builder#fixingRelativeTo(FxResetFixingRelativeTo)}.
   *
   * <ul>
   *   <li>When {@code PERIOD_START}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#fixingRelativeTo(FxResetFixingRelativeTo)}
   */
  @Test
  @DisplayName(
      "Test Builder fixingRelativeTo(FxResetFixingRelativeTo); when 'PERIOD_START'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.fixingRelativeTo(FxResetFixingRelativeTo)"})
  void testBuilderFixingRelativeTo_whenPeriodStart_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FxResetCalculation.builder();

    // Act
    Builder actualFixingRelativeToResult =
        builderResult.fixingRelativeTo(FxResetFixingRelativeTo.PERIOD_START);

    // Assert
    assertSame(builderResult, actualFixingRelativeToResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>Then return {@link FxResetFixingRelativeTo}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; then return FxResetFixingRelativeTo")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_thenReturnFxResetFixingRelativeTo() {
    // Arrange and Act
    Object actualGetResult = FxResetCalculation.builder().get("fixingRelativeTo");

    // Assert
    assertTrue(actualGetResult instanceof FxResetFixingRelativeTo);
    assertEquals(FxResetFixingRelativeTo.PERIOD_START, actualGetResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'fixingDateOffset'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFixingDateOffset_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FxResetCalculation.builder().get("fixingDateOffset"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndex_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FxResetCalculation.builder().get("index"));
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
        NoSuchElementException.class, () -> FxResetCalculation.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code referenceCurrency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'referenceCurrency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenReferenceCurrency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FxResetCalculation.builder().get("referenceCurrency"));
  }

  /**
   * Test Builder {@link Builder#index(FxIndex)}.
   *
   * <ul>
   *   <li>When {@link FxIndex}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(FxIndex)}
   */
  @Test
  @DisplayName("Test Builder index(FxIndex); when FxIndex; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(FxIndex)"})
  void testBuilderIndex_whenFxIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FxResetCalculation.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(FxIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
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
        () -> FxResetCalculation.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'fixingDateOffset'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenFixingDateOffset_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FxResetCalculation.builder();

    // Act
    Builder actualSetResult = builderResult.set("fixingDateOffset", DaysAdjustment.NONE);

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
    Builder builderResult = FxResetCalculation.builder();

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
    Class<? extends FxResetCalculation> actualBeanTypeResult = FxResetCalculation.meta().beanType();

    // Assert
    Class<FxResetCalculation> expectedBeanTypeResult = FxResetCalculation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#fixingDateOffset()}
   *   <li>{@link Meta#fixingRelativeTo()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#initialNotionalValue()}
   *   <li>{@link Meta#referenceCurrency()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.fixingDateOffset()",
    "MetaProperty Meta.fixingRelativeTo()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.initialNotionalValue()",
    "MetaProperty Meta.referenceCurrency()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FxResetCalculation.meta();

    // Act
    MetaProperty<DaysAdjustment> actualFixingDateOffsetResult = metaResult.fixingDateOffset();
    MetaProperty<FxResetFixingRelativeTo> actualFixingRelativeToResult =
        metaResult.fixingRelativeTo();
    MetaProperty<FxIndex> actualIndexResult = metaResult.index();
    MetaProperty<Double> actualInitialNotionalValueResult = metaResult.initialNotionalValue();

    // Assert
    assertTrue(actualFixingDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualFixingRelativeToResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualInitialNotionalValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.referenceCurrency() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code initialNotionalValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'initialNotionalValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsInitialNotionalValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetCalculation.meta().metaPropertyGet("initialNotionalValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DaysAdjustment> fixingDateOffsetResult =
        ((Meta) metaBeanResult).fixingDateOffset();
    assertTrue(fixingDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<FxResetFixingRelativeTo> fixingRelativeToResult =
        ((Meta) metaBeanResult).fixingRelativeTo();
    assertTrue(fixingRelativeToResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Currency> referenceCurrencyResult = ((Meta) metaBeanResult).referenceCurrency();
    assertTrue(referenceCurrencyResult instanceof DirectMetaProperty);
    assertEquals("initialNotionalValue", actualMetaPropertyGetResult.name());
    Class<Double> expectedPropertyTypeResult = Double.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).initialNotionalValue());
    assertSame(metaBeanResult, fixingDateOffsetResult.metaBean());
    assertSame(metaBeanResult, fixingRelativeToResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, referenceCurrencyResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then return name is {@code fixingDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingDateOffset'; then return name is 'fixingDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingDateOffset_thenReturnNameIsFixingDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetCalculation.meta().metaPropertyGet("fixingDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FxResetFixingRelativeTo> fixingRelativeToResult =
        ((Meta) metaBeanResult).fixingRelativeTo();
    assertTrue(fixingRelativeToResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<Double> initialNotionalValueResult =
        ((Meta) metaBeanResult).initialNotionalValue();
    assertTrue(initialNotionalValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Currency> referenceCurrencyResult = ((Meta) metaBeanResult).referenceCurrency();
    assertTrue(referenceCurrencyResult instanceof DirectMetaProperty);
    assertEquals("fixingDateOffset", actualMetaPropertyGetResult.name());
    Class<DaysAdjustment> expectedPropertyTypeResult = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingDateOffset());
    assertSame(metaBeanResult, fixingRelativeToResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, initialNotionalValueResult.metaBean());
    assertSame(metaBeanResult, referenceCurrencyResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code fixingRelativeTo}.
   *   <li>Then return name is {@code fixingRelativeTo}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'fixingRelativeTo'; then return name is 'fixingRelativeTo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFixingRelativeTo_thenReturnNameIsFixingRelativeTo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetCalculation.meta().metaPropertyGet("fixingRelativeTo");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DaysAdjustment> fixingDateOffsetResult =
        ((Meta) metaBeanResult).fixingDateOffset();
    assertTrue(fixingDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<Double> initialNotionalValueResult =
        ((Meta) metaBeanResult).initialNotionalValue();
    assertTrue(initialNotionalValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Currency> referenceCurrencyResult = ((Meta) metaBeanResult).referenceCurrency();
    assertTrue(referenceCurrencyResult instanceof DirectMetaProperty);
    assertEquals("fixingRelativeTo", actualMetaPropertyGetResult.name());
    Class<FxResetFixingRelativeTo> expectedPropertyTypeResult = FxResetFixingRelativeTo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixingRelativeTo());
    assertSame(metaBeanResult, fixingDateOffsetResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, initialNotionalValueResult.metaBean());
    assertSame(metaBeanResult, referenceCurrencyResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return name is {@code index}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'index'; then return name is 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndex_thenReturnNameIsIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetCalculation.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DaysAdjustment> fixingDateOffsetResult =
        ((Meta) metaBeanResult).fixingDateOffset();
    assertTrue(fixingDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<FxResetFixingRelativeTo> fixingRelativeToResult =
        ((Meta) metaBeanResult).fixingRelativeTo();
    assertTrue(fixingRelativeToResult instanceof DirectMetaProperty);
    MetaProperty<Double> initialNotionalValueResult =
        ((Meta) metaBeanResult).initialNotionalValue();
    assertTrue(initialNotionalValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Currency> referenceCurrencyResult = ((Meta) metaBeanResult).referenceCurrency();
    assertTrue(referenceCurrencyResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<FxIndex> expectedPropertyTypeResult = FxIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
    assertSame(metaBeanResult, fixingDateOffsetResult.metaBean());
    assertSame(metaBeanResult, fixingRelativeToResult.metaBean());
    assertSame(metaBeanResult, initialNotionalValueResult.metaBean());
    assertSame(metaBeanResult, referenceCurrencyResult.metaBean());
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
    assertNull(FxResetCalculation.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code referenceCurrency}.
   *   <li>Then return name is {@code referenceCurrency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'referenceCurrency'; then return name is 'referenceCurrency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenReferenceCurrency_thenReturnNameIsReferenceCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxResetCalculation.meta().metaPropertyGet("referenceCurrency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DaysAdjustment> fixingDateOffsetResult =
        ((Meta) metaBeanResult).fixingDateOffset();
    assertTrue(fixingDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<FxResetFixingRelativeTo> fixingRelativeToResult =
        ((Meta) metaBeanResult).fixingRelativeTo();
    assertTrue(fixingRelativeToResult instanceof DirectMetaProperty);
    MetaProperty<FxIndex> indexResult = ((Meta) metaBeanResult).index();
    assertTrue(indexResult instanceof DirectMetaProperty);
    MetaProperty<Double> initialNotionalValueResult =
        ((Meta) metaBeanResult).initialNotionalValue();
    assertTrue(initialNotionalValueResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("referenceCurrency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).referenceCurrency());
    assertSame(metaBeanResult, fixingDateOffsetResult.metaBean());
    assertSame(metaBeanResult, fixingRelativeToResult.metaBean());
    assertSame(metaBeanResult, indexResult.metaBean());
    assertSame(metaBeanResult, initialNotionalValueResult.metaBean());
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
        FxResetCalculation.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("fixingDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("fixingRelativeTo") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("initialNotionalValue") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("referenceCurrency") instanceof DirectMetaProperty);
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
    assertNull(FxResetCalculation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> FxResetCalculation.meta().propertyGet(null, "Property Name", false));
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
            FxResetCalculation.meta()
                .propertySet(mock(Bean.class), "fixingDateOffset", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingDateOffset}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingDateOffset'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingDateOffset_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxResetCalculation.meta()
                .propertySet(mock(Bean.class), "fixingDateOffset", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixingRelativeTo}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixingRelativeTo'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixingRelativeTo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxResetCalculation.meta()
                .propertySet(mock(Bean.class), "fixingRelativeTo", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> FxResetCalculation.meta().propertySet(mock(Bean.class), "index", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialNotionalValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'initialNotionalValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInitialNotionalValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxResetCalculation.meta()
                .propertySet(mock(Bean.class), "initialNotionalValue", "New Value", true));
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
            FxResetCalculation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code referenceCurrency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'referenceCurrency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenReferenceCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxResetCalculation.meta()
                .propertySet(mock(Bean.class), "referenceCurrency", "New Value", true));
  }
}
