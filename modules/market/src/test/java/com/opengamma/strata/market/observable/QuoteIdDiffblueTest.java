package com.opengamma.strata.market.observable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.data.FieldName;
import com.opengamma.strata.data.ObservableSource;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class QuoteIdDiffblueTest {
  /**
   * Test {@link QuoteId#of(StandardId, FieldName, ObservableSource)} with {@code standardId},
   * {@code fieldName}, {@code obsSource}.
   *
   * <ul>
   *   <li>Then return MarketDataType is {@link Double}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#of(StandardId, FieldName, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, FieldName, ObservableSource) with 'standardId', 'fieldName', 'obsSource'; then return MarketDataType is Double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteId QuoteId.of(StandardId, FieldName, ObservableSource)"})
  void testOfWithStandardIdFieldNameObsSource_thenReturnMarketDataTypeIsDouble() {
    // Arrange
    StandardId standardId = StandardId.of("Scheme", "42");
    FieldName fieldName = FieldName.of("Name");
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    QuoteId actualOfResult = QuoteId.of(standardId, fieldName, obsSource);

    // Assert
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(standardId, actualOfResult.getStandardId());
    assertSame(fieldName, actualOfResult.getFieldName());
    assertSame(obsSource, actualOfResult.getObservableSource());
  }

  /**
   * Test {@link QuoteId#of(StandardId, FieldName)} with {@code standardId}, {@code fieldName}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#of(StandardId, FieldName)}
   */
  @Test
  @DisplayName(
      "Test of(StandardId, FieldName) with 'standardId', 'fieldName'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteId QuoteId.of(StandardId, FieldName)"})
  void testOfWithStandardIdFieldName_thenReturnObservableSourceNameIsNone() {
    // Arrange
    StandardId standardId = StandardId.of("Scheme", "42");
    FieldName fieldName = FieldName.of("Name");

    // Act
    QuoteId actualOfResult = QuoteId.of(standardId, fieldName);

    // Assert
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(standardId, actualOfResult.getStandardId());
    assertSame(fieldName, actualOfResult.getFieldName());
  }

  /**
   * Test {@link QuoteId#of(StandardId)} with {@code standardId}.
   *
   * <ul>
   *   <li>Then return FieldName Name is {@code MarketValue}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#of(StandardId)}
   */
  @Test
  @DisplayName("Test of(StandardId) with 'standardId'; then return FieldName Name is 'MarketValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteId QuoteId.of(StandardId)"})
  void testOfWithStandardId_thenReturnFieldNameNameIsMarketValue() {
    // Arrange
    StandardId standardId = StandardId.of("Scheme", "42");

    // Act
    QuoteId actualOfResult = QuoteId.of(standardId);

    // Assert
    FieldName fieldName = actualOfResult.getFieldName();
    assertEquals("MarketValue", fieldName.getName());
    assertEquals("MarketValue", fieldName.toString());
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(standardId, actualOfResult.getStandardId());
  }

  /**
   * Test {@link QuoteId#withObservableSource(ObservableSource)}.
   *
   * <ul>
   *   <li>Then return FieldName Name is {@code MarketValue}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#withObservableSource(ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test withObservableSource(ObservableSource); then return FieldName Name is 'MarketValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"QuoteId QuoteId.withObservableSource(ObservableSource)"})
  void testWithObservableSource_thenReturnFieldNameNameIsMarketValue() {
    // Arrange
    StandardId standardId = StandardId.of("Scheme", "42");
    QuoteId ofResult = QuoteId.of(standardId);
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    QuoteId actualWithObservableSourceResult = ofResult.withObservableSource(obsSource);

    // Assert
    FieldName fieldName = actualWithObservableSourceResult.getFieldName();
    assertEquals("MarketValue", fieldName.getName());
    assertEquals("MarketValue", fieldName.toString());
    Class<Double> expectedMarketDataType = Double.class;
    assertEquals(expectedMarketDataType, actualWithObservableSourceResult.getMarketDataType());
    assertSame(standardId, actualWithObservableSourceResult.getStandardId());
    assertSame(obsSource, actualWithObservableSourceResult.getObservableSource());
  }

  /**
   * Test {@link QuoteId#toString()}.
   *
   * <ul>
   *   <li>Then return {@code QuoteId:Scheme~42/MarketValue}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'QuoteId:Scheme~42/MarketValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String QuoteId.toString()"})
  void testToString_thenReturnQuoteIdScheme42MarketValue() {
    // Arrange, Act and Assert
    assertEquals(
        "QuoteId:Scheme~42/MarketValue", QuoteId.of(StandardId.of("Scheme", "42")).toString());
  }

  /**
   * Test {@link QuoteId#meta()}.
   *
   * <p>Method under test: {@link QuoteId#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean QuoteId.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<QuoteId> actualMetaResult = QuoteId.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fieldName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(metaPropertyMapResult.containsKey("standardId"));
    assertTrue(actualMetaResult.isBuildable());
    Class<QuoteId> expectedBeanTypeResult = QuoteId.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link QuoteId#metaBean()}.
   *
   * <ul>
   *   <li>Given {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#metaBean()}
   */
  @Test
  @DisplayName(
      "Test metaBean(); given StandardId with 'Scheme' and value is '42'; then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean QuoteId.metaBean()"})
  void testMetaBean_givenStandardIdWithSchemeAndValueIs42_thenReturnLightMetaBean() {
    // Arrange and Act
    TypedMetaBean<QuoteId> actualMetaBeanResult =
        QuoteId.of(StandardId.of("Scheme", "42")).metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fieldName"));
    assertTrue(metaPropertyMapResult.containsKey("observableSource"));
    assertTrue(metaPropertyMapResult.containsKey("standardId"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<QuoteId> expectedBeanTypeResult = QuoteId.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link QuoteId#equals(Object)}, and {@link QuoteId#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link QuoteId#equals(Object)}
   *   <li>{@link QuoteId#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuoteId.equals(Object)", "int QuoteId.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    QuoteId ofResult = QuoteId.of(StandardId.of("Scheme", "42"));
    QuoteId ofResult2 = QuoteId.of(StandardId.of("Scheme", "42"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link QuoteId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuoteId.equals(Object)", "int QuoteId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(QuoteId.of(StandardId.of("Scheme", "42")), 1);
  }

  /**
   * Test {@link QuoteId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuoteId.equals(Object)", "int QuoteId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange, Act and Assert
    assertNotEquals(QuoteId.of(StandardId.of("Scheme", "42")), null);
  }

  /**
   * Test {@link QuoteId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuoteId.equals(Object)", "int QuoteId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    QuoteId ofResult = QuoteId.of(StandardId.of("42", "42"));

    // Act and Assert
    assertNotEquals(ofResult, QuoteId.of(StandardId.of("Scheme", "42")));
  }

  /**
   * Test {@link QuoteId#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link QuoteId#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean QuoteId.equals(Object)", "int QuoteId.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    StandardId standardId = StandardId.of("Scheme", "42");
    QuoteId ofResult = QuoteId.of(standardId, FieldName.of("Name"));

    // Act and Assert
    assertNotEquals(ofResult, QuoteId.of(StandardId.of("Scheme", "42")));
  }
}
