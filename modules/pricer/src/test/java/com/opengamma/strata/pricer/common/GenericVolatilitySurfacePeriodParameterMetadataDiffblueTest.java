package com.opengamma.strata.pricer.common;

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
import com.opengamma.strata.market.option.DeltaStrike;
import com.opengamma.strata.market.option.Strike;
import com.opengamma.strata.pricer.common.GenericVolatilitySurfacePeriodParameterMetadata.Meta;
import java.time.Period;
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

class GenericVolatilitySurfacePeriodParameterMetadataDiffblueTest {
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
    Class<? extends GenericVolatilitySurfacePeriodParameterMetadata> actualBeanTypeResult =
        GenericVolatilitySurfacePeriodParameterMetadata.meta().beanType();

    // Assert
    Class<GenericVolatilitySurfacePeriodParameterMetadata> expectedBeanTypeResult =
        GenericVolatilitySurfacePeriodParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#label()}
   *   <li>{@link Meta#period()}
   *   <li>{@link Meta#strike()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.label()",
    "MetaProperty Meta.period()",
    "MetaProperty Meta.strike()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfacePeriodParameterMetadata.meta();

    // Act
    MetaProperty<String> actualLabelResult = metaResult.label();
    MetaProperty<Period> actualPeriodResult = metaResult.period();

    // Assert
    assertTrue(actualLabelResult instanceof DirectMetaProperty);
    assertTrue(actualPeriodResult instanceof DirectMetaProperty);
    assertTrue(metaResult.strike() instanceof DirectMetaProperty);
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
        GenericVolatilitySurfacePeriodParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Period> periodResult = ((Meta) metaBeanResult).period();
    assertTrue(periodResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).label());
    assertSame(metaBeanResult, periodResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code period}.
   *   <li>Then return name is {@code period}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'period'; then return name is 'period'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPeriod_thenReturnNameIsPeriod() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericVolatilitySurfacePeriodParameterMetadata.meta().metaPropertyGet("period");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    assertEquals("period", actualMetaPropertyGetResult.name());
    Class<Period> expectedPropertyTypeResult = Period.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).period());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
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
    assertNull(
        GenericVolatilitySurfacePeriodParameterMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return name is {@code strike}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'strike'; then return name is 'strike'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStrike_thenReturnNameIsStrike() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GenericVolatilitySurfacePeriodParameterMetadata.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<String> labelResult = ((Meta) metaBeanResult).label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Period> periodResult = ((Meta) metaBeanResult).period();
    assertTrue(periodResult instanceof DirectMetaProperty);
    assertEquals("strike", actualMetaPropertyGetResult.name());
    Class<Strike> expectedPropertyTypeResult = Strike.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
    assertSame(metaBeanResult, labelResult.metaBean());
    assertSame(metaBeanResult, periodResult.metaBean());
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
        GenericVolatilitySurfacePeriodParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("period");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("strike");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("label", getResult2.name());
    assertEquals("period", getResult.name());
    assertEquals("strike", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<Strike> expectedPropertyTypeResult = Strike.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<GenericVolatilitySurfacePeriodParameterMetadata> expectedDeclaringTypeResult =
        GenericVolatilitySurfacePeriodParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<GenericVolatilitySurfacePeriodParameterMetadata> expectedDeclaringTypeResult2 =
        GenericVolatilitySurfacePeriodParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<GenericVolatilitySurfacePeriodParameterMetadata> expectedDeclaringTypeResult3 =
        GenericVolatilitySurfacePeriodParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<Period> expectedPropertyTypeResult3 = Period.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
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
    assertNull(
        GenericVolatilitySurfacePeriodParameterMetadata.meta()
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
            GenericVolatilitySurfacePeriodParameterMetadata.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabel_thenReturnLabel() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfacePeriodParameterMetadata.meta();
    GenericVolatilitySurfacePeriodParameterMetadata bean =
        GenericVolatilitySurfacePeriodParameterMetadata.of(null, DeltaStrike.of(0.5d), "Label");

    // Act and Assert
    assertEquals("Label", metaResult.propertyGet(bean, "label", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code period}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'period'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPeriod_thenReturnNull() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfacePeriodParameterMetadata.meta();
    GenericVolatilitySurfacePeriodParameterMetadata bean =
        GenericVolatilitySurfacePeriodParameterMetadata.of(null, DeltaStrike.of(0.5d), "Label");

    // Act and Assert
    assertNull(metaResult.propertyGet(bean, "period", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return {@link DeltaStrike} with delta is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'strike'; then return DeltaStrike with delta is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStrike_thenReturnDeltaStrikeWithDeltaIs05() {
    // Arrange
    Meta metaResult = GenericVolatilitySurfacePeriodParameterMetadata.meta();
    DeltaStrike strike = DeltaStrike.of(0.5d);
    GenericVolatilitySurfacePeriodParameterMetadata bean =
        GenericVolatilitySurfacePeriodParameterMetadata.of(null, strike, "Label");

    // Act and Assert
    assertSame(strike, metaResult.propertyGet(bean, "strike", true));
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
            GenericVolatilitySurfacePeriodParameterMetadata.meta()
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
            GenericVolatilitySurfacePeriodParameterMetadata.meta()
                .propertySet(mock(Bean.class), "label", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code period}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'period'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPeriod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GenericVolatilitySurfacePeriodParameterMetadata.meta()
                .propertySet(mock(Bean.class), "period", "New Value", true));
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
            GenericVolatilitySurfacePeriodParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strike'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrike_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GenericVolatilitySurfacePeriodParameterMetadata.meta()
                .propertySet(mock(Bean.class), "strike", "New Value", true));
  }

  /**
   * Test {@link GenericVolatilitySurfacePeriodParameterMetadata#of(Period, Strike, String)} with
   * {@code period}, {@code strike}, {@code label}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link GenericVolatilitySurfacePeriodParameterMetadata#of(Period, Strike,
   * String)}
   */
  @Test
  @DisplayName(
      "Test of(Period, Strike, String) with 'period', 'strike', 'label'; when 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GenericVolatilitySurfacePeriodParameterMetadata GenericVolatilitySurfacePeriodParameterMetadata.of(Period, Strike, String)"
  })
  void testOfWithPeriodStrikeLabel_whenLabel_thenReturnLabel() {
    // Arrange
    DeltaStrike strike = DeltaStrike.of(0.5d);

    // Act
    GenericVolatilitySurfacePeriodParameterMetadata actualOfResult =
        GenericVolatilitySurfacePeriodParameterMetadata.of(null, strike, "Label");

    // Assert
    assertEquals("Label", actualOfResult.getLabel());
    assertNull(actualOfResult.getPeriod());
    assertSame(strike, actualOfResult.getStrike());
  }

  /**
   * Test {@link GenericVolatilitySurfacePeriodParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link GenericVolatilitySurfacePeriodParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GenericVolatilitySurfacePeriodParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = GenericVolatilitySurfacePeriodParameterMetadata.meta();

    // Assert
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    MetaProperty<Period> periodResult = actualMetaResult.period();
    assertTrue(periodResult instanceof DirectMetaProperty);
    MetaProperty<Strike> strikeResult = actualMetaResult.strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    assertEquals("label", labelResult.name());
    assertEquals("period", periodResult.name());
    assertEquals("strike", strikeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, periodResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, strikeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Strike> expectedPropertyTypeResult = Strike.class;
    assertEquals(expectedPropertyTypeResult, strikeResult.propertyType());
    Class<GenericVolatilitySurfacePeriodParameterMetadata> expectedDeclaringTypeResult =
        GenericVolatilitySurfacePeriodParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<GenericVolatilitySurfacePeriodParameterMetadata> expectedDeclaringTypeResult2 =
        GenericVolatilitySurfacePeriodParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult2, periodResult.declaringType());
    Class<GenericVolatilitySurfacePeriodParameterMetadata> expectedDeclaringTypeResult3 =
        GenericVolatilitySurfacePeriodParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult3, strikeResult.declaringType());
    Class<String> expectedPropertyTypeResult2 = String.class;
    assertEquals(expectedPropertyTypeResult2, labelResult.propertyType());
    Class<Period> expectedPropertyTypeResult3 = Period.class;
    assertEquals(expectedPropertyTypeResult3, periodResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, labelResult.metaBean());
    assertSame(meta, periodResult.metaBean());
    assertSame(meta, strikeResult.metaBean());
  }

  /**
   * Test {@link GenericVolatilitySurfacePeriodParameterMetadata#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link GenericVolatilitySurfacePeriodParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GenericVolatilitySurfacePeriodParameterMetadata.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    GenericVolatilitySurfacePeriodParameterMetadata ofResult =
        GenericVolatilitySurfacePeriodParameterMetadata.of(null, DeltaStrike.of(0.5d), "Label");

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link GenericVolatilitySurfacePeriodParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GenericVolatilitySurfacePeriodParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GenericVolatilitySurfacePeriodParameterMetadata.equals(Object)",
    "int GenericVolatilitySurfacePeriodParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        GenericVolatilitySurfacePeriodParameterMetadata.of(null, DeltaStrike.of(0.5d), "Label"),
        "Obj");
  }
}
