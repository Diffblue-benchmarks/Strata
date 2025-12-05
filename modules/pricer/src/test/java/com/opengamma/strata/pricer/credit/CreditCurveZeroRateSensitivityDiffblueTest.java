package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.pricer.ZeroRateSensitivity;
import com.opengamma.strata.pricer.credit.CreditCurveZeroRateSensitivity.Meta;
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

class CreditCurveZeroRateSensitivityDiffblueTest {
  /**
   * Test {@link CreditCurveZeroRateSensitivity#meta()}.
   *
   * <p>Method under test: {@link CreditCurveZeroRateSensitivity#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CreditCurveZeroRateSensitivity.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CreditCurveZeroRateSensitivity.meta();

    // Assert
    MetaProperty<StandardId> legalEntityIdResult = actualMetaResult.legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    MetaProperty<ZeroRateSensitivity> zeroRateSensitivityResult =
        actualMetaResult.zeroRateSensitivity();
    assertTrue(zeroRateSensitivityResult instanceof DirectMetaProperty);
    assertEquals("legalEntityId", legalEntityIdResult.name());
    assertEquals("zeroRateSensitivity", zeroRateSensitivityResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityIdResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, zeroRateSensitivityResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, legalEntityIdResult.propertyType());
    Class<ZeroRateSensitivity> expectedPropertyTypeResult2 = ZeroRateSensitivity.class;
    assertEquals(expectedPropertyTypeResult2, zeroRateSensitivityResult.propertyType());
    Class<CreditCurveZeroRateSensitivity> expectedDeclaringTypeResult =
        CreditCurveZeroRateSensitivity.class;
    assertEquals(expectedDeclaringTypeResult, legalEntityIdResult.declaringType());
    Class<CreditCurveZeroRateSensitivity> expectedDeclaringTypeResult2 =
        CreditCurveZeroRateSensitivity.class;
    assertEquals(expectedDeclaringTypeResult2, zeroRateSensitivityResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, legalEntityIdResult.metaBean());
    assertSame(meta, zeroRateSensitivityResult.metaBean());
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
    Class<? extends CreditCurveZeroRateSensitivity> actualBeanTypeResult =
        CreditCurveZeroRateSensitivity.meta().beanType();

    // Assert
    Class<CreditCurveZeroRateSensitivity> expectedBeanTypeResult =
        CreditCurveZeroRateSensitivity.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#legalEntityId()}
   *   <li>{@link Meta#zeroRateSensitivity()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.legalEntityId()",
    "MetaProperty Meta.zeroRateSensitivity()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CreditCurveZeroRateSensitivity.meta();

    // Act
    MetaProperty<StandardId> actualLegalEntityIdResult = metaResult.legalEntityId();

    // Assert
    assertTrue(actualLegalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zeroRateSensitivity() instanceof DirectMetaProperty);
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
        CreditCurveZeroRateSensitivity.meta().metaPropertyGet("zeroRateSensitivity");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<StandardId> legalEntityIdResult = ((Meta) metaBeanResult).legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("legalEntityId", legalEntityIdResult.name());
    assertEquals("zeroRateSensitivity", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityIdResult.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, legalEntityIdResult.propertyType());
    Class<ZeroRateSensitivity> expectedPropertyTypeResult2 = ZeroRateSensitivity.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<CreditCurveZeroRateSensitivity> expectedDeclaringTypeResult =
        CreditCurveZeroRateSensitivity.class;
    assertEquals(expectedDeclaringTypeResult, legalEntityIdResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zeroRateSensitivity());
    assertSame(Meta.INSTANCE, legalEntityIdResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean zeroRateSensitivity return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean zeroRateSensitivity return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanZeroRateSensitivityReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CreditCurveZeroRateSensitivity.meta().metaPropertyGet("legalEntityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ZeroRateSensitivity> zeroRateSensitivityResult =
        ((Meta) metaBeanResult).zeroRateSensitivity();
    assertTrue(zeroRateSensitivityResult instanceof DirectMetaProperty);
    assertEquals("legalEntityId", actualMetaPropertyGetResult.name());
    assertEquals("zeroRateSensitivity", zeroRateSensitivityResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, zeroRateSensitivityResult.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ZeroRateSensitivity> expectedPropertyTypeResult2 = ZeroRateSensitivity.class;
    assertEquals(expectedPropertyTypeResult2, zeroRateSensitivityResult.propertyType());
    Class<CreditCurveZeroRateSensitivity> expectedDeclaringTypeResult =
        CreditCurveZeroRateSensitivity.class;
    assertEquals(expectedDeclaringTypeResult, zeroRateSensitivityResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityId());
    assertSame(Meta.INSTANCE, zeroRateSensitivityResult.metaBean());
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
    assertNull(CreditCurveZeroRateSensitivity.meta().metaPropertyGet("Property Name"));
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
        CreditCurveZeroRateSensitivity.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("legalEntityId");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("zeroRateSensitivity");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("legalEntityId", getResult.name());
    assertEquals("zeroRateSensitivity", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ZeroRateSensitivity> expectedPropertyTypeResult2 = ZeroRateSensitivity.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<CreditCurveZeroRateSensitivity> expectedDeclaringTypeResult =
        CreditCurveZeroRateSensitivity.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CreditCurveZeroRateSensitivity> expectedDeclaringTypeResult2 =
        CreditCurveZeroRateSensitivity.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
        CreditCurveZeroRateSensitivity.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            CreditCurveZeroRateSensitivity.meta()
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
            CreditCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "legalEntityId", "New Value", false));
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
            CreditCurveZeroRateSensitivity.meta()
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
            CreditCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zeroRateSensitivity}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zeroRateSensitivity'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZeroRateSensitivity_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CreditCurveZeroRateSensitivity.meta()
                .propertySet(mock(Bean.class), "zeroRateSensitivity", "New Value", true));
  }
}
