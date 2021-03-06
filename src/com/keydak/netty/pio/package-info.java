/**
 * Created by admin on
 * 伪异步I/O模型图
 * 当有新的客户端接入的时候，将客户端的Socket封装成一个Task,投递到后端的线程池中进行处理,
 * JDK的线程池维护一个消息队列和N个活跃线程对消息队列中的任务进行处理，
 * 由于线程池可以设置消息队列的大小和最大线程数，因此，它的资源是可控的，
 * 无论多少个客户端并发访问，都不会导致资源的耗尽和宕机
 *
 */
package com.keydak.netty.pio;