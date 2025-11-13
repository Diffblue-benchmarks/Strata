package com.opengamma.strata.market.curve;

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
import com.opengamma.strata.market.curve.CurveNodeDateOrder.Meta;
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

class CurveNodeDateOrderDiffblueTest {
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
    Class<? extends CurveNodeDateOrder> actualBeanTypeResult = CurveNodeDateOrder.meta().beanType();

    // Assert
    Class<CurveNodeDateOrder> expectedBeanTypeResult = CurveNodeDateOrder.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#action()}
   *   <li>{@link Meta#minGapInDays()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.action()", "MetaProperty Meta.minGapInDays()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CurveNodeDateOrder.meta();

    // Act
    MetaProperty<CurveNodeClashAction> actualActionResult = metaResult.action();

    // Assert
    assertTrue(actualActionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.minGapInDays() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean action return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean action return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanActionReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurveNodeDateOrder.meta().metaPropertyGet("minGapInDays");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveNodeClashAction> actionResult = ((Meta) metaBeanResult).action();
    assertTrue(actionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("action", actionResult.name());
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("minGapInDays", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actionResult.style());
    Class<CurveNodeClashAction> expectedPropertyTypeResult = CurveNodeClashAction.class;
    assertEquals(expectedPropertyTypeResult, actionResult.propertyType());
    Class<CurveNodeDateOrder> expectedDeclaringTypeResult = CurveNodeDateOrder.class;
    assertEquals(expectedDeclaringTypeResult, actionResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).minGapInDays());
    assertSame(Meta.INSTANCE, actionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean minGapInDays return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean minGapInDays return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanMinGapInDaysReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurveNodeDateOrder.meta().metaPropertyGet("action");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> minGapInDaysResult = ((Meta) metaBeanResult).minGapInDays();
    assertTrue(minGapInDaysResult instanceof DirectMetaProperty);
    assertEquals("action", actualMetaPropertyGetResult.name());
    assertEquals("int", minGapInDaysResult.propertyType().getName());
    assertEquals("minGapInDays", minGapInDaysResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, minGapInDaysResult.style());
    Class<CurveNodeClashAction> expectedPropertyTypeResult = CurveNodeClashAction.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CurveNodeDateOrder> expectedDeclaringTypeResult = CurveNodeDateOrder.class;
    assertEquals(expectedDeclaringTypeResult, minGapInDaysResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).action());
    assertSame(Meta.INSTANCE, minGapInDaysResult.metaBean());
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
    assertNull(CurveNodeDateOrder.meta().metaPropertyGet("Property Name"));
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
        CurveNodeDateOrder.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("minGapInDays");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("action");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("action", getResult2.name());
    assertEquals("int", getResult.propertyType().getName());
    assertEquals("minGapInDays", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<CurveNodeClashAction> expectedPropertyTypeResult = CurveNodeClashAction.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<CurveNodeDateOrder> expectedDeclaringTypeResult = CurveNodeDateOrder.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<CurveNodeDateOrder> expectedDeclaringTypeResult2 = CurveNodeDateOrder.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code action}.
   *   <li>Then return {@link CurveNodeClashAction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'action'; then return CurveNodeClashAction")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAction_thenReturnCurveNodeClashAction() {
    // Arrange and Act
    Object actualPropertyGetResult =
        CurveNodeDateOrder.meta().propertyGet(CurveNodeDateOrder.DEFAULT, "action", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof CurveNodeClashAction);
    assertEquals(CurveNodeClashAction.EXCEPTION, actualPropertyGetResult);
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
    assertNull(CurveNodeDateOrder.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            CurveNodeDateOrder.meta()
                .propertyGet(CurveNodeDateOrder.DEFAULT, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code minGapInDays}.
   *   <li>Then return intValue is one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'minGapInDays'; then return intValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMinGapInDays_thenReturnIntValueIsOne() {
    // Arrange, Act and Assert
    assertEquals(
        1,
        ((Integer)
                CurveNodeDateOrder.meta()
                    .propertyGet(CurveNodeDateOrder.DEFAULT, "minGapInDays", true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code action}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'action'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CurveNodeDateOrder.meta().propertySet(mock(Bean.class), "action", "New Value", true));
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
            CurveNodeDateOrder.meta().propertySet(mock(Bean.class), "action", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code minGapInDays}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'minGapInDays'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMinGapInDays_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurveNodeDateOrder.meta()
                .propertySet(mock(Bean.class), "minGapInDays", "New Value", true));
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
            CurveNodeDateOrder.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link CurveNodeDateOrder#of(int, CurveNodeClashAction)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return MinGapInDays is one.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateOrder#of(int, CurveNodeClashAction)}
   */
  @Test
  @DisplayName("Test of(int, CurveNodeClashAction); when one; then return MinGapInDays is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveNodeDateOrder CurveNodeDateOrder.of(int, CurveNodeClashAction)"})
  void testOf_whenOne_thenReturnMinGapInDaysIsOne() {
    // Arrange and Act
    CurveNodeDateOrder actualOfResult = CurveNodeDateOrder.of(1, CurveNodeClashAction.EXCEPTION);

    // Assert
    assertEquals(1, actualOfResult.getMinGapInDays());
    assertEquals(CurveNodeClashAction.EXCEPTION, actualOfResult.getAction());
  }

  /**
   * Test {@link CurveNodeDateOrder#of(int, CurveNodeClashAction)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateOrder#of(int, CurveNodeClashAction)}
   */
  @Test
  @DisplayName("Test of(int, CurveNodeClashAction); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveNodeDateOrder CurveNodeDateOrder.of(int, CurveNodeClashAction)"})
  void testOf_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> CurveNodeDateOrder.of(0, CurveNodeClashAction.EXCEPTION));
  }

  /**
   * Test {@link CurveNodeDateOrder#meta()}.
   *
   * <p>Method under test: {@link CurveNodeDateOrder#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveNodeDateOrder.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurveNodeDateOrder.meta();

    // Assert
    MetaProperty<CurveNodeClashAction> actionResult = actualMetaResult.action();
    assertTrue(actionResult instanceof DirectMetaProperty);
    MetaProperty<Integer> minGapInDaysResult = actualMetaResult.minGapInDays();
    assertTrue(minGapInDaysResult instanceof DirectMetaProperty);
    assertEquals("action", actionResult.name());
    assertEquals("int", minGapInDaysResult.propertyType().getName());
    assertEquals("minGapInDays", minGapInDaysResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actionResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, minGapInDaysResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurveNodeClashAction> expectedPropertyTypeResult = CurveNodeClashAction.class;
    assertEquals(expectedPropertyTypeResult, actionResult.propertyType());
    Class<CurveNodeDateOrder> expectedDeclaringTypeResult = CurveNodeDateOrder.class;
    assertEquals(expectedDeclaringTypeResult, actionResult.declaringType());
    Class<CurveNodeDateOrder> expectedDeclaringTypeResult2 = CurveNodeDateOrder.class;
    assertEquals(expectedDeclaringTypeResult2, minGapInDaysResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, actionResult.metaBean());
    assertSame(meta, minGapInDaysResult.metaBean());
  }

  /**
   * Test {@link CurveNodeDateOrder#metaBean()}.
   *
   * <p>Method under test: {@link CurveNodeDateOrder#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveNodeDateOrder.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, CurveNodeDateOrder.DEFAULT.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDateOrder#toString()}
   *   <li>{@link CurveNodeDateOrder#getAction()}
   *   <li>{@link CurveNodeDateOrder#getMinGapInDays()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveNodeClashAction CurveNodeDateOrder.getAction()",
    "int CurveNodeDateOrder.getMinGapInDays()",
    "String CurveNodeDateOrder.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveNodeDateOrder ofResult = CurveNodeDateOrder.of(1, CurveNodeClashAction.EXCEPTION);

    // Act
    String actualToStringResult = ofResult.toString();
    CurveNodeClashAction actualAction = ofResult.getAction();

    // Assert
    assertEquals("CurveNodeDateOrder{minGapInDays=1, action=Exception}", actualToStringResult);
    assertEquals(1, ofResult.getMinGapInDays());
    assertEquals(CurveNodeClashAction.EXCEPTION, actualAction);
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}, and {@link CurveNodeDateOrder#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDateOrder#equals(Object)}
   *   <li>{@link CurveNodeDateOrder#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveNodeDateOrder curveNodeDateOrder = CurveNodeDateOrder.DEFAULT;
    CurveNodeDateOrder curveNodeDateOrder2 = CurveNodeDateOrder.DEFAULT;

    // Act and Assert
    assertEquals(curveNodeDateOrder, curveNodeDateOrder2);
    assertEquals(curveNodeDateOrder.hashCode(), curveNodeDateOrder2.hashCode());
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}, and {@link CurveNodeDateOrder#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDateOrder#equals(Object)}
   *   <li>{@link CurveNodeDateOrder#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    CurveNodeDateOrder ofResult = CurveNodeDateOrder.of(1, CurveNodeClashAction.EXCEPTION);
    CurveNodeDateOrder curveNodeDateOrder = CurveNodeDateOrder.DEFAULT;

    // Act and Assert
    assertEquals(ofResult, curveNodeDateOrder);
    assertEquals(ofResult.hashCode(), curveNodeDateOrder.hashCode());
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}, and {@link CurveNodeDateOrder#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveNodeDateOrder#equals(Object)}
   *   <li>{@link CurveNodeDateOrder#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveNodeDateOrder curveNodeDateOrder = CurveNodeDateOrder.DEFAULT;

    // Act and Assert
    assertEquals(curveNodeDateOrder, curveNodeDateOrder);
    int expectedHashCodeResult = curveNodeDateOrder.hashCode();
    assertEquals(expectedHashCodeResult, curveNodeDateOrder.hashCode());
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateOrder#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveNodeDateOrder ofResult = CurveNodeDateOrder.of(1, CurveNodeClashAction.EXCEPTION);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateOrder#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveNodeDateOrder ofResult = CurveNodeDateOrder.of(96, CurveNodeClashAction.EXCEPTION);

    // Act and Assert
    assertNotEquals(ofResult, CurveNodeDateOrder.DEFAULT);
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateOrder#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CurveNodeDateOrder ofResult = CurveNodeDateOrder.of(1, CurveNodeClashAction.DROP_THIS);

    // Act and Assert
    assertNotEquals(ofResult, CurveNodeDateOrder.DEFAULT);
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateOrder#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveNodeDateOrder.DEFAULT, null);
  }

  /**
   * Test {@link CurveNodeDateOrder#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateOrder#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveNodeDateOrder.equals(Object)",
    "int CurveNodeDateOrder.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveNodeDateOrder.DEFAULT, "Different type to CurveNodeDateOrder");
  }
}
