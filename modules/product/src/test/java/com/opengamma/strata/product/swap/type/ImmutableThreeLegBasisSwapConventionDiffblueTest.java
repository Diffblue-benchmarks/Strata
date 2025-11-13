package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.product.swap.type.ImmutableThreeLegBasisSwapConvention.Builder;
import com.opengamma.strata.product.swap.type.ImmutableThreeLegBasisSwapConvention.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutableThreeLegBasisSwapConventionDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code flatFloatingLeg}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'flatFloatingLeg'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFlatFloatingLeg_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableThreeLegBasisSwapConvention.builder().get("flatFloatingLeg"));
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
    assertNull(ImmutableThreeLegBasisSwapConvention.builder().get("name"));
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
        () -> ImmutableThreeLegBasisSwapConvention.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code spotDateOffset}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'spotDateOffset'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSpotDateOffset_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableThreeLegBasisSwapConvention.builder().get("spotDateOffset"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code spreadFloatingLeg}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'spreadFloatingLeg'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSpreadFloatingLeg_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableThreeLegBasisSwapConvention.builder().get("spreadFloatingLeg"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code spreadLeg}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'spreadLeg'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSpreadLeg_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutableThreeLegBasisSwapConvention.builder().get("spreadLeg"));
  }

  /**
   * Test Builder {@link Builder#name(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(String)}
   */
  @Test
  @DisplayName("Test Builder name(String); when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(String)"})
  void testBuilderName_whenName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableThreeLegBasisSwapConvention.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

    // Assert
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
        () -> ImmutableThreeLegBasisSwapConvention.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code flatFloatingLeg}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'flatFloatingLeg'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenFlatFloatingLeg_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableThreeLegBasisSwapConvention.builder();

    // Act
    Builder actualSetResult = builderResult.set("flatFloatingLeg", null);

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
    Builder builderResult = ImmutableThreeLegBasisSwapConvention.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#spotDateOffset(DaysAdjustment)}.
   *
   * <ul>
   *   <li>When {@link DaysAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#spotDateOffset(DaysAdjustment)}
   */
  @Test
  @DisplayName("Test Builder spotDateOffset(DaysAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.spotDateOffset(DaysAdjustment)"})
  void testBuilderSpotDateOffset_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutableThreeLegBasisSwapConvention.builder();

    // Act
    Builder actualSpotDateOffsetResult = builderResult.spotDateOffset(DaysAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualSpotDateOffsetResult);
  }

  /**
   * Test {@link ImmutableThreeLegBasisSwapConvention#meta()}.
   *
   * <p>Method under test: {@link ImmutableThreeLegBasisSwapConvention#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutableThreeLegBasisSwapConvention.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutableThreeLegBasisSwapConvention.meta();

    // Assert
    assertTrue(actualMetaResult.flatFloatingLeg() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.spotDateOffset() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.spreadFloatingLeg() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.spreadLeg() instanceof DirectMetaProperty);
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
    Class<? extends ImmutableThreeLegBasisSwapConvention> actualBeanTypeResult =
        ImmutableThreeLegBasisSwapConvention.meta().beanType();

    // Assert
    Class<ImmutableThreeLegBasisSwapConvention> expectedBeanTypeResult =
        ImmutableThreeLegBasisSwapConvention.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#flatFloatingLeg()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#spotDateOffset()}
   *   <li>{@link Meta#spreadFloatingLeg()}
   *   <li>{@link Meta#spreadLeg()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.flatFloatingLeg()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.spotDateOffset()",
    "MetaProperty Meta.spreadFloatingLeg()",
    "MetaProperty Meta.spreadLeg()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutableThreeLegBasisSwapConvention.meta();

    // Act
    MetaProperty<IborRateSwapLegConvention> actualFlatFloatingLegResult =
        metaResult.flatFloatingLeg();
    MetaProperty<String> actualNameResult = metaResult.name();
    MetaProperty<DaysAdjustment> actualSpotDateOffsetResult = metaResult.spotDateOffset();
    MetaProperty<IborRateSwapLegConvention> actualSpreadFloatingLegResult =
        metaResult.spreadFloatingLeg();

    // Assert
    assertTrue(actualFlatFloatingLegResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualSpotDateOffsetResult instanceof DirectMetaProperty);
    assertTrue(actualSpreadFloatingLegResult instanceof DirectMetaProperty);
    assertTrue(metaResult.spreadLeg() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code flatFloatingLeg}.
   *   <li>Then return name is {@code flatFloatingLeg}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'flatFloatingLeg'; then return name is 'flatFloatingLeg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFlatFloatingLeg_thenReturnNameIsFlatFloatingLeg() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableThreeLegBasisSwapConvention.meta().metaPropertyGet("flatFloatingLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<IborRateSwapLegConvention> spreadFloatingLegResult =
        ((Meta) metaBeanResult).spreadFloatingLeg();
    assertTrue(spreadFloatingLegResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateSwapLegConvention> spreadLegResult = ((Meta) metaBeanResult).spreadLeg();
    assertTrue(spreadLegResult instanceof DirectMetaProperty);
    assertEquals("flatFloatingLeg", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).flatFloatingLeg());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
    assertSame(metaBeanResult, spreadFloatingLegResult.metaBean());
    assertSame(metaBeanResult, spreadLegResult.metaBean());
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
        ImmutableThreeLegBasisSwapConvention.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborRateSwapLegConvention> flatFloatingLegResult =
        ((Meta) metaBeanResult).flatFloatingLeg();
    assertTrue(flatFloatingLegResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<IborRateSwapLegConvention> spreadFloatingLegResult =
        ((Meta) metaBeanResult).spreadFloatingLeg();
    assertTrue(spreadFloatingLegResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateSwapLegConvention> spreadLegResult = ((Meta) metaBeanResult).spreadLeg();
    assertTrue(spreadLegResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, flatFloatingLegResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
    assertSame(metaBeanResult, spreadFloatingLegResult.metaBean());
    assertSame(metaBeanResult, spreadLegResult.metaBean());
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
    assertNull(ImmutableThreeLegBasisSwapConvention.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spotDateOffset}.
   *   <li>Then return name is {@code spotDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'spotDateOffset'; then return name is 'spotDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpotDateOffset_thenReturnNameIsSpotDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableThreeLegBasisSwapConvention.meta().metaPropertyGet("spotDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborRateSwapLegConvention> flatFloatingLegResult =
        ((Meta) metaBeanResult).flatFloatingLeg();
    assertTrue(flatFloatingLegResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<IborRateSwapLegConvention> spreadFloatingLegResult =
        ((Meta) metaBeanResult).spreadFloatingLeg();
    assertTrue(spreadFloatingLegResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateSwapLegConvention> spreadLegResult = ((Meta) metaBeanResult).spreadLeg();
    assertTrue(spreadLegResult instanceof DirectMetaProperty);
    assertEquals("spotDateOffset", actualMetaPropertyGetResult.name());
    Class<DaysAdjustment> expectedPropertyTypeResult = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spotDateOffset());
    assertSame(metaBeanResult, flatFloatingLegResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, spreadFloatingLegResult.metaBean());
    assertSame(metaBeanResult, spreadLegResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spreadFloatingLeg}.
   *   <li>Then return name is {@code spreadFloatingLeg}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'spreadFloatingLeg'; then return name is 'spreadFloatingLeg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpreadFloatingLeg_thenReturnNameIsSpreadFloatingLeg() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableThreeLegBasisSwapConvention.meta().metaPropertyGet("spreadFloatingLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborRateSwapLegConvention> flatFloatingLegResult =
        ((Meta) metaBeanResult).flatFloatingLeg();
    assertTrue(flatFloatingLegResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<FixedRateSwapLegConvention> spreadLegResult = ((Meta) metaBeanResult).spreadLeg();
    assertTrue(spreadLegResult instanceof DirectMetaProperty);
    assertEquals("spreadFloatingLeg", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spreadFloatingLeg());
    assertSame(metaBeanResult, flatFloatingLegResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
    assertSame(metaBeanResult, spreadLegResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code spreadLeg}.
   *   <li>Then return name is {@code spreadLeg}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'spreadLeg'; then return name is 'spreadLeg'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpreadLeg_thenReturnNameIsSpreadLeg() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutableThreeLegBasisSwapConvention.meta().metaPropertyGet("spreadLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborRateSwapLegConvention> flatFloatingLegResult =
        ((Meta) metaBeanResult).flatFloatingLeg();
    assertTrue(flatFloatingLegResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> spotDateOffsetResult = ((Meta) metaBeanResult).spotDateOffset();
    assertTrue(spotDateOffsetResult instanceof DirectMetaProperty);
    MetaProperty<IborRateSwapLegConvention> spreadFloatingLegResult =
        ((Meta) metaBeanResult).spreadFloatingLeg();
    assertTrue(spreadFloatingLegResult instanceof DirectMetaProperty);
    assertEquals("spreadLeg", actualMetaPropertyGetResult.name());
    Class<FixedRateSwapLegConvention> expectedPropertyTypeResult = FixedRateSwapLegConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).spreadLeg());
    assertSame(metaBeanResult, flatFloatingLegResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, spotDateOffsetResult.metaBean());
    assertSame(metaBeanResult, spreadFloatingLegResult.metaBean());
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
        ImmutableThreeLegBasisSwapConvention.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("flatFloatingLeg") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("spotDateOffset") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("spreadFloatingLeg") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("spreadLeg") instanceof DirectMetaProperty);
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
            ImmutableThreeLegBasisSwapConvention.meta()
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
        ImmutableThreeLegBasisSwapConvention.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
            ImmutableThreeLegBasisSwapConvention.meta()
                .propertySet(mock(Bean.class), "flatFloatingLeg", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code flatFloatingLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'flatFloatingLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFlatFloatingLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableThreeLegBasisSwapConvention.meta()
                .propertySet(mock(Bean.class), "flatFloatingLeg", "New Value", true));
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
            ImmutableThreeLegBasisSwapConvention.meta()
                .propertySet(mock(Bean.class), "name", "New Value", true));
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
            ImmutableThreeLegBasisSwapConvention.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code spotDateOffset}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'spotDateOffset'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpotDateOffset_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableThreeLegBasisSwapConvention.meta()
                .propertySet(mock(Bean.class), "spotDateOffset", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code spreadFloatingLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'spreadFloatingLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpreadFloatingLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableThreeLegBasisSwapConvention.meta()
                .propertySet(mock(Bean.class), "spreadFloatingLeg", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code spreadLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'spreadLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpreadLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutableThreeLegBasisSwapConvention.meta()
                .propertySet(mock(Bean.class), "spreadLeg", "New Value", true));
  }
}
