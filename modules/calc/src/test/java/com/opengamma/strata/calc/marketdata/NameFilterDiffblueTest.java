package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.data.MarketDataName;
import com.opengamma.strata.data.NamedMarketDataId;
import com.opengamma.strata.data.scenario.MarketDataBox;
import java.util.Map;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NameFilterDiffblueTest {
  /**
   * Test {@link NameFilter#matches(NamedMarketDataId, MarketDataBox, ReferenceData)} with {@code
   * NamedMarketDataId}, {@code MarketDataBox}, {@code ReferenceData}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link NameFilter#matches(NamedMarketDataId, MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test matches(NamedMarketDataId, MarketDataBox, ReferenceData) with 'NamedMarketDataId', 'MarketDataBox', 'ReferenceData'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NameFilter.matches(NamedMarketDataId, MarketDataBox, ReferenceData)"})
  void testMatchesWithNamedMarketDataIdMarketDataBoxReferenceData_thenReturnFalse() {
    // Arrange
    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("foo");
    NameFilter<Object> nameFilter = new NameFilter<>(name);

    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> marketDataId = mock(NamedMarketDataId.class);
    when(marketDataId.getMarketDataName()).thenReturn(marketDataName);

    // Act
    boolean actualMatchesResult =
        nameFilter.matches(marketDataId, mock(MarketDataBox.class), mock(ReferenceData.class));

    // Assert
    verify(name).getName();
    verify(marketDataName).getName();
    verify(marketDataId).getMarketDataName();
    assertFalse(actualMatchesResult);
  }

  /**
   * Test {@link NameFilter#matches(NamedMarketDataId, MarketDataBox, ReferenceData)} with {@code
   * NamedMarketDataId}, {@code MarketDataBox}, {@code ReferenceData}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link NameFilter#matches(NamedMarketDataId, MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test matches(NamedMarketDataId, MarketDataBox, ReferenceData) with 'NamedMarketDataId', 'MarketDataBox', 'ReferenceData'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NameFilter.matches(NamedMarketDataId, MarketDataBox, ReferenceData)"})
  void testMatchesWithNamedMarketDataIdMarketDataBoxReferenceData_thenReturnTrue() {
    // Arrange
    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");
    NameFilter<Object> nameFilter = new NameFilter<>(name);

    MarketDataName<Object> marketDataName = mock(MarketDataName.class);
    when(marketDataName.getName()).thenReturn("Name");

    NamedMarketDataId<Object> marketDataId = mock(NamedMarketDataId.class);
    when(marketDataId.getMarketDataName()).thenReturn(marketDataName);

    // Act
    boolean actualMatchesResult =
        nameFilter.matches(marketDataId, mock(MarketDataBox.class), mock(ReferenceData.class));

    // Assert
    verify(name).getName();
    verify(marketDataName).getName();
    verify(marketDataId).getMarketDataName();
    assertTrue(actualMatchesResult);
  }

  /**
   * Test {@link NameFilter#meta()}.
   *
   * <p>Method under test: {@link NameFilter#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean NameFilter.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = NameFilter.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaResult.isBuildable());
    Class<NameFilter> expectedBeanTypeResult = NameFilter.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link NameFilter#NameFilter(MarketDataName)}.
   *
   * <ul>
   *   <li>Then return MarketDataIdType is {@link NamedMarketDataId}.
   * </ul>
   *
   * <p>Method under test: {@link NameFilter#NameFilter(MarketDataName)}
   */
  @Test
  @DisplayName(
      "Test new NameFilter(MarketDataName); then return MarketDataIdType is NamedMarketDataId")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void NameFilter.<init>(MarketDataName)"})
  void testNewNameFilter_thenReturnMarketDataIdTypeIsNamedMarketDataId() {
    // Arrange
    MarketDataName<Object> name = mock(MarketDataName.class);

    // Act
    NameFilter<Object> actualNameFilter = new NameFilter<>(name);

    // Assert
    Class<NamedMarketDataId> expectedMarketDataIdType = NamedMarketDataId.class;
    assertEquals(expectedMarketDataIdType, actualNameFilter.getMarketDataIdType());
    assertSame(name, actualNameFilter.getName());
  }

  /**
   * Test {@link NameFilter#metaBean()}.
   *
   * <p>Method under test: {@link NameFilter#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean NameFilter.metaBean()"})
  void testMetaBean() {
    // Arrange
    NameFilter<Object> nameFilter = new NameFilter<>(mock(MarketDataName.class));

    // Act
    TypedMetaBean<NameFilter<Object>> actualMetaBeanResult = nameFilter.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(1, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("name"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<NameFilter> expectedBeanTypeResult = NameFilter.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link NameFilter#equals(Object)}, and {@link NameFilter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NameFilter#equals(Object)}
   *   <li>{@link NameFilter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NameFilter.equals(Object)", "int NameFilter.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");
    NameFilter<Object> nameFilter = new NameFilter<>(name);

    MarketDataName<Object> name2 = mock(MarketDataName.class);
    when(name2.getName()).thenReturn("Name");
    NameFilter<Object> nameFilter2 = new NameFilter<>(name2);

    // Act and Assert
    assertEquals(nameFilter, nameFilter2);
    assertEquals(nameFilter.hashCode(), nameFilter2.hashCode());
  }

  /**
   * Test {@link NameFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NameFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NameFilter.equals(Object)", "int NameFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    NameFilter<Object> nameFilter = new NameFilter<>(mock(MarketDataName.class));

    // Act and Assert
    assertNotEquals(nameFilter, "Obj");
  }

  /**
   * Test {@link NameFilter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NameFilter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NameFilter.equals(Object)", "int NameFilter.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    MarketDataName<Object> name = mock(MarketDataName.class);
    when(name.getName()).thenReturn("Name");
    NameFilter<Object> nameFilter = new NameFilter<>(name);

    // Act and Assert
    assertNotEquals(nameFilter, null);
  }
}
