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
import com.opengamma.strata.market.curve.CurveParameterSize.Meta;
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

class CurveParameterSizeDiffblueTest {
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
    Class<? extends CurveParameterSize> actualBeanTypeResult = CurveParameterSize.meta().beanType();

    // Assert
    Class<CurveParameterSize> expectedBeanTypeResult = CurveParameterSize.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#parameterCount()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.name()", "MetaProperty Meta.parameterCount()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CurveParameterSize.meta();

    // Act
    MetaProperty<CurveName> actualNameResult = metaResult.name();

    // Assert
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(metaResult.parameterCount() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean name return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean name return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanNameReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CurveParameterSize.meta().metaPropertyGet("parameterCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveName> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("name", nameResult.name());
    assertEquals("parameterCount", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, nameResult.style());
    Class<CurveName> expectedPropertyTypeResult = CurveName.class;
    assertEquals(expectedPropertyTypeResult, nameResult.propertyType());
    Class<CurveParameterSize> expectedDeclaringTypeResult = CurveParameterSize.class;
    assertEquals(expectedDeclaringTypeResult, nameResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameterCount());
    assertSame(Meta.INSTANCE, nameResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean parameterCount return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean parameterCount return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanParameterCountReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = CurveParameterSize.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> parameterCountResult = ((Meta) metaBeanResult).parameterCount();
    assertTrue(parameterCountResult instanceof DirectMetaProperty);
    assertEquals("int", parameterCountResult.propertyType().getName());
    assertEquals("name", actualMetaPropertyGetResult.name());
    assertEquals("parameterCount", parameterCountResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, parameterCountResult.style());
    Class<CurveName> expectedPropertyTypeResult = CurveName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CurveParameterSize> expectedDeclaringTypeResult = CurveParameterSize.class;
    assertEquals(expectedDeclaringTypeResult, parameterCountResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(Meta.INSTANCE, parameterCountResult.metaBean());
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
    assertNull(CurveParameterSize.meta().metaPropertyGet("Property Name"));
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
        CurveParameterSize.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("name");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("parameterCount");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("int", getResult2.propertyType().getName());
    assertEquals("name", getResult.name());
    assertEquals("parameterCount", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<CurveName> expectedPropertyTypeResult = CurveName.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<CurveParameterSize> expectedDeclaringTypeResult = CurveParameterSize.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<CurveParameterSize> expectedDeclaringTypeResult2 = CurveParameterSize.class;
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
    assertNull(CurveParameterSize.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = CurveParameterSize.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                CurveParameterSize.of(CurveName.of("Name"), 3), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnCurveNameWithName() {
    // Arrange
    Meta metaResult = CurveParameterSize.meta();
    CurveName name = CurveName.of("Name");

    // Act and Assert
    assertSame(name, metaResult.propertyGet(CurveParameterSize.of(name, 3), "name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameterCount}.
   *   <li>Then return intValue is three.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'parameterCount'; then return intValue is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenParameterCount_thenReturnIntValueIsThree() {
    // Arrange
    Meta metaResult = CurveParameterSize.meta();

    // Act and Assert
    assertEquals(
        3,
        ((Integer)
                metaResult.propertyGet(
                    CurveParameterSize.of(CurveName.of("Name"), 3), "parameterCount", true))
            .intValue());
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
        () -> CurveParameterSize.meta().propertySet(mock(Bean.class), "name", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CurveParameterSize.meta().propertySet(mock(Bean.class), "name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameterCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameterCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameterCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CurveParameterSize.meta()
                .propertySet(mock(Bean.class), "parameterCount", "New Value", true));
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
            CurveParameterSize.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link CurveParameterSize#of(CurveName, int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return ParameterCount is three.
   * </ul>
   *
   * <p>Method under test: {@link CurveParameterSize#of(CurveName, int)}
   */
  @Test
  @DisplayName("Test of(CurveName, int); when three; then return ParameterCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveParameterSize CurveParameterSize.of(CurveName, int)"})
  void testOf_whenThree_thenReturnParameterCountIsThree() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveParameterSize actualOfResult = CurveParameterSize.of(name, 3);

    // Assert
    assertEquals(3, actualOfResult.getParameterCount());
    assertSame(name, actualOfResult.getName());
  }

  /**
   * Test {@link CurveParameterSize#meta()}.
   *
   * <p>Method under test: {@link CurveParameterSize#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveParameterSize.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CurveParameterSize.meta();

    // Assert
    MetaProperty<CurveName> nameResult = actualMetaResult.name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Integer> parameterCountResult = actualMetaResult.parameterCount();
    assertTrue(parameterCountResult instanceof DirectMetaProperty);
    assertEquals("int", parameterCountResult.propertyType().getName());
    assertEquals("name", nameResult.name());
    assertEquals("parameterCount", parameterCountResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, nameResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, parameterCountResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurveName> expectedPropertyTypeResult = CurveName.class;
    assertEquals(expectedPropertyTypeResult, nameResult.propertyType());
    Class<CurveParameterSize> expectedDeclaringTypeResult = CurveParameterSize.class;
    assertEquals(expectedDeclaringTypeResult, nameResult.declaringType());
    Class<CurveParameterSize> expectedDeclaringTypeResult2 = CurveParameterSize.class;
    assertEquals(expectedDeclaringTypeResult2, parameterCountResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, nameResult.metaBean());
    assertSame(meta, parameterCountResult.metaBean());
  }

  /**
   * Test {@link CurveParameterSize#metaBean()}.
   *
   * <p>Method under test: {@link CurveParameterSize#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CurveParameterSize.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, CurveParameterSize.of(CurveName.of("Name"), 3).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveParameterSize#toString()}
   *   <li>{@link CurveParameterSize#getName()}
   *   <li>{@link CurveParameterSize#getParameterCount()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveName CurveParameterSize.getName()",
    "int CurveParameterSize.getParameterCount()",
    "String CurveParameterSize.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveName name = CurveName.of("Name");
    CurveParameterSize ofResult = CurveParameterSize.of(name, 3);

    // Act
    String actualToStringResult = ofResult.toString();
    CurveName actualName = ofResult.getName();

    // Assert
    assertEquals("CurveParameterSize{name=Name, parameterCount=3}", actualToStringResult);
    assertEquals(3, ofResult.getParameterCount());
    assertSame(name, actualName);
  }

  /**
   * Test {@link CurveParameterSize#equals(Object)}, and {@link CurveParameterSize#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveParameterSize#equals(Object)}
   *   <li>{@link CurveParameterSize#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParameterSize.equals(Object)",
    "int CurveParameterSize.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    CurveParameterSize ofResult = CurveParameterSize.of(CurveName.of("Name"), 3);
    CurveParameterSize ofResult2 = CurveParameterSize.of(CurveName.of("Name"), 3);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link CurveParameterSize#equals(Object)}, and {@link CurveParameterSize#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CurveParameterSize#equals(Object)}
   *   <li>{@link CurveParameterSize#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParameterSize.equals(Object)",
    "int CurveParameterSize.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    CurveParameterSize ofResult = CurveParameterSize.of(CurveName.of("Name"), 3);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link CurveParameterSize#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParameterSize#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParameterSize.equals(Object)",
    "int CurveParameterSize.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveParameterSize.of(CurveName.of("Name"), 3), 1);
  }

  /**
   * Test {@link CurveParameterSize#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParameterSize#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParameterSize.equals(Object)",
    "int CurveParameterSize.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CurveParameterSize ofResult = CurveParameterSize.of(CurveName.of("name"), 3);

    // Act and Assert
    assertNotEquals(ofResult, CurveParameterSize.of(CurveName.of("Name"), 3));
  }

  /**
   * Test {@link CurveParameterSize#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParameterSize#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParameterSize.equals(Object)",
    "int CurveParameterSize.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    CurveParameterSize ofResult = CurveParameterSize.of(CurveName.of("Name"), 1);

    // Act and Assert
    assertNotEquals(ofResult, CurveParameterSize.of(CurveName.of("Name"), 3));
  }

  /**
   * Test {@link CurveParameterSize#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParameterSize#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParameterSize.equals(Object)",
    "int CurveParameterSize.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurveParameterSize.of(CurveName.of("Name"), 3), null);
  }

  /**
   * Test {@link CurveParameterSize#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurveParameterSize#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean CurveParameterSize.equals(Object)",
    "int CurveParameterSize.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        CurveParameterSize.of(CurveName.of("Name"), 3), "Different type to CurveParameterSize");
  }
}
