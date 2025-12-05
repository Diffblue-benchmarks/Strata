package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.SecurityInfo;
import com.opengamma.strata.product.etd.EtdFutureSecurity.Builder;
import com.opengamma.strata.product.etd.EtdFutureSecurity.Meta;
import java.time.Month;
import java.time.YearMonth;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdFutureSecurityDiffblueTest {
  /**
   * Test Builder {@link Builder#contractSpecId(EtdContractSpecId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#contractSpecId(EtdContractSpecId)}
   */
  @Test
  @DisplayName(
      "Test Builder contractSpecId(EtdContractSpecId); when StandardId with 'Scheme' and value is '42'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.contractSpecId(EtdContractSpecId)"})
  void testBuilderContractSpecId_whenStandardIdWithSchemeAndValueIs42_thenReturnBuilder() {
    // Arrange
    Builder builderResult = EtdFutureSecurity.builder();

    // Act
    Builder actualContractSpecIdResult =
        builderResult.contractSpecId(EtdContractSpecId.of(StandardId.of("Scheme", "42")));

    // Assert
    assertSame(builderResult, actualContractSpecIdResult);
  }

  /**
   * Test Builder {@link Builder#expiry(YearMonth)}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#expiry(YearMonth)}
   */
  @Test
  @DisplayName(
      "Test Builder expiry(YearMonth); when YearMonth with '1970' and 'JANUARY'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.expiry(YearMonth)"})
  void testBuilderExpiry_whenYearMonthWith1970AndJanuary_thenReturnBuilder() {
    // Arrange
    Builder builderResult = EtdFutureSecurity.builder();

    // Act
    Builder actualExpiryResult = builderResult.expiry(YearMonth.of(1970, Month.JANUARY));

    // Assert
    assertSame(builderResult, actualExpiryResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code contractSpecId}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'contractSpecId'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenContractSpecId_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(EtdFutureSecurity.builder().get("contractSpecId"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'expiry'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExpiry_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(EtdFutureSecurity.builder().get("expiry"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'info'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenInfo_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(EtdFutureSecurity.builder().get("info"));
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
    assertThrows(
        NoSuchElementException.class, () -> EtdFutureSecurity.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code variant}.
   *   <li>Then return {@link EtdVariant#MONTHLY}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'variant'; then return MONTHLY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenVariant_thenReturnMonthly() {
    // Arrange and Act
    Object actualGetResult = EtdFutureSecurity.builder().get("variant");

    // Assert
    assertSame(((EtdVariant) actualGetResult).MONTHLY, actualGetResult);
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
        () -> EtdFutureSecurity.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code contractSpecId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'contractSpecId'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenContractSpecId_thenReturnBuilder() {
    // Arrange
    Builder builderResult = EtdFutureSecurity.builder();

    // Act
    Builder actualSetResult = builderResult.set("contractSpecId", null);

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
    Builder builderResult = EtdFutureSecurity.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#variant(EtdVariant)}.
   *
   * <ul>
   *   <li>When {@link EtdVariant#MONTHLY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#variant(EtdVariant)}
   */
  @Test
  @DisplayName("Test Builder variant(EtdVariant); when MONTHLY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.variant(EtdVariant)"})
  void testBuilderVariant_whenMonthly_thenReturnBuilder() {
    // Arrange
    Builder builderResult = EtdFutureSecurity.builder();

    // Act
    Builder actualVariantResult = builderResult.variant(EtdVariant.MONTHLY);

    // Assert
    assertSame(builderResult, actualVariantResult);
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
    Class<? extends EtdFutureSecurity> actualBeanTypeResult = EtdFutureSecurity.meta().beanType();

    // Assert
    Class<EtdFutureSecurity> expectedBeanTypeResult = EtdFutureSecurity.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#contractSpecId()}
   *   <li>{@link Meta#expiry()}
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#variant()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.contractSpecId()",
    "MetaProperty Meta.expiry()",
    "MetaProperty Meta.info()",
    "MetaProperty Meta.variant()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = EtdFutureSecurity.meta();

    // Act
    MetaProperty<EtdContractSpecId> actualContractSpecIdResult = metaResult.contractSpecId();
    MetaProperty<YearMonth> actualExpiryResult = metaResult.expiry();
    MetaProperty<SecurityInfo> actualInfoResult = metaResult.info();

    // Assert
    assertTrue(actualContractSpecIdResult instanceof DirectMetaProperty);
    assertTrue(actualExpiryResult instanceof DirectMetaProperty);
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(metaResult.variant() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code contractSpecId}.
   *   <li>Then return name is {@code contractSpecId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'contractSpecId'; then return name is 'contractSpecId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenContractSpecId_thenReturnNameIsContractSpecId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdFutureSecurity.meta().metaPropertyGet("contractSpecId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<YearMonth> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    MetaProperty<SecurityInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<EtdVariant> variantResult = ((Meta) metaBeanResult).variant();
    assertTrue(variantResult instanceof DirectMetaProperty);
    assertEquals("contractSpecId", actualMetaPropertyGetResult.name());
    Class<EtdContractSpecId> expectedPropertyTypeResult = EtdContractSpecId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).contractSpecId());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, variantResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then return name is {@code expiry}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'expiry'; then return name is 'expiry'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExpiry_thenReturnNameIsExpiry() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdFutureSecurity.meta().metaPropertyGet("expiry");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<EtdContractSpecId> contractSpecIdResult = ((Meta) metaBeanResult).contractSpecId();
    assertTrue(contractSpecIdResult instanceof DirectMetaProperty);
    MetaProperty<SecurityInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<EtdVariant> variantResult = ((Meta) metaBeanResult).variant();
    assertTrue(variantResult instanceof DirectMetaProperty);
    assertEquals("expiry", actualMetaPropertyGetResult.name());
    Class<YearMonth> expectedPropertyTypeResult = YearMonth.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).expiry());
    assertSame(metaBeanResult, contractSpecIdResult.metaBean());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, variantResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return name is {@code info}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'info'; then return name is 'info'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInfo_thenReturnNameIsInfo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = EtdFutureSecurity.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<EtdContractSpecId> contractSpecIdResult = ((Meta) metaBeanResult).contractSpecId();
    assertTrue(contractSpecIdResult instanceof DirectMetaProperty);
    MetaProperty<YearMonth> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<EtdVariant> variantResult = ((Meta) metaBeanResult).variant();
    assertTrue(variantResult instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<SecurityInfo> expectedPropertyTypeResult = SecurityInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
    assertSame(metaBeanResult, contractSpecIdResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, variantResult.metaBean());
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
    assertNull(EtdFutureSecurity.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code variant}.
   *   <li>Then return name is {@code variant}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'variant'; then return name is 'variant'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenVariant_thenReturnNameIsVariant() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdFutureSecurity.meta().metaPropertyGet("variant");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<EtdContractSpecId> contractSpecIdResult = ((Meta) metaBeanResult).contractSpecId();
    assertTrue(contractSpecIdResult instanceof DirectMetaProperty);
    MetaProperty<YearMonth> expiryResult = ((Meta) metaBeanResult).expiry();
    assertTrue(expiryResult instanceof DirectMetaProperty);
    MetaProperty<SecurityInfo> infoResult = ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("variant", actualMetaPropertyGetResult.name());
    Class<EtdVariant> expectedPropertyTypeResult = EtdVariant.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).variant());
    assertSame(metaBeanResult, contractSpecIdResult.metaBean());
    assertSame(metaBeanResult, expiryResult.metaBean());
    assertSame(metaBeanResult, infoResult.metaBean());
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
        EtdFutureSecurity.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("contractSpecId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("expiry") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("variant") instanceof DirectMetaProperty);
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
    assertNull(EtdFutureSecurity.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> EtdFutureSecurity.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code contractSpecId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'contractSpecId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenContractSpecId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            EtdFutureSecurity.meta()
                .propertySet(mock(Bean.class), "contractSpecId", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code expiry}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'expiry'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExpiry_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> EtdFutureSecurity.meta().propertySet(mock(Bean.class), "expiry", "New Value", true));
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
            EtdFutureSecurity.meta()
                .propertySet(mock(Bean.class), "contractSpecId", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'info'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInfo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> EtdFutureSecurity.meta().propertySet(mock(Bean.class), "info", "New Value", true));
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
            EtdFutureSecurity.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code variant}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'variant'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenVariant_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> EtdFutureSecurity.meta().propertySet(mock(Bean.class), "variant", "New Value", true));
  }
}
