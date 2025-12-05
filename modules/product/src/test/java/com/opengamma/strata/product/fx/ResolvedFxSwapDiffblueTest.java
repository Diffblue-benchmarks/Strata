package com.opengamma.strata.product.fx;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fx.ResolvedFxSwap.Meta;
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

class ResolvedFxSwapDiffblueTest {
  /**
   * Test {@link ResolvedFxSwap#meta()}.
   *
   * <p>Method under test: {@link ResolvedFxSwap#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedFxSwap.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedFxSwap.meta();

    // Assert
    MetaProperty<ResolvedFxSingle> farLegResult = actualMetaResult.farLeg();
    assertTrue(farLegResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedFxSingle> nearLegResult = actualMetaResult.nearLeg();
    assertTrue(nearLegResult instanceof DirectMetaProperty);
    assertEquals("farLeg", farLegResult.name());
    assertEquals("nearLeg", nearLegResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, farLegResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, nearLegResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ResolvedFxSingle> expectedPropertyTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedPropertyTypeResult, farLegResult.propertyType());
    Class<ResolvedFxSingle> expectedPropertyTypeResult2 = ResolvedFxSingle.class;
    assertEquals(expectedPropertyTypeResult2, nearLegResult.propertyType());
    Class<ResolvedFxSwap> expectedDeclaringTypeResult = ResolvedFxSwap.class;
    assertEquals(expectedDeclaringTypeResult, farLegResult.declaringType());
    Class<ResolvedFxSwap> expectedDeclaringTypeResult2 = ResolvedFxSwap.class;
    assertEquals(expectedDeclaringTypeResult2, nearLegResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, farLegResult.metaBean());
    assertSame(meta, nearLegResult.metaBean());
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
    Class<? extends ResolvedFxSwap> actualBeanTypeResult = ResolvedFxSwap.meta().beanType();

    // Assert
    Class<ResolvedFxSwap> expectedBeanTypeResult = ResolvedFxSwap.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#farLeg()}
   *   <li>{@link Meta#nearLeg()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.farLeg()", "MetaProperty Meta.nearLeg()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedFxSwap.meta();

    // Act
    MetaProperty<ResolvedFxSingle> actualFarLegResult = metaResult.farLeg();

    // Assert
    assertTrue(actualFarLegResult instanceof DirectMetaProperty);
    assertTrue(metaResult.nearLeg() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code farLeg}.
   *   <li>Then metaBean nearLeg return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'farLeg'; then metaBean nearLeg return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFarLeg_thenMetaBeanNearLegReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedFxSwap.meta().metaPropertyGet("farLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedFxSingle> nearLegResult = ((Meta) metaBeanResult).nearLeg();
    assertTrue(nearLegResult instanceof DirectMetaProperty);
    assertEquals("farLeg", actualMetaPropertyGetResult.name());
    assertEquals("nearLeg", nearLegResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, nearLegResult.style());
    Class<ResolvedFxSingle> expectedPropertyTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedPropertyTypeResult, nearLegResult.propertyType());
    Class<ResolvedFxSwap> expectedDeclaringTypeResult = ResolvedFxSwap.class;
    assertEquals(expectedDeclaringTypeResult, nearLegResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).farLeg());
    assertSame(Meta.INSTANCE, nearLegResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code nearLeg}.
   *   <li>Then metaBean farLeg return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'nearLeg'; then metaBean farLeg return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNearLeg_thenMetaBeanFarLegReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedFxSwap.meta().metaPropertyGet("nearLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ResolvedFxSingle> farLegResult = ((Meta) metaBeanResult).farLeg();
    assertTrue(farLegResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("farLeg", farLegResult.name());
    assertEquals("nearLeg", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, farLegResult.style());
    Class<ResolvedFxSingle> expectedPropertyTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedPropertyTypeResult, farLegResult.propertyType());
    Class<ResolvedFxSwap> expectedDeclaringTypeResult = ResolvedFxSwap.class;
    assertEquals(expectedDeclaringTypeResult, farLegResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).nearLeg());
    assertSame(Meta.INSTANCE, farLegResult.metaBean());
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
    assertNull(ResolvedFxSwap.meta().metaPropertyGet("Property Name"));
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
        ResolvedFxSwap.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("nearLeg");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("farLeg");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("farLeg", getResult2.name());
    assertEquals("nearLeg", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ResolvedFxSingle> expectedPropertyTypeResult = ResolvedFxSingle.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<ResolvedFxSingle> expectedPropertyTypeResult2 = ResolvedFxSingle.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<ResolvedFxSwap> expectedDeclaringTypeResult = ResolvedFxSwap.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ResolvedFxSwap> expectedDeclaringTypeResult2 = ResolvedFxSwap.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
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
    assertNull(ResolvedFxSwap.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ResolvedFxSwap.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
        () -> ResolvedFxSwap.meta().propertySet(mock(Bean.class), "farLeg", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code farLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'farLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFarLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedFxSwap.meta().propertySet(mock(Bean.class), "farLeg", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code nearLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'nearLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNearLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedFxSwap.meta().propertySet(mock(Bean.class), "nearLeg", "New Value", true));
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
            ResolvedFxSwap.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
