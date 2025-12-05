package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.product.common.PayReceive;
import com.opengamma.strata.product.swap.ResolvedSwap.Builder;
import com.opengamma.strata.product.swap.ResolvedSwap.Meta;
import java.time.LocalDate;
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

class ResolvedSwapDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code legs}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'legs'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLegs_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = ResolvedSwap.builder().get("legs");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class, () -> ResolvedSwap.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#legs(ResolvedSwapLeg[])} with {@code ResolvedSwapLeg[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#legs(ResolvedSwapLeg[])}
   */
  @Test
  @DisplayName("Test Builder legs(ResolvedSwapLeg[]) with 'ResolvedSwapLeg[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.legs(ResolvedSwapLeg[])"})
  void testBuilderLegsWithResolvedSwapLeg_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwap.builder();
    ArrayList<SwapPaymentPeriod> paymentPeriods = new ArrayList<>();
    ResolvedSwapLeg resolvedSwapLeg =
        new ResolvedSwapLeg(
            SwapLegType.FIXED,
            PayReceive.PAY,
            (List<? extends SwapPaymentPeriod>) paymentPeriods,
            new ArrayList<>(),
            null);

    // Act
    Builder actualLegsResult = builderResult.legs(resolvedSwapLeg);

    // Assert
    assertSame(builderResult, actualLegsResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ResolvedSwap.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code legs}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'legs'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenLegs_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwap.builder();

    // Act
    Builder actualSetResult = builderResult.set("legs", new ArrayList<>());

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ResolvedSwap.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ResolvedSwap#ResolvedSwap(ImmutableList, ImmutableSet, ImmutableSet)}
   *   <li>{@link ResolvedSwap#getLegs()}
   *   <li>{@link ResolvedSwap#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ResolvedSwap.<init>(ImmutableList, ImmutableSet, ImmutableSet)",
    "ImmutableList ResolvedSwap.getLegs()",
    "Builder ResolvedSwap.toBuilder()",
    "String ResolvedSwap.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    ResolvedSwap actualResolvedSwap = new ResolvedSwap(null, null, null);
    ImmutableList<ResolvedSwapLeg> actualLegs = actualResolvedSwap.getLegs();
    actualResolvedSwap.toBuilder();

    // Assert
    assertNull(actualLegs);
  }

  /**
   * Test {@link ResolvedSwap#allPaymentCurrencies()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedSwap#allPaymentCurrencies()}
   */
  @Test
  @DisplayName("Test allPaymentCurrencies(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ResolvedSwap.allPaymentCurrencies()"})
  void testAllPaymentCurrencies_thenReturnNull() {
    // Arrange
    ResolvedSwap resolvedSwap = new ResolvedSwap(null, null, null);

    // Act and Assert
    assertNull(resolvedSwap.allPaymentCurrencies());
  }

  /**
   * Test {@link ResolvedSwap#allIndices()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedSwap#allIndices()}
   */
  @Test
  @DisplayName("Test allIndices(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet ResolvedSwap.allIndices()"})
  void testAllIndices_thenReturnNull() {
    // Arrange
    ResolvedSwap resolvedSwap = new ResolvedSwap(null, null, null);

    // Act and Assert
    assertNull(resolvedSwap.allIndices());
  }

  /**
   * Test {@link ResolvedSwap#meta()}.
   *
   * <p>Method under test: {@link ResolvedSwap#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedSwap.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ResolvedSwap.meta();

    // Assert
    MetaProperty<LocalDate> endDateResult = actualMetaResult.endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ResolvedSwapLeg>> legsResult = actualMetaResult.legs();
    assertTrue(legsResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = actualMetaResult.startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("endDate", endDateResult.name());
    assertEquals("legs", legsResult.name());
    assertEquals("startDate", startDateResult.name());
    assertEquals(PropertyStyle.DERIVED, endDateResult.style());
    assertEquals(PropertyStyle.DERIVED, startDateResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, legsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, legsResult.propertyType());
    Class<ResolvedSwap> expectedDeclaringTypeResult = ResolvedSwap.class;
    assertEquals(expectedDeclaringTypeResult, endDateResult.declaringType());
    Class<ResolvedSwap> expectedDeclaringTypeResult2 = ResolvedSwap.class;
    assertEquals(expectedDeclaringTypeResult2, legsResult.declaringType());
    Class<ResolvedSwap> expectedDeclaringTypeResult3 = ResolvedSwap.class;
    assertEquals(expectedDeclaringTypeResult3, startDateResult.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, endDateResult.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, startDateResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, endDateResult.metaBean());
    assertSame(meta, legsResult.metaBean());
    assertSame(meta, startDateResult.metaBean());
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
    Class<? extends ResolvedSwap> actualBeanTypeResult = ResolvedSwap.meta().beanType();

    // Assert
    Class<ResolvedSwap> expectedBeanTypeResult = ResolvedSwap.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test {@link ResolvedSwap#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link ResolvedSwap#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ResolvedSwap.metaBean()"})
  void testMetaBean_thenReturnInstance() {
    // Arrange
    ResolvedSwap resolvedSwap = new ResolvedSwap(null, null, null);

    // Act and Assert
    assertSame(Meta.INSTANCE, resolvedSwap.metaBean());
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#endDate()}
   *   <li>{@link Meta#legs()}
   *   <li>{@link Meta#startDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.endDate()",
    "MetaProperty Meta.legs()",
    "MetaProperty Meta.startDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ResolvedSwap.meta();

    // Act
    MetaProperty<LocalDate> actualEndDateResult = metaResult.endDate();
    MetaProperty<ImmutableList<ResolvedSwapLeg>> actualLegsResult = metaResult.legs();

    // Assert
    assertTrue(actualEndDateResult instanceof DirectMetaProperty);
    assertTrue(actualLegsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.startDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then return name is {@code endDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'endDate'; then return name is 'endDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenEndDate_thenReturnNameIsEndDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedSwap.meta().metaPropertyGet("endDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<ResolvedSwapLeg>> legsResult = ((Meta) metaBeanResult).legs();
    assertTrue(legsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("endDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).endDate());
    assertSame(metaBeanResult, legsResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code legs}.
   *   <li>Then return name is {@code legs}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'legs'; then return name is 'legs'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLegs_thenReturnNameIsLegs() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedSwap.meta().metaPropertyGet("legs");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> startDateResult = ((Meta) metaBeanResult).startDate();
    assertTrue(startDateResult instanceof DirectMetaProperty);
    assertEquals("legs", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).legs());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, startDateResult.metaBean());
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
    assertNull(ResolvedSwap.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then return name is {@code startDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'startDate'; then return name is 'startDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenStartDate_thenReturnNameIsStartDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ResolvedSwap.meta().metaPropertyGet("startDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<LocalDate> endDateResult = ((Meta) metaBeanResult).endDate();
    assertTrue(endDateResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ResolvedSwapLeg>> legsResult = ((Meta) metaBeanResult).legs();
    assertTrue(legsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("startDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).startDate());
    assertSame(metaBeanResult, endDateResult.metaBean());
    assertSame(metaBeanResult, legsResult.metaBean());
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
        ResolvedSwap.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("legs");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("endDate");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("startDate");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("endDate", getResult2.name());
    assertEquals("legs", getResult.name());
    assertEquals("startDate", getResult3.name());
    assertEquals(PropertyStyle.DERIVED, getResult2.style());
    assertEquals(PropertyStyle.DERIVED, getResult3.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ResolvedSwap> expectedDeclaringTypeResult = ResolvedSwap.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<ResolvedSwap> expectedDeclaringTypeResult2 = ResolvedSwap.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<ResolvedSwap> expectedDeclaringTypeResult3 = ResolvedSwap.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<LocalDate> expectedPropertyTypeResult2 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<LocalDate> expectedPropertyTypeResult3 = LocalDate.class;
    assertEquals(expectedPropertyTypeResult3, getResult3.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult3.metaBean());
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
        () -> ResolvedSwap.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ResolvedSwap.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code endDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'endDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenEndDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedSwap.meta().propertySet(mock(Bean.class), "endDate", "New Value", true));
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
        () -> ResolvedSwap.meta().propertySet(mock(Bean.class), "endDate", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code legs}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'legs'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLegs_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedSwap.meta().propertySet(mock(Bean.class), "legs", "New Value", true));
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
            ResolvedSwap.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code startDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'startDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStartDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ResolvedSwap.meta().propertySet(mock(Bean.class), "startDate", "New Value", true));
  }
}
