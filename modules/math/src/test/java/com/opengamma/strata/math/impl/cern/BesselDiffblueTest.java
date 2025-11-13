package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BesselDiffblueTest {
  /**
   * Test {@link Bessel#i0(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code 0.9999999999999998}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i0(double)}
   */
  @Test
  @DisplayName("Test i0(double); when '-1.0E-10'; then return '0.9999999999999998'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i0(double)"})
  void testI0_when10e10_thenReturn09999999999999998() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999998d, Bessel.i0(-1.0E-10d));
  }

  /**
   * Test {@link Bessel#i0(double)}.
   *
   * <ul>
   *   <li>When {@code 8.000000000000002}.
   *   <li>Then return {@code 427.5641157218055}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i0(double)}
   */
  @Test
  @DisplayName("Test i0(double); when '8.000000000000002'; then return '427.5641157218055'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i0(double)"})
  void testI0_when8000000000000002_thenReturn4275641157218055() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(427.5641157218055d, Bessel.i0(8.000000000000002d));
  }

  /**
   * Test {@link Bessel#i0(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 2.279585302336067}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i0(double)}
   */
  @Test
  @DisplayName("Test i0(double); when two; then return '2.279585302336067'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i0(double)"})
  void testI0_whenTwo_thenReturn2279585302336067() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.279585302336067d, Bessel.i0(2.0d));
  }

  /**
   * Test {@link Bessel#i0e(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code 0.9999999998999998}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i0e(double)}
   */
  @Test
  @DisplayName("Test i0e(double); when '-1.0E-10'; then return '0.9999999998999998'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i0e(double)"})
  void testI0e_when10e10_thenReturn09999999998999998() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999999998999998d, Bessel.i0e(-1.0E-10d));
  }

  /**
   * Test {@link Bessel#i0e(double)}.
   *
   * <ul>
   *   <li>When {@code 8.000000000000002}.
   *   <li>Then return {@code 0.1434317818568503}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i0e(double)}
   */
  @Test
  @DisplayName("Test i0e(double); when '8.000000000000002'; then return '0.1434317818568503'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i0e(double)"})
  void testI0e_when8000000000000002_thenReturn01434317818568503() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.1434317818568503d, Bessel.i0e(8.000000000000002d));
  }

  /**
   * Test {@link Bessel#i0e(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.308508322553671}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i0e(double)}
   */
  @Test
  @DisplayName("Test i0e(double); when two; then return '0.308508322553671'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i0e(double)"})
  void testI0e_whenTwo_thenReturn0308508322553671() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.308508322553671d, Bessel.i0e(2.0d));
  }

  /**
   * Test {@link Bessel#i1(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code -5.0000000000000015E-11}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i1(double)}
   */
  @Test
  @DisplayName("Test i1(double); when '-1.0E-10'; then return '-5.0000000000000015E-11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i1(double)"})
  void testI1_when10e10_thenReturn50000000000000015e11() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-5.0000000000000015E-11d, Bessel.i1(-1.0E-10d));
  }

  /**
   * Test {@link Bessel#i1(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 2670.988303701255}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i1(double)}
   */
  @Test
  @DisplayName("Test i1(double); when ten; then return '2670.988303701255'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i1(double)"})
  void testI1_whenTen_thenReturn2670988303701255() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2670.988303701255d, Bessel.i1(10.0d));
  }

  /**
   * Test {@link Bessel#i1(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 1.5906368546373295}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i1(double)}
   */
  @Test
  @DisplayName("Test i1(double); when two; then return '1.5906368546373295'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i1(double)"})
  void testI1_whenTwo_thenReturn15906368546373295() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.5906368546373295d, Bessel.i1(2.0d));
  }

  /**
   * Test {@link Bessel#i1e(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code -4.999999999500001E-11}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i1e(double)}
   */
  @Test
  @DisplayName("Test i1e(double); when '-1.0E-10'; then return '-4.999999999500001E-11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i1e(double)"})
  void testI1e_when10e10_thenReturn4999999999500001e11() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-4.999999999500001E-11d, Bessel.i1e(-1.0E-10d));
  }

  /**
   * Test {@link Bessel#i1e(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.1212626813844555}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i1e(double)}
   */
  @Test
  @DisplayName("Test i1e(double); when ten; then return '0.1212626813844555'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i1e(double)"})
  void testI1e_whenTen_thenReturn01212626813844555() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.1212626813844555d, Bessel.i1e(10.0d));
  }

  /**
   * Test {@link Bessel#i1e(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.2152692892489377}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#i1e(double)}
   */
  @Test
  @DisplayName("Test i1e(double); when two; then return '0.2152692892489377'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.i1e(double)"})
  void testI1e_whenTwo_thenReturn02152692892489377() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.2152692892489377d, Bessel.i1e(2.0d));
  }

  /**
   * Test {@link Bessel#j0(double)}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then return {@code 0.17165080725709642}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#j0(double)}
   */
  @Test
  @DisplayName("Test j0(double); when eight; then return '0.17165080725709642'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.j0(double)"})
  void testJ0_whenEight_thenReturn017165080725709642() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.17165080725709642d, Bessel.j0(8.0d));
  }

  /**
   * Test {@link Bessel#j0(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.2238907819085722}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#j0(double)}
   */
  @Test
  @DisplayName("Test j0(double); when two; then return '0.2238907819085722'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.j0(double)"})
  void testJ0_whenTwo_thenReturn02238907819085722() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.2238907819085722d, Bessel.j0(2.0d));
  }

  /**
   * Test {@link Bessel#j1(double)}.
   *
   * <ul>
   *   <li>When {@code -7.895059235E9}.
   *   <li>Then return {@code -6.490344598614596E-6}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#j1(double)}
   */
  @Test
  @DisplayName("Test j1(double); when '-7.895059235E9'; then return '-6.490344598614596E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.j1(double)"})
  void testJ1_when7895059235e9_thenReturn6490344598614596e6() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-6.490344598614596E-6d, Bessel.j1(-7.895059235E9d));
  }

  /**
   * Test {@link Bessel#j1(double)}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then return {@code 0.23463634662568797}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#j1(double)}
   */
  @Test
  @DisplayName("Test j1(double); when eight; then return '0.23463634662568797'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.j1(double)"})
  void testJ1_whenEight_thenReturn023463634662568797() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.23463634662568797d, Bessel.j1(8.0d));
  }

  /**
   * Test {@link Bessel#j1(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.5767248078962938}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#j1(double)}
   */
  @Test
  @DisplayName("Test j1(double); when two; then return '0.5767248078962938'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.j1(double)"})
  void testJ1_whenTwo_thenReturn05767248078962938() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5767248078962938d, Bessel.j1(2.0d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code 1.00000000283141}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when '-1.0E-10'; then return '1.00000000283141'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_when10e10_thenReturn100000000283141() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.00000000283141d, Bessel.jn(0, -1.0E-10d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code 1.2500000000000001E-21}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when '-1.0E-10'; then return '1.2500000000000001E-21'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_when10e10_thenReturn12500000000000001e21() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.2500000000000001E-21d, Bessel.jn(2, -1.0E-10d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When {@code -7.895059235E9}.
   *   <li>Then return {@code -6.490344598614596E-6}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when '-7.895059235E9'; then return '-6.490344598614596E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_when7895059235e9_thenReturn6490344598614596e6() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-6.490344598614596E-6d, Bessel.jn(1, -7.895059235E9d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When forty.
   *   <li>Then return {@code -0.12614481545606773}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when forty; then return '-0.12614481545606773'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_whenForty_thenReturn012614481545606773() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-0.12614481545606773d, Bessel.jn(3, 40.0d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return {@code 0.5767248078962938}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when minus one; then return '0.5767248078962938'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_whenMinusOne_thenReturn05767248078962938() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5767248078962938d, Bessel.jn(-1, 2.0d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_whenOne_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Bessel.jn(1, 0.0d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 0.12894324997562717}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when three; then return '0.12894324997562717'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_whenThree_thenReturn012894324997562717() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.12894324997562717d, Bessel.jn(3, 2.0d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code -2.0833333333333336E-32}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when three; then return '-2.0833333333333336E-32'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_whenThree_thenReturn20833333333333336e32() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-2.0833333333333336E-32d, Bessel.jn(3, -1.0E-10d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_whenTwo_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Bessel.jn(2, 0.0d));
  }

  /**
   * Test {@link Bessel#jn(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 1.00000000283141}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#jn(int, double)}
   */
  @Test
  @DisplayName("Test jn(int, double); when zero; then return '1.00000000283141'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.jn(int, double)"})
  void testJn_whenZero_thenReturn100000000283141() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.00000000283141d, Bessel.jn(0, 0.0d));
  }

  /**
   * Test {@link Bessel#k0(double)}.
   *
   * <ul>
   *   <li>When {@code 2.0000000000000004}.
   *   <li>Then return {@code 0.11389387274953337}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k0(double)}
   */
  @Test
  @DisplayName("Test k0(double); when '2.0000000000000004'; then return '0.11389387274953337'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k0(double)"})
  void testK0_when20000000000000004_thenReturn011389387274953337() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.11389387274953337d, Bessel.k0(2.0000000000000004d));
  }

  /**
   * Test {@link Bessel#k0(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.1138938727495334}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k0(double)}
   */
  @Test
  @DisplayName("Test k0(double); when two; then return '0.1138938727495334'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k0(double)"})
  void testK0_whenTwo_thenReturn01138938727495334() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.1138938727495334d, Bessel.k0(2.0d));
  }

  /**
   * Test {@link Bessel#k0e(double)}.
   *
   * <ul>
   *   <li>When {@code 2.0000000000000004}.
   *   <li>Then return {@code 0.8415682150707714}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k0e(double)}
   */
  @Test
  @DisplayName("Test k0e(double); when '2.0000000000000004'; then return '0.8415682150707714'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k0e(double)"})
  void testK0e_when20000000000000004_thenReturn08415682150707714() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.8415682150707714d, Bessel.k0e(2.0000000000000004d));
  }

  /**
   * Test {@link Bessel#k0e(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.8415682150707712}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k0e(double)}
   */
  @Test
  @DisplayName("Test k0e(double); when two; then return '0.8415682150707712'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k0e(double)"})
  void testK0e_whenTwo_thenReturn08415682150707712() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.8415682150707712d, Bessel.k0e(2.0d));
  }

  /**
   * Test {@link Bessel#k1(double)}.
   *
   * <ul>
   *   <li>When {@code 2.0000000000000004}.
   *   <li>Then return {@code 0.13986588181652232}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k1(double)}
   */
  @Test
  @DisplayName("Test k1(double); when '2.0000000000000004'; then return '0.13986588181652232'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k1(double)"})
  void testK1_when20000000000000004_thenReturn013986588181652232() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.13986588181652232d, Bessel.k1(2.0000000000000004d));
  }

  /**
   * Test {@link Bessel#k1(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.13986588181652246}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k1(double)}
   */
  @Test
  @DisplayName("Test k1(double); when two; then return '0.13986588181652246'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k1(double)"})
  void testK1_whenTwo_thenReturn013986588181652246() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.13986588181652246d, Bessel.k1(2.0d));
  }

  /**
   * Test {@link Bessel#k1e(double)}.
   *
   * <ul>
   *   <li>When {@code 2.0000000000000004}.
   *   <li>Then return {@code 1.0334768470686884}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k1e(double)}
   */
  @Test
  @DisplayName("Test k1e(double); when '2.0000000000000004'; then return '1.0334768470686884'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k1e(double)"})
  void testK1e_when20000000000000004_thenReturn10334768470686884() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0334768470686884d, Bessel.k1e(2.0000000000000004d));
  }

  /**
   * Test {@link Bessel#k1e(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 1.0334768470686888}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#k1e(double)}
   */
  @Test
  @DisplayName("Test k1e(double); when two; then return '1.0334768470686888'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.k1e(double)"})
  void testK1e_whenTwo_thenReturn10334768470686888() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0334768470686888d, Bessel.k1e(2.0d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5772156649015329}.
   *   <li>Then return {@code 39.93147983323534}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when '0.5772156649015329'; then return '39.93147983323534'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_when05772156649015329_thenReturn3993147983323534() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(39.93147983323534d, Bessel.kn(3, 0.5772156649015329d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5772156649015329}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName(
      "Test kn(int, double); when '-0.5772156649015329'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_when05772156649015329_thenThrowIllegalArgumentException() throws ArithmeticException {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Bessel.kn(3, -0.5772156649015329d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return {@code 0.13986588181652243}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when minus one; then return '0.13986588181652243'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenMinusOne_thenReturn013986588181652243() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.13986588181652243d, Bessel.kn(-1, 2.0d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenNaN_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Bessel.kn(3, Double.NaN));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.13986588181652243}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when one; then return '0.13986588181652243'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenOne_thenReturn013986588181652243() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.13986588181652243d, Bessel.kn(1, 2.0d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 2.7252700261657535E-5}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when ten; then return '2.7252700261657535E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenTen_thenReturn27252700261657535e5() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.7252700261657535E-5d, Bessel.kn(3, 10.0d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return {@code 1.282808719272948E32}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when thirty-one; then return '1.282808719272948E32'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenThirtyOne_thenReturn1282808719272948e32() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.282808719272948E32d, Bessel.kn(31, 2.0d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 0.6473853909486341}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when three; then return '0.6473853909486341'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenThree_thenReturn06473853909486341() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.6473853909486341d, Bessel.kn(3, 2.0d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.25375975456605576}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when two; then return '0.25375975456605576'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenTwo_thenReturn025375975456605576() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.25375975456605576d, Bessel.kn(2, 2.0d));
  }

  /**
   * Test {@link Bessel#kn(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.11389387274953341}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#kn(int, double)}
   */
  @Test
  @DisplayName("Test kn(int, double); when zero; then return '0.11389387274953341'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.kn(int, double)"})
  void testKn_whenZero_thenReturn011389387274953341() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.11389387274953341d, Bessel.kn(0, 2.0d));
  }

  /**
   * Test {@link Bessel#y0(double)}.
   *
   * <ul>
   *   <li>When {@code -2.957821389E9}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#y0(double)}
   */
  @Test
  @DisplayName("Test y0(double); when '-2.957821389E9'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.y0(double)"})
  void testY0_when2957821389e9_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Bessel.y0(-2.957821389E9d));
  }

  /**
   * Test {@link Bessel#y0(double)}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then return {@code 0.22352148924968096}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#y0(double)}
   */
  @Test
  @DisplayName("Test y0(double); when eight; then return '0.22352148924968096'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.y0(double)"})
  void testY0_whenEight_thenReturn022352148924968096() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.22352148924968096d, Bessel.y0(8.0d));
  }

  /**
   * Test {@link Bessel#y0(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.5103756667370131}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#y0(double)}
   */
  @Test
  @DisplayName("Test y0(double); when two; then return '0.5103756667370131'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.y0(double)"})
  void testY0_whenTwo_thenReturn05103756667370131() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5103756667370131d, Bessel.y0(2.0d));
  }

  /**
   * Test {@link Bessel#y1(double)}.
   *
   * <ul>
   *   <li>When {@code -4.900604943E12}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#y1(double)}
   */
  @Test
  @DisplayName("Test y1(double); when '-4.900604943E12'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.y1(double)"})
  void testY1_when4900604943e12_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Bessel.y1(-4.900604943E12d));
  }

  /**
   * Test {@link Bessel#y1(double)}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then return {@code -0.1580604618351462}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#y1(double)}
   */
  @Test
  @DisplayName("Test y1(double); when eight; then return '-0.1580604618351462'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.y1(double)"})
  void testY1_whenEight_thenReturn01580604618351462() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-0.1580604618351462d, Bessel.y1(8.0d));
  }

  /**
   * Test {@link Bessel#y1(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code -0.1070324316480381}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#y1(double)}
   */
  @Test
  @DisplayName("Test y1(double); when two; then return '-0.1070324316480381'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.y1(double)"})
  void testY1_whenTwo_thenReturn01070324316480381() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-0.1070324316480381d, Bessel.y1(2.0d));
  }

  /**
   * Test {@link Bessel#yn(int, double)}.
   *
   * <ul>
   *   <li>When {@code -4.900604943E12}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#yn(int, double)}
   */
  @Test
  @DisplayName("Test yn(int, double); when '-4.900604943E12'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.yn(int, double)"})
  void testYn_when4900604943e12_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Bessel.yn(3, -4.900604943E12d));
  }

  /**
   * Test {@link Bessel#yn(int, double)}.
   *
   * <ul>
   *   <li>When {@code 7.999999999999999}.
   *   <li>Then return {@code 0.22352147890781857}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#yn(int, double)}
   */
  @Test
  @DisplayName("Test yn(int, double); when '7.999999999999999'; then return '0.22352147890781857'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.yn(int, double)"})
  void testYn_when7999999999999999_thenReturn022352147890781857() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.22352147890781857d, Bessel.yn(0, 7.999999999999999d));
  }

  /**
   * Test {@link Bessel#yn(int, double)}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then return {@code 0.22352148924968096}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#yn(int, double)}
   */
  @Test
  @DisplayName("Test yn(int, double); when eight; then return '0.22352148924968096'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.yn(int, double)"})
  void testYn_whenEight_thenReturn022352148924968096() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.22352148924968096d, Bessel.yn(0, 8.0d));
  }

  /**
   * Test {@link Bessel#yn(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.1580604618351462}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#yn(int, double)}
   */
  @Test
  @DisplayName("Test yn(int, double); when one; then return '-0.1580604618351462'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.yn(int, double)"})
  void testYn_whenOne_thenReturn01580604618351462() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-0.1580604618351462d, Bessel.yn(1, 8.0d));
  }

  /**
   * Test {@link Bessel#yn(int, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code -1.1277837651220644}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#yn(int, double)}
   */
  @Test
  @DisplayName("Test yn(int, double); when two; then return '-1.1277837651220644'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.yn(int, double)"})
  void testYn_whenTwo_thenReturn11277837651220644() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.1277837651220644d, Bessel.yn(3, 2.0d));
  }

  /**
   * Test {@link Bessel#yn(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link Bessel#yn(int, double)}
   */
  @Test
  @DisplayName("Test yn(int, double); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bessel.yn(int, double)"})
  void testYn_whenZero_thenReturnNegative_infinity() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NEGATIVE_INFINITY, Bessel.yn(0, 0.0d));
  }
}
