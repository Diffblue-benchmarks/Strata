package com.opengamma.strata.market.param;

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
import com.opengamma.strata.market.param.LabelParameterMetadata.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LabelParameterMetadataDiffblueTest {
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
    Class<? extends LabelParameterMetadata> actualBeanTypeResult =
        LabelParameterMetadata.meta().beanType();

    // Assert
    Class<LabelParameterMetadata> expectedBeanTypeResult = LabelParameterMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#label()}.
   *
   * <p>Method under test: {@link Meta#label()}
   */
  @Test
  @DisplayName("Test Meta label()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.label()"})
  void testMetaLabel() {
    // Arrange, Act and Assert
    assertTrue(LabelParameterMetadata.meta().label() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code label}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'label'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLabel_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        LabelParameterMetadata.meta().metaPropertyGet("label");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("label", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<LabelParameterMetadata> expectedDeclaringTypeResult = LabelParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    assertNull(LabelParameterMetadata.meta().metaPropertyGet("Property Name"));
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
        LabelParameterMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("label");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("label", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<LabelParameterMetadata> expectedDeclaringTypeResult = LabelParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    assertNull(LabelParameterMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange
    Meta metaResult = LabelParameterMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(LabelParameterMetadata.of("Label"), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link LabelParameterMetadata} with {@code Label}.
   *   <li>Then return {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when LabelParameterMetadata with 'Label'; then return 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenLabelParameterMetadataWithLabel_thenReturnLabel() {
    // Arrange
    Meta metaResult = LabelParameterMetadata.meta();

    // Act and Assert
    assertEquals(
        "Label", metaResult.propertyGet(LabelParameterMetadata.of("Label"), "label", true));
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
            LabelParameterMetadata.meta()
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
            LabelParameterMetadata.meta()
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
            LabelParameterMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link LabelParameterMetadata#of(String)}.
   *
   * <ul>
   *   <li>When {@code Label}.
   *   <li>Then return Identifier is {@code Label}.
   * </ul>
   *
   * <p>Method under test: {@link LabelParameterMetadata#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Label'; then return Identifier is 'Label'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LabelParameterMetadata LabelParameterMetadata.of(String)"})
  void testOf_whenLabel_thenReturnIdentifierIsLabel() {
    // Arrange and Act
    LabelParameterMetadata actualOfResult = LabelParameterMetadata.of("Label");

    // Assert
    assertEquals("Label", actualOfResult.getIdentifier());
    assertEquals("Label", actualOfResult.getLabel());
  }

  /**
   * Test {@link LabelParameterMetadata#getIdentifier()}.
   *
   * <p>Method under test: {@link LabelParameterMetadata#getIdentifier()}
   */
  @Test
  @DisplayName("Test getIdentifier()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String LabelParameterMetadata.getIdentifier()"})
  void testGetIdentifier() {
    // Arrange, Act and Assert
    assertEquals("Label", LabelParameterMetadata.of("Label").getIdentifier());
  }

  /**
   * Test {@link LabelParameterMetadata#meta()}.
   *
   * <p>Method under test: {@link LabelParameterMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LabelParameterMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LabelParameterMetadata.meta();

    // Assert
    MetaProperty<String> labelResult = actualMetaResult.label();
    assertTrue(labelResult instanceof DirectMetaProperty);
    assertEquals("label", labelResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, labelResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<LabelParameterMetadata> expectedDeclaringTypeResult = LabelParameterMetadata.class;
    assertEquals(expectedDeclaringTypeResult, labelResult.declaringType());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, labelResult.propertyType());
    assertSame(Meta.INSTANCE, labelResult.metaBean());
  }

  /**
   * Test {@link LabelParameterMetadata#metaBean()}.
   *
   * <p>Method under test: {@link LabelParameterMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LabelParameterMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, LabelParameterMetadata.of("Label").metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LabelParameterMetadata#toString()}
   *   <li>{@link LabelParameterMetadata#getLabel()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String LabelParameterMetadata.getLabel()",
    "String LabelParameterMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LabelParameterMetadata ofResult = LabelParameterMetadata.of("Label");

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("Label", ofResult.getLabel());
    assertEquals("LabelParameterMetadata{label=Label}", actualToStringResult);
  }

  /**
   * Test {@link LabelParameterMetadata#equals(Object)}, and {@link
   * LabelParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LabelParameterMetadata#equals(Object)}
   *   <li>{@link LabelParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LabelParameterMetadata.equals(Object)",
    "int LabelParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LabelParameterMetadata ofResult = LabelParameterMetadata.of("Label");
    LabelParameterMetadata ofResult2 = LabelParameterMetadata.of("Label");

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link LabelParameterMetadata#equals(Object)}, and {@link
   * LabelParameterMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LabelParameterMetadata#equals(Object)}
   *   <li>{@link LabelParameterMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LabelParameterMetadata.equals(Object)",
    "int LabelParameterMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LabelParameterMetadata ofResult = LabelParameterMetadata.of("Label");

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link LabelParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LabelParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LabelParameterMetadata.equals(Object)",
    "int LabelParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LabelParameterMetadata.of("Label"), null);
  }

  /**
   * Test {@link LabelParameterMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LabelParameterMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LabelParameterMetadata.equals(Object)",
    "int LabelParameterMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LabelParameterMetadata.of("Label"), "Different type to LabelParameterMetadata");
  }
}
