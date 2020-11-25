
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
 * 参数值参考:CacheType
 * please link{@link retrofit2.CacheType}
 *
 * <p>
 * ！！！暂时不兼容@Header设置的Cache-Control", "public, max-age=, 为不影响默认缓存(自定义key=cache), 后期考虑兼容
 * 配合注解
 * @Header("cache:20000") 实现缓存时效
 * {@link Header}
 */
@Documented
@Target(PARAMETER)
@Retention(RUNTIME)
public @interface Cache {
}
