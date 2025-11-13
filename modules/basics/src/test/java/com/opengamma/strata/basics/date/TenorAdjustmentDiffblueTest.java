package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.basics.date.TenorAdjustment.Builder;
import com.opengamma.strata.basics.date.TenorAdjustment.Meta;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
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
import org.mockito.Mockito;

class TenorAdjustmentDiffblueTest {
  /**
   * Test Builder {@link Builder#additionConvention(PeriodAdditionConvention)}.
   *
   * <ul>
   *   <li>When {@link PeriodAdditionConventions#LAST_BUSINESS_DAY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#additionConvention(PeriodAdditionConvention)}
   */
  @Test
  @DisplayName(
      "Test Builder additionConvention(PeriodAdditionConvention); when LAST_BUSINESS_DAY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.additionConvention(PeriodAdditionConvention)"})
  void testBuilderAdditionConvention_whenLast_business_day_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TenorAdjustment.builder();

    // Act
    Builder actualAdditionConventionResult =
        builderResult.additionConvention(PeriodAdditionConventions.LAST_BUSINESS_DAY);

    // Assert
    assertSame(builderResult, actualAdditionConventionResult);
  }

  /**
   * Test Builder {@link Builder#adjustment(BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link BusinessDayAdjustment#NONE}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#adjustment(BusinessDayAdjustment)}
   */
  @Test
  @DisplayName("Test Builder adjustment(BusinessDayAdjustment); when NONE; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.adjustment(BusinessDayAdjustment)"})
  void testBuilderAdjustment_whenNone_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TenorAdjustment.builder();

    // Act
    Builder actualAdjustmentResult = builderResult.adjustment(BusinessDayAdjustment.NONE);

    // Assert
    assertSame(builderResult, actualAdjustmentResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code additionConvention}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'additionConvention'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAdditionConvention_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TenorAdjustment.builder().get("additionConvention"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'adjustment'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenAdjustment_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TenorAdjustment.builder().get("adjustment"));
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
        NoSuchElementException.class, () -> TenorAdjustment.builder().get("Property Name"));
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
    assertNull(TenorAdjustment.builder().get("tenor"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName("Test Builder set(String, Object) with 'propertyName', 'newValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> TenorAdjustment.builder().set("Property Name", "New Value"));
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
    Builder builderResult = TenorAdjustment.builder();

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
   *   <li>When {@link Tenor#TENOR_10M}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#tenor(Tenor)}
   */
  @Test
  @DisplayName("Test Builder tenor(Tenor); when TENOR_10M; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.tenor(Tenor)"})
  void testBuilderTenor_whenTenor_10m_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TenorAdjustment.builder();

    // Act
    Builder actualTenorResult = builderResult.tenor(Tenor.TENOR_10M);

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
    Class<? extends TenorAdjustment> actualBeanTypeResult = TenorAdjustment.meta().beanType();

    // Assert
    Class<TenorAdjustment> expectedBeanTypeResult = TenorAdjustment.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#additionConvention()}
   *   <li>{@link Meta#adjustment()}
   *   <li>{@link Meta#tenor()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.additionConvention()",
    "MetaProperty Meta.adjustment()",
    "MetaProperty Meta.tenor()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TenorAdjustment.meta();

    // Act
    MetaProperty<PeriodAdditionConvention> actualAdditionConventionResult =
        metaResult.additionConvention();
    MetaProperty<BusinessDayAdjustment> actualAdjustmentResult = metaResult.adjustment();

    // Assert
    assertTrue(actualAdditionConventionResult instanceof DirectMetaProperty);
    assertTrue(actualAdjustmentResult instanceof DirectMetaProperty);
    assertTrue(metaResult.tenor() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code additionConvention}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'additionConvention'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsAdditionConvention() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorAdjustment.meta().metaPropertyGet("additionConvention");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("additionConvention", actualMetaPropertyGetResult.name());
    Class<PeriodAdditionConvention> expectedPropertyTypeResult = PeriodAdditionConvention.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).additionConvention());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
    assertSame(metaBeanResult, tenorResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then return name is {@code adjustment}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'adjustment'; then return name is 'adjustment'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAdjustment_thenReturnNameIsAdjustment() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TenorAdjustment.meta().metaPropertyGet("adjustment");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PeriodAdditionConvention> additionConventionResult =
        ((Meta) metaBeanResult).additionConvention();
    assertTrue(additionConventionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = ((Meta) metaBeanResult).tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("adjustment", actualMetaPropertyGetResult.name());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).adjustment());
    assertSame(metaBeanResult, additionConventionResult.metaBean());
    assertSame(metaBeanResult, tenorResult.metaBean());
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
    assertNull(TenorAdjustment.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code tenor}.
   *   <li>Then return name is {@code tenor}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'tenor'; then return name is 'tenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTenor_thenReturnNameIsTenor() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TenorAdjustment.meta().metaPropertyGet("tenor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<PeriodAdditionConvention> additionConventionResult =
        ((Meta) metaBeanResult).additionConvention();
    assertTrue(additionConventionResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = ((Meta) metaBeanResult).adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("tenor", actualMetaPropertyGetResult.name());
    Class<Tenor> expectedPropertyTypeResult = Tenor.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tenor());
    assertSame(metaBeanResult, additionConventionResult.metaBean());
    assertSame(metaBeanResult, adjustmentResult.metaBean());
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
        TenorAdjustment.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("tenor");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("additionConvention");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("adjustment");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("additionConvention", getResult2.name());
    assertEquals("adjustment", getResult3.name());
    assertEquals("tenor", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<PeriodAdditionConvention> expectedPropertyTypeResult2 = PeriodAdditionConvention.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<Tenor> expectedPropertyTypeResult3 = Tenor.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Class<TenorAdjustment> expectedDeclaringTypeResult = TenorAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<TenorAdjustment> expectedDeclaringTypeResult2 = TenorAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<TenorAdjustment> expectedDeclaringTypeResult3 = TenorAdjustment.class;
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
   *   <li>Then builder adjustment {@link BusinessDayAdjustment#NONE} tenor {@link Tenor#TENOR_10M}
   *       build Adjustment is {@link BusinessDayAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then builder adjustment NONE tenor TENOR_10M build Adjustment is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenBuilderAdjustmentNoneTenorTenor_10mBuildAdjustmentIsNone() {
    // Arrange
    Meta metaResult = TenorAdjustment.meta();

    Builder builderResult = TenorAdjustment.builder();
    builderResult.additionConvention(PeriodAdditionConventions.LAST_BUSINESS_DAY);
    TenorAdjustment bean =
        builderResult.adjustment(BusinessDayAdjustment.NONE).tenor(Tenor.TENOR_10M).build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "adjustment", true);

    // Assert
    BusinessDayAdjustment businessDayAdjustment =
        ((BusinessDayAdjustment) actualPropertyGetResult).NONE;
    assertSame(businessDayAdjustment, bean.getAdjustment());
    assertSame(businessDayAdjustment, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then builder adjustment {@link BusinessDayAdjustment#NONE} tenor {@link Tenor#TENOR_10M}
   *       build Tenor is {@link Tenor#TENOR_10M}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then builder adjustment NONE tenor TENOR_10M build Tenor is TENOR_10M")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenBuilderAdjustmentNoneTenorTenor_10mBuildTenorIsTenor_10m() {
    // Arrange
    Meta metaResult = TenorAdjustment.meta();

    Builder builderResult = TenorAdjustment.builder();
    builderResult.additionConvention(PeriodAdditionConventions.LAST_BUSINESS_DAY);
    TenorAdjustment bean =
        builderResult.adjustment(BusinessDayAdjustment.NONE).tenor(Tenor.TENOR_10M).build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "tenor", true);

    // Assert
    Tenor tenor = ((Tenor) actualPropertyGetResult).TENOR_10M;
    assertSame(tenor, bean.getTenor());
    assertSame(tenor, actualPropertyGetResult);
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
    Meta metaResult = TenorAdjustment.meta();
    TenorAdjustment bean =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code additionConvention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'additionConvention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAdditionConvention_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = TenorAdjustment.meta();

    Builder builderResult = TenorAdjustment.builder();
    builderResult.additionConvention(PeriodAdditionConventions.LAST_BUSINESS_DAY);

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                builderResult.adjustment(BusinessDayAdjustment.NONE).tenor(Tenor.TENOR_10M).build(),
                "additionConvention",
                true));
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
    assertNull(TenorAdjustment.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code additionConvention}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'additionConvention'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdditionConvention_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorAdjustment.meta()
                .propertySet(mock(Bean.class), "additionConvention", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code adjustment}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'adjustment'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdjustment_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            TenorAdjustment.meta().propertySet(mock(Bean.class), "adjustment", "New Value", true));
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
            TenorAdjustment.meta()
                .propertySet(mock(Bean.class), "additionConvention", "New Value", false));
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
            TenorAdjustment.meta()
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
        () -> TenorAdjustment.meta().propertySet(mock(Bean.class), "tenor", "New Value", true));
  }

  /**
   * Test {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then calls {@link PeriodAdditionConvention#isMonthBased()}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention,
   * BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment); given IllegalArgumentException(); then calls isMonthBased()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorAdjustment TenorAdjustment.of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)"
  })
  void testOf_givenIllegalArgumentException_thenCallsIsMonthBased() {
    // Arrange
    PeriodAdditionConvention additionConvention = mock(PeriodAdditionConvention.class);
    when(additionConvention.isMonthBased()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> TenorAdjustment.of(Tenor.TENOR_10M, additionConvention, BusinessDayAdjustment.NONE));
    verify(additionConvention).isMonthBased();
  }

  /**
   * Test {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link PeriodAdditionConventions#NONE}.
   *   <li>Then return AdditionConvention is {@link PeriodAdditionConventions#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention,
   * BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment); when NONE; then return AdditionConvention is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorAdjustment TenorAdjustment.of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)"
  })
  void testOf_whenNone_thenReturnAdditionConventionIsNone() {
    // Arrange
    PeriodAdditionConvention additionConvention = PeriodAdditionConventions.NONE;

    // Act
    TenorAdjustment actualOfResult =
        TenorAdjustment.of(Tenor.TENOR_10M, additionConvention, BusinessDayAdjustment.NONE);

    // Assert
    assertSame(BusinessDayAdjustment.NONE, actualOfResult.getAdjustment());
    assertSame(additionConvention, actualOfResult.getAdditionConvention());
    assertSame(Tenor.TENOR_10M, actualOfResult.getTenor());
  }

  /**
   * Test {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_10M}.
   *   <li>Then return AdditionConvention is {@link PeriodAdditionConventions#LAST_BUSINESS_DAY}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention,
   * BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment); when TENOR_10M; then return AdditionConvention is LAST_BUSINESS_DAY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorAdjustment TenorAdjustment.of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)"
  })
  void testOf_whenTenor_10m_thenReturnAdditionConventionIsLast_business_day() {
    // Arrange
    PeriodAdditionConvention additionConvention = PeriodAdditionConventions.LAST_BUSINESS_DAY;

    // Act
    TenorAdjustment actualOfResult =
        TenorAdjustment.of(Tenor.TENOR_10M, additionConvention, BusinessDayAdjustment.NONE);

    // Assert
    assertSame(BusinessDayAdjustment.NONE, actualOfResult.getAdjustment());
    assertSame(additionConvention, actualOfResult.getAdditionConvention());
    assertSame(Tenor.TENOR_10M, actualOfResult.getTenor());
  }

  /**
   * Test {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_13W}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#of(Tenor, PeriodAdditionConvention,
   * BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment); when TENOR_13W; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorAdjustment TenorAdjustment.of(Tenor, PeriodAdditionConvention, BusinessDayAdjustment)"
  })
  void testOf_whenTenor_13w_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            TenorAdjustment.of(
                Tenor.TENOR_13W,
                PeriodAdditionConventions.LAST_BUSINESS_DAY,
                BusinessDayAdjustment.NONE));
  }

  /**
   * Test {@link TenorAdjustment#ofLastDay(Tenor, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_10M}.
   *   <li>Then return Adjustment is {@link BusinessDayAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#ofLastDay(Tenor, BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test ofLastDay(Tenor, BusinessDayAdjustment); when TENOR_10M; then return Adjustment is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorAdjustment TenorAdjustment.ofLastDay(Tenor, BusinessDayAdjustment)"})
  void testOfLastDay_whenTenor_10m_thenReturnAdjustmentIsNone() {
    // Arrange and Act
    TenorAdjustment actualOfLastDayResult =
        TenorAdjustment.ofLastDay(Tenor.TENOR_10M, BusinessDayAdjustment.NONE);

    // Assert
    assertSame(BusinessDayAdjustment.NONE, actualOfLastDayResult.getAdjustment());
    assertSame(Tenor.TENOR_10M, actualOfLastDayResult.getTenor());
  }

  /**
   * Test {@link TenorAdjustment#ofLastDay(Tenor, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_13W}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#ofLastDay(Tenor, BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test ofLastDay(Tenor, BusinessDayAdjustment); when TENOR_13W; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TenorAdjustment TenorAdjustment.ofLastDay(Tenor, BusinessDayAdjustment)"})
  void testOfLastDay_whenTenor_13w_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> TenorAdjustment.ofLastDay(Tenor.TENOR_13W, BusinessDayAdjustment.NONE));
  }

  /**
   * Test {@link TenorAdjustment#ofLastBusinessDay(Tenor, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_10M}.
   *   <li>Then return Adjustment is {@link BusinessDayAdjustment#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#ofLastBusinessDay(Tenor, BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test ofLastBusinessDay(Tenor, BusinessDayAdjustment); when TENOR_10M; then return Adjustment is NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorAdjustment TenorAdjustment.ofLastBusinessDay(Tenor, BusinessDayAdjustment)"
  })
  void testOfLastBusinessDay_whenTenor_10m_thenReturnAdjustmentIsNone() {
    // Arrange and Act
    TenorAdjustment actualOfLastBusinessDayResult =
        TenorAdjustment.ofLastBusinessDay(Tenor.TENOR_10M, BusinessDayAdjustment.NONE);

    // Assert
    assertSame(BusinessDayAdjustment.NONE, actualOfLastBusinessDayResult.getAdjustment());
    assertSame(Tenor.TENOR_10M, actualOfLastBusinessDayResult.getTenor());
  }

  /**
   * Test {@link TenorAdjustment#ofLastBusinessDay(Tenor, BusinessDayAdjustment)}.
   *
   * <ul>
   *   <li>When {@link Tenor#TENOR_13W}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#ofLastBusinessDay(Tenor, BusinessDayAdjustment)}
   */
  @Test
  @DisplayName(
      "Test ofLastBusinessDay(Tenor, BusinessDayAdjustment); when TENOR_13W; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TenorAdjustment TenorAdjustment.ofLastBusinessDay(Tenor, BusinessDayAdjustment)"
  })
  void testOfLastBusinessDay_whenTenor_13w_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> TenorAdjustment.ofLastBusinessDay(Tenor.TENOR_13W, BusinessDayAdjustment.NONE));
  }

  /**
   * Test {@link TenorAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <p>Method under test: {@link TenorAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate TenorAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust() {
    // Arrange
    BusinessDayAdjustment adjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M, PeriodAdditionConventions.LAST_BUSINESS_DAY, adjustment);
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = ofResult.adjust(date, refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-11-01", actualAdjustResult.toString());
  }

  /**
   * Test {@link TenorAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test adjust(LocalDate, ReferenceData); then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate TenorAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    PeriodAdditionConvention additionConvention = mock(PeriodAdditionConvention.class);
    when(additionConvention.isMonthBased()).thenReturn(true);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(additionConvention.adjust(
            Mockito.<LocalDate>any(), Mockito.<Period>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    TenorAdjustment ofResult2 =
        TenorAdjustment.of(Tenor.TENOR_10M, additionConvention, BusinessDayAdjustment.NONE);
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = ofResult2.adjust(date, refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    verify(additionConvention)
        .adjust(isA(LocalDate.class), isA(Period.class), isA(HolidayCalendar.class));
    verify(additionConvention).isMonthBased();
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link TenorAdjustment#adjust(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-11-01}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#adjust(LocalDate, ReferenceData)}
   */
  @Test
  @DisplayName("Test adjust(LocalDate, ReferenceData); then return toString is '1970-11-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate TenorAdjustment.adjust(LocalDate, ReferenceData)"})
  void testAdjust_thenReturnToStringIs19701101() {
    // Arrange
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);
    LocalDate date = LocalDate.of(1970, 1, 1);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    LocalDate actualAdjustResult = ofResult.adjust(date, refData);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    assertEquals("1970-11-01", actualAdjustResult.toString());
  }

  /**
   * Test {@link TenorAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link TenorAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DateAdjuster TenorAdjustment.resolve(ReferenceData)"})
  void testResolve() {
    // Arrange
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    ofResult.resolve(refData);

    // Assert that nothing has changed
    verify(refData).getValue(isA(ReferenceDataId.class));
    Tenor tenor = ofResult.getTenor();
    List<TemporalUnit> units = tenor.getUnits();
    assertEquals(3, units.size());
    TemporalUnit getResult = units.get(0);
    assertTrue(getResult instanceof ChronoUnit);
    TemporalUnit getResult2 = units.get(1);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = units.get(2);
    assertTrue(getResult3 instanceof ChronoUnit);
    assertEquals("10M", tenor.toString());
    HolidayCalendarId calendar = ofResult.getAdjustment().getCalendar();
    assertEquals("NoHolidays", calendar.getName());
    assertEquals("NoHolidays", calendar.toString());
    Period period = tenor.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0, period.getYears());
    assertEquals(10, period.getMonths());
    assertEquals(10L, period.toTotalMonths());
    assertEquals(ChronoUnit.DAYS, getResult3);
    assertEquals(ChronoUnit.MONTHS, getResult2);
    assertEquals(ChronoUnit.YEARS, getResult);
    assertFalse(tenor.isWeekBased());
    assertFalse(period.isNegative());
    assertFalse(period.isZero());
    assertTrue(tenor.isMonthBased());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, calendar.getReferenceDataType());
    assertSame(units, period.getUnits());
  }

  /**
   * Test {@link TenorAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link TenorAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DateAdjuster TenorAdjustment.resolve(ReferenceData)"})
  void testResolve2() {
    // Arrange
    PeriodAdditionConvention additionConvention = mock(PeriodAdditionConvention.class);
    when(additionConvention.isMonthBased()).thenReturn(true);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(additionConvention.adjust(
            Mockito.<LocalDate>any(), Mockito.<Period>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    TenorAdjustment ofResult2 =
        TenorAdjustment.of(Tenor.TENOR_10M, additionConvention, BusinessDayAdjustment.NONE);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    DateAdjuster actualResolveResult = ofResult2.resolve(refData);
    LocalDate date = LocalDate.of(1970, 1, 1);
    LocalDate actualAdjustResult = actualResolveResult.adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    verify(additionConvention)
        .adjust(isA(LocalDate.class), isA(Period.class), isA(HolidayCalendar.class));
    verify(additionConvention).isMonthBased();
    Tenor tenor = ofResult2.getTenor();
    assertEquals("10M", tenor.toString());
    assertEquals("1970-01-01", date.toString());
    assertEquals(3, tenor.getUnits().size());
    assertFalse(tenor.isWeekBased());
    assertTrue(tenor.isMonthBased());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link TenorAdjustment#resolve(ReferenceData)}.
   *
   * <p>Method under test: {@link TenorAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName("Test resolve(ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DateAdjuster TenorAdjustment.resolve(ReferenceData)"})
  void testResolve3() {
    // Arrange
    PeriodAdditionConvention additionConvention = mock(PeriodAdditionConvention.class);
    when(additionConvention.isMonthBased()).thenReturn(true);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(additionConvention.adjust(
            Mockito.<LocalDate>any(), Mockito.<Period>any(), Mockito.<HolidayCalendar>any()))
        .thenReturn(ofResult);
    BusinessDayAdjustment adjustment =
        BusinessDayAdjustment.builder()
            .calendar(HolidayCalendarIds.AUSY)
            .convention(BusinessDayConventions.FOLLOWING)
            .build();

    TenorAdjustment ofResult2 = TenorAdjustment.of(Tenor.TENOR_10M, additionConvention, adjustment);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    DateAdjuster actualResolveResult = ofResult2.resolve(refData);
    LocalDate date = LocalDate.of(1970, 1, 1);
    LocalDate actualAdjustResult = actualResolveResult.adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    verify(additionConvention)
        .adjust(isA(LocalDate.class), isA(Period.class), isA(HolidayCalendar.class));
    verify(additionConvention).isMonthBased();
    Tenor tenor = ofResult2.getTenor();
    assertEquals("10M", tenor.toString());
    assertEquals("1970-01-01", date.toString());
    assertEquals(3, tenor.getUnits().size());
    assertFalse(tenor.isWeekBased());
    assertTrue(tenor.isMonthBased());
    assertSame(ofResult, actualAdjustResult);
  }

  /**
   * Test {@link TenorAdjustment#resolve(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return adjust {@link LocalDate} with {@code 1970} and one and one toString is {@code
   *       1970-11-01}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#resolve(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test resolve(ReferenceData); then return adjust LocalDate with '1970' and one and one toString is '1970-11-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DateAdjuster TenorAdjustment.resolve(ReferenceData)"})
  void testResolve_thenReturnAdjustLocalDateWith1970AndOneAndOneToStringIs19701101() {
    // Arrange
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);

    ReferenceData refData = mock(ReferenceData.class);
    when(refData.getValue(Mockito.<ReferenceDataId<HolidayCalendar>>any()))
        .thenReturn(HolidayCalendars.FRI_SAT);

    // Act
    DateAdjuster actualResolveResult = ofResult.resolve(refData);
    LocalDate date = LocalDate.of(1970, 1, 1);
    LocalDate actualAdjustResult = actualResolveResult.adjust(date);

    // Assert
    verify(refData).getValue(isA(ReferenceDataId.class));
    Tenor tenor = ofResult.getTenor();
    assertEquals("10M", tenor.toString());
    assertEquals("1970-01-01", date.toString());
    assertEquals("1970-11-01", actualAdjustResult.toString());
    assertEquals(3, tenor.getUnits().size());
    assertFalse(tenor.isWeekBased());
    assertTrue(tenor.isMonthBased());
  }

  /**
   * Test {@link TenorAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then calls {@link PeriodAdditionConvention#isMonthBased()}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then calls isMonthBased()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TenorAdjustment.toString()"})
  void testToString_thenCallsIsMonthBased() {
    // Arrange
    PeriodAdditionConvention additionConvention = mock(PeriodAdditionConvention.class);
    when(additionConvention.isMonthBased()).thenReturn(true);

    Builder builderResult = TenorAdjustment.builder();
    builderResult.additionConvention(additionConvention);

    // Act
    builderResult
        .adjustment(
            BusinessDayAdjustment.builder()
                .calendar(HolidayCalendarIds.AUSY)
                .convention(BusinessDayConventions.FOLLOWING)
                .build())
        .tenor(Tenor.TENOR_10M)
        .build()
        .toString();

    // Assert
    verify(additionConvention).isMonthBased();
  }

  /**
   * Test {@link TenorAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then return {@code 10M}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '10M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TenorAdjustment.toString()"})
  void testToString_thenReturn10m() {
    // Arrange
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M, PeriodAdditionConventions.NONE, BusinessDayAdjustment.NONE);

    // Act and Assert
    assertEquals("10M", ofResult.toString());
  }

  /**
   * Test {@link TenorAdjustment#toString()}.
   *
   * <ul>
   *   <li>Then return {@code 10M with LastBusinessDay}.
   * </ul>
   *
   * <p>Method under test: {@link TenorAdjustment#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '10M with LastBusinessDay'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TenorAdjustment.toString()"})
  void testToString_thenReturn10mWithLastBusinessDay() {
    // Arrange
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);

    // Act and Assert
    assertEquals("10M with LastBusinessDay", ofResult.toString());
  }

  /**
   * Test {@link TenorAdjustment#meta()}.
   *
   * <p>Method under test: {@link TenorAdjustment#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorAdjustment.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TenorAdjustment.meta();

    // Assert
    MetaProperty<PeriodAdditionConvention> additionConventionResult =
        actualMetaResult.additionConvention();
    assertTrue(additionConventionResult instanceof DirectMetaProperty);
    MetaProperty<BusinessDayAdjustment> adjustmentResult = actualMetaResult.adjustment();
    assertTrue(adjustmentResult instanceof DirectMetaProperty);
    MetaProperty<Tenor> tenorResult = actualMetaResult.tenor();
    assertTrue(tenorResult instanceof DirectMetaProperty);
    assertEquals("additionConvention", additionConventionResult.name());
    assertEquals("adjustment", adjustmentResult.name());
    assertEquals("tenor", tenorResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, additionConventionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, tenorResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<BusinessDayAdjustment> expectedPropertyTypeResult = BusinessDayAdjustment.class;
    assertEquals(expectedPropertyTypeResult, adjustmentResult.propertyType());
    Class<PeriodAdditionConvention> expectedPropertyTypeResult2 = PeriodAdditionConvention.class;
    assertEquals(expectedPropertyTypeResult2, additionConventionResult.propertyType());
    Class<Tenor> expectedPropertyTypeResult3 = Tenor.class;
    assertEquals(expectedPropertyTypeResult3, tenorResult.propertyType());
    Class<TenorAdjustment> expectedDeclaringTypeResult = TenorAdjustment.class;
    assertEquals(expectedDeclaringTypeResult, additionConventionResult.declaringType());
    Class<TenorAdjustment> expectedDeclaringTypeResult2 = TenorAdjustment.class;
    assertEquals(expectedDeclaringTypeResult2, adjustmentResult.declaringType());
    Class<TenorAdjustment> expectedDeclaringTypeResult3 = TenorAdjustment.class;
    assertEquals(expectedDeclaringTypeResult3, tenorResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, additionConventionResult.metaBean());
    assertSame(meta, adjustmentResult.metaBean());
    assertSame(meta, tenorResult.metaBean());
  }

  /**
   * Test {@link TenorAdjustment#metaBean()}.
   *
   * <p>Method under test: {@link TenorAdjustment#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TenorAdjustment.metaBean()"})
  void testMetaBean() {
    // Arrange
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TenorAdjustment#getAdditionConvention()}
   *   <li>{@link TenorAdjustment#getAdjustment()}
   *   <li>{@link TenorAdjustment#getTenor()}
   *   <li>{@link TenorAdjustment#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PeriodAdditionConvention TenorAdjustment.getAdditionConvention()",
    "BusinessDayAdjustment TenorAdjustment.getAdjustment()",
    "Tenor TenorAdjustment.getTenor()",
    "Builder TenorAdjustment.toBuilder()"
  })
  void testGettersAndSetters() {
    // Arrange
    TenorAdjustment ofResult =
        TenorAdjustment.of(
            Tenor.TENOR_10M,
            PeriodAdditionConventions.LAST_BUSINESS_DAY,
            BusinessDayAdjustment.NONE);

    // Act
    ofResult.getAdditionConvention();
    BusinessDayAdjustment actualAdjustment = ofResult.getAdjustment();
    Tenor actualTenor = ofResult.getTenor();
    ofResult.toBuilder();

    // Assert
    assertSame(BusinessDayAdjustment.NONE, actualAdjustment);
    assertSame(Tenor.TENOR_10M, actualTenor);
  }
}
