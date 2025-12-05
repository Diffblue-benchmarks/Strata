package com.opengamma.strata.market.observable;

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
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.market.observable.LegalEntityInformation.Meta;
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

class LegalEntityInformationDiffblueTest {
  /**
   * Test {@link LegalEntityInformation#isDefaulted(StandardId)} with {@code StandardId}.
   *
   * <ul>
   *   <li>Then return Defaulted.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformation#isDefaulted(StandardId)}
   */
  @Test
  @DisplayName("Test isDefaulted(StandardId) with 'StandardId'; then return Defaulted")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityInformation LegalEntityInformation.isDefaulted(StandardId)"})
  void testIsDefaultedWithStandardId_thenReturnDefaulted() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");

    // Act
    LegalEntityInformation actualIsDefaultedResult =
        LegalEntityInformation.isDefaulted(legalEntityId);

    // Assert
    assertTrue(actualIsDefaultedResult.isDefaulted());
    assertSame(legalEntityId, actualIsDefaultedResult.getLegalEntityId());
  }

  /**
   * Test {@link LegalEntityInformation#isNotDefaulted(StandardId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return not Defaulted.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformation#isNotDefaulted(StandardId)}
   */
  @Test
  @DisplayName(
      "Test isNotDefaulted(StandardId); when StandardId with 'Scheme' and value is '42'; then return not Defaulted")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityInformation LegalEntityInformation.isNotDefaulted(StandardId)"})
  void testIsNotDefaulted_whenStandardIdWithSchemeAndValueIs42_thenReturnNotDefaulted() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");

    // Act
    LegalEntityInformation actualIsNotDefaultedResult =
        LegalEntityInformation.isNotDefaulted(legalEntityId);

    // Assert
    assertFalse(actualIsNotDefaultedResult.isDefaulted());
    assertSame(legalEntityId, actualIsNotDefaultedResult.getLegalEntityId());
  }

  /**
   * Test {@link LegalEntityInformation#meta()}.
   *
   * <p>Method under test: {@link LegalEntityInformation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LegalEntityInformation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LegalEntityInformation.meta();

    // Assert
    MetaProperty<Boolean> defaultedResult = actualMetaResult.defaulted();
    assertTrue(defaultedResult instanceof DirectMetaProperty);
    MetaProperty<StandardId> legalEntityIdResult = actualMetaResult.legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    assertEquals("boolean", defaultedResult.propertyType().getName());
    assertEquals("defaulted", defaultedResult.name());
    assertEquals("legalEntityId", legalEntityIdResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, defaultedResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityIdResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, legalEntityIdResult.propertyType());
    Class<LegalEntityInformation> expectedDeclaringTypeResult = LegalEntityInformation.class;
    assertEquals(expectedDeclaringTypeResult, defaultedResult.declaringType());
    Class<LegalEntityInformation> expectedDeclaringTypeResult2 = LegalEntityInformation.class;
    assertEquals(expectedDeclaringTypeResult2, legalEntityIdResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, defaultedResult.metaBean());
    assertSame(meta, legalEntityIdResult.metaBean());
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
    Class<? extends LegalEntityInformation> actualBeanTypeResult =
        LegalEntityInformation.meta().beanType();

    // Assert
    Class<LegalEntityInformation> expectedBeanTypeResult = LegalEntityInformation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test {@link LegalEntityInformation#metaBean()}.
   *
   * <ul>
   *   <li>Given Defaulted is {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformation#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given Defaulted is StandardId with 'Scheme' and value is '42'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LegalEntityInformation.metaBean()"})
  void testMetaBean_givenDefaultedIsStandardIdWithSchemeAndValueIs42_thenReturnInstance() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42")).metaBean());
  }

  /**
   * Test {@link LegalEntityInformation#equals(Object)}, and {@link
   * LegalEntityInformation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LegalEntityInformation#equals(Object)}
   *   <li>{@link LegalEntityInformation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityInformation.equals(Object)",
    "int LegalEntityInformation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LegalEntityInformation isDefaultedResult =
        LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42"));
    LegalEntityInformation isDefaultedResult2 =
        LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42"));

    // Act and Assert
    assertEquals(isDefaultedResult, isDefaultedResult2);
    assertEquals(isDefaultedResult.hashCode(), isDefaultedResult2.hashCode());
  }

  /**
   * Test {@link LegalEntityInformation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityInformation.equals(Object)",
    "int LegalEntityInformation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42")), 1);
  }

  /**
   * Test {@link LegalEntityInformation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityInformation.equals(Object)",
    "int LegalEntityInformation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42")), null);
  }

  /**
   * Test {@link LegalEntityInformation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityInformation.equals(Object)",
    "int LegalEntityInformation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LegalEntityInformation isDefaultedResult =
        LegalEntityInformation.isDefaulted(StandardId.of("42", "42"));

    // Act and Assert
    assertNotEquals(
        isDefaultedResult, LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42")));
  }

  /**
   * Test {@link LegalEntityInformation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LegalEntityInformation.equals(Object)",
    "int LegalEntityInformation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    LegalEntityInformation isNotDefaultedResult =
        LegalEntityInformation.isNotDefaulted(StandardId.of("Scheme", "42"));

    // Act and Assert
    assertNotEquals(
        isNotDefaultedResult, LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42")));
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#defaulted()}
   *   <li>{@link Meta#legalEntityId()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.defaulted()", "MetaProperty Meta.legalEntityId()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = LegalEntityInformation.meta();

    // Act
    MetaProperty<Boolean> actualDefaultedResult = metaResult.defaulted();

    // Assert
    assertTrue(actualDefaultedResult instanceof DirectMetaProperty);
    assertTrue(metaResult.legalEntityId() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean defaulted return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean defaulted return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanDefaultedReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        LegalEntityInformation.meta().metaPropertyGet("legalEntityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> defaultedResult = ((Meta) metaBeanResult).defaulted();
    assertTrue(defaultedResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("boolean", defaultedResult.propertyType().getName());
    assertEquals("defaulted", defaultedResult.name());
    assertEquals("legalEntityId", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, defaultedResult.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<LegalEntityInformation> expectedDeclaringTypeResult = LegalEntityInformation.class;
    assertEquals(expectedDeclaringTypeResult, defaultedResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityId());
    assertSame(Meta.INSTANCE, defaultedResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean legalEntityId return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean legalEntityId return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanLegalEntityIdReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        LegalEntityInformation.meta().metaPropertyGet("defaulted");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<StandardId> legalEntityIdResult = ((Meta) metaBeanResult).legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("defaulted", actualMetaPropertyGetResult.name());
    assertEquals("legalEntityId", legalEntityIdResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityIdResult.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, legalEntityIdResult.propertyType());
    Class<LegalEntityInformation> expectedDeclaringTypeResult = LegalEntityInformation.class;
    assertEquals(expectedDeclaringTypeResult, legalEntityIdResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).defaulted());
    assertSame(Meta.INSTANCE, legalEntityIdResult.metaBean());
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
    assertNull(LegalEntityInformation.meta().metaPropertyGet("Property Name"));
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
        LegalEntityInformation.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("legalEntityId");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("defaulted");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("boolean", getResult2.propertyType().getName());
    assertEquals("defaulted", getResult2.name());
    assertEquals("legalEntityId", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<LegalEntityInformation> expectedDeclaringTypeResult = LegalEntityInformation.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<LegalEntityInformation> expectedDeclaringTypeResult2 = LegalEntityInformation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link StandardId} with {@code Scheme} and value is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return StandardId with 'Scheme' and value is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnStandardIdWithSchemeAndValueIs42() {
    // Arrange
    Meta metaResult = LegalEntityInformation.meta();
    StandardId legalEntityId = StandardId.of("Scheme", "42");

    // Act and Assert
    assertSame(
        legalEntityId,
        metaResult.propertyGet(
            LegalEntityInformation.isDefaulted(legalEntityId), "legalEntityId", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnTrue() {
    // Arrange
    Meta metaResult = LegalEntityInformation.meta();

    // Act and Assert
    assertTrue(
        (Boolean)
            metaResult.propertyGet(
                LegalEntityInformation.isDefaulted(StandardId.of("Scheme", "42")),
                "defaulted",
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
    assertNull(LegalEntityInformation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> LegalEntityInformation.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code defaulted}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'defaulted'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDefaulted_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            LegalEntityInformation.meta()
                .propertySet(mock(Bean.class), "defaulted", "New Value", true));
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
            LegalEntityInformation.meta()
                .propertySet(mock(Bean.class), "defaulted", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code legalEntityId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'legalEntityId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLegalEntityId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            LegalEntityInformation.meta()
                .propertySet(mock(Bean.class), "legalEntityId", "New Value", true));
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
            LegalEntityInformation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
