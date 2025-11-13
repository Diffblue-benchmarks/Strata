package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.market.curve.LegalEntityGroup;
import com.opengamma.strata.pricer.DiscountFactors;
import com.opengamma.strata.pricer.bond.IssuerCurveDiscountFactors.Meta;
import java.time.LocalDate;
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

class IssuerCurveDiscountFactorsDiffblueTest {
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
    Class<? extends IssuerCurveDiscountFactors> actualBeanTypeResult =
        IssuerCurveDiscountFactors.meta().beanType();

    // Assert
    Class<IssuerCurveDiscountFactors> expectedBeanTypeResult = IssuerCurveDiscountFactors.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#discountFactors()}
   *   <li>{@link Meta#legalEntityGroup()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.discountFactors()", "MetaProperty Meta.legalEntityGroup()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IssuerCurveDiscountFactors.meta();

    // Act
    MetaProperty<DiscountFactors> actualDiscountFactorsResult = metaResult.discountFactors();

    // Assert
    assertTrue(actualDiscountFactorsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.legalEntityGroup() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean discountFactors return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean discountFactors return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanDiscountFactorsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IssuerCurveDiscountFactors.meta().metaPropertyGet("legalEntityGroup");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> discountFactorsResult = ((Meta) metaBeanResult).discountFactors();
    assertTrue(discountFactorsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", discountFactorsResult.name());
    assertEquals("legalEntityGroup", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, discountFactorsResult.style());
    Class<LegalEntityGroup> expectedPropertyTypeResult = LegalEntityGroup.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, discountFactorsResult.propertyType());
    Class<IssuerCurveDiscountFactors> expectedDeclaringTypeResult =
        IssuerCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, discountFactorsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legalEntityGroup());
    assertSame(Meta.INSTANCE, discountFactorsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean legalEntityGroup return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean legalEntityGroup return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanLegalEntityGroupReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IssuerCurveDiscountFactors.meta().metaPropertyGet("discountFactors");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LegalEntityGroup> legalEntityGroupResult =
        ((Meta) metaBeanResult).legalEntityGroup();
    assertTrue(legalEntityGroupResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", actualMetaPropertyGetResult.name());
    assertEquals("legalEntityGroup", legalEntityGroupResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityGroupResult.style());
    Class<LegalEntityGroup> expectedPropertyTypeResult = LegalEntityGroup.class;
    assertEquals(expectedPropertyTypeResult, legalEntityGroupResult.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<IssuerCurveDiscountFactors> expectedDeclaringTypeResult =
        IssuerCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, legalEntityGroupResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountFactors());
    assertSame(Meta.INSTANCE, legalEntityGroupResult.metaBean());
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
    assertNull(IssuerCurveDiscountFactors.meta().metaPropertyGet("Property Name"));
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
        IssuerCurveDiscountFactors.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("discountFactors");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("legalEntityGroup");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("discountFactors", getResult.name());
    assertEquals("legalEntityGroup", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<LegalEntityGroup> expectedPropertyTypeResult = LegalEntityGroup.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<IssuerCurveDiscountFactors> expectedDeclaringTypeResult =
        IssuerCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<IssuerCurveDiscountFactors> expectedDeclaringTypeResult2 =
        IssuerCurveDiscountFactors.class;
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
        IssuerCurveDiscountFactors.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            IssuerCurveDiscountFactors.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code discountFactors}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'discountFactors'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDiscountFactors_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IssuerCurveDiscountFactors.meta()
                .propertySet(mock(Bean.class), "discountFactors", "New Value", true));
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
            IssuerCurveDiscountFactors.meta()
                .propertySet(mock(Bean.class), "discountFactors", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code legalEntityGroup}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'legalEntityGroup'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLegalEntityGroup_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IssuerCurveDiscountFactors.meta()
                .propertySet(mock(Bean.class), "legalEntityGroup", "New Value", true));
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
            IssuerCurveDiscountFactors.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link IssuerCurveDiscountFactors#of(DiscountFactors, LegalEntityGroup)}.
   *
   * <ul>
   *   <li>When {@link DiscountFactors}.
   *   <li>Then return Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IssuerCurveDiscountFactors#of(DiscountFactors, LegalEntityGroup)}
   */
  @Test
  @DisplayName(
      "Test of(DiscountFactors, LegalEntityGroup); when DiscountFactors; then return Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IssuerCurveDiscountFactors IssuerCurveDiscountFactors.of(DiscountFactors, LegalEntityGroup)"
  })
  void testOf_whenDiscountFactors_thenReturnCurrencyIsNull() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    LegalEntityGroup legalEntityGroup = LegalEntityGroup.of("Name");

    // Act
    IssuerCurveDiscountFactors actualOfResult =
        IssuerCurveDiscountFactors.of(discountFactors, legalEntityGroup);

    // Assert
    assertNull(actualOfResult.getCurrency());
    assertNull(actualOfResult.getValuationDate());
    assertSame(legalEntityGroup, actualOfResult.getLegalEntityGroup());
    assertSame(discountFactors, actualOfResult.getDiscountFactors());
  }

  /**
   * Test {@link IssuerCurveDiscountFactors#getCurrency()}.
   *
   * <ul>
   *   <li>Given {@link DiscountFactors} {@link DiscountFactors#getCurrency()} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IssuerCurveDiscountFactors#getCurrency()}
   */
  @Test
  @DisplayName(
      "Test getCurrency(); given DiscountFactors getCurrency() return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency IssuerCurveDiscountFactors.getCurrency()"})
  void testGetCurrency_givenDiscountFactorsGetCurrencyReturnNull_thenReturnNull() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.getCurrency()).thenReturn(null);

    // Act
    Currency actualCurrency =
        IssuerCurveDiscountFactors.of(discountFactors, LegalEntityGroup.of("Name")).getCurrency();

    // Assert
    verify(discountFactors).getCurrency();
    assertNull(actualCurrency);
  }

  /**
   * Test {@link IssuerCurveDiscountFactors#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link IssuerCurveDiscountFactors#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate IssuerCurveDiscountFactors.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(discountFactors.getValuationDate()).thenReturn(ofResult);

    // Act
    LocalDate actualValuationDate =
        IssuerCurveDiscountFactors.of(discountFactors, LegalEntityGroup.of("Name"))
            .getValuationDate();

    // Assert
    verify(discountFactors).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }

  /**
   * Test {@link IssuerCurveDiscountFactors#discountFactor(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link DiscountFactors} {@link DiscountFactors#discountFactor(LocalDate)} return
   *       ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link IssuerCurveDiscountFactors#discountFactor(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test discountFactor(LocalDate); given DiscountFactors discountFactor(LocalDate) return ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double IssuerCurveDiscountFactors.discountFactor(LocalDate)"})
  void testDiscountFactor_givenDiscountFactorsDiscountFactorReturnTen_thenReturnTen() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.discountFactor(Mockito.<LocalDate>any())).thenReturn(10.0d);

    // Act
    double actualDiscountFactorResult =
        IssuerCurveDiscountFactors.of(discountFactors, LegalEntityGroup.of("Name"))
            .discountFactor(LocalDate.of(1970, 1, 1));

    // Assert
    verify(discountFactors).discountFactor(isA(LocalDate.class));
    assertEquals(10.0d, actualDiscountFactorResult);
  }

  /**
   * Test {@link IssuerCurveDiscountFactors#meta()}.
   *
   * <p>Method under test: {@link IssuerCurveDiscountFactors#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IssuerCurveDiscountFactors.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IssuerCurveDiscountFactors.meta();

    // Assert
    MetaProperty<DiscountFactors> discountFactorsResult = actualMetaResult.discountFactors();
    assertTrue(discountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<LegalEntityGroup> legalEntityGroupResult = actualMetaResult.legalEntityGroup();
    assertTrue(legalEntityGroupResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", discountFactorsResult.name());
    assertEquals("legalEntityGroup", legalEntityGroupResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, discountFactorsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, legalEntityGroupResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<LegalEntityGroup> expectedPropertyTypeResult = LegalEntityGroup.class;
    assertEquals(expectedPropertyTypeResult, legalEntityGroupResult.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, discountFactorsResult.propertyType());
    Class<IssuerCurveDiscountFactors> expectedDeclaringTypeResult =
        IssuerCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, discountFactorsResult.declaringType());
    Class<IssuerCurveDiscountFactors> expectedDeclaringTypeResult2 =
        IssuerCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult2, legalEntityGroupResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, discountFactorsResult.metaBean());
    assertSame(meta, legalEntityGroupResult.metaBean());
  }

  /**
   * Test {@link IssuerCurveDiscountFactors#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link IssuerCurveDiscountFactors#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IssuerCurveDiscountFactors.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        IssuerCurveDiscountFactors.of(discountFactors, LegalEntityGroup.of("Name")).metaBean());
  }

  /**
   * Test {@link IssuerCurveDiscountFactors#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IssuerCurveDiscountFactors#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean IssuerCurveDiscountFactors.equals(Object)",
    "int IssuerCurveDiscountFactors.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);

    // Act and Assert
    assertNotEquals(
        IssuerCurveDiscountFactors.of(discountFactors, LegalEntityGroup.of("Name")), "Obj");
  }
}
