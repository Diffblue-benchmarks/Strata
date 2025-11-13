package com.opengamma.strata.product.fxopt;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.product.fxopt.ResolvedFxSingleBarrierOption.Meta;
import com.opengamma.strata.product.option.Barrier;
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

class ResolvedFxSingleBarrierOptionDiffblueTest {
  /**
   * Test {@link ResolvedFxSingleBarrierOption#meta()}.
   *
   * <p>Method under test: {@link ResolvedFxSingleBarrierOption#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedFxSingleBarrierOption.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedFxSingleBarrierOption.meta();

    // Assert
    MetaProperty<Barrier> barrierResult = actualMetaResult.barrier();
    assertTrue(barrierResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> rebateResult = actualMetaResult.rebate();
    assertTrue(rebateResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedFxVanillaOption> underlyingOptionResult =
        actualMetaResult.underlyingOption();
    assertTrue(underlyingOptionResult instanceof DirectMetaProperty);
    assertEquals("barrier", barrierResult.name());
    assertEquals("rebate", rebateResult.name());
    assertEquals("underlyingOption", underlyingOptionResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, barrierResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, rebateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, underlyingOptionResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, rebateResult.propertyType());
    Class<ResolvedFxSingleBarrierOption> expectedDeclaringTypeResult =
        ResolvedFxSingleBarrierOption.class;
    assertEquals(expectedDeclaringTypeResult, barrierResult.declaringType());
    Class<ResolvedFxSingleBarrierOption> expectedDeclaringTypeResult2 =
        ResolvedFxSingleBarrierOption.class;
    assertEquals(expectedDeclaringTypeResult2, rebateResult.declaringType());
    Class<ResolvedFxSingleBarrierOption> expectedDeclaringTypeResult3 =
        ResolvedFxSingleBarrierOption.class;
    assertEquals(expectedDeclaringTypeResult3, underlyingOptionResult.declaringType());
    Class<ResolvedFxVanillaOption> expectedPropertyTypeResult2 = ResolvedFxVanillaOption.class;
    assertEquals(expectedPropertyTypeResult2, underlyingOptionResult.propertyType());
    Class<Barrier> expectedPropertyTypeResult3 = Barrier.class;
    assertEquals(expectedPropertyTypeResult3, barrierResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, barrierResult.metaBean());
    assertSame(meta, rebateResult.metaBean());
    assertSame(meta, underlyingOptionResult.metaBean());
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
    Class<? extends ResolvedFxSingleBarrierOption> actualBeanTypeResult =
        ResolvedFxSingleBarrierOption.meta().beanType();

    // Assert
    Class<ResolvedFxSingleBarrierOption> expectedBeanTypeResult =
        ResolvedFxSingleBarrierOption.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#barrier()}
   *   <li>{@link Meta#rebate()}
   *   <li>{@link Meta#underlyingOption()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.barrier()",
    "MetaProperty Meta.rebate()",
    "MetaProperty Meta.underlyingOption()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedFxSingleBarrierOption.meta();

    // Act
    MetaProperty<Barrier> actualBarrierResult = metaResult.barrier();
    MetaProperty<CurrencyAmount> actualRebateResult = metaResult.rebate();

    // Assert
    assertTrue(actualBarrierResult instanceof DirectMetaProperty);
    assertTrue(actualRebateResult instanceof DirectMetaProperty);
    assertTrue(metaResult.underlyingOption() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code barrier}.
   *   <li>Then return name is {@code barrier}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'barrier'; then return name is 'barrier'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBarrier_thenReturnNameIsBarrier() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedFxSingleBarrierOption.meta().metaPropertyGet("barrier");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> rebateResult = ((Meta) metaBeanResult).rebate();
    assertTrue(rebateResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedFxVanillaOption> underlyingOptionResult =
        ((Meta) metaBeanResult).underlyingOption();
    assertTrue(underlyingOptionResult instanceof DirectMetaProperty);
    assertEquals("barrier", actualMetaPropertyGetResult.name());
    Class<Barrier> expectedPropertyTypeResult = Barrier.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).barrier());
    assertSame(metaBeanResult, rebateResult.metaBean());
    assertSame(metaBeanResult, underlyingOptionResult.metaBean());
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
    assertNull(ResolvedFxSingleBarrierOption.meta().metaPropertyGet("Property Name"));
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
        ResolvedFxSingleBarrierOption.meta().metaPropertyGet("rebate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Barrier> barrierResult = ((Meta) metaBeanResult).barrier();
    assertTrue(barrierResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ResolvedFxVanillaOption> underlyingOptionResult =
        ((Meta) metaBeanResult).underlyingOption();
    assertTrue(underlyingOptionResult instanceof DirectMetaProperty);
    assertEquals("rebate", actualMetaPropertyGetResult.name());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).rebate());
    assertSame(metaBeanResult, barrierResult.metaBean());
    assertSame(metaBeanResult, underlyingOptionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code underlyingOption}.
   *   <li>Then return name is {@code underlyingOption}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'underlyingOption'; then return name is 'underlyingOption'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenUnderlyingOption_thenReturnNameIsUnderlyingOption() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ResolvedFxSingleBarrierOption.meta().metaPropertyGet("underlyingOption");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Barrier> barrierResult = ((Meta) metaBeanResult).barrier();
    assertTrue(barrierResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurrencyAmount> rebateResult = ((Meta) metaBeanResult).rebate();
    assertTrue(rebateResult instanceof DirectMetaProperty);
    assertEquals("underlyingOption", actualMetaPropertyGetResult.name());
    Class<ResolvedFxVanillaOption> expectedPropertyTypeResult = ResolvedFxVanillaOption.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).underlyingOption());
    assertSame(metaBeanResult, barrierResult.metaBean());
    assertSame(metaBeanResult, rebateResult.metaBean());
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
        ResolvedFxSingleBarrierOption.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("underlyingOption");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("barrier");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("rebate");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("barrier", getResult2.name());
    assertEquals("rebate", getResult3.name());
    assertEquals("underlyingOption", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<CurrencyAmount> expectedPropertyTypeResult = CurrencyAmount.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<ResolvedFxSingleBarrierOption> expectedDeclaringTypeResult =
        ResolvedFxSingleBarrierOption.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ResolvedFxSingleBarrierOption> expectedDeclaringTypeResult2 =
        ResolvedFxSingleBarrierOption.class;
    assertEquals(expectedDeclaringTypeResult2, getResult3.declaringType());
    Class<ResolvedFxSingleBarrierOption> expectedDeclaringTypeResult3 =
        ResolvedFxSingleBarrierOption.class;
    assertEquals(expectedDeclaringTypeResult3, getResult.declaringType());
    Class<ResolvedFxVanillaOption> expectedPropertyTypeResult2 = ResolvedFxVanillaOption.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<Barrier> expectedPropertyTypeResult3 = Barrier.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
        ResolvedFxSingleBarrierOption.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
            ResolvedFxSingleBarrierOption.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code barrier}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'barrier'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBarrier_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedFxSingleBarrierOption.meta()
                .propertySet(mock(Bean.class), "barrier", "New Value", true));
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
            ResolvedFxSingleBarrierOption.meta()
                .propertySet(mock(Bean.class), "barrier", "New Value", false));
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
            ResolvedFxSingleBarrierOption.meta()
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
            ResolvedFxSingleBarrierOption.meta()
                .propertySet(mock(Bean.class), "rebate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code underlyingOption}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'underlyingOption'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenUnderlyingOption_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ResolvedFxSingleBarrierOption.meta()
                .propertySet(mock(Bean.class), "underlyingOption", "New Value", true));
  }
}
