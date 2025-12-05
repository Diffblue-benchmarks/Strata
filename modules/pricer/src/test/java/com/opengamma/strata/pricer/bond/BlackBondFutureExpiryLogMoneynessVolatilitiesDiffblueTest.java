package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.surface.Surface;
import com.opengamma.strata.pricer.bond.BlackBondFutureExpiryLogMoneynessVolatilities.Builder;
import com.opengamma.strata.pricer.bond.BlackBondFutureExpiryLogMoneynessVolatilities.Meta;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
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

class BlackBondFutureExpiryLogMoneynessVolatilitiesDiffblueTest {
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
        () -> BlackBondFutureExpiryLogMoneynessVolatilities.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code surface}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'surface'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSurface_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(BlackBondFutureExpiryLogMoneynessVolatilities.builder().get("surface"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code valuationDateTime}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'valuationDateTime'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValuationDateTime_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(BlackBondFutureExpiryLogMoneynessVolatilities.builder().get("valuationDateTime"));
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
        () ->
            BlackBondFutureExpiryLogMoneynessVolatilities.builder()
                .set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code surface}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'surface'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenSurface_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BlackBondFutureExpiryLogMoneynessVolatilities.builder();

    // Act
    Builder actualSetResult = builderResult.set("surface", null);

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
    Builder builderResult = BlackBondFutureExpiryLogMoneynessVolatilities.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#surface(Surface)}.
   *
   * <ul>
   *   <li>When {@link Surface}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#surface(Surface)}
   */
  @Test
  @DisplayName("Test Builder surface(Surface); when Surface; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.surface(Surface)"})
  void testBuilderSurface_whenSurface_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BlackBondFutureExpiryLogMoneynessVolatilities.builder();

    // Act
    Builder actualSurfaceResult = builderResult.surface(mock(Surface.class));

    // Assert
    assertSame(builderResult, actualSurfaceResult);
  }

  /**
   * Test Builder {@link Builder#valuationDateTime(ZonedDateTime)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valuationDateTime(ZonedDateTime)}
   */
  @Test
  @DisplayName("Test Builder valuationDateTime(ZonedDateTime); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valuationDateTime(ZonedDateTime)"})
  void testBuilderValuationDateTime_thenReturnBuilder() {
    // Arrange
    Builder builderResult = BlackBondFutureExpiryLogMoneynessVolatilities.builder();

    // Act
    Builder actualValuationDateTimeResult =
        builderResult.valuationDateTime(
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC));

    // Assert
    assertSame(builderResult, actualValuationDateTimeResult);
  }

  /**
   * Test {@link BlackBondFutureExpiryLogMoneynessVolatilities#meta()}.
   *
   * <p>Method under test: {@link BlackBondFutureExpiryLogMoneynessVolatilities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta BlackBondFutureExpiryLogMoneynessVolatilities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = BlackBondFutureExpiryLogMoneynessVolatilities.meta();

    // Assert
    MetaProperty<Surface> surfaceResult = actualMetaResult.surface();
    assertTrue(surfaceResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult = actualMetaResult.valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("surface", surfaceResult.name());
    assertEquals("valuationDateTime", valuationDateTimeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, surfaceResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateTimeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<Surface> expectedPropertyTypeResult = Surface.class;
    assertEquals(expectedPropertyTypeResult, surfaceResult.propertyType());
    Class<BlackBondFutureExpiryLogMoneynessVolatilities> expectedDeclaringTypeResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, surfaceResult.declaringType());
    Class<BlackBondFutureExpiryLogMoneynessVolatilities> expectedDeclaringTypeResult2 =
        BlackBondFutureExpiryLogMoneynessVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, valuationDateTimeResult.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult2 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult2, valuationDateTimeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, surfaceResult.metaBean());
    assertSame(meta, valuationDateTimeResult.metaBean());
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
    Class<? extends BlackBondFutureExpiryLogMoneynessVolatilities> actualBeanTypeResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.meta().beanType();

    // Assert
    Class<BlackBondFutureExpiryLogMoneynessVolatilities> expectedBeanTypeResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#surface()}
   *   <li>{@link Meta#valuationDateTime()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.surface()", "MetaProperty Meta.valuationDateTime()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = BlackBondFutureExpiryLogMoneynessVolatilities.meta();

    // Act
    MetaProperty<Surface> actualSurfaceResult = metaResult.surface();

    // Assert
    assertTrue(actualSurfaceResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDateTime() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean surface return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean surface return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanSurfaceReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.meta().metaPropertyGet("valuationDateTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Surface> surfaceResult = ((Meta) metaBeanResult).surface();
    assertTrue(surfaceResult instanceof DirectMetaProperty);
    assertEquals("surface", surfaceResult.name());
    assertEquals("valuationDateTime", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, surfaceResult.style());
    Class<Surface> expectedPropertyTypeResult = Surface.class;
    assertEquals(expectedPropertyTypeResult, surfaceResult.propertyType());
    Class<BlackBondFutureExpiryLogMoneynessVolatilities> expectedDeclaringTypeResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, surfaceResult.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult2 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDateTime());
    assertSame(Meta.INSTANCE, surfaceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean valuationDateTime return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean valuationDateTime return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanValuationDateTimeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.meta().metaPropertyGet("surface");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZonedDateTime> valuationDateTimeResult =
        ((Meta) metaBeanResult).valuationDateTime();
    assertTrue(valuationDateTimeResult instanceof DirectMetaProperty);
    assertEquals("surface", actualMetaPropertyGetResult.name());
    assertEquals("valuationDateTime", valuationDateTimeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valuationDateTimeResult.style());
    Class<Surface> expectedPropertyTypeResult = Surface.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<BlackBondFutureExpiryLogMoneynessVolatilities> expectedDeclaringTypeResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, valuationDateTimeResult.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult2 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult2, valuationDateTimeResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).surface());
    assertSame(Meta.INSTANCE, valuationDateTimeResult.metaBean());
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
        BlackBondFutureExpiryLogMoneynessVolatilities.meta().metaPropertyGet("Property Name"));
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
        BlackBondFutureExpiryLogMoneynessVolatilities.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("valuationDateTime");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("surface");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("surface", getResult2.name());
    assertEquals("valuationDateTime", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<Surface> expectedPropertyTypeResult = Surface.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<BlackBondFutureExpiryLogMoneynessVolatilities> expectedDeclaringTypeResult =
        BlackBondFutureExpiryLogMoneynessVolatilities.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<BlackBondFutureExpiryLogMoneynessVolatilities> expectedDeclaringTypeResult2 =
        BlackBondFutureExpiryLogMoneynessVolatilities.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<ZonedDateTime> expectedPropertyTypeResult2 = ZonedDateTime.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
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
    assertNull(
        BlackBondFutureExpiryLogMoneynessVolatilities.meta()
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
            BlackBondFutureExpiryLogMoneynessVolatilities.meta()
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
            BlackBondFutureExpiryLogMoneynessVolatilities.meta()
                .propertySet(mock(Bean.class), "surface", "New Value", false));
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
            BlackBondFutureExpiryLogMoneynessVolatilities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code surface}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'surface'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSurface_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BlackBondFutureExpiryLogMoneynessVolatilities.meta()
                .propertySet(mock(Bean.class), "surface", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDateTime}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDateTime'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDateTime_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BlackBondFutureExpiryLogMoneynessVolatilities.meta()
                .propertySet(mock(Bean.class), "valuationDateTime", "New Value", true));
  }
}
