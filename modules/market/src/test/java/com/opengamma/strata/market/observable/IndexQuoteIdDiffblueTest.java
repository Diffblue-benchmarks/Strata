package com.opengamma.strata.market.observable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.data.FieldName;
import com.opengamma.strata.data.ObservableSource;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IndexQuoteIdDiffblueTest {
  /**
   * Test {@link IndexQuoteId#of(Index, FieldName, ObservableSource)} with {@code index}, {@code
   * fieldName}, {@code obsSource}.
   *
   * <ul>
   *   <li>When {@link Index}.
   *   <li>Then return MarketDataType is {@link Double}.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#of(Index, FieldName, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Index, FieldName, ObservableSource) with 'index', 'fieldName', 'obsSource'; when Index; then return MarketDataType is Double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IndexQuoteId IndexQuoteId.of(Index, FieldName, ObservableSource)"})
  void testOfWithIndexFieldNameObsSource_whenIndex_thenReturnMarketDataTypeIsDouble() {
    // Arrange
    Index index = mock(Index.class);
    FieldName fieldName = FieldName.of("Name");
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    IndexQuoteId actualOfResult = IndexQuoteId.of(index, fieldName, obsSource);

    // Assert
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(fieldName, actualOfResult.getFieldName());
    assertSame(obsSource, actualOfResult.getObservableSource());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link IndexQuoteId#of(Index, FieldName)} with {@code index}, {@code fieldName}.
   *
   * <ul>
   *   <li>When {@link Index}.
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#of(Index, FieldName)}
   */
  @Test
  @DisplayName(
      "Test of(Index, FieldName) with 'index', 'fieldName'; when Index; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IndexQuoteId IndexQuoteId.of(Index, FieldName)"})
  void testOfWithIndexFieldName_whenIndex_thenReturnObservableSourceNameIsNone() {
    // Arrange
    Index index = mock(Index.class);
    FieldName fieldName = FieldName.of("Name");

    // Act
    IndexQuoteId actualOfResult = IndexQuoteId.of(index, fieldName);

    // Assert
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(fieldName, actualOfResult.getFieldName());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link IndexQuoteId#of(Index)} with {@code index}.
   *
   * <ul>
   *   <li>When {@link Index}.
   *   <li>Then return FieldName Name is {@code MarketValue}.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#of(Index)}
   */
  @Test
  @DisplayName(
      "Test of(Index) with 'index'; when Index; then return FieldName Name is 'MarketValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IndexQuoteId IndexQuoteId.of(Index)"})
  void testOfWithIndex_whenIndex_thenReturnFieldNameNameIsMarketValue() {
    // Arrange
    Index index = mock(Index.class);

    // Act
    IndexQuoteId actualOfResult = IndexQuoteId.of(index);

    // Assert
    FieldName fieldName = actualOfResult.getFieldName();
    assertEquals("MarketValue", fieldName.getName());
    assertEquals("MarketValue", fieldName.toString());
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(index, actualOfResult.getIndex());
  }

  /**
   * Test {@link IndexQuoteId#getStandardId()}.
   *
   * <ul>
   *   <li>Given {@link Index} {@link Index#getName()} return {@code Name}.
   *   <li>Then return Value is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#getStandardId()}
   */
  @Test
  @DisplayName(
      "Test getStandardId(); given Index getName() return 'Name'; then return Value is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId IndexQuoteId.getStandardId()"})
  void testGetStandardId_givenIndexGetNameReturnName_thenReturnValueIsName() {
    // Arrange
    Index index = mock(Index.class);
    when(index.getName()).thenReturn("Name");

    // Act
    StandardId actualStandardId = IndexQuoteId.of(index).getStandardId();

    // Assert
    verify(index).getName();
    assertEquals("Name", actualStandardId.getValue());
    assertEquals("OG-Index", actualStandardId.getScheme());
  }

  /**
   * Test {@link IndexQuoteId#withObservableSource(ObservableSource)}.
   *
   * <ul>
   *   <li>Then return FieldName Name is {@code MarketValue}.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#withObservableSource(ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test withObservableSource(ObservableSource); then return FieldName Name is 'MarketValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IndexQuoteId IndexQuoteId.withObservableSource(ObservableSource)"})
  void testWithObservableSource_thenReturnFieldNameNameIsMarketValue() {
    // Arrange
    IndexQuoteId ofResult = IndexQuoteId.of(mock(Index.class));
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    IndexQuoteId actualWithObservableSourceResult = ofResult.withObservableSource(obsSource);

    // Assert
    FieldName fieldName = actualWithObservableSourceResult.getFieldName();
    assertEquals("MarketValue", fieldName.getName());
    assertEquals("MarketValue", fieldName.toString());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualWithObservableSourceResult.getMarketDataType());
    assertSame(obsSource, actualWithObservableSourceResult.getObservableSource());
  }

  /**
   * Test {@link IndexQuoteId#meta()}.
   *
   * <p>Method under test: {@link IndexQuoteId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IndexQuoteId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<IndexQuoteId> actualMetaResult = IndexQuoteId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fieldName"));
    assertTrue(metaPropertyMapResult.containsKey("index"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaResult.isBuildable());
    Class<IndexQuoteId> expectedBeanTypeResult = IndexQuoteId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link IndexQuoteId#metaBean()}.
   *
   * <p>Method under test: {@link IndexQuoteId#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean IndexQuoteId.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<IndexQuoteId> actualMetaBeanResult =
        IndexQuoteId.of(mock(Index.class)).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fieldName"));
    assertTrue(metaPropertyMapResult.containsKey("index"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<IndexQuoteId> expectedBeanTypeResult = IndexQuoteId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IndexQuoteId#getFieldName()}
   *   <li>{@link IndexQuoteId#getIndex()}
   *   <li>{@link IndexQuoteId#getObservableSource()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FieldName IndexQuoteId.getFieldName()",
    "Index IndexQuoteId.getIndex()",
    "ObservableSource IndexQuoteId.getObservableSource()"
  })
  void testGettersAndSetters() {
    // Arrange
    IndexQuoteId ofResult = IndexQuoteId.of(mock(Index.class));

    // Act
    FieldName actualFieldName = ofResult.getFieldName();
    ofResult.getIndex();

    // Assert
    assertSame(FieldName.MARKET_VALUE, actualFieldName);
    assertSame(ObservableSource.NONE, ofResult.getObservableSource());
  }

  /**
   * Test {@link IndexQuoteId#equals(Object)}, and {@link IndexQuoteId#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IndexQuoteId#equals(Object)}
   *   <li>{@link IndexQuoteId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexQuoteId.equals(Object)", "int IndexQuoteId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IndexQuoteId ofResult = IndexQuoteId.of(mock(Index.class));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link IndexQuoteId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexQuoteId.equals(Object)", "int IndexQuoteId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    IndexQuoteId ofResult = IndexQuoteId.of(mock(Index.class));

    // Act and Assert
    assertNotEquals(ofResult, IndexQuoteId.of(mock(Index.class)));
  }

  /**
   * Test {@link IndexQuoteId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexQuoteId.equals(Object)", "int IndexQuoteId.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IndexQuoteId.of(mock(Index.class)), null);
  }

  /**
   * Test {@link IndexQuoteId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IndexQuoteId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IndexQuoteId.equals(Object)", "int IndexQuoteId.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IndexQuoteId.of(mock(Index.class)), "Different type to IndexQuoteId");
  }
}
