package com.opengamma.strata.product.swap;

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
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.Builder;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.product.rate.FixedRateComputation;
import com.opengamma.strata.product.rate.RateComputation;
import com.opengamma.strata.product.swap.FixedRateStubCalculation.Meta;
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

class FixedRateStubCalculationDiffblueTest {
  /**
   * Test {@link FixedRateStubCalculation#createRateComputation(double)}.
   *
   * <ul>
   *   <li>Given {@link FixedRateStubCalculation#NONE}.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateStubCalculation#createRateComputation(double)}
   */
  @Test
  @DisplayName("Test createRateComputation(double); given NONE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RateComputation FixedRateStubCalculation.createRateComputation(double)"})
  void testCreateRateComputation_givenNone() {
    // Arrange and Act
    RateComputation actualCreateRateComputationResult =
        FixedRateStubCalculation.NONE.createRateComputation(10.0d);
    Builder<Index> builder = ImmutableSet.builder();
    actualCreateRateComputationResult.collectIndices(builder);

    // Assert
    assertTrue(actualCreateRateComputationResult instanceof FixedRateComputation);
    assertEquals(10.0d, ((FixedRateComputation) actualCreateRateComputationResult).getRate());
  }

  /**
   * Test {@link FixedRateStubCalculation#createRateComputation(double)}.
   *
   * <ul>
   *   <li>Given ofFixedRate ten.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateStubCalculation#createRateComputation(double)}
   */
  @Test
  @DisplayName("Test createRateComputation(double); given ofFixedRate ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RateComputation FixedRateStubCalculation.createRateComputation(double)"})
  void testCreateRateComputation_givenOfFixedRateTen() {
    // Arrange
    FixedRateStubCalculation ofFixedRateResult = FixedRateStubCalculation.ofFixedRate(10.0d);

    // Act
    RateComputation actualCreateRateComputationResult =
        ofFixedRateResult.createRateComputation(10.0d);
    Builder<Index> builder = ImmutableSet.builder();
    actualCreateRateComputationResult.collectIndices(builder);

    // Assert
    assertTrue(actualCreateRateComputationResult instanceof FixedRateComputation);
    assertEquals(10.0d, ((FixedRateComputation) actualCreateRateComputationResult).getRate());
  }

  /**
   * Test {@link FixedRateStubCalculation#isFixedRate()}.
   *
   * <ul>
   *   <li>Given {@link FixedRateStubCalculation#NONE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateStubCalculation#isFixedRate()}
   */
  @Test
  @DisplayName("Test isFixedRate(); given NONE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedRateStubCalculation.isFixedRate()"})
  void testIsFixedRate_givenNone_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(FixedRateStubCalculation.NONE.isFixedRate());
  }

  /**
   * Test {@link FixedRateStubCalculation#isFixedRate()}.
   *
   * <ul>
   *   <li>Given ofFixedRate ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateStubCalculation#isFixedRate()}
   */
  @Test
  @DisplayName("Test isFixedRate(); given ofFixedRate ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedRateStubCalculation.isFixedRate()"})
  void testIsFixedRate_givenOfFixedRateTen_thenReturnTrue() {
    // Arrange
    FixedRateStubCalculation ofFixedRateResult = FixedRateStubCalculation.ofFixedRate(10.0d);

    // Act and Assert
    assertTrue(ofFixedRateResult.isFixedRate());
  }

  /**
   * Test {@link FixedRateStubCalculation#isKnownAmount()}.
   *
   * <p>Method under test: {@link FixedRateStubCalculation#isKnownAmount()}
   */
  @Test
  @DisplayName("Test isKnownAmount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FixedRateStubCalculation.isKnownAmount()"})
  void testIsKnownAmount() {
    // Arrange, Act and Assert
    assertFalse(FixedRateStubCalculation.NONE.isKnownAmount());
  }

  /**
   * Test {@link FixedRateStubCalculation#meta()}.
   *
   * <p>Method under test: {@link FixedRateStubCalculation#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedRateStubCalculation.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = FixedRateStubCalculation.meta();

    // Assert
    MetaProperty<Double> fixedRateResult = actualMetaResult.fixedRate();
    assertTrue(fixedRateResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> knownAmountResult = actualMetaResult.knownAmount();
    assertTrue(knownAmountResult instanceof DirectMetaProperty);
    assertEquals("fixedRate", fixedRateResult.name());
    assertEquals("knownAmount", knownAmountResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixedRateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, knownAmountResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, knownAmountResult.propertyType());
    Class<FixedRateStubCalculation> expectedDeclaringTypeResult = FixedRateStubCalculation.class;
    assertEquals(expectedDeclaringTypeResult, fixedRateResult.declaringType());
    Class<FixedRateStubCalculation> expectedDeclaringTypeResult2 = FixedRateStubCalculation.class;
    assertEquals(expectedDeclaringTypeResult2, knownAmountResult.declaringType());
    Class<Double> expectedPropertyTypeResult2 = Double.class;
    assertEquals(expectedPropertyTypeResult2, fixedRateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, fixedRateResult.metaBean());
    assertSame(meta, knownAmountResult.metaBean());
  }

  /**
   * Test {@link FixedRateStubCalculation#metaBean()}.
   *
   * <p>Method under test: {@link FixedRateStubCalculation#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta FixedRateStubCalculation.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, FixedRateStubCalculation.NONE.metaBean());
  }

  /**
   * Test {@link FixedRateStubCalculation#getKnownAmount()}.
   *
   * <p>Method under test: {@link FixedRateStubCalculation#getKnownAmount()}
   */
  @Test
  @DisplayName("Test getKnownAmount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional FixedRateStubCalculation.getKnownAmount()"})
  void testGetKnownAmount() {
    // Arrange, Act and Assert
    assertFalse(FixedRateStubCalculation.NONE.getKnownAmount().isPresent());
  }

  /**
   * Test {@link FixedRateStubCalculation#equals(Object)}, and {@link
   * FixedRateStubCalculation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedRateStubCalculation#equals(Object)}
   *   <li>{@link FixedRateStubCalculation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateStubCalculation.equals(Object)",
    "int FixedRateStubCalculation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FixedRateStubCalculation fixedRateStubCalculation = FixedRateStubCalculation.NONE;
    FixedRateStubCalculation fixedRateStubCalculation2 = FixedRateStubCalculation.NONE;

    // Act and Assert
    assertEquals(fixedRateStubCalculation, fixedRateStubCalculation2);
    assertEquals(fixedRateStubCalculation.hashCode(), fixedRateStubCalculation2.hashCode());
  }

  /**
   * Test {@link FixedRateStubCalculation#equals(Object)}, and {@link
   * FixedRateStubCalculation#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedRateStubCalculation#equals(Object)}
   *   <li>{@link FixedRateStubCalculation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateStubCalculation.equals(Object)",
    "int FixedRateStubCalculation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    FixedRateStubCalculation ofFixedRateResult = FixedRateStubCalculation.ofFixedRate(10.0d);
    FixedRateStubCalculation ofFixedRateResult2 = FixedRateStubCalculation.ofFixedRate(10.0d);

    // Act and Assert
    assertEquals(ofFixedRateResult, ofFixedRateResult2);
    assertEquals(ofFixedRateResult.hashCode(), ofFixedRateResult2.hashCode());
  }

  /**
   * Test {@link FixedRateStubCalculation#equals(Object)}, and {@link
   * FixedRateStubCalculation#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link FixedRateStubCalculation#equals(Object)}
   *   <li>{@link FixedRateStubCalculation#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateStubCalculation.equals(Object)",
    "int FixedRateStubCalculation.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FixedRateStubCalculation fixedRateStubCalculation = FixedRateStubCalculation.NONE;

    // Act and Assert
    assertEquals(fixedRateStubCalculation, fixedRateStubCalculation);
    int expectedHashCodeResult = fixedRateStubCalculation.hashCode();
    assertEquals(expectedHashCodeResult, fixedRateStubCalculation.hashCode());
  }

  /**
   * Test {@link FixedRateStubCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateStubCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateStubCalculation.equals(Object)",
    "int FixedRateStubCalculation.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FixedRateStubCalculation ofFixedRateResult = FixedRateStubCalculation.ofFixedRate(10.0d);

    // Act and Assert
    assertNotEquals(ofFixedRateResult, FixedRateStubCalculation.NONE);
  }

  /**
   * Test {@link FixedRateStubCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateStubCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateStubCalculation.equals(Object)",
    "int FixedRateStubCalculation.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FixedRateStubCalculation.NONE, null);
  }

  /**
   * Test {@link FixedRateStubCalculation#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link FixedRateStubCalculation#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean FixedRateStubCalculation.equals(Object)",
    "int FixedRateStubCalculation.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FixedRateStubCalculation.NONE, "Different type to FixedRateStubCalculation");
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
    Class<? extends FixedRateStubCalculation> actualBeanTypeResult =
        FixedRateStubCalculation.meta().beanType();

    // Assert
    Class<FixedRateStubCalculation> expectedBeanTypeResult = FixedRateStubCalculation.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#fixedRate()}
   *   <li>{@link Meta#knownAmount()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.fixedRate()", "MetaProperty Meta.knownAmount()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = FixedRateStubCalculation.meta();

    // Act
    MetaProperty<Double> actualFixedRateResult = metaResult.fixedRate();

    // Assert
    assertTrue(actualFixedRateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.knownAmount() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean fixedRate return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean fixedRate return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanFixedRateReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedRateStubCalculation.meta().metaPropertyGet("knownAmount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Double> fixedRateResult = ((Meta) metaBeanResult).fixedRate();
    assertTrue(fixedRateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixedRate", fixedRateResult.name());
    assertEquals("knownAmount", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, fixedRateResult.style());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<FixedRateStubCalculation> expectedDeclaringTypeResult = FixedRateStubCalculation.class;
    assertEquals(expectedDeclaringTypeResult, fixedRateResult.declaringType());
    Class<Double> expectedPropertyTypeResult2 = Double.class;
    assertEquals(expectedPropertyTypeResult2, fixedRateResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).knownAmount());
    assertSame(Meta.INSTANCE, fixedRateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean knownAmount return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean knownAmount return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanKnownAmountReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        FixedRateStubCalculation.meta().metaPropertyGet("fixedRate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurrencyAmount> knownAmountResult = ((Meta) metaBeanResult).knownAmount();
    assertTrue(knownAmountResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("fixedRate", actualMetaPropertyGetResult.name());
    assertEquals("knownAmount", knownAmountResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, knownAmountResult.style());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, knownAmountResult.propertyType());
    Class<FixedRateStubCalculation> expectedDeclaringTypeResult = FixedRateStubCalculation.class;
    assertEquals(expectedDeclaringTypeResult, knownAmountResult.declaringType());
    Class<Double> expectedPropertyTypeResult2 = Double.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).fixedRate());
    assertSame(Meta.INSTANCE, knownAmountResult.metaBean());
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
    assertNull(FixedRateStubCalculation.meta().metaPropertyGet("Property Name"));
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
        FixedRateStubCalculation.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("fixedRate");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("knownAmount");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("fixedRate", getResult.name());
    assertEquals("knownAmount", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<FixedRateStubCalculation> expectedDeclaringTypeResult = FixedRateStubCalculation.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<FixedRateStubCalculation> expectedDeclaringTypeResult2 = FixedRateStubCalculation.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<Double> expectedPropertyTypeResult2 = Double.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
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
    assertNull(
        FixedRateStubCalculation.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            FixedRateStubCalculation.meta()
                .propertyGet(FixedRateStubCalculation.NONE, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'fixedRate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFixedRate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        FixedRateStubCalculation.meta()
            .propertyGet(FixedRateStubCalculation.NONE, "fixedRate", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code knownAmount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'knownAmount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenKnownAmount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        FixedRateStubCalculation.meta()
            .propertyGet(FixedRateStubCalculation.NONE, "knownAmount", true));
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
            FixedRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "fixedRate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code fixedRate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'fixedRate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFixedRate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "fixedRate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code knownAmount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'knownAmount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenKnownAmount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            FixedRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "knownAmount", "New Value", true));
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
            FixedRateStubCalculation.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link FixedRateStubCalculation#toString()}.
   *
   * <p>Method under test: {@link FixedRateStubCalculation#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FixedRateStubCalculation.toString()"})
  void testToString() {
    // Arrange
    FixedRateStubCalculation ofFixedRateResult = FixedRateStubCalculation.ofFixedRate(10.0d);

    // Act and Assert
    assertEquals(
        "FixedRateStubCalculation{fixedRate=10.0, knownAmount=null}", ofFixedRateResult.toString());
  }
}
