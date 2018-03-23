package BAT.大数据;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 周杰伦 on 2018/3/19.
 * map将单词映射成key -value形式
 * reduce任务合并key-value。变成key valuelist，进而变成key sum；
 * 得到每个单词的词频。返回结果。
 */
public class WordCount {
    public static void main(String[] args) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        Thread thread = new Thread();
        Lock lock = new ReentrantLock();
        Condition condition= lock.newCondition();
        lock.tryLock();
        AbstractQueuedSynchronizer AQS;
    }

}
