package demo;

import static java.lang.String.format;

import org.fest.assertions.api.AbstractAssert;
import org.fest.assertions.api.Assertions;

/**
 * {@link PhanSo} specific assertions - Generated by CustomAssertionGenerator.
 */
public class PhanSoAssert extends AbstractAssert<PhanSoAssert, PhanSo> {

	/**
	 * Creates a new </code>{@link PhanSoAssert}</code> to make assertions on actual PhanSo.
	 * @param actual the PhanSo we want to make assertions on.
	 */
	public PhanSoAssert(PhanSo actual) {
		super(actual, PhanSoAssert.class);
	}

	/**
	 * An entry point for PhanSoAssert to follow Fest standard <code>assertThat()</code> statements.<br>
	 * With a static import, one's can write directly : <code>assertThat(myPhanSo)</code> and get specific assertion with code completion.
	 * @param actual the PhanSo we want to make assertions on.
	 * @return a new </code>{@link PhanSoAssert}</code>
	 */
	public static PhanSoAssert assertThat(PhanSo actual) {
		return new PhanSoAssert(actual);
	}

}
