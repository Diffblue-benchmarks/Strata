package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.measure.fxopt.FxOptionVolatilitiesDefinition.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxOptionVolatilitiesDefinitionDiffblueTest {
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
    Class<? extends FxOptionVolatilitiesDefinition> actualBeanTypeResult =
        FxOptionVolatilitiesDefinition.meta().beanType();

    // Assert
    Class<FxOptionVolatilitiesDefinition> expectedBeanTypeResult =
        FxOptionVolatilitiesDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    assertNull(FxOptionVolatilitiesDefinition.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code specification}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'specification'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSpecification_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FxOptionVolatilitiesDefinition.meta().metaPropertyGet("specification");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("specification", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<FxOptionVolatilitiesDefinition> expectedDeclaringTypeResult =
        FxOptionVolatilitiesDefinition.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    Class<FxOptionVolatilitiesSpecification> expectedPropertyTypeResult =
        FxOptionVolatilitiesSpecification.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
        FxOptionVolatilitiesDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("specification");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("specification", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<FxOptionVolatilitiesDefinition> expectedDeclaringTypeResult =
        FxOptionVolatilitiesDefinition.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FxOptionVolatilitiesSpecification> expectedPropertyTypeResult =
        FxOptionVolatilitiesSpecification.class;
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
    assertNull(
        FxOptionVolatilitiesDefinition.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            FxOptionVolatilitiesDefinition.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
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
            FxOptionVolatilitiesDefinition.meta()
                .propertySet(mock(Bean.class), "specification", "New Value", false));
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
            FxOptionVolatilitiesDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code specification}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'specification'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSpecification_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FxOptionVolatilitiesDefinition.meta()
                .propertySet(mock(Bean.class), "specification", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#specification()}.
   *
   * <p>Method under test: {@link Meta#specification()}
   */
  @Test
  @DisplayName("Test Meta specification()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.specification()"})
  void testMetaSpecification() {
    // Arrange, Act and Assert
    assertTrue(FxOptionVolatilitiesDefinition.meta().specification() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link FxOptionVolatilitiesDefinition#of(FxOptionVolatilitiesSpecification)}.
   *
   * <ul>
   *   <li>When {@link FxOptionVolatilitiesSpecification}.
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxOptionVolatilitiesDefinition#of(FxOptionVolatilitiesSpecification)}
   */
  @Test
  @DisplayName(
      "Test of(FxOptionVolatilitiesSpecification); when FxOptionVolatilitiesSpecification; then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FxOptionVolatilitiesDefinition FxOptionVolatilitiesDefinition.of(FxOptionVolatilitiesSpecification)"
  })
  void testOf_whenFxOptionVolatilitiesSpecification_thenReturnParameterCountIsZero() {
    // Arrange
    FxOptionVolatilitiesSpecification specification = mock(FxOptionVolatilitiesSpecification.class);

    // Act
    FxOptionVolatilitiesDefinition actualOfResult =
        FxOptionVolatilitiesDefinition.of(specification);

    // Assert
    assertEquals(0, actualOfResult.getParameterCount());
    assertSame(specification, actualOfResult.getSpecification());
  }

  /**
   * Test {@link FxOptionVolatilitiesDefinition#meta()}.
   *
   * <p>Method under test: {@link FxOptionVolatilitiesDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FxOptionVolatilitiesDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FxOptionVolatilitiesDefinition.meta();

    // Assert
    MetaProperty<FxOptionVolatilitiesSpecification> specificationResult =
        actualMetaResult.specification();
    assertTrue(specificationResult instanceof DirectMetaProperty);
    assertEquals("specification", specificationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, specificationResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<FxOptionVolatilitiesDefinition> expectedDeclaringTypeResult =
        FxOptionVolatilitiesDefinition.class;
    assertEquals(expectedDeclaringTypeResult, specificationResult.declaringType());
    Class<FxOptionVolatilitiesSpecification> expectedPropertyTypeResult =
        FxOptionVolatilitiesSpecification.class;
    assertEquals(expectedPropertyTypeResult, specificationResult.propertyType());
    assertSame(Meta.INSTANCE, specificationResult.metaBean());
  }
}
