package com.opengamma.strata.product.swaption;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.AdjustableDates;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.product.swaption.SwaptionExercise.Meta;
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

class SwaptionExerciseDiffblueTest {
  /**
   * Test {@link SwaptionExercise#meta()}.
   *
   * <p>Method under test: {@link SwaptionExercise#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SwaptionExercise.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SwaptionExercise.meta();

    // Assert
    MetaProperty<AdjustableDates> dateDefinitionResult = actualMetaResult.dateDefinition();
    assertTrue(dateDefinitionResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> frequencyResult = actualMetaResult.frequency();
    assertTrue(frequencyResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> swapStartDateOffsetResult = actualMetaResult.swapStartDateOffset();
    assertTrue(swapStartDateOffsetResult instanceof DirectMetaProperty);
    assertEquals("dateDefinition", dateDefinitionResult.name());
    assertEquals("frequency", frequencyResult.name());
    assertEquals("swapStartDateOffset", swapStartDateOffsetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, dateDefinitionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, frequencyResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, swapStartDateOffsetResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<AdjustableDates> expectedPropertyTypeResult = AdjustableDates.class;
    assertEquals(expectedPropertyTypeResult, dateDefinitionResult.propertyType());
    Class<DaysAdjustment> expectedPropertyTypeResult2 = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult2, swapStartDateOffsetResult.propertyType());
    Class<Frequency> expectedPropertyTypeResult3 = Frequency.class;
    assertEquals(expectedPropertyTypeResult3, frequencyResult.propertyType());
    Class<SwaptionExercise> expectedDeclaringTypeResult = SwaptionExercise.class;
    assertEquals(expectedDeclaringTypeResult, dateDefinitionResult.declaringType());
    Class<SwaptionExercise> expectedDeclaringTypeResult2 = SwaptionExercise.class;
    assertEquals(expectedDeclaringTypeResult2, frequencyResult.declaringType());
    Class<SwaptionExercise> expectedDeclaringTypeResult3 = SwaptionExercise.class;
    assertEquals(expectedDeclaringTypeResult3, swapStartDateOffsetResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, dateDefinitionResult.metaBean());
    assertSame(meta, frequencyResult.metaBean());
    assertSame(meta, swapStartDateOffsetResult.metaBean());
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
    Class<? extends SwaptionExercise> actualBeanTypeResult = SwaptionExercise.meta().beanType();

    // Assert
    Class<SwaptionExercise> expectedBeanTypeResult = SwaptionExercise.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dateDefinition()}
   *   <li>{@link Meta#frequency()}
   *   <li>{@link Meta#swapStartDateOffset()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dateDefinition()",
    "MetaProperty Meta.frequency()",
    "MetaProperty Meta.swapStartDateOffset()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SwaptionExercise.meta();

    // Act
    MetaProperty<AdjustableDates> actualDateDefinitionResult = metaResult.dateDefinition();
    MetaProperty<Frequency> actualFrequencyResult = metaResult.frequency();

    // Assert
    assertTrue(actualDateDefinitionResult instanceof DirectMetaProperty);
    assertTrue(actualFrequencyResult instanceof DirectMetaProperty);
    assertTrue(metaResult.swapStartDateOffset() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code swapStartDateOffset}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'swapStartDateOffset'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsSwapStartDateOffset() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SwaptionExercise.meta().metaPropertyGet("swapStartDateOffset");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<AdjustableDates> dateDefinitionResult = ((Meta) metaBeanResult).dateDefinition();
    assertTrue(dateDefinitionResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> frequencyResult = ((Meta) metaBeanResult).frequency();
    assertTrue(frequencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("swapStartDateOffset", actualMetaPropertyGetResult.name());
    Class<DaysAdjustment> expectedPropertyTypeResult = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).swapStartDateOffset());
    assertSame(metaBeanResult, dateDefinitionResult.metaBean());
    assertSame(metaBeanResult, frequencyResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dateDefinition}.
   *   <li>Then return name is {@code dateDefinition}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'dateDefinition'; then return name is 'dateDefinition'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDateDefinition_thenReturnNameIsDateDefinition() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SwaptionExercise.meta().metaPropertyGet("dateDefinition");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Frequency> frequencyResult = ((Meta) metaBeanResult).frequency();
    assertTrue(frequencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> swapStartDateOffsetResult =
        ((Meta) metaBeanResult).swapStartDateOffset();
    assertTrue(swapStartDateOffsetResult instanceof DirectMetaProperty);
    assertEquals("dateDefinition", actualMetaPropertyGetResult.name());
    Class<AdjustableDates> expectedPropertyTypeResult = AdjustableDates.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dateDefinition());
    assertSame(metaBeanResult, frequencyResult.metaBean());
    assertSame(metaBeanResult, swapStartDateOffsetResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code frequency}.
   *   <li>Then return name is {@code frequency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'frequency'; then return name is 'frequency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFrequency_thenReturnNameIsFrequency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SwaptionExercise.meta().metaPropertyGet("frequency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<AdjustableDates> dateDefinitionResult = ((Meta) metaBeanResult).dateDefinition();
    assertTrue(dateDefinitionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DaysAdjustment> swapStartDateOffsetResult =
        ((Meta) metaBeanResult).swapStartDateOffset();
    assertTrue(swapStartDateOffsetResult instanceof DirectMetaProperty);
    assertEquals("frequency", actualMetaPropertyGetResult.name());
    Class<Frequency> expectedPropertyTypeResult = Frequency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).frequency());
    assertSame(metaBeanResult, dateDefinitionResult.metaBean());
    assertSame(metaBeanResult, swapStartDateOffsetResult.metaBean());
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
    assertNull(SwaptionExercise.meta().metaPropertyGet("Property Name"));
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
        SwaptionExercise.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("dateDefinition");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("frequency");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("swapStartDateOffset");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("dateDefinition", getResult.name());
    assertEquals("frequency", getResult2.name());
    assertEquals("swapStartDateOffset", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<AdjustableDates> expectedPropertyTypeResult = AdjustableDates.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<DaysAdjustment> expectedPropertyTypeResult2 = DaysAdjustment.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<Frequency> expectedPropertyTypeResult3 = Frequency.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
    Class<SwaptionExercise> expectedDeclaringTypeResult = SwaptionExercise.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<SwaptionExercise> expectedDeclaringTypeResult2 = SwaptionExercise.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<SwaptionExercise> expectedDeclaringTypeResult3 = SwaptionExercise.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(SwaptionExercise.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> SwaptionExercise.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dateDefinition}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dateDefinition'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDateDefinition_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SwaptionExercise.meta()
                .propertySet(mock(Bean.class), "dateDefinition", "New Value", true));
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
            SwaptionExercise.meta()
                .propertySet(mock(Bean.class), "dateDefinition", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code frequency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'frequency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFrequency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SwaptionExercise.meta().propertySet(mock(Bean.class), "frequency", "New Value", true));
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
            SwaptionExercise.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code swapStartDateOffset}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'swapStartDateOffset'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSwapStartDateOffset_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SwaptionExercise.meta()
                .propertySet(mock(Bean.class), "swapStartDateOffset", "New Value", true));
  }
}
