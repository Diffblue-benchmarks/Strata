package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.UnicodeBom.UnicodeBomCharSource;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IniFileDiffblueTest {
  /**
   * Test {@link IniFile#of(Map)} with {@code sectionMap}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is empty.
   *   <li>Then return sections size is two.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'sectionMap'; given '42'; when HashMap() '42' is empty; then return sections size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(Map)"})
  void testOfWithSectionMap_given42_whenHashMap42IsEmpty_thenReturnSectionsSizeIsTwo() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("42", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());

    // Act
    IniFile actualOfResult = IniFile.of(sectionMap);

    // Assert
    ImmutableSet<String> sectionsResult = actualOfResult.sections();
    assertEquals(2, sectionsResult.size());
    ImmutableMap<String, PropertySet> asMapResult = actualOfResult.asMap();
    assertEquals(2, asMapResult.size());
    assertTrue(sectionsResult.contains("42"));
    assertTrue(sectionsResult.contains("Key"));
    PropertySet getResult = asMapResult.get("42");
    assertTrue(getResult.isEmpty());
    assertSame(getResult, asMapResult.get("Key"));
  }

  /**
   * Test {@link IniFile#of(Map)} with {@code sectionMap}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>Then return sections size is three.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'sectionMap'; given empty string; then return sections size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(Map)"})
  void testOfWithSectionMap_givenEmptyString_thenReturnSectionsSizeIsThree() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("", PropertySet.empty());
    sectionMap.put("42", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());

    // Act
    IniFile actualOfResult = IniFile.of(sectionMap);

    // Assert
    ImmutableSet<String> sectionsResult = actualOfResult.sections();
    assertEquals(3, sectionsResult.size());
    ImmutableMap<String, PropertySet> asMapResult = actualOfResult.asMap();
    assertEquals(3, asMapResult.size());
    assertTrue(sectionsResult.contains("42"));
    assertTrue(sectionsResult.contains("Key"));
    assertTrue(asMapResult.containsKey(""));
    assertTrue(asMapResult.containsKey("42"));
    assertTrue(asMapResult.containsKey("Key"));
  }

  /**
   * Test {@link IniFile#of(Map)} with {@code sectionMap}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code foo} is empty.
   *   <li>Then return sections size is four.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'sectionMap'; given 'foo'; when HashMap() 'foo' is empty; then return sections size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(Map)"})
  void testOfWithSectionMap_givenFoo_whenHashMapFooIsEmpty_thenReturnSectionsSizeIsFour() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("foo", PropertySet.empty());
    sectionMap.put("", PropertySet.empty());
    sectionMap.put("42", PropertySet.empty());
    PropertySet emptyResult = PropertySet.empty();
    sectionMap.put("Key", emptyResult);

    // Act
    IniFile actualOfResult = IniFile.of(sectionMap);

    // Assert
    ImmutableSet<String> sectionsResult = actualOfResult.sections();
    assertEquals(4, sectionsResult.size());
    ImmutableMap<String, PropertySet> asMapResult = actualOfResult.asMap();
    assertEquals(4, asMapResult.size());
    assertTrue(sectionsResult.contains("42"));
    assertTrue(sectionsResult.contains("Key"));
    assertTrue(sectionsResult.contains("foo"));
    assertTrue(asMapResult.containsKey(""));
    assertTrue(asMapResult.containsKey("42"));
    assertTrue(asMapResult.containsKey("Key"));
    assertSame(emptyResult, asMapResult.get("foo"));
  }

  /**
   * Test {@link IniFile#of(Map)} with {@code sectionMap}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code Key} is empty.
   *   <li>Then return sections size is one.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'sectionMap'; when HashMap() 'Key' is empty; then return sections size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(Map)"})
  void testOfWithSectionMap_whenHashMapKeyIsEmpty_thenReturnSectionsSizeIsOne() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());

    // Act
    IniFile actualOfResult = IniFile.of(sectionMap);

    // Assert
    ImmutableSet<String> sectionsResult = actualOfResult.sections();
    assertEquals(1, sectionsResult.size());
    ImmutableMap<String, PropertySet> asMapResult = actualOfResult.asMap();
    assertEquals(1, asMapResult.size());
    assertTrue(sectionsResult.contains("Key"));
    assertTrue(asMapResult.get("Key").isEmpty());
  }

  /**
   * Test {@link IniFile#of(Map)} with {@code sectionMap}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return sections Empty.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'sectionMap'; when HashMap(); then return sections Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(Map)"})
  void testOfWithSectionMap_whenHashMap_thenReturnSectionsEmpty() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();

    // Act
    IniFile actualOfResult = IniFile.of(sectionMap);

    // Assert
    assertTrue(actualOfResult.sections().isEmpty());
    assertEquals(sectionMap, actualOfResult.asMap());
  }

  /**
   * Test {@link IniFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource#EMPTY}.
   *   <li>Then return asMap Empty.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; when EMPTY; then return asMap Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(CharSource)"})
  void testOfWithSource_whenEmpty_thenReturnAsMapEmpty() {
    // Arrange and Act
    IniFile actualOfResult = IniFile.of(StringCharSource.EMPTY);

    // Assert
    assertTrue(actualOfResult.asMap().isEmpty());
    assertTrue(actualOfResult.sections().isEmpty());
  }

  /**
   * Test {@link IniFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code [}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; when StringCharSource with str is '['")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(CharSource)"})
  void testOfWithSource_whenStringCharSourceWithStrIsLeftSquareBracket() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IniFile.of(StringCharSource.of("[")));
  }

  /**
   * Test {@link IniFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   *   <li>Then return asMap Empty.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(CharSource)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource) with 'source'; when StringCharSource with str is '#'; then return asMap Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(CharSource)"})
  void testOfWithSource_whenStringCharSourceWithStrIsNumberSign_thenReturnAsMapEmpty() {
    // Arrange and Act
    IniFile actualOfResult = IniFile.of(StringCharSource.of("#"));

    // Assert
    assertTrue(actualOfResult.asMap().isEmpty());
    assertTrue(actualOfResult.sections().isEmpty());
  }

  /**
   * Test {@link IniFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   *   <li>Then return asMap Empty.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(CharSource)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource) with 'source'; when StringCharSource with str is ';'; then return asMap Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(CharSource)"})
  void testOfWithSource_whenStringCharSourceWithStrIsSemicolon_thenReturnAsMapEmpty() {
    // Arrange and Act
    IniFile actualOfResult = IniFile.of(StringCharSource.of(";"));

    // Assert
    assertTrue(actualOfResult.asMap().isEmpty());
    assertTrue(actualOfResult.sections().isEmpty());
  }

  /**
   * Test {@link IniFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(CharSource)}
   */
  @Test
  @DisplayName("Test of(CharSource) with 'source'; when StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(CharSource)"})
  void testOfWithSource_whenStringCharSourceWithStrIsSource() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> IniFile.of(StringCharSource.of("source")));
  }

  /**
   * Test {@link IniFile#of(CharSource)} with {@code source}.
   *
   * <ul>
   *   <li>When {@link UnicodeBomCharSource#UnicodeBomCharSource(BeanByteSource)} with underlying is
   *       {@link ArrayByteSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#of(CharSource)}
   */
  @Test
  @DisplayName(
      "Test of(CharSource) with 'source'; when UnicodeBomCharSource(BeanByteSource) with underlying is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.of(CharSource)"})
  void testOfWithSource_whenUnicodeBomCharSourceWithUnderlyingIsEmpty() {
    // Arrange and Act
    IniFile actualOfResult = IniFile.of(new UnicodeBomCharSource(ArrayByteSource.EMPTY));

    // Assert
    assertTrue(actualOfResult.asMap().isEmpty());
    assertTrue(actualOfResult.sections().isEmpty());
  }

  /**
   * Test {@link IniFile#sections()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code 42} is empty.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#sections()}
   */
  @Test
  @DisplayName("Test sections(); given HashMap() '42' is empty; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet IniFile.sections()"})
  void testSections_givenHashMap42IsEmpty_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("42", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act
    ImmutableSet<String> actualSectionsResult = ofResult.sections();

    // Assert
    assertEquals(2, actualSectionsResult.size());
    assertTrue(actualSectionsResult.contains("42"));
    assertTrue(actualSectionsResult.contains("Key"));
  }

  /**
   * Test {@link IniFile#sections()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is empty.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#sections()}
   */
  @Test
  @DisplayName("Test sections(); given HashMap() 'Key' is empty; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet IniFile.sections()"})
  void testSections_givenHashMapKeyIsEmpty_thenReturnSizeIsOne() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act
    ImmutableSet<String> actualSectionsResult = ofResult.sections();

    // Assert
    assertEquals(1, actualSectionsResult.size());
    assertTrue(actualSectionsResult.contains("Key"));
  }

  /**
   * Test {@link IniFile#sections()}.
   *
   * <ul>
   *   <li>Given {@link IniFile} with source is {@link StringCharSource#EMPTY}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#sections()}
   */
  @Test
  @DisplayName("Test sections(); given IniFile with source is EMPTY; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet IniFile.sections()"})
  void testSections_givenIniFileWithSourceIsEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(IniFile.of(StringCharSource.EMPTY).sections().isEmpty());
  }

  /**
   * Test {@link IniFile#asMap()}.
   *
   * <p>Method under test: {@link IniFile#asMap()}
   */
  @Test
  @DisplayName("Test asMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap IniFile.asMap()"})
  void testAsMap() {
    // Arrange, Act and Assert
    assertTrue(IniFile.of(StringCharSource.EMPTY).asMap().isEmpty());
  }

  /**
   * Test {@link IniFile#contains(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code foo} is empty.
   *   <li>When {@code Name}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#contains(String)}
   */
  @Test
  @DisplayName(
      "Test contains(String); given HashMap() 'foo' is empty; when 'Name'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.contains(String)"})
  void testContains_givenHashMapFooIsEmpty_whenName_thenReturnFalse() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("foo", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act and Assert
    assertFalse(ofResult.contains("Name"));
  }

  /**
   * Test {@link IniFile#contains(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is empty.
   *   <li>When {@code Name}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#contains(String)}
   */
  @Test
  @DisplayName(
      "Test contains(String); given HashMap() 'Key' is empty; when 'Name'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.contains(String)"})
  void testContains_givenHashMapKeyIsEmpty_whenName_thenReturnFalse() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act and Assert
    assertFalse(ofResult.contains("Name"));
  }

  /**
   * Test {@link IniFile#contains(String)}.
   *
   * <ul>
   *   <li>Given {@link IniFile} with source is {@link StringCharSource#EMPTY}.
   *   <li>When {@code Name}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#contains(String)}
   */
  @Test
  @DisplayName(
      "Test contains(String); given IniFile with source is EMPTY; when 'Name'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.contains(String)"})
  void testContains_givenIniFileWithSourceIsEmpty_whenName_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(IniFile.of(StringCharSource.EMPTY).contains("Name"));
  }

  /**
   * Test {@link IniFile#section(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code foo} is empty.
   *   <li>When {@code Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#section(String)}
   */
  @Test
  @DisplayName(
      "Test section(String); given HashMap() 'foo' is empty; when 'Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet IniFile.section(String)"})
  void testSection_givenHashMapFooIsEmpty_whenName_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("foo", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.section("Name"));
  }

  /**
   * Test {@link IniFile#section(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is empty.
   *   <li>When {@code Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#section(String)}
   */
  @Test
  @DisplayName(
      "Test section(String); given HashMap() 'Key' is empty; when 'Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet IniFile.section(String)"})
  void testSection_givenHashMapKeyIsEmpty_whenName_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.section("Name"));
  }

  /**
   * Test {@link IniFile#section(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Unknown INI file section:} is empty.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#section(String)}
   */
  @Test
  @DisplayName("Test section(String); given HashMap() 'Unknown INI file section:' is empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet IniFile.section(String)"})
  void testSection_givenHashMapUnknownIniFileSectionIsEmpty() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Unknown INI file section: ", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.section("Name"));
  }

  /**
   * Test {@link IniFile#section(String)}.
   *
   * <ul>
   *   <li>Given {@link IniFile} with source is {@link StringCharSource#EMPTY}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#section(String)}
   */
  @Test
  @DisplayName(
      "Test section(String); given IniFile with source is EMPTY; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet IniFile.section(String)"})
  void testSection_givenIniFileWithSourceIsEmpty_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> IniFile.of(StringCharSource.EMPTY).section("Name"));
  }

  /**
   * Test {@link IniFile#section(String)}.
   *
   * <ul>
   *   <li>When {@code Unknown INI file section:}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#section(String)}
   */
  @Test
  @DisplayName("Test section(String); when 'Unknown INI file section:'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet IniFile.section(String)"})
  void testSection_whenUnknownIniFileSection_thenReturnEmpty() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Unknown INI file section: ", PropertySet.empty());
    PropertySet emptyResult = PropertySet.empty();
    sectionMap.put("Key", emptyResult);
    IniFile ofResult = IniFile.of(sectionMap);

    // Act
    PropertySet actualSectionResult = ofResult.section("Unknown INI file section: ");

    // Assert
    assertTrue(actualSectionResult.isEmpty());
    assertSame(emptyResult, actualSectionResult);
  }

  /**
   * Test {@link IniFile#findSection(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code foo} is empty.
   *   <li>When {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#findSection(String)}
   */
  @Test
  @DisplayName(
      "Test findSection(String); given HashMap() 'foo' is empty; when 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional IniFile.findSection(String)"})
  void testFindSection_givenHashMapFooIsEmpty_whenName_thenReturnNotPresent() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("foo", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act and Assert
    assertFalse(ofResult.findSection("Name").isPresent());
  }

  /**
   * Test {@link IniFile#findSection(String)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is empty.
   *   <li>When {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#findSection(String)}
   */
  @Test
  @DisplayName(
      "Test findSection(String); given HashMap() 'Key' is empty; when 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional IniFile.findSection(String)"})
  void testFindSection_givenHashMapKeyIsEmpty_whenName_thenReturnNotPresent() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act and Assert
    assertFalse(ofResult.findSection("Name").isPresent());
  }

  /**
   * Test {@link IniFile#findSection(String)}.
   *
   * <ul>
   *   <li>Given {@link IniFile} with source is {@link StringCharSource#EMPTY}.
   *   <li>When {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#findSection(String)}
   */
  @Test
  @DisplayName(
      "Test findSection(String); given IniFile with source is EMPTY; when 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional IniFile.findSection(String)"})
  void testFindSection_givenIniFileWithSourceIsEmpty_whenName_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(IniFile.of(StringCharSource.EMPTY).findSection("Name").isPresent());
  }

  /**
   * Test {@link IniFile#combinedWith(IniFile)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} empty string is empty.
   *   <li>Then return sections size is three.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#combinedWith(IniFile)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(IniFile); given HashMap() empty string is empty; then return sections size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.combinedWith(IniFile)"})
  void testCombinedWith_givenHashMapEmptyStringIsEmpty_thenReturnSectionsSizeIsThree() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("", PropertySet.empty());
    sectionMap.put("foo", PropertySet.empty());
    PropertySet emptyResult = PropertySet.empty();
    sectionMap.put("Key", emptyResult);
    IniFile ofResult = IniFile.of(sectionMap);

    // Act
    IniFile actualCombinedWithResult = ofResult.combinedWith(IniFile.of(StringCharSource.EMPTY));

    // Assert
    ImmutableSet<String> sectionsResult = actualCombinedWithResult.sections();
    assertEquals(3, sectionsResult.size());
    ImmutableMap<String, PropertySet> asMapResult = actualCombinedWithResult.asMap();
    assertEquals(3, asMapResult.size());
    assertTrue(sectionsResult.contains(""));
    assertTrue(sectionsResult.contains("Key"));
    assertTrue(sectionsResult.contains("foo"));
    PropertySet getResult = asMapResult.get("");
    assertTrue(getResult.isEmpty());
    assertSame(getResult, asMapResult.get("Key"));
    assertSame(getResult, asMapResult.get("foo"));
    assertSame(emptyResult, getResult);
  }

  /**
   * Test {@link IniFile#combinedWith(IniFile)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code foo} is empty.
   *   <li>Then return sections size is two.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#combinedWith(IniFile)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(IniFile); given HashMap() 'foo' is empty; then return sections size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.combinedWith(IniFile)"})
  void testCombinedWith_givenHashMapFooIsEmpty_thenReturnSectionsSizeIsTwo() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("foo", PropertySet.empty());
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act
    IniFile actualCombinedWithResult = ofResult.combinedWith(IniFile.of(StringCharSource.EMPTY));

    // Assert
    ImmutableSet<String> sectionsResult = actualCombinedWithResult.sections();
    assertEquals(2, sectionsResult.size());
    ImmutableMap<String, PropertySet> asMapResult = actualCombinedWithResult.asMap();
    assertEquals(2, asMapResult.size());
    assertTrue(sectionsResult.contains("Key"));
    assertTrue(sectionsResult.contains("foo"));
    PropertySet getResult = asMapResult.get("foo");
    assertTrue(getResult.isEmpty());
    assertSame(getResult, asMapResult.get("Key"));
  }

  /**
   * Test {@link IniFile#combinedWith(IniFile)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is empty.
   *   <li>Then return sections size is one.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#combinedWith(IniFile)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(IniFile); given HashMap() 'Key' is empty; then return sections size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.combinedWith(IniFile)"})
  void testCombinedWith_givenHashMapKeyIsEmpty_thenReturnSectionsSizeIsOne() {
    // Arrange
    HashMap<String, PropertySet> sectionMap = new HashMap<>();
    sectionMap.put("Key", PropertySet.empty());
    IniFile ofResult = IniFile.of(sectionMap);

    // Act
    IniFile actualCombinedWithResult = ofResult.combinedWith(IniFile.of(StringCharSource.EMPTY));

    // Assert
    ImmutableSet<String> sectionsResult = actualCombinedWithResult.sections();
    assertEquals(1, sectionsResult.size());
    ImmutableMap<String, PropertySet> asMapResult = actualCombinedWithResult.asMap();
    assertEquals(1, asMapResult.size());
    assertTrue(sectionsResult.contains("Key"));
    assertTrue(asMapResult.get("Key").isEmpty());
  }

  /**
   * Test {@link IniFile#combinedWith(IniFile)}.
   *
   * <ul>
   *   <li>Then return {@link IniFile} with source is {@link StringCharSource#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#combinedWith(IniFile)}
   */
  @Test
  @DisplayName("Test combinedWith(IniFile); then return IniFile with source is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IniFile IniFile.combinedWith(IniFile)"})
  void testCombinedWith_thenReturnIniFileWithSourceIsEmpty() {
    // Arrange
    IniFile ofResult = IniFile.of(StringCharSource.EMPTY);

    // Act
    IniFile actualCombinedWithResult = ofResult.combinedWith(IniFile.of(StringCharSource.EMPTY));

    // Assert
    assertEquals(ofResult, actualCombinedWithResult);
  }

  /**
   * Test {@link IniFile#equals(Object)}, and {@link IniFile#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IniFile#equals(Object)}
   *   <li>{@link IniFile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.equals(Object)", "int IniFile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    IniFile ofResult = IniFile.of(StringCharSource.EMPTY);
    IniFile ofResult2 = IniFile.of(StringCharSource.EMPTY);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link IniFile#equals(Object)}, and {@link IniFile#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link IniFile#equals(Object)}
   *   <li>{@link IniFile#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.equals(Object)", "int IniFile.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    IniFile ofResult = IniFile.of(StringCharSource.EMPTY);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link IniFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.equals(Object)", "int IniFile.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IniFile.of(StringCharSource.EMPTY), 1);
  }

  /**
   * Test {@link IniFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.equals(Object)", "int IniFile.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IniFile.of(StringCharSource.EMPTY), null);
  }

  /**
   * Test {@link IniFile#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link IniFile#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean IniFile.equals(Object)", "int IniFile.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(IniFile.of(StringCharSource.EMPTY), "Different type to IniFile");
  }

  /**
   * Test {@link IniFile#toString()}.
   *
   * <p>Method under test: {@link IniFile#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IniFile.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("{}", IniFile.of(StringCharSource.EMPTY).toString());
  }
}
