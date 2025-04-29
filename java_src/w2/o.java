package w2;

import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final o f19838a = new a();

    /* loaded from: classes.dex */
    class a implements o {
        a() {
        }

        @Override // w2.o
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // w2.o
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // w2.o
        public boolean next() {
            return false;
        }
    }

    long a();

    long b();

    boolean next();
}
