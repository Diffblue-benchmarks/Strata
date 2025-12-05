package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.market.curve.JacobianCalibrationMatrix.Meta;
import java.util.ArrayList;
import java.util.List;
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

class JacobianCalibrationMatrixDiffblueTest {
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
    Class<? extends JacobianCalibrationMatrix> actualBeanTypeResult =
        JacobianCalibrationMatrix.meta().beanType();

    // Assert
    Class<JacobianCalibrationMatrix> expectedBeanTypeResult = JacobianCalibrationMatrix.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#jacobianMatrix()}
   *   <li>{@link Meta#order()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.jacobianMatrix()", "MetaProperty Meta.order()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = JacobianCalibrationMatrix.meta();

    // Act
    MetaProperty<DoubleMatrix> actualJacobianMatrixResult = metaResult.jacobianMatrix();

    // Assert
    assertTrue(actualJacobianMatrixResult instanceof DirectMetaProperty);
    assertTrue(metaResult.order() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean jacobianMatrix return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean jacobianMatrix return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanJacobianMatrixReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        JacobianCalibrationMatrix.meta().metaPropertyGet("order");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<DoubleMatrix> jacobianMatrixResult = ((Meta) metaBeanResult).jacobianMatrix();
    assertTrue(jacobianMatrixResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("jacobianMatrix", jacobianMatrixResult.name());
    assertEquals("order", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, jacobianMatrixResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, jacobianMatrixResult.propertyType());
    Class<JacobianCalibrationMatrix> expectedDeclaringTypeResult = JacobianCalibrationMatrix.class;
    assertEquals(expectedDeclaringTypeResult, jacobianMatrixResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).order());
    assertSame(Meta.INSTANCE, jacobianMatrixResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean order return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean order return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanOrderReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        JacobianCalibrationMatrix.meta().metaPropertyGet("jacobianMatrix");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<CurveParameterSize>> orderResult = ((Meta) metaBeanResult).order();
    assertTrue(orderResult instanceof DirectMetaProperty);
    assertEquals("jacobianMatrix", actualMetaPropertyGetResult.name());
    assertEquals("order", orderResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, orderResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, orderResult.propertyType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<JacobianCalibrationMatrix> expectedDeclaringTypeResult = JacobianCalibrationMatrix.class;
    assertEquals(expectedDeclaringTypeResult, orderResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).jacobianMatrix());
    assertSame(Meta.INSTANCE, orderResult.metaBean());
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
    assertNull(JacobianCalibrationMatrix.meta().metaPropertyGet("Property Name"));
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
        JacobianCalibrationMatrix.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("order");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("jacobianMatrix");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("jacobianMatrix", getResult2.name());
    assertEquals("order", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<JacobianCalibrationMatrix> expectedDeclaringTypeResult = JacobianCalibrationMatrix.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<JacobianCalibrationMatrix> expectedDeclaringTypeResult2 = JacobianCalibrationMatrix.class;
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
        JacobianCalibrationMatrix.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = JacobianCalibrationMatrix.meta();
    ArrayList<CurveParameterSize> order = new ArrayList<>();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                JacobianCalibrationMatrix.of(order, DoubleMatrix.of()), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code jacobianMatrix}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'jacobianMatrix'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenJacobianMatrix_thenReturnEmpty() {
    // Arrange
    Meta metaResult = JacobianCalibrationMatrix.meta();
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix bean = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "jacobianMatrix", true);

    // Assert
    DoubleMatrix doubleMatrix = ((DoubleMatrix) actualPropertyGetResult).EMPTY;
    assertSame(doubleMatrix, bean.getJacobianMatrix());
    assertSame(doubleMatrix, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code order}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'order'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenOrder_thenReturnList() {
    // Arrange
    Meta metaResult = JacobianCalibrationMatrix.meta();
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix bean = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "order", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
    assertSame(DoubleMatrix.EMPTY, bean.getJacobianMatrix());
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
            JacobianCalibrationMatrix.meta()
                .propertySet(mock(Bean.class), "jacobianMatrix", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code jacobianMatrix}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'jacobianMatrix'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenJacobianMatrix_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            JacobianCalibrationMatrix.meta()
                .propertySet(mock(Bean.class), "jacobianMatrix", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code order}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'order'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenOrder_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            JacobianCalibrationMatrix.meta()
                .propertySet(mock(Bean.class), "order", "New Value", true));
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
            JacobianCalibrationMatrix.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#of(List, DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with name is {@code order}.
   *   <li>Then return CurveCount is one.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#of(List, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test of(List, DoubleMatrix); given CurveName with name is 'order'; then return CurveCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"JacobianCalibrationMatrix JacobianCalibrationMatrix.of(List, DoubleMatrix)"})
  void testOf_givenCurveNameWithNameIsOrder_thenReturnCurveCountIsOne() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    CurveParameterSize ofResult = CurveParameterSize.of(CurveName.of("order"), 3);
    order.add(ofResult);

    // Act
    JacobianCalibrationMatrix actualOfResult =
        JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Assert
    assertEquals(1, actualOfResult.getCurveCount());
    ImmutableList<CurveParameterSize> order2 = actualOfResult.getOrder();
    assertEquals(1, order2.size());
    assertEquals(3, actualOfResult.getTotalParameterCount());
    assertSame(ofResult, order2.get(0));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#of(List, DoubleMatrix)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with name is {@code order}.
   *   <li>Then return CurveCount is two.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#of(List, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test of(List, DoubleMatrix); given CurveName with name is 'order'; then return CurveCount is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"JacobianCalibrationMatrix JacobianCalibrationMatrix.of(List, DoubleMatrix)"})
  void testOf_givenCurveNameWithNameIsOrder_thenReturnCurveCountIsTwo() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    order.add(CurveParameterSize.of(CurveName.of("order"), 3));
    CurveParameterSize ofResult = CurveParameterSize.of(CurveName.of("order"), 3);
    order.add(ofResult);

    // Act
    JacobianCalibrationMatrix actualOfResult =
        JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Assert
    assertEquals(2, actualOfResult.getCurveCount());
    ImmutableList<CurveParameterSize> order2 = actualOfResult.getOrder();
    assertEquals(2, order2.size());
    assertEquals(6, actualOfResult.getTotalParameterCount());
    assertSame(ofResult, order2.get(1));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#of(List, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return CurveCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#of(List, DoubleMatrix)}
   */
  @Test
  @DisplayName("Test of(List, DoubleMatrix); when ArrayList(); then return CurveCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"JacobianCalibrationMatrix JacobianCalibrationMatrix.of(List, DoubleMatrix)"})
  void testOf_whenArrayList_thenReturnCurveCountIsZero() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();

    // Act
    JacobianCalibrationMatrix actualOfResult =
        JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Assert
    assertEquals(0, actualOfResult.getCurveCount());
    assertEquals(0, actualOfResult.getTotalParameterCount());
    assertEquals(order, actualOfResult.getOrder());
    assertSame(DoubleMatrix.EMPTY, actualOfResult.getJacobianMatrix());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#getCurveCount()}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#getCurveCount()}
   */
  @Test
  @DisplayName("Test getCurveCount(); given CurveName with 'Name'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int JacobianCalibrationMatrix.getCurveCount()"})
  void testGetCurveCount_givenCurveNameWithName_thenReturnOne() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    order.add(CurveParameterSize.of(CurveName.of("Name"), 3));
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertEquals(1, ofResult.getCurveCount());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#getCurveCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#getCurveCount()}
   */
  @Test
  @DisplayName("Test getCurveCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int JacobianCalibrationMatrix.getCurveCount()"})
  void testGetCurveCount_thenReturnZero() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertEquals(0, ofResult.getCurveCount());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#getTotalParameterCount()}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return three.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#getTotalParameterCount()}
   */
  @Test
  @DisplayName("Test getTotalParameterCount(); given CurveName with 'Name'; then return three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int JacobianCalibrationMatrix.getTotalParameterCount()"})
  void testGetTotalParameterCount_givenCurveNameWithName_thenReturnThree() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    order.add(CurveParameterSize.of(CurveName.of("Name"), 3));
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertEquals(3, ofResult.getTotalParameterCount());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#getTotalParameterCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#getTotalParameterCount()}
   */
  @Test
  @DisplayName("Test getTotalParameterCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int JacobianCalibrationMatrix.getTotalParameterCount()"})
  void testGetTotalParameterCount_thenReturnZero() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertEquals(0, ofResult.getTotalParameterCount());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#containsCurve(CurveName)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#containsCurve(CurveName)}
   */
  @Test
  @DisplayName("Test containsCurve(CurveName); given CurveName with 'Name'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JacobianCalibrationMatrix.containsCurve(CurveName)"})
  void testContainsCurve_givenCurveNameWithName_thenReturnTrue() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    order.add(CurveParameterSize.of(CurveName.of("Name"), 3));
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertTrue(ofResult.containsCurve(CurveName.of("Name")));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#containsCurve(CurveName)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code name}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#containsCurve(CurveName)}
   */
  @Test
  @DisplayName("Test containsCurve(CurveName); given CurveName with 'name'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JacobianCalibrationMatrix.containsCurve(CurveName)"})
  void testContainsCurve_givenCurveNameWithName_thenReturnTrue2() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    order.add(CurveParameterSize.of(CurveName.of("name"), 3));
    order.add(CurveParameterSize.of(CurveName.of("Name"), 3));
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertTrue(ofResult.containsCurve(CurveName.of("Name")));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#containsCurve(CurveName)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#containsCurve(CurveName)}
   */
  @Test
  @DisplayName("Test containsCurve(CurveName); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean JacobianCalibrationMatrix.containsCurve(CurveName)"})
  void testContainsCurve_thenReturnFalse() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertFalse(ofResult.containsCurve(CurveName.of("Name")));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#splitValues(DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>When filled three.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#splitValues(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test splitValues(DoubleArray); given CurveName with 'Name'; when filled three; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map JacobianCalibrationMatrix.splitValues(DoubleArray)"})
  void testSplitValues_givenCurveNameWithName_whenFilledThree_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    order.add(CurveParameterSize.of(CurveName.of("Name"), 3));
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertEquals(1, ofResult.splitValues(DoubleArray.filled(3)).size());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#splitValues(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#splitValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test splitValues(DoubleArray); when DoubleArray; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map JacobianCalibrationMatrix.splitValues(DoubleArray)"})
  void testSplitValues_whenDoubleArray_thenReturnEmpty() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertTrue(ofResult.splitValues(DoubleArray.of()).isEmpty());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#meta()}.
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta JacobianCalibrationMatrix.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = JacobianCalibrationMatrix.meta();

    // Assert
    MetaProperty<DoubleMatrix> jacobianMatrixResult = actualMetaResult.jacobianMatrix();
    assertTrue(jacobianMatrixResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<CurveParameterSize>> orderResult = actualMetaResult.order();
    assertTrue(orderResult instanceof DirectMetaProperty);
    assertEquals("jacobianMatrix", jacobianMatrixResult.name());
    assertEquals("order", orderResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, jacobianMatrixResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, orderResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, orderResult.propertyType());
    Class<DoubleMatrix> expectedPropertyTypeResult2 = DoubleMatrix.class;
    assertEquals(expectedPropertyTypeResult2, jacobianMatrixResult.propertyType());
    Class<JacobianCalibrationMatrix> expectedDeclaringTypeResult = JacobianCalibrationMatrix.class;
    assertEquals(expectedDeclaringTypeResult, jacobianMatrixResult.declaringType());
    Class<JacobianCalibrationMatrix> expectedDeclaringTypeResult2 = JacobianCalibrationMatrix.class;
    assertEquals(expectedDeclaringTypeResult2, orderResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, jacobianMatrixResult.metaBean());
    assertSame(meta, orderResult.metaBean());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#metaBean()}.
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta JacobianCalibrationMatrix.metaBean()"})
  void testMetaBean() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link JacobianCalibrationMatrix#toString()}
   *   <li>{@link JacobianCalibrationMatrix#getJacobianMatrix()}
   *   <li>{@link JacobianCalibrationMatrix#getOrder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix JacobianCalibrationMatrix.getJacobianMatrix()",
    "ImmutableList JacobianCalibrationMatrix.getOrder()",
    "String JacobianCalibrationMatrix.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act
    String actualToStringResult = ofResult.toString();
    DoubleMatrix actualJacobianMatrix = ofResult.getJacobianMatrix();

    // Assert
    assertEquals("JacobianCalibrationMatrix{order=[], jacobianMatrix=}", actualToStringResult);
    assertTrue(ofResult.getOrder().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualJacobianMatrix);
  }

  /**
   * Test {@link JacobianCalibrationMatrix#equals(Object)}, and {@link
   * JacobianCalibrationMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link JacobianCalibrationMatrix#equals(Object)}
   *   <li>{@link JacobianCalibrationMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean JacobianCalibrationMatrix.equals(Object)",
    "int JacobianCalibrationMatrix.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());
    ArrayList<CurveParameterSize> order2 = new ArrayList<>();
    JacobianCalibrationMatrix ofResult2 = JacobianCalibrationMatrix.of(order2, DoubleMatrix.of());

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#equals(Object)}, and {@link
   * JacobianCalibrationMatrix#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link JacobianCalibrationMatrix#equals(Object)}
   *   <li>{@link JacobianCalibrationMatrix#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean JacobianCalibrationMatrix.equals(Object)",
    "int JacobianCalibrationMatrix.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link JacobianCalibrationMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean JacobianCalibrationMatrix.equals(Object)",
    "int JacobianCalibrationMatrix.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link JacobianCalibrationMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean JacobianCalibrationMatrix.equals(Object)",
    "int JacobianCalibrationMatrix.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    order.add(CurveParameterSize.of(CurveName.of("Name"), 3));
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());
    ArrayList<CurveParameterSize> order2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(ofResult, JacobianCalibrationMatrix.of(order2, DoubleMatrix.of()));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean JacobianCalibrationMatrix.equals(Object)",
    "int JacobianCalibrationMatrix.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult =
        JacobianCalibrationMatrix.of(order, DoubleMatrix.identity(3));
    ArrayList<CurveParameterSize> order2 = new ArrayList<>();

    // Act and Assert
    assertNotEquals(ofResult, JacobianCalibrationMatrix.of(order2, DoubleMatrix.of()));
  }

  /**
   * Test {@link JacobianCalibrationMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean JacobianCalibrationMatrix.equals(Object)",
    "int JacobianCalibrationMatrix.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link JacobianCalibrationMatrix#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link JacobianCalibrationMatrix#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean JacobianCalibrationMatrix.equals(Object)",
    "int JacobianCalibrationMatrix.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    ArrayList<CurveParameterSize> order = new ArrayList<>();
    JacobianCalibrationMatrix ofResult = JacobianCalibrationMatrix.of(order, DoubleMatrix.of());

    // Act and Assert
    assertNotEquals(ofResult, "Different type to JacobianCalibrationMatrix");
  }
}
