.class final Lu4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk4/c;


# instance fields
.field private final a:Landroid/view/ViewGroup;

.field private final b:Lv4/c;

.field private c:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lv4/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lv4/c;

    iput-object p2, p0, Lu4/l;->b:Lv4/c;

    invoke-static {p1}, Lc4/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Lu4/l;->a:Landroid/view/ViewGroup;

    return-void
.end method


# virtual methods
.method public final H()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/l;->b:Lv4/c;

    invoke-interface {v0}, Lv4/c;->H()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final I(Landroid/os/Bundle;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0}, Lv4/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v1, p0, Lu4/l;->b:Lv4/c;

    invoke-interface {v1, v0}, Lv4/c;->I(Landroid/os/Bundle;)V

    invoke-static {v0, p1}, Lv4/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object p1, p0, Lu4/l;->b:Lv4/c;

    invoke-interface {p1}, Lv4/c;->w()Lk4/b;

    move-result-object p1

    invoke-static {p1}, Lk4/d;->M(Lk4/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    iput-object p1, p0, Lu4/l;->c:Landroid/view/View;

    iget-object p1, p0, Lu4/l;->a:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object p1, p0, Lu4/l;->a:Landroid/view/ViewGroup;

    iget-object v0, p0, Lu4/l;->c:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final a(Landroid/os/Bundle;)V
    .locals 2

    :try_start_0
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-static {p1, v0}, Lv4/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V

    iget-object v1, p0, Lu4/l;->b:Lv4/c;

    invoke-interface {v1, v0}, Lv4/c;->a(Landroid/os/Bundle;)V

    invoke-static {v0, p1}, Lv4/d0;->b(Landroid/os/Bundle;Landroid/os/Bundle;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final b(Lu4/f;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/l;->b:Lv4/c;

    new-instance v1, Lu4/k;

    invoke-direct {v1, p0, p1}, Lu4/k;-><init>(Lu4/l;Lu4/f;)V

    invoke-interface {v0, v1}, Lv4/c;->P0(Lv4/p;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Lw4/t;

    invoke-direct {v0, p1}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v0
.end method

.method public final c()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/l;->b:Lv4/c;

    invoke-interface {v0}, Lv4/c;->c()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final d()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/l;->b:Lv4/c;

    invoke-interface {v0}, Lv4/c;->d()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method

.method public final r()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lu4/l;->b:Lv4/c;

    invoke-interface {v0}, Lv4/c;->r()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lw4/t;

    invoke-direct {v1, v0}, Lw4/t;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
