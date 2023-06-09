/**
 * 单例模式:懒汉式(双重检查锁)
 * <p>
 * 再来讨论一下懒汉模式中加锁的问题，对于 getInstance() 方法来说，绝大部分的操作都是读操作，读操作是线程安全的，所以我们没必让每个线程必须持有锁才能调用该方法，我们需要调整加锁的时机。
 * 由此也产生了一种新的实现模式：双重检查锁模式
 */
package org.lemur.pattern.creationalPatterns.singleton.demo5;