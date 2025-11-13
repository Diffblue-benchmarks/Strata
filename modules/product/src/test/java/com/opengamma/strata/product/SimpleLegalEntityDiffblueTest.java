package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Collection;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleLegalEntityDiffblueTest {
  /**
   * Test {@link SimpleLegalEntity#meta()}.
   *
   * <p>Method under test: {@link SimpleLegalEntity#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaBean SimpleLegalEntity.meta()"})
  void testMeta() {
    // Arrange and Act
    MetaBean actualMetaResult = SimpleLegalEntity.meta();

    // Assert
    Iterable<MetaProperty<?>> metaPropertyIterableResult = actualMetaResult.metaPropertyIterable();
    assertTrue(metaPropertyIterableResult instanceof Collection);
    assertEquals("com.opengamma.strata.product.SimpleLegalEntity", actualMetaResult.beanName());
    assertEquals(1, actualMetaResult.annotations().size());
    assertEquals(3, ((Collection<MetaProperty<?>>) metaPropertyIterableResult).size());
    assertEquals(3, actualMetaResult.metaPropertyCount());
  }
}
