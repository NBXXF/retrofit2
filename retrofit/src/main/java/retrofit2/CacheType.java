package retrofit2;

/**
 * @author xuanyouwu@163.com
 * @version 2.3.1
 * @Description 网络缓存
 * @date createTime：2018/9/7
 * <p>
 * please link{@link retrofit2.http.Cache}
 */
public enum CacheType {
    /**
     * 先从本地缓存拿取,然后从服务器拿取,可能会onNext两次,如果本地没有缓存 最少执行oNext一次
     * rx系列请注意 concatDelayError 与concatEagerDelayError 请注意 一定要observeOn(xxx,true)
     * 参考:https://github.com/ReactiveX/RxJava/issues/3908
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
     * 只从本地缓存中拿取,没有缓存 执行逻辑同Observable.empty()
     */
    onlyCache,

    /**
     * 如果本地存在就返回本地的,否则返回网络的数据
     */
    ifCache,

    /**
     * 读取上次的缓存,上次没有缓存就返回网络的数据,然后同步缓存;
     * 上次有缓存,也会同步网络数据 但不会onNext
     * rx系列请注意 concatDelayError 与concatEagerDelayError 请注意 一定要observeOn(xxx,true)
     * 参考:https://github.com/ReactiveX/RxJava/issues/3908
     */
    lastCache;
}