package com.mufeng.test.data;


//基于单链表实现的队列
public class Queue {
    // 队列头节点和队列尾节点
    private ListNode front, rear; // 头节点 front ，尾节点 rear
    // 队列长度
    private int queSize = 0;

    public Queue() {
        // 初始化队列数据
        front = null;
        rear = null;
    }

    /* 获取队列的长度 */
    public int size() {
        return queSize;
    }

    /* 判断队列是否为空 */
    public boolean isEmpty() {
        return size() == 0;
    }

    /* 将数据入队 */
    public void push(int num) {
        // 对接受的数据新建节点
        ListNode node = new ListNode(num);
        // 如果头节点是空的，那么说明队列是空的，需要将该节点设置为头节点和尾节点
        // 否则，将该节点添加到尾节点后
        if (front == null) {
            // 设置头节点为此节点
            front = node;
            // 设置尾节点为此节点
            rear = node;
        } else {
            // 现在队列不为空，那么将尾节点的指针指向新创建的节点，然后将尾节点设置为新创建的节点
            rear.next = node;
            rear = node;
        }
        // 因为新加了新创建的节点，那么要是队列节点数量加一
        queSize++;
    }

    /* 出队 */
    public int pop() {
        // 获取队列最先进来的元素
        int num = peek();
        // 将头节点设置为头节点的后一个节点，即将这个头节点删除了
        front = front.next;
        // 因为删除了一个节点，那么队列长度减一
        queSize--;
        // 最后返回这个弹出队列的节点
        return num;
    }

    /* 访问队首元素 */
    public int peek() {
        // 如果队列是空的，那么抛出下标越界异常
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        // 否则队列不为空，那么返回头节点的值
        // 头节点是队列的第一个元素
        return front.val;
    }

    /* 将链表转化为 Array 并返回 */
    public int[] toArray() {
        // 创建临时头节点
        ListNode node = front;
        // 创建和队列长度相同的数组
        int[] res = new int[size()];
        // 遍历数组，将当前节点的值赋值给数组，并且设置临时节点为当前节点的下一个节点
        for (int i = 0; i < res.length; i++) {
            res[i] = node.val;
            node = node.next;
        }
        // 最后遍历完成，得到完整的数组，将其返回
        return res;
    }
}
