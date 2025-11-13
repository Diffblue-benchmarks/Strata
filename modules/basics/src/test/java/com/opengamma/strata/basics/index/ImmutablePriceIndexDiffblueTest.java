package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.ImmutablePriceIndex.Builder;
import com.opengamma.strata.basics.index.ImmutablePriceIndex.Meta;
import com.opengamma.strata.basics.location.Country;
import com.opengamma.strata.basics.schedule.Frequency;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImmutablePriceIndexDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Builder#build()}
   *   <li>{@link Builder#active(boolean)}
   * </ul>
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Builder Builder.active(boolean)",
    "ImmutablePriceIndex Builder.build()",
    "String Builder.toString()"
  })
  void testBuilderBuild() {
    // Arrange and Act
    ImmutablePriceIndex actualImmutablePriceIndex =
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build();

    // Assert
    assertEquals("Name", actualImmutablePriceIndex.getName());
    assertTrue(actualImmutablePriceIndex.isActive());
    assertSame(Currency.AED, actualImmutablePriceIndex.getCurrency());
    assertSame(Country.AR, actualImmutablePriceIndex.getRegion());
    assertSame(Frequency.P12M, actualImmutablePriceIndex.getPublicationFrequency());
  }

  /**
   * Test Builder {@link Builder#currency(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#currency(Currency)}
   */
  @Test
  @DisplayName("Test Builder currency(Currency); when AED; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.currency(Currency)"})
  void testBuilderCurrency_whenAed_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutablePriceIndex.builder();

    // Act
    Builder actualCurrencyResult = builderResult.currency(Currency.AED);

    // Assert
    assertSame(builderResult, actualCurrencyResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'currency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurrency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutablePriceIndex.builder().get("currency"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutablePriceIndex.builder().get("name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> ImmutablePriceIndex.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code publicationFrequency}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'publicationFrequency'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPublicationFrequency_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutablePriceIndex.builder().get("publicationFrequency"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code region}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'region'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRegion_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutablePriceIndex.builder().get("region"));
  }

  /**
   * Test Builder {@link Builder#name(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(String)}
   */
  @Test
  @DisplayName("Test Builder name(String); when 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(String)"})
  void testBuilderName_whenName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutablePriceIndex.builder();

    // Act
    Builder actualNameResult = builderResult.name("Name");

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#publicationFrequency(Frequency)}.
   *
   * <ul>
   *   <li>When {@link Frequency#P12M}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#publicationFrequency(Frequency)}
   */
  @Test
  @DisplayName("Test Builder publicationFrequency(Frequency); when P12M; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.publicationFrequency(Frequency)"})
  void testBuilderPublicationFrequency_whenP12m_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutablePriceIndex.builder();

    // Act
    Builder actualPublicationFrequencyResult = builderResult.publicationFrequency(Frequency.P12M);

    // Assert
    assertSame(builderResult, actualPublicationFrequencyResult);
  }

  /**
   * Test Builder {@link Builder#region(Country)}.
   *
   * <ul>
   *   <li>When {@link Country#AR}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#region(Country)}
   */
  @Test
  @DisplayName("Test Builder region(Country); when AR; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.region(Country)"})
  void testBuilderRegion_whenAr_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutablePriceIndex.builder();

    // Act
    Builder actualRegionResult = builderResult.region(Country.AR);

    // Assert
    assertSame(builderResult, actualRegionResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ImmutablePriceIndex.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'currency'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCurrency_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutablePriceIndex.builder();

    // Act
    Builder actualSetResult = builderResult.set("currency", Currency.AED);

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutablePriceIndex.builder();

    // Act
    Builder actualSetResult = builderResult.set("name", "42");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ImmutablePriceIndex.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link ImmutablePriceIndex#equals(Object)}, and {@link ImmutablePriceIndex#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutablePriceIndex#equals(Object)}
   *   <li>{@link ImmutablePriceIndex#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutablePriceIndex.equals(Object)",
    "int ImmutablePriceIndex.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ImmutablePriceIndex immutablePriceIndex =
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build();
    ImmutablePriceIndex immutablePriceIndex2 =
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build();

    // Act and Assert
    assertEquals(immutablePriceIndex, immutablePriceIndex2);
    assertEquals(immutablePriceIndex.hashCode(), immutablePriceIndex2.hashCode());
  }

  /**
   * Test {@link ImmutablePriceIndex#equals(Object)}, and {@link ImmutablePriceIndex#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutablePriceIndex#equals(Object)}
   *   <li>{@link ImmutablePriceIndex#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutablePriceIndex.equals(Object)",
    "int ImmutablePriceIndex.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ImmutablePriceIndex immutablePriceIndex =
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build();

    // Act and Assert
    assertEquals(immutablePriceIndex, immutablePriceIndex);
    int expectedHashCodeResult = immutablePriceIndex.hashCode();
    assertEquals(expectedHashCodeResult, immutablePriceIndex.hashCode());
  }

  /**
   * Test {@link ImmutablePriceIndex#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutablePriceIndex#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutablePriceIndex.equals(Object)",
    "int ImmutablePriceIndex.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ImmutablePriceIndex immutablePriceIndex =
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("com.opengamma.strata.basics.currency.Currency")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build();

    // Act and Assert
    assertNotEquals(
        immutablePriceIndex,
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build());
  }

  /**
   * Test {@link ImmutablePriceIndex#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutablePriceIndex#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutablePriceIndex.equals(Object)",
    "int ImmutablePriceIndex.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build(),
        null);
  }

  /**
   * Test {@link ImmutablePriceIndex#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ImmutablePriceIndex#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ImmutablePriceIndex.equals(Object)",
    "int ImmutablePriceIndex.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build(),
        "Different type to ImmutablePriceIndex");
  }

  /**
   * Test {@link ImmutablePriceIndex#meta()}.
   *
   * <p>Method under test: {@link ImmutablePriceIndex#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutablePriceIndex.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ImmutablePriceIndex.meta();

    // Assert
    assertTrue(actualMetaResult.active() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.currency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.publicationFrequency() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.region() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ImmutablePriceIndex#metaBean()}.
   *
   * <p>Method under test: {@link ImmutablePriceIndex#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ImmutablePriceIndex.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build()
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ImmutablePriceIndex#toString()}
   *   <li>{@link ImmutablePriceIndex#getCurrency()}
   *   <li>{@link ImmutablePriceIndex#getName()}
   *   <li>{@link ImmutablePriceIndex#getPublicationFrequency()}
   *   <li>{@link ImmutablePriceIndex#getRegion()}
   *   <li>{@link ImmutablePriceIndex#isActive()}
   *   <li>{@link ImmutablePriceIndex#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Currency ImmutablePriceIndex.getCurrency()",
    "String ImmutablePriceIndex.getName()",
    "Frequency ImmutablePriceIndex.getPublicationFrequency()",
    "Country ImmutablePriceIndex.getRegion()",
    "boolean ImmutablePriceIndex.isActive()",
    "Builder ImmutablePriceIndex.toBuilder()",
    "String ImmutablePriceIndex.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    ImmutablePriceIndex immutablePriceIndex =
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build();

    // Act
    String actualToStringResult = immutablePriceIndex.toString();
    Currency actualCurrency = immutablePriceIndex.getCurrency();
    String actualName = immutablePriceIndex.getName();
    Frequency actualPublicationFrequency = immutablePriceIndex.getPublicationFrequency();
    Country actualRegion = immutablePriceIndex.getRegion();
    boolean actualIsActiveResult = immutablePriceIndex.isActive();
    immutablePriceIndex.toBuilder();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Name", actualToStringResult);
    assertTrue(actualIsActiveResult);
    assertSame(Currency.AED, actualCurrency);
    assertSame(Country.AR, actualRegion);
    assertSame(Frequency.P12M, actualPublicationFrequency);
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends ImmutablePriceIndex> actualBeanTypeResult =
        ImmutablePriceIndex.meta().beanType();

    // Assert
    Class<ImmutablePriceIndex> expectedBeanTypeResult = ImmutablePriceIndex.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#active()}
   *   <li>{@link Meta#currency()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#publicationFrequency()}
   *   <li>{@link Meta#region()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.active()",
    "MetaProperty Meta.currency()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.publicationFrequency()",
    "MetaProperty Meta.region()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ImmutablePriceIndex.meta();

    // Act
    MetaProperty<Boolean> actualActiveResult = metaResult.active();
    MetaProperty<Currency> actualCurrencyResult = metaResult.currency();
    MetaProperty<String> actualNameResult = metaResult.name();
    MetaProperty<Frequency> actualPublicationFrequencyResult = metaResult.publicationFrequency();

    // Assert
    assertTrue(actualActiveResult instanceof DirectMetaProperty);
    assertTrue(actualCurrencyResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualPublicationFrequencyResult instanceof DirectMetaProperty);
    assertTrue(metaResult.region() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code publicationFrequency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'publicationFrequency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsPublicationFrequency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutablePriceIndex.meta().metaPropertyGet("publicationFrequency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Country> regionResult = ((Meta) metaBeanResult).region();
    assertTrue(regionResult instanceof DirectMetaProperty);
    assertEquals("publicationFrequency", actualMetaPropertyGetResult.name());
    Class<Frequency> expectedPropertyTypeResult = Frequency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).publicationFrequency());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, regionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then return name is {@code active}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'active'; then return name is 'active'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenActive_thenReturnNameIsActive() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutablePriceIndex.meta().metaPropertyGet("active");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> publicationFrequencyResult =
        ((Meta) metaBeanResult).publicationFrequency();
    assertTrue(publicationFrequencyResult instanceof DirectMetaProperty);
    MetaProperty<Country> regionResult = ((Meta) metaBeanResult).region();
    assertTrue(regionResult instanceof DirectMetaProperty);
    assertEquals("active", actualMetaPropertyGetResult.name());
    assertEquals("boolean", actualMetaPropertyGetResult.propertyType().getName());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).active());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, publicationFrequencyResult.metaBean());
    assertSame(metaBeanResult, regionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then return name is {@code currency}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'currency'; then return name is 'currency'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrency_thenReturnNameIsCurrency() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutablePriceIndex.meta().metaPropertyGet("currency");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> publicationFrequencyResult =
        ((Meta) metaBeanResult).publicationFrequency();
    assertTrue(publicationFrequencyResult instanceof DirectMetaProperty);
    MetaProperty<Country> regionResult = ((Meta) metaBeanResult).region();
    assertTrue(regionResult instanceof DirectMetaProperty);
    assertEquals("currency", actualMetaPropertyGetResult.name());
    Class<Currency> expectedPropertyTypeResult = Currency.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currency());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, publicationFrequencyResult.metaBean());
    assertSame(metaBeanResult, regionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutablePriceIndex.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> publicationFrequencyResult =
        ((Meta) metaBeanResult).publicationFrequency();
    assertTrue(publicationFrequencyResult instanceof DirectMetaProperty);
    MetaProperty<Country> regionResult = ((Meta) metaBeanResult).region();
    assertTrue(regionResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<String> expectedPropertyTypeResult = String.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, publicationFrequencyResult.metaBean());
    assertSame(metaBeanResult, regionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutablePriceIndex.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code region}.
   *   <li>Then return name is {@code region}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'region'; then return name is 'region'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRegion_thenReturnNameIsRegion() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ImmutablePriceIndex.meta().metaPropertyGet("region");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Boolean> activeResult = ((Meta) metaBeanResult).active();
    assertTrue(activeResult instanceof DirectMetaProperty);
    MetaProperty<Currency> currencyResult = ((Meta) metaBeanResult).currency();
    assertTrue(currencyResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<String> nameResult = ((Meta) metaBeanResult).name();
    assertTrue(nameResult instanceof DirectMetaProperty);
    MetaProperty<Frequency> publicationFrequencyResult =
        ((Meta) metaBeanResult).publicationFrequency();
    assertTrue(publicationFrequencyResult instanceof DirectMetaProperty);
    assertEquals("region", actualMetaPropertyGetResult.name());
    Class<Country> expectedPropertyTypeResult = Country.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).region());
    assertSame(metaBeanResult, activeResult.metaBean());
    assertSame(metaBeanResult, currencyResult.metaBean());
    assertSame(metaBeanResult, nameResult.metaBean());
    assertSame(metaBeanResult, publicationFrequencyResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        ImmutablePriceIndex.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("active") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("currency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("publicationFrequency") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("region") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = ImmutablePriceIndex.meta();
    ImmutablePriceIndex bean =
        ImmutablePriceIndex.builder()
            .active(true)
            .currency(Currency.AED)
            .name("Name")
            .publicationFrequency(Frequency.P12M)
            .region(Country.AR)
            .build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "currency", true);

    // Assert
    Currency currency = ((Currency) actualPropertyGetResult).AED;
    assertSame(currency, bean.getCurrency());
    assertSame(currency, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnFalse() {
    // Arrange
    Meta metaResult = ImmutablePriceIndex.meta();

    // Act and Assert
    assertFalse(
        (Boolean)
            metaResult.propertyGet(
                ImmutablePriceIndex.builder()
                    .active(false)
                    .currency(Currency.AED)
                    .name("Name")
                    .publicationFrequency(Frequency.P12M)
                    .region(Country.AR)
                    .build(),
                "active",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnTrue() {
    // Arrange
    Meta metaResult = ImmutablePriceIndex.meta();

    // Act and Assert
    assertTrue(
        (Boolean)
            metaResult.propertyGet(
                ImmutablePriceIndex.builder()
                    .active(true)
                    .currency(Currency.AED)
                    .name("Name")
                    .publicationFrequency(Frequency.P12M)
                    .region(Country.AR)
                    .build(),
                "active",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ImmutablePriceIndex.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ImmutablePriceIndex.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnName() {
    // Arrange
    Meta metaResult = ImmutablePriceIndex.meta();

    // Act and Assert
    assertEquals(
        "Name",
        metaResult.propertyGet(
            ImmutablePriceIndex.builder()
                .active(true)
                .currency(Currency.AED)
                .name("Name")
                .publicationFrequency(Frequency.P12M)
                .region(Country.AR)
                .build(),
            "name",
            true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code active}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'active'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenActive_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutablePriceIndex.meta().propertySet(mock(Bean.class), "active", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutablePriceIndex.meta()
                .propertySet(mock(Bean.class), "currency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            ImmutablePriceIndex.meta().propertySet(mock(Bean.class), "active", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ImmutablePriceIndex.meta().propertySet(mock(Bean.class), "name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            ImmutablePriceIndex.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code publicationFrequency}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'publicationFrequency'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPublicationFrequency_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutablePriceIndex.meta()
                .propertySet(mock(Bean.class), "publicationFrequency", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code region}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'region'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRegion_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ImmutablePriceIndex.meta().propertySet(mock(Bean.class), "region", "New Value", true));
  }
}
