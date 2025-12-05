package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeInfoBuilderDiffblueTest {
  /**
   * Test {@link TradeInfoBuilder#TradeInfoBuilder(StandardId, StandardId, LocalDate, LocalTime,
   * ZoneId, LocalDate, Map)}.
   *
   * <ul>
   *   <li>Then return build AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfoBuilder#TradeInfoBuilder(StandardId, StandardId,
   * LocalDate, LocalTime, ZoneId, LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test new TradeInfoBuilder(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map); then return build AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeInfoBuilder.<init>(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)"
  })
  void testNewTradeInfoBuilder_thenReturnBuildAttributeTypesSizeIsOne() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    ZoneOffset zone = ZoneOffset.ofTotalSeconds(1);
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");

    // Act
    TradeInfoBuilder actualTradeInfoBuilder =
        new TradeInfoBuilder(
            null, null, tradeDate, LocalTime.MIDNIGHT, zone, settlementDate, attributes);

    // Assert
    TradeInfo tradeInfo = actualTradeInfoBuilder.build();
    assertEquals(1, tradeInfo.getAttributeTypes().size());
    Optional<StandardId> counterparty = tradeInfo.getCounterparty();
    assertFalse(counterparty.isPresent());
    Optional<LocalDate> settlementDate2 = tradeInfo.getSettlementDate();
    assertTrue(settlementDate2.isPresent());
    Optional<LocalTime> tradeTime = tradeInfo.getTradeTime();
    assertTrue(tradeTime.isPresent());
    Optional<ZoneId> zone2 = tradeInfo.getZone();
    assertTrue(zone2.isPresent());
    assertEquals(attributes, tradeInfo.getAttributes());
    assertEquals(settlementDate2, tradeInfo.getTradeDate());
    assertSame(counterparty, tradeInfo.getId());
    assertSame(settlementDate, settlementDate2.get());
    assertSame(zone, zone2.get());
    assertSame(LocalTime.MIN, tradeTime.get());
  }

  /**
   * Test {@link TradeInfoBuilder#TradeInfoBuilder(StandardId, StandardId, LocalDate, LocalTime,
   * ZoneId, LocalDate, Map)}.
   *
   * <ul>
   *   <li>Then return build AttributeTypes size is two.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfoBuilder#TradeInfoBuilder(StandardId, StandardId,
   * LocalDate, LocalTime, ZoneId, LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test new TradeInfoBuilder(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map); then return build AttributeTypes size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeInfoBuilder.<init>(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)"
  })
  void testNewTradeInfoBuilder_thenReturnBuildAttributeTypesSizeIsTwo() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    ZoneOffset zone = ZoneOffset.ofTotalSeconds(1);
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");

    // Act
    TradeInfoBuilder actualTradeInfoBuilder =
        new TradeInfoBuilder(
            null, null, tradeDate, LocalTime.MIDNIGHT, zone, settlementDate, attributes);

    // Assert
    TradeInfo tradeInfo = actualTradeInfoBuilder.build();
    assertEquals(2, tradeInfo.getAttributeTypes().size());
    Optional<StandardId> counterparty = tradeInfo.getCounterparty();
    assertFalse(counterparty.isPresent());
    Optional<LocalDate> settlementDate2 = tradeInfo.getSettlementDate();
    assertTrue(settlementDate2.isPresent());
    Optional<LocalTime> tradeTime = tradeInfo.getTradeTime();
    assertTrue(tradeTime.isPresent());
    Optional<ZoneId> zone2 = tradeInfo.getZone();
    assertTrue(zone2.isPresent());
    assertEquals(attributes, tradeInfo.getAttributes());
    assertEquals(settlementDate2, tradeInfo.getTradeDate());
    assertSame(counterparty, tradeInfo.getId());
    assertSame(settlementDate, settlementDate2.get());
    assertSame(zone, zone2.get());
    assertSame(LocalTime.MIN, tradeTime.get());
  }

  /**
   * Test {@link TradeInfoBuilder#TradeInfoBuilder(StandardId, StandardId, LocalDate, LocalTime,
   * ZoneId, LocalDate, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return build AttributeTypes Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfoBuilder#TradeInfoBuilder(StandardId, StandardId,
   * LocalDate, LocalTime, ZoneId, LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test new TradeInfoBuilder(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map); when HashMap(); then return build AttributeTypes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeInfoBuilder.<init>(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)"
  })
  void testNewTradeInfoBuilder_whenHashMap_thenReturnBuildAttributeTypesEmpty() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    ZoneOffset zone = ZoneOffset.ofTotalSeconds(1);
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();

    // Act
    TradeInfoBuilder actualTradeInfoBuilder =
        new TradeInfoBuilder(
            null, null, tradeDate, LocalTime.MIDNIGHT, zone, settlementDate, attributes);

    // Assert
    TradeInfo tradeInfo = actualTradeInfoBuilder.build();
    Optional<StandardId> counterparty = tradeInfo.getCounterparty();
    assertFalse(counterparty.isPresent());
    assertTrue(tradeInfo.getAttributeTypes().isEmpty());
    Optional<LocalDate> settlementDate2 = tradeInfo.getSettlementDate();
    assertTrue(settlementDate2.isPresent());
    Optional<LocalTime> tradeTime = tradeInfo.getTradeTime();
    assertTrue(tradeTime.isPresent());
    Optional<ZoneId> zone2 = tradeInfo.getZone();
    assertTrue(zone2.isPresent());
    assertEquals(attributes, tradeInfo.getAttributes());
    assertEquals(settlementDate2, tradeInfo.getTradeDate());
    assertSame(counterparty, tradeInfo.getId());
    assertSame(settlementDate, settlementDate2.get());
    assertSame(zone, zone2.get());
    assertSame(LocalTime.MIN, tradeTime.get());
  }

  /**
   * Test {@link TradeInfoBuilder#id(StandardId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfoBuilder#id(StandardId)}
   */
  @Test
  @DisplayName("Test id(StandardId); when 'null'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfoBuilder TradeInfoBuilder.id(StandardId)"})
  void testId_whenNull_thenReturnBuilder() {
    // Arrange
    TradeInfoBuilder builderResult = TradeInfo.builder();

    // Act
    TradeInfoBuilder actualIdResult = builderResult.id(null);

    // Assert
    assertSame(builderResult, actualIdResult);
  }

  /**
   * Test {@link TradeInfoBuilder#addAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then builder build AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfoBuilder#addAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test addAttribute(AttributeType, Object); given builder; then builder build AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfoBuilder TradeInfoBuilder.addAttribute(AttributeType, Object)"})
  void testAddAttribute_givenBuilder_thenBuilderBuildAttributeTypesSizeIsOne() {
    // Arrange
    TradeInfoBuilder builderResult = TradeInfo.builder();
    Class<Object> type = Object.class;
    AttributeType<Object> attributeType = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    builderResult.addAttribute(attributeType, "Attribute Value");

    // Assert
    TradeInfo tradeInfo = builderResult.build();
    assertEquals(1, tradeInfo.getAttributeTypes().size());
    assertEquals(1, tradeInfo.getAttributes().size());
  }

  /**
   * Test {@link TradeInfoBuilder#addAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then builder build AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfoBuilder#addAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test addAttribute(AttributeType, Object); given 'java.lang.Object'; then builder build AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfoBuilder TradeInfoBuilder.addAttribute(AttributeType, Object)"})
  void testAddAttribute_givenJavaLangObject_thenBuilderBuildAttributeTypesSizeIsOne() {
    // Arrange
    TradeInfoBuilder builderResult = TradeInfo.builder();
    Class<Object> type = Object.class;
    AttributeType<Object> attributeType = AttributeType.registerInstance("Name", type, "Aliases");
    builderResult.addAttribute(attributeType, "Attribute Value");
    Class<Object> type2 = Object.class;
    AttributeType<Object> attributeType2 = AttributeType.registerInstance("Name", type2, "Aliases");

    // Act
    builderResult.addAttribute(attributeType2, "Attribute Value");

    // Assert that nothing has changed
    TradeInfo tradeInfo = builderResult.build();
    assertEquals(1, tradeInfo.getAttributeTypes().size());
    assertEquals(1, tradeInfo.getAttributes().size());
  }
}
