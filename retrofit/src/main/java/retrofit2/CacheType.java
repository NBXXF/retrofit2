package retrofit2;

/**
 * @author xuanyouwu@163.com
 * @version 2.3.1
 * @Description 网络缓存
 * @date createTime：2018/9/7
 *
 * please link{@link retrofit2.http.Cache}
 */
public enum CacheType {
    /**
     * 先从本地缓存拿取,然后从服务器拿取,可能会onNext两次,如果本地没有缓存 最少执行oNext一次
     */
    firstCache,
    /**
     * 先从服务器获取,没有网络 读取本地缓存
     */
    firstRemote,
    /**
     * 只从服务器拿取
     */
    onlyRemote,
    /**
     * 只从本地缓存中拿取,没有缓存 会抛 {@link NullPointerException}
     */
    onlyCache,

    /**
     * 如果本地存在就返回本地的,否则返回网络的数据
     */
    ifCache,
}