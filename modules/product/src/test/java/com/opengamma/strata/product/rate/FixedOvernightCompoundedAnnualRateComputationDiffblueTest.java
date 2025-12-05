package com.opengamma.strata.product.rate;

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
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.product.rate.FixedOvernightCompoundedAnnualRateComputation.Meta;
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

class FixedOvernightCompoundedAnnualRateComputationDiffblueTest {
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
    Class<? extends FixedOvernightCompoundedAnnualRateComputation> actualBeanTypeResult =
        FixedOvernightCompoundedAnnualRateComputation.meta().beanType();

    // Assert
    Class<FixedOvernightCompoundedAnnualRateComputation> expectedBeanTypeResult =
        FixedOvernightCompoundedAnnualRateComputation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#accrualFactor()}
   *   <li>{@link Meta#rate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.accrualFactor()", "MetaProperty Meta.rate()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FixedOvernightCompoundedAnnualRateComputation.meta();

    // Act
    MetaProperty<Double> actualAccrualFactorResult = metaResult.accrualFactor();

    // Assert
    assertTrue(actualAccrualFactorResult instanceof DirectMetaProperty);
    assertTrue(metaResult.rate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean accrualFactor return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean accrualFactor return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanAccrualFactorReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedOvernightCompoundedAnnualRateComputation.meta().metaPropertyGet("rate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> accrualFactorResult = ((Meta) metaBeanResult).accrualFactor();
    assertTrue(accrualFactorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("accrualFactor", accrualFactorResult.name());
    assertEquals("double", accrualFactorResult.propertyType().getName());
    assertEquals("rate", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, accrualFactorResult.style());
    Class<FixedOvernightCompoundedAnnualRateComputation> expectedDeclaringTypeResult =
        FixedOvernightCompoundedAnnualRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, accrualFactorResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rate());
    assertSame(Meta.INSTANCE, accrualFactorResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean rate return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean rate return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanRateReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedOvernightCompoundedAnnualRateComputation.meta().metaPropertyGet("accrualFactor");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> rateResult = ((Meta) metaBeanResult).rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("accrualFactor", actualMetaPropertyGetResult.name());
    assertEquals("double", rateResult.propertyType().getName());
    assertEquals("rate", rateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, rateResult.style());
    Class<FixedOvernightCompoundedAnnualRateComputation> expectedDeclaringTypeResult =
        FixedOvernightCompoundedAnnualRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, rateResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).accrualFactor());
    assertSame(Meta.INSTANCE, rateResult.metaBean());
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
        FixedOvernightCompoundedAnnualRateComputation.meta().metaPropertyGet("Property Name"));
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
        FixedOvernightCompoundedAnnualRateComputation.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("rate");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("accrualFactor");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("accrualFactor", getResult2.name());
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("double", getResult.propertyType().getName());
    assertEquals("rate", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<FixedOvernightCompoundedAnnualRateComputation> expectedDeclaringTypeResult =
        FixedOvernightCompoundedAnnualRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<FixedOvernightCompoundedAnnualRateComputation> expectedDeclaringTypeResult2 =
        FixedOvernightCompoundedAnnualRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualFactor}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'accrualFactor'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAccrualFactor_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = FixedOvernightCompoundedAnnualRateComputation.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d),
                    "accrualFactor",
                    true))
            .doubleValue());
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
        FixedOvernightCompoundedAnnualRateComputation.meta()
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
    Meta metaResult = FixedOvernightCompoundedAnnualRateComputation.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'rate'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenRate_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = FixedOvernightCompoundedAnnualRateComputation.meta();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d), "rate", true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code accrualFactor}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'accrualFactor'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAccrualFactor_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedOvernightCompoundedAnnualRateComputation.meta()
                .propertySet(mock(Bean.class), "accrualFactor", "New Value", true));
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
            FixedOvernightCompoundedAnnualRateComputation.meta()
                .propertySet(mock(Bean.class), "accrualFactor", "New Value", false));
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
            FixedOvernightCompoundedAnnualRateComputation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code rate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'rate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedOvernightCompoundedAnnualRateComputation.meta()
                .propertySet(mock(Bean.class), "rate", "New Value", true));
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#of(double, double)}.
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#of(double, double)}
   */
  @Test
  @DisplayName("Test of(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FixedOvernightCompoundedAnnualRateComputation FixedOvernightCompoundedAnnualRateComputation.of(double, double)"
  })
  void testOf() {
    // Arrange and Act
    FixedOvernightCompoundedAnnualRateComputation actualOfResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getAccrualFactor());
    assertEquals(10.0d, actualOfResult.getRate());
    assertEquals(2.59374246E9d, actualOfResult.getSimpleRate());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#collectIndices(Builder)}
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#toString()}
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#getAccrualFactor()}
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#getRate()}
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#getSimpleRate()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FixedOvernightCompoundedAnnualRateComputation.collectIndices(Builder)",
    "double FixedOvernightCompoundedAnnualRateComputation.getAccrualFactor()",
    "double FixedOvernightCompoundedAnnualRateComputation.getRate()",
    "double FixedOvernightCompoundedAnnualRateComputation.getSimpleRate()",
    "String FixedOvernightCompoundedAnnualRateComputation.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);
    Builder<Index> builder = ImmutableSet.builder();

    // Act
    ofResult.collectIndices(builder);
    String actualToStringResult = ofResult.toString();
    double actualAccrualFactor = ofResult.getAccrualFactor();
    double actualRate = ofResult.getRate();

    // Assert
    assertEquals(
        "FixedOvernightCompoundedAnnualRateComputation{rate=10.0, accrualFactor=10.0}",
        actualToStringResult);
    assertEquals(10.0d, actualAccrualFactor);
    assertEquals(10.0d, actualRate);
    assertEquals(2.59374246E9d, ofResult.getSimpleRate());
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#meta()}.
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedOvernightCompoundedAnnualRateComputation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FixedOvernightCompoundedAnnualRateComputation.meta();

    // Assert
    MetaProperty<Double> accrualFactorResult = actualMetaResult.accrualFactor();
    assertTrue(accrualFactorResult instanceof DirectMetaProperty);
    MetaProperty<Double> rateResult = actualMetaResult.rate();
    assertTrue(rateResult instanceof DirectMetaProperty);
    assertEquals("accrualFactor", accrualFactorResult.name());
    assertEquals("double", accrualFactorResult.propertyType().getName());
    assertEquals("double", rateResult.propertyType().getName());
    assertEquals("rate", rateResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, accrualFactorResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, rateResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<FixedOvernightCompoundedAnnualRateComputation> expectedDeclaringTypeResult =
        FixedOvernightCompoundedAnnualRateComputation.class;
    assertEquals(expectedDeclaringTypeResult, accrualFactorResult.declaringType());
    Class<FixedOvernightCompoundedAnnualRateComputation> expectedDeclaringTypeResult2 =
        FixedOvernightCompoundedAnnualRateComputation.class;
    assertEquals(expectedDeclaringTypeResult2, rateResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, accrualFactorResult.metaBean());
    assertSame(meta, rateResult.metaBean());
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#metaBean()}.
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedOvernightCompoundedAnnualRateComputation.metaBean()"})
  void testMetaBean() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}, and {@link
   * FixedOvernightCompoundedAnnualRateComputation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOvernightCompoundedAnnualRateComputation.equals(Object)",
    "int FixedOvernightCompoundedAnnualRateComputation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);
    FixedOvernightCompoundedAnnualRateComputation ofResult2 =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}, and {@link
   * FixedOvernightCompoundedAnnualRateComputation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}
   *   <li>{@link FixedOvernightCompoundedAnnualRateComputation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOvernightCompoundedAnnualRateComputation.equals(Object)",
    "int FixedOvernightCompoundedAnnualRateComputation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOvernightCompoundedAnnualRateComputation.equals(Object)",
    "int FixedOvernightCompoundedAnnualRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOvernightCompoundedAnnualRateComputation.equals(Object)",
    "int FixedOvernightCompoundedAnnualRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(2.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d));
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOvernightCompoundedAnnualRateComputation.equals(Object)",
    "int FixedOvernightCompoundedAnnualRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 2.0d);

    // Act and Assert
    assertNotEquals(ofResult, FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d));
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOvernightCompoundedAnnualRateComputation.equals(Object)",
    "int FixedOvernightCompoundedAnnualRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedOvernightCompoundedAnnualRateComputation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedOvernightCompoundedAnnualRateComputation.equals(Object)",
    "int FixedOvernightCompoundedAnnualRateComputation.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation ofResult =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(ofResult, "Different type to FixedOvernightCompoundedAnnualRateComputation");
  }
}
