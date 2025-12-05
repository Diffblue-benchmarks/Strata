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
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.product.AttributeType;
import com.opengamma.strata.product.SecurityPriceInfo;
import com.opengamma.strata.product.common.ExchangeId;
import com.opengamma.strata.product.etd.EtdContractSpec.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdContractSpecDiffblueTest {
  /**
   * Test {@link EtdContractSpec#meta()}.
   *
   * <p>Method under test: {@link EtdContractSpec#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta EtdContractSpec.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = EtdContractSpec.meta();

    // Assert
    assertTrue(actualMetaResult.attributes() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.contractCode() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.description() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.exchangeId() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.id() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.priceInfo() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.type() instanceof DirectMetaProperty);
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
    Class<? extends EtdContractSpec> actualBeanTypeResult = EtdContractSpec.meta().beanType();

    // Assert
    Class<EtdContractSpec> expectedBeanTypeResult = EtdContractSpec.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#attributes()}
   *   <li>{@link Meta#contractCode()}
   *   <li>{@link Meta#description()}
   *   <li>{@link Meta#exchangeId()}
   *   <li>{@link Meta#id()}
   *   <li>{@link Meta#priceInfo()}
   *   <li>{@link Meta#type()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.attributes()",
    "MetaProperty Meta.contractCode()",
    "MetaProperty Meta.description()",
    "MetaProperty Meta.exchangeId()",
    "MetaProperty Meta.id()",
    "MetaProperty Meta.priceInfo()",
    "MetaProperty Meta.type()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = EtdContractSpec.meta();

    // Act
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> actualAttributesResult =
        metaResult.attributes();
    MetaProperty<EtdContractCode> actualContractCodeResult = metaResult.contractCode();
    MetaProperty<String> actualDescriptionResult = metaResult.description();
    MetaProperty<ExchangeId> actualExchangeIdResult = metaResult.exchangeId();
    MetaProperty<EtdContractSpecId> actualIdResult = metaResult.id();
    MetaProperty<SecurityPriceInfo> actualPriceInfoResult = metaResult.priceInfo();

    // Assert
    assertTrue(actualAttributesResult instanceof DirectMetaProperty);
    assertTrue(actualContractCodeResult instanceof DirectMetaProperty);
    assertTrue(actualDescriptionResult instanceof DirectMetaProperty);
    assertTrue(actualExchangeIdResult instanceof DirectMetaProperty);
    assertTrue(actualIdResult instanceof DirectMetaProperty);
    assertTrue(actualPriceInfoResult instanceof DirectMetaProperty);
    assertTrue(metaResult.type() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then return name is {@code attributes}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'attributes'; then return name is 'attributes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenAttributes_thenReturnNameIsAttributes() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdContractSpec.meta().metaPropertyGet("attributes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).contractCode() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).description() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).exchangeId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).priceInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("attributes", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).attributes());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code contractCode}.
   *   <li>Then return name is {@code contractCode}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'contractCode'; then return name is 'contractCode'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenContractCode_thenReturnNameIsContractCode() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdContractSpec.meta().metaPropertyGet("contractCode");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).description() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).exchangeId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).priceInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("contractCode", actualMetaPropertyGetResult.name());
    Class<EtdContractCode> expectedPropertyTypeResult = EtdContractCode.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).contractCode());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code description}.
   *   <li>Then return name is {@code description}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'description'; then return name is 'description'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDescription_thenReturnNameIsDescription() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdContractSpec.meta().metaPropertyGet("description");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).contractCode() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).exchangeId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).priceInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("description", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).description());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code exchangeId}.
   *   <li>Then return name is {@code exchangeId}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'exchangeId'; then return name is 'exchangeId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExchangeId_thenReturnNameIsExchangeId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdContractSpec.meta().metaPropertyGet("exchangeId");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).contractCode() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).description() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).priceInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("exchangeId", actualMetaPropertyGetResult.name());
    Class<ExchangeId> expectedPropertyTypeResult = ExchangeId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).exchangeId());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then return name is {@code id}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'id'; then return name is 'id'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenId_thenReturnNameIsId() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = EtdContractSpec.meta().metaPropertyGet("id");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).contractCode() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).description() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).exchangeId() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).priceInfo() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("id", actualMetaPropertyGetResult.name());
    Class<EtdContractSpecId> expectedPropertyTypeResult = EtdContractSpecId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).id());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code priceInfo}.
   *   <li>Then return name is {@code priceInfo}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'priceInfo'; then return name is 'priceInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPriceInfo_thenReturnNameIsPriceInfo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        EtdContractSpec.meta().metaPropertyGet("priceInfo");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).contractCode() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).description() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).exchangeId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).type() instanceof DirectMetaProperty);
    assertEquals("priceInfo", actualMetaPropertyGetResult.name());
    Class<SecurityPriceInfo> expectedPropertyTypeResult = SecurityPriceInfo.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).priceInfo());
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
    assertNull(EtdContractSpec.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code type}.
   *   <li>Then return name is {@code type}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'type'; then return name is 'type'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenType_thenReturnNameIsType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = EtdContractSpec.meta().metaPropertyGet("type");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).contractCode() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).description() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).exchangeId() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).priceInfo() instanceof DirectMetaProperty);
    assertEquals("type", actualMetaPropertyGetResult.name());
    Class<EtdType> expectedPropertyTypeResult = EtdType.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).type());
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
        EtdContractSpec.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("attributes") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("contractCode") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("description") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("exchangeId") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("id") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("priceInfo") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("type") instanceof DirectMetaProperty);
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
    assertNull(EtdContractSpec.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> EtdContractSpec.meta().propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'attributes'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAttributes_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            EtdContractSpec.meta().propertySet(mock(Bean.class), "attributes", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code contractCode}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'contractCode'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenContractCode_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            EtdContractSpec.meta()
                .propertySet(mock(Bean.class), "contractCode", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code description}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'description'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDescription_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            EtdContractSpec.meta().propertySet(mock(Bean.class), "description", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code exchangeId}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'exchangeId'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExchangeId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            EtdContractSpec.meta().propertySet(mock(Bean.class), "exchangeId", "New Value", true));
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
            EtdContractSpec.meta().propertySet(mock(Bean.class), "attributes", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'id'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenId_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> EtdContractSpec.meta().propertySet(mock(Bean.class), "id", "New Value", true));
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
            EtdContractSpec.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
