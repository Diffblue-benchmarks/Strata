package com.opengamma.strata.product.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.capfloor.IborCapFloor.Meta;
import com.opengamma.strata.product.swap.SwapLeg;
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

class IborCapFloorDiffblueTest {
  /**
   * Test {@link IborCapFloor#meta()}.
   *
   * <p>Method under test: {@link IborCapFloor#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborCapFloor.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborCapFloor.meta();

    // Assert
    MetaProperty<IborCapFloorLeg> capFloorLegResult = actualMetaResult.capFloorLeg();
    assertTrue(capFloorLegResult instanceof DirectMetaProperty);
    MetaProperty<SwapLeg> payLegResult = actualMetaResult.payLeg();
    assertTrue(payLegResult instanceof DirectMetaProperty);
    assertEquals("capFloorLeg", capFloorLegResult.name());
    assertEquals("payLeg", payLegResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, capFloorLegResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, payLegResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<IborCapFloor> expectedDeclaringTypeResult = IborCapFloor.class;
    assertEquals(expectedDeclaringTypeResult, capFloorLegResult.declaringType());
    Class<IborCapFloor> expectedDeclaringTypeResult2 = IborCapFloor.class;
    assertEquals(expectedDeclaringTypeResult2, payLegResult.declaringType());
    Class<IborCapFloorLeg> expectedPropertyTypeResult = IborCapFloorLeg.class;
    assertEquals(expectedPropertyTypeResult, capFloorLegResult.propertyType());
    Class<SwapLeg> expectedPropertyTypeResult2 = SwapLeg.class;
    assertEquals(expectedPropertyTypeResult2, payLegResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, capFloorLegResult.metaBean());
    assertSame(meta, payLegResult.metaBean());
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
    Class<? extends IborCapFloor> actualBeanTypeResult = IborCapFloor.meta().beanType();

    // Assert
    Class<IborCapFloor> expectedBeanTypeResult = IborCapFloor.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#capFloorLeg()}
   *   <li>{@link Meta#payLeg()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.capFloorLeg()", "MetaProperty Meta.payLeg()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborCapFloor.meta();

    // Act
    MetaProperty<IborCapFloorLeg> actualCapFloorLegResult = metaResult.capFloorLeg();

    // Assert
    assertTrue(actualCapFloorLegResult instanceof DirectMetaProperty);
    assertTrue(metaResult.payLeg() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean capFloorLeg return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean capFloorLeg return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanCapFloorLegReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = IborCapFloor.meta().metaPropertyGet("payLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<IborCapFloorLeg> capFloorLegResult = ((Meta) metaBeanResult).capFloorLeg();
    assertTrue(capFloorLegResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("capFloorLeg", capFloorLegResult.name());
    assertEquals("payLeg", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, capFloorLegResult.style());
    Class<IborCapFloor> expectedDeclaringTypeResult = IborCapFloor.class;
    assertEquals(expectedDeclaringTypeResult, capFloorLegResult.declaringType());
    Class<IborCapFloorLeg> expectedPropertyTypeResult = IborCapFloorLeg.class;
    assertEquals(expectedPropertyTypeResult, capFloorLegResult.propertyType());
    Class<SwapLeg> expectedPropertyTypeResult2 = SwapLeg.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).payLeg());
    assertSame(Meta.INSTANCE, capFloorLegResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean payLeg return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean payLeg return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanPayLegReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapFloor.meta().metaPropertyGet("capFloorLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SwapLeg> payLegResult = ((Meta) metaBeanResult).payLeg();
    assertTrue(payLegResult instanceof DirectMetaProperty);
    assertEquals("capFloorLeg", actualMetaPropertyGetResult.name());
    assertEquals("payLeg", payLegResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, payLegResult.style());
    Class<IborCapFloor> expectedDeclaringTypeResult = IborCapFloor.class;
    assertEquals(expectedDeclaringTypeResult, payLegResult.declaringType());
    Class<IborCapFloorLeg> expectedPropertyTypeResult = IborCapFloorLeg.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<SwapLeg> expectedPropertyTypeResult2 = SwapLeg.class;
    assertEquals(expectedPropertyTypeResult2, payLegResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).capFloorLeg());
    assertSame(Meta.INSTANCE, payLegResult.metaBean());
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
    assertNull(IborCapFloor.meta().metaPropertyGet("Property Name"));
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
        IborCapFloor.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("capFloorLeg");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("payLeg");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("capFloorLeg", getResult.name());
    assertEquals("payLeg", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<IborCapFloor> expectedDeclaringTypeResult = IborCapFloor.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<IborCapFloor> expectedDeclaringTypeResult2 = IborCapFloor.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<IborCapFloorLeg> expectedPropertyTypeResult = IborCapFloorLeg.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<SwapLeg> expectedPropertyTypeResult2 = SwapLeg.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
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
    assertNull(IborCapFloor.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code capFloorLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'capFloorLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCapFloorLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> IborCapFloor.meta().propertySet(mock(Bean.class), "capFloorLeg", "New Value", true));
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
        () -> IborCapFloor.meta().propertySet(mock(Bean.class), "capFloorLeg", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code payLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'payLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPayLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> IborCapFloor.meta().propertySet(mock(Bean.class), "payLeg", "New Value", true));
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
            IborCapFloor.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
