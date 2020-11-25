
package retrofit2.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;

import retrofit2.Converter;
import retrofit2.Retrofit;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author xuanyouwu@163.com
 * @version 2.3.1
 * @Description 网络缓存
 * @date createTime：2018/9/7
 * please link{@link retrofit2.CacheType}
 * <p>
 * ！！！暂时不兼容@Header设置的max-age 后期考虑兼容
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface Cache {
    /**
     * 默认永久
     *
     * @return
     */
    long time() default Long.MAX_VALUE;

    /**
     * 默认单位为毫秒
     *
     * @return
     */
    TimeUnit timeUnit() default TimeUnit.MILLISECONDS;
}
