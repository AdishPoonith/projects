package y;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import y.b;
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: j  reason: collision with root package name */
    protected boolean f20279j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f20280k;

    /* renamed from: l  reason: collision with root package name */
    protected Cursor f20281l;

    /* renamed from: m  reason: collision with root package name */
    protected Context f20282m;

    /* renamed from: n  reason: collision with root package name */
    protected int f20283n;

    /* renamed from: o  reason: collision with root package name */
    protected C0288a f20284o;

    /* renamed from: p  reason: collision with root package name */
    protected DataSetObserver f20285p;

    /* renamed from: q  reason: collision with root package name */
    protected y.b f20286q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0288a extends ContentObserver {
        C0288a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f20279j = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f20279j = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    @Override // y.b.a
    public Cursor b() {
        return this.f20281l;
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i10) {
        b bVar;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f20280k = true;
        } else {
            this.f20280k = false;
        }
        boolean z10 = cursor != null;
        this.f20281l = cursor;
        this.f20279j = z10;
        this.f20282m = context;
        this.f20283n = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f20284o = new C0288a();
            bVar = new b();
        } else {
            bVar = null;
            this.f20284o = null;
        }
        this.f20285p = bVar;
        if (z10) {
            C0288a c0288a = this.f20284o;
            if (c0288a != null) {
                cursor.registerContentObserver(c0288a);
            }
            DataSetObserver dataSetObserver = this.f20285p;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f20279j || (cursor = this.f20281l) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (this.f20279j) {
            this.f20281l.moveToPosition(i10);
            if (view == null) {
                view = g(this.f20282m, this.f20281l, viewGroup);
            }
            e(view, this.f20282m, this.f20281l);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f20286q == null) {
            this.f20286q = new y.b(this);
        }
        return this.f20286q;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f20279j || (cursor = this.f20281l) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f20281l;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        Cursor cursor;
        if (this.f20279j && (cursor = this.f20281l) != null && cursor.moveToPosition(i10)) {
            return this.f20281l.getLong(this.f20283n);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (this.f20279j) {
            if (this.f20281l.moveToPosition(i10)) {
                if (view == null) {
                    view = h(this.f20282m, this.f20281l, viewGroup);
                }
                e(view, this.f20282m, this.f20281l);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f20280k || (cursor = this.f20281l) == null || cursor.isClosed()) {
            return;
        }
        this.f20279j = this.f20281l.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f20281l;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0288a c0288a = this.f20284o;
            if (c0288a != null) {
                cursor2.unregisterContentObserver(c0288a);
            }
            DataSetObserver dataSetObserver = this.f20285p;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f20281l = cursor;
        if (cursor != null) {
            C0288a c0288a2 = this.f20284o;
            if (c0288a2 != null) {
                cursor.registerContentObserver(c0288a2);
            }
            DataSetObserver dataSetObserver2 = this.f20285p;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f20283n = cursor.getColumnIndexOrThrow("_id");
            this.f20279j = true;
            notifyDataSetChanged();
        } else {
            this.f20283n = -1;
            this.f20279j = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
