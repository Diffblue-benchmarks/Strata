package com.opengamma.strata.pricer.impl.tree;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.impl.tree.ConstantContinuousSingleBarrierKnockoutFunction.Meta;
import com.opengamma.strata.product.option.BarrierType;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConstantContinuousSingleBarrierKnockoutFunctionDiffblueTest {
  /**
   * Test {@link ConstantContinuousSingleBarrierKnockoutFunction#meta()}.
   *
   * <p>Method under test: {@link ConstantContinuousSingleBarrierKnockoutFunction#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantContinuousSingleBarrierKnockoutFunction.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ConstantContinuousSingleBarrierKnockoutFunction.meta();

    // Assert
    assertTrue(actualMetaResult.barrierLevel() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.barrierType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.rebate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sign() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strike() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeToExpiry() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
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
    Class<? extends ConstantContinuousSingleBarrierKnockoutFunction> actualBeanTypeResult =
        ConstantContinuousSingleBarrierKnockoutFunction.meta().beanType();

    // Assert
    Class<ConstantContinuousSingleBarrierKnockoutFunction> expectedBeanTypeResult =
        ConstantContinuousSingleBarrierKnockoutFunction.class;
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
   *   <li>{@link Meta#numberOfSteps()}
   *   <li>{@link Meta#rebate()}
   *   <li>{@link Meta#sign()}
   *   <li>{@link Meta#strike()}
   *   <li>{@link Meta#timeToExpiry()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.barrierLevel()",
    "MetaProperty Meta.barrierType()",
    "MetaProperty Meta.numberOfSteps()",
    "MetaProperty Meta.rebate()",
    "MetaProperty Meta.sign()",
    "MetaProperty Meta.strike()",
    "MetaProperty Meta.timeToExpiry()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ConstantContinuousSingleBarrierKnockoutFunction.meta();

    // Act
    MetaProperty<Double> actualBarrierLevelResult = metaResult.barrierLevel();
    MetaProperty<BarrierType> actualBarrierTypeResult = metaResult.barrierType();
    MetaProperty<Integer> actualNumberOfStepsResult = metaResult.numberOfSteps();
    MetaProperty<DoubleArray> actualRebateResult = metaResult.rebate();
    MetaProperty<Double> actualSignResult = metaResult.sign();
    MetaProperty<Double> actualStrikeResult = metaResult.strike();

    // Assert
    assertTrue(actualBarrierLevelResult instanceof DirectMetaProperty);
    assertTrue(actualBarrierTypeResult instanceof DirectMetaProperty);
    assertTrue(actualNumberOfStepsResult instanceof DirectMetaProperty);
    assertTrue(actualRebateResult instanceof DirectMetaProperty);
    assertTrue(actualSignResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.timeToExpiry() instanceof DirectMetaProperty);
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
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("barrierLevel");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).barrierType() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rebate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sign() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeToExpiry() instanceof DirectMetaProperty);
    assertEquals("barrierLevel", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).barrierLevel());
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
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("barrierType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).barrierLevel() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rebate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sign() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeToExpiry() instanceof DirectMetaProperty);
    assertEquals("barrierType", actualMetaPropertyGetResult.name());
    Class<BarrierType> expectedPropertyTypeResult = BarrierType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).barrierType());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code numberOfSteps}.
   *   <li>Then return propertyType Name is {@code int}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'numberOfSteps'; then return propertyType Name is 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNumberOfSteps_thenReturnPropertyTypeNameIsInt() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("numberOfSteps");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).barrierLevel() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).barrierType() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rebate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sign() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeToExpiry() instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("numberOfSteps", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).numberOfSteps());
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
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code rebate}.
   *   <li>Then return name is {@code rebate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'rebate'; then return name is 'rebate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRebate_thenReturnNameIsRebate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("rebate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).barrierLevel() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).barrierType() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sign() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeToExpiry() instanceof DirectMetaProperty);
    assertEquals("rebate", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rebate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code sign}.
   *   <li>Then return name is {@code sign}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'sign'; then return name is 'sign'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSign_thenReturnNameIsSign() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("sign");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).barrierLevel() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).barrierType() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rebate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeToExpiry() instanceof DirectMetaProperty);
    assertEquals("sign", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sign());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return name is {@code strike}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'strike'; then return name is 'strike'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStrike_thenReturnNameIsStrike() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).barrierLevel() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).barrierType() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rebate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sign() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeToExpiry() instanceof DirectMetaProperty);
    assertEquals("strike", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code timeToExpiry}.
   *   <li>Then return name is {@code timeToExpiry}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'timeToExpiry'; then return name is 'timeToExpiry'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTimeToExpiry_thenReturnNameIsTimeToExpiry() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyGet("timeToExpiry");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).barrierLevel() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).barrierType() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).rebate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sign() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strike() instanceof DirectMetaProperty);
    assertEquals("timeToExpiry", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeToExpiry());
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
        ConstantContinuousSingleBarrierKnockoutFunction.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("barrierLevel") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("barrierType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("numberOfSteps") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rebate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("sign") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strike") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("timeToExpiry") instanceof DirectMetaProperty);
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
        ConstantContinuousSingleBarrierKnockoutFunction.meta()
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
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
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
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
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
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
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertySet(mock(Bean.class), "barrierLevel", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code numberOfSteps}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'numberOfSteps'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNumberOfSteps_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertySet(mock(Bean.class), "numberOfSteps", "New Value", true));
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
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rebate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rebate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRebate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertySet(mock(Bean.class), "rebate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sign}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sign'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSign_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertySet(mock(Bean.class), "sign", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strike'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrike_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertySet(mock(Bean.class), "strike", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeToExpiry}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'timeToExpiry'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTimeToExpiry_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ConstantContinuousSingleBarrierKnockoutFunction.meta()
                .propertySet(mock(Bean.class), "timeToExpiry", "New Value", true));
  }
}
