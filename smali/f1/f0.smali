.class public abstract Lf1/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/f0$b;
    }
.end annotation


# instance fields
.field private final j:Landroid/content/Context;

.field private final k:Landroid/os/Handler;

.field private l:Lf1/f0$b;

.field private m:Z

.field private n:Landroid/os/Messenger;

.field private final o:I

.field private final p:I

.field private final q:Ljava/lang/String;

.field private final r:I

.field private final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;IIILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lf1/f0;->j:Landroid/content/Context;

    iput p2, p0, Lf1/f0;->o:I

    iput p3, p0, Lf1/f0;->p:I

    iput-object p5, p0, Lf1/f0;->q:Ljava/lang/String;

    iput p4, p0, Lf1/f0;->r:I

    iput-object p6, p0, Lf1/f0;->s:Ljava/lang/String;

    new-instance p1, Lf1/f0$a;

    invoke-direct {p1, p0}, Lf1/f0$a;-><init>(Lf1/f0;)V

    iput-object p1, p0, Lf1/f0;->k:Landroid/os/Handler;

    return-void
.end method

.method private final a(Landroid/os/Bundle;)V
    .locals 1

    iget-boolean v0, p0, Lf1/f0;->m:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lf1/f0;->m:Z

    iget-object v0, p0, Lf1/f0;->l:Lf1/f0$b;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v0, p1}, Lf1/f0$b;->a(Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method

.method private final f()V
    .locals 4

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget-object v1, p0, Lf1/f0;->q:Ljava/lang/String;

    const-string v2, "com.facebook.platform.extra.APPLICATION_ID"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lf1/f0;->s:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v2, "com.facebook.platform.extra.NONCE"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p0, v0}, Lf1/f0;->e(Landroid/os/Bundle;)V

    iget v1, p0, Lf1/f0;->o:I

    const/4 v2, 0x0

    invoke-static {v2, v1}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    move-result-object v1

    iget v3, p0, Lf1/f0;->r:I

    iput v3, v1, Landroid/os/Message;->arg1:I

    invoke-virtual {v1, v0}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Messenger;

    iget-object v3, p0, Lf1/f0;->k:Landroid/os/Handler;

    invoke-direct {v0, v3}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v0, v1, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    :try_start_0
    iget-object v0, p0, Lf1/f0;->n:Landroid/os/Messenger;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Landroid/os/Messenger;->send(Landroid/os/Message;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-direct {p0, v2}, Lf1/f0;->a(Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lf1/f0;->m:Z

    return-void
.end method

.method protected final c()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lf1/f0;->j:Landroid/content/Context;

    return-object v0
.end method

.method protected final d(Landroid/os/Message;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p1, Landroid/os/Message;->what:I

    iget v1, p0, Lf1/f0;->p:I

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "com.facebook.platform.status.ERROR_TYPE"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, Lf1/f0;->a(Landroid/os/Bundle;)V

    :try_start_0
    iget-object p1, p0, Lf1/f0;->j:Landroid/content/Context;

    invoke-virtual {p1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    return-void
.end method

.method protected abstract e(Landroid/os/Bundle;)V
.end method

.method public final g(Lf1/f0$b;)V
    .locals 0

    iput-object p1, p0, Lf1/f0;->l:Lf1/f0$b;

    return-void
.end method

.method public final h()Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lf1/f0;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :cond_0
    :try_start_1
    sget-object v0, Lf1/e0;->a:Lf1/e0;

    iget v0, p0, Lf1/f0;->r:I

    invoke-static {v0}, Lf1/e0;->s(I)I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v2, -0x1

    if-ne v0, v2, :cond_1

    monitor-exit p0

    return v1

    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lf1/f0;->c()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lf1/e0;->l(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    iput-boolean v2, p0, Lf1/f0;->m:Z

    invoke-virtual {p0}, Lf1/f0;->c()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 v1, 0x1

    :goto_0
    monitor-exit p0

    return v1

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/os/Messenger;

    invoke-direct {p1, p2}, Landroid/os/Messenger;-><init>(Landroid/os/IBinder;)V

    iput-object p1, p0, Lf1/f0;->n:Landroid/os/Messenger;

    invoke-direct {p0}, Lf1/f0;->f()V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Lf1/f0;->n:Landroid/os/Messenger;

    :try_start_0
    iget-object v0, p0, Lf1/f0;->j:Landroid/content/Context;

    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-direct {p0, p1}, Lf1/f0;->a(Landroid/os/Bundle;)V

    return-void
.end method
