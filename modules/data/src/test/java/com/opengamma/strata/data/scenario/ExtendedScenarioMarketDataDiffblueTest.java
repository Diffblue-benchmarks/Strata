package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.MarketDataId;
import java.util.ArrayList;
import java.util.Map;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExtendedScenarioMarketDataDiffblueTest {
  /**
   * Test {@link ExtendedScenarioMarketData#of(MarketDataId, MarketDataBox, ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return Value is {@link ScenarioMarketDataBox} with value is {@link
   *       DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedScenarioMarketData#of(MarketDataId, MarketDataBox,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataId, MarketDataBox, ScenarioMarketData); then return Value is ScenarioMarketDataBox with value is DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExtendedScenarioMarketData ExtendedScenarioMarketData.of(MarketDataId, MarketDataBox, ScenarioMarketData)"
  })
  void testOf_thenReturnValueIsScenarioMarketDataBoxWithValueIsDefaultScenarioArray() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> value2 = ScenarioMarketDataBox.of(value);

    // Act
    ExtendedScenarioMarketData<Object> actualOfResult =
        ExtendedScenarioMarketData.of(id, value2, ImmutableScenarioMarketData.empty());

    // Assert
    assertTrue(actualOfResult.getUnderlying() instanceof ImmutableScenarioMarketData);
    assertSame(value2, actualOfResult.getValue());
  }

  /**
   * Test {@link ExtendedScenarioMarketData#of(MarketDataId, MarketDataBox, ScenarioMarketData)}.
   *
   * <ul>
   *   <li>Then return Value is {@link SingleMarketDataBox} with {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedScenarioMarketData#of(MarketDataId, MarketDataBox,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataId, MarketDataBox, ScenarioMarketData); then return Value is SingleMarketDataBox with 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExtendedScenarioMarketData ExtendedScenarioMarketData.of(MarketDataId, MarketDataBox, ScenarioMarketData)"
  })
  void testOf_thenReturnValueIsSingleMarketDataBoxWithValue() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    SingleMarketDataBox<Object> value = SingleMarketDataBox.of("Value");

    // Act
    ExtendedScenarioMarketData<Object> actualOfResult =
        ExtendedScenarioMarketData.of(id, value, ImmutableScenarioMarketData.empty());

    // Assert
    assertTrue(actualOfResult.getUnderlying() instanceof ImmutableScenarioMarketData);
    assertSame(value, actualOfResult.getValue());
  }

  /**
   * Test {@link ExtendedScenarioMarketData#of(MarketDataId, MarketDataBox, ScenarioMarketData)}.
   *
   * <ul>
   *   <li>When {@link DefaultScenarioArray} with {@code Values}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedScenarioMarketData#of(MarketDataId, MarketDataBox,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataId, MarketDataBox, ScenarioMarketData); when DefaultScenarioArray with 'Values'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExtendedScenarioMarketData ExtendedScenarioMarketData.of(MarketDataId, MarketDataBox, ScenarioMarketData)"
  })
  void testOf_whenDefaultScenarioArrayWithValues_thenThrowIllegalArgumentException() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> value2 = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ExtendedScenarioMarketData.of(id, value2, ImmutableScenarioMarketData.empty()));
  }

  /**
   * Test {@link ExtendedScenarioMarketData#getIds()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedScenarioMarketData#getIds()}
   */
  @Test
  @DisplayName("Test getIds(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set ExtendedScenarioMarketData.getIds()"})
  void testGetIds_thenReturnSizeIsOne() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> value2 = ScenarioMarketDataBox.of(value);

    ExtendedScenarioMarketData<Object> ofResult =
        ExtendedScenarioMarketData.of(id, value2, ImmutableScenarioMarketData.empty());

    // Act and Assert
    assertEquals(1, ofResult.getIds().size());
  }

  /**
   * Test {@link ExtendedScenarioMarketData#meta()}.
   *
   * <p>Method under test: {@link ExtendedScenarioMarketData#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean ExtendedScenarioMarketData.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = ExtendedScenarioMarketData.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("id"));
    assertTrue(metaPropertyMapResult.containsKey("underlying"));
    assertTrue(metaPropertyMapResult.containsKey("value"));
    assertTrue(actualMetaResult.isBuildable());
    Class<ExtendedScenarioMarketData> expectedBeanTypeResult = ExtendedScenarioMarketData.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }
}
