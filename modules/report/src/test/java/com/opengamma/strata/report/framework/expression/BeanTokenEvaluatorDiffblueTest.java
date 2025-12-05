package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.StandardId;
import java.util.HashSet;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.impl.map.MapBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BeanTokenEvaluatorDiffblueTest {
  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName("Test tokens(Bean) with 'Bean'; given HashSet() add '42'; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_givenHashSetAdd42_thenReturnSizeIsThree() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    HashSet<String> stringSet = new HashSet<>();
    stringSet.add("42");
    stringSet.add("foo");

    MapBean bean = new MapBean();
    bean.put("42", stringSet);

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(bean);

    // Assert
    assertEquals(3, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
    assertTrue(actualTokensResult.contains("1"));
    assertTrue(actualTokensResult.contains("42"));
  }

  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add empty string.
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName(
      "Test tokens(Bean) with 'Bean'; given HashSet() add empty string; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_givenHashSetAddEmptyString_thenReturnSizeIsFour() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    HashSet<String> stringSet = new HashSet<>();
    stringSet.add("");
    stringSet.add("42");
    stringSet.add("foo");

    MapBean bean = new MapBean();
    bean.put("42", stringSet);

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(bean);

    // Assert
    assertEquals(4, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
    assertTrue(actualTokensResult.contains("1"));
    assertTrue(actualTokensResult.contains("2"));
  }

  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@code foo}.
   *   <li>When {@link MapBean#MapBean()} {@code 42} is {@link HashSet#HashSet()}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName(
      "Test tokens(Bean) with 'Bean'; given HashSet() add 'foo'; when MapBean() '42' is HashSet(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_givenHashSetAddFoo_whenMapBean42IsHashSet_thenReturnSizeIsTwo() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    HashSet<String> stringSet = new HashSet<>();
    stringSet.add("foo");

    MapBean bean = new MapBean();
    bean.put("42", stringSet);

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(bean);

    // Assert
    assertEquals(2, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
    assertTrue(actualTokensResult.contains("42"));
  }

  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()}.
   *   <li>When {@link MapBean#MapBean()} {@code 42} is {@link HashSet#HashSet()}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName(
      "Test tokens(Bean) with 'Bean'; given HashSet(); when MapBean() '42' is HashSet(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_givenHashSet_whenMapBean42IsHashSet_thenReturnSizeIsOne() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    MapBean bean = new MapBean();
    bean.put("42", new HashSet<>());

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(bean);

    // Assert
    assertEquals(1, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("42"));
  }

  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When {@link MapBean#MapBean()} {@code 42} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName(
      "Test tokens(Bean) with 'Bean'; given 'Value'; when MapBean() '42' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_givenValue_whenMapBean42IsValue_thenReturnSizeIsOne() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    MapBean bean = new MapBean();
    bean.put("42", "Value");

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(bean);

    // Assert
    assertEquals(1, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("42"));
  }

  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>When {@link Bean} {@link Bean#propertyNames()} return {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName(
      "Test tokens(Bean) with 'Bean'; when Bean propertyNames() return HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_whenBeanPropertyNamesReturnHashSet_thenReturnEmpty() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    Bean bean = mock(Bean.class);
    when(bean.propertyNames()).thenReturn(new HashSet<>());

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(bean);

    // Assert
    verify(bean, atLeast(1)).propertyNames();
    assertTrue(actualTokensResult.isEmpty());
  }

  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return contains {@code values}.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName("Test tokens(Bean) with 'Bean'; when empty; then return contains 'values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_whenEmpty_thenReturnContainsValues() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(ImmutableReferenceData.empty());

    // Assert
    assertEquals(1, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("values"));
  }

  /**
   * Test {@link BeanTokenEvaluator#tokens(Bean)} with {@code Bean}.
   *
   * <ul>
   *   <li>When {@link StandardId} with {@code Scheme} and value is {@code 42}.
   *   <li>Then return contains {@code scheme}.
   * </ul>
   *
   * <p>Method under test: {@link BeanTokenEvaluator#tokens(Bean)}
   */
  @Test
  @DisplayName(
      "Test tokens(Bean) with 'Bean'; when StandardId with 'Scheme' and value is '42'; then return contains 'scheme'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set BeanTokenEvaluator.tokens(Bean)"})
  void testTokensWithBean_whenStandardIdWithSchemeAndValueIs42_thenReturnContainsScheme() {
    // Arrange
    BeanTokenEvaluator beanTokenEvaluator = new BeanTokenEvaluator();

    // Act
    Set<String> actualTokensResult = beanTokenEvaluator.tokens(StandardId.of("Scheme", "42"));

    // Assert
    assertEquals(2, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("scheme"));
    assertTrue(actualTokensResult.contains("value"));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link BeanTokenEvaluator}
   *   <li>{@link BeanTokenEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BeanTokenEvaluator.<init>()",
    "Class BeanTokenEvaluator.getTargetType()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    Class<Bean> actualTargetType = new BeanTokenEvaluator().getTargetType();

    // Assert
    Class<Bean> expectedTargetType = Bean.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
