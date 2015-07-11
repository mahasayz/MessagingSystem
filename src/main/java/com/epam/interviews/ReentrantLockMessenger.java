package com.epam.interviews;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockMessenger implements Messenger {

	ReentrantLock lock = new ReentrantLock();
	List<Message> list = new ArrayList<Message>();
	Condition notEmpty = lock.newCondition();
	Condition notFull = lock.newCondition();

	@Override
	public Message receive() {
		// TODO Auto-generated method stub
		final ReentrantLock lock = this.lock;
		Message result = null;
		try {
			lock.lockInterruptibly();
			while (list.size() == 0)
				notEmpty.await();
				
			result = list.remove(0);
			notFull.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return result;
	}

	@Override
	public void send(Message message) {
		// TODO Auto-generated method stub
		final ReentrantLock lock = this.lock;
		try {
			lock.lockInterruptibly();
			while (list.size() == 5)
				notFull.await();
			list.add(message);
			notEmpty.signal();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

}
