package top.gobig.util;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

public class JwtUtils {

    /*
     * 生成key
     * */
    private final static Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    /*
     * 过期时间，毫秒
     * 一天
     * */
    private final static long TOKEN_EXPIRE_MILLIS = 1000 * 60 * 60 * 12;

    /**
     * 签发JWT
     * @param subject  JSON数据  {uid:"uid"}
     * @return String
     */
    public static String createToken(String subject, Map<String, Object> claimMap) {
        long currentTimeMillis  = System.currentTimeMillis();
        Date now = new Date(currentTimeMillis);
        JwtBuilder builder = Jwts.builder()
                .setId(UUID.randomUUID().toString()) //是JWT的唯一标识，根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token,从而回避重放攻击。
                .setSubject(subject)    // sub(Subject)：代表这个JWT的主体，即它的所有人，这个是一个json格式的字符串，可以存放什么userid，roldid之类的，作为什么用户的唯一标志
                .setIssuer("gobig")     // 签发者
                .setClaims(claimMap)    // 自定义的内容
                .setIssuedAt(now)       // jwt的签发时间
                .signWith(key)          // 密匙
                .setExpiration(new Date(currentTimeMillis+TOKEN_EXPIRE_MILLIS));       // 过期时间
        return builder.compact();
    }

    public static String createToken(String subject) {
        long currentTimeMillis  = System.currentTimeMillis();
        Date now = new Date(currentTimeMillis);
        JwtBuilder builder = Jwts.builder()
                .setId(UUID.randomUUID().toString()) //是JWT的唯一标识，根据业务需要，这个可以设置为一个不重复的值，主要用来作为一次性token,从而回避重放攻击。
                .setSubject(subject)    // sub(Subject)：代表这个JWT的主体，即它的所有人，这个是一个json格式的字符串，可以存放什么userid，roldid之类的，作为什么用户的唯一标志
                .setIssuer("gobig")     // 签发者
                .setIssuedAt(now)       // jwt的签发时间
                .signWith(key)          // 密匙
                .setExpiration(new Date(currentTimeMillis+TOKEN_EXPIRE_MILLIS));       // 过期时间
        return builder.compact();
    }

    /**
     * 验证token
     * @param token
     * @return 0 验证成功，1、2、3、4、5 验证失败
     */
    public static int verifyToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return 1;
        } catch (JwtException e) {
            // TODO token错误
            //don't trust the JWT!
            return 0;
        }
    }

    public static Map<String, Object> parseToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build().parseClaimsJws(token)
                .getBody();
    }
}

