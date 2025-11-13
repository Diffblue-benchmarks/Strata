package com.opengamma.strata.product.option;

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
import com.opengamma.strata.product.option.SimpleConstantContinuousBarrier.Meta;
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

class SimpleConstantContinuousBarrierDiffblueTest {
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
    Class<? extends SimpleConstantContinuousBarrier> actualBeanTypeResult =
        SimpleConstantContinuousBarrier.meta().beanType();

    // Assert
    Class<SimpleConstantContinuousBarrier> expectedBeanTypeResult =
        SimpleConstantContinuousBarrier.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#barrierLevel()}
   *   <li>{@link Meta#barrierType()}
   *   <li>{@link Meta#knockType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.barrierLevel()",
    "MetaProperty Meta.barrierType()",
    "MetaProperty Meta.knockType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SimpleConstantContinuousBarrier.meta();

    // Act
    MetaProperty<Double> actualBarrierLevelResult = metaResult.barrierLevel();
    MetaProperty<BarrierType> actualBarrierTypeResult = metaResult.barrierType();

    // Assert
    assertTrue(actualBarrierLevelResult instanceof DirectMetaProperty);
    assertTrue(actualBarrierTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.knockType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code barrierLevel}.
   *   <li>Then return name is {@code barrierLevel}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'barrierLevel'; then return name is 'barrierLevel'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBarrierLevel_thenReturnNameIsBarrierLevel() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleConstantContinuousBarrier.meta().metaPropertyGet("barrierLevel");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BarrierType> barrierTypeResult = ((Meta) metaBeanResult).barrierType();
    assertTrue(barrierTypeResult instanceof DirectMetaProperty);
    MetaProperty<KnockType> knockTypeResult = ((Meta) metaBeanResult).knockType();
    assertTrue(knockTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("barrierLevel", actualMetaPropertyGetResult.name());
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).barrierLevel());
    assertSame(metaBeanResult, barrierTypeResult.metaBean());
    assertSame(metaBeanResult, knockTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code barrierType}.
   *   <li>Then return name is {@code barrierType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'barrierType'; then return name is 'barrierType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBarrierType_thenReturnNameIsBarrierType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleConstantContinuousBarrier.meta().metaPropertyGet("barrierType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> barrierLevelResult = ((Meta) metaBeanResult).barrierLevel();
    assertTrue(barrierLevelResult instanceof DirectMetaProperty);
    MetaProperty<KnockType> knockTypeResult = ((Meta) metaBeanResult).knockType();
    assertTrue(knockTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("barrierType", actualMetaPropertyGetResult.name());
    Class<BarrierType> expectedPropertyTypeResult = BarrierType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).barrierType());
    assertSame(metaBeanResult, barrierLevelResult.metaBean());
    assertSame(metaBeanResult, knockTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code knockType}.
   *   <li>Then return name is {@code knockType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'knockType'; then return name is 'knockType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenKnockType_thenReturnNameIsKnockType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SimpleConstantContinuousBarrier.meta().metaPropertyGet("knockType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> barrierLevelResult = ((Meta) metaBeanResult).barrierLevel();
    assertTrue(barrierLevelResult instanceof DirectMetaProperty);
    MetaProperty<BarrierType> barrierTypeResult = ((Meta) metaBeanResult).barrierType();
    assertTrue(barrierTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("knockType", actualMetaPropertyGetResult.name());
    Class<KnockType> expectedPropertyTypeResult = KnockType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).knockType());
    assertSame(metaBeanResult, barrierLevelResult.metaBean());
    assertSame(metaBeanResult, barrierTypeResult.metaBean());
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
    assertNull(SimpleConstantContinuousBarrier.meta().metaPropertyGet("Property Name"));
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
        SimpleConstantContinuousBarrier.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("barrierType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("barrierLevel");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("knockType");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("barrierLevel", getResult2.name());
    assertEquals("barrierType", getResult.name());
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("knockType", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<BarrierType> expectedPropertyTypeResult = BarrierType.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<KnockType> expectedPropertyTypeResult2 = KnockType.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<SimpleConstantContinuousBarrier> expectedDeclaringTypeResult =
        SimpleConstantContinuousBarrier.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SimpleConstantContinuousBarrier> expectedDeclaringTypeResult2 =
        SimpleConstantContinuousBarrier.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<SimpleConstantContinuousBarrier> expectedDeclaringTypeResult3 =
        SimpleConstantContinuousBarrier.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult3.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code barrierLevel}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'barrierLevel'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBarrierLevel_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = SimpleConstantContinuousBarrier.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d),
                    "barrierLevel",
                    true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code barrierType}.
   *   <li>Then return {@link BarrierType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'barrierType'; then return BarrierType")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBarrierType_thenReturnBarrierType() {
    // Arrange
    Meta metaResult = SimpleConstantContinuousBarrier.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d),
            "barrierType",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof BarrierType);
    assertEquals(BarrierType.DOWN, actualPropertyGetResult);
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
        SimpleConstantContinuousBarrier.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = SimpleConstantContinuousBarrier.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code knockType}.
   *   <li>Then return {@link KnockType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'knockType'; then return KnockType")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenKnockType_thenReturnKnockType() {
    // Arrange
    Meta metaResult = SimpleConstantContinuousBarrier.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d),
            "knockType",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof KnockType);
    assertEquals(KnockType.KNOCK_IN, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code barrierLevel}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'barrierLevel'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBarrierLevel_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleConstantContinuousBarrier.meta()
                .propertySet(mock(Bean.class), "barrierLevel", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code barrierType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'barrierType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBarrierType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleConstantContinuousBarrier.meta()
                .propertySet(mock(Bean.class), "barrierType", "New Value", true));
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
            SimpleConstantContinuousBarrier.meta()
                .propertySet(mock(Bean.class), "barrierLevel", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code knockType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'knockType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenKnockType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SimpleConstantContinuousBarrier.meta()
                .propertySet(mock(Bean.class), "knockType", "New Value", true));
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
            SimpleConstantContinuousBarrier.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#of(BarrierType, KnockType, double)}.
   *
   * <ul>
   *   <li>When {@code DOWN}.
   *   <li>Then return BarrierLevel is ten.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#of(BarrierType, KnockType,
   * double)}
   */
  @Test
  @DisplayName(
      "Test of(BarrierType, KnockType, double); when 'DOWN'; then return BarrierLevel is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SimpleConstantContinuousBarrier SimpleConstantContinuousBarrier.of(BarrierType, KnockType, double)"
  })
  void testOf_whenDown_thenReturnBarrierLevelIsTen() {
    // Arrange and Act
    SimpleConstantContinuousBarrier actualOfResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getBarrierLevel());
    assertEquals(BarrierType.DOWN, actualOfResult.getBarrierType());
    assertEquals(KnockType.KNOCK_IN, actualOfResult.getKnockType());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#getBarrierLevel(LocalDate)} with {@code LocalDate}.
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#getBarrierLevel(LocalDate)}
   */
  @Test
  @DisplayName("Test getBarrierLevel(LocalDate) with 'LocalDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SimpleConstantContinuousBarrier.getBarrierLevel(LocalDate)"})
  void testGetBarrierLevelWithLocalDate() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.getBarrierLevel(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleConstantContinuousBarrier#toString()}
   *   <li>{@link SimpleConstantContinuousBarrier#getBarrierLevel()}
   *   <li>{@link SimpleConstantContinuousBarrier#getBarrierType()}
   *   <li>{@link SimpleConstantContinuousBarrier#getKnockType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SimpleConstantContinuousBarrier.getBarrierLevel()",
    "BarrierType SimpleConstantContinuousBarrier.getBarrierType()",
    "KnockType SimpleConstantContinuousBarrier.getKnockType()",
    "String SimpleConstantContinuousBarrier.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act
    String actualToStringResult = ofResult.toString();
    double actualBarrierLevel = ofResult.getBarrierLevel();
    BarrierType actualBarrierType = ofResult.getBarrierType();

    // Assert
    assertEquals(
        "SimpleConstantContinuousBarrier{barrierType=Down, knockType=KnockIn, barrierLevel=10.0}",
        actualToStringResult);
    assertEquals(10.0d, actualBarrierLevel);
    assertEquals(BarrierType.DOWN, actualBarrierType);
    assertEquals(KnockType.KNOCK_IN, ofResult.getKnockType());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#inverseKnockType()}.
   *
   * <ul>
   *   <li>Then return KnockType is {@code KNOCK_IN}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#inverseKnockType()}
   */
  @Test
  @DisplayName("Test inverseKnockType(); then return KnockType is 'KNOCK_IN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SimpleConstantContinuousBarrier SimpleConstantContinuousBarrier.inverseKnockType()"
  })
  void testInverseKnockType_thenReturnKnockTypeIsKnockIn() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 10.0d);

    // Act
    SimpleConstantContinuousBarrier actualInverseKnockTypeResult = ofResult.inverseKnockType();

    // Assert
    assertEquals(10.0d, actualInverseKnockTypeResult.getBarrierLevel());
    assertEquals(BarrierType.DOWN, actualInverseKnockTypeResult.getBarrierType());
    assertEquals(KnockType.KNOCK_IN, actualInverseKnockTypeResult.getKnockType());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#inverseKnockType()}.
   *
   * <ul>
   *   <li>Then return KnockType is {@code KNOCK_OUT}.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#inverseKnockType()}
   */
  @Test
  @DisplayName("Test inverseKnockType(); then return KnockType is 'KNOCK_OUT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SimpleConstantContinuousBarrier SimpleConstantContinuousBarrier.inverseKnockType()"
  })
  void testInverseKnockType_thenReturnKnockTypeIsKnockOut() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act
    SimpleConstantContinuousBarrier actualInverseKnockTypeResult = ofResult.inverseKnockType();

    // Assert
    assertEquals(10.0d, actualInverseKnockTypeResult.getBarrierLevel());
    assertEquals(BarrierType.DOWN, actualInverseKnockTypeResult.getBarrierType());
    assertEquals(KnockType.KNOCK_OUT, actualInverseKnockTypeResult.getKnockType());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#meta()}.
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleConstantContinuousBarrier.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SimpleConstantContinuousBarrier.meta();

    // Assert
    MetaProperty<Double> barrierLevelResult = actualMetaResult.barrierLevel();
    assertTrue(barrierLevelResult instanceof DirectMetaProperty);
    MetaProperty<BarrierType> barrierTypeResult = actualMetaResult.barrierType();
    assertTrue(barrierTypeResult instanceof DirectMetaProperty);
    MetaProperty<KnockType> knockTypeResult = actualMetaResult.knockType();
    assertTrue(knockTypeResult instanceof DirectMetaProperty);
    assertEquals("barrierLevel", barrierLevelResult.name());
    assertEquals("barrierType", barrierTypeResult.name());
    assertEquals("double", barrierLevelResult.propertyType().getName());
    assertEquals("knockType", knockTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, barrierLevelResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, barrierTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, knockTypeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<BarrierType> expectedPropertyTypeResult = BarrierType.class;
    assertEquals(expectedPropertyTypeResult, barrierTypeResult.propertyType());
    Class<KnockType> expectedPropertyTypeResult2 = KnockType.class;
    assertEquals(expectedPropertyTypeResult2, knockTypeResult.propertyType());
    Class<SimpleConstantContinuousBarrier> expectedDeclaringTypeResult =
        SimpleConstantContinuousBarrier.class;
    assertEquals(expectedDeclaringTypeResult, barrierLevelResult.declaringType());
    Class<SimpleConstantContinuousBarrier> expectedDeclaringTypeResult2 =
        SimpleConstantContinuousBarrier.class;
    assertEquals(expectedDeclaringTypeResult2, barrierTypeResult.declaringType());
    Class<SimpleConstantContinuousBarrier> expectedDeclaringTypeResult3 =
        SimpleConstantContinuousBarrier.class;
    assertEquals(expectedDeclaringTypeResult3, knockTypeResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, barrierLevelResult.metaBean());
    assertSame(meta, barrierTypeResult.metaBean());
    assertSame(meta, knockTypeResult.metaBean());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#metaBean()}.
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SimpleConstantContinuousBarrier.metaBean()"})
  void testMetaBean() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}, and {@link
   * SimpleConstantContinuousBarrier#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleConstantContinuousBarrier#equals(Object)}
   *   <li>{@link SimpleConstantContinuousBarrier#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);
    SimpleConstantContinuousBarrier ofResult2 =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}, and {@link
   * SimpleConstantContinuousBarrier#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleConstantContinuousBarrier#equals(Object)}
   *   <li>{@link SimpleConstantContinuousBarrier#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult, SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d));
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 10.0d);

    // Act and Assert
    assertNotEquals(
        ofResult, SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d));
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d);

    // Act and Assert
    assertNotEquals(
        ofResult, SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d));
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link SimpleConstantContinuousBarrier#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConstantContinuousBarrier#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConstantContinuousBarrier.equals(Object)",
    "int SimpleConstantContinuousBarrier.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SimpleConstantContinuousBarrier ofResult =
        SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to SimpleConstantContinuousBarrier");
  }
}
