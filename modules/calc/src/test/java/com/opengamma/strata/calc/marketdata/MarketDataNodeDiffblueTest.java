package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.calc.marketdata.MarketDataNode.DataType;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableId;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataNodeDiffblueTest {
  /**
   * Test {@link MarketDataNode#buildDependencyTree(MarketDataRequirements, ScenarioMarketData,
   * MarketDataConfig, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Id is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#buildDependencyTree(MarketDataRequirements,
   * ScenarioMarketData, MarketDataConfig, Map)}
   */
  @Test
  @DisplayName(
      "Test buildDependencyTree(MarketDataRequirements, ScenarioMarketData, MarketDataConfig, Map); when HashMap(); then return Id is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataNode MarketDataNode.buildDependencyTree(MarketDataRequirements, ScenarioMarketData, MarketDataConfig, Map)"
  })
  void testBuildDependencyTree_whenHashMap_thenReturnIdIsNull() {
    // Arrange
    MarketDataRequirements requirements = MarketDataRequirements.empty();
    BuiltScenarioMarketData suppliedData = BuiltScenarioMarketData.empty();
    MarketDataConfig marketDataConfig = MarketDataConfig.empty();

    // Act
    MarketDataNode actualBuildDependencyTreeResult =
        MarketDataNode.buildDependencyTree(
            requirements, suppliedData, marketDataConfig, new HashMap<>());

    // Assert
    assertNull(actualBuildDependencyTreeResult.getId());
    assertTrue(actualBuildDependencyTreeResult.isLeaf());
  }

  /**
   * Test {@link MarketDataNode#root(List)}.
   *
   * <ul>
   *   <li>Then return not Leaf.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#root(List)}
   */
  @Test
  @DisplayName("Test root(List); then return not Leaf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataNode MarketDataNode.root(List)"})
  void testRoot_thenReturnNotLeaf() {
    // Arrange
    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act
    MarketDataNode actualRootResult = MarketDataNode.root(children);

    // Assert
    assertNull(actualRootResult.getId());
    assertFalse(actualRootResult.isLeaf());
  }

  /**
   * Test {@link MarketDataNode#root(List)}.
   *
   * <ul>
   *   <li>Then return not Leaf.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#root(List)}
   */
  @Test
  @DisplayName("Test root(List); then return not Leaf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataNode MarketDataNode.root(List)"})
  void testRoot_thenReturnNotLeaf2() {
    // Arrange
    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()));
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id2, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act
    MarketDataNode actualRootResult = MarketDataNode.root(children);

    // Assert
    assertNull(actualRootResult.getId());
    assertFalse(actualRootResult.isLeaf());
  }

  /**
   * Test {@link MarketDataNode#root(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Leaf.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#root(List)}
   */
  @Test
  @DisplayName("Test root(List); when ArrayList(); then return Leaf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataNode MarketDataNode.root(List)"})
  void testRoot_whenArrayList_thenReturnLeaf() {
    // Arrange and Act
    MarketDataNode actualRootResult = MarketDataNode.root(new ArrayList<>());

    // Assert
    assertNull(actualRootResult.getId());
    assertTrue(actualRootResult.isLeaf());
  }

  /**
   * Test {@link MarketDataNode#child(MarketDataId, DataType, List)}.
   *
   * <ul>
   *   <li>Then return not Leaf.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#child(MarketDataId, DataType, List)}
   */
  @Test
  @DisplayName("Test child(MarketDataId, DataType, List); then return not Leaf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataNode MarketDataNode.child(MarketDataId, DataType, List)"})
  void testChild_thenReturnNotLeaf() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id2, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act
    MarketDataNode actualChildResult = MarketDataNode.child(id, DataType.SINGLE_VALUE, children);

    // Assert
    assertFalse(actualChildResult.isLeaf());
    assertSame(id, actualChildResult.getId());
  }

  /**
   * Test {@link MarketDataNode#child(MarketDataId, DataType, List)}.
   *
   * <ul>
   *   <li>Then return not Leaf.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#child(MarketDataId, DataType, List)}
   */
  @Test
  @DisplayName("Test child(MarketDataId, DataType, List); then return not Leaf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataNode MarketDataNode.child(MarketDataId, DataType, List)"})
  void testChild_thenReturnNotLeaf2() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id2, DataType.SINGLE_VALUE, new ArrayList<>()));
    MarketDataId<Object> id3 = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id3, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act
    MarketDataNode actualChildResult = MarketDataNode.child(id, DataType.SINGLE_VALUE, children);

    // Assert
    assertFalse(actualChildResult.isLeaf());
    assertSame(id, actualChildResult.getId());
  }

  /**
   * Test {@link MarketDataNode#child(MarketDataId, DataType, List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Leaf.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#child(MarketDataId, DataType, List)}
   */
  @Test
  @DisplayName("Test child(MarketDataId, DataType, List); when ArrayList(); then return Leaf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataNode MarketDataNode.child(MarketDataId, DataType, List)"})
  void testChild_whenArrayList_thenReturnLeaf() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act
    MarketDataNode actualChildResult =
        MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>());

    // Assert
    assertTrue(actualChildResult.isLeaf());
    assertSame(id, actualChildResult.getId());
  }

  /**
   * Test {@link MarketDataNode#leaf(MarketDataId, DataType)}.
   *
   * <ul>
   *   <li>When {@link MarketDataId}.
   *   <li>Then return Leaf.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#leaf(MarketDataId, DataType)}
   */
  @Test
  @DisplayName("Test leaf(MarketDataId, DataType); when MarketDataId; then return Leaf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataNode MarketDataNode.leaf(MarketDataId, DataType)"})
  void testLeaf_whenMarketDataId_thenReturnLeaf() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act
    MarketDataNode actualLeafResult = MarketDataNode.leaf(id, DataType.SINGLE_VALUE);

    // Assert
    assertTrue(actualLeafResult.isLeaf());
    assertSame(id, actualLeafResult.getId());
  }

  /**
   * Test {@link MarketDataNode#withLeavesRemoved()}.
   *
   * <p>Method under test: {@link MarketDataNode#withLeavesRemoved()}
   */
  @Test
  @DisplayName("Test withLeavesRemoved()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.collect.tuple.Pair MarketDataNode.withLeavesRemoved()"})
  void testWithLeavesRemoved() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataNode childResult = MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>());

    // Act and Assert
    assertEquals(childResult, childResult.withLeavesRemoved().getFirst());
  }

  /**
   * Test {@link MarketDataNode#withLeavesRemoved()}.
   *
   * <ul>
   *   <li>Then return First is leaf {@link MarketDataId} and {@code SINGLE_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#withLeavesRemoved()}
   */
  @Test
  @DisplayName(
      "Test withLeavesRemoved(); then return First is leaf MarketDataId and 'SINGLE_VALUE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.collect.tuple.Pair MarketDataNode.withLeavesRemoved()"})
  void testWithLeavesRemoved_thenReturnFirstIsLeafMarketDataIdAndSingleValue() {
    // Arrange
    MarketDataNode leafResult =
        MarketDataNode.leaf(mock(MarketDataId.class), DataType.SINGLE_VALUE);

    // Act and Assert
    assertEquals(leafResult, leafResult.withLeavesRemoved().getFirst());
  }

  /**
   * Test {@link MarketDataNode#withLeavesRemoved()}.
   *
   * <ul>
   *   <li>Then return Second NonObservables size is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#withLeavesRemoved()}
   */
  @Test
  @DisplayName("Test withLeavesRemoved(); then return Second NonObservables size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.collect.tuple.Pair MarketDataNode.withLeavesRemoved()"})
  void testWithLeavesRemoved_thenReturnSecondNonObservablesSizeIsOne() {
    // Arrange
    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act and Assert
    MarketDataRequirements second =
        MarketDataNode.child(mock(MarketDataId.class), DataType.SINGLE_VALUE, children)
            .withLeavesRemoved()
            .getSecond();
    assertEquals(1, second.getNonObservables().size());
    ImmutableSet<ObservableId> observables = second.getObservables();
    assertTrue(observables.isEmpty());
    assertSame(observables, second.getOutputCurrencies());
    assertSame(observables, second.getTimeSeries());
  }

  /**
   * Test {@link MarketDataNode#withLeavesRemoved()}.
   *
   * <ul>
   *   <li>Then return Second NonObservables size is two.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#withLeavesRemoved()}
   */
  @Test
  @DisplayName("Test withLeavesRemoved(); then return Second NonObservables size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.collect.tuple.Pair MarketDataNode.withLeavesRemoved()"})
  void testWithLeavesRemoved_thenReturnSecondNonObservablesSizeIsTwo() {
    // Arrange
    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()));
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id2, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act and Assert
    MarketDataRequirements second =
        MarketDataNode.child(mock(MarketDataId.class), DataType.SINGLE_VALUE, children)
            .withLeavesRemoved()
            .getSecond();
    assertEquals(2, second.getNonObservables().size());
    ImmutableSet<ObservableId> observables = second.getObservables();
    assertTrue(observables.isEmpty());
    assertSame(observables, second.getOutputCurrencies());
    assertSame(observables, second.getTimeSeries());
  }

  /**
   * Test {@link MarketDataNode#isLeaf()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#isLeaf()}
   */
  @Test
  @DisplayName("Test isLeaf(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.isLeaf()"})
  void testIsLeaf_thenReturnFalse() {
    // Arrange
    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act and Assert
    assertFalse(
        MarketDataNode.child(mock(MarketDataId.class), DataType.SINGLE_VALUE, children).isLeaf());
  }

  /**
   * Test {@link MarketDataNode#isLeaf()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#isLeaf()}
   */
  @Test
  @DisplayName("Test isLeaf(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.isLeaf()"})
  void testIsLeaf_thenReturnTrue() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act and Assert
    assertTrue(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()).isLeaf());
  }

  /**
   * Test {@link MarketDataNode#equals(Object)}, and {@link MarketDataNode#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataNode#equals(Object)}
   *   <li>{@link MarketDataNode#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.equals(Object)", "int MarketDataNode.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MarketDataNode rootResult = MarketDataNode.root(new ArrayList<>());
    MarketDataNode rootResult2 = MarketDataNode.root(new ArrayList<>());

    // Act and Assert
    assertEquals(rootResult, rootResult2);
    assertEquals(rootResult.hashCode(), rootResult2.hashCode());
  }

  /**
   * Test {@link MarketDataNode#equals(Object)}, and {@link MarketDataNode#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataNode#equals(Object)}
   *   <li>{@link MarketDataNode#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.equals(Object)", "int MarketDataNode.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataNode childResult = MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>());

    // Act and Assert
    assertEquals(childResult, childResult);
    int expectedHashCodeResult = childResult.hashCode();
    assertEquals(expectedHashCodeResult, childResult.hashCode());
  }

  /**
   * Test {@link MarketDataNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.equals(Object)", "int MarketDataNode.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);
    MarketDataNode childResult = MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>());
    MarketDataId<Object> id2 = mock(MarketDataId.class);

    // Act and Assert
    assertNotEquals(
        childResult, MarketDataNode.child(id2, DataType.SINGLE_VALUE, new ArrayList<>()));
  }

  /**
   * Test {@link MarketDataNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.equals(Object)", "int MarketDataNode.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()));
    MarketDataNode rootResult = MarketDataNode.root(children);

    // Act and Assert
    assertNotEquals(rootResult, MarketDataNode.root(new ArrayList<>()));
  }

  /**
   * Test {@link MarketDataNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.equals(Object)", "int MarketDataNode.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    ArrayList<MarketDataNode> children = new ArrayList<>();
    MarketDataId<Object> id = mock(MarketDataId.class);
    children.add(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()));
    MarketDataNode rootResult = MarketDataNode.root(children);

    ArrayList<MarketDataNode> children2 = new ArrayList<>();
    MarketDataId<Object> id2 = mock(MarketDataId.class);
    children2.add(MarketDataNode.child(id2, DataType.SINGLE_VALUE, new ArrayList<>()));

    // Act and Assert
    assertNotEquals(rootResult, MarketDataNode.root(children2));
  }

  /**
   * Test {@link MarketDataNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.equals(Object)", "int MarketDataNode.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act and Assert
    assertNotEquals(MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()), null);
  }

  /**
   * Test {@link MarketDataNode#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataNode#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataNode.equals(Object)", "int MarketDataNode.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    MarketDataId<Object> id = mock(MarketDataId.class);

    // Act and Assert
    assertNotEquals(
        MarketDataNode.child(id, DataType.SINGLE_VALUE, new ArrayList<>()),
        "Different type to MarketDataNode");
  }
}
