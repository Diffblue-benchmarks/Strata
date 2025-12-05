package com.opengamma.strata.pricer.impl.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.impl.tree.EuropeanVanillaOptionFunction.Meta;
import com.opengamma.strata.product.common.PutCall;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EuropeanVanillaOptionFunctionDiffblueTest {
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
    Class<? extends EuropeanVanillaOptionFunction> actualBeanTypeResult =
        EuropeanVanillaOptionFunction.meta().beanType();

    // Assert
    Class<EuropeanVanillaOptionFunction> expectedBeanTypeResult =
        EuropeanVanillaOptionFunction.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#numberOfSteps()}
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
    "MetaProperty Meta.numberOfSteps()",
    "MetaProperty Meta.sign()",
    "MetaProperty Meta.strike()",
    "MetaProperty Meta.timeToExpiry()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = EuropeanVanillaOptionFunction.meta();

    // Act
    MetaProperty<Integer> actualNumberOfStepsResult = metaResult.numberOfSteps();
    MetaProperty<Double> actualSignResult = metaResult.sign();
    MetaProperty<Double> actualStrikeResult = metaResult.strike();

    // Assert
    assertTrue(actualNumberOfStepsResult instanceof DirectMetaProperty);
    assertTrue(actualSignResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.timeToExpiry() instanceof DirectMetaProperty);
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
        EuropeanVanillaOptionFunction.meta().metaPropertyGet("numberOfSteps");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> signResult = ((Meta) metaBeanResult).sign();
    assertTrue(signResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> timeToExpiryResult = ((Meta) metaBeanResult).timeToExpiry();
    assertTrue(timeToExpiryResult instanceof DirectMetaProperty);
    assertEquals("int", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("numberOfSteps", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).numberOfSteps());
    assertSame(metaBeanResult, signResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, timeToExpiryResult.metaBean());
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
    assertNull(EuropeanVanillaOptionFunction.meta().metaPropertyGet("Property Name"));
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
        EuropeanVanillaOptionFunction.meta().metaPropertyGet("sign");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> numberOfStepsResult = ((Meta) metaBeanResult).numberOfSteps();
    assertTrue(numberOfStepsResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    MetaProperty<Double> timeToExpiryResult = ((Meta) metaBeanResult).timeToExpiry();
    assertTrue(timeToExpiryResult instanceof DirectMetaProperty);
    assertEquals("sign", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sign());
    assertSame(metaBeanResult, numberOfStepsResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
    assertSame(metaBeanResult, timeToExpiryResult.metaBean());
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
        EuropeanVanillaOptionFunction.meta().metaPropertyGet("strike");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> numberOfStepsResult = ((Meta) metaBeanResult).numberOfSteps();
    assertTrue(numberOfStepsResult instanceof DirectMetaProperty);
    MetaProperty<Double> signResult = ((Meta) metaBeanResult).sign();
    assertTrue(signResult instanceof DirectMetaProperty);
    MetaProperty<Double> timeToExpiryResult = ((Meta) metaBeanResult).timeToExpiry();
    assertTrue(timeToExpiryResult instanceof DirectMetaProperty);
    assertEquals("strike", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strike());
    assertSame(metaBeanResult, numberOfStepsResult.metaBean());
    assertSame(metaBeanResult, signResult.metaBean());
    assertSame(metaBeanResult, timeToExpiryResult.metaBean());
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
        EuropeanVanillaOptionFunction.meta().metaPropertyGet("timeToExpiry");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Integer> numberOfStepsResult = ((Meta) metaBeanResult).numberOfSteps();
    assertTrue(numberOfStepsResult instanceof DirectMetaProperty);
    MetaProperty<Double> signResult = ((Meta) metaBeanResult).sign();
    assertTrue(signResult instanceof DirectMetaProperty);
    MetaProperty<Double> strikeResult = ((Meta) metaBeanResult).strike();
    assertTrue(strikeResult instanceof DirectMetaProperty);
    assertEquals("timeToExpiry", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeToExpiry());
    assertSame(metaBeanResult, numberOfStepsResult.metaBean());
    assertSame(metaBeanResult, signResult.metaBean());
    assertSame(metaBeanResult, strikeResult.metaBean());
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
        EuropeanVanillaOptionFunction.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("numberOfSteps") instanceof DirectMetaProperty);
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
        EuropeanVanillaOptionFunction.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = EuropeanVanillaOptionFunction.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code numberOfSteps}.
   *   <li>Then return intValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'numberOfSteps'; then return intValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenNumberOfSteps_thenReturnIntValueIsTen() {
    // Arrange
    Meta metaResult = EuropeanVanillaOptionFunction.meta();

    // Act and Assert
    assertEquals(
        10,
        ((Integer)
                metaResult.propertyGet(
                    EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10),
                    "numberOfSteps",
                    true))
            .intValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code sign}.
   *   <li>Then return doubleValue is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'sign'; then return doubleValue is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSign_thenReturnDoubleValueIsMinusOne() {
    // Arrange
    Meta metaResult = EuropeanVanillaOptionFunction.meta();

    // Act and Assert
    assertEquals(
        -1.0d,
        ((Double)
                metaResult.propertyGet(
                    EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10), "sign", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code strike}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'strike'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenStrike_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = EuropeanVanillaOptionFunction.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10),
                    "strike",
                    true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code timeToExpiry}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'timeToExpiry'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTimeToExpiry_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = EuropeanVanillaOptionFunction.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10),
                    "timeToExpiry",
                    true))
            .doubleValue());
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
            EuropeanVanillaOptionFunction.meta()
                .propertySet(mock(Bean.class), "numberOfSteps", "New Value", false));
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
            EuropeanVanillaOptionFunction.meta()
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
            EuropeanVanillaOptionFunction.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
            EuropeanVanillaOptionFunction.meta()
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
            EuropeanVanillaOptionFunction.meta()
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
            EuropeanVanillaOptionFunction.meta()
                .propertySet(mock(Bean.class), "timeToExpiry", "New Value", true));
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#of(double, double, PutCall, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return NumberOfSteps is one.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#of(double, double, PutCall, int)}
   */
  @Test
  @DisplayName("Test of(double, double, PutCall, int); when one; then return NumberOfSteps is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "EuropeanVanillaOptionFunction EuropeanVanillaOptionFunction.of(double, double, PutCall, int)"
  })
  void testOf_whenOne_thenReturnNumberOfStepsIsOne() {
    // Arrange and Act
    EuropeanVanillaOptionFunction actualOfResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.CALL, 1);

    // Assert
    assertEquals(1, actualOfResult.getNumberOfSteps());
    assertEquals(1.0d, actualOfResult.getSign());
    assertEquals(10.0d, actualOfResult.getStrike());
    assertEquals(10.0d, actualOfResult.getTimeToExpiry());
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#of(double, double, PutCall, int)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return Sign is minus one.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#of(double, double, PutCall, int)}
   */
  @Test
  @DisplayName("Test of(double, double, PutCall, int); when 'PUT'; then return Sign is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "EuropeanVanillaOptionFunction EuropeanVanillaOptionFunction.of(double, double, PutCall, int)"
  })
  void testOf_whenPut_thenReturnSignIsMinusOne() {
    // Arrange and Act
    EuropeanVanillaOptionFunction actualOfResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);

    // Assert
    assertEquals(-1.0d, actualOfResult.getSign());
    assertEquals(10, actualOfResult.getNumberOfSteps());
    assertEquals(10.0d, actualOfResult.getStrike());
    assertEquals(10.0d, actualOfResult.getTimeToExpiry());
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#getPayoffAtExpiryTrinomial(DoubleArray)} with {@code
   * stateValue}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * EuropeanVanillaOptionFunction#getPayoffAtExpiryTrinomial(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getPayoffAtExpiryTrinomial(DoubleArray) with 'stateValue'; when DoubleArray; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray EuropeanVanillaOptionFunction.getPayoffAtExpiryTrinomial(DoubleArray)"
  })
  void testGetPayoffAtExpiryTrinomialWithStateValue_whenDoubleArray_thenReturnEmpty() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, ofResult.getPayoffAtExpiryTrinomial(DoubleArray.of()));
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#getPayoffAtExpiryTrinomial(DoubleArray)} with {@code
   * stateValue}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * EuropeanVanillaOptionFunction#getPayoffAtExpiryTrinomial(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test getPayoffAtExpiryTrinomial(DoubleArray) with 'stateValue'; when filled three; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray EuropeanVanillaOptionFunction.getPayoffAtExpiryTrinomial(DoubleArray)"
  })
  void testGetPayoffAtExpiryTrinomialWithStateValue_whenFilledThree_thenReturnMaxIsTen() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);

    // Act
    DoubleArray actualPayoffAtExpiryTrinomial =
        ofResult.getPayoffAtExpiryTrinomial(DoubleArray.filled(3));

    // Assert
    assertEquals(10.0d, actualPayoffAtExpiryTrinomial.max());
    assertEquals(10.0d, actualPayoffAtExpiryTrinomial.min());
    List<Double> toListResult = actualPayoffAtExpiryTrinomial.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualPayoffAtExpiryTrinomial.size());
    assertEquals(30.0d, actualPayoffAtExpiryTrinomial.sum());
    assertFalse(actualPayoffAtExpiryTrinomial.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d}, actualPayoffAtExpiryTrinomial.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#meta()}.
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta EuropeanVanillaOptionFunction.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = EuropeanVanillaOptionFunction.meta();

    // Assert
    assertTrue(actualMetaResult.numberOfSteps() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sign() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.strike() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.timeToExpiry() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#metaBean()}.
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta EuropeanVanillaOptionFunction.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE, EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EuropeanVanillaOptionFunction#toString()}
   *   <li>{@link EuropeanVanillaOptionFunction#getNumberOfSteps()}
   *   <li>{@link EuropeanVanillaOptionFunction#getSign()}
   *   <li>{@link EuropeanVanillaOptionFunction#getStrike()}
   *   <li>{@link EuropeanVanillaOptionFunction#getTimeToExpiry()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int EuropeanVanillaOptionFunction.getNumberOfSteps()",
    "double EuropeanVanillaOptionFunction.getSign()",
    "double EuropeanVanillaOptionFunction.getStrike()",
    "double EuropeanVanillaOptionFunction.getTimeToExpiry()",
    "String EuropeanVanillaOptionFunction.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);

    // Act
    String actualToStringResult = ofResult.toString();
    int actualNumberOfSteps = ofResult.getNumberOfSteps();
    double actualSign = ofResult.getSign();
    double actualStrike = ofResult.getStrike();

    // Assert
    assertEquals(
        "EuropeanVanillaOptionFunction{strike=10.0, timeToExpiry=10.0, sign=-1.0, numberOfSteps=10}",
        actualToStringResult);
    assertEquals(-1.0d, actualSign);
    assertEquals(10, actualNumberOfSteps);
    assertEquals(10.0d, actualStrike);
    assertEquals(10.0d, ofResult.getTimeToExpiry());
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}, and {@link
   * EuropeanVanillaOptionFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EuropeanVanillaOptionFunction#equals(Object)}
   *   <li>{@link EuropeanVanillaOptionFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);
    EuropeanVanillaOptionFunction ofResult2 =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}, and {@link
   * EuropeanVanillaOptionFunction#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link EuropeanVanillaOptionFunction#equals(Object)}
   *   <li>{@link EuropeanVanillaOptionFunction#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10), 1);
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(-1.0d, 10.0d, PutCall.PUT, 10);

    // Act and Assert
    assertNotEquals(ofResult, EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10));
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, -1.0d, PutCall.PUT, 10);

    // Act and Assert
    assertNotEquals(ofResult, EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10));
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.CALL, 10);

    // Act and Assert
    assertNotEquals(ofResult, EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10));
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 1);

    // Act and Assert
    assertNotEquals(ofResult, EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10));
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10), null);
  }

  /**
   * Test {@link EuropeanVanillaOptionFunction#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link EuropeanVanillaOptionFunction#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean EuropeanVanillaOptionFunction.equals(Object)",
    "int EuropeanVanillaOptionFunction.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10),
        "Different type to EuropeanVanillaOptionFunction");
  }
}
