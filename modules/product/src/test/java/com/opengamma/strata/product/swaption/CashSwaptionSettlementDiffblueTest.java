package com.opengamma.strata.product.swaption;

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
import com.opengamma.strata.product.common.SettlementType;
import com.opengamma.strata.product.swaption.CashSwaptionSettlement.Meta;
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

class CashSwaptionSettlementDiffblueTest {
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
    Class<? extends CashSwaptionSettlement> actualBeanTypeResult =
        CashSwaptionSettlement.meta().beanType();

    // Assert
    Class<CashSwaptionSettlement> expectedBeanTypeResult = CashSwaptionSettlement.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#method()}
   *   <li>{@link Meta#settlementDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.method()", "MetaProperty Meta.settlementDate()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CashSwaptionSettlement.meta();

    // Act
    MetaProperty<CashSwaptionSettlementMethod> actualMethodResult = metaResult.method();

    // Assert
    assertTrue(actualMethodResult instanceof DirectMetaProperty);
    assertTrue(metaResult.settlementDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean method return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean method return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanMethodReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CashSwaptionSettlement.meta().metaPropertyGet("settlementDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CashSwaptionSettlementMethod> methodResult = ((Meta) metaBeanResult).method();
    assertTrue(methodResult instanceof DirectMetaProperty);
    assertEquals("method", methodResult.name());
    assertEquals("settlementDate", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, methodResult.style());
    Class<CashSwaptionSettlement> expectedDeclaringTypeResult = CashSwaptionSettlement.class;
    assertEquals(expectedDeclaringTypeResult, methodResult.declaringType());
    Class<CashSwaptionSettlementMethod> expectedPropertyTypeResult =
        CashSwaptionSettlementMethod.class;
    assertEquals(expectedPropertyTypeResult, methodResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).settlementDate());
    assertSame(Meta.INSTANCE, methodResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean settlementDate return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean settlementDate return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanSettlementDateReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CashSwaptionSettlement.meta().metaPropertyGet("method");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> settlementDateResult = ((Meta) metaBeanResult).settlementDate();
    assertTrue(settlementDateResult instanceof DirectMetaProperty);
    assertEquals("method", actualMetaPropertyGetResult.name());
    assertEquals("settlementDate", settlementDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, settlementDateResult.style());
    Class<CashSwaptionSettlement> expectedDeclaringTypeResult = CashSwaptionSettlement.class;
    assertEquals(expectedDeclaringTypeResult, settlementDateResult.declaringType());
    Class<CashSwaptionSettlementMethod> expectedPropertyTypeResult =
        CashSwaptionSettlementMethod.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, settlementDateResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).method());
    assertSame(Meta.INSTANCE, settlementDateResult.metaBean());
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
    assertNull(CashSwaptionSettlement.meta().metaPropertyGet("Property Name"));
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
        CashSwaptionSettlement.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("settlementDate");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("method");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("method", getResult2.name());
    assertEquals("settlementDate", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<CashSwaptionSettlement> expectedDeclaringTypeResult = CashSwaptionSettlement.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<CashSwaptionSettlement> expectedDeclaringTypeResult2 = CashSwaptionSettlement.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<CashSwaptionSettlementMethod> expectedPropertyTypeResult =
        CashSwaptionSettlementMethod.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
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
    assertNull(CashSwaptionSettlement.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CashSwaptionSettlement.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                CashSwaptionSettlement.of(
                    LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code method}.
   *   <li>Then return {@link CashSwaptionSettlementMethod}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'method'; then return CashSwaptionSettlementMethod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMethod_thenReturnCashSwaptionSettlementMethod() {
    // Arrange
    Meta metaResult = CashSwaptionSettlement.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            CashSwaptionSettlement.of(
                LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE),
            "method",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof CashSwaptionSettlementMethod);
    assertEquals(CashSwaptionSettlementMethod.CASH_PRICE, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'settlementDate'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSettlementDate_thenReturnToStringIs19700101() {
    // Arrange
    Meta metaResult = CashSwaptionSettlement.meta();
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            CashSwaptionSettlement.of(settlementDate, CashSwaptionSettlementMethod.CASH_PRICE),
            "settlementDate",
            true);

    // Assert
    assertEquals("1970-01-01", actualPropertyGetResult.toString());
    assertSame(settlementDate, actualPropertyGetResult);
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
            CashSwaptionSettlement.meta()
                .propertySet(mock(Bean.class), "method", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code method}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'method'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMethod_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CashSwaptionSettlement.meta()
                .propertySet(mock(Bean.class), "method", "New Value", true));
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
            CashSwaptionSettlement.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'settlementDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSettlementDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CashSwaptionSettlement.meta()
                .propertySet(mock(Bean.class), "settlementDate", "New Value", true));
  }

  /**
   * Test {@link CashSwaptionSettlement#of(LocalDate, CashSwaptionSettlementMethod)}.
   *
   * <ul>
   *   <li>When {@code CASH_PRICE}.
   *   <li>Then return SettlementType is {@code CASH}.
   * </ul>
   *
   * <p>Method under test: {@link CashSwaptionSettlement#of(LocalDate,
   * CashSwaptionSettlementMethod)}
   */
  @Test
  @DisplayName(
      "Test of(LocalDate, CashSwaptionSettlementMethod); when 'CASH_PRICE'; then return SettlementType is 'CASH'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CashSwaptionSettlement CashSwaptionSettlement.of(LocalDate, CashSwaptionSettlementMethod)"
  })
  void testOf_whenCashPrice_thenReturnSettlementTypeIsCash() {
    // Arrange
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    // Act
    CashSwaptionSettlement actualOfResult =
        CashSwaptionSettlement.of(settlementDate, CashSwaptionSettlementMethod.CASH_PRICE);

    // Assert
    assertEquals(SettlementType.CASH, actualOfResult.getSettlementType());
    assertEquals(CashSwaptionSettlementMethod.CASH_PRICE, actualOfResult.getMethod());
    assertSame(settlementDate, actualOfResult.getSettlementDate());
  }

  /**
   * Test {@link CashSwaptionSettlement#meta()}.
   *
   * <p>Method under test: {@link CashSwaptionSettlement#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CashSwaptionSettlement.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CashSwaptionSettlement.meta();

    // Assert
    MetaProperty<CashSwaptionSettlementMethod> methodResult = actualMetaResult.method();
    assertTrue(methodResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> settlementDateResult = actualMetaResult.settlementDate();
    assertTrue(settlementDateResult instanceof DirectMetaProperty);
    assertEquals("method", methodResult.name());
    assertEquals("settlementDate", settlementDateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, methodResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, settlementDateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CashSwaptionSettlement> expectedDeclaringTypeResult = CashSwaptionSettlement.class;
    assertEquals(expectedDeclaringTypeResult, methodResult.declaringType());
    Class<CashSwaptionSettlement> expectedDeclaringTypeResult2 = CashSwaptionSettlement.class;
    assertEquals(expectedDeclaringTypeResult2, settlementDateResult.declaringType());
    Class<CashSwaptionSettlementMethod> expectedPropertyTypeResult =
        CashSwaptionSettlementMethod.class;
    assertEquals(expectedPropertyTypeResult, methodResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, settlementDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, methodResult.metaBean());
    assertSame(meta, settlementDateResult.metaBean());
  }

  /**
   * Test {@link CashSwaptionSettlement#metaBean()}.
   *
   * <p>Method under test: {@link CashSwaptionSettlement#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CashSwaptionSettlement.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        CashSwaptionSettlement.of(LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE)
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CashSwaptionSettlement#toString()}
   *   <li>{@link CashSwaptionSettlement#getMethod()}
   *   <li>{@link CashSwaptionSettlement#getSettlementDate()}
   *   <li>{@link CashSwaptionSettlement#getSettlementType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CashSwaptionSettlementMethod CashSwaptionSettlement.getMethod()",
    "LocalDate CashSwaptionSettlement.getSettlementDate()",
    "SettlementType CashSwaptionSettlement.getSettlementType()",
    "String CashSwaptionSettlement.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);
    CashSwaptionSettlement ofResult =
        CashSwaptionSettlement.of(settlementDate, CashSwaptionSettlementMethod.CASH_PRICE);

    // Act
    String actualToStringResult = ofResult.toString();
    CashSwaptionSettlementMethod actualMethod = ofResult.getMethod();
    LocalDate actualSettlementDate = ofResult.getSettlementDate();

    // Assert
    assertEquals("1970-01-01", actualSettlementDate.toString());
    assertEquals(
        "CashSwaptionSettlement{settlementDate=1970-01-01, method=CashPrice}",
        actualToStringResult);
    assertEquals(SettlementType.CASH, ofResult.getSettlementType());
    assertEquals(CashSwaptionSettlementMethod.CASH_PRICE, actualMethod);
    assertSame(settlementDate, actualSettlementDate);
  }

  /**
   * Test {@link CashSwaptionSettlement#equals(Object)}, and {@link
   * CashSwaptionSettlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CashSwaptionSettlement#equals(Object)}
   *   <li>{@link CashSwaptionSettlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CashSwaptionSettlement.equals(Object)",
    "int CashSwaptionSettlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CashSwaptionSettlement ofResult =
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE);
    CashSwaptionSettlement ofResult2 =
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CashSwaptionSettlement#equals(Object)}, and {@link
   * CashSwaptionSettlement#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CashSwaptionSettlement#equals(Object)}
   *   <li>{@link CashSwaptionSettlement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CashSwaptionSettlement.equals(Object)",
    "int CashSwaptionSettlement.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CashSwaptionSettlement ofResult =
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CashSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CashSwaptionSettlement.equals(Object)",
    "int CashSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE),
        1);
  }

  /**
   * Test {@link CashSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CashSwaptionSettlement.equals(Object)",
    "int CashSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CashSwaptionSettlement ofResult =
        CashSwaptionSettlement.of(LocalDate.now(), CashSwaptionSettlementMethod.CASH_PRICE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE));
  }

  /**
   * Test {@link CashSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CashSwaptionSettlement.equals(Object)",
    "int CashSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CashSwaptionSettlement ofResult =
        CashSwaptionSettlement.of(LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.PAR_YIELD);

    // Act and Assert
    assertNotEquals(
        ofResult,
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE));
  }

  /**
   * Test {@link CashSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CashSwaptionSettlement.equals(Object)",
    "int CashSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE),
        null);
  }

  /**
   * Test {@link CashSwaptionSettlement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashSwaptionSettlement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CashSwaptionSettlement.equals(Object)",
    "int CashSwaptionSettlement.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CashSwaptionSettlement.of(
            LocalDate.of(1970, 1, 1), CashSwaptionSettlementMethod.CASH_PRICE),
        "Different type to CashSwaptionSettlement");
  }
}
