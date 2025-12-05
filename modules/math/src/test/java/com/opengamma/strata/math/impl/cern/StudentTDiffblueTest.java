package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StudentTDiffblueTest {
  /**
   * Test {@link StudentT#StudentT(double, RandomEngine)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link StudentT#TERM} is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#StudentT(double, RandomEngine)}
   */
  @Test
  @DisplayName("Test new StudentT(double, RandomEngine); when NaN; then return TERM is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentT.<init>(double, RandomEngine)"})
  void testNewStudentT_whenNaN_thenReturnTermIsNaN() {
    // Arrange
    MersenneTwister randomGenerator = new MersenneTwister();

    // Act
    StudentT actualStudentT = new StudentT(Double.NaN, randomGenerator);

    // Assert
    RandomEngine randomGenerator2 = actualStudentT.getRandomGenerator();
    assertTrue(randomGenerator2 instanceof MersenneTwister);
    assertEquals(Double.NaN, actualStudentT.TERM);
    assertEquals(Double.NaN, actualStudentT.freedom);
    assertSame(randomGenerator, randomGenerator2);
  }

  /**
   * Test {@link StudentT#StudentT(double, RandomEngine)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link StudentT#TERM} is {@code 0.3891083839656065}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#StudentT(double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new StudentT(double, RandomEngine); when ten; then return TERM is '0.3891083839656065'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentT.<init>(double, RandomEngine)"})
  void testNewStudentT_whenTen_thenReturnTermIs03891083839656065() {
    // Arrange
    MersenneTwister randomGenerator = new MersenneTwister();

    // Act
    StudentT actualStudentT = new StudentT(10.0d, randomGenerator);

    // Assert
    RandomEngine randomGenerator2 = actualStudentT.getRandomGenerator();
    assertTrue(randomGenerator2 instanceof MersenneTwister);
    assertEquals(0.3891083839656065d, actualStudentT.TERM);
    assertEquals(10.0d, actualStudentT.freedom);
    assertSame(randomGenerator, randomGenerator2);
  }

  /**
   * Test {@link StudentT#StudentT(double, RandomEngine)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#StudentT(double, RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new StudentT(double, RandomEngine); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentT.<init>(double, RandomEngine)"})
  void testNewStudentT_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new StudentT(0.0d, new MersenneTwister()));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>Given {@link StudentT#StudentT(double, RandomEngine)} with freedom is {@link Double#NaN}
   *       and randomGenerator is {@link MersenneTwister#MersenneTwister()}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName(
      "Test cdf(double); given StudentT(double, RandomEngine) with freedom is NaN and randomGenerator is MersenneTwister()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_givenStudentTWithFreedomIsNaNAndRandomGeneratorIsMersenneTwister() {
    // Arrange
    StudentT studentT = new StudentT(Double.NaN, new MersenneTwister());

    // Act and Assert
    assertEquals(Double.NaN, studentT.cdf(2.0d));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.5000000006449611}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); then return '0.5000000006449611'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_thenReturn05000000006449611() {
    // Arrange
    StudentT studentT = new StudentT(1.0E-10d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.5000000006449611d, studentT.cdf(2.0d));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code 0.3139468028714864}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when '-0.5'; then return '0.3139468028714864'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_when05_thenReturn03139468028714864() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.3139468028714864d, studentT.cdf(-0.5d));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.6860531971285135}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when '0.5'; then return '0.6860531971285135'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_when05_thenReturn06860531971285135() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.6860531971285135d, studentT.cdf(0.5d));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251565E-16}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when '1.1102230246251565E-16'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_when11102230246251565e16_thenReturn05() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.5d, studentT.cdf(1.1102230246251565E-16d));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_whenNaN_thenReturnNaN() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(Double.NaN, studentT.cdf(Double.NaN));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9633059826146299}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when two; then return '0.9633059826146299'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_whenTwo_thenReturn09633059826146299() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.9633059826146299d, studentT.cdf(2.0d));
  }

  /**
   * Test {@link StudentT#cdf(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#cdf(double)}
   */
  @Test
  @DisplayName("Test cdf(double); when zero; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.cdf(double)"})
  void testCdf_whenZero_thenReturn05() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.5d, studentT.cdf(0.0d));
  }

  /**
   * Test {@link StudentT#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 0.6997255047633845}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '0.6997255047633845'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn06997255047633845() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    StudentT studentT = new StudentT(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(0.6997255047633845d, studentT.nextDouble(10.0d));
  }

  /**
   * Test {@link StudentT#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code -0.8639599449216312}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '-0.8639599449216312'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn08639599449216312() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister64(42));

    // Act and Assert
    assertEquals(-0.8639599449216312d, studentT.nextDouble(10.0d));
  }

  /**
   * Test {@link StudentT#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code -1.2433578683958177}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '-1.2433578683958177'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn12433578683958177() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(-1.2433578683958177d, studentT.nextDouble(10.0d));
  }

  /**
   * Test {@link StudentT#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 0.49007448634511386}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble(double)}
   */
  @Test
  @DisplayName("Test nextDouble(double) with 'double'; then return '0.49007448634511386'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble(double)"})
  void testNextDoubleWithDouble_thenReturn049007448634511386() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.49007448634511386d, studentT.nextDouble(10.0d));
  }

  /**
   * Test {@link StudentT#nextDouble(double)} with {@code double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble(double)}
   */
  @Test
  @DisplayName(
      "Test nextDouble(double) with 'double'; when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble(double)"})
  void testNextDoubleWithDouble_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> studentT.nextDouble(0.0d));
  }

  /**
   * Test {@link StudentT#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.6997255047633845}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.6997255047633845'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble()"})
  void testNextDouble_thenReturn06997255047633845() {
    // Arrange
    Date d = Date.from(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());
    MersenneTwister randomGenerator = new MersenneTwister(d);
    StudentT studentT = new StudentT(10.0d, randomGenerator);

    // Act and Assert
    assertEquals(0.6997255047633845d, studentT.nextDouble());
  }

  /**
   * Test {@link StudentT#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code -0.8639599449216312}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '-0.8639599449216312'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble()"})
  void testNextDouble_thenReturn08639599449216312() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister64(42));

    // Act and Assert
    assertEquals(-0.8639599449216312d, studentT.nextDouble());
  }

  /**
   * Test {@link StudentT#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code -1.2433578683958177}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '-1.2433578683958177'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble()"})
  void testNextDouble_thenReturn12433578683958177() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister64());

    // Act and Assert
    assertEquals(-1.2433578683958177d, studentT.nextDouble());
  }

  /**
   * Test {@link StudentT#nextDouble()}.
   *
   * <ul>
   *   <li>Then return {@code 0.49007448634511386}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#nextDouble()}
   */
  @Test
  @DisplayName("Test nextDouble(); then return '0.49007448634511386'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.nextDouble()"})
  void testNextDouble_thenReturn049007448634511386() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.49007448634511386d, studentT.nextDouble());
  }

  /**
   * Test {@link StudentT#pdf(double)}.
   *
   * <p>Method under test: {@link StudentT#pdf(double)}
   */
  @Test
  @DisplayName("Test pdf(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.pdf(double)"})
  void testPdf() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals(0.061145766321151485d, studentT.pdf(2.0d));
  }

  /**
   * Test {@link StudentT#setState(double)}.
   *
   * <p>Method under test: {@link StudentT#setState(double)}
   */
  @Test
  @DisplayName("Test setState(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentT.setState(double)"})
  void testSetState() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act
    studentT.setState(10.0d);

    // Assert that nothing has changed
    assertEquals(0.3891083839656065d, studentT.TERM);
    assertEquals(10.0d, studentT.freedom);
  }

  /**
   * Test {@link StudentT#setState(double)}.
   *
   * <p>Method under test: {@link StudentT#setState(double)}
   */
  @Test
  @DisplayName("Test setState(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentT.setState(double)"})
  void testSetState2() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act
    studentT.setState(Double.NaN);

    // Assert
    assertEquals(Double.NaN, studentT.TERM);
    assertEquals(Double.NaN, studentT.freedom);
  }

  /**
   * Test {@link StudentT#setState(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#setState(double)}
   */
  @Test
  @DisplayName("Test setState(double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentT.setState(double)"})
  void testSetState_whenZero_thenThrowIllegalArgumentException() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> studentT.setState(0.0d));
  }

  /**
   * Test {@link StudentT#staticNextDouble(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#staticNextDouble(double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double); when ten; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.staticNextDouble(double)"})
  void testStaticNextDouble_whenTen_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> StudentT.staticNextDouble(10.0d));
  }

  /**
   * Test {@link StudentT#staticNextDouble(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link StudentT#staticNextDouble(double)}
   */
  @Test
  @DisplayName("Test staticNextDouble(double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double StudentT.staticNextDouble(double)"})
  void testStaticNextDouble_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> StudentT.staticNextDouble(0.0d));
  }

  /**
   * Test {@link StudentT#toString()}.
   *
   * <p>Method under test: {@link StudentT#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String StudentT.toString()"})
  void testToString() {
    // Arrange
    StudentT studentT = new StudentT(10.0d, new MersenneTwister());

    // Act and Assert
    assertEquals("com.opengamma.strata.math.impl.cern.StudentT(10.0)", studentT.toString());
  }
}
