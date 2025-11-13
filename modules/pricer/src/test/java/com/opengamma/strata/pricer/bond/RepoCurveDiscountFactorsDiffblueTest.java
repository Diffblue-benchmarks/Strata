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
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.pricer.DiscountFactors;
import com.opengamma.strata.pricer.bond.RepoCurveDiscountFactors.Meta;
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

class RepoCurveDiscountFactorsDiffblueTest {
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
    Class<? extends RepoCurveDiscountFactors> actualBeanTypeResult =
        RepoCurveDiscountFactors.meta().beanType();

    // Assert
    Class<RepoCurveDiscountFactors> expectedBeanTypeResult = RepoCurveDiscountFactors.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#discountFactors()}
   *   <li>{@link Meta#repoGroup()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.discountFactors()", "MetaProperty Meta.repoGroup()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RepoCurveDiscountFactors.meta();

    // Act
    MetaProperty<DiscountFactors> actualDiscountFactorsResult = metaResult.discountFactors();

    // Assert
    assertTrue(actualDiscountFactorsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.repoGroup() instanceof DirectMetaProperty);
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
        RepoCurveDiscountFactors.meta().metaPropertyGet("repoGroup");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DiscountFactors> discountFactorsResult = ((Meta) metaBeanResult).discountFactors();
    assertTrue(discountFactorsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", discountFactorsResult.name());
    assertEquals("repoGroup", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, discountFactorsResult.style());
    Class<RepoGroup> expectedPropertyTypeResult = RepoGroup.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, discountFactorsResult.propertyType());
    Class<RepoCurveDiscountFactors> expectedDeclaringTypeResult = RepoCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, discountFactorsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).repoGroup());
    assertSame(Meta.INSTANCE, discountFactorsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean repoGroup return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean repoGroup return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanRepoGroupReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RepoCurveDiscountFactors.meta().metaPropertyGet("discountFactors");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<RepoGroup> repoGroupResult = ((Meta) metaBeanResult).repoGroup();
    assertTrue(repoGroupResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", actualMetaPropertyGetResult.name());
    assertEquals("repoGroup", repoGroupResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, repoGroupResult.style());
    Class<RepoGroup> expectedPropertyTypeResult = RepoGroup.class;
    assertEquals(expectedPropertyTypeResult, repoGroupResult.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<RepoCurveDiscountFactors> expectedDeclaringTypeResult = RepoCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, repoGroupResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).discountFactors());
    assertSame(Meta.INSTANCE, repoGroupResult.metaBean());
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
    assertNull(RepoCurveDiscountFactors.meta().metaPropertyGet("Property Name"));
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
        RepoCurveDiscountFactors.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("discountFactors");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("repoGroup");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("discountFactors", getResult.name());
    assertEquals("repoGroup", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<RepoGroup> expectedPropertyTypeResult = RepoGroup.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<RepoCurveDiscountFactors> expectedDeclaringTypeResult = RepoCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<RepoCurveDiscountFactors> expectedDeclaringTypeResult2 = RepoCurveDiscountFactors.class;
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
        RepoCurveDiscountFactors.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            RepoCurveDiscountFactors.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            RepoCurveDiscountFactors.meta()
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
            RepoCurveDiscountFactors.meta()
                .propertySet(mock(Bean.class), "discountFactors", "New Value", false));
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
            RepoCurveDiscountFactors.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code repoGroup}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'repoGroup'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRepoGroup_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RepoCurveDiscountFactors.meta()
                .propertySet(mock(Bean.class), "repoGroup", "New Value", true));
  }

  /**
   * Test {@link RepoCurveDiscountFactors#of(DiscountFactors, RepoGroup)}.
   *
   * <ul>
   *   <li>When {@link DiscountFactors}.
   *   <li>Then return Currency is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RepoCurveDiscountFactors#of(DiscountFactors, RepoGroup)}
   */
  @Test
  @DisplayName(
      "Test of(DiscountFactors, RepoGroup); when DiscountFactors; then return Currency is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RepoCurveDiscountFactors RepoCurveDiscountFactors.of(DiscountFactors, RepoGroup)"
  })
  void testOf_whenDiscountFactors_thenReturnCurrencyIsNull() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    RepoGroup group = RepoGroup.of("Name");

    // Act
    RepoCurveDiscountFactors actualOfResult = RepoCurveDiscountFactors.of(discountFactors, group);

    // Assert
    assertNull(actualOfResult.getCurrency());
    assertNull(actualOfResult.getValuationDate());
    assertSame(group, actualOfResult.getRepoGroup());
    assertSame(discountFactors, actualOfResult.getDiscountFactors());
  }

  /**
   * Test {@link RepoCurveDiscountFactors#getCurrency()}.
   *
   * <ul>
   *   <li>Given {@link DiscountFactors} {@link DiscountFactors#getCurrency()} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RepoCurveDiscountFactors#getCurrency()}
   */
  @Test
  @DisplayName(
      "Test getCurrency(); given DiscountFactors getCurrency() return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency RepoCurveDiscountFactors.getCurrency()"})
  void testGetCurrency_givenDiscountFactorsGetCurrencyReturnNull_thenReturnNull() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.getCurrency()).thenReturn(null);

    // Act
    Currency actualCurrency =
        RepoCurveDiscountFactors.of(discountFactors, RepoGroup.of("Name")).getCurrency();

    // Assert
    verify(discountFactors).getCurrency();
    assertNull(actualCurrency);
  }

  /**
   * Test {@link RepoCurveDiscountFactors#getValuationDate()}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link RepoCurveDiscountFactors#getValuationDate()}
   */
  @Test
  @DisplayName("Test getValuationDate(); then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate RepoCurveDiscountFactors.getValuationDate()"})
  void testGetValuationDate_thenReturnToStringIs19700101() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    LocalDate ofResult = LocalDate.of(1970, 1, 1);
    when(discountFactors.getValuationDate()).thenReturn(ofResult);

    // Act
    LocalDate actualValuationDate =
        RepoCurveDiscountFactors.of(discountFactors, RepoGroup.of("Name")).getValuationDate();

    // Assert
    verify(discountFactors).getValuationDate();
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertSame(ofResult, actualValuationDate);
  }

  /**
   * Test {@link RepoCurveDiscountFactors#discountFactor(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link DiscountFactors} {@link DiscountFactors#discountFactor(LocalDate)} return
   *       ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link RepoCurveDiscountFactors#discountFactor(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test discountFactor(LocalDate); given DiscountFactors discountFactor(LocalDate) return ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RepoCurveDiscountFactors.discountFactor(LocalDate)"})
  void testDiscountFactor_givenDiscountFactorsDiscountFactorReturnTen_thenReturnTen() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);
    when(discountFactors.discountFactor(Mockito.<LocalDate>any())).thenReturn(10.0d);

    // Act
    double actualDiscountFactorResult =
        RepoCurveDiscountFactors.of(discountFactors, RepoGroup.of("Name"))
            .discountFactor(LocalDate.of(1970, 1, 1));

    // Assert
    verify(discountFactors).discountFactor(isA(LocalDate.class));
    assertEquals(10.0d, actualDiscountFactorResult);
  }

  /**
   * Test {@link RepoCurveDiscountFactors#meta()}.
   *
   * <p>Method under test: {@link RepoCurveDiscountFactors#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RepoCurveDiscountFactors.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RepoCurveDiscountFactors.meta();

    // Assert
    MetaProperty<DiscountFactors> discountFactorsResult = actualMetaResult.discountFactors();
    assertTrue(discountFactorsResult instanceof DirectMetaProperty);
    MetaProperty<RepoGroup> repoGroupResult = actualMetaResult.repoGroup();
    assertTrue(repoGroupResult instanceof DirectMetaProperty);
    assertEquals("discountFactors", discountFactorsResult.name());
    assertEquals("repoGroup", repoGroupResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, discountFactorsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, repoGroupResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<RepoGroup> expectedPropertyTypeResult = RepoGroup.class;
    assertEquals(expectedPropertyTypeResult, repoGroupResult.propertyType());
    Class<DiscountFactors> expectedPropertyTypeResult2 = DiscountFactors.class;
    assertEquals(expectedPropertyTypeResult2, discountFactorsResult.propertyType());
    Class<RepoCurveDiscountFactors> expectedDeclaringTypeResult = RepoCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult, discountFactorsResult.declaringType());
    Class<RepoCurveDiscountFactors> expectedDeclaringTypeResult2 = RepoCurveDiscountFactors.class;
    assertEquals(expectedDeclaringTypeResult2, repoGroupResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, discountFactorsResult.metaBean());
    assertSame(meta, repoGroupResult.metaBean());
  }

  /**
   * Test {@link RepoCurveDiscountFactors#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link RepoCurveDiscountFactors#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RepoCurveDiscountFactors.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        RepoCurveDiscountFactors.of(discountFactors, RepoGroup.of("Name")).metaBean());
  }

  /**
   * Test {@link RepoCurveDiscountFactors#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RepoCurveDiscountFactors#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RepoCurveDiscountFactors.equals(Object)",
    "int RepoCurveDiscountFactors.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DiscountFactors discountFactors = mock(DiscountFactors.class);

    // Act and Assert
    assertNotEquals(RepoCurveDiscountFactors.of(discountFactors, RepoGroup.of("Name")), "Obj");
  }
}
