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
import com.opengamma.strata.pricer.credit.LegalEntitySurvivalProbabilities.Meta;
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

class LegalEntitySurvivalProbabilitiesDiffblueTest {
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
    Class<? extends LegalEntitySurvivalProbabilities> actualBeanTypeResult =
        LegalEntitySurvivalProbabilities.meta().beanType();

    // Assert
    Class<LegalEntitySurvivalProbabilities> expectedBeanTypeResult =
        LegalEntitySurvivalProbabilities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#legalEntityId()}
   *   <li>{@link Meta#survivalProbabilities()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.legalEntityId()",
    "MetaProperty Meta.survivalProbabilities()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = LegalEntitySurvivalProbabilities.meta();

    // Act
    MetaProperty<StandardId> actualLegalEntityIdResult = metaResult.legalEntityId();

    // Assert
    assertTrue(actualLegalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(metaResult.survivalProbabilities() instanceof DirectMetaProperty);
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
        LegalEntitySurvivalProbabilities.meta().metaPropertyGet("legalEntityId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CreditDiscountFactors> survivalProbabilitiesResult =
        ((Meta) metaBeanResult).survivalProbabilities();
    assertTrue(survivalProbabilitiesResult instanceof DirectMetaProperty);
    assertEquals("legalEntityId", actualMetaPropertyGetResult.name());
    assertEquals("survivalProbabilities", survivalProbabilitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, survivalProbabilitiesResult.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CreditDiscountFactors> expectedPropertyTypeResult2 = CreditDiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, survivalProbabilitiesResult.propertyType());
    Class<LegalEntitySurvivalProbabilities> expectedDeclaringTypeResult =
        LegalEntitySurvivalProbabilities.class;
    assertEquals(expectedDeclaringTypeResult, survivalProbabilitiesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityId());
    assertSame(Meta.INSTANCE, survivalProbabilitiesResult.metaBean());
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
        LegalEntitySurvivalProbabilities.meta().metaPropertyGet("survivalProbabilities");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<StandardId> legalEntityIdResult = ((Meta) metaBeanResult).legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("legalEntityId", legalEntityIdResult.name());
    assertEquals("survivalProbabilities", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityIdResult.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, legalEntityIdResult.propertyType());
    Class<CreditDiscountFactors> expectedPropertyTypeResult2 = CreditDiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<LegalEntitySurvivalProbabilities> expectedDeclaringTypeResult =
        LegalEntitySurvivalProbabilities.class;
    assertEquals(expectedDeclaringTypeResult, legalEntityIdResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).survivalProbabilities());
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
    assertNull(LegalEntitySurvivalProbabilities.meta().metaPropertyGet("Property Name"));
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
        LegalEntitySurvivalProbabilities.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("legalEntityId");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("survivalProbabilities");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("legalEntityId", getResult.name());
    assertEquals("survivalProbabilities", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<CreditDiscountFactors> expectedPropertyTypeResult2 = CreditDiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<LegalEntitySurvivalProbabilities> expectedDeclaringTypeResult =
        LegalEntitySurvivalProbabilities.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<LegalEntitySurvivalProbabilities> expectedDeclaringTypeResult2 =
        LegalEntitySurvivalProbabilities.class;
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
        LegalEntitySurvivalProbabilities.meta()
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
            LegalEntitySurvivalProbabilities.meta()
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
            LegalEntitySurvivalProbabilities.meta()
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
            LegalEntitySurvivalProbabilities.meta()
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
            LegalEntitySurvivalProbabilities.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code survivalProbabilities}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'survivalProbabilities'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSurvivalProbabilities_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            LegalEntitySurvivalProbabilities.meta()
                .propertySet(mock(Bean.class), "survivalProbabilities", "New Value", true));
  }

  /**
   * Test {@link LegalEntitySurvivalProbabilities#of(StandardId, CreditDiscountFactors)}.
   *
   * <ul>
   *   <li>When {@link CreditDiscountFactors}.
   *   <li>Then return Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntitySurvivalProbabilities#of(StandardId,
   * CreditDiscountFactors)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, CreditDiscountFactors); when CreditDiscountFactors; then return Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LegalEntitySurvivalProbabilities LegalEntitySurvivalProbabilities.of(StandardId, CreditDiscountFactors)"
  })
  void testOf_whenCreditDiscountFactors_thenReturnCurrencyIsNull() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");
    CreditDiscountFactors survivalProbabilities = mock(CreditDiscountFactors.class);

    // Act
    LegalEntitySurvivalProbabilities actualOfResult =
        LegalEntitySurvivalProbabilities.of(legalEntityId, survivalProbabilities);

    // Assert
    assertNull(actualOfResult.getCurrency());
    assertNull(actualOfResult.getParameterKeys());
    assertNull(actualOfResult.getValuationDate());
    assertSame(legalEntityId, actualOfResult.getLegalEntityId());
    assertSame(survivalProbabilities, actualOfResult.getSurvivalProbabilities());
  }

  /**
   * Test {@link LegalEntitySurvivalProbabilities#meta()}.
   *
   * <p>Method under test: {@link LegalEntitySurvivalProbabilities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta LegalEntitySurvivalProbabilities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = LegalEntitySurvivalProbabilities.meta();

    // Assert
    MetaProperty<StandardId> legalEntityIdResult = actualMetaResult.legalEntityId();
    assertTrue(legalEntityIdResult instanceof DirectMetaProperty);
    MetaProperty<CreditDiscountFactors> survivalProbabilitiesResult =
        actualMetaResult.survivalProbabilities();
    assertTrue(survivalProbabilitiesResult instanceof DirectMetaProperty);
    assertEquals("legalEntityId", legalEntityIdResult.name());
    assertEquals("survivalProbabilities", survivalProbabilitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityIdResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, survivalProbabilitiesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<StandardId> expectedPropertyTypeResult = StandardId.class;
    assertEquals(expectedPropertyTypeResult, legalEntityIdResult.propertyType());
    Class<CreditDiscountFactors> expectedPropertyTypeResult2 = CreditDiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, survivalProbabilitiesResult.propertyType());
    Class<LegalEntitySurvivalProbabilities> expectedDeclaringTypeResult =
        LegalEntitySurvivalProbabilities.class;
    assertEquals(expectedDeclaringTypeResult, legalEntityIdResult.declaringType());
    Class<LegalEntitySurvivalProbabilities> expectedDeclaringTypeResult2 =
        LegalEntitySurvivalProbabilities.class;
    assertEquals(expectedDeclaringTypeResult2, survivalProbabilitiesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, legalEntityIdResult.metaBean());
    assertSame(meta, survivalProbabilitiesResult.metaBean());
  }
}
