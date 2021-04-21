[collections](https://github.com/Snailclimb/JavaGuide/blob/master/docs/java/collection/Java%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6%E5%B8%B8%E8%A7%81%E9%9D%A2%E8%AF%95%E9%A2%98.md#112-%E8%AF%B4%E8%AF%B4-listsetmap-%E4%B8%89%E8%80%85%E7%9A%84%E5%8C%BA%E5%88%AB)
1. 线程不安全 会出现数组越界 array index out of bounds exception
   - 需要锁住 Collections.synchronizedList()
   - https://zhuanlan.zhihu.com/p/43993780
    
2. Object数组
3. 对象锁 JVM实现
4. HashMap不是collections 是map
5. list，queue，set三个implement 
6. Collection
   - queue: FIFO, A collection designed for holding elements prior to processing
   - set: A collection that contains no duplicate elements.
   - deque A linear collection that supports element insertion and removal at both ends