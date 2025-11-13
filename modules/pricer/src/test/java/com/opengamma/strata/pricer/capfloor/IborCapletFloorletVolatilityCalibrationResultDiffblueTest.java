package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilitiesTest.TestingIborCapletFloorletVolatilities;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilityCalibrationResult.Meta;
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

class IborCapletFloorletVolatilityCalibrationResultDiffblueTest {
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
    Class<? extends IborCapletFloorletVolatilityCalibrationResult> actualBeanTypeResult =
        IborCapletFloorletVolatilityCalibrationResult.meta().beanType();

    // Assert
    Class<IborCapletFloorletVolatilityCalibrationResult> expectedBeanTypeResult =
        IborCapletFloorletVolatilityCalibrationResult.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#chiSquare()}
   *   <li>{@link Meta#volatilities()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.chiSquare()", "MetaProperty Meta.volatilities()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = IborCapletFloorletVolatilityCalibrationResult.meta();

    // Act
    MetaProperty<Double> actualChiSquareResult = metaResult.chiSquare();

    // Assert
    assertTrue(actualChiSquareResult instanceof DirectMetaProperty);
    assertTrue(metaResult.volatilities() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean chiSquare return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean chiSquare return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanChiSquareReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletVolatilityCalibrationResult.meta().metaPropertyGet("volatilities");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> chiSquareResult = ((Meta) metaBeanResult).chiSquare();
    assertTrue(chiSquareResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("chiSquare", chiSquareResult.name());
    assertEquals("double", chiSquareResult.propertyType().getName());
    assertEquals("volatilities", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, chiSquareResult.style());
    Class<IborCapletFloorletVolatilities> expectedPropertyTypeResult =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<IborCapletFloorletVolatilityCalibrationResult> expectedDeclaringTypeResult =
        IborCapletFloorletVolatilityCalibrationResult.class;
    assertEquals(expectedDeclaringTypeResult, chiSquareResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).volatilities());
    assertSame(Meta.INSTANCE, chiSquareResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean volatilities return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean volatilities return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanVolatilitiesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        IborCapletFloorletVolatilityCalibrationResult.meta().metaPropertyGet("chiSquare");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilities> volatilitiesResult =
        ((Meta) metaBeanResult).volatilities();
    assertTrue(volatilitiesResult instanceof DirectMetaProperty);
    assertEquals("chiSquare", actualMetaPropertyGetResult.name());
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("volatilities", volatilitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, volatilitiesResult.style());
    Class<IborCapletFloorletVolatilities> expectedPropertyTypeResult =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedPropertyTypeResult, volatilitiesResult.propertyType());
    Class<IborCapletFloorletVolatilityCalibrationResult> expectedDeclaringTypeResult =
        IborCapletFloorletVolatilityCalibrationResult.class;
    assertEquals(expectedDeclaringTypeResult, volatilitiesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).chiSquare());
    assertSame(Meta.INSTANCE, volatilitiesResult.metaBean());
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
    assertNull(
        IborCapletFloorletVolatilityCalibrationResult.meta().metaPropertyGet("Property Name"));
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
        IborCapletFloorletVolatilityCalibrationResult.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("volatilities");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("chiSquare");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("chiSquare", getResult2.name());
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("volatilities", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<IborCapletFloorletVolatilities> expectedPropertyTypeResult =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<IborCapletFloorletVolatilityCalibrationResult> expectedDeclaringTypeResult =
        IborCapletFloorletVolatilityCalibrationResult.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<IborCapletFloorletVolatilityCalibrationResult> expectedDeclaringTypeResult2 =
        IborCapletFloorletVolatilityCalibrationResult.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange, Act and Assert
    assertNull(
        IborCapletFloorletVolatilityCalibrationResult.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code chiSquare}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'chiSquare'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenChiSquare_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletVolatilityCalibrationResult.meta()
                .propertySet(mock(Bean.class), "chiSquare", "New Value", true));
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
            IborCapletFloorletVolatilityCalibrationResult.meta()
                .propertySet(mock(Bean.class), "chiSquare", "New Value", false));
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
            IborCapletFloorletVolatilityCalibrationResult.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code volatilities}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'volatilities'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenVolatilities_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            IborCapletFloorletVolatilityCalibrationResult.meta()
                .propertySet(mock(Bean.class), "volatilities", "New Value", true));
  }

  /**
   * Test {@link
   * IborCapletFloorletVolatilityCalibrationResult#ofLeastSquare(IborCapletFloorletVolatilities,
   * double)}.
   *
   * <ul>
   *   <li>Then return ChiSquare is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * IborCapletFloorletVolatilityCalibrationResult#ofLeastSquare(IborCapletFloorletVolatilities,
   * double)}
   */
  @Test
  @DisplayName(
      "Test ofLeastSquare(IborCapletFloorletVolatilities, double); then return ChiSquare is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletVolatilityCalibrationResult IborCapletFloorletVolatilityCalibrationResult.ofLeastSquare(IborCapletFloorletVolatilities, double)"
  })
  void testOfLeastSquare_thenReturnChiSquareIsTen() {
    // Arrange
    TestingIborCapletFloorletVolatilities volatilities =
        new TestingIborCapletFloorletVolatilities();

    // Act
    IborCapletFloorletVolatilityCalibrationResult actualOfLeastSquareResult =
        IborCapletFloorletVolatilityCalibrationResult.ofLeastSquare(volatilities, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfLeastSquareResult.getChiSquare());
    assertSame(volatilities, actualOfLeastSquareResult.getVolatilities());
  }

  /**
   * Test {@link
   * IborCapletFloorletVolatilityCalibrationResult#ofRootFind(IborCapletFloorletVolatilities)}.
   *
   * <ul>
   *   <li>Then return ChiSquare is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * IborCapletFloorletVolatilityCalibrationResult#ofRootFind(IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName("Test ofRootFind(IborCapletFloorletVolatilities); then return ChiSquare is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapletFloorletVolatilityCalibrationResult IborCapletFloorletVolatilityCalibrationResult.ofRootFind(IborCapletFloorletVolatilities)"
  })
  void testOfRootFind_thenReturnChiSquareIsZero() {
    // Arrange
    TestingIborCapletFloorletVolatilities volatilities =
        new TestingIborCapletFloorletVolatilities();

    // Act
    IborCapletFloorletVolatilityCalibrationResult actualOfRootFindResult =
        IborCapletFloorletVolatilityCalibrationResult.ofRootFind(volatilities);

    // Assert
    assertEquals(0.0d, actualOfRootFindResult.getChiSquare());
    assertSame(volatilities, actualOfRootFindResult.getVolatilities());
  }

  /**
   * Test {@link IborCapletFloorletVolatilityCalibrationResult#meta()}.
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilityCalibrationResult#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta IborCapletFloorletVolatilityCalibrationResult.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = IborCapletFloorletVolatilityCalibrationResult.meta();

    // Assert
    MetaProperty<Double> chiSquareResult = actualMetaResult.chiSquare();
    assertTrue(chiSquareResult instanceof DirectMetaProperty);
    MetaProperty<IborCapletFloorletVolatilities> volatilitiesResult =
        actualMetaResult.volatilities();
    assertTrue(volatilitiesResult instanceof DirectMetaProperty);
    assertEquals("chiSquare", chiSquareResult.name());
    assertEquals("double", chiSquareResult.propertyType().getName());
    assertEquals("volatilities", volatilitiesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, chiSquareResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, volatilitiesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<IborCapletFloorletVolatilities> expectedPropertyTypeResult =
        IborCapletFloorletVolatilities.class;
    assertEquals(expectedPropertyTypeResult, volatilitiesResult.propertyType());
    Class<IborCapletFloorletVolatilityCalibrationResult> expectedDeclaringTypeResult =
        IborCapletFloorletVolatilityCalibrationResult.class;
    assertEquals(expectedDeclaringTypeResult, chiSquareResult.declaringType());
    Class<IborCapletFloorletVolatilityCalibrationResult> expectedDeclaringTypeResult2 =
        IborCapletFloorletVolatilityCalibrationResult.class;
    assertEquals(expectedDeclaringTypeResult2, volatilitiesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, chiSquareResult.metaBean());
    assertSame(meta, volatilitiesResult.metaBean());
  }
}
