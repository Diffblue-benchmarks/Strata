package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ShiftType;
import com.opengamma.strata.market.curve.SeasonalityDefinition.Meta;
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

class SeasonalityDefinitionDiffblueTest {
  /**
   * Test {@link SeasonalityDefinition#meta()}.
   *
   * <p>Method under test: {@link SeasonalityDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SeasonalityDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SeasonalityDefinition.meta();

    // Assert
    MetaProperty<ShiftType> adjustmentTypeResult = actualMetaResult.adjustmentType();
    assertTrue(adjustmentTypeResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> seasonalityMonthOnMonthResult =
        actualMetaResult.seasonalityMonthOnMonth();
    assertTrue(seasonalityMonthOnMonthResult instanceof DirectMetaProperty);
    assertEquals("adjustmentType", adjustmentTypeResult.name());
    assertEquals("seasonalityMonthOnMonth", seasonalityMonthOnMonthResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, seasonalityMonthOnMonthResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, seasonalityMonthOnMonthResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, adjustmentTypeResult.propertyType());
    Class<SeasonalityDefinition> expectedDeclaringTypeResult = SeasonalityDefinition.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentTypeResult.declaringType());
    Class<SeasonalityDefinition> expectedDeclaringTypeResult2 = SeasonalityDefinition.class;
    assertEquals(expectedDeclaringTypeResult2, seasonalityMonthOnMonthResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, adjustmentTypeResult.metaBean());
    assertSame(meta, seasonalityMonthOnMonthResult.metaBean());
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
    Class<? extends SeasonalityDefinition> actualBeanTypeResult =
        SeasonalityDefinition.meta().beanType();

    // Assert
    Class<SeasonalityDefinition> expectedBeanTypeResult = SeasonalityDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#adjustmentType()}
   *   <li>{@link Meta#seasonalityMonthOnMonth()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.adjustmentType()",
    "MetaProperty Meta.seasonalityMonthOnMonth()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SeasonalityDefinition.meta();

    // Act
    MetaProperty<ShiftType> actualAdjustmentTypeResult = metaResult.adjustmentType();

    // Assert
    assertTrue(actualAdjustmentTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.seasonalityMonthOnMonth() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SeasonalityDefinition.meta().metaPropertyGet("adjustmentType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> seasonalityMonthOnMonthResult =
        ((Meta) metaBeanResult).seasonalityMonthOnMonth();
    assertTrue(seasonalityMonthOnMonthResult instanceof DirectMetaProperty);
    assertEquals("adjustmentType", actualMetaPropertyGetResult.name());
    assertEquals("seasonalityMonthOnMonth", seasonalityMonthOnMonthResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, seasonalityMonthOnMonthResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, seasonalityMonthOnMonthResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<SeasonalityDefinition> expectedDeclaringTypeResult = SeasonalityDefinition.class;
    assertEquals(expectedDeclaringTypeResult, seasonalityMonthOnMonthResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).adjustmentType());
    assertSame(Meta.INSTANCE, seasonalityMonthOnMonthResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean adjustmentType return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean adjustmentType return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanAdjustmentTypeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SeasonalityDefinition.meta().metaPropertyGet("seasonalityMonthOnMonth");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ShiftType> adjustmentTypeResult = ((Meta) metaBeanResult).adjustmentType();
    assertTrue(adjustmentTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("adjustmentType", adjustmentTypeResult.name());
    assertEquals("seasonalityMonthOnMonth", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, adjustmentTypeResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, adjustmentTypeResult.propertyType());
    Class<SeasonalityDefinition> expectedDeclaringTypeResult = SeasonalityDefinition.class;
    assertEquals(expectedDeclaringTypeResult, adjustmentTypeResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).seasonalityMonthOnMonth());
    assertSame(Meta.INSTANCE, adjustmentTypeResult.metaBean());
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
    assertNull(SeasonalityDefinition.meta().metaPropertyGet("Property Name"));
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
        SeasonalityDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("seasonalityMonthOnMonth");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("adjustmentType");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("adjustmentType", getResult2.name());
    assertEquals("seasonalityMonthOnMonth", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ShiftType> expectedPropertyTypeResult2 = ShiftType.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<SeasonalityDefinition> expectedDeclaringTypeResult = SeasonalityDefinition.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SeasonalityDefinition> expectedDeclaringTypeResult2 = SeasonalityDefinition.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
    assertNull(SeasonalityDefinition.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code adjustmentType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'adjustmentType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAdjustmentType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SeasonalityDefinition.meta()
                .propertySet(mock(Bean.class), "adjustmentType", "New Value", true));
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
            SeasonalityDefinition.meta()
                .propertySet(mock(Bean.class), "adjustmentType", "New Value", false));
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
            SeasonalityDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code seasonalityMonthOnMonth}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'seasonalityMonthOnMonth'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSeasonalityMonthOnMonth_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SeasonalityDefinition.meta()
                .propertySet(mock(Bean.class), "seasonalityMonthOnMonth", "New Value", true));
  }
}
