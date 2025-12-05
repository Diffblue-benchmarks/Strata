package com.opengamma.strata.product.swap.type;

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
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.index.ImmutablePriceIndex;
import com.opengamma.strata.basics.schedule.StubConvention;
import com.opengamma.strata.product.swap.CompoundingMethod;
import com.opengamma.strata.product.swap.FixedAccrualMethod;
import com.opengamma.strata.product.swap.PriceIndexCalculationMethod;
import com.opengamma.strata.product.swap.type.FixedInflationSwapTemplate.Builder;
import com.opengamma.strata.product.swap.type.FixedInflationSwapTemplate.Meta;
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

class FixedInflationSwapTemplateDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedInflationSwapTemplate Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange
    FixedInflationSwapConvention convention = FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI;

    // Act
    Builder actualConventionResult = FixedInflationSwapTemplate.builder().convention(convention);
    Tenor tenor = Tenor.ofDays(1);
    FixedInflationSwapTemplate actualFixedInflationSwapTemplate =
        actualConventionResult.tenor(tenor).build();

    // Assert
    assertSame(tenor, actualFixedInflationSwapTemplate.getTenor());
    assertSame(convention, actualFixedInflationSwapTemplate.getConvention());
  }

  /**
   * Test Builder {@link Builder#convention(FixedInflationSwapConvention)}.
   *
   * <ul>
   *   <li>When {@link FixedInflationSwapConventions#CHF_FIXED_ZC_CH_CPI}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#convention(FixedInflationSwapConvention)}
   */
  @Test
  @DisplayName(
      "Test Builder convention(FixedInflationSwapConvention); when CHF_FIXED_ZC_CH_CPI; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.convention(FixedInflationSwapConvention)"})
  void testBuilderConvention_whenChf_fixed_zc_ch_cpi_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedInflationSwapTemplate.builder();

    // Act
    Builder actualConventionResult =
        builderResult.convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);

    // Assert
    assertSame(builderResult, actualConventionResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'convention'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenConvention_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedInflationSwapTemplate.builder().get("convention"));
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
        () -> FixedInflationSwapTemplate.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'tenor'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenTenor_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FixedInflationSwapTemplate.builder().get("tenor"));
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
        () -> FixedInflationSwapTemplate.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'convention'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenConvention_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedInflationSwapTemplate.builder();

    // Act
    Builder actualSetResult = builderResult.set("convention", null);

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
    Builder builderResult = FixedInflationSwapTemplate.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#tenor(Tenor)}.
   *
   * <ul>
   *   <li>When ofDays one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#tenor(Tenor)}
   */
  @Test
  @DisplayName("Test Builder tenor(Tenor); when ofDays one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.tenor(Tenor)"})
  void testBuilderTenor_whenOfDaysOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = FixedInflationSwapTemplate.builder();

    // Act
    Builder actualTenorResult = builderResult.tenor(Tenor.ofDays(1));

    // Assert
    assertSame(builderResult, actualTenorResult);
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
    Class<? extends FixedInflationSwapTemplate> actualBeanTypeResult =
        FixedInflationSwapTemplate.meta().beanType();

    // Assert
    Class<FixedInflationSwapTemplate> expectedBeanTypeResult = FixedInflationSwapTemplate.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#convention()}
   *   <li>{@link Meta#tenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.convention()", "MetaProperty Meta.tenor()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FixedInflationSwapTemplate.meta();

    // Act
    MetaProperty<FixedInflationSwapConvention> actualConventionResult = metaResult.convention();

    // Assert
    assertTrue(actualConventionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.tenor() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then metaBean tenor return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'convention'; then metaBean tenor return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenConvention_thenMetaBeanTenorReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedInflationSwapTemplate.meta().metaPropertyGet("convention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("convention", actualMetaPropertyGetResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, tenorResult.propertyType());
    Class<FixedInflationSwapConvention> expectedPropertyTypeResult2 =
        FixedInflationSwapConvention.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<FixedInflationSwapTemplate> expectedDeclaringTypeResult =
        FixedInflationSwapTemplate.class;
    assertEquals(expectedDeclaringTypeResult, tenorResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).convention());
    assertSame(Meta.INSTANCE, tenorResult.metaBean());
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
    assertNull(FixedInflationSwapTemplate.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then metaBean convention return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'tenor'; then metaBean convention return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTenor_thenMetaBeanConventionReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedInflationSwapTemplate.meta().metaPropertyGet("tenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<FixedInflationSwapConvention> conventionResult =
        ((Meta) metaBeanResult).convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("convention", conventionResult.name());
    assertEquals("tenor", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, conventionResult.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<FixedInflationSwapConvention> expectedPropertyTypeResult2 =
        FixedInflationSwapConvention.class;
    assertEquals(expectedPropertyTypeResult2, conventionResult.propertyType());
    Class<FixedInflationSwapTemplate> expectedDeclaringTypeResult =
        FixedInflationSwapTemplate.class;
    assertEquals(expectedDeclaringTypeResult, conventionResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tenor());
    assertSame(Meta.INSTANCE, conventionResult.metaBean());
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
        FixedInflationSwapTemplate.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("tenor");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("convention");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("convention", getResult2.name());
    assertEquals("tenor", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<FixedInflationSwapConvention> expectedPropertyTypeResult2 =
        FixedInflationSwapConvention.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<FixedInflationSwapTemplate> expectedDeclaringTypeResult =
        FixedInflationSwapTemplate.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<FixedInflationSwapTemplate> expectedDeclaringTypeResult2 =
        FixedInflationSwapTemplate.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then FloatingLeg Index return {@link ImmutablePriceIndex}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then FloatingLeg Index return ImmutablePriceIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenFloatingLegIndexReturnImmutablePriceIndex() {
    // Arrange
    Meta metaResult = FixedInflationSwapTemplate.meta();

    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(conventionResult.tenor(Tenor.ofDays(1)).build(), "convention", true);

    // Assert
    InflationRateSwapLegConvention floatingLeg =
        ((ImmutableFixedInflationSwapConvention) actualPropertyGetResult).getFloatingLeg();
    assertTrue(floatingLeg.getIndex() instanceof ImmutablePriceIndex);
    assertTrue(actualPropertyGetResult instanceof ImmutableFixedInflationSwapConvention);
    assertEquals(
        "CHF-FIXED-ZC-CH-CPI",
        ((ImmutableFixedInflationSwapConvention) actualPropertyGetResult).getName());
    assertEquals(
        2,
        ((ImmutableFixedInflationSwapConvention) actualPropertyGetResult)
            .getSpotDateOffset()
            .getDays());
    FixedRateSwapLegConvention fixedLeg =
        ((ImmutableFixedInflationSwapConvention) actualPropertyGetResult).getFixedLeg();
    assertEquals(StubConvention.SMART_INITIAL, fixedLeg.getStubConvention());
    assertEquals(CompoundingMethod.STRAIGHT, fixedLeg.getCompoundingMethod());
    assertEquals(FixedAccrualMethod.DEFAULT, fixedLeg.getAccrualMethod());
    assertEquals(PriceIndexCalculationMethod.MONTHLY, floatingLeg.getIndexCalculationMethod());
    assertFalse(floatingLeg.isNotionalExchange());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return ofDays one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return ofDays one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnOfDaysOne() {
    // Arrange
    Meta metaResult = FixedInflationSwapTemplate.meta();

    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);
    Tenor tenor = Tenor.ofDays(1);

    // Act and Assert
    assertSame(tenor, metaResult.propertyGet(conventionResult.tenor(tenor).build(), "tenor", true));
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
        FixedInflationSwapTemplate.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> FixedInflationSwapTemplate.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code convention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'convention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedInflationSwapTemplate.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", true));
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
            FixedInflationSwapTemplate.meta()
                .propertySet(mock(Bean.class), "convention", "New Value", false));
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
            FixedInflationSwapTemplate.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'tenor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTenor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedInflationSwapTemplate.meta()
                .propertySet(mock(Bean.class), "tenor", "New Value", true));
  }

  /**
   * Test {@link FixedInflationSwapTemplate#of(Tenor, FixedInflationSwapConvention)}.
   *
   * <ul>
   *   <li>Then Convention return {@link ImmutableFixedInflationSwapConvention}.
   * </ul>
   *
   * <p>Method under test: {@link FixedInflationSwapTemplate#of(Tenor,
   * FixedInflationSwapConvention)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, FixedInflationSwapConvention); then Convention return ImmutableFixedInflationSwapConvention")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FixedInflationSwapTemplate FixedInflationSwapTemplate.of(Tenor, FixedInflationSwapConvention)"
  })
  void testOf_thenConventionReturnImmutableFixedInflationSwapConvention() {
    // Arrange
    Tenor tenor = Tenor.ofDays(1);
    FixedInflationSwapConvention convention = FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI;

    // Act
    FixedInflationSwapTemplate actualOfResult = FixedInflationSwapTemplate.of(tenor, convention);

    // Assert
    FixedInflationSwapConvention convention2 = actualOfResult.getConvention();
    assertTrue(convention2 instanceof ImmutableFixedInflationSwapConvention);
    assertEquals("CHF-FIXED-ZC-CH-CPI", convention2.getName());
    assertSame(tenor, actualOfResult.getTenor());
    assertSame(convention, convention2);
  }

  /**
   * Test {@link FixedInflationSwapTemplate#meta()}.
   *
   * <p>Method under test: {@link FixedInflationSwapTemplate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedInflationSwapTemplate.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FixedInflationSwapTemplate.meta();

    // Assert
    MetaProperty<FixedInflationSwapConvention> conventionResult = actualMetaResult.convention();
    assertTrue(conventionResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = actualMetaResult.tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("convention", conventionResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, conventionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, tenorResult.propertyType());
    Class<FixedInflationSwapConvention> expectedPropertyTypeResult2 =
        FixedInflationSwapConvention.class;
    assertEquals(expectedPropertyTypeResult2, conventionResult.propertyType());
    Class<FixedInflationSwapTemplate> expectedDeclaringTypeResult =
        FixedInflationSwapTemplate.class;
    assertEquals(expectedDeclaringTypeResult, conventionResult.declaringType());
    Class<FixedInflationSwapTemplate> expectedDeclaringTypeResult2 =
        FixedInflationSwapTemplate.class;
    assertEquals(expectedDeclaringTypeResult2, tenorResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, conventionResult.metaBean());
    assertSame(meta, tenorResult.metaBean());
  }

  /**
   * Test {@link FixedInflationSwapTemplate#metaBean()}.
   *
   * <p>Method under test: {@link FixedInflationSwapTemplate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedInflationSwapTemplate.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);

    // Act and Assert
    assertSame(Meta.INSTANCE, conventionResult.tenor(Tenor.ofDays(1)).build().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedInflationSwapTemplate#toString()}
   *   <li>{@link FixedInflationSwapTemplate#getConvention()}
   *   <li>{@link FixedInflationSwapTemplate#getTenor()}
   *   <li>{@link FixedInflationSwapTemplate#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FixedInflationSwapConvention FixedInflationSwapTemplate.getConvention()",
    "Tenor FixedInflationSwapTemplate.getTenor()",
    "Builder FixedInflationSwapTemplate.toBuilder()",
    "String FixedInflationSwapTemplate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);
    Tenor tenor = Tenor.ofDays(1);
    FixedInflationSwapTemplate fixedInflationSwapTemplate = conventionResult.tenor(tenor).build();

    // Act
    String actualToStringResult = fixedInflationSwapTemplate.toString();
    FixedInflationSwapConvention actualConvention = fixedInflationSwapTemplate.getConvention();
    Tenor actualTenor = fixedInflationSwapTemplate.getTenor();
    fixedInflationSwapTemplate.toBuilder();

    // Assert
    assertTrue(actualConvention instanceof ImmutableFixedInflationSwapConvention);
    assertEquals(
        "FixedInflationSwapTemplate{tenor=1D, convention=CHF-FIXED-ZC-CH-CPI}",
        actualToStringResult);
    assertSame(tenor, actualTenor);
  }

  /**
   * Test {@link FixedInflationSwapTemplate#equals(Object)}, and {@link
   * FixedInflationSwapTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedInflationSwapTemplate#equals(Object)}
   *   <li>{@link FixedInflationSwapTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedInflationSwapTemplate.equals(Object)",
    "int FixedInflationSwapTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);
    FixedInflationSwapTemplate fixedInflationSwapTemplate =
        conventionResult.tenor(Tenor.ofDays(1)).build();

    Builder conventionResult2 =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);
    FixedInflationSwapTemplate fixedInflationSwapTemplate2 =
        conventionResult2.tenor(Tenor.ofDays(1)).build();

    // Act and Assert
    assertEquals(fixedInflationSwapTemplate, fixedInflationSwapTemplate2);
    assertEquals(fixedInflationSwapTemplate.hashCode(), fixedInflationSwapTemplate2.hashCode());
  }

  /**
   * Test {@link FixedInflationSwapTemplate#equals(Object)}, and {@link
   * FixedInflationSwapTemplate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedInflationSwapTemplate#equals(Object)}
   *   <li>{@link FixedInflationSwapTemplate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedInflationSwapTemplate.equals(Object)",
    "int FixedInflationSwapTemplate.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);
    FixedInflationSwapTemplate fixedInflationSwapTemplate =
        conventionResult.tenor(Tenor.ofDays(1)).build();

    // Act and Assert
    assertEquals(fixedInflationSwapTemplate, fixedInflationSwapTemplate);
    int expectedHashCodeResult = fixedInflationSwapTemplate.hashCode();
    assertEquals(expectedHashCodeResult, fixedInflationSwapTemplate.hashCode());
  }

  /**
   * Test {@link FixedInflationSwapTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedInflationSwapTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedInflationSwapTemplate.equals(Object)",
    "int FixedInflationSwapTemplate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);
    FixedInflationSwapTemplate fixedInflationSwapTemplate =
        conventionResult.tenor(Tenor.ofMonths(1)).build();

    Builder conventionResult2 =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);

    // Act and Assert
    assertNotEquals(fixedInflationSwapTemplate, conventionResult2.tenor(Tenor.ofDays(1)).build());
  }

  /**
   * Test {@link FixedInflationSwapTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedInflationSwapTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedInflationSwapTemplate.equals(Object)",
    "int FixedInflationSwapTemplate.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.EUR_FIXED_ZC_EU_AI_CPI);
    FixedInflationSwapTemplate fixedInflationSwapTemplate =
        conventionResult.tenor(Tenor.ofDays(1)).build();

    Builder conventionResult2 =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);

    // Act and Assert
    assertNotEquals(fixedInflationSwapTemplate, conventionResult2.tenor(Tenor.ofDays(1)).build());
  }

  /**
   * Test {@link FixedInflationSwapTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedInflationSwapTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedInflationSwapTemplate.equals(Object)",
    "int FixedInflationSwapTemplate.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);

    // Act and Assert
    assertNotEquals(conventionResult.tenor(Tenor.ofDays(1)).build(), null);
  }

  /**
   * Test {@link FixedInflationSwapTemplate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedInflationSwapTemplate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedInflationSwapTemplate.equals(Object)",
    "int FixedInflationSwapTemplate.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder conventionResult =
        FixedInflationSwapTemplate.builder()
            .convention(FixedInflationSwapConventions.CHF_FIXED_ZC_CH_CPI);

    // Act and Assert
    assertNotEquals(
        conventionResult.tenor(Tenor.ofDays(1)).build(),
        "Different type to FixedInflationSwapTemplate");
  }
}
