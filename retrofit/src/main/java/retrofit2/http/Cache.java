
package retrofit2.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

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
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface Cache {}
