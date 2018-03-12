package jp.luxa.lom.mylasta.direction;

import javax.annotation.Resource;

import jp.luxa.lom.unit.UnitLomTestCase;
import org.lastaflute.core.security.PrimaryCipher;
import org.lastaflute.web.servlet.cookie.CookieCipher;

/**
 * @author jflute
 */
public class CipherSetupTest extends UnitLomTestCase {

    @Resource
    private PrimaryCipher primaryCipher;
    @Resource
    private CookieCipher cookieCipher;

    public void test_primary() throws Exception {
        String encrypted = primaryCipher.encrypt("sea");
        log("encrypted: {}", encrypted);
        String decrypted = primaryCipher.decrypt(encrypted);
        log("decrypted: {}", decrypted);
        assertEquals("sea", decrypted);
        log(primaryCipher.oneway("land")); // expects no exception
    }

    public void test_cookie() throws Exception {
        String encrypted = cookieCipher.encrypt("sea");
        log("encrypted: {}", encrypted);
        String decrypted = cookieCipher.decrypt(encrypted);
        log("decrypted: {}", decrypted);
        assertEquals("sea", decrypted);
    }
}
