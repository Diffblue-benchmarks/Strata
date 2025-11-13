package com.opengamma.strata.pricer.fxopt;

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
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.pricer.fxopt.VolatilityAndBucketedSensitivities.Meta;
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

class VolatilityAndBucketedSensitivitiesDiffblueTest {
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
    Class<? extends VolatilityAndBucketedSensitivities> actualBeanTypeResult =
        VolatilityAndBucketedSensitivities.meta().beanType();

    // Assert
    Class<VolatilityAndBucketedSensitivities> expectedBeanTypeResult =
        VolatilityAndBucketedSensitivities.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#sensitivities()}
   *   <li>{@link Meta#volatility()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.sensitivities()", "MetaProperty Meta.volatility()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = VolatilityAndBucketedSensitivities.meta();

    // Act
    MetaProperty<DoubleMatrix> actualSensitivitiesResult = metaResult.sensitivities();

    // Assert
    assertTrue(actualSensitivitiesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.volatility() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean sensitivities return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean sensitivities return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanSensitivitiesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        VolatilityAndBucketedSensitivities.meta().metaPropertyGet("volatility");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleMatrix> sensitivitiesResult = ((Meta) metaBeanResult).sensitivities();
    assertTrue(sensitivitiesResult instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("sensitivities", sensitivitiesResult.name());
    assertEquals("volatility", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sensitivitiesResult.style());
    Class<DoubleMatrix> expectedPropertyTypeResult = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult, sensitivitiesResult.propertyType());
    Class<VolatilityAndBucketedSensitivities> expectedDeclaringTypeResult =
        VolatilityAndBucketedSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, sensitivitiesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).volatility());
    assertSame(Meta.INSTANCE, sensitivitiesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean volatility return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean volatility return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanVolatilityReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        VolatilityAndBucketedSensitivities.meta().metaPropertyGet("sensitivities");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> volatilityResult = ((Meta) metaBeanResult).volatility();
    assertTrue(volatilityResult instanceof DirectMetaProperty);
    assertEquals("double", volatilityResult.propertyType().getName());
    assertEquals("sensitivities", actualMetaPropertyGetResult.name());
    assertEquals("volatility", volatilityResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, volatilityResult.style());
    Class<DoubleMatrix> expectedPropertyTypeResult = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<VolatilityAndBucketedSensitivities> expectedDeclaringTypeResult =
        VolatilityAndBucketedSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, volatilityResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivities());
    assertSame(Meta.INSTANCE, volatilityResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code bucket-name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'bucket-name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBucketName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(VolatilityAndBucketedSensitivities.meta().metaPropertyGet("bucket-name"));
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
        VolatilityAndBucketedSensitivities.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("volatility");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("sensitivities");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("sensitivities", getResult2.name());
    assertEquals("volatility", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<DoubleMatrix> expectedPropertyTypeResult = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<VolatilityAndBucketedSensitivities> expectedDeclaringTypeResult =
        VolatilityAndBucketedSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<VolatilityAndBucketedSensitivities> expectedDeclaringTypeResult2 =
        VolatilityAndBucketedSensitivities.class;
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
    assertNull(
        VolatilityAndBucketedSensitivities.meta()
            .propertyGet(mock(Bean.class), "bucket-name", true));
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
    Meta metaResult = VolatilityAndBucketedSensitivities.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of()),
                "bucket-name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'sensitivities'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSensitivities_thenReturnEmpty() {
    // Arrange
    Meta metaResult = VolatilityAndBucketedSensitivities.meta();
    VolatilityAndBucketedSensitivities bean =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "sensitivities", true);

    // Assert
    DoubleMatrix doubleMatrix = ((DoubleMatrix) actualPropertyGetResult).EMPTY;
    assertSame(doubleMatrix, bean.getSensitivities());
    assertSame(doubleMatrix, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code volatility}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'volatility'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenVolatility_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = VolatilityAndBucketedSensitivities.meta();
    VolatilityAndBucketedSensitivities bean =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act and Assert
    assertEquals(10.0d, ((Double) metaResult.propertyGet(bean, "volatility", true)).doubleValue());
    assertSame(DoubleMatrix.EMPTY, bean.getSensitivities());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code bucket-name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'bucket-name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBucketName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            VolatilityAndBucketedSensitivities.meta()
                .propertySet(mock(Bean.class), "bucket-name", "New Value", true));
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
            VolatilityAndBucketedSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivities}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivities'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivities_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            VolatilityAndBucketedSensitivities.meta()
                .propertySet(mock(Bean.class), "sensitivities", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code volatility}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'volatility'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenVolatility_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            VolatilityAndBucketedSensitivities.meta()
                .propertySet(mock(Bean.class), "volatility", "New Value", true));
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#of(double, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return Volatility is ten.
   * </ul>
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#of(double, DoubleMatrix)}
   */
  @Test
  @DisplayName("Test of(double, DoubleMatrix); when DoubleMatrix; then return Volatility is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "VolatilityAndBucketedSensitivities VolatilityAndBucketedSensitivities.of(double, DoubleMatrix)"
  })
  void testOf_whenDoubleMatrix_thenReturnVolatilityIsTen() {
    // Arrange and Act
    VolatilityAndBucketedSensitivities actualOfResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Assert
    assertEquals(10.0d, actualOfResult.getVolatility());
    assertSame(DoubleMatrix.EMPTY, actualOfResult.getSensitivities());
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#meta()}.
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta VolatilityAndBucketedSensitivities.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = VolatilityAndBucketedSensitivities.meta();

    // Assert
    MetaProperty<DoubleMatrix> sensitivitiesResult = actualMetaResult.sensitivities();
    assertTrue(sensitivitiesResult instanceof DirectMetaProperty);
    MetaProperty<Double> volatilityResult = actualMetaResult.volatility();
    assertTrue(volatilityResult instanceof DirectMetaProperty);
    assertEquals("double", volatilityResult.propertyType().getName());
    assertEquals("sensitivities", sensitivitiesResult.name());
    assertEquals("volatility", volatilityResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, sensitivitiesResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, volatilityResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<DoubleMatrix> expectedPropertyTypeResult = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult, sensitivitiesResult.propertyType());
    Class<VolatilityAndBucketedSensitivities> expectedDeclaringTypeResult =
        VolatilityAndBucketedSensitivities.class;
    assertEquals(expectedDeclaringTypeResult, sensitivitiesResult.declaringType());
    Class<VolatilityAndBucketedSensitivities> expectedDeclaringTypeResult2 =
        VolatilityAndBucketedSensitivities.class;
    assertEquals(expectedDeclaringTypeResult2, volatilityResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, sensitivitiesResult.metaBean());
    assertSame(meta, volatilityResult.metaBean());
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#metaBean()}.
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta VolatilityAndBucketedSensitivities.metaBean()"})
  void testMetaBean() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link VolatilityAndBucketedSensitivities#toString()}
   *   <li>{@link VolatilityAndBucketedSensitivities#getSensitivities()}
   *   <li>{@link VolatilityAndBucketedSensitivities#getVolatility()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix VolatilityAndBucketedSensitivities.getSensitivities()",
    "double VolatilityAndBucketedSensitivities.getVolatility()",
    "String VolatilityAndBucketedSensitivities.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act
    String actualToStringResult = ofResult.toString();
    DoubleMatrix actualSensitivities = ofResult.getSensitivities();

    // Assert
    assertEquals(
        "VolatilityAndBucketedSensitivities{volatility=10.0, sensitivities=}",
        actualToStringResult);
    assertEquals(10.0d, ofResult.getVolatility());
    assertSame(DoubleMatrix.EMPTY, actualSensitivities);
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#equals(Object)}, and {@link
   * VolatilityAndBucketedSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link VolatilityAndBucketedSensitivities#equals(Object)}
   *   <li>{@link VolatilityAndBucketedSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean VolatilityAndBucketedSensitivities.equals(Object)",
    "int VolatilityAndBucketedSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());
    VolatilityAndBucketedSensitivities ofResult2 =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#equals(Object)}, and {@link
   * VolatilityAndBucketedSensitivities#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link VolatilityAndBucketedSensitivities#equals(Object)}
   *   <li>{@link VolatilityAndBucketedSensitivities#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean VolatilityAndBucketedSensitivities.equals(Object)",
    "int VolatilityAndBucketedSensitivities.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean VolatilityAndBucketedSensitivities.equals(Object)",
    "int VolatilityAndBucketedSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean VolatilityAndBucketedSensitivities.equals(Object)",
    "int VolatilityAndBucketedSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(0.5d, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(ofResult, VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of()));
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean VolatilityAndBucketedSensitivities.equals(Object)",
    "int VolatilityAndBucketedSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.identity(3));

    // Act and Assert
    assertNotEquals(ofResult, VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of()));
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean VolatilityAndBucketedSensitivities.equals(Object)",
    "int VolatilityAndBucketedSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link VolatilityAndBucketedSensitivities#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link VolatilityAndBucketedSensitivities#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean VolatilityAndBucketedSensitivities.equals(Object)",
    "int VolatilityAndBucketedSensitivities.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    VolatilityAndBucketedSensitivities ofResult =
        VolatilityAndBucketedSensitivities.of(10.0d, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to VolatilityAndBucketedSensitivities");
  }
}
