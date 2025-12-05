package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityInfoBuilderDiffblueTest {
  /**
   * Test {@link SecurityInfoBuilder#id(SecurityId)}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link SecurityInfoBuilder#id(SecurityId)}
   */
  @Test
  @DisplayName(
      "Test id(SecurityId); when StandardId with 'Scheme' and value is '42'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityInfoBuilder SecurityInfoBuilder.id(SecurityId)"})
  void testId_whenStandardIdWithSchemeAndValueIs42_thenReturnBuilder() {
    // Arrange
    SecurityInfoBuilder builderResult = SecurityInfo.builder();

    // Act
    SecurityInfoBuilder actualIdResult =
        builderResult.id(SecurityId.of(StandardId.of("Scheme", "42")));

    // Assert
    assertSame(builderResult, actualIdResult);
  }

  /**
   * Test {@link SecurityInfoBuilder#addAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>Given builder.
   *   <li>When {@code Object}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link SecurityInfoBuilder#addAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test addAttribute(AttributeType, Object); given builder; when 'java.lang.Object'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityInfoBuilder SecurityInfoBuilder.addAttribute(AttributeType, Object)"})
  void testAddAttribute_givenBuilder_whenJavaLangObject_thenReturnBuilder() {
    // Arrange
    SecurityInfoBuilder builderResult = SecurityInfo.builder();
    Class<Object> type = Object.class;
    AttributeType<Object> attributeType = AttributeType.registerInstance("Name", type, "Aliases");

    // Act
    SecurityInfoBuilder actualAddAttributeResult =
        builderResult.addAttribute(attributeType, "Attribute Value");

    // Assert
    assertSame(builderResult, actualAddAttributeResult);
  }

  /**
   * Test {@link SecurityInfoBuilder#addAttribute(AttributeType, Object)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code Object}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link SecurityInfoBuilder#addAttribute(AttributeType, Object)}
   */
  @Test
  @DisplayName(
      "Test addAttribute(AttributeType, Object); given 'java.lang.Object'; when 'java.lang.Object'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SecurityInfoBuilder SecurityInfoBuilder.addAttribute(AttributeType, Object)"})
  void testAddAttribute_givenJavaLangObject_whenJavaLangObject_thenReturnBuilder() {
    // Arrange
    SecurityInfoBuilder builderResult = SecurityInfo.builder();
    Class<Object> type = Object.class;
    AttributeType<Object> attributeType = AttributeType.registerInstance("Name", type, "Aliases");
    builderResult.addAttribute(attributeType, "Attribute Value");
    Class<Object> type2 = Object.class;
    AttributeType<Object> attributeType2 = AttributeType.registerInstance("Name", type2, "Aliases");

    // Act
    SecurityInfoBuilder actualAddAttributeResult =
        builderResult.addAttribute(attributeType2, "Attribute Value");

    // Assert
    assertSame(builderResult, actualAddAttributeResult);
  }
}
