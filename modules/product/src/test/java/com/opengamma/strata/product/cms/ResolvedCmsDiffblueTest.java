package com.opengamma.strata.product.cms;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.cms.ResolvedCms.Meta;
import com.opengamma.strata.product.swap.ResolvedSwapLeg;
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

class ResolvedCmsDiffblueTest {
  /**
   * Test {@link ResolvedCms#meta()}.
   *
   * <p>Method under test: {@link ResolvedCms#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedCms.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedCms.meta();

    // Assert
    MetaProperty<ResolvedCmsLeg> cmsLegResult = actualMetaResult.cmsLeg();
    assertTrue(cmsLegResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwapLeg> payLegResult = actualMetaResult.payLeg();
    assertTrue(payLegResult instanceof DirectMetaProperty);
    assertEquals("cmsLeg", cmsLegResult.name());
    assertEquals("payLeg", payLegResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, cmsLegResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, payLegResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ResolvedCms> expectedDeclaringTypeResult = ResolvedCms.class;
    assertEquals(expectedDeclaringTypeResult, cmsLegResult.declaringType());
    Class<ResolvedCms> expectedDeclaringTypeResult2 = ResolvedCms.class;
    assertEquals(expectedDeclaringTypeResult2, payLegResult.declaringType());
    Class<ResolvedCmsLeg> expectedPropertyTypeResult = ResolvedCmsLeg.class;
    assertEquals(expectedPropertyTypeResult, cmsLegResult.propertyType());
    Class<ResolvedSwapLeg> expectedPropertyTypeResult2 = ResolvedSwapLeg.class;
    assertEquals(expectedPropertyTypeResult2, payLegResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, cmsLegResult.metaBean());
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
    Class<? extends ResolvedCms> actualBeanTypeResult = ResolvedCms.meta().beanType();

    // Assert
    Class<ResolvedCms> expectedBeanTypeResult = ResolvedCms.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#cmsLeg()}
   *   <li>{@link Meta#payLeg()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.cmsLeg()", "MetaProperty Meta.payLeg()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedCms.meta();

    // Act
    MetaProperty<ResolvedCmsLeg> actualCmsLegResult = metaResult.cmsLeg();

    // Assert
    assertTrue(actualCmsLegResult instanceof DirectMetaProperty);
    assertTrue(metaResult.payLeg() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code cmsLeg}.
   *   <li>Then metaBean payLeg return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'cmsLeg'; then metaBean payLeg return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCmsLeg_thenMetaBeanPayLegReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedCms.meta().metaPropertyGet("cmsLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedSwapLeg> payLegResult = ((Meta) metaBeanResult).payLeg();
    assertTrue(payLegResult instanceof DirectMetaProperty);
    assertEquals("cmsLeg", actualMetaPropertyGetResult.name());
    assertEquals("payLeg", payLegResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, payLegResult.style());
    Class<ResolvedCms> expectedDeclaringTypeResult = ResolvedCms.class;
    assertEquals(expectedDeclaringTypeResult, payLegResult.declaringType());
    Class<ResolvedCmsLeg> expectedPropertyTypeResult = ResolvedCmsLeg.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ResolvedSwapLeg> expectedPropertyTypeResult2 = ResolvedSwapLeg.class;
    assertEquals(expectedPropertyTypeResult2, payLegResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cmsLeg());
    assertSame(Meta.INSTANCE, payLegResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code payLeg}.
   *   <li>Then metaBean cmsLeg return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'payLeg'; then metaBean cmsLeg return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPayLeg_thenMetaBeanCmsLegReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedCms.meta().metaPropertyGet("payLeg");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ResolvedCmsLeg> cmsLegResult = ((Meta) metaBeanResult).cmsLeg();
    assertTrue(cmsLegResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("cmsLeg", cmsLegResult.name());
    assertEquals("payLeg", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, cmsLegResult.style());
    Class<ResolvedCms> expectedDeclaringTypeResult = ResolvedCms.class;
    assertEquals(expectedDeclaringTypeResult, cmsLegResult.declaringType());
    Class<ResolvedCmsLeg> expectedPropertyTypeResult = ResolvedCmsLeg.class;
    assertEquals(expectedPropertyTypeResult, cmsLegResult.propertyType());
    Class<ResolvedSwapLeg> expectedPropertyTypeResult2 = ResolvedSwapLeg.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).payLeg());
    assertSame(Meta.INSTANCE, cmsLegResult.metaBean());
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
    assertNull(ResolvedCms.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = ResolvedCms.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("cmsLeg");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("payLeg");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("cmsLeg", getResult.name());
    assertEquals("payLeg", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ResolvedCms> expectedDeclaringTypeResult = ResolvedCms.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ResolvedCms> expectedDeclaringTypeResult2 = ResolvedCms.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<ResolvedCmsLeg> expectedPropertyTypeResult = ResolvedCmsLeg.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ResolvedSwapLeg> expectedPropertyTypeResult2 = ResolvedSwapLeg.class;
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
    assertNull(ResolvedCms.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> ResolvedCms.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cmsLeg}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cmsLeg'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCmsLeg_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedCms.meta().propertySet(mock(Bean.class), "cmsLeg", "New Value", true));
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
        () -> ResolvedCms.meta().propertySet(mock(Bean.class), "cmsLeg", "New Value", false));
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
        () -> ResolvedCms.meta().propertySet(mock(Bean.class), "payLeg", "New Value", true));
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
        () -> ResolvedCms.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
