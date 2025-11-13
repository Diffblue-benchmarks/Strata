package com.opengamma.strata.market.observable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LegalEntityInformationIdDiffblueTest {
  /**
   * Test {@link LegalEntityInformationId#of(StandardId)} with {@code StandardId}.
   *
   * <ul>
   *   <li>Then return MarketDataType is {@link LegalEntityInformation}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformationId#of(StandardId)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId) with 'StandardId'; then return MarketDataType is LegalEntityInformation")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityInformationId LegalEntityInformationId.of(StandardId)"})
  void testOfWithStandardId_thenReturnMarketDataTypeIsLegalEntityInformation() {
    // Arrange
    StandardId legalEntityId = StandardId.of("Scheme", "42");

    // Act
    LegalEntityInformationId actualOfResult = LegalEntityInformationId.of(legalEntityId);

    // Assert
    Class<LegalEntityInformation> expectedMarketDataType = LegalEntityInformation.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(legalEntityId, actualOfResult.getLegalEntityId());
  }

  /**
   * Test {@link LegalEntityInformationId#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code 42~42}.
   *   <li>Then return LegalEntityId Scheme is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformationId#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'String'; when '42~42'; then return LegalEntityId Scheme is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LegalEntityInformationId LegalEntityInformationId.of(String)"})
  void testOfWithString_when4242_thenReturnLegalEntityIdSchemeIs42() {
    // Arrange and Act
    LegalEntityInformationId actualOfResult = LegalEntityInformationId.of("42~42");

    // Assert
    StandardId legalEntityId = actualOfResult.getLegalEntityId();
    assertEquals("42", legalEntityId.getScheme());
    assertEquals("42", legalEntityId.getValue());
    Class<LegalEntityInformation> expectedMarketDataType = LegalEntityInformation.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test {@link LegalEntityInformationId#meta()}.
   *
   * <p>Method under test: {@link LegalEntityInformationId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LegalEntityInformationId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<LegalEntityInformationId> actualMetaResult = LegalEntityInformationId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("legalEntityId"));
    assertTrue(actualMetaResult.isBuildable());
    Class<LegalEntityInformationId> expectedBeanTypeResult = LegalEntityInformationId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link LegalEntityInformationId#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityInformationId#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given StandardId with 'Scheme' and value is '42'; then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean LegalEntityInformationId.metaBean()"})
  void testMetaBean_givenStandardIdWithSchemeAndValueIs42_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<LegalEntityInformationId> actualMetaBeanResult =
        LegalEntityInformationId.of(StandardId.of("Scheme", "42")).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("legalEntityId"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<LegalEntityInformationId> expectedBeanTypeResult = LegalEntityInformationId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
