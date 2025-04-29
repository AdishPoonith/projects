package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<Fragment> f2383a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, u> f2384b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private q f2385c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        if (this.f2383a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f2383a) {
            this.f2383a.add(fragment);
        }
        fragment.f2105u = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f2384b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f2384b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i10) {
        for (u uVar : this.f2384b.values()) {
            if (uVar != null) {
                uVar.t(i10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2384b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (u uVar : this.f2384b.values()) {
                printWriter.print(str);
                if (uVar != null) {
                    Fragment k10 = uVar.k();
                    printWriter.println(k10);
                    k10.g(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2383a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f2383a.get(i10).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment f(String str) {
        u uVar = this.f2384b.get(str);
        if (uVar != null) {
            return uVar.k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment g(int i10) {
        for (int size = this.f2383a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f2383a.get(size);
            if (fragment != null && fragment.F == i10) {
                return fragment;
            }
        }
        for (u uVar : this.f2384b.values()) {
            if (uVar != null) {
                Fragment k10 = uVar.k();
                if (k10.F == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment h(String str) {
        if (str != null) {
            for (int size = this.f2383a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f2383a.get(size);
                if (fragment != null && str.equals(fragment.H)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (u uVar : this.f2384b.values()) {
                if (uVar != null) {
                    Fragment k10 = uVar.k();
                    if (str.equals(k10.H)) {
                        return k10;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Fragment i(String str) {
        Fragment l10;
        for (u uVar : this.f2384b.values()) {
            if (uVar != null && (l10 = uVar.k().l(str)) != null) {
                return l10;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.P;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f2383a.indexOf(fragment);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            Fragment fragment2 = this.f2383a.get(i10);
            if (fragment2.P == viewGroup && (view2 = fragment2.Q) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f2383a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f2383a.get(indexOf);
            if (fragment3.P == viewGroup && (view = fragment3.Q) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<u> k() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.f2384b.values()) {
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = this.f2384b.values().iterator();
        while (it.hasNext()) {
            u next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u m(String str) {
        return this.f2384b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<Fragment> n() {
        ArrayList arrayList;
        if (this.f2383a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2383a) {
            arrayList = new ArrayList(this.f2383a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q o() {
        return this.f2385c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(u uVar) {
        Fragment k10 = uVar.k();
        if (c(k10.f2099o)) {
            return;
        }
        this.f2384b.put(k10.f2099o, uVar);
        if (k10.L) {
            if (k10.K) {
                this.f2385c.e(k10);
            } else {
                this.f2385c.m(k10);
            }
            k10.L = false;
        }
        if (n.F0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(u uVar) {
        Fragment k10 = uVar.k();
        if (k10.K) {
            this.f2385c.m(k10);
        }
        if (this.f2384b.put(k10.f2099o, null) != null && n.F0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r() {
        Iterator<Fragment> it = this.f2383a.iterator();
        while (it.hasNext()) {
            u uVar = this.f2384b.get(it.next().f2099o);
            if (uVar != null) {
                uVar.m();
            }
        }
        for (u uVar2 : this.f2384b.values()) {
            if (uVar2 != null) {
                uVar2.m();
                Fragment k10 = uVar2.k();
                if (k10.f2106v && !k10.Z()) {
                    q(uVar2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s(Fragment fragment) {
        synchronized (this.f2383a) {
            this.f2383a.remove(fragment);
        }
        fragment.f2105u = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t() {
        this.f2384b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(List<String> list) {
        this.f2383a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment f10 = f(str);
                if (f10 == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.F0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + f10);
                }
                a(f10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<t> v() {
        ArrayList<t> arrayList = new ArrayList<>(this.f2384b.size());
        for (u uVar : this.f2384b.values()) {
            if (uVar != null) {
                Fragment k10 = uVar.k();
                t r10 = uVar.r();
                arrayList.add(r10);
                if (n.F0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + r10.f2374v);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ArrayList<String> w() {
        synchronized (this.f2383a) {
            if (this.f2383a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2383a.size());
            Iterator<Fragment> it = this.f2383a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f2099o);
                if (n.F0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f2099o + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void x(q qVar) {
        this.f2385c = qVar;
    }
}
