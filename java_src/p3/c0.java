package p3;

import java.util.Collections;
import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f15339a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PriorityQueue<Integer> f15340b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c  reason: collision with root package name */
    private int f15341c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f15339a) {
            this.f15340b.add(Integer.valueOf(i10));
            this.f15341c = Math.max(this.f15341c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f15339a) {
            this.f15340b.remove(Integer.valueOf(i10));
            this.f15341c = this.f15340b.isEmpty() ? Integer.MIN_VALUE : ((Integer) n0.j(this.f15340b.peek())).intValue();
            this.f15339a.notifyAll();
        }
    }
}
