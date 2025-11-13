package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class XmlElementDiffblueTest {
  /**
   * Test {@link XmlElement#ofContent(String, Map, String)} with {@code name}, {@code attributes},
   * {@code content}.
   *
   * <ul>
   *   <li>Given {@code children}.
   *   <li>When {@link HashMap#HashMap()} {@code children} is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofContent(String, Map, String)}
   */
  @Test
  @DisplayName(
      "Test ofContent(String, Map, String) with 'name', 'attributes', 'content'; given 'children'; when HashMap() 'children' is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofContent(String, Map, String)"})
  void testOfContentWithNameAttributesContent_givenChildren_whenHashMapChildrenIsName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("content", "attributes");
    attributes.put("children", "name");
    attributes.put("name", "42");

    // Act
    XmlElement actualOfContentResult =
        XmlElement.ofContent("Name", attributes, "Not all who wander are lost");

    // Assert
    assertEquals("Name", actualOfContentResult.getName());
    assertEquals("Not all who wander are lost", actualOfContentResult.getContent());
    assertTrue(actualOfContentResult.hasContent());
    assertTrue(actualOfContentResult.getChildren().isEmpty());
    assertEquals(attributes, actualOfContentResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofContent(String, Map, String)} with {@code name}, {@code attributes},
   * {@code content}.
   *
   * <ul>
   *   <li>Given {@code content}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofContent(String, Map, String)}
   */
  @Test
  @DisplayName(
      "Test ofContent(String, Map, String) with 'name', 'attributes', 'content'; given 'content'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofContent(String, Map, String)"})
  void testOfContentWithNameAttributesContent_givenContent() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("content", "attributes");
    attributes.put("attributes", "name");
    attributes.put("name", "42");

    // Act
    XmlElement actualOfContentResult =
        XmlElement.ofContent("Name", attributes, "Not all who wander are lost");

    // Assert
    assertEquals("Name", actualOfContentResult.getName());
    assertEquals("Not all who wander are lost", actualOfContentResult.getContent());
    assertTrue(actualOfContentResult.hasContent());
    assertTrue(actualOfContentResult.getChildren().isEmpty());
    assertEquals(attributes, actualOfContentResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofContent(String, Map, String)} with {@code name}, {@code attributes},
   * {@code content}.
   *
   * <ul>
   *   <li>Given {@code name}.
   *   <li>When {@link HashMap#HashMap()} {@code name} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofContent(String, Map, String)}
   */
  @Test
  @DisplayName(
      "Test ofContent(String, Map, String) with 'name', 'attributes', 'content'; given 'name'; when HashMap() 'name' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofContent(String, Map, String)"})
  void testOfContentWithNameAttributesContent_givenName_whenHashMapNameIs42() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("name", "42");

    // Act
    XmlElement actualOfContentResult =
        XmlElement.ofContent("Name", attributes, "Not all who wander are lost");

    // Assert
    assertEquals("Name", actualOfContentResult.getName());
    assertEquals("Not all who wander are lost", actualOfContentResult.getContent());
    assertTrue(actualOfContentResult.hasContent());
    assertTrue(actualOfContentResult.getChildren().isEmpty());
    assertEquals(attributes, actualOfContentResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofContent(String, Map, String)} with {@code name}, {@code attributes},
   * {@code content}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code attributes} is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofContent(String, Map, String)}
   */
  @Test
  @DisplayName(
      "Test ofContent(String, Map, String) with 'name', 'attributes', 'content'; when HashMap() 'attributes' is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofContent(String, Map, String)"})
  void testOfContentWithNameAttributesContent_whenHashMapAttributesIsName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("attributes", "name");
    attributes.put("name", "42");

    // Act
    XmlElement actualOfContentResult =
        XmlElement.ofContent("Name", attributes, "Not all who wander are lost");

    // Assert
    assertEquals("Name", actualOfContentResult.getName());
    assertEquals("Not all who wander are lost", actualOfContentResult.getContent());
    assertTrue(actualOfContentResult.hasContent());
    assertTrue(actualOfContentResult.getChildren().isEmpty());
    assertEquals(attributes, actualOfContentResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofContent(String, Map, String)} with {@code name}, {@code attributes},
   * {@code content}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofContent(String, Map, String)}
   */
  @Test
  @DisplayName(
      "Test ofContent(String, Map, String) with 'name', 'attributes', 'content'; when HashMap(); then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofContent(String, Map, String)"})
  void testOfContentWithNameAttributesContent_whenHashMap_thenReturnName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();

    // Act
    XmlElement actualOfContentResult =
        XmlElement.ofContent("Name", attributes, "Not all who wander are lost");

    // Assert
    assertEquals("Name", actualOfContentResult.getName());
    assertEquals("Not all who wander are lost", actualOfContentResult.getContent());
    assertTrue(actualOfContentResult.hasContent());
    assertTrue(actualOfContentResult.getChildren().isEmpty());
    assertEquals(attributes, actualOfContentResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofContent(String, String)} with {@code name}, {@code content}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofContent(String, String)}
   */
  @Test
  @DisplayName(
      "Test ofContent(String, String) with 'name', 'content'; when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofContent(String, String)"})
  void testOfContentWithNameContent_whenName_thenReturnName() {
    // Arrange and Act
    XmlElement actualOfContentResult = XmlElement.ofContent("Name", "Not all who wander are lost");

    // Assert
    assertEquals("Name", actualOfContentResult.getName());
    assertEquals("Not all who wander are lost", actualOfContentResult.getContent());
    assertTrue(actualOfContentResult.getAttributes().isEmpty());
    assertTrue(actualOfContentResult.hasContent());
    assertTrue(actualOfContentResult.getChildren().isEmpty());
  }

  /**
   * Test {@link XmlElement#ofChildren(String, Map, List)} with {@code name}, {@code attributes},
   * {@code children}.
   *
   * <ul>
   *   <li>Given {@code children}.
   *   <li>When {@link HashMap#HashMap()} {@code children} is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, Map, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, Map, List) with 'name', 'attributes', 'children'; given 'children'; when HashMap() 'children' is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, Map, List)"})
  void testOfChildrenWithNameAttributesChildren_givenChildren_whenHashMapChildrenIsName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("content", "attributes");
    attributes.put("children", "name");
    attributes.put("name", "42");
    ArrayList<XmlElement> children = new ArrayList<>();

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", attributes, children);

    // Assert
    assertEquals("", actualOfChildrenResult.getContent());
    assertEquals("Name", actualOfChildrenResult.getName());
    assertFalse(actualOfChildrenResult.hasContent());
    assertEquals(children, actualOfChildrenResult.getChildren());
    assertEquals(attributes, actualOfChildrenResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofChildren(String, Map, List)} with {@code name}, {@code attributes},
   * {@code children}.
   *
   * <ul>
   *   <li>Given {@code content}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, Map, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, Map, List) with 'name', 'attributes', 'children'; given 'content'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, Map, List)"})
  void testOfChildrenWithNameAttributesChildren_givenContent() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("content", "attributes");
    attributes.put("attributes", "name");
    attributes.put("name", "42");
    ArrayList<XmlElement> children = new ArrayList<>();

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", attributes, children);

    // Assert
    assertEquals("", actualOfChildrenResult.getContent());
    assertEquals("Name", actualOfChildrenResult.getName());
    assertFalse(actualOfChildrenResult.hasContent());
    assertEquals(children, actualOfChildrenResult.getChildren());
    assertEquals(attributes, actualOfChildrenResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofChildren(String, Map, List)} with {@code name}, {@code attributes},
   * {@code children}.
   *
   * <ul>
   *   <li>Given {@code name}.
   *   <li>When {@link HashMap#HashMap()} {@code name} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, Map, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, Map, List) with 'name', 'attributes', 'children'; given 'name'; when HashMap() 'name' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, Map, List)"})
  void testOfChildrenWithNameAttributesChildren_givenName_whenHashMapNameIs42() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("name", "42");
    ArrayList<XmlElement> children = new ArrayList<>();

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", attributes, children);

    // Assert
    assertEquals("", actualOfChildrenResult.getContent());
    assertEquals("Name", actualOfChildrenResult.getName());
    assertFalse(actualOfChildrenResult.hasContent());
    assertEquals(children, actualOfChildrenResult.getChildren());
    assertEquals(attributes, actualOfChildrenResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofChildren(String, Map, List)} with {@code name}, {@code attributes},
   * {@code children}.
   *
   * <ul>
   *   <li>Then return Children size is one.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, Map, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, Map, List) with 'name', 'attributes', 'children'; then return Children size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, Map, List)"})
  void testOfChildrenWithNameAttributesChildren_thenReturnChildrenSizeIsOne() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();

    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("name", attributes2, new ArrayList<>());
    children.add(ofChildrenResult);

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", attributes, children);

    // Assert
    ImmutableList<XmlElement> children2 = actualOfChildrenResult.getChildren();
    assertEquals(1, children2.size());
    assertSame(ofChildrenResult, children2.get(0));
  }

  /**
   * Test {@link XmlElement#ofChildren(String, Map, List)} with {@code name}, {@code attributes},
   * {@code children}.
   *
   * <ul>
   *   <li>Then return Children size is two.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, Map, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, Map, List) with 'name', 'attributes', 'children'; then return Children size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, Map, List)"})
  void testOfChildrenWithNameAttributesChildren_thenReturnChildrenSizeIsTwo() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();

    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("name", attributes2, new ArrayList<>());
    children.add(ofChildrenResult);
    HashMap<String, String> attributes3 = new HashMap<>();
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("name", attributes3, new ArrayList<>());
    children.add(ofChildrenResult2);

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", attributes, children);

    // Assert
    ImmutableList<XmlElement> children2 = actualOfChildrenResult.getChildren();
    assertEquals(2, children2.size());
    assertSame(ofChildrenResult2, children2.get(1));
  }

  /**
   * Test {@link XmlElement#ofChildren(String, Map, List)} with {@code name}, {@code attributes},
   * {@code children}.
   *
   * <ul>
   *   <li>Then return Content is empty string.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, Map, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, Map, List) with 'name', 'attributes', 'children'; then return Content is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, Map, List)"})
  void testOfChildrenWithNameAttributesChildren_thenReturnContentIsEmptyString() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    ArrayList<XmlElement> children = new ArrayList<>();

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", attributes, children);

    // Assert
    assertEquals("", actualOfChildrenResult.getContent());
    assertEquals("Name", actualOfChildrenResult.getName());
    assertFalse(actualOfChildrenResult.hasContent());
    assertEquals(children, actualOfChildrenResult.getChildren());
    assertEquals(attributes, actualOfChildrenResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofChildren(String, Map, List)} with {@code name}, {@code attributes},
   * {@code children}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code attributes} is {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, Map, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, Map, List) with 'name', 'attributes', 'children'; when HashMap() 'attributes' is 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, Map, List)"})
  void testOfChildrenWithNameAttributesChildren_whenHashMapAttributesIsName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("attributes", "name");
    attributes.put("name", "42");
    ArrayList<XmlElement> children = new ArrayList<>();

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", attributes, children);

    // Assert
    assertEquals("", actualOfChildrenResult.getContent());
    assertEquals("Name", actualOfChildrenResult.getName());
    assertFalse(actualOfChildrenResult.hasContent());
    assertEquals(children, actualOfChildrenResult.getChildren());
    assertEquals(attributes, actualOfChildrenResult.getAttributes());
  }

  /**
   * Test {@link XmlElement#ofChildren(String, List)} with {@code name}, {@code children}.
   *
   * <ul>
   *   <li>Then return Children size is one.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, List) with 'name', 'children'; then return Children size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, List)"})
  void testOfChildrenWithNameChildren_thenReturnChildrenSizeIsOne() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", children);

    // Assert
    ImmutableList<XmlElement> children2 = actualOfChildrenResult.getChildren();
    assertEquals(1, children2.size());
    assertEquals(attributes, actualOfChildrenResult.getAttributes());
    assertSame(ofChildrenResult, children2.get(0));
  }

  /**
   * Test {@link XmlElement#ofChildren(String, List)} with {@code name}, {@code children}.
   *
   * <ul>
   *   <li>Then return Children size is two.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, List) with 'name', 'children'; then return Children size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, List)"})
  void testOfChildrenWithNameChildren_thenReturnChildrenSizeIsTwo() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("name", attributes2, new ArrayList<>());
    children.add(ofChildrenResult2);

    // Act and Assert
    ImmutableList<XmlElement> children2 = XmlElement.ofChildren("Name", children).getChildren();
    assertEquals(2, children2.size());
    assertSame(ofChildrenResult2, children2.get(1));
  }

  /**
   * Test {@link XmlElement#ofChildren(String, List)} with {@code name}, {@code children}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Content is empty string.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#ofChildren(String, List)}
   */
  @Test
  @DisplayName(
      "Test ofChildren(String, List) with 'name', 'children'; when ArrayList(); then return Content is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.ofChildren(String, List)"})
  void testOfChildrenWithNameChildren_whenArrayList_thenReturnContentIsEmptyString() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();

    // Act
    XmlElement actualOfChildrenResult = XmlElement.ofChildren("Name", children);

    // Assert
    assertEquals("", actualOfChildrenResult.getContent());
    assertEquals("Name", actualOfChildrenResult.getName());
    assertFalse(actualOfChildrenResult.hasContent());
    assertTrue(actualOfChildrenResult.getAttributes().isEmpty());
    assertEquals(children, actualOfChildrenResult.getChildren());
  }

  /**
   * Test {@link XmlElement#getAttribute(String)}.
   *
   * <p>Method under test: {@link XmlElement#getAttribute(String)}
   */
  @Test
  @DisplayName("Test getAttribute(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.getAttribute(String)"})
  void testGetAttribute() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("{}", "Unknown attribute '{}' on element '{}'");
    attributes.put("Unknown attribute '{}' on element '{}'", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult.getAttribute("Attr Name"));
  }

  /**
   * Test {@link XmlElement#getAttribute(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code Unknown attribute '{}' on element
   *       '{}'}.
   *   <li>When {@code Attr Name}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getAttribute(String)}
   */
  @Test
  @DisplayName(
      "Test getAttribute(String); given HashMap() '42' is 'Unknown attribute '{}' on element '{}''; when 'Attr Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.getAttribute(String)"})
  void testGetAttribute_givenHashMap42IsUnknownAttributeOnElement_whenAttrName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("42", "Unknown attribute '{}' on element '{}'");
    attributes.put("Unknown attribute '{}' on element '{}'", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult.getAttribute("Attr Name"));
  }

  /**
   * Test {@link XmlElement#getAttribute(String)}.
   *
   * <ul>
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getAttribute(String)}
   */
  @Test
  @DisplayName("Test getAttribute(String); then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.getAttribute(String)"})
  void testGetAttribute_thenReturn42() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("{}", "Unknown attribute '{}' on element '{}'");
    attributes.put("Unknown attribute '{}' on element '{}'", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertEquals("42", ofChildrenResult.getAttribute("Unknown attribute '{}' on element '{}'"));
  }

  /**
   * Test {@link XmlElement#getAttribute(String)}.
   *
   * <ul>
   *   <li>When {@code Attr Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getAttribute(String)}
   */
  @Test
  @DisplayName("Test getAttribute(String); when 'Attr Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.getAttribute(String)"})
  void testGetAttribute_whenAttrName_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult.getAttribute("Attr Name"));
  }

  /**
   * Test {@link XmlElement#getAttribute(String)}.
   *
   * <ul>
   *   <li>When {@code Attr Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getAttribute(String)}
   */
  @Test
  @DisplayName("Test getAttribute(String); when 'Attr Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.getAttribute(String)"})
  void testGetAttribute_whenAttrName_thenThrowIllegalArgumentException2() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("Unknown attribute '{}' on element '{}'", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult.getAttribute("Attr Name"));
  }

  /**
   * Test {@link XmlElement#getAttribute(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getAttribute(String)}
   */
  @Test
  @DisplayName("Test getAttribute(String); when 'null'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.getAttribute(String)"})
  void testGetAttribute_whenNull_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult.getAttribute(null));
  }

  /**
   * Test {@link XmlElement#getAttribute(String)}.
   *
   * <ul>
   *   <li>When {@code Unknown attribute '{}' on element '{}'}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getAttribute(String)}
   */
  @Test
  @DisplayName(
      "Test getAttribute(String); when 'Unknown attribute '{}' on element '{}''; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.getAttribute(String)"})
  void testGetAttribute_whenUnknownAttributeOnElement_thenReturn42() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("Unknown attribute '{}' on element '{}'", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertEquals("42", ofChildrenResult.getAttribute("Unknown attribute '{}' on element '{}'"));
  }

  /**
   * Test {@link XmlElement#findAttribute(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   *   <li>When {@code 42}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findAttribute(String)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(String); given HashMap() '42' is 'Value'; when '42'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findAttribute(String)"})
  void testFindAttribute_givenHashMap42IsValue_when42_thenReturnGetIsValue() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("42", "Value");
    attributes.put("Key", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act
    Optional<String> actualFindAttributeResult = ofChildrenResult.findAttribute("42");

    // Assert
    assertEquals("Value", actualFindAttributeResult.get());
    assertTrue(actualFindAttributeResult.isPresent());
  }

  /**
   * Test {@link XmlElement#findAttribute(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   *   <li>When {@code Attr Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findAttribute(String)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(String); given HashMap() '42' is 'Value'; when 'Attr Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findAttribute(String)"})
  void testFindAttribute_givenHashMap42IsValue_whenAttrName_thenReturnNotPresent() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("42", "Value");
    attributes.put("Key", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertFalse(ofChildrenResult.findAttribute("Attr Name").isPresent());
  }

  /**
   * Test {@link XmlElement#findAttribute(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code 42}.
   *   <li>When {@code Attr Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findAttribute(String)}
   */
  @Test
  @DisplayName(
      "Test findAttribute(String); given HashMap() 'Key' is '42'; when 'Attr Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findAttribute(String)"})
  void testFindAttribute_givenHashMapKeyIs42_whenAttrName_thenReturnNotPresent() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("Key", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertFalse(ofChildrenResult.findAttribute("Attr Name").isPresent());
  }

  /**
   * Test {@link XmlElement#findAttribute(String)}.
   *
   * <ul>
   *   <li>When {@code Attr Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findAttribute(String)}
   */
  @Test
  @DisplayName("Test findAttribute(String); when 'Attr Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findAttribute(String)"})
  void testFindAttribute_whenAttrName_thenReturnNotPresent() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertFalse(ofChildrenResult.findAttribute("Attr Name").isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link XmlElement#getAttributes()}
   *   <li>{@link XmlElement#getChildren()}
   *   <li>{@link XmlElement#getContent()}
   *   <li>{@link XmlElement#getName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap XmlElement.getAttributes()",
    "ImmutableList XmlElement.getChildren()",
    "String XmlElement.getContent()",
    "String XmlElement.getName()"
  })
  void testGettersAndSetters() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act
    ImmutableMap<String, String> actualAttributes = ofChildrenResult.getAttributes();
    ImmutableList<XmlElement> actualChildren = ofChildrenResult.getChildren();
    String actualContent = ofChildrenResult.getContent();

    // Assert
    assertEquals("", actualContent);
    assertEquals("Name", ofChildrenResult.getName());
    assertTrue(actualAttributes.isEmpty());
    assertTrue(actualChildren.isEmpty());
  }

  /**
   * Test {@link XmlElement#hasContent()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#hasContent()}
   */
  @Test
  @DisplayName("Test hasContent(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.hasContent()"})
  void testHasContent_thenReturnFalse() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertFalse(ofChildrenResult.hasContent());
  }

  /**
   * Test {@link XmlElement#hasContent()}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#hasContent()}
   */
  @Test
  @DisplayName("Test hasContent(); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.hasContent()"})
  void testHasContent_thenReturnTrue() {
    // Arrange
    XmlElement ofContentResult =
        XmlElement.ofContent("Name", new HashMap<>(), "Not all who wander are lost");

    // Act and Assert
    assertTrue(ofContentResult.hasContent());
  }

  /**
   * Test {@link XmlElement#getChild(String)} with {@code childName}.
   *
   * <p>Method under test: {@link XmlElement#getChild(String)}
   */
  @Test
  @DisplayName("Test getChild(String) with 'childName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.getChild(String)"})
  void testGetChildWithChildName() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult =
        XmlElement.ofChildren("Child Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertSame(ofChildrenResult, ofChildrenResult2.getChild("Child Name"));
  }

  /**
   * Test {@link XmlElement#getChild(String)} with {@code childName}.
   *
   * <ul>
   *   <li>When {@code Child Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getChild(String)}
   */
  @Test
  @DisplayName(
      "Test getChild(String) with 'childName'; when 'Child Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.getChild(String)"})
  void testGetChildWithChildName_whenChildName_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult.getChild("Child Name"));
  }

  /**
   * Test {@link XmlElement#getChild(String)} with {@code childName}.
   *
   * <ul>
   *   <li>When {@code Child Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getChild(String)}
   */
  @Test
  @DisplayName(
      "Test getChild(String) with 'childName'; when 'Child Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.getChild(String)"})
  void testGetChildWithChildName_whenChildName_thenThrowIllegalArgumentException2() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult =
        XmlElement.ofChildren(
            "Unknown element '{}' in element '{}'", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult2.getChild("Child Name"));
  }

  /**
   * Test {@link XmlElement#getChild(String)} with {@code childName}.
   *
   * <ul>
   *   <li>When {@code Child Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getChild(String)}
   */
  @Test
  @DisplayName(
      "Test getChild(String) with 'childName'; when 'Child Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.getChild(String)"})
  void testGetChildWithChildName_whenChildName_thenThrowIllegalArgumentException3() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult =
        XmlElement.ofChildren(
            "Unknown element '{}' in element '{}'", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult2 =
        XmlElement.ofChildren(
            "Unknown element '{}' in element '{}'", attributes2, new ArrayList<>());
    children.add(ofChildrenResult2);
    XmlElement ofChildrenResult3 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofChildrenResult3.getChild("Child Name"));
  }

  /**
   * Test {@link XmlElement#getChild(int)} with {@code index}.
   *
   * <p>Method under test: {@link XmlElement#getChild(int)}
   */
  @Test
  @DisplayName("Test getChild(int) with 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.getChild(int)"})
  void testGetChildWithIndex() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", attributes2, new ArrayList<>());
    children.add(ofChildrenResult2);
    XmlElement ofChildrenResult3 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertSame(ofChildrenResult2, ofChildrenResult3.getChild(1));
  }

  /**
   * Test {@link XmlElement#getChild(int)} with {@code index}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getChild(int)}
   */
  @Test
  @DisplayName("Test getChild(int) with 'index'; when zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"XmlElement XmlElement.getChild(int)"})
  void testGetChildWithIndex_whenZero() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertSame(ofChildrenResult, ofChildrenResult2.getChild(0));
  }

  /**
   * Test {@link XmlElement#getChildren(String)} with {@code String}.
   *
   * <p>Method under test: {@link XmlElement#getChildren(String)}
   */
  @Test
  @DisplayName("Test getChildren(String) with 'String'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList XmlElement.getChildren(String)"})
  void testGetChildrenWithString() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertTrue(ofChildrenResult2.getChildren("Child Name").isEmpty());
  }

  /**
   * Test {@link XmlElement#getChildren(String)} with {@code String}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getChildren(String)}
   */
  @Test
  @DisplayName("Test getChildren(String) with 'String'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList XmlElement.getChildren(String)"})
  void testGetChildrenWithString_thenReturnEmpty() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertTrue(ofChildrenResult.getChildren("Child Name").isEmpty());
  }

  /**
   * Test {@link XmlElement#getChildren(String)} with {@code String}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getChildren(String)}
   */
  @Test
  @DisplayName("Test getChildren(String) with 'String'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList XmlElement.getChildren(String)"})
  void testGetChildrenWithString_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult =
        XmlElement.ofChildren("Child Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act
    ImmutableList<XmlElement> actualChildren = ofChildrenResult2.getChildren("Child Name");

    // Assert
    assertEquals(1, actualChildren.size());
    assertSame(ofChildrenResult, actualChildren.get(0));
  }

  /**
   * Test {@link XmlElement#getChildren(String)} with {@code String}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#getChildren(String)}
   */
  @Test
  @DisplayName("Test getChildren(String) with 'String'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList XmlElement.getChildren(String)"})
  void testGetChildrenWithString_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult =
        XmlElement.ofChildren("Child Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult2 =
        XmlElement.ofChildren("Child Name", attributes2, new ArrayList<>());
    children.add(ofChildrenResult2);
    XmlElement ofChildrenResult3 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act
    ImmutableList<XmlElement> actualChildren = ofChildrenResult3.getChildren("Child Name");

    // Assert
    assertEquals(2, actualChildren.size());
    assertSame(ofChildrenResult2, actualChildren.get(1));
  }

  /**
   * Test {@link XmlElement#streamChildren(String)}.
   *
   * <p>Method under test: {@link XmlElement#streamChildren(String)}
   */
  @Test
  @DisplayName("Test streamChildren(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream XmlElement.streamChildren(String)"})
  void testStreamChildren() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act
    Stream<XmlElement> actualStreamChildrenResult = ofChildrenResult.streamChildren("Child Name");

    // Assert
    assertTrue(actualStreamChildrenResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link XmlElement#streamChildren(String)}.
   *
   * <p>Method under test: {@link XmlElement#streamChildren(String)}
   */
  @Test
  @DisplayName("Test streamChildren(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream XmlElement.streamChildren(String)"})
  void testStreamChildren2() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act
    Stream<XmlElement> actualStreamChildrenResult = ofChildrenResult2.streamChildren("Child Name");

    // Assert
    assertTrue(actualStreamChildrenResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link XmlElement#metaBean()}.
   *
   * <p>Method under test: {@link XmlElement#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean XmlElement.metaBean()"})
  void testMetaBean() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act
    MetaBean actualMetaBeanResult = ofChildrenResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("attributes"));
    assertTrue(metaPropertyMapResult.containsKey("children"));
    assertTrue(metaPropertyMapResult.containsKey("content"));
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<XmlElement> expectedBeanTypeResult = XmlElement.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link XmlElement#findChild(String)}.
   *
   * <ul>
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findChild(String)}
   */
  @Test
  @DisplayName("Test findChild(String); then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findChild(String)"})
  void testFindChild_thenReturnPresent() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult =
        XmlElement.ofChildren("Child Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act
    Optional<XmlElement> actualFindChildResult = ofChildrenResult2.findChild("Child Name");

    // Assert
    assertTrue(actualFindChildResult.isPresent());
    assertSame(ofChildrenResult, actualFindChildResult.get());
  }

  /**
   * Test {@link XmlElement#findChild(String)}.
   *
   * <ul>
   *   <li>When {@code Child Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findChild(String)}
   */
  @Test
  @DisplayName("Test findChild(String); when 'Child Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findChild(String)"})
  void testFindChild_whenChildName_thenReturnNotPresent() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertFalse(ofChildrenResult.findChild("Child Name").isPresent());
  }

  /**
   * Test {@link XmlElement#findChild(String)}.
   *
   * <ul>
   *   <li>When {@code Child Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findChild(String)}
   */
  @Test
  @DisplayName("Test findChild(String); when 'Child Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findChild(String)"})
  void testFindChild_whenChildName_thenReturnNotPresent2() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertFalse(ofChildrenResult2.findChild("Child Name").isPresent());
  }

  /**
   * Test {@link XmlElement#findChild(String)}.
   *
   * <ul>
   *   <li>When {@code Child Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#findChild(String)}
   */
  @Test
  @DisplayName("Test findChild(String); when 'Child Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional XmlElement.findChild(String)"})
  void testFindChild_whenChildName_thenReturnNotPresent3() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", attributes2, new ArrayList<>());
    children.add(ofChildrenResult2);
    XmlElement ofChildrenResult3 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertFalse(ofChildrenResult3.findChild("Child Name").isPresent());
  }

  /**
   * Test {@link XmlElement#equals(Object)}, and {@link XmlElement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link XmlElement#equals(Object)}
   *   <li>{@link XmlElement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", attributes2, new ArrayList<>());

    // Act and Assert
    assertEquals(ofChildrenResult, ofChildrenResult2);
    assertEquals(ofChildrenResult.hashCode(), ofChildrenResult2.hashCode());
  }

  /**
   * Test {@link XmlElement#equals(Object)}, and {@link XmlElement#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link XmlElement#equals(Object)}
   *   <li>{@link XmlElement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    ArrayList<XmlElement> children2 = new ArrayList<>();
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult3 = XmlElement.ofChildren("Name", attributes2, new ArrayList<>());
    children2.add(ofChildrenResult3);
    XmlElement ofChildrenResult4 = XmlElement.ofChildren("Name", new HashMap<>(), children2);

    // Act and Assert
    assertEquals(ofChildrenResult2, ofChildrenResult4);
    assertEquals(ofChildrenResult2.hashCode(), ofChildrenResult4.hashCode());
  }

  /**
   * Test {@link XmlElement#equals(Object)}, and {@link XmlElement#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link XmlElement#equals(Object)}
   *   <li>{@link XmlElement#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertEquals(ofChildrenResult, ofChildrenResult);
    int expectedHashCodeResult = ofChildrenResult.hashCode();
    assertEquals(expectedHashCodeResult, ofChildrenResult.hashCode());
  }

  /**
   * Test {@link XmlElement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    XmlElement ofContentResult =
        XmlElement.ofContent("Name", new HashMap<>(), "Not all who wander are lost");
    HashMap<String, String> attributes = new HashMap<>();

    // Act and Assert
    assertNotEquals(ofContentResult, XmlElement.ofChildren("Name", attributes, new ArrayList<>()));
  }

  /**
   * Test {@link XmlElement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("42", attributes, new ArrayList<>());
    HashMap<String, String> attributes2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofChildrenResult, XmlElement.ofChildren("Name", attributes2, new ArrayList<>()));
  }

  /**
   * Test {@link XmlElement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("Name", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    HashMap<String, String> attributes2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofChildrenResult, XmlElement.ofChildren("Name", attributes2, new ArrayList<>()));
  }

  /**
   * Test {@link XmlElement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);
    HashMap<String, String> attributes2 = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        ofChildrenResult2, XmlElement.ofChildren("Name", attributes2, new ArrayList<>()));
  }

  /**
   * Test {@link XmlElement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();

    // Act and Assert
    assertNotEquals(XmlElement.ofChildren("Name", attributes, new ArrayList<>()), null);
  }

  /**
   * Test {@link XmlElement#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean XmlElement.equals(Object)", "int XmlElement.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();

    // Act and Assert
    assertNotEquals(
        XmlElement.ofChildren("Name", attributes, new ArrayList<>()),
        "Different type to XmlElement");
  }

  /**
   * Test {@link XmlElement#toString()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code </}.
   *   <li>Then return {@code <Name </="42" Key="</"></Name>}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given HashMap() 'Key' is '</'; then return '<Name </=\"42\" Key=\"</\"></Name>'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.toString()"})
  void testToString_givenHashMapKeyIsLessThanSignSlash_thenReturnName42KeyName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("Key", "</");
    attributes.put("</", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertEquals("<Name </=\"42\" Key=\"</\"></Name>", ofChildrenResult.toString());
  }

  /**
   * Test {@link XmlElement#toString()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code </} is {@code 42}.
   *   <li>Then return {@code <Name </="42"></Name>}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given HashMap() '</' is '42'; then return '<Name </=\"42\"></Name>'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.toString()"})
  void testToString_givenHashMapLessThanSignSlashIs42_thenReturnName42Name() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("</", "42");
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertEquals("<Name </=\"42\"></Name>", ofChildrenResult.toString());
  }

  /**
   * Test {@link XmlElement#toString()}.
   *
   * <ul>
   *   <li>Then return {@code <Name></Name>}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '<Name></Name>'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.toString()"})
  void testToString_thenReturnNameName() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("Name", attributes, new ArrayList<>());

    // Act and Assert
    assertEquals("<Name></Name>", ofChildrenResult.toString());
  }

  /**
   * Test {@link XmlElement#toString()}.
   *
   * <ul>
   *   <li>Then return {@code <Name> <</ ... /> </Name>}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '<Name> <</ ... /> </Name>'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.toString()"})
  void testToString_thenReturnNameName2() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren("</", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertEquals("<Name>\n <</ ... />\n</Name>", ofChildrenResult2.toString());
  }

  /**
   * Test {@link XmlElement#toString()}.
   *
   * <ul>
   *   <li>Then return {@code <Name> < < ... /> <</ ... /> </Name>}.
   * </ul>
   *
   * <p>Method under test: {@link XmlElement#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return '<Name> < < ... /> <</ ... /> </Name>'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String XmlElement.toString()"})
  void testToString_thenReturnNameName3() {
    // Arrange
    ArrayList<XmlElement> children = new ArrayList<>();
    HashMap<String, String> attributes = new HashMap<>();
    XmlElement ofChildrenResult = XmlElement.ofChildren(" <", attributes, new ArrayList<>());
    children.add(ofChildrenResult);
    HashMap<String, String> attributes2 = new HashMap<>();
    XmlElement ofChildrenResult2 = XmlElement.ofChildren("</", attributes2, new ArrayList<>());
    children.add(ofChildrenResult2);
    XmlElement ofChildrenResult3 = XmlElement.ofChildren("Name", new HashMap<>(), children);

    // Act and Assert
    assertEquals("<Name>\n < < ... />\n <</ ... />\n</Name>", ofChildrenResult3.toString());
  }
}
