package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PositionInfoBuilderDiffblueTest {
  /**
   * Test {@link PositionInfoBuilder#PositionInfoBuilder(StandardId, Map)}.
   *
   * <ul>
   *   <li>Then return build AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfoBuilder#PositionInfoBuilder(StandardId, Map)}
   */
  @Test
  @DisplayName(
      "Test new PositionInfoBuilder(StandardId, Map); then return build AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PositionInfoBuilder.<init>(StandardId, Map)"})
  void testNewPositionInfoBuilder_thenReturnBuildAttributeTypesSizeIsOne() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();
    Class<Object> type = Object.class;
    AttributeType<?> registerInstanceResult =
        AttributeType.registerInstance("Name", type, "Aliases");
    attributes.put(registerInstanceResult, "Value");

    // Act
    PositionInfoBuilder actualPositionInfoBuilder = new PositionInfoBuilder(null, attributes);

    // Assert
    PositionInfo positionInfo = actualPositionInfoBuilder.build();
    assertEquals(1, positionInfo.getAttributeTypes().size());
    assertFalse(positionInfo.getId().isPresent());
    assertEquals(attributes, positionInfo.getAttributes());
  }

  /**
   * Test {@link PositionInfoBuilder#PositionInfoBuilder(StandardId, Map)}.
   *
   * <ul>
   *   <li>Then return build AttributeTypes size is two.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfoBuilder#PositionInfoBuilder(StandardId, Map)}
   */
  @Test
  @DisplayName(
      "Test new PositionInfoBuilder(StandardId, Map); then return build AttributeTypes size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PositionInfoBuilder.<init>(StandardId, Map)"})
  void testNewPositionInfoBuilder_thenReturnBuildAttributeTypesSizeIsTwo() {
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

    // Act
    PositionInfoBuilder actualPositionInfoBuilder = new PositionInfoBuilder(null, attributes);

    // Assert
    PositionInfo positionInfo = actualPositionInfoBuilder.build();
    assertEquals(2, positionInfo.getAttributeTypes().size());
    assertFalse(positionInfo.getId().isPresent());
    assertEquals(attributes, positionInfo.getAttributes());
  }

  /**
   * Test {@link PositionInfoBuilder#PositionInfoBuilder(StandardId, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return build AttributeTypes Empty.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfoBuilder#PositionInfoBuilder(StandardId, Map)}
   */
  @Test
  @DisplayName(
      "Test new PositionInfoBuilder(StandardId, Map); when HashMap(); then return build AttributeTypes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PositionInfoBuilder.<init>(StandardId, Map)"})
  void testNewPositionInfoBuilder_whenHashMap_thenReturnBuildAttributeTypesEmpty() {
    // Arrange
    HashMap<AttributeType<?>, Object> attributes = new HashMap<>();

    // Act
    PositionInfoBuilder actualPositionInfoBuilder = new PositionInfoBuilder(null, attributes);

    // Assert
    PositionInfo positionInfo = actualPositionInfoBuilder.build();
    assertFalse(positionInfo.getId().isPresent());
    assertTrue(positionInfo.getAttributeTypes().isEmpty());
    assertEquals(attributes, positionInfo.getAttributes());
  }

  /**
   * Test {@link PositionInfoBuilder#id(StandardId)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfoBuilder#id(StandardId)}
   */
  @Test
  @DisplayName("Test id(StandardId); when 'null'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfoBuilder PositionInfoBuilder.id(StandardId)"})
  void testId_whenNull_thenReturnBuilder() {
    // Arrange
    PositionInfoBuilder builderResult = PositionInfo.builder();

    // Act
    PositionInfoBuilder actualIdResult = builderResult.id(null);

    // Assert
    assertSame(builderResult, actualIdResult);
  }

  /**
   * Test {@link PositionInfoBuilder#addAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>Then builder build AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfoBuilder#addAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test addAttribute(AttributeType, Object); given builder; then builder build AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfoBuilder PositionInfoBuilder.addAttribute(AttributeType, Object)"})
  void testAddAttribute_givenBuilder_thenBuilderBuildAttributeTypesSizeIsOne() {
    // Arrange
    PositionInfoBuilder builderResult = PositionInfo.builder();
    Class<Object> type = Object.class;
    AttributeType<Object> attributeType = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    builderResult.addAttribute(attributeType, "Attribute Value");

    // Assert
    PositionInfo positionInfo = builderResult.build();
    assertEquals(1, positionInfo.getAttributeTypes().size());
    assertEquals(1, positionInfo.getAttributes().size());
  }

  /**
   * Test {@link PositionInfoBuilder#addAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then builder build AttributeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionInfoBuilder#addAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test addAttribute(AttributeType, Object); given 'java.lang.Object'; then builder build AttributeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PositionInfoBuilder PositionInfoBuilder.addAttribute(AttributeType, Object)"})
  void testAddAttribute_givenJavaLangObject_thenBuilderBuildAttributeTypesSizeIsOne() {
    // Arrange
    PositionInfoBuilder builderResult = PositionInfo.builder();
    Class<Object> type = Object.class;
    AttributeType<Object> attributeType = AttributeType.registerInstance("Name", type, "Aliases");
    builderResult.addAttribute(attributeType, "Attribute Value");
    Class<Object> type2 = Object.class;
    AttributeType<Object> attributeType2 = AttributeType.registerInstance("Name", type2, "Aliases");

    // Act
    builderResult.addAttribute(attributeType2, "Attribute Value");

    // Assert that nothing has changed
    PositionInfo positionInfo = builderResult.build();
    assertEquals(1, positionInfo.getAttributeTypes().size());
    assertEquals(1, positionInfo.getAttributes().size());
  }
}
