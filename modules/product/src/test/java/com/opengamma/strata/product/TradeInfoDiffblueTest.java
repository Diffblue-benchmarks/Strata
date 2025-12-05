package com.opengamma.strata.product;

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
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.product.TradeInfo.Meta;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeInfoDiffblueTest {
  /**
   * Test {@link TradeInfo#empty()}.
   *
   * <p>Method under test: {@link TradeInfo#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.empty()"})
  void testEmpty() {
    // Arrange and Act
    TradeInfo actualEmptyResult = TradeInfo.empty();

    // Assert
    Optional<StandardId> counterparty = actualEmptyResult.getCounterparty();
    assertFalse(counterparty.isPresent());
    assertTrue(actualEmptyResult.getAttributes().isEmpty());
    assertTrue(actualEmptyResult.getAttributeTypes().isEmpty());
    assertSame(counterparty, actualEmptyResult.getId());
    assertSame(counterparty, actualEmptyResult.getSettlementDate());
    assertSame(counterparty, actualEmptyResult.getTradeDate());
    assertSame(counterparty, actualEmptyResult.getTradeTime());
    assertSame(counterparty, actualEmptyResult.getZone());
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
    Class<? extends TradeInfo> actualBeanTypeResult = TradeInfo.meta().beanType();

    // Assert
    Class<TradeInfo> expectedBeanTypeResult = TradeInfo.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#attributes()}
   *   <li>{@link Meta#counterparty()}
   *   <li>{@link Meta#id()}
   *   <li>{@link Meta#settlementDate()}
   *   <li>{@link Meta#tradeDate()}
   *   <li>{@link Meta#tradeTime()}
   *   <li>{@link Meta#zone()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.attributes()",
    "MetaProperty Meta.counterparty()",
    "MetaProperty Meta.id()",
    "MetaProperty Meta.settlementDate()",
    "MetaProperty Meta.tradeDate()",
    "MetaProperty Meta.tradeTime()",
    "MetaProperty Meta.zone()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act
    MetaProperty<ImmutableMap<AttributeType<?>, Object>> actualAttributesResult =
        metaResult.attributes();
    MetaProperty<StandardId> actualCounterpartyResult = metaResult.counterparty();
    MetaProperty<StandardId> actualIdResult = metaResult.id();
    MetaProperty<LocalDate> actualSettlementDateResult = metaResult.settlementDate();
    MetaProperty<LocalDate> actualTradeDateResult = metaResult.tradeDate();
    MetaProperty<LocalTime> actualTradeTimeResult = metaResult.tradeTime();

    // Assert
    assertTrue(actualAttributesResult instanceof DirectMetaProperty);
    assertTrue(actualCounterpartyResult instanceof DirectMetaProperty);
    assertTrue(actualIdResult instanceof DirectMetaProperty);
    assertTrue(actualSettlementDateResult instanceof DirectMetaProperty);
    assertTrue(actualTradeDateResult instanceof DirectMetaProperty);
    assertTrue(actualTradeTimeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zone() instanceof DirectMetaProperty);
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
    MetaProperty<?> actualMetaPropertyGetResult = TradeInfo.meta().metaPropertyGet("attributes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).counterparty() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zone() instanceof DirectMetaProperty);
    assertEquals("attributes", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).attributes());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code counterparty}.
   *   <li>Then return name is {@code counterparty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'counterparty'; then return name is 'counterparty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCounterparty_thenReturnNameIsCounterparty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeInfo.meta().metaPropertyGet("counterparty");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zone() instanceof DirectMetaProperty);
    assertEquals("counterparty", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).counterparty());
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
    MetaProperty<?> actualMetaPropertyGetResult = TradeInfo.meta().metaPropertyGet("id");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).counterparty() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zone() instanceof DirectMetaProperty);
    assertEquals("id", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).id());
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
    assertNull(TradeInfo.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then return name is {@code settlementDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'settlementDate'; then return name is 'settlementDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSettlementDate_thenReturnNameIsSettlementDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TradeInfo.meta().metaPropertyGet("settlementDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).counterparty() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zone() instanceof DirectMetaProperty);
    assertEquals("settlementDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).settlementDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code tradeDate}.
   *   <li>Then return name is {@code tradeDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'tradeDate'; then return name is 'tradeDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTradeDate_thenReturnNameIsTradeDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeInfo.meta().metaPropertyGet("tradeDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).counterparty() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeTime() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zone() instanceof DirectMetaProperty);
    assertEquals("tradeDate", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tradeDate());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code tradeTime}.
   *   <li>Then return name is {@code tradeTime}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'tradeTime'; then return name is 'tradeTime'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTradeTime_thenReturnNameIsTradeTime() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeInfo.meta().metaPropertyGet("tradeTime");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).counterparty() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zone() instanceof DirectMetaProperty);
    assertEquals("tradeTime", actualMetaPropertyGetResult.name());
    Class<LocalTime> expectedPropertyTypeResult = LocalTime.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).tradeTime());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zone}.
   *   <li>Then return name is {@code zone}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'zone'; then return name is 'zone'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZone_thenReturnNameIsZone() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeInfo.meta().metaPropertyGet("zone");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).attributes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).counterparty() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).id() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).settlementDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeDate() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).tradeTime() instanceof DirectMetaProperty);
    assertEquals("zone", actualMetaPropertyGetResult.name());
    Class<ZoneId> expectedPropertyTypeResult = ZoneId.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zone());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = TradeInfo.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("attributes") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("counterparty") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("id") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("settlementDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("tradeDate") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("tradeTime") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zone") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'attributes'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenAttributes_thenReturnMap() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(TradeInfo.empty(), "attributes", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
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
    assertNull(TradeInfo.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code counterparty}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'counterparty'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCounterparty_thenReturnNull() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(TradeInfo.empty(), "counterparty", true));
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
    Meta metaResult = TradeInfo.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(TradeInfo.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code id}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'id'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenId_thenReturnNull() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(TradeInfo.empty(), "id", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'settlementDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSettlementDate_thenReturnNull() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(TradeInfo.empty(), "settlementDate", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code tradeDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'tradeDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTradeDate_thenReturnNull() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(TradeInfo.empty(), "tradeDate", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code tradeTime}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'tradeTime'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTradeTime_thenReturnNull() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(TradeInfo.empty(), "tradeTime", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code zone}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'zone'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenZone_thenReturnNull() {
    // Arrange
    Meta metaResult = TradeInfo.meta();

    // Act and Assert
    assertNull(metaResult.propertyGet(TradeInfo.empty(), "zone", true));
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
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "attributes", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code attributes}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'attributes'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenAttributes_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "attributes", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code counterparty}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'counterparty'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCounterparty_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "counterparty", "New Value", true));
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
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "id", "New Value", true));
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
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code settlementDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'settlementDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSettlementDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "settlementDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code tradeDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'tradeDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTradeDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "tradeDate", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code tradeTime}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'tradeTime'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenTradeTime_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "tradeTime", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zone}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zone'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZone_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> TradeInfo.meta().propertySet(mock(Bean.class), "zone", "New Value", false));
  }

  /**
   * Test {@link TradeInfo#of(LocalDate)}.
   *
   * <p>Method under test: {@link TradeInfo#of(LocalDate)}
   */
  @Test
  @DisplayName("Test of(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.of(LocalDate)"})
  void testOf() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);

    // Act
    TradeInfo actualOfResult = TradeInfo.of(tradeDate);

    // Assert
    Optional<StandardId> counterparty = actualOfResult.getCounterparty();
    assertFalse(counterparty.isPresent());
    assertTrue(actualOfResult.getAttributes().isEmpty());
    assertTrue(actualOfResult.getAttributeTypes().isEmpty());
    Optional<LocalDate> tradeDate2 = actualOfResult.getTradeDate();
    assertTrue(tradeDate2.isPresent());
    assertSame(counterparty, actualOfResult.getId());
    assertSame(counterparty, actualOfResult.getSettlementDate());
    assertSame(counterparty, actualOfResult.getTradeTime());
    assertSame(counterparty, actualOfResult.getZone());
    assertSame(tradeDate, tradeDate2.get());
  }

  /**
   * Test {@link TradeInfo#from(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link TradeInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.from(PortfolioItemInfo)"})
  void testFrom() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributeType", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualFromResult = TradeInfo.from(info);

    // Assert
    assertEquals(2, actualFromResult.getAttributeTypes().size());
    assertEquals(2, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#from(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link TradeInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.from(PortfolioItemInfo)"})
  void testFrom2() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualFromResult = TradeInfo.from(info);

    // Assert
    assertEquals(2, actualFromResult.getAttributeTypes().size());
    assertEquals(2, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code AttributeType}.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test from(PortfolioItemInfo); given 'com.opengamma.strata.product.AttributeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.from(PortfolioItemInfo)"})
  void testFrom_givenComOpengammaStrataProductAttributeType() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualFromResult = TradeInfo.from(info);

    // Assert
    assertEquals(1, actualFromResult.getAttributeTypes().size());
    assertEquals(1, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test from(PortfolioItemInfo); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.from(PortfolioItemInfo)"})
  void testFrom_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo info = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualFromResult = TradeInfo.from(info);

    // Assert
    assertEquals(1, actualFromResult.getAttributeTypes().size());
    assertEquals(1, actualFromResult.getAttributes().size());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#from(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#from(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test from(PortfolioItemInfo); when StandardId with 'Scheme' and value is '42'; then return Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.from(PortfolioItemInfo)"})
  void testFrom_whenStandardIdWithSchemeAndValueIs42_thenReturnAttributesEmpty() {
    // Arrange
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo info = new ItemInfo(id, new HashMap<>());

    // Act
    TradeInfo actualFromResult = TradeInfo.from(info);

    // Assert
    assertTrue(actualFromResult.getAttributes().isEmpty());
    assertTrue(actualFromResult.getAttributeTypes().isEmpty());
    Optional<StandardId> id2 = actualFromResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#withId(StandardId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#withId(StandardId)}
   */
  @Test
  @DisplayName("Test withId(StandardId); when 'null'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.withId(StandardId)"})
  void testWithId_whenNull_thenReturnEmpty() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    // Act
    TradeInfo actualWithIdResult = emptyResult.withId(null);

    // Assert
    assertEquals(emptyResult, actualWithIdResult);
  }

  /**
   * Test {@link TradeInfo#getAttributeTypes()}.
   *
   * <p>Method under test: {@link TradeInfo#getAttributeTypes()}
   */
  @Test
  @DisplayName("Test getAttributeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet TradeInfo.getAttributeTypes()"})
  void testGetAttributeTypes() {
    // Arrange, Act and Assert
    assertTrue(TradeInfo.empty().getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link TradeInfo#findAttribute(AttributeType)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#findAttribute(AttributeType)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(AttributeType); when 'java.lang.Object'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeInfo.findAttribute(AttributeType)"})
  void testFindAttribute_whenJavaLangObject_thenReturnNotPresent() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act and Assert
    assertFalse(emptyResult.findAttribute(type2).isPresent());
  }

  /**
   * Test {@link TradeInfo#withAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#withAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test withAttribute(AttributeType, Object); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.withAttribute(AttributeType, Object)"})
  void testWithAttribute_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    TradeInfo actualWithAttributeResult = emptyResult.withAttribute(type2, "Value");

    // Assert
    assertEquals(1, actualWithAttributeResult.getAttributeTypes().size());
    assertEquals(1, actualWithAttributeResult.getAttributes().size());
  }

  /**
   * Test {@link TradeInfo#withAttributes(Attributes)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#withAttributes(Attributes)}
   */
  @Test
  @DisplayName(
      "Test withAttributes(Attributes); when 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.withAttributes(Attributes)"})
  void testWithAttributes_whenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();
    Class<Object> type = Object.class;
    AttributeType<Object> type2 = AttributeType.registerInstance("attributes", type, "attributes");

    // Act
    TradeInfo actualWithAttributesResult =
        emptyResult.withAttributes(SimpleAttributes.of(type2, "Value"));

    // Assert
    assertEquals(1, actualWithAttributesResult.getAttributeTypes().size());
    assertEquals(1, actualWithAttributesResult.getAttributes().size());
  }

  /**
   * Test {@link TradeInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link TradeInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributeType", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    TradeInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(2, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(2, actualCombinedWithResult.getAttributes().size());
  }

  /**
   * Test {@link TradeInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link TradeInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test combinedWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith2() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    TradeInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(2, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(2, actualCombinedWithResult.getAttributes().size());
  }

  /**
   * Test {@link TradeInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code AttributeType}.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); given 'com.opengamma.strata.product.AttributeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenComOpengammaStrataProductAttributeType() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    TradeInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(1, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(1, actualCombinedWithResult.getAttributes().size());
  }

  /**
   * Test {@link TradeInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    ItemInfo other = new ItemInfo(StandardId.of("Scheme", "42"), attributes);

    // Act
    TradeInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertEquals(1, actualCombinedWithResult.getAttributeTypes().size());
    assertEquals(1, actualCombinedWithResult.getAttributes().size());
  }

  /**
   * Test {@link TradeInfo#combinedWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Id Present.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#combinedWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(PortfolioItemInfo); when StandardId with 'Scheme' and value is '42'; then return Id Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.combinedWith(PortfolioItemInfo)"})
  void testCombinedWith_whenStandardIdWithSchemeAndValueIs42_thenReturnIdPresent() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();
    StandardId id = StandardId.of("Scheme", "42");
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    Optional<StandardId> id2 = actualCombinedWithResult.getId();
    assertTrue(id2.isPresent());
    assertEquals(attributes, actualCombinedWithResult.getAttributes());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link TradeInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributeType", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(2, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(2, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <p>Method under test: {@link TradeInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName("Test overrideWith(PortfolioItemInfo)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith2() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("BuySell", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("Name", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(2, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(2, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code AttributeType}.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); given 'com.opengamma.strata.product.AttributeType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_givenComOpengammaStrataProductAttributeType() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<AttributeType> type = AttributeType.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(1, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(1, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    StandardId id = StandardId.of("Scheme", "42");

    ItemInfo other = new ItemInfo(id, attributes);

    // Act
    TradeInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(1, actualOverrideWithResult.getAttributeTypes().size());
    assertEquals(1, actualOverrideWithResult.getAttributes().size());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>Then return {@link TradeInfo} with tradeDate is {@link LocalDate}.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); then return TradeInfo with tradeDate is LocalDate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_thenReturnTradeInfoWithTradeDateIsLocalDate() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();
    TradeInfo other = TradeInfo.of(LocalDate.of(1970, 1, 1));

    // Act
    TradeInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertEquals(other, actualOverrideWithResult);
  }

  /**
   * Test {@link TradeInfo#overrideWith(PortfolioItemInfo)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return Attributes Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#overrideWith(PortfolioItemInfo)}
   */
  @Test
  @DisplayName(
      "Test overrideWith(PortfolioItemInfo); when StandardId with 'Scheme' and value is '42'; then return Attributes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeInfo TradeInfo.overrideWith(PortfolioItemInfo)"})
  void testOverrideWith_whenStandardIdWithSchemeAndValueIs42_thenReturnAttributesEmpty() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();
    StandardId id = StandardId.of("Scheme", "42");
    ItemInfo other = new ItemInfo(id, new HashMap<>());

    // Act
    TradeInfo actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertTrue(actualOverrideWithResult.getAttributes().isEmpty());
    assertTrue(actualOverrideWithResult.getAttributeTypes().isEmpty());
    Optional<StandardId> id2 = actualOverrideWithResult.getId();
    assertTrue(id2.isPresent());
    assertSame(id, id2.get());
  }

  /**
   * Test {@link TradeInfo#meta()}.
   *
   * <p>Method under test: {@link TradeInfo#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeInfo.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TradeInfo.meta();

    // Assert
    assertTrue(actualMetaResult.attributes() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.counterparty() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.id() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.settlementDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.tradeDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.tradeTime() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zone() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId,
   * LocalDate, Map)}.
   *
   * <p>Method under test: {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime,
   * ZoneId, LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test new TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeInfo.<init>(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)"
  })
  void testNewTradeInfo() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    ZoneOffset zone = ZoneOffset.ofTotalSeconds(1);
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("attributes", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");

    // Act
    TradeInfo actualTradeInfo =
        new TradeInfo(null, null, tradeDate, LocalTime.MIDNIGHT, zone, settlementDate, attributes);

    // Assert
    assertEquals(2, actualTradeInfo.getAttributeTypes().size());
    Optional<StandardId> counterparty = actualTradeInfo.getCounterparty();
    assertFalse(counterparty.isPresent());
    Optional<LocalDate> settlementDate2 = actualTradeInfo.getSettlementDate();
    assertTrue(settlementDate2.isPresent());
    Optional<LocalTime> tradeTime = actualTradeInfo.getTradeTime();
    assertTrue(tradeTime.isPresent());
    Optional<ZoneId> zone2 = actualTradeInfo.getZone();
    assertTrue(zone2.isPresent());
    assertEquals(attributes, actualTradeInfo.getAttributes());
    assertEquals(settlementDate2, actualTradeInfo.getTradeDate());
    assertSame(counterparty, actualTradeInfo.getId());
    assertSame(settlementDate, settlementDate2.get());
    assertSame(zone, zone2.get());
    assertSame(LocalTime.MIN, tradeTime.get());
  }

  /**
   * Test {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId,
   * LocalDate, Map)}.
   *
   * <p>Method under test: {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime,
   * ZoneId, LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test new TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeInfo.<init>(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)"
  })
  void testNewTradeInfo2() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    ZoneOffset zone = ZoneOffset.ofTotalSeconds(1);
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult = AttributeType.registerInstance("42", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");
    Class<Object> type2 = Object.class;
    AttributeType<?> registerInstanceResult2 =
        AttributeType.registerInstance("attributes", type2, "Aliases");
    attributes.put(registerInstanceResult2, "Value");

    // Act
    TradeInfo actualTradeInfo =
        new TradeInfo(null, null, tradeDate, LocalTime.MIDNIGHT, zone, settlementDate, attributes);

    // Assert
    assertEquals(2, actualTradeInfo.getAttributeTypes().size());
    Optional<StandardId> counterparty = actualTradeInfo.getCounterparty();
    assertFalse(counterparty.isPresent());
    Optional<LocalDate> settlementDate2 = actualTradeInfo.getSettlementDate();
    assertTrue(settlementDate2.isPresent());
    Optional<LocalTime> tradeTime = actualTradeInfo.getTradeTime();
    assertTrue(tradeTime.isPresent());
    Optional<ZoneId> zone2 = actualTradeInfo.getZone();
    assertTrue(zone2.isPresent());
    assertEquals(attributes, actualTradeInfo.getAttributes());
    assertEquals(settlementDate2, actualTradeInfo.getTradeDate());
    assertSame(counterparty, actualTradeInfo.getId());
    assertSame(settlementDate, settlementDate2.get());
    assertSame(zone, zone2.get());
    assertSame(LocalTime.MIN, tradeTime.get());
  }

  /**
   * Test {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId,
   * LocalDate, Map)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime,
   * ZoneId, LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test new TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map); given 'java.lang.Object'; then return AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeInfo.<init>(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)"
  })
  void testNewTradeInfo_givenJavaLangObject_thenReturnAttributeTypesSizeIsOne() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    ZoneOffset zone = ZoneOffset.ofTotalSeconds(1);
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);

    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("attributes", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");

    // Act
    TradeInfo actualTradeInfo =
        new TradeInfo(null, null, tradeDate, LocalTime.MIDNIGHT, zone, settlementDate, attributes);

    // Assert
    assertEquals(1, actualTradeInfo.getAttributeTypes().size());
    Optional<StandardId> counterparty = actualTradeInfo.getCounterparty();
    assertFalse(counterparty.isPresent());
    Optional<LocalDate> settlementDate2 = actualTradeInfo.getSettlementDate();
    assertTrue(settlementDate2.isPresent());
    Optional<LocalTime> tradeTime = actualTradeInfo.getTradeTime();
    assertTrue(tradeTime.isPresent());
    Optional<ZoneId> zone2 = actualTradeInfo.getZone();
    assertTrue(zone2.isPresent());
    assertEquals(attributes, actualTradeInfo.getAttributes());
    assertEquals(settlementDate2, actualTradeInfo.getTradeDate());
    assertSame(counterparty, actualTradeInfo.getId());
    assertSame(settlementDate, settlementDate2.get());
    assertSame(zone, zone2.get());
    assertSame(LocalTime.MIN, tradeTime.get());
  }

  /**
   * Test {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId,
   * LocalDate, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return AttributeTypes Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#TradeInfo(StandardId, StandardId, LocalDate, LocalTime,
   * ZoneId, LocalDate, Map)}
   */
  @Test
  @DisplayName(
      "Test new TradeInfo(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map); when HashMap(); then return AttributeTypes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void TradeInfo.<init>(StandardId, StandardId, LocalDate, LocalTime, ZoneId, LocalDate, Map)"
  })
  void testNewTradeInfo_whenHashMap_thenReturnAttributeTypesEmpty() {
    // Arrange
    LocalDate tradeDate = LocalDate.of(1970, 1, 1);
    ZoneOffset zone = ZoneOffset.ofTotalSeconds(1);
    LocalDate settlementDate = LocalDate.of(1970, 1, 1);
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();

    // Act
    TradeInfo actualTradeInfo =
        new TradeInfo(null, null, tradeDate, LocalTime.MIDNIGHT, zone, settlementDate, attributes);

    // Assert
    Optional<StandardId> counterparty = actualTradeInfo.getCounterparty();
    assertFalse(counterparty.isPresent());
    assertTrue(actualTradeInfo.getAttributeTypes().isEmpty());
    Optional<LocalDate> settlementDate2 = actualTradeInfo.getSettlementDate();
    assertTrue(settlementDate2.isPresent());
    Optional<LocalTime> tradeTime = actualTradeInfo.getTradeTime();
    assertTrue(tradeTime.isPresent());
    Optional<ZoneId> zone2 = actualTradeInfo.getZone();
    assertTrue(zone2.isPresent());
    assertEquals(attributes, actualTradeInfo.getAttributes());
    assertEquals(settlementDate2, actualTradeInfo.getTradeDate());
    assertSame(counterparty, actualTradeInfo.getId());
    assertSame(settlementDate, settlementDate2.get());
    assertSame(zone, zone2.get());
    assertSame(LocalTime.MIN, tradeTime.get());
  }

  /**
   * Test {@link TradeInfo#metaBean()}.
   *
   * <p>Method under test: {@link TradeInfo#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeInfo.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, TradeInfo.empty().metaBean());
  }

  /**
   * Test {@link TradeInfo#getId()}.
   *
   * <p>Method under test: {@link TradeInfo#getId()}
   */
  @Test
  @DisplayName("Test getId()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeInfo.getId()"})
  void testGetId() {
    // Arrange, Act and Assert
    assertFalse(TradeInfo.empty().getId().isPresent());
  }

  /**
   * Test {@link TradeInfo#getCounterparty()}.
   *
   * <p>Method under test: {@link TradeInfo#getCounterparty()}
   */
  @Test
  @DisplayName("Test getCounterparty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeInfo.getCounterparty()"})
  void testGetCounterparty() {
    // Arrange, Act and Assert
    assertFalse(TradeInfo.empty().getCounterparty().isPresent());
  }

  /**
   * Test {@link TradeInfo#getTradeDate()}.
   *
   * <p>Method under test: {@link TradeInfo#getTradeDate()}
   */
  @Test
  @DisplayName("Test getTradeDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeInfo.getTradeDate()"})
  void testGetTradeDate() {
    // Arrange, Act and Assert
    assertFalse(TradeInfo.empty().getTradeDate().isPresent());
  }

  /**
   * Test {@link TradeInfo#getTradeTime()}.
   *
   * <p>Method under test: {@link TradeInfo#getTradeTime()}
   */
  @Test
  @DisplayName("Test getTradeTime()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeInfo.getTradeTime()"})
  void testGetTradeTime() {
    // Arrange, Act and Assert
    assertFalse(TradeInfo.empty().getTradeTime().isPresent());
  }

  /**
   * Test {@link TradeInfo#getZone()}.
   *
   * <p>Method under test: {@link TradeInfo#getZone()}
   */
  @Test
  @DisplayName("Test getZone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeInfo.getZone()"})
  void testGetZone() {
    // Arrange, Act and Assert
    assertFalse(TradeInfo.empty().getZone().isPresent());
  }

  /**
   * Test {@link TradeInfo#getSettlementDate()}.
   *
   * <p>Method under test: {@link TradeInfo#getSettlementDate()}
   */
  @Test
  @DisplayName("Test getSettlementDate()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional TradeInfo.getSettlementDate()"})
  void testGetSettlementDate() {
    // Arrange, Act and Assert
    assertFalse(TradeInfo.empty().getSettlementDate().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeInfo#toString()}
   *   <li>{@link TradeInfo#getAttributes()}
   *   <li>{@link TradeInfo#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap TradeInfo.getAttributes()",
    "TradeInfoBuilder TradeInfo.toBuilder()",
    "String TradeInfo.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    // Act
    String actualToStringResult = emptyResult.toString();
    ImmutableMap<AttributeType<?>, Object> actualAttributes = emptyResult.getAttributes();
    emptyResult.toBuilder();

    // Assert
    assertEquals(
        "TradeInfo{id=null, counterparty=null, tradeDate=null, tradeTime=null, zone=null, settlementDate=null,"
            + " attributes={}}",
        actualToStringResult);
    assertTrue(actualAttributes.isEmpty());
  }

  /**
   * Test {@link TradeInfo#equals(Object)}, and {@link TradeInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeInfo#equals(Object)}
   *   <li>{@link TradeInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeInfo.equals(Object)", "int TradeInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();
    TradeInfo emptyResult2 = TradeInfo.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link TradeInfo#equals(Object)}, and {@link TradeInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeInfo#equals(Object)}
   *   <li>{@link TradeInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeInfo.equals(Object)", "int TradeInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    TradeInfo ofResult = TradeInfo.of(LocalDate.of(1970, 1, 1));
    TradeInfo ofResult2 = TradeInfo.of(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TradeInfo#equals(Object)}, and {@link TradeInfo#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeInfo#equals(Object)}
   *   <li>{@link TradeInfo#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeInfo.equals(Object)", "int TradeInfo.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    TradeInfo emptyResult = TradeInfo.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link TradeInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeInfo.equals(Object)", "int TradeInfo.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    TradeInfo ofResult = TradeInfo.of(LocalDate.of(1970, 1, 1));

    // Act and Assert
    assertNotEquals(ofResult, TradeInfo.empty());
  }

  /**
   * Test {@link TradeInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeInfo.equals(Object)", "int TradeInfo.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(TradeInfo.empty(), null);
  }

  /**
   * Test {@link TradeInfo#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeInfo#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeInfo.equals(Object)", "int TradeInfo.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(TradeInfo.empty(), "Different type to TradeInfo");
  }
}
